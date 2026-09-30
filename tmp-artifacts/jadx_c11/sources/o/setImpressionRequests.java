package o;

import im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.setByteOrder;
import o.setClickTrackingUrls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class setImpressionRequests {
    public static final setImpressionRequests IAuthTabCallback = new setImpressionRequests();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final /* synthetic */ class onNavigationEvent {
        private static int IAuthTabCallback = 1;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[setClickTrackingUrls.IAuthTabCallback.values().length];
            try {
                iArr[setClickTrackingUrls.IAuthTabCallback.Fill.ordinal()] = 1;
                int i = onWarmupCompleted + 33;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setClickTrackingUrls.IAuthTabCallback.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            onExtraCallbackWithResult = iArr;
            int i4 = onWarmupCompleted + 71;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = onWarmupCompleted + 87;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private setImpressionRequests() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final setClickTrackingRequests IAuthTabCallback(@NotNull setClickTrackingUrls.IAuthTabCallback iAuthTabCallback, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        setClickTrackingRequests setclicktrackingrequestsOnWarmupCompleted;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 119;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(103144622, i, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Defaults.checkBoxColors (TdsCheckBoxV2Defaults.kt:23)");
            int i5 = onExtraCallbackWithResult + 39;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = onNavigationEvent.onExtraCallbackWithResult[iAuthTabCallback.ordinal()];
        if (i7 == 1) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(337738786);
            setclicktrackingrequestsOnWarmupCompleted = onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, (i >> 3) & 14);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            if (i7 != 2) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(337737213);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                throw new NoWhenBranchMatchedException();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(337740706);
            setclicktrackingrequestsOnWarmupCompleted = onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, (i >> 3) & 14);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i8 = onExtraCallback + 53;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return setclicktrackingrequestsOnWarmupCompleted;
    }

    public final setClickTrackingRequests onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onExtraCallbackWithResult + 75;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-58381888, i, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Defaults.lineCheckBoxColors (TdsCheckBoxV2Defaults.kt:32)");
            if (i4 != 0) {
                throw null;
            }
        }
        setClickTrackingRequests setclicktrackingrequestsOnNavigationEvent = onNavigationEvent(y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onExtraCallbackWithResult + 59;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return setclicktrackingrequestsOnNavigationEvent;
    }

    public final setClickTrackingRequests IAuthTabCallback(long j, long j2, long j3, long j4, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        long j5;
        long jOnTransact;
        long jOnTransact2;
        long jOnTransact3;
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            long jOnTransact4 = setByteOrder.Companion.onTransact();
            int i4 = onExtraCallback + 11;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            j5 = jOnTransact4;
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            int i6 = onExtraCallback + 29;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            jOnTransact = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact = j2;
        }
        Object obj = null;
        if ((i2 & 4) != 0) {
            int i8 = onExtraCallbackWithResult + 103;
            onExtraCallback = i8 % 128;
            if (i8 % 2 != 0) {
                setByteOrder.Companion.onTransact();
                obj.hashCode();
                throw null;
            }
            jOnTransact2 = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact2 = j3;
        }
        if ((i2 & 8) != 0) {
            int i9 = onExtraCallbackWithResult + 101;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            jOnTransact3 = setByteOrder.Companion.onTransact();
        } else {
            jOnTransact3 = j4;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i11 = onExtraCallbackWithResult + 109;
            onExtraCallback = i11 % 128;
            if (i11 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1988991486, i, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Defaults.lineCheckBoxColors (TdsCheckBoxV2Defaults.kt:41)");
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1988991486, i, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Defaults.lineCheckBoxColors (TdsCheckBoxV2Defaults.kt:41)");
        }
        setClickTrackingRequests setclicktrackingrequestsOnWarmupCompleted = setClickTrackingRequests.onWarmupCompleted(onNavigationEvent(y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6)), j5, jOnTransact, 0L, 0L, jOnTransact2, jOnTransact3, 0L, 0L, 204, null);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return setclicktrackingrequestsOnWarmupCompleted;
    }

    public final setClickTrackingRequests onNavigationEvent(@NotNull y2 y2Var) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(y2Var, "");
        setClickTrackingRequests setclicktrackingrequestsOnRelationshipValidationResult = y2Var.onRelationshipValidationResult();
        if (setclicktrackingrequestsOnRelationshipValidationResult != null) {
            int i4 = onExtraCallbackWithResult + 45;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return setclicktrackingrequestsOnRelationshipValidationResult;
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.CheckBoxLineCheckFillCheckedPressed);
        Object[] objArr = {y2Var, authParams.IconQuaternary};
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, objArr, -1868498688, iOnWarmupCompleted2)).longValue();
        setByteOrder.onExtraCallbackWithResult onextracallbackwithresult = setByteOrder.Companion;
        long jIAuthTabCallbackDefault = onextracallbackwithresult.IAuthTabCallbackDefault();
        long jIAuthTabCallbackDefault2 = onextracallbackwithresult.IAuthTabCallbackDefault();
        Object[] objArr2 = {y2Var, authParams.FillBrand};
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue2 = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted3, objArr2, -1868498688, iOnWarmupCompleted4)).longValue();
        Object[] objArr3 = {y2Var, authParams.IconUnselected};
        int iOnWarmupCompleted5 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted6 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        setClickTrackingRequests setclicktrackingrequests = new setClickTrackingRequests(jOnExtraCallback, jLongValue, jIAuthTabCallbackDefault, jIAuthTabCallbackDefault2, jLongValue2, ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted5, objArr3, -1868498688, iOnWarmupCompleted6)).longValue(), onextracallbackwithresult.IAuthTabCallbackDefault(), onextracallbackwithresult.IAuthTabCallbackDefault(), null);
        y2Var.IAuthTabCallback(setclicktrackingrequests);
        return setclicktrackingrequests;
    }

    public final setClickTrackingRequests onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 31;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1624927087, i, -1, "im.toss.tds.compose.component.atom.checkbox.TdsCheckBoxV2Defaults.fillCheckBoxColors (TdsCheckBoxV2Defaults.kt:64)");
        }
        setClickTrackingRequests setclicktrackingrequestsIAuthTabCallback = IAuthTabCallback(y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6));
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i4 = onExtraCallback + 19;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        return setclicktrackingrequestsIAuthTabCallback;
    }

    public final setClickTrackingRequests IAuthTabCallback(@NotNull y2 y2Var) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(y2Var, "");
        setClickTrackingRequests setclicktrackingrequestsAccess000 = y2Var.access000();
        if (setclicktrackingrequestsAccess000 != null) {
            int i4 = onExtraCallback + 37;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return setclicktrackingrequestsAccess000;
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.CheckBoxCircleCheckFillCheckedPressed);
        authParams authparams = authParams.IconQuaternary;
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted3, iOnWarmupCompleted, new Object[]{y2Var, authparams}, -1868498688, iOnWarmupCompleted2)).longValue();
        int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted5 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted6 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue2 = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted6, iOnWarmupCompleted4, new Object[]{y2Var, authparams}, -1868498688, iOnWarmupCompleted5)).longValue();
        long jOnExtraCallback2 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.CheckBoxCircleBackgroundFillCheckedPressed);
        long jOnExtraCallback3 = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(y2Var, eExternalSyntheticLambda0.CheckBoxCircleCheckFillCheckedEnabled);
        authParams authparams2 = authParams.IconUnselected;
        int iOnWarmupCompleted7 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted8 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted9 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue3 = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted9, iOnWarmupCompleted7, new Object[]{y2Var, authparams2}, -1868498688, iOnWarmupCompleted8)).longValue();
        int iOnWarmupCompleted10 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted11 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted12 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        long jLongValue4 = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted12, iOnWarmupCompleted10, new Object[]{y2Var, authparams2}, -1868498688, iOnWarmupCompleted11)).longValue();
        Object[] objArr = {y2Var, authParams.FillBrand};
        int iOnWarmupCompleted13 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted14 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        setClickTrackingRequests setclicktrackingrequests = new setClickTrackingRequests(jOnExtraCallback, jLongValue, jLongValue2, jOnExtraCallback2, jOnExtraCallback3, jLongValue3, jLongValue4, ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted13, objArr, -1868498688, iOnWarmupCompleted14)).longValue(), null);
        y2Var.onExtraCallbackWithResult(setclicktrackingrequests);
        return setclicktrackingrequests;
    }
}
