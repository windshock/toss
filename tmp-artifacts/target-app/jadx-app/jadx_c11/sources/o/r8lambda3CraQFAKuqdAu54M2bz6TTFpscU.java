package o;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.PopupLayout;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ACPayResult;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ExtensionsManager1;
import o.Futures3;
import o.QuirksExternalSyntheticBackport0;
import o.decrementVideoUsage;
import o.getStreamSharingChildren;
import o.isInVideoUsage;
import o.lExternalSyntheticLambda7;
import o.r8lambda3CraQFAKuqdAu54M2bz6TTFpscU;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda3CraQFAKuqdAu54M2bz6TTFpscU {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static final class IAuthTabCallback implements decrementVideoUsage {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public void dispose() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 121;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 115;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 51;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ UUID onExtraCallback() {
        UUID uuidOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            uuidOnWarmupCompleted = onWarmupCompleted();
            int i3 = 82 / 0;
        } else {
            uuidOnWarmupCompleted = onWarmupCompleted();
        }
        int i4 = onExtraCallback + 11;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return uuidOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(PopupLayout popupLayout, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(popupLayout, futures3);
        int i4 = onNavigationEvent + 9;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(SessionProcessorBaseExternalSyntheticLambda0 sessionProcessorBaseExternalSyntheticLambda0, Function0 function0, PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 45;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(sessionProcessorBaseExternalSyntheticLambda0, function0, previewProcessorOnCaptureResultCallback, function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 22 / 0;
        }
        int i7 = onExtraCallback + 7;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 4 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ decrementVideoUsage onExtraCallback(PopupLayout popupLayout, SessionProcessorBaseExternalSyntheticLambda0 sessionProcessorBaseExternalSyntheticLambda0, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(popupLayout, sessionProcessorBaseExternalSyntheticLambda0, isinvideousage);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        decrementVideoUsage decrementvideousageOnWarmupCompleted = onWarmupCompleted(popupLayout, sessionProcessorBaseExternalSyntheticLambda0, isinvideousage);
        int i3 = onNavigationEvent + 103;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 97 / 0;
        }
        return decrementvideousageOnWarmupCompleted;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = (~i) | i8;
        int i10 = i7 | (~i9);
        int i11 = i | i8;
        int i12 = ~(i9 | i6);
        int i13 = i3 + i6 + i4 + (1075552530 * i5) + ((-1519595880) * i2);
        int i14 = i13 * i13;
        int i15 = (((-1050772794) * i3) - 1639710720) + ((-2116975300) * i6) + (i10 * (-533101253)) + (533101253 * i11) + ((-533101253) * i12) + ((-1583874048) * i4) + ((-189792256) * i5) + (1111490560 * i2) + (1415839744 * i14);
        int i16 = (i3 * 251836610) + 257048825 + (i6 * 251838484) + (i10 * 937) + (i11 * (-937)) + (i12 * 937) + (i4 * 251837547) + (i5 * 1710852742) + (i2 * (-1855850104)) + (i14 * (-1244921856));
        int i17 = i15 + (i16 * i16 * (-1300496384));
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        PopupLayout popupLayout = (PopupLayout) objArr[0];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(popupLayout, cameraPresenceProviderExternalSyntheticLambda6, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onNavigationEvent + 51;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(ACPayResult.onWarmupCompleted(), new Object[]{useandconfigureprogramwithtexture}, ACPayResult.onWarmupCompleted(), -1455127636, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1455127637);
        int i4 = onNavigationEvent + 11;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        PopupLayout popupLayout = (PopupLayout) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback = (PreviewProcessorOnCaptureResultCallback) objArr[2];
        String str = (String) objArr[3];
        ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability = (ExtensionsManagerExtensionsAvailability) objArr[4];
        isInVideoUsage isinvideousage = (isInVideoUsage) objArr[5];
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(popupLayout, function0, previewProcessorOnCaptureResultCallback, str, extensionsManagerExtensionsAvailability, isinvideousage);
        }
        onExtraCallback(popupLayout, function0, previewProcessorOnCaptureResultCallback, str, extensionsManagerExtensionsAvailability, isinvideousage);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(PopupLayout popupLayout, Function0 function0, PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback, String str, ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(popupLayout, function0, previewProcessorOnCaptureResultCallback, str, extensionsManagerExtensionsAvailability);
        int i4 = onNavigationEvent + 115;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    private static final Unit onNavigationEvent(SessionProcessorBaseExternalSyntheticLambda0 sessionProcessorBaseExternalSyntheticLambda0, Function0 function0, PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 89;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            Object[] objArr = {sessionProcessorBaseExternalSyntheticLambda0, function0, previewProcessorOnCaptureResultCallback, function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))};
            onExtraCallbackWithResult(ACPayResult.onWarmupCompleted(), objArr, ACPayResult.onWarmupCompleted(), 1635335826, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -1635335826);
        } else {
            Object[] objArr2 = {sessionProcessorBaseExternalSyntheticLambda0, function0, previewProcessorOnCaptureResultCallback, function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))};
            onExtraCallbackWithResult(ACPayResult.onWarmupCompleted(), objArr2, ACPayResult.onWarmupCompleted(), 1635335826, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -1635335826);
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 35;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(PopupLayout popupLayout, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(popupLayout, extensionsManager1);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(popupLayout, extensionsManager1);
        int i3 = onExtraCallback + 49;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted implements decrementVideoUsage {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ PopupLayout onWarmupCompleted;

        public onWarmupCompleted(PopupLayout popupLayout) {
            this.onWarmupCompleted = popupLayout;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onWarmupCompleted.IAuthTabCallbackStub();
            this.onWarmupCompleted.onWarmupCompleted();
            int i4 = onExtraCallback + 49;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final UUID onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        UUID uuidRandomUUID = UUID.randomUUID();
        int i4 = onNavigationEvent + 109;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return uuidRandomUUID;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.IAuthTabCallbackDefault(useandconfigureprogramwithtexture);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 55;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(PopupLayout popupLayout, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        popupLayout.setPopupContentSize-fhxjrPA(extensionsManager1);
        popupLayout.IAuthTabCallback_Parcel();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 115;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallback + 21;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallback + 121;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1338237751, i, -1, "im.toss.tds.compose.component.compound.menu.internal.TdsMenuPopup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsMenuPopup.kt:93)");
            }
            onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<? extends Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>>) cameraPresenceProviderExternalSyntheticLambda6).invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallback + 97;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i8 = 98 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(final PopupLayout popupLayout, final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        float f;
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onExtraCallback + 103;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(519186911, i, -1, "im.toss.tds.compose.component.compound.menu.internal.TdsMenuPopup.<anonymous>.<anonymous>.<anonymous> (TdsMenuPopup.kt:82)");
                    int i4 = 94 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(519186911, i, -1, "im.toss.tds.compose.component.compound.menu.internal.TdsMenuPopup.<anonymous>.<anonymous>.<anonymous> (TdsMenuPopup.kt:82)");
                }
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.compound.menu.internal.TdsMenuPopupKt$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj) {
                        int i5 = 2 % 2;
                        int i6 = onExtraCallback + 55;
                        onExtraCallbackWithResult = i6 % 128;
                        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj;
                        if (i6 % 2 != 0) {
                            r8lambda3CraQFAKuqdAu54M2bz6TTFpscU.onExtraCallbackWithResult(useandconfigureprogramwithtexture);
                            throw null;
                        }
                        Unit unitOnExtraCallbackWithResult = r8lambda3CraQFAKuqdAu54M2bz6TTFpscU.onExtraCallbackWithResult(useandconfigureprogramwithtexture);
                        int i7 = onExtraCallbackWithResult + 71;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, (Function1) objOnMinimized, 1, (Object) null);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(popupLayout);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.compound.menu.internal.TdsMenuPopupKt$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke(Object obj) {
                        int i5 = 2 % 2;
                        int i6 = onExtraCallback + 119;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                        Unit unitOnWarmupCompleted = r8lambda3CraQFAKuqdAu54M2bz6TTFpscU.onWarmupCompleted(popupLayout, (ExtensionsManager1) obj);
                        int i8 = IAuthTabCallback + 49;
                        onExtraCallback = i8 % 128;
                        if (i8 % 2 == 0) {
                            return unitOnWarmupCompleted;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = calculatePlaceholderForExtensions.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (Function1) objOnMinimized2);
            if (popupLayout.onExtraCallbackWithResult()) {
                int i5 = onNavigationEvent + 39;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = onCaptureSessionStart.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult2, f);
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-1338237751, true, new Function2() { // from class: im.toss.tds.compose.component.compound.menu.internal.TdsMenuPopupKt$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i7 = 2 % 2;
                    int i8 = onNavigationEvent + 95;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitIAuthTabCallback = r8lambda3CraQFAKuqdAu54M2bz6TTFpscU.IAuthTabCallback(cameraPresenceProviderExternalSyntheticLambda6, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i10 = onExtraCallback + 25;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    return unitIAuthTabCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = lExternalSyntheticLambda7.onExtraCallback.onExtraCallback;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
            component5 component5Var = (component5) objOnMinimized3;
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i7 = onNavigationEvent + 49;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    getAwbState.onExtraCallback();
                    int i8 = 90 / 0;
                } else {
                    getAwbState.onExtraCallback();
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i9 = onExtraCallback + 19;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5Var, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            encoderProfilesProxyVideoProfileProxyOnExtraCallback.invoke(cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i11 = onExtraCallback + 105;
        onNavigationEvent = i11 % 128;
        int i12 = i11 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(PopupLayout popupLayout, Function0 function0, PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback, String str, ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 87;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            popupLayout.onExtraCallback(function0, previewProcessorOnCaptureResultCallback, str, extensionsManagerExtensionsAvailability);
            return Unit.INSTANCE;
        }
        popupLayout.onExtraCallback(function0, previewProcessorOnCaptureResultCallback, str, extensionsManagerExtensionsAvailability);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ PopupLayout $popupLayout;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(PopupLayout popupLayout, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$popupLayout = popupLayout;
        }

        public static /* synthetic */ Unit onNavigationEvent(long j) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 117;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(j);
            int i4 = onExtraCallback + 21;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$popupLayout, access13800Var);
            onextracallbackwithresult.L$0 = obj;
            int i2 = onExtraCallback + 57;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 117;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 15 / 0;
            }
            int i5 = onExtraCallback + 61;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        private static final Unit onExtraCallback(long j) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 17;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0044 -> B:26:0x0063). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Object obj2 = null;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (findRes.onWarmupCompleted(findresandmsg)) {
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = onExtraCallback + 31;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
                this.$popupLayout.asBinder();
                if (findRes.onWarmupCompleted(findresandmsg)) {
                    Function1 function1 = new Function1() { // from class: im.toss.tds.compose.component.compound.menu.internal.TdsMenuPopupKt$TdsMenuPopup$4$1$$ExternalSyntheticLambda0
                        private static int onExtraCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj3) {
                            int i4 = 2 % 2;
                            int i5 = onExtraCallback + 51;
                            onWarmupCompleted = i5 % 128;
                            int i6 = i5 % 2;
                            Unit unitOnNavigationEvent = r8lambda3CraQFAKuqdAu54M2bz6TTFpscU.onExtraCallbackWithResult.onNavigationEvent(((Long) obj3).longValue());
                            int i7 = onWarmupCompleted + 61;
                            onExtraCallback = i7 % 128;
                            int i8 = i7 % 2;
                            return unitOnNavigationEvent;
                        }
                    };
                    this.L$0 = findresandmsg;
                    this.label = 1;
                    if (applyThumbTint.IAuthTabCallback(function1, this) == objOnWarmupCompleted) {
                        int i4 = onExtraCallback;
                        int i5 = i4 + 11;
                        IAuthTabCallback = i5 % 128;
                        if (i5 % 2 == 0) {
                            obj2.hashCode();
                            throw null;
                        }
                        int i6 = i4 + 73;
                        IAuthTabCallback = i6 % 128;
                        if (i6 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                    this.$popupLayout.asBinder();
                    if (findRes.onWarmupCompleted(findresandmsg)) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    private static final Unit onNavigationEvent(PopupLayout popupLayout, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(futures3, "");
        Futures3 futures3IAuthTabCallbackDefault = futures3.IAuthTabCallbackDefault();
        Intrinsics.checkNotNull(futures3IAuthTabCallbackDefault);
        popupLayout.onNavigationEvent(futures3IAuthTabCallbackDefault);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 121;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final class onExtraCallback implements component5 {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ ExtensionsManagerExtensionsAvailability onExtraCallbackWithResult;
        final /* synthetic */ PopupLayout onNavigationEvent;

        onExtraCallback(PopupLayout popupLayout, ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability) {
            this.onNavigationEvent = popupLayout;
            this.onExtraCallbackWithResult = extensionsManagerExtensionsAvailability;
        }

        public static /* synthetic */ Unit onExtraCallback(getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 117;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(onextracallbackwithresult);
            if (i3 == 0) {
                int i4 = 43 / 0;
            }
            int i5 = IAuthTabCallback + 41;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return unitIAuthTabCallback;
            }
            throw null;
        }

        private static final Unit IAuthTabCallback(getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
                return Unit.INSTANCE;
            }
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            int i3 = 89 / 0;
            return Unit.INSTANCE;
        }

        public final component8 onExtraCallbackWithResult(component4 component4Var, List<? extends component7> list, long j) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(component4Var, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.onNavigationEvent.setParentLayoutDirection(this.onExtraCallbackWithResult);
            component8 component8VarIAuthTabCallback = component4.IAuthTabCallback(component4Var, 0, 0, (Map) null, new Function1() { // from class: im.toss.tds.compose.component.compound.menu.internal.TdsMenuPopupKt$TdsMenuPopup$7$1$$ExternalSyntheticLambda0
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onWarmupCompleted + 85;
                    onExtraCallbackWithResult = i3 % 128;
                    getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult = (getStreamSharingChildren.onExtraCallbackWithResult) obj;
                    if (i3 % 2 == 0) {
                        return r8lambda3CraQFAKuqdAu54M2bz6TTFpscU.onExtraCallback.onExtraCallback(onextracallbackwithresult);
                    }
                    r8lambda3CraQFAKuqdAu54M2bz6TTFpscU.onExtraCallback.onExtraCallback(onextracallbackwithresult);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }, 4, (Object) null);
            int i2 = IAuthTabCallback + 123;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return component8VarIAuthTabCallback;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        int i;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i2;
        Function2 function2;
        PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback;
        Throwable th;
        Enum r17;
        String str;
        int i3;
        Throwable th2;
        boolean z;
        boolean zOnExtraCallback;
        final SessionProcessorBaseExternalSyntheticLambda0 sessionProcessorBaseExternalSyntheticLambda0 = (SessionProcessorBaseExternalSyntheticLambda0) objArr[0];
        final Function0 function0 = (Function0) objArr[1];
        PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback2 = (PreviewProcessorOnCaptureResultCallback) objArr[2];
        Function2 function22 = (Function2) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorBaseExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(previewProcessorOnCaptureResultCallback2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(37877130);
        if ((iIntValue & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(sessionProcessorBaseExternalSyntheticLambda0) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(previewProcessorOnCaptureResultCallback2) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22) ? 2048 : 1024;
        }
        int i5 = i;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i5 & 1171) == 1170), i5 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(37877130, i5, -1, "im.toss.tds.compose.component.compound.menu.internal.TdsMenuPopup (TdsMenuPopup.kt:60)");
            }
            View view = (View) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallbackDefault());
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            String str2 = (String) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AdvancedSessionProcessorRequestProcessorImplAdapter.onExtraCallbackWithResult());
            Enum r2 = (ExtensionsManagerExtensionsAvailability) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.IAuthTabCallbackStubProxy());
            CameraConfigBuilder cameraConfigBuilderIAuthTabCallback = getAwbState.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function22, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i5 >> 9) & 14);
            Object[] objArr2 = new Object[0];
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.menu.internal.TdsMenuPopupKt$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke() {
                        int i6 = 2 % 2;
                        int i7 = IAuthTabCallback + 35;
                        onExtraCallback = i7 % 128;
                        if (i7 % 2 == 0) {
                            r8lambda3CraQFAKuqdAu54M2bz6TTFpscU.onExtraCallback();
                            throw null;
                        }
                        UUID uuidOnExtraCallback = r8lambda3CraQFAKuqdAu54M2bz6TTFpscU.onExtraCallback();
                        int i8 = IAuthTabCallback + 79;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        return uuidOnExtraCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            UUID uuid = (UUID) RememberSaveableKt.IAuthTabCallback(objArr2, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
            MappingRedirectableLiveDataExternalSyntheticLambda1 mappingRedirectableLiveDataExternalSyntheticLambda1OnExtraCallbackWithResult = xa.onWarmupCompleted.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                Intrinsics.checkNotNull(uuid);
                str = str2;
                th2 = null;
                i3 = i5;
                r17 = r2;
                i2 = iIntValue;
                function2 = function22;
                previewProcessorOnCaptureResultCallback = previewProcessorOnCaptureResultCallback2;
                final PopupLayout popupLayout = new PopupLayout(function0, previewProcessorOnCaptureResultCallback2, str, view, r8lambdanm9dm2eewl4vrptnjmesfjqky4, sessionProcessorBaseExternalSyntheticLambda0, uuid, false, (PreviewProcessorExternalSyntheticLambda0) null, 256, (DefaultConstructorMarker) null);
                onNavigationEvent(popupLayout, r8lambdanm9dm2eewl4vrptnjmesfjqky4, mappingRedirectableLiveDataExternalSyntheticLambda1OnExtraCallbackWithResult);
                popupLayout.setContent(cameraConfigBuilderIAuthTabCallback, ForwardingCameraControl.onExtraCallbackWithResult(519186911, true, new Function2() { // from class: im.toss.tds.compose.component.compound.menu.internal.TdsMenuPopupKt$$ExternalSyntheticLambda4
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallbackWithResult + 125;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        PopupLayout popupLayout2 = popupLayout;
                        if (i8 != 0) {
                            Object[] objArr3 = {popupLayout2, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
                            return (Unit) r8lambda3CraQFAKuqdAu54M2bz6TTFpscU.onExtraCallbackWithResult(ACPayResult.onWarmupCompleted(), objArr3, ACPayResult.onWarmupCompleted(), -929381597, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 929381599);
                        }
                        Object[] objArr4 = {popupLayout2, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                }));
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(popupLayout);
                objOnMinimized2 = popupLayout;
            } else {
                r17 = r2;
                str = str2;
                i3 = i5;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i2 = iIntValue;
                function2 = function22;
                previewProcessorOnCaptureResultCallback = previewProcessorOnCaptureResultCallback2;
                th2 = null;
            }
            final PopupLayout popupLayout2 = (PopupLayout) objOnMinimized2;
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(popupLayout2);
            int i6 = i3;
            int i7 = i6 & 112;
            if (i7 == 32) {
                int i8 = onNavigationEvent + 41;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                z = false;
            }
            int i10 = i6 & 896;
            final String str3 = str;
            boolean z2 = i10 == 256;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str3);
            boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(r17.ordinal());
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback2 | z | z2 | zOnNavigationEvent | zOnExtraCallback3)) {
                int i11 = onNavigationEvent + 83;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    final PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback3 = previewProcessorOnCaptureResultCallback;
                    final Enum r8 = r17;
                    Function1 function1 = new Function1() { // from class: im.toss.tds.compose.component.compound.menu.internal.TdsMenuPopupKt$$ExternalSyntheticLambda5
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj) {
                            decrementVideoUsage decrementvideousage;
                            int i13 = 2 % 2;
                            int i14 = IAuthTabCallback + 39;
                            onNavigationEvent = i14 % 128;
                            if (i14 % 2 != 0) {
                                Object[] objArr3 = {popupLayout2, function0, previewProcessorOnCaptureResultCallback3, str3, r8, (isInVideoUsage) obj};
                                decrementvideousage = (decrementVideoUsage) r8lambda3CraQFAKuqdAu54M2bz6TTFpscU.onExtraCallbackWithResult(ACPayResult.onWarmupCompleted(), objArr3, ACPayResult.onWarmupCompleted(), -961548189, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 961548192);
                                int i15 = 10 / 0;
                            } else {
                                Object[] objArr4 = {popupLayout2, function0, previewProcessorOnCaptureResultCallback3, str3, r8, (isInVideoUsage) obj};
                                decrementvideousage = (decrementVideoUsage) r8lambda3CraQFAKuqdAu54M2bz6TTFpscU.onExtraCallbackWithResult(ACPayResult.onWarmupCompleted(), objArr4, ACPayResult.onWarmupCompleted(), -961548189, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 961548192);
                            }
                            int i16 = IAuthTabCallback + 17;
                            onNavigationEvent = i16 % 128;
                            if (i16 % 2 == 0) {
                                return decrementvideousage;
                            }
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function1);
                    objOnMinimized3 = function1;
                }
                int i13 = PopupLayout.onExtraCallbackWithResult;
                isZslDisabledByByUserCaseConfig.onExtraCallback(popupLayout2, (Function1) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, i13);
                boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(popupLayout2);
                boolean z3 = i7 == 32;
                boolean z4 = i10 == 256;
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str3);
                boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(r17.ordinal());
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((zOnExtraCallback4 | z3 | z4 | zOnNavigationEvent2 | zOnExtraCallback5) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    final PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback4 = previewProcessorOnCaptureResultCallback;
                    final Enum r82 = r17;
                    Function0 function02 = new Function0() { // from class: im.toss.tds.compose.component.compound.menu.internal.TdsMenuPopupKt$$ExternalSyntheticLambda6
                        private static int onExtraCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke() {
                            int i14 = 2 % 2;
                            int i15 = onExtraCallback + 27;
                            onNavigationEvent = i15 % 128;
                            int i16 = i15 % 2;
                            Unit unitOnNavigationEvent = r8lambda3CraQFAKuqdAu54M2bz6TTFpscU.onNavigationEvent(popupLayout2, function0, previewProcessorOnCaptureResultCallback4, str3, r82);
                            int i17 = onNavigationEvent + 77;
                            onExtraCallback = i17 % 128;
                            if (i17 % 2 == 0) {
                                return unitOnNavigationEvent;
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function02);
                    objOnMinimized4 = function02;
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent((Function0) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult, 0);
                boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(popupLayout2);
                int i14 = i6 & 14;
                boolean z5 = i14 == 4;
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(!(zOnExtraCallback6 | z5))) {
                    objOnMinimized5 = new Function1() { // from class: im.toss.tds.compose.component.compound.menu.internal.TdsMenuPopupKt$$ExternalSyntheticLambda7
                        private static int onExtraCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj) {
                            int i15 = 2 % 2;
                            int i16 = onExtraCallback + 111;
                            onNavigationEvent = i16 % 128;
                            int i17 = i16 % 2;
                            decrementVideoUsage decrementvideousageOnExtraCallback = r8lambda3CraQFAKuqdAu54M2bz6TTFpscU.onExtraCallback(popupLayout2, sessionProcessorBaseExternalSyntheticLambda0, (isInVideoUsage) obj);
                            int i18 = onNavigationEvent + 37;
                            onExtraCallback = i18 % 128;
                            if (i18 % 2 == 0) {
                                return decrementvideousageOnExtraCallback;
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                    isZslDisabledByByUserCaseConfig.onExtraCallback(sessionProcessorBaseExternalSyntheticLambda0, (Function1) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult, i14);
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(popupLayout2);
                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnExtraCallback) {
                        int i15 = onExtraCallback + 67;
                        onNavigationEvent = i15 % 128;
                        if (i15 % 2 != 0) {
                            onwarmupcompleted.onExtraCallback();
                            th2.hashCode();
                            throw th2;
                        }
                        if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                            th = th2;
                            objOnMinimized6 = new onExtraCallbackWithResult(popupLayout2, th);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
                        } else {
                            th = th2;
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(popupLayout2, (Function2) objOnMinimized6, cameraCaptureResultEmptyCameraCaptureResult, i13);
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(popupLayout2);
                        Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (zOnExtraCallback7 || objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized7 = new Function1() { // from class: im.toss.tds.compose.component.compound.menu.internal.TdsMenuPopupKt$$ExternalSyntheticLambda8
                                private static int IAuthTabCallback = 1;
                                private static int onNavigationEvent;

                                public final Object invoke(Object obj) {
                                    int i16 = 2 % 2;
                                    int i17 = onNavigationEvent + 125;
                                    IAuthTabCallback = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        r8lambda3CraQFAKuqdAu54M2bz6TTFpscU.onExtraCallback(popupLayout2, (Futures3) obj);
                                        throw null;
                                    }
                                    Unit unitOnExtraCallback = r8lambda3CraQFAKuqdAu54M2bz6TTFpscU.onExtraCallback(popupLayout2, (Futures3) obj);
                                    int i18 = onNavigationEvent + 107;
                                    IAuthTabCallback = i18 % 128;
                                    if (i18 % 2 == 0) {
                                        int i19 = 86 / 0;
                                    }
                                    return unitOnExtraCallback;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized7);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(onextracallback, (Function1) objOnMinimized7);
                        boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(popupLayout2);
                        boolean zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(r17.ordinal());
                        Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if ((zOnExtraCallback8 | zOnExtraCallback9) || objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized8 = new onExtraCallback(popupLayout2, r17);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized8);
                        }
                        component5 component5Var = (component5) objOnMinimized8;
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                            int i16 = onExtraCallback + 85;
                            onNavigationEvent = i16 % 128;
                            if (i16 % 2 != 0) {
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                                th.hashCode();
                                throw th;
                            }
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                            int i17 = onExtraCallback + 71;
                            onNavigationEvent = i17 % 128;
                            int i18 = i17 % 2;
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5Var, onextracallbackwithresult.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                } else {
                    int i19 = onExtraCallback + 111;
                    onNavigationEvent = i19 % 128;
                    if (i19 % 2 != 0) {
                        Throwable th3 = th2;
                        onwarmupcompleted.onExtraCallback();
                        throw th3;
                    }
                    if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                    }
                    isZslDisabledByByUserCaseConfig.onExtraCallback(sessionProcessorBaseExternalSyntheticLambda0, (Function1) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult, i14);
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(popupLayout2);
                    Object objOnMinimized62 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnExtraCallback) {
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i2 = iIntValue;
            function2 = function22;
            previewProcessorOnCaptureResultCallback = previewProcessorOnCaptureResultCallback2;
            th = null;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i20 = onExtraCallback + 119;
            onNavigationEvent = i20 % 128;
            int i21 = i20 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback5 = previewProcessorOnCaptureResultCallback;
            final Function2 function23 = function2;
            final int i22 = i2;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.menu.internal.TdsMenuPopupKt$$ExternalSyntheticLambda9
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj, Object obj2) {
                    int i23 = 2 % 2;
                    int i24 = IAuthTabCallback + 61;
                    onExtraCallback = i24 % 128;
                    int i25 = i24 % 2;
                    Unit unitOnExtraCallback = r8lambda3CraQFAKuqdAu54M2bz6TTFpscU.onExtraCallback(sessionProcessorBaseExternalSyntheticLambda0, function0, previewProcessorOnCaptureResultCallback5, function23, i22, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i26 = IAuthTabCallback + 35;
                    onExtraCallback = i26 % 128;
                    int i27 = i26 % 2;
                    return unitOnExtraCallback;
                }
            });
        }
        return th;
    }

    private static final void onNavigationEvent(PopupLayout popupLayout, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, MappingRedirectableLiveDataExternalSyntheticLambda1 mappingRedirectableLiveDataExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (Build.VERSION.SDK_INT >= 31) {
            int i4 = onExtraCallback + 33;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            float fOnExtraCallback = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(mappingRedirectableLiveDataExternalSyntheticLambda1.asBinder());
            if (i5 != 0) {
                popupLayout.setElevation(fOnExtraCallback);
                int i6 = 3 / 0;
            } else {
                popupLayout.setElevation(fOnExtraCallback);
            }
        }
        int i7 = onExtraCallback + 101;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final decrementVideoUsage onExtraCallback(PopupLayout popupLayout, Function0 function0, PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback, String str, ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        popupLayout.access000();
        popupLayout.onExtraCallback(function0, previewProcessorOnCaptureResultCallback, str, extensionsManagerExtensionsAvailability);
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(popupLayout);
        int i2 = onExtraCallback + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return onwarmupcompleted;
    }

    private static final decrementVideoUsage onWarmupCompleted(PopupLayout popupLayout, SessionProcessorBaseExternalSyntheticLambda0 sessionProcessorBaseExternalSyntheticLambda0, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        popupLayout.setPositionProvider(sessionProcessorBaseExternalSyntheticLambda0);
        popupLayout.IAuthTabCallback_Parcel();
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback();
        int i2 = onExtraCallback + 53;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return iAuthTabCallback;
        }
        throw null;
    }

    private static final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<? extends Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = (Function2) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            return function2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ decrementVideoUsage IAuthTabCallback(PopupLayout popupLayout, Function0 function0, PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback, String str, ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability, isInVideoUsage isinvideousage) {
        return (decrementVideoUsage) onExtraCallbackWithResult(ACPayResult.onWarmupCompleted(), new Object[]{popupLayout, function0, previewProcessorOnCaptureResultCallback, str, extensionsManagerExtensionsAvailability, isinvideousage}, ACPayResult.onWarmupCompleted(), -961548189, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 961548192);
    }

    public static /* synthetic */ Unit onWarmupCompleted(PopupLayout popupLayout, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {popupLayout, cameraPresenceProviderExternalSyntheticLambda6, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallbackWithResult(ACPayResult.onWarmupCompleted(), objArr, ACPayResult.onWarmupCompleted(), -929381597, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 929381599);
    }

    public static final void onNavigationEvent(@NotNull SessionProcessorBaseExternalSyntheticLambda0 sessionProcessorBaseExternalSyntheticLambda0, @Nullable Function0<Unit> function0, @NotNull PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback, @NotNull Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {sessionProcessorBaseExternalSyntheticLambda0, function0, previewProcessorOnCaptureResultCallback, function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        onExtraCallbackWithResult(ACPayResult.onWarmupCompleted(), objArr, ACPayResult.onWarmupCompleted(), 1635335826, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), -1635335826);
    }

    private static final Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        return (Unit) onExtraCallbackWithResult(ACPayResult.onWarmupCompleted(), new Object[]{useandconfigureprogramwithtexture}, ACPayResult.onWarmupCompleted(), -1455127636, ACPayResult.onWarmupCompleted(), ACPayResult.onWarmupCompleted(), 1455127637);
    }
}
