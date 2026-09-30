package o;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.ui.v2.screen.NativeAdsFullPageV2ScreenKt$;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.GraphicDeviceInfo;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1;
import o.readFully;
import o.setByteOrder;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getWindowAreaStatus {
    private static short[] IAuthTabCallback;
    private static final byte[] $$a = {4, 8, -22, -73};
    private static final int $$b = 78;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallbackWithResult = -1145661223;
    private static int onWarmupCompleted = -1538795483;
    private static int onNavigationEvent = 1320358547;
    private static byte[] onExtraCallback = {8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, byte b3) {
        int i;
        int i2 = b2 * 3;
        int i3 = 4 - (b * 3);
        byte[] bArr = $$a;
        int i4 = (b3 * 4) + 115;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        if (bArr == null) {
            int i6 = i3;
            int i7 = i5;
            int i8 = 0;
            int i9 = i6 + 1;
            int i10 = (-i3) + i7;
            i = i8;
            i4 = i10;
            i3 = i9;
            bArr2[i] = (byte) i4;
            i8 = i + 1;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            int i11 = i4;
            i6 = i3;
            i3 = bArr[i3];
            i7 = i11;
            int i92 = i6 + 1;
            int i102 = (-i3) + i7;
            i = i8;
            i4 = i102;
            i3 = i92;
            bArr2[i] = (byte) i4;
            i8 = i + 1;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i4;
            i8 = i + 1;
            if (i == i5) {
            }
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i4);
        int i11 = ~i4;
        int i12 = (~(i7 | i2)) | (~(i8 | i11)) | (~(i8 | i));
        int i13 = ~(i11 | i9);
        int i14 = i + i2 + i3 + (1938118820 * i6) + ((-1869228383) * i5);
        int i15 = i14 * i14;
        int i16 = (i * (-1046486968)) + 2037645312 + ((-1046486968) * i2) + (1604861810 * i10) + (i12 * (-1345052743)) + ((-1345052743) * i13) + (1903427584 * i3) + ((-1907359744) * i6) + (1374945280 * i5) + (1516044288 * i15);
        int i17 = ((i * 647972376) - 1941852458) + (i2 * 647972376) + (i10 * 1702) + (i12 * 851) + (i13 * 851) + (i3 * 647973227) + (i6 * (-1260466036)) + (i5 * 1557372491) + (i15 * 1239351296);
        switch (i16 + (i17 * i17 * 490405888)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[0];
                getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2 = (getSupportedHighSpeedResolutions) objArr[1];
                SessionProcessorCaptureCallback sessionProcessorCaptureCallback = (SessionProcessorCaptureCallback) objArr[2];
                int i18 = 2 % 2;
                Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
                removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = sessionProcessorCaptureCallback.onExtraCallbackWithResult(new NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda20(readFully.onExtraCallback.IAuthTabCallback(readFully.Companion, new Pair[]{getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault())), getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(ByteOrderedDataOutputStream.onExtraCallbackWithResult(3892447507L), 0.8f)))}, -onExtraCallbackWithResult(getsupportedhighspeedresolutions), onNavigationEvent(getsupportedhighspeedresolutions2) - onExtraCallbackWithResult(getsupportedhighspeedresolutions), 0, 8, (Object) null)));
                int i19 = onTransact + 99;
                IAuthTabCallbackDefault = i19 % 128;
                int i20 = i19 % 2;
                return removeobserverlockedOnExtraCallbackWithResult;
            case 7:
                return asInterface(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[0];
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2 = (getSupportedHighSpeedResolutions) objArr[1];
        SessionProcessorCaptureCallback sessionProcessorCaptureCallback = (SessionProcessorCaptureCallback) objArr[2];
        int i = 2 % 2;
        int i2 = onTransact + 67;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        removeObserverLocked removeobserverlocked = (removeObserverLocked) IAuthTabCallback(-1680521738, 1680521744, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{getsupportedhighspeedresolutions, getsupportedhighspeedresolutions2, sessionProcessorCaptureCallback}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
        int i4 = IAuthTabCallbackDefault + 5;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return removeobserverlocked;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(function1);
        int i4 = onTransact + 15;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getsupportedhighspeedresolutions, futures3);
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(boolean z, NativeAdsDto.Creative.FullPage fullPage, float f, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 9;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {Boolean.valueOf(z), fullPage, Float.valueOf(f), function1, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(-1514753706, 1514753713, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
        int i6 = onTransact + 101;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 69;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            extraCallbackWithResult(useandconfigureprogramwithtexture);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitExtraCallbackWithResult = extraCallbackWithResult(useandconfigureprogramwithtexture);
        int i3 = onTransact + 1;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unitExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onTransact + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit typedObject = readTypedObject(useandconfigureprogramwithtexture);
        int i4 = onTransact + 101;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return typedObject;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return ICustomTabsCallback(useandconfigureprogramwithtexture);
        }
        ICustomTabsCallback(useandconfigureprogramwithtexture);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        NativeAdsDto.Creative.FullPage fullPage = (NativeAdsDto.Creative.FullPage) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        Function1 function1 = (Function1) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onTransact + 79;
        IAuthTabCallbackDefault = i2 % 128;
        IAuthTabCallback(zBooleanValue, fullPage, fFloatValue, function1, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 == 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asInterface(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 7;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            return (Unit) IAuthTabCallback(932216786, -932216782, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{useandconfigureprogramwithtexture}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
        }
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 41;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(-591369796, 591369799, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{function1}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
        int i4 = onTransact + 33;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1) {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(function1);
        int i4 = IAuthTabCallbackDefault + 33;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(getsupportedhighspeedresolutions, futures3);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutions, futures3);
        int i3 = IAuthTabCallbackDefault + 59;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(useandconfigureprogramwithtexture);
        int i4 = IAuthTabCallbackDefault + 19;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess000;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 29;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(function1);
        int i4 = onTransact + 25;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return interfaceDescriptor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, NativeAdsDto.Creative.FullPage fullPage, boolean z, float f, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 105;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, fullPage, z, f, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackDefault + 13;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(readfully, setorientationdegrees);
        int i4 = onTransact + 109;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(useandconfigureprogramwithtexture);
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        return unitAccess100;
    }

    public static /* synthetic */ Unit onTransact(Function1 function1) {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(1348018980, -1348018975, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{function1}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
        int i4 = IAuthTabCallbackDefault + 109;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 53 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onTransact(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStubProxy(useandconfigureprogramwithtexture);
        }
        IAuthTabCallbackStubProxy(useandconfigureprogramwithtexture);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(useandconfigureprogramwithtexture);
        int i4 = IAuthTabCallbackDefault + 17;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 11;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            access100(function1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitAccess100 = access100(function1);
        int i3 = onTransact + 107;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return unitAccess100;
    }

    public static /* synthetic */ Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 111;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(useandconfigureprogramwithtexture);
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        return interfaceDescriptor;
    }

    private static final Unit IAuthTabCallbackStub(Function1 function1) {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        function1.invoke((Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 105;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit asBinder(Function1 function1) {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("2003");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 15;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onTransact + 75;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(futures3, "");
            IAuthTabCallback(-579097123, 579097124, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{getsupportedhighspeedresolutions, Float.valueOf((int) futures3.asBinder())}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(futures3, "");
        IAuthTabCallback(-579097123, 579097124, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{getsupportedhighspeedresolutions, Float.valueOf((int) futures3.asBinder())}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackDefault + 17;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit asBinder(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 117;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 63;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 121;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke("2003");
            return Unit.INSTANCE;
        }
        function1.invoke("2003");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit IAuthTabCallbackStubProxy(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        int i3 = 95 / 0;
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke("1000");
            return Unit.INSTANCE;
        }
        function1.invoke("1000");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit access100(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onTransact + 109;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        int i3 = 36 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit getInterfaceDescriptor(Function1 function1) {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("1002");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 71;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit access000(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 47;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit getInterfaceDescriptor(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onTransact + 31;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onTransact + 77;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 89 / 0;
        }
        return unit2;
    }

    private static final Unit access100(Function1 function1) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a((short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) (12 - (Process.myPid() >> 22)), (-535904466) + (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 353056149 - Color.red(0), (Process.myPid() >> 22) - 44, objArr);
        function1.invoke(((String) objArr[0]).intern());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 17;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(futures3, "");
            onExtraCallback(getsupportedhighspeedresolutions, Float.intBitsToFloat((int) FuturesCallbackListener.onWarmupCompleted(futures3)));
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(futures3, "");
        onExtraCallback(getsupportedhighspeedresolutions, Float.intBitsToFloat((int) FuturesCallbackListener.onWarmupCompleted(futures3)));
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 63;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture);
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackDefault + 27;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 82 / 0;
        }
        return unit2;
    }

    private static final Unit IAuthTabCallback(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        setOrientationDegrees.onExtraCallback(setorientationdegrees, readfully, 0L, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 126, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 79;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return unit;
    }

    private static final Unit readTypedObject(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 59;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        int i5;
        int length;
        byte[] bArr;
        int i6 = 2;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), TextUtils.lastIndexOf("", '0', 0) + 43, 22438 - Process.getGidForName(""), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                int i8 = $11;
                int i9 = i8 + 121;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                byte[] bArr2 = onExtraCallback;
                long j2 = 0;
                if (bArr2 != null) {
                    int i11 = i8 + 3;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    int i12 = 0;
                    while (i12 < length) {
                        int i13 = $11 + 67;
                        $10 = i13 % 128;
                        int i14 = i13 % i6;
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i12])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char absoluteGravity = (char) (12843 - Gravity.getAbsoluteGravity(0, 0));
                                int fadingEdgeLength = 55 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                int i15 = (SystemClock.uptimeMillis() > j2 ? 1 : (SystemClock.uptimeMillis() == j2 ? 0 : -1)) + 2166;
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(absoluteGravity, fadingEdgeLength, i15, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr[i12] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i12++;
                            i6 = 2;
                            j2 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    int i16 = $11 + 23;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        byte[] bArr3 = onExtraCallback;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (Process.myTid() >> 22)), (KeyEvent.getMaxKeyCode() >> 16) + 42, 22439 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] - (-4629411779493505016L))) / ((int) (onWarmupCompleted & (-4629411779493505016L)));
                    } else {
                        byte[] bArr4 = onExtraCallback;
                        try {
                            Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(onExtraCallbackWithResult)};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43425), 42 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L)));
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    iIntValue = (byte) i5;
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (IAuthTabCallback[i + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i17 = ((i + iIntValue) - 2) + ((int) (onExtraCallbackWithResult ^ j));
                if (z) {
                    int i18 = $10 + 1;
                    $11 = i18 % 128;
                    int i19 = i18 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i17 + i4;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onNavigationEvent), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 86 - (Process.myTid() >> 22), (ViewConfiguration.getWindowTouchSlop() >> 8) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onExtraCallback;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i20 = 0; i20 < length2; i20++) {
                        bArr6[i20] = (byte) (bArr5[i20] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr6;
                }
                boolean z2 = bArr5 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i21 = $10 + 67;
                    $11 = i21 % 128;
                    int i22 = i21 % 2;
                    if (z2) {
                        byte[] bArr7 = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = IAuthTabCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    private static final Unit ICustomTabsCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 79;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return unit;
    }

    private static final Unit extraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onTransact + 109;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 71;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(Function1 function1, NativeAdsDto.Creative.FullPage fullPage, boolean z, float f, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object obj;
        Object objOnMinimized;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        Object objOnMinimized2;
        boolean zOnNavigationEvent;
        Object obj2;
        Object objOnMinimized3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        int i2;
        Object objOnMinimized4;
        Object objOnMinimized5;
        Object objOnMinimized6;
        boolean zOnNavigationEvent2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4;
        int i3 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i4 = onTransact + 35;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2004980295, i, -1, "im.toss.ads_sdk.ui.v2.screen.NativeAdsFullPageV2Screen.<anonymous> (NativeAdsFullPageV2Screen.kt:65)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object obj3 = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized7 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized7);
            }
            Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized7;
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent3) {
                Object obj4 = objOnMinimized8;
                if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                    NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda0(function1);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda0);
                    obj4 = externalSyntheticLambda0;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj4, 28, (Object) null);
                FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback);
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
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(lowLightBoostControlExternalSyntheticLambda0, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null);
                Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized9 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized9);
                }
                Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized9;
                boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent4) {
                    Object obj5 = objOnMinimized10;
                    if (objOnMinimized10 == onwarmupcompleted.onExtraCallback()) {
                        NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda9 externalSyntheticLambda9 = new NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda9(function1);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda9);
                        obj5 = externalSyntheticLambda9;
                    }
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent2, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj5, 28, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, 0);
                    Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized11 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized11 = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized11);
                    }
                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objOnMinimized11;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null);
                    setByteOrder.onExtraCallbackWithResult onextracallbackwithresult3 = setByteOrder.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = setMaxAdCount.onExtraCallback(quirksExternalSyntheticBackport0OnWarmupCompleted2, new Pair[]{new Pair(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(onextracallbackwithresult3.IAuthTabCallbackDefault())), new Pair(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(ByteOrderedDataOutputStream.onExtraCallbackWithResult(3892447507L), 0.8f)))}, 90.0f, 0, cameraCaptureResultEmptyCameraCaptureResult, 390, 4);
                    Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized12 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized12 = new NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda10(getsupportedhighspeedresolutions);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized12);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent3 = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized12);
                    Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized13 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized13 = new NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda11();
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized13);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = submit.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnNavigationEvent3, false, (Function1) objOnMinimized13, 1, (Object) null), 1.0f);
                    component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        int i6 = onTransact + 89;
                        IAuthTabCallbackDefault = i6 % 128;
                        if (i6 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                            obj3.hashCode();
                            throw null;
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(178.0f));
                    Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized14 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized14 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized14);
                        int i7 = IAuthTabCallbackDefault + 105;
                        onTransact = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized14;
                    boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                    Object objOnMinimized15 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnNavigationEvent5) {
                        Object obj6 = objOnMinimized15;
                        if (objOnMinimized15 == onwarmupcompleted.onExtraCallback()) {
                            NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda12 externalSyntheticLambda12 = new NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda12(function1);
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda12);
                            obj6 = externalSyntheticLambda12;
                        }
                        ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback2, camera2CapturePipelineTorchTaskExternalSyntheticLambda23, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj6, 28, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, 0);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback3 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(13.0f));
                        Object objOnMinimized16 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (objOnMinimized16 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized16 = new NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda13();
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized16);
                        }
                        ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback3, (Function1) objOnMinimized16), cameraCaptureResultEmptyCameraCaptureResult, 0);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null);
                        component5 component5VarOnNavigationEvent3 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                        int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted4);
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
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnNavigationEvent3, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted5, onextracallbackwithresult2.onTransact());
                        WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1 windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1 = WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.IAuthTabCallback;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = lowLightBoostControlExternalSyntheticLambda0.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, (QuirkSettingsLoader) null, false, 3, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 2, (Object) null), onextracallbackwithresult.IAuthTabCallbackStubProxy());
                        Object objOnMinimized17 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (objOnMinimized17 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized17 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized17);
                        }
                        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized17;
                        boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                        Object objOnMinimized18 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!zOnNavigationEvent6) {
                            int i9 = onTransact + 39;
                            IAuthTabCallbackDefault = i9 % 128;
                            int i10 = i9 % 2;
                            obj = objOnMinimized18;
                            if (objOnMinimized18 == onwarmupcompleted.onExtraCallback()) {
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onExtraCallbackWithResult(measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback2, camera2CapturePipelineTorchTaskExternalSyntheticLambda24, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj, 28, (Object) null), 0, (WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, 3120, 2);
                            String strAsInterface = fullPage.asInterface();
                            long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(26);
                            GraphicDeviceInfo.IAuthTabCallback iAuthTabCallback = GraphicDeviceInfo.Companion;
                            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strAsInterface, quirksExternalSyntheticBackport0OnExtraCallbackWithResult2, null, Long.valueOf(onextracallbackwithresult3.asBinder()), Long.valueOf(jOnExtraCallback), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, iAuthTabCallback.IAuthTabCallback(), null, cameraCaptureResultEmptyCameraCaptureResult, 27648, 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback4 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
                            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (objOnMinimized != onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized = new NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda15();
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                            }
                            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback4, (Function1) objOnMinimized), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = lowLightBoostControlExternalSyntheticLambda0.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, (QuirkSettingsLoader) null, false, 3, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 2, (Object) null), onextracallbackwithresult.IAuthTabCallbackStubProxy());
                            objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                                int i11 = onTransact + 99;
                                IAuthTabCallbackDefault = i11 % 128;
                                int i12 = i11 % 2;
                                objOnMinimized2 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                            }
                            Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda25 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized2;
                            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(function1);
                            Object objOnMinimized19 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (zOnNavigationEvent) {
                                int i13 = onTransact + 87;
                                IAuthTabCallbackDefault = i13 % 128;
                                if (i13 % 2 == 0) {
                                    int i14 = 54 / 0;
                                    obj2 = objOnMinimized19;
                                    if (objOnMinimized19 == onwarmupcompleted.onExtraCallback()) {
                                        NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda16 externalSyntheticLambda16 = new NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda16(function1);
                                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(externalSyntheticLambda16);
                                        obj2 = externalSyntheticLambda16;
                                    }
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult3 = windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onExtraCallbackWithResult(measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback3, camera2CapturePipelineTorchTaskExternalSyntheticLambda25, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj2, 28, (Object) null), 1, (WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, 3120, 2);
                                    String strIAuthTabCallbackStub = fullPage.IAuthTabCallbackStub();
                                    if (z) {
                                        strIAuthTabCallbackStub = strIAuthTabCallbackStub + " ・ AD";
                                    }
                                    long jOnExtraCallback2 = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17);
                                    GraphicDeviceInfo graphicDeviceInfoOnNavigationEvent = iAuthTabCallback.onNavigationEvent();
                                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strIAuthTabCallbackStub, quirksExternalSyntheticBackport0OnExtraCallbackWithResult3, null, Long.valueOf(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).ITrustedWebActivityServiceDefault()), Long.valueOf(jOnExtraCallback2), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoOnNavigationEvent, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback4 = verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), getMaxAdCount.onExtraCallbackWithResult(ByteOrderedDataOutputStream.onExtraCallbackWithResult(3892447507L), 0.8f), (toMetersPerSecond) null, 2, (Object) null);
                                    objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (objOnMinimized3 != onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized3 = new NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda17();
                                        cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult;
                                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized3);
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult;
                                    }
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult4 = submit.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback4, false, (Function1) objOnMinimized3, 1, (Object) null), 0.0f);
                                    component5 component5VarOnNavigationEvent4 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult3, 0);
                                    int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, 0));
                                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted6 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult3, quirksExternalSyntheticBackport0OnExtraCallbackWithResult4);
                                    Function0 function0IAuthTabCallback4 = onextracallbackwithresult2.IAuthTabCallback();
                                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() != null) {
                                        int i15 = onTransact + 57;
                                        IAuthTabCallbackDefault = i15 % 128;
                                        i2 = 2;
                                        if (i15 % 2 == 0) {
                                            getAwbState.onExtraCallback();
                                            throw null;
                                        }
                                        getAwbState.onExtraCallback();
                                    } else {
                                        i2 = 2;
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                                    } else {
                                        int i16 = onTransact + 83;
                                        IAuthTabCallbackDefault = i16 % 128;
                                        if (i16 % i2 == 0) {
                                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0IAuthTabCallback4);
                                            throw null;
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0IAuthTabCallback4);
                                    }
                                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnNavigationEvent4, onextracallbackwithresult2.asBinder());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult2.asInterface());
                                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult2.onWarmupCompleted());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult2.onNavigationEvent());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted6, onextracallbackwithresult2.onTransact());
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback5 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(28.0f));
                                    objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized4 = new NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda1();
                                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized4);
                                    }
                                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback5, (Function1) objOnMinimized4), cameraCaptureResultEmptyCameraCaptureResult3, 0);
                                    objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized5 = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
                                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized5);
                                    }
                                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2 = (getSupportedHighSpeedResolutions) objOnMinimized5;
                                    objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                                        int i17 = IAuthTabCallbackDefault + 101;
                                        onTransact = i17 % 128;
                                        int i18 = i17 % i2;
                                        objOnMinimized6 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized6);
                                    }
                                    Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda26 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized6;
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult5 = windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onExtraCallbackWithResult(lowLightBoostControlExternalSyntheticLambda0.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, i2, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), onextracallbackwithresult.onTransact()), fullPage.IAuthTabCallbackDefault() != null ? i2 : 3, (WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
                                    getSubtitle getsubtitle = (getSubtitle) cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(getPopupTheme.onExtraCallback());
                                    zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(function1);
                                    Object objOnMinimized20 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (zOnNavigationEvent2) {
                                        Object obj7 = objOnMinimized20;
                                        if (objOnMinimized20 == onwarmupcompleted.onExtraCallback()) {
                                            NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda2(function1);
                                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(externalSyntheticLambda2);
                                            obj7 = externalSyntheticLambda2;
                                        }
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback6 = measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult5, camera2CapturePipelineTorchTaskExternalSyntheticLambda26, getsubtitle, false, (String) null, (Role) null, (Function0) obj7, 28, (Object) null);
                                        Object objOnMinimized21 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                        if (objOnMinimized21 == onwarmupcompleted.onExtraCallback()) {
                                            objOnMinimized21 = new NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda3(getsupportedhighspeedresolutions2);
                                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized21);
                                        }
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent4 = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0IAuthTabCallback6, (Function1) objOnMinimized21);
                                        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                                        int iHashCode5 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, 0));
                                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted7 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult3, quirksExternalSyntheticBackport0OnNavigationEvent4);
                                        Function0 function0IAuthTabCallback5 = onextracallbackwithresult2.IAuthTabCallback();
                                        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                                            int i19 = onTransact + 97;
                                            IAuthTabCallbackDefault = i19 % 128;
                                            if (i19 % i2 == 0) {
                                                getAwbState.onExtraCallback();
                                                throw null;
                                            }
                                            getAwbState.onExtraCallback();
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                                        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0IAuthTabCallback5);
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                                        }
                                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5, onextracallbackwithresult2.asInterface());
                                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, Integer.valueOf(iHashCode5), onextracallbackwithresult2.onWarmupCompleted());
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, onextracallbackwithresult2.onNavigationEvent());
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, quirksExternalSyntheticBackport0OnWarmupCompleted7, onextracallbackwithresult2.onTransact());
                                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback5 = verifyDrawable.onExtraCallback(setExtensionStrength.onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallback), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f))), ByteOrderedDataOutputStream.onExtraCallbackWithResult(4283324776L), (toMetersPerSecond) null, 2, (Object) null);
                                        Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                        if (objOnMinimized22 == onwarmupcompleted.onExtraCallback()) {
                                            objOnMinimized22 = new NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda4();
                                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized22);
                                        }
                                        FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback5, false, (Function1) objOnMinimized22, 1, (Object) null), cameraCaptureResultEmptyCameraCaptureResult3, 0);
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult6 = setExtensionStrength.onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallback), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)));
                                        Object objOnMinimized23 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                        if (objOnMinimized23 == onwarmupcompleted.onExtraCallback()) {
                                            objOnMinimized23 = new NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda5(getsupportedhighspeedresolutions2, getsupportedhighspeedresolutions);
                                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized23);
                                        }
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback7 = SessionProcessorSurface.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult6, (Function1) objOnMinimized23);
                                        Object objOnMinimized24 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                        if (objOnMinimized24 == onwarmupcompleted.onExtraCallback()) {
                                            objOnMinimized24 = new NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda6();
                                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized24);
                                        }
                                        FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallback7, false, (Function1) objOnMinimized24, 1, (Object) null), cameraCaptureResultEmptyCameraCaptureResult3, 0);
                                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{fullPage.asBinder(), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.onExtraCallback()), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(15.0f), 1, (Object) null), null, Long.valueOf(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3, 6).ITrustedWebActivityServiceDefault()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(18)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, iAuthTabCallback.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback8 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f));
                                        Object objOnMinimized25 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                        if (objOnMinimized25 == onwarmupcompleted.onExtraCallback()) {
                                            objOnMinimized25 = new NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda7();
                                            cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult;
                                            cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(objOnMinimized25);
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult;
                                        }
                                        ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback8, (Function1) objOnMinimized25), cameraCaptureResultEmptyCameraCaptureResult4, 0);
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback9 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, f);
                                        Object objOnMinimized26 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                        if (objOnMinimized26 == onwarmupcompleted.onExtraCallback()) {
                                            objOnMinimized26 = new NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda8();
                                            cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(objOnMinimized26);
                                        }
                                        ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback9, (Function1) objOnMinimized26), cameraCaptureResultEmptyCameraCaptureResult4, 0);
                                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                        }
                                    }
                                } else {
                                    obj2 = objOnMinimized19;
                                    if (objOnMinimized19 == onwarmupcompleted.onExtraCallback()) {
                                    }
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult32 = windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onExtraCallbackWithResult(measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback3, camera2CapturePipelineTorchTaskExternalSyntheticLambda25, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj2, 28, (Object) null), 1, (WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, 3120, 2);
                                    String strIAuthTabCallbackStub2 = fullPage.IAuthTabCallbackStub();
                                    if (z) {
                                    }
                                    long jOnExtraCallback22 = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17);
                                    GraphicDeviceInfo graphicDeviceInfoOnNavigationEvent2 = iAuthTabCallback.onNavigationEvent();
                                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda02 = y3ExternalSyntheticLambda0.onExtraCallback;
                                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strIAuthTabCallbackStub2, quirksExternalSyntheticBackport0OnExtraCallbackWithResult32, null, Long.valueOf(y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).ITrustedWebActivityServiceDefault()), Long.valueOf(jOnExtraCallback22), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoOnNavigationEvent2, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback42 = verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), getMaxAdCount.onExtraCallbackWithResult(ByteOrderedDataOutputStream.onExtraCallbackWithResult(3892447507L), 0.8f), (toMetersPerSecond) null, 2, (Object) null);
                                    objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (objOnMinimized3 != onwarmupcompleted.onExtraCallback()) {
                                    }
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult42 = submit.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback42, false, (Function1) objOnMinimized3, 1, (Object) null), 0.0f);
                                    component5 component5VarOnNavigationEvent42 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult3, 0);
                                    int iHashCode42 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, 0));
                                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject42 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted62 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult3, quirksExternalSyntheticBackport0OnExtraCallbackWithResult42);
                                    Function0 function0IAuthTabCallback42 = onextracallbackwithresult2.IAuthTabCallback();
                                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() != null) {
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                                    }
                                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult42 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult42, component5VarOnNavigationEvent42, onextracallbackwithresult2.asBinder());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult42, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject42, onextracallbackwithresult2.asInterface());
                                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult42, Integer.valueOf(iHashCode42), onextracallbackwithresult2.onWarmupCompleted());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult42, onextracallbackwithresult2.onNavigationEvent());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult42, quirksExternalSyntheticBackport0OnWarmupCompleted62, onextracallbackwithresult2.onTransact());
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback52 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(28.0f));
                                    objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                                    }
                                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback52, (Function1) objOnMinimized4), cameraCaptureResultEmptyCameraCaptureResult3, 0);
                                    objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                                    }
                                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutions22 = (getSupportedHighSpeedResolutions) objOnMinimized5;
                                    objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                                    }
                                    Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda262 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized6;
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult52 = windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onExtraCallbackWithResult(lowLightBoostControlExternalSyntheticLambda0.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, i2, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), onextracallbackwithresult.onTransact()), fullPage.IAuthTabCallbackDefault() != null ? i2 : 3, (WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, 3072, 2);
                                    getSubtitle getsubtitle2 = (getSubtitle) cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(getPopupTheme.onExtraCallback());
                                    zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(function1);
                                    Object objOnMinimized202 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                    if (zOnNavigationEvent2) {
                                    }
                                }
                            }
                        }
                        NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda14 externalSyntheticLambda14 = new NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda14(function1);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda14);
                        obj = externalSyntheticLambda14;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult22 = windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onExtraCallbackWithResult(measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback2, camera2CapturePipelineTorchTaskExternalSyntheticLambda24, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj, 28, (Object) null), 0, (WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, 3120, 2);
                        String strAsInterface2 = fullPage.asInterface();
                        long jOnExtraCallback3 = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(26);
                        GraphicDeviceInfo.IAuthTabCallback iAuthTabCallback2 = GraphicDeviceInfo.Companion;
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strAsInterface2, quirksExternalSyntheticBackport0OnExtraCallbackWithResult22, null, Long.valueOf(onextracallbackwithresult3.asBinder()), Long.valueOf(jOnExtraCallback3), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, iAuthTabCallback2.IAuthTabCallback(), null, cameraCaptureResultEmptyCameraCaptureResult, 27648, 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback42 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (objOnMinimized != onwarmupcompleted.onExtraCallback()) {
                        }
                        ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback42, (Function1) objOnMinimized), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback32 = lowLightBoostControlExternalSyntheticLambda0.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, (QuirkSettingsLoader) null, false, 3, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 2, (Object) null), onextracallbackwithresult.IAuthTabCallbackStubProxy());
                        objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                        }
                        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda252 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized2;
                        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(function1);
                        Object objOnMinimized192 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (zOnNavigationEvent) {
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(boolean z, @NotNull NativeAdsDto.Creative.FullPage fullPage, float f, @NotNull Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(fullPage, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-2123863815);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(fullPage)) {
                int i6 = IAuthTabCallbackDefault + 45;
                onTransact = i6 % 128;
                i4 = i6 % 2 != 0 ? 85 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            int i7 = onTransact + 13;
            IAuthTabCallbackDefault = i7 % 128;
            if (i7 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            int i8 = onTransact + 73;
            IAuthTabCallbackDefault = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 22 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 2048 : 1024;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 1171) != 1170, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = IAuthTabCallbackDefault + 29;
                onTransact = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2123863815, i2, -1, "im.toss.ads_sdk.ui.v2.screen.NativeAdsFullPageV2Screen (NativeAdsFullPageV2Screen.kt:58)");
                    int i11 = 86 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2123863815, i2, -1, "im.toss.ads_sdk.ui.v2.screen.NativeAdsFullPageV2Screen (NativeAdsFullPageV2Screen.kt:58)");
                }
                int i12 = onTransact + 37;
                IAuthTabCallbackDefault = i12 % 128;
                int i13 = i12 % 2;
            }
            setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).IAuthTabCallback(), Math.min(((Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback())).getApplicationContext().getResources().getConfiguration().fontScale, 1.35f))), ForwardingCameraControl.onExtraCallback(-2004980295, true, new NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda18(function1, fullPage, z, f), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new NativeAdsFullPageV2ScreenKt$.ExternalSyntheticLambda19(z, fullPage, f, function1, i));
        }
    }

    private static final float onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
        if (i3 != 0) {
            int i4 = 9 / 0;
        }
        return fOnNavigationEvent;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(f);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final float onNavigationEvent(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = onTransact + 57;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
        return fOnNavigationEvent;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = onTransact + 25;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(fFloatValue);
        if (i3 != 0) {
            return null;
        }
        int i4 = 72 / 0;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(-1431877216, 1431877224, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{useandconfigureprogramwithtexture}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    public static /* synthetic */ Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(1850871048, -1850871046, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{useandconfigureprogramwithtexture}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    public static /* synthetic */ removeObserverLocked onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (removeObserverLocked) IAuthTabCallback(-1202375217, 1202375217, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{getsupportedhighspeedresolutions, getsupportedhighspeedresolutions2, sessionProcessorCaptureCallback}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        Object[] objArr = {getsupportedhighspeedresolutions, Float.valueOf(f)};
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        IAuthTabCallback(-579097123, 579097124, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    private static final Unit IAuthTabCallbackDefault(Function1 function1) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(-591369796, 591369799, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{function1}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    private static final Unit asInterface(Function1 function1) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(1348018980, -1348018975, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{function1}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    private static final Unit IAuthTabCallback_Parcel(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(932216786, -932216782, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{useandconfigureprogramwithtexture}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    private static final removeObserverLocked onNavigationEvent(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (removeObserverLocked) IAuthTabCallback(-1680521738, 1680521744, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{getsupportedhighspeedresolutions, getsupportedhighspeedresolutions2, sessionProcessorCaptureCallback}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }

    private static final Unit onNavigationEvent(boolean z, NativeAdsDto.Creative.FullPage fullPage, float f, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Boolean.valueOf(z), fullPage, Float.valueOf(f), function1, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(-1514753706, 1514753713, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, objArr, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
    }
}
