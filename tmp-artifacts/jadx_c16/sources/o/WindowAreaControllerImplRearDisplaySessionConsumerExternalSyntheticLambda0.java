package o;

import android.content.Context;
import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.ui.screen.NativeAdsFullPageScreenKt$;
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
public final class WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda0 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private static long onWarmupCompleted = 2691809590382506984L;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitWriteTypedObject = writeTypedObject(useandconfigureprogramwithtexture);
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        int i5 = IAuthTabCallback + 67;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitWriteTypedObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(function1);
        int i4 = IAuthTabCallback + 119;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, NativeAdsDto.Creative.FullPage fullPage, boolean z, float f, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 67;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {function1, fullPage, Boolean.valueOf(z), Float.valueOf(f), r8lambdanm9dm2eewl4vrptnjmesfjqky4, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) onExtraCallbackWithResult(iOnNavigationEvent, -2013411492, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, 2013411497, iOnNavigationEvent2);
        int i5 = IAuthTabCallback + 33;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            return (Unit) onExtraCallbackWithResult(iOnNavigationEvent, -1279185497, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent3, new Object[]{getsupportedhighspeedresolutions, futures3}, 1279185500, iOnNavigationEvent2);
        }
        int iOnNavigationEvent4 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent5 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent6 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) onExtraCallbackWithResult(iOnNavigationEvent4, -1279185497, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent6, new Object[]{getsupportedhighspeedresolutions, futures3}, 1279185500, iOnNavigationEvent5);
        int i3 = 79 / 0;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallback = ICustomTabsCallback(useandconfigureprogramwithtexture);
        int i4 = onNavigationEvent + 59;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitICustomTabsCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(Function1 function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {function1};
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        if (i3 != 0) {
            int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
            obj.hashCode();
            throw null;
        }
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) onExtraCallbackWithResult(iOnNavigationEvent, 602353947, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, -602353946, iOnNavigationEvent3);
        int i4 = IAuthTabCallback + 15;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return extraCallback(useandconfigureprogramwithtexture);
        }
        extraCallback(useandconfigureprogramwithtexture);
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[0];
        Futures3 futures3 = (Futures3) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getsupportedhighspeedresolutions, futures3);
        int i4 = onNavigationEvent + 15;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asBinder(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) onExtraCallbackWithResult(iOnNavigationEvent, -477752227, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent3, new Object[]{useandconfigureprogramwithtexture}, 477752235, iOnNavigationEvent2);
        int i4 = IAuthTabCallback + 85;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(function1);
        int i4 = onNavigationEvent + 121;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStubProxy(useandconfigureprogramwithtexture);
        }
        IAuthTabCallbackStubProxy(useandconfigureprogramwithtexture);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            getInterfaceDescriptor(function1);
            throw null;
        }
        Unit interfaceDescriptor = getInterfaceDescriptor(function1);
        int i3 = onNavigationEvent + 49;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit typedObject = readTypedObject(useandconfigureprogramwithtexture);
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        return typedObject;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i);
        int i11 = (~i) | i7;
        int i12 = i10 | (~(i11 | i5));
        int i13 = (~(i | i7)) | (~i9);
        int i14 = (~i11) | (~(i8 | i2));
        int i15 = i2 + i5 + i6 + (783392123 * i4) + ((-786872706) * i3);
        int i16 = i15 * i15;
        int i17 = ((-1525980173) * i2) + 1729888256 + (218870266 * i5) + (i12 * 1744850439) + ((-805266418) * i13) + (1744850439 * i14) + (1963720704 * i6) + ((-1731985408) * i4) + ((-471334912) * i3) + ((-600899584) * i16);
        int i18 = (i2 * 375823119) + 1642083618 + (i5 * 375823682) + (i12 * 563) + (i13 * 1126) + (i14 * 563) + (i6 * 375824245) + (i4 * (-117547465)) + (i3 * 763984278) + (i16 * (-763691008));
        switch (i17 + (i18 * i18 * 1830354944)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onWarmupCompleted(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return IAuthTabCallbackDefault(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return IAuthTabCallbackStub(objArr);
            case 9:
                return asInterface(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 61;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(readfully, setorientationdegrees);
        int i4 = IAuthTabCallback + 45;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        Unit unit = (Unit) onExtraCallbackWithResult(iOnNavigationEvent, 233316039, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent3, new Object[]{useandconfigureprogramwithtexture}, -233316033, iOnNavigationEvent2);
        int i4 = IAuthTabCallback + 95;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ removeObserverLocked onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        removeObserverLocked removeobserverlockedOnExtraCallback = onExtraCallback(getsupportedhighspeedresolutions, getsupportedhighspeedresolutions2, sessionProcessorCaptureCallback);
        int i4 = IAuthTabCallback + 95;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return removeobserverlockedOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 117;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return asInterface(function1);
        }
        asInterface(function1);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            access000(useandconfigureprogramwithtexture);
            throw null;
        }
        Unit unitAccess000 = access000(useandconfigureprogramwithtexture);
        int i3 = IAuthTabCallback + 47;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 97 / 0;
        }
        return unitAccess000;
    }

    private static final Unit onNavigationEvent(boolean z, NativeAdsDto.Creative.FullPage fullPage, float f, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 21;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            onExtraCallbackWithResult(z, fullPage, f, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        } else {
            onExtraCallbackWithResult(z, fullPage, f, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onTransact(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(useandconfigureprogramwithtexture);
        int i4 = onNavigationEvent + 15;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(function1);
        int i4 = onNavigationEvent + 47;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onWarmupCompleted(MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 65;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onNavigationEvent(meteringRepeatingSessionExternalSyntheticLambda0, str, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(meteringRepeatingSessionExternalSyntheticLambda0, str, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 119;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(useandconfigureprogramwithtexture);
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit onWarmupCompleted(boolean z, NativeAdsDto.Creative.FullPage fullPage, float f, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 105;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return onNavigationEvent(z, fullPage, f, function1, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onNavigationEvent(z, fullPage, f, function1, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onWarmupCompleted ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (true) {
            obj = null;
            if (timelineExternalSyntheticLambda0.onNavigationEvent >= cArrOnWarmupCompleted.length) {
                break;
            }
            int i3 = $10 + 47;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - View.getDefaultSize(0, 0)), 83 - TextUtils.indexOf((CharSequence) "", '0', 0), 21233 - Color.red(0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14184), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 19, (ViewConfiguration.getLongPressTimeout() >> 16) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $11 + 83;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    private static final Unit IAuthTabCallbackDefault(Function1 function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 39;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            function1.invoke((Object) null);
            return Unit.INSTANCE;
        }
        function1.invoke((Object) null);
        Unit unit = Unit.INSTANCE;
        obj.hashCode();
        throw null;
    }

    private static final Unit onTransact(Function1 function1) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke("201");
            unit = Unit.INSTANCE;
            int i3 = 70 / 0;
        } else {
            function1.invoke("201");
            unit = Unit.INSTANCE;
        }
        int i4 = onNavigationEvent + 105;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[0];
        Futures3 futures3 = (Futures3) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(futures3, "");
            IAuthTabCallback(getsupportedhighspeedresolutions, (int) futures3.asBinder());
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(futures3, "");
        IAuthTabCallback(getsupportedhighspeedresolutions, (int) futures3.asBinder());
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit IAuthTabCallback_Parcel(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onNavigationEvent + 53;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        throw null;
    }

    private static final Unit asInterface(Function1 function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke("201");
            return Unit.INSTANCE;
        }
        function1.invoke("201");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 123;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0511  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        boolean z;
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i2;
        MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0;
        Function1 function1 = (Function1) objArr[0];
        NativeAdsDto.Creative.FullPage fullPage = (NativeAdsDto.Creative.FullPage) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        float fFloatValue = ((Number) objArr[3]).floatValue();
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int i3 = 2 % 2;
        if ((iIntValue & 3) != 2) {
            int i4 = IAuthTabCallback + 33;
            onNavigationEvent = i4 % 128;
            z = i4 % 2 != 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallback + 95;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1431673501, iIntValue, -1, "im.toss.ads_sdk.ui.screen.NativeAdsFullPageScreen.<anonymous> (NativeAdsFullPageScreen.kt:65)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1431673501, iIntValue, -1, "im.toss.ads_sdk.ui.screen.NativeAdsFullPageScreen.<anonymous> (NativeAdsFullPageScreen.kt:65)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                int i6 = IAuthTabCallback + 45;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
                objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized);
            }
            Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(function1);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
            if (!zOnNavigationEvent) {
                Object obj = objOnMinimized2;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    NativeAdsFullPageScreenKt$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new NativeAdsFullPageScreenKt$.ExternalSyntheticLambda0(function1);
                    cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(externalSyntheticLambda0);
                    obj = externalSyntheticLambda0;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj, 28, (Object) null);
                FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult3, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult3.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult3, quirksExternalSyntheticBackport0IAuthTabCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult3.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult3.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult3.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda02 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = MeteringRepeatingSessionExternalSyntheticLambda0.onNavigationEvent(meteringRepeatingSessionExternalSyntheticLambda02, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                    cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized3);
                }
                Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized3;
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(function1);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                if (!zOnNavigationEvent2) {
                    Object obj2 = objOnMinimized4;
                    if (objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                        NativeAdsFullPageScreenKt$.ExternalSyntheticLambda11 externalSyntheticLambda11 = new NativeAdsFullPageScreenKt$.ExternalSyntheticLambda11(function1);
                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(externalSyntheticLambda11);
                        obj2 = externalSyntheticLambda11;
                    }
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent2, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj2, 28, (Object) null), cameraCaptureResultEmptyCameraCaptureResult3, 0);
                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                    if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized5 = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized5);
                    }
                    getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2 = (getSupportedHighSpeedResolutions) objOnMinimized5;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null);
                    setByteOrder.onExtraCallbackWithResult onextracallbackwithresult3 = setByteOrder.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = setMaxAdCount.onExtraCallback(quirksExternalSyntheticBackport0OnWarmupCompleted2, new Pair[]{new Pair(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(onextracallbackwithresult3.IAuthTabCallbackDefault())), new Pair(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(ByteOrderedDataOutputStream.onExtraCallbackWithResult(3892447507L), 0.8f)))}, 90.0f, 0, cameraCaptureResultEmptyCameraCaptureResult3, 390, 4);
                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                    if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                        getsupportedhighspeedresolutions = getsupportedhighspeedresolutions2;
                        objOnMinimized6 = new NativeAdsFullPageScreenKt$.ExternalSyntheticLambda12(getsupportedhighspeedresolutions);
                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized6);
                    } else {
                        getsupportedhighspeedresolutions = getsupportedhighspeedresolutions2;
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent3 = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized6);
                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                    if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized7 = new NativeAdsFullPageScreenKt$.ExternalSyntheticLambda13();
                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized7);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = submit.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnNavigationEvent3, false, (Function1) objOnMinimized7, 1, (Object) null), 1.0f);
                    component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult3, 0);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult3.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult3, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult3.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult3.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult3.onActivityLayout()) {
                        int i8 = onNavigationEvent + 91;
                        IAuthTabCallback = i8 % 128;
                        int i9 = i8 % 2;
                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0IAuthTabCallback2);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(178.0f));
                    Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                    if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized8 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized8);
                    }
                    Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized8;
                    boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(function1);
                    Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                    if (!zOnNavigationEvent3) {
                        Object obj3 = objOnMinimized9;
                        if (objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
                            NativeAdsFullPageScreenKt$.ExternalSyntheticLambda14 externalSyntheticLambda14 = new NativeAdsFullPageScreenKt$.ExternalSyntheticLambda14(function1);
                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(externalSyntheticLambda14);
                            obj3 = externalSyntheticLambda14;
                        }
                        ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallback2, camera2CapturePipelineTorchTaskExternalSyntheticLambda23, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj3, 28, (Object) null), cameraCaptureResultEmptyCameraCaptureResult3, 0);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback3 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(13.0f));
                        Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                        if (objOnMinimized10 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized10 = new NativeAdsFullPageScreenKt$.ExternalSyntheticLambda15();
                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized10);
                        }
                        ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback3, (Function1) objOnMinimized10), cameraCaptureResultEmptyCameraCaptureResult3, 0);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null);
                        component5 component5VarOnNavigationEvent3 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult3, 0);
                        int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult3.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult3, quirksExternalSyntheticBackport0OnWarmupCompleted4);
                        Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult3.access100() == null) {
                            int i10 = IAuthTabCallback + 105;
                            onNavigationEvent = i10 % 128;
                            int i11 = i10 % 2;
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult3.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult3.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0IAuthTabCallback3);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnNavigationEvent3, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted5, onextracallbackwithresult2.onTransact());
                        WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1 windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1 = WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.IAuthTabCallback;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = meteringRepeatingSessionExternalSyntheticLambda02.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, (QuirkSettingsLoader) null, false, 3, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 2, (Object) null), onextracallbackwithresult.IAuthTabCallbackStubProxy());
                        Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                        if (objOnMinimized11 == onwarmupcompleted.onExtraCallback()) {
                            int i12 = onNavigationEvent + 111;
                            IAuthTabCallback = i12 % 128;
                            int i13 = i12 % 2;
                            objOnMinimized11 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized11);
                        }
                        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized11;
                        boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(function1);
                        Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                        if (!zOnNavigationEvent4) {
                            Object obj4 = objOnMinimized12;
                            if (objOnMinimized12 == onwarmupcompleted.onExtraCallback()) {
                                NativeAdsFullPageScreenKt$.ExternalSyntheticLambda16 externalSyntheticLambda16 = new NativeAdsFullPageScreenKt$.ExternalSyntheticLambda16(function1);
                                cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(externalSyntheticLambda16);
                                obj4 = externalSyntheticLambda16;
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onExtraCallbackWithResult(measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback2, camera2CapturePipelineTorchTaskExternalSyntheticLambda24, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj4, 28, (Object) null), 0, (WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult3, 3120, 2);
                            String strAsInterface = fullPage.asInterface();
                            long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(22);
                            GraphicDeviceInfo.IAuthTabCallback iAuthTabCallback = GraphicDeviceInfo.Companion;
                            getSupportedHighSpeedResolutions getsupportedhighspeedresolutions3 = getsupportedhighspeedresolutions;
                            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strAsInterface, quirksExternalSyntheticBackport0OnExtraCallbackWithResult2, null, Long.valueOf(onextracallbackwithresult3.asBinder()), Long.valueOf(jOnExtraCallback), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, iAuthTabCallback.IAuthTabCallback(), null, cameraCaptureResultEmptyCameraCaptureResult3, 27648, 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback4 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f));
                            Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                            if (objOnMinimized13 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized13 = new NativeAdsFullPageScreenKt$.ExternalSyntheticLambda17();
                                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult3;
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized13);
                                int i14 = IAuthTabCallback + 29;
                                onNavigationEvent = i14 % 128;
                                i = 2;
                                int i15 = i14 % 2;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult3;
                                i = 2;
                            }
                            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback4, (Function1) objOnMinimized13), cameraCaptureResultEmptyCameraCaptureResult, 0);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = meteringRepeatingSessionExternalSyntheticLambda02.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, (QuirkSettingsLoader) null, false, 3, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, i, (Object) null), onextracallbackwithresult.IAuthTabCallbackStubProxy());
                            Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (objOnMinimized14 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized14 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized14);
                            }
                            Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda25 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized14;
                            boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                            Object objOnMinimized15 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (!zOnNavigationEvent5) {
                                Object obj5 = objOnMinimized15;
                                if (objOnMinimized15 == onwarmupcompleted.onExtraCallback()) {
                                    NativeAdsFullPageScreenKt$.ExternalSyntheticLambda18 externalSyntheticLambda18 = new NativeAdsFullPageScreenKt$.ExternalSyntheticLambda18(function1);
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda18);
                                    obj5 = externalSyntheticLambda18;
                                }
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult3 = windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onExtraCallbackWithResult(measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback3, camera2CapturePipelineTorchTaskExternalSyntheticLambda25, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj5, 28, (Object) null), 1, (WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, 3120, 2);
                                String strIAuthTabCallbackStub = fullPage.IAuthTabCallbackStub();
                                if (zBooleanValue) {
                                    strIAuthTabCallbackStub = strIAuthTabCallbackStub + " ・ AD";
                                }
                                long jOnExtraCallback2 = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17);
                                GraphicDeviceInfo graphicDeviceInfoOnNavigationEvent = iAuthTabCallback.onNavigationEvent();
                                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult;
                                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strIAuthTabCallbackStub, quirksExternalSyntheticBackport0OnExtraCallbackWithResult3, null, Long.valueOf(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ITrustedWebActivityServiceDefault()), Long.valueOf(jOnExtraCallback2), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoOnNavigationEvent, null, cameraCaptureResultEmptyCameraCaptureResult4, 24576, 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                                cameraCaptureResultEmptyCameraCaptureResult4.asInterface();
                                cameraCaptureResultEmptyCameraCaptureResult4.asInterface();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback4 = verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), getMaxAdCount.onExtraCallbackWithResult(ByteOrderedDataOutputStream.onExtraCallbackWithResult(3892447507L), 0.8f), (toMetersPerSecond) null, 2, (Object) null);
                                Object objOnMinimized16 = cameraCaptureResultEmptyCameraCaptureResult4.onMinimized();
                                if (objOnMinimized16 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized16 = new NativeAdsFullPageScreenKt$.ExternalSyntheticLambda19();
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult4;
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized16);
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult4;
                                }
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult4 = submit.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback4, false, (Function1) objOnMinimized16, 1, (Object) null), 0.0f);
                                component5 component5VarOnNavigationEvent4 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                                int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted6 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallbackWithResult4);
                                Function0 function0IAuthTabCallback4 = onextracallbackwithresult2.IAuthTabCallback();
                                if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                                    int i16 = onNavigationEvent + 11;
                                    IAuthTabCallback = i16 % 128;
                                    i2 = 2;
                                    int i17 = i16 % 2;
                                    getAwbState.onExtraCallback();
                                } else {
                                    i2 = 2;
                                }
                                cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                                if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback4);
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                                }
                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnNavigationEvent4, onextracallbackwithresult2.asBinder());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult2.asInterface());
                                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult2.onWarmupCompleted());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult2.onNavigationEvent());
                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted6, onextracallbackwithresult2.onTransact());
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback5 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f));
                                Object objOnMinimized17 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                if (objOnMinimized17 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized17 = new NativeAdsFullPageScreenKt$.ExternalSyntheticLambda1();
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized17);
                                }
                                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback5, (Function1) objOnMinimized17), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                                String strIAuthTabCallbackDefault = fullPage.IAuthTabCallbackDefault();
                                if (strIAuthTabCallbackDefault == null) {
                                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-832829508);
                                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                    meteringRepeatingSessionExternalSyntheticLambda0 = meteringRepeatingSessionExternalSyntheticLambda02;
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-832829507);
                                    meteringRepeatingSessionExternalSyntheticLambda0 = meteringRepeatingSessionExternalSyntheticLambda02;
                                    setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(), 1.0f)), ForwardingCameraControl.onExtraCallback(1949591384, true, new NativeAdsFullPageScreenKt$.ExternalSyntheticLambda2(meteringRepeatingSessionExternalSyntheticLambda0, strIAuthTabCallbackDefault), cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, accessgetCameraFactoryp.onNavigationEvent | 48);
                                    Unit unit = Unit.INSTANCE;
                                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                }
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback6 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
                                Object objOnMinimized18 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                if (objOnMinimized18 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized18 = new NativeAdsFullPageScreenKt$.ExternalSyntheticLambda3();
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized18);
                                }
                                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback6, (Function1) objOnMinimized18), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                                Object objOnMinimized19 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                if (objOnMinimized19 == onwarmupcompleted.onExtraCallback()) {
                                    int i18 = onNavigationEvent + 75;
                                    IAuthTabCallback = i18 % 128;
                                    int i19 = i18 % i2;
                                    objOnMinimized19 = r8lambda8Ym79PrdzIbe9ZH0nlNggsEfBxI.onExtraCallbackWithResult(0.0f);
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized19);
                                }
                                getSupportedHighSpeedResolutions getsupportedhighspeedresolutions4 = (getSupportedHighSpeedResolutions) objOnMinimized19;
                                Object objOnMinimized20 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                if (objOnMinimized20 == onwarmupcompleted.onExtraCallback()) {
                                    objOnMinimized20 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized20);
                                }
                                Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda26 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized20;
                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult5 = windowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onExtraCallbackWithResult(meteringRepeatingSessionExternalSyntheticLambda0.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, i2, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), onextracallbackwithresult.onTransact()), fullPage.IAuthTabCallbackDefault() == null ? i2 : 3, (WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult2, 3072, 2);
                                getSubtitle getsubtitle = (getSubtitle) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(getPopupTheme.onExtraCallback());
                                boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(function1);
                                Object objOnMinimized21 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                if (!zOnNavigationEvent6) {
                                    int i20 = IAuthTabCallback + 49;
                                    onNavigationEvent = i20 % 128;
                                    if (i20 % i2 == 0) {
                                        onwarmupcompleted.onExtraCallback();
                                        throw null;
                                    }
                                    Object obj6 = objOnMinimized21;
                                    if (objOnMinimized21 == onwarmupcompleted.onExtraCallback()) {
                                        NativeAdsFullPageScreenKt$.ExternalSyntheticLambda4 externalSyntheticLambda4 = new NativeAdsFullPageScreenKt$.ExternalSyntheticLambda4(function1);
                                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(externalSyntheticLambda4);
                                        obj6 = externalSyntheticLambda4;
                                    }
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback7 = measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult5, camera2CapturePipelineTorchTaskExternalSyntheticLambda26, getsubtitle, false, (String) null, (Role) null, (Function0) obj6, 28, (Object) null);
                                    Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                    if (objOnMinimized22 == onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized22 = new NativeAdsFullPageScreenKt$.ExternalSyntheticLambda5(getsupportedhighspeedresolutions4);
                                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized22);
                                    }
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent4 = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0IAuthTabCallback7, (Function1) objOnMinimized22);
                                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                                    int iHashCode5 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5 = cameraCaptureResultEmptyCameraCaptureResult2.writeTypedObject();
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted7 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnNavigationEvent4);
                                    Function0 function0IAuthTabCallback5 = onextracallbackwithresult2.IAuthTabCallback();
                                    if (cameraCaptureResultEmptyCameraCaptureResult2.access100() == null) {
                                        getAwbState.onExtraCallback();
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResult2.onUnminimized();
                                    if (cameraCaptureResultEmptyCameraCaptureResult2.onActivityLayout()) {
                                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback5);
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackDefault();
                                    }
                                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2);
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5, onextracallbackwithresult2.asInterface());
                                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, Integer.valueOf(iHashCode5), onextracallbackwithresult2.onWarmupCompleted());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, onextracallbackwithresult2.onNavigationEvent());
                                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, quirksExternalSyntheticBackport0OnWarmupCompleted7, onextracallbackwithresult2.onTransact());
                                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback5 = verifyDrawable.onExtraCallback(setExtensionStrength.onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallback), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f))), ByteOrderedDataOutputStream.onExtraCallbackWithResult(4283324776L), (toMetersPerSecond) null, 2, (Object) null);
                                    Object objOnMinimized23 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                    if (objOnMinimized23 == onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized23 = new NativeAdsFullPageScreenKt$.ExternalSyntheticLambda6();
                                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized23);
                                    }
                                    FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback5, false, (Function1) objOnMinimized23, 1, (Object) null), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult6 = setExtensionStrength.onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallback), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f)));
                                    Object objOnMinimized24 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                    if (objOnMinimized24 == onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized24 = new NativeAdsFullPageScreenKt$.ExternalSyntheticLambda7(getsupportedhighspeedresolutions4, getsupportedhighspeedresolutions3);
                                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized24);
                                    }
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback8 = SessionProcessorSurface.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult6, (Function1) objOnMinimized24);
                                    Object objOnMinimized25 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                    if (objOnMinimized25 == onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized25 = new NativeAdsFullPageScreenKt$.ExternalSyntheticLambda8();
                                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized25);
                                    }
                                    FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallback8, false, (Function1) objOnMinimized25, 1, (Object) null), cameraCaptureResultEmptyCameraCaptureResult2, 0);
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult7 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.onExtraCallback()), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(15.0f), 1, (Object) null);
                                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult5 = cameraCaptureResultEmptyCameraCaptureResult2;
                                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{fullPage.asBinder(), quirksExternalSyntheticBackport0OnExtraCallbackWithResult7, null, Long.valueOf(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).ITrustedWebActivityServiceDefault()), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(18)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, iAuthTabCallback.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult5, 24576, 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                                    cameraCaptureResultEmptyCameraCaptureResult5.asInterface();
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback9 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f));
                                    Object objOnMinimized26 = cameraCaptureResultEmptyCameraCaptureResult5.onMinimized();
                                    if (objOnMinimized26 == onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized26 = new NativeAdsFullPageScreenKt$.ExternalSyntheticLambda9();
                                        cameraCaptureResultEmptyCameraCaptureResult5.onWarmupCompleted(objOnMinimized26);
                                    }
                                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback9, (Function1) objOnMinimized26), cameraCaptureResultEmptyCameraCaptureResult5, 0);
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback10 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, fFloatValue);
                                    Object objOnMinimized27 = cameraCaptureResultEmptyCameraCaptureResult5.onMinimized();
                                    if (objOnMinimized27 == onwarmupcompleted.onExtraCallback()) {
                                        objOnMinimized27 = new NativeAdsFullPageScreenKt$.ExternalSyntheticLambda10();
                                        cameraCaptureResultEmptyCameraCaptureResult5.onWarmupCompleted(objOnMinimized27);
                                    }
                                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback10, (Function1) objOnMinimized27), cameraCaptureResultEmptyCameraCaptureResult5, 0);
                                    cameraCaptureResultEmptyCameraCaptureResult5.asInterface();
                                    cameraCaptureResultEmptyCameraCaptureResult5.asInterface();
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("101");
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 15;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit access000(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit getInterfaceDescriptor(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            function1.invoke("102");
            Unit unit = Unit.INSTANCE;
            int i3 = onNavigationEvent + 13;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }
        function1.invoke("102");
        Unit unit2 = Unit.INSTANCE;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStubProxy(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture);
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 125;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 63 / 0;
        }
        return unit2;
    }

    private static final Unit getInterfaceDescriptor(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        int i3 = 13 / 0;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1949591384, i, -1, "im.toss.ads_sdk.ui.screen.NativeAdsFullPageScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdsFullPageScreen.kt:187)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.IAuthTabCallback.onExtraCallbackWithResult(meteringRepeatingSessionExternalSyntheticLambda0.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, (QuirkSettingsLoader) null, false, 3, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 2, (Object) null), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy()), 2, (WindowAreaControllerImplRearDisplaySessionConsumerExternalSyntheticLambda1.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, 3120, 2);
            if (str.length() > 60) {
                int i4 = onNavigationEvent + 19;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                i2 = 6;
            } else {
                i2 = 8;
            }
            long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(i2);
            int i6 = onNavigationEvent + 111;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, quirksExternalSyntheticBackport0OnExtraCallbackWithResult, null, Long.valueOf(ByteOrderedDataOutputStream.onExtraCallback(2029187839)), Long.valueOf(jOnExtraCallback), 0L, null, null, null, Float.valueOf(1.0f), null, null, 1L, 0, true, null, null, cameraCaptureResultEmptyCameraCaptureResult, 14147, 0, 131044}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, quirksExternalSyntheticBackport0OnExtraCallbackWithResult, null, Long.valueOf(ByteOrderedDataOutputStream.onExtraCallback(2029187839)), Long.valueOf(jOnExtraCallback), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 3072, 0, 131044}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit readTypedObject(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 69;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        Object obj;
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr2 = new Object[1];
            a(new char[]{51423, 31131, 51439, 49440, 36518}, ExpandableListView.getPackedPositionGroup(1L), objArr2);
            obj = objArr2[0];
        } else {
            Object[] objArr3 = new Object[1];
            a(new char[]{51423, 31131, 51439, 49440, 36518}, ExpandableListView.getPackedPositionGroup(0L), objArr3);
            obj = objArr3[0];
        }
        function1.invoke(((String) obj).intern());
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 57;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onWarmupCompleted(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, Futures3 futures3) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(futures3, "");
            onExtraCallbackWithResult(getsupportedhighspeedresolutions, Float.intBitsToFloat((int) FuturesCallbackListener.onWarmupCompleted(futures3)));
            unit = Unit.INSTANCE;
            int i3 = 58 / 0;
        } else {
            Intrinsics.checkNotNullParameter(futures3, "");
            onExtraCallbackWithResult(getsupportedhighspeedresolutions, Float.intBitsToFloat((int) FuturesCallbackListener.onWarmupCompleted(futures3)));
            unit = Unit.INSTANCE;
        }
        int i4 = onNavigationEvent + 87;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit ICustomTabsCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final removeObserverLocked onExtraCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, getSupportedHighSpeedResolutions getsupportedhighspeedresolutions2, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        float f = -((Float) onExtraCallbackWithResult(iOnNavigationEvent, 1390103721, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutions}, -1390103719, iOnNavigationEvent2)).floatValue();
        float fOnNavigationEvent = onNavigationEvent(getsupportedhighspeedresolutions2);
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent4 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = sessionProcessorCaptureCallback.onExtraCallbackWithResult(new NativeAdsFullPageScreenKt$.ExternalSyntheticLambda20(readFully.onExtraCallback.IAuthTabCallback(readFully.Companion, new Pair[]{getWrite.IAuthTabCallback(Float.valueOf(0.0f), setByteOrder.onNavigationEvent(setByteOrder.Companion.IAuthTabCallbackDefault())), getWrite.IAuthTabCallback(Float.valueOf(1.0f), setByteOrder.onNavigationEvent(getMaxAdCount.onExtraCallbackWithResult(ByteOrderedDataOutputStream.onExtraCallbackWithResult(3892447507L), 0.8f)))}, f, fOnNavigationEvent - ((Float) onExtraCallbackWithResult(iOnNavigationEvent3, 1390103721, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{getsupportedhighspeedresolutions}, -1390103719, iOnNavigationEvent4)).floatValue(), 0, 8, (Object) null)));
        int i2 = onNavigationEvent + 49;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return removeobserverlockedOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(readFully readfully, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setorientationdegrees, "");
        setOrientationDegrees.onExtraCallback(setorientationdegrees, readfully, 0L, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 126, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit extraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.IAuthTabCallback(useandconfigureprogramwithtexture);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onNavigationEvent + 41;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit writeTypedObject(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 73;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void onExtraCallbackWithResult(boolean z, @NotNull NativeAdsDto.Creative.FullPage fullPage, float f, @NotNull Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(fullPage, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1363396445);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                int i7 = IAuthTabCallback + 75;
                onNavigationEvent = i7 % 128;
                i5 = i7 % 2 == 0 ? 3 : 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
            int i8 = onNavigationEvent + 19;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(fullPage)) {
                i4 = 16;
            } else {
                int i10 = IAuthTabCallback + 79;
                onNavigationEvent = i10 % 128;
                int i11 = i10 % 2;
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i12 = IAuthTabCallback + 55;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 1171) != 1170, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1363396445, i2, -1, "im.toss.ads_sdk.ui.screen.NativeAdsFullPageScreen (NativeAdsFullPageScreen.kt:58)");
            }
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(), Math.min(((Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback())).getApplicationContext().getResources().getConfiguration().fontScale, 1.35f))), ForwardingCameraControl.onExtraCallback(1431673501, true, new NativeAdsFullPageScreenKt$.ExternalSyntheticLambda21(function1, fullPage, z, f, r8lambdanm9dm2eewl4vrptnjmesfjqky4), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new NativeAdsFullPageScreenKt$.ExternalSyntheticLambda22(z, fullPage, f, function1, i));
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getSupportedHighSpeedResolutions getsupportedhighspeedresolutions = (getSupportedHighSpeedResolutions) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        float fOnNavigationEvent = getsupportedhighspeedresolutions.onNavigationEvent();
        int i4 = IAuthTabCallback + 125;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return Float.valueOf(fOnNavigationEvent);
        }
        int i5 = 54 / 0;
        return Float.valueOf(fOnNavigationEvent);
    }

    private static final void onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(f);
        if (i3 == 0) {
            throw null;
        }
    }

    private static final float onNavigationEvent(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 65;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return getsupportedhighspeedresolutions.onNavigationEvent();
        }
        getsupportedhighspeedresolutions.onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutions.onNavigationEvent(f);
        int i4 = onNavigationEvent + 43;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(iOnNavigationEvent, 2095593817, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent3, new Object[]{useandconfigureprogramwithtexture}, -2095593813, iOnNavigationEvent2);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(iOnNavigationEvent, 352558637, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent3, new Object[]{function1}, -352558628, iOnNavigationEvent2);
    }

    public static /* synthetic */ Unit asInterface(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(iOnNavigationEvent, -1829179207, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent3, new Object[]{useandconfigureprogramwithtexture}, 1829179207, iOnNavigationEvent2);
    }

    public static /* synthetic */ Unit onExtraCallback(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, Futures3 futures3) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(iOnNavigationEvent, -1682135171, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent3, new Object[]{getsupportedhighspeedresolutions, futures3}, 1682135178, iOnNavigationEvent2);
    }

    private static final Unit onWarmupCompleted(Function1 function1, NativeAdsDto.Creative.FullPage fullPage, boolean z, float f, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {function1, fullPage, Boolean.valueOf(z), Float.valueOf(f), r8lambdanm9dm2eewl4vrptnjmesfjqky4, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(iOnNavigationEvent, -2013411492, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), objArr, 2013411497, iOnNavigationEvent2);
    }

    private static final Unit onNavigationEvent(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions, Futures3 futures3) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(iOnNavigationEvent, -1279185497, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent3, new Object[]{getsupportedhighspeedresolutions, futures3}, 1279185500, iOnNavigationEvent2);
    }

    private static final Unit access100(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(iOnNavigationEvent, 233316039, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent3, new Object[]{useandconfigureprogramwithtexture}, -233316033, iOnNavigationEvent2);
    }

    private static final Unit extraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(iOnNavigationEvent, -477752227, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent3, new Object[]{useandconfigureprogramwithtexture}, 477752235, iOnNavigationEvent2);
    }

    private static final float onExtraCallbackWithResult(getSupportedHighSpeedResolutions getsupportedhighspeedresolutions) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return ((Float) onExtraCallbackWithResult(iOnNavigationEvent, 1390103721, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent3, new Object[]{getsupportedhighspeedresolutions}, -1390103719, iOnNavigationEvent2)).floatValue();
    }

    private static final Unit IAuthTabCallback_Parcel(Function1 function1) {
        int iOnNavigationEvent = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent2 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        int iOnNavigationEvent3 = DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(iOnNavigationEvent, 602353947, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent3, new Object[]{function1}, -602353946, iOnNavigationEvent2);
    }
}
