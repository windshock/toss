package im.toss.features.home.presentation.legacy_transaction_list;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.NativeReactDevToolsRuntimeSettingsModuleSpec;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LegacyTransactionListActivity$$ExternalSyntheticLambda33 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LegacyTransactionListActivity f$0;
    public final /* synthetic */ NativeReactDevToolsRuntimeSettingsModuleSpec f$1;

    public /* synthetic */ LegacyTransactionListActivity$$ExternalSyntheticLambda33(LegacyTransactionListActivity legacyTransactionListActivity, NativeReactDevToolsRuntimeSettingsModuleSpec nativeReactDevToolsRuntimeSettingsModuleSpec) {
        this.f$0 = legacyTransactionListActivity;
        this.f$1 = nativeReactDevToolsRuntimeSettingsModuleSpec;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = LegacyTransactionListActivity.IAuthTabCallback(this.f$0, this.f$1, (Pair) obj);
        int i4 = onWarmupCompleted + 49;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
