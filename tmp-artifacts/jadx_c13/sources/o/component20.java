package o;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class component20 {
    private static final Logger IAuthTabCallback;
    private static final component20 onNavigationEvent;

    static {
        Logger logger = Logger.getLogger(component20.class.getName());
        IAuthTabCallback = logger;
        component20 component20VarOnExtraCallbackWithResult = component16.onExtraCallbackWithResult();
        onNavigationEvent = component20VarOnExtraCallbackWithResult;
        if (component20VarOnExtraCallbackWithResult.getClass() != component20.class) {
            logger.log(Level.FINE, "Using the APIs optimized for: {0}", component20VarOnExtraCallbackWithResult.onWarmupCompleted());
        }
    }

    public static component20 onExtraCallbackWithResult() {
        return onNavigationEvent;
    }

    String onWarmupCompleted() {
        return "Java 8";
    }

    public long onNavigationEvent() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }
}
