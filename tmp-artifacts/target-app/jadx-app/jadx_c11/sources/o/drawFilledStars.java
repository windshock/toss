package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.tds.compose.component.atom.loader.TdsLoaderV1Kt$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.drawEmptyStars;
import o.drawFilledStars;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class drawFilledStars {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;

    private static final Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 21;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, drawEmptyStars.onWarmupCompleted onwarmupcompleted, drawEmptyStars.onNavigationEvent onnavigationevent, String str, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 35;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, onwarmupcompleted, onnavigationevent, str, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onNavigationEvent + 107;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 11;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return onWarmupCompleted(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onWarmupCompleted(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 53;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        if (i5 == 0) {
            int i6 = 40 / 0;
        }
        int i7 = onExtraCallback + 21;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unitIAuthTabCallback;
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, drawEmptyStars.onWarmupCompleted onwarmupcompleted, drawEmptyStars.onNavigationEvent onnavigationevent, String str, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 117;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            onWarmupCompleted(quirksExternalSyntheticBackport0, onwarmupcompleted, onnavigationevent, str, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            onWarmupCompleted(quirksExternalSyntheticBackport0, onwarmupcompleted, onnavigationevent, str, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 1;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            i |= 1;
        }
        onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable drawEmptyStars.onWarmupCompleted onwarmupcompleted, @Nullable drawEmptyStars.onNavigationEvent onnavigationevent, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        int i4;
        int i5;
        String str2;
        int i6;
        int i7;
        final drawEmptyStars.onWarmupCompleted onwarmupcompleted2;
        final drawEmptyStars.onNavigationEvent onnavigationevent2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        String str3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        drawEmptyStars.onWarmupCompleted onwarmupcompletedIAuthTabCallback = onwarmupcompleted;
        drawEmptyStars.onNavigationEvent onnavigationeventIAuthTabCallback = onnavigationevent;
        int i8 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(34410668);
        int i9 = i2 & 1;
        if (i9 != 0) {
            int i10 = onExtraCallback + 111;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                int i12 = onExtraCallback + 53;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        int i14 = i2 & 2;
        Object obj = null;
        if (i14 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i15 = onNavigationEvent + 9;
            onExtraCallback = i15 % 128;
            if (i15 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onwarmupcompletedIAuthTabCallback);
                obj.hashCode();
                throw null;
            }
            i3 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onwarmupcompletedIAuthTabCallback) ^ true) ? 32 : 16;
        }
        int i16 = i2 & 4;
        if (i16 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            int i17 = onExtraCallback + 35;
            onNavigationEvent = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 78 / 0;
                i5 = !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onnavigationeventIAuthTabCallback) ^ true) ? 256 : 128;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onnavigationeventIAuthTabCallback)) {
            }
            i3 |= i5;
        }
        int i19 = i2 & 8;
        if (i19 == 0) {
            if ((i & 3072) == 0) {
                str2 = str;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2)) {
                    int i20 = onExtraCallback + 39;
                    onNavigationEvent = i20 % 128;
                    i6 = i20 % 2 == 0 ? 19766 : 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            i7 = i3;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 1171) == 1170, i7 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                onwarmupcompleted2 = onwarmupcompletedIAuthTabCallback;
                onnavigationevent2 = onnavigationeventIAuthTabCallback;
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                str3 = str2;
            } else {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i9 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (i14 != 0) {
                    onwarmupcompletedIAuthTabCallback = drawEmptyStars.onWarmupCompleted.Companion.IAuthTabCallback();
                }
                if (i16 != 0) {
                    int i21 = onExtraCallback + 113;
                    onNavigationEvent = i21 % 128;
                    int i22 = i21 % 2;
                    onnavigationeventIAuthTabCallback = drawEmptyStars.onNavigationEvent.Companion.IAuthTabCallback();
                    int i23 = onExtraCallback + 83;
                    onNavigationEvent = i23 % 128;
                    int i24 = i23 % 2;
                }
                if (i19 != 0) {
                    int i25 = onNavigationEvent + 13;
                    onExtraCallback = i25 % 128;
                    int i26 = i25 % 2;
                    str3 = "";
                } else {
                    str3 = str2;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i27 = onNavigationEvent + 27;
                    onExtraCallback = i27 % 128;
                    if (i27 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(34410668, i7, -1, "im.toss.tds.compose.component.atom.loader.TdsLoaderV1 (TdsLoaderV1.kt:115)");
                        int i28 = 92 / 0;
                    } else {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(34410668, i7, -1, "im.toss.tds.compose.component.atom.loader.TdsLoaderV1 (TdsLoaderV1.kt:115)");
                    }
                    int i29 = onNavigationEvent + 53;
                    onExtraCallback = i29 % 128;
                    int i30 = i29 % 2;
                }
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 48);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport04);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout())) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                int i31 = (i7 >> 6) & 14;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                drawEmptyStars.onWarmupCompleted onwarmupcompleted3 = onwarmupcompletedIAuthTabCallback;
                LowLightBoostStateState.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, onwarmupcompletedIAuthTabCallback.IAuthTabCallback()), onnavigationeventIAuthTabCallback.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i31), onwarmupcompletedIAuthTabCallback.onExtraCallback(), 0L, createByte.Companion.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 8);
                if (StringsKt.isBlank(str3)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-999174612);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-999470910);
                    String str4 = str3;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str4, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 0.0f, 13, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(140.0f), 1, (Object) null), null, Long.valueOf(onnavigationeventIAuthTabCallback.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i31)), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(16)), 0L, null, null, createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i7 >> 9) & 14) | 24624), 0, 130788}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                onwarmupcompleted2 = onwarmupcompleted3;
                onnavigationevent2 = onnavigationeventIAuthTabCallback;
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                final String str5 = str3;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.atom.loader.TdsLoaderV1Kt$$ExternalSyntheticLambda1
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                        int i32 = 2 % 2;
                        int i33 = onWarmupCompleted + 95;
                        onNavigationEvent = i33 % 128;
                        int i34 = i33 % 2;
                        Unit unitIAuthTabCallback = drawFilledStars.IAuthTabCallback(quirksExternalSyntheticBackport03, onwarmupcompleted2, onnavigationevent2, str5, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i35 = onNavigationEvent + 89;
                        onWarmupCompleted = i35 % 128;
                        int i36 = i35 % 2;
                        return unitIAuthTabCallback;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        str2 = str;
        i7 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 1171) == 1170, i7 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final void IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-387109274);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onExtraCallback + 65;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-387109274, i, -1, "im.toss.tds.compose.component.atom.loader.Preview (TdsLoaderV1.kt:140)");
                    int i4 = 82 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-387109274, i, -1, "im.toss.tds.compose.component.atom.loader.Preview (TdsLoaderV1.kt:140)");
                }
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) AppLovinOptionsView.onWarmupCompleted.onExtraCallback(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i5 = onExtraCallback + 115;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsLoaderV1Kt$.ExternalSyntheticLambda2(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(984153326);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            int i3 = onNavigationEvent + 95;
            onExtraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 82 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(984153326, i, -1, "im.toss.tds.compose.component.atom.loader.LabelPreview (TdsLoaderV1.kt:172)");
                }
                y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) AppLovinOptionsView.onWarmupCompleted.onWarmupCompleted(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = onExtraCallback + 23;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) AppLovinOptionsView.onWarmupCompleted.onWarmupCompleted(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i7 = onNavigationEvent + 101;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new TdsLoaderV1Kt$.ExternalSyntheticLambda0(i));
        }
    }
}
