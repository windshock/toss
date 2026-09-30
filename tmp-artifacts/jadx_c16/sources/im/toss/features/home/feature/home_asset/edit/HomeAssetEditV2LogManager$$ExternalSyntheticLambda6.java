package im.toss.features.home.feature.home_asset.edit;

import im.toss.features.foreigner.home.ui.test.ForeignerHomeTestScreenKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.Interruptable;
import o.SetDetectableSize;
import o.registerSceneDialogFactory;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAssetEditV2LogManager$$ExternalSyntheticLambda6 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Interruptable.onNavigationEvent f$0;
    public final /* synthetic */ registerSceneDialogFactory f$1;

    public /* synthetic */ HomeAssetEditV2LogManager$$ExternalSyntheticLambda6(Interruptable.onNavigationEvent onnavigationevent, registerSceneDialogFactory registerscenedialogfactory) {
        this.f$0 = onnavigationevent;
        this.f$1 = registerscenedialogfactory;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Interruptable.onNavigationEvent onnavigationevent = this.f$0;
        if (i3 != 0) {
            return (Unit) registerSceneDialogFactory.onNavigationEvent(new Object[]{onnavigationevent, this.f$1, (SetDetectableSize) obj}, 478118701, -478118697, ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted(), ForeignerHomeTestScreenKt$.ExternalSyntheticLambda11.onWarmupCompleted());
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
