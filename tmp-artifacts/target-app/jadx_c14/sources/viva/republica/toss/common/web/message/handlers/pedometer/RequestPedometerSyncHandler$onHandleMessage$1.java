package viva.republica.toss.common.web.message.handlers.pedometer;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgc;
import com.google.android.gms.internal.ads.zzgsa;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.ALCFaceBox;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertFloatArrayToByteArray;
import o.GeckoHubImp1;
import o.GuardedAsyncTask;
import o.JSInstance;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access8100;
import o.createFileLoader;
import o.doInBackgroundGuarded;
import o.findResAndMsg;
import o.getWrite;
import o.setOnOutOfMemeryErrorCallback;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
final class RequestPedometerSyncHandler$onHandleMessage$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
    final /* synthetic */ Context $context;
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    private static final byte[] $$a = {1, -53, 31, 101};
    private static final int $$b = 45;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onNavigationEvent = 1;
    private static long onExtraCallbackWithResult = 1004758759457705774L;
    private static int IAuthTabCallback = -1776194565;
    private static char onExtraCallback = 27643;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, short r8, byte r9) {
        /*
            int r9 = r9 * 4
            int r9 = r9 + 1
            int r7 = r7 + 109
            int r8 = r8 + 4
            byte[] r0 = viva.republica.toss.common.web.message.handlers.pedometer.RequestPedometerSyncHandler$onHandleMessage$1.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r8
            r3 = r9
            r4 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L28:
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.pedometer.RequestPedometerSyncHandler$onHandleMessage$1.$$c(int, short, byte):java.lang.String");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RequestPedometerSyncHandler$onHandleMessage$1(Context context, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, access13800<? super RequestPedometerSyncHandler$onHandleMessage$1> access13800Var) {
        super(2, access13800Var);
        this.$context = context;
        this.$callbackProxy = setonoutofmemeryerrorcallback;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        RequestPedometerSyncHandler$onHandleMessage$1 requestPedometerSyncHandler$onHandleMessage$1 = new RequestPedometerSyncHandler$onHandleMessage$1(this.$context, this.$callbackProxy, access13800Var);
        int i2 = onNavigationEvent + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return requestPedometerSyncHandler$onHandleMessage$1;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
        int i4 = onNavigationEvent + 85;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return objOnExtraCallback;
    }

    public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        RequestPedometerSyncHandler$onHandleMessage$1 requestPedometerSyncHandler$onHandleMessage$1Create = create(findresandmsg, access13800Var);
        if (i3 != 0) {
            requestPedometerSyncHandler$onHandleMessage$1Create.invokeSuspend(Unit.INSTANCE);
            throw null;
        }
        Object objInvokeSuspend = requestPedometerSyncHandler$onHandleMessage$1Create.invokeSuspend(Unit.INSTANCE);
        int i4 = onWarmupCompleted + 5;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objIAuthTabCallback;
        Function1 function1;
        String str;
        long j;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(obj);
            GuardedAsyncTask guardedAsyncTask = GuardedAsyncTask.IAuthTabCallback;
            int iIntValue = ((Integer) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), 339510305, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{guardedAsyncTask, null, 1, null}, -339510300)).intValue();
            String strOnExtraCallback = GuardedAsyncTask.onExtraCallback(guardedAsyncTask, null, 1, null);
            long jOnWarmupCompleted = doInBackgroundGuarded.onWarmupCompleted.onWarmupCompleted();
            StringBuilder sb = new StringBuilder();
            sb.append(strOnExtraCallback);
            Object[] objArr = new Object[1];
            a((char) (19178 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (-1647370489) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{6420}, new char[]{9429, 14417, 37618, 25035}, new char[]{1983, 53023, 60061, 35658}, objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(iIntValue);
            String string = sb.toString();
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr2 = new Object[1];
            a((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (Process.myTid() >> 22) + 325225566, new char[]{31609, 3469, 39695, 807, 44248, 47347, 21571, 8240, 32732}, new char[]{9429, 14417, 37618, 25035}, new char[]{24159, 25228, 64787, 28365}, objArr2);
            Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), access14000.onNavigationEvent(iIntValue));
            Object[] objArr3 = new Object[1];
            a((char) (ViewConfiguration.getWindowTouchSlop() >> 8), ViewConfiguration.getWindowTouchSlop() >> 8, new char[]{824, 39617, 60454, 34052, 11876, 26740, 14407, 24787}, new char[]{9429, 14417, 37618, 25035}, new char[]{50203, 37333, 47793, 58057}, objArr3);
            Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), strOnExtraCallback)});
            Object[] objArr4 = new Object[1];
            a((char) (55347 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), TextUtils.indexOf("", "", 0) - 2013710226, new char[]{42309, 7950, 12617, 31545, 44873, 9710, 333, 24434, 51366, 54329, 13861, 54334, 5705, 64145, 53301}, new char[]{9429, 14417, 37618, 25035}, new char[]{28236, 63800, 12935, 55512}, objArr4);
            String strIntern = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            a((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (-1078247132) - TextUtils.indexOf("", "", 0, 0), new char[]{2150, 21610, 54817, 4738, 5039, 38358, 58392, 29711, 61196, 29480, 57708, 57229, 40126, 14, 15483, 61260, 49418, 13362, 131, 36119, 3019, 21826, 40766, 52002, 62175, 28864, 49664, 53490, 1932, 30079, 20372, 3542, 33306, 32134, 33685}, new char[]{9429, 14417, 37618, 25035}, new char[]{9471, 47937, 4799, 19517}, objArr5);
            ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, strIntern, ((String) objArr5[0]).intern(), mapOnWarmupCompleted, null, false, null, 56, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
            GeckoHubImp1 geckoHubImp1OnExtraCallbackWithResult = createFileLoader.onExtraCallbackWithResult(createFileLoader.onExtraCallbackWithResult, this.$context, iIntValue, strOnExtraCallback, (JSInstance) null, 8, (Object) null);
            this.L$0 = access15400.onNavigationEvent(strOnExtraCallback);
            this.L$1 = string;
            this.I$0 = iIntValue;
            this.J$0 = jOnWarmupCompleted;
            this.label = 1;
            objIAuthTabCallback = geckoHubImp1OnExtraCallbackWithResult.IAuthTabCallback(this);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                int i5 = onNavigationEvent + 113;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return objOnWarmupCompleted;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            function1 = null;
            str = string;
            j = jOnWarmupCompleted;
        } else {
            if (i4 != 1) {
                Object[] objArr6 = new Object[1];
                a((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (Process.myPid() >> 22) + 450121884, new char[]{47921, 3954, 54179, 13823, 43980, 41804, 39543, 27977, 25792, 50704, 9540, 53551, 60129, 39909, 21426, 48050, 56577, 18248, 45114, 49720, 23845, 59226, 14703, 24871, 10618, 53935, 50452, 21944, 10565, 51072, 14523, 7977, 25402, 15989, 31283, 36810, 18932, 32725, 19618, 43320, 37493, 12839, 62495, 65174, 17401, 23189, 32205}, new char[]{9429, 14417, 37618, 25035}, new char[]{40070, 54352, 3098, 29434}, objArr6);
                throw new IllegalStateException(((String) objArr6[0]).intern());
            }
            long j2 = this.J$0;
            String str2 = (String) this.L$1;
            ResultKt.onNavigationEvent(obj);
            j = j2;
            str = str2;
            function1 = null;
            objIAuthTabCallback = obj;
        }
        Object objOnNavigationEvent = ((Result) objIAuthTabCallback).onNavigationEvent();
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = this.$callbackProxy;
        if (Result.onNavigationEvent(objOnNavigationEvent)) {
            setOnOutOfMemeryErrorCallback.onExtraCallback(setonoutofmemeryerrorcallback, function1, 1, function1);
        }
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback2 = this.$callbackProxy;
        Throwable th = Result.exceptionOrNull-impl(objOnNavigationEvent);
        if (th != null) {
            ALCFaceBox.onExtraCallbackWithResult(setonoutofmemeryerrorcallback2, th, (String) null, (Map) null, 6, (Object) null);
            doInBackgroundGuarded doinbackgroundguarded = doInBackgroundGuarded.onWarmupCompleted;
            int iIntValue2 = ((Integer) GuardedAsyncTask.onExtraCallback(zzgsa.onWarmupCompleted(), 339510305, zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), zzgsa.onWarmupCompleted(), new Object[]{GuardedAsyncTask.IAuthTabCallback, null, 1, null}, -339510300)).intValue();
            String localizedMessage = th.getLocalizedMessage();
            Object[] objArr7 = new Object[1];
            a((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, new char[]{38419, 59673, 41261, 42770, 7462, 9094, 51977, 1178, 50621, 57636, 26931, 22478, 32547, 55023, 11149, 54545, 31718, 40901, 39075, 45775}, new char[]{9429, 14417, 37618, 25035}, new char[]{38230, 9045, 64568, 17754}, objArr7);
            doinbackgroundguarded.onNavigationEvent(j, ((String) objArr7[0]).intern(), iIntValue2, str, localizedMessage);
        }
        return Unit.INSTANCE;
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
                    char cAlpha = (char) Color.alpha(0);
                    int iIndexOf = 42 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 1451;
                    byte b = $$a[0];
                    byte b2 = (byte) (-b);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cAlpha, iIndexOf, edgeSlop, 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char cGreen = (char) (Color.green(0) + 49123);
                        int i6 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 43;
                        int iMyTid = 1494 - (Process.myTid() >> 22);
                        byte b3 = $$a[0];
                        byte b4 = (byte) (b3 - 1);
                        byte b5 = (byte) (-b3);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cGreen, i6, iMyTid, 1533236389, false, $$c(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23971 - MotionEvent.axisFromString("")), 50 - TextUtils.indexOf("", ""), 22939 - (ViewConfiguration.getScrollBarSize() >> 8), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.getDefaultSize(0, 0) + 45848), 29 - (ViewConfiguration.getPressedStateDuration() >> 16), Color.argb(0, 0, 0, 0) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            int i7 = $11 + 29;
                            $10 = i7 % 128;
                            int i8 = i7 % 2;
                            i2 = 2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr6);
    }
}
