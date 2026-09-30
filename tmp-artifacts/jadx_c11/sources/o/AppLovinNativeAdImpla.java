package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.semantics.Role;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import im.toss.tds.compose.component.atom.iconbutton.TdsIconButtonV1Kt$;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImpla;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.KeylinesKtExternalSyntheticLambda1;
import o.QuirksExternalSyntheticBackport0;
import o.SessionProcessorCaptureCallback;
import o.initSDK;
import o.removeObserverLocked;
import o.rotate;
import o.setIso;
import o.setPackageName;
import o.setViewableMRC50Requests;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinNativeAdImpla {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 1;
    private static int onWarmupCompleted;
    private static char[] onExtraCallback = {32456, 32479, 32460};
    private static int onExtraCallbackWithResult = -1184334012;
    private static boolean onNavigationEvent = true;
    private static boolean IAuthTabCallback = true;

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String str = (String) objArr[0];
        initSDK.onNavigationEvent onnavigationevent = (initSDK.onNavigationEvent) objArr[1];
        setPackageName setpackagename = (setPackageName) objArr[2];
        int i = 2 % 2;
        int i2 = asInterface + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        Unit unit = (Unit) onNavigationEvent(-523389076, 523389076, iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{str, onnavigationevent, setpackagename}, iOnNavigationEvent2);
        int i4 = asInterface + 39;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallback(Object obj, Function0 function0, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, float f3, setViewableMRC100Requests setviewablemrc100requests, float f4, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 57;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {obj, function0, str, quirksExternalSyntheticBackport0, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), setviewablemrc100requests, Float.valueOf(f4), camera2CapturePipelineTorchTaskExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)};
        onNavigationEvent(496495768, -496495766, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i7 = asInterface + 95;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, float f, setViewableMRC100Requests setviewablemrc100requests, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, float f2, float f3, float f4, Object obj, String str, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 43;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {camera2CapturePipelineTorchTaskExternalSyntheticLambda2, Float.valueOf(f), setviewablemrc100requests, quirksExternalSyntheticBackport0, function0, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), obj, str, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
            return (Unit) onNavigationEvent(688479269, -688479266, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
        }
        Object[] objArr2 = {camera2CapturePipelineTorchTaskExternalSyntheticLambda2, Float.valueOf(f), setviewablemrc100requests, quirksExternalSyntheticBackport0, function0, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), obj, str, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        throw null;
    }

    public static /* synthetic */ removeObserverLocked onExtraCallback(AppLovinAdClickListener appLovinAdClickListener, ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, long j, float f, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(appLovinAdClickListener, extensionsManagerExtensionsAvailability, r8lambdanm9dm2eewl4vrptnjmesfjqky4, j, f, sessionProcessorCaptureCallback);
        }
        IAuthTabCallback(appLovinAdClickListener, extensionsManagerExtensionsAvailability, r8lambdanm9dm2eewl4vrptnjmesfjqky4, j, f, sessionProcessorCaptureCallback);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~(i2 | i3);
        int i8 = (~i) | (~i3);
        int i9 = (~i8) | i2;
        int i10 = (~(i3 | i)) | (~((~i2) | i)) | (~(i8 | i2));
        int i11 = i + i2 + i6 + ((-101282902) * i4) + ((-829309908) * i5);
        int i12 = i11 * i11;
        int i13 = ((i * 42798203) - 224002048) + (42798203 * i2) + ((-1233194106) * i7) + (1828579084 * i9) + (1233194106 * i10) + ((-1190395904) * i6) + (1710751744 * i4) + ((-1643118592) * i5) + ((-1134166016) * i12);
        int i14 = (i * 1745018779) + 1790267665 + (i2 * 1745018779) + (i7 * (-58)) + (i9 * (-116)) + (i10 * 58) + (i6 * 1745018721) + (i4 * (-1587019414)) + (i5 * (-1871011668)) + (i12 * 1017511936);
        int i15 = i13 + (i14 * i14 * (-1139146752));
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 89;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onWarmupCompleted + 89;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 73 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, float f, setViewableMRC100Requests setviewablemrc100requests, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, initSDK initsdk, Function0 function0, float f2, float f3, float f4, Object obj, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 49;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            onExtraCallbackWithResult(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, f, setviewablemrc100requests, quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, initsdk, function0, f2, f3, f4, obj, str, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, f, setviewablemrc100requests, quirksExternalSyntheticBackport0, quirksExternalSyntheticBackport02, initsdk, function0, f2, f3, f4, obj, str, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onWarmupCompleted + 39;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onNavigationEvent(rotate rotateVar, long j, float f, setIso setiso) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(rotateVar, j, f, setiso);
        if (i3 == 0) {
            int i4 = 56 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 33;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 123;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Object obj, Function0 function0, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, float f3, setViewableMRC100Requests setviewablemrc100requests, float f4, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = asInterface + 51;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(obj, function0, str, quirksExternalSyntheticBackport0, f, f2, f3, setviewablemrc100requests, f4, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onWarmupCompleted + 75;
        asInterface = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(initSDK initsdk, Function0 function0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(initsdk, function0);
        }
        onNavigationEvent(initsdk, function0);
        throw null;
    }

    public static final void onWarmupCompleted(@NotNull Object obj, @NotNull Function0<Unit> function0, @NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable setViewableMRC50Requests.onWarmupCompleted onwarmupcompleted, @Nullable setViewableMRC50Requests.onNavigationEvent onnavigationevent, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        setViewableMRC50Requests.onNavigationEvent onnavigationeventOnExtraCallback;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(str, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 8) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        setViewableMRC50Requests.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = (i2 & 16) != 0 ? setViewableMRC50Requests.onWarmupCompleted.Companion.onExtraCallbackWithResult() : onwarmupcompleted;
        if ((i2 & 32) != 0) {
            onnavigationeventOnExtraCallback = setViewableMRC50Requests.onNavigationEvent.Companion.onExtraCallback();
            int i4 = onWarmupCompleted + 113;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        } else {
            onnavigationeventOnExtraCallback = onnavigationevent;
        }
        long jOnTransact = (i2 & 64) != 0 ? setByteOrder.Companion.onTransact() : j;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onWarmupCompleted + 45;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-401239841, i, -1, "im.toss.tds.compose.component.atom.iconbutton.TdsNavigationIconButtonV1 (TdsIconButtonV1.kt:112)");
            int i8 = asInterface + 123;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 / 4;
            }
        }
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(955584859);
        if (jOnTransact == 16) {
            int i10 = asInterface + 73;
            onWarmupCompleted = i10 % 128;
            jOnTransact = i10 % 2 != 0 ? MaxAdapterListener.onExtraCallbackWithResult.onExtraCallback(obj, cameraCaptureResultEmptyCameraCaptureResult, (i & 77) | 104) : MaxAdapterListener.onExtraCallbackWithResult.onExtraCallback(obj, cameraCaptureResultEmptyCameraCaptureResult, (i & 14) | 48);
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        IAuthTabCallback(obj, function0, str, quirksExternalSyntheticBackport02, onwarmupcompletedOnExtraCallbackWithResult, onnavigationeventOnExtraCallback, jOnTransact, cameraCaptureResultEmptyCameraCaptureResult, i & 524286, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public static final void onExtraCallback(@NotNull deprecated_followRedirects deprecated_followredirects, @NotNull Function0<Unit> function0, @NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable setViewableMRC50Requests.onWarmupCompleted onwarmupcompleted, @Nullable setViewableMRC50Requests.onNavigationEvent onnavigationevent, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        setViewableMRC50Requests.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult;
        setViewableMRC50Requests.onNavigationEvent onnavigationeventOnExtraCallback;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(str, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 8) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        Object obj = null;
        if ((i2 & 16) != 0) {
            int i4 = asInterface + 49;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                setViewableMRC50Requests.onWarmupCompleted.Companion.onExtraCallbackWithResult();
                obj.hashCode();
                throw null;
            }
            onwarmupcompletedOnExtraCallbackWithResult = setViewableMRC50Requests.onWarmupCompleted.Companion.onExtraCallbackWithResult();
        } else {
            onwarmupcompletedOnExtraCallbackWithResult = onwarmupcompleted;
        }
        if ((i2 & 32) != 0) {
            int i5 = onWarmupCompleted + 29;
            asInterface = i5 % 128;
            if (i5 % 2 == 0) {
                setViewableMRC50Requests.onNavigationEvent.Companion.onExtraCallback();
                obj.hashCode();
                throw null;
            }
            onnavigationeventOnExtraCallback = setViewableMRC50Requests.onNavigationEvent.Companion.onExtraCallback();
        } else {
            onnavigationeventOnExtraCallback = onnavigationevent;
        }
        long jOnTransact = (i2 & 64) != 0 ? setByteOrder.Companion.onTransact() : j;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = asInterface + 35;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2107678527, i, -1, "im.toss.tds.compose.component.atom.iconbutton.TdsIconButtonV1 (TdsIconButtonV1.kt:134)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2107678527, i, -1, "im.toss.tds.compose.component.atom.iconbutton.TdsIconButtonV1 (TdsIconButtonV1.kt:134)");
        }
        IAuthTabCallback(deprecated_followredirects, function0, str, quirksExternalSyntheticBackport02, onwarmupcompletedOnExtraCallbackWithResult, onnavigationeventOnExtraCallback, jOnTransact, cameraCaptureResultEmptyCameraCaptureResult, i & 4194302, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = asInterface + 35;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i9 = asInterface + 39;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
    }

    public static final void onWarmupCompleted(@NotNull String str, @NotNull Function0<Unit> function0, @NotNull String str2, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable setViewableMRC50Requests.onWarmupCompleted onwarmupcompleted, @Nullable setViewableMRC50Requests.onNavigationEvent onnavigationevent, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        setViewableMRC50Requests.onNavigationEvent onnavigationeventOnExtraCallback;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 125;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(str2, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 8) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        setViewableMRC50Requests.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = (i2 & 16) != 0 ? setViewableMRC50Requests.onWarmupCompleted.Companion.onExtraCallbackWithResult() : onwarmupcompleted;
        if ((i2 & 32) != 0) {
            int i6 = onWarmupCompleted + 59;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            onnavigationeventOnExtraCallback = setViewableMRC50Requests.onNavigationEvent.Companion.onExtraCallback();
        } else {
            onnavigationeventOnExtraCallback = onnavigationevent;
        }
        long jOnTransact = (i2 & 64) != 0 ? setByteOrder.Companion.onTransact() : j;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1475947668, i, -1, "im.toss.tds.compose.component.atom.iconbutton.TdsIconButtonV1 (TdsIconButtonV1.kt:156)");
        }
        IAuthTabCallback(str, function0, str2, quirksExternalSyntheticBackport02, onwarmupcompletedOnExtraCallbackWithResult, onnavigationeventOnExtraCallback, jOnTransact, cameraCaptureResultEmptyCameraCaptureResult, i & 4194302, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = asInterface + 37;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i9 != 0) {
                throw null;
            }
            int i10 = onWarmupCompleted + 9;
            asInterface = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onExtraCallback;
        if (cArr3 != null) {
            int i3 = $10 + 21;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 1), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 77, View.getDefaultSize(0, 0) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 74, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i6 = 1052772399;
        if (!(!IAuthTabCallback)) {
            int i7 = $10 + 41;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $10 + 97;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 63 - View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.getSize(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i6 = 1052772399;
            }
            objArr[0] = new String(cArr2);
            return;
        }
        if (!onNavigationEvent) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            int i10 = $10 + 17;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 63 - KeyEvent.normalizeMetaState(0), 12214 - Color.green(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    public static final void IAuthTabCallback(@NotNull Object obj, @NotNull Function0<Unit> function0, @NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable setViewableMRC50Requests.onWarmupCompleted onwarmupcompleted, @Nullable setViewableMRC50Requests.onNavigationEvent onnavigationevent, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long jOnTransact;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(str, "");
        if ((i2 & 8) != 0) {
            int i4 = onWarmupCompleted + 71;
            asInterface = i4 % 128;
            if (i4 % 2 == 0) {
                quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                int i5 = 81 / 0;
            } else {
                quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
            }
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        setViewableMRC50Requests.onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = (i2 & 16) != 0 ? setViewableMRC50Requests.onWarmupCompleted.Companion.onExtraCallbackWithResult() : onwarmupcompleted;
        setViewableMRC50Requests.onNavigationEvent onnavigationeventOnExtraCallback = (i2 & 32) != 0 ? setViewableMRC50Requests.onNavigationEvent.Companion.onExtraCallback() : onnavigationevent;
        if ((i2 & 64) != 0) {
            int i6 = onWarmupCompleted + 43;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2083196499, i, -1, "im.toss.tds.compose.component.atom.iconbutton.TdsIconButtonV1 (TdsIconButtonV1.kt:178)");
        }
        onNavigationEvent(496495768, -496495766, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{obj, function0, str, quirksExternalSyntheticBackport02, Float.valueOf(onwarmupcompletedOnExtraCallbackWithResult.IAuthTabCallbackDefault()), Float.valueOf(onwarmupcompletedOnExtraCallbackWithResult.onTransact()), Float.valueOf(onwarmupcompletedOnExtraCallbackWithResult.onExtraCallback()), setVastAd.IAuthTabCallback.onWarmupCompleted(jOnTransact, onnavigationeventOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, ((i >> 18) & 14) | 384 | ((i >> 12) & 112), 0), Float.valueOf(0.0f), null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i & 8190), 768}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i8 = onWarmupCompleted + 25;
            asInterface = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        initSDK.onNavigationEvent onnavigationevent = (initSDK.onNavigationEvent) objArr[1];
        setPackageName setpackagename = (setPackageName) objArr[2];
        int i = 2 % 2;
        int i2 = asInterface + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        Intrinsics.checkNotNullParameter(setpackagename, "");
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-127, -125, -126, -127}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, objArr2);
        getReferrerClickTimestampSeconds.onWarmupCompleted(onnavigationevent, ((String) objArr2[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i4 = asInterface + 73;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(initSDK initsdk, Function0 function0) {
        int i = 2 % 2;
        int i2 = asInterface + 29;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, initsdk, (initMiniApp) null, 3, (Object) null);
        } else {
            onInstallReferrerSetupFinished.onExtraCallbackWithResult(onInstallReferrerSetupFinished.onWarmupCompleted, initsdk, (initMiniApp) null, 2, (Object) null);
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final removeObserverLocked IAuthTabCallback(AppLovinAdClickListener appLovinAdClickListener, ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, final long j, final float f, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        final rotate rotateVarIAuthTabCallback = appLovinAdClickListener.IAuthTabCallback(sessionProcessorCaptureCallback.onWarmupCompleted(), extensionsManagerExtensionsAvailability, r8lambdanm9dm2eewl4vrptnjmesfjqky4);
        removeObserverLocked removeobserverlockedIAuthTabCallback = sessionProcessorCaptureCallback.IAuthTabCallback(new Function1() { // from class: im.toss.tds.compose.component.atom.iconbutton.TdsIconButtonV1Kt$$ExternalSyntheticLambda7
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 31;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                rotate rotateVar = rotateVarIAuthTabCallback;
                if (i4 != 0) {
                    return AppLovinNativeAdImpla.onNavigationEvent(rotateVar, j, f, (setIso) obj);
                }
                Unit unitOnNavigationEvent = AppLovinNativeAdImpla.onNavigationEvent(rotateVar, j, f, (setIso) obj);
                int i5 = 13 / 0;
                return unitOnNavigationEvent;
            }
        });
        int i2 = asInterface + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return removeobserverlockedIAuthTabCallback;
    }

    private static final Unit onExtraCallbackWithResult(rotate rotateVar, long j, float f, setIso setiso) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setiso, "");
        setiso.onWarmupCompleted();
        setDescription.IAuthTabCallback(setiso, rotateVar, j, 0.0f, new ExifOutputStream(setiso.onExtraCallback(f), 0.0f, 0, 0, (fromKilometersPerHour) null, 30, (DefaultConstructorMarker) null), (seek) null, 0, 52, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i2 = onWarmupCompleted + 67;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, float f, setViewableMRC100Requests setviewablemrc100requests, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, final initSDK initsdk, final Function0 function0, final float f2, float f3, float f4, Object obj, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = onWarmupCompleted + 39;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = asInterface + 77;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-778031811, i, -1, "im.toss.tds.compose.component.atom.iconbutton.TdsIconButtonV1.<anonymous>.<anonymous> (TdsIconButtonV1.kt:214)");
                    int i6 = 62 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-778031811, i, -1, "im.toss.tds.compose.component.atom.iconbutton.TdsIconButtonV1.<anonymous>.<anonymous> (TdsIconButtonV1.kt:214)");
                }
            }
            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult = CaptureSessionExternalSyntheticLambda3.onExtraCallbackWithResult(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, 0);
            boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zIAuthTabCallback) {
                int i7 = asInterface + 5;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    AppLovinAdClickListener appLovinAdClickListener = new AppLovinAdClickListener(f, null);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(appLovinAdClickListener);
                    obj2 = appLovinAdClickListener;
                }
                final AppLovinAdClickListener appLovinAdClickListener2 = (AppLovinAdClickListener) obj2;
                final ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability = (ExtensionsManagerExtensionsAvailability) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.IAuthTabCallbackStubProxy());
                final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                final long jAccess100 = ((setByteOrder) setviewablemrc100requests.onNavigationEvent(onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult), cameraCaptureResultEmptyCameraCaptureResult, 0).onExtraCallbackWithResult()).access100();
                QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(quirksExternalSyntheticBackport02);
                getTitleMarginEnd gettitlemarginendOnExtraCallback = getSharedInstance.onExtraCallback(false, false, 0L, null, null, null, setVastAd.IAuthTabCallback.onNavigationEvent(), null, 191, null);
                Role roleIAuthTabCallback = Role.IAuthTabCallback(Role.Companion.onWarmupCompleted());
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(initsdk);
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent | zOnNavigationEvent2)) {
                    Object obj3 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        Function0 function02 = new Function0() { // from class: im.toss.tds.compose.component.atom.iconbutton.TdsIconButtonV1Kt$$ExternalSyntheticLambda5
                            private static int onExtraCallbackWithResult = 1;
                            private static int onNavigationEvent;

                            public final Object invoke() {
                                int i9 = 2 % 2;
                                int i10 = onNavigationEvent + 73;
                                onExtraCallbackWithResult = i10 % 128;
                                int i11 = i10 % 2;
                                initSDK initsdk2 = initsdk;
                                if (i11 != 0) {
                                    return AppLovinNativeAdImpla.onWarmupCompleted(initsdk2, function0);
                                }
                                AppLovinNativeAdImpla.onWarmupCompleted(initsdk2, function0);
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function02);
                        obj3 = function02;
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = verifyDrawable.onExtraCallbackWithResult(measureChildConstrained.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, gettitlemarginendOnExtraCallback, false, (String) null, roleIAuthTabCallback, (Function0) obj3, 12, (Object) null), ((setByteOrder) setviewablemrc100requests.IAuthTabCallback(onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult), cameraCaptureResultEmptyCameraCaptureResult, 0).onExtraCallbackWithResult()).access100(), appLovinAdClickListener2);
                    boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinAdClickListener2);
                    boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(extensionsManagerExtensionsAvailability.ordinal());
                    boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4);
                    boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(jAccess100);
                    boolean zIAuthTabCallback2 = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f2);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if ((zOnNavigationEvent3 | zOnExtraCallback | zOnNavigationEvent4 | zOnWarmupCompleted | zIAuthTabCallback2) || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized3 = new Function1() { // from class: im.toss.tds.compose.component.atom.iconbutton.TdsIconButtonV1Kt$$ExternalSyntheticLambda6
                            private static int onExtraCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj4) {
                                int i9 = 2 % 2;
                                int i10 = onNavigationEvent + 7;
                                onExtraCallback = i10 % 128;
                                int i11 = i10 % 2;
                                removeObserverLocked removeobserverlockedOnExtraCallback = AppLovinNativeAdImpla.onExtraCallback(appLovinAdClickListener2, extensionsManagerExtensionsAvailability, r8lambdanm9dm2eewl4vrptnjmesfjqky4, jAccess100, f2, (SessionProcessorCaptureCallback) obj4);
                                int i12 = onNavigationEvent + 3;
                                onExtraCallback = i12 % 128;
                                int i13 = i12 % 2;
                                return removeobserverlockedOnExtraCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(SessionProcessorSurface.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, (Function1) objOnMinimized3), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f * f4) + f3));
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallbackDefault);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        int i9 = asInterface + 125;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    AppLovinNativeAdImplc.onExtraCallback(obj, ((setByteOrder) setviewablemrc100requests.onExtraCallbackWithResult(onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<Boolean>) cameraPresenceProviderExternalSyntheticLambda6OnExtraCallbackWithResult), cameraCaptureResultEmptyCameraCaptureResult, 0).onExtraCallbackWithResult()).access100(), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, f3), str, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit>) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (Painter) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1008);
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

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i;
        String str;
        boolean z;
        int i2;
        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objArr[0];
        final float fFloatValue = ((Number) objArr[1]).floatValue();
        final setViewableMRC100Requests setviewablemrc100requests = (setViewableMRC100Requests) objArr[2];
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[3];
        final Function0 function0 = (Function0) objArr[4];
        final float fFloatValue2 = ((Number) objArr[5]).floatValue();
        final float fFloatValue3 = ((Number) objArr[6]).floatValue();
        final float fFloatValue4 = ((Number) objArr[7]).floatValue();
        final Object obj = objArr[8];
        String str2 = (String) objArr[9];
        final initSDK initsdk = (initSDK) objArr[10];
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[11];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[12];
        int iIntValue = ((Number) objArr[13]).intValue();
        int i3 = 2 % 2;
        int i4 = asInterface + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport02, "");
        if ((iIntValue & 6) == 0) {
            i = iIntValue | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(initsdk) ? 4 : 2);
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            int i6 = asInterface + 87;
            str = str2;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport02);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                int i7 = onWarmupCompleted + 81;
                asInterface = i7 % 128;
                i2 = i7 % 2 == 0 ? 64 : 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        } else {
            str = str2;
        }
        if ((i & 147) != 146) {
            int i8 = asInterface + 109;
            onWarmupCompleted = i8 % 128;
            z = i8 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(120085306, i, -1, "im.toss.tds.compose.component.atom.iconbutton.TdsIconButtonV1.<anonymous> (TdsIconButtonV1.kt:213)");
            }
            final String str3 = str;
            putBooleanArray.onExtraCallbackWithResult(putCharArray.Companion.IAuthTabCallbackStubProxy(), null, null, ForwardingCameraControl.onExtraCallback(-778031811, true, new Function2() { // from class: im.toss.tds.compose.component.atom.iconbutton.TdsIconButtonV1Kt$$ExternalSyntheticLambda4
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2, Object obj3) {
                    int i9 = 2 % 2;
                    int i10 = onExtraCallback + 25;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitOnNavigationEvent = AppLovinNativeAdImpla.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2, fFloatValue, setviewablemrc100requests, quirksExternalSyntheticBackport02, quirksExternalSyntheticBackport0, initsdk, function0, fFloatValue2, fFloatValue3, fFloatValue4, obj, str3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i12 = onExtraCallbackWithResult + 117;
                    onExtraCallback = i12 % 128;
                    int i13 = i12 % 2;
                    return unitOnNavigationEvent;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 3078, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i9 = asInterface + 81;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01ad A[PHI: r5
      0x01ad: PHI (r5v7 int) = (r5v6 int), (r5v32 int), (r5v33 int) binds: [B:97:0x019c, B:104:0x01ab, B:103:0x01a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012a A[PHI: r15
      0x012a: PHI (r15v10 int) = (r15v9 int), (r15v19 int), (r15v20 int) binds: [B:52:0x0119, B:59:0x0128, B:58:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        int i;
        Object obj;
        int i2;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        int i3;
        int i4;
        int i5;
        float f;
        float f2;
        int i6;
        float fOnExtraCallback;
        int i7;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i8;
        String str;
        final float f3;
        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
        final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2;
        final float f4;
        final float f5;
        final float f6;
        final setViewableMRC100Requests setviewablemrc100requests;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        float f7;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3;
        float f8;
        float f9;
        float f10;
        setViewableMRC100Requests setviewablemrc100requests2;
        float fOnTransact;
        float f11;
        setViewableMRC100Requests setviewablemrc100requestsOnExtraCallback;
        int i9;
        Object obj2 = objArr[0];
        final Function0 function0 = (Function0) objArr[1];
        final String str2 = (String) objArr[2];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback4 = (QuirksExternalSyntheticBackport0) objArr[3];
        float fFloatValue = ((Number) objArr[4]).floatValue();
        float fFloatValue2 = ((Number) objArr[5]).floatValue();
        float fFloatValue3 = ((Number) objArr[6]).floatValue();
        setViewableMRC100Requests setviewablemrc100requests3 = (setViewableMRC100Requests) objArr[7];
        float fFloatValue4 = ((Number) objArr[8]).floatValue();
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objArr[9];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[10];
        int iIntValue = ((Number) objArr[11]).intValue();
        final int iIntValue2 = ((Number) objArr[12]).intValue();
        int i10 = 2 % 2;
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(str2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(-1620517979);
        if ((iIntValue & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(obj2) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 32 : 16;
            int i11 = onWarmupCompleted + 21;
            asInterface = i11 % 128;
            int i12 = i11 % 2;
        }
        if ((iIntValue & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2)) {
                int i13 = asInterface + 63;
                onWarmupCompleted = i13 % 128;
                int i14 = i13 % 2;
                i9 = 256;
            } else {
                i9 = 128;
            }
            i |= i9;
        }
        int i15 = i;
        int i16 = iIntValue2 & 8;
        if (i16 != 0) {
            i15 |= 3072;
        } else {
            if ((iIntValue & 3072) == 0) {
                int i17 = asInterface + 81;
                obj = obj2;
                onWarmupCompleted = i17 % 128;
                int i18 = i17 % 2;
                i15 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback4) ? 2048 : 1024;
            }
            i2 = iIntValue2 & 16;
            if (i2 == 0) {
                i15 |= 24576;
            } else {
                if ((iIntValue & 24576) == 0) {
                    int i19 = asInterface + 61;
                    onextracallback = onextracallback4;
                    onWarmupCompleted = i19 % 128;
                    if (i19 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue) ? 16384 : 8192) | i15;
                }
                i4 = iIntValue2 & 32;
                int i20 = 196608;
                if (i4 != 0) {
                    i3 |= i20;
                } else if ((196608 & iIntValue) == 0) {
                    i20 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue2) ? 131072 : 65536;
                    i3 |= i20;
                }
                i5 = iIntValue2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else {
                    if ((iIntValue & 1572864) == 0) {
                        f = fFloatValue;
                        int i21 = asInterface + 63;
                        f2 = fFloatValue2;
                        onWarmupCompleted = i21 % 128;
                        int i22 = i21 % 2;
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue3) ? 1048576 : 524288;
                    }
                    if ((12582912 & iIntValue) == 0) {
                        i3 |= ((iIntValue2 & 128) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setviewablemrc100requests3)) ? 8388608 : 4194304;
                    }
                    i6 = iIntValue2 & 256;
                    if (i6 != 0) {
                        if ((100663296 & iIntValue) == 0) {
                            int i23 = onWarmupCompleted + 101;
                            fOnExtraCallback = fFloatValue3;
                            asInterface = i23 % 128;
                            if (i23 % 2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue4);
                                throw null;
                            }
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue4) ? 67108864 : 33554432;
                        }
                        i7 = iIntValue2 & 512;
                        int i24 = 805306368;
                        if (i7 != 0) {
                            i3 |= i24;
                        } else if ((805306368 & iIntValue) == 0) {
                            i24 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda23) ? 536870912 : 268435456;
                            i3 |= i24;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i3) != 306783378, i3 & 1)) {
                            int i25 = asInterface + 55;
                            onWarmupCompleted = i25 % 128;
                            if (i25 % 2 != 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                if ((iIntValue & 1) != 0) {
                                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                        if (i16 != 0) {
                                            onextracallback = QuirksExternalSyntheticBackport0.Companion;
                                        }
                                        float fIAuthTabCallbackDefault = i2 != 0 ? setViewableMRC50Requests.onWarmupCompleted.Companion.onExtraCallbackWithResult().IAuthTabCallbackDefault() : f;
                                        if (i4 != 0) {
                                            int i26 = asInterface + 73;
                                            onWarmupCompleted = i26 % 128;
                                            if (i26 % 2 != 0) {
                                                setViewableMRC50Requests.onWarmupCompleted.Companion.onExtraCallbackWithResult().onTransact();
                                                Object obj4 = null;
                                                obj4.hashCode();
                                                throw null;
                                            }
                                            fOnTransact = setViewableMRC50Requests.onWarmupCompleted.Companion.onExtraCallbackWithResult().onTransact();
                                        } else {
                                            fOnTransact = f2;
                                        }
                                        if (i5 != 0) {
                                            fOnExtraCallback = setViewableMRC50Requests.onWarmupCompleted.Companion.onExtraCallbackWithResult().onExtraCallback();
                                        }
                                        if ((iIntValue2 & 128) != 0) {
                                            f11 = fOnTransact;
                                            i3 &= -29360129;
                                            setviewablemrc100requestsOnExtraCallback = setVastAd.IAuthTabCallback.onExtraCallback(null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48, 1);
                                        } else {
                                            f11 = fOnTransact;
                                            setviewablemrc100requestsOnExtraCallback = setviewablemrc100requests3;
                                        }
                                        if (i6 != 0) {
                                            fFloatValue4 = ((Float) setVastAd.onExtraCallbackWithResult(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), new Object[]{setVastAd.IAuthTabCallback}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -128653568, 128653568)).floatValue();
                                        }
                                        if (i7 != 0) {
                                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            Object obj5 = objOnMinimized;
                                            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                int i27 = onWarmupCompleted + 115;
                                                asInterface = i27 % 128;
                                                int i28 = i27 % 2;
                                                Object objOnWarmupCompleted = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnWarmupCompleted);
                                                obj5 = objOnWarmupCompleted;
                                            }
                                            camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) obj5;
                                        }
                                        f9 = fIAuthTabCallbackDefault;
                                        setviewablemrc100requests2 = setviewablemrc100requestsOnExtraCallback;
                                        f7 = fFloatValue4;
                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                                        onextracallback3 = onextracallback;
                                        f8 = f11;
                                        f10 = fOnExtraCallback;
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                        if ((iIntValue2 & 128) != 0) {
                                            i3 &= -29360129;
                                        }
                                        f7 = fFloatValue4;
                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                                        onextracallback3 = onextracallback;
                                        f8 = f2;
                                        f9 = f;
                                        f10 = fOnExtraCallback;
                                        setviewablemrc100requests2 = setviewablemrc100requests3;
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1620517979, i3, -1, "im.toss.tds.compose.component.atom.iconbutton.TdsIconButtonV1 (TdsIconButtonV1.kt:206)");
                                    }
                                    onCrash oncrash = onCrash.IconButton;
                                    boolean z = (i3 & 896) == 256;
                                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (!z) {
                                        Object obj6 = objOnMinimized2;
                                        if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            Function2 function2 = new Function2() { // from class: im.toss.tds.compose.component.atom.iconbutton.TdsIconButtonV1Kt$$ExternalSyntheticLambda0
                                                private static int onNavigationEvent = 1;
                                                private static int onWarmupCompleted;

                                                public final Object invoke(Object obj7, Object obj8) {
                                                    int i29 = 2 % 2;
                                                    int i30 = onNavigationEvent + 19;
                                                    onWarmupCompleted = i30 % 128;
                                                    int i31 = i30 % 2;
                                                    Object[] objArr2 = {str2, (initSDK.onNavigationEvent) obj7, (setPackageName) obj8};
                                                    int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
                                                    int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
                                                    int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
                                                    int iOnNavigationEvent4 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
                                                    if (i31 == 0) {
                                                        return (Unit) AppLovinNativeAdImpla.onNavigationEvent(566349767, -566349766, iOnNavigationEvent, iOnNavigationEvent3, iOnNavigationEvent4, objArr2, iOnNavigationEvent2);
                                                    }
                                                    Object obj9 = null;
                                                    obj9.hashCode();
                                                    throw null;
                                                }
                                            };
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function2);
                                            obj6 = function2;
                                        }
                                        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
                                        final float f12 = f9;
                                        final setViewableMRC100Requests setviewablemrc100requests4 = setviewablemrc100requests2;
                                        final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback5 = onextracallback3;
                                        final float f13 = f7;
                                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback6 = onextracallback3;
                                        final float f14 = f8;
                                        float f15 = f9;
                                        cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                        final float f16 = f10;
                                        i8 = iIntValue;
                                        final Object obj7 = obj;
                                        str = str2;
                                        setThreadList.IAuthTabCallback(oncrash, (initMiniApp) null, (initSDK) null, (Function2) obj6, (Set) null, ForwardingCameraControl.onExtraCallback(120085306, true, new setTaggedAddrCtrl() { // from class: im.toss.tds.compose.component.atom.iconbutton.TdsIconButtonV1Kt$$ExternalSyntheticLambda1
                                            private static int IAuthTabCallback = 0;
                                            private static int onExtraCallbackWithResult = 1;

                                            public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                                                int i29 = 2 % 2;
                                                int i30 = IAuthTabCallback + 45;
                                                onExtraCallbackWithResult = i30 % 128;
                                                int i31 = i30 % 2;
                                                Unit unitOnExtraCallback = AppLovinNativeAdImpla.onExtraCallback(camera2CapturePipelineTorchTaskExternalSyntheticLambda24, f12, setviewablemrc100requests4, onextracallback5, function0, f13, f14, f16, obj7, str2, (initSDK) obj8, (QuirksExternalSyntheticBackport0) obj9, (CameraCaptureResultEmptyCameraCaptureResult) obj10, ((Integer) obj11).intValue());
                                                int i32 = onExtraCallbackWithResult + 99;
                                                IAuthTabCallback = i32 % 128;
                                                int i33 = i32 % 2;
                                                return unitOnExtraCallback;
                                            }
                                        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 196614, 22);
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            int i29 = onWarmupCompleted + 49;
                                            asInterface = i29 % 128;
                                            if (i29 % 2 == 0) {
                                                CameraConfigExternalSyntheticLambda0.onTransact();
                                                int i30 = 37 / 0;
                                            } else {
                                                CameraConfigExternalSyntheticLambda0.onTransact();
                                            }
                                        }
                                        onextracallback2 = onextracallback6;
                                        f4 = f8;
                                        f6 = f10;
                                        setviewablemrc100requests = setviewablemrc100requests2;
                                        f3 = f7;
                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
                                        f5 = f15;
                                    }
                                }
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                if ((iIntValue & 1) != 0) {
                                }
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            i8 = iIntValue;
                            str = str2;
                            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                            f3 = fFloatValue4;
                            camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                            onextracallback2 = onextracallback;
                            f4 = f2;
                            f5 = f;
                            f6 = fOnExtraCallback;
                            setviewablemrc100requests = setviewablemrc100requests3;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                            return null;
                        }
                        final Object obj8 = obj;
                        final String str3 = str;
                        final int i31 = i8;
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.iconbutton.TdsIconButtonV1Kt$$ExternalSyntheticLambda2
                            private static int onExtraCallbackWithResult = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj9, Object obj10) {
                                int i32 = 2 % 2;
                                int i33 = onWarmupCompleted + 77;
                                onExtraCallbackWithResult = i33 % 128;
                                int i34 = i33 % 2;
                                Unit unitOnWarmupCompleted = AppLovinNativeAdImpla.onWarmupCompleted(obj8, function0, str3, onextracallback2, f5, f4, f6, setviewablemrc100requests, f3, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, i31, iIntValue2, (CameraCaptureResultEmptyCameraCaptureResult) obj9, ((Integer) obj10).intValue());
                                int i35 = onWarmupCompleted + 41;
                                onExtraCallbackWithResult = i35 % 128;
                                int i36 = i35 % 2;
                                return unitOnWarmupCompleted;
                            }
                        });
                        return null;
                    }
                    i3 |= 100663296;
                    fOnExtraCallback = fFloatValue3;
                    i7 = iIntValue2 & 512;
                    int i242 = 805306368;
                    if (i7 != 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i3) != 306783378, i3 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                f = fFloatValue;
                f2 = fFloatValue2;
                if ((12582912 & iIntValue) == 0) {
                }
                i6 = iIntValue2 & 256;
                if (i6 != 0) {
                }
                fOnExtraCallback = fFloatValue3;
                i7 = iIntValue2 & 512;
                int i2422 = 805306368;
                if (i7 != 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i3) != 306783378, i3 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            onextracallback = onextracallback4;
            i3 = i15;
            i4 = iIntValue2 & 32;
            int i202 = 196608;
            if (i4 != 0) {
            }
            i5 = iIntValue2 & 64;
            if (i5 != 0) {
            }
            f = fFloatValue;
            f2 = fFloatValue2;
            if ((12582912 & iIntValue) == 0) {
            }
            i6 = iIntValue2 & 256;
            if (i6 != 0) {
            }
            fOnExtraCallback = fFloatValue3;
            i7 = iIntValue2 & 512;
            int i24222 = 805306368;
            if (i7 != 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i3) != 306783378, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        obj = obj2;
        i2 = iIntValue2 & 16;
        if (i2 == 0) {
        }
        onextracallback = onextracallback4;
        i3 = i15;
        i4 = iIntValue2 & 32;
        int i2022 = 196608;
        if (i4 != 0) {
        }
        i5 = iIntValue2 & 64;
        if (i5 != 0) {
        }
        f = fFloatValue;
        f2 = fFloatValue2;
        if ((12582912 & iIntValue) == 0) {
        }
        i6 = iIntValue2 & 256;
        if (i6 != 0) {
        }
        fOnExtraCallback = fFloatValue3;
        i7 = iIntValue2 & 512;
        int i242222 = 805306368;
        if (i7 != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i3) != 306783378, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r5
      0x0022: PHI (r5v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r5v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r5v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0020, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 113;
        asInterface = i3 % 128;
        boolean z = false;
        if (i3 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(591816732);
            int i4 = 74 / 0;
            if (i != 0) {
                int i5 = asInterface + 55;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    z = true;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(591816732);
            if (i != 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1)) {
            int i6 = onWarmupCompleted + 53;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(591816732, i, -1, "im.toss.tds.compose.component.atom.iconbutton.Options (TdsIconButtonV1.kt:350)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) setPrivacyDestinationUri.onExtraCallbackWithResult.asInterface(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i7 = asInterface + 55;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsIconButtonV1Kt$.ExternalSyntheticLambda3(i));
        }
    }

    private static final boolean onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            return bool.booleanValue();
        }
        bool.booleanValue();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, initSDK.onNavigationEvent onnavigationevent, setPackageName setpackagename) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (Unit) onNavigationEvent(566349767, -566349766, iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{str, onnavigationevent, setpackagename}, iOnNavigationEvent2);
    }

    public static final void onExtraCallbackWithResult(@NotNull Object obj, @NotNull Function0<Unit> function0, @NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, float f2, float f3, @Nullable setViewableMRC100Requests setviewablemrc100requests, float f4, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Object[] objArr = {obj, function0, str, quirksExternalSyntheticBackport0, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), setviewablemrc100requests, Float.valueOf(f4), camera2CapturePipelineTorchTaskExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        onNavigationEvent(496495768, -496495766, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }

    private static final Unit onWarmupCompleted(String str, initSDK.onNavigationEvent onnavigationevent, setPackageName setpackagename) {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (Unit) onNavigationEvent(-523389076, 523389076, iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{str, onnavigationevent, setpackagename}, iOnNavigationEvent2);
    }

    private static final Unit onNavigationEvent(Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, float f, setViewableMRC100Requests setviewablemrc100requests, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, float f2, float f3, float f4, Object obj, String str, initSDK initsdk, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {camera2CapturePipelineTorchTaskExternalSyntheticLambda2, Float.valueOf(f), setviewablemrc100requests, quirksExternalSyntheticBackport0, function0, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), obj, str, initsdk, quirksExternalSyntheticBackport02, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onNavigationEvent(688479269, -688479266, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent());
    }
}
