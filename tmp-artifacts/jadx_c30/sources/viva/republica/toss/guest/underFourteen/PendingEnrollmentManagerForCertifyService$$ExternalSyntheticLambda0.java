package viva.republica.toss.guest.underFourteen;

import android.app.Activity;
import android.view.View;
import kotlin.jvm.functions.Function1;
import o.getPanRemaining;
import o.getTypedExportedConstants;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class PendingEnrollmentManagerForCertifyService$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ Activity f$0;
    public final /* synthetic */ getTypedExportedConstants f$1;

    public /* synthetic */ PendingEnrollmentManagerForCertifyService$$ExternalSyntheticLambda0(Activity activity, getTypedExportedConstants gettypedexportedconstants) {
        this.f$0 = activity;
        this.f$1 = gettypedexportedconstants;
    }

    public final Object invoke(Object obj) {
        return getPanRemaining.onExtraCallbackWithResult(this.f$0, this.f$1, (View) obj);
    }
}
