package im.toss.feature.credit.ui.main.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda32 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CreditTestActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnMessageChannelReady = CreditTestActivity.onMessageChannelReady(this.f$0);
        int i4 = onNavigationEvent + 35;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnMessageChannelReady;
    }
}
