package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class deserializeShortNullableCollection implements deserializeUriNullableCollection, deserializeLongArray {
    List<deserializeUriNullableCollection> onExtraCallback;
    volatile boolean onWarmupCompleted;

    @Override // o.deserializeUriNullableCollection
    public void dispose() {
        if (this.onWarmupCompleted) {
            return;
        }
        synchronized (this) {
            if (this.onWarmupCompleted) {
                return;
            }
            this.onWarmupCompleted = true;
            List<deserializeUriNullableCollection> list = this.onExtraCallback;
            this.onExtraCallback = null;
            IAuthTabCallback(list);
        }
    }

    @Override // o.deserializeUriNullableCollection
    public boolean isDisposed() {
        return this.onWarmupCompleted;
    }

    @Override // o.deserializeLongArray
    public boolean onNavigationEvent(deserializeUriNullableCollection deserializeurinullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeurinullablecollection, "d is null");
        if (!this.onWarmupCompleted) {
            synchronized (this) {
                if (!this.onWarmupCompleted) {
                    List linkedList = this.onExtraCallback;
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        this.onExtraCallback = linkedList;
                    }
                    linkedList.add(deserializeurinullablecollection);
                    return true;
                }
            }
        }
        deserializeurinullablecollection.dispose();
        return false;
    }

    @Override // o.deserializeLongArray
    public boolean onExtraCallbackWithResult(deserializeUriNullableCollection deserializeurinullablecollection) {
        if (!IAuthTabCallback(deserializeurinullablecollection)) {
            return false;
        }
        deserializeurinullablecollection.dispose();
        return true;
    }

    @Override // o.deserializeLongArray
    public boolean IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeurinullablecollection, "Disposable item is null");
        if (this.onWarmupCompleted) {
            return false;
        }
        synchronized (this) {
            if (this.onWarmupCompleted) {
                return false;
            }
            List<deserializeUriNullableCollection> list = this.onExtraCallback;
            if (list != null) {
                if (list.remove(deserializeurinullablecollection)) {
                    return true;
                }
            }
            return false;
        }
    }

    void IAuthTabCallback(List<deserializeUriNullableCollection> list) {
        if (list != null) {
            Iterator<deserializeUriNullableCollection> it = list.iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                try {
                    it.next().dispose();
                } catch (Throwable th) {
                    NumberConverter.onWarmupCompleted(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            if (arrayList != null) {
                if (arrayList.size() == 1) {
                    throw access26100.onExtraCallback((Throwable) arrayList.get(0));
                }
                throw new deserializeDecimal(arrayList);
            }
        }
    }
}
