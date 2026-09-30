package im.toss.components.tuba.trigger.internal;

import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import o.ImageRequestsKtExternalSyntheticLambda0;
import o.OkHttpNetworkFetcherExternalSyntheticLambda3;
import o.OkHttpNetworkFetcherExternalSyntheticLambda5;
import o.UtilsKtExternalSyntheticLambda9;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TubaTriggerModule {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    public static final TubaTriggerModule onNavigationEvent = new TubaTriggerModule();
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private TubaTriggerModule() {
    }

    @Singleton
    public final OkHttpNetworkFetcherExternalSyntheticLambda5 IAuthTabCallback(@NotNull OkHttpNetworkFetcherExternalSyntheticLambda3 okHttpNetworkFetcherExternalSyntheticLambda3, @NotNull UtilsKtExternalSyntheticLambda9 utilsKtExternalSyntheticLambda9) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(okHttpNetworkFetcherExternalSyntheticLambda3, "");
        Intrinsics.checkNotNullParameter(utilsKtExternalSyntheticLambda9, "");
        ImageRequestsKtExternalSyntheticLambda0 imageRequestsKtExternalSyntheticLambda0 = new ImageRequestsKtExternalSyntheticLambda0(okHttpNetworkFetcherExternalSyntheticLambda3, utilsKtExternalSyntheticLambda9);
        int i2 = onExtraCallback + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return imageRequestsKtExternalSyntheticLambda0;
    }
}
