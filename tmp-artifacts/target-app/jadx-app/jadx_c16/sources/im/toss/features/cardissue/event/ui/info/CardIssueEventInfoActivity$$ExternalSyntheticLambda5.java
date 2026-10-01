package im.toss.features.cardissue.event.ui.info;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardIssueEventInfoActivity$$ExternalSyntheticLambda5 implements Function0 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CardIssueEventInfoActivity f$0;

    public final Object invoke() {
        Unit unitIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            unitIAuthTabCallback = CardIssueEventInfoActivity.IAuthTabCallback(this.f$0);
            int i3 = 29 / 0;
        } else {
            unitIAuthTabCallback = CardIssueEventInfoActivity.IAuthTabCallback(this.f$0);
        }
        int i4 = onNavigationEvent + 45;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
