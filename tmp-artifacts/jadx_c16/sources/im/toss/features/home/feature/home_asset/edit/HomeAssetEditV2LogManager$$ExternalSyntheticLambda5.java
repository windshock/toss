package im.toss.features.home.feature.home_asset.edit;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.Interruptable;
import o.SetDetectableSize;
import o.registerSceneDialogFactory;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAssetEditV2LogManager$$ExternalSyntheticLambda5 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Interruptable.onNavigationEvent f$0;
    public final /* synthetic */ Interruptable.onNavigationEvent f$1;
    public final /* synthetic */ registerSceneDialogFactory f$2;

    public /* synthetic */ HomeAssetEditV2LogManager$$ExternalSyntheticLambda5(Interruptable.onNavigationEvent onnavigationevent, Interruptable.onNavigationEvent onnavigationevent2, registerSceneDialogFactory registerscenedialogfactory) {
        this.f$0 = onnavigationevent;
        this.f$1 = onnavigationevent2;
        this.f$2 = registerscenedialogfactory;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = registerSceneDialogFactory.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, (SetDetectableSize) obj);
        int i4 = onWarmupCompleted + 71;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
