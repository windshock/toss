package o;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.annotation.NonNull;
import com.otaliastudios.cameraview.R$styleable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class canReuseUpdatedViewHolder {
    private int IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private int IAuthTabCallbackStubProxy;
    private int access000;
    private int asBinder;
    private int asInterface;
    private int onExtraCallback;
    private int onExtraCallbackWithResult;
    private int onNavigationEvent;
    private int onTransact;
    private int onWarmupCompleted;

    public canReuseUpdatedViewHolder(@NonNull Context context, @NonNull TypedArray typedArray) {
        this.IAuthTabCallbackDefault = typedArray.getInteger(R$styleable.CameraView_cameraPreview, consumeFlingInVerticalStretch.DEFAULT.value());
        this.onExtraCallback = typedArray.getInteger(R$styleable.CameraView_cameraFacing, clearOldPositions.DEFAULT(context).value());
        this.onNavigationEvent = typedArray.getInteger(R$styleable.CameraView_cameraFlash, animateAppearance.DEFAULT.value());
        this.onTransact = typedArray.getInteger(R$styleable.CameraView_cameraGrid, animateDisappearance.DEFAULT.value());
        this.IAuthTabCallbackStubProxy = typedArray.getInteger(R$styleable.CameraView_cameraWhiteBalance, dispatchLayout.DEFAULT.value());
        this.asBinder = typedArray.getInteger(R$styleable.CameraView_cameraMode, clearOnScrollListeners.DEFAULT.value());
        this.IAuthTabCallbackStub = typedArray.getInteger(R$styleable.CameraView_cameraHdr, clearOnChildAttachStateChangeListeners.DEFAULT.value());
        this.IAuthTabCallback = typedArray.getInteger(R$styleable.CameraView_cameraAudio, addItemDecoration.DEFAULT.value());
        this.access000 = typedArray.getInteger(R$styleable.CameraView_cameraVideoCodec, considerReleasingGlowsOnScroll.DEFAULT.value());
        this.onWarmupCompleted = typedArray.getInteger(R$styleable.CameraView_cameraAudioCodec, addOnItemTouchListener.DEFAULT.value());
        this.onExtraCallbackWithResult = typedArray.getInteger(R$styleable.CameraView_cameraEngine, assertInLayoutOrScroll.DEFAULT.value());
        this.asInterface = typedArray.getInteger(R$styleable.CameraView_cameraPictureFormat, consumeFlingInHorizontalStretch.DEFAULT.value());
    }

    public consumeFlingInVerticalStretch asInterface() {
        return consumeFlingInVerticalStretch.fromValue(this.IAuthTabCallbackDefault);
    }

    public clearOldPositions onWarmupCompleted() {
        return clearOldPositions.fromValue(this.onExtraCallback);
    }

    public animateAppearance IAuthTabCallback() {
        return animateAppearance.fromValue(this.onNavigationEvent);
    }

    public animateDisappearance asBinder() {
        return animateDisappearance.fromValue(this.onTransact);
    }

    public clearOnScrollListeners onTransact() {
        return clearOnScrollListeners.fromValue(this.asBinder);
    }

    public dispatchLayout access000() {
        return dispatchLayout.fromValue(this.IAuthTabCallbackStubProxy);
    }

    public clearOnChildAttachStateChangeListeners IAuthTabCallbackStub() {
        return clearOnChildAttachStateChangeListeners.fromValue(this.IAuthTabCallbackStub);
    }

    public addItemDecoration onExtraCallback() {
        return addItemDecoration.fromValue(this.IAuthTabCallback);
    }

    public addOnItemTouchListener onExtraCallbackWithResult() {
        return addOnItemTouchListener.fromValue(this.onWarmupCompleted);
    }

    public considerReleasingGlowsOnScroll access100() {
        return considerReleasingGlowsOnScroll.fromValue(this.access000);
    }

    public assertInLayoutOrScroll onNavigationEvent() {
        return assertInLayoutOrScroll.fromValue(this.onExtraCallbackWithResult);
    }

    public consumeFlingInHorizontalStretch IAuthTabCallbackDefault() {
        return consumeFlingInHorizontalStretch.fromValue(this.asInterface);
    }
}
