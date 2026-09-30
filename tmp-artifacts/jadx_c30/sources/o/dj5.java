package o;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import java.util.Arrays;
import org.apache.commons.compress.archivers.zip.UnsupportedZipFeatureException;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class dj5 {
    public static int onWarmupCompleted(byte b) {
        return b >= 0 ? b : b + 256;
    }

    static boolean IAuthTabCallback(TTWebsiteActivity2 tTWebsiteActivity2) {
        return onExtraCallback(tTWebsiteActivity2) && onExtraCallbackWithResult(tTWebsiteActivity2);
    }

    static void onNavigationEvent(TTWebsiteActivity2 tTWebsiteActivity2) throws UnsupportedZipFeatureException {
        if (!onExtraCallback(tTWebsiteActivity2)) {
            throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.onExtraCallback.IAuthTabCallback, tTWebsiteActivity2);
        }
        if (onExtraCallbackWithResult(tTWebsiteActivity2)) {
            return;
        }
        dj14 methodByCode = dj14.getMethodByCode(tTWebsiteActivity2.getMethod());
        if (methodByCode == null) {
            throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.onExtraCallback.onWarmupCompleted, tTWebsiteActivity2);
        }
        throw new UnsupportedZipFeatureException(methodByCode, tTWebsiteActivity2);
    }

    static byte[] onWarmupCompleted(byte[] bArr) {
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public static boolean IAuthTabCallback(long j) {
        return j <= 4036608000000L && onWarmupCompleted(j) != 2162688;
    }

    private static LocalDateTime onNavigationEvent(long j) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(j), ZoneId.systemDefault());
    }

    private static long onWarmupCompleted(long j) {
        if (onNavigationEvent(j).getYear() < 1980) {
            return 2162688L;
        }
        return ((r5.getSecond() >> 1) | ((r5.getYear() - 1980) << 25) | (r5.getMonthValue() << 21) | (r5.getDayOfMonth() << 16) | (r5.getHour() << 11) | (r5.getMinute() << 5)) & BodyPartID.bodyIdMax;
    }

    public static byte[] onExtraCallback(byte[] bArr) {
        int length = bArr.length;
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            int i2 = (length - 1) - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }

    private static boolean onExtraCallback(TTWebsiteActivity2 tTWebsiteActivity2) {
        return !tTWebsiteActivity2.onExtraCallback().onNavigationEvent();
    }

    private static boolean onExtraCallbackWithResult(TTWebsiteActivity2 tTWebsiteActivity2) {
        return tTWebsiteActivity2.getMethod() == 0 || tTWebsiteActivity2.getMethod() == dj14.UNSHRINKING.getCode() || tTWebsiteActivity2.getMethod() == dj14.IMPLODING.getCode() || tTWebsiteActivity2.getMethod() == 8 || tTWebsiteActivity2.getMethod() == dj14.ENHANCED_DEFLATED.getCode() || tTWebsiteActivity2.getMethod() == dj14.BZIP2.getCode();
    }

    public static void IAuthTabCallback(long j, byte[] bArr, int i) {
        dj12.onNavigationEvent(onWarmupCompleted(j), bArr, i);
    }

    public static byte onWarmupCompleted(int i) {
        if (i <= 255 && i >= 0) {
            return i < 128 ? (byte) i : (byte) (i - 256);
        }
        throw new IllegalArgumentException("Can only convert non-negative integers between [0,255] to byte: [" + i + "]");
    }
}
