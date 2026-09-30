package im.toss.tds.compose.component.compound.listrow.v1;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.ui.graphics.painter.Painter;
import im.toss.features.home.core.local.model.TransactionFilterLocal;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda10;
import o.AppLovinNativeAdImplExternalSyntheticLambda2;
import o.AppLovinNativeAdImpla;
import o.AppLovinNativeAdImplc;
import o.AppLovinStarRatingView;
import o.AppLovinVastMediaViewb;
import o.AppLovinVastMediaViewc;
import o.AppLovinVastMediaViewe;
import o.AvoidCaptureProcessProgressAvailabilityCheckQuirk;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda0;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraProviderInitRetryPolicy1;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.ExifSpeedConverter;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.FocusMeteringControlExternalSyntheticLambda3;
import o.ForwardingCameraControl;
import o.GraphicDeviceInfo;
import o.HighSpeedResolverExternalSyntheticLambda1;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.KeylinesKtExternalSyntheticLambda1;
import o.LowLightBoostControlExternalSyntheticLambda0;
import o.LowLightBoostControlExternalSyntheticLambda1;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.accessgetTlsVersionsAsStringp;
import o.addCameraErrorListener;
import o.attachTimestamp;
import o.authParams;
import o.bindChildren;
import o.component5;
import o.createCameraCaptureCallback;
import o.delete;
import o.flipHorizontally;
import o.getAwbState;
import o.getBacktraceNote;
import o.getChildPreviewOutConfig;
import o.getHighestSurfacePriority;
import o.getHumanReadableName;
import o.getParentMetadataCallback;
import o.getSurfaceSize;
import o.getViewTypeCount;
import o.hasMoreElements;
import o.immediateFailedFuture;
import o.isRepeatingEnabled;
import o.mergeChildrenConfigs;
import o.notifySessionStop;
import o.r8lambda0mXP1lARJCGaK_2UHpQyAqAQ;
import o.r8lambdak6CWcefLe9tXuLSlGJo2BURuBM;
import o.resolveQuirkNames;
import o.setAdvertiser;
import o.setByteOrder;
import o.setCallToAction;
import o.setClickTrackingUrls;
import o.setStarRating;
import o.setViewableMRC50Requests;
import o.toPreviewOnlyRange;
import o.use;
import o.w3a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RightSlotMarker
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RightPreset {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    private final Function0<QuirkSettingsLoader.onNavigationEvent> onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnActivityResized = onActivityResized(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 81;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnActivityResized;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 73;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            ICustomTabsCallbackStubProxy(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitICustomTabsCallbackStubProxy = ICustomTabsCallbackStubProxy(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 47;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitICustomTabsCallbackStubProxy;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 59;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnMessageChannelReady = onMessageChannelReady(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 27;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnMessageChannelReady;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStubProxy(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 77;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitExtraCallbackWithResult = extraCallbackWithResult(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 68 / 0;
        }
        return unitExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit access000(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 81;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitICustomTabsCallbackStub = ICustomTabsCallbackStub(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 91;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitICustomTabsCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ Unit access100(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 111;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitExtraCallback = extraCallback(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 84 / 0;
        }
        int i6 = onNavigationEvent + 21;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unitExtraCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws NoWhenBranchMatchedException {
        String str = (String) objArr[0];
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[1];
        RowScope rowScope = (RowScope) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ICustomTabsCallback(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            obj.hashCode();
            throw null;
        }
        Unit unitICustomTabsCallback = ICustomTabsCallback(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onNavigationEvent + 101;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitICustomTabsCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asInterface(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 49;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return ICustomTabsCallbackDefault(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        ICustomTabsCallbackDefault(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        String str = (String) objArr[0];
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[1];
        RowScope rowScope = (RowScope) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -744908285, 744908294, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        int i4 = onNavigationEvent + 67;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 17;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit typedObject = readTypedObject(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 113;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return typedObject;
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws NoWhenBranchMatchedException {
        int i7 = ~i4;
        int i8 = ~(i7 | i5);
        int i9 = (~(i7 | (~i5) | i3)) | (~(i3 | i4 | i5));
        int i10 = ~i3;
        int i11 = (~(i5 | i4)) | (~(i10 | i5)) | (~(i10 | i4));
        int i12 = i3 + i4 + i + (1698977638 * i2) + (1466394737 * i6);
        int i13 = i12 * i12;
        int i14 = (((-1250291696) * i3) - 490274816) + ((-1116082190) * i4) + (i8 * (-67104753)) + ((-67104753) * i9) + (67104753 * i11) + ((-1183186944) * i) + (1553727488 * i2) + (1859780608 * i6) + (925827072 * i13);
        int i15 = ((i3 * (-1787956080)) - 1478154965) + (i4 * (-1787955198)) + (i8 * (-441)) + (i9 * (-441)) + (i11 * 441) + ((-1787955639) * i) + (552005654 * i2) + ((-2013897159) * i6) + (i13 * (-429457408));
        boolean z = false;
        switch (i14 + (i15 * i15 * (-402587648))) {
            case 1:
                return onWarmupCompleted(objArr);
            case 2:
                RightPreset rightPreset = (RightPreset) objArr[0];
                final String str = (String) objArr[1];
                final getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[2];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
                int iIntValue = ((Number) objArr[4]).intValue();
                int i16 = 2 % 2;
                if ((((Number) objArr[5]).intValue() & 2) != 0) {
                    gethumanreadablename = null;
                }
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i17 = IAuthTabCallback + 123;
                    onNavigationEvent = i17 % 128;
                    int i18 = i17 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1774343407, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1D (RightPreset.kt:235)");
                }
                rightPreset.onExtraCallback(ForwardingCameraControl.onExtraCallback(-2015427415, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.RightPreset$$ExternalSyntheticLambda5
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                        int i19 = 2 % 2;
                        int i20 = onNavigationEvent + 77;
                        onWarmupCompleted = i20 % 128;
                        if (i20 % 2 == 0) {
                            RightPreset.getInterfaceDescriptor(str, gethumanreadablename, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            throw null;
                        }
                        Unit interfaceDescriptor = RightPreset.getInterfaceDescriptor(str, gethumanreadablename, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i21 = onWarmupCompleted + 101;
                        onNavigationEvent = i21 % 128;
                        if (i21 % 2 == 0) {
                            return interfaceDescriptor;
                        }
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6 | ((iIntValue >> 3) & 112));
                if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
                    return null;
                }
                int i19 = IAuthTabCallback + 115;
                onNavigationEvent = i19 % 128;
                int i20 = i19 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                return null;
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onExtraCallbackWithResult(objArr);
            case 6:
                return IAuthTabCallback(objArr);
            case 7:
                return asInterface(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return IAuthTabCallbackDefault(objArr);
            case 11:
                RightPreset rightPreset2 = (RightPreset) objArr[0];
                getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
                int iIntValue2 = ((Number) objArr[3]).intValue();
                int i21 = 2 % 2;
                int i22 = IAuthTabCallback + 91;
                onNavigationEvent = i22 % 128;
                int i23 = i22 % 2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(265195293, iIntValue2, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1E (RightPreset.kt:250)");
                }
                int i24 = iIntValue2 << 9;
                onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{rightPreset2, accessgetTlsVersionsAsStringp.Typography5, Long.valueOf(r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextSecondary, cameraCaptureResultEmptyCameraCaptureResult2, 6)), isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf((i24 & 57344) | (i24 & 7168) | 390)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -525690975, 525690981, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
                    return null;
                }
                int i25 = onNavigationEvent + 23;
                IAuthTabCallback = i25 % 128;
                int i26 = i25 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                return null;
            case 12:
                return asBinder(objArr);
            case 13:
                return getInterfaceDescriptor(objArr);
            default:
                String str2 = (String) objArr[0];
                getHumanReadableName gethumanreadablename2 = (getHumanReadableName) objArr[1];
                RowScope rowScope = (RowScope) objArr[2];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
                int iIntValue3 = ((Number) objArr[4]).intValue();
                int i27 = 2 % 2;
                int i28 = IAuthTabCallback + 109;
                onNavigationEvent = i28 % 128;
                int i29 = i28 % 2;
                Intrinsics.checkNotNullParameter(rowScope, "");
                if ((iIntValue3 & 17) != 16) {
                    int i30 = IAuthTabCallback + 57;
                    onNavigationEvent = i30 % 128;
                    int i31 = i30 % 2;
                    z = true;
                } else {
                    int i32 = onNavigationEvent + 7;
                    IAuthTabCallback = i32 % 128;
                    int i33 = i32 % 2;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(z, iIntValue3 & 1)) {
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1092996669, iIntValue3, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row2A.<anonymous> (RightPreset.kt:355)");
                    }
                    w3a.onWarmupCompleted.onExtraCallback(str2, null, gethumanreadablename2, cameraCaptureResultEmptyCameraCaptureResult3, 3072, 2);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
                }
                return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 101;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return onUnminimized(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onUnminimized(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 109;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        if (i4 == 0) {
            unit = (Unit) onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), objArr, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 2107953619, -2107953619, iIAuthTabCallback, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
            int i5 = 79 / 0;
        } else {
            unit = (Unit) onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), objArr, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 2107953619, -2107953619, iIAuthTabCallback, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        }
        int i6 = IAuthTabCallback + 51;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(fliphorizontally);
        }
        onWarmupCompleted(fliphorizontally);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 21;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitWriteTypedObject = writeTypedObject(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 107;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitWriteTypedObject;
    }

    public static /* synthetic */ Unit onTransact(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 101;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnPostMessage = onPostMessage(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 109;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnPostMessage;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 21;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnMinimized = onMinimized(str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 69;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnMinimized;
    }

    public RightPreset(@NotNull Function0<? extends QuirkSettingsLoader.onNavigationEvent> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.onWarmupCompleted = function0;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        RightPreset rightPreset = (RightPreset) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return rightPreset.onWarmupCompleted((QuirkSettingsLoader.onNavigationEvent) rightPreset.onWarmupCompleted.invoke());
        }
        int i3 = 10 / 0;
        return rightPreset.onWarmupCompleted((QuirkSettingsLoader.onNavigationEvent) rightPreset.onWarmupCompleted.invoke());
    }

    public final void IAuthTabCallback(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 109;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-344820575, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1A (RightPreset.kt:64)");
        }
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography5;
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextSecondary, cameraCaptureResultEmptyCameraCaptureResult, 6);
        int i4 = i << 9;
        onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, accessgettlsversionsasstringp, Long.valueOf(jOnExtraCallback), isRepeatingEnabled.onExtraCallback.asBinder(), getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i4 & 57344) | (i4 & 7168) | 390)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -525690975, 525690981, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return;
        }
        int i5 = IAuthTabCallback + 99;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        CameraConfigExternalSyntheticLambda0.onTransact();
        int i7 = onNavigationEvent + 47;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void IAuthTabCallback(@Nullable String str, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        GraphicDeviceInfo graphicDeviceInfo2;
        int i3 = 2 % 2;
        long jOnTransact = (i2 & 2) != 0 ? setByteOrder.Companion.onTransact() : j;
        long jOnNavigationEvent = (i2 & 4) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
        Object obj = null;
        if ((i2 & 8) != 0) {
            int i4 = IAuthTabCallback + 67;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1664657591, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1A (RightPreset.kt:80)");
        }
        onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, str, new getHumanReadableName(jOnTransact, jOnNavigationEvent, graphicDeviceInfo2, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i >> 6) & 896) | (i & 14)), 0}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1798077257, 1798077258, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onNavigationEvent + 103;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i6 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws NoWhenBranchMatchedException {
        RightPreset rightPreset = (RightPreset) objArr[0];
        final String str = (String) objArr[1];
        final getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        Object obj = null;
        if ((((Number) objArr[5]).intValue() & 2) != 0) {
            gethumanreadablename = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i2 = IAuthTabCallback + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1028428716, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1A (RightPreset.kt:96)");
        }
        rightPreset.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(446036451, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.RightPreset$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                int i4 = 2 % 2;
                int i5 = onNavigationEvent + 93;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                Unit unit = (Unit) RightPreset.onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{str, gethumanreadablename, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -966007297, 966007304, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                int i7 = onNavigationEvent + 51;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 34 / 0;
                }
                return unit;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue >> 3) & 112) | 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i4 = onNavigationEvent + 115;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit ICustomTabsCallback(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onNavigationEvent + 41;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = onNavigationEvent + 55;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = IAuthTabCallback + 119;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 43 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(446036451, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1A.<anonymous> (RightPreset.kt:99)");
                }
                w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public final void onNavigationEvent(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(881425216, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1B (RightPreset.kt:111)");
        }
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography5;
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextSecondary, cameraCaptureResultEmptyCameraCaptureResult, 6);
        int i3 = i << 9;
        onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, accessgettlsversionsasstringp, Long.valueOf(jOnExtraCallback), isRepeatingEnabled.onExtraCallback.onTransact(), getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i3 & 57344) | (i3 & 7168) | 390)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -525690975, 525690981, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = IAuthTabCallback + 37;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i6 = IAuthTabCallback + 93;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException {
        RightPreset rightPreset = (RightPreset) objArr[0];
        String str = (String) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        long jLongValue2 = ((Number) objArr[3]).longValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int iIntValue2 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0 ? (iIntValue2 & 2) != 0 : (iIntValue2 & 2) != 0) {
            jLongValue = setByteOrder.Companion.onTransact();
        }
        long j = jLongValue;
        if ((iIntValue2 & 4) != 0) {
            int i3 = onNavigationEvent + 87;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            jLongValue2 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        }
        long j2 = jLongValue2;
        GraphicDeviceInfo graphicDeviceInfo2 = (iIntValue2 & 8) != 0 ? null : graphicDeviceInfo;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallback + 97;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1392221304, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1B (RightPreset.kt:127)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1392221304, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1B (RightPreset.kt:127)");
        }
        rightPreset.onExtraCallback(str, new getHumanReadableName(j, j2, graphicDeviceInfo2, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, (iIntValue & 14) | ((iIntValue >> 6) & 896), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return null;
    }

    public final void onExtraCallback(@Nullable final String str, @Nullable final getHumanReadableName gethumanreadablename, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        if ((i2 & 2) != 0) {
            gethumanreadablename = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onNavigationEvent + 33;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-154588819, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1B (RightPreset.kt:143)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-154588819, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1B (RightPreset.kt:143)");
        }
        onNavigationEvent(ForwardingCameraControl.onExtraCallback(1057204261, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.RightPreset$$ExternalSyntheticLambda15
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i5 = 2 % 2;
                int i6 = onExtraCallback + 49;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    RightPreset.IAuthTabCallbackStubProxy(str, gethumanreadablename, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                Unit unitIAuthTabCallbackStubProxy = RightPreset.IAuthTabCallbackStubProxy(str, gethumanreadablename, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i7 = onExtraCallback + 119;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                return unitIAuthTabCallbackStubProxy;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i >> 3) & 112) | 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallback + 77;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i6 != 0) {
                throw null;
            }
        }
    }

    private static final Unit extraCallbackWithResult(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onNavigationEvent + 25;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onNavigationEvent + 61;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onNavigationEvent + 95;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1057204261, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1B.<anonymous> (RightPreset.kt:145)");
                    int i8 = 28 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1057204261, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1B.<anonymous> (RightPreset.kt:145)");
                }
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = IAuthTabCallback + 13;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i10 = IAuthTabCallback + 77;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
        }
        return Unit.INSTANCE;
    }

    public final void onWarmupCompleted(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 61;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = IAuthTabCallback + 51;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2107671007, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1C (RightPreset.kt:156)");
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2107671007, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1C (RightPreset.kt:156)");
        }
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography6;
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextSecondary, cameraCaptureResultEmptyCameraCaptureResult, 6);
        int i5 = i << 9;
        onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, accessgettlsversionsasstringp, Long.valueOf(jOnExtraCallback), isRepeatingEnabled.onExtraCallback.asBinder(), getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i5 & 57344) | (i5 & 7168) | 390)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -525690975, 525690981, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void onNavigationEvent(@Nullable String str, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        GraphicDeviceInfo graphicDeviceInfo2;
        int i3 = 2 % 2;
        long jOnTransact = (i2 & 2) != 0 ? setByteOrder.Companion.onTransact() : j;
        long jOnNavigationEvent = (i2 & 4) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
        Object obj = null;
        if ((i2 & 8) != 0) {
            int i4 = IAuthTabCallback + 101;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1119785017, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1C (RightPreset.kt:172)");
        }
        onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, str, new getHumanReadableName(jOnTransact, jOnNavigationEvent, graphicDeviceInfo2, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i >> 6) & 896) | (i & 14)), 0}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 611630355, -611630352, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onNavigationEvent + 117;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i7 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        RightPreset rightPreset = (RightPreset) objArr[0];
        final String str = (String) objArr[1];
        final getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        if ((((Number) objArr[5]).intValue() & 2) != 0) {
            int i2 = IAuthTabCallback + 7;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            gethumanreadablename = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onNavigationEvent + 51;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1337606354, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1C (RightPreset.kt:188)");
        }
        rightPreset.onWarmupCompleted(ForwardingCameraControl.onExtraCallback(1668372071, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.RightPreset$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i5 = 2 % 2;
                int i6 = onExtraCallbackWithResult + 31;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                Unit unitAccess100 = RightPreset.access100(str, gethumanreadablename, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i8 = onExtraCallback + 69;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    return unitAccess100;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue >> 3) & 112) | 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallback + 91;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i6 != 0) {
                throw null;
            }
        }
        return null;
    }

    private static final Unit extraCallback(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onNavigationEvent + 95;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1668372071, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1C.<anonymous> (RightPreset.kt:191)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = onNavigationEvent + 1;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    public final void onExtraCallback(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 115;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-961050498, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1D (RightPreset.kt:203)");
        }
        int i5 = i << 9;
        onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, accessgetTlsVersionsAsStringp.Typography7, Long.valueOf(r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextSecondary, cameraCaptureResultEmptyCameraCaptureResult, 6)), isRepeatingEnabled.onExtraCallback.asBinder(), getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i5 & 57344) | (i5 & 7168) | 390)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -525690975, 525690981, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i6 = onNavigationEvent + 63;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i7 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void onWarmupCompleted(@Nullable String str, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        long j3;
        long jOnNavigationEvent;
        GraphicDeviceInfo graphicDeviceInfo2;
        long jOnTransact;
        int i3 = 2 % 2;
        if ((i2 & 2) != 0) {
            int i4 = IAuthTabCallback + 41;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                jOnTransact = setByteOrder.Companion.onTransact();
                int i5 = 77 / 0;
            } else {
                jOnTransact = setByteOrder.Companion.onTransact();
            }
            j3 = jOnTransact;
        } else {
            j3 = j;
        }
        if ((i2 & 4) != 0) {
            int i6 = IAuthTabCallback + 95;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        } else {
            jOnNavigationEvent = j2;
        }
        if ((i2 & 8) != 0) {
            int i8 = IAuthTabCallback + 23;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = IAuthTabCallback + 33;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(847348730, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1D (RightPreset.kt:219)");
        }
        onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, str, new getHumanReadableName(j3, jOnNavigationEvent, graphicDeviceInfo2, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i >> 6) & 896) | (i & 14)), 0}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1357016266, -1357016264, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i12 = IAuthTabCallback + 79;
        onNavigationEvent = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit readTypedObject(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(!((i & 17) == 16), i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2015427415, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1D.<anonymous> (RightPreset.kt:238)");
                int i3 = onNavigationEvent + 89;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onNavigationEvent + 67;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws NoWhenBranchMatchedException {
        RightPreset rightPreset = (RightPreset) objArr[0];
        String str = (String) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        long jLongValue2 = ((Number) objArr[3]).longValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int iIntValue2 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        if ((iIntValue2 & 2) != 0) {
            int i2 = onNavigationEvent + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            jLongValue = setByteOrder.Companion.onTransact();
        }
        long j = jLongValue;
        if ((iIntValue2 & 4) != 0) {
            jLongValue2 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        }
        long j2 = jLongValue2;
        GraphicDeviceInfo graphicDeviceInfo2 = (iIntValue2 & 8) != 0 ? null : graphicDeviceInfo;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = IAuthTabCallback + 13;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(574912443, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1E (RightPreset.kt:266)");
        }
        rightPreset.onNavigationEvent(str, new getHumanReadableName(j, j2, graphicDeviceInfo2, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue >> 6) & 896) | (iIntValue & 14), 0);
        if (!(true ^ CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i6 = onNavigationEvent + 15;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i7 == 0) {
                int i8 = 10 / 0;
            }
        }
        return null;
    }

    public final void onNavigationEvent(@Nullable final String str, @Nullable final getHumanReadableName gethumanreadablename, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 109;
        int i5 = i4 % 128;
        IAuthTabCallback = i5;
        if (i4 % 2 != 0 ? (i2 & 2) != 0 : (i2 & 2) != 0) {
            int i6 = i5 + 53;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            gethumanreadablename = null;
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(591325872, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1E (RightPreset.kt:282)");
        }
        onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, ForwardingCameraControl.onExtraCallback(-1404259605, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.RightPreset$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i8 = 2 % 2;
                int i9 = IAuthTabCallback + 35;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                Unit unitOnNavigationEvent = RightPreset.onNavigationEvent(str, gethumanreadablename, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i11 = onWarmupCompleted + 57;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 == 0) {
                    return unitOnNavigationEvent;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i >> 3) & 112) | 6)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -99696964, 99696975, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit writeTypedObject(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 105;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            z = (i & 94) != 48;
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = onNavigationEvent + 105;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 0 / 0;
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1404259605, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1E.<anonymous> (RightPreset.kt:285)");
                }
                w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public final void onExtraCallbackWithResult(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 75;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1383062114, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row2A (RightPreset.kt:298)");
            int i5 = onNavigationEvent + 111;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 / 4;
            }
        }
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography5;
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextSecondary, cameraCaptureResultEmptyCameraCaptureResult, 6);
        isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
        GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = isrepeatingenabled.onExtraCallbackWithResult();
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2 = accessgetTlsVersionsAsStringp.Typography6;
        long jOnExtraCallback2 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextTertiary, cameraCaptureResultEmptyCameraCaptureResult, 6);
        GraphicDeviceInfo graphicDeviceInfoAsBinder = isrepeatingenabled.asBinder();
        int i7 = i << 18;
        onExtraCallbackWithResult(accessgettlsversionsasstringp, jOnExtraCallback, graphicDeviceInfoOnExtraCallbackWithResult, getbacktracenote, accessgettlsversionsasstringp2, jOnExtraCallback2, graphicDeviceInfoAsBinder, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, ((i << 9) & 7168) | 1597830 | (29360128 & i7) | (i7 & 234881024));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void IAuthTabCallback(@Nullable final String str, @Nullable final String str2, @Nullable final getHumanReadableName gethumanreadablename, @Nullable final getHumanReadableName gethumanreadablename2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        Object obj = null;
        if ((i2 & 4) != 0) {
            int i4 = onNavigationEvent + 89;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            gethumanreadablename = null;
        }
        if ((i2 & 8) != 0) {
            gethumanreadablename2 = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1158236242, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row2A (RightPreset.kt:346)");
        }
        onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(1795592508, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.RightPreset$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                int i5 = 2 % 2;
                int i6 = IAuthTabCallback + 73;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                Unit unitIAuthTabCallbackStub = RightPreset.IAuthTabCallbackStub(str, gethumanreadablename, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                int i8 = onWarmupCompleted + 73;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 33 / 0;
                }
                return unitIAuthTabCallbackStub;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(1092996669, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.RightPreset$$ExternalSyntheticLambda8
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                int i5 = 2 % 2;
                int i6 = IAuthTabCallback + 63;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    RightPreset.onExtraCallbackWithResult(str2, gethumanreadablename2, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = RightPreset.onExtraCallbackWithResult(str2, gethumanreadablename2, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                int i7 = onExtraCallback + 15;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    return unitOnExtraCallbackWithResult;
                }
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i >> 6) & 896) | 54);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i5 = IAuthTabCallback + 93;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onMessageChannelReady(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = IAuthTabCallback + 27;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 64 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1795592508, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row2A.<anonymous> (RightPreset.kt:349)");
                }
                w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = onNavigationEvent + 85;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
                w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public final void onExtraCallback(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 9;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1832363135, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row2B (RightPreset.kt:368)");
            }
            accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography5;
            long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextSecondary, cameraCaptureResultEmptyCameraCaptureResult, 6);
            isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
            GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = isrepeatingenabled.onExtraCallbackWithResult();
            accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2 = accessgetTlsVersionsAsStringp.Typography7;
            long jOnExtraCallback2 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextTertiary, cameraCaptureResultEmptyCameraCaptureResult, 6);
            GraphicDeviceInfo graphicDeviceInfoAsBinder = isrepeatingenabled.asBinder();
            int i4 = i << 18;
            onExtraCallbackWithResult(accessgettlsversionsasstringp, jOnExtraCallback, graphicDeviceInfoOnExtraCallbackWithResult, getbacktracenote, accessgettlsversionsasstringp2, jOnExtraCallback2, graphicDeviceInfoAsBinder, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, ((i << 9) & 7168) | 1597830 | (29360128 & i4) | (i4 & 234881024));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallback + 85;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i6 != 0) {
                    int i7 = 12 / 0;
                    return;
                }
                return;
            }
            return;
        }
        CameraConfigExternalSyntheticLambda0.asBinder();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) throws NoWhenBranchMatchedException {
        RightPreset rightPreset = (RightPreset) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        long jLongValue2 = ((Number) objArr[4]).longValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[5];
        long jLongValue3 = ((Number) objArr[6]).longValue();
        long jLongValue4 = ((Number) objArr[7]).longValue();
        GraphicDeviceInfo graphicDeviceInfo2 = (GraphicDeviceInfo) objArr[8];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue = ((Number) objArr[10]).intValue();
        long jOnTransact = jLongValue;
        int iIntValue2 = ((Number) objArr[11]).intValue();
        int i = 2 % 2;
        if ((iIntValue2 & 4) != 0) {
            jOnTransact = setByteOrder.Companion.onTransact();
        }
        long j = jOnTransact;
        if ((iIntValue2 & 8) != 0) {
            jLongValue2 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        }
        long j2 = jLongValue2;
        Object obj = null;
        GraphicDeviceInfo graphicDeviceInfo3 = (iIntValue2 & 16) != 0 ? null : graphicDeviceInfo;
        if ((iIntValue2 & 32) != 0) {
            int i2 = onNavigationEvent + 23;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                jLongValue3 = setByteOrder.Companion.onTransact();
                int i3 = 79 / 0;
            } else {
                jLongValue3 = setByteOrder.Companion.onTransact();
            }
        }
        if ((iIntValue2 & 64) != 0) {
            int i4 = IAuthTabCallback + 65;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            jLongValue4 = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        }
        if ((iIntValue2 & 128) != 0) {
            graphicDeviceInfo2 = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1981076729, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row2B (RightPreset.kt:392)");
            int i6 = IAuthTabCallback + 67;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        rightPreset.onWarmupCompleted(str, str2, new getHumanReadableName(j, j2, graphicDeviceInfo3, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), new getHumanReadableName(jLongValue3, jLongValue4, graphicDeviceInfo2, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue >> 12) & 57344) | (iIntValue & 126), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = IAuthTabCallback + 85;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i9 != 0) {
                int i10 = 64 / 0;
            }
        }
        int i11 = IAuthTabCallback + 41;
        onNavigationEvent = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(@Nullable final String str, @Nullable final String str2, @Nullable final getHumanReadableName gethumanreadablename, @Nullable final getHumanReadableName gethumanreadablename2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        if ((i2 & 4) != 0) {
            gethumanreadablename = null;
        }
        if ((i2 & 8) != 0) {
            gethumanreadablename2 = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = IAuthTabCallback + 3;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1302645937, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row2B (RightPreset.kt:416)");
            int i6 = IAuthTabCallback + 53;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        onExtraCallback(ForwardingCameraControl.onExtraCallback(-477696198, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.RightPreset$$ExternalSyntheticLambda11
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i8 = 2 % 2;
                int i9 = onExtraCallbackWithResult + 121;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                Unit unitOnWarmupCompleted = RightPreset.onWarmupCompleted(str, gethumanreadablename, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i11 = onExtraCallback + 9;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 38 / 0;
                }
                return unitOnWarmupCompleted;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(-1180292037, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.RightPreset$$ExternalSyntheticLambda12
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i8 = 2 % 2;
                int i9 = IAuthTabCallback + 73;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                Unit unitIAuthTabCallback = RightPreset.IAuthTabCallback(str2, gethumanreadablename2, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i11 = onExtraCallback + 79;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 == 0) {
                    return unitIAuthTabCallback;
                }
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54 | ((i >> 6) & 896));
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return;
        }
        int i8 = onNavigationEvent + 27;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        CameraConfigExternalSyntheticLambda0.onTransact();
        if (i9 == 0) {
            throw null;
        }
    }

    private static final Unit onMinimized(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 43;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i5 = IAuthTabCallback + 87;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-477696198, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row2B.<anonymous> (RightPreset.kt:419)");
                int i6 = IAuthTabCallback + 15;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onActivityResized(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            z = true;
        } else {
            int i3 = onNavigationEvent + 39;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = IAuthTabCallback + 65;
            onNavigationEvent = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1180292037, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row2B.<anonymous> (RightPreset.kt:425)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onNavigationEvent + 53;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
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

    public final void IAuthTabCallback(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 105;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-752821088, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row2C (RightPreset.kt:438)");
            int i5 = IAuthTabCallback + 51;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography6;
        authParams authparams = authParams.TextTertiary;
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authparams, cameraCaptureResultEmptyCameraCaptureResult, 6);
        isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
        int i7 = i << 18;
        onExtraCallbackWithResult(accessgettlsversionsasstringp, jOnExtraCallback, isrepeatingenabled.asBinder(), getbacktracenote, accessgettlsversionsasstringp, r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authparams, cameraCaptureResultEmptyCameraCaptureResult, 6), isrepeatingenabled.asBinder(), getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, ((i << 9) & 7168) | 1597830 | (29360128 & i7) | (i7 & 234881024));
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void onNavigationEvent(@Nullable final String str, @Nullable final String str2, @Nullable final getHumanReadableName gethumanreadablename, @Nullable final getHumanReadableName gethumanreadablename2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback;
        int i5 = i4 + 107;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0 ? (i2 & 4) != 0 : (i2 & 4) != 0) {
            int i6 = i4 + 99;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            gethumanreadablename = null;
        }
        if ((i2 & 8) != 0) {
            gethumanreadablename2 = null;
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1447055632, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row2C (RightPreset.kt:486)");
            int i8 = onNavigationEvent + 85;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1543982392, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.RightPreset$$ExternalSyntheticLambda3
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i10 = 2 % 2;
                int i11 = onNavigationEvent + 95;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                String str3 = str;
                if (i12 != 0) {
                    return RightPreset.onTransact(str3, gethumanreadablename, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
                RightPreset.onTransact(str3, gethumanreadablename, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(841386553, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.RightPreset$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i10 = 2 % 2;
                int i11 = onWarmupCompleted + 99;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
                Unit unit = (Unit) RightPreset.onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{str2, gethumanreadablename2, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 792603261, -792603248, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                int i12 = IAuthTabCallback + 103;
                onWarmupCompleted = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 79 / 0;
                }
                return unit;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 54 | ((i >> 6) & 896));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static final Unit onPostMessage(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 59;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i5 = IAuthTabCallback + 57;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i7 = IAuthTabCallback + 35;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1543982392, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row2C.<anonymous> (RightPreset.kt:489)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = IAuthTabCallback + 7;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws NoWhenBranchMatchedException {
        String str = (String) objArr[0];
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[1];
        RowScope rowScope = (RowScope) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 17) != 16, iIntValue & 1)) {
            int i2 = onNavigationEvent + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onNavigationEvent + 101;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(841386553, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row2C.<anonymous> (RightPreset.kt:495)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(841386553, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row2C.<anonymous> (RightPreset.kt:495)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public final void onNavigationEvent(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(326720959, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row2D (RightPreset.kt:508)");
            int i3 = IAuthTabCallback + 55;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography7;
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextTertiary, cameraCaptureResultEmptyCameraCaptureResult, 6);
        isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
        GraphicDeviceInfo graphicDeviceInfoAsBinder = isrepeatingenabled.asBinder();
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2 = accessgetTlsVersionsAsStringp.Typography5;
        long jOnExtraCallback2 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextSecondary, cameraCaptureResultEmptyCameraCaptureResult, 6);
        GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = isrepeatingenabled.onExtraCallbackWithResult();
        int i5 = i << 18;
        onExtraCallbackWithResult(accessgettlsversionsasstringp, jOnExtraCallback, graphicDeviceInfoAsBinder, getbacktracenote, accessgettlsversionsasstringp2, jOnExtraCallback2, graphicDeviceInfoOnExtraCallbackWithResult, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, ((i << 9) & 7168) | 1597830 | (29360128 & i5) | (i5 & 234881024));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onNavigationEvent + 101;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void onExtraCallbackWithResult(@Nullable final String str, @Nullable final String str2, @Nullable final getHumanReadableName gethumanreadablename, @Nullable final getHumanReadableName gethumanreadablename2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 65;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0 ? (i2 & 4) != 0 : (i2 & 5) != 0) {
            gethumanreadablename = null;
        }
        if ((i2 & 8) != 0) {
            gethumanreadablename2 = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1591465327, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row2D (RightPreset.kt:554)");
            int i5 = IAuthTabCallback + 113;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        }
        onNavigationEvent(ForwardingCameraControl.onExtraCallback(-729306314, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.RightPreset$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i7 = 2 % 2;
                int i8 = onExtraCallbackWithResult + 117;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                Unit unitAsInterface = RightPreset.asInterface(str, gethumanreadablename, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i10 = onExtraCallbackWithResult + 59;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                return unitAsInterface;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(-1431902153, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.RightPreset$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i7 = 2 % 2;
                int i8 = IAuthTabCallback + 99;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                Unit unitAccess000 = RightPreset.access000(str2, gethumanreadablename2, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i10 = IAuthTabCallback + 103;
                onExtraCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 10 / 0;
                }
                return unitAccess000;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i >> 6) & 896) | 54);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static final Unit ICustomTabsCallbackDefault(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onNavigationEvent + 53;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-729306314, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row2D.<anonymous> (RightPreset.kt:557)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = onNavigationEvent + 59;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit ICustomTabsCallbackStub(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = IAuthTabCallback + 47;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = IAuthTabCallback + 123;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 28 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1431902153, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row2D.<anonymous> (RightPreset.kt:563)");
                }
                w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i7 = IAuthTabCallback + 107;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onNavigationEvent + 15;
        IAuthTabCallback = i9 % 128;
        if (i9 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public final void onWarmupCompleted(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 125;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1406263006, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row2E (RightPreset.kt:576)");
            int i5 = IAuthTabCallback + 33;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 2;
            }
        }
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography6;
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextTertiary, cameraCaptureResultEmptyCameraCaptureResult, 6);
        isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
        GraphicDeviceInfo graphicDeviceInfoAsBinder = isrepeatingenabled.asBinder();
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2 = accessgetTlsVersionsAsStringp.Typography5;
        long jOnExtraCallback2 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextSecondary, cameraCaptureResultEmptyCameraCaptureResult, 6);
        GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = isrepeatingenabled.onExtraCallbackWithResult();
        int i7 = i << 18;
        onExtraCallbackWithResult(accessgettlsversionsasstringp, jOnExtraCallback, graphicDeviceInfoAsBinder, getbacktracenote, accessgettlsversionsasstringp2, jOnExtraCallback2, graphicDeviceInfoOnExtraCallbackWithResult, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, ((i << 9) & 7168) | 1597830 | (29360128 & i7) | (i7 & 234881024));
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void onExtraCallback(@Nullable final String str, @Nullable final String str2, @Nullable final getHumanReadableName gethumanreadablename, @Nullable final getHumanReadableName gethumanreadablename2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback;
        int i5 = i4 + 103;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 4) != 0) {
            int i7 = i4 + 73;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            gethumanreadablename = null;
        }
        if ((i2 & 8) != 0) {
            gethumanreadablename2 = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = IAuthTabCallback + 89;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1735875022, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row2E (RightPreset.kt:624)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1735875022, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row2E (RightPreset.kt:624)");
        }
        onWarmupCompleted(ForwardingCameraControl.onExtraCallback(1292372276, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.RightPreset$$ExternalSyntheticLambda13
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                Unit unitIAuthTabCallbackDefault;
                int i10 = 2 % 2;
                int i11 = onWarmupCompleted + 1;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    unitIAuthTabCallbackDefault = RightPreset.IAuthTabCallbackDefault(str, gethumanreadablename, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i12 = 92 / 0;
                } else {
                    unitIAuthTabCallbackDefault = RightPreset.IAuthTabCallbackDefault(str, gethumanreadablename, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
                int i13 = onWarmupCompleted + 71;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
                return unitIAuthTabCallbackDefault;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(589776437, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.RightPreset$$ExternalSyntheticLambda14
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i10 = 2 % 2;
                int i11 = onNavigationEvent + 15;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                Unit unitOnExtraCallback = RightPreset.onExtraCallback(str2, gethumanreadablename2, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i13 = IAuthTabCallback + 123;
                onNavigationEvent = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 95 / 0;
                }
                return unitOnExtraCallback;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i >> 6) & 896) | 54);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = IAuthTabCallback + 65;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static final Unit ICustomTabsCallbackStubProxy(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = IAuthTabCallback + 69;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1292372276, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row2E.<anonymous> (RightPreset.kt:627)");
                int i5 = onNavigationEvent + 53;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onNavigationEvent + 17;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i8 = 39 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onUnminimized(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onNavigationEvent;
            int i4 = i3 + 49;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 89;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            int i8 = onNavigationEvent + 83;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(589776437, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row2E.<anonymous> (RightPreset.kt:633)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, null, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull Object obj, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, @Nullable String str, long j, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        float fIAuthTabCallback;
        String str2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 85;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            quirksExternalSyntheticBackport02 = (i2 & 4) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            if ((i2 & 2) != 0) {
            }
        }
        if ((i2 & 4) != 0) {
            int i5 = IAuthTabCallback + 27;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback();
        } else {
            fIAuthTabCallback = f;
        }
        if ((i2 & 8) != 0) {
            int i7 = onNavigationEvent + 69;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            str2 = null;
        } else {
            str2 = str;
        }
        long jOnTransact = (i2 & 16) != 0 ? setByteOrder.Companion.onTransact() : j;
        immediateFailedFuture immediatefailedfutureIAuthTabCallback = (i2 & 32) != 0 ? immediateFailedFuture.Companion.IAuthTabCallback() : immediatefailedfuture;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onNavigationEvent + 37;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1181338792, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Icon (RightPreset.kt:650)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1181338792, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Icon (RightPreset.kt:650)");
        }
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
        if (Float.isNaN(fIAuthTabCallback)) {
            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
        }
        AppLovinNativeAdImplc.onExtraCallback(obj, jOnTransact, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, fIAuthTabCallback).onExtraCallback(quirksExternalSyntheticBackport02), str2, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit>) null, (QuirkSettingsLoader) null, immediatefailedfutureIAuthTabCallback, (Painter) null, cameraCaptureResultEmptyCameraCaptureResult, (i & 14) | ((i >> 9) & 112) | (i & 7168) | ((i << 9) & 234881024), 752);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        immediateFailedFuture immediatefailedfutureIAuthTabCallback;
        String str = (String) objArr[1];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        immediateFailedFuture immediatefailedfuture = (immediateFailedFuture) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int iIntValue3 = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if ((iIntValue3 & 2) != 0) {
            int i2 = onNavigationEvent + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onextracallback = QuirksExternalSyntheticBackport0.Companion;
        }
        int i4 = (iIntValue3 & 4) == 0 ? iIntValue : 1;
        if ((iIntValue3 & 8) != 0) {
            int i5 = IAuthTabCallback + 65;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 31 / 0;
                immediatefailedfutureIAuthTabCallback = immediateFailedFuture.Companion.IAuthTabCallback();
            } else {
                immediatefailedfutureIAuthTabCallback = immediateFailedFuture.Companion.IAuthTabCallback();
            }
        } else {
            immediatefailedfutureIAuthTabCallback = immediatefailedfuture;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1266158750, iIntValue2, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Lottie (RightPreset.kt:669)");
            int i7 = IAuthTabCallback + 45;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        }
        AppLovinStarRatingView.IAuthTabCallback(str, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)).onExtraCallback(onextracallback), false, false, i4, 0.0f, false, 0.0f, 0.0f, null, immediatefailedfutureIAuthTabCallback, false, null, cameraCaptureResultEmptyCameraCaptureResult, (iIntValue2 & 14) | ((iIntValue2 << 6) & 57344), (iIntValue2 >> 9) & 14, 7148);
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return null;
        }
        int i9 = IAuthTabCallback + 27;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        CameraConfigExternalSyntheticLambda0.onTransact();
        return null;
    }

    public final void onNavigationEvent(boolean z, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Function1<? super Boolean, Unit> function1, boolean z2, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @Nullable AppLovinVastMediaViewb appLovinVastMediaViewb, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 7;
        IAuthTabCallback = i4 % 128;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i4 % 2 != 0 ? (i2 & 2) == 0 : (i2 & 4) == 0) ? quirksExternalSyntheticBackport0 : QuirksExternalSyntheticBackport0.Companion;
        Function1<? super Boolean, Unit> function12 = (i2 & 4) != 0 ? null : function1;
        boolean z3 = (i2 & 8) != 0 ? true : z2;
        if ((i2 & 16) != 0) {
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
        } else {
            camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
        }
        AppLovinVastMediaViewb appLovinVastMediaViewbIAuthTabCallback = (i2 & 32) != 0 ? AppLovinVastMediaViewe.onExtraCallbackWithResult.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6) : appLovinVastMediaViewb;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onNavigationEvent + 83;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2072205730, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Switch (RightPreset.kt:687)");
        }
        AppLovinVastMediaViewc.onExtraCallbackWithResult(z, function12, quirksExternalSyntheticBackport02, z3, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, appLovinVastMediaViewbIAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, (i & 14) | ((i >> 3) & 112) | ((i << 3) & 896) | (i & 7168) | (57344 & i) | (i & 458752), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void onWarmupCompleted(boolean z, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable setClickTrackingUrls.IAuthTabCallback iAuthTabCallback, @Nullable setClickTrackingUrls.onNavigationEvent onnavigationevent, boolean z2, @Nullable Function1<? super Boolean, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        setClickTrackingUrls.IAuthTabCallback iAuthTabCallback2;
        setClickTrackingUrls.IAuthTabCallback iAuthTabCallback3;
        int i3 = 2 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i2 & 4) != 0) {
            int i4 = onNavigationEvent + 35;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                iAuthTabCallback3 = setClickTrackingUrls.IAuthTabCallback.Fill;
                int i5 = 46 / 0;
            } else {
                iAuthTabCallback3 = setClickTrackingUrls.IAuthTabCallback.Fill;
            }
            iAuthTabCallback2 = iAuthTabCallback3;
        } else {
            iAuthTabCallback2 = iAuthTabCallback;
        }
        setClickTrackingUrls.onNavigationEvent onnavigationevent2 = (i2 & 8) != 0 ? setClickTrackingUrls.onNavigationEvent.Medium : onnavigationevent;
        boolean z3 = (i2 & 16) != 0 ? true : z2;
        Function1<? super Boolean, Unit> function12 = (i2 & 32) != 0 ? null : function1;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = IAuthTabCallback + 35;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1695247297, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.CheckBox (RightPreset.kt:707)");
                int i7 = 74 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1695247297, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.CheckBox (RightPreset.kt:707)");
            }
        }
        int i8 = i << 3;
        setStarRating.onExtraCallbackWithResult(new Object[]{Boolean.valueOf(z), quirksExternalSyntheticBackport02, Boolean.valueOf(z3), iAuthTabCallback2, onnavigationevent2, function12, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i & 458752) | (i8 & 57344) | (i & 126) | ((i >> 6) & 896) | (i8 & 7168)), 0}, -471264704, TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), TransactionFilterLocal.Companion.onNavigationEvent(), 471264710);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i9 = IAuthTabCallback + 111;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void IAuthTabCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable setCallToAction.IAuthTabCallback iAuthTabCallback, @Nullable setCallToAction.onWarmupCompleted onwarmupcompleted, @Nullable setCallToAction.onExtraCallback onextracallback, @Nullable setCallToAction.onNavigationEvent onnavigationevent, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z, boolean z2, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) throws Throwable {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallback;
        setCallToAction.onWarmupCompleted onwarmupcompletedIAuthTabCallback;
        setCallToAction.onNavigationEvent onnavigationeventOnExtraCallbackWithResult;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if ((i3 & 2) != 0) {
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            int i5 = onNavigationEvent + 121;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        if ((i3 & 4) != 0) {
            int i7 = IAuthTabCallback + 9;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 != 0) {
                iAuthTabCallbackOnExtraCallback = ((setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(setAdvertiser.onExtraCallback())).onExtraCallback();
                int i8 = 48 / 0;
            } else {
                iAuthTabCallbackOnExtraCallback = ((setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(setAdvertiser.onExtraCallback())).onExtraCallback();
            }
        } else {
            iAuthTabCallbackOnExtraCallback = iAuthTabCallback;
        }
        if ((i3 & 8) != 0) {
            int i9 = onNavigationEvent + 121;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            onwarmupcompletedIAuthTabCallback = ((setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(setAdvertiser.onExtraCallback())).IAuthTabCallback();
        } else {
            onwarmupcompletedIAuthTabCallback = onwarmupcompleted;
        }
        setCallToAction.onExtraCallback onextracallbackOnWarmupCompleted = (i3 & 16) != 0 ? ((setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(setAdvertiser.onExtraCallback())).onWarmupCompleted() : onextracallback;
        if ((i3 & 32) != 0) {
            int i11 = onNavigationEvent + 1;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 == 0) {
                onnavigationeventOnExtraCallbackWithResult = ((setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(setAdvertiser.onExtraCallback())).onExtraCallbackWithResult();
                int i12 = 61 / 0;
            } else {
                onnavigationeventOnExtraCallbackWithResult = ((setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(setAdvertiser.onExtraCallback())).onExtraCallbackWithResult();
            }
        } else {
            onnavigationeventOnExtraCallbackWithResult = onnavigationevent;
        }
        if ((i3 & 64) != 0) {
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            Object obj = objOnMinimized;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                int i13 = onNavigationEvent + 117;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
                Object objOnWarmupCompleted = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnWarmupCompleted);
                obj = objOnWarmupCompleted;
            }
            camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) obj;
        } else {
            camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
        }
        boolean z3 = (i3 & 128) == 0 ? z : true;
        boolean z4 = (i3 & 256) != 0 ? false : z2;
        Function0<Unit> function03 = (i3 & 512) != 0 ? null : function0;
        Function0<Unit> function04 = (i3 & 1024) != 0 ? null : function02;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-585511565, i, i2, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Button (RightPreset.kt:732)");
        }
        setAdvertiser.onExtraCallbackWithResult(str, quirksExternalSyntheticBackport02, iAuthTabCallbackOnExtraCallback, onwarmupcompletedIAuthTabCallback, onextracallbackOnWarmupCompleted, onnavigationeventOnExtraCallbackWithResult, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, function03, function04, z3, z4, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 24) & 234881024) | (4194302 & i) | ((i >> 6) & 29360128) | (1879048192 & (i << 6)), (i >> 24) & 14, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void IAuthTabCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onnavigationevent, @Nullable AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, @Nullable AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted onwarmupcompleted, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onNavigationEvent2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 69;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i2 & 4) != 0) {
            int i6 = IAuthTabCallback + 49;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                ((AppLovinNativeAdImplExternalSyntheticLambda2.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback())).onNavigationEvent();
                throw null;
            }
            onNavigationEvent2 = ((AppLovinNativeAdImplExternalSyntheticLambda2.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback())).onNavigationEvent();
        } else {
            onNavigationEvent2 = onnavigationevent;
        }
        AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = (i2 & 8) != 0 ? ((AppLovinNativeAdImplExternalSyntheticLambda2.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback())).onWarmupCompleted() : onextracallbackwithresult;
        AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted onwarmupcompletedIAuthTabCallback = (i2 & 16) != 0 ? ((AppLovinNativeAdImplExternalSyntheticLambda2.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback())).IAuthTabCallback() : onwarmupcompleted;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = IAuthTabCallback + 51;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1329282748, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Badge (RightPreset.kt:845)");
            int i9 = onNavigationEvent + 117;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
        }
        AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback(str, quirksExternalSyntheticBackport02, onNavigationEvent2, onextracallbackwithresultOnWarmupCompleted, onwarmupcompletedIAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, 65534 & i, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i11 = IAuthTabCallback + 121;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i13 = IAuthTabCallback + 61;
        onNavigationEvent = i13 % 128;
        int i14 = i13 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        RightPreset rightPreset = (RightPreset) objArr[0];
        accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = (accessgetTlsVersionsAsStringp) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[3];
        getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote = (getBacktraceNote) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1084378833, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row1 (RightPreset.kt:862)");
                int i3 = onNavigationEvent + 119;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            w3a w3aVar = w3a.onWarmupCompleted;
            int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
            w3aVar.onWarmupCompleted(accessgettlsversionsasstringp, jLongValue, graphicDeviceInfo, (createCameraCaptureCallback) onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{rightPreset}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1881468993, 1881469003, iIAuthTabCallback, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback()), getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, (iIntValue & 14) | 196608 | (iIntValue & 112) | (iIntValue & 896) | ((iIntValue << 3) & 57344), 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            return null;
        }
        CameraConfigExternalSyntheticLambda0.asBinder();
        obj.hashCode();
        throw null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v24 o.resolveQuirkName$IAuthTabCallback, still in use, count: 2, list:
          (r6v24 o.resolveQuirkName$IAuthTabCallback) from 0x001d: INVOKE (r6v24 o.resolveQuirkName$IAuthTabCallback) VIRTUAL call: o.resolveQuirkName.IAuthTabCallback.IAuthTabCallback():float A[WRAPPED]
          (r6v24 o.resolveQuirkName$IAuthTabCallback) from 0x0049: PHI (r6v5 o.resolveQuirkName$IAuthTabCallback) = (r6v1 o.resolveQuirkName$IAuthTabCallback), (r6v24 o.resolveQuirkName$IAuthTabCallback) binds: [B:10:0x0030, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    private final o.createCameraCaptureCallback onWarmupCompleted(o.QuirkSettingsLoader.onNavigationEvent r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = im.toss.tds.compose.component.compound.listrow.v1.RightPreset.onNavigationEvent
            int r1 = r1 + 19
            int r2 = r1 % 128
            im.toss.tds.compose.component.compound.listrow.v1.RightPreset.IAuthTabCallback = r2
            int r1 = r1 % r0
            boolean r1 = r6 instanceof o.resolveQuirkName.IAuthTabCallback
            r3 = 0
            if (r1 == 0) goto L99
            int r2 = r2 + 37
            int r1 = r2 % 128
            im.toss.tds.compose.component.compound.listrow.v1.RightPreset.onNavigationEvent = r1
            int r2 = r2 % r0
            r1 = 0
            if (r2 == 0) goto L28
            o.resolveQuirkName$IAuthTabCallback r6 = (o.resolveQuirkName.IAuthTabCallback) r6
            float r2 = r6.IAuthTabCallback()
            r4 = 1073741824(0x40000000, float:2.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L49
            goto L32
        L28:
            o.resolveQuirkName$IAuthTabCallback r6 = (o.resolveQuirkName.IAuthTabCallback) r6
            float r2 = r6.IAuthTabCallback()
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 <= 0) goto L49
        L32:
            o.createCameraCaptureCallback$IAuthTabCallback r6 = o.createCameraCaptureCallback.Companion
            int r6 = r6.onExtraCallback()
            o.createCameraCaptureCallback r6 = o.createCameraCaptureCallback.onExtraCallback(r6)
            int r1 = im.toss.tds.compose.component.compound.listrow.v1.RightPreset.onNavigationEvent
            int r1 = r1 + 69
            int r2 = r1 % 128
            im.toss.tds.compose.component.compound.listrow.v1.RightPreset.IAuthTabCallback = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L48
            return r6
        L48:
            throw r3
        L49:
            float r2 = r6.IAuthTabCallback()
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 != 0) goto L71
            int r6 = im.toss.tds.compose.component.compound.listrow.v1.RightPreset.onNavigationEvent
            int r6 = r6 + 81
            int r1 = r6 % 128
            im.toss.tds.compose.component.compound.listrow.v1.RightPreset.IAuthTabCallback = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L67
            o.createCameraCaptureCallback$IAuthTabCallback r6 = o.createCameraCaptureCallback.Companion
            int r6 = r6.IAuthTabCallback()
            o.createCameraCaptureCallback r6 = o.createCameraCaptureCallback.onExtraCallback(r6)
            return r6
        L67:
            o.createCameraCaptureCallback$IAuthTabCallback r6 = o.createCameraCaptureCallback.Companion
            int r6 = r6.IAuthTabCallback()
            o.createCameraCaptureCallback.onExtraCallback(r6)
            throw r3
        L71:
            float r6 = r6.IAuthTabCallback()
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 >= 0) goto L99
            int r6 = im.toss.tds.compose.component.compound.listrow.v1.RightPreset.IAuthTabCallback
            int r6 = r6 + 77
            int r1 = r6 % 128
            im.toss.tds.compose.component.compound.listrow.v1.RightPreset.onNavigationEvent = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L8f
            o.createCameraCaptureCallback$IAuthTabCallback r6 = o.createCameraCaptureCallback.Companion
            int r6 = r6.onTransact()
            o.createCameraCaptureCallback r6 = o.createCameraCaptureCallback.onExtraCallback(r6)
            return r6
        L8f:
            o.createCameraCaptureCallback$IAuthTabCallback r6 = o.createCameraCaptureCallback.Companion
            int r6 = r6.onTransact()
            o.createCameraCaptureCallback.onExtraCallback(r6)
            throw r3
        L99:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: im.toss.tds.compose.component.compound.listrow.v1.RightPreset.onWarmupCompleted(o.QuirkSettingsLoader$onNavigationEvent):o.createCameraCaptureCallback");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull setViewableMRC50Requests.onWarmupCompleted onwarmupcompleted) {
        float fIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = attachTimestamp.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, new Function1() { // from class: im.toss.tds.compose.component.compound.listrow.v1.RightPreset$$ExternalSyntheticLambda6
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 101;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallbackWithResult = RightPreset.onExtraCallbackWithResult((flipHorizontally) obj);
                int i5 = onExtraCallback + 7;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 40 / 0;
                }
                return unitOnExtraCallbackWithResult;
            }
        });
        setViewableMRC50Requests.onWarmupCompleted.IAuthTabCallback iAuthTabCallback = setViewableMRC50Requests.onWarmupCompleted.Companion;
        if (Intrinsics.areEqual(onwarmupcompleted, iAuthTabCallback.IAuthTabCallback())) {
            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f);
            int i2 = IAuthTabCallback + 97;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = onNavigationEvent + 67;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            if (Intrinsics.areEqual(onwarmupcompleted, iAuthTabCallback.onWarmupCompleted())) {
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f);
            } else if (Intrinsics.areEqual(onwarmupcompleted, iAuthTabCallback.onExtraCallback())) {
                int i6 = IAuthTabCallback + 47;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f);
            }
        }
        return quirksExternalSyntheticBackport0.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback, 0.0f, 0.0f, fIAuthTabCallback, 0.0f, 11, (Object) null));
    }

    private static final Unit onWarmupCompleted(flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.IAuthTabCallback_Parcel(fliphorizontally.onExtraCallback(getViewTypeCount.onNavigationEvent.Companion.onExtraCallback().IAuthTabCallback()));
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 17;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RightPreset)) {
            int i2 = IAuthTabCallback + 31;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        boolean z = !Intrinsics.areEqual(this.onWarmupCompleted, ((RightPreset) obj).onWarmupCompleted);
        int i4 = onNavigationEvent + 37;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            this.onWarmupCompleted.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.onWarmupCompleted.hashCode();
        int i3 = IAuthTabCallback + 95;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 8 / 0;
        }
        return iHashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@NotNull Object obj, @NotNull Function0<Unit> function0, @NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable setViewableMRC50Requests.onWarmupCompleted onwarmupcompleted, @Nullable setViewableMRC50Requests.onNavigationEvent onnavigationevent, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        setViewableMRC50Requests.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult;
        setViewableMRC50Requests.onNavigationEvent onnavigationeventOnExtraCallback;
        long jOnTransact;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 81;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(str, "");
            quirksExternalSyntheticBackport02 = (i2 & 59) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(str, "");
            if ((i2 & 8) != 0) {
            }
        }
        if ((i2 & 16) != 0) {
            onwarmupcompletedOnExtraCallbackWithResult = setViewableMRC50Requests.onWarmupCompleted.Companion.onExtraCallbackWithResult();
        } else {
            int i5 = IAuthTabCallback + 109;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            onwarmupcompletedOnExtraCallbackWithResult = onwarmupcompleted;
        }
        if ((i2 & 32) != 0) {
            int i7 = onNavigationEvent + 61;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            onnavigationeventOnExtraCallback = setViewableMRC50Requests.onNavigationEvent.Companion.onExtraCallback();
        } else {
            onnavigationeventOnExtraCallback = onnavigationevent;
        }
        if ((i2 & 64) != 0) {
            int i9 = onNavigationEvent + 7;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-766614686, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.IconButton (RightPreset.kt:758)");
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, onwarmupcompletedOnExtraCallbackWithResult).onExtraCallback(quirksExternalSyntheticBackport02);
        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
            getAwbState.onExtraCallback();
        }
        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
            int i11 = onNavigationEvent + 67;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                throw null;
            }
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
        AppLovinNativeAdImpla.IAuthTabCallback(obj, function0, str, null, onwarmupcompletedOnExtraCallbackWithResult, onnavigationeventOnExtraCallback, jOnTransact, cameraCaptureResultEmptyCameraCaptureResult, i & 4187134, 8);
        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private final void onExtraCallbackWithResult(accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, long j, GraphicDeviceInfo graphicDeviceInfo, getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, accessgetTlsVersionsAsStringp accessgettlsversionsasstringp2, long j2, GraphicDeviceInfo graphicDeviceInfo2, getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1308963429, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.RightPreset.Row2 (RightPreset.kt:883)");
        }
        QuirkSettingsLoader.onNavigationEvent onnavigationevent = (QuirkSettingsLoader.onNavigationEvent) this.onWarmupCompleted.invoke();
        createCameraCaptureCallback createcameracapturecallbackOnWarmupCompleted = onWarmupCompleted(onnavigationevent);
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
        component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onnavigationevent, cameraCaptureResultEmptyCameraCaptureResult, 0);
        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
            getAwbState.onExtraCallback();
        }
        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            i2 = IAuthTabCallback + 115;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            i2 = IAuthTabCallback + 31;
        }
        onNavigationEvent = i2 % 128;
        int i4 = i2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
        LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
        w3a w3aVar = w3a.onWarmupCompleted;
        w3aVar.onWarmupCompleted(accessgettlsversionsasstringp, j, graphicDeviceInfo, createcameracapturecallbackOnWarmupCompleted, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, (i & 14) | 196608 | (i & 112) | (i & 896) | ((i << 3) & 57344), 0);
        int i5 = i >> 12;
        w3aVar.onWarmupCompleted(accessgettlsversionsasstringp2, j2, graphicDeviceInfo2, createcameracapturecallbackOnWarmupCompleted, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, (i5 & 112) | (i5 & 14) | 196608 | (i5 & 896) | ((i >> 9) & 57344), 0);
        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public static /* synthetic */ Unit asBinder(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 792603261, -792603248, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback_Parcel(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -966007297, 966007304, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    private final void onWarmupCompleted(accessgetTlsVersionsAsStringp accessgettlsversionsasstringp, long j, GraphicDeviceInfo graphicDeviceInfo, getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, accessgettlsversionsasstringp, Long.valueOf(j), graphicDeviceInfo, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -525690975, 525690981, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    private static final Unit onActivityLayout(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 2107953619, -2107953619, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    private static final Unit onRelationshipValidationResult(String str, getHumanReadableName gethumanreadablename, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{str, gethumanreadablename, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -744908285, 744908294, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    public final void IAuthTabCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) throws NoWhenBranchMatchedException {
        onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, str, quirksExternalSyntheticBackport0, Integer.valueOf(i), immediatefailedfuture, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -634694247, 634694251, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    public final void onExtraCallbackWithResult(@Nullable String str, @Nullable getHumanReadableName gethumanreadablename, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, str, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1798077257, 1798077258, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    public final void onExtraCallbackWithResult(@Nullable String str, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, str, Long.valueOf(j), Long.valueOf(j2), graphicDeviceInfo, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 981445356, -981445351, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    public final void IAuthTabCallback(@Nullable String str, @Nullable getHumanReadableName gethumanreadablename, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, str, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 611630355, -611630352, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    public final void onWarmupCompleted(@Nullable String str, @Nullable getHumanReadableName gethumanreadablename, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, str, gethumanreadablename, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 1357016266, -1357016264, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    public final void onExtraCallbackWithResult(@Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -99696964, 99696975, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    public final void onExtraCallback(@Nullable String str, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, str, Long.valueOf(j), Long.valueOf(j2), graphicDeviceInfo, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 828273710, -828273702, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    public final void onWarmupCompleted(@Nullable String str, @Nullable String str2, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j3, long j4, @Nullable GraphicDeviceInfo graphicDeviceInfo2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, str, str2, Long.valueOf(j), Long.valueOf(j2), graphicDeviceInfo, Long.valueOf(j3), Long.valueOf(j4), graphicDeviceInfo2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 341754412, -341754400, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    public final createCameraCaptureCallback onWarmupCompleted() {
        int iIAuthTabCallback = VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback();
        return (createCameraCaptureCallback) onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1881468993, 1881469003, iIAuthTabCallback, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }
}
