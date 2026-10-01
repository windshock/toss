package im.toss.features.home.legacy.view.transaction.manual;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import viva.republica.toss.myinfo.DatePickerFragment;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ManualTransactionAddActivity$$ExternalSyntheticLambda8 implements DatePickerDialog.OnDateSetListener {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ ManualTransactionAddActivity f$0;
    public final /* synthetic */ DatePickerFragment f$1;

    public /* synthetic */ ManualTransactionAddActivity$$ExternalSyntheticLambda8(ManualTransactionAddActivity manualTransactionAddActivity, DatePickerFragment datePickerFragment) {
        this.f$0 = manualTransactionAddActivity;
        this.f$1 = datePickerFragment;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 25;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            ManualTransactionAddActivity.onWarmupCompleted(this.f$0, this.f$1, datePicker, i, i2, i3);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ManualTransactionAddActivity.onWarmupCompleted(this.f$0, this.f$1, datePicker, i, i2, i3);
        int i6 = onExtraCallback + 123;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }
}
