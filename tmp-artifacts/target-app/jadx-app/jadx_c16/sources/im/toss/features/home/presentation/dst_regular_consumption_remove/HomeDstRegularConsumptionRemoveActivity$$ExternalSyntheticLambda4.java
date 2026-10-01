package im.toss.features.home.presentation.dst_regular_consumption_remove;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstRegularConsumptionRemoveActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ HomeDstRegularConsumptionRemoveActivity f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;

    public /* synthetic */ HomeDstRegularConsumptionRemoveActivity$$ExternalSyntheticLambda4(HomeDstRegularConsumptionRemoveActivity homeDstRegularConsumptionRemoveActivity, String str, String str2, String str3) {
        this.f$0 = homeDstRegularConsumptionRemoveActivity;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = str3;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = HomeDstRegularConsumptionRemoveActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, (DialogInterface) obj);
        int i4 = onWarmupCompleted + 21;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
