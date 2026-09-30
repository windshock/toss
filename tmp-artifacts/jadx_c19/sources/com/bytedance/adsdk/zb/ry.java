package com.bytedance.adsdk.zb;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ry<T> {
    public static Executor ycx = Executors.newCachedThreadPool();
    private final Handler dj;
    private volatile ok<T> lud;
    private final Set<ea<Throwable>> sya;
    private final Set<ea<T>> zb;

    public ry(Callable<ok<T>> callable) {
        this(callable, false);
    }

    ry(Callable<ok<T>> callable, boolean z) {
        this.zb = new LinkedHashSet(1);
        this.sya = new LinkedHashSet(1);
        this.dj = new Handler(Looper.getMainLooper());
        this.lud = null;
        if (z) {
            try {
                ycx((ok) callable.call());
                return;
            } catch (Throwable th) {
                ycx((ok) new ok<>(th));
                return;
            }
        }
        ycx.execute(new ycx(this, callable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ycx(ok<T> okVar) {
        if (this.lud != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.lud = okVar;
        ycx();
    }

    public ry<T> ycx(ea<T> eaVar) {
        synchronized (this) {
            ok<T> okVar = this.lud;
            if (okVar != null && okVar.ycx() != null) {
                eaVar.ycx(okVar.ycx());
            }
            this.zb.add(eaVar);
        }
        return this;
    }

    public ry<T> zb(ea<T> eaVar) {
        synchronized (this) {
            this.zb.remove(eaVar);
        }
        return this;
    }

    public ry<T> sya(ea<Throwable> eaVar) {
        synchronized (this) {
            ok<T> okVar = this.lud;
            if (okVar != null && okVar.zb() != null) {
                eaVar.ycx(okVar.zb());
            }
            this.sya.add(eaVar);
        }
        return this;
    }

    public ry<T> dj(ea<Throwable> eaVar) {
        synchronized (this) {
            this.sya.remove(eaVar);
        }
        return this;
    }

    private void ycx() {
        this.dj.post(new Runnable() { // from class: com.bytedance.adsdk.zb.ry.1
            @Override // java.lang.Runnable
            public void run() {
                ok okVar = ry.this.lud;
                if (okVar == null) {
                    return;
                }
                if (okVar.ycx() != null) {
                    ry.this.ycx((ry) okVar.ycx());
                } else {
                    ry.this.ycx(okVar.zb());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ycx(T t) {
        synchronized (this) {
            Iterator it = new ArrayList(this.zb).iterator();
            while (it.hasNext()) {
                ((ea) it.next()).ycx(t);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ycx(Throwable th) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.sya);
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ea) it.next()).ycx(th);
            }
        }
    }

    static class ycx<T> extends FutureTask<ok<T>> {
        private ry<T> ycx;

        ycx(ry<T> ryVar, Callable<ok<T>> callable) {
            super(callable);
            this.ycx = ryVar;
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.ycx.ycx((ok) get());
                } catch (InterruptedException | ExecutionException e) {
                    this.ycx.ycx(new ok(e));
                }
            } finally {
                this.ycx = null;
            }
        }
    }
}
