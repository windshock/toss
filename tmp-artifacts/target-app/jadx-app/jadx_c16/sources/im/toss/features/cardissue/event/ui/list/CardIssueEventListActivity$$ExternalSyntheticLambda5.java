package im.toss.features.cardissue.event.ui.list;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardIssueEventListActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ CardIssueEventListActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            CardIssueEventListActivity.onExtraCallbackWithResult(this.f$0, (SetDetectableSize) obj);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = CardIssueEventListActivity.onExtraCallbackWithResult(this.f$0, (SetDetectableSize) obj);
        int i3 = IAuthTabCallback + 1;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
