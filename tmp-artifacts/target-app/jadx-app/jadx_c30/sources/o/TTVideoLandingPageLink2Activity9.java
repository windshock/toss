package o;

import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TTVideoLandingPageLink2Activity9 implements dj11 {
    private byte[] IAuthTabCallback;
    private byte[] onExtraCallback;
    private dj4 onExtraCallbackWithResult;

    @Override // o.dj11
    public byte[] onWarmupCompleted() {
        byte[] bArr = this.onExtraCallback;
        if (bArr != null) {
            return dj5.onWarmupCompleted(bArr);
        }
        return onExtraCallbackWithResult();
    }

    @Override // o.dj11
    public dj4 IAuthTabCallback() {
        if (this.onExtraCallback != null) {
            return new dj4(this.onExtraCallback.length);
        }
        return onExtraCallback();
    }

    @Override // o.dj11
    public dj4 onTransact() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.dj11
    public byte[] onExtraCallbackWithResult() {
        return dj5.onWarmupCompleted(this.IAuthTabCallback);
    }

    @Override // o.dj11
    public dj4 onExtraCallback() {
        byte[] bArr = this.IAuthTabCallback;
        return new dj4(bArr != null ? bArr.length : 0);
    }

    @Override // o.dj11
    public void onExtraCallback(byte[] bArr, int i, int i2) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2 + i);
        onExtraCallbackWithResult(bArrCopyOfRange);
        if (this.IAuthTabCallback == null) {
            onExtraCallback(bArrCopyOfRange);
        }
    }

    @Override // o.dj11
    public void onWarmupCompleted(byte[] bArr, int i, int i2) {
        onExtraCallback(Arrays.copyOfRange(bArr, i, i2 + i));
    }

    public void onExtraCallbackWithResult(byte[] bArr) {
        this.onExtraCallback = dj5.onWarmupCompleted(bArr);
    }

    public void IAuthTabCallback(dj4 dj4Var) {
        this.onExtraCallbackWithResult = dj4Var;
    }

    public void onExtraCallback(byte[] bArr) {
        this.IAuthTabCallback = dj5.onWarmupCompleted(bArr);
    }
}
