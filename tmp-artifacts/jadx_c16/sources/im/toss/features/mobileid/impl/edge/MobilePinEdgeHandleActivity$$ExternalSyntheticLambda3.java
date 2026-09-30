package im.toss.features.mobileid.impl.edge;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobilePinEdgeHandleActivity$$ExternalSyntheticLambda3 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ MobilePinEdgeHandleActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        MobilePinEdgeHandleActivity mobilePinEdgeHandleActivity = this.f$0;
        if (i3 != 0) {
            return MobilePinEdgeHandleActivity.onExtraCallbackWithResult(mobilePinEdgeHandleActivity);
        }
        MobilePinEdgeHandleActivity.onExtraCallbackWithResult(mobilePinEdgeHandleActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
