package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import im.toss.ads_sdk.R;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.ui.screen.NativeAdsFullBannerScreenKt$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.GraphicDeviceInfo;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1;
import o.createCameraCaptureCallback;
import o.seek;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class WindowAreaControllerImplRearDisplayPresentationSessionConsumerExternalSyntheticLambda0 {
    private static short[] onNavigationEvent;
    private static final byte[] $$a = {29, -26, 91, 68};
    private static final int $$b = 42;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int asBinder = 1;
    private static int onExtraCallbackWithResult = 475561934;
    private static int onWarmupCompleted = -1538795520;
    private static int IAuthTabCallback = -906838543;
    private static byte[] onExtraCallback = {56, 98, 103, -69, 56, 122, 120, 123, -71, 46, -76, 38, 112, 122, 126, -81, 56, 120, 117, 99, -93, 32, -67, 126, 49, 98, 103, -70, 37, 126, 120, 117, 99, -93, 59, 125, -92, 36, 121, 125, 100, -65, 52, 99, 110, -116, 86, 122, -67, 121, 110, 48, 124, 101, 121, 117, -15};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, short s3) {
        int i;
        int i2;
        int i3 = 1 - (s2 * 3);
        int i4 = 115 - (s3 * 3);
        int i5 = (s * 4) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            i4 += -i6;
            i5++;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i5];
            i4 += -i6;
            i5++;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, Resources resources, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, resources, useandconfigureprogramwithtexture);
        int i4 = asBinder + 85;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function2 function2) {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            return (Unit) onNavigationEvent(1448745146, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{function2}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1448745143, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        }
        int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Resources resources, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(resources, useandconfigureprogramwithtexture);
        }
        onWarmupCompleted(resources, useandconfigureprogramwithtexture);
        throw null;
    }

    private static final Unit onExtraCallback(NativeAdsDto.Creative.FullBanner fullBanner, boolean z, float f, deleteProfile deleteprofile, boolean z2, boolean z3, Function2 function2, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = asInterface + 41;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {fullBanner, Boolean.valueOf(z), Float.valueOf(f), deleteprofile, Boolean.valueOf(z2), Boolean.valueOf(z3), function2, function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onNavigationEvent(44250978, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -44250977, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        Unit unit = Unit.INSTANCE;
        int i6 = asBinder + 11;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function2 function2) {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        Unit unit = (Unit) onNavigationEvent(-1994718936, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{function2}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1994718936, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
        int i4 = asInterface + 55;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 111;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(function0);
        }
        IAuthTabCallback(function0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function2 function2) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onTransact(function2);
            throw null;
        }
        Unit unitOnTransact = onTransact(function2);
        int i3 = asBinder + 31;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnTransact;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(getsupportedhighspeedresolutionsfor, futures3);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutionsfor, futures3);
        int i3 = asBinder + 13;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i);
        int i9 = ~i;
        int i10 = ~((~i3) | i9);
        int i11 = ~(i9 | i5);
        int i12 = i10 | i11;
        int i13 = (~(i3 | i7)) | i11 | i8;
        int i14 = i + i5 + i2 + ((-168536539) * i6) + (1787681333 * i4);
        int i15 = i14 * i14;
        int i16 = ((-1349843359) * i) + 1460535296 + ((-923239215) * i5) + ((-1716058528) * i8) + (i12 * (-1289454384)) + ((-1289454384) * i13) + (366215168 * i2) + (1604583424 * i6) + (216268800 * i4) + (1778253824 * i15);
        int i17 = (i * (-925914073)) + 175428941 + (i5 * (-925912777)) + (i8 * (-864)) + (i12 * 432) + (i13 * 432) + (i2 * (-925913209)) + (i6 * 1252505731) + (i4 * 30625011) + (i15 * (-2030960640));
        int i18 = i16 + (i17 * i17 * 899809280);
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        NativeAdsDto.Creative.FullBanner fullBanner = (NativeAdsDto.Creative.FullBanner) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        float fFloatValue = ((Number) objArr[2]).floatValue();
        deleteProfile deleteprofile = (deleteProfile) objArr[3];
        boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[5]).booleanValue();
        Function2 function2 = (Function2) objArr[6];
        Function0 function0 = (Function0) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue2 = ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        int i2 = asBinder + 29;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(fullBanner, zBooleanValue, fFloatValue, deleteprofile, zBooleanValue2, zBooleanValue3, function2, function0, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i4 = asInterface + 41;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(float f, float f2, setContentInsetsRelative setcontentinsetsrelative, Function2 function2, NativeAdsDto.Creative.FullBanner fullBanner, boolean z, boolean z2, Function0 function0, boolean z3, Resources resources, long j, boolean z4, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 61;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(f, f2, setcontentinsetsrelative, function2, fullBanner, z, z2, function0, z3, resources, j, z4, r8lambdanm9dm2eewl4vrptnjmesfjqky4, focusMeteringControlExternalSyntheticLambda9, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asInterface + 77;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = asInterface + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(useandconfigureprogramwithtexture);
        int i4 = asInterface + 65;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsDto.Creative.FullBanner fullBanner, boolean z, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 7;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(fullBanner, z, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asInterface + 99;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function2 function2) {
        int i = 2 % 2;
        int i2 = asBinder + 101;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            asInterface(function2);
            throw null;
        }
        Unit unitAsInterface = asInterface(function2);
        int i3 = asBinder + 49;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return unitAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 85;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(highSpeedResolverExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 59;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = asInterface + 71;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(useandconfigureprogramwithtexture);
        int i4 = asInterface + 19;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = asInterface + 77;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(futures3, "");
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Integer.valueOf((int) futures3.asBinder()));
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 67;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(String str, Resources resources, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) throws Resources.NotFoundException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str + resources.getString(R.string.ads_sdk_talkback_message_clickable));
        Unit unit = Unit.INSTANCE;
        int i2 = asBinder + 53;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 70 / 0;
        }
        return unit;
    }

    private static final Unit onWarmupCompleted(Resources resources, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        String string = resources.getString(R.string.ads_sdk_talkback_message_clickable);
        Intrinsics.checkNotNullExpressionValue(string, "");
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, string);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 43;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function2 function2 = (Function2) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function2.invoke("201", Boolean.TRUE);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 97;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = asInterface + 73;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = asInterface + 105;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2041199292, i, -1, "im.toss.ads_sdk.ui.screen.NativeAdsFullBannerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullBannerScreen.kt:139)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = verifyDrawable.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(onextracallback, onextracallbackwithresult.getInterfaceDescriptor()), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 9, (Object) null), ByteOrderedDataOutputStream.onExtraCallback(1325406518), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)));
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f));
            long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(11);
            int iIAuthTabCallback = createCameraCaptureCallback.Companion.IAuthTabCallback();
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"AD", quirksExternalSyntheticBackport0OnWarmupCompleted2, null, Long.valueOf(ByteOrderedDataOutputStream.onExtraCallbackWithResult(3825073662L)), Long.valueOf(jOnExtraCallback), 0L, null, null, createCameraCaptureCallback.onExtraCallback(iIAuthTabCallback), Float.valueOf(0.0f), null, null, 0L, 0, false, GraphicDeviceInfo.Companion.IAuthTabCallback(), null, cameraCaptureResultEmptyCameraCaptureResult, 27702, 196608, 98020}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i7 = asBinder + 7;
                asInterface = i7 % 128;
                if (i7 % 2 != 0) {
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

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function2 function2 = (Function2) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function2.invoke("101", Boolean.FALSE);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 63;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asInterface(Function2 function2) {
        int i = 2 % 2;
        int i2 = asInterface + 89;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            function2.invoke("102", Boolean.FALSE);
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        function2.invoke("102", Boolean.FALSE);
        Unit unit2 = Unit.INSTANCE;
        int i3 = asInterface + 121;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit onTransact(Function2 function2) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a((short) (24 - View.combineMeasuredStates(0, 0)), (byte) ((-1) - MotionEvent.axisFromString("")), 1205885042 + KeyEvent.normalizeMetaState(0), (-1840604617) - KeyEvent.keyCodeFromString(""), TextUtils.getOffsetBefore("", 0) - 9, objArr);
        function2.invoke(((String) objArr[0]).intern(), Boolean.TRUE);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 59;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallback(NativeAdsDto.Creative.FullBanner fullBanner, boolean z, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            z2 = true;
        } else {
            int i3 = asBinder + 83;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1880951283, i, -1, "im.toss.ads_sdk.ui.screen.NativeAdsFullBannerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullBannerScreen.kt:212)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{fullBanner.IAuthTabCallbackDefault(), null, null, Long.valueOf(z ? ByteOrderedDataOutputStream.onExtraCallbackWithResult(4281548107L) : setByteOrder.Companion.asBinder()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, GraphicDeviceInfo.Companion.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 196608, 98278}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = asInterface + 45;
                asBinder = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
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

    private static final Unit IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 77;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 43424), 42 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 22487 - AndroidCharacter.getMirror('0'), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 == 0) {
                j = -4629411779493505016L;
            } else {
                byte[] bArr = onExtraCallback;
                if (bArr != null) {
                    int i7 = $10 + 3;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i9 = 0; i9 < length; i9++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.indexOf("", "", 0, 0)), KeyEvent.keyCodeFromString("") + 55, 2166 - ImageFormat.getBitsPerPixel(0), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i10 = $10 + 61;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        byte[] bArr3 = onExtraCallback;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 43424), ((Process.getThreadPriority(0) + 20) >> 6) + 42, 22439 - View.getDefaultSize(0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i4 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] | (-4629411779493505016L))) << ((int) (onWarmupCompleted | (-4629411779493505016L)));
                    } else {
                        byte[] bArr4 = onExtraCallback;
                        try {
                            Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 43424), 42 - TextUtils.indexOf("", "", 0, 0), 22438 - TextUtils.lastIndexOf("", '0', 0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i4 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L)));
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iIntValue = (byte) i4;
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onNavigationEvent[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ j)) + i6;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), 86 - KeyEvent.normalizeMetaState(0), TextUtils.indexOf((CharSequence) "", '0') + 9568, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onExtraCallback;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i11 = 0; i11 < length2; i11++) {
                        bArr6[i11] = (byte) (bArr5[i11] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr6;
                }
                boolean z = bArr5 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        int i12 = $11 + 45;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        byte[] bArr7 = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private static final Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = asBinder + 31;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture);
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture);
        Unit unit2 = Unit.INSTANCE;
        int i3 = asInterface + 5;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 63;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(float f, float f2, setContentInsetsRelative setcontentinsetsrelative, Function2 function2, NativeAdsDto.Creative.FullBanner fullBanner, boolean z, boolean z2, Function0 function0, boolean z3, Resources resources, long j, boolean z4, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, FocusMeteringControlExternalSyntheticLambda9 focusMeteringControlExternalSyntheticLambda9, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z5;
        char c;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        long j2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(focusMeteringControlExternalSyntheticLambda9, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(focusMeteringControlExternalSyntheticLambda9) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = asInterface + 79;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1378048135, i2, -1, "im.toss.ads_sdk.ui.screen.NativeAdsFullBannerScreen.<anonymous> (NativeAdsFullBannerScreen.kt:89)");
            }
            float fMin = Math.min(RangesKt.coerceIn((focusMeteringControlExternalSyntheticLambda9.onWarmupCompleted() - 640.0f) / 200.0f, 0.0f, 1.0f), RangesKt.coerceIn((1.35f - f) / 0.35000002f, 0.0f, 1.0f));
            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f) + VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(48.0f) - VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)) * fMin));
            float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f) + VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f) - VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f)) * fMin));
            float fIAuthTabCallbackDefault = VirtualCameraCaptureResult.IAuthTabCallbackDefault(focusMeteringControlExternalSyntheticLambda9.onNavigationEvent());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(0, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
            if (((Number) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).floatValue() + f2 <= fIAuthTabCallbackDefault) {
                int i6 = asInterface + 13;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                z5 = true;
            } else {
                z5 = false;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, (QuirkSettingsLoader) null, false, 3, (Object) null), z5 ? onextracallbackwithresult.onExtraCallback() : onextracallbackwithresult.IAuthTabCallback_Parcel()).onExtraCallback(z5 ? quirksExternalSyntheticBackport0 : setContentInsetsAbsolute.IAuthTabCallback(quirksExternalSyntheticBackport0, setcontentinsetsrelative, false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null));
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized2 = new NativeAdsFullBannerScreenKt$.ExternalSyntheticLambda0(getsupportedhighspeedresolutionsfor);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized2);
            QuirkSettingsLoader.onNavigationEvent onnavigationeventOnTransact = onextracallbackwithresult.onTransact();
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onnavigationeventOnTransact, cameraCaptureResultEmptyCameraCaptureResult, 48);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent2);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i8 = asInterface + 61;
                asBinder = i8 % 128;
                int i9 = i8 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1 windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1 = WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult3 = windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onExtraCallbackWithResult(lowLightBoostControlExternalSyntheticLambda0.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, (QuirkSettingsLoader) null, false, 3, (Object) null), onextracallbackwithresult.onTransact()), 0, (WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, 3120, 2);
            component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult3);
            Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback3);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
            String strAsBinder = fullBanner.asBinder();
            if (StringsKt.isBlank(strAsBinder)) {
                strAsBinder = null;
            }
            if (strAsBinder != null) {
                int i10 = asBinder + 69;
                asInterface = i10 % 128;
                c = 2;
                if (i10 % 2 != 0) {
                    Object obj = null;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-493864252);
                    cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(strAsBinder);
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(resources);
                    cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    obj.hashCode();
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-493864252);
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(strAsBinder);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(resources);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((zOnNavigationEvent | zOnExtraCallback) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = new NativeAdsFullBannerScreenKt$.ExternalSyntheticLambda3(strAsBinder, resources);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                }
                quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, false, (Function1) objOnMinimized3, 1, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                c = 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-493692977);
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(resources);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnExtraCallback2 || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized4 = new NativeAdsFullBannerScreenKt$.ExternalSyntheticLambda4(resources);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                }
                quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, false, (Function1) objOnMinimized4, 1, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ensureNavButtonView.onExtraCallback(verifyDrawable.onExtraCallback(setExtensionStrength.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(Math.min(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(300.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(M_.onExtraCallback.asBinder()) - VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(60.0f))))), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f))), j, (toMetersPerSecond) null, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.5f), j, RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)));
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized5 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
            }
            Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized5;
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function2);
            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent2) {
                Object obj2 = objOnMinimized6;
                if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                    NativeAdsFullBannerScreenKt$.ExternalSyntheticLambda5 externalSyntheticLambda5 = new NativeAdsFullBannerScreenKt$.ExternalSyntheticLambda5(function2);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda5);
                    obj2 = externalSyntheticLambda5;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj2, 28, (Object) null).onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                String strOnTransact = fullBanner.onTransact();
                AppLovinFullscreenImmersiveActivity appLovinFullscreenImmersiveActivityIAuthTabCallback = showAndRender.IAuthTabCallback();
                AccessibilityUtilKtExternalSyntheticLambda1.IAuthTabCallback(strOnTransact, strAsBinder, setAdVideoPlaybackListener.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback3, "AsyncImage", strOnTransact, appLovinFullscreenImmersiveActivityIAuthTabCallback), (Function1) null, showAndRender.IAuthTabCallback(appLovinFullscreenImmersiveActivityIAuthTabCallback, (Function1) null), (QuirkSettingsLoader) null, (immediateFailedFuture) null, 0.0f, (seek) null, 0, false, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 2024);
                if (z4) {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-492685911);
                    setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(), 1.0f)), ForwardingCameraControl.onExtraCallback(2041199292, true, new NativeAdsFullBannerScreenKt$.ExternalSyntheticLambda6(highSpeedResolverExternalSyntheticLambda1), cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, accessgetCameraFactoryp.onNavigationEvent | 48);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-491576917);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport0, fIAuthTabCallback), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback4 = lowLightBoostControlExternalSyntheticLambda0.onExtraCallback(quirksExternalSyntheticBackport0, onextracallbackwithresult.onTransact());
                Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                    int i11 = asBinder + 125;
                    asInterface = i11 % 128;
                    int i12 = i11 % 2;
                    objOnMinimized7 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized7);
                    int i13 = asBinder + 41;
                    asInterface = i13 % 128;
                    int i14 = i13 % 2;
                }
                Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized7;
                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(function2);
                Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent3) {
                    Object obj3 = objOnMinimized8;
                    if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                        NativeAdsFullBannerScreenKt$.ExternalSyntheticLambda7 externalSyntheticLambda7 = new NativeAdsFullBannerScreenKt$.ExternalSyntheticLambda7(function2);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(externalSyntheticLambda7);
                        obj3 = externalSyntheticLambda7;
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult4 = windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onExtraCallbackWithResult(measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback4, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj3, 28, (Object) null), 1, (WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, 3120, 2);
                    String strAsInterface = fullBanner.asInterface();
                    long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(22);
                    createCameraCaptureCallback.IAuthTabCallback iAuthTabCallback = createCameraCaptureCallback.Companion;
                    int iIAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
                    GraphicDeviceInfo.IAuthTabCallback iAuthTabCallback2 = GraphicDeviceInfo.Companion;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strAsInterface, quirksExternalSyntheticBackport0OnExtraCallbackWithResult4, null, Long.valueOf(z ? setByteOrder.Companion.asBinder() : ByteOrderedDataOutputStream.onExtraCallbackWithResult(4281548107L)), Long.valueOf(jOnExtraCallback), 0L, null, null, createCameraCaptureCallback.onExtraCallback(iIAuthTabCallback), Float.valueOf(0.0f), null, null, 0L, 0, false, iAuthTabCallback2.IAuthTabCallback(), null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 196608, 98020}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult5 = windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onExtraCallbackWithResult(lowLightBoostControlExternalSyntheticLambda0.onExtraCallback(quirksExternalSyntheticBackport0, onextracallbackwithresult.onTransact()), 2, (WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, 3120, 2);
                    Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
                        int i15 = asInterface + 11;
                        asBinder = i15 % 128;
                        if (i15 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted());
                            throw null;
                        }
                        objOnMinimized9 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized9);
                    }
                    Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized9;
                    boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function2);
                    Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnNavigationEvent4) {
                        Object obj4 = objOnMinimized10;
                        if (objOnMinimized10 == onwarmupcompleted.onExtraCallback()) {
                            NativeAdsFullBannerScreenKt$.ExternalSyntheticLambda8 externalSyntheticLambda8 = new NativeAdsFullBannerScreenKt$.ExternalSyntheticLambda8(function2);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda8);
                            obj4 = externalSyntheticLambda8;
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult5, camera2CapturePipelineTorchTaskExternalSyntheticLambda23, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj4, 28, (Object) null);
                        String strIAuthTabCallbackStub = fullBanner.IAuthTabCallbackStub();
                        long jOnExtraCallback2 = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17);
                        int iIAuthTabCallback2 = iAuthTabCallback.IAuthTabCallback();
                        GraphicDeviceInfo graphicDeviceInfoOnNavigationEvent = iAuthTabCallback2.onNavigationEvent();
                        if (z) {
                            int i16 = asBinder + 85;
                            asInterface = i16 % 128;
                            int i17 = i16 % 2;
                            j2 = 3221093887L;
                        } else {
                            j2 = 4285232772L;
                        }
                        long jOnExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallbackWithResult(j2);
                        int i18 = asInterface + 119;
                        asBinder = i18 % 128;
                        int i19 = i18 % 2;
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strIAuthTabCallbackStub, quirksExternalSyntheticBackport0IAuthTabCallback, null, Long.valueOf(jOnExtraCallbackWithResult), Long.valueOf(jOnExtraCallback2), 0L, null, null, createCameraCaptureCallback.onExtraCallback(iIAuthTabCallback2), Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoOnNavigationEvent, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 196608, 98020}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport0, fIAuthTabCallback2), cameraCaptureResultEmptyCameraCaptureResult, 0);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult6 = windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onExtraCallbackWithResult(lowLightBoostControlExternalSyntheticLambda0.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, (QuirkSettingsLoader) null, false, 3, (Object) null), onextracallbackwithresult.onTransact()), 3, (WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, 3120, 2);
                        RoundedCornerShape roundedCornerShapeOnNavigationEvent = RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f));
                        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(28.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f));
                        getRequiredFeatureGroup getrequiredfeaturegroup = new getRequiredFeatureGroup(z ? setByteOrder.Companion.asBinder() : ByteOrderedDataOutputStream.onExtraCallbackWithResult(4281434870L), z ^ true ? setByteOrder.Companion.asBinder() : ByteOrderedDataOutputStream.onExtraCallbackWithResult(4281548107L), z ? setByteOrder.Companion.asBinder() : ByteOrderedDataOutputStream.onExtraCallbackWithResult(4281434870L), z ? ByteOrderedDataOutputStream.onExtraCallbackWithResult(4281548107L) : setByteOrder.Companion.asBinder(), (DefaultConstructorMarker) null);
                        boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function2);
                        Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!zOnNavigationEvent5) {
                            Object obj5 = objOnMinimized11;
                            if (objOnMinimized11 == onwarmupcompleted.onExtraCallback()) {
                                NativeAdsFullBannerScreenKt$.ExternalSyntheticLambda9 externalSyntheticLambda9 = new NativeAdsFullBannerScreenKt$.ExternalSyntheticLambda9(function2);
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda9);
                                obj5 = externalSyntheticLambda9;
                            }
                            getFrameRateRange.onExtraCallback((Function0) obj5, quirksExternalSyntheticBackport0OnExtraCallbackWithResult6, false, roundedCornerShapeOnNavigationEvent, getrequiredfeaturegroup, (getSessionType) null, (getCurrentMenuItems) null, deviceQuirksExternalSyntheticLambda0OnWarmupCompleted, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, ForwardingCameraControl.onExtraCallback(-1880951283, true, new NativeAdsFullBannerScreenKt$.ExternalSyntheticLambda10(fullBanner, z), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 817889280, 356);
                            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                            if (z2) {
                                int i20 = asBinder + 31;
                                asInterface = i20 % 128;
                                int i21 = i20 % 2;
                                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1073441345);
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback5 = lowLightBoostControlExternalSyntheticLambda0.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport0, (QuirkSettingsLoader) null, false, 3, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f)), onextracallbackwithresult.onTransact());
                                boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                                Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (!zOnNavigationEvent6) {
                                    Object obj6 = objOnMinimized12;
                                    if (objOnMinimized12 == onwarmupcompleted.onExtraCallback()) {
                                        NativeAdsFullBannerScreenKt$.ExternalSyntheticLambda11 externalSyntheticLambda11 = new NativeAdsFullBannerScreenKt$.ExternalSyntheticLambda11(function0);
                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda11);
                                        obj6 = externalSyntheticLambda11;
                                    }
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback6 = measureChildConstrained.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback5, false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) obj6, 15, (Object) null);
                                    if (z3) {
                                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-865900748);
                                        quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onWarmupCompleted(quirksExternalSyntheticBackport0, 0, cameraCaptureResultEmptyCameraCaptureResult, 438, 0);
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-865899532);
                                        quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, 4, (WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, 3126, 2);
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback7 = quirksExternalSyntheticBackport0OnExtraCallback6.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult2);
                                    component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onextracallbackwithresult.access000(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                                    int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback7);
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
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult2.asInterface());
                                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult2.onWarmupCompleted());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult2.onNavigationEvent());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult2.onTransact());
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback8 = rowScopeInstance.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(18.0f)), onextracallbackwithresult.IAuthTabCallbackDefault());
                                    Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (objOnMinimized13 == onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized13 = new NativeAdsFullBannerScreenKt$.ExternalSyntheticLambda1();
                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized13);
                                    }
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult7 = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback8, false, (Function1) objOnMinimized13, 1, (Object) null);
                                    seek seekVarOnNavigationEvent = seek.onExtraCallbackWithResult.onNavigationEvent(seek.Companion, z ? ByteOrderedDataOutputStream.onExtraCallback(2029187839) : ByteOrderedDataOutputStream.onExtraCallbackWithResult(4287337889L), 0, 2, (Object) null);
                                    AppLovinFullscreenImmersiveActivity appLovinFullscreenImmersiveActivityIAuthTabCallback2 = showAndRender.IAuthTabCallback();
                                    Object[] objArr = new Object[1];
                                    a((short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 114), (byte) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1205884986, (-1840604561) - (ViewConfiguration.getFadingEdgeLength() >> 16), (-9) - Color.green(0), objArr);
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult8 = setAdVideoPlaybackListener.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult7, "AsyncImage", ((String) objArr[0]).intern(), appLovinFullscreenImmersiveActivityIAuthTabCallback2);
                                    Function1 function1IAuthTabCallback = showAndRender.IAuthTabCallback(appLovinFullscreenImmersiveActivityIAuthTabCallback2, (Function1) null);
                                    Object[] objArr2 = new Object[1];
                                    a((short) ((-113) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (byte) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 1205884986 - (Process.myPid() >> 22), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 1840604561, TextUtils.indexOf("", "") - 9, objArr2);
                                    AccessibilityUtilKtExternalSyntheticLambda1.IAuthTabCallback(((String) objArr2[0]).intern(), (String) null, quirksExternalSyntheticBackport0OnExtraCallbackWithResult8, (Function1) null, function1IAuthTabCallback, (QuirkSettingsLoader) null, (immediateFailedFuture) null, 0.0f, seekVarOnNavigationEvent, 0, false, cameraCaptureResultEmptyCameraCaptureResult, 54, 0, 1768);
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0AsBinder = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f));
                                    Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (objOnMinimized14 == onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized14 = new NativeAdsFullBannerScreenKt$.ExternalSyntheticLambda2();
                                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized14);
                                    }
                                    FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0AsBinder, (Function1) objOnMinimized14), cameraCaptureResultEmptyCameraCaptureResult, 0);
                                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.ads_sdk_close, cameraCaptureResultEmptyCameraCaptureResult, 0), rowScopeInstance.onExtraCallback(quirksExternalSyntheticBackport0, onextracallbackwithresult.IAuthTabCallbackDefault()), null, Long.valueOf(z ? ByteOrderedDataOutputStream.onExtraCallback(2029187839) : ByteOrderedDataOutputStream.onExtraCallbackWithResult(4287337889L)), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(16)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, iAuthTabCallback2.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                }
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1071836475);
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
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

    /* JADX WARN: Removed duplicated region for block: B:76:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x023e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i;
        NativeAdsDto.Creative.FullBanner fullBanner;
        Object obj;
        int i2;
        Function0 function0;
        Function2 function2;
        boolean z;
        boolean z2;
        deleteProfile deleteprofile;
        boolean z3;
        float f;
        int i3;
        int i4;
        NativeAdsDto.Creative.FullBanner fullBanner2 = (NativeAdsDto.Creative.FullBanner) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        float fFloatValue = ((Number) objArr[2]).floatValue();
        deleteProfile deleteprofile2 = (deleteProfile) objArr[3];
        boolean zBooleanValue2 = ((Boolean) objArr[4]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[5]).booleanValue();
        Function2 function22 = (Function2) objArr[6];
        Function0 function02 = (Function0) objArr[7];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(fullBanner2, "");
        Intrinsics.checkNotNullParameter(deleteprofile2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        Intrinsics.checkNotNullParameter(function02, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(260940431);
        if ((iIntValue & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(fullBanner2) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            int i6 = asInterface + 51;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue)) {
                int i8 = asBinder + 89;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
                i4 = 256;
            } else {
                i4 = 128;
            }
            i |= i4;
        }
        if ((iIntValue & 3072) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(deleteprofile2.ordinal()) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue2) ? 16384 : 8192;
        }
        Object obj2 = null;
        if ((196608 & iIntValue) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue3)) {
                int i10 = asBinder + 83;
                asInterface = i10 % 128;
                if (i10 % 2 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i |= i3;
            int i11 = asInterface + 61;
            asBinder = i11 % 128;
            int i12 = i11 % 2;
        }
        if ((1572864 & iIntValue) == 0) {
            int i13 = asInterface + 117;
            asBinder = i13 % 128;
            int i14 = i13 % 2;
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22) ? 1048576 : 524288;
        }
        if ((12582912 & iIntValue) == 0) {
            i |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ^ true) ? 8388608 : 4194304;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i) != 4793490, i & 1)) {
            int i15 = asInterface + 11;
            asBinder = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 41 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i17 = asInterface + 31;
                    asBinder = i17 % 128;
                    if (i17 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(260940431, i, -1, "im.toss.ads_sdk.ui.screen.NativeAdsFullBannerScreen (NativeAdsFullBannerScreen.kt:73)");
                        int i18 = 50 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(260940431, i, -1, "im.toss.ads_sdk.ui.screen.NativeAdsFullBannerScreen (NativeAdsFullBannerScreen.kt:73)");
                    }
                }
                boolean zOnExtraCallbackWithResult = getStrokeWidth.onExtraCallback.onExtraCallbackWithResult(deleteprofile2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i >> 9) & 14) | 48);
                Resources resources = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
                Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                long jOnExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(!zOnExtraCallbackWithResult ? 484039167 : 218243143);
                r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                float fOnExtraCallback = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(fFloatValue);
                setContentInsetsRelative setcontentinsetsrelativeIAuthTabCallback = setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                i2 = iIntValue;
                function0 = function02;
                function2 = function22;
                z = zBooleanValue3;
                obj = null;
                z2 = zBooleanValue2;
                deleteprofile = deleteprofile2;
                z3 = zBooleanValue;
                f = fFloatValue;
                fullBanner = fullBanner2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                FocusMeteringControlExternalSyntheticLambda8.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 0.0f, 0.0f, fFloatValue, 7, (Object) null), 0.0f, 1, (Object) null), (QuirkSettingsLoader) null, false, ForwardingCameraControl.onExtraCallback(-1378048135, true, new NativeAdsFullBannerScreenKt$.ExternalSyntheticLambda12(Math.min(context.getApplicationContext().getResources().getConfiguration().fontScale, 1.35f), fOnExtraCallback, setcontentinsetsrelativeIAuthTabCallback, function2, fullBanner2, zOnExtraCallbackWithResult, zBooleanValue2, function0, z, resources, jOnExtraCallback, z3, r8lambdanm9dm2eewl4vrptnjmesfjqky4), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3072, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                boolean zOnExtraCallbackWithResult2 = getStrokeWidth.onExtraCallback.onExtraCallbackWithResult(deleteprofile2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i >> 9) & 14) | 48);
                Resources resources2 = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
                Context context2 = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                long jOnExtraCallback2 = ByteOrderedDataOutputStream.onExtraCallback(!zOnExtraCallbackWithResult2 ? 484039167 : 218243143);
                r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky42 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                float fOnExtraCallback2 = r8lambdanm9dm2eewl4vrptnjmesfjqky42.onExtraCallback(fFloatValue);
                setContentInsetsRelative setcontentinsetsrelativeIAuthTabCallback2 = setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                i2 = iIntValue;
                function0 = function02;
                function2 = function22;
                z = zBooleanValue3;
                obj = null;
                z2 = zBooleanValue2;
                deleteprofile = deleteprofile2;
                z3 = zBooleanValue;
                f = fFloatValue;
                fullBanner = fullBanner2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                FocusMeteringControlExternalSyntheticLambda8.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 0.0f, 0.0f, fFloatValue, 7, (Object) null), 0.0f, 1, (Object) null), (QuirkSettingsLoader) null, false, ForwardingCameraControl.onExtraCallback(-1378048135, true, new NativeAdsFullBannerScreenKt$.ExternalSyntheticLambda12(Math.min(context2.getApplicationContext().getResources().getConfiguration().fontScale, 1.35f), fOnExtraCallback2, setcontentinsetsrelativeIAuthTabCallback2, function2, fullBanner2, zOnExtraCallbackWithResult2, zBooleanValue2, function0, z, resources2, jOnExtraCallback2, z3, r8lambdanm9dm2eewl4vrptnjmesfjqky42), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3072, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            fullBanner = fullBanner2;
            obj = null;
            i2 = iIntValue;
            function0 = function02;
            function2 = function22;
            z = zBooleanValue3;
            z2 = zBooleanValue2;
            deleteprofile = deleteprofile2;
            z3 = zBooleanValue;
            f = fFloatValue;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new NativeAdsFullBannerScreenKt$.ExternalSyntheticLambda13(fullBanner, z3, f, deleteprofile, z2, z, function2, function0, i2));
        }
        return obj;
    }

    public static /* synthetic */ Unit onWarmupCompleted(NativeAdsDto.Creative.FullBanner fullBanner, boolean z, float f, deleteProfile deleteprofile, boolean z2, boolean z3, Function2 function2, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {fullBanner, Boolean.valueOf(z), Float.valueOf(f), deleteprofile, Boolean.valueOf(z2), Boolean.valueOf(z3), function2, function0, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(1488748416, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1488748414, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(-1853070937, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{function0}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1853070941, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    public static final void onExtraCallbackWithResult(@NotNull NativeAdsDto.Creative.FullBanner fullBanner, boolean z, float f, @NotNull deleteProfile deleteprofile, boolean z2, boolean z3, @NotNull Function2<? super String, ? super Boolean, Unit> function2, @NotNull Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {fullBanner, Boolean.valueOf(z), Float.valueOf(f), deleteprofile, Boolean.valueOf(z2), Boolean.valueOf(z3), function2, function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        onNavigationEvent(44250978, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, objArr, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -44250977, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit onNavigationEvent(Function2 function2) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(-1994718936, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{function2}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), 1994718936, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }

    private static final Unit IAuthTabCallbackStub(Function2 function2) {
        int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(1448745146, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback, new Object[]{function2}, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), -1448745143, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback());
    }
}
