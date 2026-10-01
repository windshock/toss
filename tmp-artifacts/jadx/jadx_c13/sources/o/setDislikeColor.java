package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setDislikeColor extends ycx21 {
    private final String onExtraCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setDislikeColor(@NotNull SerialDescriptor serialDescriptor) {
        super(serialDescriptor, null);
        Intrinsics.checkNotNullParameter(serialDescriptor, "");
        this.onExtraCallback = serialDescriptor.onExtraCallbackWithResult() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public String onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }
}
