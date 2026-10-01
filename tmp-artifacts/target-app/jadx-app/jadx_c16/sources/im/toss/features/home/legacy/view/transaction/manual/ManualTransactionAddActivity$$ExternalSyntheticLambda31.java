package im.toss.features.home.legacy.view.transaction.manual;

import im.toss.uikit.widget.TdsSegmentedControlV1ItemView;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionAddActivity$$ExternalSyntheticLambda31 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ ManualTransactionAddActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(ManualTransactionAddActivity.onNavigationEvent(this.f$0, (TdsSegmentedControlV1ItemView) obj));
        int i4 = onNavigationEvent + 111;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }
}
