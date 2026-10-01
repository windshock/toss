package o;

import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFe1sSDK implements addAnimatorPauseListener {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult;

    @Inject
    public AFe1sSDK(@NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1) {
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        this.onExtraCallbackWithResult = textRoundCornerProgressBarSavedState1;
    }

    public String onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strIAuthTabCallback = this.onExtraCallbackWithResult.IAuthTabCallback(str);
        int i4 = onNavigationEvent + 29;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return strIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onWarmupCompleted(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onExtraCallbackWithResult.onNavigationEvent(str, str2);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onExtraCallbackWithResult.onNavigationEvent(str, str2);
            int i3 = 42 / 0;
        }
    }

    public void IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult.onTransact(str);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult.onTransact(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public boolean onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        boolean zOnNavigationEvent = this.onExtraCallbackWithResult.onNavigationEvent(str);
        int i4 = IAuthTabCallback + 75;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }
}
