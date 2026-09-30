package o;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class isNestedScrollingEnabled {
    private static isNestedScrollingEnabled onExtraCallback;
    private static final addFocusables onExtraCallbackWithResult = addFocusables.onExtraCallback(isNestedScrollingEnabled.class.getSimpleName());
    private static final ConcurrentHashMap<String, WeakReference<isNestedScrollingEnabled>> onWarmupCompleted = new ConcurrentHashMap<>(4);
    private Executor IAuthTabCallback;
    private HandlerThread IAuthTabCallbackStub;
    private Handler onNavigationEvent;
    private String onTransact;

    public static isNestedScrollingEnabled onExtraCallbackWithResult(@NonNull String str) {
        ConcurrentHashMap<String, WeakReference<isNestedScrollingEnabled>> concurrentHashMap = onWarmupCompleted;
        if (concurrentHashMap.containsKey(str)) {
            isNestedScrollingEnabled isnestedscrollingenabled = concurrentHashMap.get(str).get();
            if (isnestedscrollingenabled != null) {
                if (isnestedscrollingenabled.IAuthTabCallback().isAlive() && !isnestedscrollingenabled.IAuthTabCallback().isInterrupted()) {
                    onExtraCallbackWithResult.onWarmupCompleted(new Object[]{"get:", "Reusing cached worker handler.", str});
                    return isnestedscrollingenabled;
                }
                isnestedscrollingenabled.onExtraCallbackWithResult();
                onExtraCallbackWithResult.onWarmupCompleted(new Object[]{"get:", "Thread reference found, but not alive or interrupted.", "Removing.", str});
                concurrentHashMap.remove(str);
            } else {
                onExtraCallbackWithResult.onWarmupCompleted(new Object[]{"get:", "Thread reference died. Removing.", str});
                concurrentHashMap.remove(str);
            }
        }
        onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"get:", "Creating new handler.", str});
        isNestedScrollingEnabled isnestedscrollingenabled2 = new isNestedScrollingEnabled(str);
        concurrentHashMap.put(str, new WeakReference<>(isnestedscrollingenabled2));
        return isnestedscrollingenabled2;
    }

    public static isNestedScrollingEnabled onExtraCallback() {
        isNestedScrollingEnabled isnestedscrollingenabledOnExtraCallbackWithResult = onExtraCallbackWithResult("FallbackCameraThread");
        onExtraCallback = isnestedscrollingenabledOnExtraCallbackWithResult;
        return isnestedscrollingenabledOnExtraCallbackWithResult;
    }

    public static void onWarmupCompleted(@NonNull Runnable runnable) {
        onExtraCallback().onExtraCallback(runnable);
    }

    private isNestedScrollingEnabled(@NonNull String str) throws InterruptedException {
        this.onTransact = str;
        HandlerThread handlerThread = new HandlerThread(str) { // from class: o.isNestedScrollingEnabled.2
            @Override // java.lang.Thread
            public String toString() {
                return super.toString() + "[" + getThreadId() + "]";
            }
        };
        this.IAuthTabCallbackStub = handlerThread;
        handlerThread.setDaemon(true);
        this.IAuthTabCallbackStub.start();
        this.onNavigationEvent = new Handler(this.IAuthTabCallbackStub.getLooper());
        this.IAuthTabCallback = new Executor() { // from class: o.isNestedScrollingEnabled.5
            @Override // java.util.concurrent.Executor
            public void execute(@NonNull Runnable runnable) {
                isNestedScrollingEnabled.this.IAuthTabCallback(runnable);
            }
        };
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        onExtraCallback(new Runnable() { // from class: o.isNestedScrollingEnabled.1
            @Override // java.lang.Runnable
            public void run() {
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
    }

    public void IAuthTabCallback(@NonNull Runnable runnable) {
        if (Thread.currentThread() == IAuthTabCallback()) {
            runnable.run();
        } else {
            onExtraCallback(runnable);
        }
    }

    public void onExtraCallback(@NonNull Runnable runnable) {
        this.onNavigationEvent.post(runnable);
    }

    public void onExtraCallbackWithResult(long j, @NonNull Runnable runnable) {
        this.onNavigationEvent.postDelayed(runnable, j);
    }

    public Handler onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public HandlerThread IAuthTabCallback() {
        return this.IAuthTabCallbackStub;
    }

    public Executor onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    public void onExtraCallbackWithResult() {
        HandlerThread handlerThreadIAuthTabCallback = IAuthTabCallback();
        if (handlerThreadIAuthTabCallback.isAlive()) {
            handlerThreadIAuthTabCallback.interrupt();
            handlerThreadIAuthTabCallback.quit();
        }
        onWarmupCompleted.remove(this.onTransact);
    }
}
