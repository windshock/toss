package kotlin.collections;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class CollectionsKt__IteratorsJVMKt extends CollectionsKt__IterablesKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class IAuthTabCallback<T> implements Iterator<T>, KMappedMarker {
        final /* synthetic */ Enumeration<T> onExtraCallback;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        IAuthTabCallback(Enumeration<T> enumeration) {
            this.onExtraCallback = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.onExtraCallback.hasMoreElements();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.onExtraCallback.nextElement();
        }
    }

    public static <T> Iterator<T> iterator(@NotNull Enumeration<T> enumeration) {
        Intrinsics.checkNotNullParameter(enumeration, "");
        return new IAuthTabCallback(enumeration);
    }
}
