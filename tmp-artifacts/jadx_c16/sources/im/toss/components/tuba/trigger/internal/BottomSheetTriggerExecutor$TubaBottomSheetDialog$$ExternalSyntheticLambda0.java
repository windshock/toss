package im.toss.components.tuba.trigger.internal;

import android.content.DialogInterface;
import im.toss.components.tuba.trigger.internal.BottomSheetTriggerExecutor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BottomSheetTriggerExecutor$TubaBottomSheetDialog$$ExternalSyntheticLambda0 implements DialogInterface.OnDismissListener {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ BottomSheetTriggerExecutor.TubaBottomSheetDialog f$0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            BottomSheetTriggerExecutor.TubaBottomSheetDialog.onExtraCallbackWithResult(this.f$0, dialogInterface);
            throw null;
        }
        BottomSheetTriggerExecutor.TubaBottomSheetDialog.onExtraCallbackWithResult(this.f$0, dialogInterface);
        int i3 = IAuthTabCallback + 125;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
    }
}
