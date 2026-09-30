package im.toss.features.home.core.ui.base.dst;

import com.google.android.material.appbar.AppBarLayout;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseHomeDstActivity$$ExternalSyntheticLambda23 implements AppBarLayout.OnOffsetChangedListener {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ BaseHomeDstActivity f$0;

    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        BaseHomeDstActivity.IAuthTabCallback(this.f$0, appBarLayout, i);
        if (i4 == 0) {
            int i5 = 42 / 0;
        }
    }
}
