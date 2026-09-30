package o;

import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RealDrawScopeSizeResolversizeinlinedmapNotNull12 implements RealSubcomposeAsyncImageScope {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult;

    @Inject
    public RealDrawScopeSizeResolversizeinlinedmapNotNull12(@NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1) {
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        this.onExtraCallbackWithResult = textRoundCornerProgressBarSavedState1;
    }

    @Override // o.RealSubcomposeAsyncImageScope
    public TextRoundCornerProgressBarSavedState1 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = this.onExtraCallbackWithResult;
        int i5 = i3 + 67;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return textRoundCornerProgressBarSavedState1;
    }
}
