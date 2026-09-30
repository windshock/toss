package im.toss.features.main.ui;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import o.RenderInTransitionOverlayNodeElement;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MainActivity$$ExternalSyntheticLambda11 implements RenderInTransitionOverlayNodeElement {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        WindowInsetsCompat windowInsetsCompat2 = (WindowInsetsCompat) MainActivity.IAuthTabCallback(new Object[]{view, windowInsetsCompat}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 722316033, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -722316022, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        int i4 = IAuthTabCallback + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return windowInsetsCompat2;
    }
}
