package im.toss.feature.credit.ui.kcbsurvey.notification;

import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KcbSurveyNotificationTermAlreadyAgreedActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ KcbSurveyNotificationTermAlreadyAgreedActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KcbSurveyNotificationTermAlreadyAgreedActivity kcbSurveyNotificationTermAlreadyAgreedActivity = this.f$0;
        TdsTopV2View tdsTopV2View = (TdsTopV2View) obj;
        if (i3 != 0) {
            return KcbSurveyNotificationTermAlreadyAgreedActivity.IAuthTabCallback(kcbSurveyNotificationTermAlreadyAgreedActivity, tdsTopV2View);
        }
        KcbSurveyNotificationTermAlreadyAgreedActivity.IAuthTabCallback(kcbSurveyNotificationTermAlreadyAgreedActivity, tdsTopV2View);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
