package com.facebook.react.devsupport;

import android.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import o.CredentialProviderCreatePublicKeyCredentialControllerhandleResponse1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class ChangeBundleLocationDialog$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialControllerhandleResponse1.onExtraCallbackWithResult f$0;
    public final /* synthetic */ EditText f$1;
    public final /* synthetic */ AlertDialog f$2;

    public /* synthetic */ ChangeBundleLocationDialog$$ExternalSyntheticLambda2(CredentialProviderCreatePublicKeyCredentialControllerhandleResponse1.onExtraCallbackWithResult onextracallbackwithresult, EditText editText, AlertDialog alertDialog) {
        this.f$0 = onextracallbackwithresult;
        this.f$1 = editText;
        this.f$2 = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CredentialProviderCreatePublicKeyCredentialControllerhandleResponse1.onExtraCallback(this.f$0, this.f$1, this.f$2, view);
    }
}
