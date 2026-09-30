package im.toss.features.account_terminator.ui.viewmodel;

import kotlin.jvm.functions.Function1;
import o.WindowInfoProxy;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateTransferResultViewModel$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnWarmupCompleted = AccountTerminateTransferResultViewModel.onWarmupCompleted((WindowInfoProxy) obj);
        int i4 = IAuthTabCallback + 47;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return charSequenceOnWarmupCompleted;
    }
}
