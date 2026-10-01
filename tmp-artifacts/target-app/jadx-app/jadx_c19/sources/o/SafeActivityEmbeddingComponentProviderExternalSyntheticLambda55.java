package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import im.toss.appsintoss.R;
import im.toss.appsintoss.iap.screen.InAppPurchaseHistoryCashReceiptContentKt$;
import im.toss.features.leave.ui.visitor.VisitorRemainingBalanceBridgeContentKt$;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda55;
import o.getViewTypeCount;
import o.toPreviewOnlyRange;
import o.y1ExternalSyntheticLambda0;
import o.y1ExternalSyntheticLambda3;
import o.y1a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda55 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Unit IAuthTabCallback(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 85;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 68 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37 safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 109;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 33;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i3;
        int i9 = ~(i8 | i5);
        int i10 = ~i5;
        int i11 = ~(i10 | i3);
        int i12 = ~((~i7) | i5);
        int i13 = i11 | i12;
        int i14 = i12 | (~(i8 | i10));
        int i15 = i5 + i3 + i6 + ((-1232316077) * i2) + ((-263306238) * i4);
        int i16 = i15 * i15;
        int i17 = (((-69115011) * i5) - 1785593856) + (933837065 * i3) + (763021048 * i9) + (1765973124 * i13) + ((-1765973124) * i14) + (1696858112 * i6) + (1319895040 * i2) + (1514668032 * i4) + (1334968320 * i16);
        int i18 = ((i5 * (-2046307327)) - 1888090795) + (i3 * (-2046308995)) + (i9 * 1112) + (i13 * (-556)) + (i14 * 556) + (i6 * (-2046307883)) + (i2 * 1526207759) + (i4 * (-1095616598)) + (i16 * 1719271424);
        int i19 = i17 + (i18 * i18 * 2111700992);
        return i19 != 1 ? i19 != 2 ? i19 != 3 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    private static final Unit onExtraCallback(int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 1;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 45;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 19;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        Object[] objArr = {str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent3 = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent4 = setCurrentIndex.onNavigationEvent();
        if (i5 == 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onExtraCallback(objArr, iOnNavigationEvent3, 1690352327, iOnNavigationEvent4, -1690352327, iOnNavigationEvent2, iOnNavigationEvent);
        int i6 = onNavigationEvent + 67;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37 safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        if (i5 != 0) {
            return (Unit) onExtraCallback(objArr, setCurrentIndex.onNavigationEvent(), 1515115859, setCurrentIndex.onNavigationEvent(), -1515115858, iOnNavigationEvent2, iOnNavigationEvent);
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 107;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 75;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 34 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37 safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 91;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onNavigationEvent + 89;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37 safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 123;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnTransact = onTransact(safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onWarmupCompleted + 15;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37 safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 11;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        Unit unit = (Unit) onExtraCallback(objArr, setCurrentIndex.onNavigationEvent(), -1513000767, setCurrentIndex.onNavigationEvent(), 1513000770, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent);
        int i6 = onWarmupCompleted + 39;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37 safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 39;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        Object[] objArr = {quirksExternalSyntheticBackport0, safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1)), Integer.valueOf(i3)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        onExtraCallback(objArr, setCurrentIndex.onNavigationEvent(), -1970067015, setCurrentIndex.onNavigationEvent(), 1970067017, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent);
        Unit unit = Unit.INSTANCE;
        int i8 = onWarmupCompleted + 33;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37 safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 77;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 != 0) {
            int i6 = 94 / 0;
        }
        int i7 = onWarmupCompleted + 75;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37 safeActivityEmbeddingComponentProviderExternalSyntheticLambda37 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37) objArr[0];
        y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 63;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(y1externalsyntheticlambda3, "");
        if ((iIntValue & 6) == 0) {
            int i5 = onWarmupCompleted + 71;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3);
                throw null;
            }
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3) ? 4 : 2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(763575008, iIntValue, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryCashReceiptContent.<anonymous>.<anonymous> (InAppPurchaseHistoryCashReceiptContent.kt:40)");
            }
            y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, new Object[]{y1externalsyntheticlambda3, safeActivityEmbeddingComponentProviderExternalSyntheticLambda37.onWarmupCompleted(), null, 0L, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((iIntValue << 15) & 458752), 30}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37 safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((i2 & 6) == 0) {
            int i5 = onNavigationEvent + 89;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar);
                throw null;
            }
            i3 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            int i6 = onWarmupCompleted + 25;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 34 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-473099775, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryCashReceiptContent.<anonymous>.<anonymous> (InAppPurchaseHistoryCashReceiptContent.kt:46)");
                    int i8 = onWarmupCompleted + 55;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                }
                y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, safeActivityEmbeddingComponentProviderExternalSyntheticLambda37.IAuthTabCallback(), null, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable()), 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i3 << 15) & 458752), 26}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, safeActivityEmbeddingComponentProviderExternalSyntheticLambda37.IAuthTabCallback(), null, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable()), 0L, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i3 << 15) & 458752), 26}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i2;
        String str = (String) objArr[0];
        RightPreset rightPreset = (RightPreset) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                i2 = 4;
            } else {
                int i4 = onNavigationEvent + 5;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                i2 = 2;
            }
            iIntValue |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            int i6 = onWarmupCompleted + 115;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-833038293, iIntValue, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryCashReceiptContent.<anonymous>.<anonymous> (InAppPurchaseHistoryCashReceiptContent.kt:61)");
            }
            rightPreset.IAuthTabCallback(str, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), 0L, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResult, (iIntValue << 12) & 57344, 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onNavigationEvent + 119;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onWarmupCompleted + 117;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i2 & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                int i6 = onNavigationEvent + 123;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
            int i8 = onNavigationEvent + 55;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
        } else {
            i3 = i2;
        }
        if ((i3 & 19) != 18) {
            int i10 = onWarmupCompleted + 89;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-788082206, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryCashReceiptContent.<anonymous>.<anonymous> (InAppPurchaseHistoryCashReceiptContent.kt:78)");
            }
            rightPreset.IAuthTabCallback(str, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), 0L, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResult, 57344 & (i3 << 12), 12);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i12 = onWarmupCompleted + 33;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37 safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 47;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i2 & 34) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                    int i7 = onWarmupCompleted + 125;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    i3 = 4;
                } else {
                    int i9 = onNavigationEvent + 71;
                    onWarmupCompleted = i9 % 128;
                    int i10 = i9 % 2;
                    i3 = 2;
                }
                i4 = i3 | i2;
                int i11 = onNavigationEvent + 25;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
            } else {
                i4 = i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i2 & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(!((i4 & 19) == 18), i4 & 1)) {
            int i13 = onNavigationEvent + 109;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(684196387, i4, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryCashReceiptContent.<anonymous>.<anonymous> (InAppPurchaseHistoryCashReceiptContent.kt:95)");
            }
            rightPreset.IAuthTabCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda37.onExtraCallback(), y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), 0L, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResult, 57344 & (i4 << 12), 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37 safeActivityEmbeddingComponentProviderExternalSyntheticLambda37 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37) objArr[0];
        RightPreset rightPreset = (RightPreset) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((iIntValue & 6) == 0) {
            int i3 = onNavigationEvent + 101;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset);
                throw null;
            }
            iIntValue |= !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 2 : 4;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onNavigationEvent + 45;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2138492316, iIntValue, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryCashReceiptContent.<anonymous>.<anonymous> (InAppPurchaseHistoryCashReceiptContent.kt:112)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2138492316, iIntValue, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryCashReceiptContent.<anonymous>.<anonymous> (InAppPurchaseHistoryCashReceiptContent.kt:112)");
            }
            rightPreset.IAuthTabCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda37.onExtraCallbackWithResult(), y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), 0L, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResult, (iIntValue << 12) & 57344, 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onTransact(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37 safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3;
        boolean z;
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 57;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i2 & 117) != 0) {
                i3 = i2;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                int i6 = onNavigationEvent + 3;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2 == 0 ? 2 : 4;
                i3 = i7 | i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i2 & 6) == 0) {
            }
        }
        if ((i3 & 19) != 18) {
            int i8 = onWarmupCompleted + 51;
            onNavigationEvent = i8 % 128;
            z = i8 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-666213723, i3, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryCashReceiptContent.<anonymous>.<anonymous> (InAppPurchaseHistoryCashReceiptContent.kt:129)");
            }
            rightPreset.IAuthTabCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda37.onNavigationEvent(), y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable(), 0L, (GraphicDeviceInfo) null, cameraCaptureResultEmptyCameraCaptureResult, 57344 & (i3 << 12), 12);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onNavigationEvent + 43;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i10 = 49 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i11 = onNavigationEvent + 81;
        onWarmupCompleted = i11 % 128;
        if (i11 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i2;
        LocalDateTime localDateTimeAsBinder;
        final String str;
        final String str2;
        int i3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37 safeActivityEmbeddingComponentProviderExternalSyntheticLambda37 = (SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        final int iIntValue = ((Number) objArr[3]).intValue();
        int i4 = 4;
        final int iIntValue2 = ((Number) objArr[4]).intValue();
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-379853817);
        int i6 = iIntValue2 & 1;
        if (i6 != 0) {
            i2 = iIntValue | 6;
        } else if ((iIntValue & 6) == 0) {
            int i7 = onWarmupCompleted + 111;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                int i9 = onWarmupCompleted + 109;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
            } else {
                i4 = 2;
            }
            int i11 = i4 | iIntValue;
            int i12 = onWarmupCompleted + 57;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 3 % 5;
            }
            i2 = i11;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(safeActivityEmbeddingComponentProviderExternalSyntheticLambda37))) {
                int i14 = onWarmupCompleted + 115;
                onNavigationEvent = i14 % 128;
                i3 = i14 % 2 != 0 ? 45 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i15 = onWarmupCompleted + 19;
            onNavigationEvent = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 93 / 0;
                if (i6 != 0) {
                    quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-379853817, i2, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryCashReceiptContent (InAppPurchaseHistoryCashReceiptContent.kt:27)");
                }
                DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_cash_receipt_date_format, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                localDateTimeAsBinder = safeActivityEmbeddingComponentProviderExternalSyntheticLambda37.asBinder();
                if (localDateTimeAsBinder == null) {
                    int i17 = onWarmupCompleted + 103;
                    onNavigationEvent = i17 % 128;
                    if (i17 % 2 != 0) {
                        str = localDateTimeAsBinder.format(dateTimeFormatterOfPattern);
                        int i18 = 38 / 0;
                    } else {
                        str = localDateTimeAsBinder.format(dateTimeFormatterOfPattern);
                    }
                } else {
                    str = null;
                }
                LocalDateTime localDateTimeOnTransact = safeActivityEmbeddingComponentProviderExternalSyntheticLambda37.onTransact();
                str2 = localDateTimeOnTransact == null ? localDateTimeOnTransact.format(dateTimeFormatterOfPattern) : null;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(quirksExternalSyntheticBackport0, setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback);
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
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                y1ExternalSyntheticLambda6.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-473099775, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryCashReceiptContentKt$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i19 = 2 % 2;
                        int i20 = onWarmupCompleted + 85;
                        IAuthTabCallback = i20 % 128;
                        int i21 = i20 % 2;
                        Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda55.IAuthTabCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, (y1a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i22 = onWarmupCompleted + 111;
                        IAuthTabCallback = i22 % 128;
                        int i23 = i22 % 2;
                        return unitIAuthTabCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, y1ExternalSyntheticLambda0.onNavigationEvent.Companion.onNavigationEvent(), ForwardingCameraControl.onExtraCallback(763575008, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryCashReceiptContentKt$$ExternalSyntheticLambda2
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i19 = 2 % 2;
                        int i20 = IAuthTabCallback + 91;
                        onNavigationEvent = i20 % 128;
                        int i21 = i20 % 2;
                        Unit unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda55.onExtraCallbackWithResult(safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, (y1ExternalSyntheticLambda3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i22 = onNavigationEvent + 7;
                        IAuthTabCallback = i22 % 128;
                        if (i22 % 2 != 0) {
                            return unitOnExtraCallbackWithResult;
                        }
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), y1ExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onExtraCallbackWithResult(), (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f), 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 28038, 48, 14306);
                if (str == null) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1839088817);
                    w4.onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda44.onNavigationEvent.onWarmupCompleted(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(-833038293, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryCashReceiptContentKt$$ExternalSyntheticLambda3
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i19 = 2 % 2;
                            int i20 = IAuthTabCallback + 69;
                            onNavigationEvent = i20 % 128;
                            int i21 = i20 % 2;
                            Unit unitOnExtraCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda55.onExtraCallback(str, (RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i22 = IAuthTabCallback + 101;
                            onNavigationEvent = i22 % 128;
                            int i23 = i22 % 2;
                            return unitOnExtraCallback;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, getViewTypeCount.onTransact.Companion.onNavigationEvent(), (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196614, 384, 126942);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1839569317);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                if (str2 == null) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1839620498);
                    w4.onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda44.onNavigationEvent.onExtraCallbackWithResult(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(-788082206, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryCashReceiptContentKt$$ExternalSyntheticLambda4
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i19 = 2 % 2;
                            int i20 = onExtraCallbackWithResult + 33;
                            onNavigationEvent = i20 % 128;
                            int i21 = i20 % 2;
                            Unit unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda55.onExtraCallbackWithResult(str2, (RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i22 = onNavigationEvent + 111;
                            onExtraCallbackWithResult = i22 % 128;
                            int i23 = i22 % 2;
                            return unitOnExtraCallbackWithResult;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, getViewTypeCount.onTransact.Companion.onNavigationEvent(), (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196614, 384, 126942);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1840100037);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda37.onExtraCallback() == null) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1840161727);
                    w4.onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda44.onNavigationEvent.asBinder(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(684196387, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryCashReceiptContentKt$$ExternalSyntheticLambda5
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;

                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i19 = 2 % 2;
                            int i20 = onExtraCallback + 39;
                            IAuthTabCallback = i20 % 128;
                            int i21 = i20 % 2;
                            Unit unitOnWarmupCompleted = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda55.onWarmupCompleted(safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, (RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i22 = onExtraCallback + 123;
                            IAuthTabCallback = i22 % 128;
                            int i23 = i22 % 2;
                            return unitOnWarmupCompleted;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, getViewTypeCount.onTransact.Companion.onNavigationEvent(), (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196614, 384, 126942);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1840659525);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda37.onExtraCallbackWithResult() == null) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1840718983);
                    w4.onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda44.onNavigationEvent.IAuthTabCallbackStub(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(-2138492316, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryCashReceiptContentKt$$ExternalSyntheticLambda6
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i19 = 2 % 2;
                            int i20 = onNavigationEvent + 73;
                            IAuthTabCallback = i20 % 128;
                            int i21 = i20 % 2;
                            Unit unitOnExtraCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda55.onExtraCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, (RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i22 = onNavigationEvent + 33;
                            IAuthTabCallback = i22 % 128;
                            if (i22 % 2 == 0) {
                                return unitOnExtraCallback;
                            }
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, getViewTypeCount.onTransact.Companion.onNavigationEvent(), (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196614, 384, 126942);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1841209093);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda37.onNavigationEvent() == null) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1841283338);
                    w4.onExtraCallbackWithResult(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda44.onNavigationEvent.onNavigationEvent(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(-666213723, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryCashReceiptContentKt$$ExternalSyntheticLambda7
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i19 = 2 % 2;
                            int i20 = onExtraCallbackWithResult + 125;
                            onExtraCallback = i20 % 128;
                            if (i20 % 2 != 0) {
                                SafeActivityEmbeddingComponentProviderExternalSyntheticLambda55.onExtraCallbackWithResult(safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, (RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                            Unit unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda55.onExtraCallbackWithResult(safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, (RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i21 = onExtraCallback + 63;
                            onExtraCallbackWithResult = i21 % 128;
                            int i22 = i21 % 2;
                            return unitOnExtraCallbackWithResult;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, getViewTypeCount.onTransact.Companion.onNavigationEvent(), (String) null, (Function0) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196614, 384, 126942);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1841801317);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(46.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                r8lambdaL3YVedIYrkax5fojVMcLJQJpM.onExtraCallback(1461071866, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{null, 0L, Float.valueOf(0.0f), null, (getBacktraceNote) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda44.onExtraCallbackWithResult(matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{SafeActivityEmbeddingComponentProviderExternalSyntheticLambda44.onNavigationEvent}, 2142481999, matches.onExtraCallback(), -2142481996), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24576, 15}, -1461071865, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (i6 != 0) {
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                DateTimeFormatter dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.appsintoss_cash_receipt_date_format, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                localDateTimeAsBinder = safeActivityEmbeddingComponentProviderExternalSyntheticLambda37.asBinder();
                if (localDateTimeAsBinder == null) {
                }
                LocalDateTime localDateTimeOnTransact2 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda37.onTransact();
                if (localDateTimeOnTransact2 == null) {
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = setContentInsetsAbsolute.IAuthTabCallback(quirksExternalSyntheticBackport0, setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null);
                component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                y1ExternalSyntheticLambda6.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(-473099775, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryCashReceiptContentKt$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i19 = 2 % 2;
                        int i20 = onWarmupCompleted + 85;
                        IAuthTabCallback = i20 % 128;
                        int i21 = i20 % 2;
                        Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda55.IAuthTabCallback(safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, (y1a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i22 = onWarmupCompleted + 111;
                        IAuthTabCallback = i22 % 128;
                        int i23 = i22 % 2;
                        return unitIAuthTabCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (QuirksExternalSyntheticBackport0) null, y1ExternalSyntheticLambda0.onNavigationEvent.Companion.onNavigationEvent(), ForwardingCameraControl.onExtraCallback(763575008, true, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryCashReceiptContentKt$$ExternalSyntheticLambda2
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i19 = 2 % 2;
                        int i20 = IAuthTabCallback + 91;
                        onNavigationEvent = i20 % 128;
                        int i21 = i20 % 2;
                        Unit unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda55.onExtraCallbackWithResult(safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, (y1ExternalSyntheticLambda3) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i22 = onNavigationEvent + 7;
                        IAuthTabCallback = i22 % 128;
                        if (i22 % 2 != 0) {
                            return unitOnExtraCallbackWithResult;
                        }
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), y1ExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onExtraCallbackWithResult(), (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f), 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 28038, 48, 14306);
                if (str == null) {
                }
                if (str2 == null) {
                }
                if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda37.onExtraCallback() == null) {
                }
                if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda37.onExtraCallbackWithResult() == null) {
                }
                if (safeActivityEmbeddingComponentProviderExternalSyntheticLambda37.onNavigationEvent() == null) {
                }
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(46.0f)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                r8lambdaL3YVedIYrkax5fojVMcLJQJpM.onExtraCallback(1461071866, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{null, 0L, Float.valueOf(0.0f), null, (getBacktraceNote) SafeActivityEmbeddingComponentProviderExternalSyntheticLambda44.onExtraCallbackWithResult(matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{SafeActivityEmbeddingComponentProviderExternalSyntheticLambda44.onNavigationEvent}, 2142481999, matches.onExtraCallback(), -2142481996), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24576, 15}, -1461071865, VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback(), VisitorRemainingBalanceBridgeContentKt$.ExternalSyntheticLambda0.IAuthTabCallback());
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.appsintoss.iap.screen.InAppPurchaseHistoryCashReceiptContentKt$$ExternalSyntheticLambda8
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i19 = 2 % 2;
                    int i20 = onExtraCallback + 89;
                    IAuthTabCallback = i20 % 128;
                    int i21 = i20 % 2;
                    Object obj3 = null;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                    SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37 safeActivityEmbeddingComponentProviderExternalSyntheticLambda372 = safeActivityEmbeddingComponentProviderExternalSyntheticLambda37;
                    if (i21 != 0) {
                        SafeActivityEmbeddingComponentProviderExternalSyntheticLambda55.onExtraCallbackWithResult(quirksExternalSyntheticBackport02, safeActivityEmbeddingComponentProviderExternalSyntheticLambda372, iIntValue, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        obj3.hashCode();
                        throw null;
                    }
                    Unit unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda55.onExtraCallbackWithResult(quirksExternalSyntheticBackport02, safeActivityEmbeddingComponentProviderExternalSyntheticLambda372, iIntValue, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i22 = IAuthTabCallback + 79;
                    onExtraCallback = i22 % 128;
                    if (i22 % 2 != 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    obj3.hashCode();
                    throw null;
                }
            });
        }
        return null;
    }

    private static final void onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        boolean z;
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1169917647);
        if (i2 != 0) {
            int i4 = onWarmupCompleted + 35;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            int i6 = onNavigationEvent + 93;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onWarmupCompleted + 81;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1169917647, i2, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryCashReceiptContentPreview (InAppPurchaseHistoryCashReceiptContent.kt:166)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1169917647, i2, -1, "im.toss.appsintoss.iap.screen.InAppPurchaseHistoryCashReceiptContentPreview (InAppPurchaseHistoryCashReceiptContent.kt:166)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda44.onNavigationEvent.onExtraCallback(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new InAppPurchaseHistoryCashReceiptContentKt$.ExternalSyntheticLambda0(i2));
        }
        int i9 = onNavigationEvent + 15;
        onWarmupCompleted = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    public static final void onExtraCallbackWithResult(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37 safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        onExtraCallback(objArr, setCurrentIndex.onNavigationEvent(), -1970067015, setCurrentIndex.onNavigationEvent(), 1970067017, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent);
    }

    private static final Unit onNavigationEvent(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37 safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) onExtraCallback(objArr, setCurrentIndex.onNavigationEvent(), -1513000767, setCurrentIndex.onNavigationEvent(), 1513000770, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent);
    }

    private static final Unit IAuthTabCallback(String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) onExtraCallback(objArr, setCurrentIndex.onNavigationEvent(), 1690352327, setCurrentIndex.onNavigationEvent(), -1690352327, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent);
    }

    private static final Unit IAuthTabCallback(SafeActivityEmbeddingComponentProviderExternalSyntheticLambda37 safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {safeActivityEmbeddingComponentProviderExternalSyntheticLambda37, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        return (Unit) onExtraCallback(objArr, setCurrentIndex.onNavigationEvent(), 1515115859, setCurrentIndex.onNavigationEvent(), -1515115858, setCurrentIndex.onNavigationEvent(), iOnNavigationEvent);
    }
}
