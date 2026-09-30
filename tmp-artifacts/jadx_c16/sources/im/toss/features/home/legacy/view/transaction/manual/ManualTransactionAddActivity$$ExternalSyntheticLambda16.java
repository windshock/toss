package im.toss.features.home.legacy.view.transaction.manual;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionAddActivity$$ExternalSyntheticLambda16 implements deserializeFloat {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ManualTransactionAddActivity.onTransact(this.f$0, obj);
        int i4 = IAuthTabCallback + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
