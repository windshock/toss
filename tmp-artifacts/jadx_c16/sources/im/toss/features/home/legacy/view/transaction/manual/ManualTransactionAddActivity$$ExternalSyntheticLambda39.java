package im.toss.features.home.legacy.view.transaction.manual;

import kotlin.jvm.functions.Function1;
import o.deserializeFloat;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionAddActivity$$ExternalSyntheticLambda39 implements deserializeFloat {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ Function1 f$0;

    public final void accept(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            ManualTransactionAddActivity.getInterfaceDescriptor(this.f$0, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ManualTransactionAddActivity.getInterfaceDescriptor(this.f$0, obj);
        int i3 = onExtraCallback + 15;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }
}
