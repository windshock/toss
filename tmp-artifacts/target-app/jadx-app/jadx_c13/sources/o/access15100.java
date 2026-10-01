package o;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access15100 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static onNavigationEvent IAuthTabCallback = null;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface = 0;
    private static int onExtraCallback = 0;
    public static final access15100 onExtraCallbackWithResult;
    private static final onNavigationEvent onNavigationEvent;
    private static int onTransact = 1;
    private static long onWarmupCompleted;

    static final class onNavigationEvent {
        public final Method onExtraCallbackWithResult;
        public final Method onNavigationEvent;
        public final Method onWarmupCompleted;

        public onNavigationEvent(@Nullable Method method, @Nullable Method method2, @Nullable Method method3) {
            this.onNavigationEvent = method;
            this.onWarmupCompleted = method2;
            this.onExtraCallbackWithResult = method3;
        }
    }

    private access15100() {
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $10 + 123;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 7;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 84, (Process.myPid() >> 22) + 21233, -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14186 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 19 - (ViewConfiguration.getFadingEdgeLength() >> 16), 8808 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0), 64918803, false, "d", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    static {
        onExtraCallback();
        onExtraCallbackWithResult = new access15100();
        Object obj = null;
        onNavigationEvent = new onNavigationEvent(null, null, null);
        int i = onTransact + 95;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[PHI: r7
      0x0050: PHI (r7v3 java.lang.Object) = (r7v2 java.lang.Object), (r7v10 java.lang.Object) binds: [B:16:0x004e, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String onExtraCallback(@NotNull access13800<Object> access13800Var) throws Throwable {
        Method method;
        Object objInvoke;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 71;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(access13800Var, "");
        onNavigationEvent onnavigationeventOnExtraCallbackWithResult = IAuthTabCallback;
        if (onnavigationeventOnExtraCallbackWithResult == null) {
            int i4 = asInterface + 7;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            onnavigationeventOnExtraCallbackWithResult = onExtraCallbackWithResult(access13800Var);
        }
        if (onnavigationeventOnExtraCallbackWithResult != onNavigationEvent && (method = onnavigationeventOnExtraCallbackWithResult.onNavigationEvent) != null) {
            int i6 = IAuthTabCallbackStub + 5;
            asInterface = i6 % 128;
            if (i6 % 2 != 0) {
                objInvoke = method.invoke(access13800Var.getClass(), null);
                int i7 = 82 / 0;
                if (objInvoke != null) {
                    Method method2 = onnavigationeventOnExtraCallbackWithResult.onWarmupCompleted;
                    if (method2 != null) {
                        int i8 = asInterface + 115;
                        IAuthTabCallbackStub = i8 % 128;
                        int i9 = i8 % 2;
                        Object objInvoke2 = method2.invoke(objInvoke, null);
                        if (objInvoke2 != null) {
                            Method method3 = onnavigationeventOnExtraCallbackWithResult.onExtraCallbackWithResult;
                            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                            if (objInvoke3 instanceof String) {
                                int i10 = asInterface + 39;
                                int i11 = i10 % 128;
                                IAuthTabCallbackStub = i11;
                                String str = (String) objInvoke3;
                                if (i10 % 2 == 0) {
                                    int i12 = 62 / 0;
                                }
                                int i13 = i11 + 125;
                                asInterface = i13 % 128;
                                if (i13 % 2 != 0) {
                                    int i14 = 26 / 0;
                                }
                                return str;
                            }
                        }
                    }
                }
            } else {
                objInvoke = method.invoke(access13800Var.getClass(), null);
                if (objInvoke != null) {
                }
            }
        }
        return null;
    }

    private final onNavigationEvent onExtraCallbackWithResult(access13800<Object> access13800Var) throws Throwable {
        int i = 2 % 2;
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("getModule", null);
            Method declaredMethod2 = access13800Var.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null);
            Class<?> clsLoadClass = access13800Var.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor");
            Object[] objArr = new Object[1];
            a(new char[]{14178, 14161, 50754, 39862, 14092, 21616, 175, 45587}, ViewConfiguration.getLongPressTimeout() >> 16, objArr);
            onNavigationEvent onnavigationevent = new onNavigationEvent(declaredMethod, declaredMethod2, clsLoadClass.getDeclaredMethod(((String) objArr[0]).intern(), null));
            IAuthTabCallback = onnavigationevent;
            int i2 = asInterface + 23;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return onnavigationevent;
            }
            throw null;
        } catch (Exception unused) {
            onNavigationEvent onnavigationevent2 = onNavigationEvent;
            IAuthTabCallback = onnavigationevent2;
            return onnavigationevent2;
        }
    }

    static void onExtraCallback() {
        onWarmupCompleted = -2935011350049974196L;
    }
}
