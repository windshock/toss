package im.toss.features.account_terminator.ui.viewmodel;

import im.toss.features.account_terminator.core.model.AccountTransferResultDto;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateStateCheckViewModel$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnExtraCallback = AccountTerminateStateCheckViewModel.onExtraCallback((AccountTransferResultDto) obj);
        int i4 = onExtraCallback + 29;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return charSequenceOnExtraCallback;
    }
}
