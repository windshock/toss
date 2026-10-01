package im.toss.features.home.feature.asset_home.activity.home;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.AppLogger;
import o.findResAndMsg;
import o.getInternalId;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetInvestmentHomeActivity$$ExternalSyntheticLambda19 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ findResAndMsg f$0;
    public final /* synthetic */ getInternalId f$1;
    public final /* synthetic */ AssetInvestmentHomeActivity f$2;

    public /* synthetic */ AssetInvestmentHomeActivity$$ExternalSyntheticLambda19(findResAndMsg findresandmsg, getInternalId getinternalid, AssetInvestmentHomeActivity assetInvestmentHomeActivity) {
        this.f$0 = findresandmsg;
        this.f$1 = getinternalid;
        this.f$2 = assetInvestmentHomeActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = AssetInvestmentHomeActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, (AppLogger) obj);
        int i4 = onExtraCallbackWithResult + 49;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
