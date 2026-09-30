package im.toss.core.webkit;

import android.content.DialogInterface;
import android.webkit.JsResult;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setCircleColor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossWebChromeClient$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ JsResult f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (DialogInterface) obj};
        Unit unit = (Unit) setCircleColor.onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), -1341545411, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, 1341545411);
        int i4 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return unit;
    }
}
