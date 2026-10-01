package im.toss.features.loan.calculator;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.getMaxSupportedFrameRate;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanInterestCalculatorActivity$$ExternalSyntheticLambda22 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ getMaxSupportedFrameRate f$0;
    public final /* synthetic */ getMaxSupportedFrameRate f$1;
    public final /* synthetic */ getMaxSupportedFrameRate f$2;
    public final /* synthetic */ CameraPresenceProviderExternalSyntheticLambda6 f$3;

    public /* synthetic */ LoanInterestCalculatorActivity$$ExternalSyntheticLambda22(getMaxSupportedFrameRate getmaxsupportedframerate, getMaxSupportedFrameRate getmaxsupportedframerate2, getMaxSupportedFrameRate getmaxsupportedframerate3, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6) {
        this.f$0 = getmaxsupportedframerate;
        this.f$1 = getmaxsupportedframerate2;
        this.f$2 = getmaxsupportedframerate3;
        this.f$3 = cameraPresenceProviderExternalSyntheticLambda6;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = LoanInterestCalculatorActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3);
        int i4 = onExtraCallback + 33;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }
}
