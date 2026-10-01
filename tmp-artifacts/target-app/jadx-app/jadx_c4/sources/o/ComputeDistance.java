package o;

import java.util.Set;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface ComputeDistance {
    boolean onExtraCallbackWithResult(@NotNull checkPosition checkposition);

    Object onWarmupCompleted(@NotNull checkPosition checkposition, boolean z, @NotNull access13800<? super Unit> access13800Var);

    boolean onWarmupCompleted(@NotNull checkPosition checkposition);

    default Set<String> onWarmupCompleted() {
        int i = 2 % 2;
        return clearFaultAdjacentMetadata.onExtraCallback();
    }
}
