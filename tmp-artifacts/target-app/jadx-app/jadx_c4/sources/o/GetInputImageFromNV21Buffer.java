package o;

import java.util.Map;
import o.DetectFaceInSingleImage;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class GetInputImageFromNV21Buffer implements DetectFaceInSingleImage {
    private static int IAuthTabCallback = 1;
    public static final GetInputImageFromNV21Buffer onExtraCallback = new GetInputImageFromNV21Buffer();
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        int i = onNavigationEvent + 61;
        IAuthTabCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.DetectFaceInSingleImage
    public Object onExtraCallbackWithResult(@NotNull Map<String, ? extends Object> map, @NotNull DetectFaceInSingleImage.onNavigationEvent onnavigationevent, @NotNull access13800<? super Map<String, ? extends Object>> access13800Var) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 125;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        throw null;
    }

    private GetInputImageFromNV21Buffer() {
    }
}
