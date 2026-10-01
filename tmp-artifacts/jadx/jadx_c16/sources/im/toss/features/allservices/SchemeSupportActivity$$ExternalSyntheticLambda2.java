package im.toss.features.allservices;

import android.view.View;
import im.toss.features.allservices.SchemeSupportActivity;
import kotlin.jvm.functions.Function1;
import o.getTypedExportedConstants;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SchemeSupportActivity$$ExternalSyntheticLambda2 implements View.OnClickListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ getTypedExportedConstants f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ SchemeSupportActivity.onNavigationEvent f$2;

    public /* synthetic */ SchemeSupportActivity$$ExternalSyntheticLambda2(getTypedExportedConstants gettypedexportedconstants, Function1 function1, SchemeSupportActivity.onNavigationEvent onnavigationevent) {
        this.f$0 = gettypedexportedconstants;
        this.f$1 = function1;
        this.f$2 = onnavigationevent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        SchemeSupportActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, view);
        int i4 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
    }
}
