package o;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class eaycx extends setAnimationsLoop {
    private final boolean onNavigationEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eaycx(@NotNull String str, @NotNull aeu2<?> aeu2Var) {
        super(str, aeu2Var, 1);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aeu2Var, "");
        this.onNavigationEvent = true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    @Override // o.setAnimationsLoop
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // o.setAnimationsLoop
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eaycx)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        if (!Intrinsics.areEqual(onExtraCallbackWithResult(), serialDescriptor.onExtraCallbackWithResult())) {
            return false;
        }
        eaycx eaycxVar = (eaycx) obj;
        if (!eaycxVar.onWarmupCompleted() || !Arrays.equals(IAuthTabCallbackDefault(), eaycxVar.IAuthTabCallbackDefault()) || onExtraCallback() != serialDescriptor.onExtraCallback()) {
            return false;
        }
        int iOnExtraCallback = onExtraCallback();
        for (int i = 0; i < iOnExtraCallback; i++) {
            if (!Intrinsics.areEqual(onNavigationEvent(i).onExtraCallbackWithResult(), serialDescriptor.onNavigationEvent(i).onExtraCallbackWithResult()) || !Intrinsics.areEqual(onNavigationEvent(i).IAuthTabCallback(), serialDescriptor.onNavigationEvent(i).IAuthTabCallback())) {
                return false;
            }
        }
        return true;
    }
}
