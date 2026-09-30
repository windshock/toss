package im.toss.ads_sdk.ui.activity;

import im.toss.ads_sdk.model.NativeAdsDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsFullPageActivity$$ExternalSyntheticLambda13 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ NativeAdsDto f$0;
    public final /* synthetic */ NativeAdsFullPageActivity f$1;

    public /* synthetic */ NativeAdsFullPageActivity$$ExternalSyntheticLambda13(NativeAdsDto nativeAdsDto, NativeAdsFullPageActivity nativeAdsFullPageActivity) {
        this.f$0 = nativeAdsDto;
        this.f$1 = nativeAdsFullPageActivity;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = NativeAdsFullPageActivity.onExtraCallbackWithResult(this.f$0, this.f$1);
        int i4 = onNavigationEvent + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
