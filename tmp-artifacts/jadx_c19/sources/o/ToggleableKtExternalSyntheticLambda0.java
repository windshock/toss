package o;

import android.content.Context;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ToggleableKtExternalSyntheticLambda0 {
    public static final BasicTextKtExternalSyntheticLambda11 IAuthTabCallback(long j, long j2) {
        return new SelectableGroupKtExternalSyntheticLambda0(j, j2, null);
    }

    public static final boolean onWarmupCompleted(@NotNull Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
