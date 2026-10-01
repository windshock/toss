package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class requestPauseVideo extends wie2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public requestPauseVideo(@NotNull changeVideoState changevideostate, @NotNull hfycx hfycxVar) {
        super(changevideostate, hfycxVar, null);
        Intrinsics.checkNotNullParameter(changevideostate, "");
        Intrinsics.checkNotNullParameter(hfycxVar, "");
        onWarmupCompleted();
    }

    private final void onWarmupCompleted() {
        if (Intrinsics.areEqual(onExtraCallback(), tnycx.onNavigationEvent())) {
            return;
        }
        onExtraCallback().IAuthTabCallback(new setWriggleValue(IAuthTabCallback()));
    }
}
