package im.toss.feature.credit.ui.kcbsurvey.notification;

import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KcbSurveyNotificationTermAgreedActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ KcbSurveyNotificationTermAgreedActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            KcbSurveyNotificationTermAgreedActivity.IAuthTabCallback(this.f$0, (TdsTopV2View) obj);
            throw null;
        }
        Unit unitIAuthTabCallback = KcbSurveyNotificationTermAgreedActivity.IAuthTabCallback(this.f$0, (TdsTopV2View) obj);
        int i3 = onExtraCallbackWithResult + 101;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }
}
