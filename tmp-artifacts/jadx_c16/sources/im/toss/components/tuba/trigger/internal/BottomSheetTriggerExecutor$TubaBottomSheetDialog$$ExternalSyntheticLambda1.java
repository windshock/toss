package im.toss.components.tuba.trigger.internal;

import android.content.DialogInterface;
import im.toss.components.tuba.trigger.internal.BottomSheetTriggerExecutor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BottomSheetTriggerExecutor$TubaBottomSheetDialog$$ExternalSyntheticLambda1 implements DialogInterface.OnCancelListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ BottomSheetTriggerExecutor.TubaBottomSheetDialog f$0;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            BottomSheetTriggerExecutor.TubaBottomSheetDialog.onNavigationEvent(this.f$0, dialogInterface);
            int i3 = 37 / 0;
        } else {
            BottomSheetTriggerExecutor.TubaBottomSheetDialog.onNavigationEvent(this.f$0, dialogInterface);
        }
        int i4 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
