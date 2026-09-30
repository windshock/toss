package im.toss.features.cardissue.event.ui.cs;

import android.view.View;
import o.SystemSettingFieldGroup1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardIssueCsInfoActivity$$ExternalSyntheticLambda3 implements View.OnClickListener {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ CardIssueCsInfoActivity f$0;
    public final /* synthetic */ SystemSettingFieldGroup1 f$1;

    public /* synthetic */ CardIssueCsInfoActivity$$ExternalSyntheticLambda3(CardIssueCsInfoActivity cardIssueCsInfoActivity, SystemSettingFieldGroup1 systemSettingFieldGroup1) {
        this.f$0 = cardIssueCsInfoActivity;
        this.f$1 = systemSettingFieldGroup1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        CardIssueCsInfoActivity cardIssueCsInfoActivity = this.f$0;
        if (i3 == 0) {
            CardIssueCsInfoActivity.onExtraCallbackWithResult(cardIssueCsInfoActivity, this.f$1, view);
        } else {
            CardIssueCsInfoActivity.onExtraCallbackWithResult(cardIssueCsInfoActivity, this.f$1, view);
            int i4 = 74 / 0;
        }
    }
}
