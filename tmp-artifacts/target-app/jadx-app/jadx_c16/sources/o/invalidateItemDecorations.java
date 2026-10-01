package o;

import android.content.res.TypedArray;
import androidx.annotation.NonNull;
import com.otaliastudios.cameraview.R$styleable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class invalidateItemDecorations {
    private int IAuthTabCallback;
    private int onExtraCallback;
    private int onExtraCallbackWithResult;
    private int onNavigationEvent;
    private int onWarmupCompleted;

    public invalidateItemDecorations(@NonNull TypedArray typedArray) {
        this.IAuthTabCallback = typedArray.getInteger(R$styleable.CameraView_cameraGestureTap, getPreserveFocusAfterLayout.DEFAULT_TAP.value());
        this.onExtraCallback = typedArray.getInteger(R$styleable.CameraView_cameraGestureLongTap, getPreserveFocusAfterLayout.DEFAULT_LONG_TAP.value());
        this.onWarmupCompleted = typedArray.getInteger(R$styleable.CameraView_cameraGesturePinch, getPreserveFocusAfterLayout.DEFAULT_PINCH.value());
        this.onNavigationEvent = typedArray.getInteger(R$styleable.CameraView_cameraGestureScrollHorizontal, getPreserveFocusAfterLayout.DEFAULT_SCROLL_HORIZONTAL.value());
        this.onExtraCallbackWithResult = typedArray.getInteger(R$styleable.CameraView_cameraGestureScrollVertical, getPreserveFocusAfterLayout.DEFAULT_SCROLL_VERTICAL.value());
    }

    private getPreserveFocusAfterLayout onNavigationEvent(int i) {
        return getPreserveFocusAfterLayout.fromValue(i);
    }

    public getPreserveFocusAfterLayout onExtraCallback() {
        return onNavigationEvent(this.IAuthTabCallback);
    }

    public getPreserveFocusAfterLayout onWarmupCompleted() {
        return onNavigationEvent(this.onExtraCallback);
    }

    public getPreserveFocusAfterLayout onNavigationEvent() {
        return onNavigationEvent(this.onWarmupCompleted);
    }

    public getPreserveFocusAfterLayout onExtraCallbackWithResult() {
        return onNavigationEvent(this.onNavigationEvent);
    }

    public getPreserveFocusAfterLayout IAuthTabCallback() {
        return onNavigationEvent(this.onExtraCallbackWithResult);
    }
}
