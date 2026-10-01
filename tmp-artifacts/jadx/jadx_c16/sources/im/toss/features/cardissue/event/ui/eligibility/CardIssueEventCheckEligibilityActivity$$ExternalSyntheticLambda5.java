package im.toss.features.cardissue.event.ui.eligibility;

import android.view.View;
import im.toss.features.loan.comparison.result.view.LoanComparisonResultWarningNoticeView;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardIssueEventCheckEligibilityActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CardIssueEventCheckEligibilityActivity f$0;
    public final /* synthetic */ TdsBottomCtaV1View f$1;

    public /* synthetic */ CardIssueEventCheckEligibilityActivity$$ExternalSyntheticLambda5(CardIssueEventCheckEligibilityActivity cardIssueEventCheckEligibilityActivity, TdsBottomCtaV1View tdsBottomCtaV1View) {
        this.f$0 = cardIssueEventCheckEligibilityActivity;
        this.f$1 = tdsBottomCtaV1View;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CardIssueEventCheckEligibilityActivity cardIssueEventCheckEligibilityActivity = this.f$0;
        if (i3 == 0) {
            Object[] objArr = {cardIssueEventCheckEligibilityActivity, this.f$1, (View) obj};
            int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            return (Unit) CardIssueEventCheckEligibilityActivity.onNavigationEvent(iOnWarmupCompleted, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, 1511067239, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, -1511067235);
        }
        Object[] objArr2 = {cardIssueEventCheckEligibilityActivity, this.f$1, (View) obj};
        int iOnWarmupCompleted3 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted4 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        throw null;
    }
}
