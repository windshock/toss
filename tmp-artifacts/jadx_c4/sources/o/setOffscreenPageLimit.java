package o;

import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.PlayableAdInfoResponse;
import im.toss.ads_sdk.remote.api.ApiResponse;
import im.toss.ads_sdk.remote.model.AdInAdRequest;
import im.toss.ads_sdk.remote.model.GetNativeAdsRequestBody;
import im.toss.ads_sdk.remote.model.SspSdkAdResponse;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface setOffscreenPageLimit {
    @getIv8(onExtraCallback = "playable-ad/ad-in-ad")
    Object onExtraCallbackWithResult(@initCertList(onExtraCallbackWithResult = "Authorization") @Nullable String str, @getUserCertList @NotNull AdInAdRequest adInAdRequest, @NotNull access13800<? super PlayableAdInfoResponse> access13800Var);

    @getIv8(onExtraCallback = "/ad/v1/ads")
    Object onNavigationEvent(@initCertList(onExtraCallbackWithResult = "Authorization") @Nullable String str, @hasCert @NotNull Map<String, String> map, @getUserCertList @NotNull GetNativeAdsRequestBody getNativeAdsRequestBody, @NotNull access13800<? super ApiResponse<SspSdkAdResponse>> access13800Var);

    @getIv8(onExtraCallback = "/display-ad/ads")
    Object onWarmupCompleted(@initCertList(onExtraCallbackWithResult = "Authorization") @Nullable String str, @hasCert @NotNull Map<String, String> map, @getUserCertList @NotNull GetNativeAdsRequestBody getNativeAdsRequestBody, @NotNull access13800<? super ApiResponse<NativeAdsDto>> access13800Var);

    @getIv8(onExtraCallback = "/display-ad/ads")
    Object onWarmupCompleted(@initCertList(onExtraCallbackWithResult = "Authorization") @Nullable String str, @hasCert @NotNull Map<String, String> map, @getUserCertList @NotNull JsonObject jsonObject, @NotNull access13800<? super JsonObject> access13800Var);
}
