package im.toss.features.cardissue.event.ui.info;

import android.view.View;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardIssueEventInfoActivity$$ExternalSyntheticLambda8 implements View.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CardIssueEventInfoActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CardIssueEventInfoActivity.onNavigationEvent(new Object[]{this.f$0, view}, 456978906, -456978902, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback());
        int i4 = IAuthTabCallback + 75;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
