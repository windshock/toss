package im.toss.features.home.feature.asset_home.activity.home;

import android.content.Intent;
import o.findResAndMsg;
import o.getContentPaddingRight;
import o.getInternalId;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetInvestmentHomeActivity$$ExternalSyntheticLambda0 implements getContentPaddingRight {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ AssetInvestmentHomeActivity f$0;
    public final /* synthetic */ findResAndMsg f$1;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$2;
    public final /* synthetic */ getInternalId f$3;

    public /* synthetic */ AssetInvestmentHomeActivity$$ExternalSyntheticLambda0(AssetInvestmentHomeActivity assetInvestmentHomeActivity, findResAndMsg findresandmsg, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getInternalId getinternalid) {
        this.f$0 = assetInvestmentHomeActivity;
        this.f$1 = findresandmsg;
        this.f$2 = getsupportedhighspeedresolutionsfor;
        this.f$3 = getinternalid;
    }

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AssetInvestmentHomeActivity assetInvestmentHomeActivity = this.f$0;
        if (i3 == 0) {
            AssetInvestmentHomeActivity.IAuthTabCallback(assetInvestmentHomeActivity, this.f$1, this.f$2, this.f$3, (Intent) obj);
            return;
        }
        AssetInvestmentHomeActivity.IAuthTabCallback(assetInvestmentHomeActivity, this.f$1, this.f$2, this.f$3, (Intent) obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
