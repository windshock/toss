package im.toss.features.home.legacy.view.transaction.manual;

import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.deserializeUriNullableCollection;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionAddActivity$$ExternalSyntheticLambda9 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ ManualTransactionAddActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ManualTransactionAddActivity manualTransactionAddActivity = this.f$0;
        deserializeUriNullableCollection deserializeurinullablecollection = (deserializeUriNullableCollection) obj;
        if (i3 != 0) {
            int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            return (Unit) ManualTransactionAddActivity.onExtraCallbackWithResult(new Object[]{manualTransactionAddActivity, deserializeurinullablecollection}, -854317575, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 854317586, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted);
        }
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        Unit unit = (Unit) ManualTransactionAddActivity.onExtraCallbackWithResult(new Object[]{manualTransactionAddActivity, deserializeurinullablecollection}, -854317575, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 854317586, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted2);
        int i4 = 26 / 0;
        return unit;
    }
}
