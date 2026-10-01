package im.toss.features.home.ui.view.asset.edit.v2;

import im.toss.rn.granite.core.module.appsintoss.bridge.ad.ShowTossAdOrAdmobBridge$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditV2ViewModel$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ AssetHomeEditV2ViewModel f$0;
    public final /* synthetic */ Function2 f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ AssetHomeEditV2ViewModel$$ExternalSyntheticLambda2(AssetHomeEditV2ViewModel assetHomeEditV2ViewModel, Function2 function2, int i) {
        this.f$0 = assetHomeEditV2ViewModel;
        this.f$1 = function2;
        this.f$2 = i;
    }

    public final Object invoke(Object obj) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            AssetHomeEditV2ViewModel assetHomeEditV2ViewModel = this.f$0;
            Function2 function2 = this.f$1;
            Integer numValueOf = Integer.valueOf(this.f$2);
            int iOnNavigationEvent = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            unit = (Unit) AssetHomeEditV2ViewModel.onExtraCallbackWithResult(713934230, -713934222, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, new Object[]{assetHomeEditV2ViewModel, function2, numValueOf, (String) obj});
            int i3 = 74 / 0;
        } else {
            AssetHomeEditV2ViewModel assetHomeEditV2ViewModel2 = this.f$0;
            Function2 function22 = this.f$1;
            Integer numValueOf2 = Integer.valueOf(this.f$2);
            int iOnNavigationEvent3 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent4 = ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent();
            unit = (Unit) AssetHomeEditV2ViewModel.onExtraCallbackWithResult(713934230, -713934222, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent3, ShowTossAdOrAdmobBridge$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent4, new Object[]{assetHomeEditV2ViewModel2, function22, numValueOf2, (String) obj});
        }
        int i4 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
