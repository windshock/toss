package im.toss.features.cardissue.event.ui.list;

import im.toss.features.cardissue.event.model.issuance.EventIssuanceItemResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardIssueEventListActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ EventIssuanceItemResponse f$0;
    public final /* synthetic */ CardIssueEventListActivity f$1;

    public /* synthetic */ CardIssueEventListActivity$$ExternalSyntheticLambda2(EventIssuanceItemResponse eventIssuanceItemResponse, CardIssueEventListActivity cardIssueEventListActivity) {
        this.f$0 = eventIssuanceItemResponse;
        this.f$1 = cardIssueEventListActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = CardIssueEventListActivity.onExtraCallback(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i4 = onExtraCallback + 113;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return unitOnExtraCallback;
    }
}
