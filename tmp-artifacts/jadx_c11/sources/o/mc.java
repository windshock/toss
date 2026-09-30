package o;

import android.content.Context;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.loan.comparison.result.view.LoanComparisonResultWarningNoticeView;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.mExternalSyntheticApiModelOutline1;
import o.mc;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class mc {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final boolean onExtraCallback;
    private final findResAndMsg onExtraCallbackWithResult;
    private final mExternalSyntheticApiModelOutline1.onTransact onNavigationEvent;

    /* JADX WARN: Removed duplicated region for block: B:67:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7;
        int i8;
        int i9 = ~i;
        int i10 = ~i6;
        int i11 = ~(i9 | i10);
        int i12 = ~(i9 | i6);
        int i13 = ~i4;
        int i14 = (~(i10 | i13 | i)) | i12;
        int i15 = (~(i6 | i13)) | (~(i9 | i13));
        int i16 = i + i4 + i5 + (1941422536 * i3) + ((-555707305) * i2);
        int i17 = i16 * i16;
        int i18 = ((i * 487360618) - 1291405921) + (i4 * 487360618) + (i11 * 543) + (i14 * 543) + (i15 * 543) + (487361161 * i5) + ((-1188264952) * i3) + (624576655 * i2) + (i17 * (-25952256));
        int i19 = (i * (-2131549542)) + 177471488 + ((-2131549542) * i4) + (i11 * (-207299225)) + (i14 * (-207299225)) + ((-207299225) * i15) + (1956118528 * i5) + ((-1363148800) * i3) + (2141716480 * i2) + ((-573308928) * i17) + (i18 * i18 * 74186752);
        if (i19 == 1) {
            return onExtraCallback(objArr);
        }
        if (i19 == 2) {
            return onWarmupCompleted(objArr);
        }
        if (i19 != 3) {
            return IAuthTabCallback(objArr);
        }
        final mc mcVar = (mc) objArr[0];
        final mExternalSyntheticLambda8 mexternalsyntheticlambda8 = (mExternalSyntheticLambda8) objArr[1];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[2];
        QuirkSettingsLoader quirkSettingsLoaderAccess100 = (QuirkSettingsLoader) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        final int iIntValue = ((Number) objArr[5]).intValue();
        final int iIntValue2 = ((Number) objArr[6]).intValue();
        int i20 = 2 % 2;
        Intrinsics.checkNotNullParameter(mexternalsyntheticlambda8, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1954825750);
        if ((iIntValue & 6) == 0) {
            int i21 = onWarmupCompleted + 49;
            IAuthTabCallback = i21 % 128;
            int i22 = i21 % 2;
            i7 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(mexternalsyntheticlambda8) ? 4 : 2) | iIntValue;
        } else {
            i7 = iIntValue;
        }
        int i23 = iIntValue2 & 2;
        if (i23 != 0) {
            i7 |= 48;
        } else if ((iIntValue & 48) == 0) {
            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback) ? 32 : 16;
        }
        int i24 = iIntValue2 & 4;
        if (i24 != 0) {
            int i25 = onWarmupCompleted + 79;
            IAuthTabCallback = i25 % 128;
            int i26 = i25 % 2;
            i7 |= 384;
        } else if ((iIntValue & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirkSettingsLoaderAccess100)) {
                int i27 = onWarmupCompleted + 81;
                IAuthTabCallback = i27 % 128;
                int i28 = i27 % 2;
                i8 = 256;
            } else {
                i8 = 128;
            }
            i7 |= i8;
        }
        if ((iIntValue & 3072) == 0) {
            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(mcVar) ? 2048 : 1024;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i7 & 1171) == 1170), i7 & 1)) {
            int i29 = IAuthTabCallback + 125;
            onWarmupCompleted = i29 % 128;
            int i30 = i29 % 2;
            if (i23 != 0) {
                onextracallback = QuirksExternalSyntheticBackport0.Companion;
            }
            if (i24 != 0) {
                quirkSettingsLoaderAccess100 = QuirkSettingsLoader.Companion.access100();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1954825750, i7, -1, "im.toss.tds.compose.component.anim.animatetop.v1.AnimateTopPreset.AnimateText (TitlePreset.kt:362)");
            }
            boolean z = (i7 & 7168) == 2048;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (z) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.anim.animatetop.v1.AnimateTopPreset$$ExternalSyntheticLambda6
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) {
                        int i31 = 2 % 2;
                        int i32 = onNavigationEvent + 45;
                        onExtraCallback = i32 % 128;
                        int i33 = i32 % 2;
                        Unit unitOnNavigationEvent = mc.onNavigationEvent(this.f$0, (useAndConfigureProgramWithTexture) obj);
                        int i34 = onExtraCallback + 103;
                        onNavigationEvent = i34 % 128;
                        if (i34 % 2 != 0) {
                            int i35 = 96 / 0;
                        }
                        return unitOnNavigationEvent;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                mExternalSyntheticLambda7.onWarmupCompleted(440982441, JsParamKeys.onExtraCallbackWithResult(), -440982437, new Object[]{mexternalsyntheticlambda8, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, (Function1) objOnMinimized, 1, (Object) null), 0.0f, 1, (Object) null), quirkSettingsLoaderAccess100, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i7 & 910), 0}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                int i31 = onWarmupCompleted + 15;
                IAuthTabCallback = i31 % 128;
                int i32 = i31 % 2;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                mExternalSyntheticLambda7.onWarmupCompleted(440982441, JsParamKeys.onExtraCallbackWithResult(), -440982437, new Object[]{mexternalsyntheticlambda8, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, (Function1) objOnMinimized, 1, (Object) null), 0.0f, 1, (Object) null), quirkSettingsLoaderAccess100, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i7 & 910), 0}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = onextracallback;
            final QuirkSettingsLoader quirkSettingsLoader = quirkSettingsLoaderAccess100;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.anim.animatetop.v1.AnimateTopPreset$$ExternalSyntheticLambda7
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj, Object obj2) {
                    int i33 = 2 % 2;
                    int i34 = IAuthTabCallback + 13;
                    onExtraCallback = i34 % 128;
                    if (i34 % 2 == 0) {
                        return mc.onWarmupCompleted(this.f$0, mexternalsyntheticlambda8, onextracallback2, quirkSettingsLoader, iIntValue, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    }
                    Unit unitOnWarmupCompleted = mc.onWarmupCompleted(this.f$0, mexternalsyntheticlambda8, onextracallback2, quirkSettingsLoader, iIntValue, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i35 = 9 / 0;
                    return unitOnWarmupCompleted;
                }
            });
        }
        return null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        mc mcVar = (mc) objArr[0];
        hasProvider hasprovider = (hasProvider) objArr[1];
        mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub = (mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub) objArr[2];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[6];
        long jLongValue = ((Number) objArr[7]).longValue();
        long jLongValue2 = ((Number) objArr[8]).longValue();
        long jLongValue3 = ((Number) objArr[9]).longValue();
        float fFloatValue = ((Number) objArr[10]).floatValue();
        bindChildren bindchildren = (bindChildren) objArr[11];
        use useVar = (use) objArr[12];
        long jLongValue4 = ((Number) objArr[13]).longValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[14];
        mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult = (mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult) objArr[15];
        Object obj = objArr[16];
        int iIntValue2 = ((Number) objArr[17]).intValue();
        int iIntValue3 = ((Number) objArr[18]).intValue();
        int iIntValue4 = ((Number) objArr[19]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[20];
        ((Number) objArr[21]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        mcVar.onNavigationEvent(hasprovider, iAuthTabCallbackStub, quirksExternalSyntheticBackport0, iIntValue, zBooleanValue, gethumanreadablename, jLongValue, jLongValue2, jLongValue3, fFloatValue, bindchildren, useVar, jLongValue4, graphicDeviceInfo, onextracallbackwithresult, obj, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue3), iIntValue4);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 73;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(mc mcVar, hasProvider hasprovider, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, bindChildren bindchildren, use useVar, long j4, GraphicDeviceInfo graphicDeviceInfo, mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, Object obj, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int i6 = 2 % 2;
        int i7 = onWarmupCompleted + 91;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        mcVar.onNavigationEvent(hasprovider, iAuthTabCallback, quirksExternalSyntheticBackport0, i, gethumanreadablename, j, j2, j3, f, bindchildren, useVar, j4, graphicDeviceInfo, onextracallbackwithresult, obj, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i3), i4);
        Unit unit = Unit.INSTANCE;
        int i9 = IAuthTabCallback + 109;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(mc mcVar, hasProvider hasprovider, mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, boolean z, getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, bindChildren bindchildren, use useVar, long j4, GraphicDeviceInfo graphicDeviceInfo, mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, Object obj, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int i6 = 2 % 2;
        int i7 = IAuthTabCallback + 27;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        Object[] objArr = {mcVar, hasprovider, iAuthTabCallbackStub, quirksExternalSyntheticBackport0, Integer.valueOf(i), Boolean.valueOf(z), gethumanreadablename, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Float.valueOf(f), bindchildren, useVar, Long.valueOf(j4), graphicDeviceInfo, onextracallbackwithresult, obj, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i5)};
        if (i8 == 0) {
            int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            return (Unit) IAuthTabCallback(26771502, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -26771502, iOnWarmupCompleted2, iOnWarmupCompleted, objArr);
        }
        int iOnWarmupCompleted3 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted4 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        Unit unit = (Unit) IAuthTabCallback(26771502, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -26771502, iOnWarmupCompleted4, iOnWarmupCompleted3, objArr);
        int i9 = 35 / 0;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(mc mcVar, mExternalSyntheticLambda8 mexternalsyntheticlambda8, QuirkSettingsLoader quirkSettingsLoader, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 89;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(mcVar, mexternalsyntheticlambda8, quirkSettingsLoader, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 21;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(mc mcVar, List list, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, int i3, boolean z, getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, bindChildren bindchildren, use useVar, long j4, GraphicDeviceInfo graphicDeviceInfo, mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, Object obj, int i4, int i5, int i6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i7) {
        int i8 = 2 % 2;
        int i9 = IAuthTabCallback + 95;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(mcVar, list, iAuthTabCallback, quirksExternalSyntheticBackport0, i, i2, i3, z, gethumanreadablename, j, j2, j3, f, bindchildren, useVar, j4, graphicDeviceInfo, onextracallbackwithresult, obj, i4, i5, i6, cameraCaptureResultEmptyCameraCaptureResult, i7);
        int i11 = onWarmupCompleted + 35;
        IAuthTabCallback = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 51 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(mc mcVar, hasProvider hasprovider, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, bindChildren bindchildren, use useVar, long j4, GraphicDeviceInfo graphicDeviceInfo, mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, Object obj, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int i6 = 2 % 2;
        int i7 = onWarmupCompleted + 41;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return IAuthTabCallback(mcVar, hasprovider, iAuthTabCallback, quirksExternalSyntheticBackport0, i, gethumanreadablename, j, j2, j3, f, bindchildren, useVar, j4, graphicDeviceInfo, onextracallbackwithresult, obj, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
        }
        IAuthTabCallback(mcVar, hasprovider, iAuthTabCallback, quirksExternalSyntheticBackport0, i, gethumanreadablename, j, j2, j3, f, bindchildren, useVar, j4, graphicDeviceInfo, onextracallbackwithresult, obj, i2, i3, i4, cameraCaptureResultEmptyCameraCaptureResult, i5);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(mc mcVar, mExternalSyntheticLambda8 mexternalsyntheticlambda8, QuirkSettingsLoader quirkSettingsLoader, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 83;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsBinder = asBinder(mcVar, mexternalsyntheticlambda8, quirkSettingsLoader, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 27;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitAsBinder;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(mc mcVar, mExternalSyntheticLambda8 mexternalsyntheticlambda8, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirkSettingsLoader quirkSettingsLoader, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 47;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            Object[] objArr = {mcVar, mexternalsyntheticlambda8, quirksExternalSyntheticBackport0, quirkSettingsLoader, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i)), Integer.valueOf(i2)};
            int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            IAuthTabCallback(-212990389, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 212990392, iOnWarmupCompleted2, iOnWarmupCompleted, objArr);
        } else {
            Object[] objArr2 = {mcVar, mexternalsyntheticlambda8, quirksExternalSyntheticBackport0, quirkSettingsLoader, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
            int iOnWarmupCompleted3 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted4 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            IAuthTabCallback(-212990389, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 212990392, iOnWarmupCompleted4, iOnWarmupCompleted3, objArr2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(mc mcVar, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(mcVar, useandconfigureprogramwithtexture);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(mcVar, useandconfigureprogramwithtexture);
        int i3 = IAuthTabCallback + 99;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        mc mcVar = (mc) objArr[0];
        mExternalSyntheticLambda8 mexternalsyntheticlambda8 = (mExternalSyntheticLambda8) objArr[1];
        QuirkSettingsLoader quirkSettingsLoader = (QuirkSettingsLoader) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(mcVar, mexternalsyntheticlambda8, quirkSettingsLoader, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = IAuthTabCallback + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onWarmupCompleted(mc mcVar, List list, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, int i3, boolean z, getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, bindChildren bindchildren, use useVar, long j4, GraphicDeviceInfo graphicDeviceInfo, mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, Object obj, int i4, int i5, int i6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i7) {
        int i8 = 2 % 2;
        int i9 = IAuthTabCallback + 85;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        mcVar.onExtraCallback((List<hasProvider>) list, iAuthTabCallback, quirksExternalSyntheticBackport0, i, i2, i3, z, gethumanreadablename, j, j2, j3, f, bindchildren, useVar, j4, graphicDeviceInfo, onextracallbackwithresult, obj, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i4 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i5), i6);
        Unit unit = Unit.INSTANCE;
        int i11 = IAuthTabCallback + 9;
        onWarmupCompleted = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 78 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(mc mcVar, mExternalSyntheticLambda8 mexternalsyntheticlambda8, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirkSettingsLoader quirkSettingsLoader, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 55;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(mcVar, mexternalsyntheticlambda8, quirksExternalSyntheticBackport0, quirkSettingsLoader, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallback + 33;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 38 / 0;
        }
        return unitOnNavigationEvent;
    }

    public mc(boolean z, @NotNull mExternalSyntheticApiModelOutline1.onTransact ontransact, @NotNull findResAndMsg findresandmsg) {
        Intrinsics.checkNotNullParameter(ontransact, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        this.onExtraCallback = z;
        this.onNavigationEvent = ontransact;
        this.onExtraCallbackWithResult = findresandmsg;
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @NotNull mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, @Nullable bindChildren bindchildren, @Nullable use useVar, long j4, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, @Nullable Object obj, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3, int i4) {
        int i5;
        Object obj2;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i4 & 4) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i4 & 8) != 0) {
            int i7 = IAuthTabCallback + 95;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            i5 = 0;
        } else {
            i5 = i;
        }
        getHumanReadableName gethumanreadablename2 = (i4 & 16) != 0 ? (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted()) : gethumanreadablename;
        long jOnTransact = (i4 & 32) != 0 ? setByteOrder.Companion.onTransact() : j;
        long jOnNavigationEvent = (i4 & 64) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
        long jOnNavigationEvent2 = (i4 & 128) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j3;
        float fOnExtraCallback = (i4 & 256) != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f;
        bindChildren bindchildren2 = (i4 & 512) != 0 ? null : bindchildren;
        use useVar2 = (i4 & 1024) != 0 ? null : useVar;
        long jOnNavigationEvent3 = (i4 & 2048) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j4;
        GraphicDeviceInfo graphicDeviceInfo2 = (i4 & 4096) != 0 ? null : graphicDeviceInfo;
        mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult2 = (i4 & 8192) != 0 ? mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.TopLeft : onextracallbackwithresult;
        if ((i4 & 16384) != 0) {
            int i9 = onWarmupCompleted + 21;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            obj2 = null;
        } else {
            obj2 = obj;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i11 = onWarmupCompleted + 63;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1175482619, i2, i3, "im.toss.tds.compose.component.anim.animatetop.v1.AnimateTopPreset.To (TitlePreset.kt:63)");
        }
        onNavigationEvent(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), iAuthTabCallback, quirksExternalSyntheticBackport02, i5, gethumanreadablename2, jOnTransact, jOnNavigationEvent, jOnNavigationEvent2, fOnExtraCallback, bindchildren2, useVar2, jOnNavigationEvent3, graphicDeviceInfo2, onextracallbackwithresult2, obj2, cameraCaptureResultEmptyCameraCaptureResult, i2 & 2147483632, i3 & 524286, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ int $initialDelay;
        final /* synthetic */ mExternalSyntheticApiModelOutline1.IAuthTabCallback $motion;
        final /* synthetic */ mExternalSyntheticLambda8 $state;
        final /* synthetic */ hasProvider $text;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(mExternalSyntheticLambda8 mexternalsyntheticlambda8, hasProvider hasprovider, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, int i, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$state = mexternalsyntheticlambda8;
            this.$text = hasprovider;
            this.$motion = iAuthTabCallback;
            this.$initialDelay = i;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 27;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallbackWithResult + 119;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$state, this.$text, this.$motion, this.$initialDelay, access13800Var);
            int i2 = IAuthTabCallback + 105;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 63;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return objIAuthTabCallback;
            }
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 39;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = i2 + 25;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.onNavigationEvent(obj);
            mExternalSyntheticLambda8.onExtraCallbackWithResult(this.$state, this.$text, this.$motion, (mExternalSyntheticApiModelOutline1.onTransact) null, this.$initialDelay, false, (Long) null, 52, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i6 = onExtraCallbackWithResult + 13;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 92 / 0;
            }
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit asBinder(mc mcVar, mExternalSyntheticLambda8 mexternalsyntheticlambda8, QuirkSettingsLoader quirkSettingsLoader, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 119;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        if (i3 % 2 != 0 ? (i & 3) == 2 : (i & 4) == 3) {
            z = false;
        } else {
            int i5 = i4 + 81;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-800156683, i, -1, "im.toss.tds.compose.component.anim.animatetop.v1.AnimateTopPreset.To.<anonymous> (TitlePreset.kt:131)");
                int i6 = IAuthTabCallback + 83;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }
            int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            IAuthTabCallback(-212990389, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 212990392, iOnWarmupCompleted2, iOnWarmupCompleted, new Object[]{mcVar, mexternalsyntheticlambda8, null, quirkSettingsLoader, cameraCaptureResultEmptyCameraCaptureResult, 0, 2});
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallback + 105;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:274:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull final hasProvider hasprovider, @NotNull final mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, @Nullable bindChildren bindchildren, @Nullable use useVar, long j4, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, @Nullable Object obj, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final int i24;
        final getHumanReadableName gethumanreadablename2;
        final long j5;
        final long j6;
        final long j7;
        final float f2;
        final bindChildren bindchildren2;
        use useVar2;
        final long j8;
        final GraphicDeviceInfo graphicDeviceInfo2;
        final mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult2;
        final Object obj2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i25;
        getHumanReadableName gethumanreadablename3;
        long j9;
        long j10;
        long j11;
        float f3;
        bindChildren bindchildren3;
        long j12;
        GraphicDeviceInfo graphicDeviceInfo3;
        mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult3;
        Object obj3;
        int i26;
        getHumanReadableName gethumanreadablename4;
        use useVar3;
        int i27;
        int i28 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(708546581);
        if ((i2 & 6) == 0) {
            i5 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(hasprovider) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback) ? 32 : 16;
        }
        int i29 = i4 & 4;
        if (i29 != 0) {
            i5 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    if ((i4 & 16) == 0) {
                        int i30 = IAuthTabCallback + 109;
                        onWarmupCompleted = i30 % 128;
                        int i31 = i30 % 2;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename)) {
                            i27 = 16384;
                        }
                        i5 |= i27;
                    }
                    i27 = 8192;
                    i5 |= i27;
                }
                i7 = i4 & 32;
                if (i7 != 0) {
                    i5 |= 196608;
                } else {
                    if ((i2 & 196608) == 0) {
                        i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 131072 : 65536;
                    }
                    i8 = i4 & 64;
                    Object obj4 = null;
                    if (i8 == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        int i32 = IAuthTabCallback + 49;
                        onWarmupCompleted = i32 % 128;
                        if (i32 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2);
                            throw null;
                        }
                        i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 1048576 : 524288;
                    }
                    i9 = i4 & 128;
                    if (i9 == 0) {
                        i5 |= 12582912;
                    } else if ((12582912 & i2) == 0) {
                        int i33 = onWarmupCompleted + 73;
                        IAuthTabCallback = i33 % 128;
                        int i34 = i33 % 2;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j3)) {
                            int i35 = onWarmupCompleted + 33;
                            IAuthTabCallback = i35 % 128;
                            int i36 = i35 % 2;
                            i10 = 8388608;
                        } else {
                            i10 = 4194304;
                        }
                        i5 |= i10;
                    }
                    i11 = i4 & 256;
                    if (i11 == 0) {
                        i5 |= 100663296;
                    } else {
                        if ((100663296 & i2) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f)) {
                                int i37 = IAuthTabCallback + 77;
                                onWarmupCompleted = i37 % 128;
                                if (i37 % 2 != 0) {
                                    obj4.hashCode();
                                    throw null;
                                }
                                i12 = 67108864;
                            } else {
                                i12 = 33554432;
                            }
                            i13 = i12 | i5;
                        }
                        i14 = i4 & 512;
                        if (i14 != 0) {
                            i13 |= 805306368;
                        } else {
                            if ((805306368 & i2) == 0) {
                                i13 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(bindchildren) ? 536870912 : 268435456;
                            }
                            i15 = i4 & 1024;
                            if (i15 == 0) {
                                i16 = i3 | 6;
                            } else if ((i3 & 6) == 0) {
                                i16 = i3 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(useVar) ? 4 : 2);
                            } else {
                                i16 = i3;
                            }
                            i17 = i4 & 2048;
                            if (i17 == 0) {
                                i16 |= 48;
                            } else if ((i3 & 48) == 0) {
                                i16 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j4) ? 32 : 16;
                            }
                            int i38 = i16;
                            i18 = i4 & 4096;
                            if (i18 == 0) {
                                i38 |= 384;
                            } else {
                                if ((i3 & 384) == 0) {
                                    i19 = i38 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo) ? 256 : 128);
                                }
                                i20 = i4 & 8192;
                                if (i20 != 0) {
                                    i19 |= 3072;
                                    i22 = i18;
                                    i21 = i20;
                                } else {
                                    i21 = i20;
                                    if ((i3 & 3072) == 0) {
                                        int i39 = IAuthTabCallback + 23;
                                        i22 = i18;
                                        onWarmupCompleted = i39 % 128;
                                        if (i39 % 2 != 0) {
                                            obj4.hashCode();
                                            throw null;
                                        }
                                        i19 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult == null ? -1 : onextracallbackwithresult.ordinal()) ? 2048 : 1024;
                                    } else {
                                        i22 = i18;
                                    }
                                }
                                i23 = i4 & 16384;
                                if (i23 == 0) {
                                    if ((i3 & 24576) == 0) {
                                        i19 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(obj) ? 16384 : 8192;
                                    }
                                    if ((i3 & 196608) == 0) {
                                        i19 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 131072 : 65536;
                                    }
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i13 & 306783379) == 306783378 || (74899 & i19) != 74898, i13 & 1)) {
                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                        i24 = i;
                                        gethumanreadablename2 = gethumanreadablename;
                                        j5 = j;
                                        j6 = j2;
                                        j7 = j3;
                                        f2 = f;
                                        bindchildren2 = bindchildren;
                                        useVar2 = useVar;
                                        j8 = j4;
                                        graphicDeviceInfo2 = graphicDeviceInfo;
                                        onextracallbackwithresult2 = onextracallbackwithresult;
                                        obj2 = obj;
                                    } else {
                                        int i40 = IAuthTabCallback + 69;
                                        onWarmupCompleted = i40 % 128;
                                        if (i40 % 2 != 0) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                            if ((i2 & 1) != 0) {
                                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i29 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                                    int i41 = i6 != 0 ? 0 : i;
                                                    if ((i4 & 16) != 0) {
                                                        gethumanreadablename4 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                                                        i13 &= -57345;
                                                    } else {
                                                        gethumanreadablename4 = gethumanreadablename;
                                                    }
                                                    long jOnTransact = i7 != 0 ? setByteOrder.Companion.onTransact() : j;
                                                    long jOnNavigationEvent = i8 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
                                                    long jOnNavigationEvent2 = i9 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j3;
                                                    float fOnExtraCallback = i11 != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f;
                                                    bindChildren bindchildren4 = i14 != 0 ? null : bindchildren;
                                                    if (i15 != 0) {
                                                        int i42 = IAuthTabCallback + 65;
                                                        onWarmupCompleted = i42 % 128;
                                                        if (i42 % 2 != 0) {
                                                            obj4.hashCode();
                                                            throw null;
                                                        }
                                                        useVar3 = null;
                                                    } else {
                                                        useVar3 = useVar;
                                                    }
                                                    long jOnNavigationEvent3 = i17 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j4;
                                                    GraphicDeviceInfo graphicDeviceInfo4 = i22 != 0 ? null : graphicDeviceInfo;
                                                    mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult4 = i21 != 0 ? mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.TopLeft : onextracallbackwithresult;
                                                    if (i23 != 0) {
                                                        f3 = fOnExtraCallback;
                                                        i26 = i13;
                                                        bindchildren3 = bindchildren4;
                                                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                                        useVar2 = useVar3;
                                                        j12 = jOnNavigationEvent3;
                                                        graphicDeviceInfo3 = graphicDeviceInfo4;
                                                        gethumanreadablename3 = gethumanreadablename4;
                                                        onextracallbackwithresult3 = onextracallbackwithresult4;
                                                        obj3 = null;
                                                        j11 = jOnNavigationEvent2;
                                                        i25 = i41;
                                                    } else {
                                                        obj3 = obj;
                                                        f3 = fOnExtraCallback;
                                                        i26 = i13;
                                                        bindchildren3 = bindchildren4;
                                                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                                        useVar2 = useVar3;
                                                        j12 = jOnNavigationEvent3;
                                                        graphicDeviceInfo3 = graphicDeviceInfo4;
                                                        i25 = i41;
                                                        gethumanreadablename3 = gethumanreadablename4;
                                                        onextracallbackwithresult3 = onextracallbackwithresult4;
                                                        j11 = jOnNavigationEvent2;
                                                    }
                                                    j10 = jOnNavigationEvent;
                                                    j9 = jOnTransact;
                                                } else {
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                                    if ((i4 & 16) != 0) {
                                                        i13 &= -57345;
                                                    }
                                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                                    i25 = i;
                                                    gethumanreadablename3 = gethumanreadablename;
                                                    j9 = j;
                                                    j10 = j2;
                                                    j11 = j3;
                                                    f3 = f;
                                                    bindchildren3 = bindchildren;
                                                    useVar2 = useVar;
                                                    j12 = j4;
                                                    graphicDeviceInfo3 = graphicDeviceInfo;
                                                    onextracallbackwithresult3 = onextracallbackwithresult;
                                                    obj3 = obj;
                                                    i26 = i13;
                                                }
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(708546581, i26, i19, "im.toss.tds.compose.component.anim.animatetop.v1.AnimateTopPreset.To (TitlePreset.kt:100)");
                                                }
                                                int i43 = i19;
                                                int i44 = i43 >> 12;
                                                int i45 = i26 >> 9;
                                                int i46 = i26 >> 6;
                                                int i47 = i43 << 24;
                                                int i48 = i26;
                                                final mExternalSyntheticLambda8 mexternalsyntheticlambda8OnExtraCallback = onExtraCallback(obj3, gethumanreadablename3, j9, j10, j11, createCameraCaptureCallback.onExtraCallback(mExternalSyntheticLambda7.onExtraCallbackWithResult(onextracallbackwithresult3)), f3, bindchildren3, useVar2, j12, graphicDeviceInfo3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i45 & 7168) | (i44 & 14) | (i45 & 112) | (i45 & 896) | (57344 & i45) | (3670016 & i46) | (i46 & 29360128) | (234881024 & i47) | (1879048192 & i47), ((i43 >> 6) & 14) | (i44 & 112), 0);
                                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(mexternalsyntheticlambda8OnExtraCallback);
                                                boolean z = (i48 & 14) == 4;
                                                boolean z2 = (i48 & 112) == 32;
                                                boolean z3 = (i48 & 7168) == 2048;
                                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                                if (!(!(zOnNavigationEvent | z | z2 | z3))) {
                                                    objOnMinimized = new onExtraCallback(mexternalsyntheticlambda8OnExtraCallback, hasprovider, iAuthTabCallback, i25, null);
                                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                                                    isZslDisabledByByUserCaseConfig.IAuthTabCallback(hasprovider, iAuthTabCallback, Integer.valueOf(i25), (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult2, (i48 & 126) | ((i48 >> 3) & 896));
                                                    final QuirkSettingsLoader quirkSettingsLoaderOnNavigationEvent = mExternalSyntheticLambda7.onNavigationEvent(onextracallbackwithresult3);
                                                    mExternalSyntheticLambda7.onWarmupCompleted(-422700871, JsParamKeys.onExtraCallbackWithResult(), 422700876, new Object[]{this.onNavigationEvent, mexternalsyntheticlambda8OnExtraCallback, CollectionsKt.listOf(hasprovider), quirkSettingsLoaderOnNavigationEvent, quirksExternalSyntheticBackport03, ForwardingCameraControl.onExtraCallback(-800156683, true, new Function2() { // from class: im.toss.tds.compose.component.anim.animatetop.v1.AnimateTopPreset$$ExternalSyntheticLambda2
                                                        private static int IAuthTabCallback = 1;
                                                        private static int onExtraCallback;

                                                        public final Object invoke(Object obj5, Object obj6) {
                                                            int i49 = 2 % 2;
                                                            int i50 = onExtraCallback + 35;
                                                            IAuthTabCallback = i50 % 128;
                                                            int i51 = i50 % 2;
                                                            Unit unitOnNavigationEvent = mc.onNavigationEvent(this.f$0, mexternalsyntheticlambda8OnExtraCallback, quirkSettingsLoaderOnNavigationEvent, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                                            int i52 = IAuthTabCallback + 17;
                                                            onExtraCallback = i52 % 128;
                                                            int i53 = i52 % 2;
                                                            return unitOnNavigationEvent;
                                                        }
                                                    }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(((i48 << 6) & 57344) | 196608)}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                                    }
                                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                                    i24 = i25;
                                                    gethumanreadablename2 = gethumanreadablename3;
                                                    j5 = j9;
                                                    j6 = j10;
                                                    j7 = j11;
                                                    f2 = f3;
                                                    bindchildren2 = bindchildren3;
                                                    j8 = j12;
                                                    graphicDeviceInfo2 = graphicDeviceInfo3;
                                                    onextracallbackwithresult2 = onextracallbackwithresult3;
                                                    obj2 = obj3;
                                                } else {
                                                    int i49 = onWarmupCompleted + 119;
                                                    IAuthTabCallback = i49 % 128;
                                                    int i50 = i49 % 2;
                                                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    }
                                                    isZslDisabledByByUserCaseConfig.IAuthTabCallback(hasprovider, iAuthTabCallback, Integer.valueOf(i25), (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult2, (i48 & 126) | ((i48 >> 3) & 896));
                                                    final QuirkSettingsLoader quirkSettingsLoaderOnNavigationEvent2 = mExternalSyntheticLambda7.onNavigationEvent(onextracallbackwithresult3);
                                                    mExternalSyntheticLambda7.onWarmupCompleted(-422700871, JsParamKeys.onExtraCallbackWithResult(), 422700876, new Object[]{this.onNavigationEvent, mexternalsyntheticlambda8OnExtraCallback, CollectionsKt.listOf(hasprovider), quirkSettingsLoaderOnNavigationEvent2, quirksExternalSyntheticBackport03, ForwardingCameraControl.onExtraCallback(-800156683, true, new Function2() { // from class: im.toss.tds.compose.component.anim.animatetop.v1.AnimateTopPreset$$ExternalSyntheticLambda2
                                                        private static int IAuthTabCallback = 1;
                                                        private static int onExtraCallback;

                                                        public final Object invoke(Object obj5, Object obj6) {
                                                            int i492 = 2 % 2;
                                                            int i502 = onExtraCallback + 35;
                                                            IAuthTabCallback = i502 % 128;
                                                            int i51 = i502 % 2;
                                                            Unit unitOnNavigationEvent = mc.onNavigationEvent(this.f$0, mexternalsyntheticlambda8OnExtraCallback, quirkSettingsLoaderOnNavigationEvent2, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                                            int i52 = IAuthTabCallback + 17;
                                                            onExtraCallback = i52 % 128;
                                                            int i53 = i52 % 2;
                                                            return unitOnNavigationEvent;
                                                        }
                                                    }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(((i48 << 6) & 57344) | 196608)}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    }
                                                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                                    i24 = i25;
                                                    gethumanreadablename2 = gethumanreadablename3;
                                                    j5 = j9;
                                                    j6 = j10;
                                                    j7 = j11;
                                                    f2 = f3;
                                                    bindchildren2 = bindchildren3;
                                                    j8 = j12;
                                                    graphicDeviceInfo2 = graphicDeviceInfo3;
                                                    onextracallbackwithresult2 = onextracallbackwithresult3;
                                                    obj2 = obj3;
                                                }
                                            }
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                            if ((i2 & 1) != 0) {
                                            }
                                        }
                                    }
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                        final use useVar4 = useVar2;
                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.anim.animatetop.v1.AnimateTopPreset$$ExternalSyntheticLambda3
                                            private static int IAuthTabCallback = 0;
                                            private static int onExtraCallbackWithResult = 1;

                                            public final Object invoke(Object obj5, Object obj6) {
                                                int i51 = 2 % 2;
                                                int i52 = IAuthTabCallback + 97;
                                                onExtraCallbackWithResult = i52 % 128;
                                                int i53 = i52 % 2;
                                                Unit unitOnNavigationEvent = mc.onNavigationEvent(this.f$0, hasprovider, iAuthTabCallback, quirksExternalSyntheticBackport02, i24, gethumanreadablename2, j5, j6, j7, f2, bindchildren2, useVar4, j8, graphicDeviceInfo2, onextracallbackwithresult2, obj2, i2, i3, i4, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                                int i54 = onExtraCallbackWithResult + 119;
                                                IAuthTabCallback = i54 % 128;
                                                int i55 = i54 % 2;
                                                return unitOnNavigationEvent;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i19 |= 24576;
                                if ((i3 & 196608) == 0) {
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i13 & 306783379) == 306783378 || (74899 & i19) != 74898, i13 & 1)) {
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                }
                            }
                            int i51 = i38;
                            int i52 = IAuthTabCallback + 79;
                            onWarmupCompleted = i52 % 128;
                            int i53 = i52 % 2;
                            i19 = i51;
                            i20 = i4 & 8192;
                            if (i20 != 0) {
                            }
                            i23 = i4 & 16384;
                            if (i23 == 0) {
                            }
                            if ((i3 & 196608) == 0) {
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i13 & 306783379) == 306783378 || (74899 & i19) != 74898, i13 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                            }
                        }
                        i15 = i4 & 1024;
                        if (i15 == 0) {
                        }
                        i17 = i4 & 2048;
                        if (i17 == 0) {
                        }
                        int i382 = i16;
                        i18 = i4 & 4096;
                        if (i18 == 0) {
                        }
                        int i512 = i382;
                        int i522 = IAuthTabCallback + 79;
                        onWarmupCompleted = i522 % 128;
                        int i532 = i522 % 2;
                        i19 = i512;
                        i20 = i4 & 8192;
                        if (i20 != 0) {
                        }
                        i23 = i4 & 16384;
                        if (i23 == 0) {
                        }
                        if ((i3 & 196608) == 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i13 & 306783379) == 306783378 || (74899 & i19) != 74898, i13 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i13 = i5;
                    i14 = i4 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i4 & 1024;
                    if (i15 == 0) {
                    }
                    i17 = i4 & 2048;
                    if (i17 == 0) {
                    }
                    int i3822 = i16;
                    i18 = i4 & 4096;
                    if (i18 == 0) {
                    }
                    int i5122 = i3822;
                    int i5222 = IAuthTabCallback + 79;
                    onWarmupCompleted = i5222 % 128;
                    int i5322 = i5222 % 2;
                    i19 = i5122;
                    i20 = i4 & 8192;
                    if (i20 != 0) {
                    }
                    i23 = i4 & 16384;
                    if (i23 == 0) {
                    }
                    if ((i3 & 196608) == 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i13 & 306783379) == 306783378 || (74899 & i19) != 74898, i13 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i8 = i4 & 64;
                Object obj42 = null;
                if (i8 == 0) {
                }
                i9 = i4 & 128;
                if (i9 == 0) {
                }
                i11 = i4 & 256;
                if (i11 == 0) {
                }
                i13 = i5;
                i14 = i4 & 512;
                if (i14 != 0) {
                }
                i15 = i4 & 1024;
                if (i15 == 0) {
                }
                i17 = i4 & 2048;
                if (i17 == 0) {
                }
                int i38222 = i16;
                i18 = i4 & 4096;
                if (i18 == 0) {
                }
                int i51222 = i38222;
                int i52222 = IAuthTabCallback + 79;
                onWarmupCompleted = i52222 % 128;
                int i53222 = i52222 % 2;
                i19 = i51222;
                i20 = i4 & 8192;
                if (i20 != 0) {
                }
                i23 = i4 & 16384;
                if (i23 == 0) {
                }
                if ((i3 & 196608) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i13 & 306783379) == 306783378 || (74899 & i19) != 74898, i13 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            if ((i2 & 24576) == 0) {
            }
            i7 = i4 & 32;
            if (i7 != 0) {
            }
            i8 = i4 & 64;
            Object obj422 = null;
            if (i8 == 0) {
            }
            i9 = i4 & 128;
            if (i9 == 0) {
            }
            i11 = i4 & 256;
            if (i11 == 0) {
            }
            i13 = i5;
            i14 = i4 & 512;
            if (i14 != 0) {
            }
            i15 = i4 & 1024;
            if (i15 == 0) {
            }
            i17 = i4 & 2048;
            if (i17 == 0) {
            }
            int i382222 = i16;
            i18 = i4 & 4096;
            if (i18 == 0) {
            }
            int i512222 = i382222;
            int i522222 = IAuthTabCallback + 79;
            onWarmupCompleted = i522222 % 128;
            int i532222 = i522222 % 2;
            i19 = i512222;
            i20 = i4 & 8192;
            if (i20 != 0) {
            }
            i23 = i4 & 16384;
            if (i23 == 0) {
            }
            if ((i3 & 196608) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i13 & 306783379) == 306783378 || (74899 & i19) != 74898, i13 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i7 = i4 & 32;
        if (i7 != 0) {
        }
        i8 = i4 & 64;
        Object obj4222 = null;
        if (i8 == 0) {
        }
        i9 = i4 & 128;
        if (i9 == 0) {
        }
        i11 = i4 & 256;
        if (i11 == 0) {
        }
        i13 = i5;
        i14 = i4 & 512;
        if (i14 != 0) {
        }
        i15 = i4 & 1024;
        if (i15 == 0) {
        }
        i17 = i4 & 2048;
        if (i17 == 0) {
        }
        int i3822222 = i16;
        i18 = i4 & 4096;
        if (i18 == 0) {
        }
        int i5122222 = i3822222;
        int i5222222 = IAuthTabCallback + 79;
        onWarmupCompleted = i5222222 % 128;
        int i5322222 = i5222222 % 2;
        i19 = i5122222;
        i20 = i4 & 8192;
        if (i20 != 0) {
        }
        i23 = i4 & 16384;
        if (i23 == 0) {
        }
        if ((i3 & 196608) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i13 & 306783379) == 306783378 || (74899 & i19) != 74898, i13 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public final void IAuthTabCallback(@NotNull List<String> list, @NotNull mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, int i3, boolean z, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, @Nullable bindChildren bindchildren, @Nullable use useVar, long j4, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, @Nullable Object obj, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4, int i5, int i6) {
        boolean z2;
        getHumanReadableName gethumanreadablename2;
        long jOnNavigationEvent;
        bindChildren bindchildren2;
        mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult2;
        List<String> list2 = list;
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i6 & 4) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        int i8 = (i6 & 8) != 0 ? Integer.MAX_VALUE : i;
        int i9 = (i6 & 16) != 0 ? 0 : i2;
        int i10 = (i6 & 32) != 0 ? 0 : i3;
        if ((i6 & 64) != 0) {
            int i11 = IAuthTabCallback + 109;
            onWarmupCompleted = i11 % 128;
            z2 = i11 % 2 != 0;
        } else {
            z2 = z;
        }
        if ((i6 & 128) != 0) {
            int i12 = IAuthTabCallback + 75;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            gethumanreadablename2 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
        } else {
            gethumanreadablename2 = gethumanreadablename;
        }
        long jOnTransact = (i6 & 256) != 0 ? setByteOrder.Companion.onTransact() : j;
        long jOnNavigationEvent2 = (i6 & 512) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
        if ((i6 & 1024) != 0) {
            int i13 = IAuthTabCallback + 57;
            onWarmupCompleted = i13 % 128;
            if (i13 % 2 != 0) {
                jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                int i14 = 76 / 0;
            } else {
                jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
            }
        } else {
            jOnNavigationEvent = j3;
        }
        float fOnExtraCallback = (i6 & 2048) != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f;
        if ((i6 & 4096) != 0) {
            int i15 = onWarmupCompleted + 17;
            IAuthTabCallback = i15 % 128;
            int i16 = i15 % 2;
            bindchildren2 = null;
        } else {
            bindchildren2 = bindchildren;
        }
        use useVar2 = (i6 & 8192) != 0 ? null : useVar;
        long jOnNavigationEvent3 = (i6 & 16384) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j4;
        GraphicDeviceInfo graphicDeviceInfo2 = (32768 & i6) != 0 ? null : graphicDeviceInfo;
        if ((65536 & i6) != 0) {
            int i17 = IAuthTabCallback + 103;
            onWarmupCompleted = i17 % 128;
            if (i17 % 2 != 0) {
                mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult3 = mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.TopLeft;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult4 = mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.TopLeft;
            int i18 = onWarmupCompleted + 107;
            IAuthTabCallback = i18 % 128;
            int i19 = i18 % 2;
            onextracallbackwithresult2 = onextracallbackwithresult4;
        } else {
            onextracallbackwithresult2 = onextracallbackwithresult;
        }
        Object obj3 = (i6 & 131072) != 0 ? null : obj;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2094678857, i4, i5, "im.toss.tds.compose.component.anim.animatetop.v1.AnimateTopPreset.Ticker (TitlePreset.kt:161)");
        }
        ArrayList arrayList = new ArrayList(list.size());
        int i20 = 0;
        for (int size = list2.size(); i20 < size; size = size) {
            arrayList.add(new hasProvider(list2.get(i20), (List) null, 2, (DefaultConstructorMarker) null));
            i20++;
            list2 = list;
        }
        onExtraCallback(arrayList, iAuthTabCallback, quirksExternalSyntheticBackport02, i8, i9, i10, z2, gethumanreadablename2, jOnTransact, jOnNavigationEvent2, jOnNavigationEvent, fOnExtraCallback, bindchildren2, useVar2, jOnNavigationEvent3, graphicDeviceInfo2, onextracallbackwithresult2, obj3, cameraCaptureResultEmptyCameraCaptureResult, i4 & 2147483632, i5 & 268435454, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Context $context;
        final /* synthetic */ int $initialDelay;
        final /* synthetic */ int $interval;
        final /* synthetic */ mExternalSyntheticApiModelOutline1.IAuthTabCallback $motion;
        final /* synthetic */ int $playCount;
        final /* synthetic */ boolean $skipIntroMotion;
        final /* synthetic */ mExternalSyntheticLambda8 $state;
        final /* synthetic */ List<hasProvider> $texts;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(mExternalSyntheticLambda8 mexternalsyntheticlambda8, Context context, List<hasProvider> list, mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, int i, int i2, int i3, boolean z, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$state = mexternalsyntheticlambda8;
            this.$context = context;
            this.$texts = list;
            this.$motion = iAuthTabCallback;
            this.$playCount = i;
            this.$initialDelay = i2;
            this.$interval = i3;
            this.$skipIntroMotion = z;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$state, this.$context, this.$texts, this.$motion, this.$playCount, this.$initialDelay, this.$interval, this.$skipIntroMotion, access13800Var);
            int i2 = onWarmupCompleted + 3;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = onNavigationEvent + 25;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 1;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 3;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 79;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = i2 + 65;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.onNavigationEvent(obj);
            mExternalSyntheticLambda8.onWarmupCompleted(this.$state, this.$context, this.$texts, this.$motion, null, this.$playCount, this.$initialDelay, this.$interval, this.$skipIntroMotion, false, 264, null);
            return Unit.INSTANCE;
        }
    }

    private static final Unit onWarmupCompleted(mc mcVar, mExternalSyntheticLambda8 mexternalsyntheticlambda8, QuirkSettingsLoader quirkSettingsLoader, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 39;
        IAuthTabCallback = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 5) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2147101518, i, -1, "im.toss.tds.compose.component.anim.animatetop.v1.AnimateTopPreset.Ticker.<anonymous> (TitlePreset.kt:247)");
            }
            int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            IAuthTabCallback(-212990389, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 212990392, iOnWarmupCompleted2, iOnWarmupCompleted, new Object[]{mcVar, mexternalsyntheticlambda8, null, quirkSettingsLoader, cameraCaptureResultEmptyCameraCaptureResult, 0, 2});
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onWarmupCompleted + 19;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull final List<hasProvider> list, @NotNull final mExternalSyntheticApiModelOutline1.IAuthTabCallback iAuthTabCallback, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, int i3, boolean z, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, @Nullable bindChildren bindchildren, @Nullable use useVar, long j4, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, @Nullable Object obj, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final int i26;
        final int i27;
        final int i28;
        final boolean z2;
        final getHumanReadableName gethumanreadablename2;
        final long j5;
        final long j6;
        long jOnNavigationEvent;
        final float f2;
        final bindChildren bindchildren2;
        final use useVar2;
        final long j7;
        final GraphicDeviceInfo graphicDeviceInfo2;
        final mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult2;
        final Object obj2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i29;
        int i30;
        int i31;
        int i32;
        boolean z3;
        int i33;
        getHumanReadableName gethumanreadablename3;
        long jOnTransact;
        float fOnExtraCallback;
        GraphicDeviceInfo graphicDeviceInfo3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i34;
        int i35;
        mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult3;
        long j8;
        long j9;
        use useVar3;
        bindChildren bindchildren3;
        int i36;
        Object obj3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        Context context;
        final mExternalSyntheticLambda8 mexternalsyntheticlambda8OnExtraCallback;
        boolean zOnNavigationEvent;
        boolean zOnExtraCallback;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        Object objOnMinimized;
        int i37 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-2094678857);
        if ((i4 & 6) == 0) {
            i7 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback) ? 32 : 16;
        }
        int i38 = i6 & 4;
        if (i38 != 0) {
            i7 |= 384;
        } else {
            if ((i4 & 384) == 0) {
                i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 256 : 128;
            }
            i8 = i6 & 8;
            if (i8 == 0) {
                i7 |= 3072;
            } else {
                if ((i4 & 3072) == 0) {
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 2048 : 1024;
                }
                i9 = i6 & 16;
                if (i9 != 0) {
                    i7 |= 24576;
                } else {
                    if ((i4 & 24576) == 0) {
                        i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i2) ? 16384 : 8192;
                    }
                    i10 = i6 & 32;
                    if (i10 == 0) {
                        i7 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i3) ? 131072 : 65536;
                    }
                    i11 = i6 & 64;
                    if (i11 == 0) {
                        i7 |= 1572864;
                    } else {
                        if ((i4 & 1572864) == 0) {
                            int i39 = IAuthTabCallback + 7;
                            onWarmupCompleted = i39 % 128;
                            int i40 = i39 % 2;
                            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 1048576 : 524288;
                        }
                        if ((i4 & 12582912) == 0) {
                            i7 |= ((i6 & 128) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename)) ? 8388608 : 4194304;
                        }
                        i12 = i6 & 256;
                        Object obj4 = null;
                        if (i12 != 0) {
                            int i41 = IAuthTabCallback + 5;
                            onWarmupCompleted = i41 % 128;
                            if (i41 % 2 != 0) {
                                obj4.hashCode();
                                throw null;
                            }
                            i7 |= 100663296;
                        } else if ((100663296 & i4) == 0) {
                            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 67108864 : 33554432;
                        }
                        i13 = i6 & 512;
                        if (i13 != 0) {
                            i7 |= 805306368;
                        } else if ((805306368 & i4) == 0) {
                            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 536870912 : 268435456;
                        }
                        i14 = i6 & 1024;
                        if (i14 != 0) {
                            i15 = i5 | 6;
                        } else if ((i5 & 6) == 0) {
                            i15 = i5 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j3) ? 4 : 2);
                        } else {
                            i15 = i5;
                        }
                        i16 = i6 & 2048;
                        if (i16 != 0) {
                            i15 |= 48;
                        } else if ((i5 & 48) == 0) {
                            int i42 = onWarmupCompleted + 71;
                            IAuthTabCallback = i42 % 128;
                            if (i42 % 2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f);
                                obj4.hashCode();
                                throw null;
                            }
                            i15 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ^ true) ? 32 : 16;
                        }
                        i17 = i15;
                        int i43 = onWarmupCompleted + 81;
                        IAuthTabCallback = i43 % 128;
                        int i44 = i43 % 2;
                        i18 = i6 & 4096;
                        if (i18 != 0) {
                            i17 |= 384;
                        } else if ((i5 & 384) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(bindchildren)) {
                                int i45 = IAuthTabCallback + 11;
                                onWarmupCompleted = i45 % 128;
                                int i46 = i45 % 2;
                                i19 = 256;
                            } else {
                                i19 = 128;
                            }
                            i17 |= i19;
                        }
                        i20 = i6 & 8192;
                        if (i20 != 0) {
                            i17 |= 3072;
                        } else {
                            if ((i5 & 3072) == 0) {
                                i17 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(useVar) ? 2048 : 1024;
                            }
                            i21 = i6 & 16384;
                            if (i21 == 0) {
                                i17 |= 24576;
                                i22 = i21;
                            } else {
                                i22 = i21;
                                if ((i5 & 24576) == 0) {
                                    i17 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j4) ? 16384 : 8192;
                                }
                                i23 = i6 & 32768;
                                if (i23 != 0) {
                                    i17 |= 196608;
                                } else if ((i5 & 196608) == 0) {
                                    i17 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo) ? 131072 : 65536;
                                }
                                i24 = 65536 & i6;
                                if (i24 != 0) {
                                    i17 |= 1572864;
                                } else if ((i5 & 1572864) == 0) {
                                    i17 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult == null ? -1 : onextracallbackwithresult.ordinal()) ? 1048576 : 524288;
                                }
                                i25 = i6 & 131072;
                                if (i25 == 0) {
                                    if ((12582912 & i5) == 0) {
                                        i17 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(obj) ? 8388608 : 4194304;
                                    }
                                    if ((i5 & 100663296) == 0) {
                                        i17 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 67108864 : 33554432;
                                    }
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 306783379) == 306783378 || (38347923 & i17) != 38347922, i7 & 1)) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                        i26 = i;
                                        i27 = i2;
                                        i28 = i3;
                                        z2 = z;
                                        gethumanreadablename2 = gethumanreadablename;
                                        j5 = j;
                                        j6 = j2;
                                        jOnNavigationEvent = j3;
                                        f2 = f;
                                        bindchildren2 = bindchildren;
                                        useVar2 = useVar;
                                        j7 = j4;
                                        graphicDeviceInfo2 = graphicDeviceInfo;
                                        onextracallbackwithresult2 = onextracallbackwithresult;
                                        obj2 = obj;
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                        if ((i4 & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i38 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                            if (i8 != 0) {
                                                int i47 = onWarmupCompleted + 23;
                                                IAuthTabCallback = i47 % 128;
                                                if (i47 % 2 == 0) {
                                                    throw null;
                                                }
                                                i30 = Integer.MAX_VALUE;
                                            } else {
                                                i30 = i;
                                            }
                                            if (i9 != 0) {
                                                int i48 = IAuthTabCallback + 55;
                                                onWarmupCompleted = i48 % 128;
                                                i31 = i48 % 2 != 0 ? 1 : 0;
                                            } else {
                                                i31 = i2;
                                            }
                                            i32 = i10 != 0 ? 0 : i3;
                                            z3 = i11 != 0 ? false : z;
                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport05;
                                            if ((i6 & 128) != 0) {
                                                int i49 = onWarmupCompleted + 115;
                                                i33 = i30;
                                                IAuthTabCallback = i49 % 128;
                                                if (i49 % 2 == 0) {
                                                    gethumanreadablename3 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                                                    i7 &= -29360129;
                                                    int i50 = 95 / 0;
                                                } else {
                                                    gethumanreadablename3 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                                                    i7 &= -29360129;
                                                }
                                            } else {
                                                i33 = i30;
                                                gethumanreadablename3 = gethumanreadablename;
                                            }
                                            jOnTransact = i12 != 0 ? setByteOrder.Companion.onTransact() : j;
                                            long jOnNavigationEvent2 = i13 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
                                            jOnNavigationEvent = i14 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j3;
                                            fOnExtraCallback = i16 != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f;
                                            bindChildren bindchildren4 = i18 != 0 ? null : bindchildren;
                                            use useVar4 = i20 != 0 ? null : useVar;
                                            long jOnNavigationEvent3 = i22 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j4;
                                            graphicDeviceInfo3 = i23 != 0 ? null : graphicDeviceInfo;
                                            mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult4 = i24 != 0 ? mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.TopLeft : onextracallbackwithresult;
                                            if (i25 != 0) {
                                                bindChildren bindchildren5 = bindchildren4;
                                                int i51 = onWarmupCompleted + 17;
                                                long j10 = jOnNavigationEvent2;
                                                IAuthTabCallback = i51 % 128;
                                                if (i51 % 2 == 0) {
                                                    throw null;
                                                }
                                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport06;
                                                i34 = i33;
                                                i36 = i7;
                                                onextracallbackwithresult3 = onextracallbackwithresult4;
                                                obj3 = null;
                                                j8 = j10;
                                                j9 = jOnNavigationEvent3;
                                                useVar3 = useVar4;
                                                bindchildren3 = bindchildren5;
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                                } else {
                                                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2094678857, i36, i17, "im.toss.tds.compose.component.anim.animatetop.v1.AnimateTopPreset.Ticker (TitlePreset.kt:204)");
                                                }
                                                context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                                                int i52 = i17 >> 21;
                                                int i53 = i36 >> 18;
                                                int i54 = i17 << 15;
                                                int i55 = i36;
                                                mexternalsyntheticlambda8OnExtraCallback = onExtraCallback(obj3, gethumanreadablename3, jOnTransact, j8, jOnNavigationEvent, createCameraCaptureCallback.onExtraCallback(mExternalSyntheticLambda7.onExtraCallbackWithResult(onextracallbackwithresult3)), fOnExtraCallback, bindchildren3, useVar3, j9, graphicDeviceInfo3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i52 & 14) | (i53 & 112) | (i53 & 896) | (i53 & 7168) | ((i17 << 12) & 57344) | (i54 & 3670016) | (i54 & 29360128) | (i54 & 234881024) | (i54 & 1879048192), ((i17 >> 15) & 14) | (i52 & 112), 0);
                                                Object[] objArr = {list, iAuthTabCallback, Integer.valueOf(i31), Integer.valueOf(i32), Integer.valueOf(i34), Boolean.valueOf(z3)};
                                                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(mexternalsyntheticlambda8OnExtraCallback);
                                                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
                                                long j11 = j8;
                                                z4 = (i55 & 14) != 4;
                                                float f3 = fOnExtraCallback;
                                                z5 = (i55 & 112) != 32;
                                                getHumanReadableName gethumanreadablename4 = gethumanreadablename3;
                                                bindChildren bindchildren6 = bindchildren3;
                                                z6 = (i55 & 7168) != 2048;
                                                use useVar5 = useVar3;
                                                z7 = (57344 & i55) != 16384;
                                                long j12 = j9;
                                                z8 = (458752 & i55) != 131072;
                                                z9 = (3670016 & i55) != 1048576;
                                                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (!(z4 | zOnNavigationEvent | zOnExtraCallback | z5 | z6 | z7 | z8 | z9) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    objOnMinimized = new onNavigationEvent(mexternalsyntheticlambda8OnExtraCallback, context, list, iAuthTabCallback, i34, i31, i32, z3, null);
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                                }
                                                isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                                final QuirkSettingsLoader quirkSettingsLoaderOnNavigationEvent = mExternalSyntheticLambda7.onNavigationEvent(onextracallbackwithresult3);
                                                int i56 = i55 << 6;
                                                mExternalSyntheticLambda7.onWarmupCompleted(-422700871, JsParamKeys.onExtraCallbackWithResult(), 422700876, new Object[]{this.onNavigationEvent, mexternalsyntheticlambda8OnExtraCallback, list, quirkSettingsLoaderOnNavigationEvent, quirksExternalSyntheticBackport04, ForwardingCameraControl.onExtraCallback(2147101518, true, new Function2() { // from class: im.toss.tds.compose.component.anim.animatetop.v1.AnimateTopPreset$$ExternalSyntheticLambda4
                                                    private static int onExtraCallbackWithResult = 1;
                                                    private static int onWarmupCompleted;

                                                    public final Object invoke(Object obj5, Object obj6) {
                                                        int i57 = 2 % 2;
                                                        int i58 = onWarmupCompleted + 59;
                                                        onExtraCallbackWithResult = i58 % 128;
                                                        int i59 = i58 % 2;
                                                        Unit unitOnExtraCallback = mc.onExtraCallback(this.f$0, mexternalsyntheticlambda8OnExtraCallback, quirkSettingsLoaderOnNavigationEvent, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                                        int i60 = onWarmupCompleted + 17;
                                                        onExtraCallbackWithResult = i60 % 128;
                                                        if (i60 % 2 != 0) {
                                                            return unitOnExtraCallback;
                                                        }
                                                        Object obj7 = null;
                                                        obj7.hashCode();
                                                        throw null;
                                                    }
                                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i56 & 896) | 196608 | (57344 & i56))}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                                }
                                                gethumanreadablename2 = gethumanreadablename4;
                                                i26 = i34;
                                                i27 = i31;
                                                i28 = i32;
                                                z2 = z3;
                                                graphicDeviceInfo2 = graphicDeviceInfo3;
                                                onextracallbackwithresult2 = onextracallbackwithresult3;
                                                obj2 = obj3;
                                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                                                j5 = jOnTransact;
                                                j6 = j11;
                                                f2 = f3;
                                                bindchildren2 = bindchildren6;
                                                useVar2 = useVar5;
                                                j7 = j12;
                                            } else {
                                                bindChildren bindchildren7 = bindchildren4;
                                                long j13 = jOnNavigationEvent2;
                                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport06;
                                                i34 = i33;
                                                i35 = i7;
                                                onextracallbackwithresult3 = onextracallbackwithresult4;
                                                j8 = j13;
                                                j9 = jOnNavigationEvent3;
                                                useVar3 = useVar4;
                                                bindchildren3 = bindchildren7;
                                            }
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                            if ((i6 & 128) != 0) {
                                                i7 &= -29360129;
                                            }
                                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                            i34 = i;
                                            i31 = i2;
                                            i32 = i3;
                                            z3 = z;
                                            gethumanreadablename3 = gethumanreadablename;
                                            jOnTransact = j;
                                            jOnNavigationEvent = j3;
                                            fOnExtraCallback = f;
                                            bindchildren3 = bindchildren;
                                            useVar3 = useVar;
                                            j9 = j4;
                                            graphicDeviceInfo3 = graphicDeviceInfo;
                                            onextracallbackwithresult3 = onextracallbackwithresult;
                                            i35 = i7;
                                            j8 = j2;
                                        }
                                        i36 = i35;
                                        obj3 = obj;
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        }
                                        context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                                        int i522 = i17 >> 21;
                                        int i532 = i36 >> 18;
                                        int i542 = i17 << 15;
                                        int i552 = i36;
                                        mexternalsyntheticlambda8OnExtraCallback = onExtraCallback(obj3, gethumanreadablename3, jOnTransact, j8, jOnNavigationEvent, createCameraCaptureCallback.onExtraCallback(mExternalSyntheticLambda7.onExtraCallbackWithResult(onextracallbackwithresult3)), fOnExtraCallback, bindchildren3, useVar3, j9, graphicDeviceInfo3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i522 & 14) | (i532 & 112) | (i532 & 896) | (i532 & 7168) | ((i17 << 12) & 57344) | (i542 & 3670016) | (i542 & 29360128) | (i542 & 234881024) | (i542 & 1879048192), ((i17 >> 15) & 14) | (i522 & 112), 0);
                                        Object[] objArr2 = {list, iAuthTabCallback, Integer.valueOf(i31), Integer.valueOf(i32), Integer.valueOf(i34), Boolean.valueOf(z3)};
                                        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(mexternalsyntheticlambda8OnExtraCallback);
                                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
                                        long j112 = j8;
                                        if ((i552 & 14) != 4) {
                                        }
                                        float f32 = fOnExtraCallback;
                                        if ((i552 & 112) != 32) {
                                        }
                                        getHumanReadableName gethumanreadablename42 = gethumanreadablename3;
                                        bindChildren bindchildren62 = bindchildren3;
                                        if ((i552 & 7168) != 2048) {
                                        }
                                        use useVar52 = useVar3;
                                        if ((57344 & i552) != 16384) {
                                        }
                                        long j122 = j9;
                                        if ((458752 & i552) != 131072) {
                                        }
                                        if ((3670016 & i552) != 1048576) {
                                        }
                                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (!(z4 | zOnNavigationEvent | zOnExtraCallback | z5 | z6 | z7 | z8 | z9)) {
                                            objOnMinimized = new onNavigationEvent(mexternalsyntheticlambda8OnExtraCallback, context, list, iAuthTabCallback, i34, i31, i32, z3, null);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                            isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr2, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                            final QuirkSettingsLoader quirkSettingsLoaderOnNavigationEvent2 = mExternalSyntheticLambda7.onNavigationEvent(onextracallbackwithresult3);
                                            int i562 = i552 << 6;
                                            mExternalSyntheticLambda7.onWarmupCompleted(-422700871, JsParamKeys.onExtraCallbackWithResult(), 422700876, new Object[]{this.onNavigationEvent, mexternalsyntheticlambda8OnExtraCallback, list, quirkSettingsLoaderOnNavigationEvent2, quirksExternalSyntheticBackport04, ForwardingCameraControl.onExtraCallback(2147101518, true, new Function2() { // from class: im.toss.tds.compose.component.anim.animatetop.v1.AnimateTopPreset$$ExternalSyntheticLambda4
                                                private static int onExtraCallbackWithResult = 1;
                                                private static int onWarmupCompleted;

                                                public final Object invoke(Object obj5, Object obj6) {
                                                    int i57 = 2 % 2;
                                                    int i58 = onWarmupCompleted + 59;
                                                    onExtraCallbackWithResult = i58 % 128;
                                                    int i59 = i58 % 2;
                                                    Unit unitOnExtraCallback = mc.onExtraCallback(this.f$0, mexternalsyntheticlambda8OnExtraCallback, quirkSettingsLoaderOnNavigationEvent2, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                                    int i60 = onWarmupCompleted + 17;
                                                    onExtraCallbackWithResult = i60 % 128;
                                                    if (i60 % 2 != 0) {
                                                        return unitOnExtraCallback;
                                                    }
                                                    Object obj7 = null;
                                                    obj7.hashCode();
                                                    throw null;
                                                }
                                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i562 & 896) | 196608 | (57344 & i562))}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            }
                                            gethumanreadablename2 = gethumanreadablename42;
                                            i26 = i34;
                                            i27 = i31;
                                            i28 = i32;
                                            z2 = z3;
                                            graphicDeviceInfo2 = graphicDeviceInfo3;
                                            onextracallbackwithresult2 = onextracallbackwithresult3;
                                            obj2 = obj3;
                                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                                            j5 = jOnTransact;
                                            j6 = j112;
                                            f2 = f32;
                                            bindchildren2 = bindchildren62;
                                            useVar2 = useVar52;
                                            j7 = j122;
                                        }
                                    }
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                        final long j14 = jOnNavigationEvent;
                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.anim.animatetop.v1.AnimateTopPreset$$ExternalSyntheticLambda5
                                            private static int onExtraCallbackWithResult = 0;
                                            private static int onWarmupCompleted = 1;

                                            public final Object invoke(Object obj5, Object obj6) {
                                                int i57 = 2 % 2;
                                                int i58 = onWarmupCompleted + 15;
                                                onExtraCallbackWithResult = i58 % 128;
                                                int i59 = i58 % 2;
                                                Unit unitOnNavigationEvent = mc.onNavigationEvent(this.f$0, list, iAuthTabCallback, quirksExternalSyntheticBackport02, i26, i27, i28, z2, gethumanreadablename2, j5, j6, j14, f2, bindchildren2, useVar2, j7, graphicDeviceInfo2, onextracallbackwithresult2, obj2, i4, i5, i6, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                                int i60 = onWarmupCompleted + 13;
                                                onExtraCallbackWithResult = i60 % 128;
                                                if (i60 % 2 != 0) {
                                                    int i61 = 85 / 0;
                                                }
                                                return unitOnNavigationEvent;
                                            }
                                        });
                                    }
                                    i29 = IAuthTabCallback + 37;
                                    onWarmupCompleted = i29 % 128;
                                    if (i29 % 2 == 0) {
                                        throw null;
                                    }
                                    return;
                                }
                                i17 |= 12582912;
                                if ((i5 & 100663296) == 0) {
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 306783379) == 306783378 || (38347923 & i17) != 38347922, i7 & 1)) {
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                }
                                i29 = IAuthTabCallback + 37;
                                onWarmupCompleted = i29 % 128;
                                if (i29 % 2 == 0) {
                                }
                            }
                            i23 = i6 & 32768;
                            if (i23 != 0) {
                            }
                            i24 = 65536 & i6;
                            if (i24 != 0) {
                            }
                            i25 = i6 & 131072;
                            if (i25 == 0) {
                            }
                            if ((i5 & 100663296) == 0) {
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 306783379) == 306783378 || (38347923 & i17) != 38347922, i7 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            }
                            i29 = IAuthTabCallback + 37;
                            onWarmupCompleted = i29 % 128;
                            if (i29 % 2 == 0) {
                            }
                        }
                        i21 = i6 & 16384;
                        if (i21 == 0) {
                        }
                        i23 = i6 & 32768;
                        if (i23 != 0) {
                        }
                        i24 = 65536 & i6;
                        if (i24 != 0) {
                        }
                        i25 = i6 & 131072;
                        if (i25 == 0) {
                        }
                        if ((i5 & 100663296) == 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 306783379) == 306783378 || (38347923 & i17) != 38347922, i7 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        }
                        i29 = IAuthTabCallback + 37;
                        onWarmupCompleted = i29 % 128;
                        if (i29 % 2 == 0) {
                        }
                    }
                    if ((i4 & 12582912) == 0) {
                    }
                    i12 = i6 & 256;
                    Object obj42 = null;
                    if (i12 != 0) {
                    }
                    i13 = i6 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i6 & 1024;
                    if (i14 != 0) {
                    }
                    i16 = i6 & 2048;
                    if (i16 != 0) {
                    }
                    i17 = i15;
                    int i432 = onWarmupCompleted + 81;
                    IAuthTabCallback = i432 % 128;
                    int i442 = i432 % 2;
                    i18 = i6 & 4096;
                    if (i18 != 0) {
                    }
                    i20 = i6 & 8192;
                    if (i20 != 0) {
                    }
                    i21 = i6 & 16384;
                    if (i21 == 0) {
                    }
                    i23 = i6 & 32768;
                    if (i23 != 0) {
                    }
                    i24 = 65536 & i6;
                    if (i24 != 0) {
                    }
                    i25 = i6 & 131072;
                    if (i25 == 0) {
                    }
                    if ((i5 & 100663296) == 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 306783379) == 306783378 || (38347923 & i17) != 38347922, i7 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                    i29 = IAuthTabCallback + 37;
                    onWarmupCompleted = i29 % 128;
                    if (i29 % 2 == 0) {
                    }
                }
                i10 = i6 & 32;
                if (i10 == 0) {
                }
                i11 = i6 & 64;
                if (i11 == 0) {
                }
                if ((i4 & 12582912) == 0) {
                }
                i12 = i6 & 256;
                Object obj422 = null;
                if (i12 != 0) {
                }
                i13 = i6 & 512;
                if (i13 != 0) {
                }
                i14 = i6 & 1024;
                if (i14 != 0) {
                }
                i16 = i6 & 2048;
                if (i16 != 0) {
                }
                i17 = i15;
                int i4322 = onWarmupCompleted + 81;
                IAuthTabCallback = i4322 % 128;
                int i4422 = i4322 % 2;
                i18 = i6 & 4096;
                if (i18 != 0) {
                }
                i20 = i6 & 8192;
                if (i20 != 0) {
                }
                i21 = i6 & 16384;
                if (i21 == 0) {
                }
                i23 = i6 & 32768;
                if (i23 != 0) {
                }
                i24 = 65536 & i6;
                if (i24 != 0) {
                }
                i25 = i6 & 131072;
                if (i25 == 0) {
                }
                if ((i5 & 100663296) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 306783379) == 306783378 || (38347923 & i17) != 38347922, i7 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
                i29 = IAuthTabCallback + 37;
                onWarmupCompleted = i29 % 128;
                if (i29 % 2 == 0) {
                }
            }
            i9 = i6 & 16;
            if (i9 != 0) {
            }
            i10 = i6 & 32;
            if (i10 == 0) {
            }
            i11 = i6 & 64;
            if (i11 == 0) {
            }
            if ((i4 & 12582912) == 0) {
            }
            i12 = i6 & 256;
            Object obj4222 = null;
            if (i12 != 0) {
            }
            i13 = i6 & 512;
            if (i13 != 0) {
            }
            i14 = i6 & 1024;
            if (i14 != 0) {
            }
            i16 = i6 & 2048;
            if (i16 != 0) {
            }
            i17 = i15;
            int i43222 = onWarmupCompleted + 81;
            IAuthTabCallback = i43222 % 128;
            int i44222 = i43222 % 2;
            i18 = i6 & 4096;
            if (i18 != 0) {
            }
            i20 = i6 & 8192;
            if (i20 != 0) {
            }
            i21 = i6 & 16384;
            if (i21 == 0) {
            }
            i23 = i6 & 32768;
            if (i23 != 0) {
            }
            i24 = 65536 & i6;
            if (i24 != 0) {
            }
            i25 = i6 & 131072;
            if (i25 == 0) {
            }
            if ((i5 & 100663296) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 306783379) == 306783378 || (38347923 & i17) != 38347922, i7 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
            i29 = IAuthTabCallback + 37;
            onWarmupCompleted = i29 % 128;
            if (i29 % 2 == 0) {
            }
        }
        i8 = i6 & 8;
        if (i8 == 0) {
        }
        i9 = i6 & 16;
        if (i9 != 0) {
        }
        i10 = i6 & 32;
        if (i10 == 0) {
        }
        i11 = i6 & 64;
        if (i11 == 0) {
        }
        if ((i4 & 12582912) == 0) {
        }
        i12 = i6 & 256;
        Object obj42222 = null;
        if (i12 != 0) {
        }
        i13 = i6 & 512;
        if (i13 != 0) {
        }
        i14 = i6 & 1024;
        if (i14 != 0) {
        }
        i16 = i6 & 2048;
        if (i16 != 0) {
        }
        i17 = i15;
        int i432222 = onWarmupCompleted + 81;
        IAuthTabCallback = i432222 % 128;
        int i442222 = i432222 % 2;
        i18 = i6 & 4096;
        if (i18 != 0) {
        }
        i20 = i6 & 8192;
        if (i20 != 0) {
        }
        i21 = i6 & 16384;
        if (i21 == 0) {
        }
        i23 = i6 & 32768;
        if (i23 != 0) {
        }
        i24 = 65536 & i6;
        if (i24 != 0) {
        }
        i25 = i6 & 131072;
        if (i25 == 0) {
        }
        if ((i5 & 100663296) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 306783379) == 306783378 || (38347923 & i17) != 38347922, i7 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        i29 = IAuthTabCallback + 37;
        onWarmupCompleted = i29 % 128;
        if (i29 % 2 == 0) {
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getHumanReadableName gethumanreadablename;
        long j;
        int i;
        long jOnNavigationEvent;
        getHumanReadableName gethumanreadablename2;
        int i2;
        mc mcVar = (mc) objArr[0];
        String str = (String) objArr[1];
        mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub = (mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub) objArr[2];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        getHumanReadableName gethumanreadablename3 = (getHumanReadableName) objArr[6];
        long jLongValue = ((Number) objArr[7]).longValue();
        long jLongValue2 = ((Number) objArr[8]).longValue();
        long jLongValue3 = ((Number) objArr[9]).longValue();
        float fFloatValue = ((Number) objArr[10]).floatValue();
        bindChildren bindchildren = (bindChildren) objArr[11];
        use useVar = (use) objArr[12];
        long jLongValue4 = ((Number) objArr[13]).longValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[14];
        mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult = (mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult) objArr[15];
        Object obj = objArr[16];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[17];
        int iIntValue2 = ((Number) objArr[18]).intValue();
        int iIntValue3 = ((Number) objArr[19]).intValue();
        int iIntValue4 = ((Number) objArr[20]).intValue();
        int i3 = 2 % 2;
        boolean z = zBooleanValue;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = (iIntValue4 & 4) != 0 ? QuirksExternalSyntheticBackport0.Companion : onextracallback;
        if ((iIntValue4 & 8) != 0) {
            gethumanreadablename = gethumanreadablename3;
            int i4 = onWarmupCompleted + 97;
            j = jLongValue;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            i = 0;
        } else {
            gethumanreadablename = gethumanreadablename3;
            j = jLongValue;
            i = iIntValue;
        }
        if ((iIntValue4 & 16) != 0) {
            int i6 = IAuthTabCallback;
            int i7 = i6 + 11;
            jOnNavigationEvent = jLongValue2;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 119;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            z = false;
        } else {
            jOnNavigationEvent = jLongValue2;
        }
        if ((iIntValue4 & 32) != 0) {
            int i11 = onWarmupCompleted + 95;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            gethumanreadablename2 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
        } else {
            gethumanreadablename2 = gethumanreadablename;
        }
        long jOnTransact = (iIntValue4 & 64) != 0 ? setByteOrder.Companion.onTransact() : j;
        if ((iIntValue4 & 128) != 0) {
            jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        }
        long jOnNavigationEvent2 = (iIntValue4 & 256) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : jLongValue3;
        float fOnExtraCallback = (iIntValue4 & 512) != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : fFloatValue;
        Object obj2 = null;
        if ((iIntValue4 & 1024) != 0) {
            bindchildren = null;
        }
        if ((iIntValue4 & 2048) != 0) {
            useVar = null;
        }
        if ((iIntValue4 & 4096) != 0) {
            jLongValue4 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        }
        if ((iIntValue4 & 8192) != 0) {
            graphicDeviceInfo = null;
        }
        if ((iIntValue4 & 16384) != 0) {
            onextracallbackwithresult = mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.TopLeft;
        }
        if ((iIntValue4 & 32768) != 0) {
            int i13 = onWarmupCompleted + 27;
            IAuthTabCallback = i13 % 128;
            if (i13 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            obj = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1423183269, iIntValue2, iIntValue3, "im.toss.tds.compose.component.anim.animatetop.v1.AnimateTopPreset.Infinite (TitlePreset.kt:273)");
            int i14 = onWarmupCompleted + 7;
            IAuthTabCallback = i14 % 128;
            i2 = 2;
            int i15 = i14 % 2;
        } else {
            i2 = 2;
        }
        mcVar.onNavigationEvent(new hasProvider(str, (List) null, i2, (DefaultConstructorMarker) null), iAuthTabCallbackStub, onextracallback2, i, z, gethumanreadablename2, jOnTransact, jOnNavigationEvent, jOnNavigationEvent2, fOnExtraCallback, bindchildren, useVar, jLongValue4, graphicDeviceInfo, onextracallbackwithresult, obj, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2 & 2147483632, iIntValue3 & 4194302, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i16 = IAuthTabCallback + 7;
            onWarmupCompleted = i16 % 128;
            int i17 = i16 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i17 != 0) {
                obj2.hashCode();
                throw null;
            }
        }
        return null;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ int $initialDelay;
        final /* synthetic */ mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub $motion;
        final /* synthetic */ boolean $skipIntroMotion;
        final /* synthetic */ mExternalSyntheticLambda8 $state;
        final /* synthetic */ hasProvider $text;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(mExternalSyntheticLambda8 mexternalsyntheticlambda8, hasProvider hasprovider, mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub, int i, boolean z, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$state = mexternalsyntheticlambda8;
            this.$text = hasprovider;
            this.$motion = iAuthTabCallbackStub;
            this.$initialDelay = i;
            this.$skipIntroMotion = z;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 63;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 9;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$state, this.$text, this.$motion, this.$initialDelay, this.$skipIntroMotion, access13800Var);
            int i2 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 69 / 0;
            }
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 109;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i5 = i3 + 33;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i6 == 0) {
                mExternalSyntheticLambda8.onNavigationEvent(this.$state, this.$text, this.$motion, (mExternalSyntheticApiModelOutline1.onTransact) null, this.$initialDelay, this.$skipIntroMotion, 2, (Object) null);
            } else {
                mExternalSyntheticLambda8.onNavigationEvent(this.$state, this.$text, this.$motion, (mExternalSyntheticApiModelOutline1.onTransact) null, this.$initialDelay, this.$skipIntroMotion, 4, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onExtraCallbackWithResult(mc mcVar, mExternalSyntheticLambda8 mexternalsyntheticlambda8, QuirkSettingsLoader quirkSettingsLoader, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onWarmupCompleted + 51;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(753335567, i, -1, "im.toss.tds.compose.component.anim.animatetop.v1.AnimateTopPreset.Infinite.<anonymous> (TitlePreset.kt:350)");
                int i5 = onWarmupCompleted + 39;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 3 / 2;
                }
            }
            int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
            IAuthTabCallback(-212990389, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 212990392, iOnWarmupCompleted2, iOnWarmupCompleted, new Object[]{mcVar, mexternalsyntheticlambda8, null, quirkSettingsLoader, cameraCaptureResultEmptyCameraCaptureResult, 0, 2});
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallback + 21;
                onWarmupCompleted = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i8 = 77 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull final hasProvider hasprovider, @NotNull final mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, boolean z, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, @Nullable bindChildren bindchildren, @Nullable use useVar, long j4, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, @Nullable Object obj, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Object obj2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final int i25;
        final boolean z2;
        final getHumanReadableName gethumanreadablename2;
        final long j5;
        final long j6;
        final float f2;
        bindChildren bindchildren2;
        final use useVar2;
        final long j7;
        final GraphicDeviceInfo graphicDeviceInfo2;
        final mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult2;
        final Object obj3;
        final long j8;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        getHumanReadableName gethumanreadablename3;
        long jOnTransact;
        long jOnNavigationEvent;
        long jOnNavigationEvent2;
        float fOnExtraCallback;
        long jOnNavigationEvent3;
        use useVar3;
        float f3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        boolean z3;
        GraphicDeviceInfo graphicDeviceInfo3;
        mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult3;
        int i26;
        Object obj4;
        getHumanReadableName gethumanreadablename4;
        long j9;
        use useVar4;
        int i27;
        long j10;
        Integer numOnExtraCallbackWithResult;
        int i28;
        int i29 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1790065425);
        if ((i2 & 6) == 0) {
            i5 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(hasprovider) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackStub) ? 32 : 16;
        }
        int i30 = i4 & 4;
        if (i30 != 0) {
            i5 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                int i31 = onWarmupCompleted + 13;
                IAuthTabCallback = i31 % 128;
                int i32 = i31 % 2;
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 2048 : 1024;
                }
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 16384 : 8192;
                    }
                    if ((i2 & 196608) == 0) {
                        i5 |= ((i4 & 32) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(gethumanreadablename)) ? 131072 : 65536;
                    }
                    i8 = i4 & 64;
                    if (i8 == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 1048576 : 524288;
                    }
                    i9 = i4 & 128;
                    if (i9 == 0) {
                        i5 |= 12582912;
                    } else {
                        if ((i2 & 12582912) == 0) {
                            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 8388608 : 4194304;
                        }
                        i10 = i4 & 256;
                        if (i10 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j3)) {
                                int i33 = IAuthTabCallback + 21;
                                onWarmupCompleted = i33 % 128;
                                int i34 = i33 % 2;
                                i11 = 67108864;
                            } else {
                                i11 = 33554432;
                            }
                            i5 |= i11;
                        }
                        i12 = i4 & 512;
                        if (i12 != 0) {
                            int i35 = onWarmupCompleted + 123;
                            IAuthTabCallback = i35 % 128;
                            int i36 = i35 % 2;
                            i5 |= 805306368;
                        } else {
                            if ((805306368 & i2) == 0) {
                                int i37 = onWarmupCompleted + 33;
                                IAuthTabCallback = i37 % 128;
                                if (i37 % 2 == 0) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f);
                                    throw null;
                                }
                                i5 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ^ true) ? 536870912 : 268435456;
                            }
                            i13 = i4 & 1024;
                            if (i13 == 0) {
                                i14 = i3 | 6;
                            } else if ((i3 & 6) == 0) {
                                i14 = i3 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(bindchildren) ? 4 : 2);
                            } else {
                                i14 = i3;
                            }
                            i15 = i4 & 2048;
                            if (i15 == 0) {
                                i14 |= 48;
                            } else if ((i3 & 48) == 0) {
                                i14 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(useVar) ? 32 : 16;
                            }
                            i16 = i14;
                            i17 = i4 & 4096;
                            if (i17 == 0) {
                                i16 |= 384;
                                i18 = i17;
                            } else {
                                i18 = i17;
                                if ((i3 & 384) == 0) {
                                    i16 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j4) ? 256 : 128;
                                }
                                i19 = i4 & 8192;
                                if (i19 != 0) {
                                    int i38 = IAuthTabCallback + 75;
                                    i20 = i19;
                                    onWarmupCompleted = i38 % 128;
                                    i16 = i38 % 2 != 0 ? i16 | 19583 : i16 | 3072;
                                } else {
                                    i20 = i19;
                                    if ((i3 & 3072) == 0) {
                                        i16 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo) ? 2048 : 1024;
                                    }
                                    i21 = i4 & 16384;
                                    if (i21 == 0) {
                                        i16 |= 24576;
                                    } else if ((i3 & 24576) == 0) {
                                        i16 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallbackwithresult == null ? -1 : onextracallbackwithresult.ordinal()) ? 16384 : 8192;
                                    }
                                    i22 = 32768 & i4;
                                    if (i22 != 0) {
                                        i23 = i22;
                                        i24 = i21;
                                        if ((i3 & 196608) == 0) {
                                            obj2 = obj;
                                            i16 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(obj2) ? 131072 : 65536;
                                        }
                                        if ((i3 & 1572864) == 0) {
                                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                                                int i39 = IAuthTabCallback + 125;
                                                onWarmupCompleted = i39 % 128;
                                                if (i39 % 2 != 0) {
                                                    Object obj5 = null;
                                                    obj5.hashCode();
                                                    throw null;
                                                }
                                                i28 = 1048576;
                                            } else {
                                                i28 = 524288;
                                            }
                                            i16 |= i28;
                                        }
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i5) == 306783378 && (599187 & i16) == 599186) ? false : true, i5 & 1)) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                            if ((i2 & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i30 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                                int i40 = i6 != 0 ? 0 : i;
                                                boolean z4 = i7 != 0 ? false : z;
                                                if ((i4 & 32) != 0) {
                                                    gethumanreadablename3 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
                                                    i5 &= -458753;
                                                } else {
                                                    gethumanreadablename3 = gethumanreadablename;
                                                }
                                                jOnTransact = i8 != 0 ? setByteOrder.Companion.onTransact() : j;
                                                jOnNavigationEvent = i9 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
                                                jOnNavigationEvent2 = i10 != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j3;
                                                if (i12 != 0) {
                                                    int i41 = IAuthTabCallback + 35;
                                                    onWarmupCompleted = i41 % 128;
                                                    if (i41 % 2 != 0) {
                                                        fOnExtraCallback = VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback();
                                                        int i42 = 43 / 0;
                                                    } else {
                                                        fOnExtraCallback = VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback();
                                                    }
                                                } else {
                                                    fOnExtraCallback = f;
                                                }
                                                bindChildren bindchildren3 = i13 != 0 ? null : bindchildren;
                                                use useVar5 = i15 != 0 ? null : useVar;
                                                if (i18 != 0) {
                                                    int i43 = IAuthTabCallback + 41;
                                                    onWarmupCompleted = i43 % 128;
                                                    int i44 = i43 % 2;
                                                    jOnNavigationEvent3 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                                                } else {
                                                    jOnNavigationEvent3 = j4;
                                                }
                                                GraphicDeviceInfo graphicDeviceInfo4 = i20 != 0 ? null : graphicDeviceInfo;
                                                mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult4 = i24 != 0 ? mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.TopLeft : onextracallbackwithresult;
                                                if (i23 != 0) {
                                                    int i45 = onWarmupCompleted + 91;
                                                    useVar3 = useVar5;
                                                    IAuthTabCallback = i45 % 128;
                                                    int i46 = i45 % 2;
                                                    obj2 = null;
                                                } else {
                                                    useVar3 = useVar5;
                                                }
                                                f3 = fOnExtraCallback;
                                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                                z3 = z4;
                                                graphicDeviceInfo3 = graphicDeviceInfo4;
                                                onextracallbackwithresult3 = onextracallbackwithresult4;
                                                i26 = i40;
                                                obj4 = obj2;
                                                gethumanreadablename4 = gethumanreadablename3;
                                                j9 = jOnNavigationEvent3;
                                                useVar4 = useVar3;
                                                i27 = i5;
                                                bindchildren2 = bindchildren3;
                                            } else {
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                                if ((i4 & 32) != 0) {
                                                    i5 &= -458753;
                                                }
                                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                                i26 = i;
                                                z3 = z;
                                                gethumanreadablename4 = gethumanreadablename;
                                                jOnTransact = j;
                                                jOnNavigationEvent = j2;
                                                jOnNavigationEvent2 = j3;
                                                f3 = f;
                                                bindchildren2 = bindchildren;
                                                useVar4 = useVar;
                                                j9 = j4;
                                                graphicDeviceInfo3 = graphicDeviceInfo;
                                                onextracallbackwithresult3 = onextracallbackwithresult;
                                                obj4 = obj2;
                                                i27 = i5;
                                            }
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1790065425, i27, i16, "im.toss.tds.compose.component.anim.animatetop.v1.AnimateTopPreset.Infinite (TitlePreset.kt:312)");
                                            }
                                            if (jOnTransact != 16) {
                                                j10 = jOnTransact;
                                            } else {
                                                long jOnTransact2 = (!(iAuthTabCallbackStub instanceof mExternalSyntheticApiModelOutline1.onExtraCallback) || (numOnExtraCallbackWithResult = ((mExternalSyntheticApiModelOutline1.onExtraCallback) iAuthTabCallbackStub).onExtraCallbackWithResult()) == null) ? setByteOrder.Companion.onTransact() : ByteOrderedDataOutputStream.onExtraCallback(numOnExtraCallbackWithResult.intValue());
                                                j10 = jOnTransact2;
                                            }
                                            int i47 = i16 >> 15;
                                            int i48 = i27 >> 12;
                                            int i49 = i16 << 21;
                                            int i50 = i27;
                                            final mExternalSyntheticLambda8 mexternalsyntheticlambda8OnExtraCallback = onExtraCallback(obj4, gethumanreadablename4, j10, jOnNavigationEvent, jOnNavigationEvent2, createCameraCaptureCallback.onExtraCallback(mExternalSyntheticLambda7.onExtraCallbackWithResult(onextracallbackwithresult3)), f3, bindchildren2, useVar4, j9, graphicDeviceInfo3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i48 & 7168) | (i47 & 14) | (i48 & 112) | (i48 & 57344) | ((i27 >> 9) & 3670016) | (29360128 & i49) | (234881024 & i49) | (i49 & 1879048192), ((i16 >> 9) & 14) | (i47 & 112), 0);
                                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(mexternalsyntheticlambda8OnExtraCallback);
                                            boolean z5 = (i50 & 14) == 4;
                                            boolean z6 = (i50 & 112) == 32;
                                            boolean z7 = (i50 & 7168) == 2048;
                                            boolean z8 = (i50 & 57344) == 16384;
                                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                            if (!(zOnNavigationEvent | z5 | z6 | z7 | z8)) {
                                                Object obj6 = objOnMinimized;
                                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(mexternalsyntheticlambda8OnExtraCallback, hasprovider, iAuthTabCallbackStub, i26, z3, null);
                                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(iAuthTabCallback);
                                                    obj6 = iAuthTabCallback;
                                                }
                                                isZslDisabledByByUserCaseConfig.IAuthTabCallback(hasprovider, iAuthTabCallbackStub, Integer.valueOf(i26), (Function2) obj6, cameraCaptureResultEmptyCameraCaptureResult2, (i50 & 126) | ((i50 >> 3) & 896));
                                                final QuirkSettingsLoader quirkSettingsLoaderOnNavigationEvent = mExternalSyntheticLambda7.onNavigationEvent(onextracallbackwithresult3);
                                                mExternalSyntheticLambda7.onWarmupCompleted(-422700871, JsParamKeys.onExtraCallbackWithResult(), 422700876, new Object[]{this.onNavigationEvent, mexternalsyntheticlambda8OnExtraCallback, CollectionsKt.listOf(hasprovider), quirkSettingsLoaderOnNavigationEvent, quirksExternalSyntheticBackport03, ForwardingCameraControl.onExtraCallback(753335567, true, new Function2() { // from class: im.toss.tds.compose.component.anim.animatetop.v1.AnimateTopPreset$$ExternalSyntheticLambda0
                                                    private static int IAuthTabCallback = 1;
                                                    private static int onWarmupCompleted;

                                                    public final Object invoke(Object obj7, Object obj8) {
                                                        int i51 = 2 % 2;
                                                        int i52 = IAuthTabCallback + 21;
                                                        onWarmupCompleted = i52 % 128;
                                                        int i53 = i52 % 2;
                                                        Object[] objArr = {this.f$0, mexternalsyntheticlambda8OnExtraCallback, quirkSettingsLoaderOnNavigationEvent, (CameraCaptureResultEmptyCameraCaptureResult) obj7, Integer.valueOf(((Integer) obj8).intValue())};
                                                        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
                                                        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
                                                        Unit unit = (Unit) mc.IAuthTabCallback(543635435, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -543635433, iOnWarmupCompleted2, iOnWarmupCompleted, objArr);
                                                        int i54 = IAuthTabCallback + 65;
                                                        onWarmupCompleted = i54 % 128;
                                                        int i55 = i54 % 2;
                                                        return unit;
                                                    }
                                                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(((i50 << 6) & 57344) | 196608)}, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult());
                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                                }
                                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                                i25 = i26;
                                                z2 = z3;
                                                gethumanreadablename2 = gethumanreadablename4;
                                                f2 = f3;
                                                j5 = jOnTransact;
                                                j6 = jOnNavigationEvent;
                                                j8 = jOnNavigationEvent2;
                                                useVar2 = useVar4;
                                                j7 = j9;
                                                graphicDeviceInfo2 = graphicDeviceInfo3;
                                                onextracallbackwithresult2 = onextracallbackwithresult3;
                                                obj3 = obj4;
                                            }
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                            i25 = i;
                                            z2 = z;
                                            gethumanreadablename2 = gethumanreadablename;
                                            j5 = j;
                                            j6 = j2;
                                            f2 = f;
                                            bindchildren2 = bindchildren;
                                            useVar2 = useVar;
                                            j7 = j4;
                                            graphicDeviceInfo2 = graphicDeviceInfo;
                                            onextracallbackwithresult2 = onextracallbackwithresult;
                                            obj3 = obj2;
                                            j8 = j3;
                                        }
                                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                            final bindChildren bindchildren4 = bindchildren2;
                                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.anim.animatetop.v1.AnimateTopPreset$$ExternalSyntheticLambda1
                                                private static int onExtraCallback = 0;
                                                private static int onExtraCallbackWithResult = 1;

                                                public final Object invoke(Object obj7, Object obj8) {
                                                    int i51 = 2 % 2;
                                                    int i52 = onExtraCallback + 23;
                                                    onExtraCallbackWithResult = i52 % 128;
                                                    int i53 = i52 % 2;
                                                    Unit unitOnExtraCallback = mc.onExtraCallback(this.f$0, hasprovider, iAuthTabCallbackStub, quirksExternalSyntheticBackport02, i25, z2, gethumanreadablename2, j5, j6, j8, f2, bindchildren4, useVar2, j7, graphicDeviceInfo2, onextracallbackwithresult2, obj3, i2, i3, i4, (CameraCaptureResultEmptyCameraCaptureResult) obj7, ((Integer) obj8).intValue());
                                                    int i54 = onExtraCallback + 97;
                                                    onExtraCallbackWithResult = i54 % 128;
                                                    if (i54 % 2 != 0) {
                                                        return unitOnExtraCallback;
                                                    }
                                                    throw null;
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i23 = i22;
                                    int i51 = onWarmupCompleted + 9;
                                    i24 = i21;
                                    IAuthTabCallback = i51 % 128;
                                    int i52 = i51 % 2;
                                    i16 |= 196608;
                                    obj2 = obj;
                                    if ((i3 & 1572864) == 0) {
                                    }
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i5) == 306783378 && (599187 & i16) == 599186) ? false : true, i5 & 1)) {
                                    }
                                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                    }
                                }
                                i21 = i4 & 16384;
                                if (i21 == 0) {
                                }
                                i22 = 32768 & i4;
                                if (i22 != 0) {
                                }
                                obj2 = obj;
                                if ((i3 & 1572864) == 0) {
                                }
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i5) == 306783378 && (599187 & i16) == 599186) ? false : true, i5 & 1)) {
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                                }
                            }
                            i19 = i4 & 8192;
                            if (i19 != 0) {
                            }
                            i21 = i4 & 16384;
                            if (i21 == 0) {
                            }
                            i22 = 32768 & i4;
                            if (i22 != 0) {
                            }
                            obj2 = obj;
                            if ((i3 & 1572864) == 0) {
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i5) == 306783378 && (599187 & i16) == 599186) ? false : true, i5 & 1)) {
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            }
                        }
                        i13 = i4 & 1024;
                        if (i13 == 0) {
                        }
                        i15 = i4 & 2048;
                        if (i15 == 0) {
                        }
                        i16 = i14;
                        i17 = i4 & 4096;
                        if (i17 == 0) {
                        }
                        i19 = i4 & 8192;
                        if (i19 != 0) {
                        }
                        i21 = i4 & 16384;
                        if (i21 == 0) {
                        }
                        i22 = 32768 & i4;
                        if (i22 != 0) {
                        }
                        obj2 = obj;
                        if ((i3 & 1572864) == 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i5) == 306783378 && (599187 & i16) == 599186) ? false : true, i5 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        }
                    }
                    i10 = i4 & 256;
                    if (i10 != 0) {
                    }
                    i12 = i4 & 512;
                    if (i12 != 0) {
                    }
                    i13 = i4 & 1024;
                    if (i13 == 0) {
                    }
                    i15 = i4 & 2048;
                    if (i15 == 0) {
                    }
                    i16 = i14;
                    i17 = i4 & 4096;
                    if (i17 == 0) {
                    }
                    i19 = i4 & 8192;
                    if (i19 != 0) {
                    }
                    i21 = i4 & 16384;
                    if (i21 == 0) {
                    }
                    i22 = 32768 & i4;
                    if (i22 != 0) {
                    }
                    obj2 = obj;
                    if ((i3 & 1572864) == 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i5) == 306783378 && (599187 & i16) == 599186) ? false : true, i5 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                if ((i2 & 196608) == 0) {
                }
                i8 = i4 & 64;
                if (i8 == 0) {
                }
                i9 = i4 & 128;
                if (i9 == 0) {
                }
                i10 = i4 & 256;
                if (i10 != 0) {
                }
                i12 = i4 & 512;
                if (i12 != 0) {
                }
                i13 = i4 & 1024;
                if (i13 == 0) {
                }
                i15 = i4 & 2048;
                if (i15 == 0) {
                }
                i16 = i14;
                i17 = i4 & 4096;
                if (i17 == 0) {
                }
                i19 = i4 & 8192;
                if (i19 != 0) {
                }
                i21 = i4 & 16384;
                if (i21 == 0) {
                }
                i22 = 32768 & i4;
                if (i22 != 0) {
                }
                obj2 = obj;
                if ((i3 & 1572864) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i5) == 306783378 && (599187 & i16) == 599186) ? false : true, i5 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            if ((i2 & 196608) == 0) {
            }
            i8 = i4 & 64;
            if (i8 == 0) {
            }
            i9 = i4 & 128;
            if (i9 == 0) {
            }
            i10 = i4 & 256;
            if (i10 != 0) {
            }
            i12 = i4 & 512;
            if (i12 != 0) {
            }
            i13 = i4 & 1024;
            if (i13 == 0) {
            }
            i15 = i4 & 2048;
            if (i15 == 0) {
            }
            i16 = i14;
            i17 = i4 & 4096;
            if (i17 == 0) {
            }
            i19 = i4 & 8192;
            if (i19 != 0) {
            }
            i21 = i4 & 16384;
            if (i21 == 0) {
            }
            i22 = 32768 & i4;
            if (i22 != 0) {
            }
            obj2 = obj;
            if ((i3 & 1572864) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i5) == 306783378 && (599187 & i16) == 599186) ? false : true, i5 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        if ((i2 & 196608) == 0) {
        }
        i8 = i4 & 64;
        if (i8 == 0) {
        }
        i9 = i4 & 128;
        if (i9 == 0) {
        }
        i10 = i4 & 256;
        if (i10 != 0) {
        }
        i12 = i4 & 512;
        if (i12 != 0) {
        }
        i13 = i4 & 1024;
        if (i13 == 0) {
        }
        i15 = i4 & 2048;
        if (i15 == 0) {
        }
        i16 = i14;
        i17 = i4 & 4096;
        if (i17 == 0) {
        }
        i19 = i4 & 8192;
        if (i19 != 0) {
        }
        i21 = i4 & 16384;
        if (i21 == 0) {
        }
        i22 = 32768 & i4;
        if (i22 != 0) {
        }
        obj2 = obj;
        if ((i3 & 1572864) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(((306783379 & i5) == 306783378 && (599187 & i16) == 599186) ? false : true, i5 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final Unit onExtraCallback(mc mcVar, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            boolean z = mcVar.onExtraCallback;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        if (mcVar.onExtraCallback) {
            unregisterOutputSurface.onNavigationEvent(useandconfigureprogramwithtexture);
            int i3 = IAuthTabCallback + 113;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    public final mExternalSyntheticLambda8 onExtraCallback(@Nullable Object obj, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, @Nullable createCameraCaptureCallback createcameracapturecallback, float f, @Nullable bindChildren bindchildren, @Nullable use useVar, long j4, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        Object obj2;
        long jOnTransact;
        long jOnNavigationEvent;
        long jOnNavigationEvent2;
        int i4 = 2 % 2;
        if ((i3 & 1) != 0) {
            int i5 = onWarmupCompleted + 103;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            obj2 = null;
        } else {
            obj2 = obj;
        }
        getHumanReadableName gethumanreadablename2 = (i3 & 2) != 0 ? (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted()) : gethumanreadablename;
        if ((i3 & 4) != 0) {
            int i7 = onWarmupCompleted + 9;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        if ((i3 & 8) != 0) {
            int i9 = IAuthTabCallback + 27;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        } else {
            jOnNavigationEvent = j2;
        }
        long jOnNavigationEvent3 = (i3 & 16) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j3;
        createCameraCaptureCallback createcameracapturecallback2 = (i3 & 32) != 0 ? null : createcameracapturecallback;
        float fOnExtraCallback = (i3 & 64) != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f;
        bindChildren bindchildren2 = (i3 & 128) != 0 ? null : bindchildren;
        use useVar2 = (i3 & 256) != 0 ? null : useVar;
        if ((i3 & 512) != 0) {
            int i11 = onWarmupCompleted + 89;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            jOnNavigationEvent2 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        } else {
            jOnNavigationEvent2 = j4;
        }
        GraphicDeviceInfo graphicDeviceInfo2 = (i3 & 1024) != 0 ? null : graphicDeviceInfo;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1454105889, i, i2, "im.toss.tds.compose.component.anim.animatetop.v1.AnimateTopPreset.rememberTdsAnimateTopV1TextState (TitlePreset.kt:383)");
        }
        int i13 = i << 12;
        mExternalSyntheticLambda8 mexternalsyntheticlambda8OnNavigationEvent = mExternalSyntheticLambda5.onNavigationEvent(null, obj2, this.onNavigationEvent, null, this.onExtraCallbackWithResult, gethumanreadablename2, jOnTransact, jOnNavigationEvent, jOnNavigationEvent3, createcameracapturecallback2, fOnExtraCallback, bindchildren2, useVar2, jOnNavigationEvent2, graphicDeviceInfo2, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | (i13 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | (i13 & 1879048192), ((i >> 18) & 8190) | ((i2 << 12) & 57344), 9);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i14 = IAuthTabCallback + 121;
            onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return mexternalsyntheticlambda8OnNavigationEvent;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc)) {
            return false;
        }
        mc mcVar = (mc) obj;
        if (Intrinsics.areEqual(this.onNavigationEvent, mcVar.onNavigationEvent)) {
            int i2 = IAuthTabCallback + 123;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, mcVar.onExtraCallbackWithResult)) {
                int i4 = onWarmupCompleted + 117;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.onNavigationEvent.hashCode() * 31) + this.onExtraCallbackWithResult.hashCode();
        int i4 = onWarmupCompleted + 121;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public static /* synthetic */ Unit IAuthTabCallback(mc mcVar, mExternalSyntheticLambda8 mexternalsyntheticlambda8, QuirkSettingsLoader quirkSettingsLoader, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {mcVar, mexternalsyntheticlambda8, quirkSettingsLoader, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        return (Unit) IAuthTabCallback(543635435, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -543635433, iOnWarmupCompleted2, iOnWarmupCompleted, objArr);
    }

    private static final Unit onNavigationEvent(mc mcVar, hasProvider hasprovider, mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, boolean z, getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, bindChildren bindchildren, use useVar, long j4, GraphicDeviceInfo graphicDeviceInfo, mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, Object obj, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        Object[] objArr = {mcVar, hasprovider, iAuthTabCallbackStub, quirksExternalSyntheticBackport0, Integer.valueOf(i), Boolean.valueOf(z), gethumanreadablename, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Float.valueOf(f), bindchildren, useVar, Long.valueOf(j4), graphicDeviceInfo, onextracallbackwithresult, obj, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i5)};
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        return (Unit) IAuthTabCallback(26771502, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -26771502, iOnWarmupCompleted2, iOnWarmupCompleted, objArr);
    }

    public final void onExtraCallback(@NotNull mExternalSyntheticLambda8 mexternalsyntheticlambda8, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {this, mexternalsyntheticlambda8, quirksExternalSyntheticBackport0, quirkSettingsLoader, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        IAuthTabCallback(-212990389, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), 212990392, iOnWarmupCompleted2, iOnWarmupCompleted, objArr);
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @NotNull mExternalSyntheticApiModelOutline1.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, boolean z, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, long j3, float f, @Nullable bindChildren bindchildren, @Nullable use useVar, long j4, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult onextracallbackwithresult, @Nullable Object obj, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3, int i4) {
        Object[] objArr = {this, str, iAuthTabCallbackStub, quirksExternalSyntheticBackport0, Integer.valueOf(i), Boolean.valueOf(z), gethumanreadablename, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Float.valueOf(f), bindchildren, useVar, Long.valueOf(j4), graphicDeviceInfo, onextracallbackwithresult, obj, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        int iOnWarmupCompleted = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        int iOnWarmupCompleted2 = LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted();
        IAuthTabCallback(1231156830, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -1231156829, iOnWarmupCompleted2, iOnWarmupCompleted, objArr);
    }
}
