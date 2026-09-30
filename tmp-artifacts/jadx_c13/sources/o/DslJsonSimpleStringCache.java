package o;

import io.opentelemetry.sdk.metrics.internal.view.RegisteredView;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class DslJsonSimpleStringCache extends RegisteredView {
    private final int IAuthTabCallback;
    private final TaskType onExtraCallback;
    private final registerBinderFactory onExtraCallbackWithResult;
    private final awaitResult onNavigationEvent;
    private final withJavaConverters onWarmupCompleted;

    public DslJsonSimpleStringCache(TaskType taskType, awaitResult awaitresult, withJavaConverters withjavaconverters, int i, registerBinderFactory registerbinderfactory) {
        if (taskType == null) {
            throw new NullPointerException("Null instrumentSelector");
        }
        this.onExtraCallback = taskType;
        if (awaitresult == null) {
            throw new NullPointerException("Null view");
        }
        this.onNavigationEvent = awaitresult;
        if (withjavaconverters == null) {
            throw new NullPointerException("Null viewAttributesProcessor");
        }
        this.onWarmupCompleted = withjavaconverters;
        this.IAuthTabCallback = i;
        if (registerbinderfactory == null) {
            throw new NullPointerException("Null viewSourceInfo");
        }
        this.onExtraCallbackWithResult = registerbinderfactory;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.view.RegisteredView
    public TaskType onExtraCallback() {
        return this.onExtraCallback;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.view.RegisteredView
    public awaitResult onNavigationEvent() {
        return this.onNavigationEvent;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.view.RegisteredView
    public withJavaConverters onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.view.RegisteredView
    public int IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.view.RegisteredView
    public registerBinderFactory onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RegisteredView)) {
            return false;
        }
        RegisteredView registeredView = (RegisteredView) obj;
        return this.onExtraCallback.equals(registeredView.onExtraCallback()) && this.onNavigationEvent.equals(registeredView.onNavigationEvent()) && this.onWarmupCompleted.equals(registeredView.onWarmupCompleted()) && this.IAuthTabCallback == registeredView.IAuthTabCallback() && this.onExtraCallbackWithResult.equals(registeredView.onExtraCallbackWithResult());
    }

    public int hashCode() {
        int iHashCode = this.onExtraCallback.hashCode();
        int iHashCode2 = this.onNavigationEvent.hashCode();
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ this.onWarmupCompleted.hashCode()) * 1000003) ^ this.IAuthTabCallback) * 1000003) ^ this.onExtraCallbackWithResult.hashCode();
    }
}
