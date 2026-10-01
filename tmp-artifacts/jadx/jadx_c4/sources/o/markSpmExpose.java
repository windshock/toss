package o;

import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class markSpmExpose {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = i | i9;
        int i11 = ~i;
        int i12 = i9 | (~(i11 | i6));
        int i13 = (~(i5 | i7 | i)) | (~(i8 | i11 | i7));
        int i14 = i6 + i + i4 + ((-619979367) * i3) + (68302741 * i2);
        int i15 = i14 * i14;
        int i16 = (i6 * 561304900) + 382271488 + (561304900 * i) + ((-1585293958) * i10) + (792646979 * i12) + ((-792646979) * i13) + ((-231342080) * i4) + (1615200256 * i3) + ((-1821507584) * i2) + (428933120 * i15);
        int i17 = ((i6 * (-96142684)) - 56799437) + (i * (-96142684)) + (i10 * 1642) + (i12 * (-821)) + (i13 * 821) + (i4 * (-96141863)) + (i3 * (-1380774991)) + (i2 * (-1175232947)) + (i15 * (-118947840));
        int i18 = i16 + (i17 * i17 * (-1369505792));
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        markSpmExpose markspmexpose = (markSpmExpose) objArr[0];
        Mat mat = (Mat) objArr[1];
        getUnreadableElfFilesList getunreadableelffileslist = (getUnreadableElfFilesList) objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = (i2 ^ 72) + ((i2 & 72) << 1);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(mat, "");
            Intrinsics.checkNotNullParameter(getunreadableelffileslist, "");
            int i5 = 85 / 0;
        } else {
            Intrinsics.checkNotNullParameter(mat, "");
            Intrinsics.checkNotNullParameter(getunreadableelffileslist, "");
        }
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback3 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        double dDoubleValue = ((Double) onWarmupCompleted(-956807648, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback2, iOnExtraCallback, 956807651, new Object[]{markspmexpose, mat})).doubleValue();
        if (getunreadableelffileslist.contains(Double.valueOf(dDoubleValue))) {
            AppTypeEnum appTypeEnum = new AppTypeEnum(Double.valueOf(dDoubleValue), null);
            int i6 = onWarmupCompleted;
            int i7 = i6 & 63;
            int i8 = i7 + ((i6 ^ 63) | i7);
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return appTypeEnum;
        }
        if (dDoubleValue > ((Number) getunreadableelffileslist.getEndInclusive()).doubleValue()) {
            AppTypeEnum appTypeEnum2 = new AppTypeEnum(Double.valueOf(dDoubleValue), RVPub.IMAGE_BRIGHTNESS_TOO_HIGH);
            int i10 = onWarmupCompleted;
            int i11 = i10 & 21;
            int i12 = (i11 - (~(-(-((i10 ^ 21) | i11))))) - 1;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            return appTypeEnum2;
        }
        AppTypeEnum appTypeEnum3 = new AppTypeEnum(Double.valueOf(dDoubleValue), RVPub.IMAGE_BRIGHTNESS_TOO_LOW);
        int i14 = IAuthTabCallback;
        int i15 = ((i14 & 74) + (i14 | 74)) - 1;
        onWarmupCompleted = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 8 / 0;
        }
        return appTypeEnum3;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        Mat mat;
        markSpmExpose markspmexpose = (markSpmExpose) objArr[0];
        Mat mat2 = (Mat) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = (i2 & (-82)) | ((~i2) & 81);
        int i4 = (i2 & 81) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        onWarmupCompleted = i5 % 128;
        Mat mat3 = null;
        try {
            if (i5 % 2 == 0) {
                int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                throw null;
            }
            int iOnExtraCallback3 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            int iOnExtraCallback4 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            mat = (Mat) onWarmupCompleted(-1375734440, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback4, iOnExtraCallback3, 1375734440, new Object[]{markspmexpose, mat2});
            int iOnExtraCallback5 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            int i6 = ~iOnExtraCallback5;
            int i7 = ((-71323217) & i6) | ((~i6) & 71323216);
            int i8 = i6 & 71323216;
            int i9 = -(-(((i7 & i8) | (i7 ^ i8)) * (-192)));
            int i10 = ((((~i9) & (-35883814)) | (35883813 & i9)) - (~((i9 & (-35883814)) << 1))) - 1;
            int i11 = ((~i6) & 1148804730) | ((-1148804731) & i6);
            int i12 = 1148804730 & i6;
            int i13 = ~((i11 & i12) | (i11 ^ i12));
            int i14 = ((i13 & 142639493) | (142639493 ^ i13)) * (-384);
            int i15 = i10 ^ i14;
            int i16 = ((i14 & i10) | i15) << 1;
            int i17 = -i15;
            int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
            int i19 = ((-142639494) & i6) | (142639493 & iOnExtraCallback5);
            int i20 = (-142639494) & iOnExtraCallback5;
            int i21 = ~((i20 & i19) | (i19 ^ i20));
            int i22 = ~iOnExtraCallback5;
            int i23 = (i22 & 1148804730) | (1148804730 ^ i22);
            int i24 = ((-213962710) & i23) | ((~i23) & 213962709);
            int i25 = i23 & 213962709;
            int i26 = ~((i25 & i24) | (i24 ^ i25));
            int i27 = i21 & i26;
            int i28 = (i21 | i26) & (~i27);
            int i29 = (i28 & i27) | (i28 ^ i27);
            int i30 = ~((iOnExtraCallback5 & (-1077481515)) | (i6 & (-1077481515)) | (1077481514 & iOnExtraCallback5));
            int i31 = i29 & i30;
            int i32 = (i30 | i29) & (~i31);
            int i33 = ((i32 & i31) | (i32 ^ i31)) * 192;
            int i34 = (i18 & i33) + (i33 | i18);
            int iIdentityHashCode = System.identityHashCode(markspmexpose);
            int i35 = ~iIdentityHashCode;
            int i36 = ~iIdentityHashCode;
            int i37 = (i36 | iIdentityHashCode) & i35;
            int i38 = ~((i37 & 1509255764) | (1509255764 ^ i37));
            int i39 = (-464917837) & i38;
            int i40 = (i38 | (-464917837)) & (~i39);
            int i41 = -(-(((i40 & i39) | (i40 ^ i39)) * (-865)));
            int i42 = (-1509255765) & iIdentityHashCode;
            int i43 = (iIdentityHashCode | (-1509255765)) & (~i42);
            int i44 = (((692481014 & i41) + (i41 | 692481014)) - (~(-(-((~((i43 & i42) | (i43 ^ i42))) * 865))))) - 1;
            int i45 = ((~i35) & (-464917837)) | (464917836 & i35);
            int i46 = i35 & (-464917837);
            int i47 = ~((i45 & i46) | (i45 ^ i46));
            int i48 = i36 & (-1509255765);
            int i49 = (i36 | (-1509255765)) & (~i48);
            int i50 = ~((i48 & i49) | (i49 ^ i48));
            try {
                if (i34 <= (i44 - (~(-(-(((i47 & i50) | (((~i50) & i47) | ((~i47) & i50))) * 865))))) - 1) {
                    int iOnExtraCallback6 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                    int iOnExtraCallback7 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                    ((Double) onWarmupCompleted(-1539331513, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback7, iOnExtraCallback6, 1539331514, new Object[]{markspmexpose, mat})).doubleValue();
                    throw null;
                }
                int iOnExtraCallback8 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                int iOnExtraCallback9 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                double dDoubleValue = ((Double) onWarmupCompleted(-1539331513, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback9, iOnExtraCallback8, 1539331514, new Object[]{markspmexpose, mat})).doubleValue();
                if (mat != null) {
                    mat.release();
                    int i51 = IAuthTabCallback;
                    int i52 = ((i51 ^ 87) | (i51 & 87)) << 1;
                    int i53 = -(((~i51) & 87) | (i51 & (-88)));
                    int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
                    onWarmupCompleted = i54 % 128;
                    int i55 = i54 % 2;
                }
                int i56 = onWarmupCompleted;
                int i57 = i56 & 37;
                int i58 = i57 + ((i56 ^ 37) | i57);
                IAuthTabCallback = i58 % 128;
                if (i58 % 2 == 0) {
                    return Double.valueOf(dDoubleValue);
                }
                throw null;
            } catch (Exception unused) {
                if (mat != null) {
                    mat.release();
                    int i59 = IAuthTabCallback + 114;
                    int i60 = (i59 ^ (-1)) + (i59 << 1);
                    onWarmupCompleted = i60 % 128;
                    int i61 = i60 % 2;
                }
                int i62 = IAuthTabCallback;
                int i63 = ((i62 ^ 91) | (i62 & 91)) << 1;
                int i64 = -(((~i62) & 91) | (i62 & (-92)));
                int i65 = ((i63 | i64) << 1) - (i64 ^ i63);
                onWarmupCompleted = i65 % 128;
                if (i65 % 2 != 0) {
                    return Double.valueOf(-1.0d);
                }
                mat3.hashCode();
                throw null;
            } catch (Throwable th) {
                th = th;
                mat3 = mat;
                if (mat3 != null) {
                    int i66 = IAuthTabCallback + 9;
                    onWarmupCompleted = i66 % 128;
                    int i67 = i66 % 2;
                    mat3.release();
                    int i68 = IAuthTabCallback;
                    int i69 = (i68 ^ 126) + ((i68 & 126) << 1);
                    int i70 = (i69 ^ (-1)) + (i69 << 1);
                    onWarmupCompleted = i70 % 128;
                    int i71 = i70 % 2;
                }
                throw th;
            }
        } catch (Exception unused2) {
            mat = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Mat mat = (Mat) objArr[1];
        int i = 2 % 2;
        Mat mat2 = new Mat();
        Imgproc.cvtColor(mat, mat2, 45);
        Mat mat3 = new Mat();
        int i2 = onWarmupCompleted;
        int i3 = i2 & 97;
        int i4 = ((i2 ^ 97) | i3) << 1;
        int i5 = -((i2 | 97) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        Core.extractChannel(mat2, mat3, 0);
        mat2.release();
        int i8 = IAuthTabCallback;
        int i9 = i8 ^ 89;
        int i10 = (((i8 & 89) | i9) << 1) - i9;
        onWarmupCompleted = i10 % 128;
        if (i10 % 2 != 0) {
            return mat3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        float f;
        float f2;
        int i;
        int i2;
        markSpmExpose markspmexpose = (markSpmExpose) objArr[0];
        Mat mat = (Mat) objArr[1];
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback;
        int i5 = (i4 & (-14)) | ((~i4) & 13);
        int i6 = -(-((i4 & 13) << 1));
        int i7 = (i5 & i6) + (i6 | i5);
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        int i9 = (int) mat.total();
        byte[] bArr = new byte[i9];
        int i10 = onWarmupCompleted;
        int i11 = (((i10 & (-18)) | ((~i10) & 17)) - (~((i10 & 17) << 1))) - 1;
        IAuthTabCallback = i11 % 128;
        if (i11 % 2 != 0) {
            mat.get(0, 0, bArr);
        } else {
            mat.get(0, 0, bArr);
        }
        float[] fArr = new float[i9];
        int i12 = IAuthTabCallback;
        int i13 = ((i12 | 85) << 1) - (i12 ^ 85);
        onWarmupCompleted = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        int i14 = 0;
        double d = 0.0d;
        while (i14 < i9) {
            int i15 = IAuthTabCallback;
            int i16 = (((i15 ^ 53) | (i15 & 53)) << 1) - ((53 & (~i15)) | (i15 & (-54)));
            int i17 = i16 % 128;
            onWarmupCompleted = i17;
            int i18 = i16 % 2;
            float f3 = bArr[i14] & 255;
            int i19 = (i17 ^ 53) + ((i17 & 53) << 1);
            int i20 = i19 % 128;
            IAuthTabCallback = i20;
            if (i19 % 2 != 0) {
                d += f3;
                fArr[i14] = f3;
                i2 = (i14 & 122) + (i14 | 122);
            } else {
                d += f3;
                fArr[i14] = f3;
                i2 = ((i14 ^ 1) - (~(-(-((i14 & 1) << 1))))) - 1;
            }
            i14 = i2;
            int i21 = (i20 ^ 99) + ((i20 & 99) << 1);
            onWarmupCompleted = i21 % 128;
            int i22 = i21 % 2;
        }
        double d2 = i9;
        float f4 = (float) (d / d2);
        int i23 = IAuthTabCallback;
        int i24 = i23 & 91;
        int i25 = i24 + ((i23 ^ 91) | i24);
        onWarmupCompleted = i25 % 128;
        int i26 = i25 % 2;
        int i27 = 0;
        double d3 = 0.0d;
        while (i27 < i9) {
            int i28 = onWarmupCompleted;
            int i29 = i28 + 11;
            IAuthTabCallback = i29 % 128;
            float f5 = i29 % 2 != 0 ? fArr[i27] * f4 : fArr[i27] - f4;
            d3 += f5 * f5;
            int i30 = i27 & 64;
            int i31 = (((i27 | 64) & (~i30)) - (~(i30 << 1))) - 1;
            int i32 = ((i31 | (-62)) << 1) - (i31 ^ (-62));
            i27 = (i32 ^ (-1)) + (i32 << 1);
            int i33 = i28 + 23;
            IAuthTabCallback = i33 % 128;
            if (i33 % 2 != 0) {
                int i34 = 3 / 3;
            }
        }
        float fSqrt = ((float) Math.sqrt(d3 / d2)) * 2.0f;
        int i35 = IAuthTabCallback;
        int i36 = ((i35 | 23) << 1) - (i35 ^ 23);
        onWarmupCompleted = i36 % 128;
        if (i36 % 2 == 0) {
            f = f4 + fSqrt;
            f2 = f4 - fSqrt;
            i = 1;
        } else {
            f = f4 - fSqrt;
            f2 = f4 + fSqrt;
            i = 0;
        }
        System.identityHashCode(markspmexpose);
        System.identityHashCode(markspmexpose);
        float fCoerceAtLeast = Float.MIN_VALUE;
        float fCoerceAtMost = Float.MAX_VALUE;
        while (i < i9) {
            int i37 = IAuthTabCallback;
            int i38 = (((~i37) & 27) | (i37 & (-28))) + ((i37 & 27) << 1);
            onWarmupCompleted = i38 % 128;
            int i39 = i38 % 2;
            float f6 = fArr[i];
            int i40 = i37 + 21;
            onWarmupCompleted = i40 % 128;
            int i41 = i40 % 2;
            if (f6 > f) {
                int i42 = i37 + 55;
                onWarmupCompleted = i42 % 128;
                int i43 = i42 % 2;
                if (f6 < f2) {
                    int i44 = ((i37 ^ 115) | (i37 & 115)) << 1;
                    int i45 = -(((~i37) & 115) | (i37 & (-116)));
                    int i46 = ((i44 | i45) << 1) - (i44 ^ i45);
                    onWarmupCompleted = i46 % 128;
                    int i47 = i46 % 2;
                    fCoerceAtLeast = RangesKt.coerceAtLeast(fCoerceAtLeast, f6);
                    fCoerceAtMost = RangesKt.coerceAtMost(fCoerceAtMost, f6);
                    int i48 = IAuthTabCallback + 85;
                    onWarmupCompleted = i48 % 128;
                    int i49 = i48 % 2;
                }
            }
            i = ((i | 1) << 1) - (i ^ 1);
            int i50 = IAuthTabCallback + 9;
            onWarmupCompleted = i50 % 128;
            int i51 = i50 % 2;
        }
        if (fCoerceAtLeast == Float.MIN_VALUE) {
            int i52 = IAuthTabCallback;
            int i53 = i52 & 91;
            int i54 = -(-((i52 ^ 91) | i53));
            int i55 = (i53 & i54) + (i53 | i54);
            onWarmupCompleted = i55 % 128;
            fCoerceAtLeast = i55 % 2 == 0 ? 2.0f : 0.0f;
            int i56 = (-2) - (((i52 & 38) + (i52 | 38)) ^ (-1));
            onWarmupCompleted = i56 % 128;
            int i57 = i56 % 2;
        }
        if (fCoerceAtMost == Float.MAX_VALUE) {
            int i58 = onWarmupCompleted;
            int i59 = ((((i58 ^ 33) | (i58 & 33)) << 1) - (~(-((i58 & (-34)) | ((~i58) & 33))))) - 1;
            IAuthTabCallback = i59 % 128;
            int i60 = i59 % 2;
            int i61 = (-2) - ((((i58 | 28) << 1) - (i58 ^ 28)) ^ (-1));
            IAuthTabCallback = i61 % 128;
            if (i61 % 2 != 0) {
                int i62 = 5 % 2;
            }
            fCoerceAtMost = 0.0f;
        }
        int i63 = IAuthTabCallback;
        int i64 = (i63 & 65) + (i63 | 65);
        onWarmupCompleted = i64 % 128;
        int i65 = i64 % 2;
        int i66 = 0;
        int i67 = 0;
        double d4 = 0.0d;
        while (i66 < i9) {
            int i68 = onWarmupCompleted;
            int i69 = i68 & 51;
            int i70 = ((~i69) & (i68 | 51)) + (i69 << 1);
            IAuthTabCallback = i70 % 128;
            if (i70 % 2 != 0) {
                Object obj = null;
                float f7 = fArr[i66];
                obj.hashCode();
                throw null;
            }
            float f8 = fArr[i66];
            int i71 = i68 + 11;
            IAuthTabCallback = i71 % 128;
            if (i71 % 2 != 0) {
                throw null;
            }
            if (f8 > f && f8 < f2) {
                int i72 = (i68 & 33) + (i68 | 33);
                int i73 = i72 % 128;
                IAuthTabCallback = i73;
                int i74 = i72 % 2;
                d4 += ((int) (f8 - fCoerceAtMost)) + fCoerceAtMost;
                int i75 = i73 ^ 45;
                int i76 = ((i73 & 45) | i75) << 1;
                int i77 = -i75;
                int i78 = (i76 ^ i77) + ((i77 & i76) << 1);
                onWarmupCompleted = i78 % 128;
                int i79 = i78 % 2;
                i67 = ((i67 | 1) << 1) - (((~i67) & 1) | (i67 & (-2)));
                int i80 = (i73 & (-98)) | ((~i73) & 97);
                int i81 = (i73 & 97) << 1;
                int i82 = (i80 & i81) + (i80 | i81);
                onWarmupCompleted = i82 % 128;
                int i83 = i82 % 2;
            }
            i66 = ((i66 & 1) << 1) + (i66 ^ 1);
            int i84 = onWarmupCompleted;
            int i85 = (i84 & (-108)) | ((~i84) & 107);
            int i86 = (i84 & 107) << 1;
            int i87 = (i85 ^ i86) + ((i86 & i85) << 1);
            IAuthTabCallback = i87 % 128;
            int i88 = i87 % 2;
        }
        float f9 = (fCoerceAtMost + fCoerceAtLeast) / 2.0f;
        float f10 = (float) d4;
        int i89 = onWarmupCompleted;
        int i90 = i89 & 75;
        int i91 = -(-(i89 | 75));
        int i92 = (i90 ^ i91) + ((i90 & i91) << 1);
        IAuthTabCallback = i92 % 128;
        double d5 = i92 % 2 != 0 ? ((f10 / i67) - f9) + 2.0d : ((f10 / i67) + f9) / 2.0d;
        int i93 = (((i89 ^ 123) | (i89 & 123)) << 1) - (((~i89) & 123) | (i89 & (-124)));
        IAuthTabCallback = i93 % 128;
        int i94 = i93 % 2;
        double dMin = Math.min(256.0d, d5) / 256.0d;
        int i95 = IAuthTabCallback;
        int i96 = i95 & 105;
        int i97 = ((i95 ^ 105) | i96) << 1;
        int i98 = -((i95 | 105) & (~i96));
        int i99 = ((i97 | i98) << 1) - (i98 ^ i97);
        onWarmupCompleted = i99 % 128;
        if (i99 % 2 != 0) {
            return Double.valueOf(dMin);
        }
        int i100 = 71 / 0;
        return Double.valueOf(dMin);
    }

    private final double onExtraCallbackWithResult(Mat mat) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback3 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return ((Double) onWarmupCompleted(-956807648, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback2, iOnExtraCallback, 956807651, new Object[]{this, mat})).doubleValue();
    }

    private final double IAuthTabCallback(Mat mat) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback3 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return ((Double) onWarmupCompleted(-1539331513, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback2, iOnExtraCallback, 1539331514, new Object[]{this, mat})).doubleValue();
    }

    private final Mat onExtraCallback(Mat mat) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback3 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (Mat) onWarmupCompleted(-1375734440, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback2, iOnExtraCallback, 1375734440, new Object[]{this, mat});
    }

    public final AppTypeEnum<Double> onExtraCallback(@NotNull Mat mat, @NotNull getUnreadableElfFilesList<Double> getunreadableelffileslist) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback3 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (AppTypeEnum) onWarmupCompleted(188075357, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback2, iOnExtraCallback, -188075355, new Object[]{this, mat, getunreadableelffileslist});
    }
}
