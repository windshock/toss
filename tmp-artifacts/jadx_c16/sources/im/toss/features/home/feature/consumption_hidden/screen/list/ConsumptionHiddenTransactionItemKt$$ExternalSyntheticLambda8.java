package im.toss.features.home.feature.consumption_hidden.screen.list;

import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.BizPermissionManager;
import o.RVGroup;
import o.useAndConfigureProgramWithTexture;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionHiddenTransactionItemKt$$ExternalSyntheticLambda8 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ BizPermissionManager f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {this.f$0, (useAndConfigureProgramWithTexture) obj};
            int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Object[] objArr2 = {this.f$0, (useAndConfigureProgramWithTexture) obj};
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        Unit unit = (Unit) RVGroup.onNavigationEvent(-1171909754, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), objArr2, iOnExtraCallbackWithResult2, 1171909756);
        int i3 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 60 / 0;
        }
        return unit;
    }
}
