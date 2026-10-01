package com.bytedance.sdk.openadsdk.oty.zb;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.tn;
import com.bytedance.sdk.openadsdk.oty.zb.lud;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class zb {
    private final AtomicLong dj;
    private final Integer fby;
    private volatile boolean jw = false;
    private final lud.ycx lt;
    private final AtomicBoolean lud;
    protected final AtomicBoolean sya;
    private final int ul;
    protected WeakReference<View> ycx;
    protected tn zb;

    public abstract int lt();

    protected abstract boolean sya();

    protected abstract void zb(int i2);

    public static zb ycx(boolean z, Integer num, View view, tn tnVar, lud.ycx ycxVar) {
        return z ? new fby(num, view, tnVar, ycxVar) : new sya(num, view, tnVar, ycxVar);
    }

    public zb(Integer num, View view, tn tnVar, int i2, lud.ycx ycxVar) {
        this.fby = num;
        this.ul = i2;
        this.zb = tnVar;
        this.lt = ycxVar;
        ycx(view);
        this.sya = new AtomicBoolean(false);
        this.dj = new AtomicLong(-1L);
        this.lud = new AtomicBoolean(false);
    }

    public void ycx() {
        if (this.sya.compareAndSet(false, true)) {
            ul.ycx(this);
        }
    }

    public int zb() {
        if (jw()) {
            return 1;
        }
        WeakReference<View> weakReference = this.ycx;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || this.jw) {
            return 3;
        }
        if (ea().equals(view.getTag(33554433))) {
            return (ea().equals(view.getTag(33554433)) && sya()) ? 1 : 2;
        }
        jc();
        lud.zb(ea());
        return 3;
    }

    protected void dj() {
        if (this.lud.compareAndSet(false, true)) {
            dj.ycx(this.zb, lud(), this.lt);
        }
    }

    protected ycx lud() {
        WeakReference<View> weakReference = this.ycx;
        if (weakReference == null) {
            return new ycx(-1, -1, -1.0f);
        }
        View view = weakReference.get();
        if (view == null) {
            return new ycx(0, 0, 0.0f);
        }
        return new ycx(view.getWidth(), view.getHeight(), view.getAlpha());
    }

    public void ul() {
        if (jw()) {
            return;
        }
        if (!this.sya.get()) {
            fby();
        } else {
            if (this.dj.compareAndSet(-1L, System.currentTimeMillis()) || System.currentTimeMillis() - this.dj.get() < this.ul) {
                return;
            }
            dj();
        }
    }

    public void fby() {
        this.dj.set(-1L);
    }

    public boolean jw() {
        return this.lud.get();
    }

    public void jc() {
        this.jw = true;
        ul.zb(this);
    }

    public void ycx(int i2) {
        if (i2 == 4) {
            ycx();
            return;
        }
        if (i2 == 8) {
            ry();
        } else if (i2 == 9) {
            dj();
        } else {
            zb(i2);
        }
    }

    public Integer ea() {
        return this.fby;
    }

    public boolean ok() {
        return this.sya.get();
    }

    public void ry() {
        this.sya.set(false);
        fby();
    }

    public void ycx(View view) {
        if (view != null) {
            view.setTag(33554433, ea());
        }
        this.ycx = new WeakReference<>(view);
    }
}
