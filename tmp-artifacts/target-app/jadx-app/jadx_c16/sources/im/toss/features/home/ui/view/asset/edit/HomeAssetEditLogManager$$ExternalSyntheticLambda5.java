package im.toss.features.home.ui.view.asset.edit;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.getRuntimeSupportMax;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAssetEditLogManager$$ExternalSyntheticLambda5 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ getRuntimeSupportMax f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getRuntimeSupportMax getruntimesupportmax = this.f$0;
        SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
        if (i3 != 0) {
            return getRuntimeSupportMax.IAuthTabCallback(getruntimesupportmax, setDetectableSize);
        }
        getRuntimeSupportMax.IAuthTabCallback(getruntimesupportmax, setDetectableSize);
        throw null;
    }
}
