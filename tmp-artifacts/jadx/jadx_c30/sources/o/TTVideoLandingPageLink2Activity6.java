package o;

import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TTVideoLandingPageLink2Activity6 implements dj11 {
    private static final dj4 IAuthTabCallback = new dj4(44225);
    private byte[] onExtraCallbackWithResult;
    private byte[] onNavigationEvent;

    @Override // o.dj11
    public byte[] onWarmupCompleted() {
        byte[] bArr = this.onExtraCallbackWithResult;
        return bArr == null ? onExtraCallbackWithResult() : dj5.onWarmupCompleted(bArr);
    }

    @Override // o.dj11
    public dj4 IAuthTabCallback() {
        return this.onExtraCallbackWithResult == null ? onExtraCallback() : new dj4(this.onExtraCallbackWithResult.length);
    }

    @Override // o.dj11
    public dj4 onTransact() {
        return IAuthTabCallback;
    }

    @Override // o.dj11
    public byte[] onExtraCallbackWithResult() {
        return dj5.onWarmupCompleted(this.onNavigationEvent);
    }

    @Override // o.dj11
    public dj4 onExtraCallback() {
        byte[] bArr = this.onNavigationEvent;
        return new dj4(bArr == null ? 0 : bArr.length);
    }

    @Override // o.dj11
    public void onExtraCallback(byte[] bArr, int i, int i2) {
        this.onExtraCallbackWithResult = Arrays.copyOfRange(bArr, i, i + i2);
        if (this.onNavigationEvent == null) {
            onWarmupCompleted(bArr, i, i2);
        }
    }

    @Override // o.dj11
    public void onWarmupCompleted(byte[] bArr, int i, int i2) {
        this.onNavigationEvent = Arrays.copyOfRange(bArr, i, i2 + i);
    }
}
