package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AFg1iSDK;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import o.QuirksExternalSyntheticBackport0;
import o.decrementVideoUsage;
import o.isInVideoUsage;
import o.isQueryRefinementEnabled;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import o.vdefault;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class vdefault {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[SessionProcessorBaseExternalSyntheticLambda1.values().length];
            try {
                iArr[SessionProcessorBaseExternalSyntheticLambda1.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SessionProcessorBaseExternalSyntheticLambda1.SecureOn.ordinal()] = 2;
                int i = onNavigationEvent + 123;
                onWarmupCompleted = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SessionProcessorBaseExternalSyntheticLambda1.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallback = iArr;
            int i4 = onWarmupCompleted + 55;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 70 / 0;
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        edefault edefaultVar = (edefault) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        AFg1iSDK aFg1iSDK = (AFg1iSDK) objArr[2];
        ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability = (ExtensionsManagerExtensionsAvailability) objArr[3];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(edefaultVar, function0, aFg1iSDK, extensionsManagerExtensionsAvailability);
        }
        onExtraCallbackWithResult(edefaultVar, function0, aFg1iSDK, extensionsManagerExtensionsAvailability);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        SessionProcessorBaseExternalSyntheticLambda1 sessionProcessorBaseExternalSyntheticLambda1 = (SessionProcessorBaseExternalSyntheticLambda1) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(sessionProcessorBaseExternalSyntheticLambda1, zBooleanValue);
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        int i5 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return Boolean.valueOf(zIAuthTabCallback);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ UUID onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        UUID uuidIAuthTabCallback = IAuthTabCallback();
        int i4 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return uuidIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ decrementVideoUsage onExtraCallbackWithResult(edefault edefaultVar, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback(edefaultVar, isinvideousage);
        }
        onExtraCallback(edefaultVar, isinvideousage);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~((~i6) | i7);
        int i9 = (~i2) | (~(i7 | i6));
        int i10 = i6 | i2 | i7;
        int i11 = i2 + i5 + i3 + (1635157569 * i) + ((-1141649966) * i4);
        int i12 = i11 * i11;
        int i13 = (((-1186836012) * i2) - 711983104) + (488484398 * i5) + (i8 * 1309823443) + (1309823443 * i9) + ((-1309823443) * i10) + (1798307840 * i3) + (1462763520 * i) + (1566572544 * i4) + (1631846400 * i12);
        int i14 = (i2 * 1521345644) + 2088555610 + (i5 * 1521346098) + (i8 * (-227)) + (i9 * (-227)) + (i10 * 227) + (i3 * 1521345871) + (i * (-1382509809)) + (i4 * 37969358) + (i12 * (-671350784));
        int i15 = i13 + (i14 * i14 * (-1069809664));
        return i15 != 1 ? i15 != 2 ? onExtraCallback(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        AFg1iSDK aFg1iSDK = (AFg1iSDK) objArr[1];
        isQueryRefinementEnabled isqueryrefinementenabled = (isQueryRefinementEnabled) objArr[2];
        Function2 function2 = (Function2) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function0, aFg1iSDK, isqueryrefinementenabled, function2, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i4 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(Function0 function0, AFg1iSDK aFg1iSDK, isQueryRefinementEnabled isqueryrefinementenabled, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            onExtraCallbackWithResult(function0, aFg1iSDK, isqueryrefinementenabled, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        } else {
            onExtraCallbackWithResult(function0, aFg1iSDK, isqueryrefinementenabled, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(useandconfigureprogramwithtexture);
        int i4 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static final class IAuthTabCallback implements decrementVideoUsage {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ edefault onNavigationEvent;

        public IAuthTabCallback(edefault edefaultVar) {
            this.onNavigationEvent = edefaultVar;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.onNavigationEvent.dismiss();
            this.onNavigationEvent.onWarmupCompleted();
            int i4 = onWarmupCompleted + 125;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final UUID IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return UUID.randomUUID();
        }
        UUID.randomUUID();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onWarmupCompleted(useandconfigureprogramwithtexture);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 23;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 67;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                z = true;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            } else {
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i7 = onWarmupCompleted + 85;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1187046786, i, -1, "im.toss.tosssecurities.uikit.compound.topsheet.internal.ModalBottomSheetDialog.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.kt:148)");
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.internal.ModalBottomSheetKt$$ExternalSyntheticLambda5
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallbackWithResult;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i9 = 2 % 2;
                            int i10 = onExtraCallbackWithResult + 113;
                            IAuthTabCallback = i10 % 128;
                            int i11 = i10 % 2;
                            Unit unitOnNavigationEvent = vdefault.onNavigationEvent((useAndConfigureProgramWithTexture) obj);
                            int i12 = onExtraCallbackWithResult + 111;
                            IAuthTabCallback = i12 % 128;
                            if (i12 % 2 == 0) {
                                int i13 = 5 / 0;
                            }
                            return unitOnNavigationEvent;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, (Function1) objOnMinimized, 1, (Object) null);
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (true ^ cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6).invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i9 = onExtraCallbackWithResult + 81;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
            return Unit.INSTANCE;
        }
        int i11 = i3 + 115;
        onWarmupCompleted = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 2 % 5;
        }
        z = false;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(edefault edefaultVar, Function0 function0, AFg1iSDK aFg1iSDK, ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        edefaultVar.onExtraCallbackWithResult(function0, aFg1iSDK, extensionsManagerExtensionsAvailability);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull final Function0<Unit> function0, @NotNull final AFg1iSDK aFg1iSDK, @NotNull final isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, @NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        CameraConfigBuilder cameraConfigBuilder;
        Enum r18;
        Enum r19;
        int i3;
        boolean z;
        final edefault edefaultVar;
        boolean zOnExtraCallback;
        Object objOnMinimized;
        boolean zOnExtraCallback2;
        boolean z2;
        boolean zOnExtraCallback3;
        int i4;
        boolean zOnExtraCallback4;
        int i5;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(aFg1iSDK, "");
        Intrinsics.checkNotNullParameter(isqueryrefinementenabled, "");
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-326160885);
        if ((i & 6) == 0) {
            int i7 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(aFg1iSDK) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i & Imgcodecs.IMWRITE_AVIF_QUALITY) == 0) {
                int i9 = onWarmupCompleted + 73;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(isqueryrefinementenabled);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(isqueryrefinementenabled);
            } else {
                zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled);
            }
            if (zOnExtraCallback4) {
                int i10 = onWarmupCompleted + 83;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
                int i12 = onWarmupCompleted + 59;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        int i14 = i2;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i14 & 1171) != 1170, i14 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i15 = onExtraCallbackWithResult + 71;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-326160885, i14, -1, "im.toss.tosssecurities.uikit.compound.topsheet.internal.ModalBottomSheetDialog (ModalBottomSheet.kt:124)");
            }
            View view = (View) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallbackDefault());
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            Enum r1 = (ExtensionsManagerExtensionsAvailability) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.IAuthTabCallbackStubProxy());
            CameraConfigBuilder cameraConfigBuilderIAuthTabCallback = getAwbState.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i14 >> 9) & 14);
            Object[] objArr = new Object[0];
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new Function0() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.internal.ModalBottomSheetKt$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i17 = 2 % 2;
                        int i18 = IAuthTabCallback + 75;
                        onExtraCallback = i18 % 128;
                        int i19 = i18 % 2;
                        UUID uuidOnExtraCallback = vdefault.onExtraCallback();
                        int i20 = onExtraCallback + 123;
                        IAuthTabCallback = i20 % 128;
                        int i21 = i20 % 2;
                        return uuidOnExtraCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            UUID uuid = (UUID) RememberSaveableKt.IAuthTabCallback(objArr, (Function0) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
            }
            findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized3;
            boolean zOnExtraCallbackWithResult = addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(view);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4);
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!zOnNavigationEvent && !zOnNavigationEvent2) {
                cameraConfigBuilder = cameraConfigBuilderIAuthTabCallback;
                int i17 = onExtraCallbackWithResult + 99;
                r18 = r1;
                onWarmupCompleted = i17 % 128;
                int i18 = i17 % 2;
                if (objOnMinimized4 != onwarmupcompleted.onExtraCallback()) {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    r19 = r18;
                    z = true;
                    i3 = i14;
                }
                edefaultVar = (edefault) objOnMinimized4;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(edefaultVar);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (!zOnExtraCallback || objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.internal.ModalBottomSheetKt$$ExternalSyntheticLambda2
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i19 = 2 % 2;
                            int i20 = onExtraCallbackWithResult + 59;
                            onWarmupCompleted = i20 % 128;
                            if (i20 % 2 != 0) {
                                vdefault.onExtraCallbackWithResult(edefaultVar, (isInVideoUsage) obj2);
                                throw null;
                            }
                            decrementVideoUsage decrementvideousageOnExtraCallbackWithResult = vdefault.onExtraCallbackWithResult(edefaultVar, (isInVideoUsage) obj2);
                            int i21 = onExtraCallbackWithResult + 53;
                            onWarmupCompleted = i21 % 128;
                            int i22 = i21 % 2;
                            return decrementvideousageOnExtraCallbackWithResult;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                }
                isZslDisabledByByUserCaseConfig.onExtraCallback(edefaultVar, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(edefaultVar);
                if ((i3 & 14) != 4) {
                    int i19 = onWarmupCompleted;
                    int i20 = i19 + 109;
                    onExtraCallbackWithResult = i20 % 128;
                    int i21 = i20 % 2;
                    int i22 = i19 + 31;
                    onExtraCallbackWithResult = i22 % 128;
                    int i23 = i22 % 2;
                    z2 = z;
                } else {
                    z2 = false;
                }
                if ((i3 & 112) != 32) {
                    z = false;
                }
                zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(r19.ordinal());
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (zOnExtraCallback2 | z2 | z | zOnExtraCallback3) {
                    int i24 = onExtraCallbackWithResult + 77;
                    onWarmupCompleted = i24 % 128;
                    if (i24 % 2 == 0) {
                        int i25 = 35 / 0;
                        if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                            final Enum r0 = r19;
                            objOnMinimized5 = new Function0() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.internal.ModalBottomSheetKt$$ExternalSyntheticLambda3
                                private static int onExtraCallback = 1;
                                private static int onNavigationEvent;

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i26 = 2 % 2;
                                    int i27 = onNavigationEvent + 63;
                                    onExtraCallback = i27 % 128;
                                    int i28 = i27 % 2;
                                    Object[] objArr2 = {edefaultVar, function0, aFg1iSDK, r0};
                                    int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
                                    Unit unit = (Unit) vdefault.onNavigationEvent(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -933650236, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), objArr2, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 933650237, iOnWarmupCompleted);
                                    int i29 = onExtraCallback + 125;
                                    onNavigationEvent = i29 % 128;
                                    if (i29 % 2 != 0) {
                                        int i30 = 60 / 0;
                                    }
                                    return unit;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized5);
                        }
                    } else if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent((Function0) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i26 = onWarmupCompleted + 79;
                        onExtraCallbackWithResult = i26 % 128;
                        int i27 = i26 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            } else {
                cameraConfigBuilder = cameraConfigBuilderIAuthTabCallback;
                r18 = r1;
            }
            Intrinsics.checkNotNull(uuid);
            CameraConfigBuilder cameraConfigBuilder2 = cameraConfigBuilder;
            r19 = r18;
            i3 = i14;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            edefault edefaultVar2 = new edefault(function0, aFg1iSDK, view, r19, r8lambdanm9dm2eewl4vrptnjmesfjqky4, uuid, isqueryrefinementenabled, findresandmsg, zOnExtraCallbackWithResult);
            z = true;
            edefaultVar2.onExtraCallbackWithResult(cameraConfigBuilder2, ForwardingCameraControl.onExtraCallbackWithResult(-1187046786, true, new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.internal.ModalBottomSheetKt$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i28 = 2 % 2;
                    int i29 = onExtraCallbackWithResult + 43;
                    onExtraCallback = i29 % 128;
                    int i30 = i29 % 2;
                    Unit unitOnExtraCallbackWithResult = vdefault.onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i31 = onExtraCallbackWithResult + 81;
                    onExtraCallback = i31 % 128;
                    int i32 = i31 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            }));
            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(edefaultVar2);
            objOnMinimized4 = edefaultVar2;
            edefaultVar = (edefault) objOnMinimized4;
            zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(edefaultVar);
            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if (!zOnExtraCallback) {
                objOnMinimized = new Function1() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.internal.ModalBottomSheetKt$$ExternalSyntheticLambda2
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i192 = 2 % 2;
                        int i202 = onExtraCallbackWithResult + 59;
                        onWarmupCompleted = i202 % 128;
                        if (i202 % 2 != 0) {
                            vdefault.onExtraCallbackWithResult(edefaultVar, (isInVideoUsage) obj2);
                            throw null;
                        }
                        decrementVideoUsage decrementvideousageOnExtraCallbackWithResult = vdefault.onExtraCallbackWithResult(edefaultVar, (isInVideoUsage) obj2);
                        int i212 = onExtraCallbackWithResult + 53;
                        onWarmupCompleted = i212 % 128;
                        int i222 = i212 % 2;
                        return decrementvideousageOnExtraCallbackWithResult;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                isZslDisabledByByUserCaseConfig.onExtraCallback(edefaultVar, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(edefaultVar);
                if ((i3 & 14) != 4) {
                }
                if ((i3 & 112) != 32) {
                }
                zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(r19.ordinal());
                Object objOnMinimized52 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (zOnExtraCallback2 | z2 | z | zOnExtraCallback3) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.internal.ModalBottomSheetKt$$ExternalSyntheticLambda4
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int i28 = 2 % 2;
                    int i29 = onNavigationEvent + 51;
                    onExtraCallback = i29 % 128;
                    int i30 = i29 % 2;
                    Function0 function02 = function0;
                    AFg1iSDK aFg1iSDK2 = aFg1iSDK;
                    isQueryRefinementEnabled isqueryrefinementenabled2 = isqueryrefinementenabled;
                    Function2 function22 = function2;
                    int i31 = i;
                    int iIntValue = ((Integer) obj3).intValue();
                    Object[] objArr2 = {function02, aFg1iSDK2, isqueryrefinementenabled2, function22, Integer.valueOf(i31), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                    int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
                    Unit unit = (Unit) vdefault.onNavigationEvent(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 1474399677, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), objArr2, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -1474399675, iOnWarmupCompleted);
                    int i32 = onNavigationEvent + 39;
                    onExtraCallback = i32 % 128;
                    int i33 = i32 % 2;
                    return unit;
                }
            });
        }
    }

    public static final boolean onExtraCallbackWithResult(@NotNull View view) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            boolean z = view.getRootView().getLayoutParams() instanceof WindowManager.LayoutParams;
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return false;
        }
        int i3 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            if ((layoutParams2.flags & 13373) == 0) {
                return false;
            }
        } else if ((layoutParams2.flags & TTHistoryActivity2.SIZE) == 0) {
            return false;
        }
        int i4 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    private static final boolean IAuthTabCallback(SessionProcessorBaseExternalSyntheticLambda1 sessionProcessorBaseExternalSyntheticLambda1, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult.onExtraCallback[sessionProcessorBaseExternalSyntheticLambda1.ordinal()];
        if (i2 == 1) {
            return false;
        }
        int i3 = onWarmupCompleted;
        int i4 = i3 + 105;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        if (i2 == 2) {
            int i6 = i3 + 5;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i7 = i3 + 79;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 28 / 0;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final decrementVideoUsage onExtraCallback(edefault edefaultVar, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        edefaultVar.show();
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(edefaultVar);
        int i2 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private static final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<? extends Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = (Function2) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return function2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(edefault edefaultVar, Function0 function0, AFg1iSDK aFg1iSDK, ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability) {
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        int iOnWarmupCompleted2 = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -933650236, iOnWarmupCompleted2, new Object[]{edefaultVar, function0, aFg1iSDK, extensionsManagerExtensionsAvailability}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 933650237, iOnWarmupCompleted);
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0, AFg1iSDK aFg1iSDK, isQueryRefinementEnabled isqueryrefinementenabled, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {function0, aFg1iSDK, isqueryrefinementenabled, function2, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return (Unit) onNavigationEvent(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 1474399677, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -1474399675, iOnWarmupCompleted);
    }

    public static final /* synthetic */ boolean onExtraCallbackWithResult(SessionProcessorBaseExternalSyntheticLambda1 sessionProcessorBaseExternalSyntheticLambda1, boolean z) {
        Object[] objArr = {sessionProcessorBaseExternalSyntheticLambda1, Boolean.valueOf(z)};
        int iOnWarmupCompleted = DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted();
        return ((Boolean) onNavigationEvent(DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), -2132862052, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), objArr, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 2132862052, iOnWarmupCompleted)).booleanValue();
    }
}
