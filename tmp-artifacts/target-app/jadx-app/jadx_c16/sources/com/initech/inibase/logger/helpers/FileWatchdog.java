package com.initech.inibase.logger.helpers;

import java.io.File;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class FileWatchdog extends Thread {
    public static final long DEFAULT_DELAY = 60000;
    private File a;
    public String filename;
    protected long delay = DEFAULT_DELAY;
    private long b = 0;
    private boolean c = false;
    private boolean d = false;

    public FileWatchdog(String str) {
        this.filename = str;
        this.a = new File(str);
        setDaemon(true);
        checkAndConfigure();
    }

    protected void checkAndConfigure() {
        try {
            if (this.a.exists()) {
                long jLastModified = this.a.lastModified();
                if (jLastModified > this.b) {
                    this.b = jLastModified;
                    doOnChange();
                    this.c = false;
                    return;
                }
                return;
            }
            if (this.c) {
                return;
            }
            LogLog.debug("[" + this.filename + "] does not exist.");
            this.c = true;
        } catch (SecurityException unused) {
            LogLog.warn("Was not allowed to read check file existance, file:[" + this.filename + "].");
            this.d = true;
        }
    }

    protected abstract void doOnChange();

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws InterruptedException {
        while (!this.d) {
            try {
                Thread.sleep(this.delay);
            } catch (InterruptedException unused) {
            }
            checkAndConfigure();
        }
    }

    public void setDelay(long j) {
        this.delay = j;
    }
}
