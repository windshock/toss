package im.toss.rn.toss.core.remoteprocess;

import java.util.Set;
import o.clearFaultAdjacentMetadata;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RnSchemeAndroidOnlyQueryParams {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public static final RnSchemeAndroidOnlyQueryParams onExtraCallbackWithResult = new RnSchemeAndroidOnlyQueryParams();
    private static final Set<String> onExtraCallback = clearFaultAdjacentMetadata.onExtraCallback("rn_rp");

    private RnSchemeAndroidOnlyQueryParams() {
    }

    static {
        int i = IAuthTabCallback + 15;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Set<String> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        Set<String> set = onExtraCallback;
        int i5 = i3 + 15;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return set;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
