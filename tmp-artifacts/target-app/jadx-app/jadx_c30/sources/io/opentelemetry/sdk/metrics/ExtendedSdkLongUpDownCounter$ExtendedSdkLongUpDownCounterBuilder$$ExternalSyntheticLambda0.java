package io.opentelemetry.sdk.metrics;

import o.StateObserver;
import o.TaskTypeThread;
import o.getCtx;
import o.registerReader;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class ExtendedSdkLongUpDownCounter$ExtendedSdkLongUpDownCounterBuilder$$ExternalSyntheticLambda0 implements TaskTypeThread.onExtraCallback {
    public final Object newBuilder(getCtx getctx, String str, String str2, String str3, registerReader.onExtraCallbackWithResult onextracallbackwithresult) {
        return new StateObserver.IAuthTabCallback(getctx, str, str2, str3, onextracallbackwithresult);
    }
}
