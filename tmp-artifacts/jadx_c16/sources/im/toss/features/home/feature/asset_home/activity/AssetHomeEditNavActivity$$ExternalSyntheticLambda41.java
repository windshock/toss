package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetCardHomeEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda41 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ AssetCardHomeEditViewModel f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = AssetHomeEditNavActivity.onNavigationEvent(this.f$0);
        int i4 = onNavigationEvent + 115;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
