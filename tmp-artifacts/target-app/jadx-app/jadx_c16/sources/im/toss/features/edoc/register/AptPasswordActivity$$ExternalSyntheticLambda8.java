package im.toss.features.edoc.register;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AptPasswordActivity$$ExternalSyntheticLambda8 implements View.OnClickListener {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AptPasswordActivity.$r8$lambda$jXzx__nc6t8bkdBqqiwfcTykrgc(view);
        int i4 = onNavigationEvent + 15;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
