package o;

import io.realm.Realm;
import io.realm.RealmModel;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import io.realm.internal.Util;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access22800 extends RealmProxyMediator {
    private final RealmProxyMediator onNavigationEvent;
    private final Set<Class<? extends RealmModel>> onWarmupCompleted;

    public access22800(RealmProxyMediator realmProxyMediator, Collection<Class<? extends RealmModel>> collection, boolean z) {
        this.onNavigationEvent = realmProxyMediator;
        HashSet hashSet = new HashSet();
        if (realmProxyMediator != null) {
            Set<Class<? extends RealmModel>> setOnExtraCallback = realmProxyMediator.onExtraCallback();
            if (!z) {
                for (Class<? extends RealmModel> cls : collection) {
                    if (setOnExtraCallback.contains(cls)) {
                        hashSet.add(cls);
                    }
                }
            } else {
                for (Class<? extends RealmModel> cls2 : setOnExtraCallback) {
                    if (!collection.contains(cls2)) {
                        hashSet.add(cls2);
                    }
                }
            }
        }
        this.onWarmupCompleted = Collections.unmodifiableSet(hashSet);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> onNavigationEvent() {
        HashMap map = new HashMap();
        for (Map.Entry<Class<? extends RealmModel>, OsObjectSchemaInfo> entry : this.onNavigationEvent.onNavigationEvent().entrySet()) {
            if (this.onWarmupCompleted.contains(entry.getKey())) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        return map;
    }

    @Override // io.realm.internal.RealmProxyMediator
    public TombstoneProtosMemoryErrorType1 onExtraCallback(Class<? extends RealmModel> cls, OsSchemaInfo osSchemaInfo) {
        asInterface(cls);
        return this.onNavigationEvent.onExtraCallback(cls, osSchemaInfo);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public String onNavigationEvent(Class<? extends RealmModel> cls) {
        asInterface(cls);
        return this.onNavigationEvent.asBinder(cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <T extends RealmModel> Class<T> onExtraCallback(String str) {
        return this.onNavigationEvent.IAuthTabCallback(str);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public boolean onExtraCallback(Class<? extends RealmModel> cls) {
        return this.onNavigationEvent.IAuthTabCallbackDefault(cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E onExtraCallbackWithResult(Class<E> cls, Object obj, Row row, TombstoneProtosMemoryErrorType1 tombstoneProtosMemoryErrorType1, boolean z, List<String> list) {
        asInterface(cls);
        return (E) this.onNavigationEvent.onExtraCallbackWithResult(cls, obj, row, tombstoneProtosMemoryErrorType1, z, list);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public Set<Class<? extends RealmModel>> onExtraCallback() {
        return this.onWarmupCompleted;
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E onExtraCallbackWithResult(Realm realm, E e, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<getBeginAddress> set) {
        asInterface(Util.onExtraCallbackWithResult(e.getClass()));
        return (E) this.onNavigationEvent.onExtraCallbackWithResult(realm, e, z, map, set);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E onExtraCallbackWithResult(E e, int i, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        asInterface(Util.onExtraCallbackWithResult(e.getClass()));
        return (E) this.onNavigationEvent.onExtraCallbackWithResult(e, i, map);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> boolean onExtraCallbackWithResult(Class<E> cls) {
        asInterface(Util.onExtraCallbackWithResult(cls));
        return this.onNavigationEvent.onExtraCallbackWithResult(cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> void IAuthTabCallback(Realm realm, E e, E e2, Map<RealmModel, RealmObjectProxy> map, Set<getBeginAddress> set) {
        asInterface(Util.onExtraCallbackWithResult(e2.getClass()));
        this.onNavigationEvent.IAuthTabCallback(realm, e, e2, map, set);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public boolean onWarmupCompleted() {
        RealmProxyMediator realmProxyMediator = this.onNavigationEvent;
        if (realmProxyMediator == null) {
            return true;
        }
        return realmProxyMediator.onWarmupCompleted();
    }

    private void asInterface(Class<? extends RealmModel> cls) {
        if (this.onWarmupCompleted.contains(cls)) {
            return;
        }
        throw new IllegalArgumentException(cls.getSimpleName() + " is not part of the schema for this Realm");
    }
}
