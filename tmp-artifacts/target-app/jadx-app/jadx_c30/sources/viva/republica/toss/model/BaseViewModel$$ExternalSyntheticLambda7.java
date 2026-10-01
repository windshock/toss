package viva.republica.toss.model;

import kotlin.jvm.functions.Function0;
import o.getTimestampBytes;
import o.isVideoAutoplay;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class BaseViewModel$$ExternalSyntheticLambda7 implements Runnable {
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ isVideoAutoplay f$1;
    public final /* synthetic */ getTimestampBytes f$2;

    public /* synthetic */ BaseViewModel$$ExternalSyntheticLambda7(Function0 function0, isVideoAutoplay isvideoautoplay, getTimestampBytes gettimestampbytes) {
        this.f$0 = function0;
        this.f$1 = isvideoautoplay;
        this.f$2 = gettimestampbytes;
    }

    @Override // java.lang.Runnable
    public final void run() {
        isVideoAutoplay.onWarmupCompleted(this.f$0, this.f$1, this.f$2);
    }
}
