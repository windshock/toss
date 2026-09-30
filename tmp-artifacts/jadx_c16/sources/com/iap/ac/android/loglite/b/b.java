package com.iap.ac.android.loglite.b;

import com.iap.ac.android.loglite.api.AnalyticsHelper;
import com.iap.ac.android.loglite.b.c;
import com.initech.inibase.logger.helpers.FileWatchdog;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class b implements Runnable {
    public final /* synthetic */ c.a a;

    public b(c.a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() throws InterruptedException {
        try {
            TimeUnit.MILLISECONDS.sleep(FileWatchdog.DEFAULT_DELAY);
        } catch (InterruptedException unused) {
        }
        HashMap map = new HashMap();
        map.put("discardCount", String.valueOf(this.a.b));
        AnalyticsHelper.sendPerformanceLog("sendLogTooMuch", map);
        synchronized (this.a.c) {
            this.a.b = 0L;
        }
    }
}
