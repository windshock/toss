package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import viva.republica.toss.network.model.transfer.DetectFraudIconInfo;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class accessdecrementInFlightAnimationsForViewTag {
    private static final byte[] $$a = {90, 10, -103, 87};
    private static final int $$b = 175;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static char[] onNavigationEvent = {60860, 44303, 27902, 12201, 61211, 44677, 27105, 10546, 59615, 43911, 27491, 10789, 58761, 42324, 25704, 10209, 59211, 42552, 25065, 8455, 57361, 41954, 25329, 8705, 64979, 48311, 31846, 16328, 65173, 48756, 31097, 14476, 63575, 47924, 31364, 14868, 62765, 46311, 29773, 14097, 63213, 45502, 28931, 12485, 62377, 45944, 29384, 3544, 52583, 36034, 20360, 3946, 52788, 35210, 18707, 2100, 52217, 35663, 18974, 1518, 50343, 33866, 18308, 1771, 50788, 33237, 16557, 60860, 44303, 27902, 12201, 61211, 44677, 27105, 10546, 59615, 43911, 27491, 10789, 58761, 42324, 25704, 10209, 59211, 42552, 25065, 8455, 57361, 41954, 25329, 8705, 64979, 48311, 31846, 16328, 65173, 48756, 31097, 14465, 63573, 47912, 31362, 14939, 62759, 46334, 29788, 14105, 63139, 45495, 28931, 12482, 62376, 45941, 29385, 3476, 52598, 36047, 20389, 3947, 52781, 35213, 18780, 2081, 52217, 35708, 18974, 1518, 50353, 33795, 18399, 1707, 50803, 33173, 16544, 'j', 50119, 33425};
    private static long onWarmupCompleted = 2762962205661965691L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, short r6, int r7) {
        /*
            byte[] r0 = o.accessdecrementInFlightAnimationsForViewTag.$$a
            int r6 = r6 * 4
            int r6 = r6 + 97
            int r5 = r5 * 3
            int r5 = 4 - r5
            int r7 = r7 * 3
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r5
            r3 = r7
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r3 = r0[r5]
        L27:
            int r5 = r5 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.accessdecrementInFlightAnimationsForViewTag.$$c(short, short, int):java.lang.String");
    }

    public static final DetectFraudIconInfo onWarmupCompleted() throws Throwable {
        int i = 2 % 2;
        DetectFraudIconInfo.onExtraCallback onextracallback = DetectFraudIconInfo.onExtraCallback.LOTTIE;
        DetectFraudIconInfo.onNavigationEvent onnavigationevent = DetectFraudIconInfo.onNavigationEvent.INFINITE;
        Object[] objArr = new Object[1];
        a(68 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 70 - TextUtils.getCapsMode("", 0, 0), (char) (AndroidCharacter.getMirror('0') - '0'), objArr);
        DetectFraudIconInfo detectFraudIconInfo = new DetectFraudIconInfo(onextracallback, onnavigationevent, ((String) objArr[0]).intern());
        int i2 = onExtraCallbackWithResult + 77;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return detectFraudIconInfo;
        }
        throw null;
    }

    public static final DetectFraudIconInfo onExtraCallback() throws Throwable {
        int i = 2 % 2;
        DetectFraudIconInfo.onExtraCallback onextracallback = DetectFraudIconInfo.onExtraCallback.PNG;
        DetectFraudIconInfo.onNavigationEvent onnavigationevent = DetectFraudIconInfo.onNavigationEvent.STATIC;
        Object[] objArr = new Object[1];
        a(TextUtils.lastIndexOf("", '0') + 1, 67 - Color.alpha(0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), objArr);
        DetectFraudIconInfo detectFraudIconInfo = new DetectFraudIconInfo(onextracallback, onnavigationevent, ((String) objArr[0]).intern());
        int i2 = onExtraCallbackWithResult + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return detectFraudIconInfo;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $10 + 75;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59696 - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.indexOf((CharSequence) "", '0', 0) + 18, 10972 - ((byte) KeyEvent.getModifierMetaStateMask()), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 46135), 31 - TextUtils.getOffsetBefore("", 0), 20220 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49122), 44 - KeyEvent.keyCodeFromString(""), (Process.myPid() >> 22) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $10 + 113;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 44 - TextUtils.getTrimmedLength(""), 1494 - (ViewConfiguration.getScrollBarSize() >> 8), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }
}
