package com.facebook.react.devsupport;

import android.view.View;
import android.widget.EditText;
import o.CredentialProviderCreatePublicKeyCredentialControllerhandleResponse1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class ChangeBundleLocationDialog$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final /* synthetic */ EditText f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ ChangeBundleLocationDialog$$ExternalSyntheticLambda0(EditText editText, String str) {
        this.f$0 = editText;
        this.f$1 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CredentialProviderCreatePublicKeyCredentialControllerhandleResponse1.onExtraCallbackWithResult(this.f$0, this.f$1, view);
    }
}
