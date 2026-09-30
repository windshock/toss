package im.toss.features.mobileid.impl.qr;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import o.RenderInTransitionOverlayNodeElement;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdQRActivity$$ExternalSyntheticLambda3 implements RenderInTransitionOverlayNodeElement {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ MobileIdQRActivity f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ int f$6;

    public /* synthetic */ MobileIdQRActivity$$ExternalSyntheticLambda3(MobileIdQRActivity mobileIdQRActivity, int i, int i2, int i3, int i4, int i5, int i6) {
        this.f$0 = mobileIdQRActivity;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = i3;
        this.f$4 = i4;
        this.f$5 = i5;
        this.f$6 = i6;
    }

    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return MobileIdQRActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, view, windowInsetsCompat);
        }
        WindowInsetsCompat windowInsetsCompatOnNavigationEvent = MobileIdQRActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, view, windowInsetsCompat);
        int i3 = 49 / 0;
        return windowInsetsCompatOnNavigationEvent;
    }
}
