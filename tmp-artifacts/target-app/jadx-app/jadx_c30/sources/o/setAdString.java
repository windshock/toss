package o;

import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import o.PAGAdWrapperListener;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setAdString {
    private static onNavigationEvent onNavigationEvent = new onNavigationEvent("org.harmony.apache.pack200", null);

    static class onNavigationEvent extends Logger {
        private boolean onExtraCallbackWithResult;

        protected onNavigationEvent(String str, String str2) {
            super(str, str2);
            this.onExtraCallbackWithResult = false;
        }

        @Override // java.util.logging.Logger
        public void log(LogRecord logRecord) {
            if (this.onExtraCallbackWithResult) {
                super.log(logRecord);
            }
        }
    }

    static {
        LogManager.getLogManager().addLogger(onNavigationEvent);
    }

    public static /* synthetic */ int onNavigationEvent(PAGAdWrapperListener.onExtraCallbackWithResult onextracallbackwithresult, PAGAdWrapperListener.onExtraCallbackWithResult onextracallbackwithresult2) {
        String strOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult();
        String strOnExtraCallbackWithResult2 = onextracallbackwithresult2.onExtraCallbackWithResult();
        if (strOnExtraCallbackWithResult.equals(strOnExtraCallbackWithResult2)) {
            return 0;
        }
        if ("META-INF/MANIFEST.MF".equals(strOnExtraCallbackWithResult)) {
            return -1;
        }
        if ("META-INF/MANIFEST.MF".equals(strOnExtraCallbackWithResult2)) {
            return 1;
        }
        return strOnExtraCallbackWithResult.compareTo(strOnExtraCallbackWithResult2);
    }
}
