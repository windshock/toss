package o;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.MaxAdViewAdapterListener;
import o.MaxRewardedInterstitialAdapter;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.getBacktraceNote;
import o.handleRemoveKey;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxAdViewAdapterListener {
    private static int IAuthTabCallback = 1;
    private static final QuirksExternalSyntheticBackport0 onExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(72.0f) - MaxAdapterListener.onExtraCallbackWithResult.onExtraCallback()));
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onNavigationEvent(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        }
        onNavigationEvent(iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(long j, getBacktraceNote getbacktracenote, Function1 function1, MaxRewardedInterstitialAdapter.onExtraCallback onextracallback, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 83;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(j, getbacktracenote, function1, onextracallback, getbacktracenote2, getbacktracenote3, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 51;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit IAuthTabCallback(Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, MaxRewardedInterstitialAdapter.onExtraCallback onextracallback, long j, long j2, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 109;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            onWarmupCompleted(function0, quirksExternalSyntheticBackport0, onextracallback, j, j2, deviceQuirksExternalSyntheticLambda0, getbacktracenote, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i), i2);
        } else {
            onWarmupCompleted(function0, quirksExternalSyntheticBackport0, onextracallback, j, j2, deviceQuirksExternalSyntheticLambda0, getbacktracenote, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(MaxRewardedInterstitialAdapter.onExtraCallback onextracallback, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 97;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            i |= 1;
        }
        onNavigationEvent(onextracallback, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i));
        Unit unit = Unit.INSTANCE;
        int i5 = onNavigationEvent + 3;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getBacktraceNote getbacktracenote, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, MaxRewardedInterstitialAdapter.onExtraCallback onextracallback, long j, long j2, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, Function1 function1, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 7;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getbacktracenote, quirksExternalSyntheticBackport0, onextracallback, j, j2, deviceQuirksExternalSyntheticLambda0, function1, getbacktracenote2, getbacktracenote3, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onWarmupCompleted + 117;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 11;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {getbacktracenote, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        Unit unit = (Unit) onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 525661866, -525661865, objArr, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        int i5 = onWarmupCompleted + 5;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, Function1 function1, RowScope rowScope, MaxRewardedInterstitialAdapter.onExtraCallback onextracallback, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 47;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(getbacktracenote, function1, rowScope, onextracallback, getbacktracenote2, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 95;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ VirtualCameraControlExternalSyntheticLambda1 onExtraCallback(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        VirtualCameraControlExternalSyntheticLambda1 virtualCameraControlExternalSyntheticLambda1IAuthTabCallback = IAuthTabCallback(deviceQuirksExternalSyntheticLambda0, z);
        int i4 = onWarmupCompleted + 101;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return virtualCameraControlExternalSyntheticLambda1IAuthTabCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function0 function0 = (Function0) objArr[0];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[1];
        MaxRewardedInterstitialAdapter.onExtraCallback onextracallback = (MaxRewardedInterstitialAdapter.onExtraCallback) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        long jLongValue2 = ((Number) objArr[4]).longValue();
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0 = (DeviceQuirksExternalSyntheticLambda0) objArr[5];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[6];
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[7];
        int iIntValue = ((Number) objArr[8]).intValue();
        int iIntValue2 = ((Number) objArr[9]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[10];
        int iIntValue3 = ((Number) objArr[11]).intValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function0, quirksExternalSyntheticBackport0, onextracallback, jLongValue, jLongValue2, deviceQuirksExternalSyntheticLambda0, getbacktracenote, getbacktracenote2, iIntValue, iIntValue2, cameraCaptureResultEmptyCameraCaptureResult, iIntValue3);
        int i4 = onWarmupCompleted + 13;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        boolean z;
        int i7 = ~i3;
        int i8 = ~(i7 | i4);
        int i9 = ~i6;
        int i10 = ~(i9 | i4);
        int i11 = i8 | i10;
        int i12 = ~i4;
        int i13 = ~(i12 | i3);
        int i14 = (~(i6 | i7)) | i13 | i10;
        int i15 = (~(i9 | i3)) | (~(i12 | i9)) | i13;
        int i16 = i4 + i3 + i5 + ((-954185507) * i) + (2055044340 * i2);
        int i17 = i16 * i16;
        int i18 = ((1110557339 * i4) - 760807424) + ((-878567756) * i3) + ((-1537228134) * i11) + (i14 * 768614067) + (768614067 * i15) + ((-1647181824) * i5) + (1313472512 * i) + (606601216 * i2) + ((-1232666624) * i17);
        int i19 = (i4 * 1290134917) + 267690129 + (i3 * 1290136780) + (i11 * (-1242)) + (i14 * 621) + (i15 * 621) + (i5 * 1290136159) + (i * 826674179) + (i2 * 1594648204) + (i17 * 572063744);
        int i20 = i18 + (i19 * i19 * 607715328);
        if (i20 != 1) {
            if (i20 == 2) {
                return onExtraCallbackWithResult(objArr);
            }
            if (i20 == 3) {
                return IAuthTabCallback(objArr);
            }
            if (i20 == 4) {
                return onNavigationEvent(objArr);
            }
            Function2 function2 = (Function2) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
            int iIntValue2 = ((Number) objArr[3]).intValue();
            int i21 = 2 % 2;
            int i22 = onWarmupCompleted + 111;
            onNavigationEvent = i22 % 128;
            int i23 = i22 % 2;
            Unit unitOnWarmupCompleted = onWarmupCompleted(function2, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
            int i24 = onNavigationEvent + 99;
            onWarmupCompleted = i24 % 128;
            int i25 = i24 % 2;
            return unitOnWarmupCompleted;
        }
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        RowScope rowScope = (RowScope) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue3 = ((Number) objArr[3]).intValue();
        int i26 = 2 % 2;
        int i27 = onWarmupCompleted;
        int i28 = i27 + 25;
        onNavigationEvent = i28 % 128;
        int i29 = i28 % 2;
        if ((iIntValue3 & 3) != 2) {
            int i30 = i27 + 21;
            onNavigationEvent = i30 % 128;
            int i31 = i30 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(z, iIntValue3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            int i32 = onWarmupCompleted + 27;
            onNavigationEvent = i32 % 128;
            int i33 = i32 % 2;
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2124760262, iIntValue3, -1, "im.toss.tds.compose.component.util.navigation.TdsNavigationV1.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsNavigationV1.kt:153)");
            }
            getbacktracenote.invoke(new MaxAppOpenAdapterListener(rowScope), cameraCaptureResultEmptyCameraCaptureResult2, 0);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i34 = onWarmupCompleted + 7;
                onNavigationEvent = i34 % 128;
                int i35 = i34 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[0];
        RowScope rowScope = (RowScope) objArr[1];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getbacktracenote, rowScope, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onNavigationEvent + 101;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onNavigationEvent(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onNavigationEvent + 101;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(MaxRewardedInterstitialAdapter.onExtraCallback onextracallback, Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 109;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(onextracallback, function2, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onWarmupCompleted + 1;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, long j2, getBacktraceNote getbacktracenote, Function1 function1, MaxRewardedInterstitialAdapter.onExtraCallback onextracallback, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 1;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, j, deviceQuirksExternalSyntheticLambda0, j2, getbacktracenote, function1, onextracallback, getbacktracenote2, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 111;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    private static final Unit onNavigationEvent(getBacktraceNote getbacktracenote, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, MaxRewardedInterstitialAdapter.onExtraCallback onextracallback, long j, long j2, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, Function1 function1, getBacktraceNote getbacktracenote2, getBacktraceNote getbacktracenote3, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 13;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(getbacktracenote, quirksExternalSyntheticBackport0, onextracallback, j, j2, deviceQuirksExternalSyntheticLambda0, function1, getbacktracenote2, getbacktracenote3, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 109;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 75;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(function0, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(function0, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onWarmupCompleted(Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 13;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(function2, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = onWarmupCompleted + 113;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 7 / 0;
        }
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            int i3 = onWarmupCompleted + 45;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = onWarmupCompleted + 107;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 4;
            }
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onWarmupCompleted + 91;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2001363664, i, -1, "im.toss.tds.compose.component.util.navigation.TdsNavigationV1.<anonymous>.<anonymous> (TdsNavigationV1.kt:81)");
                    int i8 = 77 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2001363664, i, -1, "im.toss.tds.compose.component.util.navigation.TdsNavigationV1.<anonymous>.<anonymous> (TdsNavigationV1.kt:81)");
                }
            }
            MaxAdapterListener.onExtraCallbackWithResult.onExtraCallbackWithResult(function0, null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 3072, 6);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i9 = onNavigationEvent + 111;
                onWarmupCompleted = i9 % 128;
                if (i9 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i10 = 19 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i11 = onWarmupCompleted + 3;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@Nullable final Function0<Unit> function0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable MaxRewardedInterstitialAdapter.onExtraCallback onextracallback, long j, long j2, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable getBacktraceNote<? super MaxAppOpenAdapterListener, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable getBacktraceNote<? super MaxRewardedInterstitialAdapterListener, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        int i4;
        long jOnNavigationEvent;
        long j3;
        int i5;
        int i6;
        int i7;
        int i8;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        MaxRewardedInterstitialAdapter.onExtraCallback onextracallbackOnNavigationEvent;
        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02;
        getBacktraceNote<? super MaxAppOpenAdapterListener, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3;
        final long j4;
        getBacktraceNote<? super MaxRewardedInterstitialAdapterListener, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        getBacktraceNote<? super MaxAppOpenAdapterListener, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenoteIAuthTabCallbackDefault;
        getBacktraceNote<? super MaxRewardedInterstitialAdapterListener, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> interfaceDescriptor;
        long jIAuthTabCallback;
        int i9;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda03;
        EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback;
        MaxAdapterListener maxAdapterListener;
        int i10;
        int i11 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(555133914);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                int i12 = onWarmupCompleted + 79;
                onNavigationEvent = i12 % 128;
                int i13 = i12 % 2;
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            int i15 = onNavigationEvent + 29;
            onWarmupCompleted = i15 % 128;
            i3 = i15 % 2 != 0 ? i3 | 112 : i3 | 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        jOnNavigationEvent = j;
                        int i16 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnNavigationEvent) ? 2048 : 1024;
                        i3 |= i16;
                    } else {
                        jOnNavigationEvent = j;
                    }
                    i3 |= i16;
                } else {
                    jOnNavigationEvent = j;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j3 = j2;
                        int i17 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j3) ? 16384 : 8192;
                        i3 |= i17;
                    } else {
                        j3 = j2;
                    }
                    i3 |= i17;
                } else {
                    j3 = j2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else {
                    if ((i & 196608) == 0) {
                        int i18 = onNavigationEvent + 27;
                        onWarmupCompleted = i18 % 128;
                        int i19 = i18 % 2;
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        int i20 = onWarmupCompleted + 3;
                        onNavigationEvent = i20 % 128;
                        int i21 = i20 % 2;
                        i3 |= 1572864;
                    } else {
                        if ((i & 1572864) == 0) {
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 1048576 : 524288;
                        }
                        i7 = i2 & 128;
                        if (i7 == 0) {
                            if ((i & 12582912) == 0) {
                                i8 = (!(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2) ^ true) ? 8388608 : 4194304) | i3;
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i8) == 4793490, i8 & 1)) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                                onextracallbackOnNavigationEvent = onextracallback;
                                deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
                                getbacktracenote3 = getbacktracenote;
                                j4 = j3;
                                getbacktracenote4 = getbacktracenote2;
                            } else {
                                int i22 = onWarmupCompleted + 125;
                                onNavigationEvent = i22 % 128;
                                if (i22 % 2 == 0) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                    if ((i & 1) != 0) {
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                            if (i14 != 0) {
                                                int i23 = onNavigationEvent + 81;
                                                onWarmupCompleted = i23 % 128;
                                                if (i23 % 2 != 0) {
                                                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                                                    throw null;
                                                }
                                                quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                                            } else {
                                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                            }
                                            if (i4 != 0) {
                                                int i24 = onWarmupCompleted + 3;
                                                onNavigationEvent = i24 % 128;
                                                int i25 = i24 % 2;
                                                onextracallbackOnNavigationEvent = MaxRewardedInterstitialAdapter.onExtraCallback.Companion.onNavigationEvent();
                                            } else {
                                                onextracallbackOnNavigationEvent = onextracallback;
                                            }
                                            int i26 = 6;
                                            if ((i2 & 8) != 0) {
                                                jOnNavigationEvent = MaxAdapterListener.onExtraCallbackWithResult.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                                                i8 &= -7169;
                                            }
                                            if ((i2 & 16) != 0) {
                                                int i27 = onNavigationEvent + 49;
                                                onWarmupCompleted = i27 % 128;
                                                if (i27 % 2 != 0) {
                                                    maxAdapterListener = MaxAdapterListener.onExtraCallbackWithResult;
                                                    i26 = 36;
                                                } else {
                                                    maxAdapterListener = MaxAdapterListener.onExtraCallbackWithResult;
                                                }
                                                jIAuthTabCallback = maxAdapterListener.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i26);
                                                i8 &= -57345;
                                            } else {
                                                jIAuthTabCallback = j3;
                                            }
                                            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback = i5 != 0 ? MaxAdapterListener.onExtraCallbackWithResult.IAuthTabCallback() : deviceQuirksExternalSyntheticLambda0;
                                            getbacktracenoteIAuthTabCallbackDefault = i6 != 0 ? MaxAdapterListener.onExtraCallbackWithResult.IAuthTabCallbackDefault() : getbacktracenote;
                                            interfaceDescriptor = i7 != 0 ? loadRewardedInterstitialAd.onExtraCallback.getInterfaceDescriptor() : getbacktracenote2;
                                            DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda04 = deviceQuirksExternalSyntheticLambda0IAuthTabCallback;
                                            i9 = i8;
                                            deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda04;
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                            if ((i2 & 8) != 0) {
                                                i8 &= -7169;
                                                int i28 = onNavigationEvent + 45;
                                                onWarmupCompleted = i28 % 128;
                                                int i29 = i28 % 2;
                                            }
                                            if ((i2 & 16) != 0) {
                                                int i30 = onNavigationEvent + 1;
                                                onWarmupCompleted = i30 % 128;
                                                int i31 = i30 % 2;
                                                i8 &= -57345;
                                            }
                                            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                                            onextracallbackOnNavigationEvent = onextracallback;
                                            getbacktracenoteIAuthTabCallbackDefault = getbacktracenote;
                                            interfaceDescriptor = getbacktracenote2;
                                            jIAuthTabCallback = j3;
                                            i9 = i8;
                                            deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0;
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(555133914, i9, -1, "im.toss.tds.compose.component.util.navigation.TdsNavigationV1 (TdsNavigationV1.kt:77)");
                                        }
                                        if (function0 == null) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1924056443);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                            encoderProfilesProxyVideoProfileProxyOnExtraCallback = null;
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1924056442);
                                            encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(2001363664, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.util.navigation.TdsNavigationV1Kt$$ExternalSyntheticLambda9
                                                private static int IAuthTabCallback = 1;
                                                private static int onWarmupCompleted;

                                                public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                                                    int i32 = 2 % 2;
                                                    int i33 = onWarmupCompleted + 63;
                                                    IAuthTabCallback = i33 % 128;
                                                    if (i33 % 2 == 0) {
                                                        MaxAdViewAdapterListener.onWarmupCompleted(function0, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                                        throw null;
                                                    }
                                                    Unit unitOnWarmupCompleted = MaxAdViewAdapterListener.onWarmupCompleted(function0, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                                    int i34 = IAuthTabCallback + 53;
                                                    onWarmupCompleted = i34 % 128;
                                                    if (i34 % 2 != 0) {
                                                        int i35 = 37 / 0;
                                                    }
                                                    return unitOnWarmupCompleted;
                                                }
                                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                        }
                                        int i32 = i9 << 3;
                                        onExtraCallback(encoderProfilesProxyVideoProfileProxyOnExtraCallback, quirksExternalSyntheticBackport03, onextracallbackOnNavigationEvent, jOnNavigationEvent, jIAuthTabCallback, deviceQuirksExternalSyntheticLambda03, null, getbacktracenoteIAuthTabCallbackDefault, interfaceDescriptor, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i9 & 524272) | (29360128 & i32) | (i32 & 234881024), 64);
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                        }
                                        getbacktracenote4 = interfaceDescriptor;
                                        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                                        getbacktracenote3 = getbacktracenoteIAuthTabCallbackDefault;
                                        j4 = jIAuthTabCallback;
                                        deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda03;
                                    }
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                    if ((i & 1) != 0) {
                                    }
                                }
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                final MaxRewardedInterstitialAdapter.onExtraCallback onextracallback3 = onextracallbackOnNavigationEvent;
                                final long j5 = jOnNavigationEvent;
                                final getBacktraceNote<? super MaxAppOpenAdapterListener, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5 = getbacktracenote3;
                                final getBacktraceNote<? super MaxRewardedInterstitialAdapterListener, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6 = getbacktracenote4;
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.util.navigation.TdsNavigationV1Kt$$ExternalSyntheticLambda10
                                    private static int onExtraCallback = 0;
                                    private static int onExtraCallbackWithResult = 1;

                                    public final Object invoke(Object obj, Object obj2) {
                                        int i33 = 2 % 2;
                                        int i34 = onExtraCallbackWithResult + 81;
                                        onExtraCallback = i34 % 128;
                                        int i35 = i34 % 2;
                                        Function0 function02 = function0;
                                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                                        MaxRewardedInterstitialAdapter.onExtraCallback onextracallback4 = onextracallback3;
                                        long j6 = j5;
                                        long j7 = j4;
                                        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda05 = deviceQuirksExternalSyntheticLambda02;
                                        getBacktraceNote getbacktracenote7 = getbacktracenote5;
                                        getBacktraceNote getbacktracenote8 = getbacktracenote6;
                                        int i36 = i;
                                        int i37 = i2;
                                        int iIntValue = ((Integer) obj2).intValue();
                                        Object[] objArr = {function02, quirksExternalSyntheticBackport04, onextracallback4, Long.valueOf(j6), Long.valueOf(j7), deviceQuirksExternalSyntheticLambda05, getbacktracenote7, getbacktracenote8, Integer.valueOf(i36), Integer.valueOf(i37), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                                        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
                                        Unit unit = (Unit) MaxAdViewAdapterListener.onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -1814558366, 1814558368, objArr, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
                                        int i38 = onExtraCallback + 39;
                                        onExtraCallbackWithResult = i38 % 128;
                                        if (i38 % 2 == 0) {
                                            int i39 = 71 / 0;
                                        }
                                        return unit;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 12582912;
                        i8 = i3;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i8) == 4793490, i8 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                    }
                    i8 = i3;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i8) == 4793490, i8 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                i8 = i3;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i8) == 4793490, i8 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            i8 = i3;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i8) == 4793490, i8 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        i8 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((4793491 & i8) == 4793490, i8 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onWarmupCompleted + 45;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onNavigationEvent + 63;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2081422072, i, -1, "im.toss.tds.compose.component.util.navigation.TdsNavigationV1.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TdsNavigationV1.kt:145)");
            }
            getbacktracenote.invoke(new MaxRewardedInterstitialAdapterListener(rowScope), cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(getBacktraceNote getbacktracenote, Function1 function1, RowScope rowScope, MaxRewardedInterstitialAdapter.onExtraCallback onextracallback, final getBacktraceNote getbacktracenote2, final getBacktraceNote getbacktracenote3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 125;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 99;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(28129488, i, -1, "im.toss.tds.compose.component.util.navigation.TdsNavigationV1.<anonymous>.<anonymous>.<anonymous> (TdsNavigationV1.kt:127)");
                int i8 = onWarmupCompleted + 125;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
            }
            if (getbacktracenote != null) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(487006215);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0AsBinder = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), ((VirtualCameraControlExternalSyntheticLambda1) function1.invoke(Boolean.TRUE)).IAuthTabCallback());
                component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), QuirkSettingsLoader.Companion.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResult, 48);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0AsBinder);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
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
                getbacktracenote.invoke(RowScopeInstance.onNavigationEvent, cameraCaptureResultEmptyCameraCaptureResult, 6);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(487333234);
                ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.asBinder(QuirksExternalSyntheticBackport0.Companion, ((VirtualCameraControlExternalSyntheticLambda1) function1.invoke(Boolean.FALSE)).IAuthTabCallback()), cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = RowScope.onNavigationEvent(rowScope, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback2, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult2 = QuirkSettingsLoader.Companion;
            QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault = onextracallbackwithresult2.IAuthTabCallbackDefault();
            FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
            component5 component5VarOnExtraCallback2 = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onwarmupcompletedIAuthTabCallbackDefault, cameraCaptureResultEmptyCameraCaptureResult, 48);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult3.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (!cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback2, onextracallbackwithresult3.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult3.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult3.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult3.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult3.onTransact());
            final RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
            onNavigationEvent(onextracallback, (Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) ForwardingCameraControl.onExtraCallback(-2081422072, true, new Function2() { // from class: im.toss.tds.compose.component.util.navigation.TdsNavigationV1Kt$$ExternalSyntheticLambda2
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallbackWithResult + 75;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    getBacktraceNote getbacktracenote4 = getbacktracenote2;
                    if (i12 != 0) {
                        Object[] objArr = {getbacktracenote4, rowScopeInstance, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
                        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
                        return (Unit) MaxAdViewAdapterListener.onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -1479826568, 1479826572, objArr, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
                    }
                    Object[] objArr2 = {getbacktracenote4, rowScopeInstance, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
                    int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
                    int i13 = 94 / 0;
                    return (Unit) MaxAdViewAdapterListener.onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -1479826568, 1479826572, objArr2, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 48);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(onextracallback2, 0.0f, 1, (Object) null);
            component5 component5VarOnExtraCallback3 = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.onWarmupCompleted(), onextracallbackwithresult2.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResult, 54);
            int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback);
            Function0 function0IAuthTabCallback3 = onextracallbackwithresult3.IAuthTabCallback();
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnExtraCallback3, onextracallbackwithresult3.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult3.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult3.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult3.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult3.onTransact());
            IAuthTabCallback(ForwardingCameraControl.onExtraCallback(2124760262, true, new Function2() { // from class: im.toss.tds.compose.component.util.navigation.TdsNavigationV1Kt$$ExternalSyntheticLambda3
                private static int onExtraCallbackWithResult = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj, Object obj2) {
                    int i10 = 2 % 2;
                    int i11 = onExtraCallbackWithResult + 21;
                    onNavigationEvent = i11 % 128;
                    if (i11 % 2 != 0) {
                        MaxAdViewAdapterListener.onExtraCallback(getbacktracenote3, rowScopeInstance, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    Unit unitOnExtraCallback = MaxAdViewAdapterListener.onExtraCallback(getbacktracenote3, rowScopeInstance, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i12 = onExtraCallbackWithResult + 3;
                    onNavigationEvent = i12 % 128;
                    if (i12 % 2 != 0) {
                        int i13 = 80 / 0;
                    }
                    return unitOnExtraCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i10 = onNavigationEvent + 101;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(long j, final getBacktraceNote getbacktracenote, final Function1 function1, final MaxRewardedInterstitialAdapter.onExtraCallback onextracallback, final getBacktraceNote getbacktracenote2, final getBacktraceNote getbacktracenote3, final RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 6) == 0) {
            int i4 = onNavigationEvent + 121;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(rowScope) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i6 = onNavigationEvent + 1;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1679240176, i2, -1, "im.toss.tds.compose.component.util.navigation.TdsNavigationV1.<anonymous>.<anonymous> (TdsNavigationV1.kt:122)");
            }
            setPostviewFormatSelector.onExtraCallback(new accessgetCameraFactoryp[]{dispatchPostbackRequest.onWarmupCompleted().onExtraCallback(dispatchPostbackAsync.onWarmupCompleted((dispatchPostbackAsync) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(dispatchPostbackRequest.onWarmupCompleted()), 0.0f, 1, 0, null, null, 29, null)), convertYUVToRGB.IAuthTabCallback().onExtraCallback(setByteOrder.onNavigationEvent(j)), copyBitmapToByteBuffer.IAuthTabCallback().onExtraCallback(Float.valueOf(1.0f))}, ForwardingCameraControl.onExtraCallback(28129488, true, new Function2() { // from class: im.toss.tds.compose.component.util.navigation.TdsNavigationV1Kt$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 1;
                private static int onExtraCallback;

                public final Object invoke(Object obj, Object obj2) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallback + 79;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitOnExtraCallback = MaxAdViewAdapterListener.onExtraCallback(getbacktracenote, function1, rowScope, onextracallback, getbacktracenote2, getbacktracenote3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i11 = IAuthTabCallback + 19;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    return unitOnExtraCallback;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, accessgetCameraFactoryp.onNavigationEvent | 48);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onWarmupCompleted + 55;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 == 0) {
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, long j, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, final long j2, final getBacktraceNote getbacktracenote, final Function1 function1, final MaxRewardedInterstitialAdapter.onExtraCallback onextracallback, final getBacktraceNote getbacktracenote2, final getBacktraceNote getbacktracenote3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 65;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0 ? (i & 3) == 2 : (i & 4) == 4) {
            int i5 = i3 + 21;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        } else {
            int i7 = i3 + 121;
            int i8 = i7 % 128;
            onWarmupCompleted = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 93;
            onNavigationEvent = i10 % 128;
            int i11 = i10 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i12 = onNavigationEvent + 63;
            onWarmupCompleted = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 20 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1061451297, i, -1, "im.toss.tds.compose.component.util.navigation.TdsNavigationV1.<anonymous> (TdsNavigationV1.kt:116)");
                }
                getContentValues.onExtraCallback(quirksExternalSyntheticBackport0, j, 0L, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), deviceQuirksExternalSyntheticLambda0, ForwardingCameraControl.onExtraCallback(-1679240176, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.util.navigation.TdsNavigationV1Kt$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Unit unitIAuthTabCallback;
                        int i14 = 2 % 2;
                        int i15 = IAuthTabCallback + 83;
                        onExtraCallbackWithResult = i15 % 128;
                        if (i15 % 2 == 0) {
                            unitIAuthTabCallback = MaxAdViewAdapterListener.IAuthTabCallback(j2, getbacktracenote, function1, onextracallback, getbacktracenote2, getbacktracenote3, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i16 = 25 / 0;
                        } else {
                            unitIAuthTabCallback = MaxAdViewAdapterListener.IAuthTabCallback(j2, getbacktracenote, function1, onextracallback, getbacktracenote2, getbacktracenote3, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        }
                        int i17 = onExtraCallbackWithResult + 89;
                        IAuthTabCallback = i17 % 128;
                        int i18 = i17 % 2;
                        return unitIAuthTabCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 199680, 4);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                getContentValues.onExtraCallback(quirksExternalSyntheticBackport0, j, 0L, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f), deviceQuirksExternalSyntheticLambda0, ForwardingCameraControl.onExtraCallback(-1679240176, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.util.navigation.TdsNavigationV1Kt$$ExternalSyntheticLambda0
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Unit unitIAuthTabCallback;
                        int i14 = 2 % 2;
                        int i15 = IAuthTabCallback + 83;
                        onExtraCallbackWithResult = i15 % 128;
                        if (i15 % 2 == 0) {
                            unitIAuthTabCallback = MaxAdViewAdapterListener.IAuthTabCallback(j2, getbacktracenote, function1, onextracallback, getbacktracenote2, getbacktracenote3, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i16 = 25 / 0;
                        } else {
                            unitIAuthTabCallback = MaxAdViewAdapterListener.IAuthTabCallback(j2, getbacktracenote, function1, onextracallback, getbacktracenote2, getbacktracenote3, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        }
                        int i17 = onExtraCallbackWithResult + 89;
                        IAuthTabCallback = i17 % 128;
                        int i18 = i17 % 2;
                        return unitIAuthTabCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 199680, 4);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@Nullable final getBacktraceNote<? super RowScope, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable MaxRewardedInterstitialAdapter.onExtraCallback onextracallback, long j, long j2, @Nullable DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, @Nullable Function1<? super Boolean, VirtualCameraControlExternalSyntheticLambda1> function1, @Nullable getBacktraceNote<? super MaxAppOpenAdapterListener, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable getBacktraceNote<? super MaxRewardedInterstitialAdapterListener, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        int i4;
        MaxRewardedInterstitialAdapter.onExtraCallback onextracallback2;
        long jOnNavigationEvent;
        long j3;
        int i5;
        int i6;
        int i7;
        int i8;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        getBacktraceNote<? super MaxAppOpenAdapterListener, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4;
        MaxRewardedInterstitialAdapter.onExtraCallback onextracallbackOnNavigationEvent;
        final long j4;
        long jIAuthTabCallback;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda02;
        Function1<? super Boolean, VirtualCameraControlExternalSyntheticLambda1> function12;
        getBacktraceNote<? super MaxRewardedInterstitialAdapterListener, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        Function1<? super Boolean, VirtualCameraControlExternalSyntheticLambda1> function13;
        getBacktraceNote<? super MaxAppOpenAdapterListener, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenoteIAuthTabCallbackDefault;
        getBacktraceNote<? super MaxRewardedInterstitialAdapterListener, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenoteIAuthTabCallbackStubProxy;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda03;
        boolean z;
        Object obj;
        int i9;
        int i10 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(75219297);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote)) {
                int i11 = onNavigationEvent + 1;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i14 = onWarmupCompleted + 37;
            onNavigationEvent = i14 % 128;
            if (i14 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport0)) {
                i4 = 32;
            } else {
                int i15 = onNavigationEvent + 19;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                i4 = 16;
            }
            i3 |= i4;
        }
        int i17 = i2 & 4;
        if (i17 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                onextracallback2 = onextracallback;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    int i18 = onNavigationEvent + 117;
                    onWarmupCompleted = i18 % 128;
                    int i19 = i18 % 2;
                    jOnNavigationEvent = j;
                    int i20 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jOnNavigationEvent) ? 2048 : 1024;
                    i3 |= i20;
                } else {
                    jOnNavigationEvent = j;
                }
                i3 |= i20;
            } else {
                jOnNavigationEvent = j;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    j3 = j2;
                    int i21 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j3) ? 16384 : 8192;
                    i3 |= i21;
                } else {
                    j3 = j2;
                }
                i3 |= i21;
            } else {
                j3 = j2;
            }
            i5 = i2 & 32;
            if (i5 != 0) {
                if ((i & 196608) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(deviceQuirksExternalSyntheticLambda0)) {
                        int i22 = onWarmupCompleted + 11;
                        onNavigationEvent = i22 % 128;
                        int i23 = i22 % 2;
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i3 |= i6;
                }
                if ((1572864 & i) == 0) {
                    int i24 = onNavigationEvent + 107;
                    onWarmupCompleted = i24 % 128;
                    if (i24 % 2 == 0 ? (i2 & 64) == 0 : (i2 & 117) == 0) {
                        int i25 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function1) ? 1048576 : 524288;
                        i3 |= i25;
                    }
                    i3 |= i25;
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2) ? 8388608 : 4194304;
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote3) ? 67108864 : 33554432;
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 38347923) != 38347922, i3 & 1)) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                    if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                        quirksExternalSyntheticBackport03 = i13 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport0;
                        onextracallbackOnNavigationEvent = i17 != 0 ? MaxRewardedInterstitialAdapter.onExtraCallback.Companion.onNavigationEvent() : onextracallback2;
                        if ((i2 & 8) != 0) {
                            jOnNavigationEvent = MaxAdapterListener.onExtraCallbackWithResult.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            jIAuthTabCallback = MaxAdapterListener.onExtraCallbackWithResult.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                            i3 &= -57345;
                        } else {
                            jIAuthTabCallback = j3;
                        }
                        final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback = i5 != 0 ? MaxAdapterListener.onExtraCallbackWithResult.IAuthTabCallback() : deviceQuirksExternalSyntheticLambda0;
                        if ((i2 & 64) != 0) {
                            int i26 = onWarmupCompleted + 25;
                            int i27 = i26 % 128;
                            onNavigationEvent = i27;
                            int i28 = i26 % 2;
                            if ((458752 & i3) == 131072) {
                                int i29 = i27 + 71;
                                onWarmupCompleted = i29 % 128;
                                int i30 = i29 % 2;
                                z = true;
                            } else {
                                z = false;
                            }
                            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!z) {
                                int i31 = onWarmupCompleted + 49;
                                onNavigationEvent = i31 % 128;
                                if (i31 % 2 == 0) {
                                    int i32 = 53 / 0;
                                    obj = objOnMinimized;
                                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                        Object obj2 = new Function1() { // from class: im.toss.tds.compose.component.util.navigation.TdsNavigationV1Kt$$ExternalSyntheticLambda6
                                            private static int IAuthTabCallback = 1;
                                            private static int onExtraCallbackWithResult;

                                            public final Object invoke(Object obj3) {
                                                int i33 = 2 % 2;
                                                int i34 = IAuthTabCallback + 109;
                                                onExtraCallbackWithResult = i34 % 128;
                                                int i35 = i34 % 2;
                                                DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda04 = deviceQuirksExternalSyntheticLambda0IAuthTabCallback;
                                                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                                                if (i35 == 0) {
                                                    return MaxAdViewAdapterListener.onExtraCallback(deviceQuirksExternalSyntheticLambda04, zBooleanValue);
                                                }
                                                MaxAdViewAdapterListener.onExtraCallback(deviceQuirksExternalSyntheticLambda04, zBooleanValue);
                                                Object obj4 = null;
                                                obj4.hashCode();
                                                throw null;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(obj2);
                                        obj = obj2;
                                    }
                                    function13 = (Function1) obj;
                                    i3 = (-3670017) & i3;
                                } else {
                                    obj = objOnMinimized;
                                    if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    }
                                    function13 = (Function1) obj;
                                    i3 = (-3670017) & i3;
                                }
                            }
                        } else {
                            function13 = function1;
                        }
                        getbacktracenoteIAuthTabCallbackDefault = i7 != 0 ? MaxAdapterListener.onExtraCallbackWithResult.IAuthTabCallbackDefault() : getbacktracenote2;
                        getbacktracenoteIAuthTabCallbackStubProxy = i8 != 0 ? loadRewardedInterstitialAd.onExtraCallback.IAuthTabCallbackStubProxy() : getbacktracenote3;
                        deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0IAuthTabCallback;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0;
                        deviceQuirksExternalSyntheticLambda03 = deviceQuirksExternalSyntheticLambda0;
                        function13 = function1;
                        getbacktracenoteIAuthTabCallbackDefault = getbacktracenote2;
                        getbacktracenoteIAuthTabCallbackStubProxy = getbacktracenote3;
                        onextracallbackOnNavigationEvent = onextracallback2;
                        jIAuthTabCallback = j3;
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i33 = onWarmupCompleted + 91;
                        onNavigationEvent = i33 % 128;
                        int i34 = i33 % 2;
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(75219297, i3, -1, "im.toss.tds.compose.component.util.navigation.TdsNavigationV1 (TdsNavigationV1.kt:112)");
                    }
                    final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                    final long j5 = jIAuthTabCallback;
                    final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda04 = deviceQuirksExternalSyntheticLambda03;
                    final long j6 = jOnNavigationEvent;
                    final Function1<? super Boolean, VirtualCameraControlExternalSyntheticLambda1> function14 = function13;
                    final MaxRewardedInterstitialAdapter.onExtraCallback onextracallback3 = onextracallbackOnNavigationEvent;
                    final getBacktraceNote<? super MaxRewardedInterstitialAdapterListener, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6 = getbacktracenoteIAuthTabCallbackStubProxy;
                    final getBacktraceNote<? super MaxAppOpenAdapterListener, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote7 = getbacktracenoteIAuthTabCallbackDefault;
                    DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda05 = deviceQuirksExternalSyntheticLambda03;
                    setPostviewFormatSelector.onNavigationEvent(((accessisMonitoringp) showRewardedAd.onExtraCallbackWithResult(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1394802419, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[0], 1394802419)).onExtraCallback(Boolean.TRUE), ForwardingCameraControl.onExtraCallback(1061451297, true, new Function2() { // from class: im.toss.tds.compose.component.util.navigation.TdsNavigationV1Kt$$ExternalSyntheticLambda7
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj3, Object obj4) {
                            int i35 = 2 % 2;
                            int i36 = onExtraCallbackWithResult + 125;
                            onExtraCallback = i36 % 128;
                            int i37 = i36 % 2;
                            Unit unitOnNavigationEvent = MaxAdViewAdapterListener.onNavigationEvent(quirksExternalSyntheticBackport04, j5, deviceQuirksExternalSyntheticLambda04, j6, getbacktracenote, function14, onextracallback3, getbacktracenote6, getbacktracenote7, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i38 = onExtraCallback + 35;
                            onExtraCallbackWithResult = i38 % 128;
                            int i39 = i38 % 2;
                            return unitOnNavigationEvent;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, accessgetCameraFactoryp.onNavigationEvent | 48);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    getbacktracenote4 = getbacktracenoteIAuthTabCallbackDefault;
                    getbacktracenote5 = getbacktracenoteIAuthTabCallbackStubProxy;
                    j4 = jOnNavigationEvent;
                    deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda05;
                    function12 = function13;
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                    getbacktracenote4 = getbacktracenote2;
                    onextracallbackOnNavigationEvent = onextracallback2;
                    j4 = jOnNavigationEvent;
                    jIAuthTabCallback = j3;
                    deviceQuirksExternalSyntheticLambda02 = deviceQuirksExternalSyntheticLambda0;
                    function12 = function1;
                    getbacktracenote5 = getbacktracenote3;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final MaxRewardedInterstitialAdapter.onExtraCallback onextracallback4 = onextracallbackOnNavigationEvent;
                    final long j7 = jIAuthTabCallback;
                    final DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda06 = deviceQuirksExternalSyntheticLambda02;
                    final Function1<? super Boolean, VirtualCameraControlExternalSyntheticLambda1> function15 = function12;
                    final getBacktraceNote<? super MaxAppOpenAdapterListener, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote8 = getbacktracenote4;
                    final getBacktraceNote<? super MaxRewardedInterstitialAdapterListener, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote9 = getbacktracenote5;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.util.navigation.TdsNavigationV1Kt$$ExternalSyntheticLambda8
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                            int i35 = 2 % 2;
                            int i36 = onNavigationEvent + 85;
                            onExtraCallbackWithResult = i36 % 128;
                            int i37 = i36 % 2;
                            Unit unitIAuthTabCallback = MaxAdViewAdapterListener.IAuthTabCallback(getbacktracenote, quirksExternalSyntheticBackport02, onextracallback4, j4, j7, deviceQuirksExternalSyntheticLambda06, function15, getbacktracenote8, getbacktracenote9, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                            int i38 = onExtraCallbackWithResult + 57;
                            onNavigationEvent = i38 % 128;
                            int i39 = i38 % 2;
                            return unitIAuthTabCallback;
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            if ((1572864 & i) == 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i2 & 256;
            if (i8 != 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        onextracallback2 = onextracallback;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i2 & 256;
        if (i8 != 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(final MaxRewardedInterstitialAdapter.onExtraCallback onextracallback, final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = onWarmupCompleted + 55;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-1849055449);
        boolean z = false;
        if ((i & 6) == 0) {
            int i8 = onNavigationEvent + 85;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 89 / 0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback)) {
                    int i10 = onNavigationEvent + 47;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    i4 = 4;
                } else {
                    i4 = 2;
                }
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback)) {
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i12 = onNavigationEvent + 15;
            onWarmupCompleted = i12 % 128;
            int i13 = i12 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2)) {
                int i14 = onWarmupCompleted + 35;
                onNavigationEvent = i14 % 128;
                i3 = i14 % 2 == 0 ? 123 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            int i15 = onWarmupCompleted + 73;
            onNavigationEvent = i15 % 128;
            int i16 = i15 % 2;
            z = true;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i2 & 1)) {
            int i17 = onWarmupCompleted + 117;
            onNavigationEvent = i17 % 128;
            int i18 = i17 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1849055449, i2, -1, "im.toss.tds.compose.component.util.navigation.ProvideTitleTypography (TdsNavigationV1.kt:164)");
            }
            putCharSequence.onExtraCallback(AppLovinMediationProvider.onExtraCallback(onextracallback.onNavigationEvent(), ((setByteOrder) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(convertYUVToRGB.IAuthTabCallback())).access100(), onextracallback.IAuthTabCallback(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, null, null, null, null, 1048572, null), null, dispatchPostbackAsync.onWarmupCompleted((dispatchPostbackAsync) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(dispatchPostbackRequest.onWarmupCompleted()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(Math.max(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(onextracallback.onNavigationEvent().getSize()), onextracallback.onWarmupCompleted())), 0, 0, null, null, 30, null), null, null, false, function2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i2 << 15) & 3670016, 58);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.util.navigation.TdsNavigationV1Kt$$ExternalSyntheticLambda1
                private static int onExtraCallback = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj, Object obj2) {
                    int i19 = 2 % 2;
                    int i20 = onExtraCallback + 115;
                    onWarmupCompleted = i20 % 128;
                    int i21 = i20 % 2;
                    Unit unitOnNavigationEvent = MaxAdViewAdapterListener.onNavigationEvent(onextracallback, function2, i, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                    int i22 = onExtraCallback + 33;
                    onWarmupCompleted = i22 % 128;
                    int i23 = i22 % 2;
                    return unitOnNavigationEvent;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[PHI: r0
      0x003f: PHI (r0v19 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v20 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0027, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029 A[PHI: r0
      0x0029: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v20 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0027, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(final Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 109;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(244925512);
            if ((i & 11) == 0) {
                int i5 = onNavigationEvent + 11;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function2) ^ true ? 2 : 4) | i;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i2 = i;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(244925512);
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(244925512, i2, -1, "im.toss.tds.compose.component.util.navigation.ProvideActionTypography (TdsNavigationV1.kt:180)");
            }
            accessgetTlsVersionsAsStringp accessgettlsversionsasstringp = accessgetTlsVersionsAsStringp.Typography6;
            MaxAdapterListener maxAdapterListener = MaxAdapterListener.onExtraCallbackWithResult;
            getHumanReadableName gethumanreadablenameOnExtraCallback = AppLovinMediationProvider.onExtraCallback(accessgettlsversionsasstringp, maxAdapterListener.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult2, 6), isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, null, null, null, null, null, 1048572, null);
            dispatchPostbackAsync dispatchpostbackasync = (dispatchPostbackAsync) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(dispatchPostbackRequest.onWarmupCompleted());
            int iOnExtraCallbackWithResult = JsParamKeys.onExtraCallbackWithResult();
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
            putCharSequence.onExtraCallback(gethumanreadablenameOnExtraCallback, null, dispatchPostbackAsync.onWarmupCompleted(dispatchpostbackasync, ((Float) MaxAdapterListener.onExtraCallback(115370551, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), new Object[]{maxAdapterListener}, JsParamKeys.onExtraCallbackWithResult(), -115370551, iOnExtraCallbackWithResult)).floatValue(), 0, 0, null, null, 30, null), null, null, false, function2, cameraCaptureResultEmptyCameraCaptureResult3, (i2 << 18) & 3670016, 58);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onWarmupCompleted + 27;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.util.navigation.TdsNavigationV1Kt$$ExternalSyntheticLambda4
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i8 = 2 % 2;
                    int i9 = onWarmupCompleted + 83;
                    onExtraCallbackWithResult = i9 % 128;
                    int i10 = i9 % 2;
                    Function2 function22 = function2;
                    if (i10 == 0) {
                        int i11 = i;
                        int iIntValue = ((Integer) obj3).intValue();
                        Object[] objArr = {function22, Integer.valueOf(i11), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue)};
                        int iOnExtraCallbackWithResult2 = handleRemoveKey.onExtraCallbackWithResult();
                        return (Unit) MaxAdViewAdapterListener.onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 1013071317, -1013071317, objArr, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2);
                    }
                    int i12 = i;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    Object[] objArr2 = {function22, Integer.valueOf(i12), (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(iIntValue2)};
                    int iOnExtraCallbackWithResult3 = handleRemoveKey.onExtraCallbackWithResult();
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
            });
        }
    }

    static {
        int i = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e A[PHI: r6
      0x002e: PHI (r6v10 o.CameraCaptureResultEmptyCameraCaptureResult) = (r6v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r6v11 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0021, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r6
      0x0023: PHI (r6v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r6v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r6v11 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0021, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 33;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-411204683);
            int i4 = 91 / 0;
            if (i != 0) {
                int i5 = onNavigationEvent + 21;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-411204683);
            if (i != 0) {
            }
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i & 1))) {
            int i7 = onWarmupCompleted + 83;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-411204683, i, -1, "im.toss.tds.compose.component.util.navigation.Preview (TdsNavigationV1.kt:202)");
                int i9 = onWarmupCompleted + 113;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback((Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit>) loadRewardedInterstitialAd.onExtraCallback.access100(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = onWarmupCompleted + 37;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.util.navigation.TdsNavigationV1Kt$$ExternalSyntheticLambda11
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = onExtraCallback + 59;
                    onWarmupCompleted = i14 % 128;
                    int i15 = i14 % 2;
                    int i16 = i;
                    int iIntValue = ((Integer) obj2).intValue();
                    Object[] objArr = {Integer.valueOf(i16), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
                    int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
                    Unit unit = (Unit) MaxAdViewAdapterListener.onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 1510584755, -1510584752, objArr, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
                    int i17 = onExtraCallback + 49;
                    onWarmupCompleted = i17 % 128;
                    if (i17 % 2 != 0) {
                        return unit;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
        }
        int i13 = onWarmupCompleted + 113;
        onNavigationEvent = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 97 / 0;
        }
    }

    private static final VirtualCameraControlExternalSyntheticLambda1 IAuthTabCallback(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, boolean z) {
        float fIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        if (!(!z)) {
            fIAuthTabCallback = MaxAdapterListener.onExtraCallbackWithResult.onExtraCallbackWithResult(deviceQuirksExternalSyntheticLambda0);
            int i4 = onNavigationEvent + 125;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 3;
            }
        } else {
            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
        }
        return VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback);
    }

    public static /* synthetic */ Unit onNavigationEvent(Function2 function2, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {function2, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 1013071317, -1013071317, objArr, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onNavigationEvent(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -1479826568, 1479826572, objArr, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 1510584755, -1510584752, objArr, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, MaxRewardedInterstitialAdapter.onExtraCallback onextracallback, long j, long j2, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {function0, quirksExternalSyntheticBackport0, onextracallback, Long.valueOf(j), Long.valueOf(j2), deviceQuirksExternalSyntheticLambda0, getbacktracenote, getbacktracenote2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), -1814558366, 1814558368, objArr, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final Unit onWarmupCompleted(getBacktraceNote getbacktracenote, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {getbacktracenote, rowScope, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallbackWithResult = handleRemoveKey.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(handleRemoveKey.onExtraCallbackWithResult(), handleRemoveKey.onExtraCallbackWithResult(), 525661866, -525661865, objArr, handleRemoveKey.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }
}
