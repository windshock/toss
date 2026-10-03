package o;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel;
import viva.republica.toss.cardrecommend.issuev2.ui.freeform.RadioView;
import viva.republica.toss.network.model.cardsales.funnel.field.RadioField;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getSubjectPublicKeyInfo {
    public static final isSignaturePolicyImplied onExtraCallback(@NotNull createNativeAdRatingApi createnativeadratingapi, @NotNull Context context, @NotNull TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, @NotNull CardIssueOverviewViewModel cardIssueOverviewViewModel, @NotNull getDigestAlgorithms<?> getdigestalgorithms) {
        Intrinsics.checkNotNullParameter(createnativeadratingapi, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(typographyKtExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(cardIssueOverviewViewModel, "");
        Intrinsics.checkNotNullParameter(getdigestalgorithms, "");
        if (createnativeadratingapi instanceof createBidderTokenProviderApi) {
            return new SignaturePolicyId((createBidderTokenProviderApi) createnativeadratingapi, context, typographyKtExternalSyntheticLambda0, cardIssueOverviewViewModel, getdigestalgorithms);
        }
        if (createnativeadratingapi instanceof createAudienceNetworkAdsApi) {
            return new getSignaturePolicyId(context, (createAudienceNetworkAdsApi) createnativeadratingapi, typographyKtExternalSyntheticLambda0, getdigestalgorithms, cardIssueOverviewViewModel);
        }
        if (createnativeadratingapi instanceof createAudienceNetworkActivity) {
            return new getSigPolicyHash(context, (createAudienceNetworkActivity) createnativeadratingapi, typographyKtExternalSyntheticLambda0, getdigestalgorithms, cardIssueOverviewViewModel);
        }
        if (createnativeadratingapi instanceof createInterstitialAd) {
            return new SignaturePolicyIdentifier(context, (createInterstitialAd) createnativeadratingapi, typographyKtExternalSyntheticLambda0, getdigestalgorithms, cardIssueOverviewViewModel);
        }
        if (createnativeadratingapi instanceof createMediaViewVideoRendererApi) {
            return new ContentHints(context, (createMediaViewVideoRendererApi) createnativeadratingapi, typographyKtExternalSyntheticLambda0, getdigestalgorithms, cardIssueOverviewViewModel);
        }
        if (createnativeadratingapi instanceof createNativeAdScrollViewApi) {
            return new getPostalAddress(context, (createNativeAdScrollViewApi) createnativeadratingapi);
        }
        if (createnativeadratingapi instanceof createNativeAdImageApi) {
            return new ContentIdentifier(context, (createNativeAdImageApi) createnativeadratingapi);
        }
        if (createnativeadratingapi instanceof createNativeAdBaseFromBidPayload) {
            return new getLocalityName(context, (createNativeAdBaseFromBidPayload) createnativeadratingapi, typographyKtExternalSyntheticLambda0, getdigestalgorithms, cardIssueOverviewViewModel);
        }
        if (createnativeadratingapi instanceof RadioField) {
            return new RadioView(context, (RadioField) createnativeadratingapi, typographyKtExternalSyntheticLambda0, getdigestalgorithms, cardIssueOverviewViewModel);
        }
        if (createnativeadratingapi instanceof createNativeBannerAdApi) {
            return new getCountryName(context, (createNativeBannerAdApi) createnativeadratingapi, getdigestalgorithms, typographyKtExternalSyntheticLambda0, cardIssueOverviewViewModel);
        }
        if (createnativeadratingapi instanceof createNativeAdsManagerApi) {
            return new ESSCertID(context, (createNativeAdsManagerApi) createnativeadratingapi);
        }
        if (createnativeadratingapi instanceof createNativeAdViewApi) {
            return new getSigPolicyQualifiers(context, (createNativeAdViewApi) createnativeadratingapi, typographyKtExternalSyntheticLambda0, getdigestalgorithms, cardIssueOverviewViewModel);
        }
        if (createnativeadratingapi instanceof getInitApi) {
            return new getCertHash((getInitApi) createnativeadratingapi, context, typographyKtExternalSyntheticLambda0, cardIssueOverviewViewModel, getdigestalgorithms);
        }
        if (createnativeadratingapi instanceof createNativeComponentTagApi) {
            return new ESSCertIDv2((createNativeComponentTagApi) createnativeadratingapi, context, typographyKtExternalSyntheticLambda0, getdigestalgorithms, cardIssueOverviewViewModel);
        }
        if (createnativeadratingapi instanceof createNativeBannerAdViewApi) {
            return new SignerAttribute(context, (createNativeBannerAdViewApi) createnativeadratingapi, typographyKtExternalSyntheticLambda0, getdigestalgorithms, cardIssueOverviewViewModel);
        }
        throw new IllegalStateException(("Unknown LayoutFreeformField type: " + Reflection.getOrCreateKotlinClass(createnativeadratingapi.getClass())).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(getDigestAlgorithms getdigestalgorithms, TypographyKtExternalSyntheticLambda0 typographyKtExternalSyntheticLambda0, createAdSizeApi createadsizeapi, CardIssueOverviewViewModel cardIssueOverviewViewModel, View view) {
        getDigestAlgorithms.onExtraCallbackWithResult(getdigestalgorithms, typographyKtExternalSyntheticLambda0, createadsizeapi, cardIssueOverviewViewModel, (String) null, (RCTCodelessLoggingEventListenerAutoLoggingOnTouchListener1) null, 16, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.widget.LinearLayout onWarmupCompleted(@org.jetbrains.annotations.NotNull o.createNativeBannerAdViewApi r10, @org.jetbrains.annotations.NotNull android.content.Context r11, @org.jetbrains.annotations.NotNull final o.TypographyKtExternalSyntheticLambda0 r12, @org.jetbrains.annotations.NotNull final viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel r13, @org.jetbrains.annotations.NotNull final o.getDigestAlgorithms<?> r14) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSubjectPublicKeyInfo.onWarmupCompleted(o.createNativeBannerAdViewApi, android.content.Context, o.TypographyKtExternalSyntheticLambda0, viva.republica.toss.cardrecommend.issuev2.CardIssueOverviewViewModel, o.getDigestAlgorithms):android.widget.LinearLayout");
    }
}
