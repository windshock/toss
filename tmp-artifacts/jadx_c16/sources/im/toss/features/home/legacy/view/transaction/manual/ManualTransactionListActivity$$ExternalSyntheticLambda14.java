package im.toss.features.home.legacy.view.transaction.manual;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionListActivity$$ExternalSyntheticLambda14 implements deserializeFloat {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ManualTransactionListActivity.IAuthTabCallbackStub(this.f$0, obj);
        int i4 = onNavigationEvent + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
