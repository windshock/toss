package io.realm;

import io.realm.internal.core.NativeRealmAny;
import javax.annotation.Nullable;
import o.access20300;
import o.getRegisterNameBytes;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class RealmAnyValueOperator<K> extends getRegisterNameBytes<K, RealmAny> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getRegisterNameBytes
    @Nullable
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public RealmAny onNavigationEvent(Object obj) {
        long jOnWarmupCompleted = this.onExtraCallbackWithResult.onWarmupCompleted(obj);
        if (jOnWarmupCompleted == -1) {
            return null;
        }
        return new RealmAny(RealmAnyOperator.onExtraCallbackWithResult(this.onExtraCallback, new NativeRealmAny(jOnWarmupCompleted)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getRegisterNameBytes
    @Nullable
    public RealmAny onExtraCallback(Object obj, @Nullable RealmAny realmAny) {
        RealmAny realmAnyOnNavigationEvent = onNavigationEvent(obj);
        if (realmAny == null) {
            this.onExtraCallbackWithResult.onNavigationEvent(obj, (Object) null);
            return realmAnyOnNavigationEvent;
        }
        this.onExtraCallbackWithResult.onExtraCallback(obj, access20300.onNavigationEvent(this.onExtraCallback, realmAny).onExtraCallbackWithResult());
        return realmAnyOnNavigationEvent;
    }

    @Override // o.getRegisterNameBytes
    public boolean IAuthTabCallback(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof RealmAny) {
            return this.onExtraCallbackWithResult.IAuthTabCallback(((RealmAny) obj).onExtraCallbackWithResult());
        }
        throw new IllegalArgumentException("This dictionary can only contain 'RealmAny' values.");
    }
}
