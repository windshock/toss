package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.GraphicDeviceInfo;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.WebViewCompatExternalSyntheticLambda3;
import o.deleteProfile;
import o.handshake;
import o.onReceivedHttpError;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WebViewCompatExternalSyntheticLambda3 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface(function1);
        }
        asInterface(function1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(useandconfigureprogramwithtexture);
        int i4 = onWarmupCompleted + 17;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        deleteProfile deleteprofile = (deleteProfile) objArr[2];
        NativeAdsDto.Creative.RightBanner rightBanner = (NativeAdsDto.Creative.RightBanner) objArr[3];
        onReceivedHttpError.IAuthTabCallback iAuthTabCallback = (onReceivedHttpError.IAuthTabCallback) objArr[4];
        Function1 function1 = (Function1) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int iIntValue2 = ((Number) objArr[7]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        int iIntValue3 = ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {quirksExternalSyntheticBackport0, Boolean.valueOf(zBooleanValue), deleteprofile, rightBanner, iAuthTabCallback, function1, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue3)};
        Unit unit = (Unit) onExtraCallbackWithResult(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), objArr2, 16420727, -16420727, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
        int i4 = onWarmupCompleted + 17;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(function1);
        int i4 = onNavigationEvent + 17;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 81;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(useandconfigureprogramwithtexture);
        int i4 = onWarmupCompleted + 59;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAsBinder;
        }
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i)) | i9 | (~(i8 | i));
        int i11 = ~i;
        int i12 = (~(i11 | i8 | i3)) | (~(i7 | i11 | i2));
        int i13 = i3 + i2 + i5 + ((-195996979) * i6) + ((-904719387) * i4);
        int i14 = i13 * i13;
        int i15 = (i3 * 1886715248) + 940376064 + (1886715248 * i2) + (i10 * (-42925423)) + (i9 * (-42925423)) + ((-42925423) * i12) + (1843789824 * i5) + ((-1389494272) * i6) + (1623064576 * i4) + (1510801408 * i14);
        int i16 = (i3 * 1590984816) + 1398186415 + (i2 * 1590984816) + (i10 * 737) + (i9 * 737) + (i12 * 737) + (i5 * 1590985553) + (i6 * (-1025631779)) + (i4 * 1121679989) + (i14 * 622657536);
        int i17 = i15 + (i16 * i16 * (-1928134656));
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? onWarmupCompleted(objArr) : onExtraCallback(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 49;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(function1);
        int i4 = onNavigationEvent + 71;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onTransact(useandconfigureprogramwithtexture);
        }
        onTransact(useandconfigureprogramwithtexture);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, Function1 function1, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(str, function1, useandconfigureprogramwithtexture);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(str, function1, useandconfigureprogramwithtexture);
        int i3 = onNavigationEvent + 105;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(useandconfigureprogramwithtexture);
        int i4 = onWarmupCompleted + 29;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ boolean onNavigationEvent(Function1 function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return ((Boolean) onExtraCallbackWithResult(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{function1}, -43441159, 43441162, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).booleanValue();
        }
        ((Boolean) onExtraCallbackWithResult(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{function1}, -43441159, 43441162, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).booleanValue();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        deleteProfile deleteprofile = (deleteProfile) objArr[2];
        NativeAdsDto.Creative.RightBanner rightBanner = (NativeAdsDto.Creative.RightBanner) objArr[3];
        onReceivedHttpError.IAuthTabCallback iAuthTabCallback = (onReceivedHttpError.IAuthTabCallback) objArr[4];
        Function1 function1 = (Function1) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int iIntValue2 = ((Number) objArr[7]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{quirksExternalSyntheticBackport0, Boolean.valueOf(zBooleanValue), deleteprofile, rightBanner, iAuthTabCallback, function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1)), Integer.valueOf(iIntValue2)}, -1278614798, 1278614799, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 59;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder(function1);
        }
        asBinder(function1);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, Function1 function1, String str, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, NativeAdsDto.Creative.RightBanner rightBanner, boolean z, boolean z2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 89;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, iAuthTabCallback, function1, str, onwarmupcompleted, rightBanner, z, z2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 91;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {useandconfigureprogramwithtexture};
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback3 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback4 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        if (i3 != 0) {
            throw null;
        }
        Unit unit = (Unit) onExtraCallbackWithResult(iOnExtraCallback, objArr, -857972178, 857972180, iOnExtraCallback4, iOnExtraCallback2, iOnExtraCallback3);
        int i4 = onNavigationEvent + 51;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(Function1 function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke((Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke((Object) null);
        return Boolean.valueOf(i3 != 0);
    }

    private static final Unit IAuthTabCallback(String str, final Function1 function1, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
        unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture, Role.Companion.onWarmupCompleted());
        unregisterOutputSurface.IAuthTabCallbackDefault(useandconfigureprogramwithtexture, "열기", new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsRightBannerKt$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 109;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                boolean zOnNavigationEvent = WebViewCompatExternalSyntheticLambda3.onNavigationEvent(function1);
                if (i4 == 0) {
                    return Boolean.valueOf(zOnNavigationEvent);
                }
                Boolean.valueOf(zOnNavigationEvent);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 79;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(Function1 function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("101");
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 11;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onTransact(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        int i3 = 99 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(Function1 function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("102");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 101;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onNavigationEvent + 31;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit asInterface(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 59;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asInterface(Function1 function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("202");
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 81;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asBinder(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 13;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, final Function1 function1, final String str, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, NativeAdsDto.Creative.RightBanner rightBanner, boolean z, boolean z2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        long jIsEngagementSignalsApiAvailable;
        long jLongValue;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i2;
        long jLongValue2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 3;
        onWarmupCompleted = i4 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i4 % 2 != 0 ? (i & 3) != 2 : (i & 5) != 5, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onNavigationEvent + 71;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2117181612, i, -1, "im.toss.ads_sdk.ui.compose.NativeAdsRightBanner.<anonymous> (NativeAdsRightBanner.kt:71)");
            }
            isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabledOnNavigationEvent = WebViewClientCompat.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 0);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(WebViewClientCompat.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), isqueryrefinementenabledOnNavigationEvent), iAuthTabCallback.onWarmupCompleted(), iAuthTabCallback.onExtraCallbackWithResult(), iAuthTabCallback.IAuthTabCallback(), iAuthTabCallback.onNavigationEvent());
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!zOnNavigationEvent) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsRightBannerKt$$ExternalSyntheticLambda3
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i7 = 2 % 2;
                        int i8 = onWarmupCompleted + 125;
                        onExtraCallbackWithResult = i8 % 128;
                        Object obj = null;
                        if (i8 % 2 != 0) {
                            WebViewCompatExternalSyntheticLambda3.onExtraCallbackWithResult(function1);
                            throw null;
                        }
                        Unit unitOnExtraCallbackWithResult = WebViewCompatExternalSyntheticLambda3.onExtraCallbackWithResult(function1);
                        int i9 = onWarmupCompleted + 101;
                        onExtraCallbackWithResult = i9 % 128;
                        if (i9 % 2 == 0) {
                            return unitOnExtraCallbackWithResult;
                        }
                        obj.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted, isqueryrefinementenabledOnNavigationEvent, (Function0) objOnMinimized);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnNavigationEvent2 | zOnNavigationEvent3) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsRightBannerKt$$ExternalSyntheticLambda4
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i7 = 2 % 2;
                        int i8 = onExtraCallback + 99;
                        onWarmupCompleted = i8 % 128;
                        Object obj2 = null;
                        if (i8 % 2 != 0) {
                            WebViewCompatExternalSyntheticLambda3.onNavigationEvent(str, function1, (useAndConfigureProgramWithTexture) obj);
                            obj2.hashCode();
                            throw null;
                        }
                        Unit unitOnNavigationEvent = WebViewCompatExternalSyntheticLambda3.onNavigationEvent(str, function1, (useAndConfigureProgramWithTexture) obj);
                        int i9 = onExtraCallback + 47;
                        onWarmupCompleted = i9 % 128;
                        if (i9 % 2 == 0) {
                            return unitOnNavigationEvent;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = getExtensionsBeforeInitialized.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback, true, (Function1) objOnMinimized2);
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback2);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(RowScope.onNavigationEvent(rowScopeInstance, onextracallback, 1.0f, false, 2, (Object) null), 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, 11, (Object) null);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized3 == onwarmupcompleted2.onExtraCallback()) {
                objOnMinimized3 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsRightBannerKt$$ExternalSyntheticLambda5
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i7 = 2 % 2;
                        int i8 = onNavigationEvent + 21;
                        IAuthTabCallback = i8 % 128;
                        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj;
                        if (i8 % 2 != 0) {
                            WebViewCompatExternalSyntheticLambda3.onNavigationEvent(useandconfigureprogramwithtexture);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        Unit unitOnNavigationEvent = WebViewCompatExternalSyntheticLambda3.onNavigationEvent(useandconfigureprogramwithtexture);
                        int i9 = IAuthTabCallback + 13;
                        onNavigationEvent = i9 % 128;
                        if (i9 % 2 == 0) {
                            int i10 = 18 / 0;
                        }
                        return unitOnNavigationEvent;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized3);
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult2 = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult2.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted3);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent4) {
                int i7 = onNavigationEvent + 77;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                if (objOnMinimized4 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized4 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsRightBannerKt$$ExternalSyntheticLambda6
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            Unit unitOnExtraCallback;
                            int i9 = 2 % 2;
                            int i10 = onWarmupCompleted + 53;
                            onExtraCallbackWithResult = i10 % 128;
                            if (i10 % 2 == 0) {
                                unitOnExtraCallback = WebViewCompatExternalSyntheticLambda3.onExtraCallback(function1);
                                int i11 = 85 / 0;
                            } else {
                                unitOnExtraCallback = WebViewCompatExternalSyntheticLambda3.onExtraCallback(function1);
                            }
                            int i12 = onWarmupCompleted + 65;
                            onExtraCallbackWithResult = i12 % 128;
                            int i13 = i12 % 2;
                            return unitOnExtraCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback3 = WebViewClientCompat.IAuthTabCallback(onextracallback, isqueryrefinementenabledOnNavigationEvent, (Function0) objOnMinimized4);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized5 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized5 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsRightBannerKt$$ExternalSyntheticLambda7
                        private static int onExtraCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj) {
                            int i9 = 2 % 2;
                            int i10 = onNavigationEvent + 47;
                            onExtraCallback = i10 % 128;
                            int i11 = i10 % 2;
                            Unit unitOnExtraCallbackWithResult = WebViewCompatExternalSyntheticLambda3.onExtraCallbackWithResult((useAndConfigureProgramWithTexture) obj);
                            int i12 = onNavigationEvent + 95;
                            onExtraCallback = i12 % 128;
                            int i13 = i12 % 2;
                            return unitOnExtraCallbackWithResult;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback3, (Function1) objOnMinimized5);
                String strAsInterface = rightBanner.asInterface();
                ConnectionPool connectionPool = ConnectionPool.onWarmupCompleted;
                handshake.onNavigationEvent onNavigationEvent2 = connectionPool.onNavigationEvent();
                GraphicDeviceInfo.IAuthTabCallback iAuthTabCallback2 = GraphicDeviceInfo.Companion;
                GraphicDeviceInfo graphicDeviceInfoIAuthTabCallback = iAuthTabCallback2.IAuthTabCallback();
                if (z) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-456592611);
                    jIsEngagementSignalsApiAvailable = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IPostMessageService_Parcel();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-456591527);
                    jIsEngagementSignalsApiAvailable = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strAsInterface, quirksExternalSyntheticBackport0OnWarmupCompleted5, null, Long.valueOf(jIsEngagementSignalsApiAvailable), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17)), 0L, onNavigationEvent2, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoIAuthTabCallback, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 196608, 98212}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), 0.0f, 0.0f, 13, (Object) null);
                boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent5) {
                    int i9 = onWarmupCompleted + 115;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    if (objOnMinimized6 == onwarmupcompleted2.onExtraCallback()) {
                        objOnMinimized6 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsRightBannerKt$$ExternalSyntheticLambda8
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            public final Object invoke() {
                                int i11 = 2 % 2;
                                int i12 = IAuthTabCallback + 63;
                                onExtraCallbackWithResult = i12 % 128;
                                if (i12 % 2 == 0) {
                                    WebViewCompatExternalSyntheticLambda3.onWarmupCompleted(function1);
                                    Object obj = null;
                                    obj.hashCode();
                                    throw null;
                                }
                                Unit unitOnWarmupCompleted = WebViewCompatExternalSyntheticLambda3.onWarmupCompleted(function1);
                                int i13 = onExtraCallbackWithResult + 119;
                                IAuthTabCallback = i13 % 128;
                                int i14 = i13 % 2;
                                return unitOnWarmupCompleted;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback4 = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback2, isqueryrefinementenabledOnNavigationEvent, (Function0) objOnMinimized6);
                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized7 == onwarmupcompleted2.onExtraCallback()) {
                        objOnMinimized7 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsRightBannerKt$$ExternalSyntheticLambda9
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            public final Object invoke(Object obj) {
                                int i11 = 2 % 2;
                                int i12 = IAuthTabCallback + 47;
                                onExtraCallbackWithResult = i12 % 128;
                                useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj;
                                if (i12 % 2 != 0) {
                                    return WebViewCompatExternalSyntheticLambda3.onWarmupCompleted(useandconfigureprogramwithtexture);
                                }
                                WebViewCompatExternalSyntheticLambda3.onWarmupCompleted(useandconfigureprogramwithtexture);
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized7);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted6 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback4, (Function1) objOnMinimized7);
                    String strIAuthTabCallbackStub = rightBanner.IAuthTabCallbackStub();
                    if (z2) {
                        strIAuthTabCallbackStub = strIAuthTabCallbackStub + " ・ AD";
                    }
                    handshake.onNavigationEvent onNavigationEvent3 = connectionPool.onNavigationEvent();
                    GraphicDeviceInfo graphicDeviceInfoOnNavigationEvent = iAuthTabCallback2.onNavigationEvent();
                    if (z) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-456571513);
                        jLongValue = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ITrustedWebActivityCallback_Parcel();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-456570119);
                        jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                    }
                    long j = jLongValue;
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strIAuthTabCallbackStub, quirksExternalSyntheticBackport0OnWarmupCompleted6, null, Long.valueOf(j), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13)), 0L, onNavigationEvent3, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoOnNavigationEvent, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 196608, 98212}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    String strIAuthTabCallbackDefault = rightBanner.IAuthTabCallbackDefault();
                    if (strIAuthTabCallbackDefault == null || StringsKt.isBlank(strIAuthTabCallbackDefault)) {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1268176816);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1268615590);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 0.0f, 0.0f, 13, (Object) null);
                        Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (objOnMinimized8 == onwarmupcompleted2.onExtraCallback()) {
                            objOnMinimized8 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsRightBannerKt$$ExternalSyntheticLambda10
                                private static int onExtraCallbackWithResult = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj) {
                                    int i11 = 2 % 2;
                                    int i12 = onExtraCallbackWithResult + 9;
                                    onWarmupCompleted = i12 % 128;
                                    int i13 = i12 % 2;
                                    Unit unitIAuthTabCallback = WebViewCompatExternalSyntheticLambda3.IAuthTabCallback((useAndConfigureProgramWithTexture) obj);
                                    if (i13 == 0) {
                                        int i14 = 17 / 0;
                                    }
                                    int i15 = onExtraCallbackWithResult + 43;
                                    onWarmupCompleted = i15 % 128;
                                    if (i15 % 2 == 0) {
                                        int i16 = 63 / 0;
                                    }
                                    return unitIAuthTabCallback;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized8);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted7 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback3, (Function1) objOnMinimized8);
                        String strIAuthTabCallbackDefault2 = rightBanner.IAuthTabCallbackDefault();
                        if (z) {
                            int i11 = onWarmupCompleted + 93;
                            onNavigationEvent = i11 % 128;
                            int i12 = i11 % 2;
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-456556633);
                            i2 = 6;
                            jLongValue2 = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).areNotificationsEnabled();
                            int i13 = onNavigationEvent + 107;
                            onWarmupCompleted = i13 % 128;
                            int i14 = i13 % 2;
                        } else {
                            i2 = 6;
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-456555239);
                            jLongValue2 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -1444009137, OverseasRrnInputTextField.IAuthTabCallback(), 1444009151)).longValue();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strIAuthTabCallbackDefault2, quirksExternalSyntheticBackport0OnWarmupCompleted7, null, Long.valueOf(jLongValue2), Long.valueOf(rightBanner.IAuthTabCallbackDefault().length() > 60 ? RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(i2) : RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(8)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131044}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (StringsKt.isBlank(rightBanner.asBinder())) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2113486950);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-2114564231);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = setExtensionStrength.onExtraCallbackWithResult(ensureNavButtonView.onExtraCallback(verifyDrawable.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(36.0f)), z ? setByteOrder.Companion.asBinder() : ByteOrderedDataOutputStream.onExtraCallback(218243143), AppLovinRtbRewardedRenderer.onWarmupCompleted()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.5f), ByteOrderedDataOutputStream.onExtraCallback(z ? 484039167 : 218243143), AppLovinRtbRewardedRenderer.onWarmupCompleted()), AppLovinRtbRewardedRenderer.onWarmupCompleted());
                        boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(function1);
                        Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!(!zOnNavigationEvent6) || objOnMinimized9 == onwarmupcompleted2.onExtraCallback()) {
                            objOnMinimized9 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsRightBannerKt$$ExternalSyntheticLambda11
                                private static int onNavigationEvent = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke() {
                                    int i15 = 2 % 2;
                                    int i16 = onNavigationEvent + 61;
                                    onWarmupCompleted = i16 % 128;
                                    int i17 = i16 % 2;
                                    Unit unitIAuthTabCallback = WebViewCompatExternalSyntheticLambda3.IAuthTabCallback(function1);
                                    int i18 = onWarmupCompleted + 63;
                                    onNavigationEvent = i18 % 128;
                                    int i19 = i18 % 2;
                                    return unitIAuthTabCallback;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized9);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback5 = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, isqueryrefinementenabledOnNavigationEvent, (Function0) objOnMinimized9);
                        Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (objOnMinimized10 == onwarmupcompleted2.onExtraCallback()) {
                            objOnMinimized10 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsRightBannerKt$$ExternalSyntheticLambda12
                                private static int IAuthTabCallback = 1;
                                private static int onNavigationEvent;

                                public final Object invoke(Object obj) {
                                    int i15 = 2 % 2;
                                    int i16 = onNavigationEvent + 71;
                                    IAuthTabCallback = i16 % 128;
                                    int i17 = i16 % 2;
                                    Unit unitOnExtraCallback = WebViewCompatExternalSyntheticLambda3.onExtraCallback((useAndConfigureProgramWithTexture) obj);
                                    int i18 = IAuthTabCallback + 75;
                                    onNavigationEvent = i18 % 128;
                                    int i19 = i18 % 2;
                                    return unitOnExtraCallback;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized10);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted8 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback5, (Function1) objOnMinimized10);
                        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.onExtraCallback(), false);
                        int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted9 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnWarmupCompleted8);
                        Function0 function0IAuthTabCallback3 = onextracallbackwithresult.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                            int i15 = onNavigationEvent + 69;
                            onWarmupCompleted = i15 % 128;
                            int i16 = i15 % 2;
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback3);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted9, onextracallbackwithresult.onTransact());
                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                        String strAsBinder = rightBanner.asBinder();
                        AppLovinFullscreenImmersiveActivity appLovinFullscreenImmersiveActivityIAuthTabCallback = showAndRender.IAuthTabCallback();
                        AccessibilityUtilKtExternalSyntheticLambda1.IAuthTabCallback(strAsBinder, (String) null, setAdVideoPlaybackListener.onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallback), "AsyncImage", strAsBinder, appLovinFullscreenImmersiveActivityIAuthTabCallback), (Function1) null, showAndRender.IAuthTabCallback(appLovinFullscreenImmersiveActivityIAuthTabCallback, (Function1) null), (QuirkSettingsLoader) null, immediateFailedFuture.Companion.IAuthTabCallback(), 0.0f, (seek) null, 0, false, cameraCaptureResultEmptyCameraCaptureResult, 1572912, 0, 1960);
                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007d A[PHI: r6 r7
      0x007d: PHI (r6v22 o.CameraCaptureResultEmptyCameraCaptureResult) = (r6v2 o.CameraCaptureResultEmptyCameraCaptureResult), (r6v23 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0077, B:5:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r7v27 int) = (r7v10 int), (r7v28 int) binds: [B:8:0x0077, B:5:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0079 A[PHI: r6 r7
      0x0079: PHI (r6v3 o.CameraCaptureResultEmptyCameraCaptureResult) = (r6v2 o.CameraCaptureResultEmptyCameraCaptureResult), (r6v23 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0077, B:5:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r7v11 int) = (r7v10 int), (r7v28 int) binds: [B:8:0x0077, B:5:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i;
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3;
        Function1 function1;
        onReceivedHttpError.IAuthTabCallback iAuthTabCallback;
        final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        float f;
        String strIAuthTabCallbackStub;
        Configuration configuration;
        int i4;
        int i5;
        int i6;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = (QuirksExternalSyntheticBackport0) objArr[0];
        final boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        final deleteProfile deleteprofile = (deleteProfile) objArr[2];
        final NativeAdsDto.Creative.RightBanner rightBanner = (NativeAdsDto.Creative.RightBanner) objArr[3];
        final onReceivedHttpError.IAuthTabCallback iAuthTabCallback2 = (onReceivedHttpError.IAuthTabCallback) objArr[4];
        final Function1 function12 = (Function1) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        final int iIntValue2 = ((Number) objArr[8]).intValue();
        int i7 = 2 % 2;
        int i8 = onNavigationEvent + 41;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            Intrinsics.checkNotNullParameter(deleteprofile, "");
            Intrinsics.checkNotNullParameter(rightBanner, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback2, "");
            Intrinsics.checkNotNullParameter(function12, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(1646566764);
            i = iIntValue2 & 1;
            if (i != 0) {
                i2 = iIntValue | 6;
            } else if ((iIntValue & 6) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2) ? 4 : 2) | iIntValue;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i2 = iIntValue;
            }
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        } else {
            Intrinsics.checkNotNullParameter(deleteprofile, "");
            Intrinsics.checkNotNullParameter(rightBanner, "");
            Intrinsics.checkNotNullParameter(iAuthTabCallback2, "");
            Intrinsics.checkNotNullParameter(function12, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(1646566764);
            i = iIntValue2 & 1;
            if (i != 0) {
            }
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        }
        if ((iIntValue & 48) == 0) {
            int i9 = onWarmupCompleted + 67;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            i2 |= cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(zBooleanValue) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(deleteprofile.ordinal())) {
                int i11 = onNavigationEvent + 33;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((iIntValue & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightBanner)) {
                int i13 = onNavigationEvent + 71;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((iIntValue & 24576) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iAuthTabCallback2) ? 16384 : 8192;
        }
        if ((196608 & iIntValue) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(function12)) {
                int i15 = onWarmupCompleted + 91;
                onNavigationEvent = i15 % 128;
                int i16 = i15 % 2;
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        Object obj = null;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((74899 & i2) != 74898, i2 & 1)) {
            int i17 = onNavigationEvent + 21;
            onWarmupCompleted = i17 % 128;
            if (i17 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (i != 0) {
                onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1646566764, i2, -1, "im.toss.ads_sdk.ui.compose.NativeAdsRightBanner (NativeAdsRightBanner.kt:52)");
            }
            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            final boolean zOnExtraCallbackWithResult = getStrokeWidth.onExtraCallback.onExtraCallbackWithResult(deleteprofile, cameraCaptureResultEmptyCameraCaptureResult, ((i2 >> 6) & 14) | 48);
            float fMin = Math.min(context.getApplicationContext().getResources().getConfiguration().fontScale, 1.6f);
            Resources resources = context.getResources();
            if (resources == null || (configuration = resources.getConfiguration()) == null) {
                f = 1.0f;
            } else {
                int i18 = onWarmupCompleted + 111;
                onNavigationEvent = i18 % 128;
                if (i18 % 2 != 0) {
                    f = configuration.fontScale;
                    int i19 = 48 / 0;
                } else {
                    f = configuration.fontScale;
                }
            }
            QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedAccess000 = f > 1.35f ? QuirkSettingsLoader.Companion.access000() : QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
            StringBuilder sb = new StringBuilder();
            sb.append(rightBanner.asInterface());
            sb.append(" ");
            if (zBooleanValue) {
                strIAuthTabCallbackStub = rightBanner.IAuthTabCallbackStub() + " ・ AD";
            } else {
                strIAuthTabCallbackStub = rightBanner.IAuthTabCallbackStub();
            }
            sb.append(strIAuthTabCallbackStub);
            if (rightBanner.IAuthTabCallbackDefault() != null && (!StringsKt.isBlank(r7))) {
                sb.append(" ");
                sb.append(rightBanner.IAuthTabCallbackDefault());
            }
            final String string = sb.toString();
            final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = onextracallback2;
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback4 = onextracallback2;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
            final QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted = onwarmupcompletedAccess000;
            i3 = iIntValue;
            function1 = function12;
            iAuthTabCallback = iAuthTabCallback2;
            setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(), fMin)), ForwardingCameraControl.onExtraCallback(2117181612, true, new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsRightBannerKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    Unit unitOnWarmupCompleted;
                    int i20 = 2 % 2;
                    int i21 = onWarmupCompleted + 19;
                    IAuthTabCallback = i21 % 128;
                    if (i21 % 2 != 0) {
                        unitOnWarmupCompleted = WebViewCompatExternalSyntheticLambda3.onWarmupCompleted(onextracallback3, iAuthTabCallback2, function12, string, onwarmupcompleted, rightBanner, zOnExtraCallbackWithResult, zBooleanValue, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i22 = 68 / 0;
                    } else {
                        unitOnWarmupCompleted = WebViewCompatExternalSyntheticLambda3.onWarmupCompleted(onextracallback3, iAuthTabCallback2, function12, string, onwarmupcompleted, rightBanner, zOnExtraCallbackWithResult, zBooleanValue, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    int i23 = onWarmupCompleted + 5;
                    IAuthTabCallback = i23 % 128;
                    if (i23 % 2 == 0) {
                        return unitOnWarmupCompleted;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i20 = onWarmupCompleted + 105;
                onNavigationEvent = i20 % 128;
                if (i20 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            onextracallback = onextracallback4;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
            i3 = iIntValue;
            function1 = function12;
            iAuthTabCallback = iAuthTabCallback2;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            onextracallback = onextracallback2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final onReceivedHttpError.IAuthTabCallback iAuthTabCallback3 = iAuthTabCallback;
            final Function1 function13 = function1;
            final int i21 = i3;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsRightBannerKt$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) {
                    int i22 = 2 % 2;
                    int i23 = IAuthTabCallback + 83;
                    onWarmupCompleted = i23 % 128;
                    int i24 = i23 % 2;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = onextracallback;
                    boolean z = zBooleanValue;
                    deleteProfile deleteprofile2 = deleteprofile;
                    NativeAdsDto.Creative.RightBanner rightBanner2 = rightBanner;
                    onReceivedHttpError.IAuthTabCallback iAuthTabCallback4 = iAuthTabCallback3;
                    Function1 function14 = function13;
                    int i25 = i21;
                    int i26 = iIntValue2;
                    int iIntValue3 = ((Integer) obj3).intValue();
                    Object[] objArr2 = {quirksExternalSyntheticBackport0, Boolean.valueOf(z), deleteprofile2, rightBanner2, iAuthTabCallback4, function14, Integer.valueOf(i25), Integer.valueOf(i26), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue3)};
                    Unit unit = (Unit) WebViewCompatExternalSyntheticLambda3.onExtraCallbackWithResult(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), objArr2, 1857497374, -1857497370, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
                    int i27 = onWarmupCompleted + 35;
                    IAuthTabCallback = i27 % 128;
                    int i28 = i27 % 2;
                    return unit;
                }
            });
        }
        return null;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, deleteProfile deleteprofile, NativeAdsDto.Creative.RightBanner rightBanner, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Boolean.valueOf(z), deleteprofile, rightBanner, iAuthTabCallback, function1, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onExtraCallbackWithResult(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), objArr, 1857497374, -1857497370, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
    }

    public static final void onExtraCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, @NotNull deleteProfile deleteprofile, @NotNull NativeAdsDto.Creative.RightBanner rightBanner, @NotNull onReceivedHttpError.IAuthTabCallback iAuthTabCallback, @NotNull Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Boolean.valueOf(z), deleteprofile, rightBanner, iAuthTabCallback, function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        onExtraCallbackWithResult(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), objArr, -1278614798, 1278614799, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
    }

    private static final boolean onTransact(Function1 function1) {
        return ((Boolean) onExtraCallbackWithResult(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{function1}, -43441159, 43441162, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback())).booleanValue();
    }

    private static final Unit IAuthTabCallbackStub(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        return (Unit) onExtraCallbackWithResult(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{useandconfigureprogramwithtexture}, -857972178, 857972180, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, deleteProfile deleteprofile, NativeAdsDto.Creative.RightBanner rightBanner, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Boolean.valueOf(z), deleteprofile, rightBanner, iAuthTabCallback, function1, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onExtraCallbackWithResult(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), objArr, 16420727, -16420727, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback());
    }
}
