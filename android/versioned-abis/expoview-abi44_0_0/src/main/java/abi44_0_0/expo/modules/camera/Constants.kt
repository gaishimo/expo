package abi44_0_0.expo.modules.camera

import androidx.exifinterface.media.ExifInterface
import com.google.android.cameraview.Constants

const val REACT_CLASS = "ExponentCamera"
const val TAG = "ExponentCameraModule"
const val ERROR_TAG = "E_CAMERA"

const val VIDEO_2160P = 0
const val VIDEO_1080P = 1
const val VIDEO_720P = 2
const val VIDEO_480P = 3
const val VIDEO_4x3 = 4

val typeConstants = mapOf(
  "front" to Constants.FACING_FRONT,
  "back" to Constants.FACING_BACK
)

val flashModeConstants = mapOf(
  "off" to Constants.FLASH_OFF,
  "on" to Constants.FLASH_ON,
  "auto" to Constants.FLASH_AUTO,
  "torch" to Constants.FLASH_TORCH
)

val autoFocusConstants = mapOf(
  "on" to true,
  "off" to false
)

val whiteBalanceConstants = mapOf(
  "auto" to Constants.WB_AUTO,
  "cloudy" to Constants.WB_CLOUDY,
  "sunny" to Constants.WB_SUNNY,
  "shadow" to Constants.WB_SHADOW,
  "fluorescent" to Constants.WB_FLUORESCENT,
  "incandescent" to Constants.WB_INCANDESCENT
)

val videoQualityConstants = mapOf(
  "2160p" to VIDEO_2160P,
  "1080p" to VIDEO_1080P,
  "720p" to VIDEO_720P,
  "480p" to VIDEO_480P,
  "4:3" to VIDEO_4x3
)

val exifTags = arrayOf(
  arrayOf("string", ExifInterface.TAG_ARTIST),
  arrayOf("int", ExifInterface.TAG_BITS_PER_SAMPLE),
  arrayOf("int", ExifInterface.TAG_COMPRESSION),
  arrayOf("string", ExifInterface.TAG_COPYRIGHT),
  arrayOf("string", ExifInterface.TAG_DATETIME),
  arrayOf("string", ExifInterface.TAG_IMAGE_DESCRIPTION),
  arrayOf("int", ExifInterface.TAG_IMAGE_LENGTH),
  arrayOf("int", ExifInterface.TAG_IMAGE_WIDTH),
  arrayOf("int", ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT),
  arrayOf("int", ExifInterface.TAG_JPEG_INTERCHANGE_FORMAT_LENGTH),
  arrayOf("string", ExifInterface.TAG_MAKE),
  arrayOf("string", ExifInterface.TAG_MODEL),
  arrayOf("int", ExifInterface.TAG_ORIENTATION),
  arrayOf("int", ExifInterface.TAG_PHOTOMETRIC_INTERPRETATION),
  arrayOf("int", ExifInterface.TAG_PLANAR_CONFIGURATION),
  arrayOf("double", ExifInterface.TAG_PRIMARY_CHROMATICITIES),
  arrayOf("double", ExifInterface.TAG_REFERENCE_BLACK_WHITE),
  arrayOf("int", ExifInterface.TAG_RESOLUTION_UNIT),
  arrayOf("int", ExifInterface.TAG_ROWS_PER_STRIP),
  arrayOf("int", ExifInterface.TAG_SAMPLES_PER_PIXEL),
  arrayOf("string", ExifInterface.TAG_SOFTWARE),
  arrayOf("int", ExifInterface.TAG_STRIP_BYTE_COUNTS),
  arrayOf("int", ExifInterface.TAG_STRIP_OFFSETS),
  arrayOf("int", ExifInterface.TAG_TRANSFER_FUNCTION),
  arrayOf("double", ExifInterface.TAG_WHITE_POINT),
  arrayOf("double", ExifInterface.TAG_X_RESOLUTION),
  arrayOf("double", ExifInterface.TAG_Y_CB_CR_COEFFICIENTS),
  arrayOf("int", ExifInterface.TAG_Y_CB_CR_POSITIONING),
  arrayOf("int", ExifInterface.TAG_Y_CB_CR_SUB_SAMPLING),
  arrayOf("double", ExifInterface.TAG_Y_RESOLUTION),
  arrayOf("double", ExifInterface.TAG_APERTURE_VALUE),
  arrayOf("double", ExifInterface.TAG_BRIGHTNESS_VALUE),
  arrayOf("string", ExifInterface.TAG_CFA_PATTERN),
  arrayOf("int", ExifInterface.TAG_COLOR_SPACE),
  arrayOf("string", ExifInterface.TAG_COMPONENTS_CONFIGURATION),
  arrayOf("double", ExifInterface.TAG_COMPRESSED_BITS_PER_PIXEL),
  arrayOf("int", ExifInterface.TAG_CONTRAST),
  arrayOf("int", ExifInterface.TAG_CUSTOM_RENDERED),
  arrayOf("string", ExifInterface.TAG_DATETIME_DIGITIZED),
  arrayOf("string", ExifInterface.TAG_DATETIME_ORIGINAL),
  arrayOf("string", ExifInterface.TAG_DEVICE_SETTING_DESCRIPTION),
  arrayOf("double", ExifInterface.TAG_DIGITAL_ZOOM_RATIO),
  arrayOf("string", ExifInterface.TAG_EXIF_VERSION),
  arrayOf("double", ExifInterface.TAG_EXPOSURE_BIAS_VALUE),
  arrayOf("double", ExifInterface.TAG_EXPOSURE_INDEX),
  arrayOf("int", ExifInterface.TAG_EXPOSURE_MODE),
  arrayOf("int", ExifInterface.TAG_EXPOSURE_PROGRAM),
  arrayOf("double", ExifInterface.TAG_EXPOSURE_TIME),
  arrayOf("double", ExifInterface.TAG_F_NUMBER),
  arrayOf("string", ExifInterface.TAG_FILE_SOURCE),
  arrayOf("int", ExifInterface.TAG_FLASH),
  arrayOf("double", ExifInterface.TAG_FLASH_ENERGY),
  arrayOf("string", ExifInterface.TAG_FLASHPIX_VERSION),
  arrayOf("double", ExifInterface.TAG_FOCAL_LENGTH),
  arrayOf("int", ExifInterface.TAG_FOCAL_LENGTH_IN_35MM_FILM),
  arrayOf("int", ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT),
  arrayOf("double", ExifInterface.TAG_FOCAL_PLANE_X_RESOLUTION),
  arrayOf("double", ExifInterface.TAG_FOCAL_PLANE_Y_RESOLUTION),
  arrayOf("int", ExifInterface.TAG_GAIN_CONTROL),
  arrayOf("int", ExifInterface.TAG_ISO_SPEED_RATINGS),
  arrayOf("string", ExifInterface.TAG_IMAGE_UNIQUE_ID),
  arrayOf("int", ExifInterface.TAG_LIGHT_SOURCE),
  arrayOf("string", ExifInterface.TAG_MAKER_NOTE),
  arrayOf("double", ExifInterface.TAG_MAX_APERTURE_VALUE),
  arrayOf("int", ExifInterface.TAG_METERING_MODE),
  arrayOf("int", ExifInterface.TAG_NEW_SUBFILE_TYPE),
  arrayOf("string", ExifInterface.TAG_OECF),
  arrayOf("int", ExifInterface.TAG_PIXEL_X_DIMENSION),
  arrayOf("int", ExifInterface.TAG_PIXEL_Y_DIMENSION),
  arrayOf("string", ExifInterface.TAG_RELATED_SOUND_FILE),
  arrayOf("int", ExifInterface.TAG_SATURATION),
  arrayOf("int", ExifInterface.TAG_SCENE_CAPTURE_TYPE),
  arrayOf("string", ExifInterface.TAG_SCENE_TYPE),
  arrayOf("int", ExifInterface.TAG_SENSING_METHOD),
  arrayOf("int", ExifInterface.TAG_SHARPNESS),
  arrayOf("double", ExifInterface.TAG_SHUTTER_SPEED_VALUE),
  arrayOf("string", ExifInterface.TAG_SPATIAL_FREQUENCY_RESPONSE),
  arrayOf("string", ExifInterface.TAG_SPECTRAL_SENSITIVITY),
  arrayOf("int", ExifInterface.TAG_SUBFILE_TYPE),
  arrayOf("string", ExifInterface.TAG_SUBSEC_TIME),
  arrayOf("string", ExifInterface.TAG_SUBSEC_TIME_DIGITIZED),
  arrayOf("string", ExifInterface.TAG_SUBSEC_TIME_ORIGINAL),
  arrayOf("int", ExifInterface.TAG_SUBJECT_AREA),
  arrayOf("double", ExifInterface.TAG_SUBJECT_DISTANCE),
  arrayOf("int", ExifInterface.TAG_SUBJECT_DISTANCE_RANGE),
  arrayOf("int", ExifInterface.TAG_SUBJECT_LOCATION),
  arrayOf("string", ExifInterface.TAG_USER_COMMENT),
  arrayOf("int", ExifInterface.TAG_WHITE_BALANCE),
  arrayOf("double", ExifInterface.TAG_GPS_ALTITUDE),
  arrayOf("int", ExifInterface.TAG_GPS_ALTITUDE_REF),
  arrayOf("string", ExifInterface.TAG_GPS_AREA_INFORMATION),
  arrayOf("double", ExifInterface.TAG_GPS_DOP),
  arrayOf("string", ExifInterface.TAG_GPS_DATESTAMP),
  arrayOf("double", ExifInterface.TAG_GPS_DEST_BEARING),
  arrayOf("string", ExifInterface.TAG_GPS_DEST_BEARING_REF),
  arrayOf("double", ExifInterface.TAG_GPS_DEST_DISTANCE),
  arrayOf("string", ExifInterface.TAG_GPS_DEST_DISTANCE_REF),
  arrayOf("double", ExifInterface.TAG_GPS_DEST_LATITUDE),
  arrayOf("string", ExifInterface.TAG_GPS_DEST_LATITUDE_REF),
  arrayOf("double", ExifInterface.TAG_GPS_DEST_LONGITUDE),
  arrayOf("string", ExifInterface.TAG_GPS_DEST_LONGITUDE_REF),
  arrayOf("int", ExifInterface.TAG_GPS_DIFFERENTIAL),
  arrayOf("string", ExifInterface.TAG_GPS_H_POSITIONING_ERROR),
  arrayOf("double", ExifInterface.TAG_GPS_IMG_DIRECTION),
  arrayOf("string", ExifInterface.TAG_GPS_IMG_DIRECTION_REF),
  arrayOf("double", ExifInterface.TAG_GPS_LATITUDE),
  arrayOf("string", ExifInterface.TAG_GPS_LATITUDE_REF),
  arrayOf("double", ExifInterface.TAG_GPS_LONGITUDE),
  arrayOf("string", ExifInterface.TAG_GPS_LONGITUDE_REF),
  arrayOf("string", ExifInterface.TAG_GPS_MAP_DATUM),
  arrayOf("string", ExifInterface.TAG_GPS_MEASURE_MODE),
  arrayOf("string", ExifInterface.TAG_GPS_PROCESSING_METHOD),
  arrayOf("string", ExifInterface.TAG_GPS_SATELLITES),
  arrayOf("double", ExifInterface.TAG_GPS_SPEED),
  arrayOf("string", ExifInterface.TAG_GPS_SPEED_REF),
  arrayOf("string", ExifInterface.TAG_GPS_STATUS),
  arrayOf("string", ExifInterface.TAG_GPS_TIMESTAMP),
  arrayOf("double", ExifInterface.TAG_GPS_TRACK),
  arrayOf("string", ExifInterface.TAG_GPS_TRACK_REF),
  arrayOf("string", ExifInterface.TAG_GPS_VERSION_ID),
  arrayOf("string", ExifInterface.TAG_INTEROPERABILITY_INDEX),
  arrayOf("int", ExifInterface.TAG_THUMBNAIL_IMAGE_LENGTH),
  arrayOf("int", ExifInterface.TAG_THUMBNAIL_IMAGE_WIDTH),
  arrayOf("int", ExifInterface.TAG_DNG_VERSION),
  arrayOf("int", ExifInterface.TAG_DEFAULT_CROP_SIZE),
  arrayOf("int", ExifInterface.TAG_ORF_PREVIEW_IMAGE_START),
  arrayOf("int", ExifInterface.TAG_ORF_PREVIEW_IMAGE_LENGTH),
  arrayOf("int", ExifInterface.TAG_ORF_ASPECT_FRAME),
  arrayOf("int", ExifInterface.TAG_RW2_SENSOR_BOTTOM_BORDER),
  arrayOf("int", ExifInterface.TAG_RW2_SENSOR_LEFT_BORDER),
  arrayOf("int", ExifInterface.TAG_RW2_SENSOR_RIGHT_BORDER),
  arrayOf("int", ExifInterface.TAG_RW2_SENSOR_TOP_BORDER),
  arrayOf("int", ExifInterface.TAG_RW2_ISO)
)
