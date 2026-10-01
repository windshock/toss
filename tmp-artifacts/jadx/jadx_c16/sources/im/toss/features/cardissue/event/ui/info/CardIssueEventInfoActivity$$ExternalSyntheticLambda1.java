package im.toss.features.cardissue.event.ui.info;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardIssueEventInfoActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ CardIssueEventInfoActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnExtraCallback = CardIssueEventInfoActivity.onExtraCallback(this.f$0, (SetDetectableSize) obj);
            int i3 = 11 / 0;
        } else {
            unitOnExtraCallback = CardIssueEventInfoActivity.onExtraCallback(this.f$0, (SetDetectableSize) obj);
        }
        int i4 = onExtraCallbackWithResult + 1;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
