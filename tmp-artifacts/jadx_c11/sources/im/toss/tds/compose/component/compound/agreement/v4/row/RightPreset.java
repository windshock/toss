package im.toss.tds.compose.component.compound.agreement.v4.row;

import android.content.res.Resources;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.accessisMonitoringp;
import o.clearAllCameraStateObserverslambda19lambda18;
import o.isZslDisabledByByUserCaseConfig;
import o.putCharSequenceArrayList;
import o.putFloatArray;
import o.toStringList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class RightPreset {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private final Function1<Boolean, Unit> onExtraCallbackWithResult;

    /* JADX WARN: Illegal instructions before constructor call */
    public RightPreset() {
        Function1 function1 = null;
        this(function1, 1, function1);
    }

    private static final Unit IAuthTabCallback(RightPreset rightPreset, putFloatArray putfloatarray, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException, Resources.NotFoundException {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 71;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        rightPreset.onExtraCallbackWithResult(putfloatarray, function1, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 113;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RightPreset rightPreset, putFloatArray putfloatarray, Function1 function1, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException, Resources.NotFoundException {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 1;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            IAuthTabCallback(rightPreset, putfloatarray, function1, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(rightPreset, putfloatarray, function1, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i6 = IAuthTabCallback + 29;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RightPreset(@Nullable Function1<? super Boolean, Unit> function1) {
        this.onExtraCallbackWithResult = function1;
    }

    public static final /* synthetic */ Function1 onExtraCallback(RightPreset rightPreset) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Function1<Boolean, Unit> function1 = rightPreset.onExtraCallbackWithResult;
        if (i3 != 0) {
            return function1;
        }
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RightPreset(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = onExtraCallback + 67;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i3 = 2 % 2;
            function1 = null;
        }
        this(function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[PHI: r0
      0x0061: PHI (r0v24 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v25 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0033, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035 A[PHI: r0
      0x0035: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v25 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0033, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallbackWithResult(@NotNull final putFloatArray putfloatarray, @Nullable Function1<Object, Unit> function1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException, Resources.NotFoundException {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        Function1<Object, Unit> function12;
        int i5;
        int i6;
        boolean z;
        final Function1<Object, Unit> function13;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean z2;
        float f;
        boolean z3;
        int i7 = 2 % 2;
        int i8 = onExtraCallback + 67;
        IAuthTabCallback = i8 % 128;
        if (i8 % 2 == 0) {
            Intrinsics.checkNotNullParameter(putfloatarray, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1089660953);
            if ((i & 115) == 0) {
                int i9 = onExtraCallback + 17;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 15 / 0;
                    i3 = !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(putfloatarray) ^ true) ? 4 : 2;
                } else if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(putfloatarray)) {
                }
                i4 = i3 | i;
                int i11 = onExtraCallback + 39;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i4 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(putfloatarray, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1089660953);
            if ((i & 6) == 0) {
            }
        }
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 48) == 0) {
                function12 = function1;
                if (cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(function12)) {
                    int i14 = IAuthTabCallback + 23;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    i5 = 32;
                } else {
                    i5 = 16;
                }
                i4 |= i5;
            }
            if ((i & 384) == 0) {
                int i16 = onExtraCallback + 57;
                IAuthTabCallback = i16 % 128;
                int i17 = i16 % 2;
                i4 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(this) ? 256 : 128;
            }
            i6 = i4;
            if ((i6 & 147) == 146) {
                int i18 = IAuthTabCallback + 3;
                onExtraCallback = i18 % 128;
                z = i18 % 2 == 0;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, i6 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                function13 = function12;
            } else {
                Function1<Object, Unit> function14 = i13 != 0 ? null : function12;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1089660953, i6, -1, "im.toss.tds.compose.component.compound.agreement.v4.row.RightPreset.Arrow (TdsAgreementV4RowPresets.kt:388)");
                }
                float fFloatValue = ((Number) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback((accessisMonitoringp) toStringList.onNavigationEvent(813075283, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[0], -813075282, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted()))).floatValue();
                int i19 = i6 & 14;
                putCharSequenceArrayList.onNavigationEvent(putfloatarray, null, function14, cameraCaptureResultEmptyCameraCaptureResult2, i19 | ((i6 << 3) & 896), 2);
                Function1<Boolean, Unit> function15 = this.onExtraCallbackWithResult;
                boolean z4 = (i6 & 896) == 256;
                if (i19 == 4) {
                    int i20 = IAuthTabCallback + 17;
                    onExtraCallback = i20 % 128;
                    int i21 = i20 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (!(z4 | z2)) {
                    int i22 = onExtraCallback + 57;
                    IAuthTabCallback = i22 % 128;
                    int i23 = i22 % 2;
                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized = new RightPreset$Arrow$1$1(this, putfloatarray, null);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(function15, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                    if (i19 == 4) {
                        int i24 = IAuthTabCallback + 97;
                        onExtraCallback = i24 % 128;
                        int i25 = i24 % 2;
                        f = fFloatValue;
                        z3 = true;
                    } else {
                        f = fFloatValue;
                        z3 = false;
                    }
                    boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(f);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if ((zIAuthTabCallback | z3) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new RightPreset$Arrow$2$1(putfloatarray, f, null);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(Float.valueOf(f), (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    function13 = function14;
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.row.RightPreset$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException, Resources.NotFoundException {
                        int i26 = 2 % 2;
                        int i27 = onNavigationEvent + 71;
                        IAuthTabCallback = i27 % 128;
                        int i28 = i27 % 2;
                        Unit unitOnWarmupCompleted = RightPreset.onWarmupCompleted(this.f$0, putfloatarray, function13, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i29 = IAuthTabCallback + 33;
                        onNavigationEvent = i29 % 128;
                        int i30 = i29 % 2;
                        return unitOnWarmupCompleted;
                    }
                });
                return;
            }
            return;
        }
        i4 |= 48;
        function12 = function1;
        if ((i & 384) == 0) {
        }
        i6 = i4;
        if ((i6 & 147) == 146) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, i6 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }
}
