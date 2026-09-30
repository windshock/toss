package o;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface isApplicationPaused {
    boolean IAuthTabCallback(@NotNull Context context, @Nullable Uri uri, boolean z);

    default boolean onWarmupCompleted(@NotNull Context context, @Nullable Uri uri, boolean z, @Nullable Bundle bundle) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        return IAuthTabCallback(context, uri, z);
    }
}
