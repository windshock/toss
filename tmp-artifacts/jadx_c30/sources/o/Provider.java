package o;

import java.util.logging.Logger;
import o.registerReader;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class Provider extends JsonHelper implements setTraceCorrelation {
    private static final Logger IAuthTabCallback = Logger.getLogger(Provider.class.getName());
    final useKeyCache onExtraCallback;
    private final component25 onNavigationEvent;
    final getCtx onWarmupCompleted;

    public Provider(tryFindBinder tryfindbinder, getCtx getctx, useKeyCache usekeycache) {
        super(tryfindbinder);
        this.onNavigationEvent = new component25(IAuthTabCallback);
        this.onWarmupCompleted = getctx;
        this.onExtraCallback = usekeycache;
    }

    public static class onWarmupCompleted implements setSeverity {
        final TaskTypeThread onWarmupCompleted;

        public onWarmupCompleted(getCtx getctx, String str, String str2, String str3, registerReader.onExtraCallbackWithResult onextracallbackwithresult) {
            this.onWarmupCompleted = new TaskTypeThread(str, getDataTrimmed.HISTOGRAM, getItemsTrimmed.LONG, getctx).IAuthTabCallback(str2).onExtraCallback(str3).onWarmupCompleted(onextracallbackwithresult);
        }

        public String toString() {
            return this.onWarmupCompleted.onExtraCallbackWithResult(getClass().getSimpleName());
        }
    }
}
