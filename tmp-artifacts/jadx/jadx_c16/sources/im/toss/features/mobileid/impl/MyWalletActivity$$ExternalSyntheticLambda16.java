package im.toss.features.mobileid.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.FlowRowOverflowCompanionExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MyWalletActivity$$ExternalSyntheticLambda16 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ MyWalletActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            MyWalletActivity.onExtraCallback(this.f$0, (FlowRowOverflowCompanionExternalSyntheticLambda4) obj);
            throw null;
        }
        Unit unitOnExtraCallback = MyWalletActivity.onExtraCallback(this.f$0, (FlowRowOverflowCompanionExternalSyntheticLambda4) obj);
        int i3 = IAuthTabCallback + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }
}
