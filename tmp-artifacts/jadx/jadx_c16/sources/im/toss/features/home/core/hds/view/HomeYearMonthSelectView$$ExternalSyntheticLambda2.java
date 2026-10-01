package im.toss.features.home.core.hds.view;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeYearMonthSelectView$$ExternalSyntheticLambda2 implements View.OnClickListener {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ HomeYearMonthSelectView f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        HomeYearMonthSelectView.onNavigationEvent(this.f$0, view);
        int i4 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
