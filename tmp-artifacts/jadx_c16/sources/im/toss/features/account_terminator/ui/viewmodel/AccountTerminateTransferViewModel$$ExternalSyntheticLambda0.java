package im.toss.features.account_terminator.ui.viewmodel;

import kotlin.jvm.functions.Function1;
import o.WindowInfoProxy;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateTransferViewModel$$ExternalSyntheticLambda0 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnExtraCallback = AccountTerminateTransferViewModel.onExtraCallback((WindowInfoProxy) obj);
        int i4 = onNavigationEvent + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return charSequenceOnExtraCallback;
    }
}
