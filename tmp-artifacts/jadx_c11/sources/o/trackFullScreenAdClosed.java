package o;

import im.toss.state.spec.SessionState;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class trackFullScreenAdClosed implements setAdUnitIds {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final SessionState IAuthTabCallback;
    private final setSegmentCollection onExtraCallbackWithResult;

    @Inject
    public trackFullScreenAdClosed(@NotNull setSegmentCollection setsegmentcollection, @NotNull SessionState sessionState) {
        Intrinsics.checkNotNullParameter(setsegmentcollection, "");
        Intrinsics.checkNotNullParameter(sessionState, "");
        this.onExtraCallbackWithResult = setsegmentcollection;
        this.IAuthTabCallback = sessionState;
    }

    @Override // o.setAdUnitIds
    public boolean IAuthTabCallback() {
        int i = 2 % 2;
        SessionState.State stateAsInterface = this.IAuthTabCallback.asInterface();
        if (!(stateAsInterface instanceof SessionState.State.LoginSession)) {
            if (!(stateAsInterface instanceof SessionState.State.GuestSession)) {
                return this.onExtraCallbackWithResult.onExtraCallbackWithResult();
            }
            int i2 = onExtraCallback + 41;
            onWarmupCompleted = i2 % 128;
            return i2 % 2 != 0;
        }
        int i3 = onExtraCallback + 79;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }
}
