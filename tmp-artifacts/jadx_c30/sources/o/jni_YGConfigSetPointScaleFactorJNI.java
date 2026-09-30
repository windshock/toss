package o;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.jni_YGConfigSetPointScaleFactorJNI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class jni_YGConfigSetPointScaleFactorJNI extends GeckoHubImp implements BufferOutputStream {
    private final MapConverter onNavigationEvent;

    public void onWarmupCompleted(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        this.onNavigationEvent.onExtraCallback(runnable);
    }

    public void onWarmupCompleted(long j, @NotNull final maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener) {
        RxAwaitKt.onWarmupCompleted(mayberemoveattachstatelistener, this.onNavigationEvent.onNavigationEvent(new Runnable() { // from class: kotlinx.coroutines.rx2.SchedulerCoroutineDispatcher$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                jni_YGConfigSetPointScaleFactorJNI.onExtraCallbackWithResult(mayberemoveattachstatelistener, this);
            }
        }, j, TimeUnit.MILLISECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(maybeRemoveAttachStateListener mayberemoveattachstatelistener, jni_YGConfigSetPointScaleFactorJNI jni_ygconfigsetpointscalefactorjni) {
        mayberemoveattachstatelistener.onNavigationEvent(jni_ygconfigsetpointscalefactorjni, Unit.INSTANCE);
    }

    public setDeployments onWarmupCompleted(long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        final deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = this.onNavigationEvent.onNavigationEvent(runnable, j, TimeUnit.MILLISECONDS);
        return new setDeployments() { // from class: kotlinx.coroutines.rx2.SchedulerCoroutineDispatcher$$ExternalSyntheticLambda0
            public final void dispose() {
                jni_YGConfigSetPointScaleFactorJNI.onExtraCallback(deserializeurinullablecollectionOnNavigationEvent);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        deserializeurinullablecollection.dispose();
    }

    public String toString() {
        return this.onNavigationEvent.toString();
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof jni_YGConfigSetPointScaleFactorJNI) && ((jni_YGConfigSetPointScaleFactorJNI) obj).onNavigationEvent == this.onNavigationEvent;
    }

    public int hashCode() {
        return System.identityHashCode(this.onNavigationEvent);
    }
}
