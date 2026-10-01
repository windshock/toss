package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class CertToolkitMgrRevokeReason {
    public static final CertToolkitMgrRevokeReason onExtraCallback = new CertToolkitMgrRevokeReason();
    private static getKey7 onExtraCallbackWithResult;

    private CertToolkitMgrRevokeReason() {
    }

    public final getKey7 IAuthTabCallback() {
        return onExtraCallbackWithResult;
    }

    public final void onExtraCallbackWithResult(@NotNull getKey7 getkey7) {
        Intrinsics.checkNotNullParameter(getkey7, "");
        onExtraCallbackWithResult = getkey7;
    }
}
