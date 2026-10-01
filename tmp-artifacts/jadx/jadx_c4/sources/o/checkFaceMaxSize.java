package o;

import android.app.Application;
import com.facebook.react.uimanager.LayoutShadowNode;
import dagger.Lazy;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class checkFaceMaxSize implements getIconPaddingBottom {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    private final onViewDraw onExtraCallback;
    private final Lazy<checkOcclusion> onWarmupCompleted;

    @Inject
    public checkFaceMaxSize(@NotNull Lazy<checkOcclusion> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "");
        this.onWarmupCompleted = lazy;
        this.onExtraCallback = onViewDraw.Marketing;
    }

    @Override // o.getIconPaddingBottom
    public onViewDraw onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        onViewDraw onviewdraw = this.onExtraCallback;
        int i5 = i3 + 85;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
        return onviewdraw;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // o.getIconPaddingBottom
    public void onExtraCallbackWithResult(@NotNull Application application, @NotNull getIconPaddingTop geticonpaddingtop) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(geticonpaddingtop, "");
        int i4 = onNavigationEvent.IAuthTabCallback[geticonpaddingtop.ordinal()];
        if (i4 == 1) {
            this.onWarmupCompleted.get().onExtraCallbackWithResult();
            return;
        }
        if (i4 != 2) {
            int i5 = IAuthTabCallback + 109;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0 ? i4 != 3 : i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        Object[] objArr = {this.onWarmupCompleted.get()};
        checkOcclusion.onWarmupCompleted(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -498720122, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 498720122, objArr);
    }
}
