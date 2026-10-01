package o;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RequestManagerRequestManagerConnectivityListener<K, V> extends access6700<K> implements getOpenFdsOrBuilderList<K> {
    private final Glide<K, V> onExtraCallback;

    public RequestManagerRequestManagerConnectivityListener(@NotNull Glide<K, V> glide) {
        Intrinsics.checkNotNullParameter(glide, "");
        this.onExtraCallback = glide;
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.onExtraCallback.size();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.onExtraCallback.containsKey(obj);
    }

    @Override // o.access6700, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<K> iterator() {
        return new RequestManager1(this.onExtraCallback.asInterface());
    }
}
