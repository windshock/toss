package o;

import viva.republica.toss.card.CardTransactionSchemeActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class LazyDERSequence implements setSize<CardTransactionSchemeActivity> {
    public static void onWarmupCompleted(CardTransactionSchemeActivity cardTransactionSchemeActivity, SessionTrackerb sessionTrackerb) {
        cardTransactionSchemeActivity.tossRouter = sessionTrackerb;
    }

    public static void onExtraCallbackWithResult(CardTransactionSchemeActivity cardTransactionSchemeActivity, zzad zzadVar) {
        cardTransactionSchemeActivity.environments = zzadVar;
    }
}
