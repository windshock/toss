package com.bytedance.sdk.openadsdk.wwx;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class zb {
    private int dj;
    private ycx lud;
    private fby zb;
    private ScheduledExecutorService ycx = null;
    private long sya = 0;

    public interface ycx {
    }

    public zb(fby fbyVar, int i2) {
        this.zb = fbyVar;
        this.dj = i2;
    }

    public void ycx(long j) {
        this.sya = j;
    }

    public void ycx(int i2) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.ycx = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.wwx.zb.1
            @Override // java.lang.Runnable
            public void run() {
                long unused = zb.this.sya;
                if (System.currentTimeMillis() - zb.this.sya > zb.this.dj) {
                    zb.this.ycx.shutdown();
                    if (zb.this.zb != null) {
                        zb.this.zb.zb(0, "Automatic detection of stuck");
                    }
                    if (zb.this.lud != null) {
                        ycx unused2 = zb.this.lud;
                    }
                }
            }
        }, 0L, i2, TimeUnit.MILLISECONDS);
    }

    public void ycx() {
        ScheduledExecutorService scheduledExecutorService = this.ycx;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }

    public boolean zb() {
        ScheduledExecutorService scheduledExecutorService = this.ycx;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }
}
