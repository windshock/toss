package o;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setThreadPoolExecutorCallback extends AbstractCoroutineContextElement {
    public static final IAuthTabCallback IAuthTabCallback = new IAuthTabCallback(null);
    private final String onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setThreadPoolExecutorCallback) && Intrinsics.areEqual(this.onWarmupCompleted, ((setThreadPoolExecutorCallback) obj).onWarmupCompleted);
    }

    public int hashCode() {
        return this.onWarmupCompleted.hashCode();
    }

    public final String onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public setThreadPoolExecutorCallback(@NotNull String str) {
        super(IAuthTabCallback);
        this.onWarmupCompleted = str;
    }

    public static final class IAuthTabCallback implements CoroutineContext.onExtraCallback<setThreadPoolExecutorCallback> {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public String toString() {
        return "CoroutineName(" + this.onWarmupCompleted + ')';
    }
}
