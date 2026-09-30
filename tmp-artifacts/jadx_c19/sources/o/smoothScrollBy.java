package o;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class smoothScrollBy extends shouldDeferAccessibilityEvent {
    private Surface IAuthTabCallback;
    private boolean onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public smoothScrollBy(@NotNull repositionShadowingViews repositionshadowingviews, @NotNull SurfaceTexture surfaceTexture) {
        super(repositionshadowingviews, repositionshadowingviews.onNavigationEvent(surfaceTexture));
        Intrinsics.checkNotNullParameter(repositionshadowingviews, "");
        Intrinsics.checkNotNullParameter(surfaceTexture, "");
    }

    @Override // o.startInterceptRequestLayout
    public void onExtraCallbackWithResult() {
        super.onExtraCallbackWithResult();
        if (this.onWarmupCompleted) {
            Surface surface = this.IAuthTabCallback;
            if (surface != null) {
                surface.release();
            }
            this.IAuthTabCallback = null;
        }
    }
}
