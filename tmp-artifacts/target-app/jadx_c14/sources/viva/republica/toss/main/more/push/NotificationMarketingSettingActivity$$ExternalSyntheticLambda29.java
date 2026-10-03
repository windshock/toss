package viva.republica.toss.main.more.push;

import im.toss.network.model.BaseApiResponse;
import java.util.Random;
import kotlin.jvm.functions.Function1;
import o.onRewardedAdCompleted;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class NotificationMarketingSettingActivity$$ExternalSyntheticLambda29 implements Function1 {
    public static int IAuthTabCallback;
    public static int onExtraCallbackWithResult;
    public final /* synthetic */ NotificationMarketingSettingActivity f$0;
    public final /* synthetic */ onRewardedAdCompleted.onExtraCallbackWithResult f$1;

    public /* synthetic */ NotificationMarketingSettingActivity$$ExternalSyntheticLambda29(NotificationMarketingSettingActivity notificationMarketingSettingActivity, onRewardedAdCompleted.onExtraCallbackWithResult onextracallbackwithresult) {
        this.f$0 = notificationMarketingSettingActivity;
        this.f$1 = onextracallbackwithresult;
    }

    public static int IAuthTabCallback() {
        int i = onExtraCallbackWithResult;
        int i2 = i % 9982945;
        onExtraCallbackWithResult = i + 1;
        if (i2 != 0) {
            return IAuthTabCallback;
        }
        int iNextInt = new Random().nextInt(492596471);
        IAuthTabCallback = iNextInt;
        return iNextInt;
    }

    public final Object invoke(Object obj) {
        return NotificationMarketingSettingActivity.onNavigationEvent(this.f$0, this.f$1, (BaseApiResponse) obj);
    }
}
