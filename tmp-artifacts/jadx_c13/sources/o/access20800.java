package o;

import io.realm.RealmAny;
import io.realm.internal.core.NativeRealmAny;
import java.util.Date;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access20800 extends access10900 {
    public access20800(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asDate(), RealmAny.Type.DATE, nativeRealmAny);
    }

    @Override // io.realm.RealmAnyOperator
    public NativeRealmAny onExtraCallbackWithResult() {
        return new NativeRealmAny((Date) super.IAuthTabCallback(Date.class));
    }
}
