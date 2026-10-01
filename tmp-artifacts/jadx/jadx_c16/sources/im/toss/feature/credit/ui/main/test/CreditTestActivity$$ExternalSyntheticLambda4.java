package im.toss.feature.credit.ui.main.test;

import android.view.View;
import kotlin.jvm.internal.Ref;
import o.getTypedExportedConstants;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda4 implements View.OnClickListener {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ Ref.ObjectRef f$0;
    public final /* synthetic */ Ref.ObjectRef f$1;
    public final /* synthetic */ getTypedExportedConstants f$2;

    public /* synthetic */ CreditTestActivity$$ExternalSyntheticLambda4(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, getTypedExportedConstants gettypedexportedconstants) {
        this.f$0 = objectRef;
        this.f$1 = objectRef2;
        this.f$2 = gettypedexportedconstants;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            CreditTestActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, view);
            int i3 = 65 / 0;
        } else {
            CreditTestActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, view);
        }
        int i4 = onExtraCallback + 21;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
