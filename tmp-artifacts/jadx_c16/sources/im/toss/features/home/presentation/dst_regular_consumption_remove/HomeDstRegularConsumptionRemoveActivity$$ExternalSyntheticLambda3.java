package im.toss.features.home.presentation.dst_regular_consumption_remove;

import android.content.DialogInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeDstRegularConsumptionRemoveActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ HomeDstRegularConsumptionRemoveActivity$$ExternalSyntheticLambda3(String str, String str2, String str3) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
    }

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnExtraCallback = HomeDstRegularConsumptionRemoveActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, (DialogInterface) obj);
            int i3 = 12 / 0;
        } else {
            unitOnExtraCallback = HomeDstRegularConsumptionRemoveActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, (DialogInterface) obj);
        }
        int i4 = onNavigationEvent + 9;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
