package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.skt.usp.UCPApiConstants;
import im.toss.ads_sdk.R;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.features.edoc.register.AptPasswordActivity$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
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
import o.WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2;
import o.immediateFailedFuture;
import o.onReceivedHttpError;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2 {
    private static final byte[] $$a = {73, 121, -48, -56};
    private static final int $$b = UCPApiConstants.ARAM_TIME_OUT;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    private static char[] onWarmupCompleted = {11727, 20134, 60217, 1928, 40960, 56532, 31030, 38331, 13948, 21198, 53076, 27604, 33970, 8501, 24047, 65032, 6808, 46865, 54254, 19494, 59626, 1363, 41350, 49741, 32572, 39845, 13355, 20611, 52548, 27030, 35455, 9963, 17192, 65414, 6229, 46455, 53690, 29229, 61078, 2842, 42946, 49275, 31975, 39282, 13780, 22081, 62092, 28590, 34878, 9381, 16661, 64924, 7758, 47850, 55148, 29692, 60491, 2248, 42320, 50724, 25279, 40745, 15263, 21569, 61578, 28029, 35299, 10839, 18077, 58206, 7223, 47283, 10601};
    private static long IAuthTabCallback = -8985027499482444127L;

    private static String $$c(int i, short s, byte b) {
        int i2 = 4 - (s * 3);
        byte[] bArr = $$a;
        int i3 = (i * 4) + 97;
        int i4 = b * 4;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = i4 + (-i2);
            i2++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i2;
            i3 += -bArr[i2];
            i2 = i7 + 1;
            i5 = i6;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, isQueryRefinementEnabled isqueryrefinementenabled, Function1 function1, NativeAdsDto.Creative.Feed feed, long j, boolean z, long j2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 93;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, isqueryrefinementenabled, function1, feed, j, z, j2, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 12 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, useandconfigureprogramwithtexture);
        if (i3 != 0) {
            int i4 = 89 / 0;
        }
        int i5 = onExtraCallback + 99;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(function1);
        if (i3 != 0) {
            int i4 = 91 / 0;
        }
        int i5 = onExtraCallback + 3;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitAccess100;
    }

    public static /* synthetic */ Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
            int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
            return (Unit) onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1099659142, new Object[]{useandconfigureprogramwithtexture}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted2, -1099659138, iOnWarmupCompleted);
        }
        int iOnWarmupCompleted3 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted4 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            asBinder(function1);
            throw null;
        }
        Unit unitAsBinder = asBinder(function1);
        int i3 = onExtraCallback + 41;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitAsBinder;
    }

    public static /* synthetic */ Unit asInterface(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(function1);
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        return unitIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | (~(i8 | i6));
        int i10 = ~((~i6) | i2 | i5);
        int i11 = i9 | i10;
        int i12 = (~(i6 | i8 | i2)) | i10;
        int i13 = i2 | i5;
        int i14 = i2 + i5 + i4 + ((-1865910757) * i) + ((-1665280692) * i3);
        int i15 = i14 * i14;
        int i16 = ((i2 * (-906343980)) - 215482368) + ((-906343980) * i5) + (i11 * (-2063747539)) + (2063747539 * i12) + ((-2063747539) * i13) + (1324875776 * i4) + ((-1540882432) * i) + ((-912261120) * i3) + (1566179328 * i15);
        int i17 = (i2 * (-52584228)) + 761582770 + (i5 * (-52584228)) + (i11 * 415) + (i12 * (-415)) + (i13 * 415) + (i4 * (-52583813)) + (i * (-195242759)) + (i3 * 1657508740) + (i15 * (-834797568));
        switch (i16 + (i17 * i17 * 1251344384)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                String str = (String) objArr[0];
                useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[1];
                int i18 = 2 % 2;
                int i19 = onNavigationEvent + 67;
                onExtraCallback = i19 % 128;
                int i20 = i19 % 2;
                Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, useandconfigureprogramwithtexture);
                int i21 = onNavigationEvent + 17;
                onExtraCallback = i21 % 128;
                int i22 = i21 % 2;
                return unitOnExtraCallbackWithResult;
            default:
                Function1 function1 = (Function1) objArr[0];
                int i23 = 2 % 2;
                int i24 = onExtraCallback + 109;
                onNavigationEvent = i24 % 128;
                int i25 = i24 % 2;
                function1.invoke("2500");
                Unit unit = Unit.INSTANCE;
                int i26 = onExtraCallback + 49;
                onNavigationEvent = i26 % 128;
                int i27 = i26 % 2;
                return unit;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(NativeAdsDto.Creative.Feed feed, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 67;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(feed, j, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 117;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 85;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            getInterfaceDescriptor(function1);
            throw null;
        }
        Unit interfaceDescriptor = getInterfaceDescriptor(function1);
        int i3 = onNavigationEvent + 25;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 46 / 0;
        }
        return interfaceDescriptor;
    }

    public static /* synthetic */ Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(useandconfigureprogramwithtexture);
        int i4 = onNavigationEvent + 27;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        Unit unit = (Unit) onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1926042585, new Object[]{function1}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted2, -1926042585, iOnWarmupCompleted);
        int i4 = onExtraCallback + 121;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, deleteProfile deleteprofile, NativeAdsDto.Creative.Feed feed, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 119;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, z, deleteprofile, feed, iAuthTabCallback, function1, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 != 0) {
            int i7 = 95 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(NativeAdsDto.Creative.Feed feed, long j, isQueryRefinementEnabled isqueryrefinementenabled, Function1 function1, boolean z, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, float f, String str, long j2, boolean z2, long j3, String str2, long j4, MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 43;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(feed, j, isqueryrefinementenabled, function1, z, r8lambdanm9dm2eewl4vrptnjmesfjqky4, f, str, j2, z2, j3, str2, j4, meteringRepeatingSessionExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 51;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 27 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
            int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
            return (Unit) onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1954537244, new Object[]{function1}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted2, -1954537242, iOnWarmupCompleted);
        }
        int iOnWarmupCompleted3 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted4 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, Function1 function1, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, long j, NativeAdsDto.Creative.Feed feed, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, boolean z, long j2, long j3, boolean z2, long j4, long j5, long j6, boolean z3, float f, String str, long j7, boolean z4, long j8, String str2, long j9, long j10, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 95;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, iAuthTabCallback, function1, onwarmupcompleted, j, feed, r8lambdanm9dm2eewl4vrptnjmesfjqky4, z, j2, j3, z2, j4, j5, j6, z3, f, str, j7, z4, j8, str2, j9, j10, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 91;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 15 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            asInterface(useandconfigureprogramwithtexture);
            throw null;
        }
        Unit unitAsInterface = asInterface(useandconfigureprogramwithtexture);
        int i3 = onExtraCallback + 51;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 47 / 0;
        }
        return unitAsInterface;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1) throws Throwable {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return access000(function1);
        }
        access000(function1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, deleteProfile deleteprofile, NativeAdsDto.Creative.Feed feed, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 31;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 2131091957, new Object[]{quirksExternalSyntheticBackport0, Boolean.valueOf(z), deleteprofile, feed, iAuthTabCallback, function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -2131091956, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 117;
        onExtraCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 33 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 119;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
            int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
            return (Unit) onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 448350116, new Object[]{useandconfigureprogramwithtexture}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted2, -448350111, iOnWarmupCompleted);
        }
        int iOnWarmupCompleted3 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted4 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3;
        float f;
        Throwable cause;
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            i3 = -1401950695;
            f = 0.0f;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i5])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 59696), Color.blue(0) + 17, 10973 - View.combineMeasuredStates(0, 0), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getSize(0) + 46134), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31, 20219 - Process.getGidForName(""), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (Process.myTid() >> 22)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44, 1494 - View.resolveSizeAndState(0, 0, 0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i6 = $10 + 113;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i8 = $10 + 125;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 49123), Gravity.getAbsoluteGravity(0, 0) + 44, 1494 - View.MeasureSpec.getMode(0), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr6 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
            if (objOnExtraCallback5 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.getDeadChar(0, 0) + 49123), 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 1494, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            i3 = -1401950695;
            f = 0.0f;
        }
        String str = new String(cArr);
        int i9 = $10 + 105;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke((Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 97;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 39;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asBinder(Function1 function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        function1.invoke("1004");
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallback + 49;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit asInterface(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 13;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 103;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 3;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 49 / 0;
        }
        return unit2;
    }

    private static final Unit IAuthTabCallbackStubProxy(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("2005");
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 53;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            StringsKt.isBlank(str);
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        if (!StringsKt.isBlank(str)) {
            int i3 = onExtraCallback + 7;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallback + 111;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit access100(Function1 function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("1000");
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 81;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit getInterfaceDescriptor(Function1 function1) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("1002");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 101;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(final String str, isQueryRefinementEnabled isqueryrefinementenabled, final Function1 function1, NativeAdsDto.Creative.Feed feed, long j, boolean z, long j2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2009825987, i, -1, "im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedV2.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NativeAdsFeedV2.kt:226)");
                int i3 = onNavigationEvent + 27;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object obj = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), 0.0f, 2, (Object) null);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedV2Kt$$ExternalSyntheticLambda6
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj2) {
                        int i5 = 2 % 2;
                        int i6 = onExtraCallback + 113;
                        onExtraCallbackWithResult = i6 % 128;
                        int i7 = i6 % 2;
                        String str2 = str;
                        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj2;
                        if (i7 != 0) {
                            int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
                            int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
                            return (Unit) WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2.onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1996423725, new Object[]{str2, useandconfigureprogramwithtexture}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted2, 1996423731, iOnWarmupCompleted);
                        }
                        int iOnWarmupCompleted3 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
                        int iOnWarmupCompleted4 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
                        Unit unit = (Unit) WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2.onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1996423725, new Object[]{str2, useandconfigureprogramwithtexture}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted4, 1996423731, iOnWarmupCompleted3);
                        int i8 = 72 / 0;
                        return unit;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = getExtensionsBeforeInitialized.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, true, (Function1) objOnMinimized);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallback(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 6);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback);
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent2) {
                int i5 = onExtraCallback + 77;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = new Function0() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedV2Kt$$ExternalSyntheticLambda7
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            int i6 = 2 % 2;
                            int i7 = onWarmupCompleted + 81;
                            onExtraCallbackWithResult = i7 % 128;
                            int i8 = i7 % 2;
                            Unit unitIAuthTabCallback = WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2.IAuthTabCallback(function1);
                            int i9 = onWarmupCompleted + 85;
                            onExtraCallbackWithResult = i9 % 128;
                            if (i9 % 2 != 0) {
                                return unitIAuthTabCallback;
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = WebViewClientCompat.IAuthTabCallback(onextracallback, isqueryrefinementenabled, (Function0) objOnMinimized2);
                String strAsInterface = feed.asInterface();
                long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15);
                GraphicDeviceInfo.IAuthTabCallback iAuthTabCallback = GraphicDeviceInfo.Companion;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strAsInterface, quirksExternalSyntheticBackport0IAuthTabCallback2, null, Long.valueOf(j), Long.valueOf(jOnExtraCallback), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, iAuthTabCallback.IAuthTabCallback(), null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (z) {
                    int i6 = onNavigationEvent + 75;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1625094465);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 5, (Object) null);
                    boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (zOnNavigationEvent3 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized3 = new Function0() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedV2Kt$$ExternalSyntheticLambda8
                            private static int IAuthTabCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke() {
                                int i8 = 2 % 2;
                                int i9 = onWarmupCompleted + 99;
                                IAuthTabCallback = i9 % 128;
                                int i10 = i9 % 2;
                                Unit unitOnExtraCallback = WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2.onExtraCallback(function1);
                                int i11 = onWarmupCompleted + 7;
                                IAuthTabCallback = i11 % 128;
                                int i12 = i11 % 2;
                                return unitOnExtraCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback3 = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, isqueryrefinementenabled, (Function0) objOnMinimized3);
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{feed.IAuthTabCallbackStub(), quirksExternalSyntheticBackport0IAuthTabCallback3, null, Long.valueOf(j2), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, iAuthTabCallback.onNavigationEvent(), null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1624415100);
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit access000(Function1 function1) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(3 / (ViewConfiguration.getEdgeSlop() - 34), -TextUtils.indexOf((CharSequence) "", (char) 2, 0), (char) (50317 >>> Color.blue(1)), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(72 - (ViewConfiguration.getEdgeSlop() >> 16), -TextUtils.indexOf((CharSequence) "", '0', 0), (char) (50317 - Color.blue(0)), objArr2);
            obj = objArr2[0];
        }
        function1.invoke(((String) obj).intern());
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 73;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(final NativeAdsDto.Creative.Feed feed, long j, final isQueryRefinementEnabled isqueryrefinementenabled, final Function1 function1, boolean z, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, float f, final String str, final long j2, final boolean z2, final long j3, String str2, long j4, MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z3;
        final String str3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 83;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(meteringRepeatingSessionExternalSyntheticLambda0, "");
            z3 = (i & 2) != 67;
        } else {
            Intrinsics.checkNotNullParameter(meteringRepeatingSessionExternalSyntheticLambda0, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z3, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(238844228, i, -1, "im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedV2.<anonymous>.<anonymous>.<anonymous> (NativeAdsFeedV2.kt:200)");
            }
            String strAccess000 = feed.access000();
            if (StringsKt.isBlank(strAccess000)) {
                int i5 = onNavigationEvent + 83;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                str3 = null;
            } else {
                str3 = strAccess000;
            }
            if (str3 != null) {
                int i7 = onNavigationEvent + 37;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1352270429);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str3);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedV2Kt$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj) {
                            int i9 = 2 % 2;
                            int i10 = onWarmupCompleted + 109;
                            IAuthTabCallback = i10 % 128;
                            int i11 = i10 % 2;
                            String str4 = str3;
                            useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj;
                            if (i11 == 0) {
                                return WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2.IAuthTabCallback(str4, useandconfigureprogramwithtexture);
                            }
                            WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2.IAuthTabCallback(str4, useandconfigureprogramwithtexture);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                quirksExternalSyntheticBackport0OnWarmupCompleted = getExtensionsBeforeInitialized.onExtraCallbackWithResult(onextracallback, false, (Function1) objOnMinimized, 1, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i9 = onExtraCallback + 79;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1352174763);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized2 = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedV2Kt$$ExternalSyntheticLambda1
                        private static int onNavigationEvent = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj) {
                            int i11 = 2 % 2;
                            int i12 = onNavigationEvent + 53;
                            onWarmupCompleted = i12 % 128;
                            int i13 = i12 % 2;
                            Unit unitIAuthTabCallback = WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2.IAuthTabCallback((useAndConfigureProgramWithTexture) obj);
                            int i14 = onNavigationEvent + 13;
                            onWarmupCompleted = i14 % 128;
                            int i15 = i14 % 2;
                            return unitIAuthTabCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                quirksExternalSyntheticBackport0OnWarmupCompleted = getExtensionsBeforeInitialized.onWarmupCompleted(onextracallback2, (Function1) objOnMinimized2);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(FocusMeteringControlExternalSyntheticLambda2.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null), 1.91f, false, 2, (Object) null), setByteOrder.Companion.onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            } else {
                int i11 = onNavigationEvent + 1;
                onExtraCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            String interfaceDescriptor = feed.getInterfaceDescriptor();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null).onExtraCallback(quirksExternalSyntheticBackport0OnWarmupCompleted);
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent2 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized3 = new Function0() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedV2Kt$$ExternalSyntheticLambda2
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke() {
                        int i12 = 2 % 2;
                        int i13 = onExtraCallback + 1;
                        onWarmupCompleted = i13 % 128;
                        int i14 = i13 % 2;
                        Unit unitAsInterface = WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2.asInterface(function1);
                        int i15 = onExtraCallback + 107;
                        onWarmupCompleted = i15 % 128;
                        int i16 = i15 % 2;
                        return unitAsInterface;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback2, isqueryrefinementenabled, (Function0) objOnMinimized3);
            immediateFailedFuture.IAuthTabCallback iAuthTabCallback = immediateFailedFuture.Companion;
            AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{interfaceDescriptor, quirksExternalSyntheticBackport0IAuthTabCallback, str3, null, null, null, null, null, iAuthTabCallback.onWarmupCompleted(), null, cameraCaptureResultEmptyCameraCaptureResult, 100663296, 760}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
            if (z) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-269380775);
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                i2 = 1;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(), Math.min(f, 1.0f))), ForwardingCameraControl.onExtraCallback(2009825987, true, new Function2() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedV2Kt$$ExternalSyntheticLambda3
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;

                    public final Object invoke(Object obj, Object obj2) {
                        int i12 = 2 % 2;
                        int i13 = onExtraCallback + 57;
                        IAuthTabCallback = i13 % 128;
                        Object obj3 = null;
                        if (i13 % 2 == 0) {
                            WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2.IAuthTabCallback(str, isqueryrefinementenabled, function1, feed, j2, z2, j3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            throw null;
                        }
                        Unit unitIAuthTabCallback = WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2.IAuthTabCallback(str, isqueryrefinementenabled, function1, feed, j2, z2, j3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i14 = onExtraCallback + 97;
                        IAuthTabCallback = i14 % 128;
                        if (i14 % 2 != 0) {
                            return unitIAuthTabCallback;
                        }
                        obj3.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, accessgetCameraFactoryp.onNavigationEvent | 48);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
                i2 = 1;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-267156060);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport03, 0.0f, i2, (Object) null), j, (toMetersPerSecond) null, 2, (Object) null);
            component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0OnExtraCallback3);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport03, 0.0f, i2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f));
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(function1);
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent3) {
                int i12 = onExtraCallback + 49;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized4 = new Function0() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedV2Kt$$ExternalSyntheticLambda4
                        private static int onExtraCallback = 1;
                        private static int onNavigationEvent;

                        public final Object invoke() throws Throwable {
                            int i14 = 2 % 2;
                            int i15 = onNavigationEvent + 63;
                            onExtraCallback = i15 % 128;
                            int i16 = i15 % 2;
                            Unit unitOnWarmupCompleted = WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2.onWarmupCompleted(function1);
                            int i17 = onNavigationEvent + 7;
                            onExtraCallback = i17 % 128;
                            if (i17 % 2 != 0) {
                                return unitOnWarmupCompleted;
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized4);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent, isqueryrefinementenabled, (Function0) objOnMinimized4);
                component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), onextracallbackwithresult.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResult2, 48);
                int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult2, quirksExternalSyntheticBackport0IAuthTabCallback2);
                Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0IAuthTabCallback3);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult2.onTransact());
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str2, RowScope.onNavigationEvent(RowScopeInstance.onNavigationEvent, quirksExternalSyntheticBackport03, 1.0f, false, 2, (Object) null), null, Long.valueOf(j4), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, GraphicDeviceInfo.Companion.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport03, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f));
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized5 = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedV2Kt$$ExternalSyntheticLambda5
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallbackWithResult;

                        public final Object invoke(Object obj) {
                            int i14 = 2 % 2;
                            int i15 = onExtraCallbackWithResult + 91;
                            IAuthTabCallback = i15 % 128;
                            int i16 = i15 % 2;
                            Unit unitOnWarmupCompleted = WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2.onWarmupCompleted((useAndConfigureProgramWithTexture) obj);
                            if (i16 == 0) {
                                int i17 = 89 / 0;
                            }
                            int i18 = IAuthTabCallback + 15;
                            onExtraCallbackWithResult = i18 % 128;
                            int i19 = i18 % 2;
                            return unitOnWarmupCompleted;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallbackDefault, (Function1) objOnMinimized5);
                immediateFailedFuture immediatefailedfutureIAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
                Object[] objArr = new Object[1];
                a(Gravity.getAbsoluteGravity(0, 0), 72 - KeyEvent.getDeadChar(0, 0), (char) (49268 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr);
                AppLovinNativeAdImplc.onExtraCallback(((String) objArr[0]).intern(), j4, quirksExternalSyntheticBackport0OnWarmupCompleted5, (String) null, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, immediatefailedfutureIAuthTabCallback, (Painter) null, cameraCaptureResultEmptyCameraCaptureResult, 100666374, 752);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i14 = onExtraCallback + 107;
                    onNavigationEvent = i14 % 128;
                    int i15 = i14 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(NativeAdsDto.Creative.Feed feed, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallback;
            int i4 = i3 + 63;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 105;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2131904187, i, -1, "im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedV2.<anonymous>.<anonymous>.<anonymous> (NativeAdsFeedV2.kt:303)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{feed.onTransact(), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), null, Long.valueOf(j), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(8)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 27696, 0, 131044}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallback + 121;
        onNavigationEvent = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04b7  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, final Function1 function1, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, long j, final NativeAdsDto.Creative.Feed feed, final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, boolean z, long j2, long j3, boolean z2, long j4, long j5, final long j6, final boolean z3, final float f, final String str, final long j7, final boolean z4, final long j8, final String str2, final long j9, final long j10, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        ?? r2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent;
        Object objOnMinimized;
        int i2;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 47;
        onExtraCallback = i4 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i4 % 2 == 0 ? (i & 3) != 2 : (i & 3) != 2, i & 1)) {
            int i5 = onExtraCallback + 43;
            onNavigationEvent = i5 % 128;
            Object obj = null;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-120769492, i, -1, "im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedV2.<anonymous> (NativeAdsFeedV2.kt:111)");
            }
            final isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabledOnNavigationEvent = WebViewClientCompat.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 0);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(WebViewClientCompat.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), isqueryrefinementenabledOnNavigationEvent), iAuthTabCallback.onWarmupCompleted(), iAuthTabCallback.onExtraCallbackWithResult(), iAuthTabCallback.IAuthTabCallback(), iAuthTabCallback.onNavigationEvent());
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnNavigationEvent || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new Function0() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedV2Kt$$ExternalSyntheticLambda9
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i6 = 2 % 2;
                        int i7 = IAuthTabCallback + 121;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitOnNavigationEvent = WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2.onNavigationEvent(function1);
                        int i9 = IAuthTabCallback + 37;
                        onWarmupCompleted = i9 % 128;
                        if (i9 % 2 != 0) {
                            return unitOnNavigationEvent;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted, isqueryrefinementenabledOnNavigationEvent, (Function0) objOnMinimized2);
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i6 = onNavigationEvent + 97;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
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
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
            float f2 = 2.0f;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i8 = onExtraCallback + 59;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 == 0) {
                    getAwbState.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i9 = onExtraCallback + 125;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            if (z) {
                int i11 = onExtraCallback + 113;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(290327466);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ensureNavButtonView.onExtraCallback(setExtensionStrength.onExtraCallbackWithResult(verifyDrawable.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport04, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(36.0f)), j2, RoundedCornerShapeKt.onWarmupCompleted()), RoundedCornerShapeKt.onWarmupCompleted()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f), j3, RoundedCornerShapeKt.onWarmupCompleted());
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (zOnNavigationEvent2 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized3 = new Function0() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedV2Kt$$ExternalSyntheticLambda10
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            int i13 = 2 % 2;
                            int i14 = onWarmupCompleted + 19;
                            onExtraCallback = i14 % 128;
                            int i15 = i14 % 2;
                            Unit unitOnExtraCallbackWithResult = WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2.onExtraCallbackWithResult(function1);
                            int i16 = onWarmupCompleted + 33;
                            onExtraCallback = i16 % 128;
                            if (i16 % 2 != 0) {
                                return unitOnExtraCallbackWithResult;
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback2, isqueryrefinementenabledOnNavigationEvent, (Function0) objOnMinimized3);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized4 = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedV2Kt$$ExternalSyntheticLambda11
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj3) {
                            int i13 = 2 % 2;
                            int i14 = onNavigationEvent + 27;
                            onExtraCallbackWithResult = i14 % 128;
                            int i15 = i14 % 2;
                            Unit unitOnExtraCallback = WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2.onExtraCallback((useAndConfigureProgramWithTexture) obj3);
                            int i16 = onExtraCallbackWithResult + 59;
                            onNavigationEvent = i16 % 128;
                            if (i16 % 2 != 0) {
                                int i17 = 36 / 0;
                            }
                            return unitOnExtraCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback2, (Function1) objOnMinimized4);
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
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
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted5, onextracallbackwithresult2.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                r2 = 0;
                AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{feed.asBinder(), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport04, 0.0f, 1, (Object) null), null, null, null, null, null, null, immediateFailedFuture.Companion.onWarmupCompleted(), null, cameraCaptureResultEmptyCameraCaptureResult, 100663728, 760}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                r2 = 0;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(291255792);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(RowScope.onNavigationEvent(rowScopeInstance, quirksExternalSyntheticBackport02, 1.0f, false, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, (int) r2);
            int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, (int) r2));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted6 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback3);
            Function0 function0IAuthTabCallback4 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i13 = onNavigationEvent + 71;
                onExtraCallback = i13 % 128;
                if (i13 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    throw null;
                }
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted6, onextracallbackwithresult2.onTransact());
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback4 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport02, z ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            if (z2) {
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                quirksExternalSyntheticBackport0OnNavigationEvent = quirksExternalSyntheticBackport03;
            } else {
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport03, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(36.0f), 1, (Object) null);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback5 = quirksExternalSyntheticBackport0OnExtraCallback4.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent);
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent3) {
                int i14 = onNavigationEvent + 25;
                onExtraCallback = i14 % 128;
                int i15 = i14 % 2;
                if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized5 = new Function0() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedV2Kt$$ExternalSyntheticLambda12
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            int i16 = 2 % 2;
                            int i17 = onWarmupCompleted + 51;
                            onExtraCallbackWithResult = i17 % 128;
                            int i18 = i17 % 2;
                            Unit unitIAuthTabCallbackDefault = WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2.IAuthTabCallbackDefault(function1);
                            int i19 = onWarmupCompleted + 77;
                            onExtraCallbackWithResult = i19 % 128;
                            if (i19 % 2 != 0) {
                                return unitIAuthTabCallbackDefault;
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback3 = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback5, isqueryrefinementenabledOnNavigationEvent, (Function0) objOnMinimized5);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{feed.IAuthTabCallbackDefault(), quirksExternalSyntheticBackport0IAuthTabCallback3, null, Long.valueOf(j4), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(16)), 0L, null, null, createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.onTransact()), Float.valueOf(0.0f), null, null, 0L, Integer.valueOf((int) r2), Boolean.valueOf((boolean) r2), GraphicDeviceInfo.Companion.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 196608, 98020}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (!z2) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2093385222);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    i2 = 1;
                } else {
                    int i16 = onNavigationEvent + 29;
                    onExtraCallback = i16 % 128;
                    if (i16 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2092980920);
                        if (z) {
                            f2 = 10.0f;
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback6 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport05, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f2), 0.0f, 0.0f, 0.0f, 14, (Object) null);
                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = new Function1() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedV2Kt$$ExternalSyntheticLambda13
                                private static int onExtraCallback = 1;
                                private static int onNavigationEvent;

                                public final Object invoke(Object obj3) {
                                    int i17 = 2 % 2;
                                    int i18 = onNavigationEvent + 123;
                                    onExtraCallback = i18 % 128;
                                    int i19 = i18 % 2;
                                    int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
                                    int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
                                    Unit unit = (Unit) WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2.onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -715888515, new Object[]{(useAndConfigureProgramWithTexture) obj3}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted2, 715888518, iOnWarmupCompleted);
                                    int i20 = onNavigationEvent + 125;
                                    onExtraCallback = i20 % 128;
                                    if (i20 % 2 == 0) {
                                        int i21 = 66 / 0;
                                    }
                                    return unit;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted7 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback6, (Function1) objOnMinimized);
                        i2 = 1;
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.ads_sdk_ad, cameraCaptureResultEmptyCameraCaptureResult, (int) r2), quirksExternalSyntheticBackport0OnWarmupCompleted7, null, Long.valueOf(j5), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf((int) r2), Boolean.valueOf((boolean) r2), null, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, Integer.valueOf((int) r2), 131044}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2092980920);
                        if (!z) {
                            f2 = 0.0f;
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback62 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport05, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f2), 0.0f, 0.0f, 0.0f, 14, (Object) null);
                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted72 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback62, (Function1) objOnMinimized);
                        i2 = 1;
                        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.ads_sdk_ad, cameraCaptureResultEmptyCameraCaptureResult, (int) r2), quirksExternalSyntheticBackport0OnWarmupCompleted72, null, Long.valueOf(j5), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf((int) r2), Boolean.valueOf((boolean) r2), null, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, Integer.valueOf((int) r2), 131044}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback7 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport05, 0.0f, i2, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, 0.0f, 13, (Object) null);
                RoundedCornerShape roundedCornerShapeOnNavigationEvent = RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f));
                setFeatureSelectionListener setfeatureselectionlistener = setFeatureSelectionListener.onNavigationEvent;
                long jOnNavigationEvent = setByteOrder.Companion.onNavigationEvent();
                int i17 = setFeatureSelectionListener.onExtraCallbackWithResult;
                SessionConfigBuilder.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback7, roundedCornerShapeOnNavigationEvent, setfeatureselectionlistener.onNavigationEvent(jOnNavigationEvent, 0L, 0L, 0L, cameraCaptureResultEmptyCameraCaptureResult, (i17 << 12) | 6, 14), (SessionConfigExternalSyntheticLambda0) null, setfeatureselectionlistener.IAuthTabCallback(true, cameraCaptureResultEmptyCameraCaptureResult, (i17 << 3) | 6, (int) r2).onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.5f), new createString(j, (DefaultConstructorMarker) null)), ForwardingCameraControl.onExtraCallback(238844228, true, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedV2Kt$$ExternalSyntheticLambda14
                    private static int onExtraCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj3, Object obj4, Object obj5) throws Throwable {
                        int i18 = 2 % 2;
                        int i19 = onExtraCallback + 17;
                        onNavigationEvent = i19 % 128;
                        int i20 = i19 % 2;
                        Unit unitOnNavigationEvent = WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2.onNavigationEvent(feed, j6, isqueryrefinementenabledOnNavigationEvent, function1, z3, r8lambdanm9dm2eewl4vrptnjmesfjqky4, f, str, j7, z4, j8, str2, j9, (MeteringRepeatingSessionExternalSyntheticLambda0) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                        int i21 = onExtraCallback + 49;
                        onNavigationEvent = i21 % 128;
                        if (i21 % 2 != 0) {
                            return unitOnNavigationEvent;
                        }
                        Object obj6 = null;
                        obj6.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 196614, 8);
                if (feed.onTransact() == null || !(!StringsKt.isBlank(r0))) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1892272308);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1892752808);
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport05, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                    setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(), 1.0f)), ForwardingCameraControl.onExtraCallback(2131904187, true, new Function2() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedV2Kt$$ExternalSyntheticLambda15
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj3, Object obj4) {
                            int i18 = 2 % 2;
                            int i19 = onExtraCallbackWithResult + 1;
                            IAuthTabCallback = i19 % 128;
                            int i20 = i19 % 2;
                            NativeAdsDto.Creative.Feed feed2 = feed;
                            if (i20 == 0) {
                                return WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2.onExtraCallback(feed2, j10, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            }
                            WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2.onExtraCallback(feed2, j10, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            Object obj5 = null;
                            obj5.hashCode();
                            throw null;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i2;
        Function1 function1;
        deleteProfile deleteprofile;
        NativeAdsDto.Creative.Feed feed;
        final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        final onReceivedHttpError.IAuthTabCallback iAuthTabCallback;
        boolean zIsBlank;
        String strOnExtraCallback;
        boolean zOnExtraCallbackWithResult;
        long jMayLaunchUrl;
        long jITrustedWebActivityCallbackStub;
        long jMayLaunchUrl2;
        long jLongValue;
        int i3;
        long jOnUnminimized;
        String strAsInterface;
        QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault;
        float f;
        Configuration configuration;
        int i4;
        int i5;
        int i6;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = (QuirksExternalSyntheticBackport0) objArr[0];
        final boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        deleteProfile deleteprofile2 = (deleteProfile) objArr[2];
        final NativeAdsDto.Creative.Feed feed2 = (NativeAdsDto.Creative.Feed) objArr[3];
        onReceivedHttpError.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = (onReceivedHttpError.IAuthTabCallback) objArr[4];
        final Function1 function12 = (Function1) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        final int iIntValue2 = ((Number) objArr[8]).intValue();
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(deleteprofile2, "");
        Intrinsics.checkNotNullParameter(feed2, "");
        Intrinsics.checkNotNullParameter(function12, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(1856340204);
        int i8 = iIntValue2 & 1;
        Object obj = null;
        if (i8 != 0) {
            int i9 = onNavigationEvent + 23;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            i = iIntValue | 6;
        } else if ((iIntValue & 6) == 0) {
            int i11 = onNavigationEvent + 17;
            onExtraCallback = i11 % 128;
            if (i11 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2);
                obj.hashCode();
                throw null;
            }
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            int i12 = onExtraCallback + 77;
            onNavigationEvent = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 14 / 0;
                i6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ? 32 : 16;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue)) {
            }
            i |= i6;
        }
        if ((iIntValue & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(deleteprofile2.ordinal())) {
                int i14 = onExtraCallback + 115;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                i5 = 256;
            } else {
                i5 = 128;
            }
            i |= i5;
        }
        if ((iIntValue & 3072) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(feed2) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            if ((iIntValue2 & 16) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackOnExtraCallbackWithResult)) {
                int i16 = onNavigationEvent + 83;
                onExtraCallback = i16 % 128;
                int i17 = i16 % 2;
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i |= i4;
        }
        if ((196608 & iIntValue) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 131072 : 65536;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i) != 74898, i & 1)) {
            int i18 = onNavigationEvent + 3;
            onExtraCallback = i18 % 128;
            if (i18 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((iIntValue & 1) != 0 && !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((iIntValue2 & 16) != 0) {
                        i &= -57345;
                    }
                    final onReceivedHttpError.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallbackOnExtraCallbackWithResult;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i19 = onNavigationEvent + 61;
                        onExtraCallback = i19 % 128;
                        int i20 = i19 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1856340204, i, -1, "im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedV2 (NativeAdsFeedV2.kt:67)");
                    }
                    Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
                    final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                    zIsBlank = StringsKt.isBlank(feed2.asInterface());
                    boolean zIsBlank2 = StringsKt.isBlank(feed2.IAuthTabCallbackStub());
                    boolean zIsBlank3 = StringsKt.isBlank(feed2.asBinder());
                    if (StringsKt.isBlank((String) NativeAdsDto.Creative.Feed.IAuthTabCallback(790435775, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -790435774, new Object[]{feed2}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback()))) {
                        int i21 = onExtraCallback + 97;
                        onNavigationEvent = i21 % 128;
                        int i22 = i21 % 2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(232679448);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        strOnExtraCallback = (String) NativeAdsDto.Creative.Feed.IAuthTabCallback(790435775, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -790435774, new Object[]{feed2}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(232716183);
                        strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.ads_sdk_text_more, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    }
                    final String str = strOnExtraCallback;
                    getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
                    zOnExtraCallbackWithResult = getstrokewidth.onExtraCallbackWithResult(deleteprofile2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i >> 6) & 14) | 48);
                    if (zOnExtraCallbackWithResult) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1531534490);
                        jMayLaunchUrl = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).mayLaunchUrl();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1531533089);
                        jMayLaunchUrl = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ITrustedWebActivityCallbackStub();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    if (!zOnExtraCallbackWithResult) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1531536897);
                        jITrustedWebActivityCallbackStub = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ITrustedWebActivityCallbackStub();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1531538298);
                        jITrustedWebActivityCallbackStub = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).mayLaunchUrl();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    if (zOnExtraCallbackWithResult) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1531542106);
                        jMayLaunchUrl2 = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).mayLaunchUrl();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1531540705);
                        jMayLaunchUrl2 = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ITrustedWebActivityCallbackStub();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    if (zOnExtraCallbackWithResult) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1531545747);
                        jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1531544353);
                        jLongValue = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ITrustedWebActivityCallback_Parcel();
                    }
                    final long j = jLongValue;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    if (zOnExtraCallbackWithResult) {
                        i3 = 6;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1531549139);
                        jOnUnminimized = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onUnminimized();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1531547745);
                        i3 = 6;
                        jOnUnminimized = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).areNotificationsEnabled();
                    }
                    final long j2 = jOnUnminimized;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    final long jIPostMessageService_Parcel = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i3).IPostMessageService_Parcel();
                    final long jITrustedWebActivityServiceDefault = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i3).ITrustedWebActivityServiceDefault();
                    final long jOnExtraCallbackWithResult = ByteOrderedDataOutputStream.onExtraCallbackWithResult(4287337889L);
                    final long jOnExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(getstrokewidth.IAuthTabCallback(context, feed2.IAuthTabCallback_Parcel(), -1));
                    final long jOnExtraCallback2 = ByteOrderedDataOutputStream.onExtraCallback(getstrokewidth.IAuthTabCallback(context, (String) NativeAdsDto.Creative.Feed.IAuthTabCallback(545562487, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -545562487, new Object[]{feed2}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback()), Color.parseColor("#3485fa")));
                    if (!zIsBlank || zIsBlank2) {
                        strAsInterface = feed2.asInterface();
                    } else {
                        strAsInterface = feed2.asInterface() + ", " + feed2.IAuthTabCallbackStub();
                    }
                    final float fMin = Math.min(context.getApplicationContext().getResources().getConfiguration().fontScale, 1.6f);
                    if (zBooleanValue) {
                        Resources resources = context.getResources();
                        if (resources == null || (configuration = resources.getConfiguration()) == null) {
                            f = 1.0f;
                        } else {
                            int i23 = onExtraCallback + 23;
                            onNavigationEvent = i23 % 128;
                            if (i23 % 2 == 0) {
                                float f2 = configuration.fontScale;
                                throw null;
                            }
                            f = configuration.fontScale;
                        }
                        if (f > 1.1f) {
                            onwarmupcompletedIAuthTabCallbackDefault = QuirkSettingsLoader.Companion.access000();
                        }
                        final QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted = onwarmupcompletedIAuthTabCallbackDefault;
                        accessgetCameraFactoryp accessgetcamerafactorypOnExtraCallback = needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(), fMin));
                        final boolean z = !zIsBlank3;
                        final boolean z2 = !zIsBlank;
                        final boolean z3 = !zIsBlank2;
                        final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = onextracallback2;
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback4 = onextracallback2;
                        cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        final long j3 = jMayLaunchUrl2;
                        i2 = iIntValue;
                        function1 = function12;
                        deleteprofile = deleteprofile2;
                        feed = feed2;
                        final long j4 = jMayLaunchUrl;
                        final long j5 = jITrustedWebActivityCallbackStub;
                        final String str2 = strAsInterface;
                        setPostviewFormatSelector.onNavigationEvent(accessgetcamerafactorypOnExtraCallback, ForwardingCameraControl.onExtraCallback(-120769492, true, new Function2() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedV2Kt$$ExternalSyntheticLambda16
                            private static int IAuthTabCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i24 = 2 % 2;
                                int i25 = IAuthTabCallback + 73;
                                onWarmupCompleted = i25 % 128;
                                int i26 = i25 % 2;
                                Unit unitOnNavigationEvent = WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2.onNavigationEvent(onextracallback3, iAuthTabCallback2, function12, onwarmupcompleted, j3, feed2, r8lambdanm9dm2eewl4vrptnjmesfjqky4, z, j4, j5, zBooleanValue, j, j2, jOnExtraCallback2, z2, fMin, str2, jIPostMessageService_Parcel, z3, jITrustedWebActivityServiceDefault, str, jOnExtraCallback, jOnExtraCallbackWithResult, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                int i27 = IAuthTabCallback + 115;
                                onWarmupCompleted = i27 % 128;
                                if (i27 % 2 != 0) {
                                    return unitOnNavigationEvent;
                                }
                                throw null;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        onextracallback = onextracallback4;
                        iAuthTabCallback = iAuthTabCallback2;
                    } else {
                        onwarmupcompletedIAuthTabCallbackDefault = QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
                        int i24 = onNavigationEvent + 29;
                        onExtraCallback = i24 % 128;
                        int i25 = i24 % 2;
                        final QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted2 = onwarmupcompletedIAuthTabCallbackDefault;
                        accessgetCameraFactoryp accessgetcamerafactorypOnExtraCallback2 = needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky4.IAuthTabCallback(), fMin));
                        final boolean z4 = !zIsBlank3;
                        final boolean z22 = !zIsBlank;
                        final boolean z32 = !zIsBlank2;
                        final QuirksExternalSyntheticBackport0 onextracallback32 = onextracallback2;
                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback42 = onextracallback2;
                        cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        final long j32 = jMayLaunchUrl2;
                        i2 = iIntValue;
                        function1 = function12;
                        deleteprofile = deleteprofile2;
                        feed = feed2;
                        final long j42 = jMayLaunchUrl;
                        final long j52 = jITrustedWebActivityCallbackStub;
                        final String str22 = strAsInterface;
                        setPostviewFormatSelector.onNavigationEvent(accessgetcamerafactorypOnExtraCallback2, ForwardingCameraControl.onExtraCallback(-120769492, true, new Function2() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedV2Kt$$ExternalSyntheticLambda16
                            private static int IAuthTabCallback = 0;
                            private static int onWarmupCompleted = 1;

                            public final Object invoke(Object obj2, Object obj3) {
                                int i242 = 2 % 2;
                                int i252 = IAuthTabCallback + 73;
                                onWarmupCompleted = i252 % 128;
                                int i26 = i252 % 2;
                                Unit unitOnNavigationEvent = WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2.onNavigationEvent(onextracallback32, iAuthTabCallback2, function12, onwarmupcompleted2, j32, feed2, r8lambdanm9dm2eewl4vrptnjmesfjqky4, z4, j42, j52, zBooleanValue, j, j2, jOnExtraCallback2, z22, fMin, str22, jIPostMessageService_Parcel, z32, jITrustedWebActivityServiceDefault, str, jOnExtraCallback, jOnExtraCallbackWithResult, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                int i27 = IAuthTabCallback + 115;
                                onWarmupCompleted = i27 % 128;
                                if (i27 % 2 != 0) {
                                    return unitOnNavigationEvent;
                                }
                                throw null;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        onextracallback = onextracallback42;
                        iAuthTabCallback = iAuthTabCallback2;
                    }
                }
            }
            if (i8 != 0) {
                onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
            }
            if ((iIntValue2 & 16) != 0) {
                iAuthTabCallbackOnExtraCallbackWithResult = onReceivedHttpError.onNavigationEvent.onExtraCallbackWithResult(false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100663296, 255);
                i &= -57345;
            }
            final onReceivedHttpError.IAuthTabCallback iAuthTabCallback22 = iAuthTabCallbackOnExtraCallbackWithResult;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            }
            Context context2 = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky42 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            zIsBlank = StringsKt.isBlank(feed2.asInterface());
            boolean zIsBlank22 = StringsKt.isBlank(feed2.IAuthTabCallbackStub());
            boolean zIsBlank32 = StringsKt.isBlank(feed2.asBinder());
            if (StringsKt.isBlank((String) NativeAdsDto.Creative.Feed.IAuthTabCallback(790435775, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -790435774, new Object[]{feed2}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback()))) {
            }
            final String str3 = strOnExtraCallback;
            getStrokeWidth getstrokewidth2 = getStrokeWidth.onExtraCallback;
            zOnExtraCallbackWithResult = getstrokewidth2.onExtraCallbackWithResult(deleteprofile2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i >> 6) & 14) | 48);
            if (zOnExtraCallbackWithResult) {
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            if (!zOnExtraCallbackWithResult) {
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            if (zOnExtraCallbackWithResult) {
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            if (zOnExtraCallbackWithResult) {
            }
            final long j6 = jLongValue;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            if (zOnExtraCallbackWithResult) {
            }
            final long j22 = jOnUnminimized;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda02 = y3ExternalSyntheticLambda0.onExtraCallback;
            final long jIPostMessageService_Parcel2 = y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i3).IPostMessageService_Parcel();
            final long jITrustedWebActivityServiceDefault2 = y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i3).ITrustedWebActivityServiceDefault();
            final long jOnExtraCallbackWithResult2 = ByteOrderedDataOutputStream.onExtraCallbackWithResult(4287337889L);
            final long jOnExtraCallback3 = ByteOrderedDataOutputStream.onExtraCallback(getstrokewidth2.IAuthTabCallback(context2, feed2.IAuthTabCallback_Parcel(), -1));
            final long jOnExtraCallback22 = ByteOrderedDataOutputStream.onExtraCallback(getstrokewidth2.IAuthTabCallback(context2, (String) NativeAdsDto.Creative.Feed.IAuthTabCallback(545562487, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -545562487, new Object[]{feed2}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback()), Color.parseColor("#3485fa")));
            if (zIsBlank) {
                strAsInterface = feed2.asInterface();
                final float fMin2 = Math.min(context2.getApplicationContext().getResources().getConfiguration().fontScale, 1.6f);
                if (zBooleanValue) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i2 = iIntValue;
            function1 = function12;
            deleteprofile = deleteprofile2;
            feed = feed2;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            onextracallback = onextracallback2;
            iAuthTabCallback = iAuthTabCallbackOnExtraCallbackWithResult;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final deleteProfile deleteprofile3 = deleteprofile;
            final NativeAdsDto.Creative.Feed feed3 = feed;
            final Function1 function13 = function1;
            final int i26 = i2;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.v2.compose.NativeAdsFeedV2Kt$$ExternalSyntheticLambda17
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3) {
                    int i27 = 2 % 2;
                    int i28 = onWarmupCompleted + 47;
                    onExtraCallback = i28 % 128;
                    int i29 = i28 % 2;
                    Unit unitOnExtraCallbackWithResult = WindowAreaControllerImplwindowAreaInfos1ExternalSyntheticLambda2.onExtraCallbackWithResult(onextracallback, zBooleanValue, deleteprofile3, feed3, iAuthTabCallback, function13, i26, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i30 = onExtraCallback + 103;
                    onWarmupCompleted = i30 % 128;
                    if (i30 % 2 == 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            });
        }
        return null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return (Unit) onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -715888515, new Object[]{useandconfigureprogramwithtexture}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted2, 715888518, iOnWarmupCompleted);
    }

    public static /* synthetic */ Unit onExtraCallback(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return (Unit) onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1996423725, new Object[]{str, useandconfigureprogramwithtexture}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted2, 1996423731, iOnWarmupCompleted);
    }

    public static final void onExtraCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, @NotNull deleteProfile deleteprofile, @NotNull NativeAdsDto.Creative.Feed feed, @Nullable onReceivedHttpError.IAuthTabCallback iAuthTabCallback, @NotNull Function1<? super String, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Boolean.valueOf(z), deleteprofile, feed, iAuthTabCallback, function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 2131091957, objArr, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -2131091956, iOnWarmupCompleted);
    }

    private static final Unit onTransact(Function1 function1) {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return (Unit) onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1954537244, new Object[]{function1}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted2, -1954537242, iOnWarmupCompleted);
    }

    private static final Unit IAuthTabCallbackStub(Function1 function1) {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return (Unit) onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1926042585, new Object[]{function1}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted2, -1926042585, iOnWarmupCompleted);
    }

    private static final Unit IAuthTabCallbackDefault(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return (Unit) onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1099659142, new Object[]{useandconfigureprogramwithtexture}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted2, -1099659138, iOnWarmupCompleted);
    }

    private static final Unit IAuthTabCallbackStub(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnWarmupCompleted = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        int iOnWarmupCompleted2 = AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted();
        return (Unit) onExtraCallback(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 448350116, new Object[]{useandconfigureprogramwithtexture}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), iOnWarmupCompleted2, -448350111, iOnWarmupCompleted);
    }
}
