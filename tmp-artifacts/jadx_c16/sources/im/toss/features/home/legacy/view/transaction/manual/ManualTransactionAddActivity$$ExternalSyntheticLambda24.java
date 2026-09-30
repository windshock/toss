package im.toss.features.home.legacy.view.transaction.manual;

import im.toss.uikit.widget.TdsSegmentedControlV1ItemView;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionAddActivity$$ExternalSyntheticLambda24 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ ManualTransactionAddActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(ManualTransactionAddActivity.onExtraCallback(this.f$0, (TdsSegmentedControlV1ItemView) obj));
        int i4 = onWarmupCompleted + 1;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        throw null;
    }
}
