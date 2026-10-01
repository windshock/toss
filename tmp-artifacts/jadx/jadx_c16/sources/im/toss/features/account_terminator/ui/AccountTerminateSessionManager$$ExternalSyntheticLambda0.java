package im.toss.features.account_terminator.ui;

import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.features.account_terminator.core.model.TargetAccount;
import kotlin.jvm.functions.Function1;
import o.canUseStatusBar;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateSessionManager$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {(TargetAccount) obj};
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        if (i3 != 0) {
            return (CharSequence) canUseStatusBar.onExtraCallbackWithResult(iOnExtraCallbackWithResult2, 262428195, iOnExtraCallbackWithResult3, objArr, -262428191, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult4);
        }
        throw null;
    }
}
