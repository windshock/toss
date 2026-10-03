package o;

import android.os.Parcelable;
import com.google.gson.annotations.JsonAdapter;
import im.toss.network.serialization.PolymorphicTypeDeserializer;
import viva.republica.toss.network.model.cardsales.funnel.field.RadioField;

@JsonAdapter(PolymorphicTypeDeserializer.class)
@ga(onExtraCallback = {@gb(IAuthTabCallback = "ACCOUNT_SELECT", onExtraCallback = createBidderTokenProviderApi.class), @gb(IAuthTabCallback = "CHECKBOX", onExtraCallback = createAudienceNetworkActivity.class), @gb(IAuthTabCallback = then.RADIO, onExtraCallback = RadioField.class), @gb(IAuthTabCallback = "INPUT_FIELD", onExtraCallback = createMediaViewVideoRendererApi.class), @gb(IAuthTabCallback = "AGREEMENT", onExtraCallback = createAudienceNetworkAdsApi.class), @gb(IAuthTabCallback = "TERMS", onExtraCallback = createNativeComponentTagApi.class), @gb(IAuthTabCallback = "TABLE", onExtraCallback = getInitApi.class), @gb(IAuthTabCallback = "LABEL", onExtraCallback = createNativeAdScrollViewApi.class), @gb(IAuthTabCallback = "SELECT", onExtraCallback = createNativeBannerAdApi.class), @gb(IAuthTabCallback = "STATIC_SELECT", onExtraCallback = createNativeBannerAdApi.class), @gb(IAuthTabCallback = "IMAGE", onExtraCallback = createInterstitialAd.class), @gb(IAuthTabCallback = "HELP_AREA", onExtraCallback = createNativeBannerAdViewApi.class), @gb(IAuthTabCallback = "TAB", onExtraCallback = createNativeAdViewApi.class), @gb(IAuthTabCallback = "LIST_HEADER", onExtraCallback = createNativeAdImageApi.class), @gb(IAuthTabCallback = "LIST_ROW", onExtraCallback = createNativeAdBaseFromBidPayload.class), @gb(IAuthTabCallback = "SPACE", onExtraCallback = createNativeAdsManagerApi.class)}, onNavigationEvent = "type")
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface createNativeAdRatingApi extends Parcelable {
}
