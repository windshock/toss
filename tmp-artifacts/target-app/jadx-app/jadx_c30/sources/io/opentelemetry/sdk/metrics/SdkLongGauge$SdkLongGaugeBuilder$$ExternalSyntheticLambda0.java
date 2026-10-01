package io.opentelemetry.sdk.metrics;

import o.JsonHelper;
import o.RunnableProvider;
import o.TaskTypeThread;
import o.getCtx;
import o.tryFindBinder;
import o.useKeyCache;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class SdkLongGauge$SdkLongGaugeBuilder$$ExternalSyntheticLambda0 implements TaskTypeThread.onWarmupCompleted {
    public final JsonHelper createInstrument(tryFindBinder tryfindbinder, getCtx getctx, useKeyCache usekeycache) {
        return new RunnableProvider(tryfindbinder, getctx, usekeycache);
    }
}
