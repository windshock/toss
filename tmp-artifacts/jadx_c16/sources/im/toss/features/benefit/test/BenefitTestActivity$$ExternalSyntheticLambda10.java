package im.toss.features.benefit.test;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import o.RenderInTransitionOverlayNodeElement;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitTestActivity$$ExternalSyntheticLambda10 implements RenderInTransitionOverlayNodeElement {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        WindowInsetsCompat windowInsetsCompatIAuthTabCallback = BenefitTestActivity.IAuthTabCallback(view, windowInsetsCompat);
        int i4 = onNavigationEvent + 23;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return windowInsetsCompatIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
