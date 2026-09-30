package im.toss.features.home.feature.home_asset.edit;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.Interruptable;
import o.Interruptable$IAuthTabCallback;
import o.SetDetectableSize;
import o.registerSceneDialogFactory;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAssetEditV2LogManager$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ Interruptable$IAuthTabCallback.onExtraCallbackWithResult f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ registerSceneDialogFactory f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ Interruptable.onNavigationEvent f$4;

    public /* synthetic */ HomeAssetEditV2LogManager$$ExternalSyntheticLambda0(Interruptable$IAuthTabCallback.onExtraCallbackWithResult onextracallbackwithresult, int i, registerSceneDialogFactory registerscenedialogfactory, boolean z, Interruptable.onNavigationEvent onnavigationevent) {
        this.f$0 = onextracallbackwithresult;
        this.f$1 = i;
        this.f$2 = registerscenedialogfactory;
        this.f$3 = z;
        this.f$4 = onnavigationevent;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = registerSceneDialogFactory.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (SetDetectableSize) obj);
        int i4 = onExtraCallback + 69;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
