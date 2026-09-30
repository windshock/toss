package o;

import android.graphics.ImageFormat;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getCompatAccessibilityDelegate extends stopGlowAnimations {
    public getCompatAccessibilityDelegate(@NonNull CameraManager cameraManager, @NonNull String str, boolean z, int i2) throws CameraAccessException {
        clearOldPositions clearoldpositionsOnNavigationEvent;
        findContainingViewHolder findcontainingviewholderIAuthTabCallback = findContainingViewHolder.IAuthTabCallback();
        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
        for (String str2 : cameraManager.getCameraIdList()) {
            Integer num = (Integer) cameraManager.getCameraCharacteristics(str2).get(CameraCharacteristics.LENS_FACING);
            if (num != null && (clearoldpositionsOnNavigationEvent = findcontainingviewholderIAuthTabCallback.onNavigationEvent(num.intValue())) != null) {
                ((stopGlowAnimations) this).onTransact.add(clearoldpositionsOnNavigationEvent);
            }
        }
        for (int i3 : (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES)) {
            dispatchLayout dispatchlayoutIAuthTabCallback = findcontainingviewholderIAuthTabCallback.IAuthTabCallback(i3);
            if (dispatchlayoutIAuthTabCallback != null) {
                ((stopGlowAnimations) this).ICustomTabsCallback.add(dispatchlayoutIAuthTabCallback);
            }
        }
        ((stopGlowAnimations) this).asBinder.add(animateAppearance.OFF);
        Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool != null && bool.booleanValue()) {
            for (int i4 : (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) {
                ((stopGlowAnimations) this).asBinder.addAll(findcontainingviewholderIAuthTabCallback.onExtraCallbackWithResult(i4));
            }
        }
        ((stopGlowAnimations) this).asInterface.add(clearOnChildAttachStateChangeListeners.OFF);
        for (int i5 : (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_SCENE_MODES)) {
            clearOnChildAttachStateChangeListeners clearonchildattachstatechangelistenersOnWarmupCompleted = findcontainingviewholderIAuthTabCallback.onWarmupCompleted(i5);
            if (clearonchildattachstatechangelistenersOnWarmupCompleted != null) {
                ((stopGlowAnimations) this).asInterface.add(clearonchildattachstatechangelistenersOnWarmupCompleted);
            }
        }
        Float f = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f != null) {
            ((stopGlowAnimations) this).extraCallbackWithResult = f.floatValue() > 1.0f;
        }
        Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        Integer num3 = (Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        Integer num4 = (Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        ((stopGlowAnimations) this).IAuthTabCallback = (num2 != null && num2.intValue() > 0) || (num3 != null && num3.intValue() > 0) || (num4 != null && num4.intValue() > 0);
        Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        Rational rational = (Rational) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        if (range != null && rational != null && rational.floatValue() != 0.0f) {
            ((stopGlowAnimations) this).onExtraCallbackWithResult = ((Integer) range.getLower()).intValue() / rational.floatValue();
            ((stopGlowAnimations) this).onNavigationEvent = ((Integer) range.getUpper()).intValue() / rational.floatValue();
        }
        ((stopGlowAnimations) this).onExtraCallback = (((stopGlowAnimations) this).onExtraCallbackWithResult == 0.0f || ((stopGlowAnimations) this).onNavigationEvent == 0.0f) ? false : true;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            throw new RuntimeException("StreamConfigurationMap is null. Should not happen.");
        }
        for (int i6 : streamConfigurationMap.getOutputFormats()) {
            if (i6 == i2) {
                for (Size size : streamConfigurationMap.getOutputSizes(i2)) {
                    int height = z ? size.getHeight() : size.getWidth();
                    int width = z ? size.getWidth() : size.getHeight();
                    ((stopGlowAnimations) this).getInterfaceDescriptor.add(new removeOnChildAttachStateChangeListener(height, width));
                    ((stopGlowAnimations) this).access100.add(removeItemDecoration.onExtraCallback(height, width));
                }
                CamcorderProfile camcorderProfileOnExtraCallback = isLayoutFrozen.onExtraCallback(str, new removeOnChildAttachStateChangeListener(Integer.MAX_VALUE, Integer.MAX_VALUE));
                removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener = new removeOnChildAttachStateChangeListener(camcorderProfileOnExtraCallback.videoFrameWidth, camcorderProfileOnExtraCallback.videoFrameHeight);
                for (Size size2 : streamConfigurationMap.getOutputSizes(MediaRecorder.class)) {
                    if (size2.getWidth() <= removeonchildattachstatechangelistener.onExtraCallback() && size2.getHeight() <= removeonchildattachstatechangelistener.onExtraCallbackWithResult()) {
                        int height2 = z ? size2.getHeight() : size2.getWidth();
                        int width2 = z ? size2.getWidth() : size2.getHeight();
                        ((stopGlowAnimations) this).IAuthTabCallbackStubProxy.add(new removeOnChildAttachStateChangeListener(height2, width2));
                        ((stopGlowAnimations) this).access000.add(removeItemDecoration.onExtraCallback(height2, width2));
                    }
                }
                Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr != null) {
                    ((stopGlowAnimations) this).IAuthTabCallbackDefault = Float.MAX_VALUE;
                    ((stopGlowAnimations) this).onWarmupCompleted = -3.4028235E38f;
                    for (Range range2 : rangeArr) {
                        ((stopGlowAnimations) this).IAuthTabCallbackDefault = Math.min(((stopGlowAnimations) this).IAuthTabCallbackDefault, ((Integer) range2.getLower()).intValue());
                        ((stopGlowAnimations) this).onWarmupCompleted = Math.max(((stopGlowAnimations) this).onWarmupCompleted, ((Integer) range2.getUpper()).intValue());
                    }
                } else {
                    ((stopGlowAnimations) this).IAuthTabCallbackDefault = 0.0f;
                    ((stopGlowAnimations) this).onWarmupCompleted = 0.0f;
                }
                ((stopGlowAnimations) this).IAuthTabCallback_Parcel.add(consumeFlingInHorizontalStretch.JPEG);
                int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                if (iArr != null) {
                    for (int i7 : iArr) {
                        if (i7 == 3) {
                            ((stopGlowAnimations) this).IAuthTabCallback_Parcel.add(consumeFlingInHorizontalStretch.DNG);
                        }
                    }
                }
                ((stopGlowAnimations) this).IAuthTabCallbackStub.add(35);
                for (int i8 : streamConfigurationMap.getOutputFormats()) {
                    if (ImageFormat.getBitsPerPixel(i8) > 0) {
                        ((stopGlowAnimations) this).IAuthTabCallbackStub.add(Integer.valueOf(i8));
                    }
                }
                return;
            }
        }
        throw new IllegalStateException("Picture format not supported: " + i2);
    }
}
