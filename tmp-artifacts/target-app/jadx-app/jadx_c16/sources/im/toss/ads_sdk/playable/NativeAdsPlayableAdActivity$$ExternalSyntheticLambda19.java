package im.toss.ads_sdk.playable;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.nSetPosition;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsPlayableAdActivity$$ExternalSyntheticLambda19 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ NativeAdsPlayableAdActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.f$0, (String) obj};
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.f$0, (String) obj};
        Unit unit = (Unit) NativeAdsPlayableAdActivity.onNavigationEvent(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 2082004362, -2082004356, objArr2);
        int i3 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 47 / 0;
        }
        return unit;
    }
}
