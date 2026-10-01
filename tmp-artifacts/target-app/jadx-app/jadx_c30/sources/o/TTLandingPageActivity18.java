package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class TTLandingPageActivity18 extends AbstractMap implements TTHistoryLandingPageActivity9 {
    protected static final Object onExtraCallbackWithResult = new Object();
    protected transient float IAuthTabCallback;
    protected transient int IAuthTabCallbackStub;
    protected transient asInterface asBinder;
    protected transient int asInterface;
    protected transient onExtraCallbackWithResult[] onExtraCallback;
    protected transient IAuthTabCallbackDefault onNavigationEvent;
    protected transient int onTransact;
    protected transient onWarmupCompleted onWarmupCompleted;

    protected int IAuthTabCallback(int i, int i2) {
        return i & (i2 - 1);
    }

    protected int onExtraCallback(int i, float f) {
        return (int) (i * f);
    }

    protected void onNavigationEvent() {
    }

    protected int onWarmupCompleted(int i) {
        if (i > 1073741824) {
            return 1073741824;
        }
        int i2 = 1;
        while (i2 < i) {
            i2 <<= 1;
        }
        if (i2 > 1073741824) {
            return 1073741824;
        }
        return i2;
    }

    protected TTLandingPageActivity18() {
    }

    protected TTLandingPageActivity18(int i, float f) {
        if (i <= 0) {
            throw new IllegalArgumentException("Initial capacity must be greater than 0");
        }
        if (f <= 0.0f || Float.isNaN(f)) {
            throw new IllegalArgumentException("Load factor must be greater than 0");
        }
        this.IAuthTabCallback = f;
        int iOnWarmupCompleted = onWarmupCompleted(i);
        this.asInterface = onExtraCallback(iOnWarmupCompleted, f);
        this.onExtraCallback = new onExtraCallbackWithResult[iOnWarmupCompleted];
        onNavigationEvent();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(obj);
        int iOnWarmupCompleted = onWarmupCompleted(objOnExtraCallbackWithResult);
        onExtraCallbackWithResult[] onextracallbackwithresultArr = this.onExtraCallback;
        for (onExtraCallbackWithResult onextracallbackwithresult = onextracallbackwithresultArr[IAuthTabCallback(iOnWarmupCompleted, onextracallbackwithresultArr.length)]; onextracallbackwithresult != null; onextracallbackwithresult = onextracallbackwithresult.IAuthTabCallback) {
            if (onextracallbackwithresult.onWarmupCompleted == iOnWarmupCompleted && onWarmupCompleted(objOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent)) {
                return onextracallbackwithresult.getValue();
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.onTransact;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.onTransact == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(obj);
        int iOnWarmupCompleted = onWarmupCompleted(objOnExtraCallbackWithResult);
        onExtraCallbackWithResult[] onextracallbackwithresultArr = this.onExtraCallback;
        for (onExtraCallbackWithResult onextracallbackwithresult = onextracallbackwithresultArr[IAuthTabCallback(iOnWarmupCompleted, onextracallbackwithresultArr.length)]; onextracallbackwithresult != null; onextracallbackwithresult = onextracallbackwithresult.IAuthTabCallback) {
            if (onextracallbackwithresult.onWarmupCompleted == iOnWarmupCompleted && onWarmupCompleted(objOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        if (obj == null) {
            int length = this.onExtraCallback.length;
            for (int i = 0; i < length; i++) {
                for (onExtraCallbackWithResult onextracallbackwithresult = this.onExtraCallback[i]; onextracallbackwithresult != null; onextracallbackwithresult = onextracallbackwithresult.IAuthTabCallback) {
                    if (onextracallbackwithresult.getValue() == null) {
                        return true;
                    }
                }
            }
        } else {
            int length2 = this.onExtraCallback.length;
            for (int i2 = 0; i2 < length2; i2++) {
                for (onExtraCallbackWithResult onextracallbackwithresult2 = this.onExtraCallback[i2]; onextracallbackwithresult2 != null; onextracallbackwithresult2 = onextracallbackwithresult2.IAuthTabCallback) {
                    if (IAuthTabCallback(obj, onextracallbackwithresult2.getValue())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(obj);
        int iOnWarmupCompleted = onWarmupCompleted(objOnExtraCallbackWithResult);
        int iIAuthTabCallback = IAuthTabCallback(iOnWarmupCompleted, this.onExtraCallback.length);
        for (onExtraCallbackWithResult onextracallbackwithresult = this.onExtraCallback[iIAuthTabCallback]; onextracallbackwithresult != null; onextracallbackwithresult = onextracallbackwithresult.IAuthTabCallback) {
            if (onextracallbackwithresult.onWarmupCompleted == iOnWarmupCompleted && onWarmupCompleted(objOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent)) {
                Object value = onextracallbackwithresult.getValue();
                IAuthTabCallback(onextracallbackwithresult, obj2);
                return value;
            }
        }
        onExtraCallback(iIAuthTabCallback, iOnWarmupCompleted, objOnExtraCallbackWithResult, obj2);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        if (map.size() != 0) {
            IAuthTabCallback(onWarmupCompleted((int) (((this.onTransact + r0) / this.IAuthTabCallback) + 1.0f)));
            for (Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(obj);
        int iOnWarmupCompleted = onWarmupCompleted(objOnExtraCallbackWithResult);
        int iIAuthTabCallback = IAuthTabCallback(iOnWarmupCompleted, this.onExtraCallback.length);
        onExtraCallbackWithResult onextracallbackwithresult = null;
        for (onExtraCallbackWithResult onextracallbackwithresult2 = this.onExtraCallback[iIAuthTabCallback]; onextracallbackwithresult2 != null; onextracallbackwithresult2 = onextracallbackwithresult2.IAuthTabCallback) {
            if (onextracallbackwithresult2.onWarmupCompleted == iOnWarmupCompleted && onWarmupCompleted(objOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent)) {
                Object value = onextracallbackwithresult2.getValue();
                onWarmupCompleted(onextracallbackwithresult2, iIAuthTabCallback, onextracallbackwithresult);
                return value;
            }
            onextracallbackwithresult = onextracallbackwithresult2;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.IAuthTabCallbackStub++;
        onExtraCallbackWithResult[] onextracallbackwithresultArr = this.onExtraCallback;
        for (int length = onextracallbackwithresultArr.length - 1; length >= 0; length--) {
            onextracallbackwithresultArr[length] = null;
        }
        this.onTransact = 0;
    }

    protected Object onExtraCallbackWithResult(Object obj) {
        return obj == null ? onExtraCallbackWithResult : obj;
    }

    protected int onWarmupCompleted(Object obj) {
        int iHashCode = obj.hashCode();
        int i = iHashCode + (~(iHashCode << 9));
        int i2 = i ^ (i >>> 14);
        int i3 = i2 + (i2 << 4);
        return i3 ^ (i3 >>> 10);
    }

    protected boolean onWarmupCompleted(Object obj, Object obj2) {
        return obj == obj2 || obj.equals(obj2);
    }

    protected boolean IAuthTabCallback(Object obj, Object obj2) {
        return obj == obj2 || obj.equals(obj2);
    }

    protected onExtraCallbackWithResult IAuthTabCallback(Object obj) {
        Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(obj);
        int iOnWarmupCompleted = onWarmupCompleted(objOnExtraCallbackWithResult);
        onExtraCallbackWithResult[] onextracallbackwithresultArr = this.onExtraCallback;
        for (onExtraCallbackWithResult onextracallbackwithresult = onextracallbackwithresultArr[IAuthTabCallback(iOnWarmupCompleted, onextracallbackwithresultArr.length)]; onextracallbackwithresult != null; onextracallbackwithresult = onextracallbackwithresult.IAuthTabCallback) {
            if (onextracallbackwithresult.onWarmupCompleted == iOnWarmupCompleted && onWarmupCompleted(objOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent)) {
                return onextracallbackwithresult;
            }
        }
        return null;
    }

    protected void IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult, Object obj) {
        onextracallbackwithresult.setValue(obj);
    }

    protected void onExtraCallback(int i, int i2, Object obj, Object obj2) {
        this.IAuthTabCallbackStub++;
        onExtraCallback(IAuthTabCallback(this.onExtraCallback[i], i2, obj, obj2), i);
        this.onTransact++;
        onExtraCallback();
    }

    protected onExtraCallbackWithResult IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult, int i, Object obj, Object obj2) {
        return new onExtraCallbackWithResult(onextracallbackwithresult, i, obj, obj2);
    }

    protected void onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult, int i) {
        this.onExtraCallback[i] = onextracallbackwithresult;
    }

    protected void onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult, int i, onExtraCallbackWithResult onextracallbackwithresult2) {
        this.IAuthTabCallbackStub++;
        IAuthTabCallback(onextracallbackwithresult, i, onextracallbackwithresult2);
        this.onTransact--;
        onExtraCallback(onextracallbackwithresult);
    }

    protected void IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult, int i, onExtraCallbackWithResult onextracallbackwithresult2) {
        if (onextracallbackwithresult2 == null) {
            this.onExtraCallback[i] = onextracallbackwithresult.IAuthTabCallback;
        } else {
            onextracallbackwithresult2.IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback;
        }
    }

    protected void onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult) {
        onextracallbackwithresult.IAuthTabCallback = null;
        onextracallbackwithresult.onNavigationEvent = null;
        onextracallbackwithresult.onExtraCallbackWithResult = null;
    }

    protected void onExtraCallback() {
        int length;
        if (this.onTransact < this.asInterface || (length = this.onExtraCallback.length << 1) > 1073741824) {
            return;
        }
        IAuthTabCallback(length);
    }

    protected void IAuthTabCallback(int i) {
        onExtraCallbackWithResult[] onextracallbackwithresultArr = this.onExtraCallback;
        int length = onextracallbackwithresultArr.length;
        if (i <= length) {
            return;
        }
        if (this.onTransact == 0) {
            this.asInterface = onExtraCallback(i, this.IAuthTabCallback);
            this.onExtraCallback = new onExtraCallbackWithResult[i];
            return;
        }
        onExtraCallbackWithResult[] onextracallbackwithresultArr2 = new onExtraCallbackWithResult[i];
        this.IAuthTabCallbackStub++;
        while (true) {
            length--;
            if (length >= 0) {
                onExtraCallbackWithResult onextracallbackwithresult = onextracallbackwithresultArr[length];
                if (onextracallbackwithresult != null) {
                    onextracallbackwithresultArr[length] = null;
                    while (true) {
                        onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult.IAuthTabCallback;
                        int iIAuthTabCallback = IAuthTabCallback(onextracallbackwithresult.onWarmupCompleted, i);
                        onextracallbackwithresult.IAuthTabCallback = onextracallbackwithresultArr2[iIAuthTabCallback];
                        onextracallbackwithresultArr2[iIAuthTabCallback] = onextracallbackwithresult;
                        if (onextracallbackwithresult2 != null) {
                            onextracallbackwithresult = onextracallbackwithresult2;
                        }
                    }
                }
            } else {
                this.asInterface = onExtraCallback(i, this.IAuthTabCallback);
                this.onExtraCallback = onextracallbackwithresultArr2;
                return;
            }
        }
    }

    public TTLandingPageActivity onTransact() {
        if (this.onTransact == 0) {
            return TTLandingPageActivity13.onExtraCallback;
        }
        return new onExtraCallback(this);
    }

    protected static class onExtraCallback extends IAuthTabCallback implements TTLandingPageActivity {
        protected onExtraCallback(TTLandingPageActivity18 tTLandingPageActivity18) {
            super(tTLandingPageActivity18);
        }

        @Override // java.util.Iterator, o.TTLandingPageActivity
        public Object next() {
            return super.IAuthTabCallback().getKey();
        }

        @Override // o.TTLandingPageActivity
        public Object onExtraCallbackWithResult() {
            onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = onWarmupCompleted();
            if (onextracallbackwithresultOnWarmupCompleted == null) {
                throw new IllegalStateException("getValue() can only be called after next() and before remove()");
            }
            return onextracallbackwithresultOnWarmupCompleted.getValue();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.onWarmupCompleted == null) {
            this.onWarmupCompleted = new onWarmupCompleted(this);
        }
        return this.onWarmupCompleted;
    }

    protected Iterator onWarmupCompleted() {
        if (size() == 0) {
            return TTLandingPageActivity12.onExtraCallback;
        }
        return new onNavigationEvent(this);
    }

    protected static class onWarmupCompleted extends AbstractSet {
        protected final TTLandingPageActivity18 IAuthTabCallback;

        protected onWarmupCompleted(TTLandingPageActivity18 tTLandingPageActivity18) {
            this.IAuthTabCallback = tTLandingPageActivity18;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.IAuthTabCallback.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.IAuthTabCallback.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback = this.IAuthTabCallback.IAuthTabCallback(entry.getKey());
            return onextracallbackwithresultIAuthTabCallback != null && onextracallbackwithresultIAuthTabCallback.equals(entry);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry) || !contains(obj)) {
                return false;
            }
            this.IAuthTabCallback.remove(((Map.Entry) obj).getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return this.IAuthTabCallback.onWarmupCompleted();
        }
    }

    protected static class onNavigationEvent extends IAuthTabCallback {
        protected onNavigationEvent(TTLandingPageActivity18 tTLandingPageActivity18) {
            super(tTLandingPageActivity18);
        }

        @Override // java.util.Iterator
        public Object next() {
            return super.IAuthTabCallback();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        if (this.onNavigationEvent == null) {
            this.onNavigationEvent = new IAuthTabCallbackDefault(this);
        }
        return this.onNavigationEvent;
    }

    protected Iterator onExtraCallbackWithResult() {
        if (size() == 0) {
            return TTLandingPageActivity12.onExtraCallback;
        }
        return new asBinder(this);
    }

    protected static class IAuthTabCallbackDefault extends AbstractSet {
        protected final TTLandingPageActivity18 IAuthTabCallback;

        protected IAuthTabCallbackDefault(TTLandingPageActivity18 tTLandingPageActivity18) {
            this.IAuthTabCallback = tTLandingPageActivity18;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.IAuthTabCallback.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.IAuthTabCallback.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.IAuthTabCallback.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            boolean zContainsKey = this.IAuthTabCallback.containsKey(obj);
            this.IAuthTabCallback.remove(obj);
            return zContainsKey;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return this.IAuthTabCallback.onExtraCallbackWithResult();
        }
    }

    protected static class asBinder extends onNavigationEvent {
        protected asBinder(TTLandingPageActivity18 tTLandingPageActivity18) {
            super(tTLandingPageActivity18);
        }

        @Override // o.TTLandingPageActivity18.onNavigationEvent, java.util.Iterator
        public Object next() {
            return super.IAuthTabCallback().getKey();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        if (this.asBinder == null) {
            this.asBinder = new asInterface(this);
        }
        return this.asBinder;
    }

    protected Iterator IAuthTabCallback() {
        if (size() == 0) {
            return TTLandingPageActivity12.onExtraCallback;
        }
        return new IAuthTabCallbackStub(this);
    }

    protected static class asInterface extends AbstractCollection {
        protected final TTLandingPageActivity18 onWarmupCompleted;

        protected asInterface(TTLandingPageActivity18 tTLandingPageActivity18) {
            this.onWarmupCompleted = tTLandingPageActivity18;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.onWarmupCompleted.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.onWarmupCompleted.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.onWarmupCompleted.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.onWarmupCompleted.IAuthTabCallback();
        }
    }

    protected static class IAuthTabCallbackStub extends IAuthTabCallback {
        protected IAuthTabCallbackStub(TTLandingPageActivity18 tTLandingPageActivity18) {
            super(tTLandingPageActivity18);
        }

        @Override // java.util.Iterator
        public Object next() {
            return super.IAuthTabCallback().getValue();
        }
    }

    protected static class onExtraCallbackWithResult implements Map.Entry {
        protected onExtraCallbackWithResult IAuthTabCallback;
        protected Object onExtraCallbackWithResult;
        protected Object onNavigationEvent;
        protected int onWarmupCompleted;

        protected onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, int i, Object obj, Object obj2) {
            this.IAuthTabCallback = onextracallbackwithresult;
            this.onWarmupCompleted = i;
            this.onNavigationEvent = obj;
            this.onExtraCallbackWithResult = obj2;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            Object obj = this.onNavigationEvent;
            if (obj == TTLandingPageActivity18.onExtraCallbackWithResult) {
                return null;
            }
            return obj;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.onExtraCallbackWithResult;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.onExtraCallbackWithResult;
            this.onExtraCallbackWithResult = obj;
            return obj2;
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
            if (getKey() != null ? getKey().equals(entry.getKey()) : entry.getKey() == null) {
                if (getValue() != null ? getValue().equals(entry.getValue()) : entry.getValue() == null) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() != null ? getValue().hashCode() : 0);
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(getKey());
            stringBuffer.append('=');
            stringBuffer.append(getValue());
            return stringBuffer.toString();
        }
    }

    protected static abstract class IAuthTabCallback implements Iterator {
        protected onExtraCallbackWithResult IAuthTabCallback;
        protected onExtraCallbackWithResult onExtraCallback;
        protected final TTLandingPageActivity18 onExtraCallbackWithResult;
        protected int onNavigationEvent;
        protected int onWarmupCompleted;

        protected IAuthTabCallback(TTLandingPageActivity18 tTLandingPageActivity18) {
            this.onExtraCallbackWithResult = tTLandingPageActivity18;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = tTLandingPageActivity18.onExtraCallback;
            int length = onextracallbackwithresultArr.length;
            onExtraCallbackWithResult onextracallbackwithresult = null;
            while (length > 0 && onextracallbackwithresult == null) {
                length--;
                onextracallbackwithresult = onextracallbackwithresultArr[length];
            }
            this.onExtraCallback = onextracallbackwithresult;
            this.onNavigationEvent = length;
            this.onWarmupCompleted = tTLandingPageActivity18.IAuthTabCallbackStub;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.onExtraCallback != null;
        }

        protected onExtraCallbackWithResult IAuthTabCallback() {
            TTLandingPageActivity18 tTLandingPageActivity18 = this.onExtraCallbackWithResult;
            if (tTLandingPageActivity18.IAuthTabCallbackStub != this.onWarmupCompleted) {
                throw new ConcurrentModificationException();
            }
            onExtraCallbackWithResult onextracallbackwithresult = this.onExtraCallback;
            if (onextracallbackwithresult == null) {
                throw new NoSuchElementException("No next() entry in the iteration");
            }
            onExtraCallbackWithResult[] onextracallbackwithresultArr = tTLandingPageActivity18.onExtraCallback;
            int i = this.onNavigationEvent;
            onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult.IAuthTabCallback;
            while (onextracallbackwithresult2 == null && i > 0) {
                i--;
                onextracallbackwithresult2 = onextracallbackwithresultArr[i];
            }
            this.onExtraCallback = onextracallbackwithresult2;
            this.onNavigationEvent = i;
            this.IAuthTabCallback = onextracallbackwithresult;
            return onextracallbackwithresult;
        }

        protected onExtraCallbackWithResult onWarmupCompleted() {
            return this.IAuthTabCallback;
        }

        @Override // java.util.Iterator
        public void remove() {
            onExtraCallbackWithResult onextracallbackwithresult = this.IAuthTabCallback;
            if (onextracallbackwithresult == null) {
                throw new IllegalStateException("remove() can only be called once after next()");
            }
            TTLandingPageActivity18 tTLandingPageActivity18 = this.onExtraCallbackWithResult;
            if (tTLandingPageActivity18.IAuthTabCallbackStub != this.onWarmupCompleted) {
                throw new ConcurrentModificationException();
            }
            tTLandingPageActivity18.remove(onextracallbackwithresult.getKey());
            this.IAuthTabCallback = null;
            this.onWarmupCompleted = this.onExtraCallbackWithResult.IAuthTabCallbackStub;
        }

        public String toString() {
            if (this.IAuthTabCallback != null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Iterator[");
                stringBuffer.append(this.IAuthTabCallback.getKey());
                stringBuffer.append("=");
                stringBuffer.append(this.IAuthTabCallback.getValue());
                stringBuffer.append("]");
                return stringBuffer.toString();
            }
            return "Iterator[]";
        }
    }

    protected void onExtraCallbackWithResult(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeFloat(this.IAuthTabCallback);
        objectOutputStream.writeInt(this.onExtraCallback.length);
        objectOutputStream.writeInt(this.onTransact);
        TTLandingPageActivity tTLandingPageActivityOnTransact = onTransact();
        while (tTLandingPageActivityOnTransact.hasNext()) {
            objectOutputStream.writeObject(tTLandingPageActivityOnTransact.next());
            objectOutputStream.writeObject(tTLandingPageActivityOnTransact.onExtraCallbackWithResult());
        }
    }

    protected void onExtraCallbackWithResult(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.IAuthTabCallback = objectInputStream.readFloat();
        int i = objectInputStream.readInt();
        int i2 = objectInputStream.readInt();
        onNavigationEvent();
        this.asInterface = onExtraCallback(i, this.IAuthTabCallback);
        this.onExtraCallback = new onExtraCallbackWithResult[i];
        for (int i3 = 0; i3 < i2; i3++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    @Override // java.util.AbstractMap
    protected Object clone() {
        try {
            TTLandingPageActivity18 tTLandingPageActivity18 = (TTLandingPageActivity18) super.clone();
            tTLandingPageActivity18.onExtraCallback = new onExtraCallbackWithResult[this.onExtraCallback.length];
            tTLandingPageActivity18.onWarmupCompleted = null;
            tTLandingPageActivity18.onNavigationEvent = null;
            tTLandingPageActivity18.asBinder = null;
            tTLandingPageActivity18.IAuthTabCallbackStub = 0;
            tTLandingPageActivity18.onTransact = 0;
            tTLandingPageActivity18.onNavigationEvent();
            tTLandingPageActivity18.putAll(this);
            return tTLandingPageActivity18;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (map.size() != size()) {
            return false;
        }
        TTLandingPageActivity tTLandingPageActivityOnTransact = onTransact();
        while (tTLandingPageActivityOnTransact.hasNext()) {
            try {
                Object next = tTLandingPageActivityOnTransact.next();
                Object objOnExtraCallbackWithResult = tTLandingPageActivityOnTransact.onExtraCallbackWithResult();
                if (objOnExtraCallbackWithResult == null) {
                    if (map.get(next) != null || !map.containsKey(next)) {
                        return false;
                    }
                } else if (!objOnExtraCallbackWithResult.equals(map.get(next))) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        Iterator itOnWarmupCompleted = onWarmupCompleted();
        int iHashCode = 0;
        while (itOnWarmupCompleted.hasNext()) {
            iHashCode += itOnWarmupCompleted.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        if (size() == 0) {
            return "{}";
        }
        StringBuffer stringBuffer = new StringBuffer(size() << 5);
        stringBuffer.append('{');
        TTLandingPageActivity tTLandingPageActivityOnTransact = onTransact();
        boolean zHasNext = tTLandingPageActivityOnTransact.hasNext();
        while (zHasNext) {
            Object next = tTLandingPageActivityOnTransact.next();
            Object objOnExtraCallbackWithResult = tTLandingPageActivityOnTransact.onExtraCallbackWithResult();
            if (next == this) {
                next = "(this Map)";
            }
            stringBuffer.append(next);
            stringBuffer.append('=');
            if (objOnExtraCallbackWithResult == this) {
                objOnExtraCallbackWithResult = "(this Map)";
            }
            stringBuffer.append(objOnExtraCallbackWithResult);
            zHasNext = tTLandingPageActivityOnTransact.hasNext();
            if (zHasNext) {
                stringBuffer.append(',');
                stringBuffer.append(' ');
            }
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
