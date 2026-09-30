package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.BufferOutputStream;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class StatisticModel extends setPatch implements BufferOutputStream {
    public /* synthetic */ StatisticModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract StatisticModel onWarmupCompleted();

    private StatisticModel() {
    }

    @Override // o.BufferOutputStream
    public setDeployments onWarmupCompleted(long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return BufferOutputStream.onNavigationEvent.onWarmupCompleted(this, j, runnable, coroutineContext);
    }
}
