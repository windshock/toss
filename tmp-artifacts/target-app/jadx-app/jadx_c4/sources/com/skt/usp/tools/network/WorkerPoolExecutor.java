package com.skt.usp.tools.network;

import com.skt.usp.utils.UCPLog;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import o.onUnminimized;

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
        UCPLog.info(">> SB_NetworkManager::getInstance");
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
        UCPLog.info(">> release()");
        synchronized (WorkerPoolExecutor.class) {
            if (d != null) {
                d = null;
            }
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void beforeExecute(Thread thread, Runnable runnable) {
        UCPLog.info(">> beforeExecute()");
        UCPLog.debug("++ t : [%s]", thread);
        UCPLog.debug("++ r : [%s]", runnable);
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
        UCPLog.info(">> execute()");
        UCPLog.debug("++ command : [%s]", runnable);
        this.h = true;
        super.execute(runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        UCPLog.info(">> afterExecute()");
        UCPLog.debug("++ r : [%s]", runnable);
        UCPLog.debug("++ t : [%s]", th);
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
        UCPLog.info(">> cancelAll()");
        pause();
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) getQueue();
        Iterator it = linkedBlockingQueue.iterator();
        while (it.hasNext()) {
            linkedBlockingQueue.remove((Runnable) it.next());
        }
        resume();
    }

    public boolean isWorking() {
        UCPLog.debug(">> isWorking()");
        return this.h;
    }
}
