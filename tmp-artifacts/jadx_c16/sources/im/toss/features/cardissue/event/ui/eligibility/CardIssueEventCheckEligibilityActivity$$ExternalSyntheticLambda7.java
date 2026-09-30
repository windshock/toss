package im.toss.features.cardissue.event.ui.eligibility;

import android.content.DialogInterface;
import im.toss.features.loan.comparison.result.view.LoanComparisonResultWarningNoticeView;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardIssueEventCheckEligibilityActivity$$ExternalSyntheticLambda7 implements DialogInterface.OnDismissListener {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CardIssueEventCheckEligibilityActivity f$0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, dialogInterface};
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        CardIssueEventCheckEligibilityActivity.onNavigationEvent(iOnWarmupCompleted, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), objArr, -550484841, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted2, 550484841);
        int i4 = onExtraCallback + 7;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
    }
}
