package im.toss.di;

import kotlin.jvm.internal.Intrinsics;
import o.GriverOpenAuthExtensionRevokeCallback;
import o.getEnableJsT2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TossPayKycModule {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    public static final TossPayKycModule onExtraCallbackWithResult = new TossPayKycModule();
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = onWarmupCompleted + 83;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private TossPayKycModule() {
    }

    public final GriverOpenAuthExtensionRevokeCallback onWarmupCompleted(@NotNull getEnableJsT2 getenablejst2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getenablejst2, "");
        GriverOpenAuthExtensionRevokeCallback griverOpenAuthExtensionRevokeCallback = new GriverOpenAuthExtensionRevokeCallback(getenablejst2);
        int i2 = onExtraCallback + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return griverOpenAuthExtensionRevokeCallback;
    }
}
