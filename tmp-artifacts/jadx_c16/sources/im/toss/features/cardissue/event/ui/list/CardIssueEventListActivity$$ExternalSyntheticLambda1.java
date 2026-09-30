package im.toss.features.cardissue.event.ui.list;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardIssueEventListActivity$$ExternalSyntheticLambda1 implements View.OnClickListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CardIssueEventListActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CardIssueEventListActivity.onExtraCallback(this.f$0, view);
        int i4 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
