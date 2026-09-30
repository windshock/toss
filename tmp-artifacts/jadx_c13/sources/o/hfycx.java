package o;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class hfycx {
    public /* synthetic */ hfycx(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void IAuthTabCallback(@NotNull xkzycx xkzycxVar);

    public abstract <T> KSerializer<T> onExtraCallbackWithResult(@NotNull KClass<T> kClass, @NotNull List<? extends KSerializer<?>> list);

    public abstract <T> jp<T> onExtraCallbackWithResult(@NotNull KClass<? super T> kClass, @Nullable String str);

    public abstract boolean onExtraCallbackWithResult();

    public abstract <T> py<T> onNavigationEvent(@NotNull KClass<? super T> kClass, @NotNull T t);

    private hfycx() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KSerializer onExtraCallbackWithResult(hfycx hfycxVar, KClass kClass, List list, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i & 2) != 0) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        return hfycxVar.onExtraCallbackWithResult(kClass, (List<? extends KSerializer<?>>) list);
    }
}
