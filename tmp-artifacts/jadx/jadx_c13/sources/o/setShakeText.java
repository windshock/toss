package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setShakeText {
    private static final Map<KClass<?>, KSerializer<?>> onWarmupCompleted = htf2.onExtraCallback();

    public static final SerialDescriptor onNavigationEvent(@NotNull String str, @NotNull spv spvVar) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(spvVar, "");
        onExtraCallbackWithResult(str);
        return new setLottieAppNameMaxLength(str, spvVar);
    }

    public static final void onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        for (KSerializer<?> kSerializer : onWarmupCompleted.values()) {
            if (Intrinsics.areEqual(str, kSerializer.getDescriptor().onExtraCallbackWithResult())) {
                throw new IllegalArgumentException(StringsKt__IndentKt.trimIndent("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exists " + Reflection.getOrCreateKotlinClass(kSerializer.getClass()).getSimpleName() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }

    public static final <T> KSerializer<T> onWarmupCompleted(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "");
        return (KSerializer) onWarmupCompleted.get(kClass);
    }
}
