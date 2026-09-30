package o;

import io.realm.RealmAny;
import io.realm.RealmAnyOperator;
import io.realm.internal.core.NativeRealmAny;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
abstract class access10900 extends RealmAnyOperator {

    @Nullable
    private final Object IAuthTabCallback;

    access10900(@Nullable Object obj, @Nonnull RealmAny.Type type) {
        super(type);
        this.IAuthTabCallback = obj;
    }

    access10900(@Nullable Object obj, @Nonnull RealmAny.Type type, @Nonnull NativeRealmAny nativeRealmAny) {
        super(type, nativeRealmAny);
        this.IAuthTabCallback = obj;
    }

    @Override // io.realm.RealmAnyOperator
    public <T> T IAuthTabCallback(Class<T> cls) {
        return cls.cast(this.IAuthTabCallback);
    }

    public final int hashCode() {
        Object obj = this.IAuthTabCallback;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        Object obj2 = this.IAuthTabCallback;
        Object obj3 = ((access10900) obj).IAuthTabCallback;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public String toString() {
        return this.IAuthTabCallback.toString();
    }
}
