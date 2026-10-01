package im.toss.features.mobileid.impl;

import im.toss.features.mobileid.impl.wallet.MyWalletFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.endPrefixMapping;
import o.setAutoCaptured;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MyWalletActivity$$ExternalSyntheticLambda10 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ MyWalletFragment f$0;
    public final /* synthetic */ MyWalletActivity f$1;

    public /* synthetic */ MyWalletActivity$$ExternalSyntheticLambda10(MyWalletFragment myWalletFragment, MyWalletActivity myWalletActivity) {
        this.f$0 = myWalletFragment;
        this.f$1 = myWalletActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, (endPrefixMapping) obj, (Function1) obj2};
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        Unit unit = (Unit) MyWalletActivity.IAuthTabCallback(objArr, setAutoCaptured.onExtraCallbackWithResult(), 1708106323, setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setAutoCaptured.onExtraCallbackWithResult(), -1708106312);
        int i4 = onWarmupCompleted + 119;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
