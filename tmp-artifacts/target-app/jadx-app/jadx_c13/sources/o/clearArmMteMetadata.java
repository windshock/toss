package o;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearArmMteMetadata extends access10900 {
    public clearArmMteMetadata(NativeRealmAny nativeRealmAny) {
        super(Double.valueOf(nativeRealmAny.asDouble()), RealmAny.Type.DOUBLE, nativeRealmAny);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny onExtraCallbackWithResult() {
        return new NativeRealmAny((Double) super.IAuthTabCallback(Double.class));
    }
}
