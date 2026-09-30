package o;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setRgbInputImage {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    public static final setRgbInputImage onExtraCallbackWithResult = new setRgbInputImage();
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = onNavigationEvent + 59;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            int i2 = 35 / 0;
        }
    }

    private setRgbInputImage() {
    }

    @JvmStatic
    public static final List<ActivityManager.RunningAppProcessInfo> onWarmupCompleted(@NotNull Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
            try {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    int i3 = onWarmupCompleted;
                    int i4 = i3 + 69;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = i3 + 89;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        return runningAppProcesses;
                    }
                    throw null;
                }
            } catch (Throwable unused) {
                return CollectionsKt.emptyList();
            }
        }
        return CollectionsKt.emptyList();
    }

    @JvmStatic
    public static final ActivityManager.RunningAppProcessInfo onNavigationEvent(@NotNull Context context) {
        Object next;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Iterator<T> it = onWarmupCompleted(context).iterator();
        int i2 = onWarmupCompleted + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i4 = onWarmupCompleted + 39;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                next = it.next();
                int i5 = 4 / 0;
                if (((ActivityManager.RunningAppProcessInfo) next).pid == Process.myPid()) {
                    break;
                }
            } else {
                next = it.next();
                if (((ActivityManager.RunningAppProcessInfo) next).pid == Process.myPid()) {
                    break;
                }
            }
        }
        return (ActivityManager.RunningAppProcessInfo) next;
    }

    @JvmStatic
    public static final String onExtraCallback(@NotNull Context context) {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Object obj2 = null;
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            int i2 = IAuthTabCallback + 37;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                return processName;
            }
            obj2.hashCode();
            throw null;
        }
        try {
            Result.Companion companion = kotlin.Result.Companion;
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            obj = kotlin.Result.constructor-impl(declaredMethod.invoke(null, null));
            int i3 = IAuthTabCallback + 107;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (kotlin.Result.onNavigationEvent(obj) && !(true ^ (obj instanceof String))) {
            int i5 = IAuthTabCallback + 91;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return (String) obj;
            }
            int i6 = 23 / 0;
            return (String) obj;
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfoOnNavigationEvent = onNavigationEvent(context);
        if (runningAppProcessInfoOnNavigationEvent == null) {
            return null;
        }
        int i7 = IAuthTabCallback + 11;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return runningAppProcessInfoOnNavigationEvent.processName;
    }
}
