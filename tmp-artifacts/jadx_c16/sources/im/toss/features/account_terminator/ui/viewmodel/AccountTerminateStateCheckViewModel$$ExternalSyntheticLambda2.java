package im.toss.features.account_terminator.ui.viewmodel;

import im.toss.features.account_terminator.core.model.AccountStateCheckResultDto;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AccountTerminateStateCheckViewModel$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnExtraCallback = AccountTerminateStateCheckViewModel.onExtraCallback((AccountStateCheckResultDto) obj);
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        return charSequenceOnExtraCallback;
    }
}
