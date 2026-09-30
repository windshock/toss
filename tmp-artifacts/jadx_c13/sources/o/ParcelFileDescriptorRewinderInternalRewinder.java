package o;

import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ParcelFileDescriptorRewinderInternalRewinder<K, V> extends rewind<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    /* renamed from: onTransact, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        onWarmupCompleted();
        onExtraCallbackWithResult(onNavigationEvent() + 2);
        return new TombstoneProtosTombstoneThreadsDefaultEntryHolder(IAuthTabCallback()[onNavigationEvent() - 2], IAuthTabCallback()[onNavigationEvent() - 1]);
    }
}
