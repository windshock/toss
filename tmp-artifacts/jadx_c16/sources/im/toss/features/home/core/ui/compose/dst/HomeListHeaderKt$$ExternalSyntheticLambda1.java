package im.toss.features.home.core.ui.compose.dst;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.setExtensionSorter;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeListHeaderKt$$ExternalSyntheticLambda1 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = setExtensionSorter.onExtraCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onExtraCallback + 53;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
