package o;

import im.toss.network.model.BaseApiResponse;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.common.StickyTimezoneResponse;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface InterstitialAdInterstitialShowAdConfig {
    @getIv8(onExtraCallback = "v3/core/users/timezone/sticky-timezone")
    Object onWarmupCompleted(@NotNull access13800<? super BaseApiResponse<StickyTimezoneResponse>> access13800Var);
}
