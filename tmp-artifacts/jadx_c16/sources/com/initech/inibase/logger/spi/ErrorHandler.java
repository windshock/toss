package com.initech.inibase.logger.spi;

import com.initech.inibase.logger.Appender;
import com.initech.inibase.logger.Logger;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface ErrorHandler extends OptionHandler {
    void error(String str);

    void error(String str, Exception exc, int i);

    void error(String str, Exception exc, int i, LoggingEvent loggingEvent);

    void setAppender(Appender appender);

    void setBackupAppender(Appender appender);

    void setLogger(Logger logger);
}
