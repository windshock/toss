package o;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class sMaxAgeSeconds {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Paint onWarmupCompleted(Paint paint, float f, float f2, double d, int[] iArr, float[] fArr, float f3, float f4, int i, Object obj) {
        float f5;
        float f6;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 41;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0 ? (i & 32) == 0 : (i & 95) == 0) {
            f5 = f3;
        } else {
            int i5 = i3 + 19;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            f5 = 0.0f;
        }
        if ((i & 64) != 0) {
            int i7 = IAuthTabCallback + 81;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            f6 = 0.0f;
        } else {
            f6 = f4;
        }
        return onExtraCallback(paint, f, f2, d, iArr, fArr, f5, f6);
    }

    public static final Paint onExtraCallback(@NotNull Paint paint, float f, float f2, double d, @NotNull int[] iArr, @NotNull float[] fArr, float f3, float f4) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(paint, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(fArr, "");
        double radians = Math.toRadians(d);
        double dSin = Math.sin(radians);
        double dCos = Math.cos(radians);
        double d2 = f / 2.0f;
        double d3 = f2 / 2.0f;
        paint.setShader(new LinearGradient(f3 + ((float) ((dSin + 1.0d) * d2)), f4 + ((float) (d3 * (1.0d - dCos))), f3 + ((float) (d2 * (1.0d - dSin))), f4 + ((float) (d3 * (dCos + 1.0d))), iArr, fArr, Shader.TileMode.CLAMP));
        int i2 = IAuthTabCallback + 99;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 0 / 0;
        }
        return paint;
    }

    public static /* synthetic */ Paint IAuthTabCallback(Paint paint, float f, float f2, float f3, float f4, float f5, float f6, int[] iArr, float[] fArr, float f7, float f8, int i, Object obj) {
        float f9;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 91;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        if (i3 % 2 != 0 ? (i & 256) == 0 : (i & 9843) == 0) {
            f9 = f7;
        } else {
            int i5 = i4 + 7;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            f9 = 0.0f;
        }
        Paint paintOnExtraCallbackWithResult = onExtraCallbackWithResult(paint, f, f2, f3, f4, f5, f6, iArr, fArr, f9, (i & 512) != 0 ? 0.0f : f8);
        int i7 = IAuthTabCallback + 101;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return paintOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static final Paint onExtraCallbackWithResult(@NotNull Paint paint, float f, float f2, float f3, float f4, float f5, float f6, @NotNull int[] iArr, @NotNull float[] fArr, float f7, float f8) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(paint, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(fArr, "");
        paint.setShader(new LinearGradient(f7 + (f3 * f), f8 + (f4 * f2), f7 + (f * f5), f8 + (f2 * f6), iArr, fArr, Shader.TileMode.CLAMP));
        int i2 = onWarmupCompleted + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return paint;
    }

    public static /* synthetic */ Paint IAuthTabCallback(Paint paint, float f, float f2, int[] iArr, float[] fArr, float f3, float f4, int i, Object obj) {
        float f5;
        float f6;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 97;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 16) != 0) {
            int i6 = i3 + 53;
            IAuthTabCallback = i6 % 128;
            f5 = i6 % 2 == 0 ? 1.0f : 0.0f;
        } else {
            f5 = f3;
        }
        if ((i & 32) != 0) {
            int i7 = IAuthTabCallback + 33;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            f6 = 0.0f;
        } else {
            f6 = f4;
        }
        return onWarmupCompleted(paint, f, f2, iArr, fArr, f5, f6);
    }

    public static final Paint onWarmupCompleted(@NotNull Paint paint, float f, float f2, @NotNull int[] iArr, @NotNull float[] fArr, float f3, float f4) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(paint, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(fArr, "");
        float fMin = Math.min(f, f2);
        if (fMin > 0.0f) {
            float f5 = fMin / 2.0f;
            paint.setShader(new RadialGradient(f3 + f5, f4 + f5, f5, iArr, fArr, Shader.TileMode.CLAMP));
            return paint;
        }
        int i2 = onWarmupCompleted + 105;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 97;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return paint;
    }

    public static /* synthetic */ Paint onNavigationEvent(Paint paint, float f, float f2, float f3, float f4, float f5, int[] iArr, float[] fArr, float f6, float f7, int i, Object obj) {
        float f8;
        float f9;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 73;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        if ((i & 128) != 0) {
            int i6 = i4 + 55;
            onWarmupCompleted = i6 % 128;
            f8 = i6 % 2 != 0 ? 2.0f : 0.0f;
        } else {
            f8 = f6;
        }
        if ((i & 256) != 0) {
            int i7 = onWarmupCompleted;
            int i8 = i7 + 107;
            IAuthTabCallback = i8 % 128;
            float f10 = i8 % 2 != 0 ? 0.0f : 2.0f;
            int i9 = i7 + 45;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            f9 = f10;
        } else {
            f9 = f7;
        }
        return onExtraCallback(paint, f, f2, f3, f4, f5, iArr, fArr, f8, f9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        r10.setShader(new android.graphics.RadialGradient(r18 + (r11 * r13), r19 + (r12 * r14), r15 * r1, r16, r17, android.graphics.Shader.TileMode.CLAMP));
        r1 = o.sMaxAgeSeconds.IAuthTabCallback + 11;
        o.sMaxAgeSeconds.onWarmupCompleted = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        if (r1 <= 2.0f) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r1 <= 0.0f) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Paint onExtraCallback(@NotNull Paint paint, float f, float f2, float f3, float f4, float f5, @NotNull int[] iArr, @NotNull float[] fArr, float f6, float f7) {
        float fMin;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(paint, "");
            Intrinsics.checkNotNullParameter(iArr, "");
            Intrinsics.checkNotNullParameter(fArr, "");
            fMin = Math.min(f, f2);
        } else {
            Intrinsics.checkNotNullParameter(paint, "");
            Intrinsics.checkNotNullParameter(iArr, "");
            Intrinsics.checkNotNullParameter(fArr, "");
            fMin = Math.min(f, f2);
        }
    }
}
