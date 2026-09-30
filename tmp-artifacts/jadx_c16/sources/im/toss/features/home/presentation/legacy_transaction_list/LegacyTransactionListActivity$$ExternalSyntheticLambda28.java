package im.toss.features.home.presentation.legacy_transaction_list;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.NativeReactDevToolsRuntimeSettingsModuleSpec;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda28 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LegacyTransactionListActivity f$0;
    public final /* synthetic */ NativeReactDevToolsRuntimeSettingsModuleSpec f$1;

    public /* synthetic */ LegacyTransactionListActivity$$ExternalSyntheticLambda28(LegacyTransactionListActivity legacyTransactionListActivity, NativeReactDevToolsRuntimeSettingsModuleSpec nativeReactDevToolsRuntimeSettingsModuleSpec) {
        this.f$0 = legacyTransactionListActivity;
        this.f$1 = nativeReactDevToolsRuntimeSettingsModuleSpec;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LegacyTransactionListActivity legacyTransactionListActivity = this.f$0;
        if (i3 == 0) {
            return LegacyTransactionListActivity.onNavigationEvent(legacyTransactionListActivity, this.f$1, (Pair) obj);
        }
        Unit unitOnNavigationEvent = LegacyTransactionListActivity.onNavigationEvent(legacyTransactionListActivity, this.f$1, (Pair) obj);
        int i4 = 62 / 0;
        return unitOnNavigationEvent;
    }
}
