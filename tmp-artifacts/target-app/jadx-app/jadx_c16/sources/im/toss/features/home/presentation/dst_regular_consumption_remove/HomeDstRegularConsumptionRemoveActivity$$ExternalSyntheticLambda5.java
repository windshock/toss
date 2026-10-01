package im.toss.features.home.presentation.dst_regular_consumption_remove;

import android.content.DialogInterface;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstRegularConsumptionRemoveActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ HomeDstRegularConsumptionRemoveActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        HomeDstRegularConsumptionRemoveActivity homeDstRegularConsumptionRemoveActivity = this.f$0;
        DialogInterface dialogInterface = (DialogInterface) obj;
        if (i3 == 0) {
            return HomeDstRegularConsumptionRemoveActivity.onExtraCallback(homeDstRegularConsumptionRemoveActivity, dialogInterface);
        }
        HomeDstRegularConsumptionRemoveActivity.onExtraCallback(homeDstRegularConsumptionRemoveActivity, dialogInterface);
        throw null;
    }
}
