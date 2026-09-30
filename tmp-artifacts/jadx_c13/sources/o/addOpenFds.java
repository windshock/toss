package o;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class addOpenFds<T> implements Sequence<T>, addMemoryMappings<T> {
    private final int onNavigationEvent;
    private final Sequence<T> onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public addOpenFds(@NotNull Sequence<? extends T> sequence, int i) {
        Intrinsics.checkNotNullParameter(sequence, "");
        this.onWarmupCompleted = sequence;
        this.onNavigationEvent = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // o.addMemoryMappings
    public Sequence<T> onNavigationEvent(int i) {
        int i2 = this.onNavigationEvent + i;
        return i2 < 0 ? new addOpenFds(this, i) : new addOpenFds(this.onWarmupCompleted, i2);
    }

    @Override // o.addMemoryMappings
    public Sequence<T> onWarmupCompleted(int i) {
        int i2 = this.onNavigationEvent;
        int i3 = i2 + i;
        return i3 < 0 ? new ensureOpenFdsIsMutable(this, i) : new ensureCommandLineIsMutable(this.onWarmupCompleted, i2, i3);
    }

    public static final class onExtraCallbackWithResult implements Iterator<T>, KMappedMarker {
        private final Iterator<T> onExtraCallbackWithResult;
        private int onWarmupCompleted;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        onExtraCallbackWithResult(addOpenFds<T> addopenfds) {
            this.onExtraCallbackWithResult = ((addOpenFds) addopenfds).onWarmupCompleted.IAuthTabCallback();
            this.onWarmupCompleted = ((addOpenFds) addopenfds).onNavigationEvent;
        }

        private final void onWarmupCompleted() {
            while (this.onWarmupCompleted > 0 && this.onExtraCallbackWithResult.hasNext()) {
                this.onExtraCallbackWithResult.next();
                this.onWarmupCompleted--;
            }
        }

        @Override // java.util.Iterator
        public T next() {
            onWarmupCompleted();
            return this.onExtraCallbackWithResult.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            onWarmupCompleted();
            return this.onExtraCallbackWithResult.hasNext();
        }
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> IAuthTabCallback() {
        return new onExtraCallbackWithResult(this);
    }
}
