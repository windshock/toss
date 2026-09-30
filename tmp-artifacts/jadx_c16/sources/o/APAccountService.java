package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.deeplink.ksp.registry.FeaturesMydataKspDeepLinkRegistry$;
import im.toss.features.home.feature.asset_home.compose.edit.AssetHomeAlertDialogKt$;
import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import im.toss.uikit.R;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class APAccountService {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    private static final Unit IAuthTabCallback(GlobalInfoRecorderUtils globalInfoRecorderUtils, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 13;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onWarmupCompleted(globalInfoRecorderUtils, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        GlobalInfoRecorderUtils globalInfoRecorderUtils = (GlobalInfoRecorderUtils) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(globalInfoRecorderUtils, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(globalInfoRecorderUtils, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onNavigationEvent + 73;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent();
        int i4 = onNavigationEvent + 37;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(GlobalInfoRecorderUtils globalInfoRecorderUtils, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 21;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(globalInfoRecorderUtils, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 11;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = ~(i7 | i8 | i2);
        int i10 = ~((~i2) | i8 | i6);
        int i11 = i9 | i10;
        int i12 = ~(i8 | i6);
        int i13 = (~(i2 | i7)) | (~(i7 | i)) | i10;
        int i14 = i6 + i + i5 + (1787548100 * i3) + (1101416392 * i4);
        int i15 = i14 * i14;
        int i16 = (((-61410478) * i6) - 623378432) + (561581232 * i) + (i11 * (-311495855)) + ((-311495855) * i12) + (311495855 * i13) + (250085376 * i5) + ((-778043392) * i3) + ((-46137344) * i4) + (324403200 * i15);
        int i17 = (i6 * (-930662234)) + 656878810 + (i * (-930660720)) + (i11 * (-757)) + (i12 * (-757)) + (i13 * 757) + (i5 * (-930661477)) + (i3 * 2052861356) + (i4 * 749768216) + (i15 * (-2028863488));
        return i16 + ((i17 * i17) * (-1850081280)) != 1 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        GlobalInfoRecorderUtils globalInfoRecorderUtils = (GlobalInfoRecorderUtils) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue3 = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(globalInfoRecorderUtils, function0, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(globalInfoRecorderUtils, function0, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        int i3 = onWarmupCompleted + 21;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0, v5b v5bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 71;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function0, v5bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 74 / 0;
        }
        return unitIAuthTabCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final GlobalInfoRecorderUtils onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 53;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 89 / 0;
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-20806378, i, -1, "im.toss.features.home.feature.asset_home.compose.edit.rememberAlertDialogState (AssetHomeAlertDialog.kt:42)");
            }
        } else if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent((TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback()));
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!zOnNavigationEvent) {
            int i5 = onWarmupCompleted + 81;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                throw null;
            }
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new GlobalInfoRecorderUtils();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
        }
        GlobalInfoRecorderUtils globalInfoRecorderUtils = (GlobalInfoRecorderUtils) objOnMinimized;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return globalInfoRecorderUtils;
    }

    private static final Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(GlobalInfoRecorderUtils globalInfoRecorderUtils, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = onNavigationEvent + 59;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = onWarmupCompleted + 107;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-145608981, i, -1, "im.toss.features.home.feature.asset_home.compose.edit.AssetHomeAlertDialog.<anonymous> (AssetHomeAlertDialog.kt:61)");
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-145608981, i, -1, "im.toss.features.home.feature.asset_home.compose.edit.AssetHomeAlertDialog.<anonymous> (AssetHomeAlertDialog.kt:61)");
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{globalInfoRecorderUtils.onExtraCallback(), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{globalInfoRecorderUtils.onExtraCallback(), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(GlobalInfoRecorderUtils globalInfoRecorderUtils, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 61;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 57;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1414279060, i, -1, "im.toss.features.home.feature.asset_home.compose.edit.AssetHomeAlertDialog.<anonymous> (AssetHomeAlertDialog.kt:64)");
            }
            String strOnExtraCallbackWithResult = globalInfoRecorderUtils.onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult != null) {
                int i8 = onWarmupCompleted + 11;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                if (StringsKt.isBlank(strOnExtraCallbackWithResult)) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(841846102);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(841788442);
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallbackWithResult, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i10 = onNavigationEvent + 67;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i11 = onWarmupCompleted + 121;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(Function0 function0, v5b v5bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(v5bVar, "");
        if ((i & 6) == 0) {
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v5bVar))) {
                i3 = 4;
            } else {
                int i5 = onWarmupCompleted + 1;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-790274404, i2, -1, "im.toss.features.home.feature.asset_home.compose.edit.AssetHomeAlertDialog.<anonymous> (AssetHomeAlertDialog.kt:70)");
                int i7 = onNavigationEvent + 107;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
            }
            v5bVar.onWarmupCompleted(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.uikit_confirm, cameraCaptureResultEmptyCameraCaptureResult, 0), function0, (QuirksExternalSyntheticBackport0) null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 57344 & (i2 << 12), 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0168 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull GlobalInfoRecorderUtils globalInfoRecorderUtils, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        Function0<Unit> function02;
        int i4;
        Function0<Unit> function03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i5;
        Function0<Unit> function04;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(globalInfoRecorderUtils, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2009385439);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(globalInfoRecorderUtils) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                function02 = function0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02)) {
                    int i8 = onWarmupCompleted + 25;
                    onNavigationEvent = i8 % 128;
                    i4 = i8 % 2 == 0 ? 52 : 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i3 & 19) != 18), i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                function03 = function02;
            } else {
                int i9 = onWarmupCompleted + 59;
                onNavigationEvent = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 59 / 0;
                    if (i7 != 0) {
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = new AssetHomeAlertDialogKt$.ExternalSyntheticLambda0();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        function04 = (Function0) objOnMinimized;
                    } else {
                        function04 = function02;
                    }
                } else if (i7 != 0) {
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i11 = onNavigationEvent + 95;
                    onWarmupCompleted = i11 % 128;
                    if (i11 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2009385439, i3, -1, "im.toss.features.home.feature.asset_home.compose.edit.AssetHomeAlertDialog (AssetHomeAlertDialog.kt:56)");
                        int i12 = 28 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2009385439, i3, -1, "im.toss.features.home.feature.asset_home.compose.edit.AssetHomeAlertDialog (AssetHomeAlertDialog.kt:56)");
                    }
                }
                if (globalInfoRecorderUtils.IAuthTabCallback()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1652411116);
                    function03 = function04;
                    v6.onWarmupCompleted(new Object[]{function04, ForwardingCameraControl.onExtraCallback(-790274404, true, new AssetHomeAlertDialogKt$.ExternalSyntheticLambda1(function04), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), ForwardingCameraControl.onExtraCallback(-145608981, true, new AssetHomeAlertDialogKt$.ExternalSyntheticLambda2(globalInfoRecorderUtils), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), ForwardingCameraControl.onExtraCallback(-1414279060, true, new AssetHomeAlertDialogKt$.ExternalSyntheticLambda3(globalInfoRecorderUtils), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), null, null, 0L, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i3 >> 3) & 14) | 3504), 112}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1196661986, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -1196661974, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    function03 = function04;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1651873917);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    int i13 = onNavigationEvent + 103;
                    onWarmupCompleted = i13 % 128;
                    int i14 = i13 % 2;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetHomeAlertDialogKt$.ExternalSyntheticLambda4(globalInfoRecorderUtils, function03, i, i2));
                int i15 = onWarmupCompleted + 5;
                onNavigationEvent = i15 % 128;
                if (i15 % 2 == 0) {
                    int i16 = 3 % 5;
                }
            }
            i5 = onNavigationEvent + 65;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            return;
        }
        i3 |= 48;
        function02 = function0;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(!((i3 & 19) != 18), i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        i5 = onNavigationEvent + 65;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
        }
    }

    public static /* synthetic */ Unit onExtraCallback(GlobalInfoRecorderUtils globalInfoRecorderUtils, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {globalInfoRecorderUtils, function0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onWarmupCompleted(-1477069081, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), objArr, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 1477069081);
    }

    public static /* synthetic */ Unit onWarmupCompleted(GlobalInfoRecorderUtils globalInfoRecorderUtils, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {globalInfoRecorderUtils, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onWarmupCompleted(-286070562, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), objArr, FeaturesMydataKspDeepLinkRegistry$.ExternalSyntheticLambda17.onNavigationEvent(), 286070563);
    }
}
