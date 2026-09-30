package im.toss.features.home.legacy.view.transaction.manual;

import android.view.View;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.NativeReactDevToolsRuntimeSettingsModuleSpec;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionListActivity$$ExternalSyntheticLambda8 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ ManualTransactionListActivity f$0;
    public final /* synthetic */ NativeReactDevToolsRuntimeSettingsModuleSpec f$1;

    public /* synthetic */ ManualTransactionListActivity$$ExternalSyntheticLambda8(ManualTransactionListActivity manualTransactionListActivity, NativeReactDevToolsRuntimeSettingsModuleSpec nativeReactDevToolsRuntimeSettingsModuleSpec) {
        this.f$0 = manualTransactionListActivity;
        this.f$1 = nativeReactDevToolsRuntimeSettingsModuleSpec;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, (View) obj};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        Unit unit = (Unit) ManualTransactionListActivity.onNavigationEvent(-1173890321, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, 1173890331);
        int i4 = onNavigationEvent + 49;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
