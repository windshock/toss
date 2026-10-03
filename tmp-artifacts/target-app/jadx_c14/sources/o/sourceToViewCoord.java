package o;

import viva.republica.toss.home.consumption.transaction.card.CardNotificationTransactionListActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class sourceToViewCoord implements setSize<CardNotificationTransactionListActivity> {
    public static void onWarmupCompleted(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, DomainConfigProxy domainConfigProxy) {
        cardNotificationTransactionListActivity.homeChangeHelper = domainConfigProxy;
    }

    public static void onWarmupCompleted(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, SessionTrackerb sessionTrackerb) {
        cardNotificationTransactionListActivity.tossRouter = sessionTrackerb;
    }

    public static void onNavigationEvent(CardNotificationTransactionListActivity cardNotificationTransactionListActivity, zzag zzagVar) {
        cardNotificationTransactionListActivity.tossClock = zzagVar;
    }
}
