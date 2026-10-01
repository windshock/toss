package o;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class uh {
    private static final djExternalSyntheticApiModelOutline0 onExtraCallbackWithResult = new djExternalSyntheticApiModelOutline0("REHASH");
    private static final tn onExtraCallback = new tn(null);
    private static final tn IAuthTabCallback = new tn(Boolean.TRUE);

    /* JADX INFO: Access modifiers changed from: private */
    public static final tn onWarmupCompleted(Object obj) {
        if (obj == null) {
            return onExtraCallback;
        }
        return Intrinsics.areEqual(obj, Boolean.TRUE) ? IAuthTabCallback : new tn(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void IAuthTabCallback() {
        throw new UnsupportedOperationException("not implemented");
    }
}
