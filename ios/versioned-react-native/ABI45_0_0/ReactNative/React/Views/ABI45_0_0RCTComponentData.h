/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

#import <Foundation/Foundation.h>

#import <ABI45_0_0React/ABI45_0_0RCTComponent.h>
#import <ABI45_0_0React/ABI45_0_0RCTDefines.h>
#import <ABI45_0_0React/ABI45_0_0RCTViewManager.h>

@class ABI45_0_0RCTBridge;
@class ABI45_0_0RCTShadowView;
@class UIView;
@class ABI45_0_0RCTEventDispatcherProtocol;

NS_ASSUME_NONNULL_BEGIN

@interface ABI45_0_0RCTComponentData : NSObject

@property (nonatomic, readonly) Class managerClass;
@property (nonatomic, copy, readonly) NSString *name;
@property (nonatomic, weak, readonly) ABI45_0_0RCTViewManager *manager;
/*
 * When running ABI45_0_0React Native with the bridge, view managers are retained by the
 * bridge. When running in bridgeless mode, allocate and retain view managers
 * in this class.
 */
@property (nonatomic, strong, readonly) ABI45_0_0RCTViewManager *bridgelessViewManager;

- (instancetype)initWithManagerClass:(Class)managerClass
                              bridge:(ABI45_0_0RCTBridge *)bridge
                     eventDispatcher:(id<ABI45_0_0RCTEventDispatcherProtocol>)eventDispatcher NS_DESIGNATED_INITIALIZER;

- (UIView *)createViewWithTag:(nullable NSNumber *)tag rootTag:(nullable NSNumber *)rootTag;
- (ABI45_0_0RCTShadowView *)createShadowViewWithTag:(NSNumber *)tag;
- (void)setProps:(NSDictionary<NSString *, id> *)props forView:(id<ABI45_0_0RCTComponent>)view;
- (void)setProps:(NSDictionary<NSString *, id> *)props forShadowView:(ABI45_0_0RCTShadowView *)shadowView;

@property (nonatomic, copy, nullable) void (^eventInterceptor)
    (NSString *eventName, NSDictionary *event, NSNumber *ABI45_0_0ReactTag);

- (NSDictionary<NSString *, id> *)viewConfig;

@end

NS_ASSUME_NONNULL_END
