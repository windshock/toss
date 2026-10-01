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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getFaceFeature {
    public static final getFaceFeature IAuthTabCallback = new getFaceFeature();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        int i = onNavigationEvent + 71;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private getFaceFeature() {
    }

    private final List<ActivityManager.RunningAppProcessInfo> onWarmupCompleted(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                int i3 = onExtraCallback + 97;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                try {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        return runningAppProcesses;
                    }
                } catch (Throwable unused) {
                    return CollectionsKt.emptyList();
                }
            }
            return CollectionsKt.emptyList();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final ActivityManager.RunningAppProcessInfo onExtraCallback(Context context) {
        Object next;
        int i = 2 % 2;
        Iterator<T> it = onWarmupCompleted(context).iterator();
        do {
            next = null;
            if (!it.hasNext()) {
                break;
            }
            int i2 = onExtraCallback + 93;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = ((ActivityManager.RunningAppProcessInfo) it.next()).pid;
                Process.myPid();
                throw null;
            }
            next = it.next();
        } while (((ActivityManager.RunningAppProcessInfo) next).pid != Process.myPid());
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
        int i4 = onWarmupCompleted + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return runningAppProcessInfo;
    }

    public final String IAuthTabCallback(@NotNull Context context) {
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (Build.VERSION.SDK_INT >= 28) {
            int i2 = onExtraCallback + 115;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return Application.getProcessName();
        }
        Object obj2 = null;
        try {
            Result.Companion companion = kotlin.Result.Companion;
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null);
            declaredMethod.setAccessible(true);
            obj = kotlin.Result.constructor-impl(declaredMethod.invoke(null, null));
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (kotlin.Result.onNavigationEvent(obj)) {
            int i4 = onExtraCallback + 3;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                boolean z = obj instanceof String;
                obj2.hashCode();
                throw null;
            }
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfoOnExtraCallback = onExtraCallback(context);
        if (runningAppProcessInfoOnExtraCallback != null) {
            return runningAppProcessInfoOnExtraCallback.processName;
        }
        return null;
    }
}
