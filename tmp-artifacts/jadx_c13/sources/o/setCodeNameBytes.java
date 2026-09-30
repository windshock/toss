package o;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setCodeNameBytes<K, V> implements Map<K, V>, Serializable, KMutableMap {
    public static final onNavigationEvent Companion = new onNavigationEvent(null);
    private static final setCodeNameBytes onWarmupCompleted;
    private setCodeName<K, V> entriesView;
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    private K[] keysArray;
    private setHasFaultAddress<K> keysView;
    private int length;
    private int maxProbeDistance;
    private int modCount;
    private int[] presenceArray;
    private int size;
    private V[] valuesArray;
    private setFaultAdjacentMetadata<V> valuesView;

    private setCodeNameBytes(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i, int i2) {
        this.keysArray = kArr;
        this.valuesArray = vArr;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i;
        this.length = i2;
        this.hashShift = Companion.onNavigationEvent(access000());
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return onTransact();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return asInterface();
    }

    @Override // java.util.Map
    public final int size() {
        return asBinder();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return IAuthTabCallbackStub();
    }

    public int asBinder() {
        return this.size;
    }

    public final boolean IAuthTabCallbackDefault() {
        return this.isReadOnly;
    }

    public setCodeNameBytes() {
        this(8);
    }

    public setCodeNameBytes(int i) {
        this(setFaultAddress.onExtraCallback(i), null, new int[i], new int[Companion.IAuthTabCallback(i)], 2, 0);
    }

    public final Map<K, V> onExtraCallback() {
        onWarmupCompleted();
        this.isReadOnly = true;
        if (size() > 0) {
            return this;
        }
        setCodeNameBytes setcodenamebytes = onWarmupCompleted;
        Intrinsics.checkNotNull(setcodenamebytes, "");
        return setcodenamebytes;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new setSenderUid(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return onNavigationEvent((setCodeNameBytes<K, V>) obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return onExtraCallbackWithResult((setCodeNameBytes<K, V>) obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        int iOnNavigationEvent = onNavigationEvent((setCodeNameBytes<K, V>) obj);
        if (iOnNavigationEvent < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        return vArr[iOnNavigationEvent];
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        onWarmupCompleted();
        int iOnExtraCallback = onExtraCallback((setCodeNameBytes<K, V>) k);
        V[] vArrIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        if (iOnExtraCallback < 0) {
            int i = (-iOnExtraCallback) - 1;
            V v2 = vArrIAuthTabCallback_Parcel[i];
            vArrIAuthTabCallback_Parcel[i] = v;
            return v2;
        }
        vArrIAuthTabCallback_Parcel[iOnExtraCallback] = v;
        return null;
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        onWarmupCompleted();
        onExtraCallbackWithResult((Collection) map.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object obj) {
        onWarmupCompleted();
        int iOnNavigationEvent = onNavigationEvent((setCodeNameBytes<K, V>) obj);
        if (iOnNavigationEvent < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        V v = vArr[iOnNavigationEvent];
        onExtraCallback(iOnNavigationEvent);
        return v;
    }

    @Override // java.util.Map
    public void clear() {
        onWarmupCompleted();
        int i = this.length - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.hashArray[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        setFaultAddress.onWarmupCompleted(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            setFaultAddress.onWarmupCompleted(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        getInterfaceDescriptor();
    }

    public Set<K> asInterface() {
        setHasFaultAddress<K> sethasfaultaddress = this.keysView;
        if (sethasfaultaddress != null) {
            return sethasfaultaddress;
        }
        setHasFaultAddress<K> sethasfaultaddress2 = new setHasFaultAddress<>(this);
        this.keysView = sethasfaultaddress2;
        return sethasfaultaddress2;
    }

    public Collection<V> IAuthTabCallbackStub() {
        setFaultAdjacentMetadata<V> setfaultadjacentmetadata = this.valuesView;
        if (setfaultadjacentmetadata != null) {
            return setfaultadjacentmetadata;
        }
        setFaultAdjacentMetadata<V> setfaultadjacentmetadata2 = new setFaultAdjacentMetadata<>(this);
        this.valuesView = setfaultadjacentmetadata2;
        return setfaultadjacentmetadata2;
    }

    public Set<Map.Entry<K, V>> onTransact() {
        setCodeName<K, V> setcodename = this.entriesView;
        if (setcodename != null) {
            return setcodename;
        }
        setCodeName<K, V> setcodename2 = new setCodeName<>(this);
        this.entriesView = setcodename2;
        return setcodename2;
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        if (obj != this) {
            return (obj instanceof Map) && IAuthTabCallback((Map<?, ?>) obj);
        }
        return true;
    }

    @Override // java.util.Map
    public int hashCode() {
        IAuthTabCallback<K, V> IAuthTabCallback2 = IAuthTabCallback();
        int iOnNavigationEvent = 0;
        while (IAuthTabCallback2.hasNext()) {
            iOnNavigationEvent += IAuthTabCallback2.onNavigationEvent();
        }
        return iOnNavigationEvent;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        IAuthTabCallback<K, V> IAuthTabCallback2 = IAuthTabCallback();
        int i = 0;
        while (IAuthTabCallback2.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            IAuthTabCallback2.onExtraCallback(sb);
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final int onExtraCallbackWithResult() {
        return this.keysArray.length;
    }

    private final int access000() {
        return this.hashArray.length;
    }

    private final void getInterfaceDescriptor() {
        this.modCount++;
    }

    public final void onWarmupCompleted() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    private final void onNavigationEvent(int i) {
        if (asInterface(i)) {
            IAuthTabCallback(true);
        } else {
            IAuthTabCallback(this.length + i);
        }
    }

    private final boolean asInterface(int i) {
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i2 = this.length;
        int i3 = iOnExtraCallbackWithResult - i2;
        int size = i2 - size();
        return i3 < i && i3 + size >= i && size >= onExtraCallbackWithResult() / 4;
    }

    private final void IAuthTabCallback(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        if (i > onExtraCallbackWithResult()) {
            int iOnWarmupCompleted = AbstractList.Companion.onWarmupCompleted(onExtraCallbackWithResult(), i);
            this.keysArray = (K[]) setFaultAddress.onWarmupCompleted(this.keysArray, iOnWarmupCompleted);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) setFaultAddress.onWarmupCompleted(vArr, iOnWarmupCompleted) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.presenceArray, iOnWarmupCompleted);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
            this.presenceArray = iArrCopyOf;
            int iIAuthTabCallback = Companion.IAuthTabCallback(iOnWarmupCompleted);
            if (iIAuthTabCallback > access000()) {
                onWarmupCompleted(iIAuthTabCallback);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] IAuthTabCallback_Parcel() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) setFaultAddress.onExtraCallback(onExtraCallbackWithResult());
        this.valuesArray = vArr2;
        return vArr2;
    }

    private final int asInterface(K k) {
        return ((k != null ? k.hashCode() : 0) * (-1640531527)) >>> this.hashShift;
    }

    private final void IAuthTabCallback(boolean z) {
        int i;
        V[] vArr = this.valuesArray;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.length;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                K[] kArr = this.keysArray;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.hashArray[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        setFaultAddress.onWarmupCompleted(this.keysArray, i3, i);
        if (vArr != null) {
            setFaultAddress.onWarmupCompleted(vArr, i3, this.length);
        }
        this.length = i3;
    }

    private final void onWarmupCompleted(int i) {
        getInterfaceDescriptor();
        if (this.length > size()) {
            IAuthTabCallback(false);
        }
        this.hashArray = new int[i];
        this.hashShift = Companion.onNavigationEvent(i);
        for (int i2 = 0; i2 < this.length; i2++) {
            if (!onExtraCallbackWithResult(i2)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    private final boolean onExtraCallbackWithResult(int i) {
        int iAsInterface = asInterface((setCodeNameBytes<K, V>) this.keysArray[i]);
        int i2 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[iAsInterface] == 0) {
                iArr[iAsInterface] = i + 1;
                this.presenceArray[i] = iAsInterface;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            iAsInterface = iAsInterface == 0 ? access000() - 1 : iAsInterface - 1;
        }
    }

    private final int onNavigationEvent(K k) {
        int iAsInterface = asInterface((setCodeNameBytes<K, V>) k);
        int i = this.maxProbeDistance;
        while (true) {
            int i2 = this.hashArray[iAsInterface];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (Intrinsics.areEqual(this.keysArray[i3], k)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iAsInterface = iAsInterface == 0 ? access000() - 1 : iAsInterface - 1;
        }
    }

    private final int onExtraCallbackWithResult(V v) {
        int i = this.length;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.presenceArray[i] >= 0) {
                V[] vArr = this.valuesArray;
                Intrinsics.checkNotNull(vArr);
                if (Intrinsics.areEqual(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    public final int onExtraCallback(K k) {
        onWarmupCompleted();
        while (true) {
            int iAsInterface = asInterface((setCodeNameBytes<K, V>) k);
            int iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(this.maxProbeDistance << 1, access000() / 2);
            int i = 0;
            while (true) {
                int i2 = this.hashArray[iAsInterface];
                if (i2 == 0) {
                    if (this.length >= onExtraCallbackWithResult()) {
                        onNavigationEvent(1);
                    } else {
                        int i3 = this.length;
                        int i4 = i3 + 1;
                        this.length = i4;
                        this.keysArray[i3] = k;
                        this.presenceArray[i3] = iAsInterface;
                        this.hashArray[iAsInterface] = i4;
                        this.size = size() + 1;
                        getInterfaceDescriptor();
                        if (i > this.maxProbeDistance) {
                            this.maxProbeDistance = i;
                        }
                        return i3;
                    }
                } else {
                    if (Intrinsics.areEqual(this.keysArray[i2 - 1], k)) {
                        return -i2;
                    }
                    i++;
                    if (i > iCoerceAtMost) {
                        onWarmupCompleted(access000() << 1);
                        break;
                    }
                    iAsInterface = iAsInterface == 0 ? access000() - 1 : iAsInterface - 1;
                }
            }
        }
    }

    public final boolean IAuthTabCallback(K k) {
        onWarmupCompleted();
        int iOnNavigationEvent = onNavigationEvent((setCodeNameBytes<K, V>) k);
        if (iOnNavigationEvent < 0) {
            return false;
        }
        onExtraCallback(iOnNavigationEvent);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExtraCallback(int i) {
        setFaultAddress.onExtraCallbackWithResult(this.keysArray, i);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            setFaultAddress.onExtraCallbackWithResult(vArr, i);
        }
        IAuthTabCallbackStub(this.presenceArray[i]);
        this.presenceArray[i] = -1;
        this.size = size() - 1;
        getInterfaceDescriptor();
    }

    private final void IAuthTabCallbackStub(int i) {
        int i2;
        int i3;
        while (true) {
            int iAccess000 = i;
            int i4 = 0;
            do {
                if (iAccess000 == 0) {
                    iAccess000 = access000();
                }
                iAccess000--;
                int[] iArr = this.hashArray;
                i2 = iArr[iAccess000];
                i4++;
                if (i4 > this.maxProbeDistance) {
                    iArr[i] = 0;
                    return;
                } else {
                    if (i2 == 0) {
                        iArr[i] = 0;
                        return;
                    }
                    i3 = i2 - 1;
                }
            } while (((asInterface((setCodeNameBytes<K, V>) this.keysArray[i3]) - iAccess000) & (access000() - 1)) < i4);
            this.hashArray[i] = i2;
            this.presenceArray[i3] = i;
            i = iAccess000;
        }
    }

    public final boolean IAuthTabCallback(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        int iOnNavigationEvent = onNavigationEvent((setCodeNameBytes<K, V>) entry.getKey());
        if (iOnNavigationEvent < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        return Intrinsics.areEqual(vArr[iOnNavigationEvent], entry.getValue());
    }

    private final boolean IAuthTabCallback(Map<?, ?> map) {
        return size() == map.size() && onExtraCallback((Collection<?>) map.entrySet());
    }

    public final boolean onExtraCallback(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        for (Object obj : collection) {
            if (obj == null) {
                return false;
            }
            try {
                if (!IAuthTabCallback((Map.Entry) obj)) {
                    return false;
                }
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return true;
    }

    private final boolean onNavigationEvent(Map.Entry<? extends K, ? extends V> entry) {
        int iOnExtraCallback = onExtraCallback((setCodeNameBytes<K, V>) entry.getKey());
        V[] vArrIAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
        if (iOnExtraCallback >= 0) {
            vArrIAuthTabCallback_Parcel[iOnExtraCallback] = entry.getValue();
            return true;
        }
        int i = (-iOnExtraCallback) - 1;
        if (Intrinsics.areEqual(entry.getValue(), vArrIAuthTabCallback_Parcel[i])) {
            return false;
        }
        vArrIAuthTabCallback_Parcel[i] = entry.getValue();
        return true;
    }

    private final boolean onExtraCallbackWithResult(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        onNavigationEvent(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (onNavigationEvent((Map.Entry) it.next())) {
                z = true;
            }
        }
        return z;
    }

    public final boolean onWarmupCompleted(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        onWarmupCompleted();
        int iOnNavigationEvent = onNavigationEvent((setCodeNameBytes<K, V>) entry.getKey());
        if (iOnNavigationEvent < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        Intrinsics.checkNotNull(vArr);
        if (!Intrinsics.areEqual(vArr[iOnNavigationEvent], entry.getValue())) {
            return false;
        }
        onExtraCallback(iOnNavigationEvent);
        return true;
    }

    public final boolean onWarmupCompleted(V v) {
        onWarmupCompleted();
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult((setCodeNameBytes<K, V>) v);
        if (iOnExtraCallbackWithResult < 0) {
            return false;
        }
        onExtraCallback(iOnExtraCallbackWithResult);
        return true;
    }

    public final onExtraCallback<K, V> access100() {
        return new onExtraCallback<>(this);
    }

    public final onTransact<K, V> IAuthTabCallbackStubProxy() {
        return new onTransact<>(this);
    }

    public final IAuthTabCallback<K, V> IAuthTabCallback() {
        return new IAuthTabCallback<>(this);
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final setCodeNameBytes onNavigationEvent() {
            return setCodeNameBytes.onWarmupCompleted;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int IAuthTabCallback(int i) {
            return Integer.highestOneBit(RangesKt___RangesKt.coerceAtLeast(i, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int onNavigationEvent(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }
    }

    static {
        setCodeNameBytes setcodenamebytes = new setCodeNameBytes(0);
        setcodenamebytes.isReadOnly = true;
        onWarmupCompleted = setcodenamebytes;
    }

    public static class onWarmupCompleted<K, V> {
        private int IAuthTabCallback;
        private int onExtraCallback;
        private int onNavigationEvent;
        private final setCodeNameBytes<K, V> onWarmupCompleted;

        public onWarmupCompleted(@NotNull setCodeNameBytes<K, V> setcodenamebytes) {
            Intrinsics.checkNotNullParameter(setcodenamebytes, "");
            this.onWarmupCompleted = setcodenamebytes;
            this.onExtraCallback = -1;
            this.IAuthTabCallback = ((setCodeNameBytes) setcodenamebytes).modCount;
            IAuthTabCallbackStub();
        }

        public final setCodeNameBytes<K, V> IAuthTabCallbackDefault() {
            return this.onWarmupCompleted;
        }

        public final int IAuthTabCallback() {
            return this.onNavigationEvent;
        }

        public final void IAuthTabCallback(int i) {
            this.onNavigationEvent = i;
        }

        public final int onExtraCallback() {
            return this.onExtraCallback;
        }

        public final void onExtraCallbackWithResult(int i) {
            this.onExtraCallback = i;
        }

        public final void IAuthTabCallbackStub() {
            while (this.onNavigationEvent < ((setCodeNameBytes) this.onWarmupCompleted).length) {
                int[] iArr = ((setCodeNameBytes) this.onWarmupCompleted).presenceArray;
                int i = this.onNavigationEvent;
                if (iArr[i] >= 0) {
                    return;
                } else {
                    this.onNavigationEvent = i + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.onNavigationEvent < ((setCodeNameBytes) this.onWarmupCompleted).length;
        }

        public final void remove() {
            onWarmupCompleted();
            if (this.onExtraCallback == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.onWarmupCompleted.onWarmupCompleted();
            this.onWarmupCompleted.onExtraCallback(this.onExtraCallback);
            this.onExtraCallback = -1;
            this.IAuthTabCallback = ((setCodeNameBytes) this.onWarmupCompleted).modCount;
        }

        public final void onWarmupCompleted() {
            if (((setCodeNameBytes) this.onWarmupCompleted).modCount != this.IAuthTabCallback) {
                throw new ConcurrentModificationException();
            }
        }
    }

    public static final class onExtraCallback<K, V> extends onWarmupCompleted<K, V> implements Iterator<K>, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallback(@NotNull setCodeNameBytes<K, V> setcodenamebytes) {
            super(setcodenamebytes);
            Intrinsics.checkNotNullParameter(setcodenamebytes, "");
        }

        @Override // java.util.Iterator
        public K next() {
            onWarmupCompleted();
            if (IAuthTabCallback() >= ((setCodeNameBytes) IAuthTabCallbackDefault()).length) {
                throw new NoSuchElementException();
            }
            int iIAuthTabCallback = IAuthTabCallback();
            IAuthTabCallback(iIAuthTabCallback + 1);
            onExtraCallbackWithResult(iIAuthTabCallback);
            K k = (K) ((setCodeNameBytes) IAuthTabCallbackDefault()).keysArray[onExtraCallback()];
            IAuthTabCallbackStub();
            return k;
        }
    }

    public static final class onTransact<K, V> extends onWarmupCompleted<K, V> implements Iterator<V>, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(@NotNull setCodeNameBytes<K, V> setcodenamebytes) {
            super(setcodenamebytes);
            Intrinsics.checkNotNullParameter(setcodenamebytes, "");
        }

        @Override // java.util.Iterator
        public V next() {
            onWarmupCompleted();
            if (IAuthTabCallback() >= ((setCodeNameBytes) IAuthTabCallbackDefault()).length) {
                throw new NoSuchElementException();
            }
            int iIAuthTabCallback = IAuthTabCallback();
            IAuthTabCallback(iIAuthTabCallback + 1);
            onExtraCallbackWithResult(iIAuthTabCallback);
            Object[] objArr = ((setCodeNameBytes) IAuthTabCallbackDefault()).valuesArray;
            Intrinsics.checkNotNull(objArr);
            V v = (V) objArr[onExtraCallback()];
            IAuthTabCallbackStub();
            return v;
        }
    }

    public static final class IAuthTabCallback<K, V> extends onWarmupCompleted<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(@NotNull setCodeNameBytes<K, V> setcodenamebytes) {
            super(setcodenamebytes);
            Intrinsics.checkNotNullParameter(setcodenamebytes, "");
        }

        @Override // java.util.Iterator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public onExtraCallbackWithResult<K, V> next() {
            onWarmupCompleted();
            if (IAuthTabCallback() >= ((setCodeNameBytes) IAuthTabCallbackDefault()).length) {
                throw new NoSuchElementException();
            }
            int iIAuthTabCallback = IAuthTabCallback();
            IAuthTabCallback(iIAuthTabCallback + 1);
            onExtraCallbackWithResult(iIAuthTabCallback);
            onExtraCallbackWithResult<K, V> onextracallbackwithresult = new onExtraCallbackWithResult<>(IAuthTabCallbackDefault(), onExtraCallback());
            IAuthTabCallbackStub();
            return onextracallbackwithresult;
        }

        public final int onNavigationEvent() {
            if (IAuthTabCallback() >= ((setCodeNameBytes) IAuthTabCallbackDefault()).length) {
                throw new NoSuchElementException();
            }
            int iIAuthTabCallback = IAuthTabCallback();
            IAuthTabCallback(iIAuthTabCallback + 1);
            onExtraCallbackWithResult(iIAuthTabCallback);
            Object obj = ((setCodeNameBytes) IAuthTabCallbackDefault()).keysArray[onExtraCallback()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ((setCodeNameBytes) IAuthTabCallbackDefault()).valuesArray;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[onExtraCallback()];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            IAuthTabCallbackStub();
            return iHashCode ^ iHashCode2;
        }

        public final void onExtraCallback(@NotNull StringBuilder sb) {
            Intrinsics.checkNotNullParameter(sb, "");
            if (IAuthTabCallback() >= ((setCodeNameBytes) IAuthTabCallbackDefault()).length) {
                throw new NoSuchElementException();
            }
            int iIAuthTabCallback = IAuthTabCallback();
            IAuthTabCallback(iIAuthTabCallback + 1);
            onExtraCallbackWithResult(iIAuthTabCallback);
            Object obj = ((setCodeNameBytes) IAuthTabCallbackDefault()).keysArray[onExtraCallback()];
            if (obj == IAuthTabCallbackDefault()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = ((setCodeNameBytes) IAuthTabCallbackDefault()).valuesArray;
            Intrinsics.checkNotNull(objArr);
            Object obj2 = objArr[onExtraCallback()];
            if (obj2 == IAuthTabCallbackDefault()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            IAuthTabCallbackStub();
        }
    }

    public static final class onExtraCallbackWithResult<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {
        private final setCodeNameBytes<K, V> IAuthTabCallback;
        private final int onExtraCallbackWithResult;
        private final int onWarmupCompleted;

        public onExtraCallbackWithResult(@NotNull setCodeNameBytes<K, V> setcodenamebytes, int i) {
            Intrinsics.checkNotNullParameter(setcodenamebytes, "");
            this.IAuthTabCallback = setcodenamebytes;
            this.onExtraCallbackWithResult = i;
            this.onWarmupCompleted = ((setCodeNameBytes) setcodenamebytes).modCount;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            onExtraCallback();
            return (K) ((setCodeNameBytes) this.IAuthTabCallback).keysArray[this.onExtraCallbackWithResult];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            onExtraCallback();
            Object[] objArr = ((setCodeNameBytes) this.IAuthTabCallback).valuesArray;
            Intrinsics.checkNotNull(objArr);
            return (V) objArr[this.onExtraCallbackWithResult];
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            onExtraCallback();
            this.IAuthTabCallback.onWarmupCompleted();
            Object[] objArrIAuthTabCallback_Parcel = this.IAuthTabCallback.IAuthTabCallback_Parcel();
            int i = this.onExtraCallbackWithResult;
            V v2 = (V) objArrIAuthTabCallback_Parcel[i];
            objArrIAuthTabCallback_Parcel[i] = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return Intrinsics.areEqual(entry.getKey(), getKey()) && Intrinsics.areEqual(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }

        private final void onExtraCallback() {
            if (((setCodeNameBytes) this.IAuthTabCallback).modCount != this.onWarmupCompleted) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }
    }
}
