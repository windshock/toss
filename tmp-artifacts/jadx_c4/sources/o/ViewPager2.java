package o;

import android.graphics.PointF;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.ads.AdValue;
import im.toss.ads_sdk.remote.model.AdMobFailedDetail;
import im.toss.ads_sdk.remote.model.AdMobFailedReason;
import java.lang.reflect.Method;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ViewPager2 {
    private static final byte[] $$a = {115, 102, 60, 8};
    private static final int $$b = 83;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallbackWithResult = 1;
    private static long onWarmupCompleted = -4103400711274880650L;
    private static int IAuthTabCallback = -1776194565;
    private static char onExtraCallback = 27643;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, short s2) {
        int i2;
        int i3 = s + 4;
        byte[] bArr = $$a;
        int i4 = s2 + 109;
        int i5 = i * 3;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i4 += -i6;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i3];
            i2++;
            i4 += -i6;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    public static final /* synthetic */ String onExtraCallbackWithResult(AdValue adValue) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(adValue);
        int i4 = onNavigationEvent + 113;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return strOnNavigationEvent;
    }

    public static final /* synthetic */ AdMobFailedDetail onWarmupCompleted(AdMobFailedReason adMobFailedReason) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(adMobFailedReason);
        }
        onExtraCallback(adMobFailedReason);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i3 = $11 + 115;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 42, 1451 - (ViewConfiguration.getTouchSlop() >> 8), 228868077, false, $$c(b, b2, (byte) (-b2)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 49123), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43, 1494 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - TextUtils.getCapsMode("", 0, 0)), View.MeasureSpec.getMode(0) + 50, 22938 - TextUtils.indexOf((CharSequence) "", '0', 0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getOffsetAfter("", 0) + 45848), 29 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i5 = $10 + 73;
                $11 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static final String onNavigationEvent(AdValue adValue) throws Throwable {
        int i = 2 % 2;
        int precisionType = adValue.getPrecisionType();
        if (precisionType == 1) {
            int i2 = onExtraCallbackWithResult + 9;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return "ESTIMATED";
        }
        if (precisionType == 2) {
            return "PUBLISHER_PROVIDED";
        }
        if (precisionType != 3) {
            int i4 = onNavigationEvent + 49;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            a((char) TextUtils.indexOf("", "", 0, 0), (-1447087285) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{6973, 20025, 11886, 17246, 17848, 63624, 60509}, new char[]{19085, 44865, 50941, 43831}, new char[]{19406, 48947, 2985, 64342}, objArr);
            return ((String) objArr[0]).intern();
        }
        return "PRECISE";
    }

    private static final AdMobFailedDetail onExtraCallback(AdMobFailedReason adMobFailedReason) {
        int i = 2 % 2;
        AdMobFailedDetail adMobFailedDetail = new AdMobFailedDetail(adMobFailedReason.onExtraCallbackWithResult(), adMobFailedReason.onNavigationEvent(), adMobFailedReason.onExtraCallback());
        Object obj = null;
        if (adMobFailedDetail.onExtraCallback() == null && adMobFailedDetail.IAuthTabCallback() == null && adMobFailedDetail.onNavigationEvent() == null) {
            int i2 = onExtraCallbackWithResult + 105;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i3 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return adMobFailedDetail;
        }
        obj.hashCode();
        throw null;
    }
}
