package im.toss.features.mobileid.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setAutoCaptured;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MyWalletActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ MyWalletActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onWarmupCompleted = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            Object[] objArr = {this.f$0, Boolean.valueOf(((Boolean) obj).booleanValue())};
            int iOnExtraCallbackWithResult = setAutoCaptured.onExtraCallbackWithResult();
            obj2.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.f$0, Boolean.valueOf(((Boolean) obj).booleanValue())};
        int iOnExtraCallbackWithResult2 = setAutoCaptured.onExtraCallbackWithResult();
        Unit unit = (Unit) MyWalletActivity.IAuthTabCallback(objArr2, setAutoCaptured.onExtraCallbackWithResult(), -1051960081, setAutoCaptured.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, setAutoCaptured.onExtraCallbackWithResult(), 1051960089);
        int i3 = onNavigationEvent + 105;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }
}
