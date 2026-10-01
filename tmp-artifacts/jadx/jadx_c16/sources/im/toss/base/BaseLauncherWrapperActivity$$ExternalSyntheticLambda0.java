package im.toss.base;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import o.RenderInTransitionOverlayNodeElement;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseLauncherWrapperActivity$$ExternalSyntheticLambda0 implements RenderInTransitionOverlayNodeElement {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        WindowInsetsCompat windowInsetsCompatOnNavigationEvent = BaseLauncherWrapperActivity.onNavigationEvent(view, windowInsetsCompat);
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        int i5 = onExtraCallback + 19;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return windowInsetsCompatOnNavigationEvent;
    }
}
