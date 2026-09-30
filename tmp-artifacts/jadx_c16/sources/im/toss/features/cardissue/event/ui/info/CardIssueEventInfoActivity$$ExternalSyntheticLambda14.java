package im.toss.features.cardissue.event.ui.info;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardIssueEventInfoActivity$$ExternalSyntheticLambda14 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ CardIssueEventInfoActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = CardIssueEventInfoActivity.onExtraCallbackWithResult(this.f$0);
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
