package o;

import java.nio.file.attribute.FileTime;
import java.util.Objects;
import java.util.zip.ZipException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class TTWebsiteActivity implements dj11 {
    private TTWebsiteActivity6 IAuthTabCallback;
    private TTWebsiteActivity6 IAuthTabCallbackStub;
    private TTWebsiteActivity6 onExtraCallbackWithResult;
    public static final dj4 onNavigationEvent = new dj4(10);
    private static final dj4 onWarmupCompleted = new dj4(1);
    private static final dj4 onExtraCallback = new dj4(24);

    public TTWebsiteActivity() {
        TTWebsiteActivity6 tTWebsiteActivity6 = TTWebsiteActivity6.IAuthTabCallback;
        this.IAuthTabCallbackStub = tTWebsiteActivity6;
        this.onExtraCallbackWithResult = tTWebsiteActivity6;
        this.IAuthTabCallback = tTWebsiteActivity6;
    }

    private static TTWebsiteActivity6 tg_(FileTime fileTime) {
        if (fileTime == null) {
            return null;
        }
        return new TTWebsiteActivity6(PAGNativeAdLoadCallback.tG_(fileTime));
    }

    private static FileTime th_(TTWebsiteActivity6 tTWebsiteActivity6) {
        if (tTWebsiteActivity6 == null || TTWebsiteActivity6.IAuthTabCallback.equals(tTWebsiteActivity6)) {
            return null;
        }
        return PAGNativeAdLoadCallback.tF_(tTWebsiteActivity6.onExtraCallback());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TTWebsiteActivity)) {
            return false;
        }
        TTWebsiteActivity tTWebsiteActivity = (TTWebsiteActivity) obj;
        return Objects.equals(this.IAuthTabCallbackStub, tTWebsiteActivity.IAuthTabCallbackStub) && Objects.equals(this.onExtraCallbackWithResult, tTWebsiteActivity.onExtraCallbackWithResult) && Objects.equals(this.IAuthTabCallback, tTWebsiteActivity.IAuthTabCallback);
    }

    public FileTime ti_() {
        return th_(this.onExtraCallbackWithResult);
    }

    @Override // o.dj11
    public byte[] onWarmupCompleted() {
        return onExtraCallbackWithResult();
    }

    @Override // o.dj11
    public dj4 IAuthTabCallback() {
        return onExtraCallback();
    }

    public FileTime tj_() {
        return th_(this.IAuthTabCallback);
    }

    @Override // o.dj11
    public dj4 onTransact() {
        return onNavigationEvent;
    }

    @Override // o.dj11
    public byte[] onExtraCallbackWithResult() {
        byte[] bArr = new byte[onExtraCallback().onNavigationEvent()];
        System.arraycopy(onWarmupCompleted.onExtraCallback(), 0, bArr, 4, 2);
        System.arraycopy(onExtraCallback.onExtraCallback(), 0, bArr, 6, 2);
        System.arraycopy(this.IAuthTabCallbackStub.IAuthTabCallback(), 0, bArr, 8, 8);
        System.arraycopy(this.onExtraCallbackWithResult.IAuthTabCallback(), 0, bArr, 16, 8);
        System.arraycopy(this.IAuthTabCallback.IAuthTabCallback(), 0, bArr, 24, 8);
        return bArr;
    }

    @Override // o.dj11
    public dj4 onExtraCallback() {
        return new dj4(32);
    }

    public FileTime tk_() {
        return th_(this.IAuthTabCallbackStub);
    }

    public int hashCode() {
        TTWebsiteActivity6 tTWebsiteActivity6 = this.IAuthTabCallbackStub;
        int iHashCode = tTWebsiteActivity6 != null ? (-123) ^ tTWebsiteActivity6.hashCode() : -123;
        TTWebsiteActivity6 tTWebsiteActivity62 = this.onExtraCallbackWithResult;
        if (tTWebsiteActivity62 != null) {
            iHashCode ^= Integer.rotateLeft(tTWebsiteActivity62.hashCode(), 11);
        }
        TTWebsiteActivity6 tTWebsiteActivity63 = this.IAuthTabCallback;
        return tTWebsiteActivity63 != null ? Integer.rotateLeft(tTWebsiteActivity63.hashCode(), 22) ^ iHashCode : iHashCode;
    }

    @Override // o.dj11
    public void onExtraCallback(byte[] bArr, int i, int i2) throws ZipException {
        asBinder();
        onWarmupCompleted(bArr, i, i2);
    }

    @Override // o.dj11
    public void onWarmupCompleted(byte[] bArr, int i, int i2) throws ZipException {
        int i3 = i2 + i;
        int iOnNavigationEvent = i + 4;
        while (iOnNavigationEvent + 4 <= i3) {
            dj4 dj4Var = new dj4(bArr, iOnNavigationEvent);
            int i4 = iOnNavigationEvent + 2;
            if (dj4Var.equals(onWarmupCompleted)) {
                IAuthTabCallback(bArr, i4, i3 - i4);
                return;
            }
            iOnNavigationEvent = i4 + new dj4(bArr, i4).onNavigationEvent() + 2;
        }
    }

    private void IAuthTabCallback(byte[] bArr, int i, int i2) {
        if (i2 >= 26) {
            if (onExtraCallback.equals(new dj4(bArr, i))) {
                this.IAuthTabCallbackStub = new TTWebsiteActivity6(bArr, i + 2);
                this.onExtraCallbackWithResult = new TTWebsiteActivity6(bArr, i + 10);
                this.IAuthTabCallback = new TTWebsiteActivity6(bArr, i + 18);
            }
        }
    }

    private void asBinder() {
        TTWebsiteActivity6 tTWebsiteActivity6 = TTWebsiteActivity6.IAuthTabCallback;
        this.IAuthTabCallbackStub = tTWebsiteActivity6;
        this.onExtraCallbackWithResult = tTWebsiteActivity6;
        this.IAuthTabCallback = tTWebsiteActivity6;
    }

    public void tl_(FileTime fileTime) {
        onExtraCallback(tg_(fileTime));
    }

    public void onExtraCallback(TTWebsiteActivity6 tTWebsiteActivity6) {
        if (tTWebsiteActivity6 == null) {
            tTWebsiteActivity6 = TTWebsiteActivity6.IAuthTabCallback;
        }
        this.onExtraCallbackWithResult = tTWebsiteActivity6;
    }

    public void tm_(FileTime fileTime) {
        onWarmupCompleted(tg_(fileTime));
    }

    public void onWarmupCompleted(TTWebsiteActivity6 tTWebsiteActivity6) {
        if (tTWebsiteActivity6 == null) {
            tTWebsiteActivity6 = TTWebsiteActivity6.IAuthTabCallback;
        }
        this.IAuthTabCallback = tTWebsiteActivity6;
    }

    public void tn_(FileTime fileTime) {
        IAuthTabCallback(tg_(fileTime));
    }

    public void IAuthTabCallback(TTWebsiteActivity6 tTWebsiteActivity6) {
        if (tTWebsiteActivity6 == null) {
            tTWebsiteActivity6 = TTWebsiteActivity6.IAuthTabCallback;
        }
        this.IAuthTabCallbackStub = tTWebsiteActivity6;
    }

    public String toString() {
        return "0x000A Zip Extra Field: Modify:[" + tk_() + "]  Access:[" + ti_() + "]  Create:[" + tj_() + "] ";
    }
}
