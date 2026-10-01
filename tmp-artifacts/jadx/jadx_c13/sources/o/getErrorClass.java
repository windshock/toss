package o;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getErrorClass {
    private static final Logger onNavigationEvent = Logger.getLogger(getErrorClass.class.getName());

    public static void onExtraCallbackWithResult(String str) {
        onExtraCallbackWithResult(str, Level.FINEST);
    }

    public static void onExtraCallbackWithResult(String str, Level level) {
        Logger logger = onNavigationEvent;
        if (logger.isLoggable(level)) {
            logger.log(level, str, (Throwable) new AssertionError());
        }
    }

    private getErrorClass() {
    }
}
