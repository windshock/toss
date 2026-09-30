package im.toss.features.home.legacy.view.transaction.manual;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import o.NativeReactDevToolsSettingsManagerSpec;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionListActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ ManualTransactionListActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ArrayList arrayListIAuthTabCallback = ManualTransactionListActivity.IAuthTabCallback(this.f$0, (NativeReactDevToolsSettingsManagerSpec) obj);
        int i4 = onWarmupCompleted + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return arrayListIAuthTabCallback;
    }
}
