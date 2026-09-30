package io.realm.log;

import android.util.Log;
import java.util.Locale;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RealmLog {
    private static String onNavigationEvent = "REALM_JAVA";

    private static native void nativeAddLogger(RealmLogger realmLogger);

    private static native void nativeClearLoggers();

    static native void nativeCloseCoreLoggerBridge(long j);

    static native long nativeCreateCoreLoggerBridge(String str);

    private static native int nativeGetLogLevel();

    private static native void nativeLog(int i, String str, @Nullable Throwable th, @Nullable String str2);

    static native void nativeLogToCoreLoggerBridge(long j, int i, String str);

    private static native void nativeRegisterDefaultLogger();

    private static native void nativeRemoveLogger(RealmLogger realmLogger);

    private static native void nativeSetLogLevel(int i);

    public static int onWarmupCompleted() {
        return nativeGetLogLevel();
    }

    public static void onExtraCallbackWithResult(String str, Object... objArr) {
        onWarmupCompleted(null, str, objArr);
    }

    public static void onWarmupCompleted(@Nullable Throwable th, @Nullable String str, Object... objArr) {
        IAuthTabCallback(5, th, str, objArr);
    }

    public static void onWarmupCompleted(String str, Object... objArr) {
        onExtraCallbackWithResult(null, str, objArr);
    }

    public static void onExtraCallbackWithResult(@Nullable Throwable th, @Nullable String str, Object... objArr) {
        IAuthTabCallback(6, th, str, objArr);
    }

    public static void IAuthTabCallback(String str, Object... objArr) {
        IAuthTabCallback(null, str, objArr);
    }

    public static void IAuthTabCallback(@Nullable Throwable th, @Nullable String str, Object... objArr) {
        IAuthTabCallback(7, th, str, objArr);
    }

    private static void IAuthTabCallback(int i, @Nullable Throwable th, @Nullable String str, @Nullable Object... objArr) {
        if (i < onWarmupCompleted()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (str != null && objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        if (th != null) {
            sb.append(Log.getStackTraceString(th));
        }
        if (str != null) {
            if (th != null) {
                sb.append("\n");
            }
            sb.append(str);
        }
        nativeLog(i, onNavigationEvent, th, sb.toString());
    }
}
