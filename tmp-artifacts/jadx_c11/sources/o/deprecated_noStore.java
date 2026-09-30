package o;

import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import androidx.graphics.shapes.RoundedPolygonKt;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_noStore {
    private static int IAuthTabCallback = 1;
    public static final deprecated_noStore onExtraCallback = new deprecated_noStore();
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7;
        boolean z;
        int i8;
        int i9 = ~i4;
        int i10 = ~i2;
        int i11 = ~(i9 | i10);
        int i12 = i9 | i3;
        int i13 = (~i12) | i11;
        int i14 = ~i3;
        int i15 = (~(i2 | i12)) | (~(i10 | i14)) | (~(i14 | i4));
        int i16 = i4 + i3 + i6 + ((-1017789379) * i5) + (461141949 * i);
        int i17 = i16 * i16;
        int i18 = ((i4 * (-1063000396)) - 360994079) + (i3 * (-1063001374)) + (i13 * (-978)) + (i15 * 489) + (i11 * 489) + ((-1063000885) * i6) + ((-90181537) * i5) + ((-1548859681) * i) + (i17 * 816250880);
        int i19 = ((-551480932) * i4) + 431816704 + ((-1613042074) * i3) + ((-1061561142) * i13) + (i15 * (-1616703077)) + ((-1616703077) * i11) + (1065222144 * i6) + ((-1727660032) * i5) + (1912995840 * i) + ((-1005256704) * i17) + (i18 * i18 * 1493368832);
        boolean z2 = true;
        if (i19 == 1) {
            deprecated_noStore deprecated_nostore = (deprecated_noStore) objArr[0];
            View view = (View) objArr[1];
            float fFloatValue = ((Number) objArr[2]).floatValue();
            float fFloatValue2 = ((Number) objArr[3]).floatValue();
            float fFloatValue3 = ((Number) objArr[4]).floatValue();
            float fFloatValue4 = ((Number) objArr[5]).floatValue();
            int iIntValue = ((Number) objArr[6]).intValue();
            boolean zBooleanValue = ((Boolean) objArr[7]).booleanValue();
            int iIntValue2 = ((Number) objArr[8]).intValue();
            Object obj = objArr[9];
            int i20 = 2 % 2;
            if ((iIntValue2 & 16) != 0) {
                int i21 = onWarmupCompleted + 41;
                int i22 = i21 % 128;
                onNavigationEvent = i22;
                int i23 = i21 % 2;
                int i24 = i22 + 35;
                onWarmupCompleted = i24 % 128;
                int i25 = i24 % 2;
                i7 = 15;
            } else {
                i7 = iIntValue;
            }
            if ((iIntValue2 & 32) != 0) {
                int i26 = onWarmupCompleted + 17;
                onNavigationEvent = i26 % 128;
                int i27 = i26 % 2;
                z = true;
            } else {
                z = zBooleanValue;
            }
            return deprecated_nostore.onExtraCallbackWithResult(view, fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, i7, z);
        }
        if (i19 == 2) {
            return onExtraCallback(objArr);
        }
        if (i19 != 3) {
            deprecated_noStore deprecated_nostore2 = (deprecated_noStore) objArr[0];
            float fFloatValue5 = ((Number) objArr[1]).floatValue();
            float fFloatValue6 = ((Number) objArr[2]).floatValue();
            float fFloatValue7 = ((Number) objArr[3]).floatValue();
            int iIntValue3 = ((Number) objArr[4]).intValue();
            boolean zBooleanValue2 = ((Boolean) objArr[5]).booleanValue();
            int iIntValue4 = ((Number) objArr[6]).intValue();
            Object obj2 = objArr[7];
            int i28 = 2 % 2;
            int i29 = onWarmupCompleted;
            int i30 = i29 + 53;
            onNavigationEvent = i30 % 128;
            int i31 = i30 % 2;
            int i32 = (iIntValue4 & 8) == 0 ? iIntValue3 : 15;
            if ((iIntValue4 & 16) != 0) {
                int i33 = i29 + 3;
                onNavigationEvent = i33 % 128;
                int i34 = i33 % 2;
            } else {
                z2 = zBooleanValue2;
            }
            return deprecated_nostore2.onExtraCallback(fFloatValue5, fFloatValue6, fFloatValue7, i32, z2);
        }
        deprecated_noStore deprecated_nostore3 = (deprecated_noStore) objArr[0];
        float fFloatValue8 = ((Number) objArr[1]).floatValue();
        float fFloatValue9 = ((Number) objArr[2]).floatValue();
        float fFloatValue10 = ((Number) objArr[3]).floatValue();
        float fFloatValue11 = ((Number) objArr[4]).floatValue();
        float fFloatValue12 = ((Number) objArr[5]).floatValue();
        float fFloatValue13 = ((Number) objArr[6]).floatValue();
        int iIntValue5 = ((Number) objArr[7]).intValue();
        int iIntValue6 = ((Number) objArr[8]).intValue();
        Object obj3 = objArr[9];
        int i35 = 2 % 2;
        int i36 = onWarmupCompleted + 31;
        int i37 = i36 % 128;
        onNavigationEvent = i37;
        if (i36 % 2 != 0 ? (iIntValue6 & 64) == 0 : (iIntValue6 & 65) == 0) {
            i8 = iIntValue5;
        } else {
            int i38 = i37 + 117;
            onWarmupCompleted = i38 % 128;
            int i39 = i38 % 2;
            i8 = 15;
        }
        return deprecated_nostore3.onExtraCallback(fFloatValue8, fFloatValue9, fFloatValue10, fFloatValue11, fFloatValue12, fFloatValue13, i8);
    }

    private final boolean onNavigationEvent(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted;
        int i5 = i4 + 39;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 | i) != i) {
            return false;
        }
        int i7 = i4 + 67;
        onNavigationEvent = i7 % 128;
        return i7 % 2 != 0;
    }

    private deprecated_noStore() {
    }

    public static /* synthetic */ Path onNavigationEvent(deprecated_noStore deprecated_nostore, View view, float f, int i, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted;
        int i5 = i4 + 103;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0 ? (i2 & 2) != 0 : (i2 & 5) != 0) {
            i = 15;
        }
        if ((i2 & 4) != 0) {
            int i6 = i4 + 39;
            onNavigationEvent = i6 % 128;
            z = i6 % 2 != 0;
        }
        return deprecated_nostore.onWarmupCompleted(view, f, i, z);
    }

    public final Path onWarmupCompleted(@NotNull View view, float f, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 111;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Path pathOnWarmupCompleted = onWarmupCompleted(view.getWidth(), view.getHeight(), f, i, z);
        int i5 = onWarmupCompleted + 3;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return pathOnWarmupCompleted;
    }

    public static /* synthetic */ Path IAuthTabCallback(deprecated_noStore deprecated_nostore, View view, float f, float f2, float f3, float f4, int i, boolean z, int i2, Object obj) {
        int i3;
        boolean z2;
        int i4 = 2 % 2;
        if ((i2 & 16) != 0) {
            int i5 = onNavigationEvent;
            int i6 = i5 + 105;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 87;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 % 4;
            }
            i3 = 15;
        } else {
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            int i10 = onWarmupCompleted + 81;
            onNavigationEvent = i10 % 128;
            z2 = i10 % 2 != 0;
        } else {
            z2 = z;
        }
        return deprecated_nostore.onWarmupCompleted(view, f, f2, f3, f4, i3, z2);
    }

    public final Path onWarmupCompleted(@NotNull View view, float f, float f2, float f3, float f4, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 63;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            onNavigationEvent(view.getWidth(), view.getHeight(), f, f2, f3, f4, i, z);
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        Path pathOnNavigationEvent = onNavigationEvent(view.getWidth(), view.getHeight(), f, f2, f3, f4, i, z);
        int i4 = onWarmupCompleted + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return pathOnNavigationEvent;
    }

    public static /* synthetic */ Path onExtraCallbackWithResult(deprecated_noStore deprecated_nostore, float f, float f2, float f3, int i, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 57;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        if ((i2 & 8) != 0) {
            int i7 = i5 + 89;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            i = 15;
        }
        int i9 = i;
        if ((i2 & 16) != 0) {
            z = true;
        }
        return deprecated_nostore.onWarmupCompleted(f, f2, f3, i9, z);
    }

    public final Path onWarmupCompleted(float f, float f2, float f3, int i, boolean z) {
        float f4;
        int i2 = 2 % 2;
        float fMin = Math.min(f3, Math.min(f, f2) / 2.0f);
        Path path = new Path();
        if (onNavigationEvent(i, 2)) {
            path.moveTo(f - fMin, 0.0f);
            path.quadTo(f, 0.0f, f, fMin);
            int i3 = onNavigationEvent + 29;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        } else {
            path.moveTo(f, 0.0f);
        }
        if (!onNavigationEvent(i, 8)) {
            path.lineTo(f, f2);
        } else {
            int i5 = onWarmupCompleted + 15;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                path.lineTo(f, f2 * fMin);
                f4 = f % fMin;
            } else {
                path.lineTo(f, f2 - fMin);
                f4 = f - fMin;
            }
            path.quadTo(f, f2, f4, f2);
        }
        if (onNavigationEvent(i, 4)) {
            path.lineTo(fMin, f2);
            path.quadTo(0.0f, f2, 0.0f, f2 - fMin);
        } else {
            path.lineTo(0.0f, f2);
        }
        if (!onNavigationEvent(i, 1)) {
            path.lineTo(0.0f, 0.0f);
        } else {
            int i6 = onWarmupCompleted + 113;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                path.lineTo(2.0f, fMin);
                path.quadTo(0.0f, 1.0f, fMin, 1.0f);
            } else {
                path.lineTo(0.0f, fMin);
                path.quadTo(0.0f, 0.0f, fMin, 0.0f);
            }
        }
        if (z) {
            path.close();
        }
        return path;
    }

    public static /* synthetic */ Path onWarmupCompleted(deprecated_noStore deprecated_nostore, float f, float f2, float f3, float f4, float f5, float f6, int i, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 103;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Path pathOnNavigationEvent = deprecated_nostore.onNavigationEvent(f, f2, f3, f4, f5, f6, (i2 & 64) != 0 ? 15 : i, (i2 & 128) != 0 ? true : z);
        int i6 = onWarmupCompleted + 27;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return pathOnNavigationEvent;
        }
        throw null;
    }

    public final Path onNavigationEvent(float f, float f2, float f3, float f4, float f5, float f6, int i, boolean z) {
        int i2 = 2 % 2;
        float fMin = Math.min(f, f2) / 2.0f;
        float fMin2 = Math.min(f3, fMin);
        float fMin3 = Math.min(f4, fMin);
        float fMin4 = Math.min(f5, fMin);
        float fMin5 = Math.min(f6, fMin);
        Path path = new Path();
        if (!onNavigationEvent(i, 2)) {
            path.moveTo(f, 0.0f);
        } else {
            int i3 = onNavigationEvent + 5;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                path.moveTo(f * fMin3, 2.0f);
            } else {
                path.moveTo(f - fMin3, 0.0f);
            }
            path.quadTo(f, 0.0f, f, fMin3);
        }
        if (onNavigationEvent(i, 8)) {
            path.lineTo(f, f2 - fMin4);
            path.quadTo(f, f2, f - fMin4, f2);
        } else {
            path.lineTo(f, f2);
        }
        if (onNavigationEvent(i, 4)) {
            int i4 = onWarmupCompleted + 1;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            path.lineTo(fMin5, f2);
            path.quadTo(0.0f, f2, 0.0f, f2 - fMin5);
        } else {
            path.lineTo(0.0f, f2);
        }
        if (onNavigationEvent(i, 1)) {
            int i6 = onWarmupCompleted + 29;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                path.lineTo(0.0f, fMin2);
                path.quadTo(0.0f, 2.0f, fMin2, 1.0f);
            } else {
                path.lineTo(0.0f, fMin2);
                path.quadTo(0.0f, 0.0f, fMin2, 0.0f);
            }
        } else {
            path.lineTo(0.0f, 0.0f);
        }
        if (!(!z)) {
            path.close();
        }
        int i7 = onNavigationEvent + 17;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return path;
    }

    public final Path onExtraCallbackWithResult(@NotNull View view, float f, float f2, float f3, float f4, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 113;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            onExtraCallbackWithResult(view.getWidth(), view.getHeight(), f, f2, f3, f4, i, z);
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        Path pathOnExtraCallbackWithResult = onExtraCallbackWithResult(view.getWidth(), view.getHeight(), f, f2, f3, f4, i, z);
        int i4 = onNavigationEvent + 47;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return pathOnExtraCallbackWithResult;
    }

    public final Path onExtraCallback(float f, float f2, float f3, int i, boolean z) {
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        boolean z2;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z3;
        Path path;
        float f14;
        int i2 = 2 % 2;
        float fMin = Math.min(f3, Math.min(f, f2) / 2.0f);
        Path path2 = new Path();
        if (!onNavigationEvent(i, 2)) {
            f4 = 0.0f;
            path2.moveTo(f, 0.0f);
            int i3 = onNavigationEvent + 75;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = onNavigationEvent + 35;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                path2.moveTo(f / fMin, 0.0f);
                f9 = fMin * 2.0f;
                f10 = f * f9;
                f11 = 2.0f;
                f12 = -90.0f;
                f13 = 90.0f;
                path = path2;
                f14 = f;
                f4 = 0.0f;
                z3 = true;
            } else {
                f4 = 0.0f;
                path2.moveTo(f - fMin, 0.0f);
                f9 = fMin * 2.0f;
                f10 = f - f9;
                f11 = 0.0f;
                f12 = -90.0f;
                f13 = 90.0f;
                z3 = false;
                path = path2;
                f14 = f;
            }
            path.arcTo(f10, f11, f14, f9, f12, f13, z3);
        }
        if (onNavigationEvent(i, 8)) {
            int i6 = onNavigationEvent + 71;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                path2.lineTo(f, f2 * fMin);
                float f15 = fMin % 2.0f;
                f5 = f / f15;
                f6 = f2 * f15;
                f7 = 2.0f;
                f8 = 90.0f;
                z2 = true;
            } else {
                path2.lineTo(f, f2 - fMin);
                float f16 = fMin * 2.0f;
                f5 = f - f16;
                f6 = f2 - f16;
                f7 = 0.0f;
                f8 = 90.0f;
                z2 = false;
            }
            path2.arcTo(f5, f6, f, f2, f7, f8, z2);
        } else {
            path2.lineTo(f, f2);
        }
        if (onNavigationEvent(i, 4)) {
            path2.lineTo(fMin, f2);
            float f17 = fMin * 2.0f;
            path2.arcTo(0.0f, f2 - f17, f17, f2, 90.0f, 90.0f, false);
        } else {
            path2.lineTo(f4, f2);
        }
        if (onNavigationEvent(i, 1)) {
            path2.lineTo(f4, fMin);
            float f18 = fMin * 2.0f;
            path2.arcTo(0.0f, 0.0f, f18, f18, 180.0f, 90.0f, false);
        } else {
            path2.lineTo(f4, f4);
        }
        if (z) {
            int i7 = onWarmupCompleted + 103;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            path2.close();
        }
        return path2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i;
        deprecated_noStore deprecated_nostore = (deprecated_noStore) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        float fFloatValue2 = ((Number) objArr[2]).floatValue();
        float fFloatValue3 = ((Number) objArr[3]).floatValue();
        float fFloatValue4 = ((Number) objArr[4]).floatValue();
        float fFloatValue5 = ((Number) objArr[5]).floatValue();
        float fFloatValue6 = ((Number) objArr[6]).floatValue();
        int iIntValue = ((Number) objArr[7]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[8]).booleanValue();
        int iIntValue2 = ((Number) objArr[9]).intValue();
        Object obj = objArr[10];
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 65;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if ((iIntValue2 & 64) != 0) {
            int i6 = i4 + 73;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            i = 15;
        } else {
            i = iIntValue;
        }
        return deprecated_nostore.onExtraCallbackWithResult(fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, fFloatValue5, fFloatValue6, i, (iIntValue2 & 128) != 0 ? true : zBooleanValue);
    }

    public final Path onExtraCallbackWithResult(float f, float f2, float f3, float f4, float f5, float f6, int i, boolean z) {
        Path path;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        boolean z2;
        float f18;
        float f19;
        float f20;
        int i2 = 2 % 2;
        float fMin = Math.min(f, f2) / 2.0f;
        float fMin2 = Math.min(f3, fMin);
        float fMin3 = Math.min(f4, fMin);
        float fMin4 = Math.min(f5, fMin);
        float fMin5 = Math.min(f6, fMin);
        Path path2 = new Path();
        if (!onNavigationEvent(i, 2)) {
            path2.moveTo(f, 0.0f);
            path = path2;
            f7 = fMin5;
        } else {
            int i3 = onNavigationEvent + 85;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            path2.moveTo(f - fMin3, 0.0f);
            float f21 = fMin3 * 2.0f;
            path = path2;
            f7 = fMin5;
            path2.arcTo(f - f21, 0.0f, f, f21, -90.0f, 90.0f, false);
        }
        if (onNavigationEvent(i, 8)) {
            int i5 = onWarmupCompleted + 49;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                path.lineTo(f, f2 * fMin4);
                float f22 = fMin4 / 1.0f;
                f18 = f - f22;
                f19 = f2 * f22;
                f20 = 2.0f;
            } else {
                path.lineTo(f, f2 - fMin4);
                float f23 = fMin4 * 2.0f;
                f18 = f - f23;
                f19 = f2 - f23;
                f20 = 0.0f;
            }
            path.arcTo(f18, f19, f, f2, f20, 90.0f, false);
            f8 = 1.0f;
        } else {
            f8 = 1.0f;
            path.lineTo(f, f2);
        }
        if (onNavigationEvent(i, 4)) {
            int i6 = onNavigationEvent + 117;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                float f24 = f7;
                path.lineTo(f24, f2);
                f13 = f24 + f8;
                f14 = 2.0f;
                f15 = f2 / f13;
                f16 = 90.0f;
                f17 = 90.0f;
                z2 = true;
            } else {
                float f25 = f7;
                path.lineTo(f25, f2);
                f13 = f25 * 2.0f;
                f14 = 0.0f;
                f15 = f2 - f13;
                f16 = 90.0f;
                f17 = 90.0f;
                z2 = false;
            }
            path.arcTo(f14, f15, f13, f2, f16, f17, z2);
            f9 = 0.0f;
        } else {
            f9 = 0.0f;
            path.lineTo(0.0f, f2);
        }
        if (onNavigationEvent(i, 1)) {
            int i7 = onNavigationEvent + 9;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                path.lineTo(f8, fMin2);
                f10 = fMin2 + 2.0f;
                f11 = 1.0f;
                f12 = 2.0f;
            } else {
                path.lineTo(f9, fMin2);
                f10 = fMin2 * 2.0f;
                f11 = 0.0f;
                f12 = 0.0f;
            }
            path.arcTo(f11, f12, f10, f10, 180.0f, 90.0f, false);
        } else {
            path.lineTo(f9, f9);
        }
        if (z) {
            int i8 = onWarmupCompleted + 103;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0) {
                path.close();
                throw null;
            }
            path.close();
        }
        return path;
    }

    public static /* synthetic */ Path IAuthTabCallback(deprecated_noStore deprecated_nostore, float f, float f2, float f3, float f4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 25;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 4) != 0) {
            int i6 = i3 + 125;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                deprecated_mustRevalidate.onNavigationEvent();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            f3 = deprecated_mustRevalidate.onNavigationEvent();
        }
        if ((i & 8) != 0) {
            f4 = deprecated_mustRevalidate.IAuthTabCallback();
            int i7 = onNavigationEvent + 1;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        return deprecated_nostore.IAuthTabCallback(f, f2, f3, f4);
    }

    public final Path IAuthTabCallback(float f, float f2, float f3, float f4) {
        int i = 2 % 2;
        Path path = new Path();
        float fMin = Math.min(f, f2);
        float f5 = f3 * fMin;
        float f6 = f4 * fMin;
        path.moveTo(0.0f, f6);
        path.cubicTo(0.0f, f5, f5, 0.0f, f6, 0.0f);
        float f7 = f - f6;
        path.lineTo(f7, 0.0f);
        float f8 = f - f5;
        path.cubicTo(f8, 0.0f, f, f5, f, f6);
        float f9 = f2 - f6;
        path.lineTo(f, f9);
        float f10 = f2 - f5;
        path.cubicTo(f, f10, f8, f2, f7, f2);
        path.lineTo(f6, f2);
        path.cubicTo(f5, f2, 0.0f, f10, 0.0f, f9);
        path.lineTo(0.0f, f6);
        path.close();
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return path;
    }

    public final Path onNavigationEvent(@NotNull View view, float f, float f2, float f3, float f4) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Path pathOnExtraCallback = onExtraCallback(view.getWidth(), view.getHeight(), f, f2, f3, f4);
        int i4 = onWarmupCompleted + 17;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return pathOnExtraCallback;
        }
        throw null;
    }

    public final Path onExtraCallback(float f, float f2, float f3, float f4, float f5, float f6) {
        int i = 2 % 2;
        RectF rectF = new RectF(0.0f, 0.0f, f, f2);
        float[] fArr = {f3, f3, f4, f4, f5, f5, f6, f6};
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        int i2 = onWarmupCompleted + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 32 / 0;
        }
        return path;
    }

    public final Path onExtraCallback(float f, float f2, float f3, float f4, float f5, float f6, int i) {
        float fFloatValue;
        float f7;
        float f8;
        float f9;
        int i2 = 2 % 2;
        float fCoerceAtLeast = RangesKt.coerceAtLeast(f, 0.0f);
        float fCoerceAtLeast2 = RangesKt.coerceAtLeast(f2, 0.0f);
        if (fCoerceAtLeast > 0.0f) {
            int i3 = onWarmupCompleted + 59;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (fCoerceAtLeast2 > 0.0f) {
                Float fValueOf = Float.valueOf(Math.min(fCoerceAtLeast, fCoerceAtLeast2) / 2.0f);
                Object obj = null;
                if (fValueOf.floatValue() <= 0.0f) {
                    fValueOf = null;
                }
                if (fValueOf != null) {
                    int i5 = onWarmupCompleted + 125;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        fValueOf.floatValue();
                        obj.hashCode();
                        throw null;
                    }
                    fFloatValue = fValueOf.floatValue();
                } else {
                    fFloatValue = 1.0f;
                }
                if (onNavigationEvent(i, 1)) {
                    int i6 = onWarmupCompleted + 55;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0) {
                        throw null;
                    }
                    f7 = f3;
                } else {
                    f7 = 0.0f;
                }
                if (onNavigationEvent(i, 2)) {
                    int i7 = onNavigationEvent + 77;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    f8 = f4;
                } else {
                    f8 = 0.0f;
                }
                if (onNavigationEvent(i, 8)) {
                    int i9 = onNavigationEvent + 23;
                    int i10 = i9 % 128;
                    onWarmupCompleted = i10;
                    int i11 = i9 % 2;
                    int i12 = i10 + 45;
                    onNavigationEvent = i12 % 128;
                    int i13 = i12 % 2;
                    f9 = f5;
                } else {
                    f9 = 0.0f;
                }
                return CoreTextFieldKtExternalSyntheticLambda3.onNavigationEvent(RoundedPolygonKt.onExtraCallback(new float[]{0.0f, 0.0f, fCoerceAtLeast, 0.0f, fCoerceAtLeast, fCoerceAtLeast2, 0.0f, fCoerceAtLeast2}, (CoreTextFieldKtExternalSyntheticLambda0) null, CollectionsKt.listOf(new CoreTextFieldKtExternalSyntheticLambda0[]{new CoreTextFieldKtExternalSyntheticLambda0(Math.min(f7, fFloatValue), 0.6f), new CoreTextFieldKtExternalSyntheticLambda0(Math.min(f8, fFloatValue), 0.6f), new CoreTextFieldKtExternalSyntheticLambda0(Math.min(f9, fFloatValue), 0.6f), new CoreTextFieldKtExternalSyntheticLambda0(Math.min(onNavigationEvent(i, 4) ? f6 : 0.0f, fFloatValue), 0.6f)}), 0.0f, 0.0f, 26, (Object) null), (Path) null, 1, (Object) null);
            }
        }
        return new Path();
    }

    public static /* synthetic */ Path onNavigationEvent(deprecated_noStore deprecated_nostore, float f, float f2, float f3, float f4, float f5, float f6, int i, boolean z, int i2, Object obj) {
        Object[] objArr = {deprecated_nostore, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6), Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), obj};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Path) onExtraCallbackWithResult(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, 122333280, objArr, -122333278, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2);
    }

    public static /* synthetic */ Path IAuthTabCallback(deprecated_noStore deprecated_nostore, float f, float f2, float f3, int i, boolean z, int i2, Object obj) {
        Object[] objArr = {deprecated_nostore, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), obj};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Path) onExtraCallbackWithResult(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, 1044235458, objArr, -1044235458, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2);
    }

    public static /* synthetic */ Path onNavigationEvent(deprecated_noStore deprecated_nostore, View view, float f, float f2, float f3, float f4, int i, boolean z, int i2, Object obj) {
        Object[] objArr = {deprecated_nostore, view, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), obj};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Path) onExtraCallbackWithResult(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, -958276853, objArr, 958276854, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2);
    }

    public static /* synthetic */ Path onExtraCallback(deprecated_noStore deprecated_nostore, float f, float f2, float f3, float f4, float f5, float f6, int i, int i2, Object obj) {
        Object[] objArr = {deprecated_nostore, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6), Integer.valueOf(i), Integer.valueOf(i2), obj};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Path) onExtraCallbackWithResult(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback, -740661148, objArr, 740661151, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), iOnExtraCallback2);
    }
}
