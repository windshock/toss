package o;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import o.LazySaveableStateHolderExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class PagerKtExternalSyntheticLambda1<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private List<PagerKtExternalSyntheticLambda1<K, V>.onExtraCallback> IAuthTabCallback;
    private Map<K, V> asBinder;
    private boolean onExtraCallback;
    private Map<K, V> onExtraCallbackWithResult;
    private volatile PagerKtExternalSyntheticLambda1<K, V>.onWarmupCompleted onNavigationEvent;
    private volatile PagerKtExternalSyntheticLambda1<K, V>.IAuthTabCallback onWarmupCompleted;

    static <FieldDescriptorType extends LazySaveableStateHolderExternalSyntheticLambda2.onExtraCallbackWithResult<FieldDescriptorType>> PagerKtExternalSyntheticLambda1<FieldDescriptorType, Object> onExtraCallback() {
        return (PagerKtExternalSyntheticLambda1<FieldDescriptorType, Object>) new PagerKtExternalSyntheticLambda1<FieldDescriptorType, Object>() { // from class: o.PagerKtExternalSyntheticLambda1.1
            @Override // o.PagerKtExternalSyntheticLambda1, java.util.AbstractMap, java.util.Map
            public /* synthetic */ Object put(Object obj, Object obj2) {
                return super.put((Comparable) obj, obj2);
            }

            @Override // o.PagerKtExternalSyntheticLambda1
            public void asBinder() {
                if (!IAuthTabCallbackDefault()) {
                    for (int i2 = 0; i2 < onExtraCallbackWithResult(); i2++) {
                        Map.Entry<FieldDescriptorType, Object> entryIAuthTabCallback = IAuthTabCallback(i2);
                        if (((LazySaveableStateHolderExternalSyntheticLambda2.onExtraCallbackWithResult) entryIAuthTabCallback.getKey()).IAuthTabCallback()) {
                            entryIAuthTabCallback.setValue(Collections.unmodifiableList((List) entryIAuthTabCallback.getValue()));
                        }
                    }
                    for (Map.Entry<FieldDescriptorType, Object> entry : IAuthTabCallback()) {
                        if (((LazySaveableStateHolderExternalSyntheticLambda2.onExtraCallbackWithResult) entry.getKey()).IAuthTabCallback()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                super.asBinder();
            }
        };
    }

    private PagerKtExternalSyntheticLambda1() {
        this.IAuthTabCallback = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.onExtraCallbackWithResult = map;
        this.asBinder = map;
    }

    public void asBinder() {
        Map<K, V> mapUnmodifiableMap;
        Map<K, V> mapUnmodifiableMap2;
        if (this.onExtraCallback) {
            return;
        }
        if (this.onExtraCallbackWithResult.isEmpty()) {
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(this.onExtraCallbackWithResult);
        }
        this.onExtraCallbackWithResult = mapUnmodifiableMap;
        if (this.asBinder.isEmpty()) {
            mapUnmodifiableMap2 = Collections.EMPTY_MAP;
        } else {
            mapUnmodifiableMap2 = Collections.unmodifiableMap(this.asBinder);
        }
        this.asBinder = mapUnmodifiableMap2;
        this.onExtraCallback = true;
    }

    public boolean IAuthTabCallbackDefault() {
        return this.onExtraCallback;
    }

    public int onExtraCallbackWithResult() {
        return this.IAuthTabCallback.size();
    }

    public Map.Entry<K, V> IAuthTabCallback(int i2) {
        return this.IAuthTabCallback.get(i2);
    }

    public int onNavigationEvent() {
        return this.onExtraCallbackWithResult.size();
    }

    public Iterable<Map.Entry<K, V>> IAuthTabCallback() {
        if (this.onExtraCallbackWithResult.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return this.onExtraCallbackWithResult.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.IAuthTabCallback.size() + this.onExtraCallbackWithResult.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return onWarmupCompleted((PagerKtExternalSyntheticLambda1<K, V>) comparable) >= 0 || this.onExtraCallbackWithResult.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iOnWarmupCompleted = onWarmupCompleted((PagerKtExternalSyntheticLambda1<K, V>) comparable);
        if (iOnWarmupCompleted >= 0) {
            return this.IAuthTabCallback.get(iOnWarmupCompleted).getValue();
        }
        return this.onExtraCallbackWithResult.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public V put(K k, V v) {
        IAuthTabCallbackStub();
        int iOnWarmupCompleted = onWarmupCompleted((PagerKtExternalSyntheticLambda1<K, V>) k);
        if (iOnWarmupCompleted >= 0) {
            return this.IAuthTabCallback.get(iOnWarmupCompleted).setValue(v);
        }
        asInterface();
        int i2 = -(iOnWarmupCompleted + 1);
        if (i2 >= 16) {
            return onTransact().put(k, v);
        }
        if (this.IAuthTabCallback.size() == 16) {
            PagerKtExternalSyntheticLambda1<K, V>.onExtraCallback onextracallbackRemove = this.IAuthTabCallback.remove(15);
            onTransact().put(onextracallbackRemove.getKey(), onextracallbackRemove.getValue());
        }
        this.IAuthTabCallback.add(i2, new onExtraCallback(k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        IAuthTabCallbackStub();
        if (!this.IAuthTabCallback.isEmpty()) {
            this.IAuthTabCallback.clear();
        }
        if (this.onExtraCallbackWithResult.isEmpty()) {
            return;
        }
        this.onExtraCallbackWithResult.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        IAuthTabCallbackStub();
        Comparable comparable = (Comparable) obj;
        int iOnWarmupCompleted = onWarmupCompleted((PagerKtExternalSyntheticLambda1<K, V>) comparable);
        if (iOnWarmupCompleted >= 0) {
            return onExtraCallbackWithResult(iOnWarmupCompleted);
        }
        if (this.onExtraCallbackWithResult.isEmpty()) {
            return null;
        }
        return this.onExtraCallbackWithResult.remove(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V onExtraCallbackWithResult(int i2) {
        IAuthTabCallbackStub();
        V value = this.IAuthTabCallback.remove(i2).getValue();
        if (!this.onExtraCallbackWithResult.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = onTransact().entrySet().iterator();
            this.IAuthTabCallback.add(new onExtraCallback(this, it.next()));
            it.remove();
        }
        return value;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int onWarmupCompleted(K k) {
        int size = this.IAuthTabCallback.size();
        int i2 = size - 1;
        if (i2 < 0) {
            size = 0;
            while (size <= i2) {
                int i3 = (size + i2) / 2;
                int iCompareTo = k.compareTo(this.IAuthTabCallback.get(i3).getKey());
                if (iCompareTo < 0) {
                    i2 = i3 - 1;
                } else {
                    if (iCompareTo <= 0) {
                        return i3;
                    }
                    size = i3 + 1;
                }
            }
        } else {
            int iCompareTo2 = k.compareTo(this.IAuthTabCallback.get(i2).getKey());
            if (iCompareTo2 <= 0) {
                if (iCompareTo2 == 0) {
                    return i2;
                }
                size = 0;
                while (size <= i2) {
                }
            }
        }
        return -(size + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.onNavigationEvent == null) {
            this.onNavigationEvent = new onWarmupCompleted();
        }
        return this.onNavigationEvent;
    }

    Set<Map.Entry<K, V>> onWarmupCompleted() {
        if (this.onWarmupCompleted == null) {
            this.onWarmupCompleted = new IAuthTabCallback();
        }
        return this.onWarmupCompleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IAuthTabCallbackStub() {
        if (this.onExtraCallback) {
            throw new UnsupportedOperationException();
        }
    }

    private SortedMap<K, V> onTransact() {
        IAuthTabCallbackStub();
        if (this.onExtraCallbackWithResult.isEmpty() && !(this.onExtraCallbackWithResult instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.onExtraCallbackWithResult = treeMap;
            this.asBinder = treeMap.descendingMap();
        }
        return (SortedMap) this.onExtraCallbackWithResult;
    }

    private void asInterface() {
        IAuthTabCallbackStub();
        if (!this.IAuthTabCallback.isEmpty() || (this.IAuthTabCallback instanceof ArrayList)) {
            return;
        }
        this.IAuthTabCallback = new ArrayList(16);
    }

    class onExtraCallback implements Map.Entry<K, V>, Comparable<PagerKtExternalSyntheticLambda1<K, V>.onExtraCallback> {
        private V IAuthTabCallback;
        private final K onWarmupCompleted;

        onExtraCallback(PagerKtExternalSyntheticLambda1 pagerKtExternalSyntheticLambda1, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        onExtraCallback(K k, V v) {
            this.onWarmupCompleted = k;
            this.IAuthTabCallback = v;
        }

        @Override // java.util.Map.Entry
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.onWarmupCompleted;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.IAuthTabCallback;
        }

        @Override // java.lang.Comparable
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public int compareTo(PagerKtExternalSyntheticLambda1<K, V>.onExtraCallback onextracallback) {
            return getKey().compareTo(onextracallback.getKey());
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            PagerKtExternalSyntheticLambda1.this.IAuthTabCallbackStub();
            V v2 = this.IAuthTabCallback;
            this.IAuthTabCallback = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return onExtraCallback(this.onWarmupCompleted, entry.getKey()) && onExtraCallback(this.IAuthTabCallback, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.onWarmupCompleted;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.IAuthTabCallback;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        public String toString() {
            return this.onWarmupCompleted + "=" + this.IAuthTabCallback;
        }

        private boolean onExtraCallback(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }
    }

    class onWarmupCompleted extends AbstractSet<Map.Entry<K, V>> {
        private onWarmupCompleted() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new onExtraCallbackWithResult();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return PagerKtExternalSyntheticLambda1.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = PagerKtExternalSyntheticLambda1.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            PagerKtExternalSyntheticLambda1.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            PagerKtExternalSyntheticLambda1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            PagerKtExternalSyntheticLambda1.this.clear();
        }
    }

    class IAuthTabCallback extends PagerKtExternalSyntheticLambda1<K, V>.onWarmupCompleted {
        private IAuthTabCallback() {
            super();
        }

        @Override // o.PagerKtExternalSyntheticLambda1.onWarmupCompleted, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new onNavigationEvent();
        }
    }

    class onExtraCallbackWithResult implements Iterator<Map.Entry<K, V>> {
        private int onExtraCallback;
        private boolean onNavigationEvent;
        private Iterator<Map.Entry<K, V>> onWarmupCompleted;

        private onExtraCallbackWithResult() {
            this.onExtraCallback = -1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.onExtraCallback + 1 < PagerKtExternalSyntheticLambda1.this.IAuthTabCallback.size() || (!PagerKtExternalSyntheticLambda1.this.onExtraCallbackWithResult.isEmpty() && onWarmupCompleted().hasNext());
        }

        @Override // java.util.Iterator
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.onNavigationEvent = true;
            int i2 = this.onExtraCallback + 1;
            this.onExtraCallback = i2;
            if (i2 < PagerKtExternalSyntheticLambda1.this.IAuthTabCallback.size()) {
                return (Map.Entry) PagerKtExternalSyntheticLambda1.this.IAuthTabCallback.get(this.onExtraCallback);
            }
            return onWarmupCompleted().next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.onNavigationEvent) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.onNavigationEvent = false;
            PagerKtExternalSyntheticLambda1.this.IAuthTabCallbackStub();
            if (this.onExtraCallback < PagerKtExternalSyntheticLambda1.this.IAuthTabCallback.size()) {
                PagerKtExternalSyntheticLambda1 pagerKtExternalSyntheticLambda1 = PagerKtExternalSyntheticLambda1.this;
                int i2 = this.onExtraCallback;
                this.onExtraCallback = i2 - 1;
                pagerKtExternalSyntheticLambda1.onExtraCallbackWithResult(i2);
                return;
            }
            onWarmupCompleted().remove();
        }

        private Iterator<Map.Entry<K, V>> onWarmupCompleted() {
            if (this.onWarmupCompleted == null) {
                this.onWarmupCompleted = PagerKtExternalSyntheticLambda1.this.onExtraCallbackWithResult.entrySet().iterator();
            }
            return this.onWarmupCompleted;
        }
    }

    class onNavigationEvent implements Iterator<Map.Entry<K, V>> {
        private int onExtraCallbackWithResult;
        private Iterator<Map.Entry<K, V>> onNavigationEvent;

        private onNavigationEvent() {
            this.onExtraCallbackWithResult = PagerKtExternalSyntheticLambda1.this.IAuthTabCallback.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i2 = this.onExtraCallbackWithResult;
            return (i2 > 0 && i2 <= PagerKtExternalSyntheticLambda1.this.IAuthTabCallback.size()) || onNavigationEvent().hasNext();
        }

        @Override // java.util.Iterator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!onNavigationEvent().hasNext()) {
                List list = PagerKtExternalSyntheticLambda1.this.IAuthTabCallback;
                int i2 = this.onExtraCallbackWithResult - 1;
                this.onExtraCallbackWithResult = i2;
                return (Map.Entry) list.get(i2);
            }
            return onNavigationEvent().next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private Iterator<Map.Entry<K, V>> onNavigationEvent() {
            if (this.onNavigationEvent == null) {
                this.onNavigationEvent = PagerKtExternalSyntheticLambda1.this.asBinder.entrySet().iterator();
            }
            return this.onNavigationEvent;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PagerKtExternalSyntheticLambda1)) {
            return super.equals(obj);
        }
        PagerKtExternalSyntheticLambda1 pagerKtExternalSyntheticLambda1 = (PagerKtExternalSyntheticLambda1) obj;
        int size = size();
        if (size != pagerKtExternalSyntheticLambda1.size()) {
            return false;
        }
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (iOnExtraCallbackWithResult != pagerKtExternalSyntheticLambda1.onExtraCallbackWithResult()) {
            return entrySet().equals(pagerKtExternalSyntheticLambda1.entrySet());
        }
        for (int i2 = 0; i2 < iOnExtraCallbackWithResult; i2++) {
            if (!IAuthTabCallback(i2).equals(pagerKtExternalSyntheticLambda1.IAuthTabCallback(i2))) {
                return false;
            }
        }
        if (iOnExtraCallbackWithResult != size) {
            return this.onExtraCallbackWithResult.equals(pagerKtExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int iHashCode = 0;
        for (int i2 = 0; i2 < iOnExtraCallbackWithResult; i2++) {
            iHashCode += this.IAuthTabCallback.get(i2).hashCode();
        }
        return onNavigationEvent() > 0 ? iHashCode + this.onExtraCallbackWithResult.hashCode() : iHashCode;
    }
}
