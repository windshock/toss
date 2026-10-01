package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TaskRunner implements Lockable {
    public static final Companion Companion = new Companion(null);
    public static final TaskRunner INSTANCE;
    private static final Logger logger;
    private final Backend backend;
    private final List<TaskQueue> busyQueues;
    private boolean coordinatorWaiting;
    private long coordinatorWakeUpAt;
    private int executeCallCount;
    private final Logger logger$1;
    private int nextQueueName;
    private final List<TaskQueue> readyQueues;
    private int runCallCount;
    private final Runnable runnable;

    public interface Backend {
        void coordinatorNotify(@NotNull TaskRunner taskRunner);

        void coordinatorWait(@NotNull TaskRunner taskRunner, long j);

        <T> BlockingQueue<T> decorate(@NotNull BlockingQueue<T> blockingQueue);

        void execute(@NotNull TaskRunner taskRunner, @NotNull Runnable runnable);

        long nanoTime();
    }

    public TaskRunner(@NotNull Backend backend, @NotNull Logger logger2) {
        Intrinsics.checkNotNullParameter(backend, "");
        Intrinsics.checkNotNullParameter(logger2, "");
        this.backend = backend;
        this.logger$1 = logger2;
        this.nextQueueName = 10000;
        this.busyQueues = new ArrayList();
        this.readyQueues = new ArrayList();
        this.runnable = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            @Override // java.lang.Runnable
            public void run() {
                Task taskAwaitTaskToRun;
                long jNanoTime;
                TaskRunner taskRunner = this.this$0;
                synchronized (taskRunner) {
                    taskRunner.runCallCount++;
                    taskAwaitTaskToRun = taskRunner.awaitTaskToRun();
                }
                if (taskAwaitTaskToRun == null) {
                    return;
                }
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                Task taskAwaitTaskToRun2 = taskAwaitTaskToRun;
                do {
                    try {
                        threadCurrentThread.setName(taskAwaitTaskToRun2.getName());
                        Logger logger$okhttp = this.this$0.getLogger$okhttp();
                        TaskQueue queue$okhttp = taskAwaitTaskToRun2.getQueue$okhttp();
                        Intrinsics.checkNotNull(queue$okhttp);
                        boolean zIsLoggable = logger$okhttp.isLoggable(Level.FINE);
                        if (zIsLoggable) {
                            jNanoTime = queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime();
                            TaskLoggerKt.log(logger$okhttp, taskAwaitTaskToRun2, queue$okhttp, "starting");
                        } else {
                            jNanoTime = -1;
                        }
                        try {
                            long jRunOnce = taskAwaitTaskToRun2.runOnce();
                            if (zIsLoggable) {
                                TaskLoggerKt.log(logger$okhttp, taskAwaitTaskToRun2, queue$okhttp, "finished run in " + TaskLoggerKt.formatDuration(queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
                            }
                            TaskRunner taskRunner2 = this.this$0;
                            synchronized (taskRunner2) {
                                taskRunner2.afterRun(taskAwaitTaskToRun2, jRunOnce, true);
                                taskAwaitTaskToRun2 = taskRunner2.awaitTaskToRun();
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            TaskRunner taskRunner3 = this.this$0;
                            synchronized (taskRunner3) {
                                taskRunner3.afterRun(taskAwaitTaskToRun2, -1L, false);
                                Unit unit = Unit.INSTANCE;
                                if (th instanceof InterruptedException) {
                                    Thread.currentThread().interrupt();
                                    return;
                                }
                                throw th;
                            }
                        } finally {
                            threadCurrentThread.setName(name);
                        }
                    }
                } while (taskAwaitTaskToRun2 != null);
            }
        };
    }

    public final Backend getBackend() {
        return this.backend;
    }

    public /* synthetic */ TaskRunner(Backend backend, Logger logger2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(backend, (i & 2) != 0 ? logger : logger2);
    }

    public final Logger getLogger$okhttp() {
        return this.logger$1;
    }

    public static final class RealBackend implements Backend {
        private final ThreadPoolExecutor executor;

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public <T> BlockingQueue<T> decorate(@NotNull BlockingQueue<T> blockingQueue) {
            Intrinsics.checkNotNullParameter(blockingQueue, "");
            return blockingQueue;
        }

        public RealBackend(@NotNull ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "");
            this.executor = new ThreadPoolExecutor(0, IntCompanionObject.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        public final ThreadPoolExecutor getExecutor() {
            return this.executor;
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public long nanoTime() {
            return System.nanoTime();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void execute(@NotNull TaskRunner taskRunner, @NotNull Runnable runnable) {
            Intrinsics.checkNotNullParameter(taskRunner, "");
            Intrinsics.checkNotNullParameter(runnable, "");
            this.executor.execute(runnable);
        }

        public final void shutdown() {
            this.executor.shutdown();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorNotify(@NotNull TaskRunner taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "");
            taskRunner.notify();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorWait(@NotNull TaskRunner taskRunner, long j) throws InterruptedException {
            Intrinsics.checkNotNullParameter(taskRunner, "");
            if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(taskRunner)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + taskRunner);
            }
            if (j > 0) {
                long j2 = j / 1000000;
                if (j2 > 0 || j > 0) {
                    taskRunner.wait(j2, (int) (j - (1000000 * j2)));
                }
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Logger getLogger() {
            return TaskRunner.logger;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Logger logger2 = Logger.getLogger(TaskRunner.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger2, "");
        logger = logger2;
        INSTANCE = new TaskRunner(new RealBackend(_UtilJvmKt.threadFactory(_UtilJvmKt.okHttpName + " TaskRunner", true)), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    }

    public final void kickCoordinator$okhttp(@NotNull TaskQueue taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "");
        if (!_UtilJvmKt.assertionsEnabled || Thread.holdsLock(this)) {
            if (taskQueue.getActiveTask$okhttp() == null) {
                if (!taskQueue.getFutureTasks$okhttp().isEmpty()) {
                    _UtilCommonKt.addIfAbsent(this.readyQueues, taskQueue);
                } else {
                    this.readyQueues.remove(taskQueue);
                }
            }
            if (this.coordinatorWaiting) {
                this.backend.coordinatorNotify(this);
                return;
            } else {
                startAnotherThread();
                return;
            }
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    private final void beforeRun(Task task) {
        if (!_UtilJvmKt.assertionsEnabled || Thread.holdsLock(this)) {
            task.setNextExecuteNanoTime$okhttp(-1L);
            TaskQueue queue$okhttp = task.getQueue$okhttp();
            Intrinsics.checkNotNull(queue$okhttp);
            queue$okhttp.getFutureTasks$okhttp().remove(task);
            this.readyQueues.remove(queue$okhttp);
            queue$okhttp.setActiveTask$okhttp(task);
            this.busyQueues.add(queue$okhttp);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void afterRun(Task task, long j, boolean z) {
        if (!_UtilJvmKt.assertionsEnabled || Thread.holdsLock(this)) {
            TaskQueue queue$okhttp = task.getQueue$okhttp();
            Intrinsics.checkNotNull(queue$okhttp);
            if (queue$okhttp.getActiveTask$okhttp() != task) {
                throw new IllegalStateException("Check failed.");
            }
            boolean cancelActiveTask$okhttp = queue$okhttp.getCancelActiveTask$okhttp();
            queue$okhttp.setCancelActiveTask$okhttp(false);
            queue$okhttp.setActiveTask$okhttp(null);
            this.busyQueues.remove(queue$okhttp);
            if (j != -1 && !cancelActiveTask$okhttp && !queue$okhttp.getShutdown$okhttp()) {
                queue$okhttp.scheduleAndDecide$okhttp(task, j, true);
            }
            if (queue$okhttp.getFutureTasks$okhttp().isEmpty()) {
                return;
            }
            this.readyQueues.add(queue$okhttp);
            if (z) {
                return;
            }
            startAnotherThread();
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    public final Task awaitTaskToRun() {
        boolean z;
        if (!_UtilJvmKt.assertionsEnabled || Thread.holdsLock(this)) {
            while (!this.readyQueues.isEmpty()) {
                long jNanoTime = this.backend.nanoTime();
                Iterator<TaskQueue> it = this.readyQueues.iterator();
                long jMin = LongCompanionObject.MAX_VALUE;
                Task task = null;
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    Task task2 = it.next().getFutureTasks$okhttp().get(0);
                    long jMax = Math.max(0L, task2.getNextExecuteNanoTime$okhttp() - jNanoTime);
                    if (jMax > 0) {
                        jMin = Math.min(jMax, jMin);
                    } else {
                        if (task != null) {
                            z = true;
                            break;
                        }
                        task = task2;
                    }
                }
                if (task != null) {
                    beforeRun(task);
                    if (z || (!this.coordinatorWaiting && !this.readyQueues.isEmpty())) {
                        startAnotherThread();
                    }
                    return task;
                }
                if (this.coordinatorWaiting) {
                    if (jMin < this.coordinatorWakeUpAt - jNanoTime) {
                        this.backend.coordinatorNotify(this);
                    }
                    return null;
                }
                this.coordinatorWaiting = true;
                this.coordinatorWakeUpAt = jNanoTime + jMin;
                try {
                    try {
                        this.backend.coordinatorWait(this, jMin);
                    } catch (InterruptedException unused) {
                        cancelAll();
                    }
                } finally {
                    this.coordinatorWaiting = false;
                }
            }
            return null;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    private final void startAnotherThread() {
        if (!_UtilJvmKt.assertionsEnabled || Thread.holdsLock(this)) {
            int i = this.executeCallCount;
            if (i > this.runCallCount) {
                return;
            }
            this.executeCallCount = i + 1;
            this.backend.execute(this, this.runnable);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    public final TaskQueue newQueue() {
        int i;
        synchronized (this) {
            i = this.nextQueueName;
            this.nextQueueName = i + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i);
        return new TaskQueue(this, sb.toString());
    }

    public final List<TaskQueue> activeQueues() {
        List<TaskQueue> listPlus;
        synchronized (this) {
            listPlus = CollectionsKt___CollectionsKt.plus((Collection) this.busyQueues, (Iterable) this.readyQueues);
        }
        return listPlus;
    }

    public final void cancelAll() {
        if (!_UtilJvmKt.assertionsEnabled || Thread.holdsLock(this)) {
            for (int size = this.busyQueues.size() - 1; size >= 0; size--) {
                this.busyQueues.get(size).cancelAllAndDecide$okhttp();
            }
            for (int size2 = this.readyQueues.size() - 1; size2 >= 0; size2--) {
                TaskQueue taskQueue = this.readyQueues.get(size2);
                taskQueue.cancelAllAndDecide$okhttp();
                if (taskQueue.getFutureTasks$okhttp().isEmpty()) {
                    this.readyQueues.remove(size2);
                }
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }
}
