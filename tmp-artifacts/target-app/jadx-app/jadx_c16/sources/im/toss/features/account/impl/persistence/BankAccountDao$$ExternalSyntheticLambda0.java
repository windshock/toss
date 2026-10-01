package im.toss.features.account.impl.persistence;

import java.util.List;
import kotlin.jvm.functions.Function1;
import o.createTitleBar;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BankAccountDao$$ExternalSyntheticLambda0 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 125;
        onNavigationEvent = i2 % 128;
        List list = (List) obj;
        if (i2 % 2 != 0) {
            return createTitleBar.IAuthTabCallback(list);
        }
        createTitleBar.IAuthTabCallback(list);
        throw null;
    }
}
