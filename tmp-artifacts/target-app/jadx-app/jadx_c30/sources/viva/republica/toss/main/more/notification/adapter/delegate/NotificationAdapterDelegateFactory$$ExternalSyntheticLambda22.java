package viva.republica.toss.main.more.notification.adapter.delegate;

import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.AppMsgReceiver2;
import o.onRewardedInterstitialClosed;
import viva.republica.toss.main.more.notification.adapter.model.RecentNotificationSectionItem;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class NotificationAdapterDelegateFactory$$ExternalSyntheticLambda22 implements Function2 {
    public final Object invoke(Object obj, Object obj2) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (Unit) onRewardedInterstitialClosed.onExtraCallback(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1311373484, 1311373492, new Object[]{(AppMsgReceiver2) obj, (RecentNotificationSectionItem.RecentNotificationTitle) obj2});
    }
}
