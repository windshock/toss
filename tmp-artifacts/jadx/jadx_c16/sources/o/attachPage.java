package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class attachPage {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static final RVViewFactory onWarmupCompleted(@NotNull TitleBarSegCheckPoint titleBarSegCheckPoint) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(titleBarSegCheckPoint, "");
        RVViewFactory rVViewFactory = new RVViewFactory(titleBarSegCheckPoint.onExtraCallback(), titleBarSegCheckPoint.onExtraCallbackWithResult(), titleBarSegCheckPoint.onNavigationEvent(), titleBarSegCheckPoint.asInterface(), titleBarSegCheckPoint.IAuthTabCallback(), titleBarSegCheckPoint.onTransact(), titleBarSegCheckPoint.onWarmupCompleted(), titleBarSegCheckPoint.IAuthTabCallbackStub());
        int i2 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return rVViewFactory;
    }
}
