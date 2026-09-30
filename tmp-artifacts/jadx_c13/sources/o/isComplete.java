package o;

import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class isComplete {

    @Nullable
    private String onExtraCallbackWithResult;

    @Nullable
    private String onWarmupCompleted;
    private modifyCallback onExtraCallback = modifyCallback.onExtraCallbackWithResult();
    private withJavaConverters onNavigationEvent = withJavaConverters.onNavigationEvent();
    private int IAuthTabCallback = 2000;

    isComplete() {
    }

    public isComplete onExtraCallback(String str) {
        this.onWarmupCompleted = str;
        return this;
    }

    public isComplete onWarmupCompleted(String str) {
        this.onExtraCallbackWithResult = str;
        return this;
    }

    public isComplete onWarmupCompleted(modifyCallback modifycallback) {
        if (!(modifycallback instanceof OpaqueValue)) {
            throw new IllegalArgumentException("Custom Aggregation implementations are currently not supported. Use one of the standard implementations returned by the static factories in the Aggregation class.");
        }
        this.onExtraCallback = modifycallback;
        return this;
    }

    public isComplete onNavigationEvent(Set<String> set) {
        Objects.requireNonNull(set, "keysToRetain");
        return onExtraCallbackWithResult(withJavaConverters.onExtraCallbackWithResult(set));
    }

    public isComplete onExtraCallbackWithResult(Predicate<String> predicate) {
        Objects.requireNonNull(predicate, "keyFilter");
        this.onNavigationEvent = withJavaConverters.onExtraCallback(predicate);
        return this;
    }

    isComplete addAttributesProcessor(withJavaConverters withjavaconverters) {
        this.onNavigationEvent = this.onNavigationEvent.onNavigationEvent(withjavaconverters);
        return this;
    }

    public awaitResult onNavigationEvent() {
        return awaitResult.onWarmupCompleted(this.onWarmupCompleted, this.onExtraCallbackWithResult, this.onExtraCallback, this.onNavigationEvent, this.IAuthTabCallback);
    }
}
