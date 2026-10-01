package com.google.accompanist.swiperefresh;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.AutoValue_DefaultSurfaceProcessor_PendingSnapshot;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.CameraProviderInitRetryPolicy1;
import o.ExtensionsManagerExtensionsAvailability;
import o.FocusMeteringControlExternalSyntheticLambda3;
import o.ForwardingCameraControl;
import o.HighSpeedResolverExternalSyntheticLambda1;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.ImageProcessingUtil;
import o.LowLightBoostStateState;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.ResourceManagerInternalInflateDelegate;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.attachTimestamp;
import o.callAllGets;
import o.clearAllCameraStateObservers;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.component5;
import o.createIsolatedReader;
import o.flipHorizontally;
import o.getAwbState;
import o.getBacktraceNote;
import o.getCurrentMenuItems;
import o.getNavigationIcon;
import o.getSupportedHighSpeedResolutionsFor;
import o.getThumbPosition;
import o.getZoomState;
import o.immediateFailedFuture;
import o.isZslDisabledByByUserCaseConfig;
import o.needCorrectJpegMetadata;
import o.onQueryRefine;
import o.r8lambda762dDs35ABxrpJOuvYTWYx6zqRc;
import o.r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4;
import o.seek;
import o.setOnQueryTextListener;
import o.setSubmitButtonEnabled;
import o.toMetersPerSecond;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SwipeRefreshIndicatorKt {
    private static final int CrossfadeDurationMs = 100;
    private static final SwipeRefreshIndicatorSizes DefaultSizes = new SwipeRefreshIndicatorSizes(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.5f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.5f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f), null);
    private static final SwipeRefreshIndicatorSizes LargeSizes = new SwipeRefreshIndicatorSizes(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(56.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(11.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f), null);

    /* JADX WARN: Removed duplicated region for block: B:108:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0398 A[LOOP:0: B:210:0x0395->B:212:0x0398, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0432 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    /* renamed from: SwipeRefreshIndicator-_UAkqwU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m25SwipeRefreshIndicator_UAkqwU(@NotNull final SwipeRefreshState swipeRefreshState, final float f, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, boolean z2, boolean z3, long j, long j2, @Nullable toMetersPerSecond tometerspersecond, float f2, boolean z4, float f3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        boolean z5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z6;
        boolean z7;
        long jIAuthTabCallback_Parcel;
        long jOnExtraCallback;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        toMetersPerSecond tometerspersecondOnExtraCallbackWithResult;
        boolean z8;
        float fIAuthTabCallback;
        float f4;
        int i13;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        boolean z9;
        final float fOnExtraCallback;
        final int iOnExtraCallbackWithResult;
        float f5;
        Object objOnMinimized;
        toMetersPerSecond tometerspersecond2;
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor;
        int i14;
        int i15;
        boolean zOnNavigationEvent;
        Object objOnMinimized2;
        final float f6;
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final toMetersPerSecond tometerspersecond3;
        final long j3;
        final long j4;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Intrinsics.checkNotNullParameter(swipeRefreshState, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(373456677);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(swipeRefreshState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f) ? 32 : 16;
        }
        int i16 = i4 & 4;
        if (i16 != 0) {
            i5 |= 384;
        } else {
            if ((i2 & 896) == 0) {
                i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 != 0) {
                if ((i2 & 7168) == 0) {
                    z5 = z;
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z5) ? 2048 : 1024;
                }
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 57344) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 16384 : 8192;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                } else if ((i2 & 458752) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 131072 : 65536;
                }
                if ((i2 & 3670016) == 0) {
                    i5 |= ((i4 & 64) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) ? 1048576 : 524288;
                }
                if ((i2 & 29360128) == 0) {
                    i5 |= ((i4 & 128) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2)) ? 8388608 : 4194304;
                }
                if ((234881024 & i2) == 0) {
                    i5 |= ((i4 & 256) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(tometerspersecond)) ? 67108864 : 33554432;
                }
                i9 = i4 & 512;
                if (i9 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f2) ? 536870912 : 268435456;
                }
                i10 = i4 & 1024;
                if (i10 != 0) {
                    i11 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    i11 = i3 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z4) ? 4 : 2);
                } else {
                    i11 = i3;
                }
                i12 = i4 & 2048;
                if (i12 != 0) {
                    i11 |= 48;
                } else if ((i3 & 112) == 0) {
                    i11 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(f3) ? 32 : 16;
                }
                int i17 = i11;
                if ((i5 & 1533916891) != 306783378 || (i17 & 91) != 18 || !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMessageChannelReady()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((i2 & 1) != 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i16 == 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                        if (i6 != 0) {
                            z5 = true;
                        }
                        z6 = i7 == 0 ? false : z2;
                        boolean z13 = i8 == 0 ? true : z3;
                        if ((i4 & 64) == 0) {
                            i5 &= -3670017;
                            z7 = z13;
                            jIAuthTabCallback_Parcel = createIsolatedReader.onWarmupCompleted.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 8).IAuthTabCallback_Parcel();
                        } else {
                            z7 = z13;
                            jIAuthTabCallback_Parcel = j;
                        }
                        if ((i4 & 128) == 0) {
                            jOnExtraCallback = ImageProcessingUtil.onExtraCallback(jIAuthTabCallback_Parcel, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i5 >> 18) & 14);
                            i5 &= -29360129;
                        } else {
                            jOnExtraCallback = j2;
                        }
                        if ((i4 & 256) == 0) {
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport05;
                            tometerspersecondOnExtraCallbackWithResult = createIsolatedReader.onWarmupCompleted.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 8).onExtraCallbackWithResult().onExtraCallbackWithResult(getZoomState.IAuthTabCallback(50));
                            i5 &= -234881025;
                        } else {
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport05;
                            tometerspersecondOnExtraCallbackWithResult = tometerspersecond;
                        }
                        float fIAuthTabCallback2 = i9 == 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f) : f2;
                        z8 = i10 == 0 ? false : z4;
                        if (i12 == 0) {
                            i13 = i5;
                            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f);
                            z9 = z7;
                            f4 = fIAuthTabCallback2;
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                        } else {
                            fIAuthTabCallback = f3;
                            f4 = fIAuthTabCallback2;
                            i13 = i5;
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                            z9 = z7;
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((i4 & 64) != 0) {
                            i5 &= -3670017;
                        }
                        if ((i4 & 128) != 0) {
                            i5 &= -29360129;
                        }
                        if ((i4 & 256) != 0) {
                            i5 &= -234881025;
                        }
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                        z6 = z2;
                        jIAuthTabCallback_Parcel = j;
                        jOnExtraCallback = j2;
                        tometerspersecondOnExtraCallbackWithResult = tometerspersecond;
                        f4 = f2;
                        z8 = z4;
                        fIAuthTabCallback = f3;
                        i13 = i5;
                        z9 = z3;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(373456677, i13, i17, "com.google.accompanist.swiperefresh.SwipeRefreshIndicator (SwipeRefreshIndicator.kt:103)");
                    }
                    SwipeRefreshIndicatorSizes swipeRefreshIndicatorSizes = !z8 ? LargeSizes : DefaultSizes;
                    fOnExtraCallback = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(f);
                    iOnExtraCallbackWithResult = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallbackWithResult(swipeRefreshIndicatorSizes.m40getSizeD9Ej5fM());
                    float fOnExtraCallback2 = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(f4);
                    f5 = f4;
                    boolean z14 = z8;
                    final Slingshot slingshotRememberUpdatedSlingshot = SlingshotKt.rememberUpdatedSlingshot(swipeRefreshState.getIndicatorOffset(), fOnExtraCallback, iOnExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-492369756);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    long j5 = jIAuthTabCallback_Parcel;
                    if (objOnMinimized != CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        tometerspersecond2 = tometerspersecondOnExtraCallbackWithResult;
                        objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Float.valueOf(0.0f), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    } else {
                        tometerspersecond2 = tometerspersecondOnExtraCallbackWithResult;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                    getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(1303400601);
                    if (!swipeRefreshState.isSwipeInProgress()) {
                        m27SwipeRefreshIndicator__UAkqwU$lambda5(getsupportedhighspeedresolutionsfor, slingshotRememberUpdatedSlingshot.getOffset());
                        i14 = i13;
                    } else {
                        boolean zIsRefreshing = swipeRefreshState.isRefreshing();
                        Object[] objArr = {getsupportedhighspeedresolutionsfor, swipeRefreshState, Integer.valueOf(iOnExtraCallbackWithResult), Float.valueOf(fOnExtraCallback2)};
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-568225417);
                        i14 = i13;
                        int i18 = 0;
                        boolean zOnNavigationEvent2 = false;
                        for (int i19 = 4; i18 < i19; i19 = 4) {
                            zOnNavigationEvent2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(objArr[i18]);
                            i18++;
                        }
                        Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (zOnNavigationEvent2 || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized3 = new SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1(swipeRefreshState, iOnExtraCallbackWithResult, fOnExtraCallback2, getsupportedhighspeedresolutionsfor, null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(zIsRefreshing), (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 64);
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                    float fIAuthTabCallback3 = (!swipeRefreshState.isRefreshing() || m26SwipeRefreshIndicator__UAkqwU$lambda4(getsupportedhighspeedresolutionsfor) > 0.5f) ? fIAuthTabCallback : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport03, swipeRefreshIndicatorSizes.m40getSizeD9Ej5fM());
                    Object[] objArr2 = {getsupportedhighspeedresolutionsfor, Integer.valueOf(iOnExtraCallbackWithResult), Boolean.valueOf(z6), swipeRefreshState, Float.valueOf(fOnExtraCallback)};
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-568225417);
                    zOnNavigationEvent = false;
                    for (i15 = 0; i15 < 5; i15++) {
                        zOnNavigationEvent |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(objArr2[i15]);
                    }
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnNavigationEvent || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        final boolean z15 = z6;
                        objOnMinimized2 = new Function1<flipHorizontally, Unit>() { // from class: com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt$SwipeRefreshIndicator$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((flipHorizontally) obj);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull flipHorizontally fliphorizontally) {
                                Intrinsics.checkNotNullParameter(fliphorizontally, "");
                                fliphorizontally.access000(SwipeRefreshIndicatorKt.m26SwipeRefreshIndicator__UAkqwU$lambda4(getsupportedhighspeedresolutionsfor) - iOnExtraCallbackWithResult);
                                float fCoerceIn = 1.0f;
                                if (z15 && !swipeRefreshState.isRefreshing()) {
                                    fCoerceIn = RangesKt.coerceIn(setSubmitButtonEnabled.onExtraCallbackWithResult().transform(SwipeRefreshIndicatorKt.m26SwipeRefreshIndicator__UAkqwU$lambda4(getsupportedhighspeedresolutionsfor) / RangesKt.coerceAtLeast(fOnExtraCallback, 1.0f)), 0.0f, 1.0f);
                                }
                                fliphorizontally.IAuthTabCallbackStubProxy(fCoerceIn);
                                fliphorizontally.getInterfaceDescriptor(fCoerceIn);
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                    final SwipeRefreshIndicatorSizes swipeRefreshIndicatorSizes2 = swipeRefreshIndicatorSizes;
                    final boolean z16 = z9;
                    final long j6 = jOnExtraCallback;
                    final boolean z17 = z5;
                    final int i20 = i14;
                    r8lambda762dDs35ABxrpJOuvYTWYx6zqRc.onNavigationEvent(attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallbackDefault, (Function1) objOnMinimized2), tometerspersecond2, j5, 0L, (getCurrentMenuItems) null, fIAuthTabCallback3, ForwardingCameraControl.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1903298153, true, new Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>() { // from class: com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt$SwipeRefreshIndicator$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Number) obj2).intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2, int i21) {
                            if ((i21 & 11) == 2 && cameraCaptureResultEmptyCameraCaptureResult2.onMessageChannelReady()) {
                                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                return;
                            }
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1903298153, i21, -1, "com.google.accompanist.swiperefresh.SwipeRefreshIndicator.<anonymous> (SwipeRefreshIndicator.kt:178)");
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(-492369756);
                            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                            if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized4 = new CircularProgressPainter();
                                cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized4);
                            }
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackStubProxy();
                            final CircularProgressPainter circularProgressPainter = (CircularProgressPainter) objOnMinimized4;
                            circularProgressPainter.m17setArcRadius0680j_4(swipeRefreshIndicatorSizes2.m37getArcRadiusD9Ej5fM());
                            circularProgressPainter.m21setStrokeWidth0680j_4(swipeRefreshIndicatorSizes2.m41getStrokeWidthD9Ej5fM());
                            circularProgressPainter.m19setArrowWidth0680j_4(swipeRefreshIndicatorSizes2.m39getArrowWidthD9Ej5fM());
                            circularProgressPainter.m18setArrowHeight0680j_4(swipeRefreshIndicatorSizes2.m38getArrowHeightD9Ej5fM());
                            circularProgressPainter.setArrowEnabled(z16 && !swipeRefreshState.isRefreshing());
                            circularProgressPainter.m20setColor8_81llA(j6);
                            circularProgressPainter.setAlpha(z17 ? RangesKt.coerceIn(swipeRefreshState.getIndicatorOffset() / fOnExtraCallback, 0.0f, 1.0f) : 1.0f);
                            circularProgressPainter.setStartTrim(slingshotRememberUpdatedSlingshot.getStartTrim());
                            circularProgressPainter.setEndTrim(slingshotRememberUpdatedSlingshot.getEndTrim());
                            circularProgressPainter.setRotation(slingshotRememberUpdatedSlingshot.getRotation());
                            circularProgressPainter.setArrowScale(slingshotRememberUpdatedSlingshot.getArrowScale());
                            boolean zIsRefreshing2 = swipeRefreshState.isRefreshing();
                            getThumbPosition getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult(100, 0, (setOnQueryTextListener) null, 6, (Object) null);
                            final SwipeRefreshIndicatorSizes swipeRefreshIndicatorSizes3 = swipeRefreshIndicatorSizes2;
                            final long j7 = j6;
                            final int i22 = i20;
                            ResourceManagerInternalInflateDelegate.onWarmupCompleted(Boolean.valueOf(zIsRefreshing2), (QuirksExternalSyntheticBackport0) null, getthumbpositionOnExtraCallbackWithResult, ForwardingCameraControl.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult2, 210015881, true, new getBacktraceNote<Boolean, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>() { // from class: com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt$SwipeRefreshIndicator$3.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    invoke(((Boolean) obj).booleanValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Number) obj3).intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(boolean z18, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3, int i23) {
                                    int i24;
                                    if ((i23 & 14) == 0) {
                                        i24 = (cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallback(z18) ? 4 : 2) | i23;
                                    } else {
                                        i24 = i23;
                                    }
                                    if ((i24 & 91) != 18 || !cameraCaptureResultEmptyCameraCaptureResult3.onMessageChannelReady()) {
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(210015881, i23, -1, "com.google.accompanist.swiperefresh.SwipeRefreshIndicator.<anonymous>.<anonymous> (SwipeRefreshIndicator.kt:203)");
                                        }
                                        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                                        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
                                        SwipeRefreshIndicatorSizes swipeRefreshIndicatorSizes4 = swipeRefreshIndicatorSizes3;
                                        long j8 = j7;
                                        int i25 = i22;
                                        CircularProgressPainter circularProgressPainter2 = circularProgressPainter;
                                        cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(733328855);
                                        component5 component5VarOnExtraCallback = FocusMeteringControlExternalSyntheticLambda3.onExtraCallback(quirkSettingsLoaderOnExtraCallback, false, cameraCaptureResultEmptyCameraCaptureResult3, 6);
                                        cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(-1323940314);
                                        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                                        ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability = (ExtensionsManagerExtensionsAvailability) cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(needCorrectJpegMetadata.IAuthTabCallbackStubProxy());
                                        AutoValue_DefaultSurfaceProcessor_PendingSnapshot autoValue_DefaultSurfaceProcessor_PendingSnapshot = (AutoValue_DefaultSurfaceProcessor_PendingSnapshot) cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(needCorrectJpegMetadata.writeTypedObject());
                                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                                        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                                        getBacktraceNote getbacktracenoteOnNavigationEvent = callAllGets.onNavigationEvent(quirksExternalSyntheticBackport0OnNavigationEvent);
                                        if (cameraCaptureResultEmptyCameraCaptureResult3.access100() == null) {
                                            getAwbState.onExtraCallback();
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResult3.onUnminimized();
                                        if (cameraCaptureResultEmptyCameraCaptureResult3.onActivityLayout()) {
                                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0IAuthTabCallback);
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackDefault();
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallback();
                                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3);
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, r8lambdanm9dm2eewl4vrptnjmesfjqky4, onextracallbackwithresult.onExtraCallback());
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, extensionsManagerExtensionsAvailability, onextracallbackwithresult.onExtraCallbackWithResult());
                                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, autoValue_DefaultSurfaceProcessor_PendingSnapshot, onextracallbackwithresult.IAuthTabCallbackStub());
                                        cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback();
                                        getbacktracenoteOnNavigationEvent.invoke(clearAllCameraStateObservers.onWarmupCompleted(clearAllCameraStateObservers.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3)), cameraCaptureResultEmptyCameraCaptureResult3, 0);
                                        cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(2058660585);
                                        cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(-2137368960);
                                        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                                        if (z18) {
                                            cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(-1527193899);
                                            LowLightBoostStateState.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(swipeRefreshIndicatorSizes4.m37getArcRadiusD9Ej5fM() + swipeRefreshIndicatorSizes4.m41getStrokeWidthD9Ej5fM()) * 2.0f)), j8, swipeRefreshIndicatorSizes4.m41getStrokeWidthD9Ej5fM(), cameraCaptureResultEmptyCameraCaptureResult3, (i25 >> 18) & 112, 0);
                                            cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackStubProxy();
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(-1527193561);
                                            getNavigationIcon.IAuthTabCallback(circularProgressPainter2, "Refreshing", (QuirksExternalSyntheticBackport0) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, 0.0f, (seek) null, cameraCaptureResultEmptyCameraCaptureResult3, 56, 124);
                                            cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackStubProxy();
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackStubProxy();
                                        cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackStubProxy();
                                        cameraCaptureResultEmptyCameraCaptureResult3.asInterface();
                                        cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackStubProxy();
                                        cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackStubProxy();
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                            return;
                                        }
                                        return;
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
                                }
                            }), cameraCaptureResultEmptyCameraCaptureResult2, 3456, 2);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                        }
                    }), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i14 >> 12) & 896) | ((i14 >> 21) & 112) | 1572864, 24);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    f6 = fIAuthTabCallback;
                    z10 = z9;
                    z11 = z6;
                    z12 = z14;
                    tometerspersecond3 = tometerspersecond2;
                    j3 = jOnExtraCallback;
                    j4 = j5;
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                    z11 = z2;
                    z10 = z3;
                    j4 = j;
                    j3 = j2;
                    tometerspersecond3 = tometerspersecond;
                    f5 = f2;
                    z12 = z4;
                    f6 = f3;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    return;
                }
                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport04;
                final boolean z18 = z5;
                final float f7 = f5;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>() { // from class: com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt$SwipeRefreshIndicator$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2, int i21) {
                        SwipeRefreshIndicatorKt.m25SwipeRefreshIndicator_UAkqwU(swipeRefreshState, f, quirksExternalSyntheticBackport06, z18, z11, z10, j4, j3, tometerspersecond3, f7, z12, f6, cameraCaptureResultEmptyCameraCaptureResult2, i2 | 1, i3, i4);
                    }
                });
                return;
            }
            i5 |= 3072;
            z5 = z;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            i8 = i4 & 32;
            if (i8 != 0) {
            }
            if ((i2 & 3670016) == 0) {
            }
            if ((i2 & 29360128) == 0) {
            }
            if ((234881024 & i2) == 0) {
            }
            i9 = i4 & 512;
            if (i9 != 0) {
            }
            i10 = i4 & 1024;
            if (i10 != 0) {
            }
            i12 = i4 & 2048;
            if (i12 != 0) {
            }
            int i172 = i11;
            if ((i5 & 1533916891) != 306783378) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i2 & 1) != 0) {
                    if (i16 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if ((i4 & 64) == 0) {
                    }
                    if ((i4 & 128) == 0) {
                    }
                    if ((i4 & 256) == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    if (!z8) {
                    }
                    fOnExtraCallback = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(f);
                    iOnExtraCallbackWithResult = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallbackWithResult(swipeRefreshIndicatorSizes.m40getSizeD9Ej5fM());
                    float fOnExtraCallback22 = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onExtraCallback(f4);
                    f5 = f4;
                    boolean z142 = z8;
                    final Slingshot slingshotRememberUpdatedSlingshot2 = SlingshotKt.rememberUpdatedSlingshot(swipeRefreshState.getIndicatorOffset(), fOnExtraCallback, iOnExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-492369756);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    long j52 = jIAuthTabCallback_Parcel;
                    if (objOnMinimized != CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                    getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(1303400601);
                    if (!swipeRefreshState.isSwipeInProgress()) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                    if (swipeRefreshState.isRefreshing()) {
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport03, swipeRefreshIndicatorSizes.m40getSizeD9Ej5fM());
                        Object[] objArr22 = {getsupportedhighspeedresolutionsfor, Integer.valueOf(iOnExtraCallbackWithResult), Boolean.valueOf(z6), swipeRefreshState, Float.valueOf(fOnExtraCallback)};
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(-568225417);
                        zOnNavigationEvent = false;
                        while (i15 < 5) {
                        }
                        objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!zOnNavigationEvent) {
                            final boolean z152 = z6;
                            objOnMinimized2 = new Function1<flipHorizontally, Unit>() { // from class: com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt$SwipeRefreshIndicator$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    invoke((flipHorizontally) obj);
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@NotNull flipHorizontally fliphorizontally) {
                                    Intrinsics.checkNotNullParameter(fliphorizontally, "");
                                    fliphorizontally.access000(SwipeRefreshIndicatorKt.m26SwipeRefreshIndicator__UAkqwU$lambda4(getsupportedhighspeedresolutionsfor) - iOnExtraCallbackWithResult);
                                    float fCoerceIn = 1.0f;
                                    if (z152 && !swipeRefreshState.isRefreshing()) {
                                        fCoerceIn = RangesKt.coerceIn(setSubmitButtonEnabled.onExtraCallbackWithResult().transform(SwipeRefreshIndicatorKt.m26SwipeRefreshIndicator__UAkqwU$lambda4(getsupportedhighspeedresolutionsfor) / RangesKt.coerceAtLeast(fOnExtraCallback, 1.0f)), 0.0f, 1.0f);
                                    }
                                    fliphorizontally.IAuthTabCallbackStubProxy(fCoerceIn);
                                    fliphorizontally.getInterfaceDescriptor(fCoerceIn);
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackStubProxy();
                            final SwipeRefreshIndicatorSizes swipeRefreshIndicatorSizes22 = swipeRefreshIndicatorSizes;
                            final boolean z162 = z9;
                            final long j62 = jOnExtraCallback;
                            final boolean z172 = z5;
                            final int i202 = i14;
                            r8lambda762dDs35ABxrpJOuvYTWYx6zqRc.onNavigationEvent(attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallbackDefault2, (Function1) objOnMinimized2), tometerspersecond2, j52, 0L, (getCurrentMenuItems) null, fIAuthTabCallback3, ForwardingCameraControl.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 1903298153, true, new Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>() { // from class: com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt$SwipeRefreshIndicator$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Number) obj2).intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2, int i21) {
                                    if ((i21 & 11) == 2 && cameraCaptureResultEmptyCameraCaptureResult2.onMessageChannelReady()) {
                                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                        return;
                                    }
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1903298153, i21, -1, "com.google.accompanist.swiperefresh.SwipeRefreshIndicator.<anonymous> (SwipeRefreshIndicator.kt:178)");
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(-492369756);
                                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                                    if (objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        objOnMinimized4 = new CircularProgressPainter();
                                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized4);
                                    }
                                    cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackStubProxy();
                                    final CircularProgressPainter circularProgressPainter = (CircularProgressPainter) objOnMinimized4;
                                    circularProgressPainter.m17setArcRadius0680j_4(swipeRefreshIndicatorSizes22.m37getArcRadiusD9Ej5fM());
                                    circularProgressPainter.m21setStrokeWidth0680j_4(swipeRefreshIndicatorSizes22.m41getStrokeWidthD9Ej5fM());
                                    circularProgressPainter.m19setArrowWidth0680j_4(swipeRefreshIndicatorSizes22.m39getArrowWidthD9Ej5fM());
                                    circularProgressPainter.m18setArrowHeight0680j_4(swipeRefreshIndicatorSizes22.m38getArrowHeightD9Ej5fM());
                                    circularProgressPainter.setArrowEnabled(z162 && !swipeRefreshState.isRefreshing());
                                    circularProgressPainter.m20setColor8_81llA(j62);
                                    circularProgressPainter.setAlpha(z172 ? RangesKt.coerceIn(swipeRefreshState.getIndicatorOffset() / fOnExtraCallback, 0.0f, 1.0f) : 1.0f);
                                    circularProgressPainter.setStartTrim(slingshotRememberUpdatedSlingshot2.getStartTrim());
                                    circularProgressPainter.setEndTrim(slingshotRememberUpdatedSlingshot2.getEndTrim());
                                    circularProgressPainter.setRotation(slingshotRememberUpdatedSlingshot2.getRotation());
                                    circularProgressPainter.setArrowScale(slingshotRememberUpdatedSlingshot2.getArrowScale());
                                    boolean zIsRefreshing2 = swipeRefreshState.isRefreshing();
                                    getThumbPosition getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult(100, 0, (setOnQueryTextListener) null, 6, (Object) null);
                                    final SwipeRefreshIndicatorSizes swipeRefreshIndicatorSizes3 = swipeRefreshIndicatorSizes22;
                                    final long j7 = j62;
                                    final int i22 = i202;
                                    ResourceManagerInternalInflateDelegate.onWarmupCompleted(Boolean.valueOf(zIsRefreshing2), (QuirksExternalSyntheticBackport0) null, getthumbpositionOnExtraCallbackWithResult, ForwardingCameraControl.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult2, 210015881, true, new getBacktraceNote<Boolean, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit>() { // from class: com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt$SwipeRefreshIndicator$3.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                            invoke(((Boolean) obj).booleanValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Number) obj3).intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(boolean z182, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3, int i23) {
                                            int i24;
                                            if ((i23 & 14) == 0) {
                                                i24 = (cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallback(z182) ? 4 : 2) | i23;
                                            } else {
                                                i24 = i23;
                                            }
                                            if ((i24 & 91) != 18 || !cameraCaptureResultEmptyCameraCaptureResult3.onMessageChannelReady()) {
                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(210015881, i23, -1, "com.google.accompanist.swiperefresh.SwipeRefreshIndicator.<anonymous>.<anonymous> (SwipeRefreshIndicator.kt:203)");
                                                }
                                                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                                                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                                                QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
                                                SwipeRefreshIndicatorSizes swipeRefreshIndicatorSizes4 = swipeRefreshIndicatorSizes3;
                                                long j8 = j7;
                                                int i25 = i22;
                                                CircularProgressPainter circularProgressPainter2 = circularProgressPainter;
                                                cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(733328855);
                                                component5 component5VarOnExtraCallback = FocusMeteringControlExternalSyntheticLambda3.onExtraCallback(quirkSettingsLoaderOnExtraCallback, false, cameraCaptureResultEmptyCameraCaptureResult3, 6);
                                                cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(-1323940314);
                                                r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                                                ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability = (ExtensionsManagerExtensionsAvailability) cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(needCorrectJpegMetadata.IAuthTabCallbackStubProxy());
                                                AutoValue_DefaultSurfaceProcessor_PendingSnapshot autoValue_DefaultSurfaceProcessor_PendingSnapshot = (AutoValue_DefaultSurfaceProcessor_PendingSnapshot) cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(needCorrectJpegMetadata.writeTypedObject());
                                                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                                                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                                                getBacktraceNote getbacktracenoteOnNavigationEvent = callAllGets.onNavigationEvent(quirksExternalSyntheticBackport0OnNavigationEvent);
                                                if (cameraCaptureResultEmptyCameraCaptureResult3.access100() == null) {
                                                    getAwbState.onExtraCallback();
                                                }
                                                cameraCaptureResultEmptyCameraCaptureResult3.onUnminimized();
                                                if (cameraCaptureResultEmptyCameraCaptureResult3.onActivityLayout()) {
                                                    cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0IAuthTabCallback);
                                                } else {
                                                    cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackDefault();
                                                }
                                                cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallback();
                                                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3);
                                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
                                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, r8lambdanm9dm2eewl4vrptnjmesfjqky4, onextracallbackwithresult.onExtraCallback());
                                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, extensionsManagerExtensionsAvailability, onextracallbackwithresult.onExtraCallbackWithResult());
                                                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, autoValue_DefaultSurfaceProcessor_PendingSnapshot, onextracallbackwithresult.IAuthTabCallbackStub());
                                                cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback();
                                                getbacktracenoteOnNavigationEvent.invoke(clearAllCameraStateObservers.onWarmupCompleted(clearAllCameraStateObservers.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3)), cameraCaptureResultEmptyCameraCaptureResult3, 0);
                                                cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(2058660585);
                                                cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(-2137368960);
                                                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                                                if (z182) {
                                                    cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(-1527193899);
                                                    LowLightBoostStateState.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(swipeRefreshIndicatorSizes4.m37getArcRadiusD9Ej5fM() + swipeRefreshIndicatorSizes4.m41getStrokeWidthD9Ej5fM()) * 2.0f)), j8, swipeRefreshIndicatorSizes4.m41getStrokeWidthD9Ej5fM(), cameraCaptureResultEmptyCameraCaptureResult3, (i25 >> 18) & 112, 0);
                                                    cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackStubProxy();
                                                } else {
                                                    cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(-1527193561);
                                                    getNavigationIcon.IAuthTabCallback(circularProgressPainter2, "Refreshing", (QuirksExternalSyntheticBackport0) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, 0.0f, (seek) null, cameraCaptureResultEmptyCameraCaptureResult3, 56, 124);
                                                    cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackStubProxy();
                                                }
                                                cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackStubProxy();
                                                cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackStubProxy();
                                                cameraCaptureResultEmptyCameraCaptureResult3.asInterface();
                                                cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackStubProxy();
                                                cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackStubProxy();
                                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                                    return;
                                                }
                                                return;
                                            }
                                            cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
                                        }
                                    }), cameraCaptureResultEmptyCameraCaptureResult2, 3456, 2);
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        CameraConfigExternalSyntheticLambda0.onTransact();
                                    }
                                }
                            }), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i14 >> 12) & 896) | ((i14 >> 21) & 112) | 1572864, 24);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            }
                            f6 = fIAuthTabCallback;
                            z10 = z9;
                            z11 = z6;
                            z12 = z142;
                            tometerspersecond3 = tometerspersecond2;
                            j3 = jOnExtraCallback;
                            j4 = j52;
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                        }
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i6 = i4 & 8;
        if (i6 != 0) {
        }
        z5 = z;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        i8 = i4 & 32;
        if (i8 != 0) {
        }
        if ((i2 & 3670016) == 0) {
        }
        if ((i2 & 29360128) == 0) {
        }
        if ((234881024 & i2) == 0) {
        }
        i9 = i4 & 512;
        if (i9 != 0) {
        }
        i10 = i4 & 1024;
        if (i10 != 0) {
        }
        i12 = i4 & 2048;
        if (i12 != 0) {
        }
        int i1722 = i11;
        if ((i5 & 1533916891) != 306783378) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SwipeRefreshIndicator__UAkqwU$lambda-4, reason: not valid java name */
    public static final float m26SwipeRefreshIndicator__UAkqwU$lambda4(getSupportedHighSpeedResolutionsFor<Float> getsupportedhighspeedresolutionsfor) {
        return ((Number) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SwipeRefreshIndicator__UAkqwU$lambda-5, reason: not valid java name */
    public static final void m27SwipeRefreshIndicator__UAkqwU$lambda5(getSupportedHighSpeedResolutionsFor<Float> getsupportedhighspeedresolutionsfor, float f) {
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Float.valueOf(f));
    }
}
