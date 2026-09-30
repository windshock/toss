package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import o.vbt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface SerialDescriptor {
    vbt IAuthTabCallback();

    default boolean asInterface() {
        return false;
    }

    int onExtraCallback();

    boolean onExtraCallback(int i);

    int onExtraCallbackWithResult(@NotNull String str);

    String onExtraCallbackWithResult();

    List<Annotation> onExtraCallbackWithResult(int i);

    SerialDescriptor onNavigationEvent(int i);

    String onWarmupCompleted(int i);

    default boolean onWarmupCompleted() {
        return false;
    }

    default List<Annotation> onNavigationEvent() {
        return CollectionsKt__CollectionsKt.emptyList();
    }
}
