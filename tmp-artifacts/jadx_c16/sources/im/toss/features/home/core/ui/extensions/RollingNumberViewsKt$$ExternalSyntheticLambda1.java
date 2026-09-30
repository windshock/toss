package im.toss.features.home.core.ui.extensions;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.fillData;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class RollingNumberViewsKt$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ fillData f$1;

    public /* synthetic */ RollingNumberViewsKt$$ExternalSyntheticLambda1(Function1 function1, fillData filldata) {
        this.f$0 = function1;
        this.f$1 = filldata;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = RollingNumberViewsKt.IAuthTabCallback(this.f$0, this.f$1, (View) obj);
        int i4 = onNavigationEvent + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
