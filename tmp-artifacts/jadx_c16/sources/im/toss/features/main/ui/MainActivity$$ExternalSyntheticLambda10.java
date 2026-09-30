package im.toss.features.main.ui;

import android.content.DialogInterface;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MainActivity$$ExternalSyntheticLambda10 implements DialogInterface.OnCancelListener {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ MainActivity f$0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        MainActivity.onExtraCallbackWithResult(this.f$0, dialogInterface);
        int i4 = onNavigationEvent + 41;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
