package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.home.feature.asset_home.R;
import im.toss.features.home.feature.asset_home.compose.edit.AssetHomeEditLeaveDialogKt$;
import im.toss.tds.compose.component.compound.tablerow.ComposableSingletons$TdsTableRowV1Kt$;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o._string;
import o.setCallToAction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RVAccountService {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6 = (CameraPresenceProviderExternalSyntheticLambda6) objArr[0];
        Function0 function0 = (Function0) objArr[1];
        Function0 function02 = (Function0) objArr[2];
        Function0 function03 = (Function0) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(cameraPresenceProviderExternalSyntheticLambda6, function0, function02, function03, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1));
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 105;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(Function0 function0, Function0 function02, v5b v5bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 53;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function0, function02, v5bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 67;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~(i6 | i3);
        int i11 = i9 | i10;
        int i12 = ~i6;
        int i13 = i9 | (~(i12 | i)) | i10;
        int i14 = (~(i3 | i6 | i)) | (~(i7 | i12 | i8));
        int i15 = i6 + i + i4 + (1322235619 * i2) + (440487356 * i5);
        int i16 = i15 * i15;
        int i17 = (((-1102165783) * i6) - 2100690944) + ((-281430247) * i) + ((-820735536) * i11) + (i13 * 410367768) + (410367768 * i14) + ((-691798016) * i4) + ((-942931968) * i2) + ((-1410334720) * i5) + (1251606528 * i16);
        int i18 = (i6 * 157034417) + 1376579869 + (i * 157036385) + (i11 * (-1968)) + (i13 * 984) + (i14 * 984) + (i4 * 157035401) + (i2 * (-982187909)) + (i5 * (-1869533796)) + (i16 * (-899022848));
        return i17 + ((i18 * i18) * (-511311872)) != 1 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 1;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 57 / 0;
        }
        int i6 = onExtraCallback + 119;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Function0 function0, Function0 function02, Function0 function03, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 35;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unit = (Unit) onExtraCallbackWithResult(385013098, _string.onNavigationEvent.IAuthTabCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6, function0, function02, function03, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -385013098);
        int i6 = onExtraCallback + 113;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 39;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return IAuthTabCallback(function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(function0, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i2 = onExtraCallback + 5;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-932506155, iIntValue, -1, "im.toss.features.home.feature.asset_home.compose.edit.rememberEditLeaveDialogState (AssetHomeEditLeaveDialog.kt:20)");
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-932506155, iIntValue, -1, "im.toss.features.home.feature.asset_home.compose.edit.rememberEditLeaveDialogState (AssetHomeEditLeaveDialog.kt:20)");
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onExtraCallback + 87;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i5 = IAuthTabCallback + 109;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return getsupportedhighspeedresolutionsfor;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Function0<Unit> $onShow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(Function0<Unit> function0, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$onShow = function0;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$onShow, access13800Var);
            int i2 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 94 / 0;
            }
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 63;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallbackWithResult(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, access13800Var);
            int i3 = onExtraCallbackWithResult + 13;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 88 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return onextracallbackwithresultCreate.invokeSuspend(unit);
            }
            onextracallbackwithresultCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 27;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            this.$onShow.invoke();
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallbackWithResult + 29;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    private static final Unit IAuthTabCallback(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        if ((i & 6) == 0) {
            int i4 = IAuthTabCallback + 39;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-803267139, i2, -1, "im.toss.features.home.feature.asset_home.compose.edit.AssetHomeEditLeaveDialog.<anonymous>.<anonymous> (AssetHomeEditLeaveDialog.kt:44)");
            }
            u4Var.onNavigationEvent(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_asset_home_edit_save_cta_label, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, (Function0) null, function0, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 1014);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i6 = onExtraCallback + 111;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 3 % 2;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(Function0 function0, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(u4Var, "");
        boolean z = true;
        if ((i & 6) == 0) {
            int i5 = onExtraCallback + 91;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 72 / 0;
                i3 = !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 2 : 4;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var)) {
            }
            i2 = i | i3;
            int i7 = IAuthTabCallback + 69;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18) {
            int i9 = onExtraCallback + 67;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-974106596, i2, -1, "im.toss.features.home.feature.asset_home.compose.edit.AssetHomeEditLeaveDialog.<anonymous>.<anonymous> (AssetHomeEditLeaveDialog.kt:50)");
            }
            u4Var.onNavigationEvent(DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_asset_home_edit_save_cancel_label, cameraCaptureResultEmptyCameraCaptureResult, 0), (QuirksExternalSyntheticBackport0) null, (Function0) null, function0, (setCallToAction.onExtraCallback) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.IAuthTabCallback) null, (setCallToAction.onNavigationEvent) null, false, false, cameraCaptureResultEmptyCameraCaptureResult, 0, i2 & 14, 1014);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onExtraCallback + 93;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(Function0 function0, Function0 function02, v5b v5bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(v5bVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(v5bVar)) {
                int i4 = IAuthTabCallback + 71;
                onExtraCallback = i4 % 128;
                i2 = i4 % 2 != 0 ? 5 : 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1496107689, i, -1, "im.toss.features.home.feature.asset_home.compose.edit.AssetHomeEditLeaveDialog.<anonymous> (AssetHomeEditLeaveDialog.kt:42)");
            }
            v5bVar.onNavigationEvent((QuirksExternalSyntheticBackport0) null, ForwardingCameraControl.onExtraCallback(-803267139, true, new AssetHomeEditLeaveDialogKt$.ExternalSyntheticLambda2(function0), cameraCaptureResultEmptyCameraCaptureResult, 54), ForwardingCameraControl.onExtraCallback(-974106596, true, new AssetHomeEditLeaveDialogKt$.ExternalSyntheticLambda3(function02), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i << 9) & 7168) | 432, 1);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallback + 103;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[PHI: r0
      0x0062: PHI (r0v5 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0049, B:5:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b A[PHI: r0
      0x004b: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v6 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0049, B:5:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@NotNull CameraPresenceProviderExternalSyntheticLambda6<Boolean> cameraPresenceProviderExternalSyntheticLambda6, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = IAuthTabCallback + 55;
        onExtraCallback = i8 % 128;
        if (i8 % 2 != 0) {
            Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda6, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            Intrinsics.checkNotNullParameter(function03, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(425345772);
            if ((i & 21) == 0) {
                if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(cameraPresenceProviderExternalSyntheticLambda6))) {
                    int i9 = onExtraCallback + 57;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(cameraPresenceProviderExternalSyntheticLambda6, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            Intrinsics.checkNotNullParameter(function03, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(425345772);
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            int i11 = onExtraCallback + 51;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i13 = onExtraCallback + 125;
                IAuthTabCallback = i13 % 128;
                int i14 = i13 % 2;
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i & 384) == 0) {
            int i15 = onExtraCallback + 107;
            IAuthTabCallback = i15 % 128;
            if (i15 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02);
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function03)) {
                int i16 = onExtraCallback + 5;
                IAuthTabCallback = i16 % 128;
                i5 = i16 % 2 == 0 ? 8678 : 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        boolean z = false;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 1171) != 1170, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(425345772, i3, -1, "im.toss.features.home.feature.asset_home.compose.edit.AssetHomeEditLeaveDialog (AssetHomeEditLeaveDialog.kt:30)");
            }
            if (((Boolean) cameraPresenceProviderExternalSyntheticLambda6.onExtraCallbackWithResult()).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1322565630);
                Unit unit = Unit.INSTANCE;
                if ((i3 & 112) == 32) {
                    int i17 = onExtraCallback + 115;
                    IAuthTabCallback = i17 % 128;
                    int i18 = i17 % 2;
                    z = true;
                }
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!(!z) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new onExtraCallbackWithResult(function0, null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                i4 = 1;
                v6.onWarmupCompleted(new Object[]{function03, ForwardingCameraControl.onExtraCallback(1496107689, true, new AssetHomeEditLeaveDialogKt$.ExternalSyntheticLambda0(function02, function03), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), getConfigBoolean.onExtraCallbackWithResult.onWarmupCompleted(), null, null, null, 0L, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i3 >> 9) & 14) | 432), 120}, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), 1196661986, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback(), -1196661974, ComposableSingletons$TdsTableRowV1Kt$.ExternalSyntheticLambda1.IAuthTabCallback());
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                i4 = 1;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1323449750);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            }
            if (((CameraConfigExternalSyntheticLambda0.asBinder() ? 1 : 0) ^ i4) != i4) {
                int i19 = IAuthTabCallback + i4;
                onExtraCallback = i19 % 128;
                int i20 = i19 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new AssetHomeEditLeaveDialogKt$.ExternalSyntheticLambda1(cameraPresenceProviderExternalSyntheticLambda6, function0, function02, function03, i));
        }
    }

    private static final Unit IAuthTabCallback(CameraPresenceProviderExternalSyntheticLambda6 cameraPresenceProviderExternalSyntheticLambda6, Function0 function0, Function0 function02, Function0 function03, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onExtraCallbackWithResult(385013098, _string.onNavigationEvent.IAuthTabCallback(), new Object[]{cameraPresenceProviderExternalSyntheticLambda6, function0, function02, function03, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -385013098);
    }

    public static final getSupportedHighSpeedResolutionsFor<Boolean> onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (getSupportedHighSpeedResolutionsFor) onExtraCallbackWithResult(2088341234, _string.onNavigationEvent.IAuthTabCallback(), new Object[]{cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), _string.onNavigationEvent.IAuthTabCallback(), -2088341233);
    }
}
