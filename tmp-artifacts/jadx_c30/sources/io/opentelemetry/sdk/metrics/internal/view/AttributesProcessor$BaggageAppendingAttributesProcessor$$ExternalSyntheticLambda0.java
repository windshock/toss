package io.opentelemetry.sdk.metrics.internal.view;

import java.util.function.BiConsumer;
import o.getApiLevel;
import o.getNetworkAccess;
import o.withJavaConverters;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class AttributesProcessor$BaggageAppendingAttributesProcessor$$ExternalSyntheticLambda0 implements BiConsumer {
    public final /* synthetic */ withJavaConverters.onExtraCallbackWithResult f$0;
    public final /* synthetic */ getNetworkAccess f$1;

    public /* synthetic */ AttributesProcessor$BaggageAppendingAttributesProcessor$$ExternalSyntheticLambda0(withJavaConverters.onExtraCallbackWithResult onextracallbackwithresult, getNetworkAccess getnetworkaccess) {
        this.f$0 = onextracallbackwithresult;
        this.f$1 = getnetworkaccess;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        withJavaConverters.onExtraCallbackWithResult.onExtraCallback(this.f$0, this.f$1, (String) obj, (getApiLevel) obj2);
    }
}
