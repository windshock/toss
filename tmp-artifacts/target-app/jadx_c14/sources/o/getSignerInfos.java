package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getSignerInfos {
    private final String IAuthTabCallback;
    private final int onExtraCallback;
    private final Integer onNavigationEvent;
    private final long onWarmupCompleted;

    public getSignerInfos(@Nullable Integer num, int i, long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.onNavigationEvent = num;
        this.onExtraCallback = i;
        this.onWarmupCompleted = j;
        this.IAuthTabCallback = str;
    }

    public final wasLastName onNavigationEvent() {
        wasLastName waslastnameIAuthTabCallback = wasLastName.IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(waslastnameIAuthTabCallback, "");
        return waslastnameIAuthTabCallback;
    }
}
