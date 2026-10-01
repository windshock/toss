package io.opentelemetry.sdk.metrics.internal.view;

import o.DslJsonSimpleStringCache;
import o.TaskType;
import o.awaitResult;
import o.registerBinderFactory;
import o.withJavaConverters;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class RegisteredView {
    public abstract int IAuthTabCallback();

    public abstract TaskType onExtraCallback();

    public abstract registerBinderFactory onExtraCallbackWithResult();

    public abstract awaitResult onNavigationEvent();

    public abstract withJavaConverters onWarmupCompleted();

    public static RegisteredView onExtraCallbackWithResult(TaskType taskType, awaitResult awaitresult, withJavaConverters withjavaconverters, int i, registerBinderFactory registerbinderfactory) {
        return new DslJsonSimpleStringCache(taskType, awaitresult, withjavaconverters, i, registerbinderfactory);
    }

    public final String toString() {
        return "RegisteredView{instrumentSelector=" + onExtraCallback() + ", view=" + onNavigationEvent() + "}";
    }
}
