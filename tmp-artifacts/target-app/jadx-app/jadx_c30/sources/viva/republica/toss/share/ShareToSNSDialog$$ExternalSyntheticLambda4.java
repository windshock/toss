package viva.republica.toss.share;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.internal.ads.zziea;
import o.deprecated_readTimeoutMillis;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ShareToSNSDialog$$ExternalSyntheticLambda4 implements View.OnClickListener {
    public final /* synthetic */ deprecated_readTimeoutMillis f$0;
    public final /* synthetic */ LinearLayout f$1;
    public final /* synthetic */ ShareToSNSDialog f$2;

    public /* synthetic */ ShareToSNSDialog$$ExternalSyntheticLambda4(deprecated_readTimeoutMillis deprecated_readtimeoutmillis, LinearLayout linearLayout, ShareToSNSDialog shareToSNSDialog) {
        this.f$0 = deprecated_readtimeoutmillis;
        this.f$1 = linearLayout;
        this.f$2 = shareToSNSDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ShareToSNSDialog.onWarmupCompleted(zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), new Object[]{this.f$0, this.f$1, this.f$2, view}, -506838942, zziea.IAuthTabCallback(), 506838943, zziea.IAuthTabCallback());
    }
}
