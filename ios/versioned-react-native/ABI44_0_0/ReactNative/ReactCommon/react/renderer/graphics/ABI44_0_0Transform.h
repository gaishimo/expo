/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

#pragma once

#include <array>
#include <vector>

#include <folly/Hash.h>
#include <ABI44_0_0React/ABI44_0_0renderer/graphics/Float.h>
#include <ABI44_0_0React/ABI44_0_0renderer/graphics/Geometry.h>

#ifdef ANDROID
#include <folly/dynamic.h>
#endif

namespace ABI44_0_0facebook {
namespace ABI44_0_0React {

inline bool isZero(Float n) {
  // We use this ternary expression instead of abs, fabsf, etc, because
  // Float can be double or float depending on compilation target.
  return (n < 0 ? n * (-1) : n) < 0.00001;
}

/**
 * Defines operations used to construct a transform matrix.
 * An "Arbitrary" operation means that the transform was seeded with some
 * arbitrary initial result.
 */
enum class TransformOperationType {
  Arbitrary,
  Identity,
  Perspective,
  Scale,
  Translate,
  Rotate,
  Skew
};
struct TransformOperation {
  TransformOperationType type;
  Float x;
  Float y;
  Float z;
};

/*
 * Defines transform matrix to apply affine transformations.
 */
struct Transform {
  std::vector<TransformOperation> operations{};

  std::array<Float, 16> matrix{
      {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1}};

  /**
   * For debugging only. Prints out the matrix.
   */
#ifdef ABI44_0_0RN_DEBUG_STRING_CONVERTIBLE
  static void print(Transform const &t, std::string prefix);
#endif

  /*
   * Given a TransformOperation, return the proper transform.
   */
  static Transform FromTransformOperation(
      TransformOperation transformOperation);
  static TransformOperation DefaultTransformOperation(
      TransformOperationType type);

  /*
   * Returns the identity transform (`[1 0 0 0; 0 1 0 0; 0 0 1 0; 0 0 0 1]`).
   */
  static Transform Identity();

  /*
   * Returns a Perspective transform.
   */
  static Transform Perspective(Float perspective);

  /*
   * Returns a Scale transform.
   */
  static Transform Scale(Float factorX, Float factorY, Float factorZ);

  /*
   * Returns a Translate transform.
   */
  static Transform Translate(Float x, Float y, Float z);

  /*
   * Returns a Skew transform.
   */
  static Transform Skew(Float x, Float y);

  /*
   * Returns a transform that rotates by `angle` radians along the given axis.
   */
  static Transform RotateX(Float angle);
  static Transform RotateY(Float angle);
  static Transform RotateZ(Float angle);
  static Transform Rotate(Float angleX, Float angleY, Float angleZ);

  /**
   * Perform an interpolation between lhs and rhs, given progress.
   * This first decomposes the matrices into translation, scale, and rotation,
   * performs slerp between the two rotations, and a linear interpolation
   * of scale and translation.
   *
   * @param progress
   * @param lhs
   * @param rhs
   * @return
   */
  static Transform Interpolate(
      float animationProgress,
      Transform const &lhs,
      Transform const &rhs);

  /*
   * Equality operators.
   */
  bool operator==(Transform const &rhs) const;
  bool operator!=(Transform const &rhs) const;

  /*
   * Matrix subscript.
   */
  Float &at(int x, int y);
  Float const &at(int x, int y) const;

  /*
   * Concatenates (multiplies) transform matrices.
   */
  Transform operator*(Transform const &rhs) const;

  /**
   * Convert to folly::dynamic.
   */
#ifdef ANDROID
  operator folly::dynamic() const {
    return folly::dynamic::array(
        matrix[0],
        matrix[1],
        matrix[2],
        matrix[3],
        matrix[4],
        matrix[5],
        matrix[6],
        matrix[7],
        matrix[8],
        matrix[9],
        matrix[10],
        matrix[11],
        matrix[12],
        matrix[13],
        matrix[14],
        matrix[15]);
  }
#endif
};

/*
 * Applies tranformation to the given point.
 */
Point operator*(Point const &point, Transform const &transform);

/*
 * Applies tranformation to the given size.
 */
Size operator*(Size const &size, Transform const &transform);

/*
 * Applies tranformation to the given rect.
 * ONLY SUPPORTS scale and translation transformation.
 */
Rect operator*(Rect const &rect, Transform const &transform);

Vector operator*(Transform const &transform, Vector const &vector);

} // namespace ABI44_0_0React
} // namespace ABI44_0_0facebook

namespace std {

template <>
struct hash<ABI44_0_0facebook::ABI44_0_0React::Transform> {
  size_t operator()(const ABI44_0_0facebook::ABI44_0_0React::Transform &transform) const {
    return folly::hash::hash_combine(
        0,
        transform.matrix[0],
        transform.matrix[1],
        transform.matrix[2],
        transform.matrix[3],
        transform.matrix[4],
        transform.matrix[5],
        transform.matrix[6],
        transform.matrix[7],
        transform.matrix[8],
        transform.matrix[9],
        transform.matrix[10],
        transform.matrix[11],
        transform.matrix[12],
        transform.matrix[13],
        transform.matrix[14],
        transform.matrix[15]);
  }
};

} // namespace std
