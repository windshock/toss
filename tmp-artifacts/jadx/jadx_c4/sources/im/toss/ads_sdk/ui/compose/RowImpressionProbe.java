package im.toss.ads_sdk.ui.compose;

import android.graphics.Rect;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.Futures3;
import o.PageImplExternalSyntheticLambda0;
import o.WebViewCompatExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RowImpressionProbe {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private WebViewCompatExternalSyntheticLambda1 onExtraCallback;
    private final Rect onWarmupCompleted = new Rect();

    public final void onNavigationEvent(@NotNull Futures3 futures3, @NotNull View view, @NotNull Function1<? super WebViewCompatExternalSyntheticLambda1, Unit> function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(futures3, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.areEqual(PageImplExternalSyntheticLambda0.onExtraCallback(PageImplExternalSyntheticLambda0.onExtraCallback(futures3, view, this.onWarmupCompleted)), this.onExtraCallback);
            throw null;
        }
        Intrinsics.checkNotNullParameter(futures3, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function1, "");
        WebViewCompatExternalSyntheticLambda1 webViewCompatExternalSyntheticLambda1OnExtraCallback = PageImplExternalSyntheticLambda0.onExtraCallback(PageImplExternalSyntheticLambda0.onExtraCallback(futures3, view, this.onWarmupCompleted));
        if (!Intrinsics.areEqual(webViewCompatExternalSyntheticLambda1OnExtraCallback, this.onExtraCallback)) {
            this.onExtraCallback = webViewCompatExternalSyntheticLambda1OnExtraCallback;
            function1.invoke(webViewCompatExternalSyntheticLambda1OnExtraCallback);
        } else {
            int i3 = IAuthTabCallback + 93;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
    }
}
