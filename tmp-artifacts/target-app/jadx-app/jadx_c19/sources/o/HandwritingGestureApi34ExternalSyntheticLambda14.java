package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o.HandwritingGestureApi34ExternalSyntheticLambda16;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class HandwritingGestureApi34ExternalSyntheticLambda14 implements HandwritingGestureApi34ExternalSyntheticLambda16 {
    private ByteBuffer IAuthTabCallback;
    private HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback IAuthTabCallbackDefault;
    private HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback IAuthTabCallbackStub;
    private ByteBuffer asBinder;
    public HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback onExtraCallback;
    public HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback onExtraCallbackWithResult;
    private boolean onWarmupCompleted;

    protected void IAuthTabCallbackDefault() {
    }

    protected void IAuthTabCallbackStub() {
    }

    protected void asBinder() {
    }

    public HandwritingGestureApi34ExternalSyntheticLambda14() {
        ByteBuffer byteBuffer = HandwritingGestureApi34ExternalSyntheticLambda16.onNavigationEvent;
        this.IAuthTabCallback = byteBuffer;
        this.asBinder = byteBuffer;
        HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback iAuthTabCallback = HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback.onNavigationEvent;
        this.IAuthTabCallbackStub = iAuthTabCallback;
        this.IAuthTabCallbackDefault = iAuthTabCallback;
        this.onExtraCallbackWithResult = iAuthTabCallback;
        this.onExtraCallback = iAuthTabCallback;
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda16
    public final HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback onExtraCallbackWithResult(HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback iAuthTabCallback) throws HandwritingGestureApi34ExternalSyntheticLambda16.onExtraCallbackWithResult {
        this.IAuthTabCallbackStub = iAuthTabCallback;
        this.IAuthTabCallbackDefault = onNavigationEvent(iAuthTabCallback);
        return IAuthTabCallback() ? this.IAuthTabCallbackDefault : HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback.onNavigationEvent;
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda16
    public boolean IAuthTabCallback() {
        return this.IAuthTabCallbackDefault != HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback.onNavigationEvent;
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda16
    public final void onNavigationEvent() {
        this.onWarmupCompleted = true;
        IAuthTabCallbackDefault();
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda16
    public ByteBuffer onExtraCallbackWithResult() {
        ByteBuffer byteBuffer = this.asBinder;
        this.asBinder = HandwritingGestureApi34ExternalSyntheticLambda16.onNavigationEvent;
        return byteBuffer;
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda16
    public boolean onWarmupCompleted() {
        return this.onWarmupCompleted && this.asBinder == HandwritingGestureApi34ExternalSyntheticLambda16.onNavigationEvent;
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda16
    public final void onExtraCallback() {
        this.asBinder = HandwritingGestureApi34ExternalSyntheticLambda16.onNavigationEvent;
        this.onWarmupCompleted = false;
        this.onExtraCallbackWithResult = this.IAuthTabCallbackStub;
        this.onExtraCallback = this.IAuthTabCallbackDefault;
        asBinder();
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda16
    public final void onTransact() {
        ByteBuffer byteBuffer = HandwritingGestureApi34ExternalSyntheticLambda16.onNavigationEvent;
        this.asBinder = byteBuffer;
        this.onWarmupCompleted = false;
        this.IAuthTabCallback = byteBuffer;
        HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback iAuthTabCallback = HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback.onNavigationEvent;
        this.IAuthTabCallbackStub = iAuthTabCallback;
        this.IAuthTabCallbackDefault = iAuthTabCallback;
        this.onExtraCallbackWithResult = iAuthTabCallback;
        this.onExtraCallback = iAuthTabCallback;
        IAuthTabCallbackStub();
    }

    public final ByteBuffer IAuthTabCallback(int i2) {
        if (this.IAuthTabCallback.capacity() < i2) {
            this.IAuthTabCallback = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.IAuthTabCallback.clear();
        }
        ByteBuffer byteBuffer = this.IAuthTabCallback;
        this.asBinder = byteBuffer;
        return byteBuffer;
    }

    public final boolean asInterface() {
        return this.asBinder.hasRemaining();
    }

    protected HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback onNavigationEvent(HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback iAuthTabCallback) throws HandwritingGestureApi34ExternalSyntheticLambda16.onExtraCallbackWithResult {
        return HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback.onNavigationEvent;
    }
}
