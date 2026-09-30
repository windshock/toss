package im.toss.features.home.core.hds.view;

import android.view.View;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeYearMonthSelectView$$ExternalSyntheticLambda1 implements View.OnClickListener {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ HomeYearMonthSelectView f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, view};
        HomeYearMonthSelectView.onNavigationEvent(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), objArr, 1334787853, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1334787853);
        int i4 = onNavigationEvent + 31;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
