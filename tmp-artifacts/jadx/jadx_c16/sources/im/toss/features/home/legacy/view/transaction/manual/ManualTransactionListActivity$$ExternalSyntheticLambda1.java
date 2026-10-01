package im.toss.features.home.legacy.view.transaction.manual;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import o.deserializeIntNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionListActivity$$ExternalSyntheticLambda1 implements deserializeIntNullableCollection {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ Function1 f$0;

    public final Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            ManualTransactionListActivity.onTransact(this.f$0, obj);
            throw null;
        }
        ArrayList arrayListOnTransact = ManualTransactionListActivity.onTransact(this.f$0, obj);
        int i3 = onNavigationEvent + 57;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 61 / 0;
        }
        return arrayListOnTransact;
    }
}
