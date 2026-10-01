package com.initech.inibase.logger.spi;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class Filter implements OptionHandler {
    public static final int ACCEPT = 1;
    public static final int DENY = -1;
    public static final int NEUTRAL = 0;
    public Filter next;

    public void activateOptions() {
    }

    public abstract int decide(LoggingEvent loggingEvent);
}
