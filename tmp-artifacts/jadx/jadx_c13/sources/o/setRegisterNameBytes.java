package o;

import io.realm.RealmAny;
import io.realm.RealmAnyOperator;
import io.realm.internal.core.NativeRealmAny;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setRegisterNameBytes extends access10900 {
    public setRegisterNameBytes(Integer num) {
        super(num, RealmAny.Type.INTEGER);
    }

    public setRegisterNameBytes(Long l) {
        super(l, RealmAny.Type.INTEGER);
    }

    public setRegisterNameBytes(NativeRealmAny nativeRealmAny) {
        super(Long.valueOf(nativeRealmAny.asLong()), RealmAny.Type.INTEGER, nativeRealmAny);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny onExtraCallbackWithResult() {
        return new NativeRealmAny((Number) super.IAuthTabCallback(Number.class));
    }

    @Override // o.access10900
    public boolean equals(Object obj) {
        return obj != null && setRegisterNameBytes.class.equals(obj.getClass()) && ((Number) IAuthTabCallback(Number.class)).longValue() == ((Number) ((RealmAnyOperator) obj).IAuthTabCallback(Number.class)).longValue();
    }
}
