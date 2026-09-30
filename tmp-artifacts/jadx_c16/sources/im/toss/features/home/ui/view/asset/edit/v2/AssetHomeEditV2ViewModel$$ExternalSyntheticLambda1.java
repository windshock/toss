package im.toss.features.home.ui.view.asset.edit.v2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditV2ViewModel$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ Function2 f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ AssetHomeEditV2ViewModel$$ExternalSyntheticLambda1(Function2 function2, int i) {
        this.f$0 = function2;
        this.f$1 = i;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onExtraCallback = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            AssetHomeEditV2ViewModel.onExtraCallbackWithResult(this.f$0, this.f$1, ((Integer) obj).intValue());
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = AssetHomeEditV2ViewModel.onExtraCallbackWithResult(this.f$0, this.f$1, ((Integer) obj).intValue());
        int i3 = onExtraCallback + 123;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj2.hashCode();
        throw null;
    }
}
