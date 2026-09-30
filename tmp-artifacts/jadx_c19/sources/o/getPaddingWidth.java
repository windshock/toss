package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class getPaddingWidth<K, V> extends onMeasure<K, V> {
    private int onNavigationEvent;

    public void clear() {
        this.onNavigationEvent = 0;
        super/*o.getVirtualChildCount*/.clear();
    }

    public V onNavigationEvent(int i2, V v) {
        this.onNavigationEvent = 0;
        return (V) super/*o.getVirtualChildCount*/.onNavigationEvent(i2, v);
    }

    public V put(K k, V v) {
        this.onNavigationEvent = 0;
        return (V) super/*o.getVirtualChildCount*/.put(k, v);
    }

    public void onExtraCallbackWithResult(getVirtualChildCount<? extends K, ? extends V> getvirtualchildcount) {
        this.onNavigationEvent = 0;
        super/*o.getVirtualChildCount*/.onExtraCallbackWithResult(getvirtualchildcount);
    }

    public V onNavigationEvent(int i2) {
        this.onNavigationEvent = 0;
        return (V) super/*o.getVirtualChildCount*/.onNavigationEvent(i2);
    }

    public int hashCode() {
        if (this.onNavigationEvent == 0) {
            this.onNavigationEvent = super/*o.getVirtualChildCount*/.hashCode();
        }
        return this.onNavigationEvent;
    }
}
