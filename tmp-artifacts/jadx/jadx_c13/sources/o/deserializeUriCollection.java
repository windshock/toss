package o;

import java.util.ArrayList;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class deserializeUriCollection implements deserializeUriNullableCollection, deserializeLongArray {
    volatile boolean onExtraCallbackWithResult;
    access26700<deserializeUriNullableCollection> onWarmupCompleted;

    public deserializeUriCollection() {
    }

    public deserializeUriCollection(deserializeUriNullableCollection... deserializeurinullablecollectionArr) {
        floatExponent.onExtraCallbackWithResult(deserializeurinullablecollectionArr, "disposables is null");
        this.onWarmupCompleted = new access26700<>(deserializeurinullablecollectionArr.length + 1);
        for (deserializeUriNullableCollection deserializeurinullablecollection : deserializeurinullablecollectionArr) {
            floatExponent.onExtraCallbackWithResult(deserializeurinullablecollection, "A Disposable in the disposables array is null");
            this.onWarmupCompleted.IAuthTabCallback(deserializeurinullablecollection);
        }
    }

    @Override // o.deserializeUriNullableCollection
    public void dispose() {
        if (this.onExtraCallbackWithResult) {
            return;
        }
        synchronized (this) {
            if (this.onExtraCallbackWithResult) {
                return;
            }
            this.onExtraCallbackWithResult = true;
            access26700<deserializeUriNullableCollection> access26700Var = this.onWarmupCompleted;
            this.onWarmupCompleted = null;
            onExtraCallback(access26700Var);
        }
    }

    @Override // o.deserializeUriNullableCollection
    public boolean isDisposed() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.deserializeLongArray
    public boolean onNavigationEvent(deserializeUriNullableCollection deserializeurinullablecollection) {
        floatExponent.onExtraCallbackWithResult(deserializeurinullablecollection, "disposable is null");
        if (!this.onExtraCallbackWithResult) {
            synchronized (this) {
                if (!this.onExtraCallbackWithResult) {
                    access26700<deserializeUriNullableCollection> access26700Var = this.onWarmupCompleted;
                    if (access26700Var == null) {
                        access26700Var = new access26700<>();
                        this.onWarmupCompleted = access26700Var;
                    }
                    access26700Var.IAuthTabCallback(deserializeurinullablecollection);
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
        floatExponent.onExtraCallbackWithResult(deserializeurinullablecollection, "disposables is null");
        if (this.onExtraCallbackWithResult) {
            return false;
        }
        synchronized (this) {
            if (this.onExtraCallbackWithResult) {
                return false;
            }
            access26700<deserializeUriNullableCollection> access26700Var = this.onWarmupCompleted;
            if (access26700Var != null) {
                if (access26700Var.onExtraCallbackWithResult(deserializeurinullablecollection)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void onExtraCallbackWithResult() {
        if (this.onExtraCallbackWithResult) {
            return;
        }
        synchronized (this) {
            if (this.onExtraCallbackWithResult) {
                return;
            }
            access26700<deserializeUriNullableCollection> access26700Var = this.onWarmupCompleted;
            this.onWarmupCompleted = null;
            onExtraCallback(access26700Var);
        }
    }

    public int IAuthTabCallback() {
        if (this.onExtraCallbackWithResult) {
            return 0;
        }
        synchronized (this) {
            if (this.onExtraCallbackWithResult) {
                return 0;
            }
            access26700<deserializeUriNullableCollection> access26700Var = this.onWarmupCompleted;
            return access26700Var != null ? access26700Var.onNavigationEvent() : 0;
        }
    }

    void onExtraCallback(access26700<deserializeUriNullableCollection> access26700Var) {
        if (access26700Var != null) {
            ArrayList arrayList = null;
            for (Object obj : access26700Var.onWarmupCompleted()) {
                if (obj instanceof deserializeUriNullableCollection) {
                    try {
                        ((deserializeUriNullableCollection) obj).dispose();
                    } catch (Throwable th) {
                        NumberConverter.onWarmupCompleted(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
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
