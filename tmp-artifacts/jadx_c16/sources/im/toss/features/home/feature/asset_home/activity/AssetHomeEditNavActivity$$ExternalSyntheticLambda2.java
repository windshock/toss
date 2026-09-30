package im.toss.features.home.feature.asset_home.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.GlobalInfoRecorderUtils;
import o.getKekid;
import o.getPBRpcProxy;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ GlobalInfoRecorderUtils f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (getPBRpcProxy.onNavigationEvent) obj};
        Unit unit = (Unit) AssetHomeEditNavActivity.onExtraCallbackWithResult(getKekid.onExtraCallback(), getKekid.onExtraCallback(), objArr, 500671041, getKekid.onExtraCallback(), getKekid.onExtraCallback(), -500671038);
        int i4 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}
