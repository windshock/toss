package o;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.tmoney.a;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.tds.compose.component.compound.listrow.v1.LeftPreset$;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.KeylinesKtExternalSyntheticLambda1;
import o.QuirksExternalSyntheticBackport0;
import o.getBacktraceNote;
import o.getViewTypeCount;
import o.handleNativeAdClick;
import o.setByteOrder;
import o.toPreviewOnlyRange;
import o.w3b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class w3b {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    public static final w3b onNavigationEvent = new w3b();
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 85;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnTransact = onTransact(getbacktracenote, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 21;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws NoWhenBranchMatchedException {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = ~i2;
        int i11 = i9 | (~(i10 | i4));
        int i12 = i8 | i6;
        int i13 = ~(i12 | i2);
        int i14 = (~(i4 | i7)) | (~(i8 | i10)) | (~i12);
        int i15 = i6 + i2 + i3 + (1650861130 * i5) + ((-924421097) * i);
        int i16 = i15 * i15;
        int i17 = ((i6 * (-959335331)) - 587927435) + (i2 * (-959335331)) + (i11 * 462) + (i13 * (-462)) + (i14 * 462) + ((-959334869) * i3) + (22983790 * i5) + (637852125 * i) + (i16 * (-1124859904));
        int i18 = (i6 * (-405912681)) + 1474035712 + ((-405912681) * i2) + (i11 * (-1619411862)) + (1619411862 * i13) + ((-1619411862) * i14) + ((-2025324544) * i3) + (986710016 * i5) + ((-948436992) * i) + ((-1864630272) * i16) + (i17 * i17 * (-1807482880));
        if (i18 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i18 == 2) {
            long jLongValue = ((Number) objArr[0]).longValue();
            long jLongValue2 = ((Number) objArr[1]).longValue();
            GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[2];
            String str = (String) objArr[3];
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[4];
            RowScope rowScope = (RowScope) objArr[5];
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
            int iIntValue = ((Number) objArr[7]).intValue();
            int i19 = 2 % 2;
            int i20 = onExtraCallback + 125;
            IAuthTabCallback = i20 % 128;
            int i21 = i20 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(jLongValue, jLongValue2, graphicDeviceInfo, str, quirksExternalSyntheticBackport0, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            int i22 = onExtraCallback + 51;
            IAuthTabCallback = i22 % 128;
            int i23 = i22 % 2;
            return unitOnNavigationEvent;
        }
        if (i18 == 3) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i18 != 4) {
            return i18 != 5 ? onWarmupCompleted(objArr) : onExtraCallback(objArr);
        }
        long jLongValue3 = ((Number) objArr[0]).longValue();
        long jLongValue4 = ((Number) objArr[1]).longValue();
        GraphicDeviceInfo graphicDeviceInfo2 = (GraphicDeviceInfo) objArr[2];
        String str2 = (String) objArr[3];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[4];
        RowScope rowScope2 = (RowScope) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue2 = ((Number) objArr[7]).intValue();
        int i24 = 2 % 2;
        int i25 = IAuthTabCallback + 91;
        onExtraCallback = i25 % 128;
        int i26 = i25 % 2;
        Intrinsics.checkNotNullParameter(rowScope2, "");
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
            int i27 = onExtraCallback + 51;
            IAuthTabCallback = i27 % 128;
            int i28 = i27 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(403814979, iIntValue2, -1, "im.toss.tds.compose.component.compound.listrow.v1.LeftPreset.Text.<anonymous> (LeftPreset.kt:463)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str2, quirksExternalSyntheticBackport02, new getHumanReadableName(jLongValue3, jLongValue4, graphicDeviceInfo2, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult2, 3072, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i29 = IAuthTabCallback + 109;
                onExtraCallback = i29 % 128;
                int i30 = i29 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i31 = IAuthTabCallback + 59;
        onExtraCallback = i31 % 128;
        int i32 = i31 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        long jLongValue2 = ((Number) objArr[1]).longValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[2];
        String str = (String) objArr[3];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[4];
        RowScope rowScope = (RowScope) objArr[5];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {Long.valueOf(jLongValue), Long.valueOf(jLongValue2), graphicDeviceInfo, str, quirksExternalSyntheticBackport0, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        Unit unit = (Unit) onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1060940805, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1060940801, objArr2);
        int i4 = IAuthTabCallback + 93;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 83;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getbacktracenote, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 97;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 33;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(getbacktracenote, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 55;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(long j, long j2, GraphicDeviceInfo graphicDeviceInfo, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 11;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(j, j2, graphicDeviceInfo, str, quirksExternalSyntheticBackport0, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 60 / 0;
        }
        int i6 = IAuthTabCallback + 23;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private w3b() {
    }

    public final void onExtraCallbackWithResult(@NotNull Object obj, @NotNull getViewTypeCount.onExtraCallbackWithResult onextracallbackwithresult, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, int i, float f, long j3, @Nullable getBacktraceNote<? super setPrivacyIconUri, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, float f2, @Nullable Function0<Unit> function0, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3, int i4) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long jOnTransact;
        long jOnExtraCallbackWithResult;
        getBacktraceNote<? super setPrivacyIconUri, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2;
        float f3;
        long jOnExtraCallback;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if ((i4 & 4) != 0) {
            int i6 = onExtraCallback + 103;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        if ((i4 & 8) != 0) {
            int i8 = IAuthTabCallback + 117;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
            int i10 = IAuthTabCallback + 99;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
        } else {
            jOnTransact = j;
        }
        long jOnTransact2 = (i4 & 16) != 0 ? setByteOrder.Companion.onTransact() : j2;
        int i12 = (i4 & 32) != 0 ? 1 : i;
        float f4 = (i4 & 64) != 0 ? 1.0f : f;
        if ((i4 & 128) != 0) {
            jOnExtraCallbackWithResult = setByteOrder.Companion.onTransact();
        } else {
            int i13 = IAuthTabCallback + 23;
            onExtraCallback = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 2 % 3;
            }
            jOnExtraCallbackWithResult = j3;
        }
        if ((i4 & 256) != 0) {
            int i15 = onExtraCallback + 25;
            IAuthTabCallback = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 34 / 0;
            }
            getbacktracenote2 = null;
        } else {
            getbacktracenote2 = getbacktracenote;
        }
        float fIAuthTabCallback = (i4 & 512) != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f2;
        Function0<Unit> function02 = (i4 & 1024) != 0 ? null : function0;
        String str2 = (i4 & 2048) != 0 ? null : str;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i17 = onExtraCallback + 81;
            IAuthTabCallback = i17 % 128;
            int i18 = i17 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(712977174, i2, i3, "im.toss.tds.compose.component.compound.listrow.v1.LeftPreset.Asset (LeftPreset.kt:128)");
        }
        handleNativeAdClick.onExtraCallback onextracallbackIAuthTabCallback = x2.IAuthTabCallback(handleNativeAdClick.onExtraCallback.Companion, onextracallbackwithresult);
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2023682541);
        if (jOnExtraCallbackWithResult != 16) {
            int i19 = onExtraCallback + 77;
            f3 = f4;
            IAuthTabCallback = i19 % 128;
            int i20 = i19 % 2;
        } else {
            f3 = f4;
            jOnExtraCallbackWithResult = setMainImageAspectRatio.IAuthTabCallback.onExtraCallbackWithResult(onextracallbackIAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, 48);
        }
        long j4 = jOnExtraCallbackWithResult;
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        if (onextracallbackwithresult instanceof getViewTypeCount.onExtraCallbackWithResult.asInterface) {
            int i21 = onExtraCallback + 51;
            IAuthTabCallback = i21 % 128;
            if (i21 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1690495069);
                boolean z = obj instanceof String;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1690495069);
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException("TextShape only supports String data type");
            }
            getViewTypeCount.onExtraCallbackWithResult.asInterface asinterface = (getViewTypeCount.onExtraCallbackWithResult.asInterface) onextracallbackwithresult;
            if (asinterface == getViewTypeCount.onExtraCallbackWithResult.asInterface.onNavigationEvent.XSmall || asinterface == getViewTypeCount.onExtraCallbackWithResult.asInterface.IAuthTabCallback.XSmall) {
                jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(10);
            } else if (asinterface == getViewTypeCount.onExtraCallbackWithResult.asInterface.onNavigationEvent.Small || asinterface == getViewTypeCount.onExtraCallbackWithResult.asInterface.IAuthTabCallback.Small) {
                jOnExtraCallback = AppLovinPostbackService.onExtraCallbackWithResult.onWarmupCompleted().IAuthTabCallbackStub();
            } else {
                int i22 = onExtraCallback + 7;
                IAuthTabCallback = i22 % 128;
                if (i22 % 2 != 0) {
                    getViewTypeCount.onExtraCallbackWithResult.asInterface.onNavigationEvent onnavigationevent = getViewTypeCount.onExtraCallbackWithResult.asInterface.onNavigationEvent.Medium;
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                if (asinterface != getViewTypeCount.onExtraCallbackWithResult.asInterface.onNavigationEvent.Medium && asinterface != getViewTypeCount.onExtraCallbackWithResult.asInterface.IAuthTabCallback.Medium) {
                    throw new NoWhenBranchMatchedException();
                }
                jOnExtraCallback = AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel().IAuthTabCallbackStub();
            }
            setMainImageUri.onExtraCallbackWithResult(a.3.onWarmupCompleted(), new Object[]{(String) obj, IAuthTabCallback(quirksExternalSyntheticBackport02), onextracallbackIAuthTabCallback, null, Long.valueOf(jOnTransact), Long.valueOf(jOnExtraCallback), isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), Long.valueOf(j4), getbacktracenote2, Float.valueOf(fIAuthTabCallback), function02, str2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf((i2 & 234881024) | (i2 & 14) | 1572864 | ((i2 << 3) & 57344) | (i2 & 1879048192)), Integer.valueOf(i3 & 126), 8}, -546537532, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 546537539);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1691587199);
            int i23 = i3 << 3;
            setMainImageUri.IAuthTabCallback(obj, ((obj instanceof String) && StringsKt.endsWith((String) obj, ".json", true)) ? deprecated_eventListenerFactory.Lottie : x2.onExtraCallback(deprecated_eventListenerFactory.Companion, onextracallbackwithresult), IAuthTabCallback(quirksExternalSyntheticBackport02), onextracallbackIAuthTabCallback, jOnTransact2, i12, f3, null, j4, getbacktracenote2, fIAuthTabCallback, function02, str2, cameraCaptureResultEmptyCameraCaptureResult, (4186126 & i2) | ((i2 << 3) & 1879048192), ((i2 >> 27) & 14) | (i23 & 112) | (i23 & 896), 128);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i24 = onExtraCallback + 115;
            IAuthTabCallback = i24 % 128;
            int i25 = i24 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void onNavigationEvent(@NotNull Object obj, @NotNull deprecated_eventListenerFactory deprecated_eventlistenerfactory, @NotNull handleNativeAdClick.onExtraCallback onextracallback, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, int i, float f, long j2, float f2, @Nullable Function0<Unit> function0, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3, int i4) {
        int i5;
        long jOnExtraCallbackWithResult;
        Function0<Unit> function02;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(deprecated_eventlistenerfactory, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i4 & 8) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        long jOnTransact = (i4 & 16) != 0 ? setByteOrder.Companion.onTransact() : j;
        if ((i4 & 32) != 0) {
            int i7 = onExtraCallback + 91;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            i5 = 1;
        } else {
            i5 = i;
        }
        float f3 = (i4 & 64) != 0 ? 1.0f : f;
        if ((i4 & 128) != 0) {
            int i9 = IAuthTabCallback + 65;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            jOnExtraCallbackWithResult = setMainImageAspectRatio.IAuthTabCallback.onExtraCallbackWithResult(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, ((i2 >> 6) & 14) | 48);
        } else {
            jOnExtraCallbackWithResult = j2;
        }
        float fIAuthTabCallback = (i4 & 256) != 0 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f) : f2;
        if ((i4 & 512) != 0) {
            int i11 = onExtraCallback + 95;
            IAuthTabCallback = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 86 / 0;
            }
            function02 = null;
        } else {
            function02 = function0;
        }
        String str2 = (i4 & 1024) != 0 ? null : str;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(145450161, i2, i3, "im.toss.tds.compose.component.compound.listrow.v1.LeftPreset.Asset (LeftPreset.kt:193)");
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = IAuthTabCallback(quirksExternalSyntheticBackport02);
        int i13 = i2 << 3;
        setMainImageUri.IAuthTabCallback(obj, deprecated_eventlistenerfactory, quirksExternalSyntheticBackport0IAuthTabCallback, onextracallback, jOnTransact, i5, f3, null, jOnExtraCallbackWithResult, null, fIAuthTabCallback, function02, str2, cameraCaptureResultEmptyCameraCaptureResult, (i13 & 234881024) | (i13 & 7168) | (i2 & 126) | (i2 & 57344) | (i2 & 458752) | (i2 & 3670016), ((i2 >> 24) & 126) | ((i3 << 6) & 896), 640);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i14 = IAuthTabCallback + 5;
            onExtraCallback = i14 % 128;
            int i15 = i14 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i16 = IAuthTabCallback + 113;
        onExtraCallback = i16 % 128;
        int i17 = i16 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        setMainImageAspectRatio setmainimageaspectratio;
        int i;
        w3b w3bVar = (w3b) objArr[0];
        handleNativeAdClick.onExtraCallback onextracallback = (handleNativeAdClick.onExtraCallback) objArr[1];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = (QuirksExternalSyntheticBackport0) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[4];
        float fFloatValue = ((Number) objArr[5]).floatValue();
        Function0 function0 = (Function0) objArr[6];
        String str = (String) objArr[7];
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[8];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue = ((Number) objArr[10]).intValue();
        int iIntValue2 = ((Number) objArr[11]).intValue();
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(getbacktracenote2, "");
        if ((iIntValue2 & 2) != 0) {
            int i5 = onExtraCallback + 23;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
        }
        if ((iIntValue2 & 4) != 0) {
            int i7 = onExtraCallback + 81;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 != 0) {
                setmainimageaspectratio = setMainImageAspectRatio.IAuthTabCallback;
                i = (iIntValue & 81) | 41;
            } else {
                setmainimageaspectratio = setMainImageAspectRatio.IAuthTabCallback;
                i = (iIntValue & 14) | 48;
            }
            jLongValue = setmainimageaspectratio.onExtraCallbackWithResult(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        if ((iIntValue2 & 8) != 0) {
            int i8 = onExtraCallback + 53;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            getbacktracenote = null;
        }
        if ((iIntValue2 & 16) != 0) {
            fFloatValue = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        if ((iIntValue2 & 32) != 0) {
            function0 = null;
        }
        if ((iIntValue2 & 64) != 0) {
            str = null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = IAuthTabCallback + 71;
            onExtraCallback = i9 % 128;
            if (i9 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1759640901, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.LeftPreset.Asset (LeftPreset.kt:220)");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1759640901, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.LeftPreset.Asset (LeftPreset.kt:220)");
        }
        setMainImageUri.onExtraCallbackWithResult(w3bVar.IAuthTabCallback(onextracallback2), onextracallback, jLongValue, getbacktracenote, fFloatValue, function0, str, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, (29360128 & iIntValue) | ((iIntValue << 3) & 112) | (iIntValue & 896) | (iIntValue & 7168) | (57344 & iIntValue) | (458752 & iIntValue) | (iIntValue & 3670016), 0);
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return null;
        }
        CameraConfigExternalSyntheticLambda0.onTransact();
        return null;
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        immediateFailedFuture immediatefailedfuture2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        long jOnTransact = (i2 & 4) != 0 ? setByteOrder.Companion.onTransact() : j;
        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = (i2 & 8) != 0 ? QuirkSettingsLoader.Companion.onExtraCallback() : quirkSettingsLoader;
        if ((i2 & 16) != 0) {
            immediateFailedFuture immediatefailedfutureIAuthTabCallback = immediateFailedFuture.Companion.IAuthTabCallback();
            int i4 = onExtraCallback + 75;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 3;
            }
            immediatefailedfuture2 = immediatefailedfutureIAuthTabCallback;
        } else {
            immediatefailedfuture2 = immediatefailedfuture;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2010204411, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.LeftPreset.Image (LeftPreset.kt:242)");
            int i6 = onExtraCallback + 89;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 5 % 4;
            }
        }
        onWarmupCompleted(str, quirksExternalSyntheticBackport02, jOnTransact, quirkSettingsLoaderOnExtraCallback, immediatefailedfuture2, cameraCaptureResultEmptyCameraCaptureResult, i & 524286, 0);
        if (!CameraConfigExternalSyntheticLambda0.asBinder()) {
            return;
        }
        CameraConfigExternalSyntheticLambda0.onTransact();
    }

    public final void onWarmupCompleted(@NotNull Object obj, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        immediateFailedFuture immediatefailedfutureIAuthTabCallback;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        long jOnTransact = (i2 & 4) != 0 ? setByteOrder.Companion.onTransact() : j;
        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = (i2 & 8) != 0 ? QuirkSettingsLoader.Companion.onExtraCallback() : quirkSettingsLoader;
        if ((i2 & 16) != 0) {
            int i4 = IAuthTabCallback + 113;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            immediatefailedfutureIAuthTabCallback = immediateFailedFuture.Companion.IAuthTabCallback();
        } else {
            immediatefailedfutureIAuthTabCallback = immediatefailedfuture;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1090548950, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.LeftPreset.Image (LeftPreset.kt:261)");
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) QuirksExternalSyntheticBackport0.Companion).onExtraCallback(quirksExternalSyntheticBackport02);
        int i6 = i << 12;
        AppLovinNativeAdImplc.onExtraCallback(obj, jOnTransact, quirksExternalSyntheticBackport0OnExtraCallback, (String) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit>) null, quirkSettingsLoaderOnExtraCallback, immediatefailedfutureIAuthTabCallback, (Painter) null, cameraCaptureResultEmptyCameraCaptureResult, ((i >> 3) & 112) | (i & 14) | (29360128 & i6) | (i6 & 234881024), 632);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = IAuthTabCallback + 83;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void onWarmupCompleted(@NotNull String str, int i, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable QuirkSettingsLoader quirkSettingsLoader, @Nullable immediateFailedFuture immediatefailedfuture, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2, int i3) {
        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback;
        immediateFailedFuture immediatefailedfutureIAuthTabCallback;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i3 & 4) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i3 & 8) != 0) {
            int i5 = onExtraCallback + 49;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                QuirkSettingsLoader.Companion.onExtraCallback();
                throw null;
            }
            quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
        } else {
            quirkSettingsLoaderOnExtraCallback = quirkSettingsLoader;
        }
        if ((i3 & 16) != 0) {
            int i6 = onExtraCallback + 61;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            immediatefailedfutureIAuthTabCallback = immediateFailedFuture.Companion.IAuthTabCallback();
        } else {
            immediatefailedfutureIAuthTabCallback = immediatefailedfuture;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-399805247, i2, -1, "im.toss.tds.compose.component.compound.listrow.v1.LeftPreset.Lottie (LeftPreset.kt:282)");
        }
        AppLovinStarRatingView.IAuthTabCallback(str, onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) QuirksExternalSyntheticBackport0.Companion).onExtraCallback(quirksExternalSyntheticBackport02), false, false, i, 0.0f, false, 0.0f, 0.0f, quirkSettingsLoaderOnExtraCallback, immediatefailedfutureIAuthTabCallback, false, null, cameraCaptureResultEmptyCameraCaptureResult, (i2 & 14) | ((i2 << 9) & 57344) | ((i2 << 18) & 1879048192), (i2 >> 12) & 14, 6636);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void onExtraCallbackWithResult(@NotNull Object obj, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, @Nullable immediateFailedFuture immediatefailedfuture, long j, long j2, @Nullable toMetersPerSecond tometerspersecond, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        immediateFailedFuture immediatefailedfuture2;
        long jOnTransact;
        toMetersPerSecond tometerspersecondOnWarmupCompleted;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        float fOnExtraCallback = (i2 & 4) != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f;
        if ((i2 & 8) != 0) {
            int i4 = onExtraCallback + 77;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            immediateFailedFuture immediatefailedfutureIAuthTabCallback = immediateFailedFuture.Companion.IAuthTabCallback();
            int i6 = IAuthTabCallback + 67;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            immediatefailedfuture2 = immediatefailedfutureIAuthTabCallback;
        } else {
            immediatefailedfuture2 = immediatefailedfuture;
        }
        if ((i2 & 16) != 0) {
            int i8 = onExtraCallback + 87;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                setByteOrder.Companion.onTransact();
                throw null;
            }
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        long jOnTransact2 = (i2 & 32) != 0 ? setByteOrder.Companion.onTransact() : j2;
        if ((i2 & 64) != 0) {
            tometerspersecondOnWarmupCompleted = RoundedCornerShapeKt.onWarmupCompleted();
            int i9 = onExtraCallback + 35;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
        } else {
            tometerspersecondOnWarmupCompleted = tometerspersecond;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1922824077, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.LeftPreset.Icon (LeftPreset.kt:305)");
        }
        AppLovinNativeAdImplc.onExtraCallback(obj, jOnTransact2, IAuthTabCallback((QuirksExternalSyntheticBackport0) QuirksExternalSyntheticBackport0.Companion, fOnExtraCallback, jOnTransact, tometerspersecondOnWarmupCompleted).onExtraCallback(quirksExternalSyntheticBackport02), (String) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit>) null, (QuirkSettingsLoader) null, immediatefailedfuture2, (Painter) null, cameraCaptureResultEmptyCameraCaptureResult, (i & 14) | ((i >> 12) & 112) | ((i << 15) & 234881024), 760);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final void onExtraCallbackWithResult(@NotNull deprecated_followRedirects deprecated_followredirects, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, @Nullable immediateFailedFuture immediatefailedfuture, long j, long j2, @Nullable toMetersPerSecond tometerspersecond, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        immediateFailedFuture immediatefailedfuture2;
        long j3;
        long jOnTransact;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
        if ((i2 & 2) != 0) {
            int i4 = IAuthTabCallback + 117;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        float fOnExtraCallback = (i2 & 4) != 0 ? VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback() : f;
        if ((i2 & 8) != 0) {
            immediateFailedFuture immediatefailedfutureIAuthTabCallback = immediateFailedFuture.Companion.IAuthTabCallback();
            int i6 = IAuthTabCallback + 117;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            immediatefailedfuture2 = immediatefailedfutureIAuthTabCallback;
        } else {
            immediatefailedfuture2 = immediatefailedfuture;
        }
        if ((i2 & 16) != 0) {
            int i8 = IAuthTabCallback + 27;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                jOnTransact = setByteOrder.Companion.onTransact();
                int i9 = 84 / 0;
            } else {
                jOnTransact = setByteOrder.Companion.onTransact();
            }
            j3 = jOnTransact;
        } else {
            j3 = j;
        }
        long jOnTransact2 = (i2 & 32) != 0 ? setByteOrder.Companion.onTransact() : j2;
        toMetersPerSecond tometerspersecondOnWarmupCompleted = (i2 & 64) != 0 ? RoundedCornerShapeKt.onWarmupCompleted() : tometerspersecond;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i10 = IAuthTabCallback + 77;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-485311889, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.LeftPreset.Icon (LeftPreset.kt:327)");
        }
        onExtraCallbackWithResult((Object) deprecated_followredirects, quirksExternalSyntheticBackport02, fOnExtraCallback, immediatefailedfuture2, j3, jOnTransact2, tometerspersecondOnWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, i & 33554430, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i12 = IAuthTabCallback + 111;
            onExtraCallback = i12 % 128;
            if (i12 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            } else {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i13 = 44 / 0;
            }
        }
    }

    private static final Unit onExtraCallback(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2035347668, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.LeftPreset.Date.<anonymous>.<anonymous> (LeftPreset.kt:356)");
            }
            getbacktracenote.invoke(rowScope, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallback + 5;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(long j, long j2, GraphicDeviceInfo graphicDeviceInfo, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1947615965, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.LeftPreset.Date.<anonymous> (LeftPreset.kt:372)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, quirksExternalSyntheticBackport0, new getHumanReadableName(j, j2, graphicDeviceInfo, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, 3072, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = IAuthTabCallback + 53;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = IAuthTabCallback + 35;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 4;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = onExtraCallback + 1;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1630370474, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.LeftPreset.Rank.<anonymous>.<anonymous> (LeftPreset.kt:402)");
                int i5 = IAuthTabCallback + 9;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
            getbacktracenote.invoke(rowScope, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onExtraCallback + 37;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i8 = 74 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public final void IAuthTabCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        long j3;
        long jOnNavigationEvent;
        long jOnTransact;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 83;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        if ((i2 & 4) != 0) {
            int i6 = onExtraCallback + 13;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                jOnTransact = setByteOrder.Companion.onTransact();
                int i7 = 27 / 0;
            } else {
                jOnTransact = setByteOrder.Companion.onTransact();
            }
            j3 = jOnTransact;
        } else {
            j3 = j;
        }
        Object obj = null;
        if ((i2 & 8) != 0) {
            int i8 = onExtraCallback + 45;
            IAuthTabCallback = i8 % 128;
            if (i8 % 2 != 0) {
                AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                obj.hashCode();
                throw null;
            }
            jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        } else {
            jOnNavigationEvent = j2;
        }
        GraphicDeviceInfo graphicDeviceInfo2 = (i2 & 16) != 0 ? null : graphicDeviceInfo;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = onExtraCallback + 23;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1441762882, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.LeftPreset.Rank (LeftPreset.kt:415)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1441762882, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.LeftPreset.Rank (LeftPreset.kt:415)");
        }
        Object[] objArr = {this, ForwardingCameraControl.onExtraCallback(336594787, true, new LeftPreset$.ExternalSyntheticLambda1(j3, jOnNavigationEvent, graphicDeviceInfo2, str, quirksExternalSyntheticBackport02), cameraCaptureResultEmptyCameraCaptureResult, 54), null, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i >> 9) & 896) | 6), 2};
        onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1650298819, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1650298824, objArr);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i10 = onExtraCallback + 115;
        IAuthTabCallback = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(long j, long j2, GraphicDeviceInfo graphicDeviceInfo, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 47;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            z = (i & 74) != 65;
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = onExtraCallback + 27;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(336594787, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.LeftPreset.Rank.<anonymous> (LeftPreset.kt:418)");
            }
            w3a.onWarmupCompleted.onExtraCallback(str, quirksExternalSyntheticBackport0, new getHumanReadableName(j, j2, graphicDeviceInfo, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777208, (DefaultConstructorMarker) null), cameraCaptureResultEmptyCameraCaptureResult, 3072, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onTransact(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 111;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i6 = i3 + 9;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onExtraCallback + 13;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1291062315, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.LeftPreset.Text.<anonymous>.<anonymous> (LeftPreset.kt:448)");
            }
            getbacktracenote.invoke(rowScope, cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallback + 97;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public final void onExtraCallback(@NotNull final String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        final long jOnTransact;
        final long jOnNavigationEvent;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (i2 & 2) != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
        Object obj = null;
        if ((i2 & 4) != 0) {
            int i4 = IAuthTabCallback + 17;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                setByteOrder.Companion.onTransact();
                throw null;
            }
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j;
        }
        if ((i2 & 8) != 0) {
            int i5 = onExtraCallback + 91;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
                obj.hashCode();
                throw null;
            }
            jOnNavigationEvent = AvoidCaptureProcessProgressAvailabilityCheckQuirk.Companion.onNavigationEvent();
        } else {
            jOnNavigationEvent = j2;
        }
        final GraphicDeviceInfo graphicDeviceInfo2 = (i2 & 16) != 0 ? null : graphicDeviceInfo;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onExtraCallback + 99;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1411434911, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.LeftPreset.Text (LeftPreset.kt:461)");
                int i7 = 89 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1411434911, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.LeftPreset.Text (LeftPreset.kt:461)");
            }
        }
        onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(403814979, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.listrow.v1.LeftPreset$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                int i8 = 2 % 2;
                int i9 = onWarmupCompleted + 63;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                long j3 = jOnTransact;
                long j4 = jOnNavigationEvent;
                int iIntValue = ((Integer) obj4).intValue();
                Object[] objArr = {Long.valueOf(j3), Long.valueOf(j4), graphicDeviceInfo2, str, quirksExternalSyntheticBackport02, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(iIntValue)};
                int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
                Unit unit = (Unit) w3b.onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 2118560044, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -2118560041, objArr);
                int i11 = onWarmupCompleted + 51;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                return unit;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), null, cameraCaptureResultEmptyCameraCaptureResult, ((i >> 9) & 896) | 6, 2);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = IAuthTabCallback + 55;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public final QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 0.0f, w3a.onWarmupCompleted.onExtraCallback(), 0.0f, 11, (Object) null));
        int i4 = onExtraCallback + 13;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    public final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            return quirksExternalSyntheticBackport0.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f)));
        }
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        quirksExternalSyntheticBackport0.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f)));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, float f, long j, @NotNull toMetersPerSecond tometerspersecond) {
        long jIAuthTabCallbackDefault;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(tometerspersecond, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion);
        Object obj = null;
        if (j != 16) {
            int i3 = IAuthTabCallback + 29;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            jIAuthTabCallbackDefault = j;
        } else {
            jIAuthTabCallbackDefault = setByteOrder.Companion.IAuthTabCallbackDefault();
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0IAuthTabCallback, jIAuthTabCallbackDefault, tometerspersecond);
        setByteOrder.onExtraCallbackWithResult onextracallbackwithresult = setByteOrder.Companion;
        if (!setByteOrder.onExtraCallbackWithResult(j, onextracallbackwithresult.onTransact())) {
            int i4 = IAuthTabCallback + 35;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                setByteOrder.onExtraCallbackWithResult(j, onextracallbackwithresult.IAuthTabCallbackDefault());
                throw null;
            }
            i = setByteOrder.onExtraCallbackWithResult(j, onextracallbackwithresult.IAuthTabCallbackDefault()) ? 0 : 8;
        }
        float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(i);
        int i5 = IAuthTabCallback + 17;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, fIAuthTabCallback);
        if (Float.isNaN(f)) {
            int i7 = IAuthTabCallback + 119;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            f = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
        }
        return quirksExternalSyntheticBackport0.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport0OnWarmupCompleted, f));
    }

    public final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 67;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 0.0f, w3a.onWarmupCompleted.onNavigationEvent(), 0.0f, 11, (Object) null));
        int i4 = IAuthTabCallback + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    public final QuirksExternalSyntheticBackport0 onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onWarmupCompleted((QuirksExternalSyntheticBackport0) QuirksExternalSyntheticBackport0.Companion), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 1.0f, 4, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onWarmupCompleted((QuirksExternalSyntheticBackport0) QuirksExternalSyntheticBackport0.Companion), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 2, (Object) null);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent);
        int i3 = onExtraCallback + 53;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 66 / 0;
        }
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    public final QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onWarmupCompleted((QuirksExternalSyntheticBackport0) QuirksExternalSyntheticBackport0.Companion), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f), 1.0f, 4, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
            quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onWarmupCompleted((QuirksExternalSyntheticBackport0) QuirksExternalSyntheticBackport0.Companion), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(40.0f), 0.0f, 2, (Object) null);
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent);
        int i3 = onExtraCallback + 23;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        getViewTypeCount.onExtraCallbackWithResult onextracallbackwithresult = (getViewTypeCount.onExtraCallbackWithResult) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        handleNativeAdClick.onExtraCallback onextracallbackIAuthTabCallback = x2.IAuthTabCallback(handleNativeAdClick.onExtraCallback.Companion, onextracallbackwithresult);
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = QuirksExternalSyntheticBackport0.Companion;
        if (!(true ^ (onextracallbackIAuthTabCallback instanceof handleNativeAdClick.onExtraCallback.IAuthTabCallback))) {
            quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0OnExtraCallback.onExtraCallback(onNavigationEvent.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, (handleNativeAdClick.onExtraCallback.IAuthTabCallback) onextracallbackIAuthTabCallback));
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = quirksExternalSyntheticBackport0.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback);
        int i4 = onExtraCallback + 99;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback2;
    }

    public final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull handleNativeAdClick.onExtraCallback.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        handleNativeAdClick.onExtraCallback.IAuthTabCallback.C0035onExtraCallback c0035onExtraCallback = handleNativeAdClick.onExtraCallback.IAuthTabCallback.Companion;
        if (Intrinsics.areEqual(iAuthTabCallback, c0035onExtraCallback.onExtraCallback())) {
            return CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), 0.0f, 2, (Object) null);
        }
        if (!(!Intrinsics.areEqual(iAuthTabCallback, c0035onExtraCallback.onNavigationEvent()))) {
            int i4 = onExtraCallback + 33;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(3.0f), 0.0f, 2, (Object) null);
        }
        if (!Intrinsics.areEqual(iAuthTabCallback, c0035onExtraCallback.onExtraCallbackWithResult())) {
            return quirksExternalSyntheticBackport0;
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), 0.0f, 2, (Object) null);
        int i6 = IAuthTabCallback + 85;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        w3b w3bVar = (w3b) objArr[0];
        final getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        if ((iIntValue2 & 2) != 0) {
            onextracallback = QuirksExternalSyntheticBackport0.Companion;
            int i2 = onExtraCallback + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(678983246, iIntValue, -1, "im.toss.tds.compose.component.compound.listrow.v1.LeftPreset.Rank (LeftPreset.kt:390)");
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = w3bVar.onNavigationEvent((QuirksExternalSyntheticBackport0) QuirksExternalSyntheticBackport0.Companion).onExtraCallback(onextracallback);
        component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), QuirkSettingsLoader.Companion.access000(), cameraCaptureResultEmptyCameraCaptureResult, 0);
        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
            int i4 = onExtraCallback + 95;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            getAwbState.onExtraCallback();
        }
        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
        Object obj = null;
        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
            int i6 = IAuthTabCallback + 95;
            onExtraCallback = i6 % 128;
            if (i6 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                obj.hashCode();
                throw null;
            }
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
        final RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
        accessisMonitoringp accessismonitoringpOnWarmupCompleted = PreviewExternalSyntheticLambda3.onWarmupCompleted();
        Object[] objArr2 = {AppLovinPostbackService.onExtraCallbackWithResult};
        setPostviewFormatSelector.onNavigationEvent(accessismonitoringpOnWarmupCompleted.onExtraCallback(getHumanReadableName.onNavigationEvent((getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), objArr2, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextBrand, cameraCaptureResultEmptyCameraCaptureResult, 6), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null)), ForwardingCameraControl.onExtraCallback(1630370474, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.v1.LeftPreset$$ExternalSyntheticLambda4
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj2, Object obj3) {
                int i7 = 2 % 2;
                int i8 = onWarmupCompleted + 91;
                onExtraCallback = i8 % 128;
                int i9 = i8 % 2;
                getBacktraceNote getbacktracenote2 = getbacktracenote;
                if (i9 != 0) {
                    return w3b.onExtraCallbackWithResult(getbacktracenote2, rowScopeInstance, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
                Unit unitOnExtraCallbackWithResult = w3b.onExtraCallbackWithResult(getbacktracenote2, rowScopeInstance, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i10 = 57 / 0;
                return unitOnExtraCallbackWithResult;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return null;
    }

    public final void onExtraCallbackWithResult(@NotNull final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        if ((i2 & 2) != 0) {
            int i4 = onExtraCallback + 61;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i6 = onExtraCallback + 41;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(339675087, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.LeftPreset.Text (LeftPreset.kt:436)");
                int i7 = 97 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(339675087, i, -1, "im.toss.tds.compose.component.compound.listrow.v1.LeftPreset.Text (LeftPreset.kt:436)");
            }
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = onExtraCallback((QuirksExternalSyntheticBackport0) QuirksExternalSyntheticBackport0.Companion).onExtraCallback(quirksExternalSyntheticBackport02);
        component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), QuirkSettingsLoader.Companion.access000(), cameraCaptureResultEmptyCameraCaptureResult, 0);
        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
            getAwbState.onExtraCallback();
        }
        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
            int i8 = IAuthTabCallback + 89;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
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
        final RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
        accessisMonitoringp accessismonitoringpOnWarmupCompleted = PreviewExternalSyntheticLambda3.onWarmupCompleted();
        Object[] objArr = {AppLovinPostbackService.onExtraCallbackWithResult};
        setPostviewFormatSelector.onNavigationEvent(accessismonitoringpOnWarmupCompleted.onExtraCallback(getHumanReadableName.onNavigationEvent((getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), 1774283252, -1774283252, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), objArr, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextSecondary, cameraCaptureResultEmptyCameraCaptureResult, 6), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (Object) null)), ForwardingCameraControl.onExtraCallback(1291062315, true, new Function2() { // from class: im.toss.tds.compose.component.compound.listrow.v1.LeftPreset$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj2, Object obj3) {
                int i9 = 2 % 2;
                int i10 = onExtraCallbackWithResult + 89;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    w3b.IAuthTabCallback(getbacktracenote, rowScopeInstance, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                Unit unitIAuthTabCallback = w3b.IAuthTabCallback(getbacktracenote, rowScopeInstance, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i11 = onExtraCallbackWithResult + 7;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                return unitIAuthTabCallback;
            }
        }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
    }

    public static /* synthetic */ Unit onExtraCallback(long j, long j2, GraphicDeviceInfo graphicDeviceInfo, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {Long.valueOf(j), Long.valueOf(j2), graphicDeviceInfo, str, quirksExternalSyntheticBackport0, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 2118560044, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -2118560041, objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(long j, long j2, GraphicDeviceInfo graphicDeviceInfo, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {Long.valueOf(j), Long.valueOf(j2), graphicDeviceInfo, str, quirksExternalSyntheticBackport0, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 402150474, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -402150472, objArr);
    }

    private static final Unit onTransact(long j, long j2, GraphicDeviceInfo graphicDeviceInfo, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {Long.valueOf(j), Long.valueOf(j2), graphicDeviceInfo, str, quirksExternalSyntheticBackport0, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Unit) onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1060940805, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1060940801, objArr);
    }

    public final void onWarmupCompleted(@NotNull handleNativeAdClick.onExtraCallback onextracallback, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, @Nullable getBacktraceNote<? super setPrivacyIconUri, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, float f, @Nullable Function0<Unit> function0, @Nullable String str, @NotNull getBacktraceNote<? super AppLovinNativeAdImplExternalSyntheticLambda0, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        Object[] objArr = {this, onextracallback, quirksExternalSyntheticBackport0, Long.valueOf(j), getbacktracenote, Float.valueOf(f), function0, str, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -57560907, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 57560907, objArr);
    }

    public final void IAuthTabCallback(@NotNull getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws NoWhenBranchMatchedException {
        Object[] objArr = {this, getbacktracenote, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1650298819, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), iOnExtraCallback, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1650298824, objArr);
    }

    public final QuirksExternalSyntheticBackport0 onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull getViewTypeCount.onExtraCallbackWithResult onextracallbackwithresult) {
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        int iOnExtraCallback3 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (QuirksExternalSyntheticBackport0) onExtraCallbackWithResult(LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1456947160, iOnExtraCallback2, iOnExtraCallback, iOnExtraCallback3, 1456947161, new Object[]{this, quirksExternalSyntheticBackport0, onextracallbackwithresult});
    }
}
