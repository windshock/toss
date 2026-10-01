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
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
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
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.addRearDisplayPresentationStatusListener;
import o.handshake;
import o.onReceivedHttpError;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addRearDisplayPresentationStatusListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
            return (Unit) onExtraCallback(-915928639, new Object[]{function1}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 915928639);
        }
        int iOnNavigationEvent2 = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return asBinder(useandconfigureprogramwithtexture);
        }
        asBinder(useandconfigureprogramwithtexture);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~(i | i5);
        int i8 = ~i;
        int i9 = ~i5;
        int i10 = i8 | i9;
        int i11 = i7 | (~(i10 | i6));
        int i12 = i9 | i;
        int i13 = (~i10) | i6;
        int i14 = i6 + i + i2 + ((-1587644119) * i4) + (1302866265 * i3);
        int i15 = i14 * i14;
        int i16 = (i6 * (-1579585154)) + 1163788288 + ((-1579585154) * i) + ((-914001539) * i11) + (i12 * 914001539) + (914001539 * i13) + ((-665583616) * i2) + (1500774400 * i4) + ((-1456209920) * i3) + ((-2144468992) * i15);
        int i17 = ((i6 * (-855313886)) - 1253577507) + (i * (-855313886)) + (i11 * (-13)) + (i12 * 13) + (i13 * 13) + (i2 * (-855313873)) + (i4 * (-1467678585)) + (i3 * 593082711) + (i15 * 74579968);
        int i18 = i16 + (i17 * i17 * (-1668153344));
        if (i18 == 1) {
            return onExtraCallback(objArr);
        }
        if (i18 == 2) {
            return onWarmupCompleted(objArr);
        }
        if (i18 == 3) {
            return IAuthTabCallback(objArr);
        }
        if (i18 != 4) {
            return onNavigationEvent(objArr);
        }
        Function1 function1 = (Function1) objArr[0];
        int i19 = 2 % 2;
        int i20 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i20 % 128;
        int i21 = i20 % 2;
        Unit unitAsInterface = asInterface(function1);
        int i22 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i22 % 128;
        int i23 = i22 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        Unit unit = (Unit) onExtraCallback(1018520455, new Object[]{useandconfigureprogramwithtexture}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, -1018520454);
        int i4 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(function1);
        int i4 = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackDefault(useandconfigureprogramwithtexture);
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(useandconfigureprogramwithtexture);
        int i3 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, Function1 function1, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, function1, useandconfigureprogramwithtexture);
        int i4 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, Function1 function1, String str, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, NativeAdsDto.Creative.RightBanner rightBanner, boolean z, boolean z2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, iAuthTabCallback, function1, str, onwarmupcompleted, rightBanner, z, z2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, deleteProfile deleteprofile, NativeAdsDto.Creative.RightBanner rightBanner, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(quirksExternalSyntheticBackport0, z, deleteprofile, rightBanner, iAuthTabCallback, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 23 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onTransact(useandconfigureprogramwithtexture);
        }
        onTransact(useandconfigureprogramwithtexture);
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallbackStub = IAuthTabCallbackStub(function1);
        if (i3 == 0) {
            int i4 = 99 / 0;
        }
        int i5 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return Boolean.valueOf(zIAuthTabCallbackStub);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(function1);
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, deleteProfile deleteprofile, NativeAdsDto.Creative.RightBanner rightBanner, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, z, deleteprofile, rightBanner, iAuthTabCallback, function1, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            asInterface(useandconfigureprogramwithtexture);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAsInterface = asInterface(useandconfigureprogramwithtexture);
        int i3 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitAsInterface;
    }

    private static final Unit onTransact(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke((Object) null);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        int i5 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
        return unit;
    }

    private static final boolean IAuthTabCallbackStub(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        function1.invoke((Object) null);
        int i4 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(String str, final Function1 function1, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
        unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture, Role.Companion.onWarmupCompleted());
        unregisterOutputSurface.IAuthTabCallbackDefault(useandconfigureprogramwithtexture, "열기", new Function0() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsRightBannerV2Kt$$ExternalSyntheticLambda10
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 43;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr = {function1};
                int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                Boolean boolValueOf = Boolean.valueOf(((Boolean) addRearDisplayPresentationStatusListener.onExtraCallback(343699435, objArr, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, -343699433)).booleanValue());
                int i5 = onWarmupCompleted + 73;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return boolValueOf;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i2 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 84 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("1001");
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asBinder(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit asInterface(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("1002");
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        return unit;
    }

    private static final Unit onTransact(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackDefault(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("2505");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asInterface(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x051e  */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v71 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, final Function1 function1, final String str, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, NativeAdsDto.Creative.RightBanner rightBanner, boolean z, boolean z2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object objOnMinimized;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2;
        boolean zOnNavigationEvent;
        Object objOnMinimized2;
        Object objOnMinimized3;
        long jLongValue;
        boolean zOnNavigationEvent2;
        Object objOnMinimized4;
        Object objOnMinimized5;
        long jLongValue2;
        String strIAuthTabCallbackDefault;
        int i2;
        ?? r3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3;
        long jMayLaunchUrl;
        long jMayLaunchUrl2;
        int i4;
        long jLongValue3;
        long jOnExtraCallback;
        int i5 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-429189642, i, -1, "im.toss.ads_sdk.ui.v2.compose.NativeAdsRightBannerV2.<anonymous> (NativeAdsRightBannerV2.kt:73)");
            }
            isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabledOnNavigationEvent = WebViewClientCompat.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 0);
            Object obj = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(WebViewClientCompat.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), isqueryrefinementenabledOnNavigationEvent), iAuthTabCallback.onWarmupCompleted(), iAuthTabCallback.onExtraCallbackWithResult(), iAuthTabCallback.IAuthTabCallback(), iAuthTabCallback.onNavigationEvent());
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent3) {
                int i6 = IAuthTabCallback + 13;
                onExtraCallbackWithResult = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized6 = new Function0() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsRightBannerV2Kt$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallback;

                        public final Object invoke() {
                            int i7 = 2 % 2;
                            int i8 = onExtraCallback + 83;
                            IAuthTabCallback = i8 % 128;
                            int i9 = i8 % 2;
                            Unit unitOnWarmupCompleted = addRearDisplayPresentationStatusListener.onWarmupCompleted(function1);
                            int i10 = onExtraCallback + 59;
                            IAuthTabCallback = i10 % 128;
                            int i11 = i10 % 2;
                            return unitOnWarmupCompleted;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted, isqueryrefinementenabledOnNavigationEvent, (Function0) objOnMinimized6);
                boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(!(zOnNavigationEvent4 | zOnNavigationEvent5))) {
                    objOnMinimized7 = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsRightBannerV2Kt$$ExternalSyntheticLambda1
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj2) {
                            Unit unitOnNavigationEvent;
                            int i7 = 2 % 2;
                            int i8 = onNavigationEvent + 55;
                            onExtraCallbackWithResult = i8 % 128;
                            if (i8 % 2 == 0) {
                                unitOnNavigationEvent = addRearDisplayPresentationStatusListener.onNavigationEvent(str, function1, (useAndConfigureProgramWithTexture) obj2);
                                int i9 = 91 / 0;
                            } else {
                                unitOnNavigationEvent = addRearDisplayPresentationStatusListener.onNavigationEvent(str, function1, (useAndConfigureProgramWithTexture) obj2);
                            }
                            int i10 = onNavigationEvent + 11;
                            onExtraCallbackWithResult = i10 % 128;
                            if (i10 % 2 != 0) {
                                return unitOnNavigationEvent;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized7);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = getExtensionsBeforeInitialized.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback, true, (Function1) objOnMinimized7);
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
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
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
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized == onwarmupcompleted2.onExtraCallback()) {
                        objOnMinimized = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsRightBannerV2Kt$$ExternalSyntheticLambda2
                            private static int IAuthTabCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj2) {
                                int i7 = 2 % 2;
                                int i8 = onWarmupCompleted + 109;
                                IAuthTabCallback = i8 % 128;
                                int i9 = i8 % 2;
                                Unit unitOnExtraCallback = addRearDisplayPresentationStatusListener.onExtraCallback((useAndConfigureProgramWithTexture) obj2);
                                int i10 = IAuthTabCallback + 103;
                                onWarmupCompleted = i10 % 128;
                                if (i10 % 2 != 0) {
                                    return unitOnExtraCallback;
                                }
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized);
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
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult.onTransact());
                    LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnNavigationEvent || objOnMinimized2 == onwarmupcompleted2.onExtraCallback()) {
                        objOnMinimized2 = new Function0() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsRightBannerV2Kt$$ExternalSyntheticLambda3
                            private static int onExtraCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke() {
                                int i7 = 2 % 2;
                                int i8 = onExtraCallback + 51;
                                onWarmupCompleted = i8 % 128;
                                int i9 = i8 % 2;
                                Object[] objArr = {function1};
                                int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                                Unit unit = (Unit) addRearDisplayPresentationStatusListener.onExtraCallback(753647533, objArr, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, -753647530);
                                int i10 = onExtraCallback + 125;
                                onWarmupCompleted = i10 % 128;
                                int i11 = i10 % 2;
                                return unit;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback3 = WebViewClientCompat.IAuthTabCallback(onextracallback, isqueryrefinementenabledOnNavigationEvent, (Function0) objOnMinimized2);
                    objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized3 == onwarmupcompleted2.onExtraCallback()) {
                        objOnMinimized3 = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsRightBannerV2Kt$$ExternalSyntheticLambda4
                            private static int IAuthTabCallback = 1;
                            private static int onExtraCallback;

                            public final Object invoke(Object obj2) {
                                int i7 = 2 % 2;
                                int i8 = onExtraCallback + 89;
                                IAuthTabCallback = i8 % 128;
                                useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj2;
                                if (i8 % 2 == 0) {
                                    addRearDisplayPresentationStatusListener.IAuthTabCallback(useandconfigureprogramwithtexture);
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                                Unit unitIAuthTabCallback = addRearDisplayPresentationStatusListener.IAuthTabCallback(useandconfigureprogramwithtexture);
                                int i9 = IAuthTabCallback + 103;
                                onExtraCallback = i9 % 128;
                                int i10 = i9 % 2;
                                return unitIAuthTabCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback3, (Function1) objOnMinimized3);
                    String strAsInterface = rightBanner.asInterface();
                    ConnectionPool connectionPool = ConnectionPool.onWarmupCompleted;
                    handshake.onNavigationEvent onNavigationEvent = connectionPool.onNavigationEvent();
                    if (z) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(768048535);
                        jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
                    } else {
                        int i7 = onExtraCallbackWithResult + 25;
                        IAuthTabCallback = i7 % 128;
                        int i8 = i7 % 2;
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(768047451);
                        jLongValue = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).IPostMessageService_Parcel();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strAsInterface, quirksExternalSyntheticBackport0OnWarmupCompleted5, null, Long.valueOf(jLongValue), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17)), 0L, onNavigationEvent, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 0, 130980}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), 0.0f, 0.0f, 13, (Object) null);
                    zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                    objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnNavigationEvent2 || objOnMinimized4 == onwarmupcompleted2.onExtraCallback()) {
                        objOnMinimized4 = new Function0() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsRightBannerV2Kt$$ExternalSyntheticLambda5
                            private static int onExtraCallback = 1;
                            private static int onExtraCallbackWithResult;

                            public final Object invoke() {
                                int i9 = 2 % 2;
                                int i10 = onExtraCallback + 71;
                                onExtraCallbackWithResult = i10 % 128;
                                int i11 = i10 % 2;
                                Object[] objArr = {function1};
                                int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                                Unit unit = (Unit) addRearDisplayPresentationStatusListener.onExtraCallback(-1902795273, objArr, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1902795277);
                                int i12 = onExtraCallbackWithResult + 21;
                                onExtraCallback = i12 % 128;
                                if (i12 % 2 == 0) {
                                    int i13 = 96 / 0;
                                }
                                return unit;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback4 = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback2, isqueryrefinementenabledOnNavigationEvent, (Function0) objOnMinimized4);
                    objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized5 == onwarmupcompleted2.onExtraCallback()) {
                        objOnMinimized5 = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsRightBannerV2Kt$$ExternalSyntheticLambda6
                            private static int IAuthTabCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj2) {
                                int i9 = 2 % 2;
                                int i10 = IAuthTabCallback + 53;
                                onWarmupCompleted = i10 % 128;
                                int i11 = i10 % 2;
                                Unit unitOnNavigationEvent = addRearDisplayPresentationStatusListener.onNavigationEvent((useAndConfigureProgramWithTexture) obj2);
                                int i12 = onWarmupCompleted + 47;
                                IAuthTabCallback = i12 % 128;
                                if (i12 % 2 == 0) {
                                    return unitOnNavigationEvent;
                                }
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted6 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback4, (Function1) objOnMinimized5);
                    String strIAuthTabCallbackStub = rightBanner.IAuthTabCallbackStub();
                    if (z2) {
                        strIAuthTabCallbackStub = strIAuthTabCallbackStub + " ・ AD";
                    }
                    handshake.onNavigationEvent onNavigationEvent2 = connectionPool.onNavigationEvent();
                    if (z) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(768068343);
                        jLongValue2 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(768066949);
                        jLongValue2 = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ITrustedWebActivityCallback_Parcel();
                    }
                    long j = jLongValue2;
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strIAuthTabCallbackStub, quirksExternalSyntheticBackport0OnWarmupCompleted6, null, Long.valueOf(j), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13)), 0L, onNavigationEvent2, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 0, 130980}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    strIAuthTabCallbackDefault = rightBanner.IAuthTabCallbackDefault();
                    if (strIAuthTabCallbackDefault != null || StringsKt.isBlank(strIAuthTabCallbackDefault)) {
                        i2 = onExtraCallbackWithResult + 57;
                        IAuthTabCallback = i2 % 128;
                        if (i2 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1959090158);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            r3 = 0;
                            int i9 = 30 / 0;
                        } else {
                            r3 = 0;
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1959090158);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1959528932);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 0.0f, 0.0f, 13, (Object) null);
                        Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (objOnMinimized8 == onwarmupcompleted2.onExtraCallback()) {
                            objOnMinimized8 = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsRightBannerV2Kt$$ExternalSyntheticLambda7
                                private static int onExtraCallback = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj2) {
                                    int i10 = 2 % 2;
                                    int i11 = onWarmupCompleted + 59;
                                    onExtraCallback = i11 % 128;
                                    int i12 = i11 % 2;
                                    Unit unitOnExtraCallbackWithResult = addRearDisplayPresentationStatusListener.onExtraCallbackWithResult((useAndConfigureProgramWithTexture) obj2);
                                    if (i12 == 0) {
                                        int i13 = 58 / 0;
                                    }
                                    return unitOnExtraCallbackWithResult;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized8);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted7 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback3, (Function1) objOnMinimized8);
                        String strIAuthTabCallbackDefault2 = rightBanner.IAuthTabCallbackDefault();
                        if (z) {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(768081829);
                            i4 = 6;
                            jLongValue3 = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).areNotificationsEnabled();
                        } else {
                            i4 = 6;
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(768083223);
                            jLongValue3 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -1444009137, OverseasRrnInputTextField.IAuthTabCallback(), 1444009151)).longValue();
                        }
                        long j2 = jLongValue3;
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        if (rightBanner.IAuthTabCallbackDefault().length() > 60) {
                            int i10 = IAuthTabCallback + 61;
                            onExtraCallbackWithResult = i10 % 128;
                            jOnExtraCallback = i10 % 2 != 0 ? RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(110) : RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(i4);
                        } else {
                            jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(8);
                        }
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strIAuthTabCallbackDefault2, quirksExternalSyntheticBackport0OnWarmupCompleted7, null, Long.valueOf(j2), Long.valueOf(jOnExtraCallback), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131044}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        r3 = 0;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (StringsKt.isBlank(rightBanner.asBinder())) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1269885863);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(36.0f));
                        if (z) {
                            int i11 = IAuthTabCallback + 29;
                            onExtraCallbackWithResult = i11 % 128;
                            int i12 = i11 % 2;
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1205967375);
                            i3 = 6;
                            jMayLaunchUrl = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).ITrustedWebActivityCallbackStub();
                        } else {
                            i3 = 6;
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1205968776);
                            jMayLaunchUrl = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).mayLaunchUrl();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallbackDefault, jMayLaunchUrl, AppLovinRtbRewardedRenderer.onWarmupCompleted());
                        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.5f);
                        if (z) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1205976463);
                            jMayLaunchUrl2 = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, i3).ITrustedWebActivityCallbackStub();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1205977864);
                            jMayLaunchUrl2 = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, i3).mayLaunchUrl();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = setExtensionStrength.onExtraCallbackWithResult(ensureNavButtonView.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, fIAuthTabCallback, jMayLaunchUrl2, AppLovinRtbRewardedRenderer.onWarmupCompleted()), AppLovinRtbRewardedRenderer.onWarmupCompleted());
                        boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(function1);
                        Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (zOnNavigationEvent6 || objOnMinimized9 == onwarmupcompleted2.onExtraCallback()) {
                            objOnMinimized9 = new Function0() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsRightBannerV2Kt$$ExternalSyntheticLambda8
                                private static int onExtraCallback = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke() {
                                    int i13 = 2 % 2;
                                    int i14 = onExtraCallback + 89;
                                    onWarmupCompleted = i14 % 128;
                                    int i15 = i14 % 2;
                                    Unit unitOnExtraCallbackWithResult = addRearDisplayPresentationStatusListener.onExtraCallbackWithResult(function1);
                                    int i16 = onExtraCallback + 43;
                                    onWarmupCompleted = i16 % 128;
                                    if (i16 % 2 != 0) {
                                        return unitOnExtraCallbackWithResult;
                                    }
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized9);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback5 = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult2, isqueryrefinementenabledOnNavigationEvent, (Function0) objOnMinimized9);
                        Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (objOnMinimized10 == onwarmupcompleted2.onExtraCallback()) {
                            objOnMinimized10 = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsRightBannerV2Kt$$ExternalSyntheticLambda9
                                private static int IAuthTabCallback = 0;
                                private static int onExtraCallback = 1;

                                public final Object invoke(Object obj2) {
                                    int i13 = 2 % 2;
                                    int i14 = IAuthTabCallback + 15;
                                    onExtraCallback = i14 % 128;
                                    int i15 = i14 % 2;
                                    Unit unitOnWarmupCompleted = addRearDisplayPresentationStatusListener.onWarmupCompleted((useAndConfigureProgramWithTexture) obj2);
                                    int i16 = onExtraCallback + 57;
                                    IAuthTabCallback = i16 % 128;
                                    if (i16 % 2 == 0) {
                                        return unitOnWarmupCompleted;
                                    }
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized10);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted8 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback5, (Function1) objOnMinimized10);
                        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.onExtraCallback(), (boolean) r3);
                        int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, (int) r3));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted9 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnWarmupCompleted8);
                        Function0 function0IAuthTabCallback3 = onextracallbackwithresult.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                            int i13 = IAuthTabCallback + 65;
                            onExtraCallbackWithResult = i13 % 128;
                            int i14 = i13 % 2;
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
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1268733624);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i15 = IAuthTabCallback + 61;
                        onExtraCallbackWithResult = i15 % 128;
                        int i16 = i15 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                } else {
                    int i17 = onExtraCallbackWithResult + 97;
                    IAuthTabCallback = i17 % 128;
                    if (i17 % 2 == 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        throw null;
                    }
                    if (objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback22 = getExtensionsBeforeInitialized.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback, true, (Function1) objOnMinimized7);
                    FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda122 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                    component5 component5VarOnExtraCallback2 = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda122.asInterface(), onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, 0);
                    int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted22 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback22);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback4 = onextracallbackwithresult3.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnExtraCallback2, onextracallbackwithresult3.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult3.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult3.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult3.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted22, onextracallbackwithresult3.onTransact());
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.onNavigationEvent;
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback4 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(RowScope.onNavigationEvent(rowScopeInstance2, onextracallback2, 1.0f, false, 2, (Object) null), 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, 11, (Object) null);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized == onwarmupcompleted2.onExtraCallback()) {
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted32 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback4, (Function1) objOnMinimized);
                    FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub2 = focusMeteringControlExternalSyntheticLambda122.IAuthTabCallbackStub();
                    QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult22 = QuirkSettingsLoader.Companion;
                    component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub2, onextracallbackwithresult22.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                    int iHashCode22 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted42 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted32);
                    Function0 function0IAuthTabCallback22 = onextracallbackwithresult3.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, component5VarOnNavigationEvent2, onextracallbackwithresult3.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject22, onextracallbackwithresult3.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, Integer.valueOf(iHashCode22), onextracallbackwithresult3.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, onextracallbackwithresult3.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, quirksExternalSyntheticBackport0OnWarmupCompleted42, onextracallbackwithresult3.onTransact());
                    LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnNavigationEvent) {
                        objOnMinimized2 = new Function0() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsRightBannerV2Kt$$ExternalSyntheticLambda3
                            private static int onExtraCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke() {
                                int i72 = 2 % 2;
                                int i82 = onExtraCallback + 51;
                                onWarmupCompleted = i82 % 128;
                                int i92 = i82 % 2;
                                Object[] objArr = {function1};
                                int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                                Unit unit = (Unit) addRearDisplayPresentationStatusListener.onExtraCallback(753647533, objArr, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, -753647530);
                                int i102 = onExtraCallback + 125;
                                onWarmupCompleted = i102 % 128;
                                int i112 = i102 % 2;
                                return unit;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback32 = WebViewClientCompat.IAuthTabCallback(onextracallback2, isqueryrefinementenabledOnNavigationEvent, (Function0) objOnMinimized2);
                        objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (objOnMinimized3 == onwarmupcompleted2.onExtraCallback()) {
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted52 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback32, (Function1) objOnMinimized3);
                        String strAsInterface2 = rightBanner.asInterface();
                        ConnectionPool connectionPool2 = ConnectionPool.onWarmupCompleted;
                        handshake.onNavigationEvent onNavigationEvent3 = connectionPool2.onNavigationEvent();
                        if (z) {
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strAsInterface2, quirksExternalSyntheticBackport0OnWarmupCompleted52, null, Long.valueOf(jLongValue), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17)), 0L, onNavigationEvent3, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 0, 130980}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback22 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback2, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), 0.0f, 0.0f, 13, (Object) null);
                        zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                        objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!zOnNavigationEvent2) {
                            objOnMinimized4 = new Function0() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsRightBannerV2Kt$$ExternalSyntheticLambda5
                                private static int onExtraCallback = 1;
                                private static int onExtraCallbackWithResult;

                                public final Object invoke() {
                                    int i92 = 2 % 2;
                                    int i102 = onExtraCallback + 71;
                                    onExtraCallbackWithResult = i102 % 128;
                                    int i112 = i102 % 2;
                                    Object[] objArr = {function1};
                                    int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                                    Unit unit = (Unit) addRearDisplayPresentationStatusListener.onExtraCallback(-1902795273, objArr, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1902795277);
                                    int i122 = onExtraCallbackWithResult + 21;
                                    onExtraCallback = i122 % 128;
                                    if (i122 % 2 == 0) {
                                        int i132 = 96 / 0;
                                    }
                                    return unit;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback42 = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback22, isqueryrefinementenabledOnNavigationEvent, (Function0) objOnMinimized4);
                            objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (objOnMinimized5 == onwarmupcompleted2.onExtraCallback()) {
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted62 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback42, (Function1) objOnMinimized5);
                            String strIAuthTabCallbackStub2 = rightBanner.IAuthTabCallbackStub();
                            if (z2) {
                            }
                            handshake.onNavigationEvent onNavigationEvent22 = connectionPool2.onNavigationEvent();
                            if (z) {
                            }
                            long j3 = jLongValue2;
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strIAuthTabCallbackStub2, quirksExternalSyntheticBackport0OnWarmupCompleted62, null, Long.valueOf(j3), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13)), 0L, onNavigationEvent22, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 0, 130980}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                            strIAuthTabCallbackDefault = rightBanner.IAuthTabCallbackDefault();
                            if (strIAuthTabCallbackDefault != null) {
                                i2 = onExtraCallbackWithResult + 57;
                                IAuthTabCallback = i2 % 128;
                                if (i2 % 2 != 0) {
                                }
                                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                if (StringsKt.isBlank(rightBanner.asBinder())) {
                                }
                                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                }
                            }
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final void onNavigationEvent(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final boolean z, @NotNull final deleteProfile deleteprofile, @NotNull final NativeAdsDto.Creative.RightBanner rightBanner, @NotNull final onReceivedHttpError.IAuthTabCallback iAuthTabCallback, @NotNull final Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        String strIAuthTabCallbackStub;
        Configuration configuration;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(deleteprofile, "");
        Intrinsics.checkNotNullParameter(rightBanner, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1622785738);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i6 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(deleteprofile.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rightBanner) ^ true ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 131072 : 65536;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i3) != 74898, i3 & 1)) {
            if (i5 != 0) {
                int i8 = IAuthTabCallback + 121;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 != 0) {
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
            } else {
                quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = IAuthTabCallback + 25;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1622785738, i3, -1, "im.toss.ads_sdk.ui.v2.compose.NativeAdsRightBannerV2 (NativeAdsRightBannerV2.kt:54)");
            }
            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            final boolean zOnExtraCallbackWithResult = getStrokeWidth.onExtraCallback.onExtraCallbackWithResult(deleteprofile, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i3 >> 6) & 14) | 48);
            float fMin = Math.min(context.getApplicationContext().getResources().getConfiguration().fontScale, 1.6f);
            Resources resources = context.getResources();
            final QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedAccess000 = ((resources == null || (configuration = resources.getConfiguration()) == null) ? 1.0f : configuration.fontScale) > 1.35f ? QuirkSettingsLoader.Companion.access000() : QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
            StringBuilder sb = new StringBuilder();
            sb.append(rightBanner.asInterface());
            sb.append(" ");
            if (z) {
                strIAuthTabCallbackStub = rightBanner.IAuthTabCallbackStub() + " ・ AD";
            } else {
                strIAuthTabCallbackStub = rightBanner.IAuthTabCallbackStub();
            }
            sb.append(strIAuthTabCallbackStub);
            String strIAuthTabCallbackDefault = rightBanner.IAuthTabCallbackDefault();
            if (strIAuthTabCallbackDefault != null && !StringsKt.isBlank(strIAuthTabCallbackDefault)) {
                sb.append(" ");
                sb.append(rightBanner.IAuthTabCallbackDefault());
            }
            final String string = sb.toString();
            accessgetCameraFactoryp accessgetcamerafactorypOnExtraCallback = needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(), fMin));
            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            setPostviewFormatSelector.onNavigationEvent(accessgetcamerafactorypOnExtraCallback, ForwardingCameraControl.onExtraCallback(-429189642, true, new Function2() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsRightBannerV2Kt$$ExternalSyntheticLambda11
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i11 = 2 % 2;
                    int i12 = onExtraCallback + 75;
                    onNavigationEvent = i12 % 128;
                    int i13 = i12 % 2;
                    Unit unitOnNavigationEvent = addRearDisplayPresentationStatusListener.onNavigationEvent(quirksExternalSyntheticBackport05, iAuthTabCallback, function1, string, onwarmupcompletedAccess000, rightBanner, zOnExtraCallbackWithResult, z, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i14 = onNavigationEvent + 65;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    return unitOnNavigationEvent;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onExtraCallbackWithResult + 11;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsRightBannerV2Kt$$ExternalSyntheticLambda12
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    Unit unitOnWarmupCompleted;
                    int i13 = 2 % 2;
                    int i14 = onExtraCallbackWithResult + 35;
                    IAuthTabCallback = i14 % 128;
                    if (i14 % 2 != 0) {
                        unitOnWarmupCompleted = addRearDisplayPresentationStatusListener.onWarmupCompleted(quirksExternalSyntheticBackport03, z, deleteprofile, rightBanner, iAuthTabCallback, function1, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i15 = 60 / 0;
                    } else {
                        unitOnWarmupCompleted = addRearDisplayPresentationStatusListener.onWarmupCompleted(quirksExternalSyntheticBackport03, z, deleteprofile, rightBanner, iAuthTabCallback, function1, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    int i16 = IAuthTabCallback + 59;
                    onExtraCallbackWithResult = i16 % 128;
                    if (i16 % 2 != 0) {
                        return unitOnWarmupCompleted;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            });
        }
    }

    public static /* synthetic */ boolean onExtraCallback(Function1 function1) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return ((Boolean) onExtraCallback(343699435, new Object[]{function1}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, -343699433)).booleanValue();
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (Unit) onExtraCallback(753647533, new Object[]{function1}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, -753647530);
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (Unit) onExtraCallback(-1902795273, new Object[]{function1}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 1902795277);
    }

    private static final Unit IAuthTabCallbackStub(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (Unit) onExtraCallback(1018520455, new Object[]{useandconfigureprogramwithtexture}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, -1018520454);
    }

    private static final Unit asBinder(Function1 function1) {
        int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
        return (Unit) onExtraCallback(-915928639, new Object[]{function1}, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent, 915928639);
    }
}
