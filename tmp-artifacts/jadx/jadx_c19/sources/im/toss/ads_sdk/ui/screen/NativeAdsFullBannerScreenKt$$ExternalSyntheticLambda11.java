package im.toss.ads_sdk.ui.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0;
import o.WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullBannerScreenKt$$ExternalSyntheticLambda11 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ Function0 f$0;

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 33;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f$0};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0.onNavigationEvent(-1853070937, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1853070941, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        int i5 = IAuthTabCallback + 21;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }
}
