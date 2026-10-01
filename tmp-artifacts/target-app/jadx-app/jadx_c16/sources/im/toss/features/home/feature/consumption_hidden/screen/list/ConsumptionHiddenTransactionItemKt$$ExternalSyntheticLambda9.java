package im.toss.features.home.feature.consumption_hidden.screen.list;

import androidx.compose.foundation.layout.RowScope;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import kotlin.Unit;
import o.BizPermissionManager;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.RVGroup;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionHiddenTransactionItemKt$$ExternalSyntheticLambda9 implements getBacktraceNote {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ BizPermissionManager f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        Unit unit = (Unit) RVGroup.onNavigationEvent(-1785127140, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, 1785127144);
        int i4 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return unit;
    }
}
