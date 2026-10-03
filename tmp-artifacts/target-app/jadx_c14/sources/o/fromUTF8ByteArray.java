package o;

import java.util.List;
import o.CollectionStore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public interface fromUTF8ByteArray<T extends CollectionStore> {
    void IAuthTabCallback(@Nullable List<? extends T> list);

    List<T> onExtraCallbackWithResult();

    T onNavigationEvent();

    void onNavigationEvent(@NotNull T t);

    default boolean IAuthTabCallback() {
        return onNavigationEvent().onNavigationEvent();
    }
}
