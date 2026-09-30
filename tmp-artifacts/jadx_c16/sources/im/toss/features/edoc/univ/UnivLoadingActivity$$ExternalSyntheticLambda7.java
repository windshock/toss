package im.toss.features.edoc.univ;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.NativeDeviceInfoSpec;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class UnivLoadingActivity$$ExternalSyntheticLambda7 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ UnivLoadingActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallback = UnivLoadingActivity.onExtraCallback(this.f$0, (NativeDeviceInfoSpec) obj);
            int i3 = 27 / 0;
        } else {
            unitOnExtraCallback = UnivLoadingActivity.onExtraCallback(this.f$0, (NativeDeviceInfoSpec) obj);
        }
        int i4 = onExtraCallback + 105;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
