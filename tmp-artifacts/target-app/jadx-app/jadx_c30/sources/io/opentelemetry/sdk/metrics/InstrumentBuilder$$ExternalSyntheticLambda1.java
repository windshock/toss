package io.opentelemetry.sdk.metrics;

import java.util.function.Consumer;
import o.TaskTypeThread;
import o.resolveWriter;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class InstrumentBuilder$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ Consumer f$0;
    public final /* synthetic */ resolveWriter f$1;

    public /* synthetic */ InstrumentBuilder$$ExternalSyntheticLambda1(Consumer consumer, resolveWriter resolvewriter) {
        this.f$0 = consumer;
        this.f$1 = resolvewriter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TaskTypeThread.onWarmupCompleted(this.f$0, this.f$1);
    }
}
