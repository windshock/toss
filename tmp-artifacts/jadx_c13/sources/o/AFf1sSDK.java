package o;

import android.graphics.Bitmap;
import android.graphics.Color;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.AFf1sSDK;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFf1sSDK {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final AFf1sSDK onExtraCallback = new AFf1sSDK();
    private static final Lazy onWarmupCompleted = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.tosssecurities.uikit.compound.blur.BitmapBlurProcessor$$ExternalSyntheticLambda0
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            float[] fArrOnExtraCallback = AFf1sSDK.onExtraCallback();
            int i4 = onNavigationEvent + 19;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return fArrOnExtraCallback;
            }
            throw null;
        }
    });
    public static final int onNavigationEvent = 8;

    public static /* synthetic */ float[] onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        float[] fArrIAuthTabCallback = IAuthTabCallback();
        int i4 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return fArrIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private AFf1sSDK() {
    }

    static {
        int i = IAuthTabCallbackDefault + 33;
        asBinder = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final float[] onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float[] fArr = (float[]) onWarmupCompleted.getValue();
        int i3 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return fArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[PHI: r4
      0x0030: PHI (r4v5 float) = (r4v4 float), (r4v15 float) binds: [B:10:0x002e, B:7:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035 A[PHI: r4
      0x0035: PHI (r4v8 float) = (r4v4 float), (r4v15 float) binds: [B:10:0x002e, B:7:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final float[] IAuthTabCallback() {
        float f;
        float fPow;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        float[] fArr = new float[256];
        for (int i4 = 0; i4 < 256; i4++) {
            int i5 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                f = i4 / 255.0f;
                fPow = f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4d);
            } else {
                f = i4 / 255.0f;
                if (f <= 0.04045f) {
                }
            }
            fArr[i4] = fPow;
        }
        return fArr;
    }

    public static /* synthetic */ int onNavigationEvent(AFf1sSDK aFf1sSDK, Bitmap bitmap, int i, boolean z, boolean z2, int i2, int[] iArr, int i3, Object obj) {
        boolean z3;
        int i4 = 2 % 2;
        if ((i3 & 2) != 0) {
            int i5 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i5 % 128;
            i = i5 % 2 == 0 ? 15082 : 4096;
        }
        int i6 = i;
        if ((i3 & 4) != 0) {
            int i7 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            z3 = true;
        } else {
            z3 = z;
        }
        boolean z4 = (i3 & 8) != 0 ? true : z2;
        int i9 = (i3 & 16) != 0 ? 1 : i2;
        if ((i3 & 32) != 0) {
            iArr = null;
        }
        return aFf1sSDK.onNavigationEvent(bitmap, i6, z3, z4, i9, iArr);
    }

    public final int onNavigationEvent(@NotNull Bitmap bitmap, int i, boolean z, boolean z2, int i2, @Nullable int[] iArr) {
        int i3;
        int i4;
        Bitmap bitmapCreateScaledBitmap = bitmap;
        int[] iArr2 = iArr;
        int i5 = 2;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(bitmapCreateScaledBitmap, "");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float fSqrt = width * height > i ? (float) Math.sqrt(i / r7) : 1.0f;
        int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(getCurrentBacktraceOrBuilderList.onNavigationEvent(width * fSqrt), 1);
        int iCoerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(getCurrentBacktraceOrBuilderList.onNavigationEvent(height * fSqrt), 1);
        if (iCoerceAtLeast != width || iCoerceAtLeast2 != height) {
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, iCoerceAtLeast, iCoerceAtLeast2, true);
        }
        Bitmap bitmap2 = bitmapCreateScaledBitmap;
        int i7 = iCoerceAtLeast * iCoerceAtLeast2;
        if (iArr2 == null || iArr2.length < i7) {
            iArr2 = new int[i7];
        }
        bitmap2.getPixels(iArr2, 0, iCoerceAtLeast, 0, 0, iCoerceAtLeast, iCoerceAtLeast2);
        if (z) {
            int i8 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            i3 = 5;
        } else {
            i3 = 0;
        }
        if (z2) {
            float[] fArrOnExtraCallbackWithResult = onExtraCallbackWithResult();
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            int i10 = 0;
            int i11 = 0;
            while (i10 < i7) {
                int i12 = iArr2[i10];
                if ((i12 >>> 24) >= i3) {
                    int i13 = onExtraCallbackWithResult + 59;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    f += fArrOnExtraCallbackWithResult[(i12 >>> 16) & 255];
                    f2 += fArrOnExtraCallbackWithResult[(i12 >>> 8) & 255];
                    f3 += fArrOnExtraCallbackWithResult[i12 & 255];
                    i11++;
                }
                i10 += i2;
            }
            if (i11 != 0) {
                float f4 = 1.0f / i11;
                return Color.argb(255, onNavigationEvent(f * f4), onNavigationEvent(f2 * f4), onNavigationEvent(f3 * f4));
            }
            int i15 = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i15 % 128;
            return i15 % 2 == 0 ? 1 : 0;
        }
        long j = 0;
        long j2 = 0;
        int i16 = 0;
        long j3 = 0;
        int i17 = 0;
        while (i16 < i7) {
            if ((iArr2[i16] >>> 24) >= i3) {
                int i18 = onExtraCallbackWithResult + 81;
                IAuthTabCallback = i18 % 128;
                if (i18 % i5 != 0) {
                    i4 = i3;
                    j %= (r14 << 10) & 28939;
                    j2 /= r14 & 16941;
                    i17 += 77;
                    j3 = (r14 / 50) & 24455 & j3;
                } else {
                    i4 = i3;
                    j3 += (r14 >>> 16) & 255;
                    j += (r14 >>> 8) & 255;
                    j2 += r14 & 255;
                    i17++;
                }
            } else {
                i4 = i3;
            }
            i16 += i2;
            i3 = i4;
            i5 = 2;
        }
        if (i17 != 0) {
            float f5 = i17;
            return Color.argb(255, (int) ((j3 / f5) + 0.5f), (int) ((j / f5) + 0.5f), (int) ((j2 / f5) + 0.5f));
        }
        int i19 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i19 % 128;
        int i20 = i19 % 2;
        return 0;
    }

    private final int onNavigationEvent(float f) {
        float fPow;
        int i = 2 % 2;
        if (f <= 0.0031308f) {
            int i2 = IAuthTabCallback;
            int i3 = i2 + 19;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            fPow = f * 12.92f;
            int i5 = i2 + 3;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        } else {
            fPow = ((float) (Math.pow(f, 0.4166666666666667d) * 1.0549999475479126d)) - 0.055f;
        }
        return (int) ((RangesKt___RangesKt.coerceIn(fPow, 0.0f, 1.0f) * 255.0f) + 0.5f);
    }
}
