package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import im.toss.features.faceverify.impl.R;
import im.toss.features.faceverify.impl.ui.pass.FacePassScreenKt$;
import im.toss.features.loan.comparison.result.view.LoanComparisonResultWarningNoticeView;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$;
import im.toss.tds.compose.foundation.anim.rally.Rally;
import im.toss.tds.compose.foundation.anim.rally.RallyKt;
import im.toss.tds.compose.foundation.anim.rally.RallyModifierKt;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.appendQueryJson2Url;
import o.handleNativeAdClick;
import o.mExternalSyntheticApiModelOutline1;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class WebSocketBridgeExtension {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final float IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static char[] onExtraCallback;
    private static final RoundedCornerShape onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onTransact;
    private static final float onWarmupCompleted;

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        boolean z;
        long jAudioAttributesImplBaseParcelizer;
        int i8 = ~i;
        int i9 = ~i4;
        int i10 = (~(i8 | i9)) | (~(i | i4)) | (~(i5 | i4));
        int i11 = ~i5;
        int i12 = (~(i11 | i4)) | i;
        int i13 = (~(i4 | i | i5)) | (~(i9 | i11));
        int i14 = i + i5 + i3 + ((-373584967) * i2) + ((-1711780345) * i6);
        int i15 = i14 * i14;
        int i16 = ((i * 235012993) - 778813113) + (i5 * 235012993) + (i10 * (-632)) + (i12 * 1264) + (i13 * 632) + (235013625 * i3) + (915899377 * i2) + ((-1709701169) * i6) + (i15 * 1974403072);
        switch ((i * 1075882953) + 1902575616 + (1075882953 * i5) + ((-462509112) * i10) + (925018224 * i12) + (462509112 * i13) + (1538392064 * i3) + ((-375259136) * i2) + ((-1109524480) * i6) + (585564160 * i15) + (i16 * i16 * (-848756736))) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return asInterface(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return getInterfaceDescriptor(objArr);
            case 11:
                appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult.onNavigationEvent) objArr[0];
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                int i17 = 4;
                int iIntValue2 = ((Number) objArr[4]).intValue();
                int i18 = 2 % 2;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-902144822);
                if ((iIntValue & 6) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onnavigationevent)) {
                        int i19 = IAuthTabCallbackDefault + 25;
                        onTransact = i19 % 128;
                        int i20 = i19 % 2;
                    } else {
                        i17 = 2;
                    }
                    i7 = i17 | iIntValue;
                } else {
                    i7 = iIntValue;
                }
                int i21 = iIntValue2 & 2;
                if (i21 != 0) {
                    i7 |= 48;
                } else if ((iIntValue & 48) == 0) {
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback) ? 32 : 16;
                }
                if ((i7 & 19) != 18) {
                    z = true;
                } else {
                    int i22 = IAuthTabCallbackDefault + 87;
                    onTransact = i22 % 128;
                    int i23 = i22 % 2;
                    z = false;
                }
                if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i7 & 1))) {
                    if (i21 != 0) {
                        onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i24 = onTransact + 93;
                        IAuthTabCallbackDefault = i24 % 128;
                        int i25 = i24 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-902144822, i7, -1, "im.toss.features.faceverify.impl.ui.pass.TooDarkContent (FacePassScreen.kt:387)");
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
                    component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                    LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback2, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(48.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    verifyClientState verifyclientstateOnWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-lighter-mono");
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    if (!((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(420410601);
                        jAudioAttributesImplBaseParcelizer = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).MediaMetadataCompat();
                    } else {
                        int i26 = IAuthTabCallbackDefault + 11;
                        onTransact = i26 % 128;
                        if (i26 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(420409577);
                            jAudioAttributesImplBaseParcelizer = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 67).AudioAttributesImplBaseParcelizer();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(420409577);
                            jAudioAttributesImplBaseParcelizer = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).AudioAttributesImplBaseParcelizer();
                        }
                    }
                    long j = jAudioAttributesImplBaseParcelizer;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    setMainImageUri.IAuthTabCallback(verifyclientstateOnWarmupCompleted, deprecated_eventListenerFactory.Icon, (QuirksExternalSyntheticBackport0) null, handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(64.0f)), j, 0, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3120, 0, 8164);
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback2, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    mExternalSyntheticApiModelOutline1.onWarmupCompleted.onWarmupCompleted(onnavigationevent.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i7 & 14), mExternalSyntheticApiModelOutline1.asInterface.Companion.IAuthTabCallback().onExtraCallbackWithResult(), (QuirksExternalSyntheticBackport0) null, 0, false, AppLovinPostbackService.onExtraCallbackWithResult.access100(), y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).isEngagementSignalsApiAvailable(), 0L, 0L, 0.0f, (bindChildren) null, (use) null, 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.Center, (mExternalSyntheticApiModelOutline1.onTransact) null, (mExternalSyntheticApiModelOutline1.IAuthTabCallbackStubProxy) null, (Object) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 100690944, 237468);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                }
                clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new FacePassScreenKt$.ExternalSyntheticLambda3(onnavigationevent, onextracallback, iIntValue, iIntValue2));
                }
                return null;
            default:
                return onNavigationEvent(objArr);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 37;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, str);
        int i4 = IAuthTabCallbackDefault + 7;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 61;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))};
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        IAuthTabCallback(1706913899, objArr, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, -1706913892, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i6 = onTransact + 33;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 37 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onTransact + 23;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, onextracallbackwithresult, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 33 / 0;
        }
        int i8 = onTransact + 31;
        IAuthTabCallbackDefault = i8 % 128;
        if (i8 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, byte[] bArr, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 41;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, bArr, i, i2, i3);
        int i7 = onTransact + 29;
        IAuthTabCallbackDefault = i7 % 128;
        if (i7 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, boolean z, getBacktraceNote getbacktracenote, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 73;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(highSpeedResolverExternalSyntheticLambda2, z, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackDefault + 99;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult.onNavigationEvent onnavigationevent, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onTransact + 53;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(onnavigationevent, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onTransact + 19;
        IAuthTabCallbackDefault = i7 % 128;
        int i8 = i7 % 2;
        return unitOnWarmupCompleted;
    }

    private static final Unit IAuthTabCallback(boolean z, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 73;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            i |= 1;
        }
        onWarmupCompleted(z, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(boolean z, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(z, fliphorizontally);
        int i4 = IAuthTabCallbackDefault + 3;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        appendQueryJson2Url.onWarmupCompleted onwarmupcompleted = (appendQueryJson2Url.onWarmupCompleted) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 75;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(onwarmupcompleted, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 47;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {function0, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1)), Integer.valueOf(iIntValue2)};
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        IAuthTabCallback(-223947395, objArr2, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, 223947398, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 3;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(String str, appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 47;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(str, onextracallbackwithresult, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onTransact + 23;
        IAuthTabCallbackDefault = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onTransact + 85;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, z, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallbackDefault + 49;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = onTransact + 117;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function1);
        int i4 = IAuthTabCallbackDefault + 103;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 74 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cameraPresenceProviderExternalSyntheticLambda6, fliphorizontally);
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 77;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(boolean z, appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult, String str, Boolean bool, boolean z2, Function1 function1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 17;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        onWarmupCompleted(z, onextracallbackwithresult, str, bool, z2, function1, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallbackDefault + 91;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ AppLovinSdkSettings onExtraCallback(Rally rally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(rally);
            throw null;
        }
        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = IAuthTabCallback(rally);
        int i3 = IAuthTabCallbackDefault + 33;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 27 / 0;
        }
        return appLovinSdkSettingsIAuthTabCallback;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue3 = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 1;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {function0, quirksExternalSyntheticBackport0, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue3)};
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        Unit unit = (Unit) IAuthTabCallback(1840331183, objArr2, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, -1840331175, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
        int i4 = onTransact + 51;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62, fliphorizontally);
        int i4 = onTransact + 31;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(boolean z, appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult, String str, Boolean bool, boolean z2, Function1 function1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 25;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(z, onextracallbackwithresult, str, bool, z2, function1, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onTransact + 21;
        IAuthTabCallbackDefault = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 105;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            IAuthTabCallback(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i5 = IAuthTabCallbackDefault + 5;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    private static final Unit onNavigationEvent(String str, boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 7;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            onNavigationEvent(str, z, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            onNavigationEvent(str, z, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1) {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        Unit unit = (Unit) IAuthTabCallback(-1684808681, new Object[]{function1}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, 1684808681, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
        int i4 = IAuthTabCallbackDefault + 63;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, boolean z, getBacktraceNote getbacktracenote, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 65;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(highSpeedResolverExternalSyntheticLambda2, z, getbacktracenote, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onTransact + 41;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(appendQueryJson2Url.onWarmupCompleted onwarmupcompleted, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 125;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {onwarmupcompleted, function1, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        Unit unit = (Unit) IAuthTabCallback(-407669155, objArr, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, 407669161, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
        int i6 = onTransact + 107;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 45;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(z, function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onTransact + 29;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Unit unitOnExtraCallback;
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult = (appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult) objArr[1];
        String str = (String) objArr[2];
        Boolean bool = (Boolean) objArr[3];
        boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
        Function1 function1 = (Function1) objArr[5];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int iIntValue2 = ((Number) objArr[8]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue3 = ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnExtraCallback = onExtraCallback(zBooleanValue, onextracallbackwithresult, str, bool, zBooleanValue2, function1, quirksExternalSyntheticBackport0, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
            int i3 = 55 / 0;
        } else {
            unitOnExtraCallback = onExtraCallback(zBooleanValue, onextracallbackwithresult, str, bool, zBooleanValue2, function1, quirksExternalSyntheticBackport0, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        }
        int i4 = IAuthTabCallbackDefault + 23;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        appendQueryJson2Url.onWarmupCompleted onwarmupcompleted = (appendQueryJson2Url.onWarmupCompleted) objArr[0];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        String str = (String) objArr[3];
        Function1 function1 = (Function1) objArr[4];
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[5];
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[6];
        HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2 = (HighSpeedResolverExternalSyntheticLambda2) objArr[7];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback(onwarmupcompleted, cameraPresenceProviderExternalSyntheticLambda6, zBooleanValue, str, function1, cameraPresenceProviderExternalSyntheticLambda62, getsupportedhighspeedresolutionsfor, highSpeedResolverExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(onwarmupcompleted, cameraPresenceProviderExternalSyntheticLambda6, zBooleanValue, str, function1, cameraPresenceProviderExternalSyntheticLambda62, getsupportedhighspeedresolutionsfor, highSpeedResolverExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onTransact + 119;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        Unit unit = (Unit) IAuthTabCallback(-662627678, new Object[]{function1}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, 662627687, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
        int i4 = onTransact + 69;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult.onNavigationEvent onnavigationevent, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackDefault + 37;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(-525869028, new Object[]{onnavigationevent, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 525869039, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallbackDefault + 95;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(onextracallbackwithresult, fliphorizontally);
        if (i3 == 0) {
            int i4 = 82 / 0;
        }
        int i5 = onTransact + 119;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(boolean z, appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult, String str, Boolean bool, boolean z2, Function1 function1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onTransact + 19;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(z, onextracallbackwithresult, str, bool, z2, function1, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 46 / 0;
        }
        int i8 = IAuthTabCallbackDefault + 1;
        onTransact = i8 % 128;
        if (i8 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ AppLovinSdkSettings onWarmupCompleted(Rally rally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) IAuthTabCallback(-1420870013, new Object[]{rally}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, 1420870023, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
        int i4 = IAuthTabCallbackDefault + 23;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return appLovinSdkSettings;
    }

    private static final QuirksExternalSyntheticBackport0 onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z) {
        int i = 2 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = SequentialExecutorWorkerRunningState.IAuthTabCallback(quirksExternalSyntheticBackport0, Boolean.valueOf(z), new onExtraCallback(z));
        int i2 = onTransact + 111;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            return quirksExternalSyntheticBackport0IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ String $currentFaceText;
        final /* synthetic */ boolean $isSmall;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<String> $smallText$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(boolean z, String str, getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$isSmall = z;
            this.$currentFaceText = str;
            this.$smallText$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$isSmall, this.$currentFaceText, this.$smallText$delegate, access13800Var);
            int i2 = onNavigationEvent + 21;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 / 0;
            }
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 87;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 77;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 41;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (this.$isSmall) {
                getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor = this.$smallText$delegate;
                String str = this.$currentFaceText;
                if (str == null) {
                    int i3 = onExtraCallback + 51;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    str = "";
                }
                int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
                WebSocketBridgeExtension.IAuthTabCallback(1652265610, new Object[]{getsupportedhighspeedresolutionsfor, str}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, -1652265609, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onTransact + 73;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            fliphorizontally.IAuthTabCallbackStub(IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6) * 0.0f);
        } else {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            fliphorizontally.IAuthTabCallbackStub(1.0f - IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6));
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            fliphorizontally.IAuthTabCallbackStub(IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6));
            fliphorizontally.IAuthTabCallbackStubProxy(onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda62));
            fliphorizontally.getInterfaceDescriptor(onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda62));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.IAuthTabCallbackStub(IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda6));
        fliphorizontally.IAuthTabCallbackStubProxy(onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda62));
        fliphorizontally.getInterfaceDescriptor(onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda62));
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(appendQueryJson2Url.onWarmupCompleted onwarmupcompleted, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, boolean z, String str, Function1 function1, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 3;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(highSpeedResolverExternalSyntheticLambda2, "");
            z2 = (i & 6) != 36;
        } else {
            Intrinsics.checkNotNullParameter(highSpeedResolverExternalSyntheticLambda2, "");
            if ((i & 17) != 16) {
            }
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = IAuthTabCallbackDefault + 27;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-759816773, i, -1, "im.toss.features.faceverify.impl.ui.pass.FacePassScreen.<anonymous>.<anonymous> (FacePassScreen.kt:115)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-759816773, i, -1, "im.toss.features.faceverify.impl.ui.pass.FacePassScreen.<anonymous>.<anonymous> (FacePassScreen.kt:115)");
                int i5 = IAuthTabCallbackDefault + 49;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
            }
            String strOnNavigationEvent = onNavigationEvent((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor);
            appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = onwarmupcompleted.onWarmupCompleted();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new FacePassScreenKt$.ExternalSyntheticLambda7(cameraPresenceProviderExternalSyntheticLambda6);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            onExtraCallback(strOnNavigationEvent, onextracallbackwithresultOnWarmupCompleted, onWarmupCompleted(attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized), !z), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            boolean zIAuthTabCallback = onwarmupcompleted.IAuthTabCallback();
            appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted2 = onwarmupcompleted.onWarmupCompleted();
            Boolean boolOnExtraCallbackWithResult = onwarmupcompleted.onExtraCallbackWithResult();
            boolean z3 = onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<Float>) cameraPresenceProviderExternalSyntheticLambda62) == 1.0f;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda62);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnNavigationEvent2 | zOnNavigationEvent3) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new FacePassScreenKt$.ExternalSyntheticLambda8(cameraPresenceProviderExternalSyntheticLambda6, cameraPresenceProviderExternalSyntheticLambda62);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            onWarmupCompleted(zIAuthTabCallback, onextracallbackwithresultOnWarmupCompleted2, str, boolOnExtraCallbackWithResult, z3, function1, onWarmupCompleted(attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent, (Function1) objOnMinimized2), z), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@NotNull appendQueryJson2Url.onWarmupCompleted onwarmupcompleted, @NotNull Function1<? super appendQueryJson2Url.onExtraCallback, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        float f;
        int i3 = 2 % 2;
        int i4 = onTransact + 101;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-252795647);
        if ((i & 6) == 0) {
            int i6 = IAuthTabCallbackDefault + 35;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onwarmupcompleted) ? 4 : 2) | i;
            int i8 = onTransact + 117;
            IAuthTabCallbackDefault = i8 % 128;
            int i9 = i8 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = onTransact + 121;
            IAuthTabCallbackDefault = i10 % 128;
            int i11 = i10 % 2;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            int i12 = onTransact + 93;
            IAuthTabCallbackDefault = i12 % 128;
            z = i12 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            int i13 = onTransact + 49;
            IAuthTabCallbackDefault = i13 % 128;
            int i14 = i13 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i15 = onTransact + 109;
                IAuthTabCallbackDefault = i15 % 128;
                int i16 = i15 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-252795647, i2, -1, "im.toss.features.faceverify.impl.ui.pass.FacePassScreen (FacePassScreen.kt:92)");
            }
            boolean zOnExtraCallbackWithResult = onwarmupcompleted.onWarmupCompleted().onExtraCallbackWithResult();
            String strOnWarmupCompleted = onwarmupcompleted.onWarmupCompleted().onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted2.onExtraCallback()) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(strOnWarmupCompleted != null ? strOnWarmupCompleted : "", (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zOnExtraCallbackWithResult);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strOnWarmupCompleted);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if ((zOnExtraCallback | zOnNavigationEvent) || objOnMinimized2 == onwarmupcompleted2.onExtraCallback()) {
                objOnMinimized2 = new onNavigationEvent(zOnExtraCallbackWithResult, strOnWarmupCompleted, getsupportedhighspeedresolutionsfor, null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            isZslDisabledByByUserCaseConfig.onExtraCallback(Boolean.valueOf(zOnExtraCallbackWithResult), strOnWarmupCompleted, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            if (zOnExtraCallbackWithResult) {
                f = 0.0f;
            } else {
                int i17 = IAuthTabCallbackDefault + 1;
                onTransact = i17 % 128;
                if (i17 % 2 != 0) {
                    int i18 = 5 % 4;
                }
                f = 1.0f;
            }
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = isSubmitButtonEnabled.IAuthTabCallback(f, onQueryRefine.onExtraCallbackWithResult(500, 0, (setOnQueryTextListener) null, 6, (Object) null), 0.0f, "contentAlpha", (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3120, 20);
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2 = isSubmitButtonEnabled.IAuthTabCallback(zOnExtraCallbackWithResult ? 0.8f : 1.0f, onQueryRefine.onExtraCallbackWithResult(500, 0, (setOnQueryTextListener) null, 6, (Object) null), 0.0f, "contentScale", (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3120, 20);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
                int i19 = onTransact + 101;
                IAuthTabCallbackDefault = i19 % 128;
                int i20 = i19 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            IAuthTabCallback(1706913899, new Object[]{cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), -1706913892, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            onExtraCallback(highSpeedResolverExternalSyntheticLambda1, zOnExtraCallbackWithResult, ForwardingCameraControl.onExtraCallback(-759816773, true, new FacePassScreenKt$.ExternalSyntheticLambda18(onwarmupcompleted, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback, zOnExtraCallbackWithResult, strOnWarmupCompleted, function1, cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback2, getsupportedhighspeedresolutionsfor), cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 390);
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i21 = IAuthTabCallbackDefault + 115;
                onTransact = i21 % 128;
                if (i21 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i22 = 10 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new FacePassScreenKt$.ExternalSyntheticLambda19(onwarmupcompleted, function1, i));
        }
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback;
        Rally rally = (Rally) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rally, "");
            appLovinSdkSettingsIAuthTabCallback = AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, Cache.DOWN, AuthenticatorCompanionAuthenticatorNone.FAST, false, (Function1) null, 79, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(rally, "");
            appLovinSdkSettingsIAuthTabCallback = AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, Cache.DOWN, AuthenticatorCompanionAuthenticatorNone.FAST, false, (Function1) null, 24, (Object) null);
        }
        int i3 = IAuthTabCallbackDefault + 23;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return appLovinSdkSettingsIAuthTabCallback;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Rally $rally;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(Rally rally, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$rally = rally;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 77 / 0;
            return onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$rally, access13800Var);
            int i2 = IAuthTabCallback + 99;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 95;
            onExtraCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 != 0) {
                int i3 = onExtraCallback + 55;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(100L, this) == objOnWarmupCompleted) {
                    int i4 = onExtraCallback + 71;
                    IAuthTabCallback = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objOnWarmupCompleted;
                    }
                    throw null;
                }
            }
            this.$rally.receiveFile();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, boolean z, getBacktraceNote<? super HighSpeedResolverExternalSyntheticLambda2, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        float fIAuthTabCallback;
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1794885701);
        Object obj = null;
        if ((i & 6) == 0) {
            int i4 = IAuthTabCallbackDefault + 77;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(highSpeedResolverExternalSyntheticLambda2);
                obj.hashCode();
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(highSpeedResolverExternalSyntheticLambda2)) {
                int i5 = onTransact + 7;
                IAuthTabCallbackDefault = i5 % 128;
                int i6 = i5 % 2 == 0 ? 2 : 4;
                i2 = i6 | i;
            }
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 256 : 128;
        }
        int i7 = i2;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 147) != 146, i7 & 1)) {
            int i8 = IAuthTabCallbackDefault + 123;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1794885701, i7, -1, "im.toss.features.faceverify.impl.ui.pass.FaceAuthTopSheet (FacePassScreen.kt:143)");
            }
            float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(z ? 200.0f : 260.0f);
            int i10 = IAuthTabCallbackDefault + 37;
            onTransact = i10 % 128;
            int i11 = i10 % 2;
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult = isSubmitButtonEnabled.onExtraCallbackWithResult(fIAuthTabCallback2, onQueryRefine.onExtraCallbackWithResult(500, 0, (setOnQueryTextListener) null, 6, (Object) null), "width", (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 432, 8);
            float fOnNavigationEvent = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onNavigationEvent();
            boolean zOnNavigationEvent = getFixedPositions.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            if (z) {
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(200.0f);
            } else if (zOnNavigationEvent) {
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(IAuthTabCallback + VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(onWarmupCompleted * (fOnNavigationEvent - 1.0f)));
            } else {
                int i12 = onTransact + 53;
                IAuthTabCallbackDefault = i12 % 128;
                if (i12 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                fIAuthTabCallback = IAuthTabCallback;
            }
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult2 = isSubmitButtonEnabled.onExtraCallbackWithResult(fIAuthTabCallback, onQueryRefine.onExtraCallbackWithResult(500, 0, (setOnQueryTextListener) null, 6, (Object) null), "height", (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 432, 8);
            Boolean bool = Boolean.FALSE;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new FacePassScreenKt$.ExternalSyntheticLambda1();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            Rally rallyOnExtraCallback = RallyKt.onExtraCallback(0, (getExtraParameters) null, 0, (getMediaContentViewGroup) null, (Integer) null, 0, bool, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (MaxInterstitialAd) null, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1572864, 24576, 16319);
            Unit unit = Unit.INSTANCE;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(rallyOnExtraCallback);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
            if (zOnNavigationEvent2 || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new onWarmupCompleted(rallyOnExtraCallback, null);
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult2, 6);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = RallyModifierKt.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, rallyOnExtraCallback, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult2, 6, 2);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback_Parcel()), 0.0f, StillCaptureFlashStopRepeatingQuirk.onNavigationEvent(ZslDisablerQuirk.onNavigationEvent(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResult2, 6), cameraCaptureResultEmptyCameraCaptureResult2, 0).IAuthTabCallback(), 0.0f, 0.0f, 13, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f));
            float fIAuthTabCallback3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.1f);
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = ensureNavButtonView.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted, fIAuthTabCallback3, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).onMessageChannelReady(), (toMetersPerSecond) null, 4, (Object) null);
            RoundedCornerShape roundedCornerShape = onExtraCallbackWithResult;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) setImageAssetsFolder.onWarmupCompleted(162130703, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{verifyDrawable.onExtraCallback(setExtensionStrength.onExtraCallbackWithResult(StreamSpec.onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallback2, roundedCornerShape, new MappingRedirectableLiveDataExternalSyntheticLambda1(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(60.0f), ByteOrderedDataOutputStream.onExtraCallback(436227745), 0.0f, r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallback((Float.floatToRawIntBits(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)) << 32) | (Float.floatToRawIntBits(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f)) & 4294967295L)), 0.0f, 0, 52, (DefaultConstructorMarker) null)), roundedCornerShape), y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult2, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null), 0L, new Pair[]{getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).IAuthTabCallback(), 0.2f))), getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult2, 6).onNavigationEvent(), 0.0f)))}, Float.valueOf(0.0f), Float.valueOf(0.0f), 0L, false, false, Float.valueOf(0.0f), 253, null}, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -162130702, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted()), onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<VirtualCameraControlExternalSyntheticLambda1>) cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult), onExtraCallbackWithResult((CameraPresenceProviderExternalSyntheticLambda6<VirtualCameraControlExternalSyntheticLambda1>) cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult2));
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.IAuthTabCallback_Parcel(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                int i13 = onTransact + 103;
                IAuthTabCallbackDefault = i13 % 128;
                if (i13 % 2 == 0) {
                    getAwbState.onExtraCallback();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            getbacktracenote.invoke(HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(((i7 >> 3) & 112) | 6));
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new FacePassScreenKt$.ExternalSyntheticLambda2(highSpeedResolverExternalSyntheticLambda2, z, getbacktracenote, i));
            int i14 = IAuthTabCallbackDefault + 121;
            onTransact = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 3 / 4;
            }
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i;
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        long jLongValue;
        Function0 function0 = (Function0) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i3 = 4;
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(325139634);
        if ((iIntValue & 6) == 0) {
            int i5 = onTransact + 113;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i7 = IAuthTabCallbackDefault + 39;
                onTransact = i7 % 128;
                if (i7 % 2 != 0) {
                    i3 = 5;
                }
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue;
        } else {
            i = iIntValue;
        }
        int i8 = iIntValue2 & 2;
        if (i8 != 0) {
            int i9 = IAuthTabCallbackDefault + 31;
            onTransact = i9 % 128;
            i = i9 % 2 != 0 ? i | 111 : i | 48;
        } else if ((iIntValue & 48) == 0) {
            int i10 = onTransact + 37;
            IAuthTabCallbackDefault = i10 % 128;
            int i11 = i10 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                int i12 = onTransact + 125;
                IAuthTabCallbackDefault = i12 % 128;
                i2 = i12 % 2 == 0 ? 43 : 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        Object obj = null;
        if (true ^ cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i & 19) != 18, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        } else {
            if (i8 != 0) {
                quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = onTransact + 115;
                IAuthTabCallbackDefault = i13 % 128;
                if (i13 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(325139634, i, -1, "im.toss.features.faceverify.impl.ui.pass.CancelButton (FacePassScreen.kt:210)");
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(325139634, i, -1, "im.toss.features.faceverify.impl.ui.pass.CancelButton (FacePassScreen.kt:210)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(configureReward.onExtraCallback(quirksExternalSyntheticBackport02, (getConfiguration) null, (getCachingExecutorService) null, true, false, false, false, (String) null, (Role) null, function0, 251, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            verifyClientState verifyclientstateOnWarmupCompleted = deprecated_authenticator.onWarmupCompleted("icon-x-mono");
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(665381907);
                jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onUnminimized();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(665382867);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -1444009137, OverseasRrnInputTextField.IAuthTabCallback(), 1444009151)).longValue();
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            setMainImageUri.IAuthTabCallback(verifyclientstateOnWarmupCompleted, deprecated_eventListenerFactory.Icon, (QuirksExternalSyntheticBackport0) null, handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f)), jLongValue, 0, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 3120, 0, 8164);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new FacePassScreenKt$.ExternalSyntheticLambda13(function0, quirksExternalSyntheticBackport0, iIntValue, iIntValue2));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asBinder(Object[] objArr) {
        long jOnExtraCallbackWithResult;
        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0;
        long jOnExtraCallbackWithResult2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 97;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(70656740);
            throw null;
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(70656740);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(iIntValue != 0, iIntValue & 1)) {
            int i3 = onTransact + 49;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 90 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(70656740, iIntValue, -1, "im.toss.features.faceverify.impl.ui.pass.FaceAuthBackground (FacePassScreen.kt:226)");
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0)) {
                    jOnExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallbackWithResult(3019898879L);
                } else {
                    jOnExtraCallbackWithResult = AppLovinAdVideoPlaybackListener.onWarmupCompleted.onNavigationEvent();
                    int i5 = IAuthTabCallbackDefault + 83;
                    onTransact = i5 % 128;
                    int i6 = i5 % 2;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent, jOnExtraCallbackWithResult, (toMetersPerSecond) null, 2, (Object) null);
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = CaptureNoResponseQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-260.0f), 1, (Object) null);
                y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1552935269);
                    jOnExtraCallbackWithResult2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onExtraCallbackWithResult();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1552934309);
                    jOnExtraCallbackWithResult2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                int i7 = onTransact + 103;
                IAuthTabCallbackDefault = i7 % 128;
                int i8 = i7 % 2;
                FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback((QuirksExternalSyntheticBackport0) setImageAssetsFolder.onWarmupCompleted(162130703, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{quirksExternalSyntheticBackport0OnWarmupCompleted2, 0L, new Pair[]{getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(jOnExtraCallbackWithResult2)), getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), 0.0f)))}, Float.valueOf(0.0f), Float.valueOf(0.0f), 0L, false, false, Float.valueOf(0.0f), 253, null}, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -162130702, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted()), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback2, 0.0f, 1, (Object) null);
                if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0)) {
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = verifyDrawable.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent2, jOnExtraCallbackWithResult, (toMetersPerSecond) null, 2, (Object) null);
                component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted22 = CaptureNoResponseQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback2, 0.0f, 1, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-260.0f), 1, (Object) null);
                y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                int i72 = onTransact + 103;
                IAuthTabCallbackDefault = i72 % 128;
                int i82 = i72 % 2;
                FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback((QuirksExternalSyntheticBackport0) setImageAssetsFolder.onWarmupCompleted(162130703, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{quirksExternalSyntheticBackport0OnWarmupCompleted22, 0L, new Pair[]{getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(jOnExtraCallbackWithResult2)), getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(y3externalsyntheticlambda0.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent(), 0.0f)))}, Float.valueOf(0.0f), Float.valueOf(0.0f), 0L, false, false, Float.valueOf(0.0f), 253, null}, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), -162130702, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted()), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new FacePassScreenKt$.ExternalSyntheticLambda20(iIntValue));
        }
        return null;
    }

    private static final Unit onNavigationEvent(boolean z, flipHorizontally fliphorizontally) {
        float f;
        int i = 2 % 2;
        int i2 = onTransact + 3;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        if (!z) {
            f = 0.0f;
        } else {
            int i4 = onTransact + 45;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            f = 1.0f;
        }
        fliphorizontally.IAuthTabCallbackStub(f);
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackDefault + 99;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(String str, boolean z, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        boolean z2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = IAuthTabCallbackDefault + 123;
        onTransact = i8 % 128;
        int i9 = i8 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1330232759);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i10 = onTransact + 25;
                IAuthTabCallbackDefault = i10 % 128;
                i6 = i10 % 2 == 0 ? 3 : 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                int i11 = IAuthTabCallbackDefault;
                int i12 = i11 + 25;
                onTransact = i12 % 128;
                int i13 = i12 % 2;
                int i14 = i11 + 23;
                onTransact = i14 % 128;
                int i15 = i14 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i16 = i2 & 4;
        if (i16 == 0) {
            if ((i & 384) == 0) {
                int i17 = onTransact + 75;
                IAuthTabCallbackDefault = i17 % 128;
                int i18 = i17 % 2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146) {
                int i19 = onTransact + 111;
                IAuthTabCallbackDefault = i19 % 128;
                int i20 = i19 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i4 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                int i21 = IAuthTabCallbackDefault + 15;
                onTransact = i21 % 128;
                if (i21 % 2 != 0) {
                    int i22 = 67 / 0;
                    quirksExternalSyntheticBackport04 = i16 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                } else if (i16 != 0) {
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1330232759, i4, -1, "im.toss.features.faceverify.impl.ui.pass.BottomText (FacePassScreen.kt:253)");
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1546569466, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str, Boolean.valueOf(z)));
                mExternalSyntheticApiModelOutline1 mexternalsyntheticapimodeloutline1 = mExternalSyntheticApiModelOutline1.onWarmupCompleted;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04, 0.0f, 1, (Object) null);
                boolean z3 = (i4 & 112) == 32;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z3 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new FacePassScreenKt$.ExternalSyntheticLambda9(z);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                mexternalsyntheticapimodeloutline1.onWarmupCompleted(str, ((mExternalSyntheticApiModelOutline1.IAuthTabCallback.onExtraCallbackWithResult) mExternalSyntheticApiModelOutline1.asInterface.onExtraCallback.IAuthTabCallback(-616426957, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), 616426958, new Object[]{mExternalSyntheticApiModelOutline1.asInterface.Companion}, DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted(), DefaultThreePaneScaffoldNavigatorCompanionExternalSyntheticLambda0.1.onWarmupCompleted())).onNavigationEvent(), attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized), 0, AppLovinPostbackService.onExtraCallbackWithResult.access100(), y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).requestPostMessageChannelWithExtras(), 0L, 0L, 0.0f, (bindChildren) null, (use) null, 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.Center, mExternalSyntheticApiModelOutline1.onTransact.Companion.onExtraCallback(), (mExternalSyntheticApiModelOutline1.IAuthTabCallbackStubProxy) null, (Long) null, (Object) null, cameraCaptureResultEmptyCameraCaptureResult2, i4 & 14, 100691328, 233416);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackStub();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new FacePassScreenKt$.ExternalSyntheticLambda10(str, z, quirksExternalSyntheticBackport03, i, i2));
                return;
            }
            return;
        }
        int i23 = IAuthTabCallbackDefault + 55;
        onTransact = i23 % 128;
        int i24 = i23 % 2;
        i3 |= 384;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i4 = i3;
        if ((i4 & 147) == 146) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onExtraCallback;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 121;
                $11 = i6 % 128;
                int i7 = i6 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), View.MeasureSpec.makeMeasureSpec(0, 0) + 26, 23139 - View.getDefaultSize(0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    i3 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), Color.red(0) + 26, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i8 = $10 + 93;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    int i10 = $11 + 111;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    try {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 24825), TextUtils.getTrimmedLength("") + 74, 8087 - TextUtils.indexOf((CharSequence) "", '0'), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            int i12 = $11 + 29;
                            $10 = i12 % 128;
                            int i13 = i12 % 2;
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 31 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 19488 - (ViewConfiguration.getWindowTouchSlop() >> 8), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                            int i15 = $10 + 53;
                            $11 = i15 % 128;
                            int i16 = i15 % 2;
                        } else {
                            obj = null;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                            } else {
                                int i19 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i20 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i19];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i20];
                            }
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i21 = 0; i21 < i; i21++) {
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private static final AppLovinSdkSettings IAuthTabCallback(Rally rally) {
        AppLovinSdkSettings interfaceDescriptor;
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rally, "");
            interfaceDescriptor = isMuted.getInterfaceDescriptor(AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, Cache.UP, AuthenticatorCompanionAuthenticatorNone.SLOW, false, (Function1) null, 72, (Object) null), Float.valueOf(10.0f), (Float) null, (Function1) null, 9, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(rally, "");
            interfaceDescriptor = isMuted.getInterfaceDescriptor(AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, Cache.UP, AuthenticatorCompanionAuthenticatorNone.SLOW, false, (Function1) null, 24, (Object) null), Float.valueOf(10.0f), (Float) null, (Function1) null, 6, (Object) null);
        }
        int i3 = IAuthTabCallbackDefault + 125;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 67 / 0;
        }
        return interfaceDescriptor;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Rally $rally;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(Rally rally, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$rally = rally;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$rally, access13800Var);
            int i2 = onExtraCallback + 67;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 41;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 51;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 119;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 85;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = IAuthTabCallback + 63;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0 ? i4 != 1 : i4 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(300L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            this.$rally.receiveFile();
            return Unit.INSTANCE;
        }
    }

    private static final void onWarmupCompleted(boolean z, Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1493825522);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                int i6 = IAuthTabCallbackDefault + 73;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        Object obj = null;
        if ((i & 48) == 0) {
            int i8 = IAuthTabCallbackDefault + 109;
            onTransact = i8 % 128;
            if (i8 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0);
                obj.hashCode();
                throw null;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                i3 = 16;
            } else {
                int i9 = IAuthTabCallbackDefault + 91;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
                i3 = 32;
            }
            i2 |= i3;
        }
        int i11 = i2;
        if ((i11 & 19) != 18) {
            int i12 = IAuthTabCallbackDefault + 45;
            onTransact = i12 % 128;
            int i13 = i12 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i11 & 1)) {
            int i14 = IAuthTabCallbackDefault + 47;
            onTransact = i14 % 128;
            int i15 = i14 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i16 = onTransact + 39;
                IAuthTabCallbackDefault = i16 % 128;
                if (i16 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1493825522, i11, -1, "im.toss.features.faceverify.impl.ui.pass.AuthWithAlternative (FacePassScreen.kt:274)");
                    int i17 = 34 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1493825522, i11, -1, "im.toss.features.faceverify.impl.ui.pass.AuthWithAlternative (FacePassScreen.kt:274)");
                }
            }
            Boolean bool = Boolean.FALSE;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new FacePassScreenKt$.ExternalSyntheticLambda11();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            Rally rallyOnExtraCallback = RallyKt.onExtraCallback(0, (getExtraParameters) null, 0, (getMediaContentViewGroup) null, (Integer) null, 0, bool, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, (MaxInterstitialAd) null, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1572864, 24576, 16319);
            Unit unit = Unit.INSTANCE;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rallyOnExtraCallback);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zOnNavigationEvent || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new IAuthTabCallback(rallyOnExtraCallback, null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            setAdvertiser.onExtraCallbackWithResult(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(!(z ^ true) ? R.string.face_verify_impl_pass_auth_with_bio_alternative : R.string.face_verify_impl_pass_auth_with_pin_alternative, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), RallyModifierKt.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, rallyOnExtraCallback, (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 2), setCallToAction.IAuthTabCallback.Companion.IAuthTabCallback(), (setCallToAction.onWarmupCompleted) null, setCallToAction.onExtraCallback.Weak, (setCallToAction.onNavigationEvent) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) null, function0, false, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i11 << 21) & 234881024) | 24960, 0, 1768);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i18 = onTransact + 67;
                IAuthTabCallbackDefault = i18 % 128;
                if (i18 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new FacePassScreenKt$.ExternalSyntheticLambda12(z, function0, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(String str, appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws Throwable {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i5;
        int i6 = 2 % 2;
        int i7 = onTransact + 77;
        IAuthTabCallbackDefault = i7 % 128;
        int i8 = i7 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1154732132);
        if ((i & 6) == 0) {
            int i9 = IAuthTabCallbackDefault + 97;
            onTransact = i9 % 128;
            if (i9 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult)) {
                int i10 = onTransact + 105;
                IAuthTabCallbackDefault = i10 % 128;
                i5 = i10 % 2 == 0 ? 2 : 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146) {
                int i12 = onTransact + 1;
                IAuthTabCallbackDefault = i12 % 128;
                int i13 = i12 % 2;
                z = true;
            } else {
                z = false;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i11 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1154732132, i4, -1, "im.toss.features.faceverify.impl.ui.pass.FaceAuthSmallContent (FacePassScreen.kt:308)");
                }
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport04);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    int i14 = IAuthTabCallbackDefault + 35;
                    onTransact = i14 % 128;
                    int i15 = i14 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(44.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                if (onextracallbackwithresult instanceof appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult.onWarmupCompleted) {
                    int i16 = IAuthTabCallbackDefault + 23;
                    onTransact = i16 % 128;
                    int i17 = i16 % 2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(270670231);
                    deprecated_eventListenerFactory deprecated_eventlistenerfactory = deprecated_eventListenerFactory.Lottie;
                    handleNativeAdClick.onExtraCallback.onWarmupCompleted onWarmupCompleted2 = handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(64.0f));
                    Object[] objArr = new Object[1];
                    a(new char[]{24, 3, 2, 14, 11, 14, 13757, 13757, 14, 0, 3, 0, 7, 19, 19, 0, '\n', 11, 15, 20, 5, '\t', 2, 4, 19, '\t', '\t', 14, 15, '\r', 22, 19, '\r', '\t', '\t', '\r', 16, 6, '\r', 16, 19, 21, 7, 1, 18, 19, 17, 7, 24, 4, 7, 19, '\n', '\f', 22, 19, '\r', '\t', '\r', 2, 19, 3, 19, 16, '\n', 15, '\n', '\f'}, (byte) (TextUtils.getTrimmedLength("") + 8), KeyEvent.keyCodeFromString("") + 68, objArr);
                    setMainImageUri.IAuthTabCallback(((String) objArr[0]).intern(), deprecated_eventlistenerfactory, (QuirksExternalSyntheticBackport0) null, onWarmupCompleted2, 0L, 1, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 199734, 0, 8148);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(270971148);
                    deprecated_eventListenerFactory deprecated_eventlistenerfactory2 = deprecated_eventListenerFactory.Lottie;
                    handleNativeAdClick.onExtraCallback.onWarmupCompleted onWarmupCompleted3 = handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(64.0f));
                    Object[] objArr2 = new Object[1];
                    a(new char[]{24, 3, 2, 14, 11, 14, 13778, 13778, 14, 0, 3, 0, 7, 19, 19, 0, '\n', 11, 15, 20, 5, '\t', 2, 4, 19, '\t', '\t', 14, 15, '\r', 22, 19, '\r', '\t', '\t', '\r', 16, 6, '\r', 16, 19, 21, 7, 1, 18, 19, 17, 7, 24, 4, 7, 19, '\n', '\f', 23, 4, '\f', 4, '\b', 5, '\n', 21, 20, '\n', 11, '\n', 13841}, (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 29), 67 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
                    setMainImageUri.IAuthTabCallback(((String) objArr2[0]).intern(), deprecated_eventlistenerfactory2, (QuirksExternalSyntheticBackport0) null, onWarmupCompleted3, 0L, Integer.MAX_VALUE, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 199734, 0, 8148);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                mExternalSyntheticApiModelOutline1.onWarmupCompleted.onWarmupCompleted(str, mExternalSyntheticApiModelOutline1.asInterface.Companion.IAuthTabCallback().onExtraCallbackWithResult(), (QuirksExternalSyntheticBackport0) null, 0, false, AppLovinPostbackService.onExtraCallbackWithResult.access100(), y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).isEngagementSignalsApiAvailable(), 0L, 0L, 0.0f, (bindChildren) null, (use) null, 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), mExternalSyntheticApiModelOutline1.onExtraCallbackWithResult.Center, (mExternalSyntheticApiModelOutline1.onTransact) null, (mExternalSyntheticApiModelOutline1.IAuthTabCallbackStubProxy) null, (Object) null, cameraCaptureResultEmptyCameraCaptureResult2, i4 & 14, 100690944, 237468);
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new FacePassScreenKt$.ExternalSyntheticLambda0(str, onextracallbackwithresult, quirksExternalSyntheticBackport03, i, i2));
                return;
            }
            return;
        }
        int i18 = IAuthTabCallbackDefault + 85;
        onTransact = i18 % 128;
        i3 = i18 % 2 != 0 ? i3 | 27865 : i3 | 384;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i4 = i3;
        if ((i4 & 147) == 146) {
        }
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 29;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(appendQueryJson2Url.onExtraCallback.onExtraCallbackWithResult.onNavigationEvent);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 89;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult, flipHorizontally fliphorizontally) {
        float f;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            int i3 = 63 / 0;
            if (onextracallbackwithresult instanceof appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult.onNavigationEvent) {
                int i4 = onTransact + 123;
                int i5 = i4 % 128;
                IAuthTabCallbackDefault = i5;
                f = i4 % 2 == 0 ? 2.0f : 0.0f;
                int i6 = i5 + 55;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
            } else {
                f = 1.0f;
            }
        } else {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            if (!(onextracallbackwithresult instanceof appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult.onNavigationEvent)) {
            }
        }
        fliphorizontally.IAuthTabCallbackStub(f);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(boolean z, appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult, String str, Boolean bool, boolean z2, Function1<? super appendQueryJson2Url.onExtraCallback, Unit> function1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        int i5;
        boolean z3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        int i10 = onTransact + 117;
        IAuthTabCallbackDefault = i10 % 128;
        int i11 = i10 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1842255798);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i12 = IAuthTabCallbackDefault + 51;
            onTransact = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 23 / 0;
                i8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 256 : 128;
            } else if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str))) {
            }
            i3 |= i8;
        }
        if ((i & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(bool)) {
                int i14 = onTransact + 57;
                IAuthTabCallbackDefault = i14 % 128;
                int i15 = i14 % 2;
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i & 24576) == 0) {
            int i16 = onTransact + 73;
            IAuthTabCallbackDefault = i16 % 128;
            int i17 = i16 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i18 = onTransact + 91;
                IAuthTabCallbackDefault = i18 % 128;
                int i19 = i18 % 2;
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        int i20 = i2 & 64;
        Object obj = null;
        if (i20 == 0) {
            if ((1572864 & i) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i21 = IAuthTabCallbackDefault + 11;
                    onTransact = i21 % 128;
                    if (i21 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    i4 = 1048576;
                } else {
                    i4 = 524288;
                }
                i3 |= i4;
            }
            i5 = i3;
            if ((599187 & i5) == 599186) {
                int i22 = onTransact + 103;
                IAuthTabCallbackDefault = i22 % 128;
                z3 = i22 % 2 != 0;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i5 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                int i23 = onTransact + 89;
                IAuthTabCallbackDefault = i23 % 128;
                int i24 = i23 % 2;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i20 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1842255798, i5, -1, "im.toss.features.faceverify.impl.ui.pass.FaceAuthBigContent (FacePassScreen.kt:350)");
                }
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult2 = QuirkSettingsLoader.Companion;
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult2.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport04);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult3.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult3.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult3.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult3.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult3.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult3.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                boolean z4 = (458752 & i5) == 131072;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z4 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new FacePassScreenKt$.ExternalSyntheticLambda4(function1);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                IAuthTabCallback(-223947395, new Object[]{(Function0) objOnMinimized, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(lowLightBoostControlExternalSyntheticLambda0.onExtraCallback(onextracallback, onextracallbackwithresult2.asBinder()), 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(13.0f), 0.0f, 11, (Object) null), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 223947398, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(lowLightBoostControlExternalSyntheticLambda0, onextracallback, 1.0f, false, 2, (Object) null);
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.access100(), false);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult3.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted, onextracallbackwithresult3.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult3.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult3.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult3.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult3.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                boolean z5 = (i5 & 112) == 32;
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z5 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = new FacePassScreenKt$.ExternalSyntheticLambda5(onextracallbackwithresult);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                IAuthTabCallback(z, onextracallbackwithresult, str, bool, z2, function1, attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent2, (Function1) objOnMinimized2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i5 & 524286, 0);
                if (onextracallbackwithresult instanceof appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult.onNavigationEvent) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1556648149);
                    IAuthTabCallback(-525869028, new Object[]{(appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult.onNavigationEvent) onextracallbackwithresult, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i5 >> 3) & 14), 2}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), 525869039, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1556581840);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new FacePassScreenKt$.ExternalSyntheticLambda6(z, onextracallbackwithresult, str, bool, z2, function1, quirksExternalSyntheticBackport03, i, i2));
                return;
            }
            return;
        }
        i3 |= 1572864;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i5 = i3;
        if ((599187 & i5) == 599186) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i5 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1, byte[] bArr, int i, int i2, int i3) {
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        function1.invoke(new appendQueryJson2Url.onExtraCallback.onWarmupCompleted(bArr, i, i2, i3));
        Unit unit = Unit.INSTANCE;
        int i5 = onTransact + 43;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(appendQueryJson2Url.onExtraCallback.onTransact.onExtraCallbackWithResult);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 103;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            function1.invoke(appendQueryJson2Url.onExtraCallback.IAuthTabCallback.onNavigationEvent);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        function1.invoke(appendQueryJson2Url.onExtraCallback.IAuthTabCallback.onNavigationEvent);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onTransact + 9;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(boolean z, appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult, String str, Boolean bool, boolean z2, Function1<? super appendQueryJson2Url.onExtraCallback, Unit> function1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        boolean z3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        Object obj;
        boolean z4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i4;
        int i5;
        int i6 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1002703901);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                int i7 = IAuthTabCallbackDefault + 79;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresult) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i9 = onTransact + 55;
            IAuthTabCallbackDefault = i9 % 128;
            int i10 = i9 % 2;
            i3 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(bool) ^ true ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 131072 : 65536;
        }
        int i11 = i2 & 64;
        if (i11 == 0) {
            if ((1572864 & i) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ^ true) ? 1048576 : 524288;
            }
            if ((599187 & i3) == 599186) {
                int i12 = onTransact + 103;
                IAuthTabCallbackDefault = i12 % 128;
                z3 = i12 % 2 != 0;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            } else {
                int i13 = onTransact + 107;
                int i14 = i13 % 128;
                IAuthTabCallbackDefault = i14;
                int i15 = i13 % 2;
                if (i11 != 0) {
                    int i16 = i14 + 89;
                    onTransact = i16 % 128;
                    if (i16 % 2 != 0) {
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                        throw null;
                    }
                    quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                } else {
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1002703901, i3, -1, "im.toss.features.faceverify.impl.ui.pass.PreviewContent (FacePassScreen.kt:420)");
                }
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport03);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                int i17 = i3 & 458752;
                boolean z5 = i17 == 131072;
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z5) {
                    FacePassScreenKt$.ExternalSyntheticLambda14 externalSyntheticLambda14 = new FacePassScreenKt$.ExternalSyntheticLambda14(function1);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda14);
                    obj = externalSyntheticLambda14;
                    setTaggedAddrCtrl settaggedaddrctrl = (setTaggedAddrCtrl) obj;
                    z4 = i17 != 131072;
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (z4) {
                        Object obj2 = objOnMinimized2;
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            FacePassScreenKt$.ExternalSyntheticLambda15 externalSyntheticLambda15 = new FacePassScreenKt$.ExternalSyntheticLambda15(function1);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda15);
                            obj2 = externalSyntheticLambda15;
                        }
                        Object obj3 = null;
                        enableCodeAndReason.IAuthTabCallback(z, onextracallbackwithresult, (QuirksExternalSyntheticBackport0) null, settaggedaddrctrl, (Function0) obj2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i3 & 126, 4);
                        if (onextracallbackwithresult.IAuthTabCallback()) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-583174952);
                            if (str == null) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-583156260);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                i4 = 131072;
                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-583156259);
                                i4 = 131072;
                                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                onNavigationEvent(str, z2, CaptureNoResponseQuirk.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(-10.0f), 1, (Object) null), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i3 >> 9) & 112) | 384, 0);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            }
                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(lowLightBoostControlExternalSyntheticLambda0, onextracallback2, 1.0f, false, 2, (Object) null), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                            if (z2) {
                                int i18 = IAuthTabCallbackDefault + 101;
                                onTransact = i18 % 128;
                                if (i18 % 2 != 0) {
                                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-582997229);
                                    Intrinsics.areEqual(bool, Boolean.TRUE);
                                    obj3.hashCode();
                                    throw null;
                                }
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-582997229);
                                boolean zAreEqual = Intrinsics.areEqual(bool, Boolean.TRUE);
                                boolean z6 = i17 == i4;
                                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                if (z6 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized3 = new FacePassScreenKt$.ExternalSyntheticLambda16(function1);
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized3);
                                }
                                onWarmupCompleted(zAreEqual, (Function0) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-582791575);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                int i19 = onTransact + 53;
                                IAuthTabCallbackDefault = i19 % 128;
                                int i20 = i19 % 2;
                            }
                            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback2, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f)), cameraCaptureResultEmptyCameraCaptureResult2, 6);
                        } else {
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-582718136);
                            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f)), cameraCaptureResultEmptyCameraCaptureResult2, 6);
                            if (str == null) {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-582636762);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-582636761);
                                onNavigationEvent(str, z2, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult2, (i3 >> 9) & 112, 4);
                                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                Unit unit = Unit.INSTANCE;
                            }
                        }
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                    }
                } else {
                    obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    setTaggedAddrCtrl settaggedaddrctrl2 = (setTaggedAddrCtrl) obj;
                    if (i17 != 131072) {
                    }
                    Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (z4) {
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new FacePassScreenKt$.ExternalSyntheticLambda17(z, onextracallbackwithresult, str, bool, z2, function1, quirksExternalSyntheticBackport02, i, i2));
                return;
            }
            return;
        }
        i3 |= 1572864;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((599187 & i3) == 599186) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z3, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final String onNavigationEvent(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackDefault + 3;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 101;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
    }

    private static final float IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 93;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        float fFloatValue = ((Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).floatValue();
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        int i5 = onTransact + 125;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return fFloatValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final float onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 125;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            number.floatValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float fFloatValue = number.floatValue();
        int i4 = onTransact + 111;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return fFloatValue;
    }

    private static final float onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<VirtualCameraControlExternalSyntheticLambda1> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallback = ((VirtualCameraControlExternalSyntheticLambda1) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).IAuthTabCallback();
        int i4 = onTransact + 113;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return fIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final float onExtraCallbackWithResult(CameraPresenceProviderExternalSyntheticLambda6<VirtualCameraControlExternalSyntheticLambda1> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1 = (VirtualCameraControlExternalSyntheticLambda1) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback();
            throw null;
        }
        float fIAuthTabCallback = virtualCameraControlExternalSyntheticLambda1.IAuthTabCallback();
        int i4 = IAuthTabCallbackDefault + 87;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return fIAuthTabCallback;
    }

    static {
        onWarmupCompleted();
        onExtraCallbackWithResult = RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f));
        IAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(329.0f);
        onWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(67.0f);
        int i = asInterface + 95;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(appendQueryJson2Url.onWarmupCompleted onwarmupcompleted, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, boolean z, String str, Function1 function1, CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda62, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {onwarmupcompleted, cameraPresenceProviderExternalSyntheticLambda6, Boolean.valueOf(z), str, function1, cameraPresenceProviderExternalSyntheticLambda62, getsupportedhighspeedresolutionsfor, highSpeedResolverExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) IAuthTabCallback(-1949642492, objArr, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, 1949642496, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(boolean z, appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult onextracallbackwithresult, String str, Boolean bool, boolean z2, Function1 function1, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {Boolean.valueOf(z), onextracallbackwithresult, str, bool, Boolean.valueOf(z2), function1, quirksExternalSyntheticBackport0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) IAuthTabCallback(359299573, objArr, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, -359299568, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {function0, quirksExternalSyntheticBackport0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) IAuthTabCallback(151611496, objArr, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, -151611494, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    private static final void onNavigationEvent(Function0<Unit> function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {function0, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        IAuthTabCallback(-223947395, objArr, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, 223947398, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {function0, quirksExternalSyntheticBackport0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) IAuthTabCallback(1840331183, objArr, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, -1840331175, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    private static final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        IAuthTabCallback(1706913899, objArr, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, -1706913892, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    private static final Unit onExtraCallbackWithResult(Function1 function1) {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) IAuthTabCallback(-662627678, new Object[]{function1}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, 662627687, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    private static final AppLovinSdkSettings onNavigationEvent(Rally rally) {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (AppLovinSdkSettings) IAuthTabCallback(-1420870013, new Object[]{rally}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, 1420870023, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback(appendQueryJson2Url.onWarmupCompleted onwarmupcompleted, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {onwarmupcompleted, function1, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) IAuthTabCallback(-407669155, objArr, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, 407669161, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallbackDefault(Function1 function1) {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (Unit) IAuthTabCallback(-1684808681, new Object[]{function1}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, 1684808681, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    private static final void IAuthTabCallback(appendQueryJson2Url.onWarmupCompleted.onExtraCallbackWithResult.onNavigationEvent onnavigationevent, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {onnavigationevent, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        IAuthTabCallback(-525869028, objArr, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, 525869039, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    public static final /* synthetic */ void onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int iIAuthTabCallback = ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback();
        IAuthTabCallback(1652265610, new Object[]{getsupportedhighspeedresolutionsfor, str}, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback(), iIAuthTabCallback, -1652265609, ItemPreset$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    static void onWarmupCompleted() {
        onExtraCallback = new char[]{51242, 64924, 64978, 64991, 64967, 64985, 64981, 64983, 64990, 64986, 64960, 64989, 64963, 64905, 64988, 64925, 64964, 64976, 64982, 64970, 64980, 51240, 51243, 64987, 64926};
        onNavigationEvent = (char) 51244;
    }
}
