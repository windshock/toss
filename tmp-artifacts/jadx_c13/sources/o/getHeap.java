package o;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
import java.util.UUID;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getHeap extends access10900 {
    public getHeap(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asUUID(), RealmAny.Type.UUID, nativeRealmAny);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny onExtraCallbackWithResult() {
        return new NativeRealmAny((UUID) super.IAuthTabCallback(UUID.class));
    }
}
