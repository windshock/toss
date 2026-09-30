package im.toss.features.home.legacy.view.transaction.manual;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.NativeReactDevToolsRuntimeSettingsModuleSpec;
import o.NativeReactDevToolsSettingsManagerSpec;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionListActivity$$ExternalSyntheticLambda13 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ ManualTransactionListActivity f$0;
    public final /* synthetic */ NativeReactDevToolsRuntimeSettingsModuleSpec f$1;

    public /* synthetic */ ManualTransactionListActivity$$ExternalSyntheticLambda13(ManualTransactionListActivity manualTransactionListActivity, NativeReactDevToolsRuntimeSettingsModuleSpec nativeReactDevToolsRuntimeSettingsModuleSpec) {
        this.f$0 = manualTransactionListActivity;
        this.f$1 = nativeReactDevToolsRuntimeSettingsModuleSpec;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            ManualTransactionListActivity.IAuthTabCallback(this.f$0, this.f$1, (NativeReactDevToolsSettingsManagerSpec) obj);
            throw null;
        }
        Unit unitIAuthTabCallback = ManualTransactionListActivity.IAuthTabCallback(this.f$0, this.f$1, (NativeReactDevToolsSettingsManagerSpec) obj);
        int i3 = onWarmupCompleted + 59;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 97 / 0;
        }
        return unitIAuthTabCallback;
    }
}
