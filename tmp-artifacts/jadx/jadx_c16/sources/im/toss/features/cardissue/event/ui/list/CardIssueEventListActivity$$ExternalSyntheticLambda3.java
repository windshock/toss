package im.toss.features.cardissue.event.ui.list;

import im.toss.features.cardissue.event.model.issuance.EventIssuanceItemResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardIssueEventListActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ CardIssueEventListActivity f$0;
    public final /* synthetic */ EventIssuanceItemResponse f$1;

    public /* synthetic */ CardIssueEventListActivity$$ExternalSyntheticLambda3(CardIssueEventListActivity cardIssueEventListActivity, EventIssuanceItemResponse eventIssuanceItemResponse) {
        this.f$0 = cardIssueEventListActivity;
        this.f$1 = eventIssuanceItemResponse;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            CardIssueEventListActivity.onExtraCallback(this.f$0, this.f$1, ((Boolean) obj).booleanValue());
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = CardIssueEventListActivity.onExtraCallback(this.f$0, this.f$1, ((Boolean) obj).booleanValue());
        int i3 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallback;
        }
        obj2.hashCode();
        throw null;
    }
}
