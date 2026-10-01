package im.toss.components.tuba.trigger.internal;

import android.view.View;
import im.toss.components.tuba.trigger.internal.BottomSheetTriggerExecutor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BottomSheetTriggerExecutor$TubaBottomSheetDialog$$ExternalSyntheticLambda2 implements View.OnClickListener {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ BottomSheetTriggerExecutor.TubaBottomSheetDialog f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        BottomSheetTriggerExecutor.TubaBottomSheetDialog.onExtraCallback(this.f$0, view);
        int i4 = onExtraCallback + 95;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
    }
}
