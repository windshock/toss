package im.toss.features.home.legacy.view.transaction.manual;

import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionAddActivity$$ExternalSyntheticLambda38 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ ManualTransactionAddActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (Throwable) obj};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        Unit unit = (Unit) ManualTransactionAddActivity.onExtraCallbackWithResult(objArr, -1500302579, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1500302588, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), iOnWarmupCompleted);
        int i4 = onWarmupCompleted + 43;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
