package o;

import io.realm.internal.OsCollectionChangeSet;
import o.access11100;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access22300 implements access11100 {
    private final Throwable onExtraCallback;
    private final access11100.onExtraCallbackWithResult onExtraCallbackWithResult;
    private final access11100 onWarmupCompleted;

    public access22300(OsCollectionChangeSet osCollectionChangeSet) {
        this.onWarmupCompleted = osCollectionChangeSet;
        boolean zAsBinder = osCollectionChangeSet.asBinder();
        Throwable thIAuthTabCallback = osCollectionChangeSet.IAuthTabCallback();
        this.onExtraCallback = thIAuthTabCallback;
        if (thIAuthTabCallback != null) {
            this.onExtraCallbackWithResult = access11100.onExtraCallbackWithResult.ERROR;
        } else {
            this.onExtraCallbackWithResult = zAsBinder ? access11100.onExtraCallbackWithResult.INITIAL : access11100.onExtraCallbackWithResult.UPDATE;
        }
    }
}
