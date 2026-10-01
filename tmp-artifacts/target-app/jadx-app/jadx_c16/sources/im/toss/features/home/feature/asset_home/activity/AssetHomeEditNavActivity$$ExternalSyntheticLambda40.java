package im.toss.features.home.feature.asset_home.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda40 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit engagementSignalsCallback = AssetHomeEditNavActivity.setEngagementSignalsCallback();
        int i4 = onExtraCallback + 57;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return engagementSignalsCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
