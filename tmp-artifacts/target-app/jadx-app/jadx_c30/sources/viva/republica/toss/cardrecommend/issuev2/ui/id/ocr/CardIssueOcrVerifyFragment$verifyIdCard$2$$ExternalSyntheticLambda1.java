package viva.republica.toss.cardrecommend.issuev2.ui.id.ocr;

import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;
import viva.republica.toss.cardrecommend.issuev2.ui.id.ocr.CardIssueOcrVerifyFragment;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class CardIssueOcrVerifyFragment$verifyIdCard$2$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ Throwable f$0;
    public final /* synthetic */ CardIssueOcrVerifyFragment f$1;

    public /* synthetic */ CardIssueOcrVerifyFragment$verifyIdCard$2$$ExternalSyntheticLambda1(Throwable th, CardIssueOcrVerifyFragment cardIssueOcrVerifyFragment) {
        this.f$0 = th;
        this.f$1 = cardIssueOcrVerifyFragment;
    }

    public final Object invoke(Object obj) {
        return CardIssueOcrVerifyFragment.IAuthTabCallbackDefault.onExtraCallback(this.f$0, this.f$1, (CommonModule_setLeftEdgeTouchEnabled) obj);
    }
}
