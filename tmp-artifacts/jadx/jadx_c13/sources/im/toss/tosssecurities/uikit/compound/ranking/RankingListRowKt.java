package im.toss.tosssecurities.uikit.compound.ranking;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AFf1oSDKAFa1zSDK;
import o.AFh1lSDK;
import o.AppLovinNativeAdImplExternalSyntheticLambda1;
import o.AppLovinPostbackService;
import o.AppLovinVastMediaVieweExternalSyntheticLambda0;
import o.Camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraProviderInitRetryPolicy1;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.ForwardingCameraControl;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SpannedDataExternalSyntheticLambda0;
import o.TTHistoryActivity2;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.component5;
import o.getAwbState;
import o.getBacktraceNote;
import o.getHumanReadableName;
import o.getPrivacyDestinationUri;
import o.getSubtitle;
import o.getViewTypeCount;
import o.isRepeatingEnabled;
import o.resolveQuirkNames;
import o.setByteOrder;
import o.setIconUri;
import o.setUpNativeAdViewComponents;
import o.toPreviewOnlyRange;
import o.w3a;
import o.w3b;
import o.w4;
import o.w5a;
import o.y3ExternalSyntheticLambda0;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RankingListRowKt {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(String str, AFh1lSDK.onNavigationEvent onnavigationevent, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 73;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, onnavigationevent, appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 83;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, AFh1lSDK.onNavigationEvent onnavigationevent, int i, boolean z, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, Function0 function0, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 67;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, str, onnavigationevent, i, z, deviceQuirksExternalSyntheticLambda0, getbacktracenote, getbacktracenote2, getbacktracenote3, function0, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        if (i7 != 0) {
            int i8 = 44 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(int i, getBacktraceNote getbacktracenote, String str, AFh1lSDK.onNavigationEvent onnavigationevent, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 59;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return onNavigationEvent(i, getbacktracenote, str, onnavigationevent, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onNavigationEvent(i, getbacktracenote, str, onnavigationevent, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, AFh1lSDK.onNavigationEvent onnavigationevent, int i, boolean z, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, Function0 function0, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        onExtraCallbackWithResult(quirksExternalSyntheticBackport0, str, onnavigationevent, i, z, deviceQuirksExternalSyntheticLambda0, getbacktracenote, getbacktracenote2, getbacktracenote3, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onWarmupCompleted + 21;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(String str, AFh1lSDK.onNavigationEvent onnavigationevent, AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onWarmupCompleted + 87;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(594338259, i, -1, "im.toss.tosssecurities.uikit.compound.ranking.RankingListRow.<anonymous>.<anonymous>.<anonymous> (RankingListRow.kt:65)");
                    int i4 = 44 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(594338259, i, -1, "im.toss.tosssecurities.uikit.compound.ranking.RankingListRow.<anonymous>.<anonymous>.<anonymous> (RankingListRow.kt:65)");
                }
            }
            if (str == null) {
                int i5 = onWarmupCompleted + 115;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2075922135);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(2075922136);
                getPrivacyDestinationUri.onExtraCallbackWithResult.onNavigationEvent.onExtraCallback onextracallback = getPrivacyDestinationUri.onExtraCallbackWithResult.onNavigationEvent.Companion;
                AFf1oSDKAFa1zSDK.onWarmupCompleted(str, onextracallback.onExtraCallbackWithResult().IAuthTabCallback(), null, onextracallback.onExtraCallbackWithResult().onExtraCallbackWithResult(), null, onnavigationevent, null, null, 0L, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 980);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = onWarmupCompleted + 29;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onWarmupCompleted + 69;
        IAuthTabCallback = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    private static final Unit onNavigationEvent(int i, getBacktraceNote getbacktracenote, final String str, final AFh1lSDK.onNavigationEvent onnavigationevent, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 49;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 17) != 16, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1370670807, i2, -1, "im.toss.tosssecurities.uikit.compound.ranking.RankingListRow.<anonymous> (RankingListRow.kt:47)");
            }
            QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault = QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), onwarmupcompletedIAuthTabCallbackDefault, cameraCaptureResultEmptyCameraCaptureResult, 48);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout())) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            long jIsEngagementSignalsApiAvailable = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable();
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{String.valueOf(i), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 0.0f, 11, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), Long.valueOf(jIsEngagementSignalsApiAvailable), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResult, 48, 196608, 98288}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            setIconUri.IAuthTabCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.onNavigationEvent.Companion.onExtraCallbackWithResult(), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), 0.0f, 11, (Object) null), getbacktracenote, setByteOrder.Companion.IAuthTabCallbackDefault(), 0.0f, (Function0) null, (String) null, ForwardingCameraControl.onExtraCallback(594338259, true, new getBacktraceNote() { // from class: im.toss.tosssecurities.uikit.compound.ranking.RankingListRowKt$$ExternalSyntheticLambda0
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                @Override // o.getBacktraceNote
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = 2 % 2;
                    int i7 = onWarmupCompleted + 57;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    String str2 = str;
                    if (i8 != 0) {
                        return RankingListRowKt.IAuthTabCallback(str2, onnavigationevent, (AppLovinNativeAdImplExternalSyntheticLambda1) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    Unit unitIAuthTabCallback = RankingListRowKt.IAuthTabCallback(str2, onnavigationevent, (AppLovinNativeAdImplExternalSyntheticLambda1) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i9 = 97 / 0;
                    return unitIAuthTabCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 12586038, 112);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onWarmupCompleted + 73;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i7 = 89 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallback + 13;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 51 / 0;
        }
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0152  */
    /* JADX WARN: Type inference failed for: r2v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r40v0, types: [java.lang.Object, o.getBacktraceNote<? super im.toss.tds.compose.component.compound.listrow.v1.RightPreset, ? super o.CameraCaptureResultEmptyCameraCaptureResult, ? super java.lang.Integer, kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r41v0, types: [java.lang.Object, o.getBacktraceNote<? super o.setUpNativeAdViewComponents, ? super o.CameraCaptureResultEmptyCameraCaptureResult, ? super java.lang.Integer, kotlin.Unit>] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable String str, @Nullable AFh1lSDK.onNavigationEvent onnavigationevent, int i, boolean z, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable getBacktraceNote<? super w5a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super RightPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable getBacktraceNote<? super setUpNativeAdViewComponents, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @NotNull final Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2, final int i3) {
        int i4;
        int i5;
        int iOrdinal;
        int i6;
        int i7;
        int i8;
        ?? r9;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final String str2;
        final AFh1lSDK.onNavigationEvent onnavigationevent2;
        final int i14;
        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02;
        final getBacktraceNote<? super w5a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4;
        final getBacktraceNote<? super w5a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5;
        final ?? r5;
        final getBacktraceNote<? super w5a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i15;
        final AFh1lSDK.onNavigationEvent onnavigationevent3;
        getBacktraceNote<? super w5a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote7;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda03;
        int i16;
        int i17 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1344121954);
        int i18 = i3 & 1;
        if (i18 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i19 = i3 & 2;
        if (i19 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            int i20 = IAuthTabCallback + 75;
            onWarmupCompleted = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = 1 / 0;
                i5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
            }
            i4 |= i5;
        }
        int i22 = i3 & 4;
        if (i22 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            if (onnavigationevent == null) {
                int i23 = IAuthTabCallback + 47;
                onWarmupCompleted = i23 % 128;
                int i24 = i23 % 2;
                iOrdinal = -1;
            } else {
                iOrdinal = onnavigationevent.ordinal();
            }
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(iOrdinal) ? 256 : 128;
        }
        int i25 = i3 & 8;
        if (i25 != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i)) {
                    int i26 = IAuthTabCallback + 87;
                    onWarmupCompleted = i26 % 128;
                    i6 = i26 % 2 != 0 ? 19118 : 2048;
                } else {
                    i6 = 1024;
                }
                i7 = i6 | i4;
            }
            i8 = i3 & 16;
            if (i8 == 0) {
                int i27 = onWarmupCompleted + 37;
                IAuthTabCallback = i27 % 128;
                int i28 = i27 % 2;
                i7 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    boolean z2 = z;
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? Http2.INITIAL_MAX_FRAME_SIZE : TTHistoryActivity2.SIZE;
                    r9 = z2;
                }
                i9 = i3 & 32;
                if (i9 != 0) {
                    int i29 = IAuthTabCallback + 27;
                    onWarmupCompleted = i29 % 128;
                    if (i29 % 2 != 0) {
                        i7 |= 196608;
                        int i30 = 62 / 0;
                    } else {
                        i7 |= 196608;
                    }
                } else if ((i2 & 196608) == 0) {
                    int i31 = onWarmupCompleted + 91;
                    IAuthTabCallback = i31 % 128;
                    if (i31 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0);
                        throw null;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
                        int i32 = IAuthTabCallback + 7;
                        onWarmupCompleted = i32 % 128;
                        int i33 = i32 % 2;
                        i10 = Imgproc.FLOODFILL_MASK_ONLY;
                    } else {
                        i10 = Imgproc.FLOODFILL_FIXED_RANGE;
                    }
                    i7 |= i10;
                }
                i11 = i3 & 64;
                if (i11 == 0) {
                    if ((1572864 & i2) == 0) {
                        i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 1048576 : 524288;
                    }
                    i12 = i3 & 128;
                    if (i12 == 0) {
                        i7 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback((Object) getbacktracenote2) ? 8388608 : 4194304;
                    }
                    i13 = i3 & 256;
                    if (i13 == 0) {
                        i7 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback((Object) getbacktracenote3) ? 67108864 : 33554432;
                    }
                    if ((i2 & 805306368) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                            int i34 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                            onWarmupCompleted = i34 % 128;
                            int i35 = i34 % 2;
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i7 |= i16;
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i7) == 306783378, i7 & 1)) {
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                        str2 = str;
                        onnavigationevent2 = onnavigationevent;
                        i14 = i;
                        deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
                        getbacktracenote4 = getbacktracenote;
                        getbacktracenote5 = getbacktracenote2;
                        r5 = r9;
                        getbacktracenote6 = getbacktracenote3;
                    } else {
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i18 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                        final String str3 = i19 != 0 ? null : str;
                        if (i22 != 0) {
                            int i36 = onWarmupCompleted + 51;
                            IAuthTabCallback = i36 % 128;
                            if (i36 % 2 == 0) {
                                onnavigationevent3 = AFh1lSDK.onNavigationEvent.PNG;
                                i15 = 0;
                                int i37 = 82 / 0;
                            } else {
                                i15 = 0;
                                onnavigationevent3 = AFh1lSDK.onNavigationEvent.PNG;
                            }
                        } else {
                            i15 = 0;
                            onnavigationevent3 = onnavigationevent;
                        }
                        final int i38 = i25 != 0 ? i15 : i;
                        int i39 = i8 != 0 ? i15 : r9;
                        if (i9 != 0) {
                            getbacktracenote7 = null;
                            deviceQuirksExternalSyntheticLambda03 = (DeviceQuirksExternalSyntheticLambda0) w3a.IAuthTabCallback(SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{w3a.onWarmupCompleted, Float.valueOf(0.0f), Float.valueOf(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f)), 1, null}, -998810847, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), 998810850, SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
                        } else {
                            getbacktracenote7 = null;
                            deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0;
                        }
                        getBacktraceNote<? super w5a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote8 = i11 != 0 ? getbacktracenote7 : getbacktracenote;
                        getBacktraceNote<? super w5a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote9 = i12 != 0 ? getbacktracenote7 : getbacktracenote2;
                        final getBacktraceNote<? super w5a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote10 = i13 != 0 ? getbacktracenote7 : getbacktracenote3;
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1344121954, i7, -1, "im.toss.tosssecurities.uikit.compound.ranking.RankingListRow (RankingListRow.kt:39)");
                        }
                        int i40 = i38;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        getBacktraceNote<? super w5a, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote11 = getbacktracenote10;
                        AFh1lSDK.onNavigationEvent onnavigationevent4 = onnavigationevent3;
                        String str4 = str3;
                        w4.onWarmupCompleted(getbacktracenote8, deviceQuirksExternalSyntheticLambda03, i39, quirksExternalSyntheticBackport03, ForwardingCameraControl.onExtraCallback(-1370670807, true, new getBacktraceNote() { // from class: im.toss.tosssecurities.uikit.compound.ranking.RankingListRowKt$$ExternalSyntheticLambda1
                            private static int onExtraCallbackWithResult = 1;
                            private static int onWarmupCompleted;

                            @Override // o.getBacktraceNote
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i41 = 2 % 2;
                                int i42 = onExtraCallbackWithResult + 81;
                                onWarmupCompleted = i42 % 128;
                                int i43 = i42 % 2;
                                Unit unitOnWarmupCompleted = RankingListRowKt.onWarmupCompleted(i38, getbacktracenote10, str3, onnavigationevent3, (w3b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                int i44 = onWarmupCompleted + 39;
                                onExtraCallbackWithResult = i44 % 128;
                                int i45 = i44 % 2;
                                return unitOnWarmupCompleted;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, getbacktracenote9, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, 0.0f, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (String) null, function0, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult2, ((i7 >> 18) & 14) | 24576 | ((i7 >> 12) & 112) | ((i7 >> 6) & 896) | ((i7 << 9) & 7168) | (29360128 & i7), (i7 >> 15) & 57344, 114528);
                        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                        r5 = i39;
                        deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda03;
                        getbacktracenote4 = getbacktracenote8;
                        getbacktracenote5 = getbacktracenote9;
                        i14 = i40;
                        getbacktracenote6 = getbacktracenote11;
                        onnavigationevent2 = onnavigationevent4;
                        str2 = str4;
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tosssecurities.uikit.compound.ranking.RankingListRowKt$$ExternalSyntheticLambda2
                            private static int onExtraCallback = 1;
                            private static int onNavigationEvent;

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i41 = 2 % 2;
                                int i42 = onNavigationEvent + 47;
                                onExtraCallback = i42 % 128;
                                int i43 = i42 % 2;
                                Unit unitOnExtraCallbackWithResult = RankingListRowKt.onExtraCallbackWithResult(quirksExternalSyntheticBackport02, str2, onnavigationevent2, i14, r5, deviceQuirksExternalSyntheticLambda02, getbacktracenote4, getbacktracenote5, getbacktracenote6, function0, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                int i44 = onExtraCallback + 53;
                                onNavigationEvent = i44 % 128;
                                if (i44 % 2 == 0) {
                                    return unitOnExtraCallbackWithResult;
                                }
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        });
                        int i41 = onWarmupCompleted + 85;
                        IAuthTabCallback = i41 % 128;
                        int i42 = i41 % 2;
                        return;
                    }
                    return;
                }
                i7 |= 1572864;
                i12 = i3 & 128;
                if (i12 == 0) {
                }
                i13 = i3 & 256;
                if (i13 == 0) {
                }
                if ((i2 & 805306368) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i7) == 306783378, i7 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            r9 = z;
            i9 = i3 & 32;
            if (i9 != 0) {
            }
            i11 = i3 & 64;
            if (i11 == 0) {
            }
            i12 = i3 & 128;
            if (i12 == 0) {
            }
            i13 = i3 & 256;
            if (i13 == 0) {
            }
            if ((i2 & 805306368) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i7) == 306783378, i7 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i7 = i4;
        i8 = i3 & 16;
        if (i8 == 0) {
        }
        r9 = z;
        i9 = i3 & 32;
        if (i9 != 0) {
        }
        i11 = i3 & 64;
        if (i11 == 0) {
        }
        i12 = i3 & 128;
        if (i12 == 0) {
        }
        i13 = i3 & 256;
        if (i13 == 0) {
        }
        if ((i2 & 805306368) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((306783379 & i7) == 306783378, i7 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }
}
