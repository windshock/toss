package o;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class exist<R> {
    public final getBacktraceNote<Throwable, R, CoroutineContext, Unit> IAuthTabCallback;
    public final BitmapImageViewTarget onExtraCallback;
    public final Throwable onExtraCallbackWithResult;
    public final Object onNavigationEvent;
    public final R onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ exist onExtraCallbackWithResult(exist existVar, Object obj, BitmapImageViewTarget bitmapImageViewTarget, getBacktraceNote getbacktracenote, Object obj2, Throwable th, int i, Object obj3) {
        R r = obj;
        if ((i & 1) != 0) {
            r = existVar.onWarmupCompleted;
        }
        if ((i & 2) != 0) {
            bitmapImageViewTarget = existVar.onExtraCallback;
        }
        BitmapImageViewTarget bitmapImageViewTarget2 = bitmapImageViewTarget;
        if ((i & 4) != 0) {
            getbacktracenote = existVar.IAuthTabCallback;
        }
        getBacktraceNote getbacktracenote2 = getbacktracenote;
        if ((i & 8) != 0) {
            obj2 = existVar.onNavigationEvent;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = existVar.onExtraCallbackWithResult;
        }
        return existVar.IAuthTabCallback(r, bitmapImageViewTarget2, getbacktracenote2, obj4, th);
    }

    public final exist<R> IAuthTabCallback(R r, @Nullable BitmapImageViewTarget bitmapImageViewTarget, @Nullable getBacktraceNote<? super Throwable, ? super R, ? super CoroutineContext, Unit> getbacktracenote, @Nullable Object obj, @Nullable Throwable th) {
        return new exist<>(r, bitmapImageViewTarget, getbacktracenote, obj, th);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exist)) {
            return false;
        }
        exist existVar = (exist) obj;
        return Intrinsics.areEqual(this.onWarmupCompleted, existVar.onWarmupCompleted) && Intrinsics.areEqual(this.onExtraCallback, existVar.onExtraCallback) && Intrinsics.areEqual(this.IAuthTabCallback, existVar.IAuthTabCallback) && Intrinsics.areEqual(this.onNavigationEvent, existVar.onNavigationEvent) && Intrinsics.areEqual(this.onExtraCallbackWithResult, existVar.onExtraCallbackWithResult);
    }

    public int hashCode() {
        R r = this.onWarmupCompleted;
        int iHashCode = r == null ? 0 : r.hashCode();
        BitmapImageViewTarget bitmapImageViewTarget = this.onExtraCallback;
        int iHashCode2 = bitmapImageViewTarget == null ? 0 : bitmapImageViewTarget.hashCode();
        getBacktraceNote<Throwable, R, CoroutineContext, Unit> getbacktracenote = this.IAuthTabCallback;
        int iHashCode3 = getbacktracenote == null ? 0 : getbacktracenote.hashCode();
        Object obj = this.onNavigationEvent;
        int iHashCode4 = obj == null ? 0 : obj.hashCode();
        Throwable th = this.onExtraCallbackWithResult;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.onWarmupCompleted + ", cancelHandler=" + this.onExtraCallback + ", onCancellation=" + this.IAuthTabCallback + ", idempotentResume=" + this.onNavigationEvent + ", cancelCause=" + this.onExtraCallbackWithResult + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public exist(R r, @Nullable BitmapImageViewTarget bitmapImageViewTarget, @Nullable getBacktraceNote<? super Throwable, ? super R, ? super CoroutineContext, Unit> getbacktracenote, @Nullable Object obj, @Nullable Throwable th) {
        this.onWarmupCompleted = r;
        this.onExtraCallback = bitmapImageViewTarget;
        this.IAuthTabCallback = getbacktracenote;
        this.onNavigationEvent = obj;
        this.onExtraCallbackWithResult = th;
    }

    public /* synthetic */ exist(Object obj, BitmapImageViewTarget bitmapImageViewTarget, getBacktraceNote getbacktracenote, Object obj2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? null : bitmapImageViewTarget, (i & 4) != 0 ? null : getbacktracenote, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }

    public final boolean onNavigationEvent() {
        return this.onExtraCallbackWithResult != null;
    }

    public final void onExtraCallbackWithResult(@NotNull setResourceInternal<?> setresourceinternal, @NotNull Throwable th) {
        BitmapImageViewTarget bitmapImageViewTarget = this.onExtraCallback;
        if (bitmapImageViewTarget != null) {
            setresourceinternal.IAuthTabCallback(bitmapImageViewTarget, th);
        }
        getBacktraceNote<Throwable, R, CoroutineContext, Unit> getbacktracenote = this.IAuthTabCallback;
        if (getbacktracenote != null) {
            setresourceinternal.onNavigationEvent((getBacktraceNote<? super Throwable, ? super Throwable, ? super CoroutineContext, Unit>) getbacktracenote, th, (Throwable) this.onWarmupCompleted);
        }
    }
}
