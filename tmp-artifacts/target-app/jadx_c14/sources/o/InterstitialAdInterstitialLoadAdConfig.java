package o;

import im.toss.network.model.BaseApiResponse;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.SchemeManagerInfoResponse;
import viva.republica.toss.network.model.notification.block.BlockNotificationPage;
import viva.republica.toss.network.model.notification.block.UnblockNotificationRequest;
import viva.republica.toss.network.model.onboarding.OnboardingStdConsentResponse;
import viva.republica.toss.network.model.onboarding.OnboardingTermsV2CodeRequest;
import viva.republica.toss.network.model.serviceManagement.marketingNotifications.MarketingNotification;
import viva.republica.toss.network.model.serviceManagement.marketingNotifications.terms.UpdateNotificationTermsRequest;
import viva.republica.toss.network.model.serviceManagement.terms.TossOneIntroResponse;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface InterstitialAdInterstitialLoadAdConfig {
    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/service-management/user/terms/toss-one-user/intro/{funnelId}")
    Object IAuthTabCallback(@getIvD(onNavigationEvent = "funnelId") long j, @NotNull access13800<? super BaseApiResponse<TossOneIntroResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/service-management/user/terms/toss-one-user/connection-statuses")
    @gf
    Object IAuthTabCallback(@NotNull access13800<? super BaseApiResponse<List<readOrientationFromTIFF>>> access13800Var);

    @getIv8(onExtraCallback = "v3/service-management/similar-notifications/unblock-notification")
    Object IAuthTabCallback(@getUserCertList @NotNull UnblockNotificationRequest unblockNotificationRequest, @NotNull access13800<? super BaseApiResponse<List<String>>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"ExcludeNword:true", "X-Toss-Method:POST"})
    @getIv8(onExtraCallback = "v3/verify/guest/session/std-consent-modules/onboarding-terms")
    Object IAuthTabCallback(@getUserCertList @NotNull OnboardingTermsV2CodeRequest onboardingTermsV2CodeRequest, @NotNull access13800<? super BaseApiResponse<OnboardingStdConsentResponse>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/service-management/marketing-notifications")
    writeRaw<BaseApiResponse<List<MarketingNotification>>> IAuthTabCallback();

    @getIv8(onExtraCallback = "v3/service-management/user/terms/toss-one-user/terms-list-to-agree")
    @gf
    writeRaw<BaseApiResponse<getLogPrefix>> IAuthTabCallback(@getUserCertList @NotNull DestructorThread1 destructorThread1);

    @getIv8(onExtraCallback = "v3/terms-manager/terms-consent-signature-list/prepare")
    @gf
    writeRaw<BaseApiResponse<accessgetCodep>> IAuthTabCallback(@getUserCertList @NotNull parseOptions parseoptions);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/service-management/scheme-manager-info/{schemeId}")
    Object onExtraCallback(@getIvD(onNavigationEvent = "schemeId") long j, @NotNull access13800<? super BaseApiResponse<SchemeManagerInfoResponse>> access13800Var);

    @getIv8(onExtraCallback = "v3/service-management/marketing-notifications/{companyKey}/settings")
    @gf
    writeRaw<BaseApiResponse<BitmapUtilWhenMappingsExternalSyntheticApiModelOutline0>> onExtraCallback(@getIvD(onNavigationEvent = "companyKey") @NotNull String str, @getUserCertList @NotNull BitmapUtilWhenMappingsExternalSyntheticApiModelOutline0 bitmapUtilWhenMappingsExternalSyntheticApiModelOutline0);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/service-management/similar-notifications/blocked-notifications")
    Object onExtraCallbackWithResult(@getKey4(onNavigationEvent = getAdExperienceType.QUERY_KEY) @Nullable Integer num, @getKey4(onNavigationEvent = "cursor") @Nullable String str, @NotNull access13800<? super BaseApiResponse<BlockNotificationPage>> access13800Var);

    @getIv8(onExtraCallback = "v3/service-management/marketing-notifications/{companyKey}/terms")
    @gf
    Object onExtraCallbackWithResult(@getIvD(onNavigationEvent = "companyKey") @NotNull String str, @getUserCertList @NotNull getAutoRotateAngleFromOrientation getautorotateanglefromorientation, @NotNull access13800<? super BaseApiResponse<readPackedInt>> access13800Var);

    @getIv8(onExtraCallback = "v3/service-management/marketing-notifications/{companyKey}/terms")
    @gf
    writeRaw<BaseApiResponse<readPackedInt>> onExtraCallbackWithResult(@getIvD(onNavigationEvent = "companyKey") @NotNull String str, @getUserCertList @NotNull StreamProcessor streamProcessor);

    @getIv8(onExtraCallback = "v3/service-management/user/terms/update/subscription-template-terms-state")
    writeRaw<BaseApiResponse<Boolean>> onExtraCallbackWithResult(@getUserCertList @NotNull UpdateNotificationTermsRequest updateNotificationTermsRequest);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/service-management/personalized-service/{companyKey}")
    Object onNavigationEvent(@getIvD(onNavigationEvent = "companyKey") @NotNull String str, @NotNull access13800<? super BaseApiResponse<MarketingNotification>> access13800Var);

    @getIv8(onExtraCallback = "v3/service-management/personalized-service/{companyKey}/terms")
    @gf
    Object onNavigationEvent(@getIvD(onNavigationEvent = "companyKey") @NotNull String str, @getUserCertList @NotNull getAutoRotateAngleFromOrientation getautorotateanglefromorientation, @NotNull access13800<? super BaseApiResponse<readPackedInt>> access13800Var);

    @setCurCert(onExtraCallbackWithResult = {"X-Toss-Method:GET"})
    @getIv8(onExtraCallback = "v3/service-management/significant-optional-terms")
    @gf
    writeRaw<BaseApiResponse<ImageMetaData>> onNavigationEvent();

    @getIv8(onExtraCallback = "v3/service-management/user/terms/toss-one-user/disconnect")
    @gf
    Object onWarmupCompleted(@getUserCertList @NotNull ReturnsOwnership returnsOwnership, @NotNull access13800<? super BaseApiResponse<List<readOrientationFromTIFF>>> access13800Var);
}
