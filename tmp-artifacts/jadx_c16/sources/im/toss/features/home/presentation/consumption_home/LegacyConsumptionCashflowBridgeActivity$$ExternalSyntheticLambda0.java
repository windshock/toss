package im.toss.features.home.presentation.consumption_home;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyConsumptionCashflowBridgeActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ LegacyConsumptionCashflowBridgeActivity f$0;
    public final /* synthetic */ Uri f$1;

    public /* synthetic */ LegacyConsumptionCashflowBridgeActivity$$ExternalSyntheticLambda0(LegacyConsumptionCashflowBridgeActivity legacyConsumptionCashflowBridgeActivity, Uri uri) {
        this.f$0 = legacyConsumptionCashflowBridgeActivity;
        this.f$1 = uri;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = LegacyConsumptionCashflowBridgeActivity.onNavigationEvent(this.f$0, this.f$1, (String) obj);
        int i4 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
