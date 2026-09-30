package im.toss.features.applock.impl.test;

import android.widget.CompoundButton;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AppLockTestActivity$$ExternalSyntheticLambda7 implements CompoundButton.OnCheckedChangeListener {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AppLockTestActivity f$0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AppLockTestActivity.onExtraCallbackWithResult(this.f$0, compoundButton, z);
        int i4 = onWarmupCompleted + 95;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
