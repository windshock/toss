package im.toss.features.mobileid.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.AnrPluginExternalSyntheticLambda1;
import o.setAutoCaptured;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MyWalletActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ MyWalletActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (AnrPluginExternalSyntheticLambda1) obj};
        int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
        Unit unit = (Unit) MyWalletActivity.IAuthTabCallback(objArr, setAutoCaptured.onExtraCallbackWithResult(), -441971770, setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, setAutoCaptured.onExtraCallbackWithResult(), 441971788);
        int i4 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
