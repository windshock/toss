package o;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class TextContextMenuHelperApi28ExternalSyntheticLambda2<Params, Progress, Result> {
    private static final BlockingQueue<Runnable> IAuthTabCallbackStub;
    private static onExtraCallback onExtraCallback;
    private static volatile Executor onExtraCallbackWithResult;
    public static final Executor onNavigationEvent;
    private static final ThreadFactory onTransact;
    private final FutureTask<Result> asBinder;
    private final onNavigationEvent<Params, Result> asInterface;
    private volatile onExtraCallbackWithResult IAuthTabCallbackDefault = onExtraCallbackWithResult.PENDING;
    final AtomicBoolean IAuthTabCallback = new AtomicBoolean();
    final AtomicBoolean onWarmupCompleted = new AtomicBoolean();

    public enum onExtraCallbackWithResult {
        PENDING,
        RUNNING,
        FINISHED
    }

    protected abstract Result onExtraCallbackWithResult(Params... paramsArr);

    protected void onExtraCallbackWithResult(Result result) {
    }

    protected void onNavigationEvent(Result result) {
    }

    static {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: o.TextContextMenuHelperApi28ExternalSyntheticLambda2.3
            private final AtomicInteger onNavigationEvent = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "ModernAsyncTask #" + this.onNavigationEvent.getAndIncrement());
            }
        };
        onTransact = threadFactory;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        IAuthTabCallbackStub = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactory);
        onNavigationEvent = threadPoolExecutor;
        onExtraCallbackWithResult = threadPoolExecutor;
    }

    private static Handler IAuthTabCallback() {
        onExtraCallback onextracallback;
        synchronized (TextContextMenuHelperApi28ExternalSyntheticLambda2.class) {
            if (onExtraCallback == null) {
                onExtraCallback = new onExtraCallback();
            }
            onextracallback = onExtraCallback;
        }
        return onextracallback;
    }

    public TextContextMenuHelperApi28ExternalSyntheticLambda2() {
        onNavigationEvent<Params, Result> onnavigationevent = new onNavigationEvent<Params, Result>() { // from class: o.TextContextMenuHelperApi28ExternalSyntheticLambda2.4
            @Override // java.util.concurrent.Callable
            public Result call() throws Exception {
                TextContextMenuHelperApi28ExternalSyntheticLambda2.this.onWarmupCompleted.set(true);
                Result result = null;
                try {
                    Process.setThreadPriority(10);
                    result = (Result) TextContextMenuHelperApi28ExternalSyntheticLambda2.this.onExtraCallbackWithResult((Object[]) this.onExtraCallbackWithResult);
                    Binder.flushPendingCommands();
                    return result;
                } finally {
                }
            }
        };
        this.asInterface = onnavigationevent;
        this.asBinder = new FutureTask<Result>(onnavigationevent) { // from class: o.TextContextMenuHelperApi28ExternalSyntheticLambda2.5
            @Override // java.util.concurrent.FutureTask
            protected void done() {
                try {
                    TextContextMenuHelperApi28ExternalSyntheticLambda2.this.onWarmupCompleted(get());
                } catch (InterruptedException unused) {
                } catch (CancellationException unused2) {
                    TextContextMenuHelperApi28ExternalSyntheticLambda2.this.onWarmupCompleted(null);
                } catch (ExecutionException e) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
                } catch (Throwable th) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", th);
                }
            }
        };
    }

    void onWarmupCompleted(Result result) {
        if (this.onWarmupCompleted.get()) {
            return;
        }
        onExtraCallback(result);
    }

    Result onExtraCallback(Result result) {
        IAuthTabCallback().obtainMessage(1, new onWarmupCompleted(this, result)).sendToTarget();
        return result;
    }

    public final boolean onWarmupCompleted() {
        return this.IAuthTabCallback.get();
    }

    public final boolean IAuthTabCallback(boolean z) {
        this.IAuthTabCallback.set(true);
        return this.asBinder.cancel(z);
    }

    /* renamed from: o.TextContextMenuHelperApi28ExternalSyntheticLambda2$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[onExtraCallbackWithResult.values().length];
            onWarmupCompleted = iArr;
            try {
                iArr[onExtraCallbackWithResult.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onWarmupCompleted[onExtraCallbackWithResult.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final TextContextMenuHelperApi28ExternalSyntheticLambda2<Params, Progress, Result> onWarmupCompleted(Executor executor, Params... paramsArr) {
        if (this.IAuthTabCallbackDefault != onExtraCallbackWithResult.PENDING) {
            int i2 = AnonymousClass2.onWarmupCompleted[this.IAuthTabCallbackDefault.ordinal()];
            if (i2 == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (i2 == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("We should never reach this state");
        }
        this.IAuthTabCallbackDefault = onExtraCallbackWithResult.RUNNING;
        this.asInterface.onExtraCallbackWithResult = paramsArr;
        executor.execute(this.asBinder);
        return this;
    }

    void IAuthTabCallback(Result result) {
        if (onWarmupCompleted()) {
            onExtraCallbackWithResult((TextContextMenuHelperApi28ExternalSyntheticLambda2<Params, Progress, Result>) result);
        } else {
            onNavigationEvent(result);
        }
        this.IAuthTabCallbackDefault = onExtraCallbackWithResult.FINISHED;
    }

    static class onExtraCallback extends Handler {
        onExtraCallback() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) message.obj;
            int i2 = message.what;
            if (i2 == 1) {
                onwarmupcompleted.onWarmupCompleted.IAuthTabCallback((TextContextMenuHelperApi28ExternalSyntheticLambda2) onwarmupcompleted.onNavigationEvent[0]);
            } else {
                if (i2 != 2) {
                    return;
                }
                TextContextMenuHelperApi28ExternalSyntheticLambda2 textContextMenuHelperApi28ExternalSyntheticLambda2 = onwarmupcompleted.onWarmupCompleted;
                Data[] dataArr = onwarmupcompleted.onNavigationEvent;
            }
        }
    }

    static abstract class onNavigationEvent<Params, Result> implements Callable<Result> {
        Params[] onExtraCallbackWithResult;

        onNavigationEvent() {
        }
    }

    static class onWarmupCompleted<Data> {
        final Data[] onNavigationEvent;
        final TextContextMenuHelperApi28ExternalSyntheticLambda2 onWarmupCompleted;

        onWarmupCompleted(TextContextMenuHelperApi28ExternalSyntheticLambda2 textContextMenuHelperApi28ExternalSyntheticLambda2, Data... dataArr) {
            this.onWarmupCompleted = textContextMenuHelperApi28ExternalSyntheticLambda2;
            this.onNavigationEvent = dataArr;
        }
    }
}
