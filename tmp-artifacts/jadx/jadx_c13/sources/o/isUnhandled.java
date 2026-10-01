package o;

import java.util.List;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface isUnhandled {
    default isUnhandled onExtraCallback(List<Double> list) {
        return this;
    }

    getThreads onExtraCallbackWithResult();

    isUnhandled onExtraCallbackWithResult(String str);

    isUnhandled onWarmupCompleted(String str);
}
