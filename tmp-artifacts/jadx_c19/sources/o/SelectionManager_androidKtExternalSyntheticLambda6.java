package o;

import java.nio.ByteBuffer;
import o.HandwritingGestureApi34ExternalSyntheticLambda16;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionManager_androidKtExternalSyntheticLambda6 extends HandwritingGestureApi34ExternalSyntheticLambda14 {
    private byte[] IAuthTabCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted;
    private boolean IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private int asBinder;
    private long asInterface;
    private int onTransact;
    private int onWarmupCompleted;

    public void IAuthTabCallback(int i2, int i3) {
        this.IAuthTabCallbackStub = i2;
        this.asBinder = i3;
    }

    public void IAuthTabCallbackStubProxy() {
        this.asInterface = 0L;
    }

    public long access000() {
        return this.asInterface;
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda14
    public HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback onNavigationEvent(HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback iAuthTabCallback) throws HandwritingGestureApi34ExternalSyntheticLambda16.onExtraCallbackWithResult {
        if (!TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallbackStubProxy(iAuthTabCallback.onExtraCallback)) {
            throw new HandwritingGestureApi34ExternalSyntheticLambda16.onExtraCallbackWithResult(iAuthTabCallback);
        }
        this.IAuthTabCallbackDefault = true;
        return (this.IAuthTabCallbackStub == 0 && this.asBinder == 0) ? HandwritingGestureApi34ExternalSyntheticLambda16.IAuthTabCallback.onNavigationEvent : iAuthTabCallback;
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda16
    public void onExtraCallbackWithResult(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        if (i2 != 0) {
            int iMin = Math.min(i2, this.onTransact);
            this.asInterface += iMin / this.onExtraCallbackWithResult.IAuthTabCallback;
            this.onTransact -= iMin;
            byteBuffer.position(iPosition + iMin);
            if (this.onTransact > 0) {
                return;
            }
            int i3 = i2 - iMin;
            int length = (this.onWarmupCompleted + i3) - this.IAuthTabCallback.length;
            ByteBuffer byteBufferIAuthTabCallback = IAuthTabCallback(length);
            int iOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(length, 0, this.onWarmupCompleted);
            byteBufferIAuthTabCallback.put(this.IAuthTabCallback, 0, iOnExtraCallback);
            int iOnExtraCallback2 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(length - iOnExtraCallback, 0, i3);
            byteBuffer.limit(byteBuffer.position() + iOnExtraCallback2);
            byteBufferIAuthTabCallback.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i4 = i3 - iOnExtraCallback2;
            int i5 = this.onWarmupCompleted - iOnExtraCallback;
            this.onWarmupCompleted = i5;
            byte[] bArr = this.IAuthTabCallback;
            System.arraycopy(bArr, iOnExtraCallback, bArr, 0, i5);
            byteBuffer.get(this.IAuthTabCallback, this.onWarmupCompleted, i4);
            this.onWarmupCompleted += i4;
            byteBufferIAuthTabCallback.flip();
        }
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda14, o.HandwritingGestureApi34ExternalSyntheticLambda16
    public ByteBuffer onExtraCallbackWithResult() {
        int i2;
        if (super.onWarmupCompleted() && (i2 = this.onWarmupCompleted) > 0) {
            IAuthTabCallback(i2).put(this.IAuthTabCallback, 0, this.onWarmupCompleted).flip();
            this.onWarmupCompleted = 0;
        }
        return super.onExtraCallbackWithResult();
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda14, o.HandwritingGestureApi34ExternalSyntheticLambda16
    public boolean onWarmupCompleted() {
        return super.onWarmupCompleted() && this.onWarmupCompleted == 0;
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda14
    public void IAuthTabCallbackDefault() {
        if (this.IAuthTabCallbackDefault) {
            if (this.onWarmupCompleted > 0) {
                this.asInterface += r0 / this.onExtraCallbackWithResult.IAuthTabCallback;
            }
            this.onWarmupCompleted = 0;
        }
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda14
    public void asBinder() {
        if (this.IAuthTabCallbackDefault) {
            this.IAuthTabCallbackDefault = false;
            int i2 = this.asBinder;
            int i3 = this.onExtraCallbackWithResult.IAuthTabCallback;
            this.IAuthTabCallback = new byte[i2 * i3];
            this.onTransact = this.IAuthTabCallbackStub * i3;
        }
        this.onWarmupCompleted = 0;
    }

    @Override // o.HandwritingGestureApi34ExternalSyntheticLambda14
    public void IAuthTabCallbackStub() {
        this.IAuthTabCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted;
    }
}
