package im.toss.features.home.feature.asset_home.activity.home;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.AppLogger;
import o.findResAndMsg;
import o.getInternalId;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetInvestmentHomeActivity$$ExternalSyntheticLambda20 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ findResAndMsg f$0;
    public final /* synthetic */ getInternalId f$1;
    public final /* synthetic */ AssetInvestmentHomeActivity f$2;

    public /* synthetic */ AssetInvestmentHomeActivity$$ExternalSyntheticLambda20(findResAndMsg findresandmsg, getInternalId getinternalid, AssetInvestmentHomeActivity assetInvestmentHomeActivity) {
        this.f$0 = findresandmsg;
        this.f$1 = getinternalid;
        this.f$2 = assetInvestmentHomeActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        findResAndMsg findresandmsg = this.f$0;
        if (i3 != 0) {
            return AssetInvestmentHomeActivity.IAuthTabCallback(findresandmsg, this.f$1, this.f$2, (AppLogger.onNavigationEvent.onWarmupCompleted) obj);
        }
        Unit unitIAuthTabCallback = AssetInvestmentHomeActivity.IAuthTabCallback(findresandmsg, this.f$1, this.f$2, (AppLogger.onNavigationEvent.onWarmupCompleted) obj);
        int i4 = 92 / 0;
        return unitIAuthTabCallback;
    }
}
