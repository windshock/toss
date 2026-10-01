package o;

import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class cancelLoaderTask implements addAnimatorPauseListener {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final TextRoundCornerProgressBarSavedState1 onNavigationEvent;

    @Inject
    public cancelLoaderTask(@NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1) {
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        this.onNavigationEvent = textRoundCornerProgressBarSavedState1;
    }

    @Override // o.addAnimatorPauseListener
    public String onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String strIAuthTabCallback = this.onNavigationEvent.IAuthTabCallback(str);
        int i4 = onWarmupCompleted + 93;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallback;
    }

    @Override // o.addAnimatorPauseListener
    public void onWarmupCompleted(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.onNavigationEvent.onNavigationEvent(str, str2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.onNavigationEvent.onNavigationEvent(str, str2);
        int i3 = onExtraCallback + 121;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // o.addAnimatorPauseListener
    public void IAuthTabCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.onNavigationEvent.onTransact(str);
        int i4 = onExtraCallback + 121;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.addAnimatorPauseListener
    public boolean onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        boolean zOnNavigationEvent = this.onNavigationEvent.onNavigationEvent(str);
        int i4 = onExtraCallback + 67;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }
}
