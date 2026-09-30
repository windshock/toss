package io.realm.internal;

import io.realm.Realm;
import io.realm.RealmModel;
import io.realm.exceptions.RealmException;
import io.realm.internal.RealmObjectProxy;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.TombstoneProtosMemoryErrorType1;
import o.getBeginAddress;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class RealmProxyMediator {
    public abstract <E extends RealmModel> void IAuthTabCallback(Realm realm, E e, E e2, Map<RealmModel, RealmObjectProxy> map, Set<getBeginAddress> set);

    protected abstract <T extends RealmModel> Class<T> onExtraCallback(String str);

    public abstract Set<Class<? extends RealmModel>> onExtraCallback();

    public abstract TombstoneProtosMemoryErrorType1 onExtraCallback(Class<? extends RealmModel> cls, OsSchemaInfo osSchemaInfo);

    protected abstract boolean onExtraCallback(Class<? extends RealmModel> cls);

    public abstract <E extends RealmModel> E onExtraCallbackWithResult(Realm realm, E e, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<getBeginAddress> set);

    public abstract <E extends RealmModel> E onExtraCallbackWithResult(E e, int i, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map);

    public abstract <E extends RealmModel> E onExtraCallbackWithResult(Class<E> cls, Object obj, Row row, TombstoneProtosMemoryErrorType1 tombstoneProtosMemoryErrorType1, boolean z, List<String> list);

    public abstract <E extends RealmModel> boolean onExtraCallbackWithResult(Class<E> cls);

    protected abstract String onNavigationEvent(Class<? extends RealmModel> cls);

    public abstract Map<Class<? extends RealmModel>, OsObjectSchemaInfo> onNavigationEvent();

    public boolean onWarmupCompleted() {
        return false;
    }

    public final String asBinder(Class<? extends RealmModel> cls) {
        return onNavigationEvent(Util.onExtraCallbackWithResult(cls));
    }

    public final <T extends RealmModel> Class<T> IAuthTabCallback(String str) {
        return onExtraCallback(str);
    }

    public boolean IAuthTabCallbackDefault(Class<? extends RealmModel> cls) {
        return onExtraCallback(cls);
    }

    public boolean equals(Object obj) {
        if (obj instanceof RealmProxyMediator) {
            return onExtraCallback().equals(((RealmProxyMediator) obj).onExtraCallback());
        }
        return false;
    }

    public int hashCode() {
        return onExtraCallback().hashCode();
    }

    public static void IAuthTabCallback(Class<? extends RealmModel> cls) {
        if (cls == null) {
            throw new NullPointerException("A class extending RealmObject must be provided");
        }
    }

    public static void onWarmupCompleted(String str) {
        if (str == null || str.isEmpty()) {
            throw new NullPointerException("A class extending RealmObject must be provided");
        }
    }

    public static RealmException onWarmupCompleted(Class<? extends RealmModel> cls) {
        return new RealmException(String.format("'%s' is not part of the schema for this Realm.", cls.toString()));
    }

    public static RealmException onExtraCallbackWithResult(String str) {
        return new RealmException(String.format("'%s' is not part of the schema for this Realm.", str));
    }

    public static IllegalStateException onNavigationEvent(String str) {
        return new IllegalStateException("This class is not marked embedded: " + str);
    }
}
