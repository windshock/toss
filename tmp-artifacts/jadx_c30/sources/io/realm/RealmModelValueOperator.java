package io.realm;

import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import javax.annotation.Nullable;
import o.getRegisterNameBytes;

/* loaded from: /tmp/toss_alldex/classes30.dex */
class RealmModelValueOperator<K, V> extends getRegisterNameBytes<K, V> {
    @Override // o.getRegisterNameBytes
    @Nullable
    public V onNavigationEvent(Object obj) {
        long jOnExtraCallbackWithResult = this.onExtraCallbackWithResult.onExtraCallbackWithResult(obj);
        if (jOnExtraCallbackWithResult == -1) {
            return null;
        }
        return this.IAuthTabCallback.onWarmupCompleted(this.onExtraCallback, jOnExtraCallbackWithResult);
    }

    @Override // o.getRegisterNameBytes
    @Nullable
    public V onExtraCallback(K k, @Nullable V v) {
        return this.IAuthTabCallback.onNavigationEvent(this.onExtraCallback, this.onExtraCallbackWithResult, k, v);
    }

    @Override // o.getRegisterNameBytes
    public boolean IAuthTabCallback(@Nullable Object obj) {
        if (obj == null) {
            return this.onExtraCallbackWithResult.onExtraCallback((Object) null);
        }
        if (obj instanceof RealmObjectProxy) {
            Row rowIAuthTabCallback = ((RealmObjectProxy) obj).cb_().IAuthTabCallback();
            return this.onExtraCallbackWithResult.onExtraCallbackWithResult(rowIAuthTabCallback.getObjectKey(), rowIAuthTabCallback.getTable().getNativePtr());
        }
        throw new IllegalArgumentException("Only managed models can be contained in this dictionary.");
    }

    @Override // o.getRegisterNameBytes
    public boolean onWarmupCompleted(@Nullable Object obj) {
        if (obj != null && !RealmModel.class.isAssignableFrom(obj.getClass())) {
            throw new ClassCastException("Only RealmModel values can be used with 'containsValue'.");
        }
        return IAuthTabCallback(obj);
    }
}
