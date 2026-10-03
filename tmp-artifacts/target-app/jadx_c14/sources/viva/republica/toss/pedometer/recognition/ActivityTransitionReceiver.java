package viva.republica.toss.pedometer.recognition;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionResult;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.EncryptedContentInfoParser;
import o.GuardedAsyncTask;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.pedometer.PedometerService;
import viva.republica.toss.pedometer.recognition.ActivityTransitionReceiver$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class ActivityTransitionReceiver extends BroadcastReceiver {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    public static final int onExtraCallbackWithResult = 8;

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) throws Exception {
        List transitionEvents;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(intent, "");
        if (ActivityTransitionResult.hasResult(intent)) {
            ActivityTransitionResult activityTransitionResultExtractResult = ActivityTransitionResult.extractResult(intent);
            if (GuardedAsyncTask.IAuthTabCallback.IAuthTabCallbackDefault(context)) {
                PedometerService.onExtraCallbackWithResult.onWarmupCompleted(PedometerService.Companion, context, "ActivityTransitionReceiver", (activityTransitionResultExtractResult == null || (transitionEvents = activityTransitionResultExtractResult.getTransitionEvents()) == null) ? null : CollectionsKt.joinToString$default(transitionEvents, " | ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new ActivityTransitionReceiver$.ExternalSyntheticLambda0(), 30, (Object) null), false, 8, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence onNavigationEvent(ActivityTransitionEvent activityTransitionEvent) throws Throwable {
        onExtraCallback onextracallback = Companion;
        return onExtraCallback.onExtraCallback(onextracallback, activityTransitionEvent.getActivityType()) + "(" + onExtraCallback.onNavigationEvent(onextracallback, activityTransitionEvent.getTransitionType()) + ")";
    }

    public static final class onExtraCallback {
        private static final byte[] $$a = {70, 83, 77, 1};
        private static final int $$b = 40;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        private static long onWarmupCompleted = 7798559133331975163L;
        private static int IAuthTabCallback = 610072402;
        private static char onExtraCallbackWithResult = 27643;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r6, short r7, int r8) {
            /*
                int r6 = r6 * 4
                int r0 = 1 - r6
                byte[] r1 = viva.republica.toss.pedometer.recognition.ActivityTransitionReceiver.onExtraCallback.$$a
                int r8 = r8 + 4
                int r7 = 110 - r7
                byte[] r0 = new byte[r0]
                r2 = 0
                int r6 = 0 - r6
                if (r1 != 0) goto L15
                r7 = r6
                r3 = r8
                r4 = r2
                goto L2a
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r7
                int r8 = r8 + 1
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L25:
                r3 = r1[r8]
                r5 = r3
                r3 = r8
                r8 = r5
            L2a:
                int r7 = r7 + r8
                r8 = r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.pedometer.recognition.ActivityTransitionReceiver.onExtraCallback.$$c(int, short, int):java.lang.String");
        }

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public static final /* synthetic */ String onExtraCallback(onExtraCallback onextracallback, int i) throws Throwable {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 81;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            String strOnExtraCallback = onextracallback.onExtraCallback(i);
            int i5 = onNavigationEvent + 35;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return strOnExtraCallback;
        }

        public static final /* synthetic */ String onNavigationEvent(onExtraCallback onextracallback, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 41;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                onextracallback.onExtraCallbackWithResult(i);
                throw null;
            }
            String strOnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult(i);
            int i4 = onNavigationEvent + 89;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return strOnExtraCallbackWithResult;
        }

        private final String onExtraCallback(int i) throws Throwable {
            int i2 = 2 % 2;
            switch (i) {
                case 0:
                    return "IN_VEHICLE";
                case EncryptedContentInfoParser.TYPE_BOLD /* 1 */:
                    return "ON_BICYCLE";
                case 2:
                    return "ON_FOOT";
                case 3:
                    return "STILL";
                case 4:
                    Object[] objArr = new Object[1];
                    a((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 1364805985, new char[]{63802, 55226, 46574, 57937, 35177, 56843, 14769}, new char[]{0, 0, 0, 0}, new char[]{25008, 22857, 20561, 7716}, objArr);
                    return ((String) objArr[0]).intern();
                case 5:
                    return "TILTING";
                case 6:
                default:
                    int i3 = onExtraCallback + 77;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    return "?";
                case 7:
                    return "WALKING";
                case 8:
                    int i5 = onNavigationEvent + 85;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 == 0) {
                        return "RUNNING";
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
            }
        }

        private final String onExtraCallbackWithResult(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 43;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (i == 0) {
                return "ENTER";
            }
            if (i == 1) {
                return "EXIT";
            }
            int i5 = i4 + 95;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return "?";
        }

        private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
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
            while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                int i4 = $10 + 111;
                $11 = i4 % 128;
                int i5 = i4 % i2;
                try {
                    Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                    if (objOnExtraCallback == null) {
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 43;
                        int iArgb = Color.argb(0, 0, 0, 0) + 1451;
                        byte b = $$a[3];
                        byte b2 = (byte) (b - 1);
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(absoluteGravity, iNormalizeMetaState, iArgb, 228868077, false, $$c(b2, b2, (byte) (-b)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char cLastIndexOf = (char) (49122 - TextUtils.lastIndexOf("", '0', 0));
                        int i6 = 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int iRgb = (-16775722) - Color.rgb(0, 0, 0);
                        byte b3 = $$a[3];
                        byte b4 = (byte) (b3 - 1);
                        byte b5 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cLastIndexOf, i6, iRgb, 1533236389, false, $$c(b4, b5, (byte) (-b5)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 23972), 49 - MotionEvent.axisFromString(""), 22939 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - (ViewConfiguration.getTouchSlop() >> 8)), 28 - ((byte) KeyEvent.getModifierMetaStateMask()), 12578 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            String str = new String(cArr6);
            int i7 = $10 + 39;
            $11 = i7 % 128;
            if (i7 % 2 != 0) {
                objArr[0] = str;
            } else {
                int i8 = 68 / 0;
                objArr[0] = str;
            }
        }
    }
}
