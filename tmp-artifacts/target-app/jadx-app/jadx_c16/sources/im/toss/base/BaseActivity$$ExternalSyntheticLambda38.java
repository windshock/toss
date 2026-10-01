package im.toss.base;

import android.content.DialogInterface;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BaseActivity$$ExternalSyntheticLambda38 implements DialogInterface.OnDismissListener {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ BaseActivity f$0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        BaseActivity.onNavigationEvent(this.f$0, dialogInterface);
        int i4 = onWarmupCompleted + 41;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
    }
}
