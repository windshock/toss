package im.toss.ads_sdk.playable;

import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.playable.NativeAdsPlayableAdActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$setBackPressed$1$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ NativeAdsPlayableAdActivity f$0;
    public final /* synthetic */ NativeAdsDto f$1;

    public /* synthetic */ NativeAdsPlayableAdActivity$setBackPressed$1$$ExternalSyntheticLambda0(NativeAdsPlayableAdActivity nativeAdsPlayableAdActivity, NativeAdsDto nativeAdsDto) {
        this.f$0 = nativeAdsPlayableAdActivity;
        this.f$1 = nativeAdsDto;
    }

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 79;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            NativeAdsPlayableAdActivity.IAuthTabCallback_Parcel.onExtraCallbackWithResult(this.f$0, this.f$1, (SetDetectableSize) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = NativeAdsPlayableAdActivity.IAuthTabCallback_Parcel.onExtraCallbackWithResult(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i4 = onExtraCallback + 71;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
