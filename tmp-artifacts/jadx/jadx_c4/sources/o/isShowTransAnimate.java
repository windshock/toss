package o;

import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import im.toss.uikit.R;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isShowTransAnimate {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static final TdsToastV1.onNavigationEvent onWarmupCompleted(@NotNull TdsToastV1.onWarmupCompleted onwarmupcompleted, @NotNull CharSequence charSequence) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        TdsToastV1.onNavigationEvent onnavigationevent = new TdsToastV1.onNavigationEvent(new FrameLayout(new ContextThemeWrapper(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), R.style.WhiteTheme)), charSequence);
        int i2 = onExtraCallbackWithResult + 101;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return onnavigationevent;
    }
}
