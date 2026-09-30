package im.toss.ads_sdk.ui.view;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ShortFormPlayerView$$ExternalSyntheticLambda2 implements View.OnClickListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ ShortFormPlayerView f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ShortFormPlayerView.IAuthTabCallback(this.f$0, view);
        int i4 = IAuthTabCallback + 85;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
