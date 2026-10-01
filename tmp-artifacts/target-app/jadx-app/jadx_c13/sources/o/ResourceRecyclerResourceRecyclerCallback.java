package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResourceRecyclerResourceRecyclerCallback<K, V> extends rewind<K, V, V> {
    @Override // java.util.Iterator
    public V next() {
        onWarmupCompleted();
        onExtraCallbackWithResult(onNavigationEvent() + 2);
        return (V) IAuthTabCallback()[onNavigationEvent() - 1];
    }
}
