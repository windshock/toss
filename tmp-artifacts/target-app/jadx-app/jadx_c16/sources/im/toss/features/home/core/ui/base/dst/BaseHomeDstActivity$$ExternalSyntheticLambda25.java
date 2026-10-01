package im.toss.features.home.core.ui.base.dst;

import kotlin.jvm.functions.Function0;
import o.IIpcChannelStubProxy;
import o.doInitialize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseHomeDstActivity$$ExternalSyntheticLambda25 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ IIpcChannelStubProxy f$0;
    public final /* synthetic */ doInitialize f$1;
    public final /* synthetic */ float f$2;

    public /* synthetic */ BaseHomeDstActivity$$ExternalSyntheticLambda25(IIpcChannelStubProxy iIpcChannelStubProxy, doInitialize doinitialize, float f) {
        this.f$0 = iIpcChannelStubProxy;
        this.f$1 = doinitialize;
        this.f$2 = f;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(BaseHomeDstActivity.onWarmupCompleted(this.f$0, this.f$1, this.f$2));
        int i4 = onExtraCallbackWithResult + 83;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
        return boolValueOf;
    }
}
