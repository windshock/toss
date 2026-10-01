package im.toss.features.home.feature.asset_home.activity;

import kotlin.jvm.functions.Function1;
import o.GlobalInfoRecorderUtils;
import o.getPBRpcProxy;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda12 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ GlobalInfoRecorderUtils f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        GlobalInfoRecorderUtils globalInfoRecorderUtils = this.f$0;
        getPBRpcProxy.onNavigationEvent onnavigationevent = (getPBRpcProxy.onNavigationEvent) obj;
        if (i3 == 0) {
            return AssetHomeEditNavActivity.onNavigationEvent(globalInfoRecorderUtils, onnavigationevent);
        }
        AssetHomeEditNavActivity.onNavigationEvent(globalInfoRecorderUtils, onnavigationevent);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
