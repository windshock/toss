package viva.republica.toss.core;

import im.toss.base.BaseActivity;
import o.UST_CMP_IssueCertificate;
import o.deserializeDecimalCollection;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class UserLogin$softResetForDevTool$1$$ExternalSyntheticLambda2 implements deserializeDecimalCollection {
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ BaseActivity f$1;

    public /* synthetic */ UserLogin$softResetForDevTool$1$$ExternalSyntheticLambda2(boolean z, BaseActivity baseActivity) {
        this.f$0 = z;
        this.f$1 = baseActivity;
    }

    public final void run() {
        UST_CMP_IssueCertificate.onExtraCallbackWithResult.onExtraCallback(this.f$0, this.f$1);
    }
}
