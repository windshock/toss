package im.toss.features.cardissue.event.ui.list;

import android.view.View;
import im.toss.features.cardissue.event.model.issuance.EventIssuanceItemResponse;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CardIssueEventListActivity$$ExternalSyntheticLambda4 implements View.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ CardIssueEventListActivity f$0;
    public final /* synthetic */ EventIssuanceItemResponse f$1;

    public /* synthetic */ CardIssueEventListActivity$$ExternalSyntheticLambda4(CardIssueEventListActivity cardIssueEventListActivity, EventIssuanceItemResponse eventIssuanceItemResponse) {
        this.f$0 = cardIssueEventListActivity;
        this.f$1 = eventIssuanceItemResponse;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, this.f$1, view};
        CardIssueEventListActivity.IAuthTabCallback(1645931523, -1645931523, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
        int i4 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
