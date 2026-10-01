package o;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import com.google.android.gms.internal.ads.zzaq;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tds.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.MaxRewardedInterstitialAdapter;
import o.QuirksExternalSyntheticBackport0;
import o.getFrame;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getFrame {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static /* synthetic */ float IAuthTabCallback(setContentInsetsRelative setcontentinsetsrelative, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 53;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        float fOnNavigationEvent = onNavigationEvent(setcontentinsetsrelative, i);
        int i5 = onExtraCallbackWithResult + 121;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return fOnNavigationEvent;
        }
        throw null;
    }

    private static final Unit onExtraCallback(Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 7;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            i |= 1;
        }
        IAuthTabCallback(function0, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function2 function2 = (Function2) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function2, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i4 = onExtraCallbackWithResult + 109;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 25;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function0, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallbackWithResult + 79;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit onNavigationEvent(Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 123;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onExtraCallback + 25;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onNavigationEvent(setContentInsetsRelative setcontentinsetsrelative, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, getBacktraceNote getbacktracenote, Function0 function0, getBacktraceNote getbacktracenote2, long j, long j2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 103;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        onWarmupCompleted(new Object[]{setcontentinsetsrelative, quirksExternalSyntheticBackport0, Integer.valueOf(i), getbacktracenote, function0, getbacktracenote2, Long.valueOf(j), Long.valueOf(j2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1)), Integer.valueOf(i3)}, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), 1231897955, -1231897954, zzaq.onNavigationEvent(), zzaq.onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallbackWithResult + 107;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i3 | i4 | (~i2);
        int i8 = (~((~i3) | i4)) | (~(i3 | i2));
        int i9 = (~(i2 | (~i4))) | i3;
        int i10 = i3 + i4 + i6 + ((-1069702238) * i) + (1645725337 * i5);
        int i11 = i10 * i10;
        int i12 = ((i3 * 2084108943) - 1824784384) + (2084108943 * i4) + (i7 * (-929364622)) + (929364622 * i8) + ((-929364622) * i9) + (1154744320 * i6) + ((-1977090048) * i) + (448004096 * i5) + (1807155200 * i11);
        int i13 = (i3 * (-999696423)) + 1136243370 + (i4 * (-999696423)) + (i7 * 830) + (i8 * (-830)) + (i9 * 830) + (i6 * (-999695593)) + (i * 636963214) + (i5 * (-1077364033)) + (i11 * 980484096);
        return i12 + ((i13 * i13) * 1287192576) != 1 ? onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(setContentInsetsRelative setcontentinsetsrelative, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, getBacktraceNote getbacktracenote, Function0 function0, getBacktraceNote getbacktracenote2, long j, long j2, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 111;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(setcontentinsetsrelative, quirksExternalSyntheticBackport0, i, getbacktracenote, function0, getbacktracenote2, j, j2, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        int i8 = onExtraCallbackWithResult + 25;
        onExtraCallback = i8 % 128;
        int i9 = i8 % 2;
        return unitOnNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull final Function0<Unit> function0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-802822893);
        Object obj = null;
        if ((i & 6) == 0) {
            int i5 = onExtraCallback + 1;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0);
                throw null;
            }
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 4 : 2) | i;
            int i6 = onExtraCallback + 29;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 5 / 2;
            }
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 19) == 18, i3 & 1)) {
                int i9 = onExtraCallback + 7;
                int i10 = i9 % 128;
                onExtraCallbackWithResult = i10;
                if (i9 % 2 != 0) {
                    int i11 = 88 / 0;
                    if (i8 != 0) {
                        int i12 = i10 + 121;
                        onExtraCallback = i12 % 128;
                        if (i12 % 2 == 0) {
                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                            obj.hashCode();
                            throw null;
                        }
                        quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                    } else {
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                    }
                } else if (i8 != 0) {
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-802822893, i3, -1, "im.toss.compose.v0.NavigateUp (AppBars.kt:41)");
                }
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                ImageReaderFormatRecommender.onNavigationEvent(snapshot.onNavigationEvent(R.drawable.icon_arrow_back_android_mono, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(androidx.appcompat.R.string.abc_action_bar_up_description, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(measureChildConstrained.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, function0, 15, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)).onExtraCallback(quirksExternalSyntheticBackport03), 0L, cameraCaptureResultEmptyCameraCaptureResult2, Painter.$stable, 8);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i13 = onExtraCallbackWithResult + 33;
                    onExtraCallback = i13 % 128;
                    int i14 = i13 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v0.AppBarsKt$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2, Object obj3) {
                        Unit unitOnExtraCallbackWithResult;
                        int i15 = 2 % 2;
                        int i16 = onExtraCallbackWithResult + 81;
                        onWarmupCompleted = i16 % 128;
                        if (i16 % 2 == 0) {
                            unitOnExtraCallbackWithResult = getFrame.onExtraCallbackWithResult(function0, quirksExternalSyntheticBackport02, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i17 = 65 / 0;
                        } else {
                            unitOnExtraCallbackWithResult = getFrame.onExtraCallbackWithResult(function0, quirksExternalSyntheticBackport02, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        }
                        int i18 = onWarmupCompleted + 67;
                        onExtraCallbackWithResult = i18 % 128;
                        int i19 = i18 % 2;
                        return unitOnExtraCallbackWithResult;
                    }
                });
                return;
            }
            return;
        }
        int i15 = onExtraCallbackWithResult;
        int i16 = i15 + 57;
        onExtraCallback = i16 % 128;
        int i17 = i16 % 2;
        i3 |= 48;
        int i18 = i15 + 103;
        onExtraCallback = i18 % 128;
        int i19 = i18 % 2;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 19) == 18, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        boolean z;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i3;
        int i4 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1988879664);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
                int i5 = onExtraCallback + 87;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
            int i7 = onExtraCallbackWithResult + 45;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i9 = onExtraCallbackWithResult + 55;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                z = true;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i10 = onExtraCallbackWithResult + 15;
                    onExtraCallback = i10 % 128;
                    if (i10 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1988879664, i2, -1, "im.toss.compose.v0.ProvideTdsNavigationTypography (AppBars.kt:56)");
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1988879664, i2, -1, "im.toss.compose.v0.ProvideTdsNavigationTypography (AppBars.kt:56)");
                }
                accessisMonitoringp accessismonitoringpOnWarmupCompleted = PreviewExternalSyntheticLambda3.onWarmupCompleted();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(52916274);
                getHumanReadableName gethumanreadablenameOnExtraCallback = AppLovinMediationProvider.onExtraCallback(accessgetTlsVersionsAsStringp.Typography5, ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue(), isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (createCameraCaptureCallback) null, (toChildrenConfigsMap) null, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, (isUseCaseActive) null, (getPreviewFromChildren) null, 1048572, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                setPostviewFormatSelector.onExtraCallback(new accessgetCameraFactoryp[]{accessismonitoringpOnWarmupCompleted.onExtraCallback(gethumanreadablenameOnExtraCallback), dispatchPostbackRequest.onWarmupCompleted().onExtraCallback(dispatchPostbackAsync.onWarmupCompleted((dispatchPostbackAsync) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(dispatchPostbackRequest.onWarmupCompleted()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), 0, 0, (handshake) null, (r8lambda9HStmjrtoDHLHwHNekzuov8q0sI) null, 30, (Object) null)), copyBitmapToByteBuffer.IAuthTabCallback().onExtraCallback(Float.valueOf(1.0f))}, function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | ((i2 << 3) & 112));
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i11 = onExtraCallbackWithResult + 105;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v0.AppBarsKt$$ExternalSyntheticLambda3
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i13 = 2 % 2;
                        int i14 = onExtraCallback + 9;
                        onWarmupCompleted = i14 % 128;
                        int i15 = i14 % 2;
                        Unit unit = (Unit) getFrame.onWarmupCompleted(new Object[]{function2, Integer.valueOf(i), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -2070211791, 2070211791, zzaq.onNavigationEvent(), zzaq.onNavigationEvent());
                        int i16 = onWarmupCompleted + 73;
                        onExtraCallback = i16 % 128;
                        int i17 = i16 % 2;
                        return unit;
                    }
                });
                return;
            }
            return;
        }
        int i13 = onExtraCallbackWithResult + 9;
        onExtraCallback = i13 % 128;
        int i14 = i13 % 2;
        z = false;
        if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final float onNavigationEvent(setContentInsetsRelative setcontentinsetsrelative, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 59;
        onExtraCallbackWithResult = i3 % 128;
        return Math.min(setcontentinsetsrelative.IAuthTabCallbackStub() / i, i3 % 2 != 0 ? 0.0f : 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c A[PHI: r19
      0x011c: PHI (r19v1 boolean) = (r19v0 boolean), (r19v4 boolean) binds: [B:57:0x011a, B:54:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011f A[PHI: r19
      0x011f: PHI (r19v3 boolean) = (r19v0 boolean), (r19v4 boolean) binds: [B:57:0x011a, B:54:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i;
        setContentInsetsRelative setcontentinsetsrelative;
        int i2;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        getBacktraceNote<MaxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i7;
        int i8;
        Function0 function0;
        final setContentInsetsRelative setcontentinsetsrelative2;
        final getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote2;
        final int i9;
        final getBacktraceNote<MaxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteOnExtraCallbackWithResult;
        final Function0 function02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2;
        boolean zOnExtraCallback;
        Object objOnExtraCallbackWithResult;
        int iOnNavigationEvent;
        int i10;
        setContentInsetsRelative setcontentinsetsrelative3 = (setContentInsetsRelative) objArr[0];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = (QuirksExternalSyntheticBackport0) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        getBacktraceNote<MaxRewardedInterstitialAdapterListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote3 = (getBacktraceNote) objArr[3];
        Function0 function03 = (Function0) objArr[4];
        getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteOnNavigationEvent = (getBacktraceNote) objArr[5];
        long jLongValue = ((Number) objArr[6]).longValue();
        long jLongValue2 = ((Number) objArr[7]).longValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        final int iIntValue2 = ((Number) objArr[9]).intValue();
        final int iIntValue3 = ((Number) objArr[10]).intValue();
        int i11 = 2 % 2;
        Intrinsics.checkNotNullParameter(setcontentinsetsrelative3, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(134035921);
        if ((iIntValue2 & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setcontentinsetsrelative3) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        int i12 = iIntValue3 & 2;
        Object obj = null;
        if (i12 == 0) {
            setcontentinsetsrelative = setcontentinsetsrelative3;
            if ((iIntValue2 & 48) == 0) {
                int i13 = onExtraCallbackWithResult + 13;
                onExtraCallback = i13 % 128;
                if (i13 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback3);
                    obj.hashCode();
                    throw null;
                }
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback3) ? 32 : 16);
            }
            if ((iIntValue2 & 384) != 0) {
                if ((iIntValue3 & 4) == 0) {
                    int i14 = onExtraCallback + 67;
                    onextracallback = onextracallback3;
                    onExtraCallbackWithResult = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i15 = 25 / 0;
                        i10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIntValue) ? 256 : 128;
                    } else if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iIntValue)) {
                    }
                    i2 |= i10;
                } else {
                    onextracallback = onextracallback3;
                }
                i2 |= i10;
            } else {
                onextracallback = onextracallback3;
            }
            i3 = iIntValue3 & 8;
            if (i3 != 0) {
                if ((iIntValue2 & 3072) == 0) {
                    int i16 = onExtraCallbackWithResult + 101;
                    i4 = iIntValue;
                    onExtraCallback = i16 % 128;
                    if (i16 % 2 == 0) {
                        z = false;
                        int i17 = 36 / 0;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote3)) {
                            i5 = 2048;
                        } else {
                            int i18 = onExtraCallback + 83;
                            onExtraCallbackWithResult = i18 % 128;
                            int i19 = i18 % 2;
                            i5 = 1024;
                        }
                    } else {
                        z = false;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote3)) {
                        }
                    }
                    i2 |= i5;
                }
                i6 = iIntValue3 & 16;
                if (i6 == 0) {
                    if ((iIntValue2 & 24576) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function03)) {
                            int i20 = onExtraCallbackWithResult + 63;
                            getbacktracenote = getbacktracenote3;
                            onExtraCallback = i20 % 128;
                            i7 = i20 % 2 == 0 ? 24391 : 16384;
                        } else {
                            getbacktracenote = getbacktracenote3;
                            i7 = 8192;
                        }
                        i2 |= i7;
                    }
                    i8 = iIntValue3 & 32;
                    if (i8 != 0) {
                        if ((196608 & iIntValue2) == 0) {
                            int i21 = onExtraCallbackWithResult + 27;
                            function0 = function03;
                            onExtraCallback = i21 % 128;
                            int i22 = i21 % 2;
                            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenoteOnNavigationEvent) ? 131072 : 65536;
                        }
                        if ((1572864 & iIntValue2) == 0) {
                            i2 |= ((iIntValue3 & 64) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue)) ? 1048576 : 524288;
                        }
                        if ((12582912 & iIntValue2) == 0) {
                            i2 |= ((iIntValue3 & 128) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue2)) ? 8388608 : 4194304;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i2) != 4793490 ? true : z, i2 & 1)) {
                            int i23 = onExtraCallbackWithResult + 89;
                            onExtraCallback = i23 % 128;
                            if (i23 % 2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                if ((iIntValue2 & 1) != 0 && !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                    if ((iIntValue3 & 4) != 0) {
                                        i2 &= -897;
                                        int i24 = onExtraCallbackWithResult + 15;
                                        onExtraCallback = i24 % 128;
                                        int i25 = i24 % 2;
                                    }
                                    if ((iIntValue3 & 64) != 0) {
                                        i2 &= -3670017;
                                    }
                                    if ((iIntValue3 & 128) != 0) {
                                        i2 &= -29360129;
                                    }
                                    onextracallback2 = onextracallback;
                                    i9 = i4;
                                    getbacktracenoteOnExtraCallbackWithResult = getbacktracenote;
                                }
                                Function0 function04 = function0;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(134035921, i2, -1, "im.toss.compose.v0.FadeInOnScrollAppBar (AppBars.kt:85)");
                                }
                                zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(setcontentinsetsrelative.IAuthTabCallbackStub());
                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!zOnExtraCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    setcontentinsetsrelative2 = setcontentinsetsrelative;
                                    objOnExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.compose.v0.AppBarsKt$$ExternalSyntheticLambda1
                                        private static int IAuthTabCallback = 1;
                                        private static int onExtraCallback;

                                        public final Object invoke() {
                                            int i26 = 2 % 2;
                                            int i27 = onExtraCallback + 29;
                                            IAuthTabCallback = i27 % 128;
                                            int i28 = i27 % 2;
                                            Float fValueOf = Float.valueOf(getFrame.IAuthTabCallback(setcontentinsetsrelative2, i9));
                                            int i29 = IAuthTabCallback + 71;
                                            onExtraCallback = i29 % 128;
                                            int i30 = i29 % 2;
                                            return fValueOf;
                                        }
                                    });
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnExtraCallbackWithResult);
                                } else {
                                    objOnExtraCallbackWithResult = objOnMinimized;
                                    setcontentinsetsrelative2 = setcontentinsetsrelative;
                                }
                                long jOnExtraCallbackWithResult = setByteOrder.onExtraCallbackWithResult(jLongValue, IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6) objOnExtraCallbackWithResult), 0.0f, 0.0f, 0.0f, 14, (Object) null);
                                int i26 = i2 >> 12;
                                MaxAdViewAdapterListener.onWarmupCompleted(function04, onextracallback2, (MaxRewardedInterstitialAdapter.onExtraCallback) null, jLongValue2, jOnExtraCallbackWithResult, (DeviceQuirksExternalSyntheticLambda0) null, getbacktracenoteOnNavigationEvent, getbacktracenoteOnExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i26 & 14) | (i2 & 112) | (i26 & 7168) | ((i2 << 3) & 3670016) | ((i2 << 12) & 29360128), 36);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                    CameraConfigExternalSyntheticLambda0.onTransact();
                                }
                                onextracallback = onextracallback2;
                                function02 = function04;
                                getbacktracenote2 = getbacktracenoteOnNavigationEvent;
                            }
                            if (i12 != 0) {
                                onextracallback = QuirksExternalSyntheticBackport0.Companion;
                            }
                            if ((iIntValue3 & 4) != 0) {
                                DisplayMetrics displayMetrics = ((Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback())).getResources().getDisplayMetrics();
                                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                                iOnNavigationEvent = varyMatches.onNavigationEvent(100, displayMetrics);
                                i2 &= -897;
                            } else {
                                iOnNavigationEvent = i4;
                            }
                            getbacktracenoteOnExtraCallbackWithResult = i3 != 0 ? getRepeatCount.onNavigationEvent.onExtraCallbackWithResult() : getbacktracenote;
                            if (i6 != 0) {
                                function0 = null;
                            }
                            if (i8 != 0) {
                                getbacktracenoteOnNavigationEvent = getRepeatCount.onNavigationEvent.onNavigationEvent();
                            }
                            if ((iIntValue3 & 64) != 0) {
                                jLongValue = y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onNavigationEvent();
                                i2 &= -3670017;
                            }
                            if ((iIntValue3 & 128) != 0) {
                                jLongValue2 = ImageProcessingUtil.onExtraCallback(jLongValue, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2 >> 18) & 14);
                                i2 &= -29360129;
                            }
                            i9 = iOnNavigationEvent;
                            onextracallback2 = onextracallback;
                            Function0 function042 = function0;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            }
                            zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(setcontentinsetsrelative.IAuthTabCallbackStub());
                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (zOnExtraCallback) {
                                setcontentinsetsrelative2 = setcontentinsetsrelative;
                                objOnExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new Function0() { // from class: im.toss.compose.v0.AppBarsKt$$ExternalSyntheticLambda1
                                    private static int IAuthTabCallback = 1;
                                    private static int onExtraCallback;

                                    public final Object invoke() {
                                        int i262 = 2 % 2;
                                        int i27 = onExtraCallback + 29;
                                        IAuthTabCallback = i27 % 128;
                                        int i28 = i27 % 2;
                                        Float fValueOf = Float.valueOf(getFrame.IAuthTabCallback(setcontentinsetsrelative2, i9));
                                        int i29 = IAuthTabCallback + 71;
                                        onExtraCallback = i29 % 128;
                                        int i30 = i29 % 2;
                                        return fValueOf;
                                    }
                                });
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnExtraCallbackWithResult);
                                long jOnExtraCallbackWithResult2 = setByteOrder.onExtraCallbackWithResult(jLongValue, IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda6) objOnExtraCallbackWithResult), 0.0f, 0.0f, 0.0f, 14, (Object) null);
                                int i262 = i2 >> 12;
                                MaxAdViewAdapterListener.onWarmupCompleted(function042, onextracallback2, (MaxRewardedInterstitialAdapter.onExtraCallback) null, jLongValue2, jOnExtraCallbackWithResult2, (DeviceQuirksExternalSyntheticLambda0) null, getbacktracenoteOnNavigationEvent, getbacktracenoteOnExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i262 & 14) | (i2 & 112) | (i262 & 7168) | ((i2 << 3) & 3670016) | ((i2 << 12) & 29360128), 36);
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                }
                                onextracallback = onextracallback2;
                                function02 = function042;
                                getbacktracenote2 = getbacktracenoteOnNavigationEvent;
                            }
                        } else {
                            setcontentinsetsrelative2 = setcontentinsetsrelative;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            getbacktracenote2 = getbacktracenoteOnNavigationEvent;
                            i9 = i4;
                            getbacktracenoteOnExtraCallbackWithResult = getbacktracenote;
                            function02 = function0;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            final setContentInsetsRelative setcontentinsetsrelative4 = setcontentinsetsrelative2;
                            final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback4 = onextracallback;
                            final long j = jLongValue;
                            final long j2 = jLongValue2;
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.v0.AppBarsKt$$ExternalSyntheticLambda2
                                private static int onExtraCallbackWithResult = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj2, Object obj3) {
                                    int i27 = 2 % 2;
                                    int i28 = onWarmupCompleted + 13;
                                    onExtraCallbackWithResult = i28 % 128;
                                    int i29 = i28 % 2;
                                    Unit unitOnWarmupCompleted = getFrame.onWarmupCompleted(setcontentinsetsrelative4, onextracallback4, i9, getbacktracenoteOnExtraCallbackWithResult, function02, getbacktracenote2, j, j2, iIntValue2, iIntValue3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    int i30 = onExtraCallbackWithResult + 111;
                                    onWarmupCompleted = i30 % 128;
                                    if (i30 % 2 != 0) {
                                        return unitOnWarmupCompleted;
                                    }
                                    Object obj4 = null;
                                    obj4.hashCode();
                                    throw null;
                                }
                            });
                        }
                        return null;
                    }
                    i2 |= 196608;
                    function0 = function03;
                    if ((1572864 & iIntValue2) == 0) {
                    }
                    if ((12582912 & iIntValue2) == 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i2) != 4793490 ? true : z, i2 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                    return null;
                }
                i2 |= 24576;
                getbacktracenote = getbacktracenote3;
                i8 = iIntValue3 & 32;
                if (i8 != 0) {
                }
                function0 = function03;
                if ((1572864 & iIntValue2) == 0) {
                }
                if ((12582912 & iIntValue2) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i2) != 4793490 ? true : z, i2 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
                return null;
            }
            i2 |= 3072;
            i4 = iIntValue;
            z = false;
            i6 = iIntValue3 & 16;
            if (i6 == 0) {
            }
            getbacktracenote = getbacktracenote3;
            i8 = iIntValue3 & 32;
            if (i8 != 0) {
            }
            function0 = function03;
            if ((1572864 & iIntValue2) == 0) {
            }
            if ((12582912 & iIntValue2) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i2) != 4793490 ? true : z, i2 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
            return null;
        }
        int i27 = onExtraCallbackWithResult + 19;
        setcontentinsetsrelative = setcontentinsetsrelative3;
        onExtraCallback = i27 % 128;
        i = i27 % 2 == 0 ? i | 38 : i | 48;
        i2 = i;
        if ((iIntValue2 & 384) != 0) {
        }
        i3 = iIntValue3 & 8;
        if (i3 != 0) {
        }
        i4 = iIntValue;
        z = false;
        i6 = iIntValue3 & 16;
        if (i6 == 0) {
        }
        getbacktracenote = getbacktracenote3;
        i8 = iIntValue3 & 32;
        if (i8 != 0) {
        }
        function0 = function03;
        if ((1572864 & iIntValue2) == 0) {
        }
        if ((12582912 & iIntValue2) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i2) != 4793490 ? true : z, i2 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
        return null;
    }

    private static final float IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            return number.floatValue();
        }
        number.floatValue();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onWarmupCompleted(new Object[]{function2, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -2070211791, 2070211791, zzaq.onNavigationEvent(), zzaq.onNavigationEvent());
    }

    public static final void onExtraCallbackWithResult(@NotNull setContentInsetsRelative setcontentinsetsrelative, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, @Nullable getBacktraceNote<? super MaxRewardedInterstitialAdapterListener, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable Function0<Unit> function0, @Nullable getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, long j, long j2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        onWarmupCompleted(new Object[]{setcontentinsetsrelative, quirksExternalSyntheticBackport0, Integer.valueOf(i), getbacktracenote, function0, getbacktracenote2, Long.valueOf(j), Long.valueOf(j2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2), Integer.valueOf(i3)}, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), 1231897955, -1231897954, zzaq.onNavigationEvent(), zzaq.onNavigationEvent());
    }
}
