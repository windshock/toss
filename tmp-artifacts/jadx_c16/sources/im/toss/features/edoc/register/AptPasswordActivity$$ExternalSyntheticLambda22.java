package im.toss.features.edoc.register;

import android.view.View;
import im.toss.features.benefit.ui.BenefitItemAdapter$;
import o.getTypedExportedConstants;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AptPasswordActivity$$ExternalSyntheticLambda22 implements View.OnClickListener {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ getTypedExportedConstants f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, view};
        int iOnExtraCallbackWithResult = BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult();
        AptPasswordActivity.onNavigationEvent(BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult, BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), BenefitItemAdapter$.ExternalSyntheticLambda43.onExtraCallbackWithResult(), -1309202202, 1309202206);
        int i4 = onExtraCallback + 71;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
