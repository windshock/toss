package im.toss.features.home.core.ui.compose.dst;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.setExtensionCreator;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeBarHomeListRowKt$$ExternalSyntheticLambda7 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj, Object obj2) {
        Unit unitOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallback + 71;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnNavigationEvent = setExtensionCreator.onNavigationEvent(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i3 = 98 / 0;
        } else {
            unitOnNavigationEvent = setExtensionCreator.onNavigationEvent(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        int i4 = onNavigationEvent + 25;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
