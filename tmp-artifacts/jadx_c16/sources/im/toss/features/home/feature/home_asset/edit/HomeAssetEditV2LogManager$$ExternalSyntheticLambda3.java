package im.toss.features.home.feature.home_asset.edit;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.Interruptable;
import o.Interruptable$IAuthTabCallback;
import o.SetDetectableSize;
import o.registerSceneDialogFactory;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAssetEditV2LogManager$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Interruptable$IAuthTabCallback.onExtraCallbackWithResult f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Interruptable.onNavigationEvent f$2;
    public final /* synthetic */ registerSceneDialogFactory f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ Interruptable.onNavigationEvent f$5;

    public /* synthetic */ HomeAssetEditV2LogManager$$ExternalSyntheticLambda3(Interruptable$IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, int i, Interruptable.onNavigationEvent onnavigationevent, registerSceneDialogFactory registerscenedialogfactory, boolean z, Interruptable.onNavigationEvent onnavigationevent2) {
        this.f$0 = onextracallbackwithresult;
        this.f$1 = i;
        this.f$2 = onnavigationevent;
        this.f$3 = registerscenedialogfactory;
        this.f$4 = z;
        this.f$5 = onnavigationevent2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        Interruptable$IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult = this.f$0;
        int i4 = this.f$1;
        if (i3 == 0) {
            registerSceneDialogFactory.onExtraCallbackWithResult(onextracallbackwithresult, i4, this.f$2, this.f$3, this.f$4, this.f$5, (SetDetectableSize) obj);
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = registerSceneDialogFactory.onExtraCallbackWithResult(onextracallbackwithresult, i4, this.f$2, this.f$3, this.f$4, this.f$5, (SetDetectableSize) obj);
        int i5 = onExtraCallback + 49;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
