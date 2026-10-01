package im.toss.features.home.feature.asset_home.activity.home;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.findResAndMsg;
import o.getInternalId;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetInvestmentHomeActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ findResAndMsg f$0;
    public final /* synthetic */ getInternalId f$1;

    public /* synthetic */ AssetInvestmentHomeActivity$$ExternalSyntheticLambda2(findResAndMsg findresandmsg, getInternalId getinternalid) {
        this.f$0 = findresandmsg;
        this.f$1 = getinternalid;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = AssetInvestmentHomeActivity.IAuthTabCallback(this.f$0, this.f$1, ((Integer) obj).intValue());
        int i4 = onExtraCallbackWithResult + 65;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
