package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class checkSizeValid extends ycx21 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public checkSizeValid(@NotNull SerialDescriptor serialDescriptor) {
        super(serialDescriptor, null);
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String onExtraCallbackWithResult() {
        return "kotlin.collections.ArrayList";
    }
}
