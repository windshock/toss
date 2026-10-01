package io.opentelemetry.sdk.metrics;

import o.ContextModule;
import o.JsonHelper;
import o.TaskTypeThread;
import o.getCtx;
import o.tryFindBinder;
import o.useKeyCache;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class SdkDoubleCounter$SdkDoubleCounterBuilder$$ExternalSyntheticLambda0 implements TaskTypeThread.onWarmupCompleted {
    public final JsonHelper createInstrument(tryFindBinder tryfindbinder, getCtx getctx, useKeyCache usekeycache) {
        return new ContextModule(tryfindbinder, getctx, usekeycache);
    }
}
