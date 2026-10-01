package im.toss.ads_sdk.ui.v2.activity;

import kotlin.jvm.functions.Function1;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.decrementVideoUsage;
import o.getSupportedHighSpeedResolutionsFor;
import o.isInVideoUsage;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerV2Activity$$ExternalSyntheticLambda5 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$1;

    public /* synthetic */ NativeAdsFullBannerV2Activity$$ExternalSyntheticLambda5(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        this.f$0 = textFieldScrollKtExternalSyntheticLambda0;
        this.f$1 = getsupportedhighspeedresolutionsfor;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            NativeAdsFullBannerV2Activity.onExtraCallbackWithResult(this.f$0, this.f$1, (isInVideoUsage) obj);
            throw null;
        }
        decrementVideoUsage decrementvideousageOnExtraCallbackWithResult = NativeAdsFullBannerV2Activity.onExtraCallbackWithResult(this.f$0, this.f$1, (isInVideoUsage) obj);
        int i3 = IAuthTabCallback + 81;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return decrementvideousageOnExtraCallbackWithResult;
    }
}
