package im.toss.features.edoc.register;

import android.view.KeyEvent;
import android.widget.TextView;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import o.rmdir;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AptPasswordActivity$$ExternalSyntheticLambda1 implements TextView.OnEditorActionListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ rmdir f$0;

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 101;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this.f$0, textView, Integer.valueOf(i), keyEvent};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        boolean zBooleanValue = ((Boolean) AptPasswordActivity.onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -79514868, 79514870)).booleanValue();
        int i5 = IAuthTabCallback + 79;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }
}
