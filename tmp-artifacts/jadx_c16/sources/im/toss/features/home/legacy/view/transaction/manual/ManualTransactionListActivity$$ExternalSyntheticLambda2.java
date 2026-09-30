package im.toss.features.home.legacy.view.transaction.manual;

import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionListActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ ManualTransactionListActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (ArrayList) obj};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        Unit unit = (Unit) ManualTransactionListActivity.onNavigationEvent(926419708, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, -926419705);
        int i4 = onWarmupCompleted + 47;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
