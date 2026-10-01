package im.toss.tds.compose.component.compound.listheader.v3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import com.google.android.material.datepicker.DateFormatTextWatcher$;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import im.toss.tds.R;
import im.toss.tds.compose.component.compound.listheader.v3.RightPreset$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImpla;
import o.AppLovinNativeAdImplc;
import o.AppLovinVastMediaVieweExternalSyntheticLambda0;
import o.AvoidCaptureProcessProgressAvailabilityCheckQuirk;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraProviderInitRetryPolicy1;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.FocusMeteringControlExternalSyntheticLambda3;
import o.ForwardingCameraControl;
import o.GraphicDeviceInfo;
import o.HighSpeedResolverExternalSyntheticLambda1;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.PreviewExternalSyntheticLambda3;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SurfaceProcessorNodeOut;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.component5;
import o.configureReward;
import o.createCameraCaptureCallback;
import o.deprecated_authenticator;
import o.deprecated_callTimeoutMillis;
import o.deprecated_followRedirects;
import o.getAwbState;
import o.getHumanReadableName;
import o.getSubtitle;
import o.getTitleMarginEnd;
import o.hasProvider;
import o.oExternalSyntheticLambda0;
import o.oExternalSyntheticLambda1;
import o.resolveQuirkNames;
import o.setByteOrder;
import o.setViewableMRC50Requests;
import o.toPreviewOnlyRange;
import o.w0b;
import o.w2;
import o.wa;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RightSlotMarker
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RightPreset implements RowScope {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private final wa.IAuthTabCallback onExtraCallbackWithResult;
    private final RowScope onWarmupCompleted;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Object obj = objArr[0];
        Function0 function0 = (Function0) objArr[1];
        String str = (String) objArr[2];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[3];
        setViewableMRC50Requests.onWarmupCompleted onwarmupcompleted = (setViewableMRC50Requests.onWarmupCompleted) objArr[4];
        setViewableMRC50Requests.onNavigationEvent onnavigationevent = (setViewableMRC50Requests.onNavigationEvent) objArr[5];
        long jLongValue = ((Number) objArr[6]).longValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(obj, function0, str, quirksExternalSyntheticBackport0, onwarmupcompleted, onnavigationevent, jLongValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        onExtraCallbackWithResult(obj, function0, str, quirksExternalSyntheticBackport0, onwarmupcompleted, onnavigationevent, jLongValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws NoWhenBranchMatchedException {
        int i7 = ~i2;
        int i8 = ~(i7 | i4);
        int i9 = ~(i5 | i4);
        int i10 = ~i5;
        int i11 = ~i4;
        int i12 = i8 | i9 | (~(i10 | i11 | i2));
        int i13 = i8 | (~(i7 | i5)) | i9;
        int i14 = (~(i4 | i2)) | (~(i10 | i4)) | (~(i7 | i11 | i5));
        int i15 = i2 + i5 + i + (1880080305 * i3) + (458392769 * i6);
        int i16 = i15 * i15;
        int i17 = ((766573918 * i2) - 2147483648) + (1582236324 * i5) + (i12 * (-407831203)) + (815662406 * i13) + ((-407831203) * i14) + (1174405120 * i) + (1711276032 * i3) + ((-973078528) * i6) + (68288512 * i16);
        int i18 = ((i2 * 319678698) - 2002258816) + (i5 * 319678284) + (i12 * 207) + (i13 * (-414)) + (i14 * 207) + (i * 319678491) + (i3 * (-161570901)) + (i6 * (-1160779685)) + (i16 * (-1109000192));
        int i19 = i17 + (i18 * i18 * (-1432485888));
        if (i19 != 1) {
            return i19 != 2 ? onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
        }
        RightPreset rightPreset = (RightPreset) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        int iIntValue = ((Number) objArr[3]).intValue();
        int iIntValue2 = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue3 = ((Number) objArr[6]).intValue();
        int i20 = 2 % 2;
        int i21 = onExtraCallback + 13;
        IAuthTabCallback = i21 % 128;
        int i22 = i21 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(rightPreset, quirksExternalSyntheticBackport0, jLongValue, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        int i23 = onExtraCallback + 37;
        IAuthTabCallback = i23 % 128;
        int i24 = i23 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(deprecated_followRedirects deprecated_followredirects, Function0 function0, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setViewableMRC50Requests.onWarmupCompleted onwarmupcompleted, setViewableMRC50Requests.onNavigationEvent onnavigationevent, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 23;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(deprecated_followredirects, function0, str, quirksExternalSyntheticBackport0, onwarmupcompleted, onnavigationevent, j, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 39 / 0;
        }
        int i6 = onExtraCallback + 29;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, Function0 function0, String str2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setViewableMRC50Requests.onWarmupCompleted onwarmupcompleted, setViewableMRC50Requests.onNavigationEvent onnavigationevent, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 61;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallback(str, function0, str2, quirksExternalSyntheticBackport0, onwarmupcompleted, onnavigationevent, j, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(str, function0, str2, quirksExternalSyntheticBackport0, onwarmupcompleted, onnavigationevent, j, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallback + 13;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return unitOnExtraCallback;
    }

    private static final Unit onWarmupCompleted(RightPreset rightPreset, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 15;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        rightPreset.onNavigationEvent(quirksExternalSyntheticBackport0, j, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 81;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = this.onWarmupCompleted.onExtraCallback(quirksExternalSyntheticBackport0);
        int i4 = onExtraCallback + 121;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    public QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        if (i3 != 0) {
            return this.onWarmupCompleted.onExtraCallback(quirksExternalSyntheticBackport0, onwarmupcompleted);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = this.onWarmupCompleted.onExtraCallback(quirksExternalSyntheticBackport0, onwarmupcompleted);
        int i4 = 63 / 0;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    public QuirksExternalSyntheticBackport0 onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        RowScope rowScope = this.onWarmupCompleted;
        if (i3 == 0) {
            return rowScope.onNavigationEvent(quirksExternalSyntheticBackport0, f, z);
        }
        rowScope.onNavigationEvent(quirksExternalSyntheticBackport0, f, z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RightPreset(@NotNull wa.IAuthTabCallback iAuthTabCallback, @NotNull RowScope rowScope) {
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(rowScope, "");
        this.onExtraCallbackWithResult = iAuthTabCallback;
        this.onWarmupCompleted = rowScope;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        createCameraCaptureCallback createcameracapturecallbackOnExtraCallback = null;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = IAuthTabCallback + 115;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1184109075, iIntValue, -1, "im.toss.tds.compose.component.compound.listheader.v3.RightPreset.<get-textAlign> (RightPreset.kt:41)");
            if (i5 == 0) {
                throw null;
            }
        }
        if (!(!((Boolean) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(wa.onWarmupCompleted.onExtraCallbackWithResult())).booleanValue())) {
            int i6 = IAuthTabCallback + 49;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 16 / 0;
            }
        } else {
            createcameracapturecallbackOnExtraCallback = createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.onNavigationEvent());
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = IAuthTabCallback + 15;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return createcameracapturecallbackOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull final Object obj, @NotNull final Function0<Unit> function0, @NotNull final String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable setViewableMRC50Requests.onWarmupCompleted onwarmupcompleted, @Nullable setViewableMRC50Requests.onNavigationEvent onnavigationevent, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final setViewableMRC50Requests.onNavigationEvent onnavigationeventOnExtraCallback;
        final long jIAuthTabCallback;
        w0b w0bVar;
        int i3;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 5;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(str, "");
            if ((i2 & 16) != 0) {
                quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                int i6 = IAuthTabCallback + 109;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            } else {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            }
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(str, "");
            if ((i2 & 8) != 0) {
            }
        }
        final setViewableMRC50Requests.onWarmupCompleted onwarmupcompletedIAuthTabCallback = (i2 & 16) != 0 ? w0b.IAuthTabCallback.IAuthTabCallback(this.onExtraCallbackWithResult) : onwarmupcompleted;
        if ((i2 & 32) != 0) {
            int i8 = IAuthTabCallback + 123;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                setViewableMRC50Requests.onNavigationEvent.Companion.onExtraCallback();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            onnavigationeventOnExtraCallback = setViewableMRC50Requests.onNavigationEvent.Companion.onExtraCallback();
        } else {
            onnavigationeventOnExtraCallback = onnavigationevent;
        }
        if ((i2 & 64) != 0) {
            int i9 = IAuthTabCallback + 29;
            onExtraCallback = i9 % 128;
            if (i9 % 2 == 0) {
                w0bVar = w0b.IAuthTabCallback;
                i3 = 63;
            } else {
                w0bVar = w0b.IAuthTabCallback;
                i3 = 6;
            }
            jIAuthTabCallback = w0bVar.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i3);
        } else {
            jIAuthTabCallback = j;
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i10 = IAuthTabCallback + 61;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1895825209, i, -1, "im.toss.tds.compose.component.compound.listheader.v3.RightPreset.IconButton (RightPreset.kt:58)");
        }
        configureReward.IAuthTabCallback(w0b.IAuthTabCallback.onExtraCallbackWithResult(), false, ForwardingCameraControl.onExtraCallback(-1787776763, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listheader.v3.RightPreset$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj3, Object obj4) {
                int i12 = 2 % 2;
                int i13 = onWarmupCompleted + 105;
                onNavigationEvent = i13 % 128;
                int i14 = i13 % 2;
                Object obj5 = obj;
                Function0 function02 = function0;
                String str2 = str;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                setViewableMRC50Requests.onWarmupCompleted onwarmupcompleted2 = onwarmupcompletedIAuthTabCallback;
                setViewableMRC50Requests.onNavigationEvent onnavigationevent2 = onnavigationeventOnExtraCallback;
                long j2 = jIAuthTabCallback;
                int iIntValue = ((Integer) obj4).intValue();
                Object[] objArr = {obj5, function02, str2, quirksExternalSyntheticBackport03, onwarmupcompleted2, onnavigationevent2, Long.valueOf(j2), (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(iIntValue)};
                Unit unit = (Unit) RightPreset.onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 684506442, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -684506440, objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
                int i15 = onWarmupCompleted + 105;
                onNavigationEvent = i15 % 128;
                if (i15 % 2 == 0) {
                    int i16 = 25 / 0;
                }
                return unit;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 390, 2);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static final Unit onExtraCallbackWithResult(Object obj, Function0 function0, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setViewableMRC50Requests.onWarmupCompleted onwarmupcompleted, setViewableMRC50Requests.onNavigationEvent onnavigationevent, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 49;
        IAuthTabCallback = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 == 0 ? (i & 3) != 2 : (i & 5) != 3, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = IAuthTabCallback + 27;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1787776763, i, -1, "im.toss.tds.compose.component.compound.listheader.v3.RightPreset.IconButton.<anonymous> (RightPreset.kt:62)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1787776763, i, -1, "im.toss.tds.compose.component.compound.listheader.v3.RightPreset.IconButton.<anonymous> (RightPreset.kt:62)");
            }
            AppLovinNativeAdImpla.IAuthTabCallback(obj, function0, str, quirksExternalSyntheticBackport0, onwarmupcompleted, onnavigationevent, j, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallback + 45;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = onExtraCallback + 33;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i9 = onExtraCallback + 69;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(String str, Function0 function0, String str2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setViewableMRC50Requests.onWarmupCompleted onwarmupcompleted, setViewableMRC50Requests.onNavigationEvent onnavigationevent, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 73;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = onExtraCallback + 103;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            int i7 = onExtraCallback + 79;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallback + 117;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1945228756, i, -1, "im.toss.tds.compose.component.compound.listheader.v3.RightPreset.IconButton.<anonymous> (RightPreset.kt:88)");
            }
            AppLovinNativeAdImpla.IAuthTabCallback(deprecated_authenticator.onNavigationEvent(str, deprecated_callTimeoutMillis.Companion.IAuthTabCallback()), function0, str2, quirksExternalSyntheticBackport0, onwarmupcompleted, onnavigationevent, j, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallback + 11;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    public final void onWarmupCompleted(@NotNull deprecated_followRedirects deprecated_followredirects, @NotNull Function0<Unit> function0, @NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable setViewableMRC50Requests.onWarmupCompleted onwarmupcompleted, @Nullable setViewableMRC50Requests.onNavigationEvent onnavigationevent, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        setViewableMRC50Requests.onWarmupCompleted onwarmupcompleted2;
        long jIAuthTabCallback;
        setViewableMRC50Requests.onWarmupCompleted onwarmupcompletedIAuthTabCallback;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 43;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(str, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 8) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i2 & 16) != 0) {
            int i6 = IAuthTabCallback + 107;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                onwarmupcompletedIAuthTabCallback = w0b.IAuthTabCallback.IAuthTabCallback(this.onExtraCallbackWithResult);
                int i7 = 94 / 0;
            } else {
                onwarmupcompletedIAuthTabCallback = w0b.IAuthTabCallback.IAuthTabCallback(this.onExtraCallbackWithResult);
            }
            onwarmupcompleted2 = onwarmupcompletedIAuthTabCallback;
        } else {
            onwarmupcompleted2 = onwarmupcompleted;
        }
        setViewableMRC50Requests.onNavigationEvent onnavigationeventOnExtraCallback = (i2 & 32) != 0 ? setViewableMRC50Requests.onNavigationEvent.Companion.onExtraCallback() : onnavigationevent;
        if ((i2 & 64) != 0) {
            int i8 = IAuthTabCallback + 99;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            jIAuthTabCallback = w0b.IAuthTabCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6);
        } else {
            jIAuthTabCallback = j;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = IAuthTabCallback + 75;
            onExtraCallback = i10 % 128;
            if (i10 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1289863457, i, -1, "im.toss.tds.compose.component.compound.listheader.v3.RightPreset.IconButton (RightPreset.kt:110)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1289863457, i, -1, "im.toss.tds.compose.component.compound.listheader.v3.RightPreset.IconButton (RightPreset.kt:110)");
        }
        configureReward.IAuthTabCallback(w0b.IAuthTabCallback.onExtraCallbackWithResult(), false, ForwardingCameraControl.onExtraCallback(-788372639, true, new RightPreset$.ExternalSyntheticLambda2(deprecated_followredirects, function0, str, quirksExternalSyntheticBackport02, onwarmupcompleted2, onnavigationeventOnExtraCallback, jIAuthTabCallback), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 390, 2);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static final Unit onWarmupCompleted(deprecated_followRedirects deprecated_followredirects, Function0 function0, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setViewableMRC50Requests.onWarmupCompleted onwarmupcompleted, setViewableMRC50Requests.onNavigationEvent onnavigationevent, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i3 = IAuthTabCallback + 33;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onExtraCallback + 121;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallback + 47;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-788372639, i, -1, "im.toss.tds.compose.component.compound.listheader.v3.RightPreset.IconButton.<anonymous> (RightPreset.kt:114)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-788372639, i, -1, "im.toss.tds.compose.component.compound.listheader.v3.RightPreset.IconButton.<anonymous> (RightPreset.kt:114)");
            }
            AppLovinNativeAdImpla.IAuthTabCallback(deprecated_followredirects, function0, str, quirksExternalSyntheticBackport0, onwarmupcompleted, onnavigationevent, j, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = IAuthTabCallback + 33;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
        }
        return Unit.INSTANCE;
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        GraphicDeviceInfo graphicDeviceInfo2;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 5;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        getHumanReadableName gethumanreadablename2 = (i2 & 4) != 0 ? (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted()) : gethumanreadablename;
        long jOnTransact = (i2 & 8) != 0 ? setByteOrder.Companion.onTransact() : j;
        long jOnNavigationEvent = (i2 & 16) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
        if ((i2 & 32) != 0) {
            int i6 = onExtraCallback + 69;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1369410386, i, -1, "im.toss.tds.compose.component.compound.listheader.v3.RightPreset.Text (RightPreset.kt:135)");
        }
        AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, quirksExternalSyntheticBackport02, gethumanreadablename2, Long.valueOf(jOnTransact), Long.valueOf(jOnNavigationEvent), 0L, null, null, (createCameraCaptureCallback) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -560830512, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 560830512, new Object[]{this, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i >> 18) & 14)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent()), Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfo2, null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i & 65534), Integer.valueOf(i & 458752), 98016}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i8 = onExtraCallback + 85;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 5 % 4;
            }
        }
    }

    public final void IAuthTabCallback(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getHumanReadableName gethumanreadablename, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        getHumanReadableName gethumanreadablename2;
        long jOnTransact;
        GraphicDeviceInfo graphicDeviceInfo2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 89;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i2 & 4) != 0) {
            int i6 = IAuthTabCallback + 111;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            gethumanreadablename2 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
        } else {
            gethumanreadablename2 = gethumanreadablename;
        }
        Object obj = null;
        if ((i2 & 8) != 0) {
            int i8 = IAuthTabCallback + 101;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                setByteOrder.Companion.onTransact();
                obj.hashCode();
                throw null;
            }
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        long jOnNavigationEvent = (i2 & 16) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j2;
        if ((i2 & 32) != 0) {
            int i9 = onExtraCallback + 95;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(809416660, i, -1, "im.toss.tds.compose.component.compound.listheader.v3.RightPreset.Text (RightPreset.kt:156)");
        }
        AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasprovider, quirksExternalSyntheticBackport02, gethumanreadablename2, jOnTransact, jOnNavigationEvent, 0L, null, null, (createCameraCaptureCallback) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -560830512, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 560830512, new Object[]{this, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i >> 18) & 14)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent()), 0.0f, null, null, null, 0L, 0, false, graphicDeviceInfo2, null, cameraCaptureResultEmptyCameraCaptureResult, i & 65534, (i << 3) & 3670016, 196320);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i10 = onExtraCallback + 19;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
        }
    }

    public final void IAuthTabCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, @Nullable oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback, long j2, @Nullable oExternalSyntheticLambda0.onNavigationEvent onnavigationevent, long j3, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable String str2, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) throws NoWhenBranchMatchedException {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long jOnTransact;
        GraphicDeviceInfo graphicDeviceInfo2;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 35;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if ((i3 & 2) != 0) {
            int i7 = onExtraCallback + 11;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                int i8 = 60 / 0;
            } else {
                quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            }
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        if ((i3 & 4) != 0) {
            int i9 = IAuthTabCallback + 119;
            onExtraCallback = i9 % 128;
            if (i9 % 2 == 0) {
                jOnTransact = setByteOrder.Companion.onTransact();
                int i10 = 31 / 0;
            } else {
                jOnTransact = setByteOrder.Companion.onTransact();
            }
            int i11 = onExtraCallback + 29;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
        } else {
            jOnTransact = j;
        }
        Object obj = null;
        oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult2 = (i3 & 8) != 0 ? null : onextracallbackwithresult;
        oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback2 = (i3 & 16) != 0 ? null : iAuthTabCallback;
        long jOnExtraCallback = (i3 & 32) != 0 ? w0b.IAuthTabCallback.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, 6) : j2;
        oExternalSyntheticLambda0.onNavigationEvent onnavigationevent2 = (i3 & 64) != 0 ? null : onnavigationevent;
        long jOnNavigationEvent = (i3 & 128) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j3;
        if ((i3 & 256) != 0) {
            int i13 = IAuthTabCallback + 73;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        String str3 = (i3 & 512) != 0 ? null : str2;
        Function0<Unit> function02 = (i3 & 1024) != 0 ? null : function0;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2128054123, i, i2, "im.toss.tds.compose.component.compound.listheader.v3.RightPreset.TextButton (RightPreset.kt:182)");
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
        long j4 = jOnTransact;
        oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult3 = onextracallbackwithresult2;
        oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback3 = iAuthTabCallback2;
        long j5 = jOnExtraCallback;
        oExternalSyntheticLambda0.onNavigationEvent onnavigationevent3 = onnavigationevent2;
        long j6 = jOnNavigationEvent;
        GraphicDeviceInfo graphicDeviceInfo3 = graphicDeviceInfo2;
        String str4 = str3;
        Function0<Unit> function03 = function02;
        oExternalSyntheticLambda1.IAuthTabCallback(str, quirksExternalSyntheticBackport03, j4, onextracallbackwithresult3, iAuthTabCallback3, j5, onnavigationevent3, j6, (getHumanReadableName) null, (createCameraCaptureCallback) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -560830512, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 560830512, new Object[]{this, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i2 >> 3) & 14)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent()), graphicDeviceInfo3, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) w2.IAuthTabCallback(1160267148, new Object[]{Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(this.onExtraCallbackWithResult.onTransact().getSize())), false, false, 6, null}, -1160267144, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback()), str4, function03, (Role) null, (Function1<? super SurfaceProcessorNodeOut, Unit>) null, false, cameraCaptureResultEmptyCameraCaptureResult, i & 33554430, ((i >> 18) & 7168) | ((i >> 24) & 14) | ((i2 << 12) & 57344), 231680);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i15 = onExtraCallback + 95;
            IAuthTabCallback = i15 % 128;
            int i16 = i15 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i16 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public final void onNavigationEvent(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult, @Nullable oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback, long j2, @Nullable oExternalSyntheticLambda0.onNavigationEvent onnavigationevent, long j3, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable String str, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) throws NoWhenBranchMatchedException {
        long jOnExtraCallback;
        oExternalSyntheticLambda0.onNavigationEvent onnavigationevent2;
        GraphicDeviceInfo graphicDeviceInfo2;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i3 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        long jOnTransact = (i3 & 4) != 0 ? setByteOrder.Companion.onTransact() : j;
        oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult2 = (i3 & 8) != 0 ? null : onextracallbackwithresult;
        oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback2 = (i3 & 16) != 0 ? null : iAuthTabCallback;
        if ((i3 & 32) != 0) {
            int i5 = IAuthTabCallback + 103;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            jOnExtraCallback = w0b.IAuthTabCallback.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, 6);
        } else {
            jOnExtraCallback = j2;
        }
        if ((i3 & 64) != 0) {
            int i7 = IAuthTabCallback + 73;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            onnavigationevent2 = null;
        } else {
            onnavigationevent2 = onnavigationevent;
        }
        long jOnNavigationEvent = (i3 & 128) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j3;
        if ((i3 & 256) != 0) {
            int i9 = onExtraCallback + 49;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        String str2 = (i3 & 512) != 0 ? null : str;
        Function0<Unit> function02 = (i3 & 1024) != 0 ? null : function0;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-252499405, i, i2, "im.toss.tds.compose.component.compound.listheader.v3.RightPreset.TextButton (RightPreset.kt:214)");
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
        long j4 = jOnTransact;
        oExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult3 = onextracallbackwithresult2;
        oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback3 = iAuthTabCallback2;
        long j5 = jOnExtraCallback;
        oExternalSyntheticLambda0.onNavigationEvent onnavigationevent3 = onnavigationevent2;
        long j6 = jOnNavigationEvent;
        GraphicDeviceInfo graphicDeviceInfo3 = graphicDeviceInfo2;
        String str3 = str2;
        Function0<Unit> function03 = function02;
        oExternalSyntheticLambda1.onWarmupCompleted(hasprovider, quirksExternalSyntheticBackport03, j4, onextracallbackwithresult3, iAuthTabCallback3, j5, onnavigationevent3, j6, null, (createCameraCaptureCallback) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -560830512, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 560830512, new Object[]{this, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i2 >> 3) & 14)}, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent()), graphicDeviceInfo3, null, (getTitleMarginEnd) w2.IAuthTabCallback(1160267148, new Object[]{Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(this.onExtraCallbackWithResult.onTransact().getSize())), false, false, 6, null}, -1160267144, PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback()), str3, function03, null, null, false, cameraCaptureResultEmptyCameraCaptureResult, i & 33554430, ((i >> 18) & 7168) | ((i >> 24) & 14) | ((i2 << 12) & 57344), 231680);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        int i4;
        long jOnExtraCallback;
        boolean z;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long j2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
        int i5 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-433973373);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i7 = onExtraCallback + 71;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport03)) {
                int i8 = onExtraCallback + 1;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i | i4;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            jOnExtraCallback = j;
            i3 |= ((i2 & 2) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnExtraCallback)) ? 32 : 16;
        } else {
            jOnExtraCallback = j;
        }
        if ((i3 & 19) != 18) {
            int i10 = onExtraCallback + 119;
            IAuthTabCallback = i10 % 128;
            z = i10 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) != 0) {
                int i11 = onExtraCallback + 97;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                } else {
                    if (i6 != 0) {
                        quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                    }
                    if ((i2 & 2) != 0) {
                        jOnExtraCallback = w0b.IAuthTabCallback.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                        i3 &= -113;
                    }
                }
                int i13 = i3;
                j2 = jOnExtraCallback;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i14 = IAuthTabCallback + 83;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-433973373, i13, -1, "im.toss.tds.compose.component.compound.listheader.v3.RightPreset.Arrow (RightPreset.kt:236)");
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport03, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f));
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallbackDefault);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    int i16 = onExtraCallback + 59;
                    IAuthTabCallback = i16 % 128;
                    if (i16 % 2 != 0) {
                        getAwbState.onExtraCallback();
                        int i17 = 97 / 0;
                    } else {
                        getAwbState.onExtraCallback();
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                AppLovinNativeAdImplc.onExtraCallback(R.drawable.icon_arrow_right_mono, null, j2, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i13 << 3) & 896, 506);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            j2 = jOnExtraCallback;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
            final long j3 = j2;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.listheader.v3.RightPreset$$ExternalSyntheticLambda3
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i18 = 2 % 2;
                    int i19 = onExtraCallbackWithResult + 63;
                    onNavigationEvent = i19 % 128;
                    if (i19 % 2 == 0) {
                        RightPreset rightPreset = this.f$0;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                        long j4 = j3;
                        int i20 = i;
                        int i21 = i2;
                        int iIntValue = ((Integer) obj3).intValue();
                        Object[] objArr = {rightPreset, quirksExternalSyntheticBackport05, Long.valueOf(j4), Integer.valueOf(i20), Integer.valueOf(i21), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                        throw null;
                    }
                    RightPreset rightPreset2 = this.f$0;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport04;
                    long j5 = j3;
                    int i22 = i;
                    int i23 = i2;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    Object[] objArr2 = {rightPreset2, quirksExternalSyntheticBackport06, Long.valueOf(j5), Integer.valueOf(i22), Integer.valueOf(i23), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue2)};
                    Unit unit = (Unit) RightPreset.onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -463514377, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 463514378, objArr2, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
                    int i24 = onNavigationEvent + 105;
                    onExtraCallbackWithResult = i24 % 128;
                    int i25 = i24 % 2;
                    return unit;
                }
            });
            int i18 = onExtraCallback + 67;
            IAuthTabCallback = i18 % 128;
            if (i18 % 2 != 0) {
                int i19 = 3 / 5;
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = onExtraCallback + 51;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 83;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof RightPreset)) {
            return false;
        }
        RightPreset rightPreset = (RightPreset) obj;
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, rightPreset.onExtraCallbackWithResult)) {
            int i7 = IAuthTabCallback;
            int i8 = i7 + 93;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            if (this.onWarmupCompleted == rightPreset.onWarmupCompleted) {
                int i10 = i7 + 115;
                onExtraCallback = i10 % 128;
                return i10 % 2 != 0;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.onExtraCallbackWithResult.hashCode() * 31) + System.identityHashCode(this.onWarmupCompleted);
        int i4 = onExtraCallback + 39;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(RightPreset rightPreset, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {rightPreset, quirksExternalSyntheticBackport0, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -463514377, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 463514378, objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    public static /* synthetic */ Unit onWarmupCompleted(Object obj, Function0 function0, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, setViewableMRC50Requests.onWarmupCompleted onwarmupcompleted, setViewableMRC50Requests.onNavigationEvent onnavigationevent, long j, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {obj, function0, str, quirksExternalSyntheticBackport0, onwarmupcompleted, onnavigationevent, Long.valueOf(j), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 684506442, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -684506440, objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }

    private final createCameraCaptureCallback IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {this, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (createCameraCaptureCallback) onExtraCallback(DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), -560830512, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent(), 560830512, objArr, DateFormatTextWatcher$.ExternalSyntheticLambda0.onNavigationEvent());
    }
}
