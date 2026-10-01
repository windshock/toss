package im.toss.ads_sdk.ui.activity;

import kotlin.jvm.functions.Function1;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.decrementVideoUsage;
import o.getSupportedHighSpeedResolutionsFor;
import o.isInVideoUsage;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullBannerActivity$$ExternalSyntheticLambda7 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$1;

    public /* synthetic */ NativeAdsFullBannerActivity$$ExternalSyntheticLambda7(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        this.f$0 = textFieldScrollKtExternalSyntheticLambda0;
        this.f$1 = getsupportedhighspeedresolutionsfor;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = this.f$0;
        if (i3 == 0) {
            return NativeAdsFullBannerActivity.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0, this.f$1, (isInVideoUsage) obj);
        }
        decrementVideoUsage decrementvideousageOnExtraCallback = NativeAdsFullBannerActivity.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0, this.f$1, (isInVideoUsage) obj);
        int i4 = 34 / 0;
        return decrementvideousageOnExtraCallback;
    }
}
