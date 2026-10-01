package im.toss.ads_sdk.ui.screen;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0;
import o.WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0;
import o.deleteProfile;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullBannerScreenKt$$ExternalSyntheticLambda13 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ NativeAdsDto.Creative.FullBanner f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ deleteProfile f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ boolean f$5;
    public final /* synthetic */ Function2 f$6;
    public final /* synthetic */ Function0 f$7;
    public final /* synthetic */ int f$8;

    public /* synthetic */ NativeAdsFullBannerScreenKt$$ExternalSyntheticLambda13(NativeAdsDto.Creative.FullBanner fullBanner, boolean z, float f, deleteProfile deleteprofile, boolean z2, boolean z3, Function2 function2, Function0 function0, int i2) {
        this.f$0 = fullBanner;
        this.f$1 = z;
        this.f$2 = f;
        this.f$3 = deleteprofile;
        this.f$4 = z2;
        this.f$5 = z3;
        this.f$6 = function2;
        this.f$7 = function0;
        this.f$8 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 93;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        NativeAdsDto.Creative.FullBanner fullBanner = this.f$0;
        boolean z = this.f$1;
        float f = this.f$2;
        deleteProfile deleteprofile = this.f$3;
        boolean z2 = this.f$4;
        boolean z3 = this.f$5;
        Function2 function2 = this.f$6;
        Function0 function0 = this.f$7;
        int i5 = this.f$8;
        int iIntValue = ((Integer) obj2).intValue();
        Object[] objArr = {fullBanner, Boolean.valueOf(z), Float.valueOf(f), deleteprofile, Boolean.valueOf(z2), Boolean.valueOf(z3), function2, function0, Integer.valueOf(i5), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0.onNavigationEvent(1488748416, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1488748414, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        int i6 = onExtraCallbackWithResult + 99;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }
}
