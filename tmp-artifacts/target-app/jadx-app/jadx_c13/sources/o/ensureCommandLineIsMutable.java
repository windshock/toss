package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ensureCommandLineIsMutable<T> implements Sequence<T>, addMemoryMappings<T> {
    private final Sequence<T> onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final int onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public ensureCommandLineIsMutable(@NotNull Sequence<? extends T> sequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(sequence, "");
        this.onExtraCallbackWithResult = sequence;
        this.onWarmupCompleted = i;
        this.onNavigationEvent = i2;
        if (i < 0) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i2).toString());
        }
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i2 + " < " + i).toString());
    }

    private final int onExtraCallback() {
        return this.onNavigationEvent - this.onWarmupCompleted;
    }

    @Override // o.addMemoryMappings
    public Sequence<T> onNavigationEvent(int i) {
        return i >= onExtraCallback() ? clearSelinuxLabel.onExtraCallback() : new ensureCommandLineIsMutable(this.onExtraCallbackWithResult, this.onWarmupCompleted + i, this.onNavigationEvent);
    }

    @Override // o.addMemoryMappings
    public Sequence<T> onWarmupCompleted(int i) {
        if (i >= onExtraCallback()) {
            return this;
        }
        Sequence<T> sequence = this.onExtraCallbackWithResult;
        int i2 = this.onWarmupCompleted;
        return new ensureCommandLineIsMutable(sequence, i2, i + i2);
    }

    public static final class onExtraCallbackWithResult implements Iterator<T>, KMappedMarker {
        private final Iterator<T> IAuthTabCallback;
        final /* synthetic */ ensureCommandLineIsMutable<T> onExtraCallbackWithResult;
        private int onNavigationEvent;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        onExtraCallbackWithResult(ensureCommandLineIsMutable<T> ensurecommandlineismutable) {
            this.onExtraCallbackWithResult = ensurecommandlineismutable;
            this.IAuthTabCallback = ((ensureCommandLineIsMutable) ensurecommandlineismutable).onExtraCallbackWithResult.IAuthTabCallback();
        }

        private final void IAuthTabCallback() {
            while (this.onNavigationEvent < ((ensureCommandLineIsMutable) this.onExtraCallbackWithResult).onWarmupCompleted && this.IAuthTabCallback.hasNext()) {
                this.IAuthTabCallback.next();
                this.onNavigationEvent++;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            IAuthTabCallback();
            return this.onNavigationEvent < ((ensureCommandLineIsMutable) this.onExtraCallbackWithResult).onNavigationEvent && this.IAuthTabCallback.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            IAuthTabCallback();
            if (this.onNavigationEvent >= ((ensureCommandLineIsMutable) this.onExtraCallbackWithResult).onNavigationEvent) {
                throw new NoSuchElementException();
            }
            this.onNavigationEvent++;
            return this.IAuthTabCallback.next();
        }
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> IAuthTabCallback() {
        return new onExtraCallbackWithResult(this);
    }
}
