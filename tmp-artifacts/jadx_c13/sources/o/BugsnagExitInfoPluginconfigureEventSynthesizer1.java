package o;

import io.invertase.googlemobileads.common.ReactNativeJSON;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class BugsnagExitInfoPluginconfigureEventSynthesizer1 {
    private static final Map<String, ExecutorService> onExtraCallbackWithResult = new HashMap();
    private final int IAuthTabCallback;
    private final RejectedExecutionHandler onExtraCallback = new RejectedExecutionHandler() { // from class: io.invertase.googlemobileads.common.TaskExecutorService$$ExternalSyntheticLambda0
        @Override // java.util.concurrent.RejectedExecutionHandler
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            this.f$0.IAuthTabCallback(runnable, threadPoolExecutor);
        }
    };
    private final int onNavigationEvent;
    private final String onWarmupCompleted;

    public BugsnagExitInfoPluginconfigureEventSynthesizer1(String str) {
        this.onWarmupCompleted = str;
        ReactNativeJSON reactNativeJSONOnWarmupCompleted = ReactNativeJSON.onWarmupCompleted();
        this.onNavigationEvent = reactNativeJSONOnWarmupCompleted.IAuthTabCallback("android_task_executor_maximum_pool_size", 1);
        this.IAuthTabCallback = reactNativeJSONOnWarmupCompleted.IAuthTabCallback("android_task_executor_keep_alive_seconds", 3);
    }

    public ExecutorService onExtraCallback() {
        return onExtraCallbackWithResult(this.onNavigationEvent <= 1, _UrlKt.FRAGMENT_ENCODE_SET);
    }

    public ExecutorService onWarmupCompleted() {
        return onExtraCallbackWithResult(true, _UrlKt.FRAGMENT_ENCODE_SET);
    }

    public ExecutorService onNavigationEvent(String str) {
        if (this.onNavigationEvent == 0) {
            str = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        return onExtraCallbackWithResult(true, str);
    }

    public ExecutorService onExtraCallbackWithResult(boolean z, String str) {
        String strOnWarmupCompleted = onWarmupCompleted(z, str);
        Map<String, ExecutorService> map = onExtraCallbackWithResult;
        synchronized (map) {
            ExecutorService executorService = map.get(strOnWarmupCompleted);
            if (executorService != null) {
                return executorService;
            }
            ExecutorService executorServiceOnWarmupCompleted = onWarmupCompleted(z);
            map.put(strOnWarmupCompleted, executorServiceOnWarmupCompleted);
            return executorServiceOnWarmupCompleted;
        }
    }

    private ExecutorService onWarmupCompleted(boolean z) {
        if (z) {
            return Executors.newSingleThreadExecutor();
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, this.onNavigationEvent, this.IAuthTabCallback, TimeUnit.SECONDS, new SynchronousQueue());
        threadPoolExecutor.setRejectedExecutionHandler(this.onExtraCallback);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void IAuthTabCallback(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (threadPoolExecutor.isShutdown() || threadPoolExecutor.isTerminated() || threadPoolExecutor.isTerminating()) {
            return;
        }
        onWarmupCompleted().execute(runnable);
    }

    public String onWarmupCompleted(boolean z, String str) {
        if (z) {
            return this.onWarmupCompleted + "TransactionalExecutor" + str;
        }
        return this.onWarmupCompleted + "Executor" + str;
    }

    public void IAuthTabCallback() {
        Map<String, ExecutorService> map = onExtraCallbackWithResult;
        synchronized (map) {
            for (String str : new ArrayList(map.keySet())) {
                if (!str.startsWith(this.onWarmupCompleted)) {
                    onExtraCallbackWithResult.remove(str);
                } else {
                    onExtraCallbackWithResult(str);
                }
            }
        }
    }

    public void onExtraCallbackWithResult(String str) {
        Map<String, ExecutorService> map = onExtraCallbackWithResult;
        synchronized (map) {
            ExecutorService executorService = map.get(str);
            if (executorService != null) {
                executorService.shutdownNow();
                map.remove(str);
            }
        }
    }
}
