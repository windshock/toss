package o;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class TTLandingPageActivity61 {
    public static int onExtraCallback(byte[] bArr) {
        int iOnNavigationEvent = 0;
        for (int i = 0; i < 256; i++) {
            iOnNavigationEvent += onNavigationEvent(bArr, i << 2);
        }
        return 84446 - (iOnNavigationEvent - onNavigationEvent(bArr, 28));
    }

    public static final int onExtraCallback(byte[] bArr, int i) {
        return (int) showPrivacyActivity.onExtraCallbackWithResult(bArr, i, 2);
    }

    public static final int onNavigationEvent(byte[] bArr, int i) {
        return (int) showPrivacyActivity.onExtraCallbackWithResult(bArr, i, 4);
    }

    public static final long onExtraCallbackWithResult(byte[] bArr, int i) {
        return showPrivacyActivity.onExtraCallbackWithResult(bArr, i, 8);
    }

    static String onExtraCallbackWithResult(TTWebsiteActivity7 tTWebsiteActivity7, byte[] bArr, int i, int i2) throws IOException {
        return tTWebsiteActivity7.onNavigationEvent(Arrays.copyOfRange(bArr, i, i2 + i));
    }

    public static final boolean onNavigationEvent(byte[] bArr) {
        return onNavigationEvent(bArr, 24) == 60012 && onNavigationEvent(bArr, 28) == onExtraCallback(bArr);
    }
}
