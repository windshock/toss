package o;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class clearReturnedFromScrapFlag {
    public static final clearReturnedFromScrapFlag onExtraCallbackWithResult = new clearReturnedFromScrapFlag();

    private clearReturnedFromScrapFlag() {
    }

    public final float onExtraCallback(@NotNull MotionEvent motionEvent, boolean z) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int actionIndex = motionEvent.getActionMasked() == 6 ? motionEvent.getActionIndex() : -1;
        if (z) {
            int pointerCount = motionEvent.getPointerCount();
            float x = 0.0f;
            int i = 0;
            for (int i2 = 0; i2 < pointerCount; i2++) {
                if (i2 != actionIndex) {
                    x += motionEvent.getX(i2);
                    i++;
                }
            }
            return x / i;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        int i3 = pointerCount2 - 1;
        if (i3 == actionIndex) {
            i3 = pointerCount2 - 2;
        }
        return motionEvent.getX(i3);
    }

    public final float onNavigationEvent(@NotNull MotionEvent motionEvent, boolean z) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int actionIndex = motionEvent.getActionMasked() == 6 ? motionEvent.getActionIndex() : -1;
        if (z) {
            int pointerCount = motionEvent.getPointerCount();
            float y = 0.0f;
            int i = 0;
            for (int i2 = 0; i2 < pointerCount; i2++) {
                if (i2 != actionIndex) {
                    y += motionEvent.getY(i2);
                    i++;
                }
            }
            return y / i;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        int i3 = pointerCount2 - 1;
        if (i3 == actionIndex) {
            i3 = pointerCount2 - 2;
        }
        return motionEvent.getY(i3);
    }

    public final double IAuthTabCallback(double d) {
        return Math.cos(Math.toRadians(d / 2.0d));
    }
}
