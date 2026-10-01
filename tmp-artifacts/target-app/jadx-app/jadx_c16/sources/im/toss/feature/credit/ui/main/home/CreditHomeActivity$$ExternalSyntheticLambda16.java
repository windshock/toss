package im.toss.feature.credit.ui.main.home;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import o.RenderInTransitionOverlayNodeElement;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditHomeActivity$$ExternalSyntheticLambda16 implements RenderInTransitionOverlayNodeElement {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CreditHomeActivity f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ int f$6;

    public /* synthetic */ CreditHomeActivity$$ExternalSyntheticLambda16(CreditHomeActivity creditHomeActivity, int i, int i2, int i3, int i4, int i5, int i6) {
        this.f$0 = creditHomeActivity;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = i3;
        this.f$4 = i4;
        this.f$5 = i5;
        this.f$6 = i6;
    }

    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, Integer.valueOf(this.f$1), Integer.valueOf(this.f$2), Integer.valueOf(this.f$3), Integer.valueOf(this.f$4), Integer.valueOf(this.f$5), Integer.valueOf(this.f$6), view, windowInsetsCompat};
        WindowInsetsCompat windowInsetsCompat2 = (WindowInsetsCompat) CreditHomeActivity.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 76334346, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -76334323);
        int i4 = IAuthTabCallback + 53;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return windowInsetsCompat2;
    }
}
