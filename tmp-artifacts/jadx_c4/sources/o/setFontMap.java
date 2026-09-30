package o;

import androidx.compose.foundation.layout.RowScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setFontMap implements setFailureListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final setFontMap onNavigationEvent = new setFontMap();
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 99;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private setFontMap() {
    }

    @Override // o.setFailureListener
    public /* bridge */ void IAuthTabCallback(@NotNull RowScope rowScope, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 95;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        super.IAuthTabCallback(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 89;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
