package im.toss.features.home.feature.home_asset.edit;

import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.Interruptable;
import o.SetDetectableSize;
import o.registerSceneDialogFactory;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAssetEditV2LogManager$$ExternalSyntheticLambda4 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Interruptable.onNavigationEvent f$0;
    public final /* synthetic */ Interruptable.onNavigationEvent f$1;
    public final /* synthetic */ registerSceneDialogFactory f$2;

    public /* synthetic */ HomeAssetEditV2LogManager$$ExternalSyntheticLambda4(Interruptable.onNavigationEvent onnavigationevent, Interruptable.onNavigationEvent onnavigationevent2, registerSceneDialogFactory registerscenedialogfactory) {
        this.f$0 = onnavigationevent;
        this.f$1 = onnavigationevent2;
        this.f$2 = registerscenedialogfactory;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Interruptable.onNavigationEvent onnavigationevent = this.f$0;
        if (i3 != 0) {
            return (Unit) registerSceneDialogFactory.onNavigationEvent(new Object[]{onnavigationevent, this.f$1, this.f$2, (SetDetectableSize) obj}, -236822405, 236822408, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
        }
        throw null;
    }
}
