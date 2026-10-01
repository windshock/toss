package o;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.observability.instrumentation.memory.PssReader$;
import im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.getStreamSharingChildren;
import o.r8lambdaTuSkhC09A81B66TebS9EtGm9W9U;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambdaTuSkhC09A81B66TebS9EtGm9W9U extends r8lambdawm4poh0toUcK03Yte94uAzTj6Xc {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static final /* synthetic */ class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 0;
        public static final /* synthetic */ int[] onExtraCallbackWithResult;
        private static int onWarmupCompleted = 1;

        static {
            int[] iArr = new int[r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg.values().length];
            try {
                iArr[r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg.Active.ordinal()] = 1;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg.Completed.ordinal()] = 2;
                int i2 = onWarmupCompleted + 87;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg.Upcoming.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            onExtraCallbackWithResult = iArr;
            int i5 = onWarmupCompleted + 69;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 96 / 0;
            }
        }
    }

    public static /* synthetic */ Unit onExtraCallback(r8lambdaTuSkhC09A81B66TebS9EtGm9W9U r8lambdatuskhc09a81b66tebs9etgm9w9u, float f, float f2, r8lambdaBh8wf1u761UxGMlBMuxJ2edovsM r8lambdabh8wf1u761uxgmlbmuxj2edovsm, float f3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallback(r8lambdatuskhc09a81b66tebs9etgm9w9u, f, f2, r8lambdabh8wf1u761uxgmlbmuxj2edovsm, f3, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(r8lambdatuskhc09a81b66tebs9etgm9w9u, f, f2, r8lambdabh8wf1u761uxgmlbmuxj2edovsm, f3, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(r8lambdaTuSkhC09A81B66TebS9EtGm9W9U r8lambdatuskhc09a81b66tebs9etgm9w9u, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        r8lambdatuskhc09a81b66tebs9etgm9w9u.IAuthTabCallback(quirksExternalSyntheticBackport0, str, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 58 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(r8lambdaTuSkhC09A81B66TebS9EtGm9W9U r8lambdatuskhc09a81b66tebs9etgm9w9u, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws NoWhenBranchMatchedException {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallback = onExtraCallback(r8lambdatuskhc09a81b66tebs9etgm9w9u, quirksExternalSyntheticBackport0, str, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = IAuthTabCallback + 59;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaTuSkhC09A81B66TebS9EtGm9W9U(@NotNull r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, int i, boolean z) {
        super(r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, i, z);
        Intrinsics.checkNotNullParameter(r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ r8lambdaTuSkhC09A81B66TebS9EtGm9W9U(r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            int i3 = onExtraCallbackWithResult + 81;
            int i4 = i3 % 128;
            IAuthTabCallback = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 83;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            z = false;
        }
        this(r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg, i, z);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final Unit IAuthTabCallback(r8lambdaTuSkhC09A81B66TebS9EtGm9W9U r8lambdatuskhc09a81b66tebs9etgm9w9u, float f, float f2, r8lambdaBh8wf1u761UxGMlBMuxJ2edovsM r8lambdabh8wf1u761uxgmlbmuxj2edovsm, float f3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 == 0 ? (i & 3) != 2 : (i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = IAuthTabCallback + 119;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2039898024, i, -1, "im.toss.tds.compose.component.compound.progressstepper.v1.CompactStepPreset.Step.<anonymous> (CompactStepPreset.kt:70)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2039898024, i, -1, "im.toss.tds.compose.component.compound.progressstepper.v1.CompactStepPreset.Step.<anonymous> (CompactStepPreset.kt:70)");
            }
            int i5 = onExtraCallbackWithResult.onExtraCallbackWithResult[r8lambdatuskhc09a81b66tebs9etgm9w9u.onExtraCallback().ordinal()];
            if (i5 == 1) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1109649534);
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = onextracallbackwithresult.onExtraCallback();
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, f), (QuirkSettingsLoader) null, true, 1, (Object) null);
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                    int i6 = IAuthTabCallback + 71;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback2 = onextracallbackwithresult.onExtraCallback();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = verifyDrawable.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, f2), r8lambdabh8wf1u761uxgmlbmuxj2edovsm.onExtraCallbackWithResult(), RoundedCornerShapeKt.onWarmupCompleted());
                component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback2, false);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult);
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
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
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(verifyDrawable.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, f), r8lambdabh8wf1u761uxgmlbmuxj2edovsm.onExtraCallback(), RoundedCornerShapeKt.onWarmupCompleted()), cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else if (i5 != 2) {
                int i8 = onExtraCallbackWithResult + 53;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
                if (i5 != 3) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1836911665);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    throw new NoWhenBranchMatchedException();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1108237608);
                QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback3 = QuirkSettingsLoader.Companion.onExtraCallback();
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback2, f);
                component5 component5VarOnWarmupCompleted3 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback3, false);
                int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallbackDefault);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult3 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback3 = onextracallbackwithresult3.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    int i10 = IAuthTabCallback + 95;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback3);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted3, onextracallbackwithresult3.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult3.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult3.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult3.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult3.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(verifyDrawable.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback2, f3), r8lambdabh8wf1u761uxgmlbmuxj2edovsm.onWarmupCompleted(), RoundedCornerShapeKt.onWarmupCompleted()), cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1108748457);
                QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback4 = QuirkSettingsLoader.Companion.onExtraCallback();
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback3 = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback3, f);
                component5 component5VarOnWarmupCompleted4 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback4, false);
                int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallbackDefault2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult4 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback4 = onextracallbackwithresult4.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    int i12 = onExtraCallbackWithResult + 69;
                    IAuthTabCallback = i12 % 128;
                    if (i12 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback4);
                        int i13 = 7 / 0;
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback4);
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnWarmupCompleted4, onextracallbackwithresult4.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult4.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult4.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult4.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult4.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda13 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                FocusMeteringControlExternalSyntheticLambda3.IAuthTabCallback(verifyDrawable.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback3, f3), r8lambdabh8wf1u761uxgmlbmuxj2edovsm.onNavigationEvent(), RoundedCornerShapeKt.onWarmupCompleted()), cameraCaptureResultEmptyCameraCaptureResult, 0);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i14 = onExtraCallbackWithResult + 107;
                IAuthTabCallback = i14 % 128;
                if (i14 % 2 == 0) {
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

    public static final class IAuthTabCallback implements component5 {
        private static int IAuthTabCallback = 0;
        public static final IAuthTabCallback onExtraCallback = new IAuthTabCallback();
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        static {
            int i = onExtraCallbackWithResult + 95;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        IAuthTabCallback() {
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(getStreamSharingChildren getstreamsharingchildren, int i, getStreamSharingChildren getstreamsharingchildren2, int i2, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
            int i3 = 2 % 2;
            int i4 = IAuthTabCallback + 9;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return onNavigationEvent(getstreamsharingchildren, i, getstreamsharingchildren2, i2, onextracallbackwithresult);
            }
            onNavigationEvent(getstreamsharingchildren, i, getstreamsharingchildren2, i2, onextracallbackwithresult);
            throw null;
        }

        public final component8 onExtraCallbackWithResult(component4 component4Var, List<? extends component7> list, long j) {
            final int iOnExtraCallbackWithResult;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(component4Var, "");
            Intrinsics.checkNotNullParameter(list, "");
            int interfaceDescriptor = 0;
            final getStreamSharingChildren getstreamsharingchildrenOnExtraCallback = list.get(0).onExtraCallback(VirtualCameraCaptureResult.IAuthTabCallback(j, 0, 0, 0, 0, 10, (Object) null));
            component7 component7Var = (component7) CollectionsKt.getOrNull(list, 1);
            final getStreamSharingChildren getstreamsharingchildrenOnExtraCallback2 = component7Var != null ? component7Var.onExtraCallback(VirtualCameraCaptureResult.IAuthTabCallback(j, 0, 0, 0, 0, 10, (Object) null)) : null;
            if (getstreamsharingchildrenOnExtraCallback2 != null) {
                int i2 = IAuthTabCallback + 97;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    component4Var.onExtraCallbackWithResult(r8lambdaJeSsRUT1RsUcU58dobBVG9R83I.onWarmupCompleted.access000());
                    throw null;
                }
                iOnExtraCallbackWithResult = component4Var.onExtraCallbackWithResult(r8lambdaJeSsRUT1RsUcU58dobBVG9R83I.onWarmupCompleted.access000());
            } else {
                iOnExtraCallbackWithResult = 0;
            }
            int iOnExtraCallbackWithResult2 = component4Var.onExtraCallbackWithResult(r8lambdaJeSsRUT1RsUcU58dobBVG9R83I.onWarmupCompleted.access100());
            int interfaceDescriptor2 = getstreamsharingchildrenOnExtraCallback.getInterfaceDescriptor();
            if (getstreamsharingchildrenOnExtraCallback2 != null) {
                int i3 = onWarmupCompleted + 109;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                interfaceDescriptor = getstreamsharingchildrenOnExtraCallback2.getInterfaceDescriptor();
                int i5 = IAuthTabCallback + 13;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }
            int iCoerceIn = RangesKt.coerceIn(interfaceDescriptor2 + iOnExtraCallbackWithResult + interfaceDescriptor, VirtualCameraCaptureResult.onTransact(j), VirtualCameraCaptureResult.asInterface(j));
            final int iCoerceIn2 = RangesKt.coerceIn(iOnExtraCallbackWithResult2, VirtualCameraCaptureResult.asBinder(j), VirtualCameraCaptureResult.IAuthTabCallbackDefault(j));
            return component4.IAuthTabCallback(component4Var, iCoerceIn, iCoerceIn2, (Map) null, new Function1() { // from class: im.toss.tds.compose.component.compound.progressstepper.v1.CompactStepPreset$Step$2$1$$ExternalSyntheticLambda0
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj) {
                    int i7 = 2 % 2;
                    int i8 = onExtraCallback + 93;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    Unit unitOnExtraCallbackWithResult = r8lambdaTuSkhC09A81B66TebS9EtGm9W9U.IAuthTabCallback.onExtraCallbackWithResult(getstreamsharingchildrenOnExtraCallback, iCoerceIn2, getstreamsharingchildrenOnExtraCallback2, iOnExtraCallbackWithResult, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
                    int i10 = onNavigationEvent + 3;
                    onExtraCallback = i10 % 128;
                    if (i10 % 2 == 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    throw null;
                }
            }, 4, (Object) null);
        }

        private static final Unit onNavigationEvent(getStreamSharingChildren getstreamsharingchildren, int i, getStreamSharingChildren getstreamsharingchildren2, int i2, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
            int i3 = 2 % 2;
            int i4 = onWarmupCompleted + 47;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, getstreamsharingchildren, 0, (i - getstreamsharingchildren.T_()) / 2, 0.0f, 4, (Object) null);
            if (getstreamsharingchildren2 != null) {
                int i6 = onWarmupCompleted + 75;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                getStreamSharingChildren.onExtraCallbackWithResult.onNavigationEvent(onextracallbackwithresult, getstreamsharingchildren2, getstreamsharingchildren.getInterfaceDescriptor() + i2, (i - getstreamsharingchildren2.T_()) / 2, 0.0f, 4, (Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable String str, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i5;
        Integer num;
        int i6;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i7;
        String str2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final String str3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        String str4;
        long jLongValue;
        float fOnExtraCallbackWithResult;
        float fOnNavigationEvent;
        float fIAuthTabCallbackDefault;
        int i8;
        int i9 = 2 % 2;
        int i10 = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i10 % 128;
        if (i10 % 2 == 0) {
            i3 = 100;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-827494911);
            i4 = 0;
        } else {
            i3 = 6;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-827494911);
            i4 = i2 & 1;
            if (i4 != 0) {
                int i11 = onExtraCallbackWithResult + 61;
                IAuthTabCallback = i11 % 128;
                int i12 = i11 % 2;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i5 = i4;
                num = 6;
                i6 = i | 6;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            }
            i7 = i2 & 2;
            if (i7 != 0) {
                if ((i & 48) == 0) {
                    str2 = str;
                    i6 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(str2) ? 32 : 16;
                }
                Object obj = null;
                if ((i & 384) == 0) {
                    int i13 = onExtraCallbackWithResult + 49;
                    IAuthTabCallback = i13 % 128;
                    if (i13 % 2 == 0) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(this);
                        throw null;
                    }
                    i6 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(this) ? 256 : 128;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i6 & 147) != 146, i6 & 1)) {
                    if (i5 != 0) {
                        int i14 = onExtraCallbackWithResult + 123;
                        IAuthTabCallback = i14 % 128;
                        if (i14 % 2 == 0) {
                            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                            obj.hashCode();
                            throw null;
                        }
                        quirksExternalSyntheticBackport04 = QuirksExternalSyntheticBackport0.Companion;
                    } else {
                        quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                    }
                    if (i7 != 0) {
                        int i15 = onExtraCallbackWithResult + 29;
                        IAuthTabCallback = i15 % 128;
                        if (i15 % 2 == 0) {
                            throw null;
                        }
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-827494911, i6, -1, "im.toss.tds.compose.component.compound.progressstepper.v1.CompactStepPreset.Step (CompactStepPreset.kt:40)");
                    }
                    r8lambdaJeSsRUT1RsUcU58dobBVG9R83I r8lambdajessrut1rsucu58dobbvg9r83i = r8lambdaJeSsRUT1RsUcU58dobBVG9R83I.onWarmupCompleted;
                    final r8lambdaBh8wf1u761UxGMlBMuxJ2edovsM r8lambdabh8wf1u761uxgmlbmuxj2edovsmIAuthTabCallback = r8lambdajessrut1rsucu58dobbvg9r83i.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6);
                    r8lambdalBPysS0CPqCWn6NRPDKJD1o6so r8lambdalbpyss0cpqcwn6nrpdkjd1o6so = (r8lambdalBPysS0CPqCWn6NRPDKJD1o6so) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(r8lambdakRO3qcRqXb9N4TEQnY5lrtFEaMs.onWarmupCompleted());
                    r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg r8lambdavmpxq_exjokn3zdd7dsrc7q0ydgOnExtraCallback = onExtraCallback();
                    r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg = r8lambdavmpXQ_exJokn3zdd7dSRC7Q0yDg.Active;
                    if (r8lambdavmpxq_exjokn3zdd7dsrc7q0ydgOnExtraCallback == r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg) {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1211672966);
                        jLongValue = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult2, 6), authParams.TextPrimary}, -1868498688, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).longValue();
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1211769221);
                        jLongValue = ((Long) r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onNavigationEvent(1868498689, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult2, 6), authParams.TextTertiary}, -1868498688, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted())).longValue();
                        cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                    }
                    long j = jLongValue;
                    if (onExtraCallbackWithResult()) {
                        fOnExtraCallbackWithResult = ((Float) r8lambdaJeSsRUT1RsUcU58dobBVG9R83I.onExtraCallback(-1142032812, new Object[]{r8lambdajessrut1rsucu58dobbvg9r83i}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), 1142032818)).floatValue();
                    } else {
                        fOnExtraCallbackWithResult = r8lambdajessrut1rsucu58dobbvg9r83i.onExtraCallbackWithResult();
                    }
                    final float f = fOnExtraCallbackWithResult;
                    if (onExtraCallbackWithResult()) {
                        int i16 = onExtraCallbackWithResult + 91;
                        IAuthTabCallback = i16 % 128;
                        int i17 = i16 % 2;
                        fOnNavigationEvent = ((Float) r8lambdaJeSsRUT1RsUcU58dobBVG9R83I.onExtraCallback(113861328, new Object[]{r8lambdajessrut1rsucu58dobbvg9r83i}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -113861328)).floatValue();
                    } else {
                        fOnNavigationEvent = r8lambdajessrut1rsucu58dobbvg9r83i.onNavigationEvent();
                    }
                    final float f2 = fOnNavigationEvent;
                    if (onExtraCallbackWithResult()) {
                        int i18 = IAuthTabCallback + 89;
                        onExtraCallbackWithResult = i18 % 128;
                        int i19 = i18 % 2;
                        fIAuthTabCallbackDefault = ((Float) r8lambdaJeSsRUT1RsUcU58dobBVG9R83I.onExtraCallback(1981600378, new Object[]{r8lambdajessrut1rsucu58dobbvg9r83i}, PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), PssReader$.ExternalSyntheticLambda1.onWarmupCompleted(), -1981600376)).floatValue();
                    } else {
                        fIAuthTabCallbackDefault = r8lambdajessrut1rsucu58dobbvg9r83i.IAuthTabCallbackDefault();
                    }
                    final float f3 = fIAuthTabCallbackDefault;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = r8lambdaok43d0GdMaX0ONdKhbvSy8jUmDQ.onWarmupCompleted(quirksExternalSyntheticBackport04, onWarmupCompleted(), r8lambdalbpyss0cpqcwn6nrpdkjd1o6so.onExtraCallbackWithResult(), onExtraCallback(), str4, cameraCaptureResultEmptyCameraCaptureResult2, (i6 & 14) | ((i6 << 9) & 57344));
                    int i20 = i6;
                    Integer num2 = num;
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = cameraCaptureResultEmptyCameraCaptureResult2;
                    EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(-2039898024, true, new Function2() { // from class: im.toss.tds.compose.component.compound.progressstepper.v1.CompactStepPreset$$ExternalSyntheticLambda0
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                            int i21 = 2 % 2;
                            int i22 = onNavigationEvent + 31;
                            onExtraCallbackWithResult = i22 % 128;
                            int i23 = i22 % 2;
                            Unit unitOnExtraCallback = r8lambdaTuSkhC09A81B66TebS9EtGm9W9U.onExtraCallback(this.f$0, f, f2, r8lambdabh8wf1u761uxgmlbmuxj2edovsmIAuthTabCallback, f3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i24 = onExtraCallbackWithResult + 3;
                            onNavigationEvent = i24 % 128;
                            int i25 = i24 % 2;
                            return unitOnExtraCallback;
                        }
                    }, cameraCaptureResultEmptyCameraCaptureResult4, 54);
                    if (onExtraCallbackWithResult()) {
                        cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallbackWithResult(1214786358);
                        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult4.onMinimized();
                        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized = IAuthTabCallback.onExtraCallback;
                            cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(objOnMinimized);
                        }
                        component5 component5Var = (component5) objOnMinimized;
                        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult4, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult4.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult4, quirksExternalSyntheticBackport0OnWarmupCompleted);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult4.access100() == null) {
                            int i21 = IAuthTabCallback + 35;
                            onExtraCallbackWithResult = i21 % 128;
                            if (i21 % 2 != 0) {
                                getAwbState.onExtraCallback();
                                throw null;
                            }
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult4.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult4.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResult4.onWarmupCompleted(function0IAuthTabCallback);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult4.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult4);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5Var, onextracallbackwithresult.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
                        encoderProfilesProxyVideoProfileProxyOnExtraCallback.invoke(cameraCaptureResultEmptyCameraCaptureResult4, num2);
                        if (str4 != null) {
                            cameraCaptureResultEmptyCameraCaptureResult4.onExtraCallbackWithResult(779868355);
                            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult4;
                            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str4, null, AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), Long.valueOf(j), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf(AppLovinVastMediaViewf.Companion.onExtraCallbackWithResult()), false, onExtraCallback() == r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg ? GraphicDeviceInfo.Companion.IAuthTabCallback() : GraphicDeviceInfo.Companion.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult3, Integer.valueOf(((i20 >> 3) & 14) | 384), 3072, 90098}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                            cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult4;
                            cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(780239983);
                            cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult3.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult4;
                        cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(1216818129);
                        QuirkSettingsLoader.onNavigationEvent onnavigationeventOnWarmupCompleted = r8lambdalbpyss0cpqcwn6nrpdkjd1o6so.onWarmupCompleted();
                        if (r8lambdalbpyss0cpqcwn6nrpdkjd1o6so.IAuthTabCallback()) {
                            int i22 = IAuthTabCallback + 51;
                            onExtraCallbackWithResult = i22 % 128;
                            if (i22 % 2 != 0) {
                                i8 = 0;
                                int i23 = 36 / 0;
                            } else {
                                i8 = 0;
                            }
                        } else {
                            i8 = 0;
                            quirksExternalSyntheticBackport0OnWarmupCompleted = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted, 0.0f, r8lambdajessrut1rsucu58dobbvg9r83i.onTransact(), 1, (Object) null);
                        }
                        component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onnavigationeventOnWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult3, i8);
                        int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, i8));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult3.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult3, quirksExternalSyntheticBackport0OnWarmupCompleted);
                        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                        Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult3.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult3.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult3.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0IAuthTabCallback2);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                        LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                        encoderProfilesProxyVideoProfileProxyOnExtraCallback.invoke(cameraCaptureResultEmptyCameraCaptureResult3, num2);
                        if (str4 != null) {
                            cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-98110082);
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = QuirksExternalSyntheticBackport0.Companion;
                            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback, r8lambdajessrut1rsucu58dobbvg9r83i.onWarmupCompleted()), cameraCaptureResultEmptyCameraCaptureResult3, 6);
                            if (r8lambdalbpyss0cpqcwn6nrpdkjd1o6so.IAuthTabCallback()) {
                                quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback, 0.0f, 1, (Object) null);
                            }
                            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str4, quirksExternalSyntheticBackport0OnExtraCallback, AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), Long.valueOf(j), 0L, 0L, null, null, r8lambdakRO3qcRqXb9N4TEQnY5lrtFEaMs.onExtraCallback(r8lambdalbpyss0cpqcwn6nrpdkjd1o6so), Float.valueOf(0.0f), null, null, 0L, Integer.valueOf(AppLovinVastMediaViewf.Companion.onExtraCallbackWithResult()), false, onExtraCallback() == r8lambdavmpxq_exjokn3zdd7dsrc7q0ydg ? GraphicDeviceInfo.Companion.IAuthTabCallback() : GraphicDeviceInfo.Companion.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult3, Integer.valueOf(((i20 >> 3) & 14) | 384), 3072, 89840}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                            cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                            int i24 = IAuthTabCallback + 107;
                            onExtraCallbackWithResult = i24 % 128;
                            int i25 = i24 % 2;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallbackWithResult(-97486393);
                            cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult3.asInterface();
                        cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallbackDefault();
                    }
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                    str3 = str4;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
                    cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                    str3 = str2;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.progressstepper.v1.CompactStepPreset$$ExternalSyntheticLambda1
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                            int i26 = 2 % 2;
                            int i27 = onExtraCallbackWithResult + 37;
                            onWarmupCompleted = i27 % 128;
                            if (i27 % 2 == 0) {
                                return r8lambdaTuSkhC09A81B66TebS9EtGm9W9U.onWarmupCompleted(this.f$0, quirksExternalSyntheticBackport03, str3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            }
                            Unit unitOnWarmupCompleted = r8lambdaTuSkhC09A81B66TebS9EtGm9W9U.onWarmupCompleted(this.f$0, quirksExternalSyntheticBackport03, str3, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                            int i28 = 79 / 0;
                            return unitOnWarmupCompleted;
                        }
                    });
                    return;
                }
                return;
            }
            i6 |= 48;
            str2 = str;
            Object obj2 = null;
            if ((i & 384) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i6 & 147) != 146, i6 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            int i26 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i5 = i4;
            num = i3;
            i6 = i26;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            i5 = i4;
            num = i3;
            i6 = i;
        }
        i7 = i2 & 2;
        if (i7 != 0) {
        }
        str2 = str;
        Object obj22 = null;
        if ((i & 384) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((i6 & 147) != 146, i6 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }
}
