package im.toss.features.home.presentation.bottomsheet;

import android.content.DialogInterface;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAccountBottomSheetSchemeActivity$$ExternalSyntheticLambda5 implements DialogInterface.OnDismissListener {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ HomeAccountBottomSheetSchemeActivity f$0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        HomeAccountBottomSheetSchemeActivity.onExtraCallback(this.f$0, dialogInterface);
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
    }
}
