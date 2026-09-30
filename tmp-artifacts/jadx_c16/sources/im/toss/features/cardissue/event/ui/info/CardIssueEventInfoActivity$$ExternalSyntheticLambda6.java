package im.toss.features.cardissue.event.ui.info;

import kotlin.jvm.functions.Function0;
import o.SystemSettingFieldGroup3;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardIssueEventInfoActivity$$ExternalSyntheticLambda6 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ CardIssueEventInfoActivity f$0;
    public final /* synthetic */ SystemSettingFieldGroup3 f$1;

    public /* synthetic */ CardIssueEventInfoActivity$$ExternalSyntheticLambda6(CardIssueEventInfoActivity cardIssueEventInfoActivity, SystemSettingFieldGroup3 systemSettingFieldGroup3) {
        this.f$0 = cardIssueEventInfoActivity;
        this.f$1 = systemSettingFieldGroup3;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CardIssueEventInfoActivity cardIssueEventInfoActivity = this.f$0;
        if (i3 != 0) {
            return CardIssueEventInfoActivity.onExtraCallback(cardIssueEventInfoActivity, this.f$1);
        }
        CardIssueEventInfoActivity.onExtraCallback(cardIssueEventInfoActivity, this.f$1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
