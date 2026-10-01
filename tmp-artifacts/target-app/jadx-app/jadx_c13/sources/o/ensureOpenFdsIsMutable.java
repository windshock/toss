package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ensureOpenFdsIsMutable<T> implements Sequence<T>, addMemoryMappings<T> {
    private final Sequence<T> onExtraCallbackWithResult;
    private final int onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public ensureOpenFdsIsMutable(@NotNull Sequence<? extends T> sequence, int i) {
        Intrinsics.checkNotNullParameter(sequence, "");
        this.onExtraCallbackWithResult = sequence;
        this.onNavigationEvent = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // o.addMemoryMappings
    public Sequence<T> onNavigationEvent(int i) {
        int i2 = this.onNavigationEvent;
        return i >= i2 ? clearSelinuxLabel.onExtraCallback() : new ensureCommandLineIsMutable(this.onExtraCallbackWithResult, i, i2);
    }

    @Override // o.addMemoryMappings
    public Sequence<T> onWarmupCompleted(int i) {
        return i >= this.onNavigationEvent ? this : new ensureOpenFdsIsMutable(this.onExtraCallbackWithResult, i);
    }

    public static final class onWarmupCompleted implements Iterator<T>, KMappedMarker {
        private int IAuthTabCallback;
        private final Iterator<T> onExtraCallbackWithResult;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        onWarmupCompleted(ensureOpenFdsIsMutable<T> ensureopenfdsismutable) {
            this.IAuthTabCallback = ((ensureOpenFdsIsMutable) ensureopenfdsismutable).onNavigationEvent;
            this.onExtraCallbackWithResult = ((ensureOpenFdsIsMutable) ensureopenfdsismutable).onExtraCallbackWithResult.IAuthTabCallback();
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.IAuthTabCallback;
            if (i == 0) {
                throw new NoSuchElementException();
            }
            this.IAuthTabCallback = i - 1;
            return this.onExtraCallbackWithResult.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.IAuthTabCallback > 0 && this.onExtraCallbackWithResult.hasNext();
        }
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> IAuthTabCallback() {
        return new onWarmupCompleted(this);
    }
}
