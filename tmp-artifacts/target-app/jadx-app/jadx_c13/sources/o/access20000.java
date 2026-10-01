package o;

import io.realm.RealmAny;
import io.realm.RealmAnyOperator;
import io.realm.internal.core.NativeRealmAny;
import java.util.Arrays;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access20000 extends access10900 {
    public access20000(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asBinary(), RealmAny.Type.BINARY, nativeRealmAny);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny onExtraCallbackWithResult() {
        return new NativeRealmAny((byte[]) super.IAuthTabCallback(byte[].class));
    }

    @Override // o.access10900
    public boolean equals(Object obj) {
        if (obj == null || !access20000.class.equals(obj.getClass())) {
            return false;
        }
        return Arrays.equals((byte[]) IAuthTabCallback(byte[].class), (byte[]) ((RealmAnyOperator) obj).IAuthTabCallback(byte[].class));
    }
}
