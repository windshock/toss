package im.toss.features.home.core.ui.base;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import o.AutoExtension;
import o.DefaultImpl;
import o.RenderInTransitionOverlayNodeElement;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeWindowInsetsKt$$ExternalSyntheticLambda0 implements RenderInTransitionOverlayNodeElement {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ View f$0;
    public final /* synthetic */ DefaultImpl f$1;
    public final /* synthetic */ View f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ View f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ HomeWindowInsetsKt$$ExternalSyntheticLambda0(View view, DefaultImpl defaultImpl, View view2, int i, View view3, int i2) {
        this.f$0 = view;
        this.f$1 = defaultImpl;
        this.f$2 = view2;
        this.f$3 = i;
        this.f$4 = view3;
        this.f$5 = i2;
    }

    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return AutoExtension.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, view, windowInsetsCompat);
        }
        WindowInsetsCompat windowInsetsCompatOnExtraCallback = AutoExtension.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, view, windowInsetsCompat);
        int i3 = 38 / 0;
        return windowInsetsCompatOnExtraCallback;
    }
}
