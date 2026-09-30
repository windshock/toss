package im.toss.features.home.legacy.view.transaction.manual;

import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionAddActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ ManualTransactionAddActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (Throwable) obj};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        Unit unit = (Unit) ManualTransactionAddActivity.onExtraCallbackWithResult(objArr, -223720348, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 223720366, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted);
        int i4 = onWarmupCompleted + 63;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}
