package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RuntimeCompat<K, V> extends rewind<K, V, K> {
    @Override // java.util.Iterator
    public K next() {
        onWarmupCompleted();
        onExtraCallbackWithResult(onNavigationEvent() + 2);
        return (K) IAuthTabCallback()[onNavigationEvent() - 2];
    }
}
