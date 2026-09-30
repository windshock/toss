package im.toss.features.cardissue.event.ui.eligibility;

import android.view.View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardIssueEventCheckEligibilityActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ CardIssueEventCheckEligibilityActivity f$0;
    public final /* synthetic */ TdsBottomCtaV1View f$1;

    public /* synthetic */ CardIssueEventCheckEligibilityActivity$$ExternalSyntheticLambda6(CardIssueEventCheckEligibilityActivity cardIssueEventCheckEligibilityActivity, TdsBottomCtaV1View tdsBottomCtaV1View) {
        this.f$0 = cardIssueEventCheckEligibilityActivity;
        this.f$1 = tdsBottomCtaV1View;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = CardIssueEventCheckEligibilityActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (View) obj);
        int i4 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
