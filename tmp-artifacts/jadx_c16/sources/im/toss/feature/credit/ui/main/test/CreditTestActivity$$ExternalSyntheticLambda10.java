package im.toss.feature.credit.ui.main.test;

import android.widget.CompoundButton;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda10 implements CompoundButton.OnCheckedChangeListener {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditTestActivity.IAuthTabCallback(compoundButton, z);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
