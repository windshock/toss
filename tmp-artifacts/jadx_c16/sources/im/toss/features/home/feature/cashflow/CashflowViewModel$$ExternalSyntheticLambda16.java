package im.toss.features.home.feature.cashflow;

import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowViewModel$$ExternalSyntheticLambda16 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ String f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f$0;
        SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
        if (i3 == 0) {
            int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            return (Unit) CashflowViewModel.onExtraCallbackWithResult(iOnExtraCallback2, iOnExtraCallback, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1677097410, iOnExtraCallback3, -1677097403, new Object[]{str, setDetectableSize});
        }
        int iOnExtraCallback4 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback5 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback6 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        Unit unit = (Unit) CashflowViewModel.onExtraCallbackWithResult(iOnExtraCallback5, iOnExtraCallback4, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 1677097410, iOnExtraCallback6, -1677097403, new Object[]{str, setDetectableSize});
        int i4 = 29 / 0;
        return unit;
    }
}
