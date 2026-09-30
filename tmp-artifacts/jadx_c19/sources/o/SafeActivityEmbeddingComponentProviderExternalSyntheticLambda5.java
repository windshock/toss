package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import com.tmoney.a;
import im.toss.appsintoss.R;
import im.toss.appsintoss.iap.screen.InAppPurchaseHandledSubscriptionContentKt$;
import im.toss.features.mydata.ui.consent.MydataManageConsentsNavHostKt$;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.Date;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirkSettingsLoader;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda5;
import o.alertWithArgs;
import o.bindChildren;
import o.getViewTypeCount;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import o.y1ExternalSyntheticLambda0;
import o.y1ExternalSyntheticLambda3;
import o.y1a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda5 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    /* JADX WARN: Removed duplicated region for block: B:88:0x0322  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object IAuthTabCallback(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        boolean z;
        int i8 = ~i7;
        int i9 = ~(i8 | i4);
        int i10 = ~(i8 | i2);
        int i11 = i9 | i10;
        int i12 = ~i4;
        int i13 = (~((~i2) | i8 | i4)) | (~(i8 | i12 | i2));
        int i14 = i10 | (~(i12 | i7));
        int i15 = i7 + i4 + i3 + ((-1696018712) * i6) + (2108813197 * i5);
        int i16 = i15 * i15;
        int i17 = ((i7 * 362004572) - 1408384217) + (i4 * 362004174) + (i11 * (-398)) + (i13 * 199) + (i14 * 199) + (362004373 * i3) + ((-1290304248) * i6) + (155295761 * i5) + (i16 * (-60686336));
        int i18 = ((212195308 * i7) - 2121662464) + (1221732374 * i4) + (1009537066 * i11) + (i13 * (-504768533)) + ((-504768533) * i14) + (716963840 * i3) + (39845888 * i6) + (227278848 * i5) + ((-1705377792) * i16) + (i17 * i17 * (-1680474112));
        boolean z2 = true;
        if (i18 == 1) {
            return onExtraCallback(objArr);
        }
        boolean z3 = false;
        if (i18 == 2) {
            Function0 function0 = (Function0) objArr[0];
            Function0 function02 = (Function0) objArr[1];
            RightPreset rightPreset = (RightPreset) objArr[2];
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
            int iIntValue = ((Number) objArr[4]).intValue();
            int i19 = 2 % 2;
            int i20 = IAuthTabCallback + 105;
            onExtraCallback = i20 % 128;
            int i21 = i20 % 2;
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((iIntValue & 6) == 0) {
                int i22 = onExtraCallback + 99;
                IAuthTabCallback = i22 % 128;
                int i23 = i22 % 2;
                iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2;
            }
            if ((iIntValue & 19) != 18) {
                int i24 = IAuthTabCallback + 75;
                onExtraCallback = i24 % 128;
                z = i24 % 2 == 0;
            }
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1))) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(327804357, iIntValue, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHandledSubscriptionContent.<anonymous>.<anonymous> (InAppPurchaseHandledSubscriptionContent.kt:166)");
                }
                rightPreset.IAuthTabCallback(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_detail_refund_btn_refund, cameraCaptureResultEmptyCameraCaptureResult, 0), ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, 0.0f, (Object) null, function0, cameraCaptureResultEmptyCameraCaptureResult, 6, 3), (setCallToAction.IAuthTabCallback) null, setCallToAction.onWarmupCompleted.Dark, setCallToAction.onExtraCallback.Weak, (setCallToAction.onNavigationEvent) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, false, false, (Function0) null, function02, cameraCaptureResultEmptyCameraCaptureResult, 27648, (iIntValue << 3) & 112, 996);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }
        if (i18 == 3) {
            String str = (String) objArr[0];
            RightPreset rightPreset2 = (RightPreset) objArr[1];
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
            int iIntValue2 = ((Number) objArr[3]).intValue();
            int i25 = 2 % 2;
            Intrinsics.checkNotNullParameter(rightPreset2, "");
            if ((iIntValue2 & 6) == 0) {
                int i26 = IAuthTabCallback + 97;
                onExtraCallback = i26 % 128;
                int i27 = i26 % 2;
                if (!cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(rightPreset2)) {
                    int i28 = onExtraCallback + 69;
                    IAuthTabCallback = i28 % 128;
                    int i29 = i28 % 2;
                    i = 2;
                } else {
                    int i30 = onExtraCallback + 9;
                    IAuthTabCallback = i30 % 128;
                    int i31 = i30 % 2;
                }
                iIntValue2 |= i;
            }
            if ((iIntValue2 & 19) != 18) {
                int i32 = IAuthTabCallback + 71;
                onExtraCallback = i32 % 128;
                int i33 = i32 % 2;
            } else {
                z2 = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z2, iIntValue2 & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(833948257, iIntValue2, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHandledSubscriptionContent.<anonymous>.<anonymous> (InAppPurchaseHandledSubscriptionContent.kt:105)");
                }
                rightPreset2.IAuthTabCallback(str, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).isEngagementSignalsApiAvailable(), 0L, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResult2, (iIntValue2 << 12) & 57344, 12);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }
        if (i18 == 4) {
            String str2 = (String) objArr[0];
            RightPreset rightPreset3 = (RightPreset) objArr[1];
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
            int iIntValue3 = ((Number) objArr[3]).intValue();
            int i34 = 2 % 2;
            int i35 = onExtraCallback + 33;
            IAuthTabCallback = i35 % 128;
            int i36 = i35 % 2;
            Unit unit = (Unit) IAuthTabCallback(alertWithArgs.onExtraCallbackWithResult(), new Object[]{str2, rightPreset3, cameraCaptureResultEmptyCameraCaptureResult3, Integer.valueOf(iIntValue3)}, alertWithArgs.onExtraCallbackWithResult(), 1300613921, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -1300613918);
            int i37 = IAuthTabCallback + 39;
            onExtraCallback = i37 % 128;
            int i38 = i37 % 2;
            return unit;
        }
        if (i18 != 5) {
            String str3 = (String) objArr[0];
            RightPreset rightPreset4 = (RightPreset) objArr[1];
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
            int iIntValue4 = ((Number) objArr[3]).intValue();
            int i39 = 2 % 2;
            Intrinsics.checkNotNullParameter(rightPreset4, "");
            if ((iIntValue4 & 6) == 0) {
                iIntValue4 |= cameraCaptureResultEmptyCameraCaptureResult4.onNavigationEvent(rightPreset4) ? 4 : 2;
            }
            if ((iIntValue4 & 19) != 18) {
                int i40 = onExtraCallback + 15;
                IAuthTabCallback = i40 % 128;
                int i41 = i40 % 2;
                z3 = true;
            } else {
                int i42 = onExtraCallback + 45;
                IAuthTabCallback = i42 % 128;
                int i43 = i42 % 2;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(z3, iIntValue4 & 1)) {
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1948091192, iIntValue4, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHandledSubscriptionContent.<anonymous>.<anonymous> (InAppPurchaseHandledSubscriptionContent.kt:90)");
                    int i44 = IAuthTabCallback + 31;
                    onExtraCallback = i44 % 128;
                    int i45 = i44 % 2;
                }
                rightPreset4.IAuthTabCallback(str3, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult4, 6).isEngagementSignalsApiAvailable(), 0L, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResult4, (iIntValue4 << 12) & 57344, 12);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i46 = IAuthTabCallback + 123;
                    onExtraCallback = i46 % 128;
                    int i47 = i46 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult4.ICustomTabsCallbackStubProxy();
            }
            Unit unit2 = Unit.INSTANCE;
            int i48 = onExtraCallback + 91;
            IAuthTabCallback = i48 % 128;
            int i49 = i48 % 2;
            return unit2;
        }
        Function0 function03 = (Function0) objArr[0];
        RightPreset rightPreset5 = (RightPreset) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult5 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue5 = ((Number) objArr[3]).intValue();
        int i50 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset5, "");
        if ((iIntValue5 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult5.onNavigationEvent(rightPreset5)) {
                int i51 = IAuthTabCallback + 123;
                onExtraCallback = i51 % 128;
                int i52 = i51 % 2;
            } else {
                i = 2;
            }
            iIntValue5 |= i;
        }
        if ((iIntValue5 & 19) != 18) {
            int i53 = IAuthTabCallback + 21;
            int i54 = i53 % 128;
            onExtraCallback = i54;
            int i55 = i53 % 2;
            int i56 = i54 + 119;
            IAuthTabCallback = i56 % 128;
            int i57 = i56 % 2;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult5.onWarmupCompleted(z2, iIntValue5 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2011016026, iIntValue5, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHandledSubscriptionContent.<anonymous>.<anonymous> (InAppPurchaseHandledSubscriptionContent.kt:140)");
            }
            rightPreset5.IAuthTabCallback(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_confirm, cameraCaptureResultEmptyCameraCaptureResult5, 0), (QuirksExternalSyntheticBackport0) null, (setCallToAction.IAuthTabCallback) null, setCallToAction.onWarmupCompleted.Dark, setCallToAction.onExtraCallback.Weak, (setCallToAction.onNavigationEvent) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, false, false, (Function0) null, function03, cameraCaptureResultEmptyCameraCaptureResult5, 27648, (iIntValue5 << 3) & 112, 998);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i58 = onExtraCallback + 61;
                IAuthTabCallback = i58 % 128;
                int i59 = i58 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult5.ICustomTabsCallbackStubProxy();
        }
        Unit unit3 = Unit.INSTANCE;
        int i60 = IAuthTabCallback + 53;
        onExtraCallback = i60 % 128;
        int i61 = i60 % 2;
        return unit3;
    }

    public static /* synthetic */ Unit IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 117;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        throw null;
    }

    private static final Unit IAuthTabCallback(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 109;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 31;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, String str3, String str4, String str5, boolean z, Function0 function0, Function0 function02, Function0 function03, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 109;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(quirksExternalSyntheticBackport0, str, str2, str3, str4, str5, z, function0, function02, function03, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onExtraCallback + 23;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 89;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsBinder = asBinder();
        int i5 = IAuthTabCallback + 85;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 51;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 27;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0, Function0 function02, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 125;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {function0, function02, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        Unit unit = (Unit) IAuthTabCallback(alertWithArgs.onExtraCallbackWithResult(), objArr, alertWithArgs.onExtraCallbackWithResult(), 1377004655, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -1377004653);
        int i6 = IAuthTabCallback + 69;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        Unit unit = (Unit) IAuthTabCallback(alertWithArgs.onExtraCallbackWithResult(), objArr, alertWithArgs.onExtraCallbackWithResult(), -1022000327, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1022000328);
        int i6 = onExtraCallback + 7;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 97;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallback + 79;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, String str3, String str4, String str5, boolean z, Function0 function0, Function0 function02, Function0 function03, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 11;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            IAuthTabCallback(quirksExternalSyntheticBackport0, str, str2, str3, str4, str5, z, function0, function02, function03, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        } else {
            IAuthTabCallback(quirksExternalSyntheticBackport0, str, str2, str3, str4, str5, z, function0, function02, function03, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(boolean z, String str, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(z, str, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallback + 121;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 81;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallback + 39;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 15;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unit = (Unit) IAuthTabCallback(alertWithArgs.onExtraCallbackWithResult(), new Object[]{function0, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, alertWithArgs.onExtraCallbackWithResult(), 965495356, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -965495351);
        int i6 = IAuthTabCallback + 33;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 79;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(z, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallback + 51;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 29;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return onNavigationEvent();
        }
        onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 79;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallback + 101;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 83;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Integer numValueOf = Integer.valueOf(i2);
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) IAuthTabCallback(alertWithArgs.onExtraCallbackWithResult(), new Object[]{str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, alertWithArgs.onExtraCallbackWithResult(), -542269056, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 542269056);
        int i6 = IAuthTabCallback + 67;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 97;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = Unit.INSTANCE;
        if (i4 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 59;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallback + 125;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asBinder() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 23;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = Unit.INSTANCE;
        if (i4 == 0) {
            int i5 = 69 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(String str, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 107;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
            if ((i2 & 3) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3)) {
                    int i7 = IAuthTabCallback + 83;
                    onExtraCallback = i7 % 128;
                    i3 = i7 % 2 != 0 ? 5 : 4;
                } else {
                    i3 = 2;
                }
                i4 = i2 | i3;
            } else {
                i4 = i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
            if ((i2 & 6) == 0) {
            }
        }
        boolean z = false;
        if ((i4 & 19) != 18) {
            int i8 = onExtraCallback + 1;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                z = true;
            }
        } else {
            int i9 = onExtraCallback + 111;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i4 & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i11 = IAuthTabCallback + 81;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(663058664, i4, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHandledSubscriptionContent.<anonymous>.<anonymous> (InAppPurchaseHandledSubscriptionContent.kt:54)");
            }
            y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, new Object[]{y1externalsyntheticlambda3, str, null, 0L, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), isRepeatingEnabled.onExtraCallback.asBinder(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i4 << 15) & 458752) | 24576), 6}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i13 = IAuthTabCallback + 81;
                onExtraCallback = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 5 / 5;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(boolean z, String str, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z2;
        long jIsEngagementSignalsApiAvailable;
        bindChildren bindchildrenOnWarmupCompleted;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 71;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(y1aVar, "");
            z2 = (i2 & 118) != 76;
        } else {
            Intrinsics.checkNotNullParameter(y1aVar, "");
            if ((i2 & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i2 & 1)) {
            int i5 = IAuthTabCallback + 3;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1788139303, i2, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHandledSubscriptionContent.<anonymous>.<anonymous> (InAppPurchaseHandledSubscriptionContent.kt:62)");
            }
            if (z) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-21283773);
                jIsEngagementSignalsApiAvailable = getMaxAdCount.onNavigationEvent(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), 0.4f);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-21191021);
                jIsEngagementSignalsApiAvailable = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable();
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            long j = jIsEngagementSignalsApiAvailable;
            GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult();
            bindChildren.onNavigationEvent onnavigationevent = bindChildren.Companion;
            if (z) {
                int i6 = onExtraCallback + 31;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                bindchildrenOnWarmupCompleted = onnavigationevent.onExtraCallback();
            } else {
                bindchildrenOnWarmupCompleted = onnavigationevent.onWarmupCompleted();
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(j), 0L, 0L, null, null, null, Float.valueOf(0.0f), bindchildrenOnWarmupCompleted, null, 0L, 0, false, graphicDeviceInfoOnExtraCallbackWithResult, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 196608, 97270}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = onExtraCallback + 117;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(boolean z, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        String strOnExtraCallback;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i2 & 6) == 0) {
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset))) {
                int i4 = IAuthTabCallback + 61;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2 != 0 ? 2 : 4;
                i2 |= i5;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i6 = onExtraCallback + 81;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1122198656, i2, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHandledSubscriptionContent.<anonymous>.<anonymous> (InAppPurchaseHandledSubscriptionContent.kt:120)");
            }
            if (z) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(605344671);
                strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_detail_purchase_state_refunded, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(605480606);
                strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_detail_purchase_state_completed, cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i8 = IAuthTabCallback + 59;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
            }
            rightPreset.IAuthTabCallback(strOnExtraCallback, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), 0L, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResult, (i2 << 12) & 57344, 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i2;
        boolean z = false;
        String str = (String) objArr[0];
        RightPreset rightPreset = (RightPreset) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((iIntValue & 102) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                    int i5 = onExtraCallback + 63;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                iIntValue |= i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((iIntValue & 6) == 0) {
            }
        }
        if ((iIntValue & 19) != 18) {
            z = true;
        } else {
            int i7 = IAuthTabCallback + 125;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            int i9 = onExtraCallback + 125;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = IAuthTabCallback + 99;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(285136988, iIntValue, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHandledSubscriptionContent.<anonymous>.<anonymous> (InAppPurchaseHandledSubscriptionContent.kt:184)");
            }
            rightPreset.IAuthTabCallback(str != null ? str : "", y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), 0L, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResult, (iIntValue << 12) & 57344, 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04fd A[PHI: r35
      0x04fd: PHI (r35v4 java.lang.Object) = (r35v0 java.lang.Object), (r35v2 java.lang.Object) binds: [B:195:0x04c8, B:210:0x04f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull final String str4, @Nullable final String str5, final boolean z, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable Function0<Unit> function03, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        int i4;
        Function0<Unit> function04;
        int i5;
        int i6;
        int i7;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final Function0<Unit> function05;
        Function0<Unit> function06;
        final Function0<Unit> function07;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final Function0<Unit> function08;
        Function0<Unit> function09;
        Function0<Unit> function010;
        Object obj;
        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1;
        Object obj2;
        final Function0<Unit> function011;
        final Function0<Unit> function012;
        int i8;
        int i9 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(943799649);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            int i11 = IAuthTabCallback + 91;
            onExtraCallback = i11 % 128;
            if (i11 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                throw null;
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            int i12 = IAuthTabCallback + 47;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            int i14 = IAuthTabCallback + 29;
            onExtraCallback = i14 % 128;
            int i15 = i14 % 2;
            i4 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str5) ^ true) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            int i16 = onExtraCallback + 89;
            IAuthTabCallback = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 57 / 0;
                i8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 1048576 : 524288;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
            }
            i4 |= i8;
        }
        int i18 = i3 & 128;
        if (i18 != 0) {
            int i19 = onExtraCallback + 19;
            IAuthTabCallback = i19 % 128;
            int i20 = i19 % 2;
            i4 |= 12582912;
        } else {
            if ((12582912 & i2) == 0) {
                int i21 = IAuthTabCallback + 1;
                onExtraCallback = i21 % 128;
                int i22 = i21 % 2;
                function04 = function0;
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function04) ? 8388608 : 4194304;
            }
            i5 = i3 & 256;
            if (i5 == 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02)) {
                    int i23 = IAuthTabCallback + 45;
                    onExtraCallback = i23 % 128;
                    if (i23 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    i6 = 67108864;
                } else {
                    i6 = 33554432;
                }
                i4 |= i6;
            }
            i7 = i3 & 512;
            if (i7 != 0) {
                if ((805306368 & i2) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function03) ? 536870912 : 268435456;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 306783379) != 306783378, i4 & 1)) {
                    if (i10 != 0) {
                        int i24 = onExtraCallback + 113;
                        IAuthTabCallback = i24 % 128;
                        int i25 = i24 % 2;
                        quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                    } else {
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                    }
                    if (i18 != 0) {
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHandledSubscriptionContentKt$$ExternalSyntheticLambda2
                                private static int IAuthTabCallback = 1;
                                private static int onExtraCallbackWithResult;

                                public final Object invoke() {
                                    int i26 = 2 % 2;
                                    int i27 = IAuthTabCallback + 39;
                                    onExtraCallbackWithResult = i27 % 128;
                                    int i28 = i27 % 2;
                                    Unit unitOnWarmupCompleted = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda5.onWarmupCompleted();
                                    int i29 = IAuthTabCallback + 95;
                                    onExtraCallbackWithResult = i29 % 128;
                                    if (i29 % 2 == 0) {
                                        return unitOnWarmupCompleted;
                                    }
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        function08 = (Function0) objOnMinimized;
                    } else {
                        function08 = function04;
                    }
                    if (i5 != 0) {
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized2 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHandledSubscriptionContentKt$$ExternalSyntheticLambda5
                                private static int onNavigationEvent = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke() {
                                    int i26 = 2 % 2;
                                    int i27 = onWarmupCompleted + 121;
                                    onNavigationEvent = i27 % 128;
                                    int i28 = i27 % 2;
                                    Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda5.IAuthTabCallback();
                                    int i29 = onWarmupCompleted + 47;
                                    onNavigationEvent = i29 % 128;
                                    if (i29 % 2 == 0) {
                                        int i30 = 36 / 0;
                                    }
                                    return unitIAuthTabCallback;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        }
                        function09 = (Function0) objOnMinimized2;
                    } else {
                        function09 = function02;
                    }
                    if (i7 != 0) {
                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized3 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHandledSubscriptionContentKt$$ExternalSyntheticLambda6
                                private static int IAuthTabCallback = 1;
                                private static int onExtraCallbackWithResult;

                                public final Object invoke() {
                                    int i26 = 2 % 2;
                                    int i27 = onExtraCallbackWithResult + 109;
                                    IAuthTabCallback = i27 % 128;
                                    int i28 = i27 % 2;
                                    Unit unitOnExtraCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda5.onExtraCallback();
                                    int i29 = onExtraCallbackWithResult + 1;
                                    IAuthTabCallback = i29 % 128;
                                    int i30 = i29 % 2;
                                    return unitOnExtraCallback;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                        }
                        function010 = (Function0) objOnMinimized3;
                    } else {
                        function010 = function03;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(943799649, i4, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHandledSubscriptionContent (InAppPurchaseHandledSubscriptionContent.kt:35)");
                    }
                    final boolean z2 = str5 != null;
                    String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_detail_yyyy_mm_dd_t_hh_mm_ss, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    String strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_purchase_history_detail_yyyy_mm_dd_hh_mm, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strOnExtraCallback);
                    Function0<Unit> function013 = function010;
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnNavigationEvent || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized4 = new IdGeneratorExternalSyntheticLambda1(strOnExtraCallback);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                    }
                    IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda12 = (IdGeneratorExternalSyntheticLambda1) objOnMinimized4;
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strOnExtraCallback2);
                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnNavigationEvent2) {
                        Object obj3 = objOnMinimized5;
                        if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda13 = new IdGeneratorExternalSyntheticLambda1(strOnExtraCallback2);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(idGeneratorExternalSyntheticLambda13);
                            obj3 = idGeneratorExternalSyntheticLambda13;
                        }
                        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda14 = (IdGeneratorExternalSyntheticLambda1) obj3;
                        boolean z3 = (57344 & i4) == 16384;
                        Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (z3 || objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            try {
                                Result.Companion companion = Result.Companion;
                                Date date = idGeneratorExternalSyntheticLambda12.parse(str4);
                                obj = Result.constructor-impl(date == null ? null : idGeneratorExternalSyntheticLambda14.format(date));
                            } catch (Throwable th) {
                                Result.Companion companion2 = Result.Companion;
                                obj = Result.constructor-impl(ResultKt.createFailure(th));
                            }
                            if (Result.onExtraCallback(obj)) {
                                obj = null;
                            }
                            String str6 = (String) obj;
                            objOnMinimized6 = str6 == null ? str4 : str6;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                        }
                        final String str7 = (String) objOnMinimized6;
                        Function0<Unit> function014 = function09;
                        component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport03);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            idGeneratorExternalSyntheticLambda1 = idGeneratorExternalSyntheticLambda12;
                            int i26 = IAuthTabCallback + 53;
                            onExtraCallback = i26 % 128;
                            int i27 = i26 % 2;
                            getAwbState.onExtraCallback();
                        } else {
                            idGeneratorExternalSyntheticLambda1 = idGeneratorExternalSyntheticLambda12;
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                            int i28 = onExtraCallback + 57;
                            IAuthTabCallback = i28 % 128;
                            int i29 = i28 % 2;
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
                        final boolean z4 = z2;
                        y1ExternalSyntheticLambda6.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(1788139303, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHandledSubscriptionContentKt$$ExternalSyntheticLambda7
                            private static int IAuthTabCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                int i30 = 2 % 2;
                                int i31 = IAuthTabCallback + 19;
                                onWarmupCompleted = i31 % 128;
                                int i32 = i31 % 2;
                                Unit unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda5.onExtraCallbackWithResult(z2, str2, (y1a) obj4, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                int i33 = IAuthTabCallback + 15;
                                onWarmupCompleted = i33 % 128;
                                int i34 = i33 % 2;
                                return unitOnExtraCallbackWithResult;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, y1ExternalSyntheticLambda0.onNavigationEvent.Companion.onNavigationEvent(), ForwardingCameraControl.onExtraCallback(663058664, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHandledSubscriptionContentKt$$ExternalSyntheticLambda8
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallback = 1;

                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                int i30 = 2 % 2;
                                int i31 = onExtraCallback + 11;
                                IAuthTabCallback = i31 % 128;
                                if (i31 % 2 != 0) {
                                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda5.onExtraCallbackWithResult(str, (y1ExternalSyntheticLambda3) obj4, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                    throw null;
                                }
                                Unit unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda5.onExtraCallbackWithResult(str, (y1ExternalSyntheticLambda3) obj4, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                int i32 = IAuthTabCallback + 3;
                                onExtraCallback = i32 % 128;
                                if (i32 % 2 == 0) {
                                    int i33 = 81 / 0;
                                }
                                return unitOnExtraCallbackWithResult;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), y1ExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onExtraCallbackWithResult(), (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f), 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 28038, 48, 14306);
                        if (z4) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1187259542);
                            getMidpointBetweenPoints.onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 1636332776, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{null, 0L, 0L, null, null, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46.IAuthTabCallback.onNavigationEvent(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196608, 31}, -1636332773);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1187062537);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46 safeActivityEmbeddingComponentProviderExternalSyntheticLambda46 = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46.IAuthTabCallback;
                        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteAsBinder = safeActivityEmbeddingComponentProviderExternalSyntheticLambda46.asBinder();
                        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(1948091192, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHandledSubscriptionContentKt$$ExternalSyntheticLambda9
                            private static int onExtraCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                int i30 = 2 % 2;
                                int i31 = onNavigationEvent + 77;
                                onExtraCallback = i31 % 128;
                                Object obj7 = null;
                                if (i31 % 2 != 0) {
                                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda5.onWarmupCompleted(str7, (RightPreset) obj4, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                    obj7.hashCode();
                                    throw null;
                                }
                                Unit unitOnWarmupCompleted = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda5.onWarmupCompleted(str7, (RightPreset) obj4, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                int i32 = onNavigationEvent + 81;
                                onExtraCallback = i32 % 128;
                                if (i32 % 2 == 0) {
                                    return unitOnWarmupCompleted;
                                }
                                obj7.hashCode();
                                throw null;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                        getViewTypeCount.onTransact.IAuthTabCallback iAuthTabCallback = getViewTypeCount.onTransact.Companion;
                        w4.onExtraCallbackWithResult(getbacktracenoteAsBinder, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, encoderProfilesProxyVideoProfileProxyOnExtraCallback, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, iAuthTabCallback.onNavigationEvent(), (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196614, 384, 126942);
                        w4.onExtraCallbackWithResult((getBacktraceNote) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46.onNavigationEvent(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{safeActivityEmbeddingComponentProviderExternalSyntheticLambda46}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), 236736954, -236736952), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(833948257, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHandledSubscriptionContentKt$$ExternalSyntheticLambda10
                            private static int onExtraCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                int i30 = 2 % 2;
                                int i31 = onWarmupCompleted + 77;
                                onExtraCallback = i31 % 128;
                                int i32 = i31 % 2;
                                Object[] objArr = {str3, (RightPreset) obj4, (CameraCaptureResultEmptyCameraCaptureResult) obj5, Integer.valueOf(((Integer) obj6).intValue())};
                                Unit unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda5.IAuthTabCallback(alertWithArgs.onExtraCallbackWithResult(), objArr, alertWithArgs.onExtraCallbackWithResult(), -1512344469, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1512344473);
                                int i33 = onExtraCallback + 7;
                                onWarmupCompleted = i33 % 128;
                                if (i33 % 2 == 0) {
                                    return unit;
                                }
                                Object obj7 = null;
                                obj7.hashCode();
                                throw null;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, iAuthTabCallback.onNavigationEvent(), (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196614, 384, 126942);
                        w4.onExtraCallbackWithResult(safeActivityEmbeddingComponentProviderExternalSyntheticLambda46.IAuthTabCallbackDefault(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(-1122198656, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHandledSubscriptionContentKt$$ExternalSyntheticLambda11
                            private static int onExtraCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                int i30 = 2 % 2;
                                int i31 = onNavigationEvent + 61;
                                onExtraCallback = i31 % 128;
                                int i32 = i31 % 2;
                                Unit unitOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda5.onNavigationEvent(z4, (RightPreset) obj4, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                if (i32 != 0) {
                                    int i33 = 24 / 0;
                                }
                                return unitOnNavigationEvent;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, iAuthTabCallback.onNavigationEvent(), (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196614, 384, 126942);
                        if (z4 || !z) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1184719433);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1185328707);
                            w4.onExtraCallbackWithResult((getBacktraceNote) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46.onNavigationEvent(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{safeActivityEmbeddingComponentProviderExternalSyntheticLambda46}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -1067672929, 1067672930), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(-2011016026, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHandledSubscriptionContentKt$$ExternalSyntheticLambda12
                                private static int onNavigationEvent = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    Unit unitOnNavigationEvent;
                                    int i30 = 2 % 2;
                                    int i31 = onNavigationEvent + 33;
                                    onWarmupCompleted = i31 % 128;
                                    if (i31 % 2 == 0) {
                                        unitOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda5.onNavigationEvent(function08, (RightPreset) obj4, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                        int i32 = 4 / 0;
                                    } else {
                                        unitOnNavigationEvent = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda5.onNavigationEvent(function08, (RightPreset) obj4, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                    }
                                    int i33 = onNavigationEvent + 113;
                                    onWarmupCompleted = i33 % 128;
                                    int i34 = i33 % 2;
                                    return unitOnNavigationEvent;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, iAuthTabCallback.onNavigationEvent(), (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196614, 384, 126942);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        boolean z5 = !((458752 & i4) != 131072);
                        Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (z5 || objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            if (str5 == null) {
                                objOnMinimized7 = obj;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                            } else {
                                try {
                                    Result.Companion companion3 = Result.Companion;
                                    Date date2 = idGeneratorExternalSyntheticLambda1.parse(str5);
                                    obj2 = Result.constructor-impl(date2 == null ? null : idGeneratorExternalSyntheticLambda14.format(date2));
                                } catch (Throwable th2) {
                                    Result.Companion companion4 = Result.Companion;
                                    obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
                                }
                                obj = (String) (Result.onExtraCallback(obj2) ? null : obj2);
                                if (obj == null) {
                                    objOnMinimized7 = str5;
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                            }
                        }
                        final String str8 = (String) objOnMinimized7;
                        if (z4) {
                            function011 = function013;
                            function012 = function014;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1183628326);
                            w4.onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46.IAuthTabCallback.IAuthTabCallbackStub(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(285136988, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHandledSubscriptionContentKt$$ExternalSyntheticLambda3
                                private static int IAuthTabCallback = 1;
                                private static int onNavigationEvent;

                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    Unit unitOnExtraCallbackWithResult;
                                    int i30 = 2 % 2;
                                    int i31 = onNavigationEvent + 107;
                                    IAuthTabCallback = i31 % 128;
                                    if (i31 % 2 == 0) {
                                        unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda5.onExtraCallbackWithResult(str8, (RightPreset) obj4, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                        int i32 = 61 / 0;
                                    } else {
                                        unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda5.onExtraCallbackWithResult(str8, (RightPreset) obj4, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                    }
                                    int i33 = IAuthTabCallback + 31;
                                    onNavigationEvent = i33 % 128;
                                    int i34 = i33 % 2;
                                    return unitOnExtraCallbackWithResult;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, getViewTypeCount.onTransact.Companion.onNavigationEvent(), (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196614, 384, 126942);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1184382370);
                            function011 = function013;
                            function012 = function014;
                            w4.onExtraCallbackWithResult((getBacktraceNote) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46.onNavigationEvent(MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), new Object[]{SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46.IAuthTabCallback}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -608548782, 608548785), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(327804357, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHandledSubscriptionContentKt$$ExternalSyntheticLambda13
                                private static int IAuthTabCallback = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    int i30 = 2 % 2;
                                    int i31 = onWarmupCompleted + 119;
                                    IAuthTabCallback = i31 % 128;
                                    if (i31 % 2 != 0) {
                                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda5.onExtraCallback(function011, function012, (RightPreset) obj4, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                        throw null;
                                    }
                                    Unit unitOnExtraCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda5.onExtraCallback(function011, function012, (RightPreset) obj4, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                    int i32 = onWarmupCompleted + 39;
                                    IAuthTabCallback = i32 % 128;
                                    int i33 = i32 % 2;
                                    return unitOnExtraCallback;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, getViewTypeCount.onTransact.Companion.IAuthTabCallback(), (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196614, 384, 126942);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                        function07 = function08;
                        function05 = function012;
                        function06 = function011;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                    function05 = function02;
                    function06 = function03;
                    function07 = function04;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport02;
                    final Function0<Unit> function015 = function06;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHandledSubscriptionContentKt$$ExternalSyntheticLambda4
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj4, Object obj5) {
                            int i30 = 2 % 2;
                            int i31 = onNavigationEvent + 107;
                            onExtraCallbackWithResult = i31 % 128;
                            int i32 = i31 % 2;
                            Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda5.IAuthTabCallback(quirksExternalSyntheticBackport05, str, str2, str3, str4, str5, z, function07, function05, function015, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                            int i33 = onNavigationEvent + 99;
                            onExtraCallbackWithResult = i33 % 128;
                            if (i33 % 2 == 0) {
                                int i34 = 81 / 0;
                            }
                            return unitIAuthTabCallback;
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 805306368;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 306783379) != 306783378, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        function04 = function0;
        i5 = i3 & 256;
        if (i5 == 0) {
        }
        i7 = i3 & 512;
        if (i7 != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i4 & 306783379) != 306783378, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static final void onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1642576767);
        boolean z = false;
        if (i2 != 0) {
            int i4 = onExtraCallback + 87;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            int i5 = IAuthTabCallback + 35;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1642576767, i2, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHandledSubscriptionContentPreview (InAppPurchaseHandledSubscriptionContent.kt:197)");
                int i7 = IAuthTabCallback + 103;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46.IAuthTabCallback.asInterface(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i9 = IAuthTabCallback + 9;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new InAppPurchaseHandledSubscriptionContentKt$.ExternalSyntheticLambda0(i2));
        }
    }

    private static final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 37;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-327489241);
        if (i2 != 0) {
            int i6 = IAuthTabCallback + 29;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1))) {
            int i8 = IAuthTabCallback + 97;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-327489241, i2, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHandledSubscriptionCancelledPreview (InAppPurchaseHandledSubscriptionContent.kt:212)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda46.IAuthTabCallback.onExtraCallback(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new InAppPurchaseHandledSubscriptionContentKt$.ExternalSyntheticLambda1(i2));
            int i9 = IAuthTabCallback + 95;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) IAuthTabCallback(alertWithArgs.onExtraCallbackWithResult(), objArr, alertWithArgs.onExtraCallbackWithResult(), -1512344469, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1512344473);
    }

    private static final Unit onExtraCallback(String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) IAuthTabCallback(alertWithArgs.onExtraCallbackWithResult(), objArr, alertWithArgs.onExtraCallbackWithResult(), -542269056, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 542269056);
    }

    private static final Unit IAuthTabCallback(String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) IAuthTabCallback(alertWithArgs.onExtraCallbackWithResult(), objArr, alertWithArgs.onExtraCallbackWithResult(), 1300613921, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -1300613918);
    }

    private static final Unit IAuthTabCallback(Function0 function0, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {function0, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) IAuthTabCallback(alertWithArgs.onExtraCallbackWithResult(), objArr, alertWithArgs.onExtraCallbackWithResult(), 965495356, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -965495351);
    }

    private static final Unit IAuthTabCallback(Function0 function0, Function0 function02, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {function0, function02, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) IAuthTabCallback(alertWithArgs.onExtraCallbackWithResult(), objArr, alertWithArgs.onExtraCallbackWithResult(), 1377004655, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), -1377004653);
    }

    private static final Unit IAuthTabCallbackStub(String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) IAuthTabCallback(alertWithArgs.onExtraCallbackWithResult(), objArr, alertWithArgs.onExtraCallbackWithResult(), -1022000327, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), 1022000328);
    }
}
