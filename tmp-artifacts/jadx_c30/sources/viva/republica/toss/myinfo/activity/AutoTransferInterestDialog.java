package viva.republica.toss.myinfo.activity;

import android.os.Bundle;
import android.view.View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.bottomcta.TdsBottomCtaV1View;
import o.r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class AutoTransferInterestDialog extends r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI {
    public static final int onExtraCallbackWithResult = r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI.onWarmupCompleted;

    public void onCreate(@Nullable Bundle bundle) {
        super/*o.BrickModuleImplExternalSyntheticLambda0*/.onCreate(bundle);
        setContentView(R.layout.dialog_auto_trasnfer_interest_intro);
        TdsBottomCtaV1View tdsBottomCtaV1ViewFindViewById = findViewById(R.id.bottomCta);
        if (tdsBottomCtaV1ViewFindViewById != null) {
            TdsBottomCtaV1View.setCta$default(tdsBottomCtaV1ViewFindViewById, im.toss.uikit.R.string.uikit_confirm, new View.OnClickListener() { // from class: viva.republica.toss.myinfo.activity.AutoTransferInterestDialog$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutoTransferInterestDialog.onExtraCallbackWithResult(this.f$0, view);
                }
            }, (TdsButtonV1View.asInterface) null, false, 12, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(AutoTransferInterestDialog autoTransferInterestDialog, View view) {
        autoTransferInterestDialog.dismiss();
    }
}
