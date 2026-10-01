package o;

import java.io.StringReader;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class tz {
    private sjd onExtraCallback;
    private sim onExtraCallbackWithResult = sim.IAuthTabCallback();
    private ulm onNavigationEvent;

    public tz(ulm ulmVar) {
        this.onNavigationEvent = ulmVar;
        this.onExtraCallback = ulmVar.asBinder();
    }

    public boolean onExtraCallback() {
        return this.onExtraCallbackWithResult.onExtraCallback() > 0;
    }

    public sim onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public sjd onWarmupCompleted() {
        return this.onExtraCallback;
    }

    public static oq IAuthTabCallback(String str, String str2) {
        rc rcVar = new rc();
        return rcVar.onExtraCallbackWithResult(new StringReader(str), str2, new tz(rcVar));
    }

    public static tz IAuthTabCallback() {
        return new tz(new rc());
    }
}
