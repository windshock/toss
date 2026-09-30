package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearOpenFds<T> implements Sequence<T> {
    private final boolean IAuthTabCallback;
    private final Function1<T, Boolean> onExtraCallback;
    private final Sequence<T> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public clearOpenFds(@NotNull Sequence<? extends T> sequence, boolean z, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onNavigationEvent = sequence;
        this.IAuthTabCallback = z;
        this.onExtraCallback = function1;
    }

    public static final class IAuthTabCallback implements Iterator<T>, KMappedMarker {
        final /* synthetic */ clearOpenFds<T> IAuthTabCallback;
        private final Iterator<T> onExtraCallback;
        private int onExtraCallbackWithResult = -1;
        private T onNavigationEvent;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        IAuthTabCallback(clearOpenFds<T> clearopenfds) {
            this.IAuthTabCallback = clearopenfds;
            this.onExtraCallback = ((clearOpenFds) clearopenfds).onNavigationEvent.IAuthTabCallback();
        }

        private final void IAuthTabCallback() {
            while (this.onExtraCallback.hasNext()) {
                T next = this.onExtraCallback.next();
                if (((Boolean) ((clearOpenFds) this.IAuthTabCallback).onExtraCallback.invoke(next)).booleanValue() == ((clearOpenFds) this.IAuthTabCallback).IAuthTabCallback) {
                    this.onNavigationEvent = next;
                    this.onExtraCallbackWithResult = 1;
                    return;
                }
            }
            this.onExtraCallbackWithResult = 0;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.onExtraCallbackWithResult == -1) {
                IAuthTabCallback();
            }
            if (this.onExtraCallbackWithResult == 0) {
                throw new NoSuchElementException();
            }
            T t = this.onNavigationEvent;
            this.onNavigationEvent = null;
            this.onExtraCallbackWithResult = -1;
            return t;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.onExtraCallbackWithResult == -1) {
                IAuthTabCallback();
            }
            return this.onExtraCallbackWithResult == 1;
        }
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> IAuthTabCallback() {
        return new IAuthTabCallback(this);
    }
}
