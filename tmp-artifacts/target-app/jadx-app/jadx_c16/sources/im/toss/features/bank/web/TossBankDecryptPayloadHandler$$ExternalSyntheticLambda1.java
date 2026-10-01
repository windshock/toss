package im.toss.features.bank.web;

import com.facebook.internal.ICustomTabsCallbackStubProxy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.setOnOutOfMemeryErrorCallback;
import o.setValueZero;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankDecryptPayloadHandler$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ setOnOutOfMemeryErrorCallback f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (String) obj};
        Unit unit = (Unit) setValueZero.onExtraCallbackWithResult(ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), objArr, 466135543, -466135543, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback());
        int i4 = onNavigationEvent + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
