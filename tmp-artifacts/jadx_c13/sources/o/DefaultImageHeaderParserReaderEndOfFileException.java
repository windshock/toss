package o;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class DefaultImageHeaderParserReaderEndOfFileException<K, V> implements Iterator<K>, KMutableIterator {
    private final BitmapTransformation<K, V> onExtraCallbackWithResult;

    public DefaultImageHeaderParserReaderEndOfFileException(@NotNull ResourceLoader<K, V> resourceLoader) {
        Intrinsics.checkNotNullParameter(resourceLoader, "");
        this.onExtraCallbackWithResult = new BitmapTransformation<>(resourceLoader.IAuthTabCallback(), resourceLoader);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.onExtraCallbackWithResult.hasNext();
    }

    @Override // java.util.Iterator
    public K next() {
        this.onExtraCallbackWithResult.next();
        return (K) this.onExtraCallbackWithResult.onWarmupCompleted();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.onExtraCallbackWithResult.remove();
    }
}
