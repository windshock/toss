package o;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface BrickModule {
    void onExtraCallback(@NotNull View view, int i, int i2);

    static /* synthetic */ void onExtraCallbackWithResult(BrickModule brickModule, View view, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startHighLight");
        }
        if ((i3 & 2) != 0) {
            i = 1;
        }
        if ((i3 & 4) != 0) {
            i2 = 1500;
        }
        brickModule.onExtraCallback(view, i, i2);
    }
}
