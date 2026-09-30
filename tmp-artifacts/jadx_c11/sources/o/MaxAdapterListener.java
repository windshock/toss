package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.tds.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.MaxAdapterListener;
import o.QuirksExternalSyntheticBackport0;
import o.setViewableMRC50Requests;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxAdapterListener {
    private static final float IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int access000 = 1;
    private static int asBinder = 1;
    private static final getBacktraceNote<MaxAppOpenAdapterListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface;
    private static final DeviceQuirksExternalSyntheticLambda0 onExtraCallback;
    public static final MaxAdapterListener onExtraCallbackWithResult = new MaxAdapterListener();
    private static final float onNavigationEvent;
    private static final float onTransact;
    private static final float onWarmupCompleted;

    private static final Unit IAuthTabCallback(MaxAdapterListener maxAdapterListener, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = asBinder + 33;
        IAuthTabCallbackStub = i5 % 128;
        maxAdapterListener.onExtraCallbackWithResult(function0, quirksExternalSyntheticBackport0, j, cameraCaptureResultEmptyCameraCaptureResult, i5 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i6 = asBinder + 125;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 43 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i5);
        int i9 = (~(i | i6)) | i8;
        int i10 = (~(i6 | (~i5))) | (~((~i) | i7)) | i8;
        int i11 = i7 | i | i5;
        int i12 = i + i5 + i2 + (1050315579 * i4) + (2086215248 * i3);
        int i13 = i12 * i12;
        int i14 = (i * (-1156115713)) + 1671168000 + ((-1156115713) * i5) + ((-1856302338) * i9) + (i10 * 1856302338) + (1856302338 * i11) + (700186624 * i2) + ((-1303117824) * i4) + (314572800 * i3) + (431423488 * i13);
        int i15 = ((i * (-961373039)) - 1316831794) + (i5 * (-961373039)) + (i9 * (-990)) + (i10 * 990) + (i11 * 990) + (i2 * (-961372049)) + (i4 * 755842709) + (i3 * (-1858722640)) + (i13 * (-2040987648));
        int i16 = i14 + (i15 * i15 * 1361641472);
        return i16 != 1 ? i16 != 2 ? i16 != 3 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 37;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, function0, j, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 25;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 24 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(MaxAdapterListener maxAdapterListener, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallbackStub + 51;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(maxAdapterListener, function0, quirksExternalSyntheticBackport0, j, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = asBinder + 119;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 71 / 0;
        }
        return unitIAuthTabCallback;
    }

    private MaxAdapterListener() {
    }

    public final long IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 31;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1418065067, i, -1, "im.toss.tds.compose.component.util.navigation.TdsNavigationV1Defaults.<get-backgroundColor> (TdsNavigationV1Defaults.kt:40)");
        }
        long jOnWarmupCompleted = lc.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = asBinder + 5;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return jOnWarmupCompleted;
    }

    public final long onNavigationEvent(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = asBinder + 51;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-73679571, i, -1, "im.toss.tds.compose.component.util.navigation.TdsNavigationV1Defaults.<get-contentColor> (TdsNavigationV1Defaults.kt:45)");
            int i5 = IAuthTabCallbackStub + 37;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 % 2;
            }
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextStrong, cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i7 = asBinder + 49;
        IAuthTabCallbackStub = i7 % 128;
        if (i7 % 2 == 0) {
            return jOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 117;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 35 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1614180371, i, -1, "im.toss.tds.compose.component.util.navigation.TdsNavigationV1Defaults.<get-actionContentColor> (TdsNavigationV1Defaults.kt:50)");
            }
        } else if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i5 = IAuthTabCallbackStub + 121;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i6 == 0) {
                throw null;
            }
        }
        int i7 = IAuthTabCallbackStub + 53;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        return jOnExtraCallback;
    }

    public final long onExtraCallback(@NotNull deprecated_followRedirects deprecated_followredirects, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        long jOnExtraCallback;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2065313082, i, -1, "im.toss.tds.compose.component.util.navigation.TdsNavigationV1Defaults.actionIconColor (TdsNavigationV1Defaults.kt:54)");
        }
        if (deprecated_interceptors.onExtraCallback(deprecated_followredirects, null, cameraCaptureResultEmptyCameraCaptureResult, i & 14, 1)) {
            int i4 = asBinder + 1;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1959552891);
            jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.IconPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            i2 = asBinder + 123;
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1959623416);
            jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.IconQuaternary, cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            i2 = asBinder + 59;
        }
        IAuthTabCallbackStub = i2 % 128;
        int i6 = i2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return jOnExtraCallback;
    }

    public final long onExtraCallback(@NotNull Object obj, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        long jOnExtraCallback;
        int i2 = 2 % 2;
        int i3 = asBinder + 13;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = asBinder + 55;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1151739816, i, -1, "im.toss.tds.compose.component.util.navigation.TdsNavigationV1Defaults.actionIconColor (TdsNavigationV1Defaults.kt:64)");
        }
        if (onExtraCallbackWithResult(obj, cameraCaptureResultEmptyCameraCaptureResult, i & 126)) {
            int i6 = asBinder + 115;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1012788903);
            jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.IconPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1012718378);
            jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.IconQuaternary, cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = asBinder + 117;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return jOnExtraCallback;
    }

    private final boolean onExtraCallbackWithResult(Object obj, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean zOnExtraCallbackWithResult;
        int i2 = 2 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-134277049, i, -1, "im.toss.tds.compose.component.util.navigation.TdsNavigationV1Defaults.isSystemIcon (TdsNavigationV1Defaults.kt:74)");
            int i3 = IAuthTabCallbackStub + 11;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
        }
        if (obj instanceof deprecated_followRedirects) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-191221739);
            zOnExtraCallbackWithResult = deprecated_interceptors.onExtraCallback((deprecated_followRedirects) obj, null, cameraCaptureResultEmptyCameraCaptureResult, i & 14, 1);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else if (obj instanceof Integer) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-191220263);
            zOnExtraCallbackWithResult = MultipartReaderPartSource.onWarmupCompleted(OkHttp.onExtraCallback, ((Number) obj).intValue(), cameraCaptureResultEmptyCameraCaptureResult, (i << 3) & 112);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else if (obj instanceof String) {
            int i5 = IAuthTabCallbackStub + 115;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-191218567);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            zOnExtraCallbackWithResult = accessgetSslSocketFactoryOrNullp.onExtraCallbackWithResult(OkHttp.onExtraCallback, (String) obj);
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1632768759);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            zOnExtraCallbackWithResult = false;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i7 = asBinder + 35;
            IAuthTabCallbackStub = i7 % 128;
            int i8 = i7 % 2;
        }
        return zOnExtraCallbackWithResult;
    }

    public final long onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i3 = IAuthTabCallbackStub + 97;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-75387179, i, -1, "im.toss.tds.compose.component.util.navigation.TdsNavigationV1Defaults.<get-backButtonColor> (TdsNavigationV1Defaults.kt:86)");
        }
        long jOnWarmupCompleted = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onWarmupCompleted(eExternalSyntheticLambda0.NavigationBackButtonIcon, cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i5 = IAuthTabCallbackStub + 23;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 3;
            }
        }
        int i7 = IAuthTabCallbackStub + 33;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        return jOnWarmupCompleted;
    }

    public final long onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = IAuthTabCallbackStub + 7;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(644068119, i, -1, "im.toss.tds.compose.component.util.navigation.TdsNavigationV1Defaults.<get-redDotColor> (TdsNavigationV1Defaults.kt:92)");
        }
        long jOnWarmupCompleted = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onWarmupCompleted(eExternalSyntheticLambda0.RedDotFill, cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallbackStub + 107;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i7 = IAuthTabCallbackStub + 77;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
        }
        return jOnWarmupCompleted;
    }

    public final long IAuthTabCallbackDefault(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 105;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(904115005, i, -1, "im.toss.tds.compose.component.util.navigation.TdsNavigationV1Defaults.<get-redDotTextColor> (TdsNavigationV1Defaults.kt:97)");
        }
        long interfaceDescriptor = MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent.getInterfaceDescriptor(cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i4 = asBinder + 95;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        return interfaceDescriptor;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        float f = onNavigationEvent;
        int i5 = i3 + 115;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 117;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        float f = IAuthTabCallback;
        int i4 = i2 + 79;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return f;
    }

    public final DeviceQuirksExternalSyntheticLambda0 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback;
        }
        throw null;
    }

    public final getBacktraceNote<MaxAppOpenAdapterListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asBinder + 57;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        getBacktraceNote<MaxAppOpenAdapterListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = asInterface;
        if (i3 != 0) {
            int i4 = 3 / 0;
        }
        return getbacktracenote;
    }

    public final setViewableMRC50Requests.onWarmupCompleted onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 115;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        setViewableMRC50Requests.onWarmupCompleted onwarmupcompletedIAuthTabCallback = setViewableMRC50Requests.onWarmupCompleted.IAuthTabCallback(setViewableMRC50Requests.onWarmupCompleted.Companion.onWarmupCompleted(), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(MaxError.onExtraCallbackWithResult.onNavigationEvent() - VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)) / 2.0f), 1, null);
        int i4 = asBinder + 31;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return onwarmupcompletedIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        long jOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        MaxError maxError = MaxError.onExtraCallbackWithResult;
        if (i3 == 0) {
            jOnNavigationEvent = VirtualCameraControlExternalSyntheticLambda2.onNavigationEvent(maxError.onNavigationEvent(), maxError.onNavigationEvent());
            int i4 = 59 / 0;
        } else {
            jOnNavigationEvent = VirtualCameraControlExternalSyntheticLambda2.onNavigationEvent(maxError.onNavigationEvent(), maxError.onNavigationEvent());
        }
        return Long.valueOf(jOnNavigationEvent);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        float f = onWarmupCompleted;
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
        return Float.valueOf(f);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 83;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        float f = onTransact;
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        return Float.valueOf(f);
    }

    public final float onExtraCallbackWithResult(@NotNull DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 67;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        Object[] objArr = {this, Float.valueOf(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(deviceQuirksExternalSyntheticLambda0, ExtensionsManagerExtensionsAvailability.Ltr))};
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        float fFloatValue = ((Float) onExtraCallback(1986051799, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), objArr, JsParamKeys.onExtraCallbackWithResult(), -1986051796, iOnExtraCallbackWithResult)).floatValue();
        int i4 = asBinder + 27;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return fFloatValue;
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 7;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i5 = asBinder + 91;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = asBinder + 49;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1961465740, i, -1, "im.toss.tds.compose.component.util.navigation.TdsNavigationV1Defaults.BackButton.<anonymous> (TdsNavigationV1Defaults.kt:131)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1961465740, i, -1, "im.toss.tds.compose.component.util.navigation.TdsNavigationV1Defaults.BackButton.<anonymous> (TdsNavigationV1Defaults.kt:131)");
            }
            AppLovinNativeAdImpla.onExtraCallback(deprecated_followSslRedirects.onWarmupCompleted(R.drawable.icon_arrow_back_android_mono), function0, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(androidx.appcompat.R.string.abc_action_bar_up_description, cameraCaptureResultEmptyCameraCaptureResult, 0), addAttachUserData.onWarmupCompleted(quirksExternalSyntheticBackport0, getDid.Companion.IAuthTabCallback()), onExtraCallbackWithResult.onExtraCallbackWithResult(), null, j, cameraCaptureResultEmptyCameraCaptureResult, 0, 32);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = IAuthTabCallbackStub + 39;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(@NotNull final Function0<Unit> function0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        long jOnWarmupCompleted;
        boolean z;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i5;
        int i6;
        int i7 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(277551182);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i9 = asBinder + 105;
                    IAuthTabCallbackStub = i9 % 128;
                    i4 = i9 % 2 != 0 ? 38 : 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            if ((i & 384) != 0) {
                jOnWarmupCompleted = j;
                if ((i2 & 4) != 0 || (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnWarmupCompleted))) {
                    i6 = 128;
                } else {
                    int i10 = asBinder + 59;
                    IAuthTabCallbackStub = i10 % 128;
                    int i11 = i10 % 2;
                    i6 = 256;
                }
                i3 |= i6;
            } else {
                jOnWarmupCompleted = j;
            }
            if ((i & 3072) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this)) {
                    int i12 = IAuthTabCallbackStub + 73;
                    asBinder = i12 % 128;
                    int i13 = i12 % 2;
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i3 & 1171) == 1170) {
                int i14 = IAuthTabCallbackStub + 21;
                asBinder = i14 % 128;
                int i15 = i14 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    if (i8 != 0) {
                        int i16 = IAuthTabCallbackStub + 57;
                        asBinder = i16 % 128;
                        if (i16 % 2 == 0) {
                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                            throw null;
                        }
                        quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                    } else {
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                    }
                    if ((i2 & 4) != 0) {
                        int i17 = asBinder + 97;
                        IAuthTabCallbackStub = i17 % 128;
                        int i18 = i17 % 2;
                        jOnWarmupCompleted = onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 >> 9) & 14);
                        i3 &= -897;
                        final long j2 = jOnWarmupCompleted;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(277551182, i3, -1, "im.toss.tds.compose.component.util.navigation.TdsNavigationV1Defaults.BackButton (TdsNavigationV1Defaults.kt:127)");
                            int i19 = IAuthTabCallbackStub + 59;
                            asBinder = i19 % 128;
                            int i20 = i19 % 2;
                        }
                        configureReward.IAuthTabCallback(((Long) onExtraCallback(-2074101946, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, JsParamKeys.onExtraCallbackWithResult(), 2074101947, JsParamKeys.onExtraCallbackWithResult())).longValue(), false, ForwardingCameraControl.onExtraCallback(1961465740, true, new Function2() { // from class: im.toss.tds.compose.component.util.navigation.TdsNavigationV1Defaults$$ExternalSyntheticLambda0
                            private static int onExtraCallback = 1;
                            private static int onExtraCallbackWithResult;

                            public final Object invoke(Object obj, Object obj2) {
                                int i21 = 2 % 2;
                                int i22 = onExtraCallbackWithResult + 43;
                                onExtraCallback = i22 % 128;
                                if (i22 % 2 != 0) {
                                    return MaxAdapterListener.onNavigationEvent(quirksExternalSyntheticBackport03, function0, j2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                }
                                Unit unitOnNavigationEvent = MaxAdapterListener.onNavigationEvent(quirksExternalSyntheticBackport03, function0, j2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i23 = 49 / 0;
                                return unitOnNavigationEvent;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 2);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i21 = IAuthTabCallbackStub + 49;
                            asBinder = i21 % 128;
                            int i22 = i21 % 2;
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            int i23 = IAuthTabCallbackStub + 43;
                            asBinder = i23 % 128;
                            int i24 = i23 % 2;
                        }
                        jOnWarmupCompleted = j2;
                    } else {
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 4) != 0) {
                        int i25 = asBinder + 105;
                        IAuthTabCallbackStub = i25 % 128;
                        i3 = i25 % 2 != 0 ? i3 & 31234 : i3 & (-897);
                    }
                }
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                final long j22 = jOnWarmupCompleted;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                configureReward.IAuthTabCallback(((Long) onExtraCallback(-2074101946, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, JsParamKeys.onExtraCallbackWithResult(), 2074101947, JsParamKeys.onExtraCallbackWithResult())).longValue(), false, ForwardingCameraControl.onExtraCallback(1961465740, true, new Function2() { // from class: im.toss.tds.compose.component.util.navigation.TdsNavigationV1Defaults$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj, Object obj2) {
                        int i212 = 2 % 2;
                        int i222 = onExtraCallbackWithResult + 43;
                        onExtraCallback = i222 % 128;
                        if (i222 % 2 != 0) {
                            return MaxAdapterListener.onNavigationEvent(quirksExternalSyntheticBackport03, function0, j22, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        }
                        Unit unitOnNavigationEvent = MaxAdapterListener.onNavigationEvent(quirksExternalSyntheticBackport03, function0, j22, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i232 = 49 / 0;
                        return unitOnNavigationEvent;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 2);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                jOnWarmupCompleted = j22;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                final long j3 = jOnWarmupCompleted;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.util.navigation.TdsNavigationV1Defaults$$ExternalSyntheticLambda1
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                        int i26 = 2 % 2;
                        int i27 = onExtraCallbackWithResult + 59;
                        IAuthTabCallback = i27 % 128;
                        int i28 = i27 % 2;
                        Unit unitOnWarmupCompleted = MaxAdapterListener.onWarmupCompleted(this.f$0, function0, quirksExternalSyntheticBackport04, j3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i29 = onExtraCallbackWithResult + 47;
                        IAuthTabCallback = i29 % 128;
                        int i30 = i29 % 2;
                        return unitOnWarmupCompleted;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) == 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(72.0f) - fFloatValue);
        int i4 = asBinder + 23;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return Float.valueOf(fIAuthTabCallback);
    }

    static {
        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f);
        onNavigationEvent = fIAuthTabCallback;
        float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f);
        IAuthTabCallback = fIAuthTabCallback2;
        onExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(fIAuthTabCallback, 0.0f, fIAuthTabCallback2, 0.0f, 10, (Object) null);
        asInterface = loadRewardedAd.IAuthTabCallback.onExtraCallbackWithResult();
        onWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
        onTransact = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f);
        int i = access000 + 63;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onWarmupCompleted() {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return ((Long) onExtraCallback(-2074101946, iOnExtraCallbackWithResult2, JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult3, 2074101947, iOnExtraCallbackWithResult)).longValue();
    }

    public final float IAuthTabCallbackStub() {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return ((Float) onExtraCallback(115370551, iOnExtraCallbackWithResult2, JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult3, -115370551, iOnExtraCallbackWithResult)).floatValue();
    }

    public final float onTransact() {
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = JsParamKeys.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = JsParamKeys.onExtraCallbackWithResult();
        return ((Float) onExtraCallback(2139912409, iOnExtraCallbackWithResult2, JsParamKeys.onExtraCallbackWithResult(), new Object[]{this}, iOnExtraCallbackWithResult3, -2139912407, iOnExtraCallbackWithResult)).floatValue();
    }

    public final float onWarmupCompleted(float f) {
        Object[] objArr = {this, Float.valueOf(f)};
        int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
        return ((Float) onExtraCallback(1986051799, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), objArr, JsParamKeys.onExtraCallbackWithResult(), -1986051796, iOnExtraCallbackWithResult)).floatValue();
    }
}
