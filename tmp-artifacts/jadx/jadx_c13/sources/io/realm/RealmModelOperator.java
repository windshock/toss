package io.realm;

import io.realm.RealmAny;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.core.NativeRealmAny;
import java.util.Collections;
import o.TombstoneProtosLogMessageOrBuilder;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class RealmModelOperator extends RealmAnyOperator {
    private final RealmModel IAuthTabCallback;
    private final Class<? extends RealmModel> onExtraCallbackWithResult;

    private static <T extends RealmModel> T onNavigationEvent(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, Class<T> cls, NativeRealmAny nativeRealmAny) {
        return (T) tombstoneProtosLogMessageOrBuilder.IAuthTabCallback(cls, nativeRealmAny.getRealmModelRowKey(), false, Collections.EMPTY_LIST);
    }

    public RealmModelOperator(RealmModel realmModel) {
        super(RealmAny.Type.OBJECT);
        this.IAuthTabCallback = realmModel;
        this.onExtraCallbackWithResult = realmModel.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    <T extends RealmModel> RealmModelOperator(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder, NativeRealmAny nativeRealmAny, Class<T> cls) {
        super(RealmAny.Type.OBJECT, nativeRealmAny);
        this.onExtraCallbackWithResult = cls;
        this.IAuthTabCallback = onNavigationEvent(tombstoneProtosLogMessageOrBuilder, cls, nativeRealmAny);
    }

    @Override // io.realm.RealmAnyOperator
    protected NativeRealmAny onExtraCallbackWithResult() {
        if (!(this.IAuthTabCallback instanceof RealmObjectProxy)) {
            throw new IllegalStateException("Native RealmAny instances only allow managed Realm objects or primitives");
        }
        return new NativeRealmAny((RealmObjectProxy) IAuthTabCallback(RealmObjectProxy.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.realm.RealmAnyOperator
    public <T> T IAuthTabCallback(Class<T> cls) {
        return cls.cast(this.IAuthTabCallback);
    }

    @Override // io.realm.RealmAnyOperator
    protected Class<?> IAuthTabCallback() {
        return RealmObjectProxy.class.isAssignableFrom(this.onExtraCallbackWithResult) ? this.onExtraCallbackWithResult.getSuperclass() : this.onExtraCallbackWithResult;
    }

    public int hashCode() {
        return this.IAuthTabCallback.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        RealmModel realmModel = this.IAuthTabCallback;
        RealmModel realmModel2 = ((RealmModelOperator) obj).IAuthTabCallback;
        return realmModel == null ? realmModel2 == null : realmModel.equals(realmModel2);
    }

    public String toString() {
        return this.IAuthTabCallback.toString();
    }

    @Override // io.realm.RealmAnyOperator
    public void IAuthTabCallback(TombstoneProtosLogMessageOrBuilder tombstoneProtosLogMessageOrBuilder) {
        if (!RealmObject.onTransact(this.IAuthTabCallback) || !RealmObject.onWarmupCompleted(this.IAuthTabCallback)) {
            throw new IllegalArgumentException("Realm object is not a valid managed object.");
        }
        if (((RealmObjectProxy) this.IAuthTabCallback).cb_().onExtraCallback() != tombstoneProtosLogMessageOrBuilder) {
            throw new IllegalArgumentException("Realm object belongs to a different Realm.");
        }
    }
}
