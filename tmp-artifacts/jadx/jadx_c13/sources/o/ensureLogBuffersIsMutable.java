package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ensureLogBuffersIsMutable<T> implements Sequence<T> {
    private final Sequence<T> IAuthTabCallback;
    private final Function1<T, Boolean> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public ensureLogBuffersIsMutable(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.IAuthTabCallback = sequence;
        this.onNavigationEvent = function1;
    }

    public static final class onNavigationEvent implements Iterator<T>, KMappedMarker {
        private T IAuthTabCallback;
        private int onExtraCallback = -1;
        final /* synthetic */ ensureLogBuffersIsMutable<T> onNavigationEvent;
        private final Iterator<T> onWarmupCompleted;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        onNavigationEvent(ensureLogBuffersIsMutable<T> ensurelogbuffersismutable) {
            this.onNavigationEvent = ensurelogbuffersismutable;
            this.onWarmupCompleted = ((ensureLogBuffersIsMutable) ensurelogbuffersismutable).IAuthTabCallback.IAuthTabCallback();
        }

        private final void onNavigationEvent() {
            if (this.onWarmupCompleted.hasNext()) {
                T next = this.onWarmupCompleted.next();
                if (((Boolean) ((ensureLogBuffersIsMutable) this.onNavigationEvent).onNavigationEvent.invoke(next)).booleanValue()) {
                    this.onExtraCallback = 1;
                    this.IAuthTabCallback = next;
                    return;
                }
            }
            this.onExtraCallback = 0;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.onExtraCallback == -1) {
                onNavigationEvent();
            }
            if (this.onExtraCallback == 0) {
                throw new NoSuchElementException();
            }
            T t = this.IAuthTabCallback;
            this.IAuthTabCallback = null;
            this.onExtraCallback = -1;
            return t;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.onExtraCallback == -1) {
                onNavigationEvent();
            }
            return this.onExtraCallback == 1;
        }
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> IAuthTabCallback() {
        return new onNavigationEvent(this);
    }
}
