package im.toss.features.faceverify.impl.ui.pass;

import com.facebook.internal.ICustomTabsCallbackStubProxy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FacePassActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ String f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (SetDetectableSize) obj};
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        int iOnExtraCallback2 = ICustomTabsCallbackStubProxy.onExtraCallback();
        if (i3 == 0) {
            return (Unit) FacePassActivity.onExtraCallback(ICustomTabsCallbackStubProxy.onExtraCallback(), -379049173, objArr, ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, 379049176);
        }
        throw null;
    }
}
