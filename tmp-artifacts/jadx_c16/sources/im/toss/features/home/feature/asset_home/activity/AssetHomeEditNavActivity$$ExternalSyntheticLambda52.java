package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetEtcHomeEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda52 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ AssetEtcHomeEditViewModel f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = AssetHomeEditNavActivity.onNavigationEvent(this.f$0);
        int i4 = onExtraCallback + 1;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
