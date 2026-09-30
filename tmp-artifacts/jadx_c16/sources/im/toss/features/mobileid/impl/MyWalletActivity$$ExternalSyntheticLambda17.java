package im.toss.features.mobileid.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.FlowRowOverflowCompanionExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MyWalletActivity$$ExternalSyntheticLambda17 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ MyWalletActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            MyWalletActivity.asBinder(this.f$0, (FlowRowOverflowCompanionExternalSyntheticLambda4) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitAsBinder = MyWalletActivity.asBinder(this.f$0, (FlowRowOverflowCompanionExternalSyntheticLambda4) obj);
        int i3 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitAsBinder;
    }
}
