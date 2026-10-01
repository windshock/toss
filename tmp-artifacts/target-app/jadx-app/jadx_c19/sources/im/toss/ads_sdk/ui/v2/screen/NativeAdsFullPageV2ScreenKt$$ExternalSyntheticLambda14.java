package im.toss.ads_sdk.ui.v2.screen;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.getWindowAreaStatus;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class NativeAdsFullPageV2ScreenKt$$ExternalSyntheticLambda14 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ Function1 f$0;

    public final Object invoke() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 105;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            getWindowAreaStatus.onTransact(this.f$0);
            throw null;
        }
        Unit unitOnTransact = getWindowAreaStatus.onTransact(this.f$0);
        int i4 = onExtraCallback + 61;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }
}
