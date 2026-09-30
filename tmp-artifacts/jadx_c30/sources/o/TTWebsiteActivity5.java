package o;

import java.util.zip.ZipException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class TTWebsiteActivity5 implements dj11 {
    static final dj4 onExtraCallbackWithResult = new dj4(1);
    private byte[] IAuthTabCallback;
    private TTWebsiteActivity6 asBinder;
    private TTWebsiteActivity6 onExtraCallback;
    private TTWebsiteActivity6 onNavigationEvent;
    private dj12 onWarmupCompleted;

    private int onExtraCallbackWithResult(byte[] bArr) {
        int i;
        TTWebsiteActivity6 tTWebsiteActivity6 = this.asBinder;
        if (tTWebsiteActivity6 != null) {
            System.arraycopy(tTWebsiteActivity6.IAuthTabCallback(), 0, bArr, 0, 8);
            i = 8;
        } else {
            i = 0;
        }
        TTWebsiteActivity6 tTWebsiteActivity62 = this.onExtraCallback;
        if (tTWebsiteActivity62 == null) {
            return i;
        }
        System.arraycopy(tTWebsiteActivity62.IAuthTabCallback(), 0, bArr, i, 8);
        return i + 8;
    }

    @Override // o.dj11
    public byte[] onWarmupCompleted() {
        byte[] bArr = new byte[IAuthTabCallback().onNavigationEvent()];
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(bArr);
        TTWebsiteActivity6 tTWebsiteActivity6 = this.onNavigationEvent;
        if (tTWebsiteActivity6 != null) {
            System.arraycopy(tTWebsiteActivity6.IAuthTabCallback(), 0, bArr, iOnExtraCallbackWithResult, 8);
            iOnExtraCallbackWithResult += 8;
        }
        dj12 dj12Var = this.onWarmupCompleted;
        if (dj12Var != null) {
            System.arraycopy(dj12Var.onExtraCallbackWithResult(), 0, bArr, iOnExtraCallbackWithResult, 4);
        }
        return bArr;
    }

    @Override // o.dj11
    public dj4 IAuthTabCallback() {
        int i = this.asBinder != null ? 8 : 0;
        int i2 = this.onExtraCallback != null ? 8 : 0;
        return new dj4(i + i2 + (this.onNavigationEvent == null ? 0 : 8) + (this.onWarmupCompleted != null ? 4 : 0));
    }

    @Override // o.dj11
    public dj4 onTransact() {
        return onExtraCallbackWithResult;
    }

    @Override // o.dj11
    public byte[] onExtraCallbackWithResult() {
        TTWebsiteActivity6 tTWebsiteActivity6 = this.asBinder;
        if (tTWebsiteActivity6 != null || this.onExtraCallback != null) {
            if (tTWebsiteActivity6 == null || this.onExtraCallback == null) {
                throw new IllegalArgumentException("Zip64 extended information must contain both size values in the local file header.");
            }
            byte[] bArr = new byte[16];
            onExtraCallbackWithResult(bArr);
            return bArr;
        }
        return showPrivacyActivity.onExtraCallback;
    }

    @Override // o.dj11
    public dj4 onExtraCallback() {
        return new dj4(this.asBinder != null ? 16 : 0);
    }

    @Override // o.dj11
    public void onExtraCallback(byte[] bArr, int i, int i2) throws ZipException {
        byte[] bArr2 = new byte[i2];
        this.IAuthTabCallback = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        if (i2 >= 28) {
            onWarmupCompleted(bArr, i, i2);
            return;
        }
        if (i2 == 24) {
            this.asBinder = new TTWebsiteActivity6(bArr, i);
            this.onExtraCallback = new TTWebsiteActivity6(bArr, i + 8);
            this.onNavigationEvent = new TTWebsiteActivity6(bArr, i + 16);
        } else if (i2 % 8 == 4) {
            this.onWarmupCompleted = new dj12(bArr, (i + i2) - 4);
        }
    }

    @Override // o.dj11
    public void onWarmupCompleted(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 != 0) {
            if (i2 < 16) {
                throw new ZipException("Zip64 extended information must contain both size values in the local file header.");
            }
            this.asBinder = new TTWebsiteActivity6(bArr, i);
            this.onExtraCallback = new TTWebsiteActivity6(bArr, i + 8);
            int i3 = i + 16;
            int i4 = i2 - 16;
            if (i4 >= 8) {
                this.onNavigationEvent = new TTWebsiteActivity6(bArr, i3);
                i3 = i + 24;
                i4 = i2 - 24;
            }
            if (i4 >= 4) {
                this.onWarmupCompleted = new dj12(bArr, i3);
            }
        }
    }

    public void onNavigationEvent(TTWebsiteActivity6 tTWebsiteActivity6) {
        this.onExtraCallback = tTWebsiteActivity6;
    }

    public void onExtraCallback(dj12 dj12Var) {
        this.onWarmupCompleted = dj12Var;
    }

    public void onWarmupCompleted(TTWebsiteActivity6 tTWebsiteActivity6) {
        this.onNavigationEvent = tTWebsiteActivity6;
    }

    public void IAuthTabCallback(TTWebsiteActivity6 tTWebsiteActivity6) {
        this.asBinder = tTWebsiteActivity6;
    }
}
