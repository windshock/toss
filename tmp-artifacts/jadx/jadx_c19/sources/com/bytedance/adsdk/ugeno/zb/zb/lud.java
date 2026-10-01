package com.bytedance.adsdk.ugeno.zb.zb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.bytedance.adsdk.ugeno.zb.zb.zb;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class lud {
    private static HandlerThread ycx;
    private static Handler zb;
    private volatile int ea;
    private volatile boolean fby;
    private volatile int jc;
    private long jw;
    private final dj sya;
    private lt dj = new lt();
    private lt lud = new lt();
    private lt lt = new lt();
    private final Object ul = new Object();
    private final Runnable ok = new Runnable() { // from class: com.bytedance.adsdk.ugeno.zb.zb.lud.1
        @Override // java.lang.Runnable
        public void run() {
            float f;
            if (lud.this.fby) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (lud.this.jw == 0) {
                    f = 0.016f;
                } else {
                    f = (jUptimeMillis - lud.this.jw) / 1000.0f;
                    if (f > 0.033333335f) {
                        f = 0.033333335f;
                    }
                }
                lud.this.jw = jUptimeMillis;
                lud.this.sya.ycx(lud.this.jc, lud.this.ea);
                lud.this.sya.ycx(f);
                lud.this.sya.ycx(lud.this.dj);
                synchronized (lud.this.ul) {
                    lt ltVar = lud.this.lud;
                    lud ludVar = lud.this;
                    ludVar.lud = ludVar.dj;
                    lud.this.dj = ltVar;
                }
                if (lud.this.fby) {
                    lud.fby().postDelayed(this, 16L);
                }
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static Handler fby() {
        Handler handler;
        synchronized (lud.class) {
            if (ycx == null) {
                HandlerThread handlerThread = new HandlerThread("ugen-particle-physics", 10);
                ycx = handlerThread;
                handlerThread.start();
                zb = new Handler(ycx.getLooper());
            }
            handler = zb;
        }
        return handler;
    }

    lud(zb zbVar) {
        this.sya = new dj(zbVar);
    }

    void ycx(int i2, int i3) {
        this.jc = i2;
        this.ea = i3;
    }

    lt ycx() {
        lt ltVar;
        synchronized (this.ul) {
            lt ltVar2 = this.lt;
            ltVar = this.lud;
            this.lt = ltVar;
            this.lud = ltVar2;
        }
        return ltVar;
    }

    zb zb() {
        return this.sya.zb();
    }

    zb.dj[] sya() {
        return this.sya.ycx();
    }

    void dj() {
        if (this.fby) {
            return;
        }
        this.fby = true;
        this.jw = 0L;
        fby().post(this.ok);
    }

    void lud() {
        this.fby = false;
        fby().removeCallbacks(this.ok);
    }

    void lt() {
        lud();
        synchronized (this.ul) {
            this.dj = new lt();
            this.lud = new lt();
            this.lt = new lt();
        }
    }
}
