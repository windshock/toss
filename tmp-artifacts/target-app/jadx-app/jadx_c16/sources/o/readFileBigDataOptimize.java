package o;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.semantics.Role;
import im.toss.features.edoc.composable.IssuableEDocListScreenKt$;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tds.compose.R;
import im.toss.tds.compose.component.compound.listrow.v1.RightPreset;
import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.access;
import o.getViewTypeCount;
import o.pauseAnimation;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.electronicdocument.wallet.EDocIssuableCandidate;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class readFileBigDataOptimize {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;

    private static final Unit IAuthTabCallback(String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 109;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        IAuthTabCallback(str, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 1;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[1];
        AppLovinAdClickListener appLovinAdClickListener = (AppLovinAdClickListener) objArr[2];
        Function0 function0 = (Function0) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent(quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, appLovinAdClickListener, function0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, appLovinAdClickListener, function0, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = IAuthTabCallback + 123;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 55;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 19 / 0;
        }
        int i6 = IAuthTabCallback + 81;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, String str2, boolean z, String str3, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 121;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {str, str2, Boolean.valueOf(z), str3, quirksExternalSyntheticBackport0, function0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        Unit unit = (Unit) onExtraCallbackWithResult(1453180139, -1453180138, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, objArr);
        int i7 = IAuthTabCallback + 83;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, boolean z, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 73;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallbackWithResult(str, z, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallbackWithResult(str, z, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 85;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        onWarmupCompleted(deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = (~(i7 | i8 | (~i6))) | (~(i | i2 | i6));
        int i10 = (~(i8 | i6)) | (~(i8 | i));
        int i11 = (~(i6 | i2)) | i;
        int i12 = i + i2 + i5 + (1661237432 * i4) + (961048624 * i3);
        int i13 = i12 * i12;
        int i14 = ((119520104 * i) - 281083904) + ((-1329838950) * i2) + (i9 * 724679527) + (724679527 * i10) + ((-724679527) * i11) + ((-605159424) * i5) + ((-1559232512) * i4) + (1553989632 * i3) + (2020540416 * i13);
        int i15 = (i * (-2040814728)) + 92927091 + (i2 * (-2040813538)) + (i9 * (-595)) + (i10 * (-595)) + (i11 * 595) + (i5 * (-2040814133)) + (i4 * (-1614655000)) + (i3 * 500164112) + (i13 * 184877056);
        int i16 = i14 + (i15 * i15 * 1800994816);
        if (i16 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i16 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i16 == 3) {
            return onWarmupCompleted(objArr);
        }
        if (i16 != 4) {
            return onExtraCallback(objArr);
        }
        List list = (List) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0 = (AudioRestrictionControllerImplExternalSyntheticLambda0) objArr[2];
        int i17 = 2 % 2;
        int i18 = onExtraCallback + 83;
        IAuthTabCallback = i18 % 128;
        int i19 = i18 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(list, function1, audioRestrictionControllerImplExternalSyntheticLambda0);
        int i20 = onExtraCallback + 63;
        IAuthTabCallback = i20 % 128;
        int i21 = i20 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, boolean z, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 45;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, z, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 49;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(List list, Function0 function0, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 93;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = {list, function0, function1, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        Unit unit = (Unit) onExtraCallbackWithResult(543064940, -543064937, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, objArr);
        int i6 = onExtraCallback + 51;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 84 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 97;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            onExtraCallback(deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, function0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport0, function0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = onExtraCallback + 5;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        String str3 = (String) objArr[3];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[4];
        Function0 function0 = (Function0) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        int iIntValue2 = ((Number) objArr[7]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[8];
        ((Number) objArr[9]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(str, str2, zBooleanValue, str3, quirksExternalSyntheticBackport0, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 81;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 89;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 37;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 85;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return IAuthTabCallback(str, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        IAuthTabCallback(str, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        List list = (List) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        ((Number) objArr[5]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {list, function0, function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1))};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        onExtraCallbackWithResult(1647644195, -1647644193, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, objArr2);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 27;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallback(str, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(str, w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 105;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(function0);
        }
        onNavigationEvent(function0);
        throw null;
    }

    static final class onNavigationEvent implements Function0<Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Function1<EDocIssuableCandidate, Unit> onExtraCallbackWithResult;
        final /* synthetic */ Object onWarmupCompleted;

        onNavigationEvent(Function1<? super EDocIssuableCandidate, Unit> function1, Object obj) {
            this.onExtraCallbackWithResult = function1;
            this.onWarmupCompleted = obj;
        }

        public /* synthetic */ Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 43;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent();
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 103;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Function1<EDocIssuableCandidate, Unit> function1 = this.onExtraCallbackWithResult;
            if (i3 == 0) {
                function1.invoke(this.onWarmupCompleted);
            } else {
                function1.invoke(this.onWarmupCompleted);
                throw null;
            }
        }
    }

    private static final Unit onExtraCallbackWithResult(List list, Function1 function1, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(audioRestrictionControllerImplExternalSyntheticLambda0, "");
        audioRestrictionControllerImplExternalSyntheticLambda0.onExtraCallback(list.size(), (Function1) null, new onWarmupCompleted(IAuthTabCallback.onWarmupCompleted, list), ForwardingCameraControl.onExtraCallbackWithResult(802480018, true, new onExtraCallback(list, function1)));
        Unit unit = Unit.INSTANCE;
        int i2 = onExtraCallback + 107;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        boolean z2;
        int i2;
        List list = (List) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int i3 = 4;
        int iIntValue = ((Number) objArr[4]).intValue();
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 121;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(-1768662943);
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(list)) {
                int i7 = IAuthTabCallback + 117;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
            } else {
                i3 = 2;
            }
            i = i3 | iIntValue;
        } else {
            i = iIntValue;
        }
        Object obj = null;
        if ((iIntValue & 48) == 0) {
            int i9 = IAuthTabCallback + 71;
            onExtraCallback = i9 % 128;
            if (i9 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0);
                obj.hashCode();
                throw null;
            }
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1)) {
                int i10 = onExtraCallback + 49;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                i2 = 256;
            } else {
                i2 = 128;
            }
            i |= i2;
        }
        int i12 = i;
        if ((i12 & 147) != 146) {
            z = true;
        } else {
            int i13 = IAuthTabCallback + 9;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i12 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i15 = onExtraCallback + 81;
                IAuthTabCallback = i15 % 128;
                int i16 = i15 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1768662943, i12, -1, "im.toss.features.edoc.composable.IssuableEDocListScreen (IssuableEDocListScreen.kt:44)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i17 = IAuthTabCallback + 15;
                onExtraCallback = i17 % 128;
                int i18 = i17 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                int i19 = onExtraCallback + 117;
                IAuthTabCallback = i19 % 128;
                if (i19 % 2 != 0) {
                    int i20 = 3 / 3;
                }
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
            removeAnimatorPauseListener.onWarmupCompleted(isCallFromWorker.onExtraCallback.onWarmupCompleted(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 6);
            onWarmupCompleted(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f)), onextracallback, function0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i12 << 3) & 896) | 54, 0);
            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), 0.0f, 0.0f, 13, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = readDir.onNavigationEvent(onextracallback, 0L, 0L, 0.0f, false, false, cameraCaptureResultEmptyCameraCaptureResult, 6, 31);
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(list);
            if ((i12 & 896) != 256) {
                int i21 = onExtraCallback + 63;
                IAuthTabCallback = i21 % 128;
                int i22 = i21 % 2;
                z2 = false;
            } else {
                z2 = true;
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(zOnExtraCallback | z2)) {
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    IssuableEDocListScreenKt$.ExternalSyntheticLambda9 externalSyntheticLambda9 = new IssuableEDocListScreenKt$.ExternalSyntheticLambda9(list, function1);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda9);
                    obj2 = externalSyntheticLambda9;
                }
                ResolutionCorrector.onWarmupCompleted(quirksExternalSyntheticBackport0OnNavigationEvent, (Camera2CameraMetadataExternalSyntheticLambda1) null, deviceQuirksExternalSyntheticLambda0IAuthTabCallback, false, (FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel) null, (QuirkSettingsLoader.onNavigationEvent) null, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, (removeChildrenForExpandedActionView) null, (Function1) obj2, cameraCaptureResultEmptyCameraCaptureResult, 384, 506);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i23 = onExtraCallback + 125;
                    IAuthTabCallback = i23 % 128;
                    int i24 = i23 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new IssuableEDocListScreenKt$.ExternalSyntheticLambda10(list, function0, function1, iIntValue));
        }
        return null;
    }

    private static final Unit onNavigationEvent(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
        int i5 = IAuthTabCallback + 11;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, AppLovinAdClickListener appLovinAdClickListener, Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        Object obj;
        long jLongValue;
        long jLongValue2;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallback + 87;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1252484870, i, -1, "im.toss.features.edoc.composable.EDocSearchButton.<anonymous> (IssuableEDocListScreen.kt:95)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(setExtensionStrength.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(44.0f) + y1ExternalSyntheticLambda8.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0)) + y1ExternalSyntheticLambda8.onWarmupCompleted(deviceQuirksExternalSyntheticLambda0)), 1, (Object) null), appLovinAdClickListener), deviceQuirksExternalSyntheticLambda0);
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).mayLaunchUrl(), appLovinAdClickListener);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!(!zOnNavigationEvent)) {
                IssuableEDocListScreenKt$.ExternalSyntheticLambda8 externalSyntheticLambda8 = new IssuableEDocListScreenKt$.ExternalSyntheticLambda8(function0);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda8);
                obj = externalSyntheticLambda8;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = measureChildConstrained.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) obj, 15, (Object) null);
                FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onnavigationeventAsInterface = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface();
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnExtraCallback = RowKt.onExtraCallback(onnavigationeventAsInterface, onextracallbackwithresult.access000(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                } else {
                    int i5 = onExtraCallback + 97;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                        int i6 = 76 / 0;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    }
                    int i7 = onExtraCallback + 3;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                Painter painterOnNavigationEvent = snapshot.onNavigationEvent(R.drawable.icn_searchfield, cameraCaptureResultEmptyCameraCaptureResult, 0);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(rowScopeInstance.onExtraCallback(onextracallback, onextracallbackwithresult.IAuthTabCallbackDefault()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1423269623);
                    jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                } else {
                    int i9 = onExtraCallback + 19;
                    IAuthTabCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1423270583);
                        jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 16).ICustomTabsService();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1423270583);
                        jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                ImageReaderFormatRecommender.onNavigationEvent(painterOnNavigationEvent, "", quirksExternalSyntheticBackport0OnExtraCallback3, jLongValue, cameraCaptureResultEmptyCameraCaptureResult, Painter.$stable | 48, 0);
                String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.features.edoc.R.string.edoc_composable___fe9e17f8c0, cameraCaptureResultEmptyCameraCaptureResult, 0);
                getHumanReadableName interfaceDescriptor = AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor();
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1423260439);
                    jLongValue2 = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onUnminimized();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1423261399);
                    jLongValue2 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallback, rowScopeInstance.onExtraCallback(RowScope.onNavigationEvent(rowScopeInstance, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 0.0f, 10, (Object) null), 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null), onextracallbackwithresult.IAuthTabCallbackDefault()), interfaceDescriptor, Long.valueOf(jLongValue2), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131056}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i10 = IAuthTabCallback + 65;
                    onExtraCallback = i10 % 128;
                    int i11 = i10 % 2;
                }
            } else {
                obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback22 = measureChildConstrained.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, false, (String) null, (Role) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (Function0) obj, 15, (Object) null);
                FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onnavigationeventAsInterface2 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface();
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult3 = QuirkSettingsLoader.Companion;
                component5 component5VarOnExtraCallback2 = RowKt.onExtraCallback(onnavigationeventAsInterface2, onextracallbackwithresult3.access000(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback22);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult22 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult22.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback2, onextracallbackwithresult22.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult22.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult22.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult22.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult22.onTransact());
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.onNavigationEvent;
                Painter painterOnNavigationEvent2 = snapshot.onNavigationEvent(R.drawable.icn_searchfield, cameraCaptureResultEmptyCameraCaptureResult, 0);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback32 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(rowScopeInstance2.onExtraCallback(onextracallback2, onextracallbackwithresult3.IAuthTabCallbackDefault()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                ImageReaderFormatRecommender.onNavigationEvent(painterOnNavigationEvent2, "", quirksExternalSyntheticBackport0OnExtraCallback32, jLongValue, cameraCaptureResultEmptyCameraCaptureResult, Painter.$stable | 48, 0);
                String strOnExtraCallback2 = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(im.toss.features.edoc.R.string.edoc_composable___fe9e17f8c0, cameraCaptureResultEmptyCameraCaptureResult, 0);
                getHumanReadableName interfaceDescriptor2 = AppLovinPostbackService.onExtraCallbackWithResult.getInterfaceDescriptor();
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallback2, rowScopeInstance2.onExtraCallback(RowScope.onNavigationEvent(rowScopeInstance2, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback2, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 0.0f, 10, (Object) null), 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null), onextracallbackwithresult3.IAuthTabCallbackDefault()), interfaceDescriptor2, Long.valueOf(jLongValue2), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131056}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final void onWarmupCompleted(@NotNull DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(62743494);
        Object obj = null;
        if ((i & 6) == 0) {
            int i6 = onExtraCallback + 103;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0);
                obj.hashCode();
                throw null;
            }
            int i7 = 4;
            if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
                int i8 = onExtraCallback + 15;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 4 % 5;
                }
                i7 = 2;
            }
            i3 = i7 | i;
        } else {
            int i10 = onExtraCallback + 103;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i13 = IAuthTabCallback + 15;
            onExtraCallback = i13 % 128;
            int i14 = i13 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                int i15 = IAuthTabCallback + 75;
                onExtraCallback = i15 % 128;
                i4 = i15 % 2 == 0 ? 22 : 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i & 384) == 0) {
            int i16 = IAuthTabCallback + 83;
            onExtraCallback = i16 % 128;
            int i17 = i16 % 2;
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0) ? 256 : 128;
        }
        if ((i3 & 147) != 146) {
            int i18 = IAuthTabCallback + 101;
            onExtraCallback = i18 % 128;
            int i19 = i18 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i3 & 1)) {
            if (i12 != 0) {
                quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(62743494, i3, -1, "im.toss.features.edoc.composable.EDocSearchButton (IssuableEDocListScreen.kt:92)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                AppLovinAdClickListener appLovinAdClickListener = new AppLovinAdClickListener(getZoomState.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f)));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(appLovinAdClickListener);
                objOnMinimized = appLovinAdClickListener;
            }
            setPostviewFormatSelector.onNavigationEvent(addRewardedAdapter.onNavigationEvent().onExtraCallback((Object) null), ForwardingCameraControl.onExtraCallback(1252484870, true, new IssuableEDocListScreenKt$.ExternalSyntheticLambda4(quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, (AppLovinAdClickListener) objOnMinimized, function0), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i20 = IAuthTabCallback + 99;
                onExtraCallback = i20 % 128;
                int i21 = i20 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new IssuableEDocListScreenKt$.ExternalSyntheticLambda5(deviceQuirksExternalSyntheticLambda0, quirksExternalSyntheticBackport02, function0, i, i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[PHI: r13
      0x0049: PHI (r13v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r13v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r13v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0029, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[PHI: r13
      0x002b: PHI (r13v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r13v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r13v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0029, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = onExtraCallback + 21;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-940741548);
            if ((i & 114) == 0) {
                int i7 = IAuthTabCallback + 3;
                onExtraCallback = i7 % 128;
                if (i7 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                i3 = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 2 : 4) | i;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-940741548);
            if ((i & 6) == 0) {
            }
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                int i9 = IAuthTabCallback + 123;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 19) != 18, i3 & 1)) {
            if (i8 != 0) {
                quirksExternalSyntheticBackport0 = QuirksExternalSyntheticBackport0.Companion;
                int i11 = onExtraCallback + 61;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-940741548, i3, -1, "im.toss.features.edoc.composable.EDocSectionHeader (IssuableEDocListScreen.kt:134)");
            }
            getRepeatMode.onExtraCallbackWithResult(str, pauseAnimation.onExtraCallbackWithResult.Row1B, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i3 & 14) | 48 | ((i3 << 3) & 896), 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            int i13 = onExtraCallback + 45;
            IAuthTabCallback = i13 % 128;
            int i14 = i13 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new IssuableEDocListScreenKt$.ExternalSyntheticLambda6(str, quirksExternalSyntheticBackport0, i, i2));
        }
    }

    private static final Unit onExtraCallbackWithResult(String str, boolean z, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        long jOnUnminimized;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 101;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i5 = onExtraCallback + 79;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-896341662, i, -1, "im.toss.features.edoc.composable.IssuableEDoc.<anonymous>.<anonymous> (IssuableEDocListScreen.kt:155)");
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1904092766);
            if (z) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1904093641);
                jOnUnminimized = y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
            } else {
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1904095433);
                    jOnUnminimized = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1904096393);
                    jOnUnminimized = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onUnminimized();
                }
            }
            long j = jOnUnminimized;
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(j), 0L, 0L, null, 5, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 12582912, 0, 130934}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(String str, boolean z, w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i4 = IAuthTabCallback + 79;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i6 = onExtraCallback + 17;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            int i8 = onExtraCallback + 117;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = IAuthTabCallback + 105;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1278478777, i, -1, "im.toss.features.edoc.composable.IssuableEDoc.<anonymous> (IssuableEDocListScreen.kt:153)");
            }
            w5aVar.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-896341662, true, new IssuableEDocListScreenKt$.ExternalSyntheticLambda7(str, z), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final class IAuthTabCallback implements Function1 {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();

        static {
            int i = onExtraCallback + 21;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }

        public final Void onWarmupCompleted(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 91;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            int i3 = 55 / 0;
            return null;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Void voidOnWarmupCompleted = onWarmupCompleted(obj);
            int i4 = onNavigationEvent + 27;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return voidOnWarmupCompleted;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(String str, w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2039011181, i2, -1, "im.toss.features.edoc.composable.IssuableEDoc.<anonymous> (IssuableEDocListScreen.kt:164)");
                int i4 = IAuthTabCallback + 91;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 % 3;
                }
            }
            if (str != null) {
                int i6 = onExtraCallback + 23;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                if (str.length() != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(459673647);
                    w3bVar.onExtraCallbackWithResult(str, (QuirksExternalSyntheticBackport0) null, 0.0f, (immediateFailedFuture) null, 0L, 0L, RectangleShapeKt.onExtraCallback(), cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 21) & 29360128) | 1572864, 62);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(459802421);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i8 = IAuthTabCallback + 93;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final class onWarmupCompleted implements Function1<Integer, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ List onExtraCallbackWithResult;
        final /* synthetic */ Function1 onNavigationEvent;

        public onWarmupCompleted(Function1 function1, List list) {
            this.onNavigationEvent = function1;
            this.onExtraCallbackWithResult = list;
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback(((Number) obj).intValue());
            int i4 = onWarmupCompleted + 51;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallback;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final Object onExtraCallback(int i) {
            Object objInvoke;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 21;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                objInvoke = this.onNavigationEvent.invoke(this.onExtraCallbackWithResult.get(i));
                int i4 = 89 / 0;
            } else {
                objInvoke = this.onNavigationEvent.invoke(this.onExtraCallbackWithResult.get(i));
            }
            int i5 = onExtraCallback + 13;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return objInvoke;
        }
    }

    public static final class onExtraCallback implements setTaggedAddrCtrl<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, Integer, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ List onNavigationEvent;
        final /* synthetic */ Function1 onWarmupCompleted;

        public onExtraCallback(List list, Function1 function1) {
            this.onNavigationEvent = list;
            this.onWarmupCompleted = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void IAuthTabCallback(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
            int i3;
            int i4;
            int i5 = 2 % 2;
            if ((i2 & 6) == 0) {
                i3 = (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                int i6 = IAuthTabCallback + 75;
                onExtraCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 42 / 0;
                    if (!(!cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i))) {
                        int i8 = onExtraCallback;
                        int i9 = i8 + 29;
                        IAuthTabCallback = i9 % 128;
                        int i10 = i9 % 2;
                        int i11 = i8 + 37;
                        IAuthTabCallback = i11 % 128;
                        int i12 = i11 % 2;
                        i4 = 32;
                    } else {
                        i4 = 16;
                    }
                } else if (cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(i)) {
                }
                i3 |= i4;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
                return;
            }
            int i13 = onExtraCallback + 23;
            IAuthTabCallback = i13 % 128;
            int i14 = i13 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            Object obj = this.onNavigationEvent.get(i);
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1487378159);
            if (obj instanceof access.IAuthTabCallback_Parcel) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1487436965);
                readFileBigDataOptimize.IAuthTabCallback(((access.IAuthTabCallback_Parcel) obj).onWarmupCompleted(), (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 2);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else if (obj instanceof EDocIssuableCandidate) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1487571722);
                EDocIssuableCandidate eDocIssuableCandidate = (EDocIssuableCandidate) obj;
                String str = (String) EDocIssuableCandidate.IAuthTabCallback(ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 575392802, new Object[]{eDocIssuableCandidate}, -575392802, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
                String strOnTransact = eDocIssuableCandidate.onTransact();
                boolean interfaceDescriptor = eDocIssuableCandidate.getInterfaceDescriptor();
                String strIAuthTabCallbackStub = eDocIssuableCandidate.IAuthTabCallbackStub();
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(this.onWarmupCompleted);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(obj);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!(zOnNavigationEvent | zOnExtraCallback)) {
                    int i15 = IAuthTabCallback + 67;
                    onExtraCallback = i15 % 128;
                    int i16 = i15 % 2;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new onNavigationEvent(this.onWarmupCompleted, obj);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                    }
                    readFileBigDataOptimize.onWarmupCompleted(str, strOnTransact, true ^ interfaceDescriptor, strIAuthTabCallbackStub, null, (Function0) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 0, 16);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1487966290);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i17 = IAuthTabCallback + 93;
                onExtraCallback = i17 % 128;
                int i18 = i17 % 2;
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i19 = onExtraCallback + 101;
                IAuthTabCallback = i19 % 128;
                if (i19 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i20 = 2 / 0;
                }
            }
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onExtraCallback = i2 % 128;
            RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0 = (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj;
            Number number = (Number) obj2;
            if (i2 % 2 != 0) {
                IAuthTabCallback(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, number.intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Number) obj4).intValue());
                return Unit.INSTANCE;
            }
            IAuthTabCallback(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, number.intValue(), (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Number) obj4).intValue());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        long jLongValue;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onExtraCallback + 83;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1503041150, i, -1, "im.toss.features.edoc.composable.IssuableEDoc.<anonymous>.<anonymous> (IssuableEDocListScreen.kt:175)");
            }
            y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
            if (((Boolean) y3ExternalSyntheticLambda0.onExtraCallback(1754489397, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), new Object[]{y3externalsyntheticlambda0, cameraCaptureResultEmptyCameraCaptureResult, 6}, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -1754489396)).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1313539013);
                jLongValue = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService();
                int i5 = IAuthTabCallback + 79;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1313539973);
                jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, 1757740449, OverseasRrnInputTextField.IAuthTabCallback(), -1757740446)).longValue();
            }
            long j = jLongValue;
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i7 = IAuthTabCallback + 117;
            onExtraCallback = i7 % 128;
            if (i7 % 2 == 0) {
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(j), 1L, 0L, null, null, null, Float.valueOf(2.0f), null, null, 1L, 1, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(j), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131062}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i8 = IAuthTabCallback + 9;
        onExtraCallback = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(String str, RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 73;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i & 1) == 0) {
                int i5 = onExtraCallback + 51;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 71 / 0;
                    i2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset) ? 4 : 2;
                } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rightPreset)) {
                }
                i |= i2;
            }
        } else {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1514773463, i, -1, "im.toss.features.edoc.composable.IssuableEDoc.<anonymous> (IssuableEDocListScreen.kt:172)");
                int i7 = onExtraCallback + 47;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
            }
            if (str != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(605192069);
                rightPreset.onExtraCallback(ForwardingCameraControl.onExtraCallback(1503041150, true, new IssuableEDocListScreenKt$.ExternalSyntheticLambda11(str), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i9 = onExtraCallback + 29;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(605518809);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onExtraCallback + 17;
                IAuthTabCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull String str, @Nullable String str2, boolean z, @Nullable String str3, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        int i5;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Function0<Unit> function02;
        int i6;
        int i7;
        int i8 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1314460566);
        Object obj = null;
        if ((i & 6) == 0) {
            int i9 = IAuthTabCallback + 23;
            onExtraCallback = i9 % 128;
            if (i9 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                obj.hashCode();
                throw null;
            }
            i3 = (!(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ^ true) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i10 = IAuthTabCallback + 45;
            onExtraCallback = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 83 / 0;
                i7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 256 : 128;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z)) {
            }
            i3 |= i7;
        }
        if ((i & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str3) ? 2048 : 1024;
        }
        int i12 = i2 & 16;
        if (i12 == 0) {
            if ((i & 24576) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    i4 = 8192;
                } else {
                    int i13 = onExtraCallback + 103;
                    IAuthTabCallback = i13 % 128;
                    int i14 = i13 % 2;
                    i4 = 16384;
                }
                i3 |= i4;
            }
            if ((196608 & i) == 0) {
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                    i6 = 131072;
                } else {
                    int i15 = IAuthTabCallback + 69;
                    onExtraCallback = i15 % 128;
                    int i16 = i15 % 2;
                    i6 = 65536;
                }
                i3 |= i6;
            }
            i5 = i3;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i5) != 74898, i5 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            } else {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i12 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i17 = onExtraCallback + 85;
                    IAuthTabCallback = i17 % 128;
                    int i18 = i17 % 2;
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1314460566, i5, -1, "im.toss.features.edoc.composable.IssuableEDoc (IssuableEDocListScreen.kt:150)");
                }
                if (!(!z)) {
                    int i19 = onExtraCallback + 121;
                    IAuthTabCallback = i19 % 128;
                    int i20 = i19 % 2;
                    function02 = function0;
                } else {
                    function02 = null;
                }
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                w4.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(1278478777, true, new IssuableEDocListScreenKt$.ExternalSyntheticLambda0(str, z), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), quirksExternalSyntheticBackport03, ForwardingCameraControl.onExtraCallback(2039011181, true, new IssuableEDocListScreenKt$.ExternalSyntheticLambda1(str2), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, ForwardingCameraControl.onExtraCallback(-1514773463, true, new IssuableEDocListScreenKt$.ExternalSyntheticLambda2(str3), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, function02, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult2, ((i5 >> 9) & 112) | 196998, 0, 114648);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i21 = onExtraCallback + 125;
                    IAuthTabCallback = i21 % 128;
                    if (i21 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new IssuableEDocListScreenKt$.ExternalSyntheticLambda3(str, str2, z, str3, quirksExternalSyntheticBackport02, function0, i, i2));
                return;
            }
            return;
        }
        int i22 = IAuthTabCallback + 81;
        onExtraCallback = i22 % 128;
        i3 = i22 % 2 == 0 ? i3 | 17001 : i3 | 24576;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        int i23 = onExtraCallback + 13;
        IAuthTabCallback = i23 % 128;
        if (i23 % 2 != 0) {
            int i24 = 5 / 2;
        }
        if ((196608 & i) == 0) {
        }
        i5 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((74899 & i5) != 74898, i5 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public static /* synthetic */ Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, AppLovinAdClickListener appLovinAdClickListener, Function0 function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {quirksExternalSyntheticBackport0, deviceQuirksExternalSyntheticLambda0, appLovinAdClickListener, function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(-218608827, 218608827, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(List list, Function1 function1, AudioRestrictionControllerImplExternalSyntheticLambda0 audioRestrictionControllerImplExternalSyntheticLambda0) {
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent3 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(868120512, -868120508, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent3, iOnNavigationEvent2, iOnNavigationEvent, new Object[]{list, function1, audioRestrictionControllerImplExternalSyntheticLambda0});
    }

    private static final Unit onExtraCallbackWithResult(String str, String str2, boolean z, String str3, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {str, str2, Boolean.valueOf(z), str3, quirksExternalSyntheticBackport0, function0, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(1453180139, -1453180138, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, objArr);
    }

    public static final void IAuthTabCallback(@NotNull List<? extends Object> list, @NotNull Function0<Unit> function0, @NotNull Function1<? super EDocIssuableCandidate, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {list, function0, function1, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        onExtraCallbackWithResult(1647644195, -1647644193, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, objArr);
    }

    private static final Unit onNavigationEvent(List list, Function0 function0, Function1 function1, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {list, function0, function1, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        int iOnNavigationEvent2 = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        return (Unit) onExtraCallbackWithResult(543064940, -543064937, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent2, iOnNavigationEvent, objArr);
    }
}
