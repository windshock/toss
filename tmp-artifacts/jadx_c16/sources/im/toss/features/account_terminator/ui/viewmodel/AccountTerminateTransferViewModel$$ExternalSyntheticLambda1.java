package im.toss.features.account_terminator.ui.viewmodel;

import im.toss.features.account_terminator.core.model.AccountTransferResultDto;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateTransferViewModel$$ExternalSyntheticLambda1 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceIAuthTabCallback = AccountTerminateTransferViewModel.IAuthTabCallback((AccountTransferResultDto) obj);
        int i4 = onWarmupCompleted + 53;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return charSequenceIAuthTabCallback;
    }
}
