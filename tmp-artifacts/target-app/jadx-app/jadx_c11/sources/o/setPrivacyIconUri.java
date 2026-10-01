package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.HighSpeedResolverExternalSyntheticLambda2;
import o.handleNativeAdClick;
import o.setPrivacyIconUri;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setPrivacyIconUri implements HighSpeedResolverExternalSyntheticLambda2 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    private final HighSpeedResolverExternalSyntheticLambda2 onExtraCallback;

    public static /* synthetic */ Unit IAuthTabCallback(setPrivacyIconUri setprivacyiconuri, handleNativeAdClick.onExtraCallbackWithResult onextracallbackwithresult, toMetersPerSecond tometerspersecond, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 115;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setprivacyiconuri, onextracallbackwithresult, tometerspersecond, getbacktracenote, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 17;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 21 / 0;
        }
        return unitOnExtraCallback;
    }

    private static final Unit onExtraCallback(setPrivacyIconUri setprivacyiconuri, handleNativeAdClick.onExtraCallbackWithResult onextracallbackwithresult, toMetersPerSecond tometerspersecond, getBacktraceNote getbacktracenote, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 53;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        setprivacyiconuri.onWarmupCompleted(onextracallbackwithresult, tometerspersecond, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 113;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(deprecated_followRedirects deprecated_followredirects, HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 1;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallback(deprecated_followredirects, highSpeedResolverExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(deprecated_followredirects, highSpeedResolverExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = this.onExtraCallback.onExtraCallbackWithResult(quirksExternalSyntheticBackport0);
        int i4 = IAuthTabCallback + 105;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
    }

    public QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull QuirkSettingsLoader quirkSettingsLoader) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(quirkSettingsLoader, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = this.onExtraCallback.onWarmupCompleted(quirksExternalSyntheticBackport0, quirkSettingsLoader);
        int i4 = IAuthTabCallback + 69;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return quirksExternalSyntheticBackport0OnWarmupCompleted;
    }

    public setPrivacyIconUri(@NotNull HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2) {
        Intrinsics.checkNotNullParameter(highSpeedResolverExternalSyntheticLambda2, "");
        this.onExtraCallback = highSpeedResolverExternalSyntheticLambda2;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getMainImageAspectRatio $accessoryConfig;
        final /* synthetic */ toMetersPerSecond $outlineShape;
        final /* synthetic */ handleNativeAdClick.onExtraCallbackWithResult $position;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(getMainImageAspectRatio getmainimageaspectratio, handleNativeAdClick.onExtraCallbackWithResult onextracallbackwithresult, toMetersPerSecond tometerspersecond, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$accessoryConfig = getmainimageaspectratio;
            this.$position = onextracallbackwithresult;
            this.$outlineShape = tometerspersecond;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$accessoryConfig, this.$position, this.$outlineShape, access13800Var);
            int i2 = onNavigationEvent + 29;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 69 / 0;
            }
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 21;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(findresandmsg, access13800Var);
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = 16 / 0;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 94 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            if (r2 != 0) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        
            r4.$accessoryConfig.onExtraCallback().IAuthTabCallback(r4.$position);
            r4.$accessoryConfig.onExtraCallbackWithResult().IAuthTabCallback(r4.$outlineShape);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        
            return kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        
            r4.$accessoryConfig.onExtraCallback().IAuthTabCallback(r4.$position);
            r4.$accessoryConfig.onExtraCallbackWithResult().IAuthTabCallback(r4.$outlineShape);
            r5 = kotlin.Unit.INSTANCE;
            r5 = null;
            r5.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r4.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r4.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            r2 = r2 + 57;
            o.setPrivacyIconUri.IAuthTabCallback.IAuthTabCallback = r2 % 128;
            r2 = r2 % 2;
            kotlin.ResultKt.onNavigationEvent(r5);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            if (i2 % 2 == 0) {
                int i4 = 44 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@Nullable handleNativeAdClick.onExtraCallbackWithResult onextracallbackwithresult, @Nullable toMetersPerSecond tometerspersecond, @NotNull final getBacktraceNote<? super HighSpeedResolverExternalSyntheticLambda2, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        toMetersPerSecond tometerspersecond2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback;
        handleNativeAdClick.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = onextracallbackwithresult;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(828259115);
        int i5 = i2 & 1;
        if (i5 != 0) {
            int i6 = onNavigationEvent + 115;
            IAuthTabCallback = i6 % 128;
            i3 = i6 % 2 != 0 ? i | 90 : i | 6;
        } else if ((i & 6) == 0) {
            int i7 = onNavigationEvent + 17;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresultOnExtraCallback);
                throw null;
            }
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallbackwithresultOnExtraCallback) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                tometerspersecond2 = tometerspersecond;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(tometerspersecond2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                int i9 = onNavigationEvent + 23;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                i3 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ^ true) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 2048 : 1024;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) == 1170, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            } else {
                int i11 = IAuthTabCallback + 51;
                onNavigationEvent = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
                if (i5 != 0) {
                    onextracallbackwithresultOnExtraCallback = handleNativeAdClick.onExtraCallbackWithResult.Companion.onExtraCallback();
                }
                if (i8 != 0) {
                    tometerspersecond2 = null;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i12 = IAuthTabCallback + 97;
                    onNavigationEvent = i12 % 128;
                    if (i12 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(828259115, i3, -1, "im.toss.tds.compose.component.atom.asset.v2.AccessoryPreset.Badge (AccessoryPreset.kt:36)");
                        int i13 = 65 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(828259115, i3, -1, "im.toss.tds.compose.component.atom.asset.v2.AccessoryPreset.Badge (AccessoryPreset.kt:36)");
                    }
                }
                handleNativeAdClick handlenativeadclick = handleNativeAdClick.onExtraCallback;
                handleNativeAdClick.onExtraCallback onextracallback = (handleNativeAdClick.onExtraCallback) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(handlenativeadclick.onExtraCallback());
                getMainImageAspectRatio getmainimageaspectratio = (getMainImageAspectRatio) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(handlenativeadclick.onExtraCallbackWithResult());
                Object[] objArr = {onextracallback, getmainimageaspectratio, onextracallbackwithresultOnExtraCallback, tometerspersecond2};
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getmainimageaspectratio);
                if ((i3 & 14) == 4) {
                    int i14 = IAuthTabCallback + 53;
                    onNavigationEvent = i14 % 128;
                    boolean z2 = i14 % 2 != 0;
                    if ((i3 & 112) == 32) {
                        int i15 = onNavigationEvent + 37;
                        IAuthTabCallback = i15 % 128;
                        int i16 = i15 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if ((z2 | zOnNavigationEvent | z) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new IAuthTabCallback(getmainimageaspectratio, onextracallbackwithresultOnExtraCallback, tometerspersecond2, null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
                    if (onextracallback instanceof handleNativeAdClick.onExtraCallback.onNavigationEvent) {
                        handleNativeAdClick.onExtraCallback.onNavigationEvent onnavigationevent = (handleNativeAdClick.onExtraCallback.onNavigationEvent) onextracallback;
                        quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(CaptureNoResponseQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(quirksExternalSyntheticBackport0, VirtualCameraInfo.onExtraCallbackWithResult(onnavigationevent.getInterfaceDescriptor().onExtraCallback())), VirtualCameraInfo.onWarmupCompleted(onnavigationevent.getInterfaceDescriptor().onExtraCallback())), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onWarmupCompleted(onnavigationevent.getInterfaceDescriptor().onExtraCallbackWithResult()) * onextracallbackwithresultOnExtraCallback.onNavigationEvent()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onNavigationEvent(onnavigationevent.getInterfaceDescriptor().onExtraCallbackWithResult()) * onextracallbackwithresultOnExtraCallback.onExtraCallbackWithResult())));
                    } else {
                        quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0;
                    }
                    if (tometerspersecond2 != null) {
                        quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0OnExtraCallback.onExtraCallback(setExtensionStrength.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, tometerspersecond2));
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, new resolveQuirkName(onextracallbackwithresultOnExtraCallback.onNavigationEvent(), onextracallbackwithresultOnExtraCallback.onExtraCallbackWithResult()));
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnWarmupCompleted);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
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
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                    getbacktracenote.invoke(HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((((((i3 << 3) & 7168) | 48) >> 6) & 112) | 6));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
            final handleNativeAdClick.onExtraCallbackWithResult onextracallbackwithresult3 = onextracallbackwithresultOnExtraCallback;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                final toMetersPerSecond tometerspersecond3 = tometerspersecond2;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.asset.v2.AccessoryPreset$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj, Object obj2) {
                        int i17 = 2 % 2;
                        int i18 = IAuthTabCallback + 79;
                        onWarmupCompleted = i18 % 128;
                        if (i18 % 2 == 0) {
                            return setPrivacyIconUri.IAuthTabCallback(this.f$0, onextracallbackwithresult3, tometerspersecond3, getbacktracenote, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        }
                        Unit unitIAuthTabCallback = setPrivacyIconUri.IAuthTabCallback(this.f$0, onextracallbackwithresult3, tometerspersecond3, getbacktracenote, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i19 = 33 / 0;
                        return unitIAuthTabCallback;
                    }
                });
                return;
            }
            return;
        }
        int i17 = IAuthTabCallback + 117;
        onNavigationEvent = i17 % 128;
        int i18 = i17 % 2;
        i3 |= 48;
        tometerspersecond2 = tometerspersecond;
        int i19 = IAuthTabCallback + 45;
        onNavigationEvent = i19 % 128;
        int i20 = i19 % 2;
        if ((i & 384) == 0) {
        }
        if ((i & 3072) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) == 1170, i3 & 1)) {
        }
        final handleNativeAdClick.onExtraCallbackWithResult onextracallbackwithresult32 = onextracallbackwithresultOnExtraCallback;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public final void onExtraCallback(@NotNull String str, @Nullable handleNativeAdClick.onExtraCallbackWithResult onextracallbackwithresult, @Nullable toMetersPerSecond tometerspersecond, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        handleNativeAdClick.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback;
        toMetersPerSecond tometerspersecond2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 117;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        if ((i2 & 2) != 0) {
            int i6 = onNavigationEvent + 53;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                handleNativeAdClick.onExtraCallbackWithResult.Companion.onExtraCallback();
                obj.hashCode();
                throw null;
            }
            onextracallbackwithresultOnExtraCallback = handleNativeAdClick.onExtraCallbackWithResult.Companion.onExtraCallback();
        } else {
            onextracallbackwithresultOnExtraCallback = onextracallbackwithresult;
        }
        if ((i2 & 4) != 0) {
            int i7 = onNavigationEvent + 39;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            tometerspersecond2 = null;
        } else {
            tometerspersecond2 = tometerspersecond;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(835244032, i, -1, "im.toss.tds.compose.component.atom.asset.v2.AccessoryPreset.Badge (AccessoryPreset.kt:88)");
        }
        onExtraCallbackWithResult(deprecated_followSslRedirects.onExtraCallback(str), onextracallbackwithresultOnExtraCallback, tometerspersecond2, cameraCaptureResultEmptyCameraCaptureResult, i & 8176, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void onExtraCallbackWithResult(@NotNull final deprecated_followRedirects deprecated_followredirects, @Nullable handleNativeAdClick.onExtraCallbackWithResult onextracallbackwithresult, @Nullable toMetersPerSecond tometerspersecond, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        toMetersPerSecond tometerspersecond2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
        if ((i2 & 2) != 0) {
            int i4 = IAuthTabCallback + 83;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            onextracallbackwithresult = handleNativeAdClick.onExtraCallbackWithResult.Companion.onExtraCallback();
        }
        handleNativeAdClick.onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult;
        if ((i2 & 4) != 0) {
            int i6 = onNavigationEvent + 31;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            tometerspersecond2 = null;
        } else {
            tometerspersecond2 = tometerspersecond;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onNavigationEvent + 65;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1107667819, i, -1, "im.toss.tds.compose.component.atom.asset.v2.AccessoryPreset.Badge (AccessoryPreset.kt:102)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1107667819, i, -1, "im.toss.tds.compose.component.atom.asset.v2.AccessoryPreset.Badge (AccessoryPreset.kt:102)");
        }
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-283273046, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.atom.asset.v2.AccessoryPreset$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i9 = 2 % 2;
                int i10 = IAuthTabCallback + 31;
                onWarmupCompleted = i10 % 128;
                if (i10 % 2 == 0) {
                    setPrivacyIconUri.onWarmupCompleted(deprecated_followredirects, (HighSpeedResolverExternalSyntheticLambda2) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                Unit unitOnWarmupCompleted = setPrivacyIconUri.onWarmupCompleted(deprecated_followredirects, (HighSpeedResolverExternalSyntheticLambda2) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i11 = onWarmupCompleted + 67;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                return unitOnWarmupCompleted;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54);
        int i9 = i >> 3;
        onWarmupCompleted(onextracallbackwithresult2, tometerspersecond2, encoderProfilesProxyVideoProfileProxyOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, (i9 & 14) | 384 | (i9 & 112) | (i & 7168), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static final Unit IAuthTabCallback(deprecated_followRedirects deprecated_followredirects, HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(highSpeedResolverExternalSyntheticLambda2, "");
        boolean z = false;
        if ((i & 17) != 16) {
            int i3 = onNavigationEvent + 55;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                z = true;
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = onNavigationEvent + 89;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-283273046, i, -1, "im.toss.tds.compose.component.atom.asset.v2.AccessoryPreset.Badge.<anonymous> (AccessoryPreset.kt:107)");
            }
            AppLovinNativeAdImplc.IAuthTabCallback(deprecated_followredirects, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), 0L, null, null, null, null, null, null, cameraCaptureResultEmptyCameraCaptureResult, 48, 508);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i5 = onNavigationEvent + 121;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 5 / 5;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallback + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof setPrivacyIconUri) {
            if (this.onExtraCallback == ((setPrivacyIconUri) obj).onExtraCallback) {
                return true;
            }
            int i4 = IAuthTabCallback + 3;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iIdentityHashCode = System.identityHashCode(this.onExtraCallback);
        int i4 = onNavigationEvent + 85;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return iIdentityHashCode;
    }
}
