package viva.republica.toss.model;

import kotlin.jvm.functions.Function0;
import o.isVideoAutoplay;
import o.setTid;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class BaseViewModel$$ExternalSyntheticLambda20 implements Runnable {
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ isVideoAutoplay f$1;
    public final /* synthetic */ setTid f$2;

    public /* synthetic */ BaseViewModel$$ExternalSyntheticLambda20(Function0 function0, isVideoAutoplay isvideoautoplay, setTid settid) {
        this.f$0 = function0;
        this.f$1 = isvideoautoplay;
        this.f$2 = settid;
    }

    @Override // java.lang.Runnable
    public final void run() {
        isVideoAutoplay.IAuthTabCallback(this.f$0, this.f$1, this.f$2);
    }
}
