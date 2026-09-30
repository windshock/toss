package o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.b9;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class b9 extends StatisticModel {
    private final b9 IAuthTabCallback;
    private final String asBinder;
    private final boolean onExtraCallback;
    private final Handler onNavigationEvent;

    private b9(Handler handler, String str, boolean z) {
        super(null);
        this.onNavigationEvent = handler;
        this.asBinder = str;
        this.onExtraCallback = z;
        this.IAuthTabCallback = z ? this : new b9(handler, str, true);
    }

    public /* synthetic */ b9(Handler handler, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public b9(@NotNull Handler handler, @Nullable String str) {
        this(handler, str, false);
    }

    @Override // o.StatisticModel
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public b9 onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    @Override // o.GeckoHubImp
    public boolean onExtraCallbackWithResult(@NotNull CoroutineContext coroutineContext) {
        return (this.onExtraCallback && Intrinsics.areEqual(Looper.myLooper(), this.onNavigationEvent.getLooper())) ? false : true;
    }

    @Override // o.GeckoHubImp
    public void onWarmupCompleted(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        if (this.onNavigationEvent.post(runnable)) {
            return;
        }
        IAuthTabCallback(coroutineContext, runnable);
    }

    @Override // o.BufferOutputStream
    public void onWarmupCompleted(long j, @NotNull final maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener) {
        final Runnable runnable = new Runnable() { // from class: kotlinx.coroutines.android.HandlerContext$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                b9.onExtraCallback(mayberemoveattachstatelistener, this);
            }
        };
        if (this.onNavigationEvent.postDelayed(runnable, RangesKt___RangesKt.coerceAtMost(j, 4611686018427387903L))) {
            mayberemoveattachstatelistener.IAuthTabCallback(new Function1() { // from class: kotlinx.coroutines.android.HandlerContext$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b9.IAuthTabCallback(this.f$0, runnable, (Throwable) obj);
                }
            });
        } else {
            IAuthTabCallback(mayberemoveattachstatelistener.getContext(), runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(maybeRemoveAttachStateListener mayberemoveattachstatelistener, b9 b9Var) {
        mayberemoveattachstatelistener.onNavigationEvent(b9Var, Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(b9 b9Var, Runnable runnable, Throwable th) {
        b9Var.onNavigationEvent.removeCallbacks(runnable);
        return Unit.INSTANCE;
    }

    @Override // o.StatisticModel, o.BufferOutputStream
    public setDeployments onWarmupCompleted(long j, @NotNull final Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        if (this.onNavigationEvent.postDelayed(runnable, RangesKt___RangesKt.coerceAtMost(j, 4611686018427387903L))) {
            return new setDeployments() { // from class: kotlinx.coroutines.android.HandlerContext$$ExternalSyntheticLambda0
                @Override // o.setDeployments
                public final void dispose() {
                    b9.IAuthTabCallback(this.f$0, runnable);
                }
            };
        }
        IAuthTabCallback(coroutineContext, runnable);
        return setStrategy.onNavigationEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(b9 b9Var, Runnable runnable) {
        b9Var.onNavigationEvent.removeCallbacks(runnable);
    }

    private final void IAuthTabCallback(CoroutineContext coroutineContext, Runnable runnable) {
        getFullPackage.onWarmupCompleted(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        putChannelInfo.IAuthTabCallback().onWarmupCompleted(coroutineContext, runnable);
    }

    @Override // o.setPatch, o.GeckoHubImp
    public String toString() {
        String strOnNavigationEvent = onNavigationEvent();
        if (strOnNavigationEvent != null) {
            return strOnNavigationEvent;
        }
        String string = this.asBinder;
        if (string == null) {
            string = this.onNavigationEvent.toString();
        }
        if (!this.onExtraCallback) {
            return string;
        }
        return string + ".immediate";
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof b9)) {
            return false;
        }
        b9 b9Var = (b9) obj;
        return b9Var.onNavigationEvent == this.onNavigationEvent && b9Var.onExtraCallback == this.onExtraCallback;
    }

    public int hashCode() {
        return System.identityHashCode(this.onNavigationEvent) ^ (this.onExtraCallback ? 1231 : 1237);
    }
}
