package o;

import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getSupportLoaderManager {
    private static final Pattern IAuthTabCallback = Pattern.compile("[-_./;:]");

    protected getSupportLoaderManager() {
    }

    public static final void onWarmupCompleted() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    public static final <T> T onExtraCallbackWithResult() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }
}
