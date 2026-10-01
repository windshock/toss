package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getChildPreviewOutConfig;
import o.putStringArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class putStringArray {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static /* synthetic */ Unit onExtraCallback(String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, putStringIfValid putstringifvalid, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 55;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, quirksExternalSyntheticBackport0, putstringifvalid, function0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 != 0) {
            int i7 = 84 / 0;
        }
        int i8 = onExtraCallback + 75;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, putStringIfValid putstringifvalid, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 13;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        onWarmupCompleted(str, quirksExternalSyntheticBackport0, putstringifvalid, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 69;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull final String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable putStringIfValid putstringifvalid, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final putStringIfValid putstringifvalidOnNavigationEvent;
        int i4;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final Function0<Unit> function02;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        putStringIfValid putstringifvalid2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05;
        Function0<Unit> function03;
        int i5;
        Object objOnMinimized;
        Float fOnWarmupCompleted;
        boolean zOnNavigationEvent;
        Object objOnMinimized2;
        Object objOnMinimized3;
        int i6;
        int i7 = 2 % 2;
        int i8 = onExtraCallbackWithResult + 21;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-30522528);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                int i11 = onExtraCallbackWithResult + 35;
                onExtraCallback = i11 % 128;
                if (i11 % 2 == 0 ? (i2 & 4) != 0 : (i2 & 3) != 0) {
                    putstringifvalidOnNavigationEvent = putstringifvalid;
                } else {
                    putstringifvalidOnNavigationEvent = putstringifvalid;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(putstringifvalidOnNavigationEvent)) {
                        int i12 = onExtraCallback + 55;
                        onExtraCallbackWithResult = i12 % 128;
                        int i13 = i12 % 2;
                        i6 = 256;
                    }
                    i3 |= i6;
                }
                i6 = 128;
                i3 |= i6;
            } else {
                putstringifvalidOnNavigationEvent = putstringifvalid;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 2048 : 1024;
            }
            boolean z2 = true;
            if ((i3 & 1171) == 1170) {
                int i14 = onExtraCallback + 35;
                onExtraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                function02 = function0;
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                int i16 = onExtraCallbackWithResult + 9;
                onExtraCallback = i16 % 128;
                int i17 = i16 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) != 0) {
                    int i18 = onExtraCallback + 61;
                    onExtraCallbackWithResult = i18 % 128;
                    if (i18 % 2 == 0) {
                        int i19 = 15 / 0;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                            quirksExternalSyntheticBackport04 = i10 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                            if ((i2 & 4) != 0) {
                                putstringifvalidOnNavigationEvent = atLeastOneValueMatch.onNavigationEvent(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).isEngagementSignalsApiAvailable(), 0L, 0L, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 6);
                                i3 &= -897;
                            }
                            if (i4 != 0) {
                                putstringifvalid2 = putstringifvalidOnNavigationEvent;
                                quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                                function03 = null;
                            }
                            i5 = i3;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-30522528, i5, -1, "im.toss.tds.compose.component.compound.agreement.v4.badge.TdsAgreementV4Badge (TdsAgreementV4Badge.kt:66)");
                            }
                            if ((((i5 & 896) ^ 384) <= 256 || !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(putstringifvalid2)) && (i5 & 384) != 256) {
                                z2 = false;
                            }
                            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (z2 || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized = new putLongArray(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), putstringifvalid2.onNavigationEvent(), putstringifvalid2.onExtraCallback(), null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                            }
                            putLongArray putlongarray = (putLongArray) objOnMinimized;
                            fOnWarmupCompleted = putstringifvalid2.onWarmupCompleted();
                            zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(fOnWarmupCompleted);
                            objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!zOnNavigationEvent || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized2 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fOnWarmupCompleted == null ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fOnWarmupCompleted.floatValue() * 13.0f) : VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback());
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                            }
                            float fIAuthTabCallback = ((VirtualCameraControlExternalSyntheticLambda1) objOnMinimized2).IAuthTabCallback();
                            Object obj = null;
                            getHumanReadableName gethumanreadablenameOnNavigationEvent = getHumanReadableName.onNavigationEvent(AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), 0L, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13), (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, new getChildPreviewOutConfig(getChildPreviewOutConfig.onExtraCallback.Companion.onExtraCallback(), getChildPreviewOutConfig.onExtraCallbackWithResult.Companion.onNavigationEvent(), (DefaultConstructorMarker) null), 0, 0, (notifySessionStop) null, 15728637, (Object) null);
                            long jOnExtraCallbackWithResult = putstringifvalid2.onExtraCallbackWithResult();
                            GraphicDeviceInfo graphicDeviceInfoIAuthTabCallbackStub = isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub();
                            objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                int i20 = onExtraCallback + 37;
                                onExtraCallbackWithResult = i20 % 128;
                                if (i20 % 2 == 0) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted());
                                    obj.hashCode();
                                    throw null;
                                }
                                objOnMinimized3 = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                            }
                            putStringIfValid putstringifvalid3 = putstringifvalid2;
                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(configureReward.onExtraCallbackWithResult(quirksExternalSyntheticBackport05, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized3, putlongarray, null, null, false, null, false, null, null, function03, 508, null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)), gethumanreadablenameOnNavigationEvent, Long.valueOf(jOnExtraCallbackWithResult), 0L, 0L, null, null, null, Float.valueOf(fIAuthTabCallback), null, null, 0L, 0, false, graphicDeviceInfoIAuthTabCallbackStub, null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(i5 & 14), 196608, 97776}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                int i21 = onExtraCallbackWithResult + 99;
                                onExtraCallback = i21 % 128;
                                int i22 = i21 % 2;
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            putstringifvalidOnNavigationEvent = putstringifvalid3;
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                            function02 = function03;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            if ((i2 & 4) != 0) {
                                int i23 = onExtraCallback + 1;
                                onExtraCallbackWithResult = i23 % 128;
                                int i24 = i23 % 2;
                                i3 &= -897;
                            }
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                        }
                        function03 = function0;
                        putstringifvalid2 = putstringifvalidOnNavigationEvent;
                        quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                        i5 = i3;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        if (((i5 & 896) ^ 384) <= 256) {
                            z2 = false;
                            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (z2) {
                                objOnMinimized = new putLongArray(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), putstringifvalid2.onNavigationEvent(), putstringifvalid2.onExtraCallback(), null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                putLongArray putlongarray2 = (putLongArray) objOnMinimized;
                                fOnWarmupCompleted = putstringifvalid2.onWarmupCompleted();
                                zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(fOnWarmupCompleted);
                                objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!zOnNavigationEvent) {
                                    objOnMinimized2 = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fOnWarmupCompleted == null ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fOnWarmupCompleted.floatValue() * 13.0f) : VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback());
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                    float fIAuthTabCallback2 = ((VirtualCameraControlExternalSyntheticLambda1) objOnMinimized2).IAuthTabCallback();
                                    Object obj2 = null;
                                    getHumanReadableName gethumanreadablenameOnNavigationEvent2 = getHumanReadableName.onNavigationEvent(AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), 0L, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13), (GraphicDeviceInfo) null, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, new getChildPreviewOutConfig(getChildPreviewOutConfig.onExtraCallback.Companion.onExtraCallback(), getChildPreviewOutConfig.onExtraCallbackWithResult.Companion.onNavigationEvent(), (DefaultConstructorMarker) null), 0, 0, (notifySessionStop) null, 15728637, (Object) null);
                                    long jOnExtraCallbackWithResult2 = putstringifvalid2.onExtraCallbackWithResult();
                                    GraphicDeviceInfo graphicDeviceInfoIAuthTabCallbackStub2 = isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub();
                                    objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    }
                                    putStringIfValid putstringifvalid32 = putstringifvalid2;
                                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(configureReward.onExtraCallbackWithResult(quirksExternalSyntheticBackport05, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized3, putlongarray2, null, null, false, null, false, null, null, function03, 508, null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f)), gethumanreadablenameOnNavigationEvent2, Long.valueOf(jOnExtraCallbackWithResult2), 0L, 0L, null, null, null, Float.valueOf(fIAuthTabCallback2), null, null, 0L, 0, false, graphicDeviceInfoIAuthTabCallbackStub2, null, cameraCaptureResultEmptyCameraCaptureResult2, Integer.valueOf(i5 & 14), 196608, 97776}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    }
                                    putstringifvalidOnNavigationEvent = putstringifvalid32;
                                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                    function02 = function03;
                                }
                            }
                        } else {
                            z2 = false;
                            objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (z2) {
                            }
                        }
                    } else {
                        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        }
                        function03 = function0;
                        putstringifvalid2 = putstringifvalidOnNavigationEvent;
                        quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport04;
                        i5 = i3;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        if (((i5 & 896) ^ 384) <= 256) {
                        }
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.badge.TdsAgreementV4BadgeKt$$ExternalSyntheticLambda0
                    private static int onNavigationEvent = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj3, Object obj4) {
                        int i25 = 2 % 2;
                        int i26 = onWarmupCompleted + 87;
                        onNavigationEvent = i26 % 128;
                        int i27 = i26 % 2;
                        Unit unitOnExtraCallback = putStringArray.onExtraCallback(str, quirksExternalSyntheticBackport03, putstringifvalidOnNavigationEvent, function02, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i28 = onNavigationEvent + 43;
                        onWarmupCompleted = i28 % 128;
                        int i29 = i28 % 2;
                        return unitOnExtraCallback;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        int i25 = onExtraCallback + 9;
        onExtraCallbackWithResult = i25 % 128;
        if (i25 % 2 == 0) {
            int i26 = 4 % 4;
        }
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        boolean z22 = true;
        if ((i3 & 1171) == 1170) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }
}
