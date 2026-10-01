package im.toss.features.home.feature.cashflow;

import im.toss.tosssecurities.webview.composable.WarmUpWebViewComposableKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowViewModel$$ExternalSyntheticLambda18 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CashflowViewModel f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CashflowViewModel cashflowViewModel = this.f$0;
        SetDetectableSize setDetectableSize = (SetDetectableSize) obj;
        if (i3 != 0) {
            int iOnExtraCallback = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback2 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            int iOnExtraCallback3 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
            return (Unit) CashflowViewModel.onExtraCallbackWithResult(iOnExtraCallback2, iOnExtraCallback, WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback(), 849988159, iOnExtraCallback3, -849988153, new Object[]{cashflowViewModel, setDetectableSize});
        }
        int iOnExtraCallback4 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback5 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        int iOnExtraCallback6 = WarmUpWebViewComposableKt$.ExternalSyntheticLambda10.onExtraCallback();
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
