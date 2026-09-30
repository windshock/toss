package im.toss.features.loan.widget;

import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getErrCode;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanTermsV2CustomContentKt$$ExternalSyntheticLambda0 implements Function2 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Integer f$1;
    public final /* synthetic */ Integer f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ Float f$4;

    public /* synthetic */ LoanTermsV2CustomContentKt$$ExternalSyntheticLambda0(boolean z, Integer num, Integer num2, String str, Float f) {
        this.f$0 = z;
        this.f$1 = num;
        this.f$2 = num2;
        this.f$3 = str;
        this.f$4 = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z = this.f$0;
            int iIntValue = ((Integer) obj2).intValue();
            throw null;
        }
        boolean z2 = this.f$0;
        int iIntValue2 = ((Integer) obj2).intValue();
        Unit unit = (Unit) getErrCode.onNavigationEvent(206822653, -206822650, new Object[]{Boolean.valueOf(z2), this.f$1, this.f$2, this.f$3, this.f$4, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue2)}, MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult());
        int i3 = onNavigationEvent + 57;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }
}
