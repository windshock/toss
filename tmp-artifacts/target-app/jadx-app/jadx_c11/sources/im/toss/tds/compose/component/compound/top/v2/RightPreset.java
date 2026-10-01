package im.toss.tds.compose.component.compound.top.v2;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.payment.ui.autopay.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda1;
import o.AppLovinVastMediaVieweExternalSyntheticLambda0;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda0;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraProviderInitRetryPolicy1;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.FocusMeteringControlExternalSyntheticLambda3;
import o.ForwardingCameraControl;
import o.HighSpeedResolverExternalSyntheticLambda1;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.component5;
import o.deprecated_eventListenerFactory;
import o.getAwbState;
import o.getBacktraceNote;
import o.getPrivacyDestinationUri;
import o.handleNativeAdClick;
import o.hasProvider;
import o.resolveQuirkNames;
import o.setAdvertiser;
import o.setBody;
import o.setByteOrder;
import o.setCallToAction;
import o.setClickDestinationBackupUri;
import o.setIconUri;
import o.setMainImageAspectRatio;
import o.setMainImageUri;
import o.setPrivacyIconUri;
import o.setUpNativeAdViewComponents;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RightSlotMarker
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RightPreset {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private final boolean IAuthTabCallback;

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i3);
        int i9 = ~i3;
        int i10 = i8 | (~(i9 | i5 | i));
        int i11 = ~(i7 | i9);
        int i12 = (~i) | i9;
        int i13 = i11 | (~i12);
        int i14 = ~(i12 | i5);
        int i15 = i5 + i3 + i6 + ((-1261570137) * i2) + (2040842291 * i4);
        int i16 = i15 * i15;
        int i17 = ((i5 * (-750812765)) - 1471086592) + ((-750812765) * i3) + (1493335646 * i10) + ((-1308296004) * i13) + ((-1493335646) * i14) + (742522880 * i6) + ((-1928462336) * i2) + (1629880320 * i4) + (2096168960 * i16);
        int i18 = ((i5 * 1408203179) - 1033136887) + (i3 * 1408203179) + (i10 * (-338)) + (i13 * (-676)) + (i14 * 338) + (i6 * 1408202841) + (i2 * (-1046847217)) + (i4 * (-121732677)) + (i16 * 1741225984);
        return i17 + ((i18 * i18) * 838795264) != 1 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RightPreset rightPreset, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, Function0 function02, setClickDestinationBackupUri setclickdestinationbackupuri, setCallToAction.IAuthTabCallback iAuthTabCallback, setCallToAction.onNavigationEvent onnavigationevent, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z, boolean z2, getBacktraceNote getbacktracenote, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 99;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(rightPreset, quirksExternalSyntheticBackport0, function0, function02, setclickdestinationbackupuri, iAuthTabCallback, onnavigationevent, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, z, z2, getbacktracenote, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onExtraCallback + 41;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 26 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(hasProvider hasprovider, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(hasprovider, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 19;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    private static final Unit onNavigationEvent(RightPreset rightPreset, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, Function0 function02, setClickDestinationBackupUri setclickdestinationbackupuri, setCallToAction.IAuthTabCallback iAuthTabCallback, setCallToAction.onNavigationEvent onnavigationevent, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z, boolean z2, getBacktraceNote getbacktracenote, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallbackWithResult + 91;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        onExtraCallbackWithResult(R.onWarmupCompleted(), R.onWarmupCompleted(), new Object[]{rightPreset, quirksExternalSyntheticBackport0, function0, function02, setclickdestinationbackupuri, iAuthTabCallback, onnavigationevent, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, Boolean.valueOf(z), Boolean.valueOf(z2), getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i2)), Integer.valueOf(i3)}, -1547475605, R.onWarmupCompleted(), 1547475606, R.onWarmupCompleted());
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallbackWithResult + 103;
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 34 / 0;
        }
        return unit;
    }

    public RightPreset(boolean z) {
        this.IAuthTabCallback = z;
    }

    public final void onExtraCallback(@NotNull Object obj, @NotNull deprecated_eventListenerFactory deprecated_eventlistenerfactory, @NotNull handleNativeAdClick.onExtraCallback onextracallback, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, float f, long j2, @Nullable getBacktraceNote<? super setPrivacyIconUri, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, float f2, @Nullable Function0<Unit> function0, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3, int i4) {
        int i5;
        float f3;
        int i6 = 2 % 2;
        int i7 = onExtraCallbackWithResult + 93;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(deprecated_eventlistenerfactory, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i4 & 8) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        long jOnTransact = (i4 & 16) != 0 ? setByteOrder.Companion.onTransact() : j;
        if ((i4 & 32) != 0) {
            int i9 = onExtraCallbackWithResult + 7;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            i5 = 1;
        } else {
            i5 = i;
        }
        if ((i4 & 64) != 0) {
            int i11 = onExtraCallbackWithResult + 79;
            onExtraCallback = i11 % 128;
            f3 = i11 % 2 == 0 ? 2.0f : 1.0f;
        } else {
            f3 = f;
        }
        long jOnExtraCallbackWithResult = (i4 & 128) != 0 ? setMainImageAspectRatio.IAuthTabCallback.onExtraCallbackWithResult(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, ((i2 >> 6) & 14) | 48) : j2;
        Object obj2 = null;
        getBacktraceNote<? super setPrivacyIconUri, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2 = (i4 & 256) != 0 ? null : getbacktracenote;
        float fIAuthTabCallback = (i4 & 512) != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f2;
        Function0<Unit> function02 = (i4 & 1024) != 0 ? null : function0;
        String str2 = (i4 & 2048) != 0 ? null : str;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i12 = onExtraCallbackWithResult + 119;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(395437447, i2, i3, "im.toss.tds.compose.component.compound.top.v2.RightPreset.Asset (RightPreset.kt:51)");
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ((QuirksExternalSyntheticBackport0) onExtraCallbackWithResult(R.onWarmupCompleted(), R.onWarmupCompleted(), new Object[]{this, QuirksExternalSyntheticBackport0.Companion, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i3 >> 3) & 112) | 6)}, -336838009, R.onWarmupCompleted(), 336838009, R.onWarmupCompleted())).onExtraCallback(quirksExternalSyntheticBackport02);
        int i14 = i2 << 3;
        int i15 = i3 << 3;
        setMainImageUri.IAuthTabCallback(obj, deprecated_eventlistenerfactory, quirksExternalSyntheticBackport0OnExtraCallback, onextracallback, jOnTransact, i5, f3, null, jOnExtraCallbackWithResult, getbacktracenote2, fIAuthTabCallback, function02, str2, cameraCaptureResultEmptyCameraCaptureResult, (i2 & 126) | (i14 & 7168) | (i2 & 57344) | (i2 & 458752) | (i2 & 3670016) | (i14 & 234881024) | (i14 & 1879048192), ((i2 >> 27) & 14) | (i15 & 112) | (i15 & 896), 128);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i16 = onExtraCallback + 73;
            onExtraCallbackWithResult = i16 % 128;
            int i17 = i16 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i17 == 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, @Nullable getBacktraceNote<? super setUpNativeAdViewComponents, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, long j, float f, @Nullable Function0<Unit> function0, @NotNull getBacktraceNote<? super AppLovinNativeAdImplExternalSyntheticLambda1, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        getBacktraceNote<? super setUpNativeAdViewComponents, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3;
        Function0<Unit> function02;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 55;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getbacktracenote2, "");
            quirksExternalSyntheticBackport02 = (i2 & 1) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        } else {
            Intrinsics.checkNotNullParameter(getbacktracenote2, "");
            if ((i2 & 1) != 0) {
            }
        }
        getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallbackDefault = (i2 & 2) != 0 ? getPrivacyDestinationUri.onExtraCallbackWithResult.C0021onExtraCallbackWithResult.Companion.IAuthTabCallbackDefault() : onextracallbackwithresult;
        if ((i2 & 4) != 0) {
            int i5 = onExtraCallbackWithResult + 23;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            getbacktracenote3 = null;
        } else {
            getbacktracenote3 = getbacktracenote;
        }
        long jOnTransact = (i2 & 8) != 0 ? setByteOrder.Companion.onTransact() : j;
        float fIAuthTabCallback = (i2 & 16) != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f;
        if ((i2 & 32) != 0) {
            int i7 = onExtraCallback;
            int i8 = i7 + 115;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 47;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            function02 = null;
        } else {
            function02 = function0;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i12 = onExtraCallback + 63;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1631998214, i, -1, "im.toss.tds.compose.component.compound.top.v2.RightPreset.Asset (RightPreset.kt:81)");
        }
        setIconUri.IAuthTabCallback(onextracallbackwithresultIAuthTabCallbackDefault, ((QuirksExternalSyntheticBackport0) onExtraCallbackWithResult(R.onWarmupCompleted(), R.onWarmupCompleted(), new Object[]{this, QuirksExternalSyntheticBackport0.Companion, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i >> 18) & 112) | 6)}, -336838009, R.onWarmupCompleted(), 336838009, R.onWarmupCompleted())).onExtraCallback(quirksExternalSyntheticBackport02), getbacktracenote3, jOnTransact, fIAuthTabCallback, function02, (String) null, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, ((i >> 3) & 14) | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | ((i << 3) & 29360128), 64);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void onNavigationEvent(@NotNull final hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable setCallToAction.onWarmupCompleted onwarmupcompleted, @Nullable setCallToAction.onExtraCallback onextracallback, @Nullable setCallToAction.IAuthTabCallback iAuthTabCallback, @Nullable setCallToAction.onNavigationEvent onnavigationevent, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z, boolean z2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        Function0<Unit> function03;
        setCallToAction.onExtraCallback onextracallbackOnWarmupCompleted;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        boolean z3;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        if ((i3 & 2) != 0) {
            int i5 = onExtraCallback + 17;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        if ((i3 & 4) != 0) {
            int i7 = onExtraCallbackWithResult + 85;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            function03 = null;
        } else {
            function03 = function0;
        }
        Function0<Unit> function04 = (i3 & 8) == 0 ? function02 : null;
        setCallToAction.onWarmupCompleted onwarmupcompletedIAuthTabCallback = (i3 & 16) != 0 ? ((setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(setAdvertiser.onExtraCallback())).IAuthTabCallback() : onwarmupcompleted;
        if ((i3 & 32) != 0) {
            onextracallbackOnWarmupCompleted = ((setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(setAdvertiser.onExtraCallback())).onWarmupCompleted();
            int i9 = onExtraCallback + 39;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
        } else {
            onextracallbackOnWarmupCompleted = onextracallback;
        }
        setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallback = (i3 & 64) != 0 ? ((setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(setAdvertiser.onExtraCallback())).onExtraCallback() : iAuthTabCallback;
        setCallToAction.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = (i3 & 128) != 0 ? ((setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(setAdvertiser.onExtraCallback())).onExtraCallbackWithResult() : onnavigationevent;
        if ((i3 & 256) != 0) {
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                int i11 = onExtraCallbackWithResult + 17;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
            int i13 = onExtraCallback + 13;
            onExtraCallbackWithResult = i13 % 128;
            int i14 = i13 % 2;
        } else {
            camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
        }
        if ((i3 & 512) != 0) {
            int i15 = onExtraCallback + 37;
            onExtraCallbackWithResult = i15 % 128;
            z3 = i15 % 2 == 0;
        } else {
            z3 = z;
        }
        boolean z4 = (i3 & 1024) != 0 ? false : z2;
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        } else {
            int i16 = onExtraCallbackWithResult + 11;
            camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
            onExtraCallback = i16 % 128;
            int i17 = i16 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1846372971, i, i2, "im.toss.tds.compose.component.compound.top.v2.RightPreset.Button (RightPreset.kt:109)");
            int i18 = onExtraCallback + 107;
            onExtraCallbackWithResult = i18 % 128;
            int i19 = i18 % 2;
        }
        int i20 = i >> 12;
        int i21 = i >> 3;
        int i22 = i >> 6;
        onExtraCallbackWithResult(R.onWarmupCompleted(), R.onWarmupCompleted(), new Object[]{this, quirksExternalSyntheticBackport02, function03, function04, setBody.onExtraCallback.onWarmupCompleted(onwarmupcompletedIAuthTabCallback, onextracallbackOnWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, (i20 & 112) | (i20 & 14) | 384, 0), iAuthTabCallbackOnExtraCallback, onnavigationeventOnExtraCallbackWithResult, camera2CapturePipelineTorchTaskExternalSyntheticLambda23, Boolean.valueOf(z3), Boolean.valueOf(z4), ForwardingCameraControl.onExtraCallback(-659658629, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.v2.RightPreset$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                int i23 = 2 % 2;
                int i24 = onNavigationEvent + 1;
                onExtraCallbackWithResult = i24 % 128;
                int i25 = i24 % 2;
                Unit unitOnExtraCallbackWithResult = RightPreset.onExtraCallbackWithResult(hasprovider, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i26 = onExtraCallbackWithResult + 3;
                onNavigationEvent = i26 % 128;
                int i27 = i26 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i21 & 112) | (i21 & 14) | 805306368 | (i21 & 896) | (57344 & i22) | (458752 & i22) | (3670016 & i22) | (i22 & 29360128) | ((i2 << 24) & 234881024)), Integer.valueOf((i2 >> 3) & 14), 0}, -1547475605, R.onWarmupCompleted(), 1547475606, R.onWarmupCompleted());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static final Unit IAuthTabCallback(hasProvider hasprovider, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            int i3 = onExtraCallback + 1;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallbackWithResult + 21;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-659658629, i, -1, "im.toss.tds.compose.component.compound.top.v2.RightPreset.Button.<anonymous> (RightPreset.kt:120)");
                    int i6 = 30 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-659658629, i, -1, "im.toss.tds.compose.component.compound.top.v2.RightPreset.Button.<anonymous> (RightPreset.kt:120)");
                }
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasprovider, null, null, 0L, 0L, 0L, null, null, null, 0.0f, null, null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 262142);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallback + 103;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i8 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable setCallToAction.onWarmupCompleted onwarmupcompleted, @Nullable setCallToAction.onExtraCallback onextracallback, @Nullable setCallToAction.IAuthTabCallback iAuthTabCallback, @Nullable setCallToAction.onNavigationEvent onnavigationevent, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z, boolean z2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 19;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            quirksExternalSyntheticBackport02 = (i3 & 4) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            if ((i3 & 2) != 0) {
            }
        }
        Function0<Unit> function03 = (i3 & 4) != 0 ? null : function0;
        Function0<Unit> function04 = (i3 & 8) != 0 ? null : function02;
        setCallToAction.onWarmupCompleted onwarmupcompletedIAuthTabCallback = (i3 & 16) != 0 ? ((setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(setAdvertiser.onExtraCallback())).IAuthTabCallback() : onwarmupcompleted;
        setCallToAction.onExtraCallback onextracallbackOnWarmupCompleted = (i3 & 32) != 0 ? ((setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(setAdvertiser.onExtraCallback())).onWarmupCompleted() : onextracallback;
        setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallback = (i3 & 64) != 0 ? ((setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(setAdvertiser.onExtraCallback())).onExtraCallback() : iAuthTabCallback;
        setCallToAction.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = (i3 & 128) != 0 ? ((setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(setAdvertiser.onExtraCallback())).onExtraCallbackWithResult() : onnavigationevent;
        if ((i3 & 256) != 0) {
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
        } else {
            camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
        }
        boolean z3 = (i3 & 512) != 0 ? true : z;
        boolean z4 = (i3 & 1024) != 0 ? false : z2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1194097795, i, i2, "im.toss.tds.compose.component.compound.top.v2.RightPreset.Button (RightPreset.kt:138)");
        }
        onNavigationEvent(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), quirksExternalSyntheticBackport02, function03, function04, onwarmupcompletedIAuthTabCallback, onextracallbackOnWarmupCompleted, iAuthTabCallbackOnExtraCallback, onnavigationeventOnExtraCallbackWithResult, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, z3, z4, cameraCaptureResultEmptyCameraCaptureResult, i & 2147483632, i2 & 126, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onExtraCallback + 73;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bc A[PHI: r9
      0x01bc: PHI (r9v3 int) = (r9v2 int), (r9v26 int), (r9v27 int) binds: [B:98:0x01ab, B:105:0x01ba, B:104:0x01b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        RightPreset rightPreset;
        int i;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        Function0 function0;
        int i2;
        Function0 function02;
        int i3;
        setClickDestinationBackupUri setclickdestinationbackupuriOnWarmupCompleted;
        int i4;
        int i5;
        boolean z;
        setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallback;
        RightPreset rightPreset2;
        int i6;
        int i7;
        getBacktraceNote getbacktracenote;
        RightPreset rightPreset3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        int i8;
        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
        final boolean z2;
        final setCallToAction.onNavigationEvent onnavigationevent;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final Function0 function03;
        final Function0 function04;
        final setClickDestinationBackupUri setclickdestinationbackupuri;
        final boolean z3;
        final setCallToAction.IAuthTabCallback iAuthTabCallback;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        setCallToAction.onNavigationEvent onnavigationeventOnExtraCallbackWithResult;
        Function0 function05;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        setClickDestinationBackupUri setclickdestinationbackupuri2;
        setCallToAction.IAuthTabCallback iAuthTabCallback2;
        boolean z4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i9;
        int i10;
        int i11;
        RightPreset rightPreset4 = (RightPreset) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = (QuirksExternalSyntheticBackport0) objArr[1];
        Function0 function06 = (Function0) objArr[2];
        Function0 function07 = (Function0) objArr[3];
        setClickDestinationBackupUri setclickdestinationbackupuri3 = (setClickDestinationBackupUri) objArr[4];
        setCallToAction.IAuthTabCallback iAuthTabCallback3 = (setCallToAction.IAuthTabCallback) objArr[5];
        setCallToAction.onNavigationEvent onnavigationevent2 = (setCallToAction.onNavigationEvent) objArr[6];
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objArr[7];
        boolean zBooleanValue = ((Boolean) objArr[8]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[9]).booleanValue();
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[10];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        int iIntValue = ((Number) objArr[12]).intValue();
        final int iIntValue2 = ((Number) objArr[13]).intValue();
        int iIntValue3 = ((Number) objArr[14]).intValue();
        int i12 = 2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(18942134);
        int i13 = iIntValue3 & 1;
        if (i13 != 0) {
            int i14 = onExtraCallbackWithResult + 95;
            rightPreset = rightPreset4;
            onExtraCallback = i14 % 128;
            int i15 = i14 % 2;
            i = iIntValue | 6;
        } else {
            rightPreset = rightPreset4;
            if ((iIntValue & 6) == 0) {
                int i16 = onExtraCallback + 9;
                onExtraCallbackWithResult = i16 % 128;
                if (i16 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport05);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport05) ? 4 : 2) | iIntValue;
            } else {
                i = iIntValue;
            }
        }
        int i17 = iIntValue3 & 2;
        if (i17 != 0) {
            int i18 = onExtraCallback + 109;
            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport05;
            onExtraCallbackWithResult = i18 % 128;
            i = i18 % 2 != 0 ? i | 93 : i | 48;
        } else {
            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport05;
            if ((iIntValue & 48) == 0) {
                i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function06) ? 32 : 16;
            }
        }
        int i19 = iIntValue3 & 4;
        if (i19 != 0) {
            int i20 = onExtraCallback + 99;
            function0 = function06;
            onExtraCallbackWithResult = i20 % 128;
            i = i20 % 2 != 0 ? i | 1452 : i | 384;
        } else {
            function0 = function06;
            if ((iIntValue & 384) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function07)) {
                    int i21 = onExtraCallbackWithResult + 115;
                    onExtraCallback = i21 % 128;
                    int i22 = i21 % 2;
                    i2 = 256;
                } else {
                    i2 = 128;
                }
                i |= i2;
            }
        }
        if ((iIntValue & 3072) == 0) {
            i |= ((iIntValue3 & 8) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setclickdestinationbackupuri3)) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= ((iIntValue3 & 16) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallback3)) ? 16384 : 8192;
        }
        if ((196608 & iIntValue) == 0) {
            if ((iIntValue3 & 32) != 0) {
                i11 = 65536;
                i |= i11;
            } else {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onnavigationevent2 == null ? -1 : onnavigationevent2.ordinal())) {
                    i11 = 131072;
                }
                i |= i11;
            }
        }
        int i23 = iIntValue3 & 64;
        if (i23 == 0) {
            if ((1572864 & iIntValue) == 0) {
                int i24 = onExtraCallbackWithResult + 81;
                function02 = function07;
                onExtraCallback = i24 % 128;
                int i25 = i24 % 2;
                i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda22) ? 1048576 : 524288;
            }
            i3 = iIntValue3 & 128;
            if (i3 == 0) {
                int i26 = onExtraCallbackWithResult + 21;
                setclickdestinationbackupuriOnWarmupCompleted = setclickdestinationbackupuri3;
                onExtraCallback = i26 % 128;
                if (i26 % 2 == 0) {
                    i |= 12582912;
                    int i27 = 1 / 0;
                } else {
                    i4 = 12582912;
                    i |= i4;
                }
            } else {
                setclickdestinationbackupuriOnWarmupCompleted = setclickdestinationbackupuri3;
                if ((12582912 & iIntValue) == 0) {
                    i4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ? 8388608 : 4194304;
                    i |= i4;
                }
            }
            i5 = iIntValue3 & 256;
            int i28 = 100663296;
            if (i5 != 0) {
                i |= i28;
            } else if ((100663296 & iIntValue) == 0) {
                i28 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue2) ? 67108864 : 33554432;
                i |= i28;
            }
            if ((805306368 & iIntValue) != 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2)) {
                    int i29 = onExtraCallback + 57;
                    z = zBooleanValue2;
                    onExtraCallbackWithResult = i29 % 128;
                    int i30 = i29 % 2;
                    i10 = 536870912;
                } else {
                    z = zBooleanValue2;
                    i10 = 268435456;
                }
                i |= i10;
            } else {
                z = zBooleanValue2;
            }
            if ((iIntValue2 & 6) != 0) {
                rightPreset2 = rightPreset;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(rightPreset2)) {
                    int i31 = onExtraCallbackWithResult + 39;
                    iAuthTabCallbackOnExtraCallback = iAuthTabCallback3;
                    onExtraCallback = i31 % 128;
                    i9 = i31 % 2 == 0 ? 5 : 4;
                } else {
                    iAuthTabCallbackOnExtraCallback = iAuthTabCallback3;
                    i9 = 2;
                }
                i6 = iIntValue2 | i9;
            } else {
                iAuthTabCallbackOnExtraCallback = iAuthTabCallback3;
                rightPreset2 = rightPreset;
                i6 = iIntValue2;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i) == 306783378 || (i6 & 3) != 2, i & 1)) {
                i7 = iIntValue3;
                getbacktracenote = getbacktracenote2;
                rightPreset3 = rightPreset2;
                cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i8 = iIntValue;
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
                z2 = zBooleanValue;
                onnavigationevent = onnavigationevent2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                function03 = function0;
                function04 = function02;
                setclickdestinationbackupuri = setclickdestinationbackupuriOnWarmupCompleted;
                z3 = z;
                iAuthTabCallback = iAuthTabCallbackOnExtraCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((iIntValue & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = i13 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                    Function0 function08 = i17 != 0 ? null : function0;
                    Function0 function09 = i19 != 0 ? null : function02;
                    if ((iIntValue3 & 8) != 0) {
                        i &= -7169;
                        setclickdestinationbackupuriOnWarmupCompleted = setBody.onExtraCallback.onWarmupCompleted(null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 3);
                    }
                    if ((iIntValue3 & 16) != 0) {
                        i &= -57345;
                        iAuthTabCallbackOnExtraCallback = ((setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(setAdvertiser.onExtraCallback())).onExtraCallback();
                    }
                    if ((iIntValue3 & 32) != 0) {
                        onnavigationeventOnExtraCallbackWithResult = ((setCallToAction.onExtraCallbackWithResult) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(setAdvertiser.onExtraCallback())).onExtraCallbackWithResult();
                        i &= -458753;
                    } else {
                        onnavigationeventOnExtraCallbackWithResult = onnavigationevent2;
                    }
                    if (i23 != 0) {
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        Object obj2 = objOnMinimized;
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            Object objOnWarmupCompleted = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnWarmupCompleted);
                            obj2 = objOnWarmupCompleted;
                        }
                        camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) obj2;
                    }
                    if (i3 != 0) {
                        zBooleanValue = true;
                    }
                    if (i5 != 0) {
                        function05 = function09;
                        function03 = function08;
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport06;
                        setclickdestinationbackupuri2 = setclickdestinationbackupuriOnWarmupCompleted;
                        iAuthTabCallback2 = iAuthTabCallbackOnExtraCallback;
                        z4 = false;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            i7 = iIntValue3;
                            i8 = iIntValue;
                        } else {
                            i8 = iIntValue;
                            i7 = iIntValue3;
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(18942134, i, i6, "im.toss.tds.compose.component.compound.top.v2.RightPreset.Button (RightPreset.kt:166)");
                        }
                        if (rightPreset2.IAuthTabCallback) {
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport07 = quirksExternalSyntheticBackport03;
                            getbacktracenote = getbacktracenote2;
                            RightPreset rightPreset5 = rightPreset2;
                            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1665641351);
                            QuirkSettingsLoader quirkSettingsLoaderIAuthTabCallbackStub = QuirkSettingsLoader.Companion.IAuthTabCallbackStub();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport08 = (QuirksExternalSyntheticBackport0) onExtraCallbackWithResult(R.onWarmupCompleted(), R.onWarmupCompleted(), new Object[]{rightPreset5, quirksExternalSyntheticBackport07, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i & 14) | ((i6 << 3) & 112))}, -336838009, R.onWarmupCompleted(), 336838009, R.onWarmupCompleted());
                            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderIAuthTabCallbackStub, false);
                            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport08);
                            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport07;
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
                            rightPreset3 = rightPreset5;
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                            setAdvertiser.onExtraCallbackWithResult(QuirksExternalSyntheticBackport0.Companion, iAuthTabCallback2, setclickdestinationbackupuri2, onnavigationeventOnExtraCallbackWithResult, function05, function03, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, zBooleanValue, z4, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, ((i >> 9) & 112) | 6 | ((i >> 3) & 896) | ((i >> 6) & 7168) | ((i << 6) & 57344) | ((i << 12) & 458752) | (3670016 & i) | (29360128 & i) | (234881024 & i) | (i & 1879048192), 0);
                            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1665022064);
                            QuirkSettingsLoader quirkSettingsLoaderIAuthTabCallbackStub2 = QuirkSettingsLoader.Companion.IAuthTabCallbackStub();
                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                            component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderIAuthTabCallbackStub2, false);
                            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport09 = quirksExternalSyntheticBackport03;
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                            rightPreset3 = rightPreset2;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
                            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                            getbacktracenote = getbacktracenote2;
                            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                                getAwbState.onExtraCallback();
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                            }
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                            setAdvertiser.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), iAuthTabCallback2, setclickdestinationbackupuri2, onnavigationeventOnExtraCallbackWithResult, function05, function03, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, zBooleanValue, z4, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i >> 9) & 112) | 6 | ((i >> 3) & 896) | ((i >> 6) & 7168) | ((i << 6) & 57344) | ((i << 12) & 458752) | (3670016 & i) | (29360128 & i) | (234881024 & i) | (i & 1879048192), 0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport09;
                        }
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i32 = onExtraCallbackWithResult + 9;
                            onExtraCallback = i32 % 128;
                            if (i32 % 2 == 0) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                                int i33 = 36 / 0;
                            } else {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                        }
                        z3 = z4;
                        function04 = function05;
                        iAuthTabCallback = iAuthTabCallback2;
                        onnavigationevent = onnavigationeventOnExtraCallbackWithResult;
                        camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
                        z2 = zBooleanValue;
                        setclickdestinationbackupuri = setclickdestinationbackupuri2;
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                    } else {
                        function05 = function09;
                        function03 = function08;
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport06;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((iIntValue3 & 8) != 0) {
                        i &= -7169;
                    }
                    if ((iIntValue3 & 16) != 0) {
                        i &= -57345;
                    }
                    if ((iIntValue3 & 32) != 0) {
                        i &= -458753;
                    }
                    onnavigationeventOnExtraCallbackWithResult = onnavigationevent2;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                    function03 = function0;
                    function05 = function02;
                }
                setclickdestinationbackupuri2 = setclickdestinationbackupuriOnWarmupCompleted;
                z4 = z;
                iAuthTabCallback2 = iAuthTabCallbackOnExtraCallback;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                if (rightPreset2.IAuthTabCallback) {
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                z3 = z4;
                function04 = function05;
                iAuthTabCallback = iAuthTabCallback2;
                onnavigationevent = onnavigationeventOnExtraCallbackWithResult;
                camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
                z2 = zBooleanValue;
                setclickdestinationbackupuri = setclickdestinationbackupuri2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                return null;
            }
            final RightPreset rightPreset6 = rightPreset3;
            final getBacktraceNote getbacktracenote3 = getbacktracenote;
            final int i34 = i8;
            final int i35 = i7;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.top.v2.RightPreset$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj3, Object obj4) {
                    int i36 = 2 % 2;
                    int i37 = IAuthTabCallback + 21;
                    onExtraCallbackWithResult = i37 % 128;
                    int i38 = i37 % 2;
                    Unit unitOnExtraCallbackWithResult = RightPreset.onExtraCallbackWithResult(this.f$0, quirksExternalSyntheticBackport02, function03, function04, setclickdestinationbackupuri, iAuthTabCallback, onnavigationevent, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, z2, z3, getbacktracenote3, i34, iIntValue2, i35, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i39 = IAuthTabCallback + 9;
                    onExtraCallbackWithResult = i39 % 128;
                    int i40 = i39 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            });
            return null;
        }
        i |= 1572864;
        function02 = function07;
        i3 = iIntValue3 & 128;
        if (i3 == 0) {
        }
        i5 = iIntValue3 & 256;
        int i282 = 100663296;
        if (i5 != 0) {
        }
        if ((805306368 & iIntValue) != 0) {
        }
        if ((iIntValue2 & 6) != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i) == 306783378 || (i6 & 3) != 2, i & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            CameraConfigExternalSyntheticLambda0.asBinder();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-298873381, iIntValue, -1, "im.toss.tds.compose.component.compound.top.v2.RightPreset.titleGap (RightPreset.kt:206)");
            int i3 = onExtraCallbackWithResult + 75;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onExtraCallback + 101;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r7 instanceof im.toss.tds.compose.component.compound.top.v2.RightPreset) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 7;
        im.toss.tds.compose.component.compound.top.v2.RightPreset.onExtraCallbackWithResult = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r6.IAuthTabCallback != ((im.toss.tds.compose.component.compound.top.v2.RightPreset) r7).IAuthTabCallback) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        r3 = r3 + 23;
        im.toss.tds.compose.component.compound.top.v2.RightPreset.onExtraCallback = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 105;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        if (i3 % 2 != 0) {
            int i5 = 13 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.IAuthTabCallback);
        int i4 = onExtraCallbackWithResult + 117;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final void onExtraCallbackWithResult(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function02, @Nullable setClickDestinationBackupUri setclickdestinationbackupuri, @Nullable setCallToAction.IAuthTabCallback iAuthTabCallback, @Nullable setCallToAction.onNavigationEvent onnavigationevent, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z, boolean z2, @NotNull getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        Object[] objArr = {this, quirksExternalSyntheticBackport0, function0, function02, setclickdestinationbackupuri, iAuthTabCallback, onnavigationevent, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, Boolean.valueOf(z), Boolean.valueOf(z2), getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        onExtraCallbackWithResult(R.onWarmupCompleted(), R.onWarmupCompleted(), objArr, -1547475605, R.onWarmupCompleted(), 1547475606, R.onWarmupCompleted());
    }

    public final QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {this, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (QuirksExternalSyntheticBackport0) onExtraCallbackWithResult(R.onWarmupCompleted(), R.onWarmupCompleted(), objArr, -336838009, R.onWarmupCompleted(), 336838009, R.onWarmupCompleted());
    }
}
