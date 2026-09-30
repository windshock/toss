package im.toss.features.applock.impl.test;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AppLockTestActivity$$ExternalSyntheticLambda15 implements View.OnClickListener {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ AppLockTestActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        AppLockTestActivity.onWarmupCompleted(this.f$0, view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
