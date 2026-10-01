package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import java.util.Arrays;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.QuirksExternalSyntheticBackport0;
import o.decrementVideoUsage;
import o.isInVideoUsage;
import o.toPreviewOnlyRange;
import o.u7d;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class u7d {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static final /* synthetic */ class onWarmupCompleted {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;

        static {
            int[] iArr = new int[SessionProcessorBaseExternalSyntheticLambda1.values().length];
            try {
                iArr[SessionProcessorBaseExternalSyntheticLambda1.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SessionProcessorBaseExternalSyntheticLambda1.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SessionProcessorBaseExternalSyntheticLambda1.Inherit.ordinal()] = 3;
                int i = onExtraCallback + 17;
                onNavigationEvent = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            IAuthTabCallback = iArr;
            int i3 = onNavigationEvent + 1;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i5;
        int i9 = (~(i7 | i8 | (~i6))) | (~(i | i5 | i6));
        int i10 = (~(i8 | i6)) | (~(i8 | i));
        int i11 = (~(i6 | i5)) | i;
        int i12 = i + i5 + i4 + (1661237432 * i3) + (961048624 * i2);
        int i13 = i12 * i12;
        int i14 = ((119520104 * i) - 281083904) + ((-1329838950) * i5) + (i9 * 724679527) + (724679527 * i10) + ((-724679527) * i11) + ((-605159424) * i4) + ((-1559232512) * i3) + (1553989632 * i2) + (2020540416 * i13);
        int i15 = (i * (-2040814728)) + 92927091 + (i5 * (-2040813538)) + (i9 * (-595)) + (i10 * (-595)) + (i11 * 595) + (i4 * (-2040814133)) + (i3 * (-1614655000)) + (i2 * 500164112) + (i13 * 184877056);
        int i16 = i14 + (i15 * i15 * 1800994816);
        return i16 != 1 ? i16 != 2 ? onExtraCallback(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        UUID uuidOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            uuidOnWarmupCompleted = onWarmupCompleted();
            int i3 = 81 / 0;
        } else {
            uuidOnWarmupCompleted = onWarmupCompleted();
        }
        int i4 = IAuthTabCallback + 69;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return uuidOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0, va vaVar, isQueryRefinementEnabled isqueryrefinementenabled, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 99;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return onExtraCallbackWithResult(function0, vaVar, isqueryrefinementenabled, function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onExtraCallbackWithResult(function0, vaVar, isqueryrefinementenabled, function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 67;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 65;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0, va vaVar, isQueryRefinementEnabled isqueryrefinementenabled, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 33;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(function0, vaVar, isqueryrefinementenabled, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 107;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ decrementVideoUsage onExtraCallbackWithResult(u7c u7cVar, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        decrementVideoUsage decrementvideousageOnWarmupCompleted = onWarmupCompleted(u7cVar, isinvideousage);
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        return decrementvideousageOnWarmupCompleted;
    }

    public static final /* synthetic */ boolean onExtraCallbackWithResult(SessionProcessorBaseExternalSyntheticLambda1 sessionProcessorBaseExternalSyntheticLambda1, boolean z) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(sessionProcessorBaseExternalSyntheticLambda1, z);
        int i4 = onWarmupCompleted + 1;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 99 / 0;
        }
        return zOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(accessgetCameraFactoryp[] accessgetcamerafactorypArr, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 57;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            IAuthTabCallback(accessgetcamerafactorypArr, cameraPresenceProviderExternalSyntheticLambda6, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(accessgetcamerafactorypArr, cameraPresenceProviderExternalSyntheticLambda6, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onWarmupCompleted + 33;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(u7c u7cVar, Function0 function0, va vaVar, ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(u7cVar, function0, vaVar, extensionsManagerExtensionsAvailability);
        int i4 = IAuthTabCallback + 77;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) onExtraCallback(1683861890, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{useandconfigureprogramwithtexture}, iOnNavigationEvent3, iOnNavigationEvent2, -1683861888, iOnNavigationEvent);
        int i4 = onWarmupCompleted + 75;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return unit;
    }

    public static final class onNavigationEvent implements decrementVideoUsage {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ u7c onExtraCallback;

        public onNavigationEvent(u7c u7cVar) {
            this.onExtraCallback = u7cVar;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                this.onExtraCallback.dismiss();
                this.onExtraCallback.onWarmupCompleted();
            } else {
                this.onExtraCallback.dismiss();
                this.onExtraCallback.onWarmupCompleted();
                throw null;
            }
        }
    }

    private static final UUID onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        UUID uuidRandomUUID = UUID.randomUUID();
        int i4 = IAuthTabCallback + 27;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return uuidRandomUUID;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onWarmupCompleted(useandconfigureprogramwithtexture);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onWarmupCompleted(useandconfigureprogramwithtexture);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 67;
        onWarmupCompleted = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 == 0 ? (i & 3) != 2 : (i & 2) != 3, i & 1)) {
            int i4 = IAuthTabCallback + 109;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onWarmupCompleted + 93;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-673983717, i, -1, "im.toss.tds.compose.component.compound.bottomsheet.internal.ModalBottomSheetDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.kt:154)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomsheet.internal.ModalBottomSheetKt$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallbackWithResult + 101;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        Unit unitOnWarmupCompleted = u7d.onWarmupCompleted((useAndConfigureProgramWithTexture) obj);
                        int i11 = IAuthTabCallback + 21;
                        onExtraCallbackWithResult = i11 % 128;
                        if (i11 % 2 != 0) {
                            return unitOnWarmupCompleted;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            Object obj = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, (Function1) objOnMinimized, 1, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i8 = IAuthTabCallback + 51;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                int i9 = onWarmupCompleted + 37;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            ((Function2) onExtraCallback(1215044224, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, -1215044223, iOnNavigationEvent)).invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onWarmupCompleted + 57;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(accessgetCameraFactoryp[] accessgetcamerafactorypArr, final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallback + 7;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1160056411, i, -1, "im.toss.tds.compose.component.compound.bottomsheet.internal.ModalBottomSheetDialog.<anonymous>.<anonymous>.<anonymous> (ModalBottomSheet.kt:153)");
            }
            setPostviewFormatSelector.onExtraCallback((accessgetCameraFactoryp[]) Arrays.copyOf(accessgetcamerafactorypArr, accessgetcamerafactorypArr.length), ForwardingCameraControl.onExtraCallback(-673983717, true, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.internal.ModalBottomSheetKt$$ExternalSyntheticLambda6
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallback + 65;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = cameraPresenceProviderExternalSyntheticLambda6;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) obj;
                    if (i7 == 0) {
                        return u7d.onExtraCallback(cameraPresenceProviderExternalSyntheticLambda62, cameraCaptureResultEmptyCameraCaptureResult2, ((Integer) obj2).intValue());
                    }
                    u7d.onExtraCallback(cameraPresenceProviderExternalSyntheticLambda62, cameraCaptureResultEmptyCameraCaptureResult2, ((Integer) obj2).intValue());
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = onWarmupCompleted + 125;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(u7c u7cVar, Function0 function0, va vaVar, ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            u7cVar.onExtraCallback(function0, vaVar, extensionsManagerExtensionsAvailability);
            unit = Unit.INSTANCE;
            int i3 = 63 / 0;
        } else {
            u7cVar.onExtraCallback(function0, vaVar, extensionsManagerExtensionsAvailability);
            unit = Unit.INSTANCE;
        }
        int i4 = IAuthTabCallback + 55;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull final Function0<Unit> function0, @NotNull final va vaVar, @NotNull final isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, @NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        CameraConfigBuilder cameraConfigBuilder;
        Enum r18;
        int i3;
        Object obj;
        final u7c u7cVar;
        boolean zOnNavigationEvent;
        Object objOnMinimized;
        boolean zOnNavigationEvent2;
        boolean z2;
        boolean z3;
        boolean zOnExtraCallback;
        Object objOnMinimized2;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = onWarmupCompleted + 103;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(vaVar, "");
        Intrinsics.checkNotNullParameter(isqueryrefinementenabled, "");
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1677103976);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i9 = onWarmupCompleted + 121;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(vaVar)) {
                i5 = 32;
            } else {
                int i11 = IAuthTabCallback + 63;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 3 % 4;
                }
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            int i13 = IAuthTabCallback + 77;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
            i2 |= (i & 512) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(isqueryrefinementenabled) : cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            int i15 = IAuthTabCallback + 13;
            onWarmupCompleted = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 5 / 0;
                i4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 2048 : 1024;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
            }
            i2 |= i4;
        }
        int i17 = i2;
        if ((i17 & 1171) != 1170) {
            int i18 = onWarmupCompleted + 1;
            IAuthTabCallback = i18 % 128;
            int i19 = i18 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i17 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1677103976, i17, -1, "im.toss.tds.compose.component.compound.bottomsheet.internal.ModalBottomSheetDialog (ModalBottomSheet.kt:128)");
            }
            View view = (View) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallbackDefault());
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            Enum r1 = (ExtensionsManagerExtensionsAvailability) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.IAuthTabCallbackStubProxy());
            CameraConfigBuilder cameraConfigBuilderIAuthTabCallback = getAwbState.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i17 >> 9) & 14);
            Object[] objArr = new Object[0];
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = new Function0() { // from class: im.toss.tds.compose.component.compound.bottomsheet.internal.ModalBottomSheetKt$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        UUID uuid;
                        int i20 = 2 % 2;
                        int i21 = IAuthTabCallback + 9;
                        onWarmupCompleted = i21 % 128;
                        if (i21 % 2 != 0) {
                            int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                            int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                            int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                            uuid = (UUID) u7d.onExtraCallback(1383378144, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[0], iOnNavigationEvent3, iOnNavigationEvent2, -1383378144, iOnNavigationEvent);
                            int i22 = 24 / 0;
                        } else {
                            int iOnNavigationEvent4 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                            int iOnNavigationEvent5 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                            int iOnNavigationEvent6 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
                            uuid = (UUID) u7d.onExtraCallback(1383378144, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[0], iOnNavigationEvent6, iOnNavigationEvent5, -1383378144, iOnNavigationEvent4);
                        }
                        int i23 = onWarmupCompleted + 97;
                        IAuthTabCallback = i23 % 128;
                        int i24 = i23 % 2;
                        return uuid;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
            }
            UUID uuid = (UUID) RememberSaveableKt.IAuthTabCallback(objArr, (Function0) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized4 = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
            }
            findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized4;
            boolean zOnExtraCallbackWithResult = addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            final accessgetCameraFactoryp<?>[] accessgetcamerafactorypArrOnNavigationEvent = lExternalSyntheticLambda5.onNavigationEvent((accessisMonitoringp[]) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(lExternalSyntheticLambda5.onNavigationEvent()), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(view);
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4);
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!zOnNavigationEvent3 && !zOnNavigationEvent4) {
                cameraConfigBuilder = cameraConfigBuilderIAuthTabCallback;
                if (objOnMinimized5 != onwarmupcompleted.onExtraCallback()) {
                    r18 = r1;
                    i3 = i17;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    obj = objOnMinimized5;
                }
                u7cVar = (u7c) obj;
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(u7cVar);
                objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (!zOnNavigationEvent || objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomsheet.internal.ModalBottomSheetKt$$ExternalSyntheticLambda3
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2) {
                            decrementVideoUsage decrementvideousageOnExtraCallbackWithResult;
                            int i20 = 2 % 2;
                            int i21 = onWarmupCompleted + 101;
                            onNavigationEvent = i21 % 128;
                            if (i21 % 2 == 0) {
                                decrementvideousageOnExtraCallbackWithResult = u7d.onExtraCallbackWithResult(u7cVar, (isInVideoUsage) obj2);
                                int i22 = 30 / 0;
                            } else {
                                decrementvideousageOnExtraCallbackWithResult = u7d.onExtraCallbackWithResult(u7cVar, (isInVideoUsage) obj2);
                            }
                            int i23 = onWarmupCompleted + 77;
                            onNavigationEvent = i23 % 128;
                            if (i23 % 2 == 0) {
                                int i24 = 71 / 0;
                            }
                            return decrementvideousageOnExtraCallbackWithResult;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                    int i20 = IAuthTabCallback + 17;
                    onWarmupCompleted = i20 % 128;
                    int i21 = i20 % 2;
                }
                isZslDisabledByByUserCaseConfig.onExtraCallback(u7cVar, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(u7cVar);
                if ((i3 & 14) != 4) {
                    int i22 = IAuthTabCallback + 57;
                    onWarmupCompleted = i22 % 128;
                    int i23 = i22 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = (i3 & 112) != 32;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(r18.ordinal());
                objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (!(zOnNavigationEvent2 | z2 | z3 | zOnExtraCallback) || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    final Enum r3 = r18;
                    objOnMinimized2 = new Function0() { // from class: im.toss.tds.compose.component.compound.bottomsheet.internal.ModalBottomSheetKt$$ExternalSyntheticLambda4
                        private static int onExtraCallbackWithResult = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke() {
                            int i24 = 2 % 2;
                            int i25 = onWarmupCompleted + 39;
                            onExtraCallbackWithResult = i25 % 128;
                            int i26 = i25 % 2;
                            Unit unitOnWarmupCompleted = u7d.onWarmupCompleted(u7cVar, function0, vaVar, r3);
                            int i27 = onExtraCallbackWithResult + 33;
                            onWarmupCompleted = i27 % 128;
                            int i28 = i27 % 2;
                            return unitOnWarmupCompleted;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent((Function0) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i24 = IAuthTabCallback + 99;
                    onWarmupCompleted = i24 % 128;
                    int i25 = i24 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraConfigBuilder = cameraConfigBuilderIAuthTabCallback;
            }
            Intrinsics.checkNotNull(uuid);
            CameraConfigBuilder cameraConfigBuilder2 = cameraConfigBuilder;
            r18 = r1;
            i3 = i17;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            u7c u7cVar2 = new u7c(function0, vaVar, view, r18, r8lambdanm9dm2eewl4vrptnjmesfjqky4, uuid, isqueryrefinementenabled, findresandmsg, zOnExtraCallbackWithResult);
            u7cVar2.onExtraCallbackWithResult(cameraConfigBuilder2, ForwardingCameraControl.onExtraCallbackWithResult(1160056411, true, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.internal.ModalBottomSheetKt$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i26 = 2 % 2;
                    int i27 = onExtraCallback + 17;
                    onWarmupCompleted = i27 % 128;
                    Object obj4 = null;
                    if (i27 % 2 == 0) {
                        u7d.onNavigationEvent(accessgetcamerafactorypArrOnNavigationEvent, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        obj4.hashCode();
                        throw null;
                    }
                    Unit unitOnNavigationEvent = u7d.onNavigationEvent(accessgetcamerafactorypArrOnNavigationEvent, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i28 = onWarmupCompleted + 43;
                    onExtraCallback = i28 % 128;
                    if (i28 % 2 == 0) {
                        return unitOnNavigationEvent;
                    }
                    obj4.hashCode();
                    throw null;
                }
            }));
            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(u7cVar2);
            obj = u7cVar2;
            u7cVar = (u7c) obj;
            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(u7cVar);
            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if (!zOnNavigationEvent) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomsheet.internal.ModalBottomSheetKt$$ExternalSyntheticLambda3
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj2) {
                        decrementVideoUsage decrementvideousageOnExtraCallbackWithResult;
                        int i202 = 2 % 2;
                        int i212 = onWarmupCompleted + 101;
                        onNavigationEvent = i212 % 128;
                        if (i212 % 2 == 0) {
                            decrementvideousageOnExtraCallbackWithResult = u7d.onExtraCallbackWithResult(u7cVar, (isInVideoUsage) obj2);
                            int i222 = 30 / 0;
                        } else {
                            decrementvideousageOnExtraCallbackWithResult = u7d.onExtraCallbackWithResult(u7cVar, (isInVideoUsage) obj2);
                        }
                        int i232 = onWarmupCompleted + 77;
                        onNavigationEvent = i232 % 128;
                        if (i232 % 2 == 0) {
                            int i242 = 71 / 0;
                        }
                        return decrementvideousageOnExtraCallbackWithResult;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                int i202 = IAuthTabCallback + 17;
                onWarmupCompleted = i202 % 128;
                int i212 = i202 % 2;
                isZslDisabledByByUserCaseConfig.onExtraCallback(u7cVar, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(u7cVar);
                if ((i3 & 14) != 4) {
                }
                if ((i3 & 112) != 32) {
                }
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(r18.ordinal());
                objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (!(zOnNavigationEvent2 | z2 | z3 | zOnExtraCallback)) {
                    final ExtensionsManagerExtensionsAvailability r32 = r18;
                    objOnMinimized2 = new Function0() { // from class: im.toss.tds.compose.component.compound.bottomsheet.internal.ModalBottomSheetKt$$ExternalSyntheticLambda4
                        private static int onExtraCallbackWithResult = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke() {
                            int i242 = 2 % 2;
                            int i252 = onWarmupCompleted + 39;
                            onExtraCallbackWithResult = i252 % 128;
                            int i26 = i252 % 2;
                            Unit unitOnWarmupCompleted = u7d.onWarmupCompleted(u7cVar, function0, vaVar, r32);
                            int i27 = onExtraCallbackWithResult + 33;
                            onWarmupCompleted = i27 % 128;
                            int i28 = i27 % 2;
                            return unitOnWarmupCompleted;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                    isZslDisabledByByUserCaseConfig.onNavigationEvent((Function0) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.internal.ModalBottomSheetKt$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj2, Object obj3) {
                    int i26 = 2 % 2;
                    int i27 = onExtraCallback + 103;
                    IAuthTabCallback = i27 % 128;
                    if (i27 % 2 != 0) {
                        return u7d.onExtraCallback(function0, vaVar, isqueryrefinementenabled, function2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    Unit unitOnExtraCallback = u7d.onExtraCallback(function0, vaVar, isqueryrefinementenabled, function2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i28 = 83 / 0;
                    return unitOnExtraCallback;
                }
            });
        }
    }

    public static final boolean onExtraCallbackWithResult(@NotNull View view) {
        WindowManager.LayoutParams layoutParams;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams)) {
            layoutParams = null;
        } else {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
            int i4 = IAuthTabCallback + 105;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
        return (layoutParams == null || (layoutParams.flags & 8192) == 0) ? false : true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final boolean onWarmupCompleted(SessionProcessorBaseExternalSyntheticLambda1 sessionProcessorBaseExternalSyntheticLambda1, boolean z) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int i4 = onWarmupCompleted.IAuthTabCallback[sessionProcessorBaseExternalSyntheticLambda1.ordinal()];
        if (i4 == 1) {
            return false;
        }
        int i5 = IAuthTabCallback + 105;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        if (i4 == 2) {
            return true;
        }
        if (i4 == 3) {
            return z;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final decrementVideoUsage onWarmupCompleted(u7c u7cVar, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        u7cVar.show();
        onNavigationEvent onnavigationevent = new onNavigationEvent(u7cVar);
        int i2 = onWarmupCompleted + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return onnavigationevent;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Function2 function2 = (Function2) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        int i5 = IAuthTabCallback + 87;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return function2;
        }
        throw null;
    }

    public static /* synthetic */ UUID IAuthTabCallback() {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (UUID) onExtraCallback(1383378144, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[0], iOnNavigationEvent3, iOnNavigationEvent2, -1383378144, iOnNavigationEvent);
    }

    private static final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<? extends Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>> cameraPresenceProviderExternalSyntheticLambda6) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Function2) onExtraCallback(1215044224, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, iOnNavigationEvent3, iOnNavigationEvent2, -1215044223, iOnNavigationEvent);
    }

    private static final Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnNavigationEvent = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallback(1683861890, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{useandconfigureprogramwithtexture}, iOnNavigationEvent3, iOnNavigationEvent2, -1683861888, iOnNavigationEvent);
    }
}
