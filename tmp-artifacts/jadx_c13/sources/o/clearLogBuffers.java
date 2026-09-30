package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class clearLogBuffers<T> implements Sequence<T> {
    private final Function1<T, T> IAuthTabCallback;
    private final Function0<T> onWarmupCompleted;

    public static final class onExtraCallback implements Iterator<T>, KMappedMarker {
        private T IAuthTabCallback;
        final /* synthetic */ clearLogBuffers<T> onExtraCallbackWithResult;
        private int onNavigationEvent = -2;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        onExtraCallback(clearLogBuffers<T> clearlogbuffers) {
            this.onExtraCallbackWithResult = clearlogbuffers;
        }

        private final void onNavigationEvent() {
            T t;
            if (this.onNavigationEvent == -2) {
                t = (T) ((clearLogBuffers) this.onExtraCallbackWithResult).onWarmupCompleted.invoke();
            } else {
                Function1 function1 = ((clearLogBuffers) this.onExtraCallbackWithResult).IAuthTabCallback;
                T t2 = this.IAuthTabCallback;
                Intrinsics.checkNotNull(t2);
                t = (T) function1.invoke(t2);
            }
            this.IAuthTabCallback = t;
            this.onNavigationEvent = t == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.onNavigationEvent < 0) {
                onNavigationEvent();
            }
            if (this.onNavigationEvent == 0) {
                throw new NoSuchElementException();
            }
            T t = this.IAuthTabCallback;
            Intrinsics.checkNotNull(t, "");
            this.onNavigationEvent = -1;
            return t;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.onNavigationEvent < 0) {
                onNavigationEvent();
            }
            return this.onNavigationEvent == 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public clearLogBuffers(@NotNull Function0<? extends T> function0, @NotNull Function1<? super T, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onWarmupCompleted = function0;
        this.IAuthTabCallback = function1;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> IAuthTabCallback() {
        return new onExtraCallback(this);
    }
}
