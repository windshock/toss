package im.toss.features.cardissue.event.ui.info;

import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardIssueEventInfoActivity$$ExternalSyntheticLambda11 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ CardIssueEventInfoActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ CardIssueEventInfoActivity$$ExternalSyntheticLambda11(CardIssueEventInfoActivity cardIssueEventInfoActivity, int i) {
        this.f$0 = cardIssueEventInfoActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) CardIssueEventInfoActivity.onNavigationEvent(new Object[]{this.f$0, Integer.valueOf(this.f$1), Boolean.valueOf(((Boolean) obj).booleanValue())}, -992107184, 992107189, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
        int i4 = onExtraCallbackWithResult + 47;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
