package viva.republica.toss.intoss;

import android.content.DialogInterface;
import viva.republica.toss.intoss.MiniAppSchemeActivity;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class MiniAppSchemeActivity$handleIntent$3$$ExternalSyntheticLambda0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ MiniAppSchemeActivity f$0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        MiniAppSchemeActivity.onExtraCallbackWithResult.onWarmupCompleted(this.f$0, dialogInterface, i);
    }
}
