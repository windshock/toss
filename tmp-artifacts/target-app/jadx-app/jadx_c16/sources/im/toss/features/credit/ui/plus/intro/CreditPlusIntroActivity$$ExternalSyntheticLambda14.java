package im.toss.features.credit.ui.plus.intro;

import im.toss.features.credit.data.response.Disclaimer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusIntroActivity$$ExternalSyntheticLambda14 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ Disclaimer f$0;
    public final /* synthetic */ CreditPlusIntroActivity f$1;

    public /* synthetic */ CreditPlusIntroActivity$$ExternalSyntheticLambda14(Disclaimer disclaimer, CreditPlusIntroActivity creditPlusIntroActivity) {
        this.f$0 = disclaimer;
        this.f$1 = creditPlusIntroActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = CreditPlusIntroActivity.IAuthTabCallback(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onExtraCallback + 41;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
        return unitIAuthTabCallback;
    }
}
