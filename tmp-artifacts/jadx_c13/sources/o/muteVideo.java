package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class muteVideo extends JsonPrimitive {
    private final SerialDescriptor IAuthTabCallback;
    private final String onExtraCallback;
    private final boolean onExtraCallbackWithResult;

    public /* synthetic */ muteVideo(Object obj, boolean z, SerialDescriptor serialDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z, (i & 4) != 0 ? null : serialDescriptor);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public boolean onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public final SerialDescriptor onExtraCallback() {
        return this.IAuthTabCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public muteVideo(@NotNull Object obj, boolean z, @Nullable SerialDescriptor serialDescriptor) {
        super(null);
        Intrinsics.checkNotNullParameter(obj, "");
        this.onExtraCallbackWithResult = z;
        this.IAuthTabCallback = serialDescriptor;
        this.onExtraCallback = obj.toString();
        if (serialDescriptor != null && !serialDescriptor.onWarmupCompleted()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String onWarmupCompleted() {
        return this.onExtraCallback;
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String toString() {
        if (!onExtraCallbackWithResult()) {
            return onWarmupCompleted();
        }
        StringBuilder sb = new StringBuilder();
        PglCryptUtils.onNavigationEvent(sb, onWarmupCompleted());
        return sb.toString();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || muteVideo.class != obj.getClass()) {
            return false;
        }
        muteVideo mutevideo = (muteVideo) obj;
        return onExtraCallbackWithResult() == mutevideo.onExtraCallbackWithResult() && Intrinsics.areEqual(onWarmupCompleted(), mutevideo.onWarmupCompleted());
    }

    public int hashCode() {
        return (Boolean.hashCode(onExtraCallbackWithResult()) * 31) + onWarmupCompleted().hashCode();
    }
}
