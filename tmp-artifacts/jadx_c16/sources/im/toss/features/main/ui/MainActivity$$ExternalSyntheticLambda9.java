package im.toss.features.main.ui;

import android.content.DialogInterface;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MainActivity$$ExternalSyntheticLambda9 implements DialogInterface.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 23;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        MainActivity.onWarmupCompleted(dialogInterface, i);
        int i5 = onWarmupCompleted + 117;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }
}
