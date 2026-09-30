package im.toss.features.home.legacy.view.transaction.manual;

import im.toss.uikit.widget.textField.NumberEditText;
import kotlin.Unit;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionAddActivity$$ExternalSyntheticLambda26 implements getBacktraceNote {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ ManualTransactionAddActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = ManualTransactionAddActivity.onNavigationEvent(this.f$0, (NumberEditText) obj, (String) obj2, (Number) obj3);
        int i4 = onWarmupCompleted + 37;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
