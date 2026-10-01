package o;

import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ensureMemoryMappingsIsMutable<T, R> implements Sequence<R> {
    private final Function2<Integer, T, R> onExtraCallback;
    private final Sequence<T> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public ensureMemoryMappingsIsMutable(@NotNull Sequence<? extends T> sequence, @NotNull Function2<? super Integer, ? super T, ? extends R> function2) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.onNavigationEvent = sequence;
        this.onExtraCallback = function2;
    }

    public static final class IAuthTabCallback implements Iterator<R>, KMappedMarker {
        private int onExtraCallback;
        final /* synthetic */ ensureMemoryMappingsIsMutable<T, R> onNavigationEvent;
        private final Iterator<T> onWarmupCompleted;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        IAuthTabCallback(ensureMemoryMappingsIsMutable<T, R> ensurememorymappingsismutable) {
            this.onNavigationEvent = ensurememorymappingsismutable;
            this.onWarmupCompleted = ((ensureMemoryMappingsIsMutable) ensurememorymappingsismutable).onNavigationEvent.IAuthTabCallback();
        }

        @Override // java.util.Iterator
        public R next() {
            Function2 function2 = ((ensureMemoryMappingsIsMutable) this.onNavigationEvent).onExtraCallback;
            int i = this.onExtraCallback;
            this.onExtraCallback = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            return (R) function2.invoke(Integer.valueOf(i), this.onWarmupCompleted.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.onWarmupCompleted.hasNext();
        }
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<R> IAuthTabCallback() {
        return new IAuthTabCallback(this);
    }
}
