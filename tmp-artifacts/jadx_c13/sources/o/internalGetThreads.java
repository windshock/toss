package o;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class internalGetThreads<T, R> implements Sequence<R> {
    private final Sequence<T> onNavigationEvent;
    private final Function1<T, R> onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public internalGetThreads(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onNavigationEvent = sequence;
        this.onWarmupCompleted = function1;
    }

    public static final class onExtraCallbackWithResult implements Iterator<R>, KMappedMarker {
        private final Iterator<T> IAuthTabCallback;
        final /* synthetic */ internalGetThreads<T, R> onExtraCallback;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        onExtraCallbackWithResult(internalGetThreads<T, R> internalgetthreads) {
            this.onExtraCallback = internalgetthreads;
            this.IAuthTabCallback = ((internalGetThreads) internalgetthreads).onNavigationEvent.IAuthTabCallback();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((internalGetThreads) this.onExtraCallback).onWarmupCompleted.invoke(this.IAuthTabCallback.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.IAuthTabCallback.hasNext();
        }
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<R> IAuthTabCallback() {
        return new onExtraCallbackWithResult(this);
    }

    public final <E> Sequence<E> onNavigationEvent(@NotNull Function1<? super R, ? extends Iterator<? extends E>> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        return new clearCauses(this.onNavigationEvent, this.onWarmupCompleted, function1);
    }
}
