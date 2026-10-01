package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailContentKt$;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.payment.ui.autopay.R;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda54;
import o.bindChildren;
import o.getViewTypeCount;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import o.w5a;
import o.y1ExternalSyntheticLambda0;
import o.y1ExternalSyntheticLambda3;
import o.y1ExternalSyntheticLambda4;
import o.y1a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda54 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Unit unit;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        Function0 function02 = (Function0) objArr[3];
        y1ExternalSyntheticLambda4 y1externalsyntheticlambda4 = (y1ExternalSyntheticLambda4) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 51;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Integer numValueOf = Integer.valueOf(iIntValue);
        if (i4 != 0) {
            int iOnWarmupCompleted = R.onWarmupCompleted();
            unit = (Unit) onExtraCallbackWithResult(new Object[]{str, str2, function0, function02, y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, -1103157802, 1103157806, R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted(), iOnWarmupCompleted);
            int i5 = 84 / 0;
        } else {
            int iOnWarmupCompleted2 = R.onWarmupCompleted();
            unit = (Unit) onExtraCallbackWithResult(new Object[]{str, str2, function0, function02, y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, -1103157802, 1103157806, R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted(), iOnWarmupCompleted2);
        }
        int i6 = onNavigationEvent + 105;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 1;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAsBinder = asBinder();
        int i5 = onWarmupCompleted + 89;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitAsBinder;
    }

    private static final Unit IAuthTabCallback(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 49;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 37;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onWarmupCompleted + 59;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, String str3, String str4, String str5, String str6, boolean z, Function0 function0, Function0 function02, Function0 function03, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        int i6 = 2 % 2;
        int i7 = onNavigationEvent + 77;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        onExtraCallback(quirksExternalSyntheticBackport0, str, str2, str3, str4, str5, str6, z, function0, function02, function03, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i3), i4);
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 111;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 35;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 63;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted();
        int i5 = onNavigationEvent + 99;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 5;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 117;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 81;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onWarmupCompleted(function0);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(function0);
        int i4 = onWarmupCompleted + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        y1a y1aVar = (y1a) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 111;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i4 == 0) {
            int i5 = 65 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i2 | i7;
        int i9 = ~i3;
        int i10 = ~i7;
        int i11 = ~(i9 | i10);
        int i12 = (~(i7 | i9)) | (~(i10 | i2));
        int i13 = i2 + i3 + i5 + (1389894630 * i6) + ((-1243605516) * i4);
        int i14 = i13 * i13;
        int i15 = (((-88671125) * i2) - 261777699) + (i3 * (-88671149)) + (i8 * (-12)) + (i11 * 12) + (i12 * 12) + ((-88671137) * i5) + ((-349388198) * i6) + ((-147040884) * i4) + (i14 * 182059008);
        int i16 = ((-345998475) * i2) + 1335230464 + (862422157 * i3) + ((-1543273332) * i8) + (i11 * 1543273332) + (1543273332 * i12) + ((-1889271808) * i5) + (1607991296 * i6) + ((-548405248) * i4) + ((-1553596416) * i14) + (i15 * i15 * (-132513792));
        if (i16 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i16 != 2) {
            return i16 != 3 ? i16 != 4 ? i16 != 5 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        String str3 = (String) objArr[3];
        String str4 = (String) objArr[4];
        String str5 = (String) objArr[5];
        String str6 = (String) objArr[6];
        boolean zBooleanValue = ((Boolean) objArr[7]).booleanValue();
        Function0 function0 = (Function0) objArr[8];
        Function0 function02 = (Function0) objArr[9];
        Function0 function03 = (Function0) objArr[10];
        int iIntValue = ((Number) objArr[11]).intValue();
        int iIntValue2 = ((Number) objArr[12]).intValue();
        int iIntValue3 = ((Number) objArr[13]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[14];
        int iIntValue4 = ((Number) objArr[15]).intValue();
        int i17 = 2 % 2;
        int i18 = onNavigationEvent + 37;
        onWarmupCompleted = i18 % 128;
        int i19 = i18 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, str, str2, str3, str4, str5, str6, zBooleanValue, function0, function02, function03, iIntValue, iIntValue2, iIntValue3, cameraCaptureResultEmptyCameraCaptureResult, iIntValue4);
        int i20 = onNavigationEvent + 109;
        onWarmupCompleted = i20 % 128;
        int i21 = i20 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 53;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent();
        int i5 = onWarmupCompleted + 93;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 5;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return IAuthTabCallback(i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        IAuthTabCallback(i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 75;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 59;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 81;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 5;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {function0};
        int iOnWarmupCompleted = R.onWarmupCompleted();
        if (i4 != 0) {
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(objArr, 1040951560, -1040951555, R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted(), iOnWarmupCompleted);
        int i5 = onNavigationEvent + 35;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 79;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 70 / 0;
        }
        int i8 = onWarmupCompleted + 99;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 89;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Unit unitAsBinder = asBinder(i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 != 0) {
            int i7 = 90 / 0;
        }
        int i8 = onWarmupCompleted + 53;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return unitAsBinder;
    }

    private static final Unit onWarmupCompleted() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 7;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 65;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 37;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = Unit.INSTANCE;
        if (i4 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asBinder() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 115;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unit = Unit.INSTANCE;
        if (i4 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(String str, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3)) {
                int i6 = onNavigationEvent + 85;
                int i7 = i6 % 128;
                onWarmupCompleted = i7;
                i4 = i6 % 2 != 0 ? 5 : 4;
                int i8 = i7 + 15;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            } else {
                i4 = 2;
            }
            i3 = i2 | i4;
            int i10 = onNavigationEvent + 63;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
        } else {
            i3 = i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1861160616, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePurchaseHistoryDetailContent.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailContent.kt:44)");
            }
            y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, new Object[]{y1externalsyntheticlambda3, str, null, 0L, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), isRepeatingEnabled.onExtraCallback.asBinder(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i3 << 15) & 458752) | 24576), 6}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(String str, String str2, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        long jIsEngagementSignalsApiAvailable;
        bindChildren bindchildrenOnWarmupCompleted;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((i2 & 17) != 16) {
            int i4 = onNavigationEvent + 59;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i6 = onWarmupCompleted + 75;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1786345145, i2, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePurchaseHistoryDetailContent.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailContent.kt:52)");
            }
            if (str != null) {
                int i8 = onWarmupCompleted + 17;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1931426287);
                jIsEngagementSignalsApiAvailable = getMaxAdCount.onNavigationEvent(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), 0.4f);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i10 = onNavigationEvent + 43;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1931333535);
                jIsEngagementSignalsApiAvailable = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable();
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            long j = jIsEngagementSignalsApiAvailable;
            GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult();
            bindChildren.onNavigationEvent onnavigationevent = bindChildren.Companion;
            if (str != null) {
                int i12 = onWarmupCompleted + 81;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                bindchildrenOnWarmupCompleted = onnavigationevent.onExtraCallback();
            } else {
                bindchildrenOnWarmupCompleted = onnavigationevent.onWarmupCompleted();
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, null, null, Long.valueOf(j), 0L, 0L, null, null, null, Float.valueOf(0.0f), bindchildrenOnWarmupCompleted, null, 0L, 0, false, graphicDeviceInfoOnExtraCallbackWithResult, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 196608, 97270}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(Function0 function0) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 55;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = onWarmupCompleted + 5;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 97;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 61;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        boolean z;
        int i2;
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        final Function0 function0 = (Function0) objArr[2];
        final Function0 function02 = (Function0) objArr[3];
        int i3 = 4;
        y1ExternalSyntheticLambda4 y1externalsyntheticlambda4 = (y1ExternalSyntheticLambda4) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 115;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda4, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda4)) {
                int i7 = onNavigationEvent + 45;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
            } else {
                i3 = 2;
            }
            iIntValue |= i3;
        }
        int i9 = iIntValue;
        if ((i9 & 19) != 18) {
            int i10 = onNavigationEvent;
            int i11 = i10 + 57;
            onWarmupCompleted = i11 % 128;
            int i12 = i11 % 2;
            int i13 = i10 + 99;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i9 & 1))) {
            int i15 = onNavigationEvent + 97;
            onWarmupCompleted = i15 % 128;
            int i16 = i15 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i17 = onNavigationEvent + 1;
                onWarmupCompleted = i17 % 128;
                if (i17 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(897888469, i9, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePurchaseHistoryDetailContent.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailContent.kt:64)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(897888469, i9, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePurchaseHistoryDetailContent.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailContent.kt:64)");
            }
            if (str == null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-60868951);
                boolean zAreEqual = Intrinsics.areEqual(str2, "REQUESTED");
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent) {
                    Object obj = objOnMinimized;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function0 function03 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailContentKt$$ExternalSyntheticLambda12
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallback = 1;

                            public final Object invoke() {
                                int i18 = 2 % 2;
                                int i19 = IAuthTabCallback + 11;
                                onExtraCallback = i19 % 128;
                                int i20 = i19 % 2;
                                Unit unitOnExtraCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda54.onExtraCallback(function0);
                                int i21 = IAuthTabCallback + 45;
                                onExtraCallback = i21 % 128;
                                int i22 = i21 % 2;
                                return unitOnExtraCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function03);
                        obj = function03;
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = ImageLoaderBuilderExternalSyntheticLambda1.onWarmupCompleted(onextracallback, 0.0f, (Object) null, (Function0) obj, cameraCaptureResultEmptyCameraCaptureResult, 6, 3);
                    if (zAreEqual) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-417596454);
                        i2 = im.toss.appsintoss.R.string.appsintoss_purchase_history_detail_refund_btn_refunded;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-417599166);
                        i2 = im.toss.appsintoss.R.string.appsintoss_purchase_history_detail_refund_btn_refund;
                    }
                    String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(i2, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    setCallToAction.onWarmupCompleted onwarmupcompleted = setCallToAction.onWarmupCompleted.Dark;
                    setCallToAction.onExtraCallback onextracallback2 = setCallToAction.onExtraCallback.Weak;
                    setCallToAction.IAuthTabCallback iAuthTabCallbackOnNavigationEvent = setCallToAction.IAuthTabCallback.Companion.onNavigationEvent();
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function02);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnNavigationEvent2) {
                        Object obj2 = objOnMinimized2;
                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            Function0 function04 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailContentKt$$ExternalSyntheticLambda13
                                private static int onExtraCallback = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke() {
                                    int i18 = 2 % 2;
                                    int i19 = onNavigationEvent + 123;
                                    onExtraCallback = i19 % 128;
                                    int i20 = i19 % 2;
                                    Unit unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda54.onExtraCallbackWithResult(function02);
                                    int i21 = onNavigationEvent + 1;
                                    onExtraCallback = i21 % 128;
                                    int i22 = i21 % 2;
                                    return unitOnExtraCallbackWithResult;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function04);
                            obj2 = function04;
                        }
                        y1externalsyntheticlambda4.onNavigationEvent(strOnExtraCallback, quirksExternalSyntheticBackport0OnWarmupCompleted, (Function0) null, (Function0) obj2, iAuthTabCallbackOnNavigationEvent, onwarmupcompleted, onextracallback2, (setCallToAction.onNavigationEvent) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, !zAreEqual, false, cameraCaptureResultEmptyCameraCaptureResult, 1794048, (i9 << 3) & 112, 1412);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-60082791);
                y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1a.onWarmupCompleted, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.appsintoss.R.string.appsintoss_purchase_history_detail_refund_disclaimer, cameraCaptureResultEmptyCameraCaptureResult, 0), null, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), 0L, null, cameraCaptureResultEmptyCameraCaptureResult, 196608, 26}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(String str, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        Object obj = null;
        if ((i2 & 6) == 0) {
            int i5 = onWarmupCompleted + 13;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar);
                obj.hashCode();
                throw null;
            }
            i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(305338891, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePurchaseHistoryDetailContent.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailContent.kt:123)");
                int i6 = onWarmupCompleted + 87;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            }
            w5aVar.onExtraCallbackWithResult(str, new getHumanReadableName(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService(), 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777214, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, (i3 << 6) & 896, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onWarmupCompleted + 119;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i10 = onNavigationEvent + 87;
        onWarmupCompleted = i10 % 128;
        if (i10 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 111;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i2 & 6) == 0) {
            int i7 = onWarmupCompleted + 67;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            i3 = i2 | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1560850021, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePurchaseHistoryDetailContent.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryDetailContent.kt:132)");
            }
            RightPreset.onExtraCallback(VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{rightPreset, str, new getHumanReadableName(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), 0L, (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777214, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i3 << 6) & 896), 0}, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), -1798077257, 1798077258, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03e7 A[LOOP:0: B:189:0x03e1->B:191:0x03e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull final String str4, @NotNull final String str5, @Nullable final String str6, final boolean z, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable Function0<Unit> function03, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final Function0<Unit> function04;
        final Function0<Unit> function05;
        final Function0<Unit> function06;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        final Function0<Unit> function07;
        Function0<Unit> function08;
        String strOnExtraCallback;
        String str7;
        Object obj;
        String str8;
        Object obj2;
        String str9;
        int i10;
        int i11;
        int i12 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-607801793);
        int i13 = i4 & 1;
        if (i13 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            int i14 = onNavigationEvent + 113;
            onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
            i5 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3)) {
                int i16 = onNavigationEvent + 7;
                onWarmupCompleted = i16 % 128;
                int i17 = i16 % 2;
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i5 |= i11;
        }
        if ((i2 & 24576) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str4)) {
                i10 = 8192;
            } else {
                int i18 = onNavigationEvent + 83;
                onWarmupCompleted = i18 % 128;
                int i19 = i18 % 2;
                i10 = 16384;
            }
            i5 |= i10;
        }
        if ((196608 & i2) == 0) {
            int i20 = onNavigationEvent + 5;
            onWarmupCompleted = i20 % 128;
            int i21 = i20 % 2;
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str5) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str6) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 8388608 : 4194304;
        }
        int i22 = i4 & 256;
        if (i22 != 0) {
            i5 |= 100663296;
        } else if ((100663296 & i2) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i23 = onNavigationEvent + 57;
                onWarmupCompleted = i23 % 128;
                int i24 = i23 % 2;
                i6 = 67108864;
            } else {
                i6 = 33554432;
            }
            i5 |= i6;
        }
        int i25 = i4 & 512;
        if (i25 != 0) {
            i5 |= 805306368;
        } else {
            if ((805306368 & i2) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 536870912 : 268435456;
            }
            i7 = i4 & 1024;
            if (i7 == 0) {
                i9 = i3 | 6;
            } else {
                if ((i3 & 6) != 0) {
                    i8 = i3;
                    if ((i5 & 306783379) == 306783378) {
                        int i26 = onWarmupCompleted + 31;
                        onNavigationEvent = i26 % 128;
                        z2 = i26 % 2 != 0 ? (i8 & 3) != 2 : (i8 & 2) != 2;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i5 & 1)) {
                        quirksExternalSyntheticBackport02 = i13 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                        if (i22 != 0) {
                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailContentKt$$ExternalSyntheticLambda0
                                    private static int onExtraCallback = 0;
                                    private static int onNavigationEvent = 1;

                                    public final Object invoke() {
                                        int i27 = 2 % 2;
                                        int i28 = onNavigationEvent + 23;
                                        onExtraCallback = i28 % 128;
                                        if (i28 % 2 == 0) {
                                            int iOnWarmupCompleted = R.onWarmupCompleted();
                                            return (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda54.onExtraCallbackWithResult(new Object[0], 1542076294, -1542076291, R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted(), iOnWarmupCompleted);
                                        }
                                        int iOnWarmupCompleted2 = R.onWarmupCompleted();
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                            }
                            function04 = (Function0) objOnMinimized;
                        } else {
                            function04 = function0;
                        }
                        if (i25 != 0) {
                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized2 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailContentKt$$ExternalSyntheticLambda1
                                    private static int onExtraCallbackWithResult = 1;
                                    private static int onNavigationEvent;

                                    public final Object invoke() {
                                        int i27 = 2 % 2;
                                        int i28 = onExtraCallbackWithResult + 115;
                                        onNavigationEvent = i28 % 128;
                                        int i29 = i28 % 2;
                                        Unit unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda54.onExtraCallbackWithResult();
                                        int i30 = onNavigationEvent + 119;
                                        onExtraCallbackWithResult = i30 % 128;
                                        int i31 = i30 % 2;
                                        return unitOnExtraCallbackWithResult;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                            }
                            function07 = (Function0) objOnMinimized2;
                        } else {
                            function07 = function02;
                        }
                        if (i7 != 0) {
                            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized3 = new Function0() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailContentKt$$ExternalSyntheticLambda2
                                    private static int IAuthTabCallback = 1;
                                    private static int onNavigationEvent;

                                    public final Object invoke() {
                                        int i27 = 2 % 2;
                                        int i28 = onNavigationEvent + 5;
                                        IAuthTabCallback = i28 % 128;
                                        int i29 = i28 % 2;
                                        Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda54.IAuthTabCallback();
                                        int i30 = IAuthTabCallback + 43;
                                        onNavigationEvent = i30 % 128;
                                        int i31 = i30 % 2;
                                        return unitIAuthTabCallback;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                            }
                            function08 = (Function0) objOnMinimized3;
                        } else {
                            function08 = function03;
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i27 = onNavigationEvent + 95;
                            onWarmupCompleted = i27 % 128;
                            if (i27 % 2 != 0) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-607801793, i5, i8, "im.toss.appsintoss.iap.screen.InAppPurchasePurchaseHistoryDetailContent (InAppPurchaseHistoryDetailContent.kt:35)");
                                throw null;
                            }
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-607801793, i5, i8, "im.toss.appsintoss.iap.screen.InAppPurchasePurchaseHistoryDetailContent (InAppPurchaseHistoryDetailContent.kt:35)");
                        }
                        component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                        Function0<Unit> function09 = function08;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport02);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                        int i28 = i8;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            int i29 = onNavigationEvent + 115;
                            onWarmupCompleted = i29 % 128;
                            int i30 = i29 % 2;
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
                        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                        y1ExternalSyntheticLambda6.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(1786345145, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailContentKt$$ExternalSyntheticLambda3
                            private static int onExtraCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                int i31 = 2 % 2;
                                int i32 = onExtraCallback + 57;
                                onWarmupCompleted = i32 % 128;
                                int i33 = i32 % 2;
                                Object[] objArr = {str6, str3, (y1a) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, Integer.valueOf(((Integer) obj5).intValue())};
                                int iOnWarmupCompleted = R.onWarmupCompleted();
                                Unit unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda54.onExtraCallbackWithResult(objArr, 1140602457, -1140602457, R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted(), iOnWarmupCompleted);
                                int i34 = onExtraCallback + 75;
                                onWarmupCompleted = i34 % 128;
                                int i35 = i34 % 2;
                                return unit;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), quirksExternalSyntheticBackport03, y1ExternalSyntheticLambda0.onNavigationEvent.Companion.onNavigationEvent(), ForwardingCameraControl.onExtraCallback(-1861160616, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailContentKt$$ExternalSyntheticLambda4
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                int i31 = 2 % 2;
                                int i32 = onExtraCallbackWithResult + 41;
                                IAuthTabCallback = i32 % 128;
                                int i33 = i32 % 2;
                                Unit unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda54.onExtraCallbackWithResult(str2, (y1ExternalSyntheticLambda3) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                int i34 = onExtraCallbackWithResult + 73;
                                IAuthTabCallback = i34 % 128;
                                int i35 = i34 % 2;
                                return unitOnExtraCallbackWithResult;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), y1ExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onExtraCallbackWithResult(), (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, ForwardingCameraControl.onExtraCallback(897888469, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailContentKt$$ExternalSyntheticLambda5
                            private static int IAuthTabCallback = 1;
                            private static int onExtraCallback;

                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                int i31 = 2 % 2;
                                int i32 = onExtraCallback + 51;
                                IAuthTabCallback = i32 % 128;
                                int i33 = i32 % 2;
                                Object[] objArr = {str6, str, function07, function04, (y1ExternalSyntheticLambda4) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, Integer.valueOf(((Integer) obj5).intValue())};
                                int iOnWarmupCompleted = R.onWarmupCompleted();
                                Unit unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda54.onExtraCallbackWithResult(objArr, -1858055935, 1858055936, R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted(), iOnWarmupCompleted);
                                int i34 = IAuthTabCallback + 69;
                                onExtraCallback = i34 % 128;
                                int i35 = i34 % 2;
                                return unit;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), fIAuthTabCallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i5 << 3) & 112) | 28038, 438, 9184);
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.appsintoss.R.string.appsintoss_purchase_history_detail_yyyy_mm_dd_t_hh_mm_ss, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.appsintoss.R.string.appsintoss_purchase_history_detail_yyyy_mm_dd_hh_mm, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1602981302);
                        List listCreateListBuilder = CollectionsKt.createListBuilder();
                        listCreateListBuilder.add(getWrite.IAuthTabCallback(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.appsintoss.R.string.appsintoss_purchase_history_detail_order_id_title, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), str4));
                        if (str6 == null) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-711282218);
                            strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.appsintoss.R.string.appsintoss_purchase_history_detail_purchase_state_completed, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-711161225);
                            strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.appsintoss.R.string.appsintoss_purchase_history_detail_purchase_state_refunded, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        listCreateListBuilder.add(getWrite.IAuthTabCallback(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.appsintoss.R.string.appsintoss_purchase_history_detail_purchase_state_title, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), strOnExtraCallback));
                        try {
                            Result.Companion companion = Result.Companion;
                            str7 = str5;
                            try {
                                Date date = simpleDateFormat.parse(str7);
                                obj = Result.constructor-impl(date == null ? null : simpleDateFormat2.format(date));
                            } catch (Throwable th) {
                                th = th;
                                Result.Companion companion2 = Result.Companion;
                                obj = Result.constructor-impl(ResultKt.createFailure(th));
                                if (Result.onExtraCallback(obj)) {
                                }
                                str8 = (String) obj;
                                if (str8 == null) {
                                }
                                listCreateListBuilder.add(getWrite.IAuthTabCallback(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.appsintoss.R.string.appsintoss_purchase_history_detail_purchase_date_title, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), str8));
                                if (str6 == null) {
                                }
                                List<Pair> listBuild = CollectionsKt.build(listCreateListBuilder);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1602940530);
                                while (r0.hasNext()) {
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                if (str6 != null) {
                                }
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            str7 = str5;
                        }
                        if (Result.onExtraCallback(obj)) {
                            obj = null;
                        }
                        str8 = (String) obj;
                        if (str8 == null) {
                            str8 = str7;
                        }
                        listCreateListBuilder.add(getWrite.IAuthTabCallback(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.appsintoss.R.string.appsintoss_purchase_history_detail_purchase_date_title, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), str8));
                        if (str6 == null) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-710578580);
                            try {
                                Result.Companion companion3 = Result.Companion;
                                Date date2 = simpleDateFormat.parse(str6);
                                if (date2 == null) {
                                    int i31 = onNavigationEvent + 1;
                                    onWarmupCompleted = i31 % 128;
                                    int i32 = i31 % 2;
                                    str9 = null;
                                } else {
                                    str9 = simpleDateFormat2.format(date2);
                                }
                                obj2 = Result.constructor-impl(str9);
                            } catch (Throwable th3) {
                                Result.Companion companion4 = Result.Companion;
                                obj2 = Result.constructor-impl(ResultKt.createFailure(th3));
                            }
                            String str10 = (String) (Result.onExtraCallback(obj2) ? null : obj2);
                            if (str10 != null) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-710362789);
                                listCreateListBuilder.add(getWrite.IAuthTabCallback(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.appsintoss.R.string.appsintoss_purchase_history_detail_refund_date_title, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), str10));
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-710225366);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-710211478);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        List<Pair> listBuild2 = CollectionsKt.build(listCreateListBuilder);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1602940530);
                        for (Pair pair : listBuild2) {
                            final String str11 = (String) pair.onExtraCallbackWithResult();
                            final String str12 = (String) pair.IAuthTabCallback();
                            getViewTypeCount.onExtraCallback.onNavigationEvent onnavigationevent = getViewTypeCount.onExtraCallback.Companion;
                            w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(305338891, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailContentKt$$ExternalSyntheticLambda6
                                private static int onExtraCallbackWithResult = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    int i33 = 2 % 2;
                                    int i34 = onWarmupCompleted + 41;
                                    onExtraCallbackWithResult = i34 % 128;
                                    int i35 = i34 % 2;
                                    Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda54.IAuthTabCallback(str11, (w5a) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                    int i36 = onWarmupCompleted + 107;
                                    onExtraCallbackWithResult = i36 % 128;
                                    if (i36 % 2 == 0) {
                                        int i37 = 95 / 0;
                                    }
                                    return unitIAuthTabCallback;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, onnavigationevent.onNavigationEvent(), (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(-1560850021, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailContentKt$$ExternalSyntheticLambda7
                                private static int IAuthTabCallback = 1;
                                private static int onNavigationEvent;

                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    int i33 = 2 % 2;
                                    int i34 = IAuthTabCallback + 121;
                                    onNavigationEvent = i34 % 128;
                                    if (i34 % 2 != 0) {
                                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda54.onExtraCallbackWithResult(str12, (RightPreset) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                        throw null;
                                    }
                                    Unit unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda54.onExtraCallbackWithResult(str12, (RightPreset) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                                    int i35 = onNavigationEvent + 59;
                                    IAuthTabCallback = i35 % 128;
                                    if (i35 % 2 == 0) {
                                        int i36 = 16 / 0;
                                    }
                                    return unitOnExtraCallbackWithResult;
                                }
                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), onnavigationevent.onNavigationEvent(), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, getViewTypeCount.onTransact.Companion.onNavigationEvent(), (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1772550, 384, 126870);
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        if (str6 != null) {
                            int i33 = onNavigationEvent + 93;
                            onWarmupCompleted = i33 % 128;
                            int i34 = i33 % 2;
                            if (z) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1849337073);
                                getViewTypeCount.onTransact ontransactOnNavigationEvent = getViewTypeCount.onTransact.Companion.onNavigationEvent();
                                getViewTypeCount.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = getViewTypeCount.IAuthTabCallback.Companion.onExtraCallbackWithResult();
                                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda50 safeActivityEmbeddingComponentProviderExternalSyntheticLambda50 = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda50.onNavigationEvent;
                                w4.onExtraCallbackWithResult(safeActivityEmbeddingComponentProviderExternalSyntheticLambda50.onWarmupCompleted(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, safeActivityEmbeddingComponentProviderExternalSyntheticLambda50.onExtraCallbackWithResult(), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, iAuthTabCallbackOnExtraCallbackWithResult, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, ontransactOnNavigationEvent, (String) null, function09, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100859910, ((i28 << 12) & 57344) | 384, 110302);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1849927437);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            function06 = function09;
                            function05 = function07;
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                        function04 = function0;
                        function05 = function02;
                        function06 = function03;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                        final Function0<Unit> function010 = function04;
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryDetailContentKt$$ExternalSyntheticLambda8
                            private static int onExtraCallbackWithResult = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj3, Object obj4) {
                                int i35 = 2 % 2;
                                int i36 = onWarmupCompleted + 13;
                                onExtraCallbackWithResult = i36 % 128;
                                int i37 = i36 % 2;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                                String str13 = str;
                                String str14 = str2;
                                String str15 = str3;
                                String str16 = str4;
                                String str17 = str5;
                                String str18 = str6;
                                boolean z3 = z;
                                Function0 function011 = function010;
                                Function0 function012 = function05;
                                Function0 function013 = function06;
                                int i38 = i2;
                                int i39 = i3;
                                int i40 = i4;
                                int iIntValue = ((Integer) obj4).intValue();
                                Object[] objArr = {quirksExternalSyntheticBackport05, str13, str14, str15, str16, str17, str18, Boolean.valueOf(z3), function011, function012, function013, Integer.valueOf(i38), Integer.valueOf(i39), Integer.valueOf(i40), (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(iIntValue)};
                                int iOnWarmupCompleted = R.onWarmupCompleted();
                                Unit unit = (Unit) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda54.onExtraCallbackWithResult(objArr, 1897927646, -1897927644, R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted(), iOnWarmupCompleted);
                                int i41 = onExtraCallbackWithResult + 87;
                                onWarmupCompleted = i41 % 128;
                                if (i41 % 2 != 0) {
                                    return unit;
                                }
                                Object obj5 = null;
                                obj5.hashCode();
                                throw null;
                            }
                        });
                        return;
                    }
                    return;
                }
                i9 = i3 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function03) ? 4 : 2);
            }
            i8 = i9;
            if ((i5 & 306783379) == 306783378) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i5 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i7 = i4 & 1024;
        if (i7 == 0) {
        }
        i8 = i9;
        if ((i5 & 306783379) == 306783378) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z2, i5 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public static final void onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1539877334);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i2 != 0, i2 & 1)) {
            int i4 = onWarmupCompleted + 77;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onNavigationEvent + 19;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1539877334, i2, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePurchaseHistoryDetailContentPreview (InAppPurchaseHistoryDetailContent.kt:166)");
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            onExtraCallback(null, "PURCHASED", "Toss Wallet", "₩ 6,000", "30050544", "2025-08-26T22:05:06", null, true, null, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 14380464, 0, 1793);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onNavigationEvent + 97;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new InAppPurchaseHistoryDetailContentKt$.ExternalSyntheticLambda9(i2));
        }
    }

    public static final void onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 29;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1870383472);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i2 != 0, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1870383472, i2, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePurchaseHistoryDetailContentRequestedPreview (InAppPurchaseHistoryDetailContent.kt:181)");
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            onExtraCallback(null, "REQUESTED", "Toss Wallet", "₩ 6,000", "30050544", "2025-08-26T22:05:06", null, false, null, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 14380464, 0, 1793);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onWarmupCompleted + 91;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
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
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new InAppPurchaseHistoryDetailContentKt$.ExternalSyntheticLambda11(i2));
        }
    }

    public static final void onNavigationEvent(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 105;
        onWarmupCompleted = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1774432385);
            obj.hashCode();
            throw null;
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1774432385);
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i2 != 0, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        } else {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = onNavigationEvent + 55;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1774432385, i2, -1, "im.toss.appsintoss.iap.screen.InAppPurchasePurchaseHistoryDetailContentRefundedPreview (InAppPurchaseHistoryDetailContent.kt:196)");
            }
            onExtraCallback(null, "PURCHASED", "Toss Wallet", "₩ 6,000", "30050544", "2025-08-26T22:05:06", "2025-08-26T22:06:06", false, null, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 14380464, 0, 1793);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onWarmupCompleted + 1;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new InAppPurchaseHistoryDetailContentKt$.ExternalSyntheticLambda10(i2));
        }
        int i8 = onNavigationEvent + 57;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, String str2, String str3, String str4, String str5, String str6, boolean z, Function0 function0, Function0 function02, Function0 function03, int i2, int i3, int i4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i5) {
        Object[] objArr = {quirksExternalSyntheticBackport0, str, str2, str3, str4, str5, str6, Boolean.valueOf(z), function0, function02, function03, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i5)};
        int iOnWarmupCompleted = R.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(objArr, 1897927646, -1897927644, R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted(), iOnWarmupCompleted);
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, String str2, Function0 function0, Function0 function02, y1ExternalSyntheticLambda4 y1externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {str, str2, function0, function02, y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnWarmupCompleted = R.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(objArr, -1858055935, 1858055936, R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted(), iOnWarmupCompleted);
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int iOnWarmupCompleted = R.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(new Object[0], 1542076294, -1542076291, R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted(), iOnWarmupCompleted);
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, String str2, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {str, str2, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnWarmupCompleted = R.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(objArr, 1140602457, -1140602457, R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted(), iOnWarmupCompleted);
    }

    private static final Unit onExtraCallback(String str, String str2, Function0 function0, Function0 function02, y1ExternalSyntheticLambda4 y1externalsyntheticlambda4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {str, str2, function0, function02, y1externalsyntheticlambda4, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnWarmupCompleted = R.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(objArr, -1103157802, 1103157806, R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted(), iOnWarmupCompleted);
    }

    private static final Unit onNavigationEvent(Function0 function0) {
        int iOnWarmupCompleted = R.onWarmupCompleted();
        return (Unit) onExtraCallbackWithResult(new Object[]{function0}, 1040951560, -1040951555, R.onWarmupCompleted(), R.onWarmupCompleted(), R.onWarmupCompleted(), iOnWarmupCompleted);
    }
}
