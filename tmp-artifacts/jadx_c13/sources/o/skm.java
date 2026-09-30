package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class skm {
    public static final KClass<?> IAuthTabCallback(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        if (serialDescriptor instanceof tpg) {
            return ((tpg) serialDescriptor).onWarmupCompleted;
        }
        if (serialDescriptor instanceof getTopTextView) {
            return IAuthTabCallback(((getTopTextView) serialDescriptor).IAuthTabCallbackDefault());
        }
        return null;
    }

    public static final SerialDescriptor onNavigationEvent(@NotNull hfycx hfycxVar, @NotNull SerialDescriptor serialDescriptor) {
        KSerializer kSerializerOnExtraCallbackWithResult;
        Intrinsics.checkNotNullParameter(hfycxVar, "");
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        KClass<?> kClassIAuthTabCallback = IAuthTabCallback(serialDescriptor);
        if (kClassIAuthTabCallback == null || (kSerializerOnExtraCallbackWithResult = hfycx.onExtraCallbackWithResult(hfycxVar, kClassIAuthTabCallback, null, 2, null)) == null) {
            return null;
        }
        return kSerializerOnExtraCallbackWithResult.getDescriptor();
    }

    public static final SerialDescriptor onExtraCallback(@NotNull SerialDescriptor serialDescriptor, @NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        return new tpg(serialDescriptor, kClass);
    }
}
