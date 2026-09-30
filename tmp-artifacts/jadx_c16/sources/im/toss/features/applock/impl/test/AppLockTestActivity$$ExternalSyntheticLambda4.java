package im.toss.features.applock.impl.test;

import android.widget.CompoundButton;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AppLockTestActivity$$ExternalSyntheticLambda4 implements CompoundButton.OnCheckedChangeListener {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AppLockTestActivity.onExtraCallbackWithResult(compoundButton, z);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 45;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
