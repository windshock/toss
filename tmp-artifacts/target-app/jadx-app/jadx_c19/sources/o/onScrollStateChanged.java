package o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.wwx.lt;
import com.otaliastudios.cameraview.preview.RendererCameraPreview;
import o.addRecyclerListener;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class onScrollStateChanged extends onScrolled {
    private final dispatchNestedFling IAuthTabCallback;
    private final dispatchOnScrollStateChanged IAuthTabCallbackDefault;
    private final boolean IAuthTabCallbackStub;
    private Integer asInterface;
    private Integer onTransact;

    class onExtraCallback extends ensureRightGlow {
        private onExtraCallback() {
        }

        @Override // o.ensureRightGlow
        public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
            super.IAuthTabCallback(dispatchonscrollstatechanged);
            postAnimationRunner.onExtraCallback.onExtraCallbackWithResult(new Object[]{"FlashAction:", "Parameters locked, opening torch."});
            dispatchonscrollstatechanged.onExtraCallbackWithResult(this).set(CaptureRequest.FLASH_MODE, 2);
            dispatchonscrollstatechanged.onExtraCallbackWithResult(this).set(CaptureRequest.CONTROL_AE_MODE, 1);
            dispatchonscrollstatechanged.onNavigationEvent(this);
        }

        @Override // o.ensureRightGlow, o.dispatchNestedFling
        public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            super.IAuthTabCallback(dispatchonscrollstatechanged, captureRequest, totalCaptureResult);
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
            if (num == null) {
                postAnimationRunner.onExtraCallback.onWarmupCompleted(new Object[]{"FlashAction:", "Waiting flash, but flashState is null!", "Taking snapshot."});
                onNavigationEvent(Integer.MAX_VALUE);
            } else if (num.intValue() == 3) {
                postAnimationRunner.onExtraCallback.onExtraCallbackWithResult(new Object[]{"FlashAction:", "Waiting flash and we have FIRED state!", "Taking snapshot."});
                onNavigationEvent(Integer.MAX_VALUE);
            } else {
                postAnimationRunner.onExtraCallback.onExtraCallbackWithResult(new Object[]{"FlashAction:", "Waiting flash but flashState is", num, ". Waiting..."});
            }
        }
    }

    class onNavigationEvent extends ensureRightGlow {
        private onNavigationEvent() {
        }

        @Override // o.ensureRightGlow
        public void IAuthTabCallback(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged) {
            super.IAuthTabCallback(dispatchonscrollstatechanged);
            try {
                postAnimationRunner.onExtraCallback.onExtraCallbackWithResult(new Object[]{"ResetFlashAction:", "Reverting the flash changes."});
                CaptureRequest.Builder builderOnExtraCallbackWithResult = dispatchonscrollstatechanged.onExtraCallbackWithResult(this);
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
                builderOnExtraCallbackWithResult.set(key, 1);
                CaptureRequest.Key key2 = CaptureRequest.FLASH_MODE;
                builderOnExtraCallbackWithResult.set(key2, 0);
                dispatchonscrollstatechanged.IAuthTabCallback(this, builderOnExtraCallbackWithResult);
                builderOnExtraCallbackWithResult.set(key, onScrollStateChanged.this.asInterface);
                builderOnExtraCallbackWithResult.set(key2, onScrollStateChanged.this.onTransact);
                dispatchonscrollstatechanged.onNavigationEvent(this);
            } catch (CameraAccessException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public onScrollStateChanged(@NonNull addRecyclerListener.IAuthTabCallback iAuthTabCallback, @NonNull defaultOnMeasure defaultonmeasure, @NonNull RendererCameraPreview rendererCameraPreview, @NonNull removeItemDecoration removeitemdecoration) {
        super(iAuthTabCallback, defaultonmeasure, rendererCameraPreview, removeitemdecoration, (onChildAttachedToWindow) dispatchChildAttached.onWarmupCompleted(lt.40.onExtraCallbackWithResult(), -629237862, lt.40.onExtraCallbackWithResult(), lt.40.onExtraCallbackWithResult(), new Object[]{defaultonmeasure}, 629237875, lt.40.onExtraCallbackWithResult()));
        this.IAuthTabCallbackDefault = defaultonmeasure;
        boolean z = false;
        ensureRightGlow ensurerightglowOnNavigationEvent = dispatchNestedScroll.onNavigationEvent(dispatchNestedScroll.onExtraCallbackWithResult(2500L, new findChildViewUnder()), new onExtraCallback());
        this.IAuthTabCallback = ensurerightglowOnNavigationEvent;
        ensurerightglowOnNavigationEvent.onWarmupCompleted(new ensureBottomGlow() { // from class: o.onScrollStateChanged.3
            @Override // o.ensureBottomGlow
            public void onNavigationEvent(@NonNull dispatchNestedFling dispatchnestedfling) {
                postAnimationRunner.onExtraCallback.onExtraCallbackWithResult(new Object[]{"Taking picture with super.take()."});
                onScrollStateChanged.super.onExtraCallbackWithResult();
            }
        });
        TotalCaptureResult totalCaptureResultOnWarmupCompleted = defaultonmeasure.onWarmupCompleted(ensurerightglowOnNavigationEvent);
        if (totalCaptureResultOnWarmupCompleted == null) {
            postAnimationRunner.onExtraCallback.onWarmupCompleted(new Object[]{"Picture snapshot requested very early, before the first preview frame.", "Metering might not work as intended."});
        }
        Integer num = totalCaptureResultOnWarmupCompleted != null ? (Integer) totalCaptureResultOnWarmupCompleted.get(CaptureResult.CONTROL_AE_STATE) : null;
        if (defaultonmeasure.newAuthTabSession() && num != null && num.intValue() == 4) {
            z = true;
        }
        this.IAuthTabCallbackStub = z;
        this.asInterface = (Integer) defaultonmeasure.onExtraCallbackWithResult(ensurerightglowOnNavigationEvent).get(CaptureRequest.CONTROL_AE_MODE);
        this.onTransact = (Integer) defaultonmeasure.onExtraCallbackWithResult(ensurerightglowOnNavigationEvent).get(CaptureRequest.FLASH_MODE);
    }

    @Override // o.onScrolled
    public void onExtraCallbackWithResult() {
        if (!this.IAuthTabCallbackStub) {
            postAnimationRunner.onExtraCallback.onExtraCallbackWithResult(new Object[]{"take:", "Engine does no metering or needs no flash.", "Taking fast snapshot."});
            super.onExtraCallbackWithResult();
        } else {
            postAnimationRunner.onExtraCallback.onExtraCallbackWithResult(new Object[]{"take:", "Engine needs flash. Starting action"});
            this.IAuthTabCallback.onExtraCallbackWithResult(this.IAuthTabCallbackDefault);
        }
    }

    @Override // o.onScrolled
    protected void onWarmupCompleted() {
        new onNavigationEvent().onExtraCallbackWithResult(this.IAuthTabCallbackDefault);
        super.onWarmupCompleted();
    }
}
