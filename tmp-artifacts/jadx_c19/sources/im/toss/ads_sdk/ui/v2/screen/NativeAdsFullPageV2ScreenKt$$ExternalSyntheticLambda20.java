package im.toss.ads_sdk.ui.v2.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getWindowAreaStatus;
import o.readFully;
import o.setOrientationDegrees;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageV2ScreenKt$$ExternalSyntheticLambda20 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ readFully f$0;

    public final Object invoke(Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 51;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        readFully readfully = this.f$0;
        setOrientationDegrees setorientationdegrees = (setOrientationDegrees) obj;
        if (i4 != 0) {
            return getWindowAreaStatus.onNavigationEvent(readfully, setorientationdegrees);
        }
        Unit unitOnNavigationEvent = getWindowAreaStatus.onNavigationEvent(readfully, setorientationdegrees);
        int i5 = 89 / 0;
        return unitOnNavigationEvent;
    }
}
