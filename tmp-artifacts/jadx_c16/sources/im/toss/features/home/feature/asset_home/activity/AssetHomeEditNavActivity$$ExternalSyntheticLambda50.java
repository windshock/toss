package im.toss.features.home.feature.asset_home.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.setParentLayoutDirection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda50 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ setParentLayoutDirection f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            AssetHomeEditNavActivity.IAuthTabCallback(this.f$0);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = AssetHomeEditNavActivity.IAuthTabCallback(this.f$0);
        int i3 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }
}
