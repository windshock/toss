package im.toss.compose.widget;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import o.SessionProcessorCaptureCallback;
import o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4;
import o.removeObserverLocked;
import o.setImageAssetsFolder;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TdsRadialGradientKt$$ExternalSyntheticLambda6 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 f$1;
    public final /* synthetic */ Pair[] f$2;
    public final /* synthetic */ float f$3;

    public /* synthetic */ TdsRadialGradientKt$$ExternalSyntheticLambda6(float f, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, Pair[] pairArr, float f2) {
        this.f$0 = f;
        this.f$1 = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
        this.f$2 = pairArr;
        this.f$3 = f2;
    }

    public final Object invoke(Object obj) {
        removeObserverLocked removeobserverlockedOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            removeobserverlockedOnNavigationEvent = setImageAssetsFolder.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, (SessionProcessorCaptureCallback) obj);
            int i3 = 88 / 0;
        } else {
            removeobserverlockedOnNavigationEvent = setImageAssetsFolder.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, (SessionProcessorCaptureCallback) obj);
        }
        int i4 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return removeobserverlockedOnNavigationEvent;
        }
        throw null;
    }
}
