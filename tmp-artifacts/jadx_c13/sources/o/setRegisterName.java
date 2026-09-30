package o;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setRegisterName extends access10900 {
    public setRegisterName(NativeRealmAny nativeRealmAny) {
        super(Float.valueOf(nativeRealmAny.asFloat()), RealmAny.Type.FLOAT, nativeRealmAny);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny onExtraCallbackWithResult() {
        return new NativeRealmAny((Float) super.IAuthTabCallback(Float.class));
    }
}
