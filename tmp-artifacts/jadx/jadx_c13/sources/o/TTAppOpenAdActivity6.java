package o;

import android.graphics.ImageFormat;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import o.TTBaseActivity;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTAppOpenAdActivity6 {
    private static char[] onExtraCallback;
    private static long onExtraCallbackWithResult;
    private static final int onNavigationEvent;
    private static int onTransact;
    private static final TTBaseActivity.onNavigationEvent onWarmupCompleted;
    private static final byte[] $$a = {15, -12, 105, 108};
    private static final int $$b = 46;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static int IAuthTabCallback = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, int i) {
        int i2;
        int i3 = (s * 4) + 4;
        byte[] bArr = $$a;
        int i4 = (i * 2) + 97;
        int i5 = b * 4;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i4;
            i2 = 0;
            i4 = i6;
            i3++;
            i4 += i7;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i3];
            i2++;
            i3++;
            i4 += i7;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    public static final long IAuthTabCallback(long j) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 63;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        long j2 = ((j & 65280) << 40) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((255 & j) << 56);
        int i5 = i2 + 113;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return j2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final int onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 83;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        int i6 = ((i & 65280) << 8) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((i & 255) << 24);
        int i7 = i3 + 97;
        asInterface = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final short onExtraCallbackWithResult(short s) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 13;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        short s2 = (short) (((s & 65280) >>> 8) | ((s & 255) << 8));
        int i5 = i3 + 31;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return s2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i5)) | i9 | (~(i8 | i5));
        int i11 = ~i5;
        int i12 = (~(i11 | i8 | i3)) | (~(i7 | i11 | i4));
        int i13 = i3 + i4 + i + ((-195996979) * i6) + ((-904719387) * i2);
        int i14 = i13 * i13;
        int i15 = (i3 * 1886715248) + 940376064 + (1886715248 * i4) + (i10 * (-42925423)) + (i9 * (-42925423)) + ((-42925423) * i12) + (1843789824 * i) + ((-1389494272) * i6) + (1623064576 * i2) + (1510801408 * i14);
        int i16 = (i3 * 1590984816) + 1398186415 + (i4 * 1590984816) + (i10 * 737) + (i9 * 737) + (i12 * 737) + (i * 1590985553) + (i6 * (-1025631779)) + (i2 * 1121679989) + (i14 * 622657536);
        return i15 + ((i16 * i16) * (-1928134656)) != 1 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static final void onExtraCallbackWithResult(long j, long j2, long j3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 43;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        if ((j2 | j3) >= 0) {
            int i5 = i3 + 57;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            if (j2 <= j && j - j2 >= j3) {
                int i7 = i3 + 45;
                IAuthTabCallbackStub = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 35 / 0;
                    return;
                }
                return;
            }
        }
        throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        byte[] bArr2 = (byte[]) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int iIntValue3 = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        int i2 = IAuthTabCallbackStub + 125;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < iIntValue3; i4++) {
            int i5 = asInterface;
            int i6 = i5 + 89;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            if (bArr[i4 + iIntValue] != bArr2[i4 + iIntValue2]) {
                int i8 = i5 + 1;
                IAuthTabCallbackStub = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0211  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            j = 0;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i4 = $10 + 71;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onExtraCallback[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 17, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallbackWithResult), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 46135), 30 - ImageFormat.getBitsPerPixel(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (KeyEvent.getMaxKeyCode() >> 16)), 44 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1493, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 35;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    char defaultSize = (char) (View.getDefaultSize(0, 0) + 49123);
                    int i8 = 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1));
                    int i9 = (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 1493;
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(defaultSize, i8, i9, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                int i10 = 99 / 0;
            } else {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 44, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) + 1494, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            int i11 = $10 + 87;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            j = 0;
        }
        objArr[0] = new String(cArr);
    }

    public static final String onExtraCallback(byte b) {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        IAuthTabCallbackStub = i2 % 128;
        String strConcatToString = i2 % 2 != 0 ? StringsKt__StringsJVMKt.concatToString(new char[]{TTHistoryLandingPageActivity.onExtraCallback()[0], TTHistoryLandingPageActivity.onExtraCallback()[b & 111], 0}) : StringsKt__StringsJVMKt.concatToString(new char[]{TTHistoryLandingPageActivity.onExtraCallback()[(b >> 4) & 15], TTHistoryLandingPageActivity.onExtraCallback()[b & 15]});
        int i3 = asInterface + 5;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return strConcatToString;
    }

    public static final String onNavigationEvent(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = 0;
        if (i == 0) {
            Object[] objArr = new Object[1];
            a(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (Process.myTid() >> 22) + 1, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i4 = IAuthTabCallbackStub + 15;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return strIntern;
            }
            throw null;
        }
        char[] cArr = {TTHistoryLandingPageActivity.onExtraCallback()[(i >> 28) & 15], TTHistoryLandingPageActivity.onExtraCallback()[(i >> 24) & 15], TTHistoryLandingPageActivity.onExtraCallback()[(i >> 20) & 15], TTHistoryLandingPageActivity.onExtraCallback()[(i >> 16) & 15], TTHistoryLandingPageActivity.onExtraCallback()[(i >> 12) & 15], TTHistoryLandingPageActivity.onExtraCallback()[(i >> 8) & 15], TTHistoryLandingPageActivity.onExtraCallback()[(i >> 4) & 15], TTHistoryLandingPageActivity.onExtraCallback()[i & 15]};
        while (i3 < 8) {
            int i5 = asInterface + 45;
            int i6 = i5 % 128;
            IAuthTabCallbackStub = i6;
            if (i5 % 2 == 0) {
                if (cArr[i3] != '0') {
                    break;
                }
                i3++;
                int i7 = i6 + Imgproc.COLOR_YUV2RGB_YVYU;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
            } else {
                if (cArr[i3] != '\r') {
                    break;
                }
                i3++;
                int i72 = i6 + Imgproc.COLOR_YUV2RGB_YVYU;
                asInterface = i72 % 128;
                int i82 = i72 % 2;
            }
        }
        return StringsKt__StringsJVMKt.concatToString(cArr, i3, 8);
    }

    static {
        onTransact = 1;
        onExtraCallback();
        onWarmupCompleted = new TTBaseActivity.onNavigationEvent();
        onNavigationEvent = -1234567890;
        int i = IAuthTabCallback + 87;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 113;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TTBaseActivity.onNavigationEvent onnavigationevent = onWarmupCompleted;
        int i4 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return onnavigationevent;
    }

    public static final TTBaseActivity.onNavigationEvent onWarmupCompleted(@NotNull TTBaseActivity.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        if (onnavigationevent == onWarmupCompleted) {
            onnavigationevent = new TTBaseActivity.onNavigationEvent();
        }
        int i4 = asInterface + 109;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return onnavigationevent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onNavigationEvent;
        if (i3 == 0) {
            int i5 = 72 / 0;
        }
        return i4;
    }

    public static final int onExtraCallback(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 7;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(tTBaseLandingPageActivity, "");
        if (i != onNavigationEvent) {
            return i;
        }
        int iAccess100 = tTBaseLandingPageActivity.access100();
        int i5 = asInterface + 77;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return iAccess100;
    }

    public static final int onExtraCallback(@NotNull byte[] bArr, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 5;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        if (i == onNavigationEvent) {
            int i5 = IAuthTabCallbackStub + 5;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return bArr.length;
        }
        int i7 = IAuthTabCallbackStub + 67;
        asInterface = i7 % 128;
        if (i7 % 2 != 0) {
            return i;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final boolean onExtraCallbackWithResult(@NotNull byte[] bArr, int i, @NotNull byte[] bArr2, int i2, int i3) {
        Object[] objArr = {bArr, Integer.valueOf(i), bArr2, Integer.valueOf(i2), Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        return ((Boolean) onNavigationEvent(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), objArr, -386312370, 386312371, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).booleanValue();
    }

    public static final TTBaseActivity.onNavigationEvent IAuthTabCallback() {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
        return (TTBaseActivity.onNavigationEvent) onNavigationEvent(iOnExtraCallbackWithResult2, setVisitUrl.onExtraCallbackWithResult(), new Object[0], 1075536718, -1075536718, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3);
    }

    static void onExtraCallback() {
        onExtraCallback = new char[]{60900};
        onExtraCallbackWithResult = -5566802446637511845L;
    }
}
