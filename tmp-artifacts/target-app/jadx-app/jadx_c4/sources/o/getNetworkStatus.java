package o;

import android.content.Context;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.tmoney.LiveCheckConstants;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.inventory_sdk.InventoryAdManager;
import im.toss.inventory_sdk.model.ClickTypeDto;
import im.toss.inventory_sdk.model.InventoryAdDto;
import im.toss.inventory_sdk.model.ResourceDto;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.getNetworkStatus;
import o.getViewTypeCount;
import o.handleNativeAdClick;
import o.toPreviewOnlyRange;
import o.w3b;
import o.w5a;
import o.zzu;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getNetworkStatus {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = {51240, 64978, 64963, 64986, 64966, 64983, 64987, 64903, 64984, 64991, 64982, 64971, 64990, 64926, 64989, 64961, 64988, 64976, 64905, 51243, 64925, 64980, 64967, 64960, 64924};
    private static char onExtraCallback = 51244;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    /* JADX WARN: Removed duplicated region for block: B:28:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8 = ~i5;
        int i9 = ~i;
        int i10 = ~i3;
        int i11 = (~(i9 | i10)) | i8;
        int i12 = ~(i9 | i5 | i3);
        int i13 = (~(i3 | i5)) | (~(i8 | i10)) | i9;
        int i14 = i5 + i + i4 + ((-1422066268) * i6) + ((-2108786386) * i2);
        int i15 = i14 * i14;
        int i16 = (i5 * 793895740) + 1353643607 + (i * 793896262) + (i11 * (-261)) + (i12 * (-261)) + (i13 * 261) + (793896001 * i4) + (692483748 * i6) + ((-1016611666) * i2) + (i15 * 166461440);
        if (((-1583913924) * i5) + 967573504 + (322476998 * i) + (i11 * 1194288187) + (1194288187 * i12) + ((-1194288187) * i13) + (1516765184 * i4) + ((-1298137088) * i6) + (1722810368 * i2) + (518782976 * i15) + (i16 * i16 * 1997799424) == 1) {
            return onNavigationEvent(objArr);
        }
        final InventoryAdDto.Normal normal = (InventoryAdDto.Normal) objArr[0];
        final InventoryAdManager inventoryAdManager = (InventoryAdManager) objArr[1];
        final Function1 function1 = (Function1) objArr[2];
        final Context context = (Context) objArr[3];
        zzu zzuVar = (zzu) objArr[4];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int i17 = 2 % 2;
        Intrinsics.checkNotNullParameter(zzuVar, "");
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        if ((iIntValue & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                int i18 = onExtraCallbackWithResult + 79;
                onNavigationEvent = i18 % 128;
                int i19 = i18 % 2;
                i7 = 32;
            } else {
                i7 = 16;
            }
            iIntValue |= i7;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 145) != 144, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-540960526, iIntValue, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeCptSection.<anonymous>.<anonymous> (CreditHomeCptSection.kt:48)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(verifyDrawable.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null), addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0) ? ByteOrderedDataOutputStream.onExtraCallback(148034044) : ByteOrderedDataOutputStream.onExtraCallbackWithResult(4294769916L), new AppLovinAdClickListener(getZoomState.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)))), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 1, (Object) null);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(normal);
            boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(inventoryAdManager);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | zOnExtraCallback2 | zOnNavigationEvent)) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function0 = new Function0() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeCptSectionKt$$ExternalSyntheticLambda2
                        private static int onExtraCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke() {
                            int i20 = 2 % 2;
                            int i21 = onExtraCallback + 111;
                            onWarmupCompleted = i21 % 128;
                            int i22 = i21 % 2;
                            Unit unitIAuthTabCallback = getNetworkStatus.IAuthTabCallback(normal, inventoryAdManager, function1);
                            int i23 = onExtraCallback + 33;
                            onWarmupCompleted = i23 % 128;
                            int i24 = i23 % 2;
                            return unitIAuthTabCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                    obj = function0;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = configureReward.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (getConfiguration) null, (getCachingExecutorService) null, false, false, false, false, (String) null, (Role) null, (Function0) obj, 255, (Object) null);
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
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
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    int i20 = onNavigationEvent + 3;
                    onExtraCallbackWithResult = i20 % 128;
                    int i21 = i20 % 2;
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-1851930357, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeCptSectionKt$$ExternalSyntheticLambda3
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i22 = 2 % 2;
                        int i23 = onExtraCallback + 95;
                        onExtraCallbackWithResult = i23 % 128;
                        int i24 = i23 % 2;
                        Unit unitIAuthTabCallback = getNetworkStatus.IAuthTabCallback(normal, (w5a) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i25 = onExtraCallbackWithResult + 121;
                        onExtraCallback = i25 % 128;
                        int i26 = i25 % 2;
                        return unitIAuthTabCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), (QuirksExternalSyntheticBackport0) null, ForwardingCameraControl.onExtraCallback(1072407743, true, new getBacktraceNote() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeCptSectionKt$$ExternalSyntheticLambda4
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i22 = 2 % 2;
                        int i23 = onWarmupCompleted + 15;
                        onNavigationEvent = i23 % 128;
                        int i24 = i23 % 2;
                        Unit unit = (Unit) getNetworkStatus.IAuthTabCallback(new Object[]{normal, context, (w3b) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())}, 1947054801, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1947054800, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                        int i25 = onNavigationEvent + 93;
                        onWarmupCompleted = i25 % 128;
                        if (i25 % 2 != 0) {
                            return unit;
                        }
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, getViewTypeCount.onNavigationEvent.Companion.IAuthTabCallback(), getViewTypeCount.onTransact.Companion.IAuthTabCallback(), (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 390, 432, 124922);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(InventoryAdDto.Normal normal, InventoryAdManager inventoryAdManager, Function1 function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(normal, inventoryAdManager, function1);
        }
        onNavigationEvent(normal, inventoryAdManager, function1);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(InventoryAdDto.Normal normal, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(normal, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 20 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(InventoryAdDto.Normal normal, InventoryAdManager inventoryAdManager, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(normal, inventoryAdManager, function1, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 49;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(InventoryAdDto.Normal normal, InventoryAdManager inventoryAdManager, Function1 function1, Context context, zzu zzuVar, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = (Unit) IAuthTabCallback(new Object[]{normal, inventoryAdManager, function1, context, zzuVar, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -9317469, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 9317469, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
        int i5 = onNavigationEvent + 117;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        InventoryAdDto.Normal normal = (InventoryAdDto.Normal) objArr[0];
        Context context = (Context) objArr[1];
        w3b w3bVar = (w3b) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(normal, context, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private static final Unit onNavigationEvent(InventoryAdDto.Normal normal, InventoryAdManager inventoryAdManager, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 11;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(normal, inventoryAdManager, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 89;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(InventoryAdDto.Normal normal, InventoryAdManager inventoryAdManager, Function1 function1) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(normal, inventoryAdManager, function1);
            unit = Unit.INSTANCE;
            int i3 = 69 / 0;
        } else {
            onExtraCallbackWithResult(normal, inventoryAdManager, function1);
            unit = Unit.INSTANCE;
        }
        int i4 = onNavigationEvent + 5;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(InventoryAdDto.Normal normal, Context context, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        String strIntern;
        Object obj;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1))) {
            int i3 = onNavigationEvent + 121;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1072407743, i, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeCptSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditHomeCptSection.kt:62)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, 0.0f, w3a.onWarmupCompleted.onExtraCallback(), 0.0f, 11, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                int i4 = onExtraCallbackWithResult + 99;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            setMainImageUri.IAuthTabCallback(((ResourceDto) InventoryAdDto.Normal.IAuthTabCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1496087341, -1496087340, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{normal}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent())).onWarmupCompleted(context), deprecated_eventListenerFactory.Icon, (QuirksExternalSyntheticBackport0) null, handleNativeAdClick.onExtraCallback.asInterface.Companion.onWarmupCompleted(), 0L, 0, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 3120, 0, 8180);
            if (!normal.IAuthTabCallback_Parcel()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1347004599);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1347724481);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult(CaptureNoResponseQuirk.onExtraCallback(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.IAuthTabCallback()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f)), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(13.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(9.0f));
                if (addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0)) {
                    int i6 = onExtraCallbackWithResult + 3;
                    onNavigationEvent = i6 % 128;
                    if (i6 % 2 != 0) {
                        Object[] objArr = new Object[1];
                        a(new char[]{7, 21, 2, 7, 3, 23, 13854, 13854, 24, 23, 2, 21, 2, 18, 21, 23, 18, 21, 24, 21, 2, '\r', 23, 4, 18, 17, '\r', 24, 22, 4, 11, 24, 22, '\t', 14, 21, 2, 18, 19, 11, 11, 3, '\b', '\n', 19, 1, 24, 7, 4, '\r', 11, 14, 6, 0, 18, 5, 22, 0, 11, 24}, (byte) ((ViewConfiguration.getKeyRepeatTimeout() * 49) + 78), 20 >>> (ViewConfiguration.getScrollBarSize() % 35), objArr);
                        obj = objArr[0];
                    } else {
                        Object[] objArr2 = new Object[1];
                        a(new char[]{7, 21, 2, 7, 3, 23, 13854, 13854, 24, 23, 2, 21, 2, 18, 21, 23, 18, 21, 24, 21, 2, '\r', 23, 4, 18, 17, '\r', 24, 22, 4, 11, 24, 22, '\t', 14, 21, 2, 18, 19, 11, 11, 3, '\b', '\n', 19, 1, 24, 7, 4, '\r', 11, 14, 6, 0, 18, 5, 22, 0, 11, 24}, (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 105), (ViewConfiguration.getScrollBarSize() >> 8) + 60, objArr2);
                        obj = objArr2[0];
                    }
                    strIntern = ((String) obj).intern();
                } else {
                    Object[] objArr3 = new Object[1];
                    a(new char[]{7, 21, 2, 7, 3, 23, 13796, 13796, 24, 23, 2, 21, 2, 18, 21, 23, 18, 21, 24, 21, 2, '\r', 23, 4, 18, 17, '\r', 24, 22, 4, 11, 24, 22, '\t', 14, 21, 2, 18, 19, 11, 11, 3, '\b', '\n', 19, 1, 24, 7, 4, '\r', 11, 14, '\b', 4, 1, 11, 23, 21, 4, '\f', 13868}, (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 47), 60 - TextUtils.lastIndexOf("", '0', 0), objArr3);
                    strIntern = ((String) objArr3[0]).intern();
                }
                AppLovinNativeAdImplc.onExtraCallbackWithResult(strIntern, quirksExternalSyntheticBackport0OnExtraCallbackWithResult, 0L, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 508);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(InventoryAdDto.Normal normal, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        String strExtraCallbackWithResult;
        long jOnUnminimized;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 92) == 0) {
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2);
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i5 = onExtraCallbackWithResult + 49;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i6 = onExtraCallbackWithResult + 109;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1851930357, i2, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeCptSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditHomeCptSection.kt:86)");
            }
            String interfaceDescriptor = normal.getInterfaceDescriptor();
            if (interfaceDescriptor != null) {
                int i8 = onExtraCallbackWithResult + 29;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    boolean zIsBlank = StringsKt.isBlank(interfaceDescriptor);
                    int i9 = 70 / 0;
                    if (zIsBlank) {
                        strExtraCallbackWithResult = normal.extraCallbackWithResult();
                    } else {
                        strExtraCallbackWithResult = normal.getInterfaceDescriptor() + " · " + normal.extraCallbackWithResult();
                    }
                } else if (!StringsKt.isBlank(interfaceDescriptor)) {
                }
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1588599406);
                    jOnUnminimized = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1588598446);
                    jOnUnminimized = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onUnminimized();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                w5aVar.IAuthTabCallback(strExtraCallbackWithResult, normal.access000(), jOnUnminimized, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13), (GraphicDeviceInfo) null, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService(), RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15), isRepeatingEnabled.onExtraCallback.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 24) & 234881024) | 14158848, 16);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final void onExtraCallbackWithResult(@NotNull final InventoryAdDto.Normal normal, @NotNull final InventoryAdManager inventoryAdManager, @NotNull final Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        boolean zOnNavigationEvent;
        int i3;
        boolean zOnExtraCallback;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(normal, "");
        Intrinsics.checkNotNullParameter(inventoryAdManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-205600415);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i5 = onNavigationEvent + 83;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(normal);
            } else {
                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(normal);
            }
            i2 = (zOnExtraCallback ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        Object obj = null;
        if ((i & 48) == 0) {
            int i7 = onNavigationEvent;
            int i8 = i7 + 5;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0 ? (i & 64) != 0 : (i & 8) != 0) {
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(inventoryAdManager);
            } else {
                int i9 = i7 + 79;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(inventoryAdManager);
                    throw null;
                }
                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(inventoryAdManager);
            }
            if (zOnNavigationEvent) {
                i3 = 32;
            } else {
                int i10 = onExtraCallbackWithResult + 111;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            int i12 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1);
                obj.hashCode();
                throw null;
            }
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146) {
            int i13 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i15 = onExtraCallbackWithResult + 95;
                onNavigationEvent = i15 % 128;
                if (i15 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-205600415, i2, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeCptSection (CreditHomeCptSection.kt:36)");
                    int i16 = 35 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-205600415, i2, -1, "im.toss.feature.credit.ui.main.home.component.CreditHomeCptSection (CreditHomeCptSection.kt:36)");
                }
            }
            final Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 2, (Object) null), 0.0f, 1, (Object) null);
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
            if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout())) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                int i17 = onExtraCallbackWithResult + 11;
                onNavigationEvent = i17 % 128;
                int i18 = i17 % 2;
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
            zzq.IAuthTabCallback(normal, inventoryAdManager, (setContentInsetsRelative) null, (Camera2CameraMetadataExternalSyntheticLambda1) null, (setTaggedAddrCtrl) null, ForwardingCameraControl.onExtraCallback(-540960526, true, new setTaggedAddrCtrl() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeCptSectionKt$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i19 = 2 % 2;
                    int i20 = onNavigationEvent + 123;
                    onExtraCallback = i20 % 128;
                    int i21 = i20 % 2;
                    Unit unitOnExtraCallback = getNetworkStatus.onExtraCallback(normal, inventoryAdManager, function1, context, (zzu) obj2, (QuirksExternalSyntheticBackport0) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                    int i22 = onNavigationEvent + 89;
                    onExtraCallback = i22 % 128;
                    int i23 = i22 % 2;
                    return unitOnExtraCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, InventoryAdDto.Normal.$stable | 196608 | (i2 & 14) | (InventoryAdManager.onExtraCallbackWithResult << 3) | (i2 & 112), 28);
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i19 = onExtraCallbackWithResult + 25;
                onNavigationEvent = i19 % 128;
                int i20 = i19 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.feature.credit.ui.main.home.component.CreditHomeCptSectionKt$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj2, Object obj3) {
                    Unit unitOnExtraCallback;
                    int i21 = 2 % 2;
                    int i22 = IAuthTabCallback + 49;
                    onExtraCallback = i22 % 128;
                    if (i22 % 2 != 0) {
                        unitOnExtraCallback = getNetworkStatus.onExtraCallback(normal, inventoryAdManager, function1, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i23 = 60 / 0;
                    } else {
                        unitOnExtraCallback = getNetworkStatus.onExtraCallback(normal, inventoryAdManager, function1, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    int i24 = IAuthTabCallback + 15;
                    onExtraCallback = i24 % 128;
                    if (i24 % 2 == 0) {
                        return unitOnExtraCallback;
                    }
                    throw null;
                }
            });
        }
        int i21 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i21 % 128;
        int i22 = i21 % 2;
    }

    private static final void onExtraCallbackWithResult(InventoryAdDto.Normal normal, InventoryAdManager inventoryAdManager, Function1<? super String, Unit> function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        InventoryAdManager.onExtraCallback(inventoryAdManager, normal, (ClickTypeDto) null, 2, (Object) null);
        function1.invoke(normal.onWarmupCompleted());
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        long j;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallback;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ('0' - AndroidCharacter.getMirror('0')), 25 - ImageFormat.getBitsPerPixel(0), MotionEvent.axisFromString("") + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        try {
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            long j2 = 0;
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 27 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.indexOf("", "") + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
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
                int i5 = $10 + 49;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 1;
                } else {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                }
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    int i6 = $10 + 81;
                    $11 = i6 % 128;
                    if (i6 % 2 == 0) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            int i7 = $11 + 61;
                            $10 = i7 % 128;
                            if (i7 % 2 != 0) {
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback % b);
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent % 0] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback << b);
                            } else {
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            }
                            j = j2;
                            obj = obj2;
                        } else {
                            try {
                                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                                if (objOnExtraCallback3 == null) {
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - (ViewConfiguration.getScrollBarSize() >> 8)), 74 - TextUtils.getOffsetBefore("", 0), 8088 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                    int i8 = $11 + 23;
                                    $10 = i8 % 128;
                                    int i9 = i8 % 2;
                                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                    if (objOnExtraCallback4 == null) {
                                        j = 0;
                                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 29, 19488 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 2013852918, false, LiveCheckConstants.UNLOAD_SERVICE_CANCEL_R0_ACK, new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    } else {
                                        j = 0;
                                    }
                                    obj = null;
                                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                    int i10 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i10];
                                } else {
                                    obj = null;
                                    j = 0;
                                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                        int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i11];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                                    } else {
                                        int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
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
                    } else {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                    j2 = j;
                }
            }
            for (int i15 = 0; i15 < i; i15++) {
                cArr4[i15] = (char) (cArr4[i15] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(InventoryAdDto.Normal normal, Context context, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(new Object[]{normal, context, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 1947054801, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1947054800, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }

    private static final Unit onExtraCallbackWithResult(InventoryAdDto.Normal normal, InventoryAdManager inventoryAdManager, Function1 function1, Context context, zzu zzuVar, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) IAuthTabCallback(new Object[]{normal, inventoryAdManager, function1, context, zzuVar, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -9317469, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), 9317469, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
    }
}
