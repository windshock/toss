package im.toss.features.home.presentation.dst_regular_consumption_remove;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstRegularConsumptionRemoveActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ HomeDstRegularConsumptionRemoveActivity f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ String f$4;

    public /* synthetic */ HomeDstRegularConsumptionRemoveActivity$$ExternalSyntheticLambda6(String str, HomeDstRegularConsumptionRemoveActivity homeDstRegularConsumptionRemoveActivity, String str2, String str3, String str4) {
        this.f$0 = str;
        this.f$1 = homeDstRegularConsumptionRemoveActivity;
        this.f$2 = str2;
        this.f$3 = str3;
        this.f$4 = str4;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = HomeDstRegularConsumptionRemoveActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (CommonModule_setLeftEdgeTouchEnabled) obj);
        int i4 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
