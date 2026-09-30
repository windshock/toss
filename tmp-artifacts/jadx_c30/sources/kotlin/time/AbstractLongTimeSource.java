package kotlin.time;

import o.getBuildFingerprint;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class AbstractLongTimeSource implements getBuildFingerprint.onExtraCallback {
    protected abstract long onExtraCallback();

    /* JADX INFO: Access modifiers changed from: private */
    public static final long onExtraCallbackWithResult(AbstractLongTimeSource abstractLongTimeSource) {
        return abstractLongTimeSource.onExtraCallback();
    }
}
