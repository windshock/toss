package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o.TTLandingPageActivity18;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class TTLandingPageActivity16 extends TTLandingPageActivity18 {
    public int IAuthTabCallbackDefault;
    private transient ReferenceQueue access000;
    protected boolean access100;
    protected int getInterfaceDescriptor;

    protected TTLandingPageActivity16() {
    }

    public TTLandingPageActivity16(int i, int i2, int i3, float f, boolean z) {
        super(i3, f);
        onExtraCallback("keyType", i);
        onExtraCallback("valueType", i2);
        this.IAuthTabCallbackDefault = i;
        this.getInterfaceDescriptor = i2;
        this.access100 = z;
    }

    @Override // o.TTLandingPageActivity18
    protected void onNavigationEvent() {
        this.access000 = new ReferenceQueue();
    }

    private static void onExtraCallback(String str, int i) {
        if (i < 0 || i > 2) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append(" must be HARD, SOFT, WEAK.");
            throw new IllegalArgumentException(stringBuffer.toString());
        }
    }

    @Override // o.TTLandingPageActivity18, java.util.AbstractMap, java.util.Map
    public int size() {
        IAuthTabCallbackStub();
        return super.size();
    }

    @Override // o.TTLandingPageActivity18, java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        IAuthTabCallbackStub();
        return super.isEmpty();
    }

    @Override // o.TTLandingPageActivity18, java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        IAuthTabCallbackStub();
        TTLandingPageActivity18.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback = IAuthTabCallback(obj);
        return (onextracallbackwithresultIAuthTabCallback == null || onextracallbackwithresultIAuthTabCallback.getValue() == null) ? false : true;
    }

    @Override // o.TTLandingPageActivity18, java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        IAuthTabCallbackStub();
        if (obj == null) {
            return false;
        }
        return super.containsValue(obj);
    }

    @Override // o.TTLandingPageActivity18, java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        IAuthTabCallbackStub();
        TTLandingPageActivity18.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback = IAuthTabCallback(obj);
        if (onextracallbackwithresultIAuthTabCallback == null) {
            return null;
        }
        return onextracallbackwithresultIAuthTabCallback.getValue();
    }

    @Override // o.TTLandingPageActivity18, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null keys not allowed");
        }
        if (obj2 == null) {
            throw new NullPointerException("null values not allowed");
        }
        asInterface();
        return super.put(obj, obj2);
    }

    @Override // o.TTLandingPageActivity18, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        asInterface();
        return super.remove(obj);
    }

    @Override // o.TTLandingPageActivity18, java.util.AbstractMap, java.util.Map
    public void clear() {
        super.clear();
        while (this.access000.poll() != null) {
        }
    }

    @Override // o.TTLandingPageActivity18
    public TTLandingPageActivity onTransact() {
        return new onTransact(this);
    }

    @Override // o.TTLandingPageActivity18, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.onWarmupCompleted == null) {
            this.onWarmupCompleted = new onWarmupCompleted(this);
        }
        return this.onWarmupCompleted;
    }

    @Override // o.TTLandingPageActivity18, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        if (this.onNavigationEvent == null) {
            this.onNavigationEvent = new onNavigationEvent(this);
        }
        return this.onNavigationEvent;
    }

    @Override // o.TTLandingPageActivity18, java.util.AbstractMap, java.util.Map
    public Collection values() {
        if (this.asBinder == null) {
            this.asBinder = new IAuthTabCallbackStub(this);
        }
        return this.asBinder;
    }

    protected void IAuthTabCallbackStub() {
        IAuthTabCallbackDefault();
    }

    protected void asInterface() {
        IAuthTabCallbackDefault();
    }

    protected void IAuthTabCallbackDefault() {
        Reference referencePoll = this.access000.poll();
        while (referencePoll != null) {
            onNavigationEvent(referencePoll);
            referencePoll = this.access000.poll();
        }
    }

    protected void onNavigationEvent(Reference reference) {
        int iIAuthTabCallback = IAuthTabCallback(reference.hashCode(), this.onExtraCallback.length);
        TTLandingPageActivity18.onExtraCallbackWithResult onextracallbackwithresult = null;
        for (TTLandingPageActivity18.onExtraCallbackWithResult onextracallbackwithresult2 = this.onExtraCallback[iIAuthTabCallback]; onextracallbackwithresult2 != null; onextracallbackwithresult2 = onextracallbackwithresult2.IAuthTabCallback) {
            if (((onExtraCallback) onextracallbackwithresult2).onWarmupCompleted(reference)) {
                if (onextracallbackwithresult == null) {
                    this.onExtraCallback[iIAuthTabCallback] = onextracallbackwithresult2.IAuthTabCallback;
                } else {
                    onextracallbackwithresult.IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback;
                }
                this.onTransact--;
                return;
            }
            onextracallbackwithresult = onextracallbackwithresult2;
        }
    }

    @Override // o.TTLandingPageActivity18
    protected TTLandingPageActivity18.onExtraCallbackWithResult IAuthTabCallback(Object obj) {
        if (obj == null) {
            return null;
        }
        return super.IAuthTabCallback(obj);
    }

    protected int onNavigationEvent(Object obj, Object obj2) {
        return (obj == null ? 0 : obj.hashCode()) ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // o.TTLandingPageActivity18
    protected boolean onWarmupCompleted(Object obj, Object obj2) {
        if (this.IAuthTabCallbackDefault > 0) {
            obj2 = ((Reference) obj2).get();
        }
        return obj == obj2 || obj.equals(obj2);
    }

    @Override // o.TTLandingPageActivity18
    protected TTLandingPageActivity18.onExtraCallbackWithResult IAuthTabCallback(TTLandingPageActivity18.onExtraCallbackWithResult onextracallbackwithresult, int i, Object obj, Object obj2) {
        return new onExtraCallback(this, onextracallbackwithresult, i, obj, obj2);
    }

    @Override // o.TTLandingPageActivity18
    protected Iterator onWarmupCompleted() {
        return new onExtraCallbackWithResult(this);
    }

    @Override // o.TTLandingPageActivity18
    protected Iterator onExtraCallbackWithResult() {
        return new IAuthTabCallback(this);
    }

    @Override // o.TTLandingPageActivity18
    protected Iterator IAuthTabCallback() {
        return new asBinder(this);
    }

    static class onWarmupCompleted extends TTLandingPageActivity18.onWarmupCompleted {
        protected onWarmupCompleted(TTLandingPageActivity18 tTLandingPageActivity18) {
            super(tTLandingPageActivity18);
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
                Map.Entry entry = (Map.Entry) it.next();
                arrayList.add(new TTLandingPageActivity10(entry.getKey(), entry.getValue()));
            }
            return arrayList.toArray(objArr);
        }
    }

    static class onNavigationEvent extends TTLandingPageActivity18.IAuthTabCallbackDefault {
        protected onNavigationEvent(TTLandingPageActivity18 tTLandingPageActivity18) {
            super(tTLandingPageActivity18);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return toArray(new Object[0]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray(Object[] objArr) {
            ArrayList arrayList = new ArrayList(this.IAuthTabCallback.size());
            Iterator it = iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            return arrayList.toArray(objArr);
        }
    }

    static class IAuthTabCallbackStub extends TTLandingPageActivity18.asInterface {
        protected IAuthTabCallbackStub(TTLandingPageActivity18 tTLandingPageActivity18) {
            super(tTLandingPageActivity18);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return toArray(new Object[0]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            ArrayList arrayList = new ArrayList(this.onWarmupCompleted.size());
            Iterator it = iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            return arrayList.toArray(objArr);
        }
    }

    protected static class onExtraCallback extends TTLandingPageActivity18.onExtraCallbackWithResult {
        protected final TTLandingPageActivity16 onExtraCallback;

        public onExtraCallback(TTLandingPageActivity16 tTLandingPageActivity16, TTLandingPageActivity18.onExtraCallbackWithResult onextracallbackwithresult, int i, Object obj, Object obj2) {
            super(onextracallbackwithresult, i, null, null);
            this.onExtraCallback = tTLandingPageActivity16;
            this.onNavigationEvent = onExtraCallback(tTLandingPageActivity16.IAuthTabCallbackDefault, obj, i);
            this.onExtraCallbackWithResult = onExtraCallback(tTLandingPageActivity16.getInterfaceDescriptor, obj2, i);
        }

        @Override // o.TTLandingPageActivity18.onExtraCallbackWithResult, java.util.Map.Entry
        public Object getKey() {
            return this.onExtraCallback.IAuthTabCallbackDefault > 0 ? ((Reference) this.onNavigationEvent).get() : this.onNavigationEvent;
        }

        @Override // o.TTLandingPageActivity18.onExtraCallbackWithResult, java.util.Map.Entry
        public Object getValue() {
            return this.onExtraCallback.getInterfaceDescriptor > 0 ? ((Reference) this.onExtraCallbackWithResult).get() : this.onExtraCallbackWithResult;
        }

        @Override // o.TTLandingPageActivity18.onExtraCallbackWithResult, java.util.Map.Entry
        public Object setValue(Object obj) {
            Object value = getValue();
            if (this.onExtraCallback.getInterfaceDescriptor > 0) {
                ((Reference) this.onExtraCallbackWithResult).clear();
            }
            this.onExtraCallbackWithResult = onExtraCallback(this.onExtraCallback.getInterfaceDescriptor, obj, this.onWarmupCompleted);
            return value;
        }

        @Override // o.TTLandingPageActivity18.onExtraCallbackWithResult, java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return key != null && value != null && this.onExtraCallback.onWarmupCompleted(key, this.onNavigationEvent) && this.onExtraCallback.IAuthTabCallback(value, getValue());
        }

        @Override // o.TTLandingPageActivity18.onExtraCallbackWithResult, java.util.Map.Entry
        public int hashCode() {
            return this.onExtraCallback.onNavigationEvent(getKey(), getValue());
        }

        protected Object onExtraCallback(int i, Object obj, int i2) {
            if (i == 0) {
                return obj;
            }
            if (i == 1) {
                return new IAuthTabCallbackDefault(i2, obj, this.onExtraCallback.access000);
            }
            if (i == 2) {
                return new asInterface(i2, obj, this.onExtraCallback.access000);
            }
            throw new Error();
        }

        boolean onWarmupCompleted(Reference reference) {
            TTLandingPageActivity16 tTLandingPageActivity16 = this.onExtraCallback;
            int i = tTLandingPageActivity16.IAuthTabCallbackDefault;
            boolean z = (i > 0 && this.onNavigationEvent == reference) || (tTLandingPageActivity16.getInterfaceDescriptor > 0 && this.onExtraCallbackWithResult == reference);
            if (z) {
                if (i > 0) {
                    ((Reference) this.onNavigationEvent).clear();
                }
                TTLandingPageActivity16 tTLandingPageActivity162 = this.onExtraCallback;
                if (tTLandingPageActivity162.getInterfaceDescriptor > 0) {
                    ((Reference) this.onExtraCallbackWithResult).clear();
                    return true;
                }
                if (tTLandingPageActivity162.access100) {
                    this.onExtraCallbackWithResult = null;
                }
            }
            return z;
        }

        protected onExtraCallback onExtraCallback() {
            return (onExtraCallback) this.IAuthTabCallback;
        }
    }

    static class onExtraCallbackWithResult implements Iterator {
        int IAuthTabCallback;
        final TTLandingPageActivity16 IAuthTabCallbackStub;
        Object asBinder;
        Object asInterface;
        onExtraCallback onExtraCallback;
        int onExtraCallbackWithResult;
        Object onNavigationEvent;
        onExtraCallback onTransact;
        Object onWarmupCompleted;

        public onExtraCallbackWithResult(TTLandingPageActivity16 tTLandingPageActivity16) {
            this.IAuthTabCallbackStub = tTLandingPageActivity16;
            this.IAuthTabCallback = tTLandingPageActivity16.size() != 0 ? tTLandingPageActivity16.onExtraCallback.length : 0;
            this.onExtraCallbackWithResult = tTLandingPageActivity16.IAuthTabCallbackStub;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            IAuthTabCallback();
            while (onExtraCallbackWithResult()) {
                onExtraCallback onextracallback = this.onExtraCallback;
                int i = this.IAuthTabCallback;
                while (onextracallback == null && i > 0) {
                    i--;
                    onextracallback = (onExtraCallback) this.IAuthTabCallbackStub.onExtraCallback[i];
                }
                this.onExtraCallback = onextracallback;
                this.IAuthTabCallback = i;
                if (onextracallback == null) {
                    this.onWarmupCompleted = null;
                    this.onNavigationEvent = null;
                    return false;
                }
                this.asBinder = onextracallback.getKey();
                this.asInterface = onextracallback.getValue();
                if (onExtraCallbackWithResult()) {
                    this.onExtraCallback = this.onExtraCallback.onExtraCallback();
                }
            }
            return true;
        }

        private void IAuthTabCallback() {
            if (this.IAuthTabCallbackStub.IAuthTabCallbackStub != this.onExtraCallbackWithResult) {
                throw new ConcurrentModificationException();
            }
        }

        private boolean onExtraCallbackWithResult() {
            return this.asBinder == null || this.asInterface == null;
        }

        protected onExtraCallback onExtraCallback() {
            IAuthTabCallback();
            if (onExtraCallbackWithResult() && !hasNext()) {
                throw new NoSuchElementException();
            }
            onExtraCallback onextracallback = this.onExtraCallback;
            this.onTransact = onextracallback;
            this.onExtraCallback = onextracallback.onExtraCallback();
            this.onWarmupCompleted = this.asBinder;
            this.onNavigationEvent = this.asInterface;
            this.asBinder = null;
            this.asInterface = null;
            return this.onTransact;
        }

        protected onExtraCallback onNavigationEvent() {
            IAuthTabCallback();
            return this.onTransact;
        }

        @Override // java.util.Iterator
        public Object next() {
            return onExtraCallback();
        }

        @Override // java.util.Iterator
        public void remove() {
            IAuthTabCallback();
            if (this.onTransact == null) {
                throw new IllegalStateException();
            }
            this.IAuthTabCallbackStub.remove(this.onWarmupCompleted);
            this.onTransact = null;
            this.onWarmupCompleted = null;
            this.onNavigationEvent = null;
            this.onExtraCallbackWithResult = this.IAuthTabCallbackStub.IAuthTabCallbackStub;
        }
    }

    static class IAuthTabCallback extends onExtraCallbackWithResult {
        IAuthTabCallback(TTLandingPageActivity16 tTLandingPageActivity16) {
            super(tTLandingPageActivity16);
        }

        @Override // o.TTLandingPageActivity16.onExtraCallbackWithResult, java.util.Iterator
        public Object next() {
            return onExtraCallback().getKey();
        }
    }

    static class asBinder extends onExtraCallbackWithResult {
        asBinder(TTLandingPageActivity16 tTLandingPageActivity16) {
            super(tTLandingPageActivity16);
        }

        @Override // o.TTLandingPageActivity16.onExtraCallbackWithResult, java.util.Iterator
        public Object next() {
            return onExtraCallback().getValue();
        }
    }

    static class onTransact extends onExtraCallbackWithResult implements TTLandingPageActivity {
        protected onTransact(TTLandingPageActivity16 tTLandingPageActivity16) {
            super(tTLandingPageActivity16);
        }

        @Override // o.TTLandingPageActivity16.onExtraCallbackWithResult, java.util.Iterator
        public Object next() {
            return onExtraCallback().getKey();
        }

        @Override // o.TTLandingPageActivity
        public Object onExtraCallbackWithResult() {
            onExtraCallback onextracallbackOnNavigationEvent = onNavigationEvent();
            if (onextracallbackOnNavigationEvent == null) {
                throw new IllegalStateException("getValue() can only be called after next() and before remove()");
            }
            return onextracallbackOnNavigationEvent.getValue();
        }
    }

    static class IAuthTabCallbackDefault extends SoftReference {
        private int IAuthTabCallback;

        public IAuthTabCallbackDefault(int i, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.IAuthTabCallback = i;
        }

        public int hashCode() {
            return this.IAuthTabCallback;
        }
    }

    static class asInterface extends WeakReference {
        private int onNavigationEvent;

        public asInterface(int i, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.onNavigationEvent = i;
        }

        public int hashCode() {
            return this.onNavigationEvent;
        }
    }

    @Override // o.TTLandingPageActivity18
    public void onExtraCallbackWithResult(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.IAuthTabCallbackDefault);
        objectOutputStream.writeInt(this.getInterfaceDescriptor);
        objectOutputStream.writeBoolean(this.access100);
        objectOutputStream.writeFloat(this.IAuthTabCallback);
        objectOutputStream.writeInt(this.onExtraCallback.length);
        TTLandingPageActivity tTLandingPageActivityOnTransact = onTransact();
        while (tTLandingPageActivityOnTransact.hasNext()) {
            objectOutputStream.writeObject(tTLandingPageActivityOnTransact.next());
            objectOutputStream.writeObject(tTLandingPageActivityOnTransact.onExtraCallbackWithResult());
        }
        objectOutputStream.writeObject(null);
    }

    @Override // o.TTLandingPageActivity18
    public void onExtraCallbackWithResult(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.IAuthTabCallbackDefault = objectInputStream.readInt();
        this.getInterfaceDescriptor = objectInputStream.readInt();
        this.access100 = objectInputStream.readBoolean();
        this.IAuthTabCallback = objectInputStream.readFloat();
        int i = objectInputStream.readInt();
        onNavigationEvent();
        this.onExtraCallback = new TTLandingPageActivity18.onExtraCallbackWithResult[i];
        while (true) {
            Object object = objectInputStream.readObject();
            if (object != null) {
                put(object, objectInputStream.readObject());
            } else {
                this.asInterface = onExtraCallback(this.onExtraCallback.length, this.IAuthTabCallback);
                return;
            }
        }
    }
}
