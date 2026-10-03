package o;

import im.toss.network.model.BaseApiResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DERBitString {
    private final getApplicationTag onNavigationEvent;

    public DERBitString(@NotNull getApplicationTag getapplicationtag) {
        Intrinsics.checkNotNullParameter(getapplicationtag, "");
        this.onNavigationEvent = getapplicationtag;
    }

    public final Object onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, boolean z, @NotNull access13800<? super BaseApiResponse<onAdsLoaded>> access13800Var) {
        return this.onNavigationEvent.IAuthTabCallback(new NativeAdsManagerListener(str, str2, str3, i, z), access13800Var);
    }

    public final Object onWarmupCompleted(@NotNull access13800<? super BaseApiResponse<NativeBannerAdViewType>> access13800Var) {
        return this.onNavigationEvent.IAuthTabCallback(access13800Var);
    }
}
