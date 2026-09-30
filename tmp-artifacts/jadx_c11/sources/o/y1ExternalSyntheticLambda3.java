package o;

import androidx.compose.foundation.layout.RowScope;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import im.toss.tds.compose.component.compound.top.v2.SubtitlePreset$;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda2;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.oExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class y1ExternalSyntheticLambda3 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final y1ExternalSyntheticLambda3 onExtraCallbackWithResult = new y1ExternalSyntheticLambda3();
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 115;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws NoWhenBranchMatchedException {
        long j;
        long jOnTransact;
        y1ExternalSyntheticLambda5 y1externalsyntheticlambda5;
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = (~(i7 | i8)) | i;
        int i10 = ~(i2 | i4);
        int i11 = i9 | i10;
        int i12 = ~i;
        int i13 = (~(i12 | i4)) | (~(i12 | i2)) | i10;
        int i14 = (~(i7 | i4)) | (~(i8 | i2));
        int i15 = i2 + i4 + i6 + (1040777104 * i5) + ((-1861505373) * i3);
        int i16 = i15 * i15;
        int i17 = (i2 * (-1036928585)) + 527892480 + ((-1036928585) * i4) + ((-562525036) * i11) + (562525036 * i13) + ((-281262518) * i14) + ((-1318191104) * i6) + (1608515584 * i5) + ((-1123418112) * i3) + ((-2114519040) * i16);
        int i18 = (i2 * 1703033811) + 1712528133 + (i4 * 1703033811) + (i11 * 1508) + (i13 * (-1508)) + (i14 * 754) + (1703034565 * i6) + ((-2114876976) * i5) + (1880022383 * i3) + (i16 * (-720175104));
        int i19 = 6;
        if (i17 + (i18 * i18 * (-739180544)) == 1) {
            y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) objArr[0];
            String str = (String) objArr[1];
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[2];
            long jLongValue = ((Number) objArr[3]).longValue();
            long jLongValue2 = ((Number) objArr[4]).longValue();
            GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[5];
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
            int iIntValue = ((Number) objArr[7]).intValue();
            int iIntValue2 = ((Number) objArr[8]).intValue();
            int i20 = 2 % 2;
            int i21 = IAuthTabCallback + 101;
            onNavigationEvent = i21 % 128;
            int i22 = i21 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = (iIntValue2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : onextracallback;
            if ((iIntValue2 & 4) != 0) {
                long jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                int i23 = onNavigationEvent + 39;
                IAuthTabCallback = i23 % 128;
                if (i23 % 2 != 0) {
                    int i24 = 2 / 2;
                }
                j = jOnNavigationEvent;
            } else {
                j = jLongValue;
            }
            long jOnTransact2 = (iIntValue2 & 8) != 0 ? setByteOrder.Companion.onTransact() : jLongValue2;
            GraphicDeviceInfo graphicDeviceInfo2 = (iIntValue2 & 16) != 0 ? null : graphicDeviceInfo;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1878731968, iIntValue, -1, "im.toss.tds.compose.component.compound.top.v2.SubtitlePreset.Paragraph (SubtitlePreset.kt:106)");
            }
            y1externalsyntheticlambda3.onExtraCallbackWithResult(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), onextracallback2, j, jOnTransact2, graphicDeviceInfo2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue & 524272, 0);
            if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
                return null;
            }
            CameraConfigExternalSyntheticLambda0.onTransact();
            return null;
        }
        hasProvider hasprovider = (hasProvider) objArr[1];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = (QuirksExternalSyntheticBackport0) objArr[2];
        Function0 function0 = (Function0) objArr[3];
        long jLongValue3 = ((Number) objArr[4]).longValue();
        getHumanReadableName gethumanreadablename = (getHumanReadableName) objArr[5];
        long jLongValue4 = ((Number) objArr[6]).longValue();
        long jLongValue5 = ((Number) objArr[7]).longValue();
        GraphicDeviceInfo graphicDeviceInfo3 = (GraphicDeviceInfo) objArr[8];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue3 = ((Number) objArr[10]).intValue();
        int iIntValue4 = ((Number) objArr[11]).intValue();
        int i25 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback4 = (iIntValue4 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : onextracallback3;
        if ((iIntValue4 & 4) != 0) {
            int i26 = onNavigationEvent + 91;
            IAuthTabCallback = i26 % 128;
            int i27 = i26 % 2;
            function0 = null;
        }
        if ((iIntValue4 & 8) != 0) {
            int i28 = onNavigationEvent + 109;
            IAuthTabCallback = i28 % 128;
            if (i28 % 2 != 0) {
                y1externalsyntheticlambda5 = y1ExternalSyntheticLambda5.onNavigationEvent;
                i19 = 17;
            } else {
                y1externalsyntheticlambda5 = y1ExternalSyntheticLambda5.onNavigationEvent;
            }
            jLongValue3 = y1externalsyntheticlambda5.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, i19);
        }
        long j2 = jLongValue3;
        if ((iIntValue4 & 16) != 0) {
            gethumanreadablename = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
        }
        if ((iIntValue4 & 32) != 0) {
            int i29 = onNavigationEvent + 21;
            IAuthTabCallback = i29 % 128;
            int i30 = i29 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = jLongValue4;
        }
        long jOnNavigationEvent2 = (iIntValue4 & 64) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : jLongValue5;
        if ((iIntValue4 & 128) != 0) {
            graphicDeviceInfo3 = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1439501484, iIntValue3, -1, "im.toss.tds.compose.component.compound.top.v2.SubtitlePreset.Selector (SubtitlePreset.kt:127)");
        }
        int i31 = iIntValue3 >> 3;
        y1ExternalSyntheticLambda7.onWarmupCompleted(hasprovider, onextracallback4, function0, gethumanreadablename, jOnTransact, jOnNavigationEvent2, j2, graphicDeviceInfo3, 0.0f, cameraCaptureResultEmptyCameraCaptureResult2, (29360128 & iIntValue3) | (i31 & 458752) | (iIntValue3 & 1022) | (i31 & 7168) | (57344 & i31) | ((iIntValue3 << 9) & 3670016), 256);
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return null;
        }
        CameraConfigExternalSyntheticLambda0.onTransact();
        return null;
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback();
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent();
        int i3 = onNavigationEvent + 75;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 65 / 0;
        }
        return unitOnNavigationEvent;
    }

    private y1ExternalSyntheticLambda3() {
    }

    public final void onExtraCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        if ((i2 & 1) != 0) {
            int i4 = onNavigationEvent + 7;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onNavigationEvent + 113;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1767585832, i, -1, "im.toss.tds.compose.component.compound.top.v2.SubtitlePreset.Badges (SubtitlePreset.kt:35)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1767585832, i, -1, "im.toss.tds.compose.component.compound.top.v2.SubtitlePreset.Badges (SubtitlePreset.kt:35)");
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null);
        FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
        ZslControlImplExternalSyntheticLambda2.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, focusMeteringControlExternalSyntheticLambda12.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f)), focusMeteringControlExternalSyntheticLambda12.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f)), (QuirkSettingsLoader.onWarmupCompleted) null, 0, 0, getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, ((i << 15) & 3670016) | 432, 56);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void onNavigationEvent(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onnavigationevent, @Nullable AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, @Nullable AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted onwarmupcompleted, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onNavigationEvent2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        if ((i2 & 2) != 0) {
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            int i4 = onNavigationEvent + 107;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        if ((i2 & 4) != 0) {
            int i6 = IAuthTabCallback + 123;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            onNavigationEvent2 = ((AppLovinNativeAdImplExternalSyntheticLambda2.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback())).onNavigationEvent();
        } else {
            onNavigationEvent2 = onnavigationevent;
        }
        AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = (i2 & 8) != 0 ? ((AppLovinNativeAdImplExternalSyntheticLambda2.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback())).onWarmupCompleted() : onextracallbackwithresult;
        AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted onwarmupcompletedIAuthTabCallback = (i2 & 16) != 0 ? ((AppLovinNativeAdImplExternalSyntheticLambda2.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback())).IAuthTabCallback() : onwarmupcompleted;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onNavigationEvent + 91;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(649622462, i, -1, "im.toss.tds.compose.component.compound.top.v2.SubtitlePreset.Badge (SubtitlePreset.kt:52)");
        }
        AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallbackWithResult(hasprovider, quirksExternalSyntheticBackport02, onNavigationEvent2, onextracallbackwithresultOnWarmupCompleted, onwarmupcompletedIAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, i & 65534, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onnavigationevent, @Nullable AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, @Nullable AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted onwarmupcompleted, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        AppLovinNativeAdImplExternalSyntheticLambda2.onNavigationEvent onNavigationEvent2;
        AppLovinNativeAdImplExternalSyntheticLambda2.onWarmupCompleted onwarmupcompletedIAuthTabCallback;
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 111;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            quirksExternalSyntheticBackport02 = (i2 & 4) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            if ((i2 & 2) != 0) {
            }
        }
        if ((i2 & 4) != 0) {
            int i5 = IAuthTabCallback + 95;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            onNavigationEvent2 = ((AppLovinNativeAdImplExternalSyntheticLambda2.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback())).onNavigationEvent();
        } else {
            onNavigationEvent2 = onnavigationevent;
        }
        AppLovinNativeAdImplExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresultOnWarmupCompleted = (i2 & 8) != 0 ? ((AppLovinNativeAdImplExternalSyntheticLambda2.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback())).onWarmupCompleted() : onextracallbackwithresult;
        if ((i2 & 16) != 0) {
            int i7 = onNavigationEvent + 87;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            onwarmupcompletedIAuthTabCallback = ((AppLovinNativeAdImplExternalSyntheticLambda2.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda10.onExtraCallback())).IAuthTabCallback();
        } else {
            onwarmupcompletedIAuthTabCallback = onwarmupcompleted;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = IAuthTabCallback + 73;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1505485964, i, -1, "im.toss.tds.compose.component.compound.top.v2.SubtitlePreset.Badge (SubtitlePreset.kt:70)");
        }
        onNavigationEvent(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), quirksExternalSyntheticBackport02, onNavigationEvent2, onextracallbackwithresultOnWarmupCompleted, onwarmupcompletedIAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, i & 524272, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i11 = onNavigationEvent + 111;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i12 != 0) {
                int i13 = 34 / 0;
            }
        }
    }

    public final void onExtraCallbackWithResult(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        long jOnNavigationEvent;
        long jOnTransact;
        GraphicDeviceInfo graphicDeviceInfo2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i2 & 4) != 0) {
            int i4 = onNavigationEvent + 17;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                throw null;
            }
            jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        } else {
            jOnNavigationEvent = j;
        }
        if ((i2 & 8) != 0) {
            int i5 = IAuthTabCallback + 7;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j2;
        }
        if ((i2 & 16) != 0) {
            int i7 = IAuthTabCallback + 59;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            graphicDeviceInfo2 = null;
        } else {
            graphicDeviceInfo2 = graphicDeviceInfo;
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1367475864, i, -1, "im.toss.tds.compose.component.compound.top.v2.SubtitlePreset.Paragraph (SubtitlePreset.kt:88)");
        }
        int i8 = i << 6;
        AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(hasprovider, quirksExternalSyntheticBackport02, null, jOnTransact, jOnNavigationEvent, 0L, null, null, null, 0.0f, null, null, null, 0L, 0, false, graphicDeviceInfo2, null, cameraCaptureResultEmptyCameraCaptureResult, (i & 7294) | (i8 & 57344), i8 & 3670016, 196580);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = onNavigationEvent + 37;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i11 = onNavigationEvent + 15;
        IAuthTabCallback = i11 % 128;
        int i12 = i11 % 2;
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable getHumanReadableName gethumanreadablename, long j2, long j3, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        long jOnExtraCallbackWithResult;
        getHumanReadableName gethumanreadablename2;
        long jOnTransact;
        long jOnNavigationEvent;
        List list;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i2 & 4) != 0) {
            int i4 = onNavigationEvent + 49;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            jOnExtraCallbackWithResult = y1ExternalSyntheticLambda5.onNavigationEvent.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 6);
        } else {
            jOnExtraCallbackWithResult = j;
        }
        if ((i2 & 8) != 0) {
            int i6 = onNavigationEvent + 105;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            gethumanreadablename2 = (getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted());
        } else {
            gethumanreadablename2 = gethumanreadablename;
        }
        if ((i2 & 16) != 0) {
            int i8 = onNavigationEvent + 111;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j2;
        }
        if ((i2 & 32) != 0) {
            int i10 = onNavigationEvent + 95;
            IAuthTabCallback = i10 % 128;
            if (i10 % 2 != 0) {
                AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                throw null;
            }
            jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        } else {
            jOnNavigationEvent = j3;
        }
        GraphicDeviceInfo graphicDeviceInfo2 = (i2 & 64) != 0 ? null : graphicDeviceInfo;
        Function0<Unit> function02 = (i2 & 128) != 0 ? null : function0;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i11 = IAuthTabCallback + 41;
            onNavigationEvent = i11 % 128;
            if (i11 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(851184074, i, -1, "im.toss.tds.compose.component.compound.top.v2.SubtitlePreset.Selector (SubtitlePreset.kt:151)");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(851184074, i, -1, "im.toss.tds.compose.component.compound.top.v2.SubtitlePreset.Selector (SubtitlePreset.kt:151)");
            list = null;
        } else {
            list = null;
        }
        int i12 = i << 3;
        onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), 947947530, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -947947530, new Object[]{this, new hasProvider(str, list, 2, list), quirksExternalSyntheticBackport02, function02, Long.valueOf(jOnExtraCallbackWithResult), gethumanreadablename2, Long.valueOf(jOnTransact), Long.valueOf(jOnNavigationEvent), graphicDeviceInfo2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i12 & 29360128) | ((i >> 15) & 896) | (i & 112) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (234881024 & i)), 0}, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    private static final Unit onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 35;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 71;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    public final void onWarmupCompleted(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Function0<Unit> function0, @Nullable oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        Function0<Unit> function02;
        oExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback2;
        oExternalSyntheticLambda0.IAuthTabCallback IAuthTabCallback2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(hasprovider, "");
        Object obj = null;
        if ((i2 & 2) != 0) {
            int i4 = IAuthTabCallback + 35;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                obj.hashCode();
                throw null;
            }
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        if ((i2 & 4) != 0) {
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new SubtitlePreset$.ExternalSyntheticLambda0();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            function02 = (Function0) objOnMinimized;
        } else {
            function02 = function0;
        }
        if ((i2 & 8) != 0) {
            int i5 = IAuthTabCallback + 39;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                IAuthTabCallback2 = oExternalSyntheticLambda0.IAuthTabCallback.Companion.IAuthTabCallback();
                int i6 = 89 / 0;
            } else {
                IAuthTabCallback2 = oExternalSyntheticLambda0.IAuthTabCallback.Companion.IAuthTabCallback();
            }
            iAuthTabCallback2 = IAuthTabCallback2;
        } else {
            iAuthTabCallback2 = iAuthTabCallback;
        }
        long jOnNavigationEvent = (i2 & 16) != 0 ? AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent() : j;
        long jOnTransact = (i2 & 32) != 0 ? setByteOrder.Companion.onTransact() : j2;
        GraphicDeviceInfo graphicDeviceInfo2 = (i2 & 64) != 0 ? null : graphicDeviceInfo;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-887119185, i, -1, "im.toss.tds.compose.component.compound.top.v2.SubtitlePreset.TextButton (SubtitlePreset.kt:174)");
            int i7 = IAuthTabCallback + 75;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        }
        oExternalSyntheticLambda1.onWarmupCompleted(hasprovider, quirksExternalSyntheticBackport02, jOnTransact, null, iAuthTabCallback2, 0L, null, jOnNavigationEvent, null, null, graphicDeviceInfo2, null, null, null, function02, null, null, false, cameraCaptureResultEmptyCameraCaptureResult, (i & 126) | ((i >> 9) & 896) | ((i << 3) & 57344) | ((i << 9) & 29360128), ((i >> 18) & 14) | ((i << 6) & 57344), 244584);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i9 = IAuthTabCallback + 63;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 97 / 0;
        }
    }

    private static final Unit IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 113;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void IAuthTabCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Function0<Unit> function0, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        Function0<Unit> function02;
        long j3;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i2 & 4) != 0) {
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new SubtitlePreset$.ExternalSyntheticLambda1();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            function02 = (Function0) objOnMinimized;
        } else {
            function02 = function0;
        }
        if ((i2 & 8) != 0) {
            int i4 = IAuthTabCallback + 63;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            long jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
            int i6 = IAuthTabCallback + 65;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            j3 = jOnNavigationEvent;
        } else {
            j3 = j;
        }
        long jOnTransact = (i2 & 16) != 0 ? setByteOrder.Companion.onTransact() : j2;
        GraphicDeviceInfo graphicDeviceInfo2 = (i2 & 32) != 0 ? null : graphicDeviceInfo;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(223000231, i, -1, "im.toss.tds.compose.component.compound.top.v2.SubtitlePreset.TextButton (SubtitlePreset.kt:195)");
            int i8 = IAuthTabCallback + 39;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 4;
            }
        }
        int i10 = i << 3;
        onWarmupCompleted(new hasProvider(str, (List) null, 2, (DefaultConstructorMarker) null), quirksExternalSyntheticBackport02, function02, null, j3, jOnTransact, graphicDeviceInfo2, cameraCaptureResultEmptyCameraCaptureResult, (i & 1008) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (i10 & 29360128), 8);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i11 = IAuthTabCallback + 83;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i12 == 0) {
                int i13 = 22 / 0;
            }
        }
    }

    public final void IAuthTabCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        Object[] objArr = {this, str, quirksExternalSyntheticBackport0, Long.valueOf(j), Long.valueOf(j2), graphicDeviceInfo, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        onExtraCallback(iOnExtraCallbackWithResult, -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }

    public final void onNavigationEvent(@NotNull hasProvider hasprovider, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Function0<Unit> function0, long j, @Nullable getHumanReadableName gethumanreadablename, long j2, long j3, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        Object[] objArr = {this, hasprovider, quirksExternalSyntheticBackport0, function0, Long.valueOf(j), gethumanreadablename, Long.valueOf(j2), Long.valueOf(j3), graphicDeviceInfo, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TTVideoLandingPageActivity.onExtraCallbackWithResult();
        onExtraCallback(iOnExtraCallbackWithResult, 947947530, TTVideoLandingPageActivity.onExtraCallbackWithResult(), -947947530, objArr, TTVideoLandingPageActivity.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
    }
}
