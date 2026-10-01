package o;

import java.util.zip.ZipException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TTVideoLandingPageLink2Activity implements dj11 {
    private static final dj4 onExtraCallback = new dj4(51966);
    private static final dj4 IAuthTabCallback = new dj4(0);
    private static final TTVideoLandingPageLink2Activity onWarmupCompleted = new TTVideoLandingPageLink2Activity();

    @Override // o.dj11
    public byte[] onWarmupCompleted() {
        return showPrivacyActivity.onExtraCallback;
    }

    @Override // o.dj11
    public dj4 IAuthTabCallback() {
        return IAuthTabCallback;
    }

    @Override // o.dj11
    public dj4 onTransact() {
        return onExtraCallback;
    }

    @Override // o.dj11
    public byte[] onExtraCallbackWithResult() {
        return showPrivacyActivity.onExtraCallback;
    }

    @Override // o.dj11
    public dj4 onExtraCallback() {
        return IAuthTabCallback;
    }

    @Override // o.dj11
    public void onExtraCallback(byte[] bArr, int i, int i2) throws ZipException {
        onWarmupCompleted(bArr, i, i2);
    }

    @Override // o.dj11
    public void onWarmupCompleted(byte[] bArr, int i, int i2) throws ZipException {
        if (i2 != 0) {
            throw new ZipException("JarMarker doesn't expect any data");
        }
    }
}
