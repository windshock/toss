package io.realm;

import io.realm.RealmModel;
import io.realm.internal.OsSet;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import o.access11800;
import o.access20300;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class RealmModelSetOperator<T extends RealmModel> extends access11800<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.access11800
    public boolean onWarmupCompleted(T t) {
        return this.onExtraCallback.onWarmupCompleted(onExtraCallbackWithResult((RealmModelSetOperator<T>) t).cb_().IAuthTabCallback().getObjectKey());
    }

    private T onExtraCallbackWithResult(T t) {
        if (t != null) {
            return access20300.onExtraCallback(this.onNavigationEvent, t, this.IAuthTabCallback.getName(), "set") ? (T) access20300.IAuthTabCallback(this.onNavigationEvent, t) : t;
        }
        throw new NullPointerException("This set does not permit null values.");
    }

    private void onNavigationEvent(RealmModel realmModel) {
        if (realmModel == null) {
            throw new NullPointerException("This set does not permit null values.");
        }
        if (!RealmObject.onTransact(realmModel) || !RealmObject.onWarmupCompleted(realmModel)) {
            throw new IllegalArgumentException("'value' is not a valid managed object.");
        }
        if (((RealmObjectProxy) realmModel).cb_().onExtraCallback() != this.onNavigationEvent) {
            throw new IllegalArgumentException("'value' belongs to a different Realm.");
        }
    }

    @Override // o.access11800
    public boolean IAuthTabCallback(Object obj) {
        onNavigationEvent((RealmModel) obj);
        return this.onExtraCallback.onExtraCallback(((RealmObjectProxy) obj).cb_().IAuthTabCallback().getObjectKey());
    }

    @Override // o.access11800
    public boolean onExtraCallbackWithResult(Object obj) {
        onNavigationEvent((RealmModel) obj);
        return this.onExtraCallback.onTransact(((RealmObjectProxy) obj).cb_().IAuthTabCallback().getObjectKey());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.access11800
    public boolean onWarmupCompleted(Collection<?> collection) {
        asBinder((Collection) collection);
        return this.onExtraCallback.onNavigationEvent(NativeRealmAnyCollection.onNavigationEvent(collection), OsSet.onExtraCallback.CONTAINS_ALL);
    }

    @Override // o.access11800
    public boolean onExtraCallbackWithResult(Collection<? extends T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(onExtraCallbackWithResult((RealmModelSetOperator<T>) it.next()));
        }
        return this.onExtraCallback.onNavigationEvent(NativeRealmAnyCollection.onNavigationEvent(arrayList), OsSet.onExtraCallback.ADD_ALL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.access11800
    public boolean onExtraCallback(Collection<?> collection) {
        asBinder((Collection) collection);
        return this.onExtraCallback.onNavigationEvent(NativeRealmAnyCollection.onNavigationEvent(collection), OsSet.onExtraCallback.REMOVE_ALL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.access11800
    public boolean IAuthTabCallback(Collection<?> collection) {
        asBinder((Collection) collection);
        return this.onExtraCallback.onNavigationEvent(NativeRealmAnyCollection.onNavigationEvent(collection), OsSet.onExtraCallback.RETAIN_ALL);
    }

    private void asBinder(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        while (it.hasNext()) {
            onNavigationEvent((RealmModel) it.next());
        }
    }
}
