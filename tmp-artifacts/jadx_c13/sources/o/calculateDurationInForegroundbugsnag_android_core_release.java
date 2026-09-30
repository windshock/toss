package o;

import android.graphics.Paint;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class calculateDurationInForegroundbugsnag_android_core_release {
    private static int asInterface = 1;
    private static int onTransact;
    private final HashMap<Character, Float> IAuthTabCallback;
    private float onExtraCallback;
    private final Paint onExtraCallbackWithResult;
    private final HashMap<CharSequence, Float> onNavigationEvent;
    private float onWarmupCompleted;

    public calculateDurationInForegroundbugsnag_android_core_release(@NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "");
        this.onExtraCallbackWithResult = paint;
        this.IAuthTabCallback = new HashMap<>(256);
        this.onNavigationEvent = new HashMap<>(256);
        onExtraCallback();
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        float f = this.onWarmupCompleted;
        int i5 = i3 + 91;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 101;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        float f = this.onExtraCallback;
        int i5 = i2 + Imgproc.COLOR_YUV2RGB_YVYU;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallback() {
        float f;
        float f2;
        int i = 2 % 2;
        int i2 = onTransact + 77;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            this.IAuthTabCallback.clear();
            this.onNavigationEvent.clear();
            Paint.FontMetrics fontMetrics = this.onExtraCallbackWithResult.getFontMetrics();
            float f3 = fontMetrics.bottom;
            f = fontMetrics.top;
            f2 = f3 / f;
        } else {
            this.IAuthTabCallback.clear();
            this.onNavigationEvent.clear();
            Paint.FontMetrics fontMetrics2 = this.onExtraCallbackWithResult.getFontMetrics();
            float f4 = fontMetrics2.bottom;
            f = fontMetrics2.top;
            f2 = f4 - f;
        }
        this.onWarmupCompleted = f2;
        this.onExtraCallback = -f;
        int i3 = onTransact + 3;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }

    public final float onExtraCallbackWithResult(char c) {
        int i = 2 % 2;
        int i2 = onTransact + Imgproc.COLOR_YUV2RGB_YVYU;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (c == 0) {
            return 0.0f;
        }
        Float f = this.IAuthTabCallback.get(Character.valueOf(c));
        if (f != null) {
            return f.floatValue();
        }
        float fMeasureText = this.onExtraCallbackWithResult.measureText(Character.toString(c));
        this.IAuthTabCallback.put(Character.valueOf(c), Float.valueOf(fMeasureText));
        int i3 = asInterface + 73;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return fMeasureText;
    }

    public final float onExtraCallback(@NotNull CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (charSequence.length() == 0) {
            int i4 = asInterface + 113;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return 0.0f;
        }
        Float f = this.onNavigationEvent.get(charSequence);
        if (f == null) {
            float fMeasureText = this.onExtraCallbackWithResult.measureText(charSequence.toString());
            this.onNavigationEvent.put(charSequence, Float.valueOf(fMeasureText));
            return fMeasureText;
        }
        float fFloatValue = f.floatValue();
        int i6 = asInterface + 89;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return fFloatValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
