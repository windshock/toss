package im.toss.features.account_terminator.ui.viewmodel;

import kotlin.jvm.functions.Function1;
import o.getCurrentColorScheme;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateTransferResultViewModel$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i2 % 128;
        getCurrentColorScheme getcurrentcolorscheme = (getCurrentColorScheme) obj;
        if (i2 % 2 != 0) {
            return AccountTerminateTransferResultViewModel.onExtraCallback(getcurrentcolorscheme);
        }
        AccountTerminateTransferResultViewModel.onExtraCallback(getcurrentcolorscheme);
        throw null;
    }
}
