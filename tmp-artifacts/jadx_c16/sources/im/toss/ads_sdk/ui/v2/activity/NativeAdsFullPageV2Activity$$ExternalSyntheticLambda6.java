package im.toss.ads_sdk.ui.v2.activity;

import kotlin.jvm.functions.Function1;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.decrementVideoUsage;
import o.getSupportedHighSpeedResolutionsFor;
import o.isInVideoUsage;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageV2Activity$$ExternalSyntheticLambda6 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$1;

    public /* synthetic */ NativeAdsFullPageV2Activity$$ExternalSyntheticLambda6(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        this.f$0 = textFieldScrollKtExternalSyntheticLambda0;
        this.f$1 = getsupportedhighspeedresolutionsfor;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            NativeAdsFullPageV2Activity.onWarmupCompleted(this.f$0, this.f$1, (isInVideoUsage) obj);
            throw null;
        }
        decrementVideoUsage decrementvideousageOnWarmupCompleted = NativeAdsFullPageV2Activity.onWarmupCompleted(this.f$0, this.f$1, (isInVideoUsage) obj);
        int i3 = IAuthTabCallback + 111;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return decrementvideousageOnWarmupCompleted;
    }
}
