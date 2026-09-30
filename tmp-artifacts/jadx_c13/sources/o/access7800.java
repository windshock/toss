package o;

import java.util.Iterator;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access7800<T> implements Iterable<IndexedValue<? extends T>>, KMappedMarker {
    private final Function0<Iterator<T>> IAuthTabCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public access7800(@NotNull Function0<? extends Iterator<? extends T>> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.IAuthTabCallback = function0;
    }

    @Override // java.lang.Iterable
    public Iterator<IndexedValue<T>> iterator() {
        return new access7700(this.IAuthTabCallback.invoke());
    }
}
