package o;

import androidx.lifecycle.WithLifecycleStateKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class AndroidTextContextMenuToolbarProviderExternalSyntheticLambda7$onExtraCallbackWithResult implements Function1<Throwable, Unit> {
    final /* synthetic */ WithLifecycleStateKt.suspendWithStateAtLeastUnchecked.2.observer.1 IAuthTabCallback;
    final /* synthetic */ GeckoHubImp onExtraCallback;
    final /* synthetic */ TextFieldKeyInputExternalSyntheticLambda9 onExtraCallbackWithResult;

    AndroidTextContextMenuToolbarProviderExternalSyntheticLambda7$onExtraCallbackWithResult(GeckoHubImp geckoHubImp, TextFieldKeyInputExternalSyntheticLambda9 textFieldKeyInputExternalSyntheticLambda9, WithLifecycleStateKt.suspendWithStateAtLeastUnchecked.2.observer.1 r3) {
        this.onExtraCallback = geckoHubImp;
        this.onExtraCallbackWithResult = textFieldKeyInputExternalSyntheticLambda9;
        this.IAuthTabCallback = r3;
    }

    public /* synthetic */ Object invoke(Object obj) {
        IAuthTabCallback((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void IAuthTabCallback(Throwable th) {
        GeckoHubImp geckoHubImp = this.onExtraCallback;
        access13600 access13600Var = access13600.IAuthTabCallback;
        if (geckoHubImp.onExtraCallbackWithResult(access13600Var)) {
            GeckoHubImp geckoHubImp2 = this.onExtraCallback;
            final TextFieldKeyInputExternalSyntheticLambda9 textFieldKeyInputExternalSyntheticLambda9 = this.onExtraCallbackWithResult;
            final WithLifecycleStateKt.suspendWithStateAtLeastUnchecked.2.observer.1 r3 = this.IAuthTabCallback;
            geckoHubImp2.onWarmupCompleted(access13600Var, new Runnable() { // from class: o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda7$onExtraCallbackWithResult.1
                @Override // java.lang.Runnable
                public final void run() {
                    textFieldKeyInputExternalSyntheticLambda9.onExtraCallbackWithResult(r3);
                }
            });
            return;
        }
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(this.IAuthTabCallback);
    }
}
