package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import im.toss.ads_sdk.R;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.GraphicDeviceInfo;
import o.MeteringRepeatingSessionExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.access;
import o.immediateFailedFuture;
import o.isQueryRefinementEnabled;
import o.onReceivedHttpError;
import o.onWebAuthnIntent;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onWebAuthnIntent {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long onExtraCallback = 3731880173933683320L;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsDto.Creative.Feed feed, isQueryRefinementEnabled isqueryrefinementenabled, Function1 function1, long j, String str, long j2, MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            unit = (Unit) onWarmupCompleted(267932619, new Object[]{feed, isqueryrefinementenabled, function1, Long.valueOf(j), str, Long.valueOf(j2), meteringRepeatingSessionExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -267932614, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
            int i4 = 75 / 0;
        } else {
            unit = (Unit) onWarmupCompleted(267932619, new Object[]{feed, isqueryrefinementenabled, function1, Long.valueOf(j), str, Long.valueOf(j2), meteringRepeatingSessionExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -267932614, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        }
        int i5 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(str, useandconfigureprogramwithtexture);
        }
        onWarmupCompleted(str, useandconfigureprogramwithtexture);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onTransact(function1);
            throw null;
        }
        Unit unitOnTransact = onTransact(function1);
        int i3 = onWarmupCompleted + 25;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, Function1 function1, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, boolean z, String str, long j, NativeAdsDto.Creative.Feed feed, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, boolean z2, boolean z3, long j2, long j3, long j4, boolean z4, long j5, long j6, String str2, long j7, long j8, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return (Unit) onWarmupCompleted(1467871240, new Object[]{quirksExternalSyntheticBackport0, iAuthTabCallback, function1, onwarmupcompleted, Boolean.valueOf(z), str, Long.valueOf(j), feed, r8lambdanm9dm2eewl4vrptnjmesfjqky4, Boolean.valueOf(z2), Boolean.valueOf(z3), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Boolean.valueOf(z4), Long.valueOf(j5), Long.valueOf(j6), str2, Long.valueOf(j7), Long.valueOf(j8), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -1467871237, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        }
        int i4 = 79 / 0;
        return (Unit) onWarmupCompleted(1467871240, new Object[]{quirksExternalSyntheticBackport0, iAuthTabCallback, function1, onwarmupcompleted, Boolean.valueOf(z), str, Long.valueOf(j), feed, r8lambdanm9dm2eewl4vrptnjmesfjqky4, Boolean.valueOf(z2), Boolean.valueOf(z3), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Boolean.valueOf(z4), Long.valueOf(j5), Long.valueOf(j6), str2, Long.valueOf(j7), Long.valueOf(j8), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -1467871237, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, deleteProfile deleteprofile, NativeAdsDto.Creative.Feed feed, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(quirksExternalSyntheticBackport0, z, deleteprofile, feed, iAuthTabCallback, function1, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 56 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit asInterface(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(function1);
        int i4 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(useandconfigureprogramwithtexture);
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(useandconfigureprogramwithtexture);
        int i4 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(NativeAdsDto.Creative.Feed feed, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallback(feed, j, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallback(feed, j, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return (Unit) onWarmupCompleted(847980057, new Object[]{function1}, -847980053, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        }
        int i3 = 36 / 0;
        return (Unit) onWarmupCompleted(847980057, new Object[]{function1}, -847980053, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, deleteProfile deleteprofile, NativeAdsDto.Creative.Feed feed, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(quirksExternalSyntheticBackport0, z, deleteprofile, feed, iAuthTabCallback, (Function1<? super String, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallbackWithResult + 5;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(useandconfigureprogramwithtexture);
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(function1);
        int i4 = onWarmupCompleted + 47;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            unit = (Unit) onWarmupCompleted(-1298107730, new Object[]{str, useandconfigureprogramwithtexture}, 1298107730, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
            int i3 = 9 / 0;
        } else {
            unit = (Unit) onWarmupCompleted(-1298107730, new Object[]{str, useandconfigureprogramwithtexture}, 1298107730, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
        }
        int i4 = onWarmupCompleted + 5;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return access100(function1);
        }
        access100(function1);
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i);
        int i9 = ~(i7 | i4);
        int i10 = i8 | i9;
        int i11 = ~i;
        int i12 = (~((~i4) | i7 | i)) | (~(i7 | i11 | i4));
        int i13 = i9 | (~(i11 | i2));
        int i14 = i2 + i + i5 + ((-1696018712) * i3) + (2108813197 * i6);
        int i15 = i14 * i14;
        int i16 = ((212195308 * i2) - 2121662464) + (1221732374 * i) + (1009537066 * i10) + (i12 * (-504768533)) + ((-504768533) * i13) + (716963840 * i5) + (39845888 * i3) + (227278848 * i6) + ((-1705377792) * i15);
        int i17 = ((i2 * 362004572) - 1408384217) + (i * 362004174) + (i10 * (-398)) + (i12 * 199) + (i13 * 199) + (i5 * 362004373) + (i3 * (-1290304248)) + (i6 * 155295761) + (i15 * (-60686336));
        switch (i16 + (i17 * i17 * (-1680474112))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                Function1 function1 = (Function1) objArr[0];
                int i18 = 2 % 2;
                int i19 = onWarmupCompleted + 109;
                onExtraCallbackWithResult = i19 % 128;
                int i20 = i19 % 2;
                Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(function1);
                int i21 = onWarmupCompleted + 111;
                onExtraCallbackWithResult = i21 % 128;
                int i22 = i21 % 2;
                return unitIAuthTabCallbackStubProxy;
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit interfaceDescriptor = getInterfaceDescriptor(function1);
        if (i3 == 0) {
            int i4 = 90 / 0;
        }
        int i5 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(useandconfigureprogramwithtexture);
        if (i3 == 0) {
            int i4 = 32 / 0;
        }
        int i5 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i3 = $11 + 75;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i5 = $10 + 23;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 24, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 59 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 6382 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i8 = $10 + 35;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getMaxKeyCode() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 59, View.combineMeasuredStates(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static final Unit onTransact(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        function1.invoke((Object) null);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(Function1 function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("202");
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unit = Unit.INSTANCE;
            int i3 = 2 / 0;
        } else {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x065c  */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Object obj;
        float f;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        Function1 function1;
        isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled;
        float f2;
        DefaultConstructorMarker defaultConstructorMarker;
        ?? r13;
        int i;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        onReceivedHttpError.IAuthTabCallback iAuthTabCallback = (onReceivedHttpError.IAuthTabCallback) objArr[1];
        final Function1 function12 = (Function1) objArr[2];
        QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted = (QuirkSettingsLoader.onWarmupCompleted) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        final String str = (String) objArr[5];
        long jLongValue = ((Number) objArr[6]).longValue();
        final NativeAdsDto.Creative.Feed feed = (NativeAdsDto.Creative.Feed) objArr[7];
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) objArr[8];
        boolean zBooleanValue2 = ((Boolean) objArr[9]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[10]).booleanValue();
        long jLongValue2 = ((Number) objArr[11]).longValue();
        long jLongValue3 = ((Number) objArr[12]).longValue();
        long jLongValue4 = ((Number) objArr[13]).longValue();
        boolean zBooleanValue4 = ((Boolean) objArr[14]).booleanValue();
        long jLongValue5 = ((Number) objArr[15]).longValue();
        final long jLongValue6 = ((Number) objArr[16]).longValue();
        final String str2 = (String) objArr[17];
        final long jLongValue7 = ((Number) objArr[18]).longValue();
        final long jLongValue8 = ((Number) objArr[19]).longValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[20];
        int iIntValue = ((Number) objArr[21]).intValue();
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted((iIntValue & 3) != 2, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1266377518, iIntValue, -1, "im.toss.ads_sdk.ui.compose.NativeAdsFeed.<anonymous> (NativeAdsFeed.kt:100)");
            }
            isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabledOnNavigationEvent = WebViewClientCompat.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult3, 0);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(WebViewClientCompat.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), isqueryrefinementenabledOnNavigationEvent), iAuthTabCallback.onWarmupCompleted(), iAuthTabCallback.onExtraCallbackWithResult(), iAuthTabCallback.IAuthTabCallback(), iAuthTabCallback.onNavigationEvent());
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(function12);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedKt$$ExternalSyntheticLambda7
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        Unit unitIAuthTabCallback;
                        int i5 = 2 % 2;
                        int i6 = onExtraCallbackWithResult + 51;
                        onWarmupCompleted = i6 % 128;
                        if (i6 % 2 != 0) {
                            unitIAuthTabCallback = onWebAuthnIntent.IAuthTabCallback(function12);
                            int i7 = 30 / 0;
                        } else {
                            unitIAuthTabCallback = onWebAuthnIntent.IAuthTabCallback(function12);
                        }
                        int i8 = onWarmupCompleted + 119;
                        onExtraCallbackWithResult = i8 % 128;
                        if (i8 % 2 != 0) {
                            return unitIAuthTabCallback;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted, isqueryrefinementenabledOnNavigationEvent, (Function0) objOnMinimized);
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult3, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult3.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult3, quirksExternalSyntheticBackport0IAuthTabCallback);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult3, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult3.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult3, quirksExternalSyntheticBackport0OnExtraCallback);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult3.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult3.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult3.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            if (zBooleanValue2) {
                cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-1210501996);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ensureNavButtonView.onExtraCallback(setExtensionStrength.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport02, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(36.0f)), RoundedCornerShapeKt.onWarmupCompleted()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f), jLongValue, RoundedCornerShapeKt.onWarmupCompleted());
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(function12);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                if (zOnNavigationEvent2 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedKt$$ExternalSyntheticLambda8
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            int i5 = 2 % 2;
                            int i6 = onWarmupCompleted + 47;
                            onExtraCallback = i6 % 128;
                            int i7 = i6 % 2;
                            Object[] objArr2 = {function12};
                            int iIAuthTabCallback = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                            int iIAuthTabCallback2 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                            int iIAuthTabCallback3 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                            int iIAuthTabCallback4 = access.IAuthTabCallbackStubProxy.IAuthTabCallback();
                            if (i7 != 0) {
                                return (Unit) onWebAuthnIntent.onWarmupCompleted(-379624146, objArr2, 379624147, iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, iIAuthTabCallback4);
                            }
                            int i8 = 29 / 0;
                            return (Unit) onWebAuthnIntent.onWarmupCompleted(-379624146, objArr2, 379624147, iIAuthTabCallback3, iIAuthTabCallback, iIAuthTabCallback2, iIAuthTabCallback4);
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized2);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback2, isqueryrefinementenabledOnNavigationEvent, (Function0) objOnMinimized2);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized3 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedKt$$ExternalSyntheticLambda9
                        private static int onExtraCallback = 1;
                        private static int onExtraCallbackWithResult;

                        public final Object invoke(Object obj2) {
                            int i5 = 2 % 2;
                            int i6 = onExtraCallbackWithResult + 107;
                            onExtraCallback = i6 % 128;
                            int i7 = i6 % 2;
                            Unit unitOnWarmupCompleted = onWebAuthnIntent.onWarmupCompleted((useAndConfigureProgramWithTexture) obj2);
                            int i8 = onExtraCallbackWithResult + 77;
                            onExtraCallback = i8 % 128;
                            if (i8 % 2 == 0) {
                                int i9 = 8 / 0;
                            }
                            return unitOnWarmupCompleted;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized3);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback2, (Function1) objOnMinimized3);
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult3.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult3, quirksExternalSyntheticBackport0OnWarmupCompleted4);
                Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult3.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult3.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult3.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0IAuthTabCallback3);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted5, onextracallbackwithresult2.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{feed.asBinder(), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null), null, null, null, null, null, null, immediateFailedFuture.Companion.onWarmupCompleted(), null, cameraCaptureResultEmptyCameraCaptureResult3, 100663728, 760}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
                cameraCaptureResultEmptyCameraCaptureResult3.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-1209639018);
                cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(RowScope.onNavigationEvent(rowScopeInstance, quirksExternalSyntheticBackport02, 1.0f, false, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult3, 0);
            int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResult3.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted6 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult3, quirksExternalSyntheticBackport0OnExtraCallback3);
            Function0 function0IAuthTabCallback4 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult3.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult3.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult3.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0IAuthTabCallback4);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted6, onextracallbackwithresult2.onTransact());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback4 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport02, !(zBooleanValue2 ^ true) ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            if (zBooleanValue3) {
                quirksExternalSyntheticBackport0OnNavigationEvent = quirksExternalSyntheticBackport02;
                obj = null;
                f = 0.0f;
            } else {
                obj = null;
                f = 0.0f;
                quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport02, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(36.0f), 1, (Object) null);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback5 = quirksExternalSyntheticBackport0OnExtraCallback4.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(function12);
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
            if (zOnNavigationEvent3 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized4 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedKt$$ExternalSyntheticLambda10
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke() {
                        int i5 = 2 % 2;
                        int i6 = onExtraCallbackWithResult + 33;
                        IAuthTabCallback = i6 % 128;
                        int i7 = i6 % 2;
                        Unit unitAsInterface = onWebAuthnIntent.asInterface(function12);
                        if (i7 != 0) {
                            int i8 = 1 / 0;
                        }
                        return unitAsInterface;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized4);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback3 = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback5, isqueryrefinementenabledOnNavigationEvent, (Function0) objOnMinimized4);
            String strIAuthTabCallbackDefault = feed.IAuthTabCallbackDefault();
            long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(16);
            int iOnTransact = createCameraCaptureCallback.Companion.onTransact();
            GraphicDeviceInfo.IAuthTabCallback iAuthTabCallback2 = GraphicDeviceInfo.Companion;
            float f3 = f;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strIAuthTabCallbackDefault, quirksExternalSyntheticBackport0IAuthTabCallback3, null, Long.valueOf(jLongValue2), Long.valueOf(jOnExtraCallback), 0L, null, null, createCameraCaptureCallback.onExtraCallback(iOnTransact), Float.valueOf(f3), null, null, 0L, 0, false, iAuthTabCallback2.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult3, 24576, 196608, 98020}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (zBooleanValue3) {
                int i5 = onWarmupCompleted + 87;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-1241001230);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback6 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport02, !(zBooleanValue2 ^ true) ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f3), 0.0f, 0.0f, 0.0f, 14, (Object) null);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized5 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedKt$$ExternalSyntheticLambda11
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2) {
                            int i7 = 2 % 2;
                            int i8 = onNavigationEvent + 41;
                            onWarmupCompleted = i8 % 128;
                            useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj2;
                            if (i8 % 2 == 0) {
                                return (Unit) onWebAuthnIntent.onWarmupCompleted(-1134123069, new Object[]{useandconfigureprogramwithtexture}, 1134123071, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized5);
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.ads_sdk_ad, cameraCaptureResultEmptyCameraCaptureResult3, 0), getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback6, (Function1) objOnMinimized5), null, Long.valueOf(jLongValue3), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13)), 0L, null, null, null, Float.valueOf(f3), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult3, 24576, 0, 131044}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult3;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult3;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1240596928);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (zBooleanValue) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(703582499);
                Object obj2 = null;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback7 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, f3, 1, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, 0.0f, 13, (Object) null), 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 11, (Object) null);
                boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent4 || objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized6 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedKt$$ExternalSyntheticLambda12
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj3) {
                            int i7 = 2 % 2;
                            int i8 = onExtraCallbackWithResult + 39;
                            onNavigationEvent = i8 % 128;
                            int i9 = i8 % 2;
                            Unit unitIAuthTabCallback = onWebAuthnIntent.IAuthTabCallback(str, (useAndConfigureProgramWithTexture) obj3);
                            int i10 = onNavigationEvent + 39;
                            onExtraCallbackWithResult = i10 % 128;
                            int i11 = i10 % 2;
                            return unitIAuthTabCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback4 = getExtensionsBeforeInitialized.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback7, true, (Function1) objOnMinimized6);
                component5 component5VarOnNavigationEvent3 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                int iHashCode5 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted7 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback4);
                Function0 function0IAuthTabCallback5 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    int i7 = onWarmupCompleted + 115;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback5);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, component5VarOnNavigationEvent3, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, Integer.valueOf(iHashCode5), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, quirksExternalSyntheticBackport0OnWarmupCompleted7, onextracallbackwithresult2.onTransact());
                boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function12);
                Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent5) {
                    int i9 = onExtraCallbackWithResult + 41;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % 2 == 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        obj2.hashCode();
                        throw null;
                    }
                    if (objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized7 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedKt$$ExternalSyntheticLambda13
                            private static int IAuthTabCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke() {
                                int i10 = 2 % 2;
                                int i11 = onWarmupCompleted + 23;
                                IAuthTabCallback = i11 % 128;
                                int i12 = i11 % 2;
                                Unit unit = (Unit) onWebAuthnIntent.onWarmupCompleted(868988513, new Object[]{function12}, -868988507, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
                                int i13 = onWarmupCompleted + 39;
                                IAuthTabCallback = i13 % 128;
                                if (i13 % 2 != 0) {
                                    return unit;
                                }
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized7);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback5 = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport02, isqueryrefinementenabledOnNavigationEvent, (Function0) objOnMinimized7);
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{feed.asInterface(), quirksExternalSyntheticBackport0IAuthTabCallback5, null, Long.valueOf(jLongValue4), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15)), 0L, null, null, null, Float.valueOf(f3), null, null, 0L, 0, false, iAuthTabCallback2.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult4, 24576, 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    if (zBooleanValue4) {
                        cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallbackWithResult(-710299049);
                        boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult4.onNavigationEvent(function12);
                        Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult4.onMinimized();
                        if (zOnNavigationEvent6 || objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized8 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedKt$$ExternalSyntheticLambda14
                                private static int IAuthTabCallback = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke() {
                                    int i10 = 2 % 2;
                                    int i11 = IAuthTabCallback + 21;
                                    onNavigationEvent = i11 % 128;
                                    int i12 = i11 % 2;
                                    Unit unitOnNavigationEvent = onWebAuthnIntent.onNavigationEvent(function12);
                                    int i13 = onNavigationEvent + 123;
                                    IAuthTabCallback = i13 % 128;
                                    int i14 = i13 % 2;
                                    return unitOnNavigationEvent;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(objOnMinimized8);
                        }
                        isqueryrefinementenabled = isqueryrefinementenabledOnNavigationEvent;
                        function1 = function12;
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{feed.IAuthTabCallbackStub(), WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport02, isqueryrefinementenabledOnNavigationEvent, (Function0) objOnMinimized8), null, Long.valueOf(jLongValue5), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15)), 0L, null, null, null, Float.valueOf(f3), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult4, 24576, 0, 131044}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        cameraCaptureResultEmptyCameraCaptureResult4.IAuthTabCallbackDefault();
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult4;
                    } else {
                        isqueryrefinementenabled = isqueryrefinementenabledOnNavigationEvent;
                        function1 = function12;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult4;
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-709921655);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        int i10 = onWarmupCompleted + 53;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    f2 = f3;
                    defaultConstructorMarker = null;
                    r13 = 1;
                    i = 6;
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                function1 = function12;
                isqueryrefinementenabled = isqueryrefinementenabledOnNavigationEvent;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(704907563);
                f2 = f3;
                defaultConstructorMarker = null;
                r13 = 1;
                i = 6;
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, f2, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f)), cameraCaptureResultEmptyCameraCaptureResult2, 6);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback8 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, f2, (int) r13, defaultConstructorMarker), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 0.0f, 0.0f, 13, (Object) null);
            RoundedCornerShape roundedCornerShapeOnNavigationEvent = RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f));
            setFeatureSelectionListener setfeatureselectionlistener = setFeatureSelectionListener.onNavigationEvent;
            long jIAuthTabCallbackDefault = setByteOrder.Companion.IAuthTabCallbackDefault();
            int i12 = setFeatureSelectionListener.onExtraCallbackWithResult;
            final isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled2 = isqueryrefinementenabled;
            final Function1 function13 = function1;
            SessionConfigBuilder.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback8, roundedCornerShapeOnNavigationEvent, setfeatureselectionlistener.onNavigationEvent(jIAuthTabCallbackDefault, 0L, 0L, 0L, cameraCaptureResultEmptyCameraCaptureResult2, (i12 << 12) | 6, 14), (SessionConfigExternalSyntheticLambda0) null, setfeatureselectionlistener.IAuthTabCallback((boolean) r13, cameraCaptureResultEmptyCameraCaptureResult2, (i12 << 3) | i, 0).onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), new createString(jLongValue, defaultConstructorMarker)), ForwardingCameraControl.onExtraCallback(1586389690, (boolean) r13, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedKt$$ExternalSyntheticLambda15
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    int i13 = 2 % 2;
                    int i14 = onWarmupCompleted + 29;
                    onExtraCallbackWithResult = i14 % 128;
                    int i15 = i14 % 2;
                    NativeAdsDto.Creative.Feed feed2 = feed;
                    isQueryRefinementEnabled isqueryrefinementenabled3 = isqueryrefinementenabled2;
                    if (i15 != 0) {
                        return onWebAuthnIntent.IAuthTabCallback(feed2, isqueryrefinementenabled3, function13, jLongValue6, str2, jLongValue7, (MeteringRepeatingSessionExternalSyntheticLambda0) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                    }
                    int i16 = 91 / 0;
                    return onWebAuthnIntent.IAuthTabCallback(feed2, isqueryrefinementenabled3, function13, jLongValue6, str2, jLongValue7, (MeteringRepeatingSessionExternalSyntheticLambda0) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, 196614, 8);
            String strOnTransact = feed.onTransact();
            if (strOnTransact == null || ((StringsKt.isBlank(strOnTransact) ? 1 : 0) ^ r13) != r13) {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(708300730);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(707820230);
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport02, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f)), cameraCaptureResultEmptyCameraCaptureResult2, i);
                setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(), 1.0f)), ForwardingCameraControl.onExtraCallback(1817630938, (boolean) r13, new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedKt$$ExternalSyntheticLambda16
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj3, Object obj4) {
                        Unit unitOnExtraCallbackWithResult;
                        int i13 = 2 % 2;
                        int i14 = onExtraCallback + 87;
                        onWarmupCompleted = i14 % 128;
                        if (i14 % 2 != 0) {
                            unitOnExtraCallbackWithResult = onWebAuthnIntent.onExtraCallbackWithResult(feed, jLongValue8, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i15 = 87 / 0;
                        } else {
                            unitOnExtraCallbackWithResult = onWebAuthnIntent.onExtraCallbackWithResult(feed, jLongValue8, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        }
                        int i16 = onExtraCallback + 107;
                        onWarmupCompleted = i16 % 128;
                        int i17 = i16 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, accessgetCameraFactoryp.onNavigationEvent | 48);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit asBinder(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("103");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 113;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        int i3 = 7 / 0;
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        if (!StringsKt.isBlank(str)) {
            int i2 = onWarmupCompleted + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
            int i4 = onWarmupCompleted + 123;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStubProxy(Function1 function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("101");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit access100(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            function1.invoke("102");
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallbackWithResult + 101;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
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

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str = (String) objArr[0];
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final Unit asBinder(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("201");
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 80 / 0;
        }
        return unit;
    }

    private static final Unit getInterfaceDescriptor(Function1 function1) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(new char[]{26495}, TextUtils.lastIndexOf("", 'h', 0) + 28282, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(new char[]{26495}, 31120 - TextUtils.lastIndexOf("", '0', 0), objArr2);
            obj = objArr2[0];
        }
        function1.invoke(((String) obj).intern());
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 81 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 53;
        onWarmupCompleted = i2 % 128;
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

    /* JADX WARN: Removed duplicated region for block: B:30:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        boolean z;
        final String str;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted;
        NativeAdsDto.Creative.Feed feed = (NativeAdsDto.Creative.Feed) objArr[0];
        isQueryRefinementEnabled isqueryrefinementenabled = (isQueryRefinementEnabled) objArr[1];
        final Function1 function1 = (Function1) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        String str2 = (String) objArr[4];
        long jLongValue2 = ((Number) objArr[5]).longValue();
        MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0 = (MeteringRepeatingSessionExternalSyntheticLambda0) objArr[6];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(meteringRepeatingSessionExternalSyntheticLambda0, "");
        if ((iIntValue & 17) != 16) {
            int i2 = onExtraCallbackWithResult + 51;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1586389690, iIntValue, -1, "im.toss.ads_sdk.ui.compose.NativeAdsFeed.<anonymous>.<anonymous>.<anonymous> (NativeAdsFeed.kt:228)");
            }
            String strAccess000 = feed.access000();
            if (StringsKt.isBlank(strAccess000)) {
                int i4 = onWarmupCompleted + 59;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                str = null;
            } else {
                str = strAccess000;
            }
            if (str != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1684727699);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(!zOnNavigationEvent) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedKt$$ExternalSyntheticLambda2
                        private static int IAuthTabCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj) {
                            int i6 = 2 % 2;
                            int i7 = onNavigationEvent + 3;
                            IAuthTabCallback = i7 % 128;
                            int i8 = i7 % 2;
                            String str3 = str;
                            useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj;
                            if (i8 != 0) {
                                return onWebAuthnIntent.onNavigationEvent(str3, useandconfigureprogramwithtexture);
                            }
                            onWebAuthnIntent.onNavigationEvent(str3, useandconfigureprogramwithtexture);
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                quirksExternalSyntheticBackport0OnWarmupCompleted = getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, (Function1) objOnMinimized, 1, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1684632033);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedKt$$ExternalSyntheticLambda3
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj) {
                            int i6 = 2 % 2;
                            int i7 = onWarmupCompleted + 17;
                            onNavigationEvent = i7 % 128;
                            int i8 = i7 % 2;
                            Unit unitOnExtraCallback = onWebAuthnIntent.onExtraCallback((useAndConfigureProgramWithTexture) obj);
                            if (i8 == 0) {
                                int i9 = 87 / 0;
                            }
                            return unitOnExtraCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                quirksExternalSyntheticBackport0OnWarmupCompleted = getExtensionsBeforeInitialized.onWarmupCompleted(onextracallback2, (Function1) objOnMinimized2);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            String interfaceDescriptor = feed.getInterfaceDescriptor();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = FocusMeteringControlExternalSyntheticLambda2.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback3, 0.0f, 1, (Object) null), 1.7777778f, false, 2, (Object) null).onExtraCallback(quirksExternalSyntheticBackport0OnWarmupCompleted);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent2) {
                int i6 = onWarmupCompleted + 25;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized3 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedKt$$ExternalSyntheticLambda4
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            int i8 = 2 % 2;
                            int i9 = onWarmupCompleted + 15;
                            onNavigationEvent = i9 % 128;
                            int i10 = i9 % 2;
                            Unit unitOnExtraCallbackWithResult = onWebAuthnIntent.onExtraCallbackWithResult(function1);
                            int i11 = onNavigationEvent + 87;
                            onWarmupCompleted = i11 % 128;
                            if (i11 % 2 == 0) {
                                return unitOnExtraCallbackWithResult;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                    int i8 = onWarmupCompleted + 73;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, isqueryrefinementenabled, (Function0) objOnMinimized3);
                immediateFailedFuture.IAuthTabCallback iAuthTabCallback = immediateFailedFuture.Companion;
                AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{interfaceDescriptor, quirksExternalSyntheticBackport0IAuthTabCallback, str, null, null, null, null, null, iAuthTabCallback.onWarmupCompleted(), null, cameraCaptureResultEmptyCameraCaptureResult, 100663296, 760}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback3, 0.0f, 1, (Object) null), jLongValue, (toMetersPerSecond) null, 2, (Object) null);
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (!(!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout())) {
                    int i10 = onExtraCallbackWithResult + 117;
                    onWarmupCompleted = i10 % 128;
                    if (i10 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                        int i11 = 4 / 0;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback3, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f));
                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent3 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized4 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedKt$$ExternalSyntheticLambda5
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() throws Throwable {
                            int i12 = 2 % 2;
                            int i13 = onExtraCallback + 65;
                            onWarmupCompleted = i13 % 128;
                            int i14 = i13 % 2;
                            Unit unitOnWarmupCompleted = onWebAuthnIntent.onWarmupCompleted(function1);
                            int i15 = onWarmupCompleted + 111;
                            onExtraCallback = i15 % 128;
                            if (i15 % 2 != 0) {
                                return unitOnWarmupCompleted;
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent, isqueryrefinementenabled, (Function0) objOnMinimized4);
                component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), onextracallbackwithresult.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResult, 48);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback2);
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    int i12 = onExtraCallbackWithResult + 25;
                    onWarmupCompleted = i12 % 128;
                    int i13 = i12 % 2;
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    int i14 = onWarmupCompleted + 17;
                    onExtraCallbackWithResult = i14 % 128;
                    if (i14 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                        int i15 = 8 / 0;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, RowScope.onNavigationEvent(RowScopeInstance.onNavigationEvent, onextracallback3, 1.0f, false, 2, (Object) null), null, Long.valueOf(jLongValue2), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, GraphicDeviceInfo.Companion.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback3, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f));
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized5 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedKt$$ExternalSyntheticLambda6
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj) {
                            int i16 = 2 % 2;
                            int i17 = onWarmupCompleted + 89;
                            onNavigationEvent = i17 % 128;
                            int i18 = i17 % 2;
                            Unit unitOnExtraCallbackWithResult = onWebAuthnIntent.onExtraCallbackWithResult((useAndConfigureProgramWithTexture) obj);
                            int i19 = onWarmupCompleted + 5;
                            onNavigationEvent = i19 % 128;
                            int i20 = i19 % 2;
                            return unitOnExtraCallbackWithResult;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallbackDefault, (Function1) objOnMinimized5);
                immediateFailedFuture immediatefailedfutureIAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
                Object[] objArr2 = new Object[1];
                a(new char[]{26407, 12436, 51301, 24626, 14720, 53534, 27002, 681, 55876, 29212, 3064, 41918, 31506, 5327, 44275, 17530, 7632, 46499, 19826, 59036, 48778, 22137, 61034, 34719, 24388, 63287, 32999, 22601, 61508, 35308, 8611, 63769, 37504, 10996, 49673, 39821, 13242, 52071, 25818, 15496, 54330, 27689, 1419, 56664, 30004, 3835, 42512, 32284, 6134, 44887, 18185, 4326, 43246, 16384, 6592, 45486, 18803, 58074, 47772, 21102, 59967, 33683, 23363, 62323, 36066, 9295, 64575, 38381, 11549, 50452, 40699, 13985}, 22447 - Color.argb(0, 0, 0, 0), objArr2);
                AppLovinNativeAdImplc.onExtraCallback(((String) objArr2[0]).intern(), jLongValue2, quirksExternalSyntheticBackport0OnWarmupCompleted4, (String) null, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, immediatefailedfutureIAuthTabCallback, (Painter) null, cameraCaptureResultEmptyCameraCaptureResult, 100666374, 752);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i16 = onExtraCallbackWithResult + 87;
                    onWarmupCompleted = i16 % 128;
                    int i17 = i16 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(NativeAdsDto.Creative.Feed feed, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 5;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            int i8 = onExtraCallbackWithResult + 21;
            onWarmupCompleted = i8 % 128;
            Object obj = null;
            if (i8 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1817630938, i, -1, "im.toss.ads_sdk.ui.compose.NativeAdsFeed.<anonymous>.<anonymous>.<anonymous> (NativeAdsFeed.kt:282)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{feed.onTransact(), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), null, Long.valueOf(j), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(8)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 27696, 0, 131044}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onWarmupCompleted + 53;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onNavigationEvent(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final boolean z, @NotNull final deleteProfile deleteprofile, @NotNull final NativeAdsDto.Creative.Feed feed, @Nullable onReceivedHttpError.IAuthTabCallback iAuthTabCallback, @NotNull final Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        int i4;
        final onReceivedHttpError.IAuthTabCallback iAuthTabCallback2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05;
        onReceivedHttpError.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult;
        String strOnExtraCallback;
        int i5;
        final long jOnExtraCallbackWithResult;
        String strAsInterface;
        QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault;
        Configuration configuration;
        int i6;
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(deleteprofile, "");
        Intrinsics.checkNotNullParameter(feed, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1873467374);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                int i9 = onExtraCallbackWithResult + 99;
                onWarmupCompleted = i9 % 128;
                i4 = i9 % 2 == 0 ? 5 : 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i10 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(deleteprofile.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(feed)) {
                int i12 = onExtraCallbackWithResult + 11;
                onWarmupCompleted = i12 % 128;
                i6 = i12 % 2 == 0 ? 7340 : 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
            int i13 = onExtraCallbackWithResult + 89;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                iAuthTabCallback2 = iAuthTabCallback;
                int i15 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback2) ? 16384 : 8192;
                i3 |= i15;
            } else {
                iAuthTabCallback2 = iAuthTabCallback;
            }
            i3 |= i15;
        } else {
            iAuthTabCallback2 = iAuthTabCallback;
        }
        if ((196608 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 131072 : 65536;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i3) != 74898, i3 & 1)) {
            int i16 = onExtraCallbackWithResult + 29;
            onWarmupCompleted = i16 % 128;
            if (i16 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) != 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        quirksExternalSyntheticBackport04 = i8 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                        if ((i2 & 16) != 0) {
                            int i17 = onWarmupCompleted + 3;
                            onExtraCallbackWithResult = i17 % 128;
                            int i18 = i17 % 2;
                            i3 &= -57345;
                            quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                            iAuthTabCallbackOnExtraCallbackWithResult = onReceivedHttpError.onNavigationEvent.onExtraCallbackWithResult(false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100663296, 255);
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1873467374, i3, -1, "im.toss.ads_sdk.ui.compose.NativeAdsFeed (NativeAdsFeed.kt:59)");
                        }
                        Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                        final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                        boolean zIsBlank = StringsKt.isBlank(feed.asInterface());
                        boolean zIsBlank2 = StringsKt.isBlank(feed.IAuthTabCallbackStub());
                        boolean zIsBlank3 = StringsKt.isBlank(feed.asBinder());
                        Object obj = null;
                        if (StringsKt.isBlank((String) NativeAdsDto.Creative.Feed.IAuthTabCallback(790435775, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -790435774, new Object[]{feed}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback()))) {
                            int i19 = onExtraCallbackWithResult + 7;
                            onWarmupCompleted = i19 % 128;
                            if (i19 % 2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(634036082);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                obj.hashCode();
                                throw null;
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(634036082);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            strOnExtraCallback = (String) NativeAdsDto.Creative.Feed.IAuthTabCallback(790435775, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -790435774, new Object[]{feed}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(634072817);
                            strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.ads_sdk_text_more, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                        final String str = strOnExtraCallback;
                        getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
                        boolean zOnExtraCallbackWithResult = getstrokewidth.onExtraCallbackWithResult(deleteprofile, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i3 >> 6) & 14) | 48);
                        final long jOnExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(!zOnExtraCallbackWithResult ? 484039167 : 218243143);
                        i5 = onExtraCallbackWithResult + 53;
                        onWarmupCompleted = i5 % 128;
                        if (i5 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        long jAsBinder = zOnExtraCallbackWithResult ? setByteOrder.Companion.asBinder() : ByteOrderedDataOutputStream.onExtraCallbackWithResult(4281548107L);
                        long jAsBinder2 = zOnExtraCallbackWithResult ? setByteOrder.Companion.asBinder() : ByteOrderedDataOutputStream.onExtraCallbackWithResult(4287337889L);
                        if (zOnExtraCallbackWithResult) {
                            jOnExtraCallbackWithResult = setByteOrder.Companion.asBinder();
                        } else {
                            jOnExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallbackWithResult(4281548107L);
                            int i20 = onExtraCallbackWithResult + 121;
                            onWarmupCompleted = i20 % 128;
                            int i21 = i20 % 2;
                        }
                        final long jAsBinder3 = zOnExtraCallbackWithResult ? setByteOrder.Companion.asBinder() : ByteOrderedDataOutputStream.onExtraCallbackWithResult(4283324776L);
                        final long jOnExtraCallbackWithResult2 = ByteOrderedDataOutputStream.onExtraCallbackWithResult(4287337889L);
                        final long jOnExtraCallback2 = ByteOrderedDataOutputStream.onExtraCallback(getstrokewidth.IAuthTabCallback(context, feed.IAuthTabCallback_Parcel(), -1));
                        final long jOnExtraCallback3 = ByteOrderedDataOutputStream.onExtraCallback(getstrokewidth.IAuthTabCallback(context, (String) NativeAdsDto.Creative.Feed.IAuthTabCallback(545562487, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -545562487, new Object[]{feed}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback()), Color.parseColor("#262459")));
                        if (zIsBlank || zIsBlank2) {
                            strAsInterface = feed.asInterface();
                        } else {
                            strAsInterface = feed.asInterface() + ", " + feed.IAuthTabCallbackStub();
                        }
                        final String str2 = strAsInterface;
                        float fMin = Math.min(context.getApplicationContext().getResources().getConfiguration().fontScale, 1.6f);
                        if (z) {
                            Resources resources = context.getResources();
                            if (((resources == null || (configuration = resources.getConfiguration()) == null) ? 1.0f : configuration.fontScale) > 1.1f) {
                                int i22 = onExtraCallbackWithResult + 91;
                                onWarmupCompleted = i22 % 128;
                                if (i22 % 2 == 0) {
                                    onwarmupcompletedIAuthTabCallbackDefault = QuirkSettingsLoader.Companion.access000();
                                    int i23 = 70 / 0;
                                } else {
                                    onwarmupcompletedIAuthTabCallbackDefault = QuirkSettingsLoader.Companion.access000();
                                }
                            }
                            final QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted = onwarmupcompletedIAuthTabCallbackDefault;
                            accessgetCameraFactoryp accessgetcamerafactorypOnExtraCallback = needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(), fMin));
                            final boolean z2 = !zIsBlank;
                            final boolean z3 = !zIsBlank3;
                            final boolean z4 = !zIsBlank2;
                            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport05;
                            final onReceivedHttpError.IAuthTabCallback iAuthTabCallback3 = iAuthTabCallbackOnExtraCallbackWithResult;
                            final long j = jAsBinder;
                            final long j2 = jAsBinder2;
                            Function2 function2 = new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedKt$$ExternalSyntheticLambda0
                                private static int onExtraCallback = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj2, Object obj3) {
                                    int i24 = 2 % 2;
                                    int i25 = onWarmupCompleted + 51;
                                    onExtraCallback = i25 % 128;
                                    int i26 = i25 % 2;
                                    Unit unitIAuthTabCallback = onWebAuthnIntent.IAuthTabCallback(quirksExternalSyntheticBackport06, iAuthTabCallback3, function1, onwarmupcompleted, z2, str2, jOnExtraCallback, feed, r8lambdanm9dm2eewl4vrptnjmesfjqky4, z3, z, j, j2, jOnExtraCallbackWithResult, z4, jAsBinder3, jOnExtraCallback3, str, jOnExtraCallback2, jOnExtraCallbackWithResult2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    int i27 = onWarmupCompleted + 45;
                                    onExtraCallback = i27 % 128;
                                    if (i27 % 2 != 0) {
                                        return unitIAuthTabCallback;
                                    }
                                    Object obj4 = null;
                                    obj4.hashCode();
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            setPostviewFormatSelector.onNavigationEvent(accessgetcamerafactorypOnExtraCallback, ForwardingCameraControl.onExtraCallback(-1266377518, true, function2, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, accessgetCameraFactoryp.onNavigationEvent | 48);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            }
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                            iAuthTabCallback2 = iAuthTabCallbackOnExtraCallbackWithResult;
                        } else {
                            onwarmupcompletedIAuthTabCallbackDefault = QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
                            final QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted2 = onwarmupcompletedIAuthTabCallbackDefault;
                            accessgetCameraFactoryp accessgetcamerafactorypOnExtraCallback2 = needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(), fMin));
                            final boolean z22 = !zIsBlank;
                            final boolean z32 = !zIsBlank3;
                            final boolean z42 = !zIsBlank2;
                            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport062 = quirksExternalSyntheticBackport05;
                            final onReceivedHttpError.IAuthTabCallback iAuthTabCallback32 = iAuthTabCallbackOnExtraCallbackWithResult;
                            final long j3 = jAsBinder;
                            final long j22 = jAsBinder2;
                            Function2 function22 = new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedKt$$ExternalSyntheticLambda0
                                private static int onExtraCallback = 1;
                                private static int onWarmupCompleted;

                                public final Object invoke(Object obj2, Object obj3) {
                                    int i24 = 2 % 2;
                                    int i25 = onWarmupCompleted + 51;
                                    onExtraCallback = i25 % 128;
                                    int i26 = i25 % 2;
                                    Unit unitIAuthTabCallback = onWebAuthnIntent.IAuthTabCallback(quirksExternalSyntheticBackport062, iAuthTabCallback32, function1, onwarmupcompleted2, z22, str2, jOnExtraCallback, feed, r8lambdanm9dm2eewl4vrptnjmesfjqky4, z32, z, j3, j22, jOnExtraCallbackWithResult, z42, jAsBinder3, jOnExtraCallback3, str, jOnExtraCallback2, jOnExtraCallbackWithResult2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    int i27 = onWarmupCompleted + 45;
                                    onExtraCallback = i27 % 128;
                                    if (i27 % 2 != 0) {
                                        return unitIAuthTabCallback;
                                    }
                                    Object obj4 = null;
                                    obj4.hashCode();
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            setPostviewFormatSelector.onNavigationEvent(accessgetcamerafactorypOnExtraCallback2, ForwardingCameraControl.onExtraCallback(-1266377518, true, function22, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, accessgetCameraFactoryp.onNavigationEvent | 48);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                            iAuthTabCallback2 = iAuthTabCallbackOnExtraCallbackWithResult;
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                    }
                    quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                    iAuthTabCallbackOnExtraCallbackWithResult = iAuthTabCallback2;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    Context context2 = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                    final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky42 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                    boolean zIsBlank4 = StringsKt.isBlank(feed.asInterface());
                    boolean zIsBlank22 = StringsKt.isBlank(feed.IAuthTabCallbackStub());
                    boolean zIsBlank32 = StringsKt.isBlank(feed.asBinder());
                    Object obj2 = null;
                    if (StringsKt.isBlank((String) NativeAdsDto.Creative.Feed.IAuthTabCallback(790435775, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -790435774, new Object[]{feed}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback()))) {
                    }
                    final String str3 = strOnExtraCallback;
                    getStrokeWidth getstrokewidth2 = getStrokeWidth.onExtraCallback;
                    boolean zOnExtraCallbackWithResult2 = getstrokewidth2.onExtraCallbackWithResult(deleteprofile, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i3 >> 6) & 14) | 48);
                    final long jOnExtraCallback4 = ByteOrderedDataOutputStream.onExtraCallback(!zOnExtraCallbackWithResult2 ? 484039167 : 218243143);
                    i5 = onExtraCallbackWithResult + 53;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                    }
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) != 0) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedKt$$ExternalSyntheticLambda1
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj3, Object obj4) {
                    int i24 = 2 % 2;
                    int i25 = onWarmupCompleted + 55;
                    onNavigationEvent = i25 % 128;
                    int i26 = i25 % 2;
                    Unit unitIAuthTabCallback = onWebAuthnIntent.IAuthTabCallback(quirksExternalSyntheticBackport03, z, deleteprofile, feed, iAuthTabCallback2, function1, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i27 = onNavigationEvent + 33;
                    onWarmupCompleted = i27 % 128;
                    if (i27 % 2 == 0) {
                        return unitIAuthTabCallback;
                    }
                    Object obj5 = null;
                    obj5.hashCode();
                    throw null;
                }
            });
        }
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1) {
        return (Unit) onWarmupCompleted(868988513, new Object[]{function1}, -868988507, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(Function1 function1) {
        return (Unit) onWarmupCompleted(-379624146, new Object[]{function1}, 379624147, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        return (Unit) onWarmupCompleted(-1134123069, new Object[]{useandconfigureprogramwithtexture}, 1134123071, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, Function1 function1, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, boolean z, String str, long j, NativeAdsDto.Creative.Feed feed, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, boolean z2, boolean z3, long j2, long j3, long j4, boolean z4, long j5, long j6, String str2, long j7, long j8, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(1467871240, new Object[]{quirksExternalSyntheticBackport0, iAuthTabCallback, function1, onwarmupcompleted, Boolean.valueOf(z), str, Long.valueOf(j), feed, r8lambdanm9dm2eewl4vrptnjmesfjqky4, Boolean.valueOf(z2), Boolean.valueOf(z3), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Boolean.valueOf(z4), Long.valueOf(j5), Long.valueOf(j6), str2, Long.valueOf(j7), Long.valueOf(j8), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -1467871237, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private static final Unit onNavigationEvent(NativeAdsDto.Creative.Feed feed, isQueryRefinementEnabled isqueryrefinementenabled, Function1 function1, long j, String str, long j2, MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onWarmupCompleted(267932619, new Object[]{feed, isqueryrefinementenabled, function1, Long.valueOf(j), str, Long.valueOf(j2), meteringRepeatingSessionExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, -267932614, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private static final Unit onExtraCallback(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        return (Unit) onWarmupCompleted(-1298107730, new Object[]{str, useandconfigureprogramwithtexture}, 1298107730, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback_Parcel(Function1 function1) {
        return (Unit) onWarmupCompleted(847980057, new Object[]{function1}, -847980053, access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback(), access.IAuthTabCallbackStubProxy.IAuthTabCallback());
    }
}
