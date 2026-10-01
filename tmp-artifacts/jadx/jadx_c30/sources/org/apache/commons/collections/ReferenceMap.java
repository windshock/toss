package org.apache.commons.collections;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o.TTLandingPageActivity10;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ReferenceMap extends AbstractMap {
    private volatile transient int IAuthTabCallback;
    private transient int IAuthTabCallbackDefault;
    private transient ReferenceQueue IAuthTabCallbackStub;
    private transient Collection access100;
    private transient int asBinder;
    private boolean asInterface;
    private int getInterfaceDescriptor;
    private float onExtraCallback;
    private transient Set onExtraCallbackWithResult;
    private int onNavigationEvent;
    private transient Entry[] onTransact;
    private transient Set onWarmupCompleted;

    public ReferenceMap() {
        this(0, 1);
    }

    public ReferenceMap(int i, int i2) {
        this(i, i2, 16, 0.75f);
    }

    public ReferenceMap(int i, int i2, int i3, float f) {
        this.asInterface = false;
        this.IAuthTabCallbackStub = new ReferenceQueue();
        onNavigationEvent("keyType", i);
        onNavigationEvent("valueType", i2);
        if (i3 <= 0) {
            throw new IllegalArgumentException("capacity must be positive");
        }
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("Load factor must be greater than 0 and less than 1.");
        }
        this.onNavigationEvent = i;
        this.getInterfaceDescriptor = i2;
        int i4 = 1;
        while (i4 < i3) {
            i4 <<= 1;
        }
        this.onTransact = new Entry[i4];
        this.onExtraCallback = f;
        this.IAuthTabCallbackDefault = (int) (i4 * f);
    }

    private static void onNavigationEvent(String str, int i) {
        if (i < 0 || i > 2) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append(" must be HARD, SOFT, WEAK.");
            throw new IllegalArgumentException(stringBuffer.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object onExtraCallback(int i, Object obj, int i2) {
        if (i == 0) {
            return obj;
        }
        if (i == 1) {
            return new SoftRef(i2, obj, this.IAuthTabCallbackStub);
        }
        if (i == 2) {
            return new WeakRef(i2, obj, this.IAuthTabCallbackStub);
        }
        throw new Error();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Entry onNavigationEvent(Object obj) {
        if (obj == null) {
            return null;
        }
        int iHashCode = obj.hashCode();
        for (Entry entry = this.onTransact[onExtraCallbackWithResult(iHashCode)]; entry != null; entry = entry.IAuthTabCallback) {
            if (entry.onNavigationEvent == iHashCode && obj.equals(entry.getKey())) {
                return entry;
            }
        }
        return null;
    }

    private int onExtraCallbackWithResult(int i) {
        int i2 = i + (~(i << 15));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (~(i5 << 11));
        return (i6 ^ (i6 >>> 16)) & (this.onTransact.length - 1);
    }

    private void IAuthTabCallback() {
        Entry[] entryArr = this.onTransact;
        this.onTransact = new Entry[entryArr.length << 1];
        for (int i = 0; i < entryArr.length; i++) {
            Entry entry = entryArr[i];
            while (entry != null) {
                Entry entry2 = entry.IAuthTabCallback;
                int iOnExtraCallbackWithResult = onExtraCallbackWithResult(entry.onNavigationEvent);
                Entry[] entryArr2 = this.onTransact;
                entry.IAuthTabCallback = entryArr2[iOnExtraCallbackWithResult];
                entryArr2[iOnExtraCallbackWithResult] = entry;
                entry = entry2;
            }
            entryArr[i] = null;
        }
        this.IAuthTabCallbackDefault = (int) (this.onTransact.length * this.onExtraCallback);
    }

    private void onWarmupCompleted() {
        Reference referencePoll = this.IAuthTabCallbackStub.poll();
        while (referencePoll != null) {
            IAuthTabCallback(referencePoll);
            referencePoll = this.IAuthTabCallbackStub.poll();
        }
    }

    private void IAuthTabCallback(Reference reference) {
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(reference.hashCode());
        Entry entry = null;
        for (Entry entry2 = this.onTransact[iOnExtraCallbackWithResult]; entry2 != null; entry2 = entry2.IAuthTabCallback) {
            if (entry2.onNavigationEvent(reference)) {
                if (entry == null) {
                    this.onTransact[iOnExtraCallbackWithResult] = entry2.IAuthTabCallback;
                } else {
                    entry.IAuthTabCallback = entry2.IAuthTabCallback;
                }
                this.asBinder--;
                return;
            }
            entry = entry2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        onWarmupCompleted();
        return this.asBinder;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        onWarmupCompleted();
        return this.asBinder == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        onWarmupCompleted();
        Entry entryOnNavigationEvent = onNavigationEvent(obj);
        return (entryOnNavigationEvent == null || entryOnNavigationEvent.getValue() == null) ? false : true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        onWarmupCompleted();
        Entry entryOnNavigationEvent = onNavigationEvent(obj);
        if (entryOnNavigationEvent == null) {
            return null;
        }
        return entryOnNavigationEvent.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null keys not allowed");
        }
        if (obj2 == null) {
            throw new NullPointerException("null values not allowed");
        }
        onWarmupCompleted();
        if (this.asBinder + 1 > this.IAuthTabCallbackDefault) {
            IAuthTabCallback();
        }
        int iHashCode = obj.hashCode();
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(iHashCode);
        for (Entry entry = this.onTransact[iOnExtraCallbackWithResult]; entry != null; entry = entry.IAuthTabCallback) {
            if (iHashCode == entry.onNavigationEvent && obj.equals(entry.getKey())) {
                Object value = entry.getValue();
                entry.setValue(obj2);
                return value;
            }
        }
        this.asBinder++;
        this.IAuthTabCallback++;
        Object objOnExtraCallback = onExtraCallback(this.onNavigationEvent, obj, iHashCode);
        Object objOnExtraCallback2 = onExtraCallback(this.getInterfaceDescriptor, obj2, iHashCode);
        Entry[] entryArr = this.onTransact;
        entryArr[iOnExtraCallbackWithResult] = new Entry(objOnExtraCallback, iHashCode, objOnExtraCallback2, entryArr[iOnExtraCallbackWithResult]);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        onWarmupCompleted();
        int iHashCode = obj.hashCode();
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(iHashCode);
        Entry entry = null;
        for (Entry entry2 = this.onTransact[iOnExtraCallbackWithResult]; entry2 != null; entry2 = entry2.IAuthTabCallback) {
            if (iHashCode == entry2.onNavigationEvent && obj.equals(entry2.getKey())) {
                if (entry == null) {
                    this.onTransact[iOnExtraCallbackWithResult] = entry2.IAuthTabCallback;
                } else {
                    entry.IAuthTabCallback = entry2.IAuthTabCallback;
                }
                this.asBinder--;
                this.IAuthTabCallback++;
                return entry2.getValue();
            }
            entry = entry2;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.onTransact, (Object) null);
        this.asBinder = 0;
        while (this.IAuthTabCallbackStub.poll() != null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.onWarmupCompleted;
        if (set != null) {
            return set;
        }
        AbstractSet abstractSet = new AbstractSet() { // from class: org.apache.commons.collections.ReferenceMap.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return ReferenceMap.this.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                ReferenceMap.this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                if (obj == null || !(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Entry entryOnNavigationEvent = ReferenceMap.this.onNavigationEvent(entry.getKey());
                return entryOnNavigationEvent != null && entry.equals(entryOnNavigationEvent);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                boolean zContains = contains(obj);
                if (zContains) {
                    ReferenceMap.this.remove(((Map.Entry) obj).getKey());
                }
                return zContains;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return ReferenceMap.this.new EntryIterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
                return toArray(new Object[0]);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray(Object[] objArr) {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterator();
                while (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    arrayList.add(new TTLandingPageActivity10(entry.getKey(), entry.getValue()));
                }
                return arrayList.toArray(objArr);
            }
        };
        this.onWarmupCompleted = abstractSet;
        return abstractSet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.onExtraCallbackWithResult;
        if (set != null) {
            return set;
        }
        AbstractSet abstractSet = new AbstractSet() { // from class: org.apache.commons.collections.ReferenceMap.2
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return ReferenceMap.this.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return new KeyIterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return ReferenceMap.this.containsKey(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                return ReferenceMap.this.remove(obj) != null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                ReferenceMap.this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
                return toArray(new Object[0]);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray(Object[] objArr) {
                ArrayList arrayList = new ArrayList(size());
                Iterator it = iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                return arrayList.toArray(objArr);
            }
        };
        this.onExtraCallbackWithResult = abstractSet;
        return abstractSet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.access100;
        if (collection != null) {
            return collection;
        }
        AbstractCollection abstractCollection = new AbstractCollection() { // from class: org.apache.commons.collections.ReferenceMap.3
            @Override // java.util.AbstractCollection, java.util.Collection
            public int size() {
                return ReferenceMap.this.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public void clear() {
                ReferenceMap.this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            public Iterator iterator() {
                return new ValueIterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public Object[] toArray() {
                return toArray(new Object[0]);
            }

            @Override // java.util.AbstractCollection, java.util.Collection
            public Object[] toArray(Object[] objArr) {
                ArrayList arrayList = new ArrayList(size());
                Iterator it = iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                return arrayList.toArray(objArr);
            }
        };
        this.access100 = abstractCollection;
        return abstractCollection;
    }

    class Entry implements Map.Entry {
        Entry IAuthTabCallback;
        Object onExtraCallbackWithResult;
        int onNavigationEvent;
        Object onWarmupCompleted;

        public Entry(Object obj, int i, Object obj2, Entry entry) {
            this.onExtraCallbackWithResult = obj;
            this.onNavigationEvent = i;
            this.onWarmupCompleted = obj2;
            this.IAuthTabCallback = entry;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return ReferenceMap.this.onNavigationEvent > 0 ? ((Reference) this.onExtraCallbackWithResult).get() : this.onExtraCallbackWithResult;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return ReferenceMap.this.getInterfaceDescriptor > 0 ? ((Reference) this.onWarmupCompleted).get() : this.onWarmupCompleted;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object value = getValue();
            if (ReferenceMap.this.getInterfaceDescriptor > 0) {
                ((Reference) this.onWarmupCompleted).clear();
            }
            ReferenceMap referenceMap = ReferenceMap.this;
            this.onWarmupCompleted = referenceMap.onExtraCallback(referenceMap.getInterfaceDescriptor, obj, this.onNavigationEvent);
            return value;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return key != null && value != null && key.equals(getKey()) && value.equals(getValue());
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object value = getValue();
            return (value == null ? 0 : value.hashCode()) ^ this.onNavigationEvent;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(getKey());
            stringBuffer.append("=");
            stringBuffer.append(getValue());
            return stringBuffer.toString();
        }

        boolean onNavigationEvent(Reference reference) {
            boolean z = (ReferenceMap.this.onNavigationEvent > 0 && this.onExtraCallbackWithResult == reference) || (ReferenceMap.this.getInterfaceDescriptor > 0 && this.onWarmupCompleted == reference);
            if (z) {
                if (ReferenceMap.this.onNavigationEvent > 0) {
                    ((Reference) this.onExtraCallbackWithResult).clear();
                }
                if (ReferenceMap.this.getInterfaceDescriptor <= 0) {
                    if (ReferenceMap.this.asInterface) {
                        this.onWarmupCompleted = null;
                    }
                } else {
                    ((Reference) this.onWarmupCompleted).clear();
                    return true;
                }
            }
            return z;
        }
    }

    class EntryIterator implements Iterator {
        int IAuthTabCallback;
        Entry IAuthTabCallbackStub;
        Object asBinder;
        Entry onExtraCallback;
        Object onExtraCallbackWithResult;
        Object onNavigationEvent;
        Object onTransact;
        int onWarmupCompleted;

        public EntryIterator() {
            this.IAuthTabCallback = ReferenceMap.this.size() != 0 ? ReferenceMap.this.onTransact.length : 0;
            this.onWarmupCompleted = ReferenceMap.this.IAuthTabCallback;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            onExtraCallbackWithResult();
            while (onNavigationEvent()) {
                Entry entry = this.onExtraCallback;
                int i = this.IAuthTabCallback;
                while (entry == null && i > 0) {
                    i--;
                    entry = ReferenceMap.this.onTransact[i];
                }
                this.onExtraCallback = entry;
                this.IAuthTabCallback = i;
                if (entry == null) {
                    this.onNavigationEvent = null;
                    this.onExtraCallbackWithResult = null;
                    return false;
                }
                this.onTransact = entry.getKey();
                this.asBinder = entry.getValue();
                if (onNavigationEvent()) {
                    this.onExtraCallback = this.onExtraCallback.IAuthTabCallback;
                }
            }
            return true;
        }

        private void onExtraCallbackWithResult() {
            if (ReferenceMap.this.IAuthTabCallback != this.onWarmupCompleted) {
                throw new ConcurrentModificationException();
            }
        }

        private boolean onNavigationEvent() {
            return this.onTransact == null || this.asBinder == null;
        }

        protected Entry onExtraCallback() {
            onExtraCallbackWithResult();
            if (onNavigationEvent() && !hasNext()) {
                throw new NoSuchElementException();
            }
            Entry entry = this.onExtraCallback;
            this.IAuthTabCallbackStub = entry;
            this.onExtraCallback = entry.IAuthTabCallback;
            this.onNavigationEvent = this.onTransact;
            this.onExtraCallbackWithResult = this.asBinder;
            this.onTransact = null;
            this.asBinder = null;
            return entry;
        }

        @Override // java.util.Iterator
        public Object next() {
            return onExtraCallback();
        }

        @Override // java.util.Iterator
        public void remove() {
            onExtraCallbackWithResult();
            if (this.IAuthTabCallbackStub == null) {
                throw new IllegalStateException();
            }
            ReferenceMap.this.remove(this.onNavigationEvent);
            this.IAuthTabCallbackStub = null;
            this.onNavigationEvent = null;
            this.onExtraCallbackWithResult = null;
            this.onWarmupCompleted = ReferenceMap.this.IAuthTabCallback;
        }
    }

    class ValueIterator extends EntryIterator {
        private final /* synthetic */ ReferenceMap IAuthTabCallbackDefault;

        private ValueIterator(ReferenceMap referenceMap) {
            super();
            this.IAuthTabCallbackDefault = referenceMap;
        }

        @Override // org.apache.commons.collections.ReferenceMap.EntryIterator, java.util.Iterator
        public Object next() {
            return onExtraCallback().getValue();
        }
    }

    class KeyIterator extends EntryIterator {
        private final /* synthetic */ ReferenceMap IAuthTabCallbackDefault;

        private KeyIterator(ReferenceMap referenceMap) {
            super();
            this.IAuthTabCallbackDefault = referenceMap;
        }

        @Override // org.apache.commons.collections.ReferenceMap.EntryIterator, java.util.Iterator
        public Object next() {
            return onExtraCallback().getKey();
        }
    }

    static class SoftRef extends SoftReference {
        private int onExtraCallbackWithResult;

        public SoftRef(int i, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.onExtraCallbackWithResult = i;
        }

        public int hashCode() {
            return this.onExtraCallbackWithResult;
        }
    }

    static class WeakRef extends WeakReference {
        private int onExtraCallback;

        public WeakRef(int i, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.onExtraCallback = i;
        }

        public int hashCode() {
            return this.onExtraCallback;
        }
    }
}
