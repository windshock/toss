package im.toss.features.account_terminator.ui.viewmodel;

import im.toss.features.account_terminator.core.model.AccountTransferResultDto;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateTransferViewModel$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnWarmupCompleted = AccountTerminateTransferViewModel.onWarmupCompleted((AccountTransferResultDto) obj);
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        int i5 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return charSequenceOnWarmupCompleted;
    }
}
