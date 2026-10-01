package o;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class hbExternalSyntheticLambda5 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final Bundle IAuthTabCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;

    public hbExternalSyntheticLambda5(@NotNull String str, @NotNull String str2, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        this.onExtraCallbackWithResult = str;
        this.onNavigationEvent = str2;
        this.IAuthTabCallback = new Bundle(bundle);
    }

    public final String onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Bundle onWarmupCompleted() {
        int i = 2 % 2;
        Bundle bundle = new Bundle(this.IAuthTabCallback);
        int i2 = onWarmupCompleted + 13;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return bundle;
        }
        throw null;
    }
}
