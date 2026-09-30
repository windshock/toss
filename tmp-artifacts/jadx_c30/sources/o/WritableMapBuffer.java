package o;

import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.network.model.BaseApiResponse;
import im.toss.network.throwable.TossApiCallException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.network.model.onboarding.OnboardingStdConsentResponse;
import viva.republica.toss.network.model.onboarding.OnboardingTermsV2CodeRequest;
import viva.republica.toss.util.RRNUtils;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class WritableMapBuffer {
    public static final WritableMapBuffer onNavigationEvent = new WritableMapBuffer();

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= PKIFailureInfo.systemUnavail;
            return WritableMapBuffer.this.onExtraCallback(null, null, this);
        }
    }

    private WritableMapBuffer() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: im.toss.network.throwable.TossApiCallException$ApiError */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull access13800<? super String> access13800Var) throws TossApiCallException.ApiError {
        onExtraCallbackWithResult onextracallbackwithresult;
        OnboardingStdConsentResponse onboardingStdConsentResponse;
        Object objOnTransact;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i = onextracallbackwithresult.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                onextracallbackwithresult.label = i + PKIFailureInfo.systemUnavail;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object objIAuthTabCallback = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = onextracallbackwithresult.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(objIAuthTabCallback);
            int iIAuthTabCallback = zzan.IAuthTabCallback(mergeParams.onExtraCallbackWithResult(RRNUtils.onExtraCallback.onNavigationEvent(str, str2), "yyyyMMdd"));
            OnboardingTermsV2CodeRequest onboardingTermsV2CodeRequest = new OnboardingTermsV2CodeRequest(iIAuthTabCallback);
            InterstitialAdInterstitialLoadAdConfig interstitialAdInterstitialLoadAdConfigExtraCallback = AdSettingsIntegrationErrorMode.onNavigationEvent.extraCallback();
            onextracallbackwithresult.L$0 = access15400.onNavigationEvent(str);
            onextracallbackwithresult.L$1 = access15400.onNavigationEvent(str2);
            onextracallbackwithresult.L$2 = access15400.onNavigationEvent(onboardingTermsV2CodeRequest);
            onextracallbackwithresult.I$0 = iIAuthTabCallback;
            onextracallbackwithresult.label = 1;
            objIAuthTabCallback = interstitialAdInterstitialLoadAdConfigExtraCallback.IAuthTabCallback(onboardingTermsV2CodeRequest, onextracallbackwithresult);
            if (objIAuthTabCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objIAuthTabCallback);
        }
        BaseApiResponse baseApiResponse = (BaseApiResponse) objIAuthTabCallback;
        int iIAuthTabCallback2 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback3 = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        if (((Boolean) BaseApiResponse.onExtraCallbackWithResult(new Object[]{baseApiResponse}, iIAuthTabCallback2, 812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -812271550, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback3)).booleanValue()) {
            try {
                objOnTransact = baseApiResponse.onTransact();
            } catch (NullPointerException e) {
                if (Intrinsics.areEqual(OnboardingStdConsentResponse.class, Object.class) || Intrinsics.areEqual(OnboardingStdConsentResponse.class, Unit.class)) {
                    onboardingStdConsentResponse = Unit.INSTANCE;
                } else {
                    TossApiCallException.ApiError apiErrorOnExtraCallbackWithResult = TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(e);
                    apiErrorOnExtraCallbackWithResult.onWarmupCompleted(baseApiResponse.IAuthTabCallback_Parcel());
                    throw apiErrorOnExtraCallbackWithResult;
                }
            }
            if (objOnTransact == null) {
                throw new NullPointerException("null cannot be cast to non-null type viva.republica.toss.network.model.onboarding.OnboardingStdConsentResponse");
            }
            onboardingStdConsentResponse = (OnboardingStdConsentResponse) objOnTransact;
            return onboardingStdConsentResponse.onWarmupCompleted();
        }
        TossApiCallException.ApiError apiErrorExtraCallbackWithResult = baseApiResponse.extraCallbackWithResult();
        if (apiErrorExtraCallbackWithResult == null) {
            throw TossApiCallException.ApiError.Companion.onExtraCallbackWithResult(baseApiResponse);
        }
        throw apiErrorExtraCallbackWithResult;
    }
}
