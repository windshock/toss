package io.realm;

import io.realm.RealmAny;
import io.realm.internal.OsSet;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.core.NativeRealmAnyCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.Nullable;
import o.access11800;
import o.access20300;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class RealmAnySetOperator extends access11800<RealmAny> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.access11800
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public boolean onWarmupCompleted(@Nullable RealmAny realmAny) {
        return this.onExtraCallback.onExtraCallbackWithResult(IAuthTabCallback(realmAny).onExtraCallbackWithResult());
    }

    private RealmAny IAuthTabCallback(@Nullable RealmAny realmAny) {
        if (realmAny == null) {
            return RealmAny.onWarmupCompleted();
        }
        if (realmAny.onNavigationEvent() != RealmAny.Type.OBJECT) {
            return realmAny;
        }
        RealmModel realmModelOnNavigationEvent = realmAny.onNavigationEvent(RealmModel.class);
        if (access20300.onExtraCallback(this.onNavigationEvent, realmModelOnNavigationEvent, this.IAuthTabCallback.getName(), "set")) {
            realmModelOnNavigationEvent = access20300.IAuthTabCallback(this.onNavigationEvent, realmModelOnNavigationEvent);
        }
        return RealmAny.onWarmupCompleted((RealmObjectProxy) realmModelOnNavigationEvent);
    }

    @Override // o.access11800
    public boolean IAuthTabCallback(@Nullable Object obj) {
        RealmAny realmAnyOnWarmupCompleted;
        if (obj == null) {
            realmAnyOnWarmupCompleted = RealmAny.onWarmupCompleted();
        } else {
            realmAnyOnWarmupCompleted = (RealmAny) obj;
        }
        onExtraCallback(realmAnyOnWarmupCompleted);
        return this.onExtraCallback.IAuthTabCallback(realmAnyOnWarmupCompleted.onExtraCallbackWithResult());
    }

    @Override // o.access11800
    public boolean onExtraCallbackWithResult(@Nullable Object obj) {
        RealmAny realmAnyOnWarmupCompleted;
        if (obj == null) {
            realmAnyOnWarmupCompleted = RealmAny.onWarmupCompleted();
        } else {
            realmAnyOnWarmupCompleted = (RealmAny) obj;
        }
        onExtraCallback(realmAnyOnWarmupCompleted);
        return this.onExtraCallback.onNavigationEvent(realmAnyOnWarmupCompleted.onExtraCallbackWithResult());
    }

    private NativeRealmAnyCollection asBinder(Collection<? extends RealmAny> collection) {
        long[] jArr = new long[collection.size()];
        boolean[] zArr = new boolean[collection.size()];
        int i = 0;
        for (RealmAny realmAny : collection) {
            if (realmAny != null) {
                onExtraCallback(realmAny);
                jArr[i] = realmAny.onExtraCallbackWithResult();
                zArr[i] = true;
            }
            i++;
        }
        return NativeRealmAnyCollection.IAuthTabCallback(jArr, zArr);
    }

    @Override // o.access11800
    public boolean onWarmupCompleted(Collection<?> collection) {
        return this.onExtraCallback.onNavigationEvent(asBinder((Collection<? extends RealmAny>) collection), OsSet.onExtraCallback.CONTAINS_ALL);
    }

    @Override // o.access11800
    public boolean onExtraCallbackWithResult(Collection<? extends RealmAny> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<? extends RealmAny> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(IAuthTabCallback(it.next()));
        }
        return this.onExtraCallback.onNavigationEvent(asBinder((Collection<? extends RealmAny>) arrayList), OsSet.onExtraCallback.ADD_ALL);
    }

    @Override // o.access11800
    public boolean onExtraCallback(Collection<?> collection) {
        return this.onExtraCallback.onNavigationEvent(asBinder((Collection<? extends RealmAny>) collection), OsSet.onExtraCallback.REMOVE_ALL);
    }

    @Override // o.access11800
    public boolean IAuthTabCallback(Collection<?> collection) {
        return this.onExtraCallback.onNavigationEvent(asBinder((Collection<? extends RealmAny>) collection), OsSet.onExtraCallback.RETAIN_ALL);
    }

    private void onExtraCallback(RealmAny realmAny) {
        try {
            realmAny.onExtraCallback(this.onNavigationEvent);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("RealmAny collection contains unmanaged objects.", e);
        }
    }
}
