package o;

import android.content.Context;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import im.toss.tds.compose.component.compound.tab.v1.ItemPreset$$ExternalSyntheticLambda3;
import im.toss.tds.compose.component.compound.tab.v1.RightAccessoryPreset;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.GraphicDeviceInfo;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.addInterstitialAdapter;
import o.getSwitchMinWidth;
import o.handleNativeAdClick;
import o.noStore;
import o.r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA;
import o.r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4;
import o.setByteOrder;
import o.setCurrentIndex;
import o.toPreviewOnlyRange;
import o.updateFocusedState;
import o.useAndConfigureProgramWithTexture;
import o.x4ExternalSyntheticLambda4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x4ExternalSyntheticLambda4 {
    private static int IAuthTabCallback = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public static final x4ExternalSyntheticLambda4 onWarmupCompleted = new x4ExternalSyntheticLambda4();
    private static final accessisMonitoringp<setByteOrder> onExtraCallbackWithResult = setPostviewFormatSelector.IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda0) null, onTransact.IAuthTabCallback, 1, (Object) null);

    public static final /* synthetic */ class asBinder {
        public static final /* synthetic */ int[] onExtraCallback;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        static {
            int[] iArr = new int[r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted.values().length];
            try {
                iArr[r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted.Medium.ordinal()] = 1;
                int i = onNavigationEvent + 1;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted.Small.ordinal()] = 2;
                int i4 = onNavigationEvent + 27;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallback = iArr;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        x4ExternalSyntheticLambda4 x4externalsyntheticlambda4 = (x4ExternalSyntheticLambda4) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[2];
        long jLongValue2 = ((Number) objArr[3]).longValue();
        GraphicDeviceInfo graphicDeviceInfo2 = (GraphicDeviceInfo) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[6]).booleanValue();
        Function2 function2 = (Function2) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[9];
        int iIntValue2 = ((Number) objArr[10]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(x4externalsyntheticlambda4, jLongValue, graphicDeviceInfo, jLongValue2, graphicDeviceInfo2, zBooleanValue, zBooleanValue2, function2, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(x4externalsyntheticlambda4, jLongValue, graphicDeviceInfo, jLongValue2, graphicDeviceInfo2, zBooleanValue, zBooleanValue2, function2, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i3 = IAuthTabCallback + 31;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getBacktraceNote getbacktracenote, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z, Function0 function0, getSubtitle getsubtitle, boolean z2, onExtraCallback onextracallback, getBacktraceNote getbacktracenote2, boolean z3, getBacktraceNote getbacktracenote3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 27;
        IAuthTabCallback = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            onWarmupCompleted(getbacktracenote, quirksExternalSyntheticBackport0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, z, function0, getsubtitle, z2, onextracallback, getbacktracenote2, z3, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(getbacktracenote, quirksExternalSyntheticBackport0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, z, function0, getsubtitle, z2, onextracallback, getbacktracenote2, z3, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 45;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws NoWhenBranchMatchedException {
        int i7 = ~(i3 | i2);
        int i8 = ~(i2 | i4);
        int i9 = i7 | i8;
        int i10 = ~i3;
        int i11 = ~i2;
        int i12 = (~(i10 | i4)) | (~(i10 | i11)) | (~(i11 | i4));
        int i13 = ~i4;
        int i14 = i12 | (~(i13 | i3 | i2));
        int i15 = (~(i13 | i11)) | i3 | i8;
        int i16 = i3 + i2 + i5 + (1962400304 * i) + (1167700406 * i6);
        int i17 = i16 * i16;
        int i18 = ((i3 * (-1629562239)) - 1134582380) + (i2 * (-1629562239)) + (i9 * (-910)) + (i14 * 910) + (i15 * 910) + ((-1629561329) * i5) + ((-1621399344) * i) + ((-873382486) * i6) + (i17 * 1407582208);
        switch (((i3 * (-1019457937)) - 559939584) + ((-1019457937) * i2) + (2001489518 * i9) + (i14 * (-2001489518)) + ((-2001489518) * i15) + (1274019840 * i5) + ((-1660944384) * i) + ((-325058560) * i6) + (867827712 * i17) + (i18 * i18 * (-1895432192))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return onNavigationEvent(objArr);
            case 6:
                x4ExternalSyntheticLambda4 x4externalsyntheticlambda4 = (x4ExternalSyntheticLambda4) objArr[0];
                String str = (String) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                Function0<Unit> function0 = (Function0) objArr[3];
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[4];
                boolean zBooleanValue2 = ((Boolean) objArr[5]).booleanValue();
                boolean zBooleanValue3 = ((Boolean) objArr[6]).booleanValue();
                long jLongValue = ((Number) objArr[7]).longValue();
                GraphicDeviceInfo graphicDeviceInfo = (GraphicDeviceInfo) objArr[8];
                long jLongValue2 = ((Number) objArr[9]).longValue();
                GraphicDeviceInfo graphicDeviceInfo2 = (GraphicDeviceInfo) objArr[10];
                getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote = (getBacktraceNote) objArr[11];
                Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objArr[12];
                getSubtitle getsubtitle = (getSubtitle) objArr[13];
                int iIntValue = ((Number) objArr[14]).intValue();
                int iIntValue2 = ((Number) objArr[15]).intValue();
                int iIntValue3 = ((Number) objArr[16]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[17];
                ((Number) objArr[18]).intValue();
                int i19 = 2 % 2;
                int i20 = onNavigationEvent + 81;
                IAuthTabCallback = i20 % 128;
                x4externalsyntheticlambda4.onExtraCallback(str, zBooleanValue, function0, quirksExternalSyntheticBackport0, zBooleanValue2, zBooleanValue3, jLongValue, graphicDeviceInfo, jLongValue2, graphicDeviceInfo2, getbacktracenote, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, cameraCaptureResultEmptyCameraCaptureResult, i20 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue2), iIntValue3);
                return Unit.INSTANCE;
            default:
                x4ExternalSyntheticLambda4 x4externalsyntheticlambda42 = (x4ExternalSyntheticLambda4) objArr[0];
                deprecated_followRedirects deprecated_followredirects = (deprecated_followRedirects) objArr[1];
                String str2 = (String) objArr[2];
                boolean zBooleanValue4 = ((Boolean) objArr[3]).booleanValue();
                Function0 function02 = (Function0) objArr[4];
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) objArr[5];
                boolean zBooleanValue5 = ((Boolean) objArr[6]).booleanValue();
                boolean zBooleanValue6 = ((Boolean) objArr[7]).booleanValue();
                handleNativeAdClick.onExtraCallback onextracallback = (handleNativeAdClick.onExtraCallback) objArr[8];
                long jLongValue3 = ((Number) objArr[9]).longValue();
                long jLongValue4 = ((Number) objArr[10]).longValue();
                Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objArr[11];
                getSubtitle getsubtitle2 = (getSubtitle) objArr[12];
                int iIntValue4 = ((Number) objArr[13]).intValue();
                int iIntValue5 = ((Number) objArr[14]).intValue();
                int iIntValue6 = ((Number) objArr[15]).intValue();
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[16];
                int iIntValue7 = ((Number) objArr[17]).intValue();
                int i21 = 2 % 2;
                int i22 = onNavigationEvent + 5;
                IAuthTabCallback = i22 % 128;
                int i23 = i22 % 2;
                Unit unitOnWarmupCompleted = onWarmupCompleted(x4externalsyntheticlambda42, deprecated_followredirects, str2, zBooleanValue4, function02, quirksExternalSyntheticBackport02, zBooleanValue5, zBooleanValue6, onextracallback, jLongValue3, jLongValue4, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, getsubtitle2, iIntValue4, iIntValue5, iIntValue6, cameraCaptureResultEmptyCameraCaptureResult2, iIntValue7);
                int i24 = IAuthTabCallback + 57;
                onNavigationEvent = i24 % 128;
                int i25 = i24 % 2;
                return unitOnWarmupCompleted;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, useandconfigureprogramwithtexture);
        int i4 = onNavigationEvent + 23;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, boolean z, Function0 function0, getSubtitle getsubtitle, boolean z2, onExtraCallback onextracallback, getBacktraceNote getbacktracenote, boolean z3, getBacktraceNote getbacktracenote2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 17;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(quirksExternalSyntheticBackport0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, z, function0, getsubtitle, z2, onextracallback, getbacktracenote, z3, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 89;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, String str, boolean z, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z2, boolean z3, long j, GraphicDeviceInfo graphicDeviceInfo, long j2, GraphicDeviceInfo graphicDeviceInfo2, getBacktraceNote getbacktracenote, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 57;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        Object[] objArr = {x4externalsyntheticlambda4, str, Boolean.valueOf(z), function0, quirksExternalSyntheticBackport0, Boolean.valueOf(z2), Boolean.valueOf(z3), Long.valueOf(j), graphicDeviceInfo, Long.valueOf(j2), graphicDeviceInfo2, getbacktracenote, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        Unit unit = (Unit) onExtraCallback(setCurrentIndex.onNavigationEvent(), 358797287, -358797281, setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
        int i8 = IAuthTabCallback + 93;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 45;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        x4externalsyntheticlambda4.onExtraCallbackWithResult(onwarmupcompleted, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 97;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, boolean z, Function0 function0, onExtraCallback onextracallback, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, boolean z2, boolean z3, long j, GraphicDeviceInfo graphicDeviceInfo, long j2, GraphicDeviceInfo graphicDeviceInfo2, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws NoWhenBranchMatchedException {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 1;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        x4externalsyntheticlambda4.IAuthTabCallback(z, function0, onextracallback, quirksExternalSyntheticBackport0, getbacktracenote, z2, z3, j, graphicDeviceInfo, j2, graphicDeviceInfo2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, getbacktracenote2, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = onNavigationEvent + 15;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NoWhenBranchMatchedException {
        String str = (String) objArr[0];
        RowScope rowScope = (RowScope) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onNavigationEvent + 5;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(handleNativeAdClick.onExtraCallback onextracallback, boolean z, deprecated_followRedirects deprecated_followredirects, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 15;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(onextracallback, z, deprecated_followredirects, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 53;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, boolean z, Function0 function0, onExtraCallback onextracallback, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote, boolean z2, boolean z3, long j, GraphicDeviceInfo graphicDeviceInfo, long j2, GraphicDeviceInfo graphicDeviceInfo2, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws NoWhenBranchMatchedException {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 67;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return onExtraCallback(x4externalsyntheticlambda4, z, function0, onextracallback, quirksExternalSyntheticBackport0, getbacktracenote, z2, z3, j, graphicDeviceInfo, j2, graphicDeviceInfo2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, getbacktracenote2, getbacktracenote3, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        }
        onExtraCallback(x4externalsyntheticlambda4, z, function0, onextracallback, quirksExternalSyntheticBackport0, getbacktracenote, z2, z3, j, graphicDeviceInfo, j2, graphicDeviceInfo2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, getbacktracenote2, getbacktracenote3, i, i2, i3, cameraCaptureResultEmptyCameraCaptureResult, i4);
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getSwitchMinWidth.onExtraCallback onextracallback = (getSwitchMinWidth.onExtraCallback) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {onextracallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent3 = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent4 = setCurrentIndex.onNavigationEvent();
        if (i3 != 0) {
            return (updateFocusedState) onExtraCallback(iOnNavigationEvent3, 1517559934, -1517559933, iOnNavigationEvent, objArr2, iOnNavigationEvent2, iOnNavigationEvent4);
        }
        int i4 = 29 / 0;
        return (updateFocusedState) onExtraCallback(iOnNavigationEvent3, 1517559934, -1517559933, iOnNavigationEvent, objArr2, iOnNavigationEvent2, iOnNavigationEvent4);
    }

    public static /* synthetic */ Unit onNavigationEvent(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 81;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(getbacktracenote, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 32 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static final Unit onNavigationEvent(x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, long j, GraphicDeviceInfo graphicDeviceInfo, long j2, GraphicDeviceInfo graphicDeviceInfo2, boolean z, boolean z2, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 9;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        x4externalsyntheticlambda4.onExtraCallbackWithResult(j, graphicDeviceInfo, j2, graphicDeviceInfo2, z, z2, function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 49;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, deprecated_followRedirects deprecated_followredirects, String str, boolean z, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z2, boolean z3, handleNativeAdClick.onExtraCallback onextracallback, long j, long j2, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) throws NoWhenBranchMatchedException {
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 69;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        x4externalsyntheticlambda4.onNavigationEvent(deprecated_followredirects, str, z, function0, quirksExternalSyntheticBackport0, z2, z3, onextracallback, j, j2, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), RecomposeScopeImplKt.onExtraCallbackWithResult(i2), i3);
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallback + 69;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 17;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return onExtraCallback(x4externalsyntheticlambda4, onwarmupcompleted, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onExtraCallback(x4externalsyntheticlambda4, onwarmupcompleted, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(boolean z, Context context, Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 89;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(z, context, function0);
        int i4 = IAuthTabCallback + 97;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ updateFocusedState onWarmupCompleted(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 53;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        updateFocusedState updatefocusedstateOnExtraCallback = onExtraCallback(onextracallback, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onNavigationEvent + 41;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return updatefocusedstateOnExtraCallback;
    }

    private x4ExternalSyntheticLambda4() {
    }

    private static final Unit onWarmupCompleted(getBacktraceNote getbacktracenote, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 79;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = IAuthTabCallback + 47;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-901273606, i, -1, "im.toss.tds.compose.component.compound.tab.v1.ItemPreset.Item.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ItemPreset.kt:110)");
            }
            getbacktracenote.invoke(RightAccessoryPreset.onNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(boolean z, Context context, Function0 function0) {
        int i = 2 % 2;
        if (!z) {
            int i2 = IAuthTabCallback + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {noStore.Companion};
            int iOnWarmupCompleted = GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted();
            minFresh.onNavigationEvent(context, (noStore) noStore.onExtraCallback.onWarmupCompleted(objArr, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), iOnWarmupCompleted));
            function0.invoke();
        }
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 105;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, final boolean z, final Function0 function0, getSubtitle getsubtitle, boolean z2, onExtraCallback onextracallback, final getBacktraceNote getbacktracenote, boolean z3, getBacktraceNote getbacktracenote2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z4;
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1634170088, i, -1, "im.toss.tds.compose.component.compound.tab.v1.ItemPreset.Item.<anonymous>.<anonymous> (ItemPreset.kt:95)");
            }
            r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA r8lambdamefghmy2txyc8kg26jswvkwvrwa = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback;
            r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback iAuthTabCallback = (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(r8lambdamefghmy2txyc8kg26jswvkwvrwa.onWarmupCompleted());
            r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted = (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(r8lambdamefghmy2txyc8kg26jswvkwvrwa.asBinder());
            final Context context = (Context) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU r8lambdawgmlot4gzpqjk3abw8ehrhrqxu = r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = addAdapter.onExtraCallback(quirksExternalSyntheticBackport0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, r8lambdawgmlot4gzpqjk3abw8ehrhrqxu.onExtraCallback(), null, 4, null);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(z);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if ((zOnExtraCallback | zOnNavigationEvent) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.tab.v1.ItemPreset$$ExternalSyntheticLambda12
                    private static int onExtraCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke() {
                        int i3 = 2 % 2;
                        int i4 = onExtraCallbackWithResult + 7;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                        Unit unitOnWarmupCompleted = x4ExternalSyntheticLambda4.onWarmupCompleted(z, context, function0);
                        int i6 = onExtraCallback + 115;
                        onExtraCallbackWithResult = i6 % 128;
                        if (i6 % 2 == 0) {
                            int i7 = 23 / 0;
                        }
                        return unitOnWarmupCompleted;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            Object obj = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(getCameraIdentifier.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, z, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, z2, Role.IAuthTabCallback(Role.Companion.asBinder()), (Function0) objOnMinimized), 0.0f, 1, (Object) null);
            if (getbacktracenote != null) {
                int i3 = IAuthTabCallback + 73;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                z4 = true;
            } else {
                z4 = false;
            }
            component5 component5VarOnExtraCallback = x4ExternalSyntheticLambda0.onExtraCallback(onextracallback, z4, z3, r8lambdawgmlot4gzpqjk3abw8ehrhrqxu.onExtraCallback(iAuthTabCallback, onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, 384), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback2);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i5 = onNavigationEvent + 115;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    getAwbState.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
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
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult2 = QuirkSettingsLoader.Companion;
            QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault = onextracallbackwithresult2.IAuthTabCallbackDefault();
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImmediateFutureImmediateSuccessfulFuture.onNavigationEvent(onextracallback2, onWarmupCompleted.Content);
            component5 component5VarOnExtraCallback2 = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), onwarmupcompletedIAuthTabCallbackDefault, cameraCaptureResultEmptyCameraCaptureResult, 48);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback2, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
            getbacktracenote2.invoke(RowScopeInstance.onNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (getbacktracenote == null) {
                int i6 = onNavigationEvent + 79;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-812619914);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-812619913);
                setPostviewFormatSelector.onNavigationEvent(convertYUVToRGB.IAuthTabCallback().onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(onExtraCallbackWithResult)), ForwardingCameraControl.onExtraCallback(-901273606, true, new Function2() { // from class: im.toss.tds.compose.component.compound.tab.v1.ItemPreset$$ExternalSyntheticLambda13
                    private static int onExtraCallback = 1;
                    private static int onExtraCallbackWithResult;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i8 = 2 % 2;
                        int i9 = onExtraCallbackWithResult + 105;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        Unit unitOnNavigationEvent = x4ExternalSyntheticLambda4.onNavigationEvent(getbacktracenote, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i11 = onExtraCallback + 35;
                        onExtraCallbackWithResult = i11 % 128;
                        if (i11 % 2 == 0) {
                            return unitOnNavigationEvent;
                        }
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (z3) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-812291158);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImmediateFutureImmediateSuccessfulFuture.onNavigationEvent(onextracallback2, onWarmupCompleted.RedDot);
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult2.access100(), false);
                int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent2);
                Function0 function0IAuthTabCallback3 = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback3);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                onWarmupCompleted.onExtraCallbackWithResult(onwarmupcompleted, null, cameraCaptureResultEmptyCameraCaptureResult, 384, 2);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i8 = IAuthTabCallback + 37;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-812115295);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onNavigationEvent + 125;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(getBacktraceNote getbacktracenote, final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, final boolean z, final Function0 function0, final getSubtitle getsubtitle, final boolean z2, final onExtraCallback onextracallback, final getBacktraceNote getbacktracenote2, final boolean z3, final getBacktraceNote getbacktracenote3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z4;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 3;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if ((i & 3) != 2) {
            int i6 = i4 + 63;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            z4 = true;
        } else {
            z4 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z4, i & 1)) {
            int i8 = IAuthTabCallback + 93;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onNavigationEvent + 75;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1865305635, i, -1, "im.toss.tds.compose.component.compound.tab.v1.ItemPreset.Item.<anonymous> (ItemPreset.kt:94)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1865305635, i, -1, "im.toss.tds.compose.component.compound.tab.v1.ItemPreset.Item.<anonymous> (ItemPreset.kt:94)");
            }
            getbacktracenote.invoke(ForwardingCameraControl.onExtraCallback(-1634170088, true, new Function2() { // from class: im.toss.tds.compose.component.compound.tab.v1.ItemPreset$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                    int i11 = 2 % 2;
                    int i12 = onWarmupCompleted + 121;
                    IAuthTabCallback = i12 % 128;
                    int i13 = i12 % 2;
                    Unit unitOnExtraCallback = x4ExternalSyntheticLambda4.onExtraCallback(quirksExternalSyntheticBackport0, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, z, function0, getsubtitle, z2, onextracallback, getbacktracenote2, z3, getbacktracenote3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i14 = onWarmupCompleted + 59;
                    IAuthTabCallback = i14 % 128;
                    int i15 = i14 % 2;
                    return unitOnExtraCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = IAuthTabCallback + 69;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:249:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(final boolean z, @NotNull final Function0<Unit> function0, @NotNull final onExtraCallback onextracallback, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, boolean z2, boolean z3, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo2, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @Nullable getSubtitle getsubtitle, @Nullable getBacktraceNote<? super Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @NotNull final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2, final int i3) throws NoWhenBranchMatchedException {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4;
        final boolean z4;
        final boolean z5;
        final long j3;
        final GraphicDeviceInfo graphicDeviceInfo3;
        final long j4;
        final GraphicDeviceInfo graphicDeviceInfo4;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        getSubtitle getsubtitle2;
        getBacktraceNote<? super Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6;
        boolean z6;
        boolean z7;
        long jOnTransact;
        GraphicDeviceInfo graphicDeviceInfo5;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
        GraphicDeviceInfo graphicDeviceInfo6;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        getSubtitle getsubtitleOnWarmupCompleted;
        getSubtitle getsubtitle3;
        int i19;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
        GraphicDeviceInfo graphicDeviceInfo7;
        GraphicDeviceInfo graphicDeviceInfo8;
        long j5;
        int i20;
        getBacktraceNote<? super Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenoteOnNavigationEvent;
        GraphicDeviceInfo graphicDeviceInfo9;
        long jAsInterface;
        int i21;
        int i22 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(getbacktracenote3, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1659613272);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
                int i23 = IAuthTabCallback + 81;
                onNavigationEvent = i23 % 128;
                int i24 = i23 % 2;
                i21 = 4;
            } else {
                i21 = 2;
            }
            i4 = i21 | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 32 : 16;
        }
        int i25 = 128;
        if ((i & 384) == 0) {
            int i26 = onNavigationEvent + 39;
            IAuthTabCallback = i26 % 128;
            int i27 = i26 % 2;
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onextracallback.ordinal()) ? 256 : 128;
        }
        int i28 = i3 & 8;
        if (i28 != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i4 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 1024 : 2048;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote)) {
                        int i29 = onNavigationEvent + 13;
                        IAuthTabCallback = i29 % 128;
                        int i30 = i29 % 2;
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i7 = i6 | i4;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i7 |= 196608;
                } else if ((i & 196608) == 0) {
                    i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 131072 : 65536;
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    int i31 = IAuthTabCallback + 113;
                    onNavigationEvent = i31 % 128;
                    if (i31 % 2 == 0) {
                        throw null;
                    }
                    i7 |= 1572864;
                } else {
                    if ((i & 1572864) == 0) {
                        i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 1048576 : 524288;
                    }
                    i10 = i3 & 128;
                    if (i10 == 0) {
                        int i32 = IAuthTabCallback + 61;
                        onNavigationEvent = i32 % 128;
                        int i33 = i32 % 2;
                        i7 |= 12582912;
                    } else if ((12582912 & i) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) {
                            int i34 = IAuthTabCallback + 53;
                            onNavigationEvent = i34 % 128;
                            int i35 = i34 % 2;
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i7 |= i11;
                    }
                    i12 = i3 & 256;
                    if (i12 == 0) {
                        i7 |= 100663296;
                    } else {
                        if ((100663296 & i) == 0) {
                            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo) ? 67108864 : 33554432;
                        }
                        i13 = i3 & 512;
                        if (i13 != 0) {
                            i7 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i7 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 536870912 : 268435456;
                        }
                        i14 = i3 & 1024;
                        if (i14 != 0) {
                            int i36 = onNavigationEvent + 53;
                            IAuthTabCallback = i36 % 128;
                            int i37 = i36 % 2;
                            i15 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i15 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo2) ? 4 : 2) | i2;
                        } else {
                            i15 = i2;
                        }
                        i16 = i3 & 2048;
                        if (i16 != 0) {
                            i15 |= 48;
                        } else if ((i2 & 48) == 0) {
                            i15 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2) ? 32 : 16;
                        }
                        if ((i2 & 384) == 0) {
                            if ((i3 & 4096) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsubtitle)) {
                                i25 = 256;
                            }
                            i15 |= i25;
                        }
                        i17 = i3 & 8192;
                        if (i17 == 0) {
                            i18 = i17;
                            if ((i2 & 3072) == 0) {
                                i15 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2) ? 2048 : 1024;
                            }
                            if ((i2 & 24576) == 0) {
                                i15 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote3) ? 16384 : 8192;
                            }
                            if ((196608 & i2) == 0) {
                                i15 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 131072 : 65536;
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 306783379) == 306783378 || (74899 & i15) != 74898, i7 & 1)) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                getbacktracenote4 = getbacktracenote;
                                z4 = z2;
                                z5 = z3;
                                j3 = j;
                                graphicDeviceInfo3 = graphicDeviceInfo;
                                j4 = j2;
                                graphicDeviceInfo4 = graphicDeviceInfo2;
                                camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                getsubtitle2 = getsubtitle;
                                getbacktracenote5 = getbacktracenote2;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i28 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                    getbacktracenote6 = i5 != 0 ? null : getbacktracenote;
                                    z6 = i8 != 0 ? true : z2;
                                    z7 = i9 != 0 ? false : z3;
                                    jOnTransact = i10 != 0 ? setByteOrder.Companion.onTransact() : j;
                                    GraphicDeviceInfo graphicDeviceInfo10 = i12 != 0 ? null : graphicDeviceInfo;
                                    long jOnTransact2 = i13 != 0 ? setByteOrder.Companion.onTransact() : j2;
                                    if (i14 != 0) {
                                        int i38 = IAuthTabCallback + 55;
                                        onNavigationEvent = i38 % 128;
                                        int i39 = i38 % 2;
                                        graphicDeviceInfo5 = null;
                                    } else {
                                        graphicDeviceInfo5 = graphicDeviceInfo2;
                                    }
                                    if (i16 != 0) {
                                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                            objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                        }
                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
                                    } else {
                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                    }
                                    if ((i3 & 4096) != 0) {
                                        graphicDeviceInfo6 = graphicDeviceInfo10;
                                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                        getsubtitleOnWarmupCompleted = r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted.onWarmupCompleted(z, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i7 & 14) | 48);
                                        i15 &= -897;
                                    } else {
                                        graphicDeviceInfo6 = graphicDeviceInfo10;
                                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport05;
                                        getsubtitleOnWarmupCompleted = getsubtitle;
                                    }
                                    if (i18 != 0) {
                                        i20 = i15;
                                        getbacktracenoteOnNavigationEvent = x4ExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent();
                                        getsubtitle3 = getsubtitleOnWarmupCompleted;
                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                        long j6 = jOnTransact2;
                                        graphicDeviceInfo7 = graphicDeviceInfo6;
                                        graphicDeviceInfo8 = graphicDeviceInfo5;
                                        j5 = j6;
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            int i40 = IAuthTabCallback + 77;
                                            onNavigationEvent = i40 % 128;
                                            if (i40 % 2 == 0) {
                                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1659613272, i7, i20, "im.toss.tds.compose.component.compound.tab.v1.ItemPreset.Item (ItemPreset.kt:85)");
                                                throw null;
                                            }
                                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1659613272, i7, i20, "im.toss.tds.compose.component.compound.tab.v1.ItemPreset.Item (ItemPreset.kt:85)");
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1455515495);
                                        long jIAuthTabCallbackDefault = jOnTransact == 16 ? jOnTransact : r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted.IAuthTabCallbackDefault(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        GraphicDeviceInfo graphicDeviceInfoIAuthTabCallback = graphicDeviceInfo7 != null ? GraphicDeviceInfo.Companion.IAuthTabCallback() : graphicDeviceInfo7;
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1455520809);
                                        if (j5 == 16) {
                                            graphicDeviceInfo9 = graphicDeviceInfo7;
                                            jAsInterface = j5;
                                        } else {
                                            graphicDeviceInfo9 = graphicDeviceInfo7;
                                            jAsInterface = r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted.asInterface(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        final getBacktraceNote<? super Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote7 = getbacktracenoteOnNavigationEvent;
                                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport04;
                                        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda25 = camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
                                        final getSubtitle getsubtitle4 = getsubtitle3;
                                        final boolean z8 = z6;
                                        final getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote8 = getbacktracenote6;
                                        final boolean z9 = z7;
                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                                        GraphicDeviceInfo graphicDeviceInfo11 = graphicDeviceInfo8;
                                        getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote9 = getbacktracenote6;
                                        onExtraCallbackWithResult(jIAuthTabCallbackDefault, graphicDeviceInfoIAuthTabCallback, jAsInterface, graphicDeviceInfo8 != null ? GraphicDeviceInfo.Companion.asBinder() : graphicDeviceInfo8, z, z6, ForwardingCameraControl.onExtraCallback(-1865305635, true, new Function2() { // from class: im.toss.tds.compose.component.compound.tab.v1.ItemPreset$$ExternalSyntheticLambda4
                                            private static int IAuthTabCallback = 0;
                                            private static int onNavigationEvent = 1;

                                            public final Object invoke(Object obj, Object obj2) {
                                                int i41 = 2 % 2;
                                                int i42 = onNavigationEvent + 63;
                                                IAuthTabCallback = i42 % 128;
                                                int i43 = i42 % 2;
                                                Unit unitIAuthTabCallback = x4ExternalSyntheticLambda4.IAuthTabCallback(getbacktracenote7, quirksExternalSyntheticBackport06, camera2CapturePipelineTorchTaskExternalSyntheticLambda25, z, function0, getsubtitle4, z8, onextracallback, getbacktracenote8, z9, getbacktracenote3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                                int i44 = IAuthTabCallback + 19;
                                                onNavigationEvent = i44 % 128;
                                                if (i44 % 2 != 0) {
                                                    return unitIAuthTabCallback;
                                                }
                                                throw null;
                                            }
                                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i7 & 458752) | ((i7 << 12) & 57344) | 1572864 | ((i20 << 6) & 29360128));
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                        }
                                        z4 = z6;
                                        graphicDeviceInfo4 = graphicDeviceInfo11;
                                        getbacktracenote4 = getbacktracenote9;
                                        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda26 = camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
                                        graphicDeviceInfo3 = graphicDeviceInfo9;
                                        long j7 = j5;
                                        z5 = z7;
                                        j3 = jOnTransact;
                                        getsubtitle2 = getsubtitle3;
                                        getbacktracenote5 = getbacktracenoteOnNavigationEvent;
                                        j4 = j7;
                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda26;
                                    } else {
                                        getsubtitle3 = getsubtitleOnWarmupCompleted;
                                        i19 = i15;
                                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                                        long j8 = jOnTransact2;
                                        graphicDeviceInfo7 = graphicDeviceInfo6;
                                        graphicDeviceInfo8 = graphicDeviceInfo5;
                                        j5 = j8;
                                    }
                                } else {
                                    int i41 = IAuthTabCallback + 41;
                                    onNavigationEvent = i41 % 128;
                                    if (i41 % 2 == 0) {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                        if ((i3 & 32661) != 0) {
                                            i15 &= -897;
                                        }
                                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                                        getbacktracenote6 = getbacktracenote;
                                        z6 = z2;
                                        z7 = z3;
                                        jOnTransact = j;
                                        graphicDeviceInfo7 = graphicDeviceInfo;
                                        j5 = j2;
                                        graphicDeviceInfo8 = graphicDeviceInfo2;
                                        getsubtitle3 = getsubtitle;
                                        i19 = i15;
                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                    } else {
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                        if ((i3 & 4096) != 0) {
                                        }
                                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport0;
                                        getbacktracenote6 = getbacktracenote;
                                        z6 = z2;
                                        z7 = z3;
                                        jOnTransact = j;
                                        graphicDeviceInfo7 = graphicDeviceInfo;
                                        j5 = j2;
                                        graphicDeviceInfo8 = graphicDeviceInfo2;
                                        getsubtitle3 = getsubtitle;
                                        i19 = i15;
                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                    }
                                }
                                i20 = i19;
                                getbacktracenoteOnNavigationEvent = getbacktracenote2;
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1455515495);
                                if (jOnTransact == 16) {
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                if (graphicDeviceInfo7 != null) {
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1455520809);
                                if (j5 == 16) {
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                final getBacktraceNote getbacktracenote72 = getbacktracenoteOnNavigationEvent;
                                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport062 = quirksExternalSyntheticBackport04;
                                final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda252 = camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
                                final getSubtitle getsubtitle42 = getsubtitle3;
                                final boolean z82 = z6;
                                final getBacktraceNote getbacktracenote82 = getbacktracenote6;
                                final boolean z92 = z7;
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                                GraphicDeviceInfo graphicDeviceInfo112 = graphicDeviceInfo8;
                                getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote92 = getbacktracenote6;
                                onExtraCallbackWithResult(jIAuthTabCallbackDefault, graphicDeviceInfoIAuthTabCallback, jAsInterface, graphicDeviceInfo8 != null ? GraphicDeviceInfo.Companion.asBinder() : graphicDeviceInfo8, z, z6, ForwardingCameraControl.onExtraCallback(-1865305635, true, new Function2() { // from class: im.toss.tds.compose.component.compound.tab.v1.ItemPreset$$ExternalSyntheticLambda4
                                    private static int IAuthTabCallback = 0;
                                    private static int onNavigationEvent = 1;

                                    public final Object invoke(Object obj, Object obj2) {
                                        int i412 = 2 % 2;
                                        int i42 = onNavigationEvent + 63;
                                        IAuthTabCallback = i42 % 128;
                                        int i43 = i42 % 2;
                                        Unit unitIAuthTabCallback = x4ExternalSyntheticLambda4.IAuthTabCallback(getbacktracenote72, quirksExternalSyntheticBackport062, camera2CapturePipelineTorchTaskExternalSyntheticLambda252, z, function0, getsubtitle42, z82, onextracallback, getbacktracenote82, z92, getbacktracenote3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                        int i44 = IAuthTabCallback + 19;
                                        onNavigationEvent = i44 % 128;
                                        if (i44 % 2 != 0) {
                                            return unitIAuthTabCallback;
                                        }
                                        throw null;
                                    }
                                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i7 & 458752) | ((i7 << 12) & 57344) | 1572864 | ((i20 << 6) & 29360128));
                                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                }
                                z4 = z6;
                                graphicDeviceInfo4 = graphicDeviceInfo112;
                                getbacktracenote4 = getbacktracenote92;
                                Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda262 = camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
                                graphicDeviceInfo3 = graphicDeviceInfo9;
                                long j72 = j5;
                                z5 = z7;
                                j3 = jOnTransact;
                                getsubtitle2 = getsubtitle3;
                                getbacktracenote5 = getbacktracenoteOnNavigationEvent;
                                j4 = j72;
                                camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda262;
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport07 = quirksExternalSyntheticBackport02;
                                final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda27 = camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
                                final getSubtitle getsubtitle5 = getsubtitle2;
                                final getBacktraceNote<? super Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote10 = getbacktracenote5;
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.tab.v1.ItemPreset$$ExternalSyntheticLambda5
                                    private static int IAuthTabCallback = 1;
                                    private static int onExtraCallback;

                                    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                                        int i42 = 2 % 2;
                                        int i43 = IAuthTabCallback + 59;
                                        onExtraCallback = i43 % 128;
                                        int i44 = i43 % 2;
                                        Unit unitOnExtraCallbackWithResult = x4ExternalSyntheticLambda4.onExtraCallbackWithResult(this.f$0, z, function0, onextracallback, quirksExternalSyntheticBackport07, getbacktracenote4, z4, z5, j3, graphicDeviceInfo3, j4, graphicDeviceInfo4, camera2CapturePipelineTorchTaskExternalSyntheticLambda27, getsubtitle5, getbacktracenote10, getbacktracenote3, i, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                                        int i45 = IAuthTabCallback + 31;
                                        onExtraCallback = i45 % 128;
                                        int i46 = i45 % 2;
                                        return unitOnExtraCallbackWithResult;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i15 |= 3072;
                        i18 = i17;
                        if ((i2 & 24576) == 0) {
                        }
                        if ((196608 & i2) == 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 306783379) == 306783378 || (74899 & i15) != 74898, i7 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i13 = i3 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i3 & 1024;
                    if (i14 != 0) {
                    }
                    i16 = i3 & 2048;
                    if (i16 != 0) {
                    }
                    if ((i2 & 384) == 0) {
                    }
                    i17 = i3 & 8192;
                    if (i17 == 0) {
                    }
                    if ((i2 & 24576) == 0) {
                    }
                    if ((196608 & i2) == 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 306783379) == 306783378 || (74899 & i15) != 74898, i7 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i10 = i3 & 128;
                if (i10 == 0) {
                }
                i12 = i3 & 256;
                if (i12 == 0) {
                }
                i13 = i3 & 512;
                if (i13 != 0) {
                }
                i14 = i3 & 1024;
                if (i14 != 0) {
                }
                i16 = i3 & 2048;
                if (i16 != 0) {
                }
                if ((i2 & 384) == 0) {
                }
                i17 = i3 & 8192;
                if (i17 == 0) {
                }
                if ((i2 & 24576) == 0) {
                }
                if ((196608 & i2) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 306783379) == 306783378 || (74899 & i15) != 74898, i7 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i7 = i4;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i10 = i3 & 128;
            if (i10 == 0) {
            }
            i12 = i3 & 256;
            if (i12 == 0) {
            }
            i13 = i3 & 512;
            if (i13 != 0) {
            }
            i14 = i3 & 1024;
            if (i14 != 0) {
            }
            i16 = i3 & 2048;
            if (i16 != 0) {
            }
            if ((i2 & 384) == 0) {
            }
            i17 = i3 & 8192;
            if (i17 == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 306783379) == 306783378 || (74899 & i15) != 74898, i7 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i7 = i4;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i10 = i3 & 128;
        if (i10 == 0) {
        }
        i12 = i3 & 256;
        if (i12 == 0) {
        }
        i13 = i3 & 512;
        if (i13 != 0) {
        }
        i14 = i3 & 1024;
        if (i14 != 0) {
        }
        i16 = i3 & 2048;
        if (i16 != 0) {
        }
        if ((i2 & 384) == 0) {
        }
        i17 = i3 & 8192;
        if (i17 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i7 & 306783379) == 306783378 || (74899 & i15) != 74898, i7 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit IAuthTabCallback(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            z = true;
        } else {
            int i3 = IAuthTabCallback + 123;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = IAuthTabCallback + 69;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1099995049, i, -1, "im.toss.tds.compose.component.compound.tab.v1.ItemPreset.Item.<anonymous> (ItemPreset.kt:179)");
            }
            r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA r8lambdamefghmy2txyc8kg26jswvkwvrwa = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onExtraCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, Long.valueOf(AppLovinMediationProvider.onExtraCallbackWithResult((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted()), r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted.onExtraCallbackWithResult((r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.IAuthTabCallback) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(r8lambdamefghmy2txyc8kg26jswvkwvrwa.onWarmupCompleted()), (r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(r8lambdamefghmy2txyc8kg26jswvkwvrwa.asBinder())))), 0L, ConnectionPool.onWarmupCompleted.onWarmupCompleted(), null, createCameraCaptureCallback.onExtraCallback(createCameraCaptureCallback.Companion.IAuthTabCallback()), Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 130734}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onNavigationEvent + 87;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = IAuthTabCallback + 33;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull final String str, final boolean z, @NotNull final Function0<Unit> function0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z2, boolean z3, long j, @Nullable GraphicDeviceInfo graphicDeviceInfo, long j2, @Nullable GraphicDeviceInfo graphicDeviceInfo2, @Nullable getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @Nullable getSubtitle getsubtitle, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2, final int i3) throws NoWhenBranchMatchedException {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        final boolean z4;
        final boolean z5;
        final long j3;
        final GraphicDeviceInfo graphicDeviceInfo3;
        final long j4;
        final GraphicDeviceInfo graphicDeviceInfo4;
        final getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2;
        final Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        final getSubtitle getsubtitle2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        boolean z6;
        boolean z7;
        long j5;
        GraphicDeviceInfo graphicDeviceInfo5;
        long j6;
        GraphicDeviceInfo graphicDeviceInfo6;
        getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
        getSubtitle getsubtitle3;
        long jOnTransact;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
        getSubtitle getsubtitleOnWarmupCompleted;
        int i19 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1394714564);
        Object obj = null;
        if ((i & 6) == 0) {
            int i20 = onNavigationEvent + 35;
            IAuthTabCallback = i20 % 128;
            if (i20 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                obj.hashCode();
                throw null;
            }
            i4 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 256 : 128;
        }
        int i21 = i3 & 8;
        if (i21 != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ^ true ? 1024 : 2048;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                int i22 = IAuthTabCallback + 85;
                onNavigationEvent = i22 % 128;
                i4 = i22 % 2 == 0 ? i4 | 25899 : i4 | 24576;
            } else {
                if ((i & 24576) == 0) {
                    int i23 = onNavigationEvent + 71;
                    IAuthTabCallback = i23 % 128;
                    if (i23 % 2 != 0) {
                        int i24 = 29 / 0;
                        i6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 16384 : 8192;
                    } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2)) {
                    }
                    i7 = i6 | i4;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    int i25 = onNavigationEvent + 79;
                    IAuthTabCallback = i25 % 128;
                    if (i25 % 2 != 0) {
                        i7 |= 196608;
                        int i26 = 10 / 0;
                    } else {
                        i7 |= 196608;
                    }
                } else {
                    if ((i & 196608) == 0) {
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3)) {
                            int i27 = onNavigationEvent + 23;
                            IAuthTabCallback = i27 % 128;
                            int i28 = i27 % 2;
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i7 |= i9;
                    }
                    i10 = i3 & 64;
                    if (i10 == 0) {
                        i11 = i7 | 1572864;
                    } else {
                        i11 = i7;
                        if ((1572864 & i) == 0) {
                            i11 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 1048576 : 524288;
                        }
                    }
                    i12 = i3 & 128;
                    if (i12 == 0) {
                        i11 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i11 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo) ? 8388608 : 4194304;
                    }
                    i13 = i3 & 256;
                    if (i13 == 0) {
                        i11 |= 100663296;
                    } else {
                        if ((i & 100663296) == 0) {
                            i14 = i11 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 67108864 : 33554432);
                        }
                        i15 = i3 & 512;
                        if (i15 == 0) {
                            if ((i & 805306368) == 0) {
                                i14 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo2) ? 536870912 : 268435456;
                            }
                            i16 = i3 & 1024;
                            if (i16 == 0) {
                                int i29 = IAuthTabCallback + 111;
                                onNavigationEvent = i29 % 128;
                                i17 = i29 % 2 == 0 ? i2 | 67 : i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i17 = (!(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ^ true) ? 4 : 2) | i2;
                            } else {
                                i17 = i2;
                            }
                            i18 = i3 & 2048;
                            if (i18 == 0) {
                                i17 |= 48;
                            } else if ((i2 & 48) == 0) {
                                i17 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2) ? 32 : 16;
                            }
                            if ((i2 & 384) == 0) {
                                i17 |= ((i3 & 4096) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsubtitle)) ? 256 : 128;
                            }
                            if ((i2 & 3072) != 0) {
                                int i30 = IAuthTabCallback + 93;
                                onNavigationEvent = i30 % 128;
                                int i31 = i30 % 2;
                                i17 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 2048 : 1024;
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i14 & 306783379) == 306783378 || (i17 & 1171) != 1170, i14 & 1)) {
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                z4 = z2;
                                z5 = z3;
                                j3 = j;
                                graphicDeviceInfo3 = graphicDeviceInfo;
                                j4 = j2;
                                graphicDeviceInfo4 = graphicDeviceInfo2;
                                getbacktracenote2 = getbacktracenote;
                                camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                getsubtitle2 = getsubtitle;
                            } else {
                                int i32 = onNavigationEvent + 15;
                                IAuthTabCallback = i32 % 128;
                                if (i32 % 2 != 0) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                    if ((i & 1) != 0) {
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                            quirksExternalSyntheticBackport03 = i21 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                                            boolean z8 = i5 != 0 ? true : z2;
                                            boolean z9 = i8 != 0 ? false : z3;
                                            if (i10 != 0) {
                                                int i33 = onNavigationEvent + 13;
                                                IAuthTabCallback = i33 % 128;
                                                if (i33 % 2 != 0) {
                                                    jOnTransact = setByteOrder.Companion.onTransact();
                                                    int i34 = 81 / 0;
                                                } else {
                                                    jOnTransact = setByteOrder.Companion.onTransact();
                                                }
                                            } else {
                                                jOnTransact = j;
                                            }
                                            GraphicDeviceInfo graphicDeviceInfo7 = i12 != 0 ? null : graphicDeviceInfo;
                                            long jOnTransact2 = i13 != 0 ? setByteOrder.Companion.onTransact() : j2;
                                            GraphicDeviceInfo graphicDeviceInfo8 = i15 != 0 ? null : graphicDeviceInfo2;
                                            getBacktraceNote<? super RightAccessoryPreset, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4 = i16 != 0 ? null : getbacktracenote;
                                            if (i18 != 0) {
                                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                                }
                                                camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
                                            } else {
                                                camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                            }
                                            if ((i3 & 4096) != 0) {
                                                getsubtitleOnWarmupCompleted = r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted.onWarmupCompleted(z, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i14 >> 3) & 14) | 48);
                                                i17 &= -897;
                                            } else {
                                                getsubtitleOnWarmupCompleted = getsubtitle;
                                            }
                                            graphicDeviceInfo6 = graphicDeviceInfo8;
                                            camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
                                            getsubtitle3 = getsubtitleOnWarmupCompleted;
                                            graphicDeviceInfo5 = graphicDeviceInfo7;
                                            z6 = z8;
                                            j5 = jOnTransact;
                                            j6 = jOnTransact2;
                                            getbacktracenote3 = getbacktracenote4;
                                            z7 = z9;
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                            if ((i3 & 4096) != 0) {
                                                i17 &= -897;
                                            }
                                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                            z6 = z2;
                                            z7 = z3;
                                            j5 = j;
                                            graphicDeviceInfo5 = graphicDeviceInfo;
                                            j6 = j2;
                                            graphicDeviceInfo6 = graphicDeviceInfo2;
                                            getbacktracenote3 = getbacktracenote;
                                            camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                                            getsubtitle3 = getsubtitle;
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1394714564, i14, i17, "im.toss.tds.compose.component.compound.tab.v1.ItemPreset.Item (ItemPreset.kt:163)");
                                        }
                                        int i35 = i14 >> 3;
                                        int i36 = i14 << 3;
                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                        IAuthTabCallback(z, function0, onExtraCallback.Text, quirksExternalSyntheticBackport03, getbacktracenote3, z6, z7, j5, graphicDeviceInfo5, j6, graphicDeviceInfo6, camera2CapturePipelineTorchTaskExternalSyntheticLambda23, getsubtitle3, null, ForwardingCameraControl.onExtraCallback(-1099995049, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.tab.v1.ItemPreset$$ExternalSyntheticLambda10
                                            private static int onExtraCallback = 1;
                                            private static int onNavigationEvent;

                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                int i37 = 2 % 2;
                                                int i38 = onNavigationEvent + 105;
                                                onExtraCallback = i38 % 128;
                                                int i39 = i38 % 2;
                                                Object[] objArr = {str, (RowScope) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
                                                Unit unit = (Unit) x4ExternalSyntheticLambda4.onExtraCallback(setCurrentIndex.onNavigationEvent(), 168177210, -168177208, setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
                                                int i40 = onExtraCallback + 79;
                                                onNavigationEvent = i40 % 128;
                                                int i41 = i40 % 2;
                                                return unit;
                                            }
                                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResult2, (i35 & 14) | 384 | (i35 & 112) | (i14 & 7168) | ((i17 << 12) & 57344) | (458752 & i36) | (3670016 & i36) | (29360128 & i36) | (234881024 & i36) | (i36 & 1879048192), ((i14 >> 27) & 14) | 24576 | (i17 & 112) | (i17 & 896) | ((i17 << 6) & 458752), 8192);
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                        }
                                        z4 = z6;
                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                        z5 = z7;
                                        j3 = j5;
                                        graphicDeviceInfo3 = graphicDeviceInfo5;
                                        j4 = j6;
                                        graphicDeviceInfo4 = graphicDeviceInfo6;
                                        getbacktracenote2 = getbacktracenote3;
                                        camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                                        getsubtitle2 = getsubtitle3;
                                    }
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                    if ((i & 1) != 0) {
                                    }
                                }
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.tab.v1.ItemPreset$$ExternalSyntheticLambda11
                                    private static int onExtraCallback = 1;
                                    private static int onNavigationEvent;

                                    public final Object invoke(Object obj2, Object obj3) {
                                        int i37 = 2 % 2;
                                        int i38 = onExtraCallback + 13;
                                        onNavigationEvent = i38 % 128;
                                        int i39 = i38 % 2;
                                        Unit unitOnExtraCallback = x4ExternalSyntheticLambda4.onExtraCallback(this.f$0, str, z, function0, quirksExternalSyntheticBackport02, z4, z5, j3, graphicDeviceInfo3, j4, graphicDeviceInfo4, getbacktracenote2, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, getsubtitle2, i, i2, i3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                        int i40 = onNavigationEvent + 111;
                                        onExtraCallback = i40 % 128;
                                        if (i40 % 2 != 0) {
                                            return unitOnExtraCallback;
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
                        int i37 = IAuthTabCallback + 83;
                        onNavigationEvent = i37 % 128;
                        if (i37 % 2 == 0) {
                            throw null;
                        }
                        i14 |= 805306368;
                        i16 = i3 & 1024;
                        if (i16 == 0) {
                        }
                        i18 = i3 & 2048;
                        if (i18 == 0) {
                        }
                        if ((i2 & 384) == 0) {
                        }
                        if ((i2 & 3072) != 0) {
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i14 & 306783379) == 306783378 || (i17 & 1171) != 1170, i14 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i14 = i11;
                    i15 = i3 & 512;
                    if (i15 == 0) {
                    }
                    i16 = i3 & 1024;
                    if (i16 == 0) {
                    }
                    i18 = i3 & 2048;
                    if (i18 == 0) {
                    }
                    if ((i2 & 384) == 0) {
                    }
                    if ((i2 & 3072) != 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i14 & 306783379) == 306783378 || (i17 & 1171) != 1170, i14 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i10 = i3 & 64;
                if (i10 == 0) {
                }
                i12 = i3 & 128;
                if (i12 == 0) {
                }
                i13 = i3 & 256;
                if (i13 == 0) {
                }
                i14 = i11;
                i15 = i3 & 512;
                if (i15 == 0) {
                }
                i16 = i3 & 1024;
                if (i16 == 0) {
                }
                i18 = i3 & 2048;
                if (i18 == 0) {
                }
                if ((i2 & 384) == 0) {
                }
                if ((i2 & 3072) != 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i14 & 306783379) == 306783378 || (i17 & 1171) != 1170, i14 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            i7 = i4;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i10 = i3 & 64;
            if (i10 == 0) {
            }
            i12 = i3 & 128;
            if (i12 == 0) {
            }
            i13 = i3 & 256;
            if (i13 == 0) {
            }
            i14 = i11;
            i15 = i3 & 512;
            if (i15 == 0) {
            }
            i16 = i3 & 1024;
            if (i16 == 0) {
            }
            i18 = i3 & 2048;
            if (i18 == 0) {
            }
            if ((i2 & 384) == 0) {
            }
            if ((i2 & 3072) != 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i14 & 306783379) == 306783378 || (i17 & 1171) != 1170, i14 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i7 = i4;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i10 = i3 & 64;
        if (i10 == 0) {
        }
        i12 = i3 & 128;
        if (i12 == 0) {
        }
        i13 = i3 & 256;
        if (i13 == 0) {
        }
        i14 = i11;
        i15 = i3 & 512;
        if (i15 == 0) {
        }
        i16 = i3 & 1024;
        if (i16 == 0) {
        }
        i18 = i3 & 2048;
        if (i18 == 0) {
        }
        if ((i2 & 384) == 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i14 & 306783379) == 306783378 || (i17 & 1171) != 1170, i14 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit onWarmupCompleted(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
            unit = Unit.INSTANCE;
            int i3 = 8 / 0;
        } else {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
            unit = Unit.INSTANCE;
        }
        int i4 = onNavigationEvent + 41;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(handleNativeAdClick.onExtraCallback onextracallback, boolean z, deprecated_followRedirects deprecated_followredirects, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        handleNativeAdClick.onExtraCallback onextracallback2;
        long jOnTransact;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1598474042, i, -1, "im.toss.tds.compose.component.compound.tab.v1.ItemPreset.Item.<anonymous> (ItemPreset.kt:223)");
            }
            if (((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onNavigationEvent() >= 1.35f) {
                int i3 = onNavigationEvent + 63;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 80 / 0;
                    if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraInfo.onExtraCallbackWithResult(onextracallback.onWarmupCompleted()), VirtualCameraInfo.onWarmupCompleted(onextracallback.onWarmupCompleted()))) {
                        int i5 = onNavigationEvent + 17;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                        float fOnExtraCallbackWithResult = VirtualCameraInfo.onExtraCallbackWithResult(onextracallback.onWarmupCompleted());
                        r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.asInterface asinterface = r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.asInterface.IAuthTabCallback;
                        if (VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fOnExtraCallbackWithResult, VirtualCameraInfo.onExtraCallbackWithResult(asinterface.onNavigationEvent().onWarmupCompleted())) < 0) {
                            handleNativeAdClick.onExtraCallback.onWarmupCompleted onwarmupcompletedOnNavigationEvent = asinterface.onNavigationEvent();
                            int i7 = IAuthTabCallback + 11;
                            onNavigationEvent = i7 % 128;
                            int i8 = i7 % 2;
                            onextracallback2 = onwarmupcompletedOnNavigationEvent;
                        } else {
                            onextracallback2 = onextracallback;
                        }
                        if (z) {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1837211209);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1464756594);
                            boolean zOnWarmupCompleted = deprecated_interceptors.onWarmupCompleted(deprecated_followredirects, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            if (!zOnWarmupCompleted) {
                                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1836968189);
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                                jOnTransact = setByteOrder.Companion.onTransact();
                            }
                            setMainImageUri.IAuthTabCallback(deprecated_followredirects, deprecated_eventListenerFactory.Icon, null, onextracallback2, jOnTransact, 0, 0.0f, null, 0L, null, 0.0f, null, null, cameraCaptureResultEmptyCameraCaptureResult, 48, 0, 8164);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                                int i9 = IAuthTabCallback + 71;
                                onNavigationEvent = i9 % 128;
                                int i10 = i9 % 2;
                            }
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1837166186);
                        jOnTransact = getMaxAdCount.onExtraCallbackWithResult(((setByteOrder) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(convertYUVToRGB.IAuthTabCallback())).access100(), ((Number) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(copyBitmapToByteBuffer.IAuthTabCallback())).floatValue());
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                        setMainImageUri.IAuthTabCallback(deprecated_followredirects, deprecated_eventListenerFactory.Icon, null, onextracallback2, jOnTransact, 0, 0.0f, null, 0L, null, 0.0f, null, null, cameraCaptureResultEmptyCameraCaptureResult, 48, 0, 8164);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                    }
                } else if (VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(VirtualCameraInfo.onExtraCallbackWithResult(onextracallback.onWarmupCompleted()), VirtualCameraInfo.onWarmupCompleted(onextracallback.onWarmupCompleted()))) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull final deprecated_followRedirects deprecated_followredirects, @NotNull final String str, boolean z, @NotNull Function0<Unit> function0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z2, boolean z3, @Nullable handleNativeAdClick.onExtraCallback onextracallback, long j, long j2, @Nullable Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, @Nullable getSubtitle getsubtitle, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) throws NoWhenBranchMatchedException {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        boolean z5;
        boolean z6;
        handleNativeAdClick.onExtraCallback onextracallback2;
        long j3;
        long j4;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda22;
        getSubtitle getsubtitle2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i10;
        long jOnExtraCallback;
        long jIAuthTabCallbackStub;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
        getSubtitle getsubtitleOnWarmupCompleted;
        Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
        boolean z7;
        getSubtitle getsubtitle3;
        long j5;
        long j6;
        final handleNativeAdClick.onExtraCallback onextracallback3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        boolean z8;
        int i11 = 2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_followredirects, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1120910969);
        if ((i & 6) == 0) {
            i4 = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deprecated_followredirects) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        int i12 = 16;
        if ((i & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 1024 : 2048;
        }
        int i13 = i3 & 16;
        if (i13 != 0) {
            i4 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                if ((i & 196608) == 0) {
                    int i14 = onNavigationEvent + 61;
                    IAuthTabCallback = i14 % 128;
                    int i15 = i14 % 2;
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 131072 : 65536;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z3) ? 1048576 : 524288;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback) ? 8388608 : 4194304;
                }
                if ((i & 100663296) == 0) {
                    i4 |= ((i3 & 256) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j)) ? 67108864 : 33554432;
                }
                if ((i & 805306368) == 0) {
                    int i16 = IAuthTabCallback + 83;
                    int i17 = i16 % 128;
                    onNavigationEvent = i17;
                    int i18 = i16 % 2;
                    if ((i3 & 512) == 0) {
                        int i19 = i17 + 67;
                        IAuthTabCallback = i19 % 128;
                        if (i19 % 2 != 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2);
                            throw null;
                        }
                        int i20 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 536870912 : 268435456;
                        i4 |= i20;
                    }
                }
                i8 = i3 & 1024;
                if (i8 != 0) {
                    i9 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    i9 = i2 | (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(camera2CapturePipelineTorchTaskExternalSyntheticLambda2) ? 4 : 2);
                } else {
                    i9 = i2;
                }
                if ((i2 & 48) == 0) {
                    if ((i3 & 2048) == 0) {
                        int i21 = IAuthTabCallback + 113;
                        onNavigationEvent = i21 % 128;
                        int i22 = i21 % 2;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsubtitle)) {
                            i12 = 32;
                        }
                    }
                    i9 |= i12;
                }
                if ((i2 & 384) == 0) {
                    i9 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 256 : 128;
                }
                int i23 = i9;
                if ((i4 & 306783379) == 306783378 && (i23 & 147) == 146) {
                    int i24 = IAuthTabCallback + 75;
                    onNavigationEvent = i24 % 128;
                    int i25 = i24 % 2;
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i4 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((i & 1) != 0) {
                        int i26 = IAuthTabCallback + 73;
                        onNavigationEvent = i26 % 128;
                        int i27 = i26 % 2;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i13 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                            boolean z9 = i5 != 0 ? true : z2;
                            boolean z10 = i6 != 0 ? false : z3;
                            handleNativeAdClick.onExtraCallback onextracallbackIAuthTabCallback = i7 != 0 ? r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.asInterface.IAuthTabCallback.IAuthTabCallback() : onextracallback;
                            if ((i3 & 256) != 0) {
                                int i28 = IAuthTabCallback + 113;
                                onNavigationEvent = i28 % 128;
                                int i29 = i28 % 2;
                                i10 = 6;
                                jOnExtraCallback = r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted.onExtraCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                i4 &= -234881025;
                            } else {
                                i10 = 6;
                                jOnExtraCallback = j;
                            }
                            if ((i3 & 512) != 0) {
                                jIAuthTabCallbackStub = r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted.IAuthTabCallbackStub(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i10);
                                i4 &= -1879048193;
                            } else {
                                jIAuthTabCallbackStub = j2;
                            }
                            if (i8 != 0) {
                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized = Camera2CapturePipelineTorchTaskExternalSyntheticLambda0.onWarmupCompleted();
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                }
                                camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) objOnMinimized;
                            } else {
                                camera2CapturePipelineTorchTaskExternalSyntheticLambda23 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                            }
                            if ((i3 & 2048) != 0) {
                                int i30 = IAuthTabCallback + 35;
                                onNavigationEvent = i30 % 128;
                                int i31 = i30 % 2;
                                getsubtitleOnWarmupCompleted = r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted.onWarmupCompleted(z, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i4 >> 6) & 14) | 48);
                                i23 &= -113;
                            } else {
                                getsubtitleOnWarmupCompleted = getsubtitle;
                            }
                            camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda23;
                            z7 = z10;
                            getsubtitle3 = getsubtitleOnWarmupCompleted;
                            j5 = jOnExtraCallback;
                            j6 = jIAuthTabCallbackStub;
                            onextracallback3 = onextracallbackIAuthTabCallback;
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                            z8 = z9;
                        } else {
                            int i32 = IAuthTabCallback + 29;
                            onNavigationEvent = i32 % 128;
                            int i33 = i32 % 2;
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            if ((i3 & 512) != 0) {
                                int i34 = IAuthTabCallback + 109;
                                onNavigationEvent = i34 % 128;
                                if (i34 % 2 == 0) {
                                    throw null;
                                }
                                i4 &= -1879048193;
                            }
                            if ((i3 & 2048) != 0) {
                                i23 &= -113;
                            }
                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                            z8 = z2;
                            z7 = z3;
                            onextracallback3 = onextracallback;
                            j5 = j;
                            j6 = j2;
                            camera2CapturePipelineTorchTaskExternalSyntheticLambda24 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                            getsubtitle3 = getsubtitle;
                        }
                        int i35 = i4;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1120910969, i35, i23, "im.toss.tds.compose.component.compound.tab.v1.ItemPreset.Item (ItemPreset.kt:207)");
                        }
                        final boolean z11 = (j5 == 16 && j6 == 16) ? false : true;
                        boolean z12 = (i35 & 112) == 32;
                        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (z12 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.compound.tab.v1.ItemPreset$$ExternalSyntheticLambda1
                                private static int onExtraCallback = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke(Object obj) {
                                    int i36 = 2 % 2;
                                    int i37 = onExtraCallback + 125;
                                    onNavigationEvent = i37 % 128;
                                    int i38 = i37 % 2;
                                    Unit unitOnExtraCallback = x4ExternalSyntheticLambda4.onExtraCallback(str, (useAndConfigureProgramWithTexture) obj);
                                    int i39 = onNavigationEvent + 1;
                                    onExtraCallback = i39 % 128;
                                    int i40 = i39 % 2;
                                    return unitOnExtraCallback;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = getExtensionsBeforeInitialized.onExtraCallbackWithResult(quirksExternalSyntheticBackport03, false, (Function1) objOnMinimized2, 1, (Object) null);
                        onExtraCallback onextracallback4 = onExtraCallback.Icon;
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport03;
                        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-1598474042, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.tab.v1.ItemPreset$$ExternalSyntheticLambda2
                            private static int onExtraCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i36 = 2 % 2;
                                int i37 = onExtraCallback + 39;
                                onWarmupCompleted = i37 % 128;
                                if (i37 % 2 != 0) {
                                    x4ExternalSyntheticLambda4.onExtraCallbackWithResult(onextracallback3, z11, deprecated_followredirects, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    throw null;
                                }
                                Unit unitOnExtraCallbackWithResult = x4ExternalSyntheticLambda4.onExtraCallbackWithResult(onextracallback3, z11, deprecated_followredirects, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                int i38 = onWarmupCompleted + 49;
                                onExtraCallback = i38 % 128;
                                if (i38 % 2 == 0) {
                                    int i39 = 31 / 0;
                                }
                                return unitOnExtraCallbackWithResult;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                        int i36 = i35 >> 6;
                        int i37 = i23 << 3;
                        handleNativeAdClick.onExtraCallback onextracallback5 = onextracallback3;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        IAuthTabCallback(z, function0, onextracallback4, quirksExternalSyntheticBackport0OnExtraCallbackWithResult, null, z8, z7, j5, null, j6, null, camera2CapturePipelineTorchTaskExternalSyntheticLambda24, getsubtitle3, null, encoderProfilesProxyVideoProfileProxyOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResult2, (i36 & 112) | (i36 & 14) | 384 | (i35 & 458752) | (i35 & 3670016) | ((i35 >> 3) & 29360128) | (i35 & 1879048192), (i37 & 896) | (i37 & 112) | 24576 | ((i23 << 9) & 458752), 9488);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport05;
                        onextracallback2 = onextracallback5;
                        z5 = z8;
                        z6 = z7;
                        j3 = j5;
                        j4 = j6;
                        camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda24;
                        getsubtitle2 = getsubtitle3;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                    z5 = z2;
                    z6 = z3;
                    onextracallback2 = onextracallback;
                    j3 = j;
                    j4 = j2;
                    camera2CapturePipelineTorchTaskExternalSyntheticLambda22 = camera2CapturePipelineTorchTaskExternalSyntheticLambda2;
                    getsubtitle2 = getsubtitle;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new ItemPreset$$ExternalSyntheticLambda3(this, deprecated_followredirects, str, z, function0, quirksExternalSyntheticBackport02, z5, z6, onextracallback2, j3, j4, camera2CapturePipelineTorchTaskExternalSyntheticLambda22, getsubtitle2, i, i2, i3));
                    return;
                }
                return;
            }
            i4 |= 196608;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i8 = i3 & 1024;
            if (i8 != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i2 & 384) == 0) {
            }
            int i232 = i9;
            if ((i4 & 306783379) == 306783378) {
                z4 = true;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i4 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        i5 = i3 & 32;
        if (i5 != 0) {
        }
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i8 = i3 & 1024;
        if (i8 != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i2 & 384) == 0) {
        }
        int i2322 = i9;
        if ((i4 & 306783379) == 306783378) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z4, i4 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getThumbPosition getthumbpositionOnExtraCallback;
        getSwitchMinWidth.onExtraCallback onextracallback = (getSwitchMinWidth.onExtraCallback) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1629246188);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1629246188, iIntValue, -1, "im.toss.tds.compose.component.compound.tab.v1.ItemPreset.ItemTransition.<anonymous> (ItemPreset.kt:263)");
        }
        if (onextracallback.onExtraCallbackWithResult(Boolean.FALSE, Boolean.TRUE)) {
            int i4 = onNavigationEvent + 125;
            IAuthTabCallback = i4 % 128;
            getthumbpositionOnExtraCallback = i4 % 2 != 0 ? getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.asBinder(), 1, 3, (Object) null) : getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.asBinder(), 0, 2, (Object) null);
            int i5 = onNavigationEvent + 101;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        } else {
            getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.onExtraCallbackWithResult(), 0, 2, (Object) null);
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        int i7 = onNavigationEvent + 91;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return getthumbpositionOnExtraCallback;
        }
        throw null;
    }

    private static final updateFocusedState onExtraCallback(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        getThumbPosition getthumbpositionOnExtraCallback;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 51;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1871612154);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallback + 31;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1871612154, i, -1, "im.toss.tds.compose.component.compound.tab.v1.ItemPreset.ItemTransition.<anonymous> (ItemPreset.kt:276)");
        }
        if (onextracallback.onExtraCallbackWithResult(Boolean.FALSE, Boolean.TRUE)) {
            int i7 = onNavigationEvent + 43;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.asBinder(), 0, 2, (Object) null);
        } else {
            getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.onExtraCallbackWithResult(), 0, 2, (Object) null);
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = IAuthTabCallback + 111;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i10 = 26 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return getthumbpositionOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(final long j, final GraphicDeviceInfo graphicDeviceInfo, final long j2, final GraphicDeviceInfo graphicDeviceInfo2, final boolean z, final boolean z2, final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        long j3;
        Object objIAuthTabCallback;
        MaxAdPlacerExternalSyntheticLambda2 maxAdPlacerExternalSyntheticLambda2;
        int i3;
        int i4;
        long j4;
        Object obj;
        int i5;
        Object objIAuthTabCallback2;
        boolean zBooleanValue;
        int i6;
        char c;
        char c2;
        MaxAdPlacerExternalSyntheticLambda2 maxAdPlacerExternalSyntheticLambda22;
        long j5;
        int i7;
        int i8;
        boolean zOnNavigationEvent;
        Object objOnMinimized;
        boolean zBooleanValue2;
        MaxAdPlacerExternalSyntheticLambda2 maxAdPlacerExternalSyntheticLambda23;
        long j6;
        int i9;
        int i10;
        boolean zOnNavigationEvent2;
        Object objOnMinimized2;
        getSwitchMinWidth getswitchminwidth;
        Object objIAuthTabCallback3;
        boolean zBooleanValue3;
        float f;
        boolean zOnNavigationEvent3;
        int i11;
        int i12 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-331709341);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo)) {
                int i13 = onNavigationEvent + 29;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        if ((i & 384) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(graphicDeviceInfo2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= !cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 4194304 : 8388608;
        }
        int i15 = i2;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i15) != 4793490, i15 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-331709341, i15, -1, "im.toss.tds.compose.component.compound.tab.v1.ItemPreset.ItemTransition (ItemPreset.kt:258)");
            }
            getSwitchMinWidth getswitchminwidthOnWarmupCompleted = getSwitchPadding.onWarmupCompleted(Boolean.valueOf(z), "itemColor", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i15 >> 12) & 14) | 48, 0);
            int i16 = i15 >> 15;
            getSwitchMinWidth getswitchminwidthOnWarmupCompleted2 = getSwitchPadding.onWarmupCompleted(Boolean.valueOf(z2), "itemAlpha", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i16 & 14) | 48, 0);
            getBacktraceNote getbacktracenote = new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.tab.v1.ItemPreset$$ExternalSyntheticLambda7
                private static int onExtraCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i17 = 2 % 2;
                    int i18 = onExtraCallbackWithResult + 57;
                    onExtraCallback = i18 % 128;
                    int i19 = i18 % 2;
                    Object[] objArr = {(getSwitchMinWidth.onExtraCallback) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(((Integer) obj4).intValue())};
                    updateFocusedState updatefocusedstate = (updateFocusedState) x4ExternalSyntheticLambda4.onExtraCallback(setCurrentIndex.onNavigationEvent(), 921676580, -921676575, setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
                    int i20 = onExtraCallbackWithResult + 69;
                    onExtraCallback = i20 % 128;
                    if (i20 % 2 != 0) {
                        return updatefocusedstate;
                    }
                    throw null;
                }
            };
            boolean zBooleanValue4 = ((Boolean) getswitchminwidthOnWarmupCompleted.access000()).booleanValue();
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1813767552);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1813767552, 0, -1, "im.toss.tds.compose.component.compound.tab.v1.ItemPreset.ItemTransition.<anonymous> (ItemPreset.kt:271)");
            }
            if (!zBooleanValue4) {
                j3 = j2;
            } else {
                int i17 = IAuthTabCallback + 101;
                onNavigationEvent = i17 % 128;
                int i18 = i17 % 2;
                j3 = j;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            getAttribute getattributeOnExtraCallbackWithResult = setByteOrder.onExtraCallbackWithResult(j3);
            boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getattributeOnExtraCallbackWithResult);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!zOnNavigationEvent4) {
                Object obj2 = objOnMinimized3;
                if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    getThumbTintList getthumbtintlist = (getThumbTintList) ResourceManagerInternalAvdcInflateDelegate.onNavigationEvent(setByteOrder.Companion).invoke(getattributeOnExtraCallbackWithResult);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getthumbtintlist);
                    obj2 = getthumbtintlist;
                }
                getThumbTintList getthumbtintlist2 = (getThumbTintList) obj2;
                Function1 function1IAuthTabCallbackStub = null;
                if (getswitchminwidthOnWarmupCompleted.IAuthTabCallback_Parcel()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1666827533);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    objIAuthTabCallback = getswitchminwidthOnWarmupCompleted.IAuthTabCallback();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1666573488);
                    boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                    objIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnNavigationEvent5 || objIAuthTabCallback == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                        r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
                        Function1 function1IAuthTabCallbackStub2 = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback.IAuthTabCallbackStub() : null;
                        r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback);
                        try {
                            Object objIAuthTabCallback4 = getswitchminwidthOnWarmupCompleted.IAuthTabCallback();
                            iAuthTabCallback.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult, function1IAuthTabCallbackStub2);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objIAuthTabCallback4);
                            objIAuthTabCallback = objIAuthTabCallback4;
                        } finally {
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                }
                boolean zBooleanValue5 = ((Boolean) objIAuthTabCallback).booleanValue();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1813767552);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1813767552, 0, -1, "im.toss.tds.compose.component.compound.tab.v1.ItemPreset.ItemTransition.<anonymous> (ItemPreset.kt:271)");
                }
                long j7 = zBooleanValue5 ? j : j2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                setByteOrder setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(j7);
                boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent6 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized4 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onNavigationEvent(getswitchminwidthOnWarmupCompleted));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                }
                boolean zBooleanValue6 = ((Boolean) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized4).onExtraCallbackWithResult()).booleanValue();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1813767552);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1813767552, 0, -1, "im.toss.tds.compose.component.compound.tab.v1.ItemPreset.ItemTransition.<anonymous> (ItemPreset.kt:271)");
                }
                long j8 = zBooleanValue6 ? j : j2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                setByteOrder setbyteorderOnNavigationEvent2 = setByteOrder.onNavigationEvent(j8);
                boolean zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent7 || objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized5 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new onExtraCallbackWithResult(getswitchminwidthOnWarmupCompleted));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                }
                CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback = getSwitchPadding.onExtraCallback(getswitchminwidthOnWarmupCompleted, setbyteorderOnNavigationEvent, setbyteorderOnNavigationEvent2, (updateFocusedState) getbacktracenote.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized5).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), getthumbtintlist2, "itemColor", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196608);
                getBacktraceNote getbacktracenote2 = new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.tab.v1.ItemPreset$$ExternalSyntheticLambda8
                    private static int IAuthTabCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i19 = 2 % 2;
                        int i20 = IAuthTabCallback + 103;
                        onWarmupCompleted = i20 % 128;
                        int i21 = i20 % 2;
                        updateFocusedState updatefocusedstateOnWarmupCompleted = x4ExternalSyntheticLambda4.onWarmupCompleted((getSwitchMinWidth.onExtraCallback) obj3, (CameraCaptureResultEmptyCameraCaptureResult) obj4, ((Integer) obj5).intValue());
                        int i22 = onWarmupCompleted + 59;
                        IAuthTabCallback = i22 % 128;
                        int i23 = i22 % 2;
                        return updatefocusedstateOnWarmupCompleted;
                    }
                };
                boolean zBooleanValue7 = ((Boolean) getswitchminwidthOnWarmupCompleted.access000()).booleanValue();
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1106507802);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1106507802, 0, -1, "im.toss.tds.compose.component.compound.tab.v1.ItemPreset.ItemTransition.<anonymous> (ItemPreset.kt:285)");
                }
                if (zBooleanValue7) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1797895126);
                    maxAdPlacerExternalSyntheticLambda2 = MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent;
                    i3 = (i15 & 14) | 432;
                    i4 = -200;
                    j4 = j;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1797896278);
                    maxAdPlacerExternalSyntheticLambda2 = MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent;
                    i3 = ((i15 >> 6) & 14) | 432;
                    i4 = -100;
                    j4 = j2;
                }
                long jOnNavigationEvent = maxAdPlacerExternalSyntheticLambda2.onNavigationEvent(j4, i4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i3);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                getAttribute getattributeOnExtraCallbackWithResult2 = setByteOrder.onExtraCallbackWithResult(jOnNavigationEvent);
                boolean zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getattributeOnExtraCallbackWithResult2);
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent8) {
                    getThumbTintList getthumbtintlist3 = (getThumbTintList) ResourceManagerInternalAvdcInflateDelegate.onNavigationEvent(setByteOrder.Companion).invoke(getattributeOnExtraCallbackWithResult2);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getthumbtintlist3);
                    obj = getthumbtintlist3;
                    getThumbTintList getthumbtintlist4 = (getThumbTintList) obj;
                    if (getswitchminwidthOnWarmupCompleted.IAuthTabCallback_Parcel()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1666573488);
                        boolean zOnNavigationEvent9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                        objIAuthTabCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (zOnNavigationEvent9 || objIAuthTabCallback2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback2 = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                            r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2 = iAuthTabCallback2.IAuthTabCallback();
                            Function1 function1IAuthTabCallbackStub3 = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2 != null ? r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2.IAuthTabCallbackStub() : null;
                            r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult2 = iAuthTabCallback2.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2);
                            try {
                                Object objIAuthTabCallback5 = getswitchminwidthOnWarmupCompleted.IAuthTabCallback();
                                iAuthTabCallback2.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback2, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult2, function1IAuthTabCallbackStub3);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objIAuthTabCallback5);
                                objIAuthTabCallback2 = objIAuthTabCallback5;
                            } finally {
                            }
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        i5 = 1666827533;
                    } else {
                        i5 = 1666827533;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1666827533);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        objIAuthTabCallback2 = getswitchminwidthOnWarmupCompleted.IAuthTabCallback();
                    }
                    zBooleanValue = ((Boolean) objIAuthTabCallback2).booleanValue();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1106507802);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        i6 = -1;
                    } else {
                        i6 = -1;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1106507802, 0, -1, "im.toss.tds.compose.component.compound.tab.v1.ItemPreset.ItemTransition.<anonymous> (ItemPreset.kt:285)");
                    }
                    if (zBooleanValue) {
                        c = 47190;
                        c2 = 46038;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1797896278);
                        maxAdPlacerExternalSyntheticLambda22 = MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent;
                        j5 = j2;
                        i7 = ((i15 >> 6) & 14) | 432;
                        i8 = -100;
                    } else {
                        c2 = 46038;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1797895126);
                        maxAdPlacerExternalSyntheticLambda22 = MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent;
                        j5 = j;
                        i7 = (i15 & 14) | 432;
                        i8 = -200;
                        c = 47190;
                    }
                    int i19 = i8;
                    int i20 = i6;
                    int i21 = i5;
                    long jOnNavigationEvent2 = maxAdPlacerExternalSyntheticLambda22.onNavigationEvent(j5, i19, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i7);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i22 = onNavigationEvent + 61;
                        IAuthTabCallback = i22 % 128;
                        int i23 = i22 % 2;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    setByteOrder setbyteorderOnNavigationEvent3 = setByteOrder.onNavigationEvent(jOnNavigationEvent2);
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallback(getswitchminwidthOnWarmupCompleted));
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                    }
                    zBooleanValue2 = ((Boolean) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized).onExtraCallbackWithResult()).booleanValue();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1106507802);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1106507802, 0, i20, "im.toss.tds.compose.component.compound.tab.v1.ItemPreset.ItemTransition.<anonymous> (ItemPreset.kt:285)");
                    }
                    if (zBooleanValue2) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1797896278);
                        maxAdPlacerExternalSyntheticLambda23 = MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent;
                        j6 = j2;
                        i9 = ((i15 >> 6) & 14) | 432;
                        i10 = -100;
                    } else {
                        int i24 = IAuthTabCallback + 3;
                        onNavigationEvent = i24 % 128;
                        if (i24 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1797895126);
                            maxAdPlacerExternalSyntheticLambda23 = MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent;
                            i9 = (i15 & 27) | 14701;
                            i10 = 9928;
                            j6 = j;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1797895126);
                            maxAdPlacerExternalSyntheticLambda23 = MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent;
                            j6 = j;
                            i9 = (i15 & 14) | 432;
                            i10 = -200;
                        }
                    }
                    long jOnNavigationEvent3 = maxAdPlacerExternalSyntheticLambda23.onNavigationEvent(j6, i10, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i9);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i25 = IAuthTabCallback + 69;
                        onNavigationEvent = i25 % 128;
                        int i26 = i25 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    setByteOrder setbyteorderOnNavigationEvent4 = setByteOrder.onNavigationEvent(jOnNavigationEvent3);
                    zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                    objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnNavigationEvent2 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallbackStub(getswitchminwidthOnWarmupCompleted));
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                    }
                    CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback2 = getSwitchPadding.onExtraCallback(getswitchminwidthOnWarmupCompleted, setbyteorderOnNavigationEvent3, setbyteorderOnNavigationEvent4, (updateFocusedState) getbacktracenote2.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized2).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), getthumbtintlist4, "itemColor", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196608);
                    addInterstitialAdapter.IAuthTabCallback iAuthTabCallback3 = addInterstitialAdapter.IAuthTabCallback.IAuthTabCallback;
                    getThumbTintList getthumbtintlistIAuthTabCallback = getThumbTextPadding.IAuthTabCallback(FloatCompanionObject.INSTANCE);
                    if (getswitchminwidthOnWarmupCompleted2.IAuthTabCallback_Parcel()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1666573488);
                        getswitchminwidth = getswitchminwidthOnWarmupCompleted2;
                        boolean zOnNavigationEvent10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidth);
                        objIAuthTabCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (zOnNavigationEvent10 || objIAuthTabCallback3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.IAuthTabCallback iAuthTabCallback4 = r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4.Companion;
                            r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback3 = iAuthTabCallback4.IAuthTabCallback();
                            if (r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback3 != null) {
                                int i27 = IAuthTabCallback + 1;
                                onNavigationEvent = i27 % 128;
                                int i28 = i27 % 2;
                                function1IAuthTabCallbackStub = r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback3.IAuthTabCallbackStub();
                            }
                            Function1 function1 = function1IAuthTabCallbackStub;
                            r8lambdaRDgtUSA8acdlq9PBbMSiiQGdR4 r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult3 = iAuthTabCallback4.onExtraCallbackWithResult(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback3);
                            try {
                                Object objIAuthTabCallback6 = getswitchminwidth.IAuthTabCallback();
                                iAuthTabCallback4.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback3, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult3, function1);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objIAuthTabCallback6);
                                objIAuthTabCallback3 = objIAuthTabCallback6;
                            } catch (Throwable th) {
                                iAuthTabCallback4.onWarmupCompleted(r8lambdardgtusa8acdlq9pbbmsiiqgdr4IAuthTabCallback3, r8lambdardgtusa8acdlq9pbbmsiiqgdr4OnExtraCallbackWithResult3, function1);
                                throw th;
                            }
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    } else {
                        getswitchminwidth = getswitchminwidthOnWarmupCompleted2;
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(i21);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        objIAuthTabCallback3 = getswitchminwidth.IAuthTabCallback();
                    }
                    zBooleanValue3 = ((Boolean) objIAuthTabCallback3).booleanValue();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1838581233);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i29 = onNavigationEvent + 73;
                        IAuthTabCallback = i29 % 128;
                        if (i29 % 2 != 0) {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1838581233, 1, i20, "im.toss.tds.compose.component.compound.tab.v1.ItemPreset.ItemTransition.<anonymous> (ItemPreset.kt:289)");
                        } else {
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1838581233, 0, i20, "im.toss.tds.compose.component.compound.tab.v1.ItemPreset.ItemTransition.<anonymous> (ItemPreset.kt:289)");
                        }
                    }
                    if (zBooleanValue3) {
                        f = 0.3f;
                    } else {
                        int i30 = IAuthTabCallback + 29;
                        onNavigationEvent = i30 % 128;
                        int i31 = i30 % 2;
                        f = 1.0f;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidth);
                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (zOnNavigationEvent3) {
                        int i32 = onNavigationEvent + 85;
                        IAuthTabCallback = i32 % 128;
                        int i33 = i32 % 2;
                        if (objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized7 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new addInterstitialAdapter.onNavigationEvent(getswitchminwidth));
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
                        }
                        boolean zBooleanValue8 = ((Boolean) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized7).onExtraCallbackWithResult()).booleanValue();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1838581233);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i34 = IAuthTabCallback + 93;
                            onNavigationEvent = i34 % 128;
                            int i35 = i34 % 2;
                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1838581233, 0, i20, "im.toss.tds.compose.component.compound.tab.v1.ItemPreset.ItemTransition.<anonymous> (ItemPreset.kt:289)");
                        }
                        float f2 = zBooleanValue8 ? 1.0f : 0.3f;
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        boolean zOnNavigationEvent11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidth);
                        Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (zOnNavigationEvent11 || objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized8 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new addInterstitialAdapter.onWarmupCompleted(getswitchminwidth));
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized8);
                        }
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback3 = getSwitchPadding.onExtraCallback(getswitchminwidth, Float.valueOf(f), Float.valueOf(f2), (updateFocusedState) iAuthTabCallback3.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized8).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), getthumbtintlistIAuthTabCallback, "itemAlpha", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196608);
                        boolean zOnNavigationEvent12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback3);
                        Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (zOnNavigationEvent12 || objOnMinimized9 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized9 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new addInterstitialAdapter.onExtraCallback(cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback3));
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized9);
                        }
                        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized9;
                        setPostviewFormatSelector.onExtraCallback(new accessgetCameraFactoryp[]{convertYUVToRGB.IAuthTabCallback().onExtraCallback(setByteOrder.onNavigationEvent(onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<setByteOrder>) cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback))), copyBitmapToByteBuffer.IAuthTabCallback().onExtraCallback(Float.valueOf(((Float) onExtraCallback(setCurrentIndex.onNavigationEvent(), -1645107983, 1645107987, setCurrentIndex.onNavigationEvent(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent())).floatValue())), onExtraCallbackWithResult.onExtraCallback(setByteOrder.onNavigationEvent(onExtraCallback((CameraPresenceProviderExternalSyntheticLambda6<setByteOrder>) cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback2))), PreviewExternalSyntheticLambda3.onWarmupCompleted().onExtraCallback(((getHumanReadableName) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(PreviewExternalSyntheticLambda3.onWarmupCompleted())).onWarmupCompleted(new getHumanReadableName(getMaxAdCount.onExtraCallbackWithResult(onNavigationEvent((CameraPresenceProviderExternalSyntheticLambda6<setByteOrder>) cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback), RangesKt.coerceIn(((Float) onExtraCallback(setCurrentIndex.onNavigationEvent(), -1645107983, 1645107987, setCurrentIndex.onNavigationEvent(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent())).floatValue(), 0.5f, 1.0f)), 0L, z ? graphicDeviceInfo : graphicDeviceInfo2, (use) null, (delete) null, (getSurfaceSize) null, (String) null, 0L, (getHighestSurfacePriority) null, (getParentMetadataCallback) null, (addCameraErrorListener) null, 0L, (bindChildren) null, (ExifSpeedConverter) null, (hasMoreElements) null, 0, 0, 0L, (mergeChildrenConfigs) null, (r8lambdak6CWcefLe9tXuLSlGJo2BURuBM) null, (getChildPreviewOutConfig) null, 0, 0, (notifySessionStop) null, 16777210, (DefaultConstructorMarker) null)))}, function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | (i16 & 112));
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                } else {
                    obj = objOnMinimized6;
                    if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    }
                    getThumbTintList getthumbtintlist42 = (getThumbTintList) obj;
                    if (getswitchminwidthOnWarmupCompleted.IAuthTabCallback_Parcel()) {
                    }
                    zBooleanValue = ((Boolean) objIAuthTabCallback2).booleanValue();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1106507802);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    if (zBooleanValue) {
                    }
                    int i192 = i8;
                    int i202 = i6;
                    int i212 = i5;
                    long jOnNavigationEvent22 = maxAdPlacerExternalSyntheticLambda22.onNavigationEvent(j5, i192, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i7);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    setByteOrder setbyteorderOnNavigationEvent32 = setByteOrder.onNavigationEvent(jOnNavigationEvent22);
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!zOnNavigationEvent) {
                        objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallback(getswitchminwidthOnWarmupCompleted));
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        zBooleanValue2 = ((Boolean) ((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized).onExtraCallbackWithResult()).booleanValue();
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1106507802);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        if (zBooleanValue2) {
                        }
                        long jOnNavigationEvent32 = maxAdPlacerExternalSyntheticLambda23.onNavigationEvent(j6, i10, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i9);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                        setByteOrder setbyteorderOnNavigationEvent42 = setByteOrder.onNavigationEvent(jOnNavigationEvent32);
                        zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidthOnWarmupCompleted);
                        objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!zOnNavigationEvent2) {
                            objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(new IAuthTabCallbackStub(getswitchminwidthOnWarmupCompleted));
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                            CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6OnExtraCallback22 = getSwitchPadding.onExtraCallback(getswitchminwidthOnWarmupCompleted, setbyteorderOnNavigationEvent32, setbyteorderOnNavigationEvent42, (updateFocusedState) getbacktracenote2.invoke(((CameraPresenceProviderExternalSyntheticLambda6) objOnMinimized2).onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), getthumbtintlist42, "itemColor", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196608);
                            addInterstitialAdapter.IAuthTabCallback iAuthTabCallback32 = addInterstitialAdapter.IAuthTabCallback.IAuthTabCallback;
                            getThumbTintList getthumbtintlistIAuthTabCallback2 = getThumbTextPadding.IAuthTabCallback(FloatCompanionObject.INSTANCE);
                            if (getswitchminwidthOnWarmupCompleted2.IAuthTabCallback_Parcel()) {
                            }
                            zBooleanValue3 = ((Boolean) objIAuthTabCallback3).booleanValue();
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1838581233);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            }
                            if (zBooleanValue3) {
                            }
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            }
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                            zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getswitchminwidth);
                            Object objOnMinimized72 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (zOnNavigationEvent3) {
                            }
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.tab.v1.ItemPreset$$ExternalSyntheticLambda9
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj3, Object obj4) {
                    int i36 = 2 % 2;
                    int i37 = onExtraCallbackWithResult + 63;
                    IAuthTabCallback = i37 % 128;
                    int i38 = i37 % 2;
                    x4ExternalSyntheticLambda4 x4externalsyntheticlambda4 = this.f$0;
                    long j9 = j;
                    GraphicDeviceInfo graphicDeviceInfo3 = graphicDeviceInfo;
                    long j10 = j2;
                    GraphicDeviceInfo graphicDeviceInfo4 = graphicDeviceInfo2;
                    boolean z3 = z;
                    boolean z4 = z2;
                    Function2 function22 = function2;
                    int i39 = i;
                    int iIntValue = ((Integer) obj4).intValue();
                    Object[] objArr = {x4externalsyntheticlambda4, Long.valueOf(j9), graphicDeviceInfo3, Long.valueOf(j10), graphicDeviceInfo4, Boolean.valueOf(z3), Boolean.valueOf(z4), function22, Integer.valueOf(i39), (CameraCaptureResultEmptyCameraCaptureResult) obj3, Integer.valueOf(iIntValue)};
                    Unit unit = (Unit) x4ExternalSyntheticLambda4.onExtraCallback(setCurrentIndex.onNavigationEvent(), -1415947299, 1415947302, setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
                    int i40 = onExtraCallbackWithResult + 47;
                    IAuthTabCallback = i40 % 128;
                    if (i40 % 2 != 0) {
                        return unit;
                    }
                    Object obj5 = null;
                    obj5.hashCode();
                    throw null;
                }
            });
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[PHI: r0
      0x003d: PHI (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r0
      0x0024: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v7 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(final r8lambdaMeFGHmY2TXYC8KG26JsWVKWVrWA.onWarmupCompleted onwarmupcompleted, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        float fIAuthTabCallback;
        int i5 = 2 % 2;
        int i6 = onNavigationEvent + 47;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1678305644);
            if ((i & 48) == 0) {
                int i7 = IAuthTabCallback + 107;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onwarmupcompleted.ordinal()) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1678305644);
            if ((i & 6) == 0) {
            }
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i10 = IAuthTabCallback + 103;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    i4 = 32;
                } else {
                    i4 = 16;
                }
                i3 |= i4;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 19) == 18, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            } else {
                if (i9 != 0) {
                    int i12 = onNavigationEvent + 9;
                    IAuthTabCallback = i12 % 128;
                    if (i12 % 2 != 0) {
                        quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                        int i13 = 41 / 0;
                    } else {
                        quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                    }
                } else {
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                }
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1678305644, i3, -1, "im.toss.tds.compose.component.compound.tab.v1.ItemPreset.RedDot (ItemPreset.kt:307)");
                }
                int i14 = asBinder.onExtraCallback[onwarmupcompleted.ordinal()];
                if (i14 != 1) {
                    int i15 = IAuthTabCallback + 45;
                    onNavigationEvent = i15 % 128;
                    if (i15 % 2 != 0 ? i14 != 2 : i14 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f);
                } else {
                    fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f);
                }
                FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(verifyDrawable.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport04, fIAuthTabCallback), ((Long) r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onExtraCallback(new Object[]{r8lambdaWgmLoT4GzpQjK3ABW8eHrhRqxU.onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6}, matches.onExtraCallback(), 1725508950, matches.onExtraCallback(), matches.onExtraCallback(), -1725508948, matches.onExtraCallback())).longValue(), RoundedCornerShapeKt.onWarmupCompleted()), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i16 = onNavigationEvent + 61;
                    IAuthTabCallback = i16 % 128;
                    int i17 = i16 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                int i18 = onNavigationEvent + 5;
                IAuthTabCallback = i18 % 128;
                int i19 = i18 % 2;
                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.tab.v1.ItemPreset$$ExternalSyntheticLambda6
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                        int i20 = 2 % 2;
                        int i21 = IAuthTabCallback + 77;
                        onExtraCallbackWithResult = i21 % 128;
                        int i22 = i21 % 2;
                        Unit unitOnWarmupCompleted = x4ExternalSyntheticLambda4.onWarmupCompleted(this.f$0, onwarmupcompleted, quirksExternalSyntheticBackport03, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i23 = onExtraCallbackWithResult + 101;
                        IAuthTabCallback = i23 % 128;
                        int i24 = i23 % 2;
                        return unitOnWarmupCompleted;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 19) == 18, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    static final class onTransact implements Function0<setByteOrder> {
        public static final onTransact IAuthTabCallback = new onTransact();
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int i = onExtraCallbackWithResult + 109;
            onNavigationEvent = i % 128;
            int i2 = i % 2;
        }

        onTransact() {
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            setByteOrder setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(onExtraCallbackWithResult());
            int i4 = onWarmupCompleted + 57;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return setbyteorderOnNavigationEvent;
            }
            throw null;
        }

        public final long onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            setByteOrder.onExtraCallbackWithResult onextracallbackwithresult = setByteOrder.Companion;
            if (i3 == 0) {
                return onextracallbackwithresult.onTransact();
            }
            onextracallbackwithresult.onTransact();
            throw null;
        }
    }

    static {
        int i = asInterface + 85;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallback {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallback[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        public static final onExtraCallback Text = new onExtraCallback("Text", 0);
        public static final onExtraCallback Icon = new onExtraCallback("Icon", 1);

        private static final /* synthetic */ onExtraCallback[] $values() {
            onExtraCallback[] onextracallbackArr;
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 31;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                onExtraCallback onextracallback = Text;
                onExtraCallback onextracallback2 = Icon;
                onextracallbackArr = new onExtraCallback[5];
                onextracallbackArr[0] = onextracallback;
                onextracallbackArr[0] = onextracallback2;
            } else {
                onextracallbackArr = new onExtraCallback[]{Text, Icon};
            }
            int i4 = i2 + 87;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackArr;
        }

        public static EnumEntries<onExtraCallback> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 121;
            int i3 = i2 % 128;
            onNavigationEvent = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            EnumEntries<onExtraCallback> enumEntries = $ENTRIES;
            int i4 = i3 + 37;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return enumEntries;
            }
            obj.hashCode();
            throw null;
        }

        public static onExtraCallback valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallback = (onExtraCallback) Enum.valueOf(onExtraCallback.class, str);
            int i4 = IAuthTabCallback + 49;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return onextracallback;
        }

        public static onExtraCallback[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 73;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback[] onextracallbackArr = $VALUES;
            if (i3 != 0) {
                return (onExtraCallback[]) onextracallbackArr.clone();
            }
            int i4 = 74 / 0;
            return (onExtraCallback[]) onextracallbackArr.clone();
        }

        static {
            onExtraCallback[] onextracallbackArr$values = $values();
            $VALUES = onextracallbackArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackArr$values);
            int i = onExtraCallback + 5;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                int i2 = 17 / 0;
            }
        }

        private onExtraCallback(String str, int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        public static final onWarmupCompleted Content = new onWarmupCompleted("Content", 0);
        public static final onWarmupCompleted RightAccessory = new onWarmupCompleted("RightAccessory", 1);
        public static final onWarmupCompleted RedDot = new onWarmupCompleted("RedDot", 2);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 125;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = {Content, RightAccessory, RedDot};
            int i5 = i2 + 81;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 10 / 0;
            }
            return onwarmupcompletedArr;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return $ENTRIES;
            }
            throw null;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            if (i3 != 0) {
                int i4 = 96 / 0;
            }
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 57;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i4 = onExtraCallback + 21;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onWarmupCompleted(String str, int i) {
        }
    }

    private static final long onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        setByteOrder setbyteorder = (setByteOrder) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 == 0) {
            return setbyteorder.access100();
        }
        long jAccess100 = setbyteorder.access100();
        int i4 = 11 / 0;
        return jAccess100;
    }

    private static final long onExtraCallback(CameraPresenceProviderExternalSyntheticLambda6<setByteOrder> cameraPresenceProviderExternalSyntheticLambda6) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        long jAccess100 = ((setByteOrder) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).access100();
        int i4 = IAuthTabCallback + 95;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return jAccess100;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Number number = (Number) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult();
        if (i3 != 0) {
            return Float.valueOf(number.floatValue());
        }
        number.floatValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback implements Function0<Boolean> {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ getSwitchMinWidth onExtraCallbackWithResult;

        public IAuthTabCallback(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallbackWithResult = getswitchminwidth;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Boolean, java.lang.Object] */
        public final Boolean invoke() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onWarmupCompleted = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                this.onExtraCallbackWithResult.access000();
                obj.hashCode();
                throw null;
            }
            ?? Access000 = this.onExtraCallbackWithResult.access000();
            int i3 = IAuthTabCallback + 29;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return Access000;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static final class onNavigationEvent implements Function0<Boolean> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ getSwitchMinWidth onWarmupCompleted;

        public onNavigationEvent(getSwitchMinWidth getswitchminwidth) {
            this.onWarmupCompleted = getswitchminwidth;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
        public final Boolean invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth getswitchminwidth = this.onWarmupCompleted;
            if (i3 == 0) {
                return getswitchminwidth.access000();
            }
            getswitchminwidth.access000();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class IAuthTabCallbackStub implements Function0<getSwitchMinWidth.onExtraCallback<Boolean>> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ getSwitchMinWidth onExtraCallback;

        public IAuthTabCallbackStub(getSwitchMinWidth getswitchminwidth) {
            this.onExtraCallback = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<Boolean> onextracallbackOnWarmupCompleted = onWarmupCompleted();
            int i4 = onNavigationEvent + 81;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackOnWarmupCompleted;
            }
            throw null;
        }

        public final getSwitchMinWidth.onExtraCallback<Boolean> onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                this.onExtraCallback.IAuthTabCallbackDefault();
                throw null;
            }
            getSwitchMinWidth.onExtraCallback<Boolean> onextracallbackIAuthTabCallbackDefault = this.onExtraCallback.IAuthTabCallbackDefault();
            int i3 = onWarmupCompleted + 7;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return onextracallbackIAuthTabCallbackDefault;
            }
            throw null;
        }
    }

    public static final class onExtraCallbackWithResult implements Function0<getSwitchMinWidth.onExtraCallback<Boolean>> {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ getSwitchMinWidth onWarmupCompleted;

        public onExtraCallbackWithResult(getSwitchMinWidth getswitchminwidth) {
            this.onWarmupCompleted = getswitchminwidth;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<Boolean> onextracallbackOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i4 = onExtraCallback + 99;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackOnExtraCallbackWithResult;
        }

        public final getSwitchMinWidth.onExtraCallback<Boolean> onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            getSwitchMinWidth.onExtraCallback<Boolean> onextracallbackIAuthTabCallbackDefault = this.onWarmupCompleted.IAuthTabCallbackDefault();
            int i4 = onExtraCallbackWithResult + 37;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackIAuthTabCallbackDefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ updateFocusedState onExtraCallbackWithResult(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {onextracallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (updateFocusedState) onExtraCallback(setCurrentIndex.onNavigationEvent(), 921676580, -921676575, setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, deprecated_followRedirects deprecated_followredirects, String str, boolean z, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z2, boolean z3, handleNativeAdClick.onExtraCallback onextracallback, long j, long j2, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Object[] objArr = {x4externalsyntheticlambda4, deprecated_followredirects, str, Boolean.valueOf(z), function0, quirksExternalSyntheticBackport0, Boolean.valueOf(z2), Boolean.valueOf(z3), onextracallback, Long.valueOf(j), Long.valueOf(j2), camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        return (Unit) onExtraCallback(setCurrentIndex.onNavigationEvent(), -1116337501, 1116337501, setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallback(setCurrentIndex.onNavigationEvent(), 168177210, -168177208, setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
    }

    public static /* synthetic */ Unit IAuthTabCallback(x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, long j, GraphicDeviceInfo graphicDeviceInfo, long j2, GraphicDeviceInfo graphicDeviceInfo2, boolean z, boolean z2, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {x4externalsyntheticlambda4, Long.valueOf(j), graphicDeviceInfo, Long.valueOf(j2), graphicDeviceInfo2, Boolean.valueOf(z), Boolean.valueOf(z2), function2, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        return (Unit) onExtraCallback(setCurrentIndex.onNavigationEvent(), -1415947299, 1415947302, setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
    }

    private static final updateFocusedState IAuthTabCallback(getSwitchMinWidth.onExtraCallback onextracallback, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {onextracallback, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (updateFocusedState) onExtraCallback(setCurrentIndex.onNavigationEvent(), 1517559934, -1517559933, setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
    }

    private static final float onWarmupCompleted(CameraPresenceProviderExternalSyntheticLambda6<Float> cameraPresenceProviderExternalSyntheticLambda6) {
        int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
        int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
        return ((Float) onExtraCallback(setCurrentIndex.onNavigationEvent(), -1645107983, 1645107987, iOnNavigationEvent, new Object[]{cameraPresenceProviderExternalSyntheticLambda6}, iOnNavigationEvent2, setCurrentIndex.onNavigationEvent())).floatValue();
    }

    private static final Unit onNavigationEvent(x4ExternalSyntheticLambda4 x4externalsyntheticlambda4, String str, boolean z, Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z2, boolean z3, long j, GraphicDeviceInfo graphicDeviceInfo, long j2, GraphicDeviceInfo graphicDeviceInfo2, getBacktraceNote getbacktracenote, Camera2CapturePipelineTorchTaskExternalSyntheticLambda2 camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getSubtitle getsubtitle, int i, int i2, int i3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i4) {
        Object[] objArr = {x4externalsyntheticlambda4, str, Boolean.valueOf(z), function0, quirksExternalSyntheticBackport0, Boolean.valueOf(z2), Boolean.valueOf(z3), Long.valueOf(j), graphicDeviceInfo, Long.valueOf(j2), graphicDeviceInfo2, getbacktracenote, camera2CapturePipelineTorchTaskExternalSyntheticLambda2, getsubtitle, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i4)};
        return (Unit) onExtraCallback(setCurrentIndex.onNavigationEvent(), 358797287, -358797281, setCurrentIndex.onNavigationEvent(), objArr, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
    }
}
