package o;

import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import java.text.NumberFormat;
import java.util.Locale;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class Cookies_flush {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static NumberFormat onWarmupCompleted = NumberFormat.getNumberInstance(Locale.US);

    static {
        int i = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String onWarmupCompleted(long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(j, null);
        int i4 = onNavigationEvent + 79;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return strOnNavigationEvent;
        }
        throw null;
    }

    public static String onNavigationEvent(long j, String str) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            String str2 = onWarmupCompleted.format(j);
            if (!TextUtils.isEmpty(str)) {
                return String.format("%s%s", onWarmupCompleted.format(j), str);
            }
            int i3 = onNavigationEvent + 113;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return str2;
        }
        onWarmupCompleted.format(j);
        TextUtils.isEmpty(str);
        throw null;
    }

    public static String onExtraCallbackWithResult(long j, String str, String str2) {
        String str3;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            String str4 = onWarmupCompleted.format(j);
            Object[] objArr = new Object[5];
            objArr[0] = str;
            objArr[1] = str4;
            objArr[5] = str2;
            str3 = String.format("%s%s%s", objArr);
        } else {
            str3 = String.format("%s%s%s", str, onWarmupCompleted.format(j), str2);
        }
        int i3 = IAuthTabCallback + 13;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return str3;
    }

    public static String onNavigationEvent(String str) {
        String number;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (TextUtils.isEmpty(str) || (number = PhoneNumberUtils.formatNumber(str, Locale.KOREA.getCountry())) == null) {
                return _UrlKt.FRAGMENT_ENCODE_SET;
            }
            int i3 = IAuthTabCallback;
            int i4 = i3 + 77;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 35;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return number;
            }
            obj.hashCode();
            throw null;
        }
        TextUtils.isEmpty(str);
        throw null;
    }
}
