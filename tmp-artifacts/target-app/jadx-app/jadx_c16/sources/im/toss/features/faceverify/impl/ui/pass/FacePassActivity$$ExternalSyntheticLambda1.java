package im.toss.features.faceverify.impl.ui.pass;

import com.facebook.internal.ICustomTabsCallbackStubProxy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FacePassActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ String f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (SetDetectableSize) obj};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        Unit unit = (Unit) FacePassActivity.onExtraCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), -1860369038, objArr, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, 1860369038);
        int i4 = IAuthTabCallback + 81;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
