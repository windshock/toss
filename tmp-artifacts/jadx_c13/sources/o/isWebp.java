package o;

import java.util.Iterator;
import kotlin.collections.AbstractCollection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class isWebp<K, V> extends AbstractCollection<V> implements getOpenFds<V> {
    private final Glide<K, V> onExtraCallback;

    public isWebp(@NotNull Glide<K, V> glide) {
        Intrinsics.checkNotNullParameter(glide, "");
        this.onExtraCallback = glide;
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.onExtraCallback.size();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.onExtraCallback.containsValue(obj);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new ResourceDecoder(this.onExtraCallback.asInterface());
    }
}
