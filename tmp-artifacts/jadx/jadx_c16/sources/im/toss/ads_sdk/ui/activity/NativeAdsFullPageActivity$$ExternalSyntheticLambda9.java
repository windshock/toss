package im.toss.ads_sdk.ui.activity;

import kotlin.jvm.functions.Function1;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.decrementVideoUsage;
import o.getSupportedHighSpeedResolutionsFor;
import o.isInVideoUsage;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageActivity$$ExternalSyntheticLambda9 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 f$0;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$1;

    public /* synthetic */ NativeAdsFullPageActivity$$ExternalSyntheticLambda9(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        this.f$0 = textFieldScrollKtExternalSyntheticLambda0;
        this.f$1 = getsupportedhighspeedresolutionsfor;
    }

    public final Object invoke(Object obj) {
        decrementVideoUsage decrementvideousageOnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            decrementvideousageOnExtraCallback = NativeAdsFullPageActivity.onExtraCallback(this.f$0, this.f$1, (isInVideoUsage) obj);
            int i3 = 59 / 0;
        } else {
            decrementvideousageOnExtraCallback = NativeAdsFullPageActivity.onExtraCallback(this.f$0, this.f$1, (isInVideoUsage) obj);
        }
        int i4 = onNavigationEvent + 119;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return decrementvideousageOnExtraCallback;
    }
}
