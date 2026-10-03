package viva.republica.toss.main.more.notification;

import android.os.Process;
import android.view.View;
import im.toss.featurescommon.servicetermsagreement.standardtermsv2.domain.model.response.UserTermsStateWithServiceInfoResponse;
import o.onRewardedAdCompleted;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final /* synthetic */ class NotificationSettingAdapter$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public static int onExtraCallback;
    public static int onExtraCallbackWithResult;
    public final /* synthetic */ UserTermsStateWithServiceInfoResponse f$0;

    public static int onWarmupCompleted() {
        int i = onExtraCallback;
        int i2 = i % 8790605;
        onExtraCallback = i + 1;
        if (i2 != 0) {
            return onExtraCallbackWithResult;
        }
        int iMyPid = Process.myPid();
        onExtraCallbackWithResult = iMyPid;
        return iMyPid;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        onRewardedAdCompleted.onNavigationEvent(this.f$0, view);
    }
}
