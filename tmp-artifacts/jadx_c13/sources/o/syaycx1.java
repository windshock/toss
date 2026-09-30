package o;

import java.util.Set;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class syaycx1 {
    private static final Set<SerialDescriptor> onWarmupCompleted = clearNumber.asBinder(sp.onWarmupCompleted(UInt.Companion).getDescriptor(), sp.onExtraCallback(access13000.Companion).getDescriptor(), sp.onNavigationEvent(UByte.Companion).getDescriptor(), sp.onExtraCallback(getU64.Companion).getDescriptor());

    public static final boolean onExtraCallback(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return serialDescriptor.onWarmupCompleted() && onWarmupCompleted.contains(serialDescriptor);
    }

    public static final boolean onNavigationEvent(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        return serialDescriptor.onWarmupCompleted() && Intrinsics.areEqual(serialDescriptor, initRenderFinish.onExtraCallbackWithResult());
    }
}
