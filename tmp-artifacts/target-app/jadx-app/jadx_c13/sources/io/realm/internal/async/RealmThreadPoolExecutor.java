package io.realm.internal.async;

import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import o.onUnminimized;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class RealmThreadPoolExecutor extends ThreadPoolExecutor implements AutoCloseable {
    private static final int onExtraCallback = onExtraCallback();
    private ReentrantLock IAuthTabCallback;
    private boolean onExtraCallbackWithResult;
    private Condition onWarmupCompleted;

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        onUnminimized.onExtraCallback(this);
    }

    public static RealmThreadPoolExecutor IAuthTabCallback() {
        int i = onExtraCallback;
        return new RealmThreadPoolExecutor(i, i);
    }

    public static RealmThreadPoolExecutor onNavigationEvent() {
        return new RealmThreadPoolExecutor(1, 1);
    }

    private static int onExtraCallback() {
        int iIAuthTabCallback = IAuthTabCallback("/sys/devices/system/cpu/", "cpu[0-9]+");
        if (iIAuthTabCallback <= 0) {
            iIAuthTabCallback = Runtime.getRuntime().availableProcessors();
        }
        if (iIAuthTabCallback <= 0) {
            return 1;
        }
        return (iIAuthTabCallback << 1) + 1;
    }

    private static int IAuthTabCallback(String str, String str2) {
        final Pattern patternCompile = Pattern.compile(str2);
        try {
            File[] fileArrListFiles = new File(str).listFiles(new FileFilter() { // from class: io.realm.internal.async.RealmThreadPoolExecutor.1
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    return patternCompile.matcher(file.getName()).matches();
                }
            });
            if (fileArrListFiles == null) {
                return 0;
            }
            return fileArrListFiles.length;
        } catch (SecurityException unused) {
            return 0;
        }
    }

    private RealmThreadPoolExecutor(int i, int i2) {
        super(i, i2, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100));
        ReentrantLock reentrantLock = new ReentrantLock();
        this.IAuthTabCallback = reentrantLock;
        this.onWarmupCompleted = reentrantLock.newCondition();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        this.IAuthTabCallback.lock();
        while (this.onExtraCallbackWithResult) {
            try {
                try {
                    this.onWarmupCompleted.await();
                } catch (InterruptedException unused) {
                    thread.interrupt();
                }
            } finally {
                this.IAuthTabCallback.unlock();
            }
        }
    }
}
