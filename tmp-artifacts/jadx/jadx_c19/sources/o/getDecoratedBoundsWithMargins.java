package o;

import android.hardware.Camera;
import android.media.CamcorderProfile;
import androidx.annotation.NonNull;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Iterator;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getDecoratedBoundsWithMargins extends stopGlowAnimations {
    public getDecoratedBoundsWithMargins(@NonNull Camera.Parameters parameters, int i2, boolean z) {
        findViewHolderForLayoutPosition findviewholderforlayoutpositionOnExtraCallbackWithResult = findViewHolderForLayoutPosition.onExtraCallbackWithResult();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i3 = 0; i3 < numberOfCameras; i3++) {
            Camera.getCameraInfo(i3, cameraInfo);
            clearOldPositions clearoldpositionsOnExtraCallback = findviewholderforlayoutpositionOnExtraCallbackWithResult.onExtraCallback(cameraInfo.facing);
            if (clearoldpositionsOnExtraCallback != null) {
                ((stopGlowAnimations) this).onTransact.add(clearoldpositionsOnExtraCallback);
            }
        }
        List<String> supportedWhiteBalance = parameters.getSupportedWhiteBalance();
        if (supportedWhiteBalance != null) {
            Iterator<String> it = supportedWhiteBalance.iterator();
            while (it.hasNext()) {
                dispatchLayout dispatchlayoutOnWarmupCompleted = findviewholderforlayoutpositionOnExtraCallbackWithResult.onWarmupCompleted(it.next());
                if (dispatchlayoutOnWarmupCompleted != null) {
                    ((stopGlowAnimations) this).ICustomTabsCallback.add(dispatchlayoutOnWarmupCompleted);
                }
            }
        }
        ((stopGlowAnimations) this).asBinder.add(animateAppearance.OFF);
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (supportedFlashModes != null) {
            Iterator<String> it2 = supportedFlashModes.iterator();
            while (it2.hasNext()) {
                animateAppearance animateappearanceOnExtraCallbackWithResult = findviewholderforlayoutpositionOnExtraCallbackWithResult.onExtraCallbackWithResult(it2.next());
                if (animateappearanceOnExtraCallbackWithResult != null) {
                    ((stopGlowAnimations) this).asBinder.add(animateappearanceOnExtraCallbackWithResult);
                }
            }
        }
        ((stopGlowAnimations) this).asInterface.add(clearOnChildAttachStateChangeListeners.OFF);
        List<String> supportedSceneModes = parameters.getSupportedSceneModes();
        if (supportedSceneModes != null) {
            Iterator<String> it3 = supportedSceneModes.iterator();
            while (it3.hasNext()) {
                clearOnChildAttachStateChangeListeners clearonchildattachstatechangelistenersIAuthTabCallback = findviewholderforlayoutpositionOnExtraCallbackWithResult.IAuthTabCallback(it3.next());
                if (clearonchildattachstatechangelistenersIAuthTabCallback != null) {
                    ((stopGlowAnimations) this).asInterface.add(clearonchildattachstatechangelistenersIAuthTabCallback);
                }
            }
        }
        ((stopGlowAnimations) this).extraCallbackWithResult = parameters.isZoomSupported();
        ((stopGlowAnimations) this).IAuthTabCallback = parameters.getSupportedFocusModes().contains(TtmlNode.TEXT_EMPHASIS_AUTO);
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        ((stopGlowAnimations) this).onExtraCallbackWithResult = parameters.getMinExposureCompensation() * exposureCompensationStep;
        ((stopGlowAnimations) this).onNavigationEvent = parameters.getMaxExposureCompensation() * exposureCompensationStep;
        ((stopGlowAnimations) this).onExtraCallback = (parameters.getMinExposureCompensation() == 0 && parameters.getMaxExposureCompensation() == 0) ? false : true;
        for (Camera.Size size : parameters.getSupportedPictureSizes()) {
            int i4 = z ? size.height : size.width;
            int i5 = z ? size.width : size.height;
            ((stopGlowAnimations) this).getInterfaceDescriptor.add(new removeOnChildAttachStateChangeListener(i4, i5));
            ((stopGlowAnimations) this).access100.add(removeItemDecoration.onExtraCallback(i4, i5));
        }
        CamcorderProfile camcorderProfileOnExtraCallbackWithResult = isLayoutFrozen.onExtraCallbackWithResult(i2, new removeOnChildAttachStateChangeListener(Integer.MAX_VALUE, Integer.MAX_VALUE));
        removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener = new removeOnChildAttachStateChangeListener(camcorderProfileOnExtraCallbackWithResult.videoFrameWidth, camcorderProfileOnExtraCallbackWithResult.videoFrameHeight);
        List<Camera.Size> supportedVideoSizes = parameters.getSupportedVideoSizes();
        if (supportedVideoSizes != null) {
            for (Camera.Size size2 : supportedVideoSizes) {
                if (size2.width <= removeonchildattachstatechangelistener.onExtraCallback() && size2.height <= removeonchildattachstatechangelistener.onExtraCallbackWithResult()) {
                    int i6 = z ? size2.height : size2.width;
                    int i7 = z ? size2.width : size2.height;
                    ((stopGlowAnimations) this).IAuthTabCallbackStubProxy.add(new removeOnChildAttachStateChangeListener(i6, i7));
                    ((stopGlowAnimations) this).access000.add(removeItemDecoration.onExtraCallback(i6, i7));
                }
            }
        } else {
            for (Camera.Size size3 : parameters.getSupportedPreviewSizes()) {
                if (size3.width <= removeonchildattachstatechangelistener.onExtraCallback() && size3.height <= removeonchildattachstatechangelistener.onExtraCallbackWithResult()) {
                    int i8 = z ? size3.height : size3.width;
                    int i9 = z ? size3.width : size3.height;
                    ((stopGlowAnimations) this).IAuthTabCallbackStubProxy.add(new removeOnChildAttachStateChangeListener(i8, i9));
                    ((stopGlowAnimations) this).access000.add(removeItemDecoration.onExtraCallback(i8, i9));
                }
            }
        }
        ((stopGlowAnimations) this).IAuthTabCallbackDefault = Float.MAX_VALUE;
        ((stopGlowAnimations) this).onWarmupCompleted = -3.4028235E38f;
        for (int[] iArr : parameters.getSupportedPreviewFpsRange()) {
            float f = iArr[0] / 1000.0f;
            ((stopGlowAnimations) this).IAuthTabCallbackDefault = Math.min(((stopGlowAnimations) this).IAuthTabCallbackDefault, f);
            ((stopGlowAnimations) this).onWarmupCompleted = Math.max(((stopGlowAnimations) this).onWarmupCompleted, iArr[1] / 1000.0f);
        }
        ((stopGlowAnimations) this).IAuthTabCallback_Parcel.add(consumeFlingInHorizontalStretch.JPEG);
        ((stopGlowAnimations) this).IAuthTabCallbackStub.add(17);
    }
}
