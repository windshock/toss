package o;

import android.view.SurfaceView;
import o.BasicTextContextMenuProviderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface BasicTextContextMenuProviderExternalSyntheticLambda1 {
    public static final BasicTextContextMenuProviderExternalSyntheticLambda1 onExtraCallback = new BasicTextContextMenuProviderExternalSyntheticLambda1() { // from class: androidx.media3.common.DebugViewProvider$$ExternalSyntheticLambda0
        public final SurfaceView getDebugPreviewSurfaceView(int i2, int i3) {
            return BasicTextContextMenuProviderExternalSyntheticLambda1.onWarmupCompleted(i2, i3);
        }
    };

    static /* synthetic */ SurfaceView onWarmupCompleted(int i2, int i3) {
        return null;
    }
}
