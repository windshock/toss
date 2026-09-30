package com.skp.smarttouch.sem.tools.network;

import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import o.onUnminimized;
import o.xkzzb;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class WorkerPoolExecutor extends ThreadPoolExecutor implements AutoCloseable {
    private static final int a = 1;
    private static final int b = 1;
    private static final long c = 60;
    private static WorkerPoolExecutor d;
    private ReentrantLock e;
    private Condition f;
    private boolean g;
    private boolean h;

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        onUnminimized.onExtraCallback(this);
    }

    private WorkerPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, LinkedBlockingQueue<Runnable> linkedBlockingQueue) {
        super(i, i2, j, timeUnit, linkedBlockingQueue);
        this.e = null;
        this.f = null;
        this.h = false;
        this.g = false;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.e = reentrantLock;
        this.f = reentrantLock.newCondition();
    }

    public static WorkerPoolExecutor getInstance() {
        xkzzb.onExtraCallback(new Object[]{">> SB_NetworkManager::getInstance"});
        if (d == null) {
            synchronized (WorkerPoolExecutor.class) {
                if (d == null) {
                    d = new WorkerPoolExecutor(1, 1, c, TimeUnit.SECONDS, new LinkedBlockingQueue());
                }
            }
        }
        return d;
    }

    public static void release() {
        xkzzb.onExtraCallback(new Object[]{">> release()"});
        synchronized (WorkerPoolExecutor.class) {
            if (d != null) {
                d = null;
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void beforeExecute(Thread thread, Runnable runnable) {
        xkzzb.onExtraCallback(new Object[]{">> beforeExecute()"});
        xkzzb.onExtraCallback(new Object[]{"++ t : [%s]", thread});
        xkzzb.onExtraCallback(new Object[]{"++ r : [%s]", runnable});
        this.e.lock();
        while (this.g) {
            try {
                try {
                    this.f.await();
                } catch (InterruptedException unused) {
                    thread.interrupt();
                }
            } catch (Throwable th) {
                this.e.unlock();
                throw th;
            }
        }
        this.e.unlock();
        super.beforeExecute(thread, runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        xkzzb.onExtraCallback(new Object[]{">> execute()"});
        xkzzb.onExtraCallback(new Object[]{"++ command : [%s]", runnable});
        this.h = true;
        super.execute(runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        xkzzb.onExtraCallback(new Object[]{">> afterExecute()"});
        xkzzb.onExtraCallback(new Object[]{"++ r : [%s]", runnable});
        xkzzb.onExtraCallback(new Object[]{"++ t : [%s]", th});
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) getQueue();
        if (linkedBlockingQueue == null || linkedBlockingQueue.size() <= 0) {
            this.h = false;
        }
        super.afterExecute(runnable, th);
    }

    public void pause() {
        this.e.lock();
        try {
            this.g = true;
        } finally {
            this.e.unlock();
        }
    }

    public void resume() {
        this.e.lock();
        try {
            this.g = false;
            this.f.signalAll();
        } finally {
            this.e.unlock();
        }
    }

    public void cancelAll() {
        xkzzb.onExtraCallback(new Object[]{">> cancelAll()"});
        pause();
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) getQueue();
        Iterator it = linkedBlockingQueue.iterator();
        while (it.hasNext()) {
            linkedBlockingQueue.remove((Runnable) it.next());
        }
        resume();
    }

    public boolean isWorking() {
        xkzzb.onExtraCallback(new Object[]{">> isWorking()"});
        return this.h;
    }
}
