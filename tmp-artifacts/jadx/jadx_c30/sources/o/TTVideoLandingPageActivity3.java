package o;

import java.util.Arrays;
import java.util.zip.ZipException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class TTVideoLandingPageActivity3 implements dj11 {
    private byte[] IAuthTabCallback;
    private byte[] onExtraCallback;
    private long onWarmupCompleted;

    protected TTVideoLandingPageActivity3() {
    }

    private void onNavigationEvent() {
        byte[] bArr = this.onExtraCallback;
        if (bArr == null) {
            return;
        }
        byte[] bArr2 = new byte[bArr.length + 5];
        this.IAuthTabCallback = bArr2;
        bArr2[0] = 1;
        System.arraycopy(dj12.onWarmupCompleted(this.onWarmupCompleted), 0, this.IAuthTabCallback, 1, 4);
        byte[] bArr3 = this.onExtraCallback;
        System.arraycopy(bArr3, 0, this.IAuthTabCallback, 5, bArr3.length);
    }

    @Override // o.dj11
    public byte[] onWarmupCompleted() {
        if (this.IAuthTabCallback == null) {
            onNavigationEvent();
        }
        byte[] bArr = this.IAuthTabCallback;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    @Override // o.dj11
    public dj4 IAuthTabCallback() {
        if (this.IAuthTabCallback == null) {
            onNavigationEvent();
        }
        byte[] bArr = this.IAuthTabCallback;
        return new dj4(bArr != null ? bArr.length : 0);
    }

    @Override // o.dj11
    public byte[] onExtraCallbackWithResult() {
        return onWarmupCompleted();
    }

    @Override // o.dj11
    public dj4 onExtraCallback() {
        return IAuthTabCallback();
    }

    @Override // o.dj11
    public void onExtraCallback(byte[] bArr, int i, int i2) throws ZipException {
        onWarmupCompleted(bArr, i, i2);
    }

    @Override // o.dj11
    public void onWarmupCompleted(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 < 5) {
            throw new ZipException("UniCode path extra data must have at least 5 bytes.");
        }
        byte b = bArr[i];
        if (b != 1) {
            throw new ZipException("Unsupported version [" + ((int) b) + "] for UniCode path extra data.");
        }
        this.onWarmupCompleted = dj12.onNavigationEvent(bArr, i + 1);
        int i3 = i2 - 5;
        byte[] bArr2 = new byte[i3];
        this.onExtraCallback = bArr2;
        System.arraycopy(bArr, i + 5, bArr2, 0, i3);
        this.IAuthTabCallback = null;
    }
}
