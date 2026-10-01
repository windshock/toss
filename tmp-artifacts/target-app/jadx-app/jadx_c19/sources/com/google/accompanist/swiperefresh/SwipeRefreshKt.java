package com.google.accompanist.swiperefresh;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AutoValue_DefaultSurfaceProcessor_PendingSnapshot;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigRequiredRule;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CameraPresenceProviderExternalSyntheticLambda6;
import o.CameraProviderInitRetryPolicy1;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.ExtensionsManagerExtensionsAvailability;
import o.FocusMeteringControlExternalSyntheticLambda3;
import o.HighSpeedResolverExternalSyntheticLambda1;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.access13600;
import o.callAllGets;
import o.clearAllCameraStateObservers;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.component5;
import o.findResAndMsg;
import o.getAwbState;
import o.getBacktraceNote;
import o.isZslDisabledByByUserCaseConfig;
import o.needCorrectJpegMetadata;
import o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4;
import o.reverseSizeF;
import o.setExtensionStrength;
import o.setTaggedAddrCtrl;
import o.toPreviewOnlyRange;
import o.updateSensorToBufferTransform;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SwipeRefreshKt {
    private static final float DragMultiplier = 0.5f;

    public static final SwipeRefreshState rememberSwipeRefreshState(boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(-1963273955);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1963273955, i2, -1, "com.google.accompanist.swiperefresh.rememberSwipeRefreshState (SwipeRefresh.kt:59)");
        }
        cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(-492369756);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new SwipeRefreshState(z);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackStubProxy();
        SwipeRefreshState swipeRefreshState = (SwipeRefreshState) objOnMinimized;
        swipeRefreshState.setRefreshing(z);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackStubProxy();
        return swipeRefreshState;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012f  */
    /* renamed from: SwipeRefresh-Fsagccs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m42SwipeRefreshFsagccs(@NotNull final SwipeRefreshState swipeRefreshState, @NotNull final Function0<Unit> function0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, float f, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable setTaggedAddrCtrl<? super SwipeRefreshState, ? super VirtualCameraControlExternalSyntheticLambda1, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> settaggedaddrctrl, boolean z2, @NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z4;
        Object objOnMinimized;
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted;
        findResAndMsg findresandmsgOnNavigationEvent;
        final CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback;
        boolean zOnNavigationEvent;
        Object objOnMinimized2;
        boolean zOnNavigationEvent2;
        boolean zOnNavigationEvent3;
        float f2;
        Object objOnMinimized3;
        final boolean z5;
        final setTaggedAddrCtrl<? super SwipeRefreshState, ? super VirtualCameraControlExternalSyntheticLambda1, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> settaggedaddrctrl2;
        final QuirkSettingsLoader quirkSettingsLoader2;
        final boolean z6;
        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i11;
        Intrinsics.checkNotNullParameter(swipeRefreshState, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2017402940);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(swipeRefreshState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(function0) ? 32 : 16;
        }
        int i12 = i3 & 4;
        if (i12 != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 896) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i2 & 7168) == 0) {
                    z3 = z;
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 16384 : 8192;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                } else if ((i2 & 458752) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirkSettingsLoader) ? 131072 : 65536;
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 1048576 : 524288;
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(settaggedaddrctrl) ? 8388608 : 4194304;
                }
                i10 = i3 & 256;
                if (i10 != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 67108864 : 33554432;
                }
                if ((i3 & 512) == 0) {
                    i11 = (1879048192 & i2) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(function2) ? 536870912 : 268435456 : 805306368;
                    if ((1533916891 & i4) == 306783378 || !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMessageChannelReady()) {
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i12 == 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                        if (i5 != 0) {
                            z3 = true;
                        }
                        float fIAuthTabCallback = i6 == 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(80.0f) : f;
                        QuirkSettingsLoader quirkSettingsLoaderIAuthTabCallback_Parcel = i7 == 0 ? QuirkSettingsLoader.Companion.IAuthTabCallback_Parcel() : quirkSettingsLoader;
                        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnExtraCallback = i8 == 0 ? CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)) : deviceQuirksExternalSyntheticLambda0;
                        setTaggedAddrCtrl<? super SwipeRefreshState, ? super VirtualCameraControlExternalSyntheticLambda1, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> settaggedaddrctrlM23getLambda1$swiperefresh_release = i9 == 0 ? ComposableSingletons$SwipeRefreshKt.INSTANCE.m23getLambda1$swiperefresh_release() : settaggedaddrctrl;
                        z4 = i10 == 0 ? z2 : true;
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2017402940, i4, -1, "com.google.accompanist.swiperefresh.SwipeRefresh (SwipeRefresh.kt:226)");
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(773894976);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-492369756);
                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                            CameraConfigRequiredRule cameraConfigRequiredRule = new CameraConfigRequiredRule(isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback));
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(cameraConfigRequiredRule);
                            objOnMinimized = cameraConfigRequiredRule;
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                        findresandmsgOnNavigationEvent = ((CameraConfigRequiredRule) objOnMinimized).onNavigationEvent();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                        cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i4 >> 3) & 14);
                        boolean zIsSwipeInProgress = swipeRefreshState.isSwipeInProgress();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(1157296644);
                        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(swipeRefreshState);
                        setTaggedAddrCtrl<? super SwipeRefreshState, ? super VirtualCameraControlExternalSyntheticLambda1, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> settaggedaddrctrl3 = settaggedaddrctrlM23getLambda1$swiperefresh_release;
                        objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        QuirkSettingsLoader quirkSettingsLoader3 = quirkSettingsLoaderIAuthTabCallback_Parcel;
                        if (!zOnNavigationEvent || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized2 = new SwipeRefreshKt$SwipeRefresh$1$1(swipeRefreshState, null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(zIsSwipeInProgress), (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 64);
                        float fOnExtraCallback = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(fIAuthTabCallback);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(511388516);
                        zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(swipeRefreshState);
                        zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(findresandmsgOnNavigationEvent);
                        f2 = fIAuthTabCallback;
                        objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(zOnNavigationEvent2 | zOnNavigationEvent3) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized3 = new SwipeRefreshNestedScrollConnection(swipeRefreshState, findresandmsgOnNavigationEvent, new Function0<Unit>() { // from class: com.google.accompanist.swiperefresh.SwipeRefreshKt$SwipeRefresh$nestedScrollConnection$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                public /* bridge */ /* synthetic */ Object invoke() {
                                    m43invoke();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m43invoke() {
                                    ((Function0) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback.onExtraCallbackWithResult()).invoke();
                                }
                            });
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                        SwipeRefreshNestedScrollConnection swipeRefreshNestedScrollConnection = (SwipeRefreshNestedScrollConnection) objOnMinimized3;
                        swipeRefreshNestedScrollConnection.setEnabled(z3);
                        swipeRefreshNestedScrollConnection.setRefreshTrigger(fOnExtraCallback);
                        Unit unit = Unit.INSTANCE;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = updateSensorToBufferTransform.onExtraCallbackWithResult(quirksExternalSyntheticBackport03, swipeRefreshNestedScrollConnection, (reverseSizeF) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(733328855);
                        QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                        component5 component5VarOnExtraCallback = FocusMeteringControlExternalSyntheticLambda3.onExtraCallback(onextracallbackwithresult.access100(), false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-1323940314);
                        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                        ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability = (ExtensionsManagerExtensionsAvailability) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.IAuthTabCallbackStubProxy());
                        AutoValue_DefaultSurfaceProcessor_PendingSnapshot autoValue_DefaultSurfaceProcessor_PendingSnapshot = (AutoValue_DefaultSurfaceProcessor_PendingSnapshot) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.writeTypedObject());
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                        getBacktraceNote getbacktracenoteOnNavigationEvent = callAllGets.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback();
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, r8lambdanm9dm2eewl4vrptnjmesfjqky4, onextracallbackwithresult2.onExtraCallback());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, extensionsManagerExtensionsAvailability, onextracallbackwithresult2.onExtraCallbackWithResult());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, autoValue_DefaultSurfaceProcessor_PendingSnapshot, onextracallbackwithresult2.IAuthTabCallbackStub());
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback();
                        getbacktracenoteOnNavigationEvent.invoke(clearAllCameraStateObservers.onWarmupCompleted(clearAllCameraStateObservers.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(2058660585);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-2137368960);
                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                        function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i4 >> 27) & 14));
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = QuirksExternalSyntheticBackport0.Companion;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = highSpeedResolverExternalSyntheticLambda1.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(z4 ? setExtensionStrength.onExtraCallback(quirksExternalSyntheticBackport05) : quirksExternalSyntheticBackport05, deviceQuirksExternalSyntheticLambda0OnExtraCallback));
                        if (z4) {
                            quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = setExtensionStrength.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult2);
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(733328855);
                        component5 component5VarOnExtraCallback2 = FocusMeteringControlExternalSyntheticLambda3.onExtraCallback(onextracallbackwithresult.access100(), false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-1323940314);
                        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky42 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                        ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability2 = (ExtensionsManagerExtensionsAvailability) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.IAuthTabCallbackStubProxy());
                        AutoValue_DefaultSurfaceProcessor_PendingSnapshot autoValue_DefaultSurfaceProcessor_PendingSnapshot2 = (AutoValue_DefaultSurfaceProcessor_PendingSnapshot) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.writeTypedObject());
                        boolean z7 = z4;
                        Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                        getBacktraceNote getbacktracenoteOnNavigationEvent2 = callAllGets.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallbackWithResult2);
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback();
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback2, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, r8lambdanm9dm2eewl4vrptnjmesfjqky42, onextracallbackwithresult2.onExtraCallback());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, extensionsManagerExtensionsAvailability2, onextracallbackwithresult2.onExtraCallbackWithResult());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, autoValue_DefaultSurfaceProcessor_PendingSnapshot2, onextracallbackwithresult2.IAuthTabCallbackStub());
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback();
                        getbacktracenoteOnNavigationEvent2.invoke(clearAllCameraStateObservers.onWarmupCompleted(clearAllCameraStateObservers.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(2058660585);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-2137368960);
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(quirksExternalSyntheticBackport05, quirkSettingsLoader3);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(733328855);
                        component5 component5VarOnExtraCallback3 = FocusMeteringControlExternalSyntheticLambda3.onExtraCallback(onextracallbackwithresult.access100(), false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-1323940314);
                        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky43 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                        ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability3 = (ExtensionsManagerExtensionsAvailability) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.IAuthTabCallbackStubProxy());
                        AutoValue_DefaultSurfaceProcessor_PendingSnapshot autoValue_DefaultSurfaceProcessor_PendingSnapshot3 = (AutoValue_DefaultSurfaceProcessor_PendingSnapshot) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.writeTypedObject());
                        Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                        getBacktraceNote getbacktracenoteOnNavigationEvent3 = callAllGets.onNavigationEvent(quirksExternalSyntheticBackport0OnWarmupCompleted);
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback();
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnExtraCallback3, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, r8lambdanm9dm2eewl4vrptnjmesfjqky43, onextracallbackwithresult2.onExtraCallback());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, extensionsManagerExtensionsAvailability3, onextracallbackwithresult2.onExtraCallbackWithResult());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, autoValue_DefaultSurfaceProcessor_PendingSnapshot3, onextracallbackwithresult2.IAuthTabCallbackStub());
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback();
                        getbacktracenoteOnNavigationEvent3.invoke(clearAllCameraStateObservers.onWarmupCompleted(clearAllCameraStateObservers.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(2058660585);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-2137368960);
                        settaggedaddrctrl3.invoke(swipeRefreshState, VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i4 & 14) | ((i4 >> 9) & 112) | ((i4 >> 15) & 896)));
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        z5 = z7;
                        settaggedaddrctrl2 = settaggedaddrctrl3;
                        quirkSettingsLoader2 = quirkSettingsLoader3;
                        z6 = z3;
                        deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0OnExtraCallback;
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                        f2 = f;
                        quirkSettingsLoader2 = quirkSettingsLoader;
                        deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
                        settaggedaddrctrl2 = settaggedaddrctrl;
                        z5 = z2;
                        z6 = z3;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                        return;
                    }
                    final float f3 = f2;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>() { // from class: com.google.accompanist.swiperefresh.SwipeRefreshKt$SwipeRefresh$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2, int i13) {
                            SwipeRefreshKt.m42SwipeRefreshFsagccs(swipeRefreshState, function0, quirksExternalSyntheticBackport02, z6, f3, quirkSettingsLoader2, deviceQuirksExternalSyntheticLambda02, settaggedaddrctrl2, z5, function2, cameraCaptureResultEmptyCameraCaptureResult2, i2 | 1, i3);
                        }
                    });
                    return;
                }
                i4 |= i11;
                if ((1533916891 & i4) == 306783378) {
                    if (i12 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(773894976);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-492369756);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                    findresandmsgOnNavigationEvent = ((CameraConfigRequiredRule) objOnMinimized).onNavigationEvent();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                    cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback = CameraPresenceProviderExternalSyntheticLambda2.IAuthTabCallback(function0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i4 >> 3) & 14);
                    boolean zIsSwipeInProgress2 = swipeRefreshState.isSwipeInProgress();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(1157296644);
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(swipeRefreshState);
                    setTaggedAddrCtrl<? super SwipeRefreshState, ? super VirtualCameraControlExternalSyntheticLambda1, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> settaggedaddrctrl32 = settaggedaddrctrlM23getLambda1$swiperefresh_release;
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    QuirkSettingsLoader quirkSettingsLoader32 = quirkSettingsLoaderIAuthTabCallback_Parcel;
                    if (!zOnNavigationEvent) {
                        objOnMinimized2 = new SwipeRefreshKt$SwipeRefresh$1$1(swipeRefreshState, null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(zIsSwipeInProgress2), (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 64);
                        float fOnExtraCallback2 = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(fIAuthTabCallback);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(511388516);
                        zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(swipeRefreshState);
                        zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(findresandmsgOnNavigationEvent);
                        f2 = fIAuthTabCallback;
                        objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(zOnNavigationEvent2 | zOnNavigationEvent3)) {
                            objOnMinimized3 = new SwipeRefreshNestedScrollConnection(swipeRefreshState, findresandmsgOnNavigationEvent, new Function0<Unit>() { // from class: com.google.accompanist.swiperefresh.SwipeRefreshKt$SwipeRefresh$nestedScrollConnection$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                public /* bridge */ /* synthetic */ Object invoke() {
                                    m43invoke();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m43invoke() {
                                    ((Function0) cameraPresenceProviderExternalSyntheticLambda6IAuthTabCallback.onExtraCallbackWithResult()).invoke();
                                }
                            });
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                            SwipeRefreshNestedScrollConnection swipeRefreshNestedScrollConnection2 = (SwipeRefreshNestedScrollConnection) objOnMinimized3;
                            swipeRefreshNestedScrollConnection2.setEnabled(z3);
                            swipeRefreshNestedScrollConnection2.setRefreshTrigger(fOnExtraCallback2);
                            Unit unit2 = Unit.INSTANCE;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult3 = updateSensorToBufferTransform.onExtraCallbackWithResult(quirksExternalSyntheticBackport03, swipeRefreshNestedScrollConnection2, (reverseSizeF) null, 2, (Object) null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(733328855);
                            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult3 = QuirkSettingsLoader.Companion;
                            component5 component5VarOnExtraCallback4 = FocusMeteringControlExternalSyntheticLambda3.onExtraCallback(onextracallbackwithresult3.access100(), false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-1323940314);
                            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky44 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                            ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability4 = (ExtensionsManagerExtensionsAvailability) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.IAuthTabCallbackStubProxy());
                            AutoValue_DefaultSurfaceProcessor_PendingSnapshot autoValue_DefaultSurfaceProcessor_PendingSnapshot4 = (AutoValue_DefaultSurfaceProcessor_PendingSnapshot) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.writeTypedObject());
                            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult22 = toPreviewOnlyRange.Companion;
                            Function0 function0IAuthTabCallback4 = onextracallbackwithresult22.IAuthTabCallback();
                            getBacktraceNote getbacktracenoteOnNavigationEvent4 = callAllGets.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallbackWithResult3);
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback();
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport042 = quirksExternalSyntheticBackport03;
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnExtraCallback4, onextracallbackwithresult22.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, r8lambdanm9dm2eewl4vrptnjmesfjqky44, onextracallbackwithresult22.onExtraCallback());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, extensionsManagerExtensionsAvailability4, onextracallbackwithresult22.onExtraCallbackWithResult());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, autoValue_DefaultSurfaceProcessor_PendingSnapshot4, onextracallbackwithresult22.IAuthTabCallbackStub());
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback();
                            getbacktracenoteOnNavigationEvent4.invoke(clearAllCameraStateObservers.onWarmupCompleted(clearAllCameraStateObservers.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(2058660585);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-2137368960);
                            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                            function2.invoke(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i4 >> 27) & 14));
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport052 = QuirksExternalSyntheticBackport0.Companion;
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult22 = highSpeedResolverExternalSyntheticLambda12.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(z4 ? setExtensionStrength.onExtraCallback(quirksExternalSyntheticBackport052) : quirksExternalSyntheticBackport052, deviceQuirksExternalSyntheticLambda0OnExtraCallback));
                            if (z4) {
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(733328855);
                            component5 component5VarOnExtraCallback22 = FocusMeteringControlExternalSyntheticLambda3.onExtraCallback(onextracallbackwithresult3.access100(), false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-1323940314);
                            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky422 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                            ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability22 = (ExtensionsManagerExtensionsAvailability) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.IAuthTabCallbackStubProxy());
                            AutoValue_DefaultSurfaceProcessor_PendingSnapshot autoValue_DefaultSurfaceProcessor_PendingSnapshot22 = (AutoValue_DefaultSurfaceProcessor_PendingSnapshot) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.writeTypedObject());
                            boolean z72 = z4;
                            Function0 function0IAuthTabCallback22 = onextracallbackwithresult22.IAuthTabCallback();
                            getBacktraceNote getbacktracenoteOnNavigationEvent22 = callAllGets.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallbackWithResult22);
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback();
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, component5VarOnExtraCallback22, onextracallbackwithresult22.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, r8lambdanm9dm2eewl4vrptnjmesfjqky422, onextracallbackwithresult22.onExtraCallback());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, extensionsManagerExtensionsAvailability22, onextracallbackwithresult22.onExtraCallbackWithResult());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult22, autoValue_DefaultSurfaceProcessor_PendingSnapshot22, onextracallbackwithresult22.IAuthTabCallbackStub());
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback();
                            getbacktracenoteOnNavigationEvent22.invoke(clearAllCameraStateObservers.onWarmupCompleted(clearAllCameraStateObservers.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(2058660585);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-2137368960);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = highSpeedResolverExternalSyntheticLambda12.onWarmupCompleted(quirksExternalSyntheticBackport052, quirkSettingsLoader32);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(733328855);
                            component5 component5VarOnExtraCallback32 = FocusMeteringControlExternalSyntheticLambda3.onExtraCallback(onextracallbackwithresult3.access100(), false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-1323940314);
                            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky432 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                            ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability32 = (ExtensionsManagerExtensionsAvailability) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.IAuthTabCallbackStubProxy());
                            AutoValue_DefaultSurfaceProcessor_PendingSnapshot autoValue_DefaultSurfaceProcessor_PendingSnapshot32 = (AutoValue_DefaultSurfaceProcessor_PendingSnapshot) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.writeTypedObject());
                            Function0 function0IAuthTabCallback32 = onextracallbackwithresult22.IAuthTabCallback();
                            getBacktraceNote getbacktracenoteOnNavigationEvent32 = callAllGets.onNavigationEvent(quirksExternalSyntheticBackport0OnWarmupCompleted2);
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback();
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, component5VarOnExtraCallback32, onextracallbackwithresult22.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, r8lambdanm9dm2eewl4vrptnjmesfjqky432, onextracallbackwithresult22.onExtraCallback());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, extensionsManagerExtensionsAvailability32, onextracallbackwithresult22.onExtraCallbackWithResult());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult32, autoValue_DefaultSurfaceProcessor_PendingSnapshot32, onextracallbackwithresult22.IAuthTabCallbackStub());
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback();
                            getbacktracenoteOnNavigationEvent32.invoke(clearAllCameraStateObservers.onWarmupCompleted(clearAllCameraStateObservers.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback)), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(2058660585);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-2137368960);
                            settaggedaddrctrl32.invoke(swipeRefreshState, VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(f2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i4 & 14) | ((i4 >> 9) & 112) | ((i4 >> 15) & 896)));
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            }
                            z5 = z72;
                            settaggedaddrctrl2 = settaggedaddrctrl32;
                            quirkSettingsLoader2 = quirkSettingsLoader32;
                            z6 = z3;
                            deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0OnExtraCallback;
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport042;
                        }
                    }
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            z3 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            i10 = i3 & 256;
            if (i10 != 0) {
            }
            if ((i3 & 512) == 0) {
            }
            i4 |= i11;
            if ((1533916891 & i4) == 306783378) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z3 = z;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        i10 = i3 & 256;
        if (i10 != 0) {
        }
        if ((i3 & 512) == 0) {
        }
        i4 |= i11;
        if ((1533916891 & i4) == 306783378) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }
}
