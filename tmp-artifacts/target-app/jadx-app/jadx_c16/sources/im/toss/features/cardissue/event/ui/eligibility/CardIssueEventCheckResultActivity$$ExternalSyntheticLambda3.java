package im.toss.features.cardissue.event.ui.eligibility;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardIssueEventCheckResultActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ CardIssueEventCheckResultActivity f$1;

    public /* synthetic */ CardIssueEventCheckResultActivity$$ExternalSyntheticLambda3(String str, CardIssueEventCheckResultActivity cardIssueEventCheckResultActivity) {
        this.f$0 = str;
        this.f$1 = cardIssueEventCheckResultActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = CardIssueEventCheckResultActivity.onNavigationEvent(this.f$0, this.f$1, (View) obj);
        int i4 = onExtraCallbackWithResult + 35;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
