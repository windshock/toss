package viva.republica.toss.cardrecommend.issuev2.ui.id.ocr;

import android.content.DialogInterface;
import viva.republica.toss.cardrecommend.issuev2.ui.id.ocr.CardIssueOcrVerifyFragment;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CardIssueOcrVerifyFragment$verifyIdCard$2$$ExternalSyntheticLambda6 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ CardIssueOcrVerifyFragment f$0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        CardIssueOcrVerifyFragment.IAuthTabCallbackDefault.onWarmupCompleted(this.f$0, dialogInterface);
    }
}
