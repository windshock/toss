package im.toss.features.account_terminator.ui.viewmodel;

import kotlin.jvm.functions.Function1;
import o.WindowInfoProxy;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateTransferResultViewModel$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onNavigationEvent = i2 % 128;
        WindowInfoProxy windowInfoProxy = (WindowInfoProxy) obj;
        if (i2 % 2 != 0) {
            AccountTerminateTransferResultViewModel.onNavigationEvent(windowInfoProxy);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        CharSequence charSequenceOnNavigationEvent = AccountTerminateTransferResultViewModel.onNavigationEvent(windowInfoProxy);
        int i3 = onExtraCallback + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return charSequenceOnNavigationEvent;
    }
}
