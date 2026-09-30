package im.toss.components.tuba.trigger.internal;

import android.view.View;
import im.toss.components.tuba.trigger.internal.BottomSheetTriggerExecutor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BottomSheetTriggerExecutor$TubaBottomSheetDialog$$ExternalSyntheticLambda3 implements View.OnClickListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ BottomSheetTriggerExecutor.TubaBottomSheetDialog f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        BottomSheetTriggerExecutor.TubaBottomSheetDialog.onNavigationEvent(this.f$0, view);
        int i4 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }
}
