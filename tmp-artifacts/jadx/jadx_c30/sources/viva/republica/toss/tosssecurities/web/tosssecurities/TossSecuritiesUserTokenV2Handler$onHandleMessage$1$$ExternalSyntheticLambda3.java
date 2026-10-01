package viva.republica.toss.tosssecurities.web.tosssecurities;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getStateDataMapBuffer;
import o.startRunning;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class TossSecuritiesUserTokenV2Handler$onHandleMessage$1$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ TossSecuritiesUserTokenV2Handler$onHandleMessage$1$$ExternalSyntheticLambda3(String str, String str2) {
        this.f$0 = str;
        this.f$1 = str2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = getStateDataMapBuffer.onNavigationEvent.onWarmupCompleted(this.f$0, this.f$1, (startRunning) obj);
        int i4 = IAuthTabCallback + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
