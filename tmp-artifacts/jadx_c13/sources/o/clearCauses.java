package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearCauses<T, R, E> implements Sequence<E> {
    private final Function1<T, R> IAuthTabCallback;
    private final Sequence<T> onExtraCallbackWithResult;
    private final Function1<R, Iterator<E>> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public clearCauses(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> function1, @NotNull Function1<? super R, ? extends Iterator<? extends E>> function12) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.onExtraCallbackWithResult = sequence;
        this.IAuthTabCallback = function1;
        this.onNavigationEvent = function12;
    }

    public static final class onExtraCallbackWithResult implements Iterator<E>, KMappedMarker {
        final /* synthetic */ clearCauses<T, R, E> IAuthTabCallback;
        private int onExtraCallbackWithResult;
        private Iterator<? extends E> onNavigationEvent;
        private final Iterator<T> onWarmupCompleted;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        onExtraCallbackWithResult(clearCauses<T, R, E> clearcauses) {
            this.IAuthTabCallback = clearcauses;
            this.onWarmupCompleted = ((clearCauses) clearcauses).onExtraCallbackWithResult.IAuthTabCallback();
        }

        @Override // java.util.Iterator
        public E next() {
            int i = this.onExtraCallbackWithResult;
            if (i == 2) {
                throw new NoSuchElementException();
            }
            if (i == 0 && !onWarmupCompleted()) {
                throw new NoSuchElementException();
            }
            this.onExtraCallbackWithResult = 0;
            Iterator<? extends E> it = this.onNavigationEvent;
            Intrinsics.checkNotNull(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.onExtraCallbackWithResult;
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            return onWarmupCompleted();
        }

        private final boolean onWarmupCompleted() {
            Iterator<? extends E> it = this.onNavigationEvent;
            if (it != null && it.hasNext()) {
                this.onExtraCallbackWithResult = 1;
                return true;
            }
            while (this.onWarmupCompleted.hasNext()) {
                Iterator<? extends E> it2 = (Iterator) ((clearCauses) this.IAuthTabCallback).onNavigationEvent.invoke(((clearCauses) this.IAuthTabCallback).IAuthTabCallback.invoke(this.onWarmupCompleted.next()));
                if (it2.hasNext()) {
                    this.onNavigationEvent = it2;
                    this.onExtraCallbackWithResult = 1;
                    return true;
                }
            }
            this.onExtraCallbackWithResult = 2;
            this.onNavigationEvent = null;
            return false;
        }
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<E> IAuthTabCallback() {
        return new onExtraCallbackWithResult(this);
    }
}
