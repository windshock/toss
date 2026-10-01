package o;

import java.util.Arrays;
import okhttp3.internal.http2.Settings;
import org.opencv.imgcodecs.Imgcodecs;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class copybugsnag_android_core_release {
    private static final char[] onWarmupCompleted = onExtraCallbackWithResult();
    private static final byte[] onExtraCallbackWithResult = IAuthTabCallback();
    private static final boolean[] onExtraCallback = onNavigationEvent();

    private static char[] onExtraCallbackWithResult() {
        char[] cArr = new char[Imgcodecs.IMWRITE_AVIF_QUALITY];
        for (int i = 0; i < 256; i++) {
            cArr[i] = "0123456789abcdef".charAt(i >>> 4);
            cArr[i | 256] = "0123456789abcdef".charAt(i & 15);
        }
        return cArr;
    }

    private static byte[] IAuthTabCallback() {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 16; i++) {
            bArr["0123456789abcdef".charAt(i)] = (byte) i;
        }
        return bArr;
    }

    private static boolean[] onNavigationEvent() {
        boolean[] zArr = new boolean[Settings.DEFAULT_INITIAL_WINDOW_SIZE];
        int i = 0;
        while (i < 65535) {
            zArr[i] = (48 <= i && i <= 57) || (97 <= i && i <= 102);
            i++;
        }
        return zArr;
    }

    public static long onNavigationEvent(CharSequence charSequence, int i) {
        return ((IAuthTabCallback(charSequence.charAt(i), charSequence.charAt(i + 1)) & 255) << 56) | ((IAuthTabCallback(charSequence.charAt(i + 2), charSequence.charAt(i + 3)) & 255) << 48) | ((IAuthTabCallback(charSequence.charAt(i + 4), charSequence.charAt(i + 5)) & 255) << 40) | ((IAuthTabCallback(charSequence.charAt(i + 6), charSequence.charAt(i + 7)) & 255) << 32) | ((IAuthTabCallback(charSequence.charAt(i + 8), charSequence.charAt(i + 9)) & 255) << 24) | ((IAuthTabCallback(charSequence.charAt(i + 10), charSequence.charAt(i + 11)) & 255) << 16) | ((IAuthTabCallback(charSequence.charAt(i + 12), charSequence.charAt(i + 13)) & 255) << 8) | (IAuthTabCallback(charSequence.charAt(i + 14), charSequence.charAt(i + 15)) & 255);
    }

    public static void onNavigationEvent(long j, char[] cArr, int i) {
        onWarmupCompleted((byte) ((j >> 56) & 255), cArr, i);
        onWarmupCompleted((byte) ((j >> 48) & 255), cArr, i + 2);
        onWarmupCompleted((byte) ((j >> 40) & 255), cArr, i + 4);
        onWarmupCompleted((byte) ((j >> 32) & 255), cArr, i + 6);
        onWarmupCompleted((byte) ((j >> 24) & 255), cArr, i + 8);
        onWarmupCompleted((byte) ((j >> 16) & 255), cArr, i + 10);
        onWarmupCompleted((byte) ((j >> 8) & 255), cArr, i + 12);
        onWarmupCompleted((byte) (j & 255), cArr, i + 14);
    }

    public static byte[] onWarmupCompleted(CharSequence charSequence, int i) {
        byte[] bArr = new byte[i / 2];
        onWarmupCompleted(charSequence, i, bArr);
        return bArr;
    }

    public static void onWarmupCompleted(CharSequence charSequence, int i, byte[] bArr) {
        for (int i2 = 0; i2 < i; i2 += 2) {
            bArr[i2 / 2] = IAuthTabCallback(charSequence.charAt(i2), charSequence.charAt(i2 + 1));
        }
    }

    public static void onWarmupCompleted(byte b, char[] cArr, int i) {
        int i2 = b & 255;
        char[] cArr2 = onWarmupCompleted;
        cArr[i] = cArr2[i2];
        cArr[i + 1] = cArr2[i2 | 256];
    }

    public static byte IAuthTabCallback(char c, char c2) {
        byte[] bArr;
        byte b;
        byte b2;
        if (c >= 128 || (b = (bArr = onExtraCallbackWithResult)[c]) == -1) {
            throw new IllegalArgumentException("invalid character " + c);
        }
        if (c2 < 128 && (b2 = bArr[c2]) != -1) {
            return (byte) (b2 | (b << 4));
        }
        throw new IllegalArgumentException("invalid character " + c2);
    }

    public static boolean onNavigationEvent(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!onExtraCallbackWithResult(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean onExtraCallbackWithResult(char c) {
        return onExtraCallback[c];
    }
}
