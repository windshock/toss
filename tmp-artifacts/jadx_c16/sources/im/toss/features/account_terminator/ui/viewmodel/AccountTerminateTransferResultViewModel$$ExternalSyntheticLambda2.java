package im.toss.features.account_terminator.ui.viewmodel;

import kotlin.jvm.functions.Function1;
import o.getCurrentColorScheme;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateTransferResultViewModel$$ExternalSyntheticLambda2 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 93;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceIAuthTabCallback = AccountTerminateTransferResultViewModel.IAuthTabCallback((getCurrentColorScheme) obj);
        int i4 = IAuthTabCallback + 123;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return charSequenceIAuthTabCallback;
    }
}
