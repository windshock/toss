package o;

import im.toss.tds.compose.R;
import java.text.MessageFormat;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.r8lambdaok43d0GdMaX0ONdKhbvSy8jUmDQ;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaok43d0GdMaX0ONdKhbvSy8jUmDQ {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, String str2, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(str, r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, str2, useandconfigureprogramwithtexture);
        }
        onWarmupCompleted(str, r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, str2, useandconfigureprogramwithtexture);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, @NotNull final r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        final String strOnExtraCallbackWithResult;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            Intrinsics.checkNotNullParameter(r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, "");
            int i6 = 72 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallbackWithResult + 45;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1373997015, i3, -1, "im.toss.tds.compose.component.compound.progressstepper.v1.progressStepperStepSemantics (ProgressStepperSemantics.kt:18)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1373997015, i3, -1, "im.toss.tds.compose.component.compound.progressstepper.v1.progressStepperStepSemantics (ProgressStepperSemantics.kt:18)");
            }
        } else {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            Intrinsics.checkNotNullParameter(r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, "");
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
        }
        boolean z = true;
        int i8 = i + 1;
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i2, i8);
        String strOnExtraCallbackWithResult2 = onExtraCallbackWithResult(i8, cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (str == null || StringsKt.isBlank(str)) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1706380779);
            strOnExtraCallbackWithResult = onExtraCallbackWithResult(R.string.accessibility_progress_stepper_step, new Object[]{Integer.valueOf(iCoerceAtLeast), strOnExtraCallbackWithResult2}, cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            int i9 = onNavigationEvent + 79;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1706211302);
            strOnExtraCallbackWithResult = onExtraCallbackWithResult(R.string.accessibility_progress_stepper_labeled_step, new Object[]{Integer.valueOf(iCoerceAtLeast), strOnExtraCallbackWithResult2, str}, cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        final String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.accessibility_progress_stepper_state_current, cameraCaptureResultEmptyCameraCaptureResult, 0);
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = getCurrentContentInsetEnd.onExtraCallback(quirksExternalSyntheticBackport0, false, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 3, (Object) null);
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(strOnExtraCallbackWithResult);
        if (((i3 & 7168) ^ 3072) <= 2048 || (!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg.ordinal()))) {
            if ((i3 & 3072) == 2048) {
                int i11 = onNavigationEvent + 51;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
            } else {
                z = false;
            }
        }
        boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(strOnExtraCallback);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnNavigationEvent | z | zOnNavigationEvent2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.progressstepper.v1.ProgressStepperSemanticsKt$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = onExtraCallbackWithResult + 119;
                    onNavigationEvent = i14 % 128;
                    int i15 = i14 % 2;
                    Unit unitOnExtraCallbackWithResult = r8lambdaok43d0GdMaX0ONdKhbvSy8jUmDQ.onExtraCallbackWithResult(strOnExtraCallbackWithResult, r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, strOnExtraCallback, (useAndConfigureProgramWithTexture) obj2);
                    int i16 = onExtraCallbackWithResult + 97;
                    onNavigationEvent = i16 % 128;
                    int i17 = i16 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i13 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i13 % 128;
            int i14 = i13 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i14 == 0) {
                int i15 = 73 / 0;
            }
        }
        return quirksExternalSyntheticBackport0OnWarmupCompleted;
    }

    private static final Unit onWarmupCompleted(String str, r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, String str2, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
        if (r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg == r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg.Active) {
            int i2 = onExtraCallbackWithResult + 19;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                unregisterOutputSurface.onWarmupCompleted(useandconfigureprogramwithtexture, str2);
                throw null;
            }
            unregisterOutputSurface.onWarmupCompleted(useandconfigureprogramwithtexture, str2);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onNavigationEvent + 95;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 96 / 0;
        }
        return unit;
    }

    private static final String onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1589038322);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1589038322, i2, -1, "im.toss.tds.compose.component.compound.progressstepper.v1.progressStepperStepOrderDescription (ProgressStepperSemantics.kt:47)");
        }
        if (i == 1) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1942525891);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            i3 = R.string.accessibility_progress_stepper_step_order_1;
        } else if (i != 2) {
            if (i == 3) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1942521667);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                i3 = R.string.accessibility_progress_stepper_step_order_3;
                i4 = onNavigationEvent + 93;
                onExtraCallbackWithResult = i4 % 128;
            } else if (i != 4) {
                int i6 = onNavigationEvent + 83;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                if (i != 5) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-88436370);
                    String strOnExtraCallbackWithResult = onExtraCallbackWithResult(R.string.accessibility_progress_stepper_step_order_number, new Object[]{Integer.valueOf(i)}, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    return strOnExtraCallbackWithResult;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1942517443);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                i3 = R.string.accessibility_progress_stepper_step_order_5;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1942519555);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                i3 = R.string.accessibility_progress_stepper_step_order_4;
                i4 = onExtraCallbackWithResult + 105;
                onNavigationEvent = i4 % 128;
            }
            int i8 = i4 % 2;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1942523779);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            i3 = R.string.accessibility_progress_stepper_step_order_2;
        }
        String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(i3, cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return strOnExtraCallback;
    }

    private static final String onExtraCallbackWithResult(int i, Object[] objArr, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1958216197, i2, -1, "im.toss.tds.compose.component.compound.progressstepper.v1.icuStringResource (ProgressStepperSemantics.kt:63)");
                int i7 = 69 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1958216197, i2, -1, "im.toss.tds.compose.component.compound.progressstepper.v1.icuStringResource (ProgressStepperSemantics.kt:63)");
            }
        }
        String str = MessageFormat.format(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(i, cameraCaptureResultEmptyCameraCaptureResult, i2 & 14), Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNullExpressionValue(str, "");
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i8 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return str;
    }
}
