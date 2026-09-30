package io.opentelemetry.sdk.metrics;

import o.ConfigModule;
import o.JsonHelper;
import o.TaskTypeThread;
import o.getCtx;
import o.tryFindBinder;
import o.useKeyCache;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class SdkDoubleGauge$SdkDoubleGaugeBuilder$$ExternalSyntheticLambda1 implements TaskTypeThread.onWarmupCompleted {
    public final JsonHelper createInstrument(tryFindBinder tryfindbinder, getCtx getctx, useKeyCache usekeycache) {
        return new ConfigModule(tryfindbinder, getctx, usekeycache);
    }
}
