package im.toss.features.edoc;

import com.google.android.material.appbar.AppBarLayout;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocHomeTabActivity$$ExternalSyntheticLambda2 implements AppBarLayout.OnOffsetChangedListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ EDocHomeTabActivity f$0;

    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 33;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        EDocHomeTabActivity.onExtraCallbackWithResult(this.f$0, appBarLayout, i);
        if (i4 != 0) {
            int i5 = 24 / 0;
        }
    }
}
