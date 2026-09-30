package viva.republica.toss.service.embeddedrn.appbridge;

import java.util.concurrent.atomic.AtomicBoolean;
import o.MessageQueueThreadPerfStats;
import o.isIdle;
import o.nSetPosition;
import o.setOnOutOfMemeryErrorCallback;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ShowEmbeddedRnHandlerKt$$ExternalSyntheticLambda0 implements isIdle {
    public final /* synthetic */ AtomicBoolean f$0;
    public final /* synthetic */ setOnOutOfMemeryErrorCallback f$1;

    public /* synthetic */ ShowEmbeddedRnHandlerKt$$ExternalSyntheticLambda0(AtomicBoolean atomicBoolean, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        this.f$0 = atomicBoolean;
        this.f$1 = setonoutofmemeryerrorcallback;
    }

    public final void onHidden() {
        MessageQueueThreadPerfStats.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), 944800881, -944800880, new Object[]{this.f$0, this.f$1}, nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult());
    }
}
