package o;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import o.xkzycx;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface xkzycx {
    /* JADX INFO: Access modifiers changed from: private */
    static KSerializer onNavigationEvent(KSerializer kSerializer, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return kSerializer;
    }

    <T> void onExtraCallbackWithResult(@NotNull KClass<T> kClass, @NotNull Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> function1);

    <Base, Sub extends Base> void onExtraCallbackWithResult(@NotNull KClass<Base> kClass, @NotNull KClass<Sub> kClass2, @NotNull KSerializer<Sub> kSerializer);

    <Base> void onNavigationEvent(@NotNull KClass<Base> kClass, @NotNull Function1<? super Base, ? extends py<? super Base>> function1);

    <Base> void onWarmupCompleted(@NotNull KClass<Base> kClass, @NotNull Function1<? super String, ? extends jp<? extends Base>> function1);

    default <T> void onNavigationEvent(@NotNull KClass<T> kClass, @NotNull final KSerializer<T> kSerializer) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(kSerializer, "");
        onExtraCallbackWithResult(kClass, new Function1() { // from class: kotlinx.serialization.modules.SerializersModuleCollector$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return xkzycx.onNavigationEvent(kSerializer, (List) obj);
            }
        });
    }
}
