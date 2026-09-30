package o;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import o.CredentialProviderBeginSignInController;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getExecutorannotations {
    public static final getExecutorannotations onExtraCallback = new getExecutorannotations();
    private static final int onExtraCallbackWithResult = Process.myUid();
    private static final ScheduledExecutorService onWarmupCompleted = Executors.newSingleThreadScheduledExecutor();
    private static String onNavigationEvent = "";
    private static final Runnable IAuthTabCallback = onWarmupCompleted.onNavigationEvent;

    private getExecutorannotations() {
    }

    static final class onWarmupCompleted implements Runnable {
        public static final onWarmupCompleted onNavigationEvent = new onWarmupCompleted();

        onWarmupCompleted() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (convertResponseToCredentialManager.onExtraCallback(this)) {
                return;
            }
            try {
                Object systemService = performIntercept.onExtraCallbackWithResult().getSystemService("activity");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
                }
                getExecutorannotations.onWarmupCompleted((ActivityManager) systemService);
            } catch (Exception unused) {
            } catch (Throwable th) {
                convertResponseToCredentialManager.onExtraCallbackWithResult(th, this);
            }
        }
    }

    @JvmStatic
    public static final void onWarmupCompleted(@Nullable ActivityManager activityManager) {
        if (convertResponseToCredentialManager.onExtraCallback(getExecutorannotations.class) || activityManager == null) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == onExtraCallbackWithResult) {
                        Looper mainLooper = Looper.getMainLooper();
                        Intrinsics.checkNotNullExpressionValue(mainLooper, "");
                        Thread thread = mainLooper.getThread();
                        Intrinsics.checkNotNullExpressionValue(thread, "");
                        String strIAuthTabCallback = accessmaybeReportErrorFromResultReceiver.IAuthTabCallback(thread);
                        if (!Intrinsics.areEqual(strIAuthTabCallback, onNavigationEvent) && accessmaybeReportErrorFromResultReceiver.onExtraCallback(thread)) {
                            onNavigationEvent = strIAuthTabCallback;
                            CredentialProviderBeginSignInController.onExtraCallback.onNavigationEvent(processErrorStateInfo.shortMsg, strIAuthTabCallback).IAuthTabCallback();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, getExecutorannotations.class);
        }
    }

    @JvmStatic
    public static final void onExtraCallbackWithResult() {
        if (convertResponseToCredentialManager.onExtraCallback(getExecutorannotations.class)) {
            return;
        }
        try {
            onWarmupCompleted.scheduleAtFixedRate(IAuthTabCallback, 0L, 500L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, getExecutorannotations.class);
        }
    }
}
