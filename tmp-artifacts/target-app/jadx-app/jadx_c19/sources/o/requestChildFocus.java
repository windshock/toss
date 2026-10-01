package o;

import android.hardware.camera2.CaptureRequest;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.view.Surface;
import androidx.annotation.NonNull;
import o.addOnChildAttachStateChangeListener;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class requestChildFocus extends saveOldPositions {
    private Surface asBinder;
    private dispatchOnScrollStateChanged asInterface;
    private final String onWarmupCompleted;

    public requestChildFocus(@NonNull defaultOnMeasure defaultonmeasure, @NonNull String str) {
        super(defaultonmeasure);
        this.asInterface = defaultonmeasure;
        this.onWarmupCompleted = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.saveOldPositions
    public void onWarmupCompleted() {
        ensureRightGlow ensurerightglow = new ensureRightGlow() { // from class: o.requestChildFocus.1
            @Override // o.ensureRightGlow, o.dispatchNestedFling
            public void onWarmupCompleted(@NonNull dispatchOnScrollStateChanged dispatchonscrollstatechanged, @NonNull CaptureRequest captureRequest) {
                super.onWarmupCompleted(dispatchonscrollstatechanged, captureRequest);
                Object tag = dispatchonscrollstatechanged.onExtraCallbackWithResult(this).build().getTag();
                Object tag2 = captureRequest.getTag();
                if (tag == null) {
                    if (tag2 != null) {
                        return;
                    }
                } else if (!tag.equals(tag2)) {
                    return;
                }
                onNavigationEvent(Integer.MAX_VALUE);
            }
        };
        ensurerightglow.onWarmupCompleted(new ensureBottomGlow() { // from class: o.requestChildFocus.5
            @Override // o.ensureBottomGlow
            public void onNavigationEvent(@NonNull dispatchNestedFling dispatchnestedfling) throws IllegalStateException {
                requestChildFocus.super.onWarmupCompleted();
            }
        });
        ensurerightglow.onExtraCallbackWithResult(this.asInterface);
    }

    @Override // o.saveOldPositions
    protected void IAuthTabCallback(@NonNull addOnChildAttachStateChangeListener.onWarmupCompleted onwarmupcompleted, @NonNull MediaRecorder mediaRecorder) throws IllegalStateException {
        mediaRecorder.setVideoSource(2);
    }

    @Override // o.saveOldPositions
    protected CamcorderProfile onNavigationEvent(@NonNull addOnChildAttachStateChangeListener.onWarmupCompleted onwarmupcompleted) {
        int i2 = onwarmupcompleted.IAuthTabCallbackStubProxy;
        removeOnChildAttachStateChangeListener removeonchildattachstatechangelistenerOnNavigationEvent = onwarmupcompleted.access100;
        if (i2 % 180 != 0) {
            removeonchildattachstatechangelistenerOnNavigationEvent = removeonchildattachstatechangelistenerOnNavigationEvent.onNavigationEvent();
        }
        return isLayoutFrozen.onExtraCallback(this.onWarmupCompleted, removeonchildattachstatechangelistenerOnNavigationEvent);
    }

    public Surface onWarmupCompleted(@NonNull addOnChildAttachStateChangeListener.onWarmupCompleted onwarmupcompleted) throws onExtraCallback {
        if (!onExtraCallback(onwarmupcompleted)) {
            throw new onExtraCallback(((removeOnScrollListener) this).onExtraCallback);
        }
        Surface surface = this.onExtraCallbackWithResult.getSurface();
        this.asBinder = surface;
        return surface;
    }

    public Surface onExtraCallbackWithResult() {
        return this.asBinder;
    }

    public class onExtraCallback extends Exception {
        private onExtraCallback(Throwable th) {
            super(th);
        }
    }
}
