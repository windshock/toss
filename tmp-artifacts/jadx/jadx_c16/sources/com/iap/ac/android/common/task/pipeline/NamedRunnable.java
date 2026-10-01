package com.iap.ac.android.common.task.pipeline;

import android.text.TextUtils;
import com.iap.ac.android.common.a.a;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.task.pipeline.Pool;
import com.iap.ac.android.common.task.pipeline.StandardPipeline;
import com.iap.ac.config.lite.preset.PresetParser;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class NamedRunnable implements Runnable, Pool.Poolable {
    public static final String TAG = "AsyncTaskExecutor";
    public static final NamedRunnablePool TASK_POOL = new NamedRunnablePool(8, 16);
    public StandardPipeline.IScheduleNext mScheduleNext;
    public Runnable mTask;
    public String mThreadName;
    public int mWeight;

    public static final class NamedRunnablePool extends Pool<NamedRunnable> {
        public final AtomicInteger mIndex;

        public NamedRunnablePool(int i, int i2) {
            super(i, i2);
            this.mIndex = new AtomicInteger(1);
        }

        @Override // com.iap.ac.android.common.task.pipeline.Pool
        public void clear() {
            synchronized (this) {
                super.clear();
            }
        }

        @Override // com.iap.ac.android.common.task.pipeline.Pool
        public void freeAll(List<NamedRunnable> list) {
            synchronized (this) {
                super.freeAll(list);
            }
        }

        @Override // com.iap.ac.android.common.task.pipeline.Pool
        public void free(NamedRunnable namedRunnable) {
            synchronized (this) {
                super.free((NamedRunnablePool) namedRunnable);
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.iap.ac.android.common.task.pipeline.Pool
        @Deprecated
        public NamedRunnable newObject() {
            ACLog.w(NamedRunnable.TAG, "method is deprecated, call newObject(Runnable, String) method instead.");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.iap.ac.android.common.task.pipeline.Pool
        @Deprecated
        public NamedRunnable obtain() {
            ACLog.w(NamedRunnable.TAG, "method is deprecated, call obtain(Runnable, String) method instead.");
            return null;
        }

        public NamedRunnable newObject(Runnable runnable, String str, int i) {
            String string;
            if (TextUtils.isEmpty(str)) {
                StringBuilder sbA = a.a("NamedRunable_");
                sbA.append(this.mIndex.getAndIncrement());
                string = sbA.toString();
            } else {
                StringBuilder sbA2 = a.a("NamedRunable_");
                sbA2.append(this.mIndex.getAndIncrement());
                sbA2.append(PresetParser.UNDERLINE);
                sbA2.append(str);
                string = sbA2.toString();
            }
            return new NamedRunnable(runnable, string, i);
        }

        public NamedRunnable obtain(Runnable runnable, String str) {
            NamedRunnable namedRunnableObtain;
            synchronized (this) {
                namedRunnableObtain = obtain(runnable, str, 0);
            }
            return namedRunnableObtain;
        }

        public NamedRunnable obtain(Runnable runnable, String str, int i) {
            NamedRunnable namedRunnableNewObject;
            synchronized (this) {
                if (this.freeObjects.size() == 0) {
                    ACLog.i(NamedRunnable.TAG, "NamedRunnablePool.obtain(): create a new NamedRunnable obj.");
                    namedRunnableNewObject = newObject(runnable, str, i);
                } else {
                    ACLog.i(NamedRunnable.TAG, "NamedRunnablePool.obtain(): hit a cache NamedRunnable obj.");
                    NamedRunnable namedRunnable = (NamedRunnable) this.freeObjects.pop();
                    namedRunnable.setTask(runnable);
                    namedRunnable.setThreadName(str);
                    namedRunnable.setWeight(i);
                    namedRunnableNewObject = namedRunnable;
                }
            }
            return namedRunnableNewObject;
        }
    }

    public NamedRunnable(Runnable runnable, String str, int i) {
        this.mTask = runnable;
        this.mThreadName = str;
        this.mWeight = i;
    }

    @Override // com.iap.ac.android.common.task.pipeline.Pool.Poolable
    public void reset() {
        this.mTask = null;
        this.mThreadName = null;
        this.mScheduleNext = null;
        this.mWeight = 0;
    }

    @Override // java.lang.Runnable
    public void run() {
        String name;
        if (TextUtils.isEmpty(this.mThreadName)) {
            name = null;
        } else {
            name = Thread.currentThread().getName();
            StringBuilder sbA = a.a("NamedRunable.run(set ThreadName to:");
            sbA.append(this.mThreadName);
            sbA.append(")");
            ACLog.i(TAG, sbA.toString());
            Thread.currentThread().setName(name + PresetParser.UNDERLINE + this.mThreadName);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ACLog.v(TAG, "start at " + jCurrentTimeMillis);
        try {
            this.mTask.run();
        } finally {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            StringBuilder sbA2 = a.a("cost ");
            sbA2.append(jCurrentTimeMillis2 - jCurrentTimeMillis);
            sbA2.append(" ms");
            ACLog.i(TAG, sbA2.toString());
            if (!TextUtils.isEmpty(this.mThreadName)) {
                ACLog.i(TAG, "NamedRunable.run(set ThreadName back to:" + name + ")");
                if (name != null) {
                    Thread.currentThread().setName(name);
                }
            }
            if (this.mScheduleNext != null) {
                ACLog.v(TAG, "NamedRunnable.run()->finish(finally:mScheduleNext.scheduleNext())");
                this.mScheduleNext.scheduleNext();
            } else {
                ACLog.v(TAG, "NamedRunnable.run()->finish(finally:null == mScheduleNext)");
            }
            NamedRunnablePool namedRunnablePool = TASK_POOL;
            namedRunnablePool.free(this);
            ACLog.d(TAG, "NamedRunnable.run()->finish(TASK_POOL.free(this)): pool.size=" + namedRunnablePool.freeObjects.size());
        }
    }

    public NamedRunnable setScheduleNext(StandardPipeline.IScheduleNext iScheduleNext) {
        this.mScheduleNext = iScheduleNext;
        return this;
    }

    public void setTask(Runnable runnable) {
        this.mTask = runnable;
    }

    public void setThreadName(String str) {
        this.mThreadName = str;
    }

    public void setWeight(int i) {
        this.mWeight = i;
    }
}
