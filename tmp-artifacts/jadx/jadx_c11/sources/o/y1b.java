package o;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.getPrivacyDestinationUri;
import o.handleNativeAdClick;
import o.toPreviewOnlyRange;
import o.y1b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class y1b {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final y1b onNavigationEvent = new y1b();
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallback + 121;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getBacktraceNote getbacktracenote, CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getbacktracenote, cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 92 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private y1b() {
    }

    public final void onExtraCallbackWithResult(@NotNull Object obj, @NotNull deprecated_eventListenerFactory deprecated_eventlistenerfactory, @NotNull handleNativeAdClick.onExtraCallback onextracallback, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, float f, long j2, @Nullable getBacktraceNote<? super setPrivacyIconUri, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, float f2, @Nullable Function0<Unit> function0, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3, int i4) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i5;
        float fIAuthTabCallback;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(deprecated_eventlistenerfactory, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        if ((i4 & 8) != 0) {
            int i7 = onExtraCallbackWithResult + 117;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                throw null;
            }
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        long jOnTransact = (i4 & 16) != 0 ? setByteOrder.Companion.onTransact() : j;
        if ((i4 & 32) != 0) {
            int i8 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            i5 = 1;
        } else {
            i5 = i;
        }
        float f3 = (i4 & 64) != 0 ? 1.0f : f;
        long jOnExtraCallbackWithResult = (i4 & 128) != 0 ? setMainImageAspectRatio.IAuthTabCallback.onExtraCallbackWithResult(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, ((i2 >> 6) & 14) | 48) : j2;
        getBacktraceNote<? super setPrivacyIconUri, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2 = (i4 & 256) != 0 ? null : getbacktracenote;
        if ((i4 & 512) != 0) {
            int i10 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        } else {
            fIAuthTabCallback = f2;
        }
        Function0<Unit> function02 = (i4 & 1024) != 0 ? null : function0;
        String str2 = (i4 & 2048) != 0 ? null : str;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i12 = IAuthTabCallback + 39;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2019486905, i2, i3, "im.toss.tds.compose.component.compound.top.v2.UpperPreset.Asset (UpperPreset.kt:46)");
        }
        int i14 = i2 << 3;
        int i15 = i3 << 3;
        setMainImageUri.IAuthTabCallback(obj, deprecated_eventlistenerfactory, quirksExternalSyntheticBackport02, onextracallback, jOnTransact, i5, f3, null, jOnExtraCallbackWithResult, getbacktracenote2, fIAuthTabCallback, function02, str2, cameraCaptureResultEmptyCameraCaptureResult, (i14 & 7168) | (i2 & 126) | ((i2 >> 3) & 896) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (234881024 & i14) | (i14 & 1879048192), ((i2 >> 27) & 14) | (i15 & 112) | (i15 & 896), 128);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i16 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i16 % 128;
            if (i16 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            } else {
                CameraConfigExternalSyntheticLambda0.onTransact();
                throw null;
            }
        }
    }

    public final void onExtraCallback(@NotNull final getBacktraceNote<? super CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 65;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        Object obj = null;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i5 = IAuthTabCallback + 97;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1982922855, i, -1, "im.toss.tds.compose.component.compound.top.v2.UpperPreset.Badges (UpperPreset.kt:93)");
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1982922855, i, -1, "im.toss.tds.compose.component.compound.top.v2.UpperPreset.Badges (UpperPreset.kt:93)");
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
        FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
        ZslControlImplExternalSyntheticLambda2.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, focusMeteringControlExternalSyntheticLambda12.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f)), focusMeteringControlExternalSyntheticLambda12.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f)), (QuirkSettingsLoader.onWarmupCompleted) null, 0, 0, ForwardingCameraControl.onExtraCallback(1583057164, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.top.v2.UpperPreset$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                int i6 = 2 % 2;
                int i7 = onWarmupCompleted + 75;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                Unit unitIAuthTabCallback = y1b.IAuthTabCallback(getbacktracenote, (CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                int i9 = onWarmupCompleted + 117;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                throw null;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 1573302, 56);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static final Unit onWarmupCompleted(getBacktraceNote getbacktracenote, CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, "");
        boolean z = true;
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0) ^ true ? 2 : 4;
        }
        if ((i & 19) == 18) {
            int i3 = onExtraCallbackWithResult + 107;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallbackWithResult + 123;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1583057164, i, -1, "im.toss.tds.compose.component.compound.top.v2.UpperPreset.Badges.<anonymous> (UpperPreset.kt:99)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1583057164, i, -1, "im.toss.tds.compose.component.compound.top.v2.UpperPreset.Badges.<anonymous> (UpperPreset.kt:99)");
            }
            getbacktracenote.invoke(cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i & 14));
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public final void onWarmupCompleted(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onnavigationevent, @Nullable AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, @Nullable AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted onwarmupcompleted, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onNavigationEvent2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i2 & 4) != 0) {
            int i4 = IAuthTabCallback + 1;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                ((AppLovinNativeAdImplExternalSyntheticLambda2.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback())).onNavigationEvent();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onNavigationEvent2 = ((AppLovinNativeAdImplExternalSyntheticLambda2.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback())).onNavigationEvent();
        } else {
            onNavigationEvent2 = onnavigationevent;
        }
        AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = (i2 & 8) != 0 ? ((AppLovinNativeAdImplExternalSyntheticLambda2.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback())).onWarmupCompleted() : onextracallbackwithresult;
        AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted onwarmupcompletedIAuthTabCallback = (i2 & 16) != 0 ? ((AppLovinNativeAdImplExternalSyntheticLambda2.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback())).IAuthTabCallback() : onwarmupcompleted;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(214375614, i, -1, "im.toss.tds.compose.component.compound.top.v2.UpperPreset.Badge (UpperPreset.kt:111)");
        }
        AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallbackWithResult(hasprovider, quirksExternalSyntheticBackport02, onNavigationEvent2, onextracallbackwithresultOnWarmupCompleted, onwarmupcompletedIAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, 65534 & i, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void onNavigationEvent(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onnavigationevent, @Nullable AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, @Nullable AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted onwarmupcompleted, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onNavigationEvent2;
        AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted onwarmupcompletedIAuthTabCallback;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i2 & 4) != 0) {
            int i4 = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            onNavigationEvent2 = ((AppLovinNativeAdImplExternalSyntheticLambda2.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback())).onNavigationEvent();
        } else {
            onNavigationEvent2 = onnavigationevent;
        }
        AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = (i2 & 8) != 0 ? ((AppLovinNativeAdImplExternalSyntheticLambda2.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback())).onWarmupCompleted() : onextracallbackwithresult;
        if ((i2 & 16) != 0) {
            int i6 = onExtraCallbackWithResult + 101;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            onwarmupcompletedIAuthTabCallback = ((AppLovinNativeAdImplExternalSyntheticLambda2.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback())).IAuthTabCallback();
        } else {
            onwarmupcompletedIAuthTabCallback = onwarmupcompleted;
        }
        Object obj = null;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = IAuthTabCallback + 83;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-534069236, i, -1, "im.toss.tds.compose.component.compound.top.v2.UpperPreset.Badge (UpperPreset.kt:129)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-534069236, i, -1, "im.toss.tds.compose.component.compound.top.v2.UpperPreset.Badge (UpperPreset.kt:129)");
        }
        onWarmupCompleted(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), quirksExternalSyntheticBackport02, onNavigationEvent2, onextracallbackwithresultOnWarmupCompleted, onwarmupcompletedIAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, i & 524272, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = onExtraCallbackWithResult + 23;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i10 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull getPrivacyDestinationUri.onExtraCallbackWithResult onextracallbackwithresult, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getBacktraceNote<? super setUpNativeAdViewComponents, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, long j, @Nullable Function0<Unit> function0, @NotNull getBacktraceNote<? super AppLovinNativeAdImplExternalSyntheticLambda1, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long jOnWarmupCompleted;
        Function0<Unit> function02;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            Intrinsics.checkNotNullParameter(getbacktracenote2, "");
            if ((i2 & 5) != 0) {
                int i5 = onExtraCallbackWithResult + 11;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            } else {
                int i7 = IAuthTabCallback + 73;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            }
        } else {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            Intrinsics.checkNotNullParameter(getbacktracenote2, "");
            if ((i2 & 2) != 0) {
            }
        }
        getBacktraceNote<? super setUpNativeAdViewComponents, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3 = (i2 & 4) != 0 ? null : getbacktracenote;
        if ((i2 & 8) != 0) {
            int i9 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i9 % 128;
            jOnWarmupCompleted = i9 % 2 != 0 ? getVastAd.onExtraCallback.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 68) : getVastAd.onExtraCallback.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 6);
        } else {
            jOnWarmupCompleted = j;
        }
        if ((i2 & 16) != 0) {
            int i10 = onExtraCallbackWithResult + 3;
            int i11 = i10 % 128;
            IAuthTabCallback = i11;
            int i12 = i10 % 2;
            int i13 = i11 + 123;
            onExtraCallbackWithResult = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 3 % 4;
            }
            function02 = null;
        } else {
            function02 = function0;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-270657238, i, -1, "im.toss.tds.compose.component.compound.top.v2.UpperPreset.Asset (UpperPreset.kt:73)");
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null).onExtraCallback(quirksExternalSyntheticBackport02);
        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
        Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
            int i15 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i15 % 128;
            if (i15 % 2 == 0) {
                getAwbState.onExtraCallback();
                int i16 = 6 / 0;
            } else {
                getAwbState.onExtraCallback();
            }
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
        setIconUri.IAuthTabCallback(onextracallbackwithresult, (QuirksExternalSyntheticBackport0) null, getbacktracenote3, jOnWarmupCompleted, 0.0f, function02, (String) null, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, ((i << 6) & 29360128) | ((i << 3) & 458752) | (i & 8078), 82);
        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }
}
