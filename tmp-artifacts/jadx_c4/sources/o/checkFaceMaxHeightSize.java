package o;

import android.app.Application;
import dagger.Lazy;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class checkFaceMaxHeightSize implements getIconPaddingBottom {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private final onViewDraw IAuthTabCallback;
    private final Lazy<showRedownloadDialog> onNavigationEvent;

    @Inject
    public checkFaceMaxHeightSize(@NotNull Lazy<showRedownloadDialog> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "");
        this.onNavigationEvent = lazy;
        this.IAuthTabCallback = onViewDraw.Marketing;
    }

    @Override // o.getIconPaddingBottom
    public onViewDraw onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // o.getIconPaddingBottom
    public void onExtraCallbackWithResult(@NotNull Application application, @NotNull getIconPaddingTop geticonpaddingtop) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(geticonpaddingtop, "");
        int i4 = onWarmupCompleted.onExtraCallbackWithResult[geticonpaddingtop.ordinal()];
        if (i4 == 1) {
            this.onNavigationEvent.get().onNavigationEvent();
            return;
        }
        int i5 = onWarmupCompleted;
        int i6 = i5 + 21;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        if (i4 != 2) {
            int i8 = i5 + 91;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0 ? i4 != 3 : i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        Object[] objArr = {this.onNavigationEvent.get()};
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        showRedownloadDialog.onNavigationEvent(-76768633, objArr, iOnExtraCallbackWithResult, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 76768633);
    }
}
