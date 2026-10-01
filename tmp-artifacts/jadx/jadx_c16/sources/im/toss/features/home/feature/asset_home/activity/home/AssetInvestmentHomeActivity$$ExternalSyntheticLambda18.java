package im.toss.features.home.feature.asset_home.activity.home;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.RVManifestLazyProxyManifest;
import o.findResAndMsg;
import o.getInternalId;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetInvestmentHomeActivity$$ExternalSyntheticLambda18 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ findResAndMsg f$0;
    public final /* synthetic */ getInternalId f$1;
    public final /* synthetic */ AssetInvestmentHomeActivity f$2;

    public /* synthetic */ AssetInvestmentHomeActivity$$ExternalSyntheticLambda18(findResAndMsg findresandmsg, getInternalId getinternalid, AssetInvestmentHomeActivity assetInvestmentHomeActivity) {
        this.f$0 = findresandmsg;
        this.f$1 = getinternalid;
        this.f$2 = assetInvestmentHomeActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = AssetInvestmentHomeActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, (RVManifestLazyProxyManifest) obj, (Function0) obj2);
        int i4 = IAuthTabCallback + 13;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }
}
