package o;

import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface getShakeView<T> {
    KSerializer<T> onWarmupCompleted(@NotNull KClass<Object> kClass);
}
