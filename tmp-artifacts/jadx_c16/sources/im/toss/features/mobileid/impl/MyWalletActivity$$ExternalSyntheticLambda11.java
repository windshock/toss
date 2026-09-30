package im.toss.features.mobileid.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.endPrefixMapping;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MyWalletActivity$$ExternalSyntheticLambda11 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ MyWalletActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = MyWalletActivity.onExtraCallback(this.f$0, (endPrefixMapping) obj, ((Float) obj2).floatValue());
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
        return unitOnExtraCallback;
    }
}
