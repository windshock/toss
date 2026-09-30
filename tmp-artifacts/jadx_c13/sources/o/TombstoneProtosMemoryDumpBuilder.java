package o;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
import org.bson.types.ObjectId;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosMemoryDumpBuilder extends access10900 {
    public TombstoneProtosMemoryDumpBuilder(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asObjectId(), RealmAny.Type.OBJECT_ID, nativeRealmAny);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny onExtraCallbackWithResult() {
        return new NativeRealmAny((ObjectId) super.IAuthTabCallback(ObjectId.class));
    }
}
