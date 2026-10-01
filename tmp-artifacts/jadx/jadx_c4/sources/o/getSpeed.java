package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import im.toss.uikit.R;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.Camera2CameraMetadataExternalSyntheticLambda6;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.ThreadConfigModuleExternalSyntheticLambda3;
import o.getSpeed;
import o.isFeatureFlagEnabled;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getSpeed {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static long onExtraCallback = 156519848223178402L;
    private static int onExtraCallbackWithResult;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        isFeatureFlagEnabled.onWarmupCompleted onwarmupcompleted = (isFeatureFlagEnabled.onWarmupCompleted) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        onExtraCallbackWithResult(onwarmupcompleted, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Resources resources, isFeatureFlagEnabled.onWarmupCompleted onwarmupcompleted, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(resources, onwarmupcompleted, useandconfigureprogramwithtexture);
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return unitOnExtraCallback;
    }

    private static final Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 79;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(quirksExternalSyntheticBackport0, (Function1<? super isFeatureFlagEnabled, Unit>) function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(isFeatureFlagEnabled.onWarmupCompleted onwarmupcompleted, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallbackWithResult(onwarmupcompleted, (Function0<Unit>) function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        isFeatureFlagEnabled.IAuthTabCallback iAuthTabCallback = (isFeatureFlagEnabled.IAuthTabCallback) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(iAuthTabCallback, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(Resources resources, isFeatureFlagEnabled.IAuthTabCallback iAuthTabCallback, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(resources, iAuthTabCallback, useandconfigureprogramwithtexture);
        int i4 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i6);
        int i9 = ~(i2 | i6);
        int i10 = i7 | (~i6);
        int i11 = i9 | (~(i10 | i5));
        int i12 = (~i5) | i10;
        int i13 = i2 + i6 + i + (770105990 * i4) + ((-157043368) * i3);
        int i14 = i13 * i13;
        int i15 = ((315592168 * i2) - 1432092672) + ((-1000312294) * i6) + ((-1315904462) * i8) + ((-657952231) * i11) + (657952231 * i12) + ((-342360064) * i) + ((-2121269248) * i4) + (1950351360 * i3) + ((-66846720) * i14);
        int i16 = (i2 * 105828664) + 1394048361 + (i6 * 105827886) + (i8 * (-778)) + (i11 * (-389)) + (i12 * 389) + (i * 105828275) + (i4 * (-227623502)) + (i3 * 619312264) + (i14 * 1925971968);
        int i17 = i15 + (i16 * i16 * 261881856);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? onExtraCallback(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit onNavigationEvent(Context context, Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(iIAuthTabCallback2, 1703869554, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{context, function0}, iIAuthTabCallback, -1703869551);
        int i4 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(List list, ThreadConfigModuleExternalSyntheticLambda3 threadConfigModuleExternalSyntheticLambda3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(list, threadConfigModuleExternalSyntheticLambda3);
        int i4 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport0, function1, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(isFeatureFlagEnabled.IAuthTabCallback iAuthTabCallback, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = Integer.valueOf(i2);
        if (i5 == 0) {
            int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
            throw null;
        }
        int iIAuthTabCallback4 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback5 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback6 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        Unit unit = (Unit) onNavigationEvent(iIAuthTabCallback5, -2018343509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback6, new Object[]{iAuthTabCallback, function0, numValueOf, cameraCaptureResultEmptyCameraCaptureResult, numValueOf2}, iIAuthTabCallback4, 2018343509);
        int i6 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        isFeatureFlagEnabled.IAuthTabCallback iAuthTabCallback = (isFeatureFlagEnabled.IAuthTabCallback) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(iAuthTabCallback, function0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Context context, Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(context, function0);
        int i4 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1, isFeatureFlagEnabled isfeatureflagenabled) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function1, isfeatureflagenabled);
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        int i5 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(isFeatureFlagEnabled.onWarmupCompleted onwarmupcompleted, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return IAuthTabCallback(onwarmupcompleted, function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        IAuthTabCallback(onwarmupcompleted, function0, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    public static /* synthetic */ selectParentResolutions onWarmupCompleted(selectParentResolutions selectparentresolutions, isFeatureFlagEnabled isfeatureflagenabled, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 2) != 0) {
            int i4 = onExtraCallbackWithResult;
            int i5 = i4 + 19;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 9;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            i = 7;
        }
        return onNavigationEvent(selectparentresolutions, isfeatureflagenabled, i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final selectParentResolutions onNavigationEvent(@NotNull selectParentResolutions selectparentresolutions, @NotNull isFeatureFlagEnabled isfeatureflagenabled, int i) throws NoWhenBranchMatchedException {
        boolean z;
        String str;
        String strOnNavigationEvent;
        int length;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 37;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(selectparentresolutions, "");
        Intrinsics.checkNotNullParameter(isfeatureflagenabled, "");
        if (getNumberOfTargets.onExtraCallbackWithResult(selectparentresolutions.onExtraCallbackWithResult()) > 0) {
            z = true;
        } else {
            int i5 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        int length2 = selectparentresolutions.onNavigationEvent().length();
        hasProvider hasproviderIAuthTabCallback = shouldPrioritizeFallbackAspectRatio.IAuthTabCallback(selectparentresolutions, length2);
        hasProvider hasproviderOnExtraCallback = shouldPrioritizeFallbackAspectRatio.onExtraCallback(selectparentresolutions, length2);
        if (isfeatureflagenabled instanceof isFeatureFlagEnabled.onWarmupCompleted) {
            if (z) {
                str = hasproviderIAuthTabCallback.onTransact() + hasproviderOnExtraCallback.onTransact();
            } else {
                str = StringsKt.dropLast(hasproviderIAuthTabCallback.onTransact(), 1) + hasproviderOnExtraCallback.onTransact();
            }
            return new selectParentResolutions(str, TargetUtils.onExtraCallback(hasproviderIAuthTabCallback.length()), (getNumberOfTargets) null, 4, (DefaultConstructorMarker) null);
        }
        if (!(isfeatureflagenabled instanceof isFeatureFlagEnabled.IAuthTabCallback)) {
            if (!(isfeatureflagenabled instanceof isFeatureFlagEnabled.onExtraCallback)) {
                throw new NoWhenBranchMatchedException();
            }
            int i7 = onExtraCallbackWithResult + 51;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            return selectparentresolutions;
        }
        int i9 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
        if (length2 >= i) {
            strOnNavigationEvent = selectparentresolutions.onNavigationEvent();
            int i11 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
        } else {
            strOnNavigationEvent = hasproviderIAuthTabCallback.onTransact() + ((isFeatureFlagEnabled.IAuthTabCallback) isfeatureflagenabled).onExtraCallback() + hasproviderOnExtraCallback.onTransact();
        }
        String str2 = strOnNavigationEvent;
        if (length2 >= i) {
            int i13 = onExtraCallbackWithResult + 103;
            IAuthTabCallback = i13 % 128;
            int i14 = i13 % 2;
            length = selectparentresolutions.onNavigationEvent().length();
        } else {
            length = (hasproviderIAuthTabCallback.onTransact() + ((isFeatureFlagEnabled.IAuthTabCallback) isfeatureflagenabled).onExtraCallback()).length();
        }
        return new selectParentResolutions(str2, TargetUtils.onExtraCallback(length), (getNumberOfTargets) null, 4, (DefaultConstructorMarker) null);
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $11 + 9;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.getSize(0) + 24, (ViewConfiguration.getWindowTouchSlop() >> 8) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 59, ExpandableListView.getPackedPositionType(0L) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
        int i6 = $11 + 69;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i8 = $10 + 123;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), Color.argb(0, 0, 0, 0) + 59, (ViewConfiguration.getLongPressTimeout() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static final Unit onExtraCallback(List list, ThreadConfigModuleExternalSyntheticLambda3 threadConfigModuleExternalSyntheticLambda3) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(threadConfigModuleExternalSyntheticLambda3, "");
        threadConfigModuleExternalSyntheticLambda3.onNavigationEvent(list.size(), (Function1) null, (Function2) null, new onExtraCallbackWithResult(list), ForwardingCameraControl.onExtraCallbackWithResult(-1942245546, true, new IAuthTabCallback(list)));
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull final Function1<? super isFeatureFlagEnabled, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        Object obj;
        int i3;
        int i4;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1583522850);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                int i6 = onExtraCallbackWithResult + 79;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i8 = onExtraCallbackWithResult + 45;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = IAuthTabCallback + 91;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1583522850, i2, -1, "im.toss.compose.v0.SecureKeypad (SecureKeyboard.kt:79)");
                    int i11 = 64 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1583522850, i2, -1, "im.toss.compose.v0.SecureKeypad (SecureKeyboard.kt:79)");
                }
            }
            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = (List) onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1092100028, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{context, function1}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1092100029);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            final List list = (List) objOnMinimized;
            Camera2CameraMetadataExternalSyntheticLambda6.onExtraCallback onextracallback = new Camera2CameraMetadataExternalSyntheticLambda6.onExtraCallback(3);
            DebugExternalSyntheticLambda0 debugExternalSyntheticLambda0OnExtraCallback = DebugExternalSyntheticLambda1.onExtraCallback(0, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 3);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(list);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(!zOnExtraCallback)) {
                Function1 function12 = new Function1() { // from class: im.toss.compose.v0.SecureKeyboardKt$$ExternalSyntheticLambda7
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2) {
                        Unit unitOnNavigationEvent;
                        int i12 = 2 % 2;
                        int i13 = onNavigationEvent + 23;
                        onExtraCallback = i13 % 128;
                        if (i13 % 2 == 0) {
                            unitOnNavigationEvent = getSpeed.onNavigationEvent(list, (ThreadConfigModuleExternalSyntheticLambda3) obj2);
                            int i14 = 22 / 0;
                        } else {
                            unitOnNavigationEvent = getSpeed.onNavigationEvent(list, (ThreadConfigModuleExternalSyntheticLambda3) obj2);
                        }
                        int i15 = onNavigationEvent + 113;
                        onExtraCallback = i15 % 128;
                        int i16 = i15 % 2;
                        return unitOnNavigationEvent;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function12);
                obj = function12;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                Camera2DeviceCacheExternalSyntheticLambda1.onNavigationEvent(onextracallback, quirksExternalSyntheticBackport0, debugExternalSyntheticLambda0OnExtraCallback, (DeviceQuirksExternalSyntheticLambda0) null, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2 << 3) & 112, 0, 1016);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i12 = onExtraCallbackWithResult + 7;
                    IAuthTabCallback = i12 % 128;
                    int i13 = i12 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                int i14 = onExtraCallbackWithResult + 21;
                IAuthTabCallback = i14 % 128;
                int i15 = i14 % 2;
                obj = objOnMinimized2;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                }
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                Camera2DeviceCacheExternalSyntheticLambda1.onNavigationEvent(onextracallback, quirksExternalSyntheticBackport0, debugExternalSyntheticLambda0OnExtraCallback, (DeviceQuirksExternalSyntheticLambda0) null, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) obj, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2 << 3) & 112, 0, 1016);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            int i16 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i16 % 128;
            int i17 = i16 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v0.SecureKeyboardKt$$ExternalSyntheticLambda8
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2, Object obj3) {
                    int i18 = 2 % 2;
                    int i19 = onExtraCallbackWithResult + 89;
                    IAuthTabCallback = i19 % 128;
                    if (i19 % 2 == 0) {
                        getSpeed.onNavigationEvent(quirksExternalSyntheticBackport0, function1, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    Unit unitOnNavigationEvent = getSpeed.onNavigationEvent(quirksExternalSyntheticBackport0, function1, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i20 = onExtraCallbackWithResult + 51;
                    IAuthTabCallback = i20 % 128;
                    int i21 = i20 % 2;
                    return unitOnNavigationEvent;
                }
            });
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Context context = (Context) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        minFresh.onNavigationEvent(context, noStore.Companion.asBinder());
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(Resources resources, isFeatureFlagEnabled.onWarmupCompleted onwarmupcompleted, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) throws Resources.NotFoundException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        String string = resources.getString(R.string.secure_keyboard_content_description_format, onwarmupcompleted.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(string, "");
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, string);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallbackWithResult(final isFeatureFlagEnabled.onWarmupCompleted onwarmupcompleted, final Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) throws Throwable {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean z;
        boolean z2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1901618460);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onwarmupcompleted) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = onExtraCallbackWithResult + 31;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 32 : 16;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i8 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallbackWithResult + 107;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1901618460, i2, -1, "im.toss.compose.v0.DeleteKey (SecureKeyboard.kt:100)");
            }
            final Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            final Resources resources = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted2.onExtraCallback()) {
                objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
            if ((i2 & 112) == 32) {
                z = true;
            } else {
                int i12 = onExtraCallbackWithResult + 49;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                z = false;
            }
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(z | zOnExtraCallback)) {
                Object obj = objOnMinimized2;
                if (objOnMinimized2 == onwarmupcompleted2.onExtraCallback()) {
                    Function0 function02 = new Function0() { // from class: im.toss.compose.v0.SecureKeyboardKt$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke() {
                            int i14 = 2 % 2;
                            int i15 = onWarmupCompleted + 21;
                            IAuthTabCallback = i15 % 128;
                            int i16 = i15 % 2;
                            Unit unitOnNavigationEvent = getSpeed.onNavigationEvent(context, function0);
                            int i17 = IAuthTabCallback + 63;
                            onWarmupCompleted = i17 % 128;
                            if (i17 % 2 == 0) {
                                int i18 = 52 / 0;
                            }
                            return unitOnNavigationEvent;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function02);
                    obj = function02;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = measureChildConstrained.IAuthTabCallback(onextracallback, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj, 28, (Object) null);
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    int i14 = onExtraCallbackWithResult + 7;
                    IAuthTabCallback = i14 % 128;
                    int i15 = i14 % 2;
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                long jICustomTabsService = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.onExtraCallback()), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f));
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(resources);
                if ((i2 & 14) == 4) {
                    int i16 = IAuthTabCallback + 67;
                    onExtraCallbackWithResult = i16 % 128;
                    int i17 = i16 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((zOnExtraCallback2 | z2) || objOnMinimized3 == onwarmupcompleted2.onExtraCallback()) {
                    objOnMinimized3 = new Function1() { // from class: im.toss.compose.v0.SecureKeyboardKt$$ExternalSyntheticLambda1
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj2) throws Resources.NotFoundException {
                            int i18 = 2 % 2;
                            int i19 = onExtraCallbackWithResult + 111;
                            onExtraCallback = i19 % 128;
                            int i20 = i19 % 2;
                            Resources resources2 = resources;
                            if (i20 == 0) {
                                return getSpeed.IAuthTabCallback(resources2, onwarmupcompleted, (useAndConfigureProgramWithTexture) obj2);
                            }
                            getSpeed.IAuthTabCallback(resources2, onwarmupcompleted, (useAndConfigureProgramWithTexture) obj2);
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallbackDefault, false, (Function1) objOnMinimized3, 1, (Object) null);
                Object[] objArr = new Object[1];
                a(new char[]{31741, 47390, 65055, 13080, 28698, 46420, 59968, 12099, 27678, 41238, 58882, 6932, 22536, 40197, 53833, 5904, 21514, 35081, 52744, 854, 16400, 34067, 47696, 65301, 15390, 28957, 46621, 60163, 10334, 27910, 41497, 59155, 9306, 22910, 40499, 54119, 4128, 21805, 35360, 53026, 3168, 16675, 34353, 47922, 63534, 15665, 29290, 46886, 62500, 10553, 28208, 41845, 57400, 9520, 23099, 40750, 56370, 4411, 22071, 35709, 51260, 3385, 16953, 34619, 50299, 63834, 15941, 29519}, 49920 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                AppLovinNativeAdImplc.onExtraCallbackWithResult(((String) objArr[0]).intern(), quirksExternalSyntheticBackport0OnExtraCallbackWithResult, jICustomTabsService, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 504);
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v0.SecureKeyboardKt$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3) throws Throwable {
                    int i18 = 2 % 2;
                    int i19 = onWarmupCompleted + 93;
                    onExtraCallback = i19 % 128;
                    int i20 = i19 % 2;
                    Unit unitOnWarmupCompleted = getSpeed.onWarmupCompleted(onwarmupcompleted, function0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i21 = onWarmupCompleted + 35;
                    onExtraCallback = i21 % 128;
                    if (i21 % 2 == 0) {
                        return unitOnWarmupCompleted;
                    }
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            });
            int i18 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i18 % 128;
            int i19 = i18 % 2;
        }
    }

    private static final Unit IAuthTabCallback(Context context, Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        minFresh.onNavigationEvent(context, noStore.Companion.asBinder());
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(Resources resources, isFeatureFlagEnabled.IAuthTabCallback iAuthTabCallback, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) throws Resources.NotFoundException {
        String string;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            int i3 = R.string.secure_keyboard_content_description_format;
            Object[] objArr = new Object[0];
            objArr[1] = iAuthTabCallback.onExtraCallback();
            string = resources.getString(i3, objArr);
        } else {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            string = resources.getString(R.string.secure_keyboard_content_description_format, iAuthTabCallback.onExtraCallback());
        }
        Intrinsics.checkNotNullExpressionValue(string, "");
        unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, string);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(final isFeatureFlagEnabled.IAuthTabCallback iAuthTabCallback, final Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean z2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1070153504);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback)) {
                int i6 = IAuthTabCallback + 31;
                int i7 = i6 % 128;
                onExtraCallbackWithResult = i7;
                int i8 = i6 % 2;
                int i9 = i7 + 119;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i11 = IAuthTabCallback + 41;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            int i13 = IAuthTabCallback + 41;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1070153504, i2, -1, "im.toss.compose.v0.NumberKey (SecureKeyboard.kt:134)");
            }
            final Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            final Resources resources = (Resources) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallback());
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                int i15 = IAuthTabCallback + 97;
                onExtraCallbackWithResult = i15 % 128;
                int i16 = i15 % 2;
                objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(context);
            if ((i2 & 112) == 32) {
                int i17 = onExtraCallbackWithResult + 107;
                IAuthTabCallback = i17 % 128;
                int i18 = i17 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(z2 | zOnExtraCallback)) {
                Object obj = objOnMinimized2;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    Function0 function02 = new Function0() { // from class: im.toss.compose.v0.SecureKeyboardKt$$ExternalSyntheticLambda4
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallback = 1;

                        public final Object invoke() {
                            int i19 = 2 % 2;
                            int i20 = IAuthTabCallback + 25;
                            onExtraCallback = i20 % 128;
                            Object obj2 = null;
                            if (i20 % 2 == 0) {
                                getSpeed.onWarmupCompleted(context, function0);
                                throw null;
                            }
                            Unit unitOnWarmupCompleted = getSpeed.onWarmupCompleted(context, function0);
                            int i21 = onExtraCallback + 123;
                            IAuthTabCallback = i21 % 128;
                            if (i21 % 2 == 0) {
                                return unitOnWarmupCompleted;
                            }
                            obj2.hashCode();
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function02);
                    obj = function02;
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = measureChildConstrained.IAuthTabCallback(onextracallback, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, (getSubtitle) null, false, (String) null, (Role) null, (Function0) obj, 28, (Object) null);
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                String strOnExtraCallback = iAuthTabCallback.onExtraCallback();
                long jIsEngagementSignalsApiAvailable = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).isEngagementSignalsApiAvailable();
                long jOnNavigationEvent = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(30.0f));
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.onExtraCallback()), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 1, (Object) null);
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(resources);
                boolean z3 = (i2 & 14) == 4;
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(!(z3 | zOnExtraCallback2)) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = new Function1() { // from class: im.toss.compose.v0.SecureKeyboardKt$$ExternalSyntheticLambda5
                        private static int onExtraCallback = 1;
                        private static int onExtraCallbackWithResult;

                        public final Object invoke(Object obj2) throws Resources.NotFoundException {
                            int i19 = 2 % 2;
                            int i20 = onExtraCallbackWithResult + 33;
                            onExtraCallback = i20 % 128;
                            int i21 = i20 % 2;
                            Unit unitOnExtraCallback = getSpeed.onExtraCallback(resources, iAuthTabCallback, (useAndConfigureProgramWithTexture) obj2);
                            int i22 = onExtraCallbackWithResult + 77;
                            onExtraCallback = i22 % 128;
                            int i23 = i22 % 2;
                            return unitOnExtraCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                }
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallback, getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, false, (Function1) objOnMinimized3, 1, (Object) null), null, Long.valueOf(jIsEngagementSignalsApiAvailable), Long.valueOf(jOnNavigationEvent), 0L, null, null, createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 0, 130788}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i19 = onExtraCallbackWithResult + 103;
                    IAuthTabCallback = i19 % 128;
                    int i20 = i19 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i21 = IAuthTabCallback + 51;
                    onExtraCallbackWithResult = i21 % 128;
                    int i22 = i21 % 2;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v0.SecureKeyboardKt$$ExternalSyntheticLambda6
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i23 = 2 % 2;
                    int i24 = onNavigationEvent + 125;
                    onExtraCallback = i24 % 128;
                    int i25 = i24 % 2;
                    Unit unitOnNavigationEvent = getSpeed.onNavigationEvent(iAuthTabCallback, function0, i, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i26 = onExtraCallback + 13;
                    onNavigationEvent = i26 % 128;
                    int i27 = i26 % 2;
                    return unitOnNavigationEvent;
                }
            });
        }
    }

    private static final Unit onExtraCallback(Function1 function1, isFeatureFlagEnabled isfeatureflagenabled) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(isfeatureflagenabled);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Context context = (Context) objArr[0];
        final Function1 function1 = (Function1) objArr[1];
        int i = 2 % 2;
        String string = context.getString(R.string.secure_keyboard_one);
        Intrinsics.checkNotNullExpressionValue(string, "");
        isFeatureFlagEnabled.IAuthTabCallback iAuthTabCallback = new isFeatureFlagEnabled.IAuthTabCallback(string);
        String string2 = context.getString(R.string.secure_keyboard_two);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        isFeatureFlagEnabled.IAuthTabCallback iAuthTabCallback2 = new isFeatureFlagEnabled.IAuthTabCallback(string2);
        String string3 = context.getString(R.string.secure_keyboard_three);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        isFeatureFlagEnabled.IAuthTabCallback iAuthTabCallback3 = new isFeatureFlagEnabled.IAuthTabCallback(string3);
        String string4 = context.getString(R.string.secure_keyboard_four);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        isFeatureFlagEnabled.IAuthTabCallback iAuthTabCallback4 = new isFeatureFlagEnabled.IAuthTabCallback(string4);
        String string5 = context.getString(R.string.secure_keyboard_five);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        isFeatureFlagEnabled.IAuthTabCallback iAuthTabCallback5 = new isFeatureFlagEnabled.IAuthTabCallback(string5);
        String string6 = context.getString(R.string.secure_keyboard_six);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        isFeatureFlagEnabled.IAuthTabCallback iAuthTabCallback6 = new isFeatureFlagEnabled.IAuthTabCallback(string6);
        String string7 = context.getString(R.string.secure_keyboard_seven);
        Intrinsics.checkNotNullExpressionValue(string7, "");
        isFeatureFlagEnabled.IAuthTabCallback iAuthTabCallback7 = new isFeatureFlagEnabled.IAuthTabCallback(string7);
        String string8 = context.getString(R.string.secure_keyboard_eight);
        Intrinsics.checkNotNullExpressionValue(string8, "");
        isFeatureFlagEnabled.IAuthTabCallback iAuthTabCallback8 = new isFeatureFlagEnabled.IAuthTabCallback(string8);
        String string9 = context.getString(R.string.secure_keyboard_nine);
        Intrinsics.checkNotNullExpressionValue(string9, "");
        isFeatureFlagEnabled.IAuthTabCallback iAuthTabCallback9 = new isFeatureFlagEnabled.IAuthTabCallback(string9);
        String string10 = context.getString(R.string.secure_keyboard_zero);
        Intrinsics.checkNotNullExpressionValue(string10, "");
        isFeatureFlagEnabled.IAuthTabCallback iAuthTabCallback10 = new isFeatureFlagEnabled.IAuthTabCallback(string10);
        String string11 = context.getString(R.string.secure_keyboard_space);
        Intrinsics.checkNotNullExpressionValue(string11, "");
        List listShuffled = CollectionsKt.shuffled(CollectionsKt.listOf(new isFeatureFlagEnabled[]{iAuthTabCallback, iAuthTabCallback2, iAuthTabCallback3, iAuthTabCallback4, iAuthTabCallback5, iAuthTabCallback6, iAuthTabCallback7, iAuthTabCallback8, iAuthTabCallback9, iAuthTabCallback10, new isFeatureFlagEnabled.onExtraCallback(string11)}));
        String string12 = context.getString(R.string.secure_keyboard_delete);
        Intrinsics.checkNotNullExpressionValue(string12, "");
        List<isFeatureFlagEnabled> listPlus = CollectionsKt.plus(listShuffled, CollectionsKt.listOf(new isFeatureFlagEnabled.onWarmupCompleted(string12)));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
        for (final isFeatureFlagEnabled isfeatureflagenabled : listPlus) {
            arrayList.add(new hasMasks(isfeatureflagenabled, new Function0() { // from class: im.toss.compose.v0.SecureKeyboardKt$$ExternalSyntheticLambda3
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke() {
                    Unit unitOnWarmupCompleted;
                    int i2 = 2 % 2;
                    int i3 = onExtraCallback + 103;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 == 0) {
                        unitOnWarmupCompleted = getSpeed.onWarmupCompleted(function1, isfeatureflagenabled);
                        int i4 = 52 / 0;
                    } else {
                        unitOnWarmupCompleted = getSpeed.onWarmupCompleted(function1, isfeatureflagenabled);
                    }
                    int i5 = onExtraCallback + 111;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        return unitOnWarmupCompleted;
                    }
                    throw null;
                }
            }));
            int i2 = IAuthTabCallback + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        }
        return arrayList;
    }

    private static final Unit onExtraCallbackWithResult(Context context, Function0 function0) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onNavigationEvent(iIAuthTabCallback2, 1703869554, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{context, function0}, iIAuthTabCallback, -1703869551);
    }

    private static final Unit onWarmupCompleted(isFeatureFlagEnabled.IAuthTabCallback iAuthTabCallback, Function0 function0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {iAuthTabCallback, function0, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -2018343509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, iIAuthTabCallback, 2018343509);
    }

    public static final /* synthetic */ void IAuthTabCallback(isFeatureFlagEnabled.onWarmupCompleted onwarmupcompleted, Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {onwarmupcompleted, function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 181220135, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, iIAuthTabCallback, -181220133);
    }

    public static final /* synthetic */ void onWarmupCompleted(isFeatureFlagEnabled.IAuthTabCallback iAuthTabCallback, Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {iAuthTabCallback, function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        onNavigationEvent(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1065747955, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, iIAuthTabCallback, -1065747951);
    }

    private static final List<hasMasks> onExtraCallback(Context context, Function1<? super isFeatureFlagEnabled, Unit> function1) {
        int iIAuthTabCallback = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback2 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        int iIAuthTabCallback3 = SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (List) onNavigationEvent(iIAuthTabCallback2, -1092100028, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), iIAuthTabCallback3, new Object[]{context, function1}, iIAuthTabCallback, 1092100029);
    }

    public static final class onExtraCallbackWithResult implements Function1<Integer, Object> {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ List onNavigationEvent;

        public onExtraCallbackWithResult(List list) {
            this.onNavigationEvent = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent(((Number) obj).intValue());
            int i4 = onExtraCallback + 123;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 115;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            this.onNavigationEvent.get(i);
            int i5 = onWarmupCompleted + 31;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return null;
        }
    }

    public static final class IAuthTabCallback implements setTaggedAddrCtrl<RetryingCameraStateOpener, Integer, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ List IAuthTabCallback;

        public IAuthTabCallback(List list) {
            this.IAuthTabCallback = list;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted((RetryingCameraStateOpener) obj, ((Number) obj2).intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Number) obj4).intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = onWarmupCompleted + 29;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onWarmupCompleted(RetryingCameraStateOpener retryingCameraStateOpener, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            int i3;
            boolean z;
            int i4;
            int i5 = 2 % 2;
            int i6 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            if ((i2 & 6) == 0) {
                i3 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(retryingCameraStateOpener) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i)) {
                    int i8 = onWarmupCompleted + 121;
                    onExtraCallbackWithResult = i8 % 128;
                    i4 = i8 % 2 != 0 ? 28 : 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                int i9 = onExtraCallbackWithResult + 123;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                z = true;
            } else {
                z = false;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onWarmupCompleted + 77;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1942245546, i3, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:576)");
                    int i12 = 33 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1942245546, i3, -1, "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:576)");
                }
            }
            hasMasks hasmasks = (hasMasks) this.IAuthTabCallback.get(i);
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-782566949);
            hasmasks.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 0);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = onExtraCallbackWithResult + 27;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i14 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }
}
