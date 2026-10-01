package o;

import io.realm.Realm;
import io.realm.RealmModel;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import io.realm.internal.Util;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access23000 extends RealmProxyMediator {
    private final Map<Class<? extends RealmModel>, RealmProxyMediator> IAuthTabCallback;
    private final Map<String, Class<? extends RealmModel>> onExtraCallbackWithResult = new HashMap();

    public access23000(RealmProxyMediator... realmProxyMediatorArr) {
        HashMap map = new HashMap();
        if (realmProxyMediatorArr != null) {
            for (RealmProxyMediator realmProxyMediator : realmProxyMediatorArr) {
                for (Class<? extends RealmModel> cls : realmProxyMediator.onExtraCallback()) {
                    String strAsBinder = realmProxyMediator.asBinder(cls);
                    Class<? extends RealmModel> cls2 = this.onExtraCallbackWithResult.get(strAsBinder);
                    if (cls2 != null && !cls2.equals(cls)) {
                        throw new IllegalStateException(String.format("It is not allowed for two different model classes to share the same internal name in Realm. The classes %s and %s are being included from the modules '%s' and '%s' and they share the same internal name '%s'.", cls2, cls, map.get(cls2), realmProxyMediator, strAsBinder));
                    }
                    map.put(cls, realmProxyMediator);
                    this.onExtraCallbackWithResult.put(strAsBinder, cls);
                }
            }
        }
        this.IAuthTabCallback = Collections.unmodifiableMap(map);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> onNavigationEvent() {
        HashMap map = new HashMap();
        Iterator<RealmProxyMediator> it = this.IAuthTabCallback.values().iterator();
        while (it.hasNext()) {
            map.putAll(it.next().onNavigationEvent());
        }
        return map;
    }

    @Override // io.realm.internal.RealmProxyMediator
    public TombstoneProtosMemoryErrorType1 onExtraCallback(Class<? extends RealmModel> cls, OsSchemaInfo osSchemaInfo) {
        return IAuthTabCallbackStub(cls).onExtraCallback(cls, osSchemaInfo);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public String onNavigationEvent(Class<? extends RealmModel> cls) {
        return IAuthTabCallbackStub(cls).asBinder(cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <T extends RealmModel> Class<T> onExtraCallback(String str) {
        return asInterface(str).IAuthTabCallback(str);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public boolean onExtraCallback(Class<? extends RealmModel> cls) {
        return IAuthTabCallbackStub(cls).IAuthTabCallbackDefault(cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E onExtraCallbackWithResult(Class<E> cls, Object obj, Row row, TombstoneProtosMemoryErrorType1 tombstoneProtosMemoryErrorType1, boolean z, List<String> list) {
        return (E) IAuthTabCallbackStub(cls).onExtraCallbackWithResult(cls, obj, row, tombstoneProtosMemoryErrorType1, z, list);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public Set<Class<? extends RealmModel>> onExtraCallback() {
        return this.IAuthTabCallback.keySet();
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E onExtraCallbackWithResult(Realm realm, E e, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<getBeginAddress> set) {
        return (E) IAuthTabCallbackStub(Util.onExtraCallbackWithResult(e.getClass())).onExtraCallbackWithResult(realm, e, z, map, set);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E onExtraCallbackWithResult(E e, int i, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        return (E) IAuthTabCallbackStub(Util.onExtraCallbackWithResult(e.getClass())).onExtraCallbackWithResult(e, i, map);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> boolean onExtraCallbackWithResult(Class<E> cls) {
        return IAuthTabCallbackStub(Util.onExtraCallbackWithResult(cls)).onExtraCallbackWithResult(cls);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> void IAuthTabCallback(Realm realm, E e, E e2, Map<RealmModel, RealmObjectProxy> map, Set<getBeginAddress> set) {
        IAuthTabCallbackStub(Util.onExtraCallbackWithResult(e2.getClass())).IAuthTabCallback(realm, e, e2, map, set);
    }

    @Override // io.realm.internal.RealmProxyMediator
    public boolean onWarmupCompleted() {
        Iterator<Map.Entry<Class<? extends RealmModel>, RealmProxyMediator>> it = this.IAuthTabCallback.entrySet().iterator();
        while (it.hasNext()) {
            if (!it.next().getValue().onWarmupCompleted()) {
                return false;
            }
        }
        return true;
    }

    private RealmProxyMediator IAuthTabCallbackStub(Class<? extends RealmModel> cls) {
        RealmProxyMediator realmProxyMediator = this.IAuthTabCallback.get(Util.onExtraCallbackWithResult(cls));
        if (realmProxyMediator != null) {
            return realmProxyMediator;
        }
        throw new RealmException(cls.getSimpleName() + " is not part of the schema for this Realm");
    }

    private RealmProxyMediator asInterface(String str) {
        return IAuthTabCallbackStub(this.onExtraCallbackWithResult.get(str));
    }
}
