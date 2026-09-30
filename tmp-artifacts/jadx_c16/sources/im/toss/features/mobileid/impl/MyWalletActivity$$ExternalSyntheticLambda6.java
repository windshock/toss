package im.toss.features.mobileid.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setAutoCaptured;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MyWalletActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ MyWalletActivity f$0;

    public final Object invoke(Object obj) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            unit = (Unit) MyWalletActivity.IAuthTabCallback(new Object[]{this.f$0, Boolean.valueOf(((Boolean) obj).booleanValue())}, setAutoCaptured.onExtraCallbackWithResult(), -1788899204, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), 1788899217);
            int i3 = 61 / 0;
        } else {
            unit = (Unit) MyWalletActivity.IAuthTabCallback(new Object[]{this.f$0, Boolean.valueOf(((Boolean) obj).booleanValue())}, setAutoCaptured.onExtraCallbackWithResult(), -1788899204, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), 1788899217);
        }
        int i4 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
