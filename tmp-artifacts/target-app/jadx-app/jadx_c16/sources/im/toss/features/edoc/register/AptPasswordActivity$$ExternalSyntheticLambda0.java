package im.toss.features.edoc.register;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AptPasswordActivity$$ExternalSyntheticLambda0 implements View.OnClickListener {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ AptPasswordActivity f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AptPasswordActivity.IAuthTabCallback(this.f$0, view);
        int i4 = onNavigationEvent + 89;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }
}
