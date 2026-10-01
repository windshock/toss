package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.features.tosscert.ui.R;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.WebViewCompatExternalSyntheticLambda2;
import o.handshake;
import o.onReceivedHttpError;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WebViewCompatExternalSyntheticLambda2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        deleteProfile deleteprofile = (deleteProfile) objArr[2];
        NativeAdsDto.Creative.Normal normal = (NativeAdsDto.Creative.Normal) objArr[3];
        onReceivedHttpError.IAuthTabCallback iAuthTabCallback = (onReceivedHttpError.IAuthTabCallback) objArr[4];
        Function1 function1 = (Function1) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int iIntValue2 = ((Number) objArr[7]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {quirksExternalSyntheticBackport0, Boolean.valueOf(zBooleanValue), deleteprofile, normal, iAuthTabCallback, function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1)), Integer.valueOf(iIntValue2)};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        onExtraCallbackWithResult(objArr2, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1585448721, R.drawable.IAuthTabCallback(), iIAuthTabCallback, -1585448720);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(useandconfigureprogramwithtexture);
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        int i5 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
        return unitAccess100;
    }

    public static /* synthetic */ boolean IAuthTabCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallbackDefault = IAuthTabCallbackDefault(function1);
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        int i5 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return zIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(useandconfigureprogramwithtexture);
        int i4 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return interfaceDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asBinder(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(useandconfigureprogramwithtexture);
        int i4 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsInterface;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onTransact(useandconfigureprogramwithtexture);
            throw null;
        }
        Unit unitOnTransact = onTransact(useandconfigureprogramwithtexture);
        int i3 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(function1);
        int i4 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(useandconfigureprogramwithtexture);
        int i4 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess000;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i5);
        int i11 = ~i3;
        int i12 = (~(i8 | i11 | i6)) | i10;
        int i13 = (~(i5 | i11)) | (~(i7 | i11));
        int i14 = i6 + i3 + i4 + (1941422536 * i2) + ((-555707305) * i);
        int i15 = i14 * i14;
        int i16 = (i6 * (-2131549542)) + 177471488 + ((-2131549542) * i3) + (i9 * (-207299225)) + (i12 * (-207299225)) + ((-207299225) * i13) + (1956118528 * i4) + ((-1363148800) * i2) + (2141716480 * i) + ((-573308928) * i15);
        int i17 = ((i6 * 487360618) - 1291405921) + (i3 * 487360618) + (i9 * 543) + (i12 * 543) + (i13 * 543) + (i4 * 487361161) + (i2 * (-1188264952)) + (i * 624576655) + (i15 * (-25952256));
        int i18 = i16 + (i17 * i17 * 74186752);
        if (i18 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i18 != 2) {
            return i18 != 3 ? i18 != 4 ? i18 != 5 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
        }
        String str = (String) objArr[0];
        final Function1 function1 = (Function1) objArr[1];
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[2];
        int i19 = 2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
        unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture, Role.Companion.onWarmupCompleted());
        unregisterOutputSurface.IAuthTabCallbackDefault(useandconfigureprogramwithtexture, "열기", new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNormalKt$$ExternalSyntheticLambda14
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i20 = 2 % 2;
                int i21 = onExtraCallback + 117;
                onExtraCallbackWithResult = i21 % 128;
                int i22 = i21 % 2;
                Boolean boolValueOf = Boolean.valueOf(WebViewCompatExternalSyntheticLambda2.IAuthTabCallback(function1));
                int i23 = onExtraCallbackWithResult + 103;
                onExtraCallback = i23 % 128;
                if (i23 % 2 == 0) {
                    int i24 = 0 / 0;
                }
                return boolValueOf;
            }
        });
        Unit unit = Unit.INSTANCE;
        int i20 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i20 % 128;
        int i21 = i20 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(function1);
        int i4 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(useandconfigureprogramwithtexture);
        int i4 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackStubProxy;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String str = (String) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
            return (Unit) onExtraCallbackWithResult(new Object[]{str, function1, useandconfigureprogramwithtexture}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1991387309, iIAuthTabCallback2, iIAuthTabCallback, -1991387307);
        }
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsDto.Creative.Normal normal, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(normal, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(function1);
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
        int i5 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(useandconfigureprogramwithtexture);
        int i4 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(function1);
        int i4 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, Function1 function1, String str, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, deleteProfile deleteprofile, NativeAdsDto.Creative.Normal normal, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Object[] objArr = {quirksExternalSyntheticBackport0, iAuthTabCallback, function1, str, onwarmupcompleted, r8lambdanm9dm2eewl4vrptnjmesfjqky4, deleteprofile, normal, Boolean.valueOf(z), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {quirksExternalSyntheticBackport0, iAuthTabCallback, function1, str, onwarmupcompleted, r8lambdanm9dm2eewl4vrptnjmesfjqky4, deleteprofile, normal, Boolean.valueOf(z), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(objArr2, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1315572801, R.drawable.IAuthTabCallback(), iIAuthTabCallback2, -1315572797);
        int i4 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, deleteProfile deleteprofile, NativeAdsDto.Creative.Normal normal, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {quirksExternalSyntheticBackport0, Boolean.valueOf(z), deleteprofile, normal, iAuthTabCallback, function1, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        if (i6 != 0) {
            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
            int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
            return (Unit) onExtraCallbackWithResult(objArr, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 435643142, iIAuthTabCallback2, iIAuthTabCallback, -435643142);
        }
        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(objArr, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 435643142, iIAuthTabCallback4, iIAuthTabCallback3, -435643142);
        int i7 = 17 / 0;
        return unit;
    }

    private static final Unit asBinder(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke((Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final boolean IAuthTabCallbackDefault(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke((Object) null);
        int i4 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
        return true;
    }

    private static final Unit onTransact(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 31;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onTransact(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("202");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asInterface(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 1;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return unit;
    }

    private static final Unit access000(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        boolean z;
        NativeAdsDto.Creative.Normal normal;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
        isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled;
        float f;
        int i;
        long jOnExtraCallbackWithResult;
        long jOnExtraCallbackWithResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        onReceivedHttpError.IAuthTabCallback iAuthTabCallback = (onReceivedHttpError.IAuthTabCallback) objArr[1];
        final Function1 function1 = (Function1) objArr[2];
        final String str = (String) objArr[3];
        QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted = (QuirkSettingsLoader.onWarmupCompleted) objArr[4];
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) objArr[5];
        deleteProfile deleteprofile = (deleteProfile) objArr[6];
        NativeAdsDto.Creative.Normal normal2 = (NativeAdsDto.Creative.Normal) objArr[7];
        boolean zBooleanValue = ((Boolean) objArr[8]).booleanValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue = ((Number) objArr[10]).intValue();
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        if ((iIntValue & 3) != 2) {
            int i6 = i3 + 91;
            onExtraCallbackWithResult = i6 % 128;
            z = i6 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1144877819, iIntValue, -1, "im.toss.ads_sdk.ui.compose.NativeAdsNormal.<anonymous> (NativeAdsNormal.kt:83)");
            }
            isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabledOnNavigationEvent = WebViewClientCompat.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 0);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(WebViewClientCompat.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), isqueryrefinementenabledOnNavigationEvent), iAuthTabCallback.onWarmupCompleted(), iAuthTabCallback.onExtraCallbackWithResult(), iAuthTabCallback.IAuthTabCallback(), iAuthTabCallback.onNavigationEvent());
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNormalKt$$ExternalSyntheticLambda2
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke() {
                        int i7 = 2 % 2;
                        int i8 = onNavigationEvent + 107;
                        onExtraCallback = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitOnExtraCallback = WebViewCompatExternalSyntheticLambda2.onExtraCallback(function1);
                        if (i9 != 0) {
                            int i10 = 99 / 0;
                        }
                        return unitOnExtraCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted, isqueryrefinementenabledOnNavigationEvent, (Function0) objOnMinimized);
            if (!iAuthTabCallback.asBinder() || iAuthTabCallback.onExtraCallback() == null) {
                normal = normal2;
                quirksExternalSyntheticBackport0OnExtraCallbackWithResult = QuirksExternalSyntheticBackport0.Companion;
            } else {
                normal = normal2;
                quirksExternalSyntheticBackport0OnExtraCallbackWithResult = setExtensionStrength.onExtraCallbackWithResult(ensureNavButtonView.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, iAuthTabCallback.onExtraCallback().onWarmupCompleted(), iAuthTabCallback.onExtraCallback().IAuthTabCallback(), RoundedCornerShapeKt.onNavigationEvent(iAuthTabCallback.IAuthTabCallbackStub())), RoundedCornerShapeKt.onNavigationEvent(iAuthTabCallback.IAuthTabCallbackStub()));
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0IAuthTabCallback.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnNavigationEvent2 | zOnNavigationEvent3) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNormalKt$$ExternalSyntheticLambda5
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallback = 1;

                    public final Object invoke(Object obj) {
                        int i7 = 2 % 2;
                        int i8 = IAuthTabCallback + 19;
                        onExtraCallback = i8 % 128;
                        Object obj2 = null;
                        if (i8 % 2 == 0) {
                            Object[] objArr2 = {str, function1, (useAndConfigureProgramWithTexture) obj};
                            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
                            int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
                            obj2.hashCode();
                            throw null;
                        }
                        Object[] objArr3 = {str, function1, (useAndConfigureProgramWithTexture) obj};
                        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
                        int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
                        Unit unit = (Unit) WebViewCompatExternalSyntheticLambda2.onExtraCallbackWithResult(objArr3, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -68383009, iIAuthTabCallback4, iIAuthTabCallback3, 68383014);
                        int i9 = IAuthTabCallback + 97;
                        onExtraCallback = i9 % 128;
                        if (i9 % 2 != 0) {
                            return unit;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = getExtensionsBeforeInitialized.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, true, (Function1) objOnMinimized2);
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback2);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized3 == onwarmupcompleted2.onExtraCallback()) {
                objOnMinimized3 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNormalKt$$ExternalSyntheticLambda6
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i7 = 2 % 2;
                        int i8 = onExtraCallback + 35;
                        onNavigationEvent = i8 % 128;
                        Object[] objArr2 = {(useAndConfigureProgramWithTexture) obj};
                        if (i8 % 2 != 0) {
                            int iIAuthTabCallback = R.drawable.IAuthTabCallback();
                            int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
                            return (Unit) WebViewCompatExternalSyntheticLambda2.onExtraCallbackWithResult(objArr2, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 2085036674, iIAuthTabCallback2, iIAuthTabCallback, -2085036671);
                        }
                        int iIAuthTabCallback3 = R.drawable.IAuthTabCallback();
                        int iIAuthTabCallback4 = R.drawable.IAuthTabCallback();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnWarmupCompleted3, (Function1) objOnMinimized3);
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted4);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted5, onextracallbackwithresult2.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            boolean zOnExtraCallbackWithResult = getStrokeWidth.onExtraCallback.onExtraCallbackWithResult(deleteprofile, cameraCaptureResultEmptyCameraCaptureResult, 48);
            if (StringsKt.isBlank(normal.asBinder())) {
                isqueryrefinementenabled = isqueryrefinementenabledOnNavigationEvent;
                f = 0.0f;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1390868819);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i7 = onExtraCallbackWithResult + 17;
                IAuthTabCallback = i7 % 128;
                i = 2;
                int i8 = i7 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1392041239);
                int i9 = 218243143;
                if (!zOnExtraCallbackWithResult) {
                    jOnExtraCallbackWithResult2 = ByteOrderedDataOutputStream.onExtraCallback(218243143);
                } else {
                    int i10 = IAuthTabCallback + 23;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    jOnExtraCallbackWithResult2 = ByteOrderedDataOutputStream.onExtraCallbackWithResult(4294967295L);
                }
                if (zOnExtraCallbackWithResult) {
                    int i12 = onExtraCallbackWithResult + 121;
                    IAuthTabCallback = i12 % 128;
                    if (i12 % 2 == 0) {
                        throw null;
                    }
                    i9 = 484039167;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = setExtensionStrength.onExtraCallbackWithResult(ensureNavButtonView.onExtraCallback(verifyDrawable.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, 11, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(36.0f)), jOnExtraCallbackWithResult2, AppLovinRtbRewardedRenderer.onWarmupCompleted()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.5f), ByteOrderedDataOutputStream.onExtraCallback(i9), AppLovinRtbRewardedRenderer.onWarmupCompleted()), AppLovinRtbRewardedRenderer.onWarmupCompleted());
                boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent4 || objOnMinimized4 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized4 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNormalKt$$ExternalSyntheticLambda7
                        private static int onExtraCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke() {
                            int i13 = 2 % 2;
                            int i14 = onExtraCallback + 47;
                            onNavigationEvent = i14 % 128;
                            if (i14 % 2 != 0) {
                                WebViewCompatExternalSyntheticLambda2.onExtraCallbackWithResult(function1);
                                throw null;
                            }
                            Unit unitOnExtraCallbackWithResult = WebViewCompatExternalSyntheticLambda2.onExtraCallbackWithResult(function1);
                            int i15 = onNavigationEvent + 103;
                            onExtraCallback = i15 % 128;
                            int i16 = i15 % 2;
                            return unitOnExtraCallbackWithResult;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                }
                isqueryrefinementenabled = isqueryrefinementenabledOnNavigationEvent;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback3 = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult2, isqueryrefinementenabled, (Function0) objOnMinimized4);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized5 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized5 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNormalKt$$ExternalSyntheticLambda8
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj) {
                            int i13 = 2 % 2;
                            int i14 = onWarmupCompleted + 23;
                            onExtraCallback = i14 % 128;
                            int i15 = i14 % 2;
                            Unit unitAsBinder = WebViewCompatExternalSyntheticLambda2.asBinder((useAndConfigureProgramWithTexture) obj);
                            int i16 = onWarmupCompleted + 55;
                            onExtraCallback = i16 % 128;
                            if (i16 % 2 == 0) {
                                int i17 = 80 / 0;
                            }
                            return unitAsBinder;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted6 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback3, (Function1) objOnMinimized5);
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted7 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted6);
                Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback3);
                    int i13 = IAuthTabCallback + 15;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted7, onextracallbackwithresult2.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                String strAsBinder = normal.asBinder();
                AppLovinFullscreenImmersiveActivity appLovinFullscreenImmersiveActivityIAuthTabCallback = showAndRender.IAuthTabCallback();
                f = 0.0f;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized6 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized6 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNormalKt$$ExternalSyntheticLambda9
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj) {
                            int i15 = 2 % 2;
                            int i16 = onWarmupCompleted + 89;
                            onNavigationEvent = i16 % 128;
                            int i17 = i16 % 2;
                            Unit unitOnNavigationEvent = WebViewCompatExternalSyntheticLambda2.onNavigationEvent((useAndConfigureProgramWithTexture) obj);
                            int i18 = onWarmupCompleted + 13;
                            onNavigationEvent = i18 % 128;
                            int i19 = i18 % 2;
                            return unitOnNavigationEvent;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
                }
                AccessibilityUtilKtExternalSyntheticLambda1.IAuthTabCallback(strAsBinder, (String) null, setAdVideoPlaybackListener.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback2, (Function1) objOnMinimized6), "AsyncImage", strAsBinder, appLovinFullscreenImmersiveActivityIAuthTabCallback), (Function1) null, showAndRender.IAuthTabCallback(appLovinFullscreenImmersiveActivityIAuthTabCallback, (Function1) null), (QuirkSettingsLoader) null, immediateFailedFuture.Companion.IAuthTabCallback(), 0.0f, (seek) null, 0, false, cameraCaptureResultEmptyCameraCaptureResult, 1572912, 0, 1960);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                i = 2;
            }
            if (zOnExtraCallbackWithResult) {
                int i15 = IAuthTabCallback + 87;
                onExtraCallbackWithResult = i15 % 128;
                int i16 = i15 % i;
                jOnExtraCallbackWithResult = setByteOrder.Companion.asBinder();
            } else {
                jOnExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallbackWithResult(4283324776L);
            }
            long j = jOnExtraCallbackWithResult;
            long jOnExtraCallbackWithResult3 = zOnExtraCallbackWithResult ^ true ? ByteOrderedDataOutputStream.onExtraCallbackWithResult(4285232772L) : setByteOrder.Companion.asBinder();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted8 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(RowScope.onNavigationEvent(rowScopeInstance, onextracallback, 1.0f, false, 2, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null);
            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized7 == onwarmupcompleted2.onExtraCallback()) {
                objOnMinimized7 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNormalKt$$ExternalSyntheticLambda10
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj) {
                        int i17 = 2 % 2;
                        int i18 = onExtraCallback + 71;
                        onNavigationEvent = i18 % 128;
                        int i19 = i18 % 2;
                        Unit unitOnExtraCallback = WebViewCompatExternalSyntheticLambda2.onExtraCallback((useAndConfigureProgramWithTexture) obj);
                        int i20 = onExtraCallback + 11;
                        onNavigationEvent = i20 % 128;
                        int i21 = i20 % 2;
                        return unitOnExtraCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized7);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted9 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnWarmupCompleted8, (Function1) objOnMinimized7);
            component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted10 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted9);
            Function0 function0IAuthTabCallback4 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback4);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted10, onextracallbackwithresult2.onTransact());
            boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent5 || objOnMinimized8 == onwarmupcompleted2.onExtraCallback()) {
                objOnMinimized8 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNormalKt$$ExternalSyntheticLambda11
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i17 = 2 % 2;
                        int i18 = onWarmupCompleted + 79;
                        onNavigationEvent = i18 % 128;
                        int i19 = i18 % 2;
                        Unit unitOnWarmupCompleted = WebViewCompatExternalSyntheticLambda2.onWarmupCompleted(function1);
                        int i20 = onNavigationEvent + 125;
                        onWarmupCompleted = i20 % 128;
                        int i21 = i20 % 2;
                        return unitOnWarmupCompleted;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized8);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback4 = WebViewClientCompat.IAuthTabCallback(onextracallback, isqueryrefinementenabled, (Function0) objOnMinimized8);
            Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized9 == onwarmupcompleted2.onExtraCallback()) {
                objOnMinimized9 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNormalKt$$ExternalSyntheticLambda12
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj) {
                        int i17 = 2 % 2;
                        int i18 = onExtraCallbackWithResult + 97;
                        onExtraCallback = i18 % 128;
                        int i19 = i18 % 2;
                        Unit unitOnExtraCallbackWithResult = WebViewCompatExternalSyntheticLambda2.onExtraCallbackWithResult((useAndConfigureProgramWithTexture) obj);
                        int i20 = onExtraCallbackWithResult + 113;
                        onExtraCallback = i20 % 128;
                        int i21 = i20 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized9);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted11 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback4, (Function1) objOnMinimized9);
            String strAsInterface = normal.asInterface();
            ConnectionPool connectionPool = ConnectionPool.onWarmupCompleted;
            handshake.onNavigationEvent onNavigationEvent = connectionPool.onNavigationEvent();
            isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
            float f2 = f;
            isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled2 = isqueryrefinementenabled;
            final NativeAdsDto.Creative.Normal normal3 = normal;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strAsInterface, quirksExternalSyntheticBackport0OnWarmupCompleted11, new getHumanReadableName(j, 0L, isrepeatingenabled.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (DefaultConstructorMarker) null), 0L, Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17)), 0L, onNavigationEvent, null, null, Float.valueOf(f2), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 0, 130984}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent6 || objOnMinimized10 == onwarmupcompleted2.onExtraCallback()) {
                objOnMinimized10 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNormalKt$$ExternalSyntheticLambda13
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i17 = 2 % 2;
                        int i18 = onWarmupCompleted + 31;
                        onExtraCallbackWithResult = i18 % 128;
                        int i19 = i18 % 2;
                        Unit unitOnNavigationEvent = WebViewCompatExternalSyntheticLambda2.onNavigationEvent(function1);
                        if (i19 == 0) {
                            int i20 = 81 / 0;
                        }
                        return unitOnNavigationEvent;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized10);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback5 = WebViewClientCompat.IAuthTabCallback(onextracallback, isqueryrefinementenabled2, (Function0) objOnMinimized10);
            Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized11 == onwarmupcompleted2.onExtraCallback()) {
                objOnMinimized11 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNormalKt$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj) {
                        int i17 = 2 % 2;
                        int i18 = IAuthTabCallback + 5;
                        onNavigationEvent = i18 % 128;
                        int i19 = i18 % 2;
                        Unit unitIAuthTabCallback = WebViewCompatExternalSyntheticLambda2.IAuthTabCallback((useAndConfigureProgramWithTexture) obj);
                        int i20 = IAuthTabCallback + 93;
                        onNavigationEvent = i20 % 128;
                        if (i20 % 2 == 0) {
                            return unitIAuthTabCallback;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized11);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted12 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback5, (Function1) objOnMinimized11);
            String strIAuthTabCallbackStub = normal3.IAuthTabCallbackStub();
            if (zBooleanValue) {
                strIAuthTabCallbackStub = strIAuthTabCallbackStub + " ・ AD";
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strIAuthTabCallbackStub, quirksExternalSyntheticBackport0OnWarmupCompleted12, new getHumanReadableName(jOnExtraCallbackWithResult3, 0L, isrepeatingenabled.onTransact(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (DefaultConstructorMarker) null), 0L, Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13)), 0L, connectionPool.onNavigationEvent(), null, null, Float.valueOf(f2), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 0, 130984}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(), 1.0f)), ForwardingCameraControl.onExtraCallback(-373826255, true, new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNormalKt$$ExternalSyntheticLambda4
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) throws Throwable {
                    int i17 = 2 % 2;
                    int i18 = onExtraCallback + 97;
                    onWarmupCompleted = i18 % 128;
                    int i19 = i18 % 2;
                    Unit unitOnNavigationEvent = WebViewCompatExternalSyntheticLambda2.onNavigationEvent(normal3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i20 = onExtraCallback + 73;
                    onWarmupCompleted = i20 % 128;
                    if (i20 % 2 == 0) {
                        return unitOnNavigationEvent;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i17 = IAuthTabCallback + 37;
                onExtraCallbackWithResult = i17 % 128;
                if (i17 % 2 != 0) {
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

    private static final Unit IAuthTabCallbackStub(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("101");
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStubProxy(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit asInterface(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("102");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 71;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit access100(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unit = Unit.INSTANCE;
            int i3 = 16 / 0;
        } else {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit getInterfaceDescriptor(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        int i3 = 56 / 0;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(NativeAdsDto.Creative.Normal normal, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        Throwable th;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 33;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 85;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = onExtraCallbackWithResult + 17;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            th = null;
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallbackWithResult + 97;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-373826255, i, -1, "im.toss.ads_sdk.ui.compose.NativeAdsNormal.<anonymous>.<anonymous>.<anonymous> (NativeAdsNormal.kt:187)");
                    int i11 = 20 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-373826255, i, -1, "im.toss.ads_sdk.ui.compose.NativeAdsNormal.<anonymous>.<anonymous>.<anonymous> (NativeAdsNormal.kt:187)");
                }
            }
            String strIAuthTabCallbackDefault = normal.IAuthTabCallbackDefault();
            if (strIAuthTabCallbackDefault != null) {
                int i12 = onExtraCallbackWithResult + 19;
                IAuthTabCallback = i12 % 128;
                if (i12 % 2 != 0 ? !(!StringsKt.isBlank(strIAuthTabCallbackDefault)) : !StringsKt.isBlank(strIAuthTabCallbackDefault)) {
                    th = null;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(192893521);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(192344232);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(48.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(48.0f), 0.0f, 8, (Object) null);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNormalKt$$ExternalSyntheticLambda15
                            private static int onExtraCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj) {
                                int i13 = 2 % 2;
                                int i14 = onExtraCallback + 57;
                                onWarmupCompleted = i14 % 128;
                                int i15 = i14 % 2;
                                Unit unitIAuthTabCallbackDefault = WebViewCompatExternalSyntheticLambda2.IAuthTabCallbackDefault((useAndConfigureProgramWithTexture) obj);
                                int i16 = onWarmupCompleted + 87;
                                onExtraCallback = i16 % 128;
                                int i17 = i16 % 2;
                                return unitIAuthTabCallbackDefault;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    th = null;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{normal.IAuthTabCallbackDefault(), getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized), new getHumanReadableName(ByteOrderedDataOutputStream.onExtraCallbackWithResult(4289771713L), 0L, isRepeatingEnabled.onExtraCallback.onTransact(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (DefaultConstructorMarker) null), 0L, Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(normal.IAuthTabCallbackDefault().length() > 60 ? 6 : 8)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 384, 0, 131048}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i13 = IAuthTabCallback + 61;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        int i15 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i15 % 128;
        if (i15 % 2 != 0) {
            return unit;
        }
        th.hashCode();
        throw th;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i;
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i3;
        Function1 function1;
        onReceivedHttpError.IAuthTabCallback iAuthTabCallback;
        NativeAdsDto.Creative.Normal normal;
        final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        Configuration configuration;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = (QuirksExternalSyntheticBackport0) objArr[0];
        final boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        final deleteProfile deleteprofile = (deleteProfile) objArr[2];
        final NativeAdsDto.Creative.Normal normal2 = (NativeAdsDto.Creative.Normal) objArr[3];
        final onReceivedHttpError.IAuthTabCallback iAuthTabCallback2 = (onReceivedHttpError.IAuthTabCallback) objArr[4];
        final Function1 function12 = (Function1) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        final int iIntValue2 = ((Number) objArr[8]).intValue();
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(deleteprofile, "");
        Intrinsics.checkNotNullParameter(normal2, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback2, "");
        Intrinsics.checkNotNullParameter(function12, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(1070108219);
        int i5 = iIntValue2 & 1;
        if (i5 != 0) {
            i = iIntValue | 6;
        } else if ((iIntValue & 6) == 0) {
            int i6 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2)) {
                int i8 = IAuthTabCallback + 49;
                onExtraCallbackWithResult = i8 % 128;
                i2 = i8 % 2 != 0 ? 3 : 4;
            } else {
                i2 = 2;
            }
            i = i2 | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            int i9 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(deleteprofile.ordinal()) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(normal2) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback2) ? 16384 : 8192;
        }
        if ((196608 & iIntValue) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 131072 : 65536;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i) != 74898, i & 1)) {
            if (i5 != 0) {
                int i11 = IAuthTabCallback + 37;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 != 0) {
                    onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                    int i12 = 60 / 0;
                } else {
                    onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1070108219, i, -1, "im.toss.ads_sdk.ui.compose.NativeAdsNormal (NativeAdsNormal.kt:53)");
            }
            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            StringBuilder sb = new StringBuilder();
            sb.append(normal2.asInterface());
            sb.append(" ");
            if (zBooleanValue) {
                sb.append(normal2.IAuthTabCallbackStub());
                sb.append(" ・ AD");
            } else {
                sb.append(normal2.IAuthTabCallbackStub());
            }
            if (normal2.IAuthTabCallbackDefault() != null && (!StringsKt.isBlank(r7))) {
                sb.append(" ");
                sb.append(normal2.IAuthTabCallbackDefault());
            }
            final String string = sb.toString();
            float fMin = Math.min(context.getApplicationContext().getResources().getConfiguration().fontScale, 1.6f);
            Resources resources = context.getResources();
            final QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedAccess000 = ((resources == null || (configuration = resources.getConfiguration()) == null) ? 1.0f : configuration.fontScale) > 1.35f ? QuirkSettingsLoader.Companion.access000() : QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
            accessgetCameraFactoryp accessgetcamerafactorypOnExtraCallback = needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(), fMin));
            final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = onextracallback2;
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback4 = onextracallback2;
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i3 = iIntValue;
            function1 = function12;
            iAuthTabCallback = iAuthTabCallback2;
            normal = normal2;
            setPostviewFormatSelector.onNavigationEvent(accessgetcamerafactorypOnExtraCallback, ForwardingCameraControl.onExtraCallback(1144877819, true, new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNormalKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj, Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = onExtraCallback + 55;
                    IAuthTabCallback = i14 % 128;
                    int i15 = i14 % 2;
                    Unit unitOnWarmupCompleted = WebViewCompatExternalSyntheticLambda2.onWarmupCompleted(onextracallback3, iAuthTabCallback2, function12, string, onwarmupcompletedAccess000, r8lambdanm9dm2eewl4vrptnjmesfjqky4, deleteprofile, normal2, zBooleanValue, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i16 = IAuthTabCallback + 3;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    return unitOnWarmupCompleted;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = IAuthTabCallback + 51;
                onExtraCallbackWithResult = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            onextracallback = onextracallback4;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i3 = iIntValue;
            function1 = function12;
            iAuthTabCallback = iAuthTabCallback2;
            normal = normal2;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            onextracallback = onextracallback2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final NativeAdsDto.Creative.Normal normal3 = normal;
            final onReceivedHttpError.IAuthTabCallback iAuthTabCallback3 = iAuthTabCallback;
            final Function1 function13 = function1;
            final int i15 = i3;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsNormalKt$$ExternalSyntheticLambda1
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i16 = 2 % 2;
                    int i17 = onExtraCallback + 71;
                    onNavigationEvent = i17 % 128;
                    int i18 = i17 % 2;
                    Unit unitOnWarmupCompleted = WebViewCompatExternalSyntheticLambda2.onWarmupCompleted(onextracallback, zBooleanValue, deleteprofile, normal3, iAuthTabCallback3, function13, i15, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i19 = onNavigationEvent + 55;
                    onExtraCallback = i19 % 128;
                    int i20 = i19 % 2;
                    return unitOnWarmupCompleted;
                }
            });
        }
        int i16 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 81 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(new Object[]{useandconfigureprogramwithtexture}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 2085036674, iIAuthTabCallback2, iIAuthTabCallback, -2085036671);
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, Function1 function1, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(new Object[]{str, function1, useandconfigureprogramwithtexture}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -68383009, iIAuthTabCallback2, iIAuthTabCallback, 68383014);
    }

    public static final void onExtraCallbackWithResult(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, @NotNull deleteProfile deleteprofile, @NotNull NativeAdsDto.Creative.Normal normal, @NotNull onReceivedHttpError.IAuthTabCallback iAuthTabCallback, @NotNull Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Boolean.valueOf(z), deleteprofile, normal, iAuthTabCallback, function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        onExtraCallbackWithResult(objArr, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1585448721, iIAuthTabCallback2, iIAuthTabCallback, -1585448720);
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, Function1 function1, String str, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, deleteProfile deleteprofile, NativeAdsDto.Creative.Normal normal, boolean z, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {quirksExternalSyntheticBackport0, iAuthTabCallback, function1, str, onwarmupcompleted, r8lambdanm9dm2eewl4vrptnjmesfjqky4, deleteprofile, normal, Boolean.valueOf(z), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(objArr, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1315572801, iIAuthTabCallback2, iIAuthTabCallback, -1315572797);
    }

    private static final Unit onExtraCallbackWithResult(String str, Function1 function1, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(new Object[]{str, function1, useandconfigureprogramwithtexture}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 1991387309, iIAuthTabCallback2, iIAuthTabCallback, -1991387307);
    }

    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, deleteProfile deleteprofile, NativeAdsDto.Creative.Normal normal, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Boolean.valueOf(z), deleteprofile, normal, iAuthTabCallback, function1, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iIAuthTabCallback = R.drawable.IAuthTabCallback();
        int iIAuthTabCallback2 = R.drawable.IAuthTabCallback();
        return (Unit) onExtraCallbackWithResult(objArr, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 435643142, iIAuthTabCallback2, iIAuthTabCallback, -435643142);
    }
}
