package o;

import android.view.View;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import androidx.compose.ui.window.PopupLayout;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ExtensionsManager1;
import o.Futures3;
import o.QuirksExternalSyntheticBackport0;
import o.decrementVideoUsage;
import o.isInVideoUsage;
import o.lExternalSyntheticLambda7;
import o.lExternalSyntheticLambda8;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class lExternalSyntheticLambda8 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static final class IAuthTabCallback implements decrementVideoUsage {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public void dispose() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        PopupLayout popupLayout = (PopupLayout) objArr[0];
        Futures3 futures3 = (Futures3) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(popupLayout, futures3);
        }
        IAuthTabCallback(popupLayout, futures3);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        boolean z;
        Object obj;
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = i8 | i3;
        int i10 = (~(i7 | i8)) | (~(i7 | i3)) | (~i9);
        int i11 = ~i3;
        int i12 = (~(i4 | i11 | i6)) | (~(i7 | i11 | i8)) | (~(i9 | i6));
        int i13 = ~(i8 | i11 | i6);
        int i14 = i3 + i6 + i5 + ((-973178360) * i) + (1542423572 * i2);
        int i15 = i14 * i14;
        int i16 = (i3 * (-490823948)) + 944362368 + (i6 * (-490821954)) + (i10 * (-997)) + (i12 * 997) + (i13 * 997) + ((-490822951) * i5) + (2145288392 * i) + (779328756 * i2) + (i15 * (-1138819072));
        int i17 = (((-1657973228) * i3) - 1073741824) + ((-187520530) * i6) + ((-735226349) * i10) + (i12 * 735226349) + (735226349 * i13) + ((-922746880) * i5) + (1207959552 * i) + ((-1275068416) * i2) + (196542464 * i15) + (i16 * i16 * 1440284672);
        boolean z2 = true;
        if (i17 != 1) {
            return i17 != 2 ? i17 != 3 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        QuirkSettingsLoader quirkSettingsLoaderAccess100 = (QuirkSettingsLoader) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        Function0 function0 = (Function0) objArr[3];
        PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback = (PreviewProcessorOnCaptureResultCallback) objArr[4];
        Function2 function2 = (Function2) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int iIntValue2 = ((Number) objArr[8]).intValue();
        int i18 = 2 % 2;
        int i19 = onNavigationEvent + 79;
        onExtraCallback = i19 % 128;
        int i20 = i19 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if ((iIntValue2 & 1) != 0) {
            int i21 = onNavigationEvent + 29;
            onExtraCallback = i21 % 128;
            int i22 = i21 % 2;
            quirkSettingsLoaderAccess100 = QuirkSettingsLoader.Companion.access100();
        }
        if ((iIntValue2 & 2) != 0) {
            jLongValue = ExtensionsInfoExternalSyntheticLambda0.onNavigationEvent(0L);
        }
        if ((iIntValue2 & 4) != 0) {
            function0 = null;
        }
        if ((8 & iIntValue2) != 0) {
            previewProcessorOnCaptureResultCallback = new PreviewProcessorOnCaptureResultCallback(false, false, false, false, 15, (DefaultConstructorMarker) null);
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i23 = onExtraCallback + 15;
            onNavigationEvent = i23 % 128;
            int i24 = i23 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2139164641, iIntValue, -1, "im.toss.tds.compose.component.popup (PopupModifier.kt:43)");
        }
        if ((((iIntValue & 112) ^ 48) <= 32 || (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirkSettingsLoaderAccess100))) && (iIntValue & 48) != 32) {
            z = false;
        } else {
            int i25 = onNavigationEvent + 103;
            onExtraCallback = i25 % 128;
            int i26 = i25 % 2;
            z = true;
        }
        if ((((iIntValue & 896) ^ 384) <= 256 || !cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(jLongValue)) && (iIntValue & 384) != 256) {
            z2 = false;
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(z2 | z)) {
            obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                onNextImageAvailable onnextimageavailable = new onNextImageAvailable(quirkSettingsLoaderAccess100, jLongValue, (DefaultConstructorMarker) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(onnextimageavailable);
                obj = onnextimageavailable;
            }
        }
        int i27 = iIntValue >> 3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) onExtraCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -5169673, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{quirksExternalSyntheticBackport0, (onNextImageAvailable) obj, function0, previewProcessorOnCaptureResultCallback, function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i27 & 57344) | (iIntValue & 14) | (i27 & 896) | (i27 & 7168)), 0}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 5169673);
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return quirksExternalSyntheticBackport02;
        }
        CameraConfigExternalSyntheticLambda0.onTransact();
        return quirksExternalSyntheticBackport02;
    }

    public static /* synthetic */ Unit onExtraCallback(PopupLayout popupLayout, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(popupLayout, extensionsManager1);
        int i4 = onExtraCallback + 1;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(PopupLayout popupLayout, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 97;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(popupLayout, cameraPresenceProviderExternalSyntheticLambda6, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 111;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ UUID onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback();
        }
        IAuthTabCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(PopupLayout popupLayout, Function0 function0, PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback, String str, ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(popupLayout, function0, previewProcessorOnCaptureResultCallback, str, extensionsManagerExtensionsAvailability);
        int i4 = onExtraCallback + 59;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(PopupLayout popupLayout, ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability, RelativeLayoutBounds relativeLayoutBounds) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(popupLayout, extensionsManagerExtensionsAvailability, relativeLayoutBounds);
        int i4 = onNavigationEvent + 59;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(useandconfigureprogramwithtexture);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(useandconfigureprogramwithtexture);
        int i3 = onNavigationEvent + 21;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ decrementVideoUsage onNavigationEvent(PopupLayout popupLayout, Function0 function0, PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback, String str, ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        decrementVideoUsage decrementvideousageOnWarmupCompleted = onWarmupCompleted(popupLayout, function0, previewProcessorOnCaptureResultCallback, str, extensionsManagerExtensionsAvailability, isinvideousage);
        int i4 = onNavigationEvent + 65;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return decrementvideousageOnWarmupCompleted;
    }

    public static /* synthetic */ decrementVideoUsage onWarmupCompleted(PopupLayout popupLayout, SessionProcessorBaseExternalSyntheticLambda0 sessionProcessorBaseExternalSyntheticLambda0, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
            int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
            throw null;
        }
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent4 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        decrementVideoUsage decrementvideousage = (decrementVideoUsage) onExtraCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1118308083, iOnNavigationEvent3, new Object[]{popupLayout, sessionProcessorBaseExternalSyntheticLambda0, isinvideousage}, iOnNavigationEvent4, 1118308085);
        int i3 = onNavigationEvent + 33;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return decrementvideousage;
    }

    public static final class onExtraCallbackWithResult implements decrementVideoUsage {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ PopupLayout IAuthTabCallback;

        public onExtraCallbackWithResult(PopupLayout popupLayout) {
            this.IAuthTabCallback = popupLayout;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                this.IAuthTabCallback.IAuthTabCallbackStub();
                this.IAuthTabCallback.onWarmupCompleted();
                int i3 = 88 / 0;
            } else {
                this.IAuthTabCallback.IAuthTabCallbackStub();
                this.IAuthTabCallback.onWarmupCompleted();
            }
            int i4 = onNavigationEvent + 49;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final UUID IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 45;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        UUID uuidRandomUUID = UUID.randomUUID();
        int i4 = onNavigationEvent + 119;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return uuidRandomUUID;
    }

    private static final Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.IAuthTabCallbackDefault(useandconfigureprogramwithtexture);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 49;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(PopupLayout popupLayout, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 99;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            popupLayout.setPopupContentSize-fhxjrPA(extensionsManager1);
            popupLayout.IAuthTabCallback_Parcel();
            return Unit.INSTANCE;
        }
        popupLayout.setPopupContentSize-fhxjrPA(extensionsManager1);
        popupLayout.IAuthTabCallback_Parcel();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(final PopupLayout popupLayout, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        float f;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 47;
        onExtraCallback = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 2) != 5, i & 1)) {
            Object obj = null;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onNavigationEvent + 65;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1993562359, i, -1, "im.toss.tds.compose.component.popup.<anonymous>.<anonymous>.<anonymous> (PopupModifier.kt:86)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1993562359, i, -1, "im.toss.tds.compose.component.popup.<anonymous>.<anonymous>.<anonymous> (PopupModifier.kt:86)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.PopupModifierKt$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj2) {
                        int i5 = 2 % 2;
                        int i6 = onExtraCallback + 69;
                        onNavigationEvent = i6 % 128;
                        int i7 = i6 % 2;
                        Unit unitOnNavigationEvent = lExternalSyntheticLambda8.onNavigationEvent((useAndConfigureProgramWithTexture) obj2);
                        int i8 = onExtraCallback + 77;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        return unitOnNavigationEvent;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                int i5 = onExtraCallback + 115;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, (Function1) objOnMinimized, 1, (Object) null);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(popupLayout);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.PopupModifierKt$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2) {
                        int i7 = 2 % 2;
                        int i8 = onNavigationEvent + 55;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitOnExtraCallback = lExternalSyntheticLambda8.onExtraCallback(popupLayout, (ExtensionsManager1) obj2);
                        int i10 = onNavigationEvent + 89;
                        IAuthTabCallback = i10 % 128;
                        int i11 = i10 % 2;
                        return unitOnExtraCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                int i7 = onNavigationEvent + 9;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = calculatePlaceholderForExtensions.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (Function1) objOnMinimized2);
            if (popupLayout.onExtraCallbackWithResult()) {
                int i9 = onExtraCallback + 7;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = onCaptureSessionStart.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult2, f);
            Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2OnWarmupCompleted = onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6);
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
                int i11 = onExtraCallback + 79;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
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
            function2OnWarmupCompleted.invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(PopupLayout popupLayout, Function0 function0, PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback, String str, ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        popupLayout.onExtraCallback(function0, previewProcessorOnCaptureResultCallback, str, extensionsManagerExtensionsAvailability);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 33;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ PopupLayout $popupLayout;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(PopupLayout popupLayout, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$popupLayout = popupLayout;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(long j) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 69;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(j);
            int i4 = onNavigationEvent + 125;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return unitIAuthTabCallback;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$popupLayout, access13800Var);
            onwarmupcompleted.L$0 = obj;
            int i2 = onWarmupCompleted + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 17;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 5;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 51 / 0;
            } else {
                objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onNavigationEvent + 77;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        private static final Unit IAuthTabCallback(long j) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 111;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 64 / 0;
            }
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004e -> B:22:0x005e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onNavigationEvent + 3;
                int i4 = i3 % 128;
                onWarmupCompleted = i4;
                int i5 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i4 + 3;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    int i7 = 53 / 0;
                } else {
                    ResultKt.onNavigationEvent(obj);
                }
                this.$popupLayout.asBinder();
                if (findRes.onWarmupCompleted(findresandmsg)) {
                    Function1 function1 = new Function1() { // from class: im.toss.tds.compose.component.PopupModifierKt$popup$4$1$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallbackWithResult;

                        public final Object invoke(Object obj2) {
                            int i8 = 2 % 2;
                            int i9 = onExtraCallbackWithResult + 111;
                            IAuthTabCallback = i9 % 128;
                            Long l = (Long) obj2;
                            if (i9 % 2 == 0) {
                                lExternalSyntheticLambda8.onWarmupCompleted.onExtraCallbackWithResult(l.longValue());
                                throw null;
                            }
                            Unit unitOnExtraCallbackWithResult = lExternalSyntheticLambda8.onWarmupCompleted.onExtraCallbackWithResult(l.longValue());
                            int i10 = IAuthTabCallback + 15;
                            onExtraCallbackWithResult = i10 % 128;
                            int i11 = i10 % 2;
                            return unitOnExtraCallbackWithResult;
                        }
                    };
                    this.L$0 = findresandmsg;
                    this.label = 1;
                    if (applyThumbTint.IAuthTabCallback(function1, this) == objOnWarmupCompleted) {
                        int i8 = onNavigationEvent + 69;
                        onWarmupCompleted = i8 % 128;
                        if (i8 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        throw null;
                    }
                    this.$popupLayout.asBinder();
                    if (findRes.onWarmupCompleted(findresandmsg)) {
                        return Unit.INSTANCE;
                    }
                }
            } else {
                ResultKt.onNavigationEvent(obj);
                if (findRes.onWarmupCompleted(findresandmsg)) {
                }
            }
        }
    }

    private static final Unit IAuthTabCallback(PopupLayout popupLayout, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(futures3, "");
        Futures3 futures3IAuthTabCallbackDefault = futures3.IAuthTabCallbackDefault();
        Intrinsics.checkNotNull(futures3IAuthTabCallbackDefault);
        popupLayout.onNavigationEvent(futures3IAuthTabCallbackDefault);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 79;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        Enum r26;
        String str;
        PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback;
        Function0 function0;
        int i;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback2;
        String str2;
        boolean z;
        boolean zOnNavigationEvent;
        boolean zOnExtraCallback;
        Object objOnMinimized;
        boolean z2;
        Object objOnMinimized2;
        boolean z3;
        boolean z4;
        boolean zOnExtraCallback2;
        boolean zOnExtraCallback3;
        Object objOnMinimized3;
        boolean zOnExtraCallback4;
        Object objOnMinimized4;
        boolean zOnExtraCallback5;
        boolean zOnExtraCallback6;
        Object obj;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[0];
        final SessionProcessorBaseExternalSyntheticLambda0 sessionProcessorBaseExternalSyntheticLambda0 = (SessionProcessorBaseExternalSyntheticLambda0) objArr[1];
        Function0 function02 = (Function0) objArr[2];
        PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback3 = (PreviewProcessorOnCaptureResultCallback) objArr[3];
        Function2 function2 = (Function2) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int iIntValue2 = ((Number) objArr[7]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport02, "");
        Intrinsics.checkNotNullParameter(sessionProcessorBaseExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Function0 function03 = (iIntValue2 & 2) != 0 ? null : function02;
        if ((iIntValue2 & 4) != 0) {
            previewProcessorOnCaptureResultCallback3 = new PreviewProcessorOnCaptureResultCallback(false, false, false, false, 15, (DefaultConstructorMarker) null);
        }
        PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback4 = previewProcessorOnCaptureResultCallback3;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onNavigationEvent + 89;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(640100532, iIntValue, -1, "im.toss.tds.compose.component.popup (PopupModifier.kt:66)");
        }
        View view = (View) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallbackDefault());
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
        String str3 = (String) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(AdvancedSessionProcessorRequestProcessorImplAdapter.onExtraCallbackWithResult());
        Enum r6 = (ExtensionsManagerExtensionsAvailability) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(needCorrectJpegMetadata.IAuthTabCallbackStubProxy());
        CameraConfigBuilder cameraConfigBuilderIAuthTabCallback = getAwbState.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 0);
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function2, cameraCaptureResultEmptyCameraCaptureResult2, (iIntValue >> 12) & 14);
        Object[] objArr2 = new Object[0];
        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
            objOnMinimized5 = new Function0() { // from class: im.toss.tds.compose.component.PopupModifierKt$$ExternalSyntheticLambda2
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke() {
                    UUID uuidOnNavigationEvent;
                    int i5 = 2 % 2;
                    int i6 = onWarmupCompleted + 113;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 == 0) {
                        uuidOnNavigationEvent = lExternalSyntheticLambda8.onNavigationEvent();
                        int i7 = 36 / 0;
                    } else {
                        uuidOnNavigationEvent = lExternalSyntheticLambda8.onNavigationEvent();
                    }
                    int i8 = onWarmupCompleted + 53;
                    onNavigationEvent = i8 % 128;
                    if (i8 % 2 != 0) {
                        return uuidOnNavigationEvent;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized5);
        }
        UUID uuid = (UUID) RememberSaveableKt.IAuthTabCallback(objArr2, (Function0) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResult2, 48);
        Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
        if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
            Intrinsics.checkNotNull(uuid);
            r26 = r6;
            str = str3;
            previewProcessorOnCaptureResultCallback = previewProcessorOnCaptureResultCallback4;
            function0 = function03;
            i = iIntValue;
            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult2;
            final PopupLayout popupLayout = new PopupLayout(function03, previewProcessorOnCaptureResultCallback4, str3, view, r8lambdanm9dm2eewl4vrptnjmesfjqky4, sessionProcessorBaseExternalSyntheticLambda0, uuid, false, (PreviewProcessorExternalSyntheticLambda0) null, 256, (DefaultConstructorMarker) null);
            popupLayout.setContent(cameraConfigBuilderIAuthTabCallback, ForwardingCameraControl.onExtraCallbackWithResult(-1993562359, true, new Function2() { // from class: im.toss.tds.compose.component.PopupModifierKt$$ExternalSyntheticLambda3
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i5 = 2 % 2;
                    int i6 = onExtraCallbackWithResult + 77;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    Unit unitOnExtraCallbackWithResult = lExternalSyntheticLambda8.onExtraCallbackWithResult(popupLayout, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i8 = onExtraCallbackWithResult + 77;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    throw null;
                }
            }));
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(popupLayout);
            objOnMinimized6 = popupLayout;
        } else {
            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
            r26 = r6;
            str = str3;
            previewProcessorOnCaptureResultCallback = previewProcessorOnCaptureResultCallback4;
            function0 = function03;
            i = iIntValue;
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult2;
        }
        final PopupLayout popupLayout2 = (PopupLayout) objOnMinimized6;
        boolean zOnExtraCallback7 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(popupLayout2);
        int i5 = i;
        int i6 = (i5 & 896) ^ 384;
        final Function0 function04 = function0;
        boolean z5 = (i6 > 256 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function04)) || (i5 & 384) == 256;
        int i7 = (i5 & 7168) ^ 3072;
        if (i7 > 2048) {
            int i8 = onExtraCallback + 87;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(previewProcessorOnCaptureResultCallback);
                throw null;
            }
            previewProcessorOnCaptureResultCallback2 = previewProcessorOnCaptureResultCallback;
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(previewProcessorOnCaptureResultCallback2)) {
            }
            str2 = str;
            z = true;
            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str2);
            zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(r26.ordinal());
            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback7 | z5 | z | zOnNavigationEvent | zOnExtraCallback) || objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                final PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback5 = previewProcessorOnCaptureResultCallback2;
                final String str4 = str2;
                final Enum r23 = r26;
                objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.PopupModifierKt$$ExternalSyntheticLambda4
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj2) {
                        int i9 = 2 % 2;
                        int i10 = onExtraCallback + 121;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        decrementVideoUsage decrementvideousageOnNavigationEvent = lExternalSyntheticLambda8.onNavigationEvent(popupLayout2, function04, previewProcessorOnCaptureResultCallback5, str4, r23, (isInVideoUsage) obj2);
                        int i12 = onExtraCallback + 1;
                        onExtraCallbackWithResult = i12 % 128;
                        if (i12 % 2 == 0) {
                            return decrementvideousageOnNavigationEvent;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            int i9 = PopupLayout.onExtraCallbackWithResult;
            isZslDisabledByByUserCaseConfig.onExtraCallback(popupLayout2, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, i9);
            boolean zOnExtraCallback8 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(popupLayout2);
            boolean z6 = (i6 <= 256 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function04)) || (i5 & 384) == 256;
            if (i7 <= 2048) {
                int i10 = onNavigationEvent + 23;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(previewProcessorOnCaptureResultCallback2)) {
                    z2 = (i5 & 3072) == 2048;
                }
            }
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str2);
            boolean zOnExtraCallback9 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(r26.ordinal());
            objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            z3 = z6 | zOnExtraCallback8 | z2 | zOnNavigationEvent2 | zOnExtraCallback9;
            z4 = true;
            if (!z3 || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                final PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback6 = previewProcessorOnCaptureResultCallback2;
                final String str5 = str2;
                final Enum r232 = r26;
                objOnMinimized2 = new Function0() { // from class: im.toss.tds.compose.component.PopupModifierKt$$ExternalSyntheticLambda5
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i12 = 2 % 2;
                        int i13 = onWarmupCompleted + 123;
                        onExtraCallback = i13 % 128;
                        int i14 = i13 % 2;
                        PopupLayout popupLayout3 = popupLayout2;
                        if (i14 == 0) {
                            return lExternalSyntheticLambda8.onNavigationEvent(popupLayout3, function04, previewProcessorOnCaptureResultCallback6, str5, r232);
                        }
                        lExternalSyntheticLambda8.onNavigationEvent(popupLayout3, function04, previewProcessorOnCaptureResultCallback6, str5, r232);
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent((Function0) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 0);
            zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(popupLayout2);
            if (((i5 & 112) ^ 48) <= 32) {
                int i12 = onNavigationEvent + 17;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
                if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(sessionProcessorBaseExternalSyntheticLambda0)) {
                    if ((i5 & 48) == 32) {
                        int i14 = onExtraCallback + 45;
                        onNavigationEvent = i14 % 128;
                        int i15 = i14 % 2;
                    } else {
                        z4 = false;
                    }
                }
            }
            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (z4 | zOnExtraCallback2) {
                int i16 = onExtraCallback + 93;
                onNavigationEvent = i16 % 128;
                int i17 = i16 % 2;
                if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized7 = new Function1() { // from class: im.toss.tds.compose.component.PopupModifierKt$$ExternalSyntheticLambda6
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2) {
                            int i18 = 2 % 2;
                            int i19 = onExtraCallbackWithResult + 109;
                            onWarmupCompleted = i19 % 128;
                            int i20 = i19 % 2;
                            decrementVideoUsage decrementvideousageOnWarmupCompleted = lExternalSyntheticLambda8.onWarmupCompleted(popupLayout2, sessionProcessorBaseExternalSyntheticLambda0, (isInVideoUsage) obj2);
                            int i21 = onWarmupCompleted + 39;
                            onExtraCallbackWithResult = i21 % 128;
                            if (i21 % 2 == 0) {
                                int i22 = 45 / 0;
                            }
                            return decrementvideousageOnWarmupCompleted;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized7);
                }
            }
            isZslDisabledByByUserCaseConfig.onExtraCallback(sessionProcessorBaseExternalSyntheticLambda0, (Function1) objOnMinimized7, cameraCaptureResultEmptyCameraCaptureResult, (i5 >> 3) & 14);
            zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(popupLayout2);
            objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback3 || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = new onWarmupCompleted(popupLayout2, null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(popupLayout2, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, i9);
            zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(popupLayout2);
            objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback4 || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized4 = new Function1() { // from class: im.toss.tds.compose.component.PopupModifierKt$$ExternalSyntheticLambda7
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj2) {
                        int i18 = 2 % 2;
                        int i19 = onExtraCallbackWithResult + 43;
                        onWarmupCompleted = i19 % 128;
                        int i20 = i19 % 2;
                        Object[] objArr3 = {popupLayout2, (Futures3) obj2};
                        Unit unit = (Unit) lExternalSyntheticLambda8.onExtraCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -731107982, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr3, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 731107985);
                        int i21 = onWarmupCompleted + 29;
                        onExtraCallbackWithResult = i21 % 128;
                        if (i21 % 2 != 0) {
                            return unit;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0, (Function1) objOnMinimized4);
            zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(popupLayout2);
            zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(r26.ordinal());
            Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnExtraCallback5 | zOnExtraCallback6) {
                obj = objOnMinimized8;
                if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                    final Enum r0 = r26;
                    Function1 function1 = new Function1() { // from class: im.toss.tds.compose.component.PopupModifierKt$$ExternalSyntheticLambda8
                        private static int onExtraCallback = 1;
                        private static int onExtraCallbackWithResult;

                        public final Object invoke(Object obj2) {
                            int i18 = 2 % 2;
                            int i19 = onExtraCallback + 113;
                            onExtraCallbackWithResult = i19 % 128;
                            int i20 = i19 % 2;
                            Unit unitOnNavigationEvent = lExternalSyntheticLambda8.onNavigationEvent(popupLayout2, r0, (RelativeLayoutBounds) obj2);
                            int i21 = onExtraCallback + 111;
                            onExtraCallbackWithResult = i21 % 128;
                            if (i21 % 2 == 0) {
                                return unitOnNavigationEvent;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function1);
                    obj = function1;
                }
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = CameraCaptureResultImageInfo.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent, 0L, 0L, (Function1) obj, 3, (Object) null);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            return quirksExternalSyntheticBackport0IAuthTabCallback;
        }
        previewProcessorOnCaptureResultCallback2 = previewProcessorOnCaptureResultCallback;
        if ((i5 & 3072) == 2048) {
            str2 = str;
            z = true;
        } else {
            str2 = str;
            z = false;
        }
        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str2);
        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(r26.ordinal());
        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(zOnExtraCallback7 | z5 | z | zOnNavigationEvent | zOnExtraCallback)) {
            final PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback52 = previewProcessorOnCaptureResultCallback2;
            final String str42 = str2;
            final ExtensionsManagerExtensionsAvailability r233 = r26;
            objOnMinimized = new Function1() { // from class: im.toss.tds.compose.component.PopupModifierKt$$ExternalSyntheticLambda4
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2) {
                    int i92 = 2 % 2;
                    int i102 = onExtraCallback + 121;
                    onExtraCallbackWithResult = i102 % 128;
                    int i112 = i102 % 2;
                    decrementVideoUsage decrementvideousageOnNavigationEvent = lExternalSyntheticLambda8.onNavigationEvent(popupLayout2, function04, previewProcessorOnCaptureResultCallback52, str42, r233, (isInVideoUsage) obj2);
                    int i122 = onExtraCallback + 1;
                    onExtraCallbackWithResult = i122 % 128;
                    if (i122 % 2 == 0) {
                        return decrementvideousageOnNavigationEvent;
                    }
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        int i92 = PopupLayout.onExtraCallbackWithResult;
        isZslDisabledByByUserCaseConfig.onExtraCallback(popupLayout2, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, i92);
        boolean zOnExtraCallback82 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(popupLayout2);
        if (i6 <= 256) {
        }
        if (i7 <= 2048) {
        }
        boolean zOnNavigationEvent22 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str2);
        boolean zOnExtraCallback92 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(r26.ordinal());
        objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        z3 = z6 | zOnExtraCallback82 | z2 | zOnNavigationEvent22 | zOnExtraCallback92;
        z4 = true;
        if (!z3) {
            final PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback62 = previewProcessorOnCaptureResultCallback2;
            final String str52 = str2;
            final ExtensionsManagerExtensionsAvailability r2322 = r26;
            objOnMinimized2 = new Function0() { // from class: im.toss.tds.compose.component.PopupModifierKt$$ExternalSyntheticLambda5
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    int i122 = 2 % 2;
                    int i132 = onWarmupCompleted + 123;
                    onExtraCallback = i132 % 128;
                    int i142 = i132 % 2;
                    PopupLayout popupLayout3 = popupLayout2;
                    if (i142 == 0) {
                        return lExternalSyntheticLambda8.onNavigationEvent(popupLayout3, function04, previewProcessorOnCaptureResultCallback62, str52, r2322);
                    }
                    lExternalSyntheticLambda8.onNavigationEvent(popupLayout3, function04, previewProcessorOnCaptureResultCallback62, str52, r2322);
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent((Function0) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 0);
        zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(popupLayout2);
        if (((i5 & 112) ^ 48) <= 32) {
        }
        Object objOnMinimized72 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (z4 | zOnExtraCallback2) {
        }
        isZslDisabledByByUserCaseConfig.onExtraCallback(sessionProcessorBaseExternalSyntheticLambda0, (Function1) objOnMinimized72, cameraCaptureResultEmptyCameraCaptureResult, (i5 >> 3) & 14);
        zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(popupLayout2);
        objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback3) {
            objOnMinimized3 = new onWarmupCompleted(popupLayout2, null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
        }
        isZslDisabledByByUserCaseConfig.onNavigationEvent(popupLayout2, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, i92);
        zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(popupLayout2);
        objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnExtraCallback4) {
            objOnMinimized4 = new Function1() { // from class: im.toss.tds.compose.component.PopupModifierKt$$ExternalSyntheticLambda7
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2) {
                    int i18 = 2 % 2;
                    int i19 = onExtraCallbackWithResult + 43;
                    onWarmupCompleted = i19 % 128;
                    int i20 = i19 % 2;
                    Object[] objArr3 = {popupLayout2, (Futures3) obj2};
                    Unit unit = (Unit) lExternalSyntheticLambda8.onExtraCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -731107982, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr3, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 731107985);
                    int i21 = onWarmupCompleted + 29;
                    onExtraCallbackWithResult = i21 % 128;
                    if (i21 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0, (Function1) objOnMinimized4);
        zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(popupLayout2);
        zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(r26.ordinal());
        Object objOnMinimized82 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (zOnExtraCallback5 | zOnExtraCallback6) {
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = CameraCaptureResultImageInfo.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent2, 0L, 0L, (Function1) obj, 3, (Object) null);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        return quirksExternalSyntheticBackport0IAuthTabCallback2;
    }

    private static final Unit IAuthTabCallback(PopupLayout popupLayout, ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability, RelativeLayoutBounds relativeLayoutBounds) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(relativeLayoutBounds, "");
        popupLayout.setParentLayoutDirection(extensionsManagerExtensionsAvailability);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 91;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 40 / 0;
        }
        return unit;
    }

    private static final decrementVideoUsage onWarmupCompleted(PopupLayout popupLayout, Function0 function0, PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback, String str, ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        popupLayout.access000();
        popupLayout.onExtraCallback(function0, previewProcessorOnCaptureResultCallback, str, extensionsManagerExtensionsAvailability);
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(popupLayout);
        int i2 = onExtraCallback + 47;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return onextracallbackwithresult;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        PopupLayout popupLayout = (PopupLayout) objArr[0];
        SessionProcessorBaseExternalSyntheticLambda0 sessionProcessorBaseExternalSyntheticLambda0 = (SessionProcessorBaseExternalSyntheticLambda0) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter((isInVideoUsage) objArr[2], "");
        popupLayout.setPositionProvider(sessionProcessorBaseExternalSyntheticLambda0);
        popupLayout.IAuthTabCallback_Parcel();
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback();
        int i2 = onNavigationEvent + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private static final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<? extends Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = (Function2) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        int i4 = onNavigationEvent + 119;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return function2;
    }

    public static /* synthetic */ Unit onNavigationEvent(PopupLayout popupLayout, Futures3 futures3) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (Unit) onExtraCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -731107982, iOnNavigationEvent, new Object[]{popupLayout, futures3}, iOnNavigationEvent2, 731107985);
    }

    public static final QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull SessionProcessorBaseExternalSyntheticLambda0 sessionProcessorBaseExternalSyntheticLambda0, @Nullable Function0<Unit> function0, @Nullable PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback, @NotNull Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {quirksExternalSyntheticBackport0, sessionProcessorBaseExternalSyntheticLambda0, function0, previewProcessorOnCaptureResultCallback, function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        return (QuirksExternalSyntheticBackport0) onExtraCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -5169673, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 5169673);
    }

    private static final decrementVideoUsage IAuthTabCallback(PopupLayout popupLayout, SessionProcessorBaseExternalSyntheticLambda0 sessionProcessorBaseExternalSyntheticLambda0, isInVideoUsage isinvideousage) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (decrementVideoUsage) onExtraCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1118308083, iOnNavigationEvent, new Object[]{popupLayout, sessionProcessorBaseExternalSyntheticLambda0, isinvideousage}, iOnNavigationEvent2, 1118308085);
    }

    public static final QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable QuirkSettingsLoader quirkSettingsLoader, long j, @Nullable Function0<Unit> function0, @Nullable PreviewProcessorOnCaptureResultCallback previewProcessorOnCaptureResultCallback, @NotNull Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {quirksExternalSyntheticBackport0, quirkSettingsLoader, Long.valueOf(j), function0, previewProcessorOnCaptureResultCallback, function2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        return (QuirksExternalSyntheticBackport0) onExtraCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1220269882, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1220269883);
    }
}
