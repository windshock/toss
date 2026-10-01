package im.toss.features.edoc;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class EDocHomeTabActivity$$ExternalSyntheticLambda3 implements View.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ EDocHomeTabActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 25;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        EDocHomeTabActivity.IAuthTabCallback(this.f$0, view);
        int i4 = onWarmupCompleted + 75;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
