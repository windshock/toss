package im.toss.features.industrialcodeselect.impl.log;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.getNewPackageUrl;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class IndustrialCodeSelectLogManager$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ String f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = getNewPackageUrl.onExtraCallback(this.f$0, (SetDetectableSize) obj);
        int i4 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
