package io.opentelemetry.sdk.extension.incubator.trace;

import java.util.function.BiConsumer;
import java.util.logging.Level;
import o.component11;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class LeakDetectingSpanProcessor$$ExternalSyntheticLambda0 implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        component11.onNavigationEvent.log(Level.WARNING, "Span garbage collected before being ended.", (Throwable) obj2);
    }
}
