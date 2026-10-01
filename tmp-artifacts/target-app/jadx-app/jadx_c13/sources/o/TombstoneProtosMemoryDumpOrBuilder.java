package o;

import io.realm.RealmAny;
import io.realm.RealmAnyOperator;
import io.realm.internal.core.NativeRealmAny;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosMemoryDumpOrBuilder extends RealmAnyOperator {
    @Override // io.realm.RealmAnyOperator
    public <T> T IAuthTabCallback(Class<T> cls) {
        return null;
    }

    public TombstoneProtosMemoryDumpOrBuilder() {
        super(RealmAny.Type.NULL);
    }

    public TombstoneProtosMemoryDumpOrBuilder(NativeRealmAny nativeRealmAny) {
        super(RealmAny.Type.NULL, nativeRealmAny);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny onExtraCallbackWithResult() {
        return new NativeRealmAny();
    }

    public String toString() {
        return "null";
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object obj) {
        return obj != null && TombstoneProtosMemoryDumpOrBuilder.class.equals(obj.getClass());
    }
}
