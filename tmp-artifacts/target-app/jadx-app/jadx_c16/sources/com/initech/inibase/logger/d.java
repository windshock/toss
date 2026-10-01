package com.initech.inibase.logger;

import com.initech.inibase.logger.helpers.FileWatchdog;

/* loaded from: /tmp/toss_alldex/classes16.dex */
final class d extends FileWatchdog {
    d(String str) {
        super(str);
    }

    @Override // com.initech.inibase.logger.helpers.FileWatchdog
    public final void doOnChange() {
        new PropertyConfigurator().doConfigure(this.filename, LogManager.getLoggerRepository());
    }
}
