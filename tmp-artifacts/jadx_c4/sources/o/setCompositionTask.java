package o;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface setCompositionTask {
    public static final byte[] $$d = {50, -82, -81, 124};
    public static final int $$e = 225;
    public static final long IAuthTabCallback = 7798559133331975163L;
    public static final int onWarmupCompleted = -707852086;
    public static final char onExtraCallbackWithResult = 27643;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            setCompositionTask setcompositiontask = setCompositionTask.this;
            if (i3 != 0) {
                return setCompositionTask.onWarmupCompleted(setcompositiontask, null, this);
            }
            setCompositionTask.onWarmupCompleted(setcompositiontask, null, this);
            throw null;
        }
    }

    static final class onWarmupCompleted extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = setCompositionTask.IAuthTabCallback(setCompositionTask.this, null, this);
            if (i3 != 0) {
                int i4 = 52 / 0;
            }
            return objIAuthTabCallback;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$f(int i, int i2, int i3) {
        int i4;
        int i5;
        byte[] bArr = $$d;
        int i6 = 1 - (i2 * 3);
        int i7 = 110 - i;
        int i8 = (i3 * 4) + 4;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i9 = i8;
            int i10 = 0;
            i8++;
            i7 += i9;
            i4 = i10;
            bArr2[i4] = (byte) i7;
            i5 = i4 + 1;
            if (i5 == i6) {
                return new String(bArr2, 0);
            }
            i9 = i7;
            i7 = bArr[i8];
            i10 = i5;
            i8++;
            i7 += i9;
            i4 = i10;
            bArr2[i4] = (byte) i7;
            i5 = i4 + 1;
            if (i5 == i6) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i7;
            i5 = i4 + 1;
            if (i5 == i6) {
            }
        }
    }

    default Object onExtraCallback(@NotNull String str, @NotNull access13800<? super setProgressInternal> access13800Var) {
        int i = 2 % 2;
        return IAuthTabCallback(this, str, access13800Var);
    }

    default Object onExtraCallback(@NotNull String[] strArr, @NotNull access13800<? super Map<String, setProgressInternal>> access13800Var) {
        int i = 2 % 2;
        return onWarmupCompleted(this, strArr, access13800Var);
    }

    String onExtraCallback(@NotNull String str);

    void onExtraCallback(@NotNull String str, @NotNull String str2);

    Object onExtraCallbackWithResult(@NotNull access13800<? super Unit> access13800Var);

    Object onNavigationEvent(@NotNull String str, @NotNull access13800<? super String> access13800Var);

    Object onNavigationEvent(@NotNull String[] strArr, @NotNull access13800<? super Map<String, String>> access13800Var);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object IAuthTabCallback(setCompositionTask setcompositiontask, String str, access13800<? super setProgressInternal> access13800Var) throws Throwable {
        onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        if (access13800Var instanceof onWarmupCompleted) {
            onwarmupcompleted = (onWarmupCompleted) access13800Var;
            int i2 = onwarmupcompleted.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onwarmupcompleted.label = i2 - 2147483648;
            } else {
                onwarmupcompleted = setcompositiontask.new onWarmupCompleted(access13800Var);
            }
        }
        Object objOnNavigationEvent = onwarmupcompleted.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = onwarmupcompleted.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            onwarmupcompleted.L$0 = access15400.onNavigationEvent(setcompositiontask);
            onwarmupcompleted.L$1 = access15400.onNavigationEvent(str);
            onwarmupcompleted.label = 1;
            objOnNavigationEvent = setcompositiontask.onNavigationEvent(str, (access13800<? super String>) onwarmupcompleted);
            if (objOnNavigationEvent == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i3 != 1) {
                Object[] objArr = new Object[1];
                b(120853077 - TextUtils.getOffsetBefore("", 0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{60476, 32228, 4549, 15683, 58512, 31844, 48938, 59064, 51459, 49230, 54294, 27037, 22748, 34526, 54290, 46747, 51084, 52928, 50419, 25682, 14801, 1031, 6267, 13290, 26833, 47327, 27049, 5573, 22263, 33815, 57355, 18007, 25227, 20628, 56376, 37131, 28205, 40071, 23752, 42692, 28165, 55613, 10600, 60912, 47877, 52304, 10150}, new char[]{21860, 13330, 61191, 24728}, new char[]{0, 0, 0, 0}, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(objOnNavigationEvent);
        }
        return new setProgressInternal((String) objOnNavigationEvent, r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.UNKNOWN);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object onWarmupCompleted(setCompositionTask setcompositiontask, String[] strArr, access13800<? super Map<String, setProgressInternal>> access13800Var) throws Throwable {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i = 2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i2 = onextracallbackwithresult.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onextracallbackwithresult.label = i2 - 2147483648;
            } else {
                onextracallbackwithresult = setcompositiontask.new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object objOnNavigationEvent = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = onextracallbackwithresult.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            onextracallbackwithresult.L$0 = access15400.onNavigationEvent(setcompositiontask);
            onextracallbackwithresult.L$1 = access15400.onNavigationEvent(strArr);
            onextracallbackwithresult.label = 1;
            objOnNavigationEvent = setcompositiontask.onNavigationEvent(strArr2, (access13800<? super Map<String, String>>) onextracallbackwithresult);
            if (objOnNavigationEvent == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i3 != 1) {
                Object[] objArr = new Object[1];
                b(120853077 - (ViewConfiguration.getScrollBarSize() >> 8), (char) View.MeasureSpec.getMode(0), new char[]{60476, 32228, 4549, 15683, 58512, 31844, 48938, 59064, 51459, 49230, 54294, 27037, 22748, 34526, 54290, 46747, 51084, 52928, 50419, 25682, 14801, 1031, 6267, 13290, 26833, 47327, 27049, 5573, 22263, 33815, 57355, 18007, 25227, 20628, 56376, 37131, 28205, 40071, 23752, 42692, 28165, 55613, 10600, 60912, 47877, 52304, 10150}, new char[]{21860, 13330, 61191, 24728}, new char[]{0, 0, 0, 0}, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(objOnNavigationEvent);
        }
        Map map = (Map) objOnNavigationEvent;
        LinkedHashMap linkedHashMap = new LinkedHashMap(access8100.IAuthTabCallback(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new setProgressInternal((String) entry.getValue(), r8lambdaiMI1KKYy494wCpjbjzIyxAbnqTg.UNKNOWN));
        }
        return linkedHashMap;
    }

    private static void b(int i, char c, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        char c2;
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char cMyPid = (char) (Process.myPid() >> 22);
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 43;
                    int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1451;
                    byte b = (byte) i3;
                    byte b2 = b;
                    String str$$f = $$f(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cMyPid, minimumFlingVelocity, maximumDrawingCacheSize, 228868077, false, str$$f, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char longPressTimeout = (char) (49123 - (ViewConfiguration.getLongPressTimeout() >> 16));
                    int iResolveOpacity = 44 - Drawable.resolveOpacity(i3, i3);
                    int maxKeyCode = 1494 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte b3 = (byte) ($$e & 7);
                    byte b4 = (byte) (b3 - 1);
                    String str$$f2 = $$f(b3, b4, b4);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i3] = Object.class;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(longPressTimeout, iResolveOpacity, maxKeyCode, 1533236389, false, str$$f2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                int i4 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i4);
                objArr4[i3] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 23972);
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(i3) + 50;
                    int i5 = 22940 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i3] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(windowTouchSlop, iNormalizeMetaState, i5, 1872485556, false, "k", clsArr3);
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i6 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i3] = Integer.valueOf(i6);
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    char absoluteGravity = (char) (45848 - Gravity.getAbsoluteGravity(i3, i3));
                    int iMyTid = 29 - (Process.myTid() >> 22);
                    int i7 = (TypedValue.complexToFloat(i3) > 0.0f ? 1 : (TypedValue.complexToFloat(i3) == 0.0f ? 0 : -1)) + 12577;
                    c2 = 2;
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i3] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(absoluteGravity, iMyTid, i7, 1401536470, false, "l", clsArr4);
                } else {
                    c2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (onWarmupCompleted ^ 7798559133331975163L)) ^ ((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i3 = 0;
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
}
