package o;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
import org.bson.types.Decimal128;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access21100 extends access10900 {
    public access21100(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asDecimal128(), RealmAny.Type.DECIMAL128, nativeRealmAny);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny onExtraCallbackWithResult() {
        return new NativeRealmAny((Decimal128) super.IAuthTabCallback(Decimal128.class));
    }
}
