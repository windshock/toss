package o;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class LazyStaggeredGridDslKtExternalSyntheticLambda1 extends PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda1 {
    private final LazyStaggeredGridMeasureKtExternalSyntheticLambda1 onExtraCallback;

    public LazyStaggeredGridMeasureKtExternalSyntheticLambda1 onNavigationEvent() {
        return onExtraCallbackWithResult(this.onExtraCallback);
    }

    @Override // o.PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda1
    public int hashCode() {
        return onNavigationEvent().hashCode();
    }

    @Override // o.PrefetchHandleProviderHandleAndRequestImplExternalSyntheticLambda1
    public boolean equals(Object obj) {
        return onNavigationEvent().equals(obj);
    }

    public String toString() {
        return onNavigationEvent().toString();
    }

    static class IAuthTabCallback<K> implements Map.Entry<K, Object> {
        private Map.Entry<K, LazyStaggeredGridDslKtExternalSyntheticLambda1> onNavigationEvent;

        private IAuthTabCallback(Map.Entry<K, LazyStaggeredGridDslKtExternalSyntheticLambda1> entry) {
            this.onNavigationEvent = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.onNavigationEvent.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            LazyStaggeredGridDslKtExternalSyntheticLambda1 value = this.onNavigationEvent.getValue();
            if (value == null) {
                return null;
            }
            return value.onNavigationEvent();
        }

        public LazyStaggeredGridDslKtExternalSyntheticLambda1 onWarmupCompleted() {
            return this.onNavigationEvent.getValue();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (!(obj instanceof LazyStaggeredGridMeasureKtExternalSyntheticLambda1)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            return this.onNavigationEvent.getValue().onNavigationEvent((LazyStaggeredGridMeasureKtExternalSyntheticLambda1) obj);
        }
    }

    static class onWarmupCompleted<K> implements Iterator<Map.Entry<K, Object>> {
        private Iterator<Map.Entry<K, Object>> onExtraCallback;

        public onWarmupCompleted(Iterator<Map.Entry<K, Object>> it) {
            this.onExtraCallback = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.onExtraCallback.hasNext();
        }

        @Override // java.util.Iterator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.onExtraCallback.next();
            return next.getValue() instanceof LazyStaggeredGridDslKtExternalSyntheticLambda1 ? new IAuthTabCallback(next) : next;
        }

        @Override // java.util.Iterator
        public void remove() {
            this.onExtraCallback.remove();
        }
    }
}
