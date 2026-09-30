package im.toss.features.home.presentation.dst_regular_consumption_remove;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstRegularConsumptionRemoveActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ HomeDstRegularConsumptionRemoveActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ HomeDstRegularConsumptionRemoveActivity$$ExternalSyntheticLambda0(HomeDstRegularConsumptionRemoveActivity homeDstRegularConsumptionRemoveActivity, String str) {
        this.f$0 = homeDstRegularConsumptionRemoveActivity;
        this.f$1 = str;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = HomeDstRegularConsumptionRemoveActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (View) obj);
        int i4 = onNavigationEvent + 103;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
