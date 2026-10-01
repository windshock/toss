package viva.republica.toss.main.more.notification.adapter.delegate;

import kotlin.jvm.functions.Function2;
import o.AppNode;
import o.onRewardedInterstitialClosed;
import viva.republica.toss.main.more.notification.adapter.model.RecentNotificationSectionItem;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class NotificationAdapterDelegateFactory$$ExternalSyntheticLambda2 implements Function2 {
    public final Object invoke(Object obj, Object obj2) {
        return onRewardedInterstitialClosed.onNavigationEvent((AppNode) obj, (RecentNotificationSectionItem.NotificationHeader) obj2);
    }
}
