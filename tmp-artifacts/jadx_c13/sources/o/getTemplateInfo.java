package o;

import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final /* synthetic */ class getTemplateInfo {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 11405;
    private static int asBinder = 1;
    private static int onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 39511;
    private static char onNavigationEvent = 6152;
    private static char onWarmupCompleted = 28865;

    public static /* synthetic */ String onWarmupCompleted(long j, int i) throws Throwable {
        long jOnExtraCallback;
        int i2 = 2 % 2;
        if (j == 0) {
            Object[] objArr = new Object[1];
            a(new char[]{30075, 17353}, 1 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
            return ((String) objArr[0]).intern();
        }
        if (j > 0) {
            return Long.toString(j, i);
        }
        if (i < 2 || i > 36) {
            i = 10;
        }
        int i3 = 64;
        char[] cArr = new char[64];
        int i4 = i - 1;
        if ((i & i4) == 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            do {
                i3--;
                cArr[i3] = Character.forDigit(((int) j) & i4, i);
                j >>>= iNumberOfTrailingZeros;
            } while (j != 0);
        } else {
            if ((i & 1) == 0) {
                int i5 = onExtraCallback + 81;
                asBinder = i5 % 128;
                jOnExtraCallback = i5 % 2 == 0 ? i & j : (j >>> 1) / (i >>> 1);
            } else {
                jOnExtraCallback = access13300.onExtraCallback(j, i);
            }
            long j2 = i;
            cArr[63] = Character.forDigit((int) (j - (jOnExtraCallback * j2)), i);
            long j3 = jOnExtraCallback;
            i3 = 63;
            for (long j4 = j3; j4 > 0; j4 /= j2) {
                int i6 = asBinder + 95;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                i3--;
                cArr[i3] = Character.forDigit((int) (j4 % j2), i);
            }
        }
        return new String(cArr, i3, 64 - i3);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = $10 + 119;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onExtraCallbackWithResult);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        int packedPositionChild = 9 - ExpandableListView.getPackedPositionChild(0L);
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), packedPositionChild, packedPositionType, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 10, Color.red(0) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i10 = $11 + 123;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getLongPressTimeout() >> 16)), 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
