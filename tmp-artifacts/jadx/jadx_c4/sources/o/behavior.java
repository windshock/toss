package o;

import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import im.toss.facepay.validation.model.init.config.quality.BlurConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class behavior {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = (~(i7 | i8 | i)) | (~(i5 | i2 | i));
        int i10 = ~i;
        int i11 = (~(i8 | i5)) | (~(i8 | i10));
        int i12 = (~(i | i2)) | (~(i7 | i10));
        int i13 = i5 + i2 + i4 + ((-564018846) * i3) + (483938512 * i6);
        int i14 = i13 * i13;
        int i15 = (1473915126 * i5) + 752877568 + ((-1516524009) * i2) + (996813045 * i9) + (1993626090 * i11) + ((-996813045) * i12) + (477102080 * i4) + (1390411776 * i3) + (452984832 * i6) + ((-1135738880) * i14);
        int i16 = ((i5 * 1456092922) - 824780772) + (i2 * 1456095553) + (i9 * (-877)) + (i11 * (-1754)) + (i12 * 877) + (i4 * 1456093799) + (i3 * 578355822) + (i6 * 1098359728) + (i14 * 1868693504);
        int i17 = i15 + (i16 * i16 * 2110914560);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        behavior behaviorVar = (behavior) objArr[0];
        Mat mat = (Mat) objArr[1];
        BlurConfig blurConfig = (BlurConfig) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 & 75;
        int i4 = (i2 | 75) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        Intrinsics.checkNotNullParameter(mat, "");
        Intrinsics.checkNotNullParameter(blurConfig, "");
        int iOnNavigationEvent = blurConfig.onNavigationEvent();
        int i8 = onWarmupCompleted;
        int i9 = ((i8 | 61) << 1) - (i8 ^ 61);
        onExtraCallback = i9 % 128;
        RVPub rVPub = null;
        if (i9 % 2 == 0) {
            ((Float) onWarmupCompleted(new Object[]{behaviorVar, mat, Integer.valueOf(iOnNavigationEvent)}, RNSScreenManagerDelegate.onNavigationEvent(), 1398764387, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), -1398764386, RNSScreenManagerDelegate.onNavigationEvent())).floatValue();
            blurConfig.onExtraCallback();
            rVPub.hashCode();
            throw null;
        }
        double dFloatValue = ((Float) onWarmupCompleted(new Object[]{behaviorVar, mat, Integer.valueOf(iOnNavigationEvent)}, RNSScreenManagerDelegate.onNavigationEvent(), 1398764387, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), -1398764386, RNSScreenManagerDelegate.onNavigationEvent())).floatValue();
        if (dFloatValue <= blurConfig.onExtraCallback()) {
            int i10 = onWarmupCompleted;
            int i11 = ((i10 ^ 31) - (~((i10 & 31) << 1))) - 1;
            onExtraCallback = i11 % 128;
            int i12 = i11 % 2;
            int i13 = (i10 ^ 37) + ((i10 & 37) << 1);
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
        } else {
            rVPub = RVPub.FACE_TOO_BLURRY;
            int i15 = onExtraCallback + 45;
            onWarmupCompleted = i15 % 128;
            int i16 = i15 % 2;
        }
        AppTypeEnum appTypeEnum = new AppTypeEnum(Double.valueOf(dFloatValue), rVPub);
        int i17 = onExtraCallback;
        int i18 = (i17 ^ 21) + ((i17 & 21) << 1);
        onWarmupCompleted = i18 % 128;
        int i19 = i18 % 2;
        return appTypeEnum;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int iRows;
        behavior behaviorVar = (behavior) objArr[0];
        Mat mat = (Mat) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Mat mat2 = (Mat) onWarmupCompleted(new Object[]{behaviorVar, mat}, RNSScreenManagerDelegate.onNavigationEvent(), 704269303, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), -704269303, RNSScreenManagerDelegate.onNavigationEvent());
        Mat mat3 = new Mat();
        Mat mat4 = new Mat();
        Mat mat5 = new Mat();
        int i2 = onExtraCallback;
        int i3 = (i2 & (-58)) | ((~i2) & 57);
        int i4 = -(-((i2 & 57) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            Core.SVDecomp(mat2, mat3, mat4, mat5);
            iRows = mat3.rows();
            int i6 = 52 / 0;
        } else {
            Core.SVDecomp(mat2, mat3, mat4, mat5);
            iRows = mat3.rows();
        }
        float[] fArr = new float[iRows];
        mat3.get(0, 0, fArr);
        int i7 = onWarmupCompleted;
        int i8 = i7 | 9;
        int i9 = i8 << 1;
        int i10 = -((~(i7 & 9)) & i8);
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        onExtraCallback = i11 % 128;
        if (i11 % 2 == 0) {
            ((Float) onWarmupCompleted(new Object[]{behaviorVar, fArr, Integer.valueOf(iIntValue)}, RNSScreenManagerDelegate.onNavigationEvent(), 1400962500, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), -1400962498, RNSScreenManagerDelegate.onNavigationEvent())).floatValue();
            mat2.release();
            mat3.release();
            throw null;
        }
        float fFloatValue = ((Float) onWarmupCompleted(new Object[]{behaviorVar, fArr, Integer.valueOf(iIntValue)}, RNSScreenManagerDelegate.onNavigationEvent(), 1400962500, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), -1400962498, RNSScreenManagerDelegate.onNavigationEvent())).floatValue();
        mat2.release();
        mat3.release();
        mat4.release();
        mat5.release();
        int i12 = onExtraCallback;
        int i13 = i12 & 15;
        int i14 = (((i12 ^ 15) | i13) << 1) - ((i12 | 15) & (~i13));
        onWarmupCompleted = i14 % 128;
        int i15 = i14 % 2;
        return Float.valueOf(fFloatValue);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Mat mat = (Mat) objArr[1];
        int i = 2 % 2;
        Mat mat2 = new Mat();
        Imgproc.cvtColor(mat, mat2, 7);
        Mat mat3 = new Mat();
        int i2 = onWarmupCompleted;
        int i3 = (i2 ^ 91) + ((i2 & 91) << 1);
        onExtraCallback = i3 % 128;
        mat2.convertTo(mat3, i3 % 2 == 0 ? 4 : 5);
        mat2.release();
        int i4 = onExtraCallback;
        int i5 = ((i4 ^ 3) | (i4 & 3)) << 1;
        int i6 = -(((~i4) & 3) | (i4 & (-4)));
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return mat3;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        float f;
        int i = 0;
        float[] fArr = (float[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = ((i3 & 20) + (i3 | 20)) - 1;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        int length = fArr.length;
        int i6 = (i3 ^ 65) + ((i3 & 65) << 1);
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i8 = 0;
        while (i < length) {
            int i9 = onWarmupCompleted;
            int i10 = (i9 ^ 84) + ((i9 & 84) << 1);
            int i11 = (i10 ^ (-1)) + (i10 << 1);
            onExtraCallback = i11 % 128;
            if (i11 % 2 == 0) {
                f = fArr[i];
                f3 += f;
                int i12 = (i8 & (-101)) | ((~i8) & 100);
                int i13 = -(-((i8 & 100) << 1));
                int i14 = (i12 & i13) + (i13 | i12);
                int i15 = i14 & (-39);
                int i16 = (~i15) & (i14 | (-39));
                int i17 = i15 << 1;
                i8 = (i16 & i17) + (i17 | i16);
            } else {
                f = fArr[i];
                f3 += f;
                int i18 = (i8 & 67) + (i8 | 67);
                i8 = (i18 ^ (-66)) + ((i18 & (-66)) << 1);
            }
            if (i8 <= iIntValue) {
                int i19 = i9 & 111;
                int i20 = ((i9 ^ 111) | i19) << 1;
                int i21 = -((i9 | 111) & (~i19));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                int i23 = i22 % 128;
                onExtraCallback = i23;
                int i24 = i22 % 2;
                f2 += f;
                int i25 = (i23 & 67) + (i23 | 67);
                onWarmupCompleted = i25 % 128;
                int i26 = i25 % 2;
            }
            int i27 = i & (-13);
            int i28 = (((i ^ (-13)) | i27) << 1) - ((i | (-13)) & (~i27));
            i = ((i28 & (-15)) | ((~i28) & 14)) + ((i28 & 14) << 1);
            int i29 = onExtraCallback;
            int i30 = i29 & 39;
            int i31 = i29 | 39;
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            onWarmupCompleted = i32 % 128;
            int i33 = i32 % 2;
        }
        float f4 = f2 / f3;
        int i34 = onExtraCallback;
        int i35 = (((i34 & (-80)) | ((~i34) & 79)) - (~((i34 & 79) << 1))) - 1;
        onWarmupCompleted = i35 % 128;
        if (i35 % 2 == 0) {
            return Float.valueOf(f4);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final float onExtraCallback(float[] fArr, int i) {
        return ((Float) onWarmupCompleted(new Object[]{this, fArr, Integer.valueOf(i)}, RNSScreenManagerDelegate.onNavigationEvent(), 1400962500, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), -1400962498, RNSScreenManagerDelegate.onNavigationEvent())).floatValue();
    }

    private final float onExtraCallbackWithResult(Mat mat, int i) {
        return ((Float) onWarmupCompleted(new Object[]{this, mat, Integer.valueOf(i)}, RNSScreenManagerDelegate.onNavigationEvent(), 1398764387, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), -1398764386, RNSScreenManagerDelegate.onNavigationEvent())).floatValue();
    }

    private final Mat IAuthTabCallback(Mat mat) {
        return (Mat) onWarmupCompleted(new Object[]{this, mat}, RNSScreenManagerDelegate.onNavigationEvent(), 704269303, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), -704269303, RNSScreenManagerDelegate.onNavigationEvent());
    }

    public final AppTypeEnum<Double> onWarmupCompleted(@NotNull Mat mat, @NotNull BlurConfig blurConfig) {
        return (AppTypeEnum) onWarmupCompleted(new Object[]{this, mat, blurConfig}, RNSScreenManagerDelegate.onNavigationEvent(), 1786700769, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), -1786700766, RNSScreenManagerDelegate.onNavigationEvent());
    }
}
