package o;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface getCurrentApplicationState {
    boolean onExtraCallbackWithResult(@NotNull Context context, @Nullable Uri uri, boolean z, boolean z2);

    void onWarmupCompleted();

    default boolean onExtraCallback(@NotNull Context context, @Nullable Uri uri, boolean z, boolean z2, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        return onExtraCallbackWithResult(context, uri, z, z2);
    }
}
