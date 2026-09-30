package o;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearTool extends access10900 {
    public clearTool(String str) {
        super(str, RealmAny.Type.STRING);
    }

    public clearTool(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asString(), RealmAny.Type.STRING, nativeRealmAny);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny onExtraCallbackWithResult() {
        return new NativeRealmAny((String) super.IAuthTabCallback(String.class));
    }
}
