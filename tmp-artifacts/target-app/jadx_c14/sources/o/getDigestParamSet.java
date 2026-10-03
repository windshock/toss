package o;

import viva.republica.toss.cardrecommend.issuev2.ui.CardIssueSubmitFragment;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getDigestParamSet implements setSize<CardIssueSubmitFragment> {
    public static void IAuthTabCallback(CardIssueSubmitFragment cardIssueSubmitFragment, SessionTrackerb sessionTrackerb) {
        cardIssueSubmitFragment.tossRouter = sessionTrackerb;
    }

    public static void onExtraCallback(CardIssueSubmitFragment cardIssueSubmitFragment, DefaultMediaViewVideoRenderer defaultMediaViewVideoRenderer) {
        cardIssueSubmitFragment.cardIssueApi = defaultMediaViewVideoRenderer;
    }
}
