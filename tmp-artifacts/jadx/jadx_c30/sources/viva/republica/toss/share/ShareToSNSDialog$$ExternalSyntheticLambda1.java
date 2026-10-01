package viva.republica.toss.share;

import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.deprecated_readTimeoutMillis;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ShareToSNSDialog$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ ShareToSNSDialog f$0;
    public final /* synthetic */ deprecated_readTimeoutMillis f$1;

    public /* synthetic */ ShareToSNSDialog$$ExternalSyntheticLambda1(ShareToSNSDialog shareToSNSDialog, deprecated_readTimeoutMillis deprecated_readtimeoutmillis) {
        this.f$0 = shareToSNSDialog;
        this.f$1 = deprecated_readtimeoutmillis;
    }

    public final Object invoke(Object obj) {
        return ShareToSNSDialog.onWarmupCompleted(this.f$0, this.f$1, (SetDetectableSize) obj);
    }
}
