package o;

import androidx.annotation.Nullable;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class IABLandingPageActivity4 {
    protected static final char[] onNavigationEvent = "0123456789ABCDEF".toCharArray();

    public static String onExtraCallbackWithResult(@Nullable byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        char[] cArr = new char[(bArr.length * 3) - 1];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 3;
            char[] cArr2 = onNavigationEvent;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
            if (i != bArr.length - 1) {
                cArr[i2 + 2] = '-';
            }
        }
        return "(0x) " + new String(cArr);
    }

    public static String onExtraCallback(@Nullable byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "null";
        }
        char[] cArr = new char[bArr.length << 1];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i << 1;
            char[] cArr2 = onNavigationEvent;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return "0x" + new String(cArr);
    }

    public static String onExtraCallbackWithResult(int i) {
        switch (i) {
            case 0:
                return "PAIRING_VARIANT_PIN";
            case 1:
                return "PAIRING_VARIANT_PASSKEY";
            case 2:
                return "PAIRING_VARIANT_PASSKEY_CONFIRMATION";
            case 3:
                return "PAIRING_VARIANT_CONSENT";
            case 4:
                return "PAIRING_VARIANT_DISPLAY_PASSKEY";
            case 5:
                return "PAIRING_VARIANT_DISPLAY_PIN";
            case 6:
                return "PAIRING_VARIANT_OOB_CONSENT";
            default:
                return "UNKNOWN (" + i + ")";
        }
    }

    public static String onExtraCallback(int i) {
        switch (i) {
            case 10:
                return "BOND_NONE";
            case 11:
                return "BOND_BONDING";
            case 12:
                return "BOND_BONDED";
            default:
                return "UNKNOWN (" + i + ")";
        }
    }

    public static String IAuthTabCallbackStub(int i) {
        if (i == 1) {
            return "WRITE COMMAND";
        }
        if (i == 2) {
            return "WRITE REQUEST";
        }
        if (i == 4) {
            return "WRITE SIGNED";
        }
        return "UNKNOWN (" + i + ")";
    }

    public static String IAuthTabCallbackDefault(int i) {
        if (i == 0) {
            return "DISCONNECTED";
        }
        if (i == 1) {
            return "CONNECTING";
        }
        if (i == 2) {
            return "CONNECTED";
        }
        if (i == 3) {
            return "DISCONNECTING";
        }
        return "UNKNOWN (" + i + ")";
    }

    public static String onWarmupCompleted(int i) {
        if (i == 1) {
            return "LE 1M";
        }
        if (i == 2) {
            return "LE 2M";
        }
        if (i == 3) {
            return "LE Coded";
        }
        return "UNKNOWN (" + i + ")";
    }

    public static String IAuthTabCallback(int i) {
        switch (i) {
            case 1:
                return "LE 1M";
            case 2:
                return "LE 2M";
            case 3:
                return "LE 1M or LE 2M";
            case 4:
                return "LE Coded";
            case 5:
                return "LE 1M or LE Coded";
            case 6:
                return "LE 2M or LE Coded";
            case 7:
                return "LE 1M, LE 2M or LE Coded";
            default:
                return "UNKNOWN (" + i + ")";
        }
    }

    public static String onNavigationEvent(int i) {
        if (i == 0) {
            return "No preferred";
        }
        if (i == 1) {
            return "S2";
        }
        if (i == 2) {
            return "S8";
        }
        return "UNKNOWN (" + i + ")";
    }
}
