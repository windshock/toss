package o;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import com.google.android.gms.internal.firebase-auth-api.zzmr;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AFf1uSDK;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.handleNativeAdClick;
import o.toPreviewOnlyRange;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFf1uSDK {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i5;
        int i8 = (~(i7 | i3)) | i4;
        int i9 = ~i4;
        int i10 = ~(i9 | i3 | i5);
        int i11 = (~(i5 | i9)) | i3 | (~(i7 | i4));
        int i12 = i3 + i4 + i2 + ((-381402339) * i6) + ((-2062754392) * i);
        int i13 = i12 * i12;
        int i14 = (1317609343 * i3) + 1063714816 + (1288888451 * i4) + (i8 * 14360446) + (14360446 * i10) + ((-14360446) * i11) + (1303248896 * i2) + (1454768128 * i6) + (808452096 * i) + ((-1790509056) * i13);
        int i15 = ((i3 * (-1355236691)) - 921838429) + (i4 * (-1355236103)) + (i8 * (-294)) + (i10 * (-294)) + (i11 * 294) + (i2 * (-1355236397)) + (i6 * (-1583251481)) + (i * 1682205048) + (i13 * (-427491328));
        if (i14 + (i15 * i15 * 844169216) == 1) {
            return onExtraCallback(objArr);
        }
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        ((Number) objArr[2]).intValue();
        int i16 = 2 % 2;
        int i17 = onExtraCallbackWithResult + 21;
        onNavigationEvent = i17 % 128;
        int i18 = i17 % 2;
        onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue));
        Unit unit = Unit.INSTANCE;
        int i19 = onExtraCallbackWithResult + 105;
        onNavigationEvent = i19 % 128;
        int i20 = i19 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 85;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        if (i5 != 0) {
            return (Unit) IAuthTabCallback(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 2071697857, -2071697857, iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), objArr);
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        List list = (List) objArr[0];
        CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0 = (CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(list, cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onExtraCallbackWithResult + 89;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(Function2 function2, Function2 function22, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, Function0 function0, List list, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(function2, function22, quirksExternalSyntheticBackport0, str, function0, list, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + Imgproc.COLOR_YUV2RGB_YVYU;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(double d, String str, GraphicDeviceInfo graphicDeviceInfo, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 23;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(d, str, graphicDeviceInfo, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 != 0) {
            int i7 = 61 / 0;
        }
        int i8 = onNavigationEvent + 91;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        throw null;
    }

    private static final Unit onWarmupCompleted(double d, String str, GraphicDeviceInfo graphicDeviceInfo, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(d, str, graphicDeviceInfo, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 19;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function2 function2, Function2 function22, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, Function0 function0, List list, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return onExtraCallbackWithResult(function2, function22, quirksExternalSyntheticBackport0, str, function0, list, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onExtraCallbackWithResult(function2, function22, quirksExternalSyntheticBackport0, str, function0, list, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(List list, CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, "");
        if ((i & 17) != 16) {
            int i3 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i5 = onExtraCallbackWithResult + 99;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1741961811, i, -1, "im.toss.tosssecurities.uikit.compound.news.NewsRow.<anonymous>.<anonymous>.<anonymous> (SecuritiesNewRow.kt:57)");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int i7 = onExtraCallbackWithResult + 71;
                onNavigationEvent = i7 % 128;
                ((Function2) (i7 % 2 == 0 ? it.next() : it.next())).invoke(cameraCaptureResultEmptyCameraCaptureResult, 0);
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, @NotNull final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function22, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable String str, @NotNull final Function0<Unit> function0, @Nullable final List<? extends Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>> list, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        int i5;
        int i6;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        String str2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i7;
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1424818003);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
                int i9 = onNavigationEvent + 103;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i11 = onExtraCallbackWithResult + 97;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22);
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function22) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                int i13 = onExtraCallbackWithResult + 57;
                onNavigationEvent = i13 % 128;
                int i14 = i13 % 2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i15 = onExtraCallbackWithResult + 13;
                    onNavigationEvent = i15 % 128;
                    int i16 = i15 % 2;
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            i5 = i2 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    i3 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ^ true) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : TTHistoryActivity2.SIZE;
                }
                if ((196608 & i) == 0) {
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? Imgproc.FLOODFILL_MASK_ONLY : Imgproc.FLOODFILL_FIXED_RANGE;
                }
                i6 = i3;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i6) != 74898, i6 & 1)) {
                    int i17 = onNavigationEvent + 71;
                    onExtraCallbackWithResult = i17 % 128;
                    if (i17 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (i12 != 0) {
                        quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                    }
                    str2 = i5 != 0 ? null : str;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1424818003, i6, -1, "im.toss.tosssecurities.uikit.compound.news.NewsRow (SecuritiesNewRow.kt:41)");
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(measureChildConstrained.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null), false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, function0, 15, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f));
                    FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                    FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = focusMeteringControlExternalSyntheticLambda12.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f));
                    QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                    component5 component5VarOnExtraCallback = RowKt.onExtraCallback(asbinderOnExtraCallback, onextracallbackwithresult.access000(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
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
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = RowScope.onNavigationEvent(rowScopeInstance, onextracallback, 1.0f, false, 2, (Object) null);
                    component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent2);
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        int i18 = onExtraCallbackWithResult + 85;
                        onNavigationEvent = i18 % 128;
                        int i19 = i18 % 2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                    LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                    List<? extends Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>> list2 = list;
                    if (list2 == null || list2.isEmpty()) {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        int i20 = onExtraCallbackWithResult + 97;
                        onNavigationEvent = i20 % 128;
                        if (i20 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(765246837);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                            int i21 = 91 / 0;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(765246837);
                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                        }
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(764985445);
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        ZslControlImplExternalSyntheticLambda2.IAuthTabCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 7, (Object) null), focusMeteringControlExternalSyntheticLambda12.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f)), (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onWarmupCompleted) null, 0, 0, ForwardingCameraControl.onExtraCallback(-1741961811, true, new getBacktraceNote() { // from class: im.toss.tosssecurities.uikit.compound.news.SecuritiesNewRowKt$$ExternalSyntheticLambda0
                            private static int IAuthTabCallback = 0;
                            private static int onWarmupCompleted = 1;

                            @Override // o.getBacktraceNote
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                int i22 = 2 % 2;
                                int i23 = onWarmupCompleted + 17;
                                IAuthTabCallback = i23 % 128;
                                int i24 = i23 % 2;
                                Object[] objArr = {list, (CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
                                int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
                                Unit unit = (Unit) AFf1uSDK.IAuthTabCallback(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 922677052, -922677051, iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), objArr);
                                int i25 = IAuthTabCallback + 39;
                                onWarmupCompleted = i25 % 128;
                                int i26 = i25 % 2;
                                return unit;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult2, 1572918, 60);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    }
                    accessisMonitoringp accessismonitoringpOnWarmupCompleted = PreviewExternalSyntheticLambda3.onWarmupCompleted();
                    long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(17);
                    isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
                    GraphicDeviceInfo graphicDeviceInfoIAuthTabCallbackStub = isrepeatingenabled.IAuthTabCallbackStub();
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    accessgetCameraFactoryp accessgetcamerafactorypOnExtraCallback = accessismonitoringpOnWarmupCompleted.onExtraCallback(new getHumanReadableName(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).isEngagementSignalsApiAvailable(), jOnExtraCallback, graphicDeviceInfoIAuthTabCallbackStub, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null));
                    int i22 = accessgetCameraFactoryp.onNavigationEvent;
                    setPostviewFormatSelector.onNavigationEvent(accessgetcamerafactorypOnExtraCallback, function2, cameraCaptureResultEmptyCameraCaptureResult2, ((i6 << 3) & 112) | i22);
                    setPostviewFormatSelector.onNavigationEvent(PreviewExternalSyntheticLambda3.onWarmupCompleted().onExtraCallback(new getHumanReadableName(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue(), RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13), isrepeatingenabled.onTransact(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null)), function22, cameraCaptureResultEmptyCameraCaptureResult2, (i6 & 112) | i22);
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    if (str2 == null) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1182506115);
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-1182506114);
                        setMainImageUri.IAuthTabCallback(str2, deprecated_eventListenerFactory.Image, setExtensionStrength.onExtraCallbackWithResult(onextracallback, RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f))), handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(72.0f)), 0L, 0, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult2, 3120, 0, 8176);
                        Unit unit = Unit.INSTANCE;
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                    str2 = str;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final String str3 = str2;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.news.SecuritiesNewRowKt$$ExternalSyntheticLambda1
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            int i23 = 2 % 2;
                            int i24 = onExtraCallbackWithResult + 97;
                            onExtraCallback = i24 % 128;
                            int i25 = i24 % 2;
                            Unit unitOnWarmupCompleted = AFf1uSDK.onWarmupCompleted(function2, function22, quirksExternalSyntheticBackport03, str3, function0, list, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i26 = onExtraCallback + 27;
                            onExtraCallbackWithResult = i26 % 128;
                            if (i26 % 2 != 0) {
                                return unitOnWarmupCompleted;
                            }
                            Object obj4 = null;
                            obj4.hashCode();
                            throw null;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i6 = i3;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i6) != 74898, i6 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i6 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i6) != 74898, i6 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0399  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(final double d, @NotNull final String str, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        GraphicDeviceInfo graphicDeviceInfo2;
        int i4;
        int i5;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final GraphicDeviceInfo graphicDeviceInfo3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z;
        long jOnUnminimized;
        Object objOnExtraCallbackWithResult;
        int i6;
        int i7 = 2 % 2;
        String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1863601613);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(d) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i8 = onNavigationEvent + 113;
                onExtraCallbackWithResult = i8 % 128;
                i6 = i8 % 2 != 0 ? 8 : 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                graphicDeviceInfo2 = graphicDeviceInfo;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo2)) {
                    int i10 = onNavigationEvent;
                    int i11 = i10 + 51;
                    onExtraCallbackWithResult = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = i10 + 49;
                    onExtraCallbackWithResult = i13 % 128;
                    int i14 = i13 % 2;
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            i5 = i3;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 147) == 146, i5 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                graphicDeviceInfo3 = graphicDeviceInfo2;
            } else {
                GraphicDeviceInfo graphicDeviceInfoIAuthTabCallbackStub = i9 != 0 ? isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub() : graphicDeviceInfo2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1863601613, i5, -1, "im.toss.tosssecurities.uikit.compound.news.RelatedStockText (SecuritiesNewRow.kt:95)");
                }
                double d2 = d / 100.0d;
                boolean z2 = (i5 & 14) == 4;
                if ((i5 & 112) == 32) {
                    int i15 = onNavigationEvent + 7;
                    onExtraCallbackWithResult = i15 % 128;
                    int i16 = i15 % 2;
                    z = true;
                } else {
                    z = false;
                }
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((z2 | z) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    if (d > 0.0d) {
                        str2 = "+";
                    }
                    objOnMinimized = str + " " + str2 + discard.onExtraCallback.onExtraCallback().format(d2);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                String str3 = (String) objOnMinimized;
                if (d2 == 0.0d) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(80228835);
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    if (!(!((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue())) {
                        int i17 = onNavigationEvent + 105;
                        onExtraCallbackWithResult = i17 % 128;
                        int i18 = i17 % 2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(80230138);
                        jOnUnminimized = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(80231098);
                        jOnUnminimized = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onUnminimized();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    if (d2 > 0.0d) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(80232673);
                        y3ExternalSyntheticLambda0 y3externalsyntheticlambda02 = y3ExternalSyntheticLambda0.onExtraCallback;
                        if (!((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda02, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(80234905);
                            jOnUnminimized = y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).IEngagementSignalsCallbackStub();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(80233977);
                            jOnUnminimized = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -1572738860, OverseasRrnInputTextField.IAuthTabCallback(), 1572738861)).longValue();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else if (d2 < 0.0d) {
                        int i19 = onNavigationEvent + 27;
                        onExtraCallbackWithResult = i19 % 128;
                        if (i19 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(80236922);
                            objOnExtraCallbackWithResult = addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 94)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(80236922);
                            objOnExtraCallbackWithResult = addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1237084257, OverseasRrnInputTextField.IAuthTabCallback(), -1237084255);
                        }
                        jOnUnminimized = ((Long) objOnExtraCallbackWithResult).longValue();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(80237891);
                        y3ExternalSyntheticLambda0 y3externalsyntheticlambda03 = y3ExternalSyntheticLambda0.onExtraCallback;
                        if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda03, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                            int i20 = onExtraCallbackWithResult + 63;
                            onNavigationEvent = i20 % 128;
                            if (i20 % 2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(80239194);
                                jOnUnminimized = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda03.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 21)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(80239194);
                                jOnUnminimized = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda03.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(80240154);
                            jOnUnminimized = y3externalsyntheticlambda03.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).onUnminimized();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        int i21 = onNavigationEvent + 107;
                        onExtraCallbackWithResult = i21 % 128;
                        if (i21 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            int i22 = 56 / 0;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str3, null, AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), Long.valueOf(jOnUnminimized), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoIAuthTabCallbackStub, null, cameraCaptureResultEmptyCameraCaptureResult2, 0, Integer.valueOf((i5 << 9) & 458752), 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i23 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
                        onNavigationEvent = i23 % 128;
                        if (i23 % 2 == 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    int i24 = onNavigationEvent + 47;
                    onExtraCallbackWithResult = i24 % 128;
                    int i25 = i24 % 2;
                    graphicDeviceInfo3 = graphicDeviceInfoIAuthTabCallbackStub;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str3, null, AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), Long.valueOf(jOnUnminimized), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoIAuthTabCallbackStub, null, cameraCaptureResultEmptyCameraCaptureResult2, 0, Integer.valueOf((i5 << 9) & 458752), 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                int i242 = onNavigationEvent + 47;
                onExtraCallbackWithResult = i242 % 128;
                int i252 = i242 % 2;
                graphicDeviceInfo3 = graphicDeviceInfoIAuthTabCallbackStub;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.news.SecuritiesNewRowKt$$ExternalSyntheticLambda4
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i26 = 2 % 2;
                        int i27 = onNavigationEvent + 73;
                        onWarmupCompleted = i27 % 128;
                        if (i27 % 2 != 0) {
                            return AFf1uSDK.onNavigationEvent(d, str, graphicDeviceInfo3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        }
                        AFf1uSDK.onNavigationEvent(d, str, graphicDeviceInfo3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        throw null;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        graphicDeviceInfo2 = graphicDeviceInfo;
        i5 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i5 & 147) == 146, i5 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1467511988);
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(i != 0, i & 1)) {
            int i3 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallbackWithResult + 47;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1467511988, i, -1, "im.toss.tosssecurities.uikit.compound.news.NewRowPreview (SecuritiesNewRow.kt:117)");
            }
            AFf1qSDK aFf1qSDK = AFf1qSDK.IAuthTabCallback;
            Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2IAuthTabCallback = aFf1qSDK.IAuthTabCallback();
            Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2OnWarmupCompleted = aFf1qSDK.onWarmupCompleted();
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.tosssecurities.uikit.compound.news.SecuritiesNewRowKt$$ExternalSyntheticLambda2
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i7 = 2 % 2;
                        int i8 = IAuthTabCallback + 33;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitOnWarmupCompleted = AFf1uSDK.onWarmupCompleted();
                        int i10 = onWarmupCompleted + 63;
                        IAuthTabCallback = i10 % 128;
                        if (i10 % 2 == 0) {
                            return unitOnWarmupCompleted;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                int i7 = onExtraCallbackWithResult + 11;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
            }
            IAuthTabCallback(function2IAuthTabCallback, function2OnWarmupCompleted, null, _UrlKt.FRAGMENT_ENCODE_SET, (Function0) objOnMinimized, CollectionsKt__CollectionsKt.listOf((Object[]) new Function2[]{aFf1qSDK.onExtraCallbackWithResult(), aFf1qSDK.onExtraCallback()}), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 224310, 4);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.news.SecuritiesNewRowKt$$ExternalSyntheticLambda3
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i9 = 2 % 2;
                    int i10 = onExtraCallback + 11;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitIAuthTabCallback = AFf1uSDK.IAuthTabCallback(i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i12 = onExtraCallback + 61;
                    onExtraCallbackWithResult = i12 % 128;
                    int i13 = i12 % 2;
                    return unitIAuthTabCallback;
                }
            });
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(List list, CameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0 cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {list, cameraCaptureSessionCompatStateCallbackExecutorWrapperExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 922677052, -922677051, iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), objArr);
    }

    private static final Unit onExtraCallback(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 2071697857, -2071697857, iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), objArr);
    }
}
