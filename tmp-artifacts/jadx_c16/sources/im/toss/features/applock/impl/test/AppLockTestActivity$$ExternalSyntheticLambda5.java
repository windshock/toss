package im.toss.features.applock.impl.test;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AppLockTestActivity$$ExternalSyntheticLambda5 implements View.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ AppLockTestActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AppLockTestActivity.IAuthTabCallbackDefault(this.f$0, view);
        int i4 = onNavigationEvent + 33;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
