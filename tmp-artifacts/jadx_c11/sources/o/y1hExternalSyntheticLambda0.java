package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.Window;
import androidx.compose.material.RippleConfiguration;
import androidx.compose.material.RippleKt;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tds.compose.component.theme.LegacyThemeKt$;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.GraphicDeviceInfo;
import o.decrementVideoUsage;
import o.getSpecialFeatureOptInStatus;
import o.isInVideoUsage;
import o.setVisitUrl;
import o.y1hExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class y1hExternalSyntheticLambda0 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static final class onExtraCallbackWithResult implements decrementVideoUsage {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        public void dispose() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 93;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 61 / 0;
            }
        }
    }

    public static final /* synthetic */ class onNavigationEvent {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[getSpecialFeatureOptInStatus.values().length];
            try {
                iArr[getSpecialFeatureOptInStatus.Light.ordinal()] = 1;
                int i = onExtraCallback + 101;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getSpecialFeatureOptInStatus.Dark.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
            int i4 = IAuthTabCallback + 109;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    private static final Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 105;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 111;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 37;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 7;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getBacktraceNote getbacktracenote, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 123;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getbacktracenote, function2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 39;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit IAuthTabCallback(getSpecialFeatureOptInStatus getspecialfeatureoptinstatus, boolean z, boolean z2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {getspecialfeatureoptinstatus, Boolean.valueOf(z), Boolean.valueOf(z2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))};
        if (i5 != 0) {
            onWarmupCompleted(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), objArr, setVisitUrl.onExtraCallbackWithResult(), 174944705, -174944702);
        } else {
            onWarmupCompleted(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), objArr, setVisitUrl.onExtraCallbackWithResult(), 174944705, -174944702);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 25;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(populateExifData populateexifdata, long j, float f, setTargetFrameRate settargetframerate, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 33;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            onExtraCallback(populateexifdata, j, f, settargetframerate, function2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(populateexifdata, j, f, settargetframerate, function2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onNavigationEvent + 85;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        Function2 function2 = (Function2) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(getbacktracenote, function2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        onNavigationEvent(getbacktracenote, function2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getSpecialFeatureOptInStatus getspecialfeatureoptinstatus, boolean z, boolean z2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 107;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getspecialfeatureoptinstatus, z, z2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 121;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    private static final Unit onExtraCallback(getSpecialFeatureOptInStatus getspecialfeatureoptinstatus, boolean z, boolean z2, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 81;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onWarmupCompleted(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{getspecialfeatureoptinstatus, Boolean.valueOf(z), Boolean.valueOf(z2), function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)}, setVisitUrl.onExtraCallbackWithResult(), -1406912549, 1406912554);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 111;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(populateExifData populateexifdata, long j, float f, setTargetFrameRate settargetframerate, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 87;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            onNavigationEvent(populateexifdata, j, f, settargetframerate, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            onNavigationEvent(populateexifdata, j, f, settargetframerate, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ decrementVideoUsage onExtraCallback(Activity activity, boolean z, getSpecialFeatureOptInStatus getspecialfeatureoptinstatus, boolean z2, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        decrementVideoUsage decrementvideousageOnExtraCallbackWithResult = onExtraCallbackWithResult(activity, z, getspecialfeatureoptinstatus, z2, isinvideousage);
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        int i5 = onNavigationEvent + 87;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return decrementvideousageOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        float fFloatValue = ((Number) objArr[1]).floatValue();
        Function2 function2 = (Function2) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(jLongValue, fFloatValue, function2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onExtraCallback + 51;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 25;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 73;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = (getSpecialFeatureOptInStatus) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        Function2 function2 = (Function2) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue3 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(getspecialfeatureoptinstatus, zBooleanValue, zBooleanValue2, function2, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(getspecialfeatureoptinstatus, zBooleanValue, zBooleanValue2, function2, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        int i3 = onExtraCallback + 61;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(long j, float f, setTargetFrameRate settargetframerate, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 51;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(j, f, settargetframerate, function2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallback + 21;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i)) | i9 | (~(i8 | i));
        int i11 = ~i;
        int i12 = (~(i11 | i8 | i6)) | (~(i7 | i11 | i5));
        int i13 = i6 + i5 + i3 + ((-195996979) * i2) + ((-904719387) * i4);
        int i14 = i13 * i13;
        int i15 = (i6 * 1590984816) + 1398186415 + (i5 * 1590984816) + (i10 * 737) + (i9 * 737) + (i12 * 737) + (1590985553 * i3) + ((-1025631779) * i2) + (1121679989 * i4) + (i14 * 622657536);
        int i16 = (i6 * 1886715248) + 940376064 + (1886715248 * i5) + (i10 * (-42925423)) + (i9 * (-42925423)) + ((-42925423) * i12) + (1843789824 * i3) + ((-1389494272) * i2) + (1623064576 * i4) + (1510801408 * i14) + (i15 * i15 * (-1928134656));
        if (i16 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i16 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i16 == 3) {
            return IAuthTabCallback(objArr);
        }
        if (i16 == 4) {
            return onExtraCallback(objArr);
        }
        if (i16 == 5) {
            return onWarmupCompleted(objArr);
        }
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
        final getBacktraceNote<Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteOnExtraCallbackWithResult = (getBacktraceNote) objArr[2];
        final Function2 function2 = (Function2) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int i17 = 2 % 2;
        int i18 = onNavigationEvent + 91;
        onExtraCallback = i18 % 128;
        int i19 = i18 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        if ((iIntValue2 & 1) != 0) {
            zBooleanValue = true;
        }
        if ((iIntValue2 & 2) != 0) {
            int i20 = onNavigationEvent + 87;
            onExtraCallback = i20 % 128;
            int i21 = i20 % 2;
            zBooleanValue2 = false;
        }
        if ((4 & iIntValue2) != 0) {
            int i22 = onNavigationEvent + 111;
            onExtraCallback = i22 % 128;
            int i23 = i22 % 2;
            getbacktracenoteOnExtraCallbackWithResult = y3.onNavigationEvent.onExtraCallbackWithResult();
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i24 = onExtraCallback + 11;
            onNavigationEvent = i24 % 128;
            int i25 = i24 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-108882890, iIntValue, -1, "im.toss.tds.compose.component.theme.NightMode (LegacyTheme.kt:244)");
        }
        int i26 = iIntValue << 3;
        onWarmupCompleted(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{getSpecialFeatureOptInStatus.Dark, Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2), ForwardingCameraControl.onExtraCallback(1771328283, true, new Function2() { // from class: im.toss.tds.compose.component.theme.LegacyThemeKt$$ExternalSyntheticLambda5
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2) {
                int i27 = 2 % 2;
                int i28 = onExtraCallback + 57;
                onNavigationEvent = i28 % 128;
                int i29 = i28 % 2;
                Unit unit = (Unit) y1hExternalSyntheticLambda0.onWarmupCompleted(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{getbacktracenoteOnExtraCallbackWithResult, function2, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, setVisitUrl.onExtraCallbackWithResult(), 1443538575, -1443538571);
                int i30 = onNavigationEvent + 121;
                onExtraCallback = i30 % 128;
                if (i30 % 2 == 0) {
                    return unit;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i26 & 112) | 3078 | (i26 & 896)), 0}, setVisitUrl.onExtraCallbackWithResult(), -1406912549, 1406912554);
        if (!(true ^ CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 47;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 19 / 0;
        }
        int i7 = onNavigationEvent + 75;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitIAuthTabCallback;
    }

    private static final Unit onWarmupCompleted(long j, float f, setTargetFrameRate settargetframerate, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 35;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            onExtraCallback(j, f, settargetframerate, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            onExtraCallback(j, f, settargetframerate, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(570126022);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            int i4 = onExtraCallback + 37;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            int i6 = onExtraCallback + 29;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 43 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(570126022, i2, -1, "im.toss.tds.compose.component.theme.TdsWhiteTheme (LegacyTheme.kt:57)");
                }
                y4.onNavigationEvent(null, null, null, null, function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2 << 12) & 57344, 15);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                y4.onNavigationEvent(null, null, null, null, function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2 << 12) & 57344, 15);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i8 = onExtraCallback + 89;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 4 / 2;
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.theme.LegacyThemeKt$$ExternalSyntheticLambda2
                private static int onExtraCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallback + 51;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    Function2 function22 = function2;
                    if (i12 == 0) {
                        return y1hExternalSyntheticLambda0.onExtraCallbackWithResult(function22, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    Unit unitOnExtraCallbackWithResult = y1hExternalSyntheticLambda0.onExtraCallbackWithResult(function22, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i13 = 44 / 0;
                    return unitOnExtraCallbackWithResult;
                }
            });
        }
    }

    public static final class onWarmupCompleted implements decrementVideoUsage {
        private static int asBinder = 1;
        private static int onTransact;
        final /* synthetic */ boolean IAuthTabCallback;
        final /* synthetic */ boolean onExtraCallback;
        final /* synthetic */ boolean onExtraCallbackWithResult;
        final /* synthetic */ SuspendAnimationKtExternalSyntheticLambda0 onNavigationEvent;
        final /* synthetic */ boolean onWarmupCompleted;

        public onWarmupCompleted(boolean z, SuspendAnimationKtExternalSyntheticLambda0 suspendAnimationKtExternalSyntheticLambda0, boolean z2, boolean z3, boolean z4) {
            this.onExtraCallbackWithResult = z;
            this.onNavigationEvent = suspendAnimationKtExternalSyntheticLambda0;
            this.onExtraCallback = z2;
            this.IAuthTabCallback = z3;
            this.onWarmupCompleted = z4;
        }

        public void dispose() {
            int i = 2 % 2;
            Object obj = null;
            if (this.onExtraCallbackWithResult) {
                int i2 = onTransact + 9;
                asBinder = i2 % 128;
                if (i2 % 2 != 0) {
                    this.onNavigationEvent.onNavigationEvent(this.onExtraCallback);
                } else {
                    this.onNavigationEvent.onNavigationEvent(this.onExtraCallback);
                    throw null;
                }
            }
            if (this.IAuthTabCallback) {
                int i3 = onTransact + 1;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
                SuspendAnimationKtExternalSyntheticLambda0 suspendAnimationKtExternalSyntheticLambda0 = this.onNavigationEvent;
                if (i4 != 0) {
                    suspendAnimationKtExternalSyntheticLambda0.IAuthTabCallback(this.onWarmupCompleted);
                } else {
                    suspendAnimationKtExternalSyntheticLambda0.IAuthTabCallback(this.onWarmupCompleted);
                    obj.hashCode();
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(long j, float f, @Nullable setTargetFrameRate settargetframerate, @NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        long jICustomTabsService;
        int i3;
        float f2;
        int i4;
        boolean z;
        final setTargetFrameRate settargetframerate2;
        final long j2;
        final float f3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        float f4;
        populateExifData populateexifdataOnExtraCallback;
        int i5;
        int i6;
        int i7;
        setTargetFrameRate settargetframerateOnNavigationEvent = settargetframerate;
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1026449375);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                int i9 = onExtraCallback + 123;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                jICustomTabsService = j;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jICustomTabsService)) {
                    i7 = 4;
                }
                i3 = i7 | i;
            } else {
                jICustomTabsService = j;
            }
            i7 = 2;
            i3 = i7 | i;
        } else {
            jICustomTabsService = j;
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                f2 = f;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2)) {
                    int i12 = onNavigationEvent + 27;
                    onExtraCallback = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    int i14 = onExtraCallback + 69;
                    onNavigationEvent = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i15 = 4 / 0;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(settargetframerateOnNavigationEvent)) {
                            int i16 = onExtraCallback + 53;
                            onNavigationEvent = i16 % 128;
                            int i17 = i16 % 2;
                            i6 = 256;
                        } else {
                            i6 = 128;
                        }
                    } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(settargetframerateOnNavigationEvent)) {
                    }
                    i3 |= i6;
                }
            }
            z = true;
            if ((i & 3072) == 0) {
                int i18 = onExtraCallback + 95;
                onNavigationEvent = i18 % 128;
                if (i18 % 2 != 0) {
                    int i19 = 37 / 0;
                    i5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 2048 : 1024;
                } else if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
                }
                i3 |= i5;
            }
            if ((i3 & 1171) == 1170) {
                int i20 = onNavigationEvent + 65;
                onExtraCallback = i20 % 128;
                int i21 = i20 % 2;
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                settargetframerate2 = settargetframerateOnNavigationEvent;
                j2 = jICustomTabsService;
                f3 = f2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    if ((i2 & 1) != 0) {
                        jICustomTabsService = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                        i3 &= -15;
                    }
                    if (i11 != 0) {
                        int i22 = onNavigationEvent + 21;
                        onExtraCallback = i22 % 128;
                        f4 = i22 % 2 == 0 ? 0.0f : 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if ((i2 & 4) != 0) {
                        int i23 = onExtraCallback + 105;
                        onNavigationEvent = i23 % 128;
                        if (i23 % 2 != 0) {
                            settargetframerateOnNavigationEvent = onNavigationEvent();
                            i3 &= 6896;
                        } else {
                            settargetframerateOnNavigationEvent = onNavigationEvent();
                            i3 &= -897;
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 1) != 0) {
                        i3 &= -15;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    f4 = f2;
                }
                setTargetFrameRate settargetframerate3 = settargetframerateOnNavigationEvent;
                long j3 = jICustomTabsService;
                float f5 = f4;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1026449375, i3, -1, "im.toss.tds.compose.component.theme.LegacyTheme (LegacyTheme.kt:68)");
                }
                if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0)) {
                    AppLovinAdRewardListener appLovinAdRewardListener = AppLovinAdRewardListener.onExtraCallbackWithResult;
                    long jOnWarmupCompleted = appLovinAdRewardListener.onWarmupCompleted();
                    long jOnWarmupCompleted2 = appLovinAdRewardListener.onWarmupCompleted();
                    MaxAdPlacerExternalSyntheticLambda2 maxAdPlacerExternalSyntheticLambda2 = MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent;
                    populateexifdataOnExtraCallback = ImageProcessingUtil.IAuthTabCallback(jOnWarmupCompleted, jOnWarmupCompleted2, 0L, 0L, appLovinAdRewardListener.onWarmupCompleted(), appLovinAdRewardListener.onWarmupCompleted(), 0L, maxAdPlacerExternalSyntheticLambda2.onWarmupCompleted().isEngagementSignalsApiAvailable(), 0L, maxAdPlacerExternalSyntheticLambda2.onWarmupCompleted().isEngagementSignalsApiAvailable(), maxAdPlacerExternalSyntheticLambda2.onWarmupCompleted().isEngagementSignalsApiAvailable(), ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{maxAdPlacerExternalSyntheticLambda2.onWarmupCompleted()}, -1572738860, OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue(), 332, (Object) null);
                } else {
                    AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener = AppLovinAdVideoPlaybackListener.onWarmupCompleted;
                    long jOnExtraCallback = appLovinAdVideoPlaybackListener.onExtraCallback();
                    MaxAdPlacerExternalSyntheticLambda2 maxAdPlacerExternalSyntheticLambda22 = MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent;
                    populateexifdataOnExtraCallback = ImageProcessingUtil.onExtraCallback(jOnExtraCallback, maxAdPlacerExternalSyntheticLambda22.onExtraCallbackWithResult().onActivityLayout(), 0L, 0L, appLovinAdVideoPlaybackListener.onExtraCallback(), appLovinAdVideoPlaybackListener.onExtraCallback(), 0L, maxAdPlacerExternalSyntheticLambda22.onExtraCallbackWithResult().isEngagementSignalsApiAvailable(), 0L, maxAdPlacerExternalSyntheticLambda22.onExtraCallbackWithResult().isEngagementSignalsApiAvailable(), maxAdPlacerExternalSyntheticLambda22.onExtraCallbackWithResult().isEngagementSignalsApiAvailable(), maxAdPlacerExternalSyntheticLambda22.onExtraCallbackWithResult().IEngagementSignalsCallbackStub(), 332, (Object) null);
                }
                onNavigationEvent(populateexifdataOnExtraCallback, j3, f5, settargetframerate3, function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 << 3) & 65520, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i24 = onNavigationEvent + 45;
                    onExtraCallback = i24 % 128;
                    int i25 = i24 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                j2 = j3;
                f3 = f5;
                settargetframerate2 = settargetframerate3;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.theme.LegacyThemeKt$$ExternalSyntheticLambda7
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj, Object obj2) {
                        int i26 = 2 % 2;
                        int i27 = onWarmupCompleted + 11;
                        onExtraCallbackWithResult = i27 % 128;
                        if (i27 % 2 != 0) {
                            y1hExternalSyntheticLambda0.onNavigationEvent(j2, f3, settargetframerate2, function2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            throw null;
                        }
                        Unit unitOnNavigationEvent = y1hExternalSyntheticLambda0.onNavigationEvent(j2, f3, settargetframerate2, function2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i28 = onWarmupCompleted + 107;
                        onExtraCallbackWithResult = i28 % 128;
                        if (i28 % 2 != 0) {
                            int i29 = 77 / 0;
                        }
                        return unitOnNavigationEvent;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        int i26 = onExtraCallback + 51;
        onNavigationEvent = i26 % 128;
        int i27 = i26 % 2;
        f2 = f;
        if ((i & 384) == 0) {
        }
        z = true;
        if ((i & 3072) == 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit onExtraCallback(long j, float f, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 63;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if ((i & 3) != 2) {
            int i6 = i4 + 13;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(95879558, i, -1, "im.toss.tds.compose.component.theme.MaterialTdsBasicTheme.<anonymous> (LegacyTheme.kt:112)");
                int i8 = onNavigationEvent + 99;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
            }
            addAppOpenAdapter addappopenadapterOnNavigationEvent = addRewardedAdapter.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 0);
            userError usererror = new userError(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            accessisMonitoringp accessismonitoringpOnWarmupCompleted = PreviewExternalSyntheticLambda3.onWarmupCompleted();
            getHumanReadableName gethumanreadablenameOnWarmupCompleted = getHumanReadableName.Companion.onWarmupCompleted();
            getSurfaceSize getsurfacesizeOnExtraCallbackWithResult = setMaxPreloadedAdCount.Companion.onExtraCallbackWithResult();
            AppLovinPostbackService appLovinPostbackService = AppLovinPostbackService.onExtraCallbackWithResult;
            setPostviewFormatSelector.onExtraCallback(new accessgetCameraFactoryp[]{accessismonitoringpOnWarmupCompleted.onExtraCallback(getHumanReadableName.onNavigationEvent(gethumanreadablenameOnWarmupCompleted, 0L, 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, getsurfacesizeOnExtraCallbackWithResult, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, appLovinPostbackService.onExtraCallback(), 0, 0, (notifySessionStop) null, 15728607, (Object) null)), RippleKt.onExtraCallback().onExtraCallback(new RippleConfiguration(addappopenadapterOnNavigationEvent.onNavigationEvent(), IAuthTabCallback(setByteOrder.onWarmupCompleted(addappopenadapterOnNavigationEvent.onNavigationEvent())), (DefaultConstructorMarker) null)), addRewardedAdapter.onNavigationEvent().onExtraCallback(addappopenadapterOnNavigationEvent), addAdapter.onWarmupCompleted().onExtraCallback(usererror), getPopupTheme.onExtraCallback().onExtraCallback(getSharedInstance.onExtraCallback(false, false, 0L, null, null, null, null, null, 255, null)), convertYUVToRGB.IAuthTabCallback().onExtraCallback(setByteOrder.onNavigationEvent(j)), copyBitmapToByteBuffer.IAuthTabCallback().onExtraCallback(Float.valueOf(f)), oExternalSyntheticLambda1.onExtraCallbackWithResult().onExtraCallback(getHumanReadableName.onNavigationEvent(appLovinPostbackService.getInterfaceDescriptor(), 0L, 0L, GraphicDeviceInfo.Companion.IAuthTabCallback(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777211, (Object) null))}, function2, cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallback + 99;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i12 = onExtraCallback + 73;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@NotNull final populateExifData populateexifdata, long j, float f, @Nullable setTargetFrameRate settargetframerate, @NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        long jICustomTabsService;
        float f2;
        int i4;
        setTargetFrameRate settargetframerate2;
        final long j2;
        final float f3;
        final setTargetFrameRate settargetframerate3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        final float f4;
        setTargetFrameRate settargetframerateOnNavigationEvent;
        final long j3;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(populateexifdata, "");
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-98758950);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(populateexifdata)) {
                i7 = 4;
            } else {
                int i9 = onNavigationEvent + 93;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 4 % 2;
                }
                i7 = 2;
            }
            i3 = i7 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i11 = onExtraCallback + 65;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            jICustomTabsService = j;
            i3 |= ((i2 & 2) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jICustomTabsService)) ? 32 : 16;
        } else {
            jICustomTabsService = j;
        }
        int i13 = i2 & 4;
        if (i13 == 0) {
            if ((i & 384) == 0) {
                f2 = f;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2)) {
                    int i14 = onExtraCallback + 55;
                    onNavigationEvent = i14 % 128;
                    i4 = i14 % 2 != 0 ? 9918 : 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    int i15 = onExtraCallback + 19;
                    onNavigationEvent = i15 % 128;
                    int i16 = i15 % 2;
                    settargetframerate2 = settargetframerate;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(settargetframerate2)) {
                        int i17 = onNavigationEvent + 1;
                        onExtraCallback = i17 % 128;
                        int i18 = i17 % 2;
                        i6 = 2048;
                    }
                    i3 |= i6;
                } else {
                    settargetframerate2 = settargetframerate;
                }
                int i19 = onExtraCallback + 21;
                onNavigationEvent = i19 % 128;
                int i20 = i19 % 2;
                i6 = 1024;
                i3 |= i6;
            } else {
                settargetframerate2 = settargetframerate;
            }
            if ((i & 24576) == 0) {
                int i21 = onNavigationEvent + 29;
                onExtraCallback = i21 % 128;
                if (i21 % 2 == 0) {
                    int i22 = 94 / 0;
                    i5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 16384 : 8192;
                } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
                }
                i3 |= i5;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) != 9362, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                j2 = jICustomTabsService;
                f3 = f2;
                settargetframerate3 = settargetframerate2;
            } else {
                int i23 = onNavigationEvent + 45;
                onExtraCallback = i23 % 128;
                if (i23 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((i & 1) != 0 && !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                    }
                    f4 = f2;
                    settargetframerateOnNavigationEvent = settargetframerate2;
                    j3 = jICustomTabsService;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-98758950, i3, -1, "im.toss.tds.compose.component.theme.MaterialTdsBasicTheme (LegacyTheme.kt:107)");
                    }
                    Logger.IAuthTabCallback(populateexifdata, settargetframerateOnNavigationEvent, (MetadataImageReaderExternalSyntheticLambda1) null, ForwardingCameraControl.onExtraCallback(95879558, true, new Function2() { // from class: im.toss.tds.compose.component.theme.LegacyThemeKt$$ExternalSyntheticLambda0
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj, Object obj2) {
                            int i24 = 2 % 2;
                            int i25 = onWarmupCompleted + 85;
                            onExtraCallbackWithResult = i25 % 128;
                            int i26 = i25 % 2;
                            long j4 = j3;
                            float f5 = f4;
                            int iIntValue = ((Integer) obj2).intValue();
                            Object[] objArr = {Long.valueOf(j4), Float.valueOf(f5), function2, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                            Unit unit = (Unit) y1hExternalSyntheticLambda0.onWarmupCompleted(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), objArr, setVisitUrl.onExtraCallbackWithResult(), -1868818720, 1868818721);
                            int i27 = onWarmupCompleted + 99;
                            onExtraCallbackWithResult = i27 % 128;
                            int i28 = i27 % 2;
                            return unit;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 & 14) | 3072 | ((i3 >> 6) & 112), 4);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i24 = onExtraCallback + 113;
                        onNavigationEvent = i24 % 128;
                        int i25 = i24 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    j2 = j3;
                    f3 = f4;
                    settargetframerate3 = settargetframerateOnNavigationEvent;
                }
                if ((i2 & 2) != 0) {
                    jICustomTabsService = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                    i3 &= -113;
                }
                float f5 = i13 != 0 ? 1.0f : f2;
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    f4 = f5;
                    j3 = jICustomTabsService;
                    settargetframerateOnNavigationEvent = onNavigationEvent();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    Logger.IAuthTabCallback(populateexifdata, settargetframerateOnNavigationEvent, (MetadataImageReaderExternalSyntheticLambda1) null, ForwardingCameraControl.onExtraCallback(95879558, true, new Function2() { // from class: im.toss.tds.compose.component.theme.LegacyThemeKt$$ExternalSyntheticLambda0
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj, Object obj2) {
                            int i242 = 2 % 2;
                            int i252 = onWarmupCompleted + 85;
                            onExtraCallbackWithResult = i252 % 128;
                            int i26 = i252 % 2;
                            long j4 = j3;
                            float f52 = f4;
                            int iIntValue = ((Integer) obj2).intValue();
                            Object[] objArr = {Long.valueOf(j4), Float.valueOf(f52), function2, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                            Unit unit = (Unit) y1hExternalSyntheticLambda0.onWarmupCompleted(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), objArr, setVisitUrl.onExtraCallbackWithResult(), -1868818720, 1868818721);
                            int i27 = onWarmupCompleted + 99;
                            onExtraCallbackWithResult = i27 % 128;
                            int i28 = i27 % 2;
                            return unit;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 & 14) | 3072 | ((i3 >> 6) & 112), 4);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    j2 = j3;
                    f3 = f4;
                    settargetframerate3 = settargetframerateOnNavigationEvent;
                } else {
                    f2 = f5;
                    f4 = f2;
                    settargetframerateOnNavigationEvent = settargetframerate2;
                    j3 = jICustomTabsService;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    Logger.IAuthTabCallback(populateexifdata, settargetframerateOnNavigationEvent, (MetadataImageReaderExternalSyntheticLambda1) null, ForwardingCameraControl.onExtraCallback(95879558, true, new Function2() { // from class: im.toss.tds.compose.component.theme.LegacyThemeKt$$ExternalSyntheticLambda0
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj, Object obj2) {
                            int i242 = 2 % 2;
                            int i252 = onWarmupCompleted + 85;
                            onExtraCallbackWithResult = i252 % 128;
                            int i26 = i252 % 2;
                            long j4 = j3;
                            float f52 = f4;
                            int iIntValue = ((Integer) obj2).intValue();
                            Object[] objArr = {Long.valueOf(j4), Float.valueOf(f52), function2, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                            Unit unit = (Unit) y1hExternalSyntheticLambda0.onWarmupCompleted(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), objArr, setVisitUrl.onExtraCallbackWithResult(), -1868818720, 1868818721);
                            int i27 = onWarmupCompleted + 99;
                            onExtraCallbackWithResult = i27 % 128;
                            int i28 = i27 % 2;
                            return unit;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 & 14) | 3072 | ((i3 >> 6) & 112), 4);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    j2 = j3;
                    f3 = f4;
                    settargetframerate3 = settargetframerateOnNavigationEvent;
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.theme.LegacyThemeKt$$ExternalSyntheticLambda1
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2) {
                        int i26 = 2 % 2;
                        int i27 = onExtraCallback + 39;
                        onNavigationEvent = i27 % 128;
                        int i28 = i27 % 2;
                        Unit unitIAuthTabCallback = y1hExternalSyntheticLambda0.IAuthTabCallback(populateexifdata, j2, f3, settargetframerate3, function2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i29 = onExtraCallback + 23;
                        onNavigationEvent = i29 % 128;
                        int i30 = i29 % 2;
                        return unitIAuthTabCallback;
                    }
                });
                return;
            }
            return;
        }
        int i26 = onNavigationEvent + 95;
        onExtraCallback = i26 % 128;
        int i27 = i26 % 2;
        i3 |= 384;
        f2 = f;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) != 9362, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final setTargetFrameRate onNavigationEvent() {
        int i = 2 % 2;
        getSurfaceSize getsurfacesizeOnExtraCallbackWithResult = setMaxPreloadedAdCount.Companion.onExtraCallbackWithResult();
        GraphicDeviceInfo.IAuthTabCallback iAuthTabCallback = GraphicDeviceInfo.Companion;
        setTargetFrameRate settargetframerate = new setTargetFrameRate(getsurfacesizeOnExtraCallbackWithResult, new getHumanReadableName(0L, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(96), iAuthTabCallback.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(0), (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777081, (DefaultConstructorMarker) null), new getHumanReadableName(0L, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(60), iAuthTabCallback.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(0), (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777081, (DefaultConstructorMarker) null), new getHumanReadableName(0L, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(48), iAuthTabCallback.onWarmupCompleted(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(0), (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777081, (DefaultConstructorMarker) null), new getHumanReadableName(0L, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(34), iAuthTabCallback.onWarmupCompleted(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(0), (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777081, (DefaultConstructorMarker) null), new getHumanReadableName(0L, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(24), iAuthTabCallback.onWarmupCompleted(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(0), (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777081, (DefaultConstructorMarker) null), new getHumanReadableName(0L, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(20), iAuthTabCallback.onNavigationEvent(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(0), (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777081, (DefaultConstructorMarker) null), new getHumanReadableName(0L, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(16), iAuthTabCallback.onWarmupCompleted(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(0), (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777081, (DefaultConstructorMarker) null), new getHumanReadableName(0L, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(14), iAuthTabCallback.onNavigationEvent(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(0), (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777081, (DefaultConstructorMarker) null), new getHumanReadableName(0L, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(16), iAuthTabCallback.onWarmupCompleted(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(0), (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777081, (DefaultConstructorMarker) null), new getHumanReadableName(0L, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(14), iAuthTabCallback.onWarmupCompleted(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(0), (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777081, (DefaultConstructorMarker) null), new getHumanReadableName(0L, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(14), iAuthTabCallback.onNavigationEvent(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(0), (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777081, (DefaultConstructorMarker) null), new getHumanReadableName(0L, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(12), iAuthTabCallback.onWarmupCompleted(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(0), (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777081, (DefaultConstructorMarker) null), new getHumanReadableName(0L, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(10), iAuthTabCallback.onWarmupCompleted(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(0), (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777081, (DefaultConstructorMarker) null));
        int i2 = onExtraCallback + 105;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return settargetframerate;
        }
        throw null;
    }

    private static final RippleAlpha IAuthTabCallback(float f) {
        int i = 2 % 2;
        RippleAlpha rippleAlpha = new RippleAlpha(f, f, f, f);
        int i2 = onExtraCallback + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return rippleAlpha;
        }
        throw null;
    }

    private static final Unit onExtraCallback(getBacktraceNote getbacktracenote, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onNavigationEvent + 83;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1868933847, i, -1, "im.toss.tds.compose.component.theme.DayMode.<anonymous> (LegacyTheme.kt:230)");
            }
            getbacktracenote.invoke(function2, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallback + 117;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 73;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 45 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(getBacktraceNote getbacktracenote, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 107;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0 ? (i & 3) == 2 : (i & 3) == 4) {
            z = false;
        } else {
            int i5 = i3 + 71;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1771328283, i, -1, "im.toss.tds.compose.component.theme.NightMode.<anonymous> (LegacyTheme.kt:249)");
            }
            getbacktracenote.invoke(function2, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws NoWhenBranchMatchedException {
        int i;
        int i2;
        final getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = (getSpecialFeatureOptInStatus) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        final Function2 function2 = (Function2) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        final int iIntValue = ((Number) objArr[5]).intValue();
        final int iIntValue2 = ((Number) objArr[6]).intValue();
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 43;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(getspecialfeatureoptinstatus, "");
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1992757514);
        if ((iIntValue & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getspecialfeatureoptinstatus.ordinal()) ? 4 : 2) | iIntValue;
        } else {
            int i6 = onNavigationEvent + 121;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            i = iIntValue;
        }
        int i8 = iIntValue2 & 2;
        Object obj = null;
        if (i8 != 0) {
            i |= 48;
        } else if ((iIntValue & 48) == 0) {
            int i9 = onExtraCallback + 49;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue);
                throw null;
            }
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ? 32 : 16;
        }
        int i10 = iIntValue2 & 4;
        if (i10 != 0) {
            i |= 384;
        } else if ((iIntValue & 384) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue2) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            int i11 = onExtraCallback + 47;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 2048 : 1024;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i & 1171) != 1170, i & 1)) {
            int i13 = onNavigationEvent + 27;
            onExtraCallback = i13 % 128;
            if (i13 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (i8 != 0) {
                zBooleanValue = true;
            }
            if (i10 != 0) {
                zBooleanValue2 = true;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1992757514, i, -1, "im.toss.tds.compose.component.theme.ProvideThemeMode (LegacyTheme.kt:260)");
            }
            Configuration configuration = (Configuration) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult());
            if ((addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light) != getspecialfeatureoptinstatus) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1201528305);
                onWarmupCompleted(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{getspecialfeatureoptinstatus, Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i & 1022)}, setVisitUrl.onExtraCallbackWithResult(), 174944705, -174944702);
                accessisMonitoringp accessismonitoringpOnExtraCallbackWithResult = AndroidCompositionLocals_androidKt.onExtraCallbackWithResult();
                Configuration configuration2 = new Configuration(configuration);
                int i14 = onNavigationEvent.onNavigationEvent[getspecialfeatureoptinstatus.ordinal()];
                if (i14 == 1) {
                    i2 = 16;
                } else {
                    if (i14 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 32;
                }
                configuration2.uiMode = (configuration2.uiMode & (-49)) | i2;
                setPostviewFormatSelector.onNavigationEvent(accessismonitoringpOnExtraCallbackWithResult.onExtraCallback(configuration2), function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | ((i >> 6) & 112));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1202218303);
                function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i >> 9) & 14));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        final boolean z = zBooleanValue2;
        final boolean z2 = zBooleanValue;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.theme.LegacyThemeKt$$ExternalSyntheticLambda6
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) {
                    int i15 = 2 % 2;
                    int i16 = IAuthTabCallback + 99;
                    onWarmupCompleted = i16 % 128;
                    if (i16 % 2 != 0) {
                        int i17 = 19 / 0;
                        return (Unit) y1hExternalSyntheticLambda0.onWarmupCompleted(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{getspecialfeatureoptinstatus, Boolean.valueOf(z2), Boolean.valueOf(z), function2, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, setVisitUrl.onExtraCallbackWithResult(), -37192523, 37192525);
                    }
                    getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getspecialfeatureoptinstatus;
                    boolean z3 = z2;
                    boolean z4 = z;
                    return (Unit) y1hExternalSyntheticLambda0.onWarmupCompleted(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{getspecialfeatureoptinstatus2, Boolean.valueOf(z3), Boolean.valueOf(z4), function2, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, setVisitUrl.onExtraCallbackWithResult(), -37192523, 37192525);
                }
            });
            int i15 = onExtraCallback + 83;
            onNavigationEvent = i15 % 128;
            int i16 = i15 % 2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i;
        Object obj;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z;
        int i2;
        int i3;
        final getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = (getSpecialFeatureOptInStatus) objArr[0];
        boolean z2 = true;
        final boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        final boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        final int iIntValue = ((Number) objArr[4]).intValue();
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 25;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1678762715);
            if ((iIntValue & 6) != 0) {
                i = iIntValue;
            }
            if ((iIntValue & 48) == 0) {
                int i6 = onNavigationEvent + 89;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 13 / 0;
                    i3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ? 32 : 16;
                } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue)) {
                }
                i |= i3;
            }
            Object obj2 = null;
            if ((iIntValue & 384) == 0) {
                int i8 = onExtraCallback + 99;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue2);
                    obj2.hashCode();
                    throw null;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue2)) {
                    int i9 = onNavigationEvent + 57;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    i2 = 256;
                } else {
                    i2 = 128;
                }
                i |= i2;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i & 147) == 146, i & 1)) {
                obj = null;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1678762715, i, -1, "im.toss.tds.compose.component.theme.ApplyThemeModeEffect (LegacyTheme.kt:290)");
                }
                final Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback((Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback()));
                if (activityIAuthTabCallback != null) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1420598172);
                    Object[] objArr2 = {activityIAuthTabCallback, getspecialfeatureoptinstatus, Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2)};
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(activityIAuthTabCallback);
                    boolean z3 = !((i & 112) != 32);
                    if ((i & 14) == 4) {
                        int i11 = onExtraCallback + 9;
                        onNavigationEvent = i11 % 128;
                        int i12 = i11 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((i & 896) == 256) {
                        int i13 = onNavigationEvent + 105;
                        onExtraCallback = i13 % 128;
                        int i14 = i13 % 2;
                    } else {
                        z2 = false;
                    }
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(z2 | z | z3 | zOnExtraCallback)) {
                        int i15 = onExtraCallback + 7;
                        onNavigationEvent = i15 % 128;
                        if (i15 % 2 != 0) {
                            int i16 = 0 / 0;
                            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.theme.LegacyThemeKt$$ExternalSyntheticLambda3
                                    private static int IAuthTabCallback = 0;
                                    private static int onWarmupCompleted = 1;

                                    public final Object invoke(Object obj3) {
                                        int i17 = 2 % 2;
                                        int i18 = onWarmupCompleted + 57;
                                        IAuthTabCallback = i18 % 128;
                                        int i19 = i18 % 2;
                                        decrementVideoUsage decrementvideousageOnExtraCallback = y1hExternalSyntheticLambda0.onExtraCallback(activityIAuthTabCallback, zBooleanValue, getspecialfeatureoptinstatus, zBooleanValue2, (isInVideoUsage) obj3);
                                        int i20 = IAuthTabCallback + 81;
                                        onWarmupCompleted = i20 % 128;
                                        int i21 = i20 % 2;
                                        return decrementvideousageOnExtraCallback;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                            }
                            isZslDisabledByByUserCaseConfig.onExtraCallbackWithResult(objArr2, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        } else {
                            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            }
                            isZslDisabledByByUserCaseConfig.onExtraCallbackWithResult(objArr2, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1419467075);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i17 = onNavigationEvent + 45;
                    onExtraCallback = i17 % 128;
                    if (i17 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                obj = null;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.theme.LegacyThemeKt$$ExternalSyntheticLambda4
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj3, Object obj4) {
                        int i18 = 2 % 2;
                        int i19 = onWarmupCompleted + 51;
                        onExtraCallbackWithResult = i19 % 128;
                        int i20 = i19 % 2;
                        Unit unitOnExtraCallback = y1hExternalSyntheticLambda0.onExtraCallback(getspecialfeatureoptinstatus, zBooleanValue, zBooleanValue2, iIntValue, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i21 = onWarmupCompleted + 101;
                        onExtraCallbackWithResult = i21 % 128;
                        if (i21 % 2 == 0) {
                            return unitOnExtraCallback;
                        }
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                });
            }
            return obj;
        }
        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1678762715);
        i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getspecialfeatureoptinstatus.ordinal()) ? 4 : 2) | iIntValue;
        if ((iIntValue & 48) == 0) {
        }
        Object obj22 = null;
        if ((iIntValue & 384) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i & 147) == 146, i & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        return obj;
    }

    private static final SuspendAnimationKtExternalSyntheticLambda0 onExtraCallbackWithResult(Window window) {
        SuspendAnimationKtExternalSyntheticLambda0 suspendAnimationKtExternalSyntheticLambda0OnExtraCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            suspendAnimationKtExternalSyntheticLambda0OnExtraCallback = RepeatableSpec.onExtraCallback(window, window.getDecorView());
            Intrinsics.checkNotNullExpressionValue(suspendAnimationKtExternalSyntheticLambda0OnExtraCallback, "");
            int i3 = 70 / 0;
        } else {
            suspendAnimationKtExternalSyntheticLambda0OnExtraCallback = RepeatableSpec.onExtraCallback(window, window.getDecorView());
            Intrinsics.checkNotNullExpressionValue(suspendAnimationKtExternalSyntheticLambda0OnExtraCallback, "");
        }
        int i4 = onExtraCallback + 33;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return suspendAnimationKtExternalSyntheticLambda0OnExtraCallback;
    }

    private static final void onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 117;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1607059137);
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i5 = onNavigationEvent + 99;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1607059137, i, -1, "im.toss.tds.compose.component.theme.PreviewTdsWhiteTheme (LegacyTheme.kt:327)");
            }
            IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) y3.onNavigationEvent.onWarmupCompleted(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new LegacyThemeKt$.ExternalSyntheticLambda8(i));
            int i7 = onExtraCallback + 83;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private static final decrementVideoUsage onExtraCallbackWithResult(Activity activity, boolean z, getSpecialFeatureOptInStatus getspecialfeatureoptinstatus, boolean z2, isInVideoUsage isinvideousage) {
        SuspendAnimationKtExternalSyntheticLambda0 suspendAnimationKtExternalSyntheticLambda0OnExtraCallbackWithResult;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        Window window = activity.getWindow();
        if (window != null) {
            int i2 = onNavigationEvent + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            suspendAnimationKtExternalSyntheticLambda0OnExtraCallbackWithResult = onExtraCallbackWithResult(window);
            int i4 = onNavigationEvent + 35;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            suspendAnimationKtExternalSyntheticLambda0OnExtraCallbackWithResult = null;
        }
        SuspendAnimationKtExternalSyntheticLambda0 suspendAnimationKtExternalSyntheticLambda0 = suspendAnimationKtExternalSyntheticLambda0OnExtraCallbackWithResult;
        if (suspendAnimationKtExternalSyntheticLambda0 == null) {
            return new onExtraCallbackWithResult();
        }
        boolean zIAuthTabCallback = suspendAnimationKtExternalSyntheticLambda0.IAuthTabCallback();
        boolean zOnWarmupCompleted = suspendAnimationKtExternalSyntheticLambda0.onWarmupCompleted();
        if (z) {
            suspendAnimationKtExternalSyntheticLambda0.onNavigationEvent(!setDoNotSell.onExtraCallbackWithResult(getspecialfeatureoptinstatus));
        }
        if (z2) {
            suspendAnimationKtExternalSyntheticLambda0.IAuthTabCallback(!setDoNotSell.onExtraCallbackWithResult(getspecialfeatureoptinstatus));
        }
        return new onWarmupCompleted(z, suspendAnimationKtExternalSyntheticLambda0, zIAuthTabCallback, z2, zOnWarmupCompleted);
    }

    public static /* synthetic */ Unit onNavigationEvent(getSpecialFeatureOptInStatus getspecialfeatureoptinstatus, boolean z, boolean z2, Function2 function2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {getspecialfeatureoptinstatus, Boolean.valueOf(z), Boolean.valueOf(z2), function2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onWarmupCompleted(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), objArr, setVisitUrl.onExtraCallbackWithResult(), -37192523, 37192525);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), objArr, setVisitUrl.onExtraCallbackWithResult(), 1443538575, -1443538571);
    }

    public static /* synthetic */ Unit onNavigationEvent(long j, float f, Function2 function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {Long.valueOf(j), Float.valueOf(f), function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), objArr, setVisitUrl.onExtraCallbackWithResult(), -1868818720, 1868818721);
    }

    private static final void onExtraCallback(getSpecialFeatureOptInStatus getspecialfeatureoptinstatus, boolean z, boolean z2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getspecialfeatureoptinstatus, Boolean.valueOf(z), Boolean.valueOf(z2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        onWarmupCompleted(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), objArr, setVisitUrl.onExtraCallbackWithResult(), 174944705, -174944702);
    }

    public static final void onExtraCallback(boolean z, boolean z2, @Nullable getBacktraceNote<? super Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @NotNull Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {Boolean.valueOf(z), Boolean.valueOf(z2), getbacktracenote, function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        onWarmupCompleted(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), objArr, setVisitUrl.onExtraCallbackWithResult(), -707861512, 707861512);
    }

    public static final void IAuthTabCallback(@NotNull getSpecialFeatureOptInStatus getspecialfeatureoptinstatus, boolean z, boolean z2, @NotNull Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {getspecialfeatureoptinstatus, Boolean.valueOf(z), Boolean.valueOf(z2), function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        onWarmupCompleted(setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), objArr, setVisitUrl.onExtraCallbackWithResult(), -1406912549, 1406912554);
    }
}
