package o;

import android.content.res.Configuration;
import android.graphics.Shader;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.Futures3;
import o.LottieCompositionFactoryExternalSyntheticLambda2;
import o.LottieCompositionFactoryExternalSyntheticLambda7;
import o.LottieDrawableExternalSyntheticLambda1;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SessionProcessorCaptureCallback;
import o.VirtualCameraCaptureResult;
import o.component4;
import o.component7;
import o.component8;
import o.flipHorizontally;
import o.getStreamSharingChildren;
import o.removeObserverLocked;
import o.setHorizontalGravity;
import o.setOrientationDegrees;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LottieCompositionFactoryExternalSyntheticLambda2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1 = (LottieDrawableExternalSyntheticLambda1) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 125;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) onNavigationEvent(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1834977048, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{lottieDrawableExternalSyntheticLambda1, Float.valueOf(fFloatValue), Integer.valueOf(iIntValue), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue2)}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1834977051);
        int i4 = onExtraCallback + 35;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(onNavigationEvent onnavigationevent, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(onnavigationevent, setorientationdegrees);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(onnavigationevent, setorientationdegrees);
        int i3 = onExtraCallback + 125;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback(LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(lottieDrawableExternalSyntheticLambda1, futures3);
        if (i3 != 0) {
            int i4 = 45 / 0;
        }
        int i5 = IAuthTabCallback + 75;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getTimebase gettimebase, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(gettimebase, fliphorizontally);
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit IAuthTabCallback(isQueryRefinementEnabled isqueryrefinementenabled, isQueryRefinementEnabled isqueryrefinementenabled2, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(isqueryrefinementenabled, isqueryrefinementenabled2, fliphorizontally);
        int i4 = IAuthTabCallback + 5;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ removeObserverLocked IAuthTabCallback(long j, float f, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        removeObserverLocked removeobserverlockedOnExtraCallback = onExtraCallback(j, f, sessionProcessorCaptureCallback);
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
        return removeobserverlockedOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1 = (LottieDrawableExternalSyntheticLambda1) objArr[0];
        getBacktraceNote getbacktracenote = (getBacktraceNote) objArr[1];
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[2];
        getBacktraceNote getbacktracenote2 = (getBacktraceNote) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int iIntValue2 = ((Number) objArr[5]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[6];
        ((Number) objArr[7]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallback = i2 % 128;
        onWarmupCompleted(lottieDrawableExternalSyntheticLambda1, getbacktracenote, quirksExternalSyntheticBackport0, getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(boolean z, LottieCompositionFactoryExternalSyntheticLambda7 lottieCompositionFactoryExternalSyntheticLambda7, float f, long j, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 27;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        onNavigationEvent(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1967407688, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{Boolean.valueOf(z), lottieCompositionFactoryExternalSyntheticLambda7, Float.valueOf(f), Long.valueOf(j), quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1)), Integer.valueOf(i2)}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1967407687);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 95;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static final /* synthetic */ void onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, z);
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1 = (LottieDrawableExternalSyntheticLambda1) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[3];
        ((Number) objArr[4]).intValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -228305456, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{lottieDrawableExternalSyntheticLambda1, Float.valueOf(fFloatValue), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1))}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 228305458);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getStreamSharingChildren getstreamsharingchildren, int i, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(getstreamsharingchildren, i, onextracallbackwithresult);
        int i5 = onExtraCallback + 73;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i5;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i5);
        int i11 = ~i6;
        int i12 = (~(i8 | i11 | i3)) | i10;
        int i13 = (~(i5 | i11)) | (~(i7 | i11));
        int i14 = i3 + i6 + i + (1941422536 * i2) + ((-555707305) * i4);
        int i15 = i14 * i14;
        int i16 = (i3 * (-2131549542)) + 177471488 + ((-2131549542) * i6) + (i9 * (-207299225)) + (i12 * (-207299225)) + ((-207299225) * i13) + (1956118528 * i) + ((-1363148800) * i2) + (2141716480 * i4) + ((-573308928) * i15);
        int i17 = ((i3 * 487360618) - 1291405921) + (i6 * 487360618) + (i9 * 543) + (i12 * 543) + (i13 * 543) + (i * 487361161) + (i2 * (-1188264952)) + (i4 * 624576655) + (i15 * (-25952256));
        int i18 = i16 + (i17 * i17 * 74186752);
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? i18 != 5 ? onExtraCallback(objArr) : asInterface(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr);
    }

    public static /* synthetic */ Unit onNavigationEvent(boolean z, LottieCompositionFactoryExternalSyntheticLambda7 lottieCompositionFactoryExternalSyntheticLambda7, float f, long j, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 99;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return onExtraCallback(z, lottieCompositionFactoryExternalSyntheticLambda7, f, j, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onExtraCallback(z, lottieCompositionFactoryExternalSyntheticLambda7, f, j, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(float f, long j, float f2, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 75;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(f, j, f2, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 97;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(float f, getTimebase gettimebase, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {Float.valueOf(f), gettimebase, futures3};
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback3 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback4 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        if (i3 == 0) {
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(iIAuthTabCallback2, iIAuthTabCallback3, -1908805883, iIAuthTabCallback4, objArr, iIAuthTabCallback, 1908805888);
        int i4 = IAuthTabCallback + 43;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, getBacktraceNote getbacktracenote, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallback + 57;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return (Unit) onNavigationEvent(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1037444126, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{lottieDrawableExternalSyntheticLambda1, getbacktracenote, quirksExternalSyntheticBackport0, getbacktracenote2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1037444126);
        }
        throw null;
    }

    public static /* synthetic */ component8 onWarmupCompleted(LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, component4 component4Var, component7 component7Var, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        component8 component8VarOnExtraCallback = onExtraCallback(lottieDrawableExternalSyntheticLambda1, component4Var, component7Var, virtualCameraCaptureResult);
        int i4 = onExtraCallback + 41;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return component8VarOnExtraCallback;
    }

    private static final Unit onWarmupCompleted(getTimebase gettimebase, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 89;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            fliphorizontally.access000(onExtraCallback(gettimebase));
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.access000(onExtraCallback(gettimebase));
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        float fIntBitsToFloat;
        float fFloatValue = ((Number) objArr[0]).floatValue();
        getTimebase gettimebase = (getTimebase) objArr[1];
        Futures3 futures3 = (Futures3) objArr[2];
        int i = 2 % 2;
        int i2 = onExtraCallback + 117;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(futures3, "");
            fIntBitsToFloat = (Float.intBitsToFloat((int) FuturesCallbackListener.onTransact(futures3)) - ExtensionsInfoExternalSyntheticLambda0.onExtraCallback(ExtensionsManager2.onNavigationEvent(futures3.asBinder()))) * fFloatValue;
        } else {
            Intrinsics.checkNotNullParameter(futures3, "");
            fIntBitsToFloat = (Float.intBitsToFloat((int) FuturesCallbackListener.onTransact(futures3)) + ExtensionsInfoExternalSyntheticLambda0.onExtraCallback(ExtensionsManager2.onNavigationEvent(futures3.asBinder()))) - fFloatValue;
        }
        onExtraCallbackWithResult(gettimebase, (int) fIntBitsToFloat);
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(futures3, "");
        lottieDrawableExternalSyntheticLambda1.onWarmupCompleted(FuturesCallbackListener.onTransact(futures3));
        if (!(!lottieDrawableExternalSyntheticLambda1.IAuthTabCallbackStub())) {
            int i4 = IAuthTabCallback + 123;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                lottieDrawableExternalSyntheticLambda1.onExtraCallback(futures3.asBinder());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            lottieDrawableExternalSyntheticLambda1.onExtraCallback(futures3.asBinder());
        }
        return Unit.INSTANCE;
    }

    public static final void onWarmupCompleted(@NotNull final LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, @NotNull final getBacktraceNote<? super LottieCompositionFactoryExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable final getBacktraceNote<? super LottieDrawableExternalSyntheticLambda14, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws Throwable {
        int i3;
        boolean z;
        Throwable th;
        LottieCompositionFactoryExternalSyntheticLambda3 lottieCompositionFactoryExternalSyntheticLambda3;
        getBacktraceNote<? super LottieCompositionFactoryExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3;
        getBacktraceNote<? super LottieDrawableExternalSyntheticLambda14, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4;
        LottieDrawableExternalSyntheticLambda14 lottieDrawableExternalSyntheticLambda14;
        Integer numValueOf;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(lottieDrawableExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-423358818);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(lottieDrawableExternalSyntheticLambda1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i5 = IAuthTabCallback + 111;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote);
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            int i7 = IAuthTabCallback + 59;
            onExtraCallback = i7 % 128;
            if (i7 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02);
                throw null;
            }
            i3 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ^ true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote2) ? 2048 : 1024;
        }
        int i8 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i8 & 1171) != 1170, i8 & 1)) {
            if (i6 != 0) {
                quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onExtraCallback + 97;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-423358818, i8, -1, "im.toss.compose.widget.point.overlay.PointComponentOverlayContent (PointComponentOverlayContent.kt:57)");
            }
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            Configuration configuration = (Configuration) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult());
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(lottieDrawableExternalSyntheticLambda1.onTransact());
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new LottieDrawableExternalSyntheticLambda14(lottieDrawableExternalSyntheticLambda1, 70);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            LottieDrawableExternalSyntheticLambda14 lottieDrawableExternalSyntheticLambda142 = (LottieDrawableExternalSyntheticLambda14) objOnMinimized;
            boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(lottieDrawableExternalSyntheticLambda1.onTransact());
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zOnNavigationEvent2 || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized2 = new LottieCompositionFactoryExternalSyntheticLambda3(lottieDrawableExternalSyntheticLambda1, 70);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
            }
            LottieCompositionFactoryExternalSyntheticLambda3 lottieCompositionFactoryExternalSyntheticLambda32 = (LottieCompositionFactoryExternalSyntheticLambda3) objOnMinimized2;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(configuration.screenWidthDp);
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zOnExtraCallback || objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized3 = Float.valueOf(configuration.screenWidthDp * 1.8f);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
            }
            float fFloatValue = ((Number) objOnMinimized3).floatValue();
            boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue);
            Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zIAuthTabCallback || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized4 = Float.valueOf(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fFloatValue / 2.0f)));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
            }
            final float fFloatValue2 = ((Number) objOnMinimized4).floatValue();
            Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                int i11 = IAuthTabCallback + 91;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                objOnMinimized5 = notifyPublicListeners.onWarmupCompleted(0);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
            }
            final getTimebase gettimebase = (getTimebase) objOnMinimized5;
            boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(lottieDrawableExternalSyntheticLambda1.onTransact());
            Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zOnNavigationEvent3 || objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized6 = Float.valueOf(!(Intrinsics.areEqual(lottieDrawableExternalSyntheticLambda1.onTransact(), LottieCompositionFactoryExternalSyntheticLambda7.onWarmupCompleted.onExtraCallback) ^ true) ? 0.0f : r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(300.0f)));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
            }
            float fFloatValue3 = ((Number) objOnMinimized6).floatValue();
            boolean zOnNavigationEvent4 = lottieDrawableExternalSyntheticLambda1.onNavigationEvent();
            LottieCompositionFactoryExternalSyntheticLambda7 lottieCompositionFactoryExternalSyntheticLambda7OnTransact = lottieDrawableExternalSyntheticLambda1.onTransact();
            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fFloatValue);
            long jIAuthTabCallback = failAllPendingSnapshots.IAuthTabCallback(lottieDrawableExternalSyntheticLambda1.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized7 = new Function1() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayContentKt$$ExternalSyntheticLambda8
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i13 = 2 % 2;
                        int i14 = onExtraCallback + 15;
                        onWarmupCompleted = i14 % 128;
                        int i15 = i14 % 2;
                        Unit unitIAuthTabCallback = LottieCompositionFactoryExternalSyntheticLambda2.IAuthTabCallback(gettimebase, (flipHorizontally) obj);
                        int i16 = onExtraCallback + 49;
                        onWarmupCompleted = i16 % 128;
                        if (i16 % 2 != 0) {
                            int i17 = 89 / 0;
                        }
                        return unitIAuthTabCallback;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized7);
            }
            Object obj = null;
            onNavigationEvent(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1967407688, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{Boolean.valueOf(zOnNavigationEvent4), lottieCompositionFactoryExternalSyntheticLambda7OnTransact, Float.valueOf(fIAuthTabCallback), Long.valueOf(jIAuthTabCallback), attachTimestamp.IAuthTabCallback(onextracallback, (Function1) objOnMinimized7), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24576, 0}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1967407687);
            int i13 = i8 & 14;
            onNavigationEvent(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -228305456, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{lottieDrawableExternalSyntheticLambda1, Float.valueOf(fFloatValue3), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i13)}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 228305458);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02, 0.0f, 1, (Object) null);
            boolean zIAuthTabCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue2);
            Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zIAuthTabCallback2 || objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized8 = new Function1() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayContentKt$$ExternalSyntheticLambda9
                    private static int IAuthTabCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2) {
                        int i14 = 2 % 2;
                        int i15 = onNavigationEvent + 33;
                        IAuthTabCallback = i15 % 128;
                        int i16 = i15 % 2;
                        float f = fFloatValue2;
                        if (i16 != 0) {
                            return LottieCompositionFactoryExternalSyntheticLambda2.onWarmupCompleted(f, gettimebase, (Futures3) obj2);
                        }
                        LottieCompositionFactoryExternalSyntheticLambda2.onWarmupCompleted(f, gettimebase, (Futures3) obj2);
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized8);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized8);
            FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(22.0f));
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnExtraCallback, onextracallbackwithresult.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                int i14 = onExtraCallback + 73;
                IAuthTabCallback = i14 % 128;
                int i15 = i14 % 2;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            if (i13 == 4) {
                int i16 = IAuthTabCallback + 61;
                onExtraCallback = i16 % 128;
                int i17 = i16 % 2;
                z = true;
            } else {
                z = false;
            }
            Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (z || objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized9 = new Function1() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayContentKt$$ExternalSyntheticLambda10
                    private static int onNavigationEvent = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj2) {
                        int i18 = 2 % 2;
                        int i19 = onNavigationEvent + 73;
                        onWarmupCompleted = i19 % 128;
                        int i20 = i19 % 2;
                        Unit unitIAuthTabCallback = LottieCompositionFactoryExternalSyntheticLambda2.IAuthTabCallback(lottieDrawableExternalSyntheticLambda1, (Futures3) obj2);
                        int i21 = onNavigationEvent + 43;
                        onWarmupCompleted = i21 % 128;
                        if (i21 % 2 != 0) {
                            return unitIAuthTabCallback;
                        }
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized9);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = r8lambdaLnyTrDpxDU4Lj0jFr7wqOCUqwI.onNavigationEvent(onextracallback, (Function1) objOnMinimized9);
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent2);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                int i18 = onExtraCallback + 101;
                IAuthTabCallback = i18 % 128;
                if (i18 % 2 == 0) {
                    getAwbState.onExtraCallback();
                    obj.hashCode();
                    throw null;
                }
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            if (lottieDrawableExternalSyntheticLambda1.IAuthTabCallbackStub()) {
                int i19 = onExtraCallback + 81;
                IAuthTabCallback = i19 % 128;
                if (i19 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1763807352);
                    numValueOf = Integer.valueOf(i8 & 4);
                    th = null;
                    lottieCompositionFactoryExternalSyntheticLambda3 = lottieCompositionFactoryExternalSyntheticLambda32;
                    getbacktracenote3 = getbacktracenote;
                } else {
                    th = null;
                    lottieCompositionFactoryExternalSyntheticLambda3 = lottieCompositionFactoryExternalSyntheticLambda32;
                    getbacktracenote3 = getbacktracenote;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1763807352);
                    numValueOf = Integer.valueOf(i8 & 112);
                }
                getbacktracenote3.invoke(lottieCompositionFactoryExternalSyntheticLambda3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, numValueOf);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                Unit unit = Unit.INSTANCE;
                getbacktracenote4 = getbacktracenote2;
                lottieDrawableExternalSyntheticLambda14 = lottieDrawableExternalSyntheticLambda142;
            } else {
                th = null;
                lottieCompositionFactoryExternalSyntheticLambda3 = lottieCompositionFactoryExternalSyntheticLambda32;
                getbacktracenote3 = getbacktracenote;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1763710632);
                getbacktracenote4 = getbacktracenote2;
                if (getbacktracenote4 == null) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1763710633);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    lottieDrawableExternalSyntheticLambda14 = lottieDrawableExternalSyntheticLambda142;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1467126762);
                    lottieDrawableExternalSyntheticLambda14 = lottieDrawableExternalSyntheticLambda142;
                    getbacktracenote4.invoke(lottieDrawableExternalSyntheticLambda14, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i8 >> 6) & 112));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    Unit unit2 = Unit.INSTANCE;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (lottieDrawableExternalSyntheticLambda1.IAuthTabCallbackStub()) {
                int i20 = IAuthTabCallback + 49;
                onExtraCallback = i20 % 128;
                if (i20 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1435476162);
                    throw th;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1435476162);
                if (getbacktracenote4 == null) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1435476163);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1431779004);
                    getbacktracenote4.invoke(lottieDrawableExternalSyntheticLambda14, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf((i8 >> 6) & 112));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                    Unit unit3 = Unit.INSTANCE;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                int i21 = IAuthTabCallback + 7;
                onExtraCallback = i21 % 128;
                int i22 = i21 % 2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1435443178);
                getbacktracenote3.invoke(lottieCompositionFactoryExternalSyntheticLambda3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(i8 & 112));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                Unit unit4 = Unit.INSTANCE;
            }
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
        }
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayContentKt$$ExternalSyntheticLambda11
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    int i23 = 2 % 2;
                    int i24 = onExtraCallbackWithResult + 45;
                    onExtraCallback = i24 % 128;
                    if (i24 % 2 != 0) {
                        LottieCompositionFactoryExternalSyntheticLambda2.onWarmupCompleted(lottieDrawableExternalSyntheticLambda1, getbacktracenote, quirksExternalSyntheticBackport03, getbacktracenote2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                    Unit unitOnWarmupCompleted = LottieCompositionFactoryExternalSyntheticLambda2.onWarmupCompleted(lottieDrawableExternalSyntheticLambda1, getbacktracenote, quirksExternalSyntheticBackport03, getbacktracenote2, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i25 = onExtraCallbackWithResult + 107;
                    onExtraCallback = i25 % 128;
                    if (i25 % 2 != 0) {
                        int i26 = 4 / 0;
                    }
                    return unitOnWarmupCompleted;
                }
            });
        }
    }

    private static final component8 onExtraCallback(LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, component4 component4Var, component7 component7Var, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(component4Var, "");
        Intrinsics.checkNotNullParameter(component7Var, "");
        final getStreamSharingChildren getstreamsharingchildrenOnExtraCallback = component7Var.onExtraCallback(virtualCameraCaptureResult.onExtraCallback());
        final int iIntBitsToFloat = (((int) Float.intBitsToFloat((int) lottieDrawableExternalSyntheticLambda1.asBinder())) - ((int) ((VirtualCameraCaptureResult.asInterface(virtualCameraCaptureResult.onExtraCallback()) * 0.7f) / 2.0f))) + ((int) (((int) lottieDrawableExternalSyntheticLambda1.IAuthTabCallbackDefault()) / 2.0f));
        component8 component8VarIAuthTabCallback = component4.IAuthTabCallback(component4Var, VirtualCameraCaptureResult.asInterface(virtualCameraCaptureResult.onExtraCallback()), VirtualCameraCaptureResult.IAuthTabCallbackDefault(virtualCameraCaptureResult.onExtraCallback()), (Map) null, new Function1() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayContentKt$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                Unit unitOnExtraCallbackWithResult;
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 27;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    unitOnExtraCallbackWithResult = LottieCompositionFactoryExternalSyntheticLambda2.onExtraCallbackWithResult(getstreamsharingchildrenOnExtraCallback, iIntBitsToFloat, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
                    int i4 = 2 / 0;
                } else {
                    unitOnExtraCallbackWithResult = LottieCompositionFactoryExternalSyntheticLambda2.onExtraCallbackWithResult(getstreamsharingchildrenOnExtraCallback, iIntBitsToFloat, (getStreamSharingChildren.onExtraCallbackWithResult) obj);
                }
                int i5 = onWarmupCompleted + 35;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnExtraCallbackWithResult;
                }
                throw null;
            }
        }, 4, (Object) null);
        int i2 = onExtraCallback + 31;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return component8VarIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(getStreamSharingChildren getstreamsharingchildren, int i, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 25;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, 0, i, 0.0f, 4, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallback + 85;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onExtraCallback(isQueryRefinementEnabled isqueryrefinementenabled, isQueryRefinementEnabled isqueryrefinementenabled2, flipHorizontally fliphorizontally) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 101;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fliphorizontally, "");
            fliphorizontally.IAuthTabCallbackDefault(((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue());
            fliphorizontally.access000(((Number) isqueryrefinementenabled2.IAuthTabCallback()).floatValue());
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(fliphorizontally, "");
        fliphorizontally.IAuthTabCallbackDefault(((Number) isqueryrefinementenabled.IAuthTabCallback()).floatValue());
        fliphorizontally.access000(((Number) isqueryrefinementenabled2.IAuthTabCallback()).floatValue());
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 33;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ LottieCompositionFactoryExternalSyntheticLambda17 $gradientGroupState;
        final /* synthetic */ LottieDrawableExternalSyntheticLambda1 $state;
        final /* synthetic */ boolean $visible;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, boolean z, LottieCompositionFactoryExternalSyntheticLambda17 lottieCompositionFactoryExternalSyntheticLambda17, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$state = lottieDrawableExternalSyntheticLambda1;
            this.$visible = z;
            this.$gradientGroupState = lottieCompositionFactoryExternalSyntheticLambda17;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$state, this.$visible, this.$gradientGroupState, access13800Var);
            int i2 = onExtraCallback + 75;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 31;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 37;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 5;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 60 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (ExtensionsManager1.IAuthTabCallback(this.$state.IAuthTabCallbackDefault(), ExtensionsManager1.Companion.onNavigationEvent()) || !this.$visible) {
                this.$gradientGroupState.onNavigationEvent();
                int i2 = onExtraCallback + 51;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
            } else {
                int i4 = onNavigationEvent + 19;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    Object[] objArr = {this.$gradientGroupState, Long.valueOf(this.$state.IAuthTabCallbackDefault()), Float.valueOf(0.0f), 2, null};
                    int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
                    LottieCompositionFactoryExternalSyntheticLambda17.onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1406038806, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1406038806, objArr);
                } else {
                    Object[] objArr2 = {this.$gradientGroupState, Long.valueOf(this.$state.IAuthTabCallbackDefault()), Float.valueOf(0.0f), 2, null};
                    int iOnExtraCallbackWithResult2 = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
                    LottieCompositionFactoryExternalSyntheticLambda17.onExtraCallback(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), -1406038806, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 1406038806, objArr2);
                }
                this.$gradientGroupState.IAuthTabCallbackDefault();
            }
            return Unit.INSTANCE;
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $rotationZ;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$rotationZ = isqueryrefinementenabled;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$rotationZ, access13800Var);
            int i2 = onWarmupCompleted + 25;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 99;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            if (i3 != 0) {
                int i4 = 16 / 0;
            }
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 67;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
        
            if (o.isQueryRefinementEnabled.onWarmupCompleted(r3, r4, r5, (java.lang.Object) null, (kotlin.jvm.functions.Function1) null, r11, 12, (java.lang.Object) null) == r1) goto L26;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 103;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$rotationZ;
                Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(0.0f);
                this.label = 1;
                if (isqueryrefinementenabled.onWarmupCompleted(fOnExtraCallbackWithResult, this) != objOnWarmupCompleted) {
                }
                int i4 = onWarmupCompleted + 7;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objOnWarmupCompleted;
            }
            if (i3 != 1) {
                int i6 = onWarmupCompleted + 17;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
                return Unit.INSTANCE;
            }
            ResultKt.onNavigationEvent(obj);
            int i8 = onWarmupCompleted + 95;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 3 % 3;
            }
            isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled2 = this.$rotationZ;
            Float fOnExtraCallbackWithResult2 = access14000.onExtraCallbackWithResult(-180.0f);
            getThumbPosition getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult(processDeepLink.onExtraCallback() ? 0 : 4000, 0, getCallToActionButton.onExtraCallback.onTransact(), 2, (Object) null);
            this.label = 2;
        }
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ float $initTranslationY;
        final /* synthetic */ LottieDrawableExternalSyntheticLambda1 $state;
        final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $translationY;
        final /* synthetic */ boolean $visible;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, boolean z, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, float f, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$state = lottieDrawableExternalSyntheticLambda1;
            this.$visible = z;
            this.$translationY = isqueryrefinementenabled;
            this.$initTranslationY = f;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$state, this.$visible, this.$translationY, this.$initTranslationY, access13800Var);
            onextracallbackwithresult.L$0 = obj;
            int i2 = onNavigationEvent + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 73;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnWarmupCompleted;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 105;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (Intrinsics.areEqual(this.$state.onTransact(), LottieCompositionFactoryExternalSyntheticLambda7.onExtraCallback.onExtraCallback)) {
                maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass3(this.$visible, this.$translationY, this.$initTranslationY, null), 3, (Object) null);
                int i2 = onWarmupCompleted + 119;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 4 % 3;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 53;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        /* renamed from: o.LottieCompositionFactoryExternalSyntheticLambda2$onExtraCallbackWithResult$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;
            final /* synthetic */ float $initTranslationY;
            final /* synthetic */ isQueryRefinementEnabled<Float, onSuggestionsKey> $translationY;
            final /* synthetic */ boolean $visible;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(boolean z, isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled, float f, access13800<? super AnonymousClass3> access13800Var) {
                super(2, access13800Var);
                this.$visible = z;
                this.$translationY = isqueryrefinementenabled;
                this.$initTranslationY = f;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$visible, this.$translationY, this.$initTranslationY, access13800Var);
                int i2 = onExtraCallback + 109;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass3;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 25;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallback + 23;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallback;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 99;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = IAuthTabCallback + 21;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
            
                if (r14 == r1) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
            
                if (r14 != r1) goto L26;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                getThumbPosition getthumbpositionOnExtraCallback;
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    if (!this.$visible) {
                        isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled = this.$translationY;
                        Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(this.$initTranslationY);
                        getThumbPosition getthumbpositionOnExtraCallbackWithResult = processDeepLink.onExtraCallback() ? onQueryRefine.onExtraCallbackWithResult(0, 0, getIconContentView.onWarmupCompleted.onNavigationEvent(), 2, (Object) null) : getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.onNavigationEvent(), 0, 2, (Object) null);
                        this.label = 2;
                        obj = isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, getthumbpositionOnExtraCallbackWithResult, (Object) null, (Function1) null, this, 12, (Object) null);
                    } else {
                        int i3 = onExtraCallback + 107;
                        IAuthTabCallback = i3 % 128;
                        int i4 = i3 % 2;
                        isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled2 = this.$translationY;
                        Float fOnExtraCallbackWithResult2 = access14000.onExtraCallbackWithResult(0.0f);
                        if (processDeepLink.onExtraCallback()) {
                            int i5 = onExtraCallback + 45;
                            IAuthTabCallback = i5 % 128;
                            int i6 = i5 % 2;
                            getthumbpositionOnExtraCallback = onQueryRefine.onExtraCallbackWithResult(0, 0, getIconContentView.onWarmupCompleted.onNavigationEvent(), 2, (Object) null);
                        } else {
                            getthumbpositionOnExtraCallback = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.onNavigationEvent(), 0, 2, (Object) null);
                        }
                        this.label = 1;
                        obj = isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled2, fOnExtraCallbackWithResult2, getthumbpositionOnExtraCallback, (Object) null, (Function1) null, this, 12, (Object) null);
                    }
                    return objOnWarmupCompleted;
                }
                if (i2 == 1) {
                    ResultKt.onNavigationEvent(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = IAuthTabCallback + 49;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    ResultKt.onNavigationEvent(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i;
        boolean z;
        Object obj;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        boolean z2;
        boolean z3;
        int i2;
        final LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1 = (LottieDrawableExternalSyntheticLambda1) objArr[0];
        final float fFloatValue = ((Number) objArr[1]).floatValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
        final int iIntValue = ((Number) objArr[3]).intValue();
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(690279862);
        if ((iIntValue & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(lottieDrawableExternalSyntheticLambda1)) {
                int i4 = IAuthTabCallback + 17;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i = i2 | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue) ? 32 : 16;
        }
        int i6 = i;
        if ((i6 & 19) != 18) {
            int i7 = onExtraCallback + 7;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        Object obj2 = null;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i6 & 1)) {
            int i9 = onExtraCallback + 93;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i11 = IAuthTabCallback + 93;
                onExtraCallback = i11 % 128;
                if (i11 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(690279862, i6, -1, "im.toss.compose.widget.point.overlay.PointGradientGroup (PointComponentOverlayContent.kt:137)");
                    obj2.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(690279862, i6, -1, "im.toss.compose.widget.point.overlay.PointGradientGroup (PointComponentOverlayContent.kt:137)");
            }
            boolean zOnNavigationEvent = lottieDrawableExternalSyntheticLambda1.onNavigationEvent();
            LottieCompositionFactoryExternalSyntheticLambda17 lottieCompositionFactoryExternalSyntheticLambda17OnExtraCallback = LottieCompositionFactoryExternalSyntheticLambda4.onExtraCallback(lottieDrawableExternalSyntheticLambda1.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = isIconified.onWarmupCompleted(0.0f, 0.0f, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
            }
            final isQueryRefinementEnabled isqueryrefinementenabled = (isQueryRefinementEnabled) objOnMinimized;
            int i12 = i6 & 112;
            boolean z4 = i12 == 32;
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!z4) {
                Object obj3 = objOnMinimized2;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    isQueryRefinementEnabled isqueryrefinementenabledOnWarmupCompleted = isIconified.onWarmupCompleted(fFloatValue, 0.0f, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(isqueryrefinementenabledOnWarmupCompleted);
                    obj3 = isqueryrefinementenabledOnWarmupCompleted;
                }
                final isQueryRefinementEnabled isqueryrefinementenabled2 = (isQueryRefinementEnabled) obj3;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
                int i13 = i6 & 14;
                boolean z5 = i13 == 4;
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z5 || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = new getBacktraceNote() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayContentKt$$ExternalSyntheticLambda1
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i14 = 2 % 2;
                            int i15 = onExtraCallbackWithResult + 53;
                            onNavigationEvent = i15 % 128;
                            int i16 = i15 % 2;
                            component8 component8VarOnWarmupCompleted = LottieCompositionFactoryExternalSyntheticLambda2.onWarmupCompleted(lottieDrawableExternalSyntheticLambda1, (component4) obj4, (component7) obj5, (VirtualCameraCaptureResult) obj6);
                            int i17 = onExtraCallbackWithResult + 117;
                            onNavigationEvent = i17 % 128;
                            if (i17 % 2 != 0) {
                                return component8VarOnWarmupCompleted;
                            }
                            throw null;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = ListFuture2.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, (getBacktraceNote) objOnMinimized3);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled);
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled2);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((zOnExtraCallback | zOnExtraCallback2) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized4 = new Function1() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayContentKt$$ExternalSyntheticLambda2
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj4) {
                            int i14 = 2 % 2;
                            int i15 = onNavigationEvent + 23;
                            onExtraCallbackWithResult = i15 % 128;
                            int i16 = i15 % 2;
                            Unit unitIAuthTabCallback = LottieCompositionFactoryExternalSyntheticLambda2.IAuthTabCallback(isqueryrefinementenabled, isqueryrefinementenabled2, (flipHorizontally) obj4);
                            int i17 = onNavigationEvent + 21;
                            onExtraCallbackWithResult = i17 % 128;
                            int i18 = i17 % 2;
                            return unitIAuthTabCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                }
                LottieCompositionFactoryExternalSyntheticLambda16.onExtraCallback(lottieCompositionFactoryExternalSyntheticLambda17OnExtraCallback, attachTimestamp.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted, (Function1) objOnMinimized4), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 0);
                ExtensionsManager1 extensionsManager1OnNavigationEvent = ExtensionsManager1.onNavigationEvent(lottieDrawableExternalSyntheticLambda1.IAuthTabCallbackDefault());
                if (i13 == 4) {
                    int i14 = onExtraCallback + 75;
                    int i15 = i14 % 128;
                    IAuthTabCallback = i15;
                    int i16 = i15 + 19;
                    z2 = i14 % 2 != 0;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                } else {
                    z2 = false;
                }
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zOnNavigationEvent);
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda17OnExtraCallback);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((z2 | zOnExtraCallback3 | zOnNavigationEvent2) || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized5 = new onExtraCallback(lottieDrawableExternalSyntheticLambda1, zOnNavigationEvent, lottieCompositionFactoryExternalSyntheticLambda17OnExtraCallback, null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                }
                isZslDisabledByByUserCaseConfig.onExtraCallback(extensionsManager1OnNavigationEvent, Boolean.valueOf(zOnNavigationEvent), (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                boolean zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled);
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!zOnExtraCallback4) {
                    int i18 = onExtraCallback + 15;
                    IAuthTabCallback = i18 % 128;
                    int i19 = i18 % 2;
                    if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                        obj = null;
                        objOnMinimized6 = new onWarmupCompleted(isqueryrefinementenabled, null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                    } else {
                        obj = null;
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(zOnNavigationEvent), (Function2) objOnMinimized6, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    LottieCompositionFactoryExternalSyntheticLambda7 lottieCompositionFactoryExternalSyntheticLambda7OnTransact = lottieDrawableExternalSyntheticLambda1.onTransact();
                    if (i13 == 4) {
                        int i20 = onExtraCallback + 13;
                        IAuthTabCallback = i20 % 128;
                        int i21 = i20 % 2;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zOnNavigationEvent);
                    boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(isqueryrefinementenabled2);
                    boolean z6 = i12 == 32;
                    Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(z3 | zOnExtraCallback5 | zOnExtraCallback6 | z6)) {
                        int i22 = onExtraCallback + 109;
                        IAuthTabCallback = i22 % 128;
                        int i23 = i22 % 2;
                        if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(lottieDrawableExternalSyntheticLambda1, zOnNavigationEvent, isqueryrefinementenabled2, fFloatValue, null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(onextracallbackwithresult);
                            objOnMinimized7 = onextracallbackwithresult;
                        }
                        cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        isZslDisabledByByUserCaseConfig.IAuthTabCallback(Boolean.valueOf(zOnNavigationEvent), lottieCompositionFactoryExternalSyntheticLambda7OnTransact, Float.valueOf(fFloatValue), (Function2) objOnMinimized7, cameraCaptureResultEmptyCameraCaptureResult, (i6 << 3) & 896);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            int i24 = onExtraCallback + 95;
                            IAuthTabCallback = i24 % 128;
                            int i25 = i24 % 2;
                        }
                    }
                }
            }
        } else {
            obj = null;
            cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayContentKt$$ExternalSyntheticLambda3
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj4, Object obj5) {
                    int i26 = 2 % 2;
                    int i27 = onWarmupCompleted + 89;
                    onNavigationEvent = i27 % 128;
                    int i28 = i27 % 2;
                    LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda12 = lottieDrawableExternalSyntheticLambda1;
                    float f = fFloatValue;
                    int i29 = iIntValue;
                    int iIntValue2 = ((Integer) obj5).intValue();
                    Unit unit = (Unit) LottieCompositionFactoryExternalSyntheticLambda2.onNavigationEvent(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1626647317, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{lottieDrawableExternalSyntheticLambda12, Float.valueOf(f), Integer.valueOf(i29), (CameraCaptureResultEmptyCameraCaptureResult) obj4, Integer.valueOf(iIntValue2)}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1626647321);
                    int i30 = onWarmupCompleted + 107;
                    onNavigationEvent = i30 % 128;
                    int i31 = i30 % 2;
                    return unit;
                }
            });
        }
        return obj;
    }

    public static final class onNavigationEvent extends ExifAttribute {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ long IAuthTabCallback;
        final /* synthetic */ float onExtraCallbackWithResult;

        onNavigationEvent(long j, float f) {
            this.IAuthTabCallback = j;
            this.onExtraCallbackWithResult = f;
        }

        public Shader onNavigationEvent(long j) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Shader shaderIAuthTabCallback = fromMilesPerHour.IAuthTabCallback(UseCaseAttachStateExternalSyntheticLambda2.onExtraCallbackWithResult(j), this.onExtraCallbackWithResult, CollectionsKt.listOf(new setByteOrder[]{setByteOrder.onNavigationEvent(this.IAuthTabCallback), setByteOrder.onNavigationEvent(this.IAuthTabCallback), setByteOrder.onNavigationEvent(setByteOrder.onExtraCallbackWithResult(this.IAuthTabCallback, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null))}), CollectionsKt.listOf(new Float[]{Float.valueOf(0.0f), Float.valueOf(0.35f), Float.valueOf(1.0f)}), 0, 16, (Object) null);
            int i4 = onNavigationEvent + 13;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return shaderIAuthTabCallback;
        }
    }

    private static final removeObserverLocked onExtraCallback(long j, float f, SessionProcessorCaptureCallback sessionProcessorCaptureCallback) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sessionProcessorCaptureCallback, "");
        final onNavigationEvent onnavigationevent = new onNavigationEvent(j, f);
        removeObserverLocked removeobserverlockedOnExtraCallbackWithResult = sessionProcessorCaptureCallback.onExtraCallbackWithResult(new Function1() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayContentKt$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 99;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = LottieCompositionFactoryExternalSyntheticLambda2.IAuthTabCallback(onnavigationevent, (setOrientationDegrees) obj);
                int i5 = onNavigationEvent + 61;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                throw null;
            }
        });
        int i2 = onExtraCallback + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return removeobserverlockedOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(onNavigationEvent onnavigationevent, setOrientationDegrees setorientationdegrees) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setorientationdegrees, "");
            setOrientationDegrees.IAuthTabCallback(setorientationdegrees, onnavigationevent, 1.0f, 1L, 0.0f, (hasMoreElements) null, (seek) null, 0, 103, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(setorientationdegrees, "");
            setOrientationDegrees.IAuthTabCallback(setorientationdegrees, onnavigationevent, 0.0f, 0L, 0.0f, (hasMoreElements) null, (seek) null, 0, 126, (Object) null);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 79;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(float f, final long j, final float f2, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 47;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(727598243, i, -1, "im.toss.compose.widget.point.overlay.BackgroundGradient.<anonymous>.<anonymous> (PointComponentOverlayContent.kt:264)");
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, f);
        boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(j);
        boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f2);
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((zOnWarmupCompleted | zIAuthTabCallback) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new Function1() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayContentKt$$ExternalSyntheticLambda5
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                public final Object invoke(Object obj) {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallback + 35;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        LottieCompositionFactoryExternalSyntheticLambda2.IAuthTabCallback(j, f2, (SessionProcessorCaptureCallback) obj);
                        throw null;
                    }
                    removeObserverLocked removeobserverlockedIAuthTabCallback = LottieCompositionFactoryExternalSyntheticLambda2.IAuthTabCallback(j, f2, (SessionProcessorCaptureCallback) obj);
                    int i7 = IAuthTabCallback + 79;
                    onExtraCallback = i7 % 128;
                    int i8 = i7 % 2;
                    return removeobserverlockedIAuthTabCallback;
                }
            };
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(SessionProcessorSurface.IAuthTabCallback(quirksExternalSyntheticBackport0IAuthTabCallbackDefault, (Function1) objOnMinimized), cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallback + 85;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i6 = 20 / 0;
            } else {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
            int i7 = IAuthTabCallback + 71;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ boolean $visible;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $visibleState$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(boolean z, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$visible = z;
            this.$visibleState$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$visible, this.$visibleState$delegate, access13800Var);
            int i2 = onExtraCallback + 15;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 49;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnWarmupCompleted;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 9;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 79;
            IAuthTabCallback = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            LottieCompositionFactoryExternalSyntheticLambda2.onExtraCallback(this.$visibleState$delegate, this.$visible);
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallback + 75;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00da  */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v8, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i;
        int i2;
        int i3;
        final long j;
        Object obj;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        Object obj2;
        boolean z;
        long j2;
        Object obj3;
        boolean z2;
        int i4;
        getThumbPosition getthumbpositionOnExtraCallbackWithResult;
        ?? r11;
        Object obj4;
        int i5;
        int i6;
        final boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        final LottieCompositionFactoryExternalSyntheticLambda7 lottieCompositionFactoryExternalSyntheticLambda7 = (LottieCompositionFactoryExternalSyntheticLambda7) objArr[1];
        final float fFloatValue = ((Number) objArr[2]).floatValue();
        long jLongValue = ((Number) objArr[3]).longValue();
        final QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = (QuirksExternalSyntheticBackport0) objArr[4];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        final int iIntValue = ((Number) objArr[6]).intValue();
        int iIntValue2 = ((Number) objArr[7]).intValue();
        int i7 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1949362753);
        if ((iIntValue & 6) == 0) {
            i = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            if ((iIntValue & 64) == 0 ? cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda7) : cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(lottieCompositionFactoryExternalSyntheticLambda7)) {
                int i8 = IAuthTabCallback + 9;
                onExtraCallback = i8 % 128;
                i6 = i8 % 2 != 0 ? 115 : 32;
            } else {
                i6 = 16;
            }
            i |= i6;
        }
        if ((iIntValue & 384) == 0) {
            int i9 = onExtraCallback + 61;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(fFloatValue) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(jLongValue)) {
                int i11 = IAuthTabCallback + 17;
                onExtraCallback = i11 % 128;
                int i12 = i11 % 2;
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i |= i5;
        }
        int i13 = iIntValue2 & 16;
        if (i13 == 0) {
            if ((iIntValue & 24576) == 0) {
                i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onextracallback) ? 16384 : 8192) | i;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 9363) == 9362, i2 & 1)) {
                i3 = iIntValue2;
                j = jLongValue;
                obj = null;
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            } else {
                int i14 = onExtraCallback + 123;
                int i15 = i14 % 128;
                IAuthTabCallback = i15;
                if (i14 % 2 == 0) {
                    throw null;
                }
                if (i13 != 0) {
                    int i16 = i15 + 75;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    onextracallback = QuirksExternalSyntheticBackport0.Companion;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1949362753, i2, -1, "im.toss.compose.widget.point.overlay.BackgroundGradient (PointComponentOverlayContent.kt:222)");
                }
                r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                if ((i2 & 896) == 256) {
                    int i18 = IAuthTabCallback + 13;
                    onExtraCallback = i18 % 128;
                    int i19 = i18 % 2;
                    z = true;
                } else {
                    z = false;
                }
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = Float.valueOf(r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(fFloatValue / 2.0f)));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                final float fFloatValue2 = ((Number) objOnMinimized2).floatValue();
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    i3 = iIntValue2;
                    j2 = jLongValue;
                    getThumbPosition getthumbpositionOnExtraCallbackWithResult2 = onQueryRefine.onExtraCallbackWithResult(3000, 0, new getStarRatingContentViewGroup(200.0d, 40.0d), 2, (Object) null);
                    objOnMinimized3 = ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback(getthumbpositionOnExtraCallbackWithResult2, 0.0f, 2, (Object) null).onNavigationEvent(ResourceManagerInternalVdcInflateDelegate.onExtraCallback(getthumbpositionOnExtraCallbackWithResult2, 0.0f, 0L, 6, (Object) null));
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                } else {
                    j2 = jLongValue;
                    i3 = iIntValue2;
                }
                ResourceManagerInternalResourceManagerHooks resourceManagerInternalResourceManagerHooks = (ResourceManagerInternalResourceManagerHooks) objOnMinimized3;
                boolean z3 = (i2 & 112) == 32 || ((i2 & 64) != 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda7));
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z3 || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    if (Intrinsics.areEqual(lottieCompositionFactoryExternalSyntheticLambda7, LottieCompositionFactoryExternalSyntheticLambda7.onExtraCallback.onExtraCallback)) {
                        obj3 = null;
                        z2 = false;
                        i4 = 2;
                        getthumbpositionOnExtraCallbackWithResult = getSplitTrack.onExtraCallback(getIconContentView.onWarmupCompleted.IAuthTabCallback(), 0, 2, (Object) null);
                    } else {
                        obj3 = null;
                        z2 = false;
                        i4 = 2;
                        getthumbpositionOnExtraCallbackWithResult = onQueryRefine.onExtraCallbackWithResult(500, 0, getCallToActionButton.onExtraCallback.onTransact(), 2, (Object) null);
                    }
                    SearchView searchViewOnWarmupCompleted = ResourceManagerInternalVdcInflateDelegate.onWarmupCompleted(getthumbpositionOnExtraCallbackWithResult, 0.0f, i4, obj3);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(searchViewOnWarmupCompleted);
                    obj4 = searchViewOnWarmupCompleted;
                    r11 = z2;
                } else {
                    r11 = 0;
                    obj4 = objOnMinimized4;
                }
                SearchView searchView = (SearchView) obj4;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackStub = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackStub(onextracallback, fFloatValue);
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), (boolean) r11);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (int) r11));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0IAuthTabCallbackStub);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                j = j2;
                obj = null;
                boolean z4 = true;
                setVerticalGravity.onWarmupCompleted(IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor), (QuirksExternalSyntheticBackport0) null, resourceManagerInternalResourceManagerHooks, searchView, (String) null, ForwardingCameraControl.onExtraCallback(727598243, true, new getBacktraceNote() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayContentKt$$ExternalSyntheticLambda6
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        int i20 = 2 % 2;
                        int i21 = onExtraCallbackWithResult + 103;
                        onWarmupCompleted = i21 % 128;
                        int i22 = i21 % 2;
                        Unit unitOnWarmupCompleted = LottieCompositionFactoryExternalSyntheticLambda2.onWarmupCompleted(fFloatValue, j, fFloatValue2, (setHorizontalGravity) obj5, (CameraCaptureResultEmptyCameraCaptureResult) obj6, ((Integer) obj7).intValue());
                        int i23 = onExtraCallbackWithResult + 107;
                        onWarmupCompleted = i23 % 128;
                        int i24 = i23 % 2;
                        return unitOnWarmupCompleted;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 196992, 18);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                int i20 = i2 & 14;
                if (i20 != 4) {
                    z4 = false;
                }
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!z4) {
                    int i21 = IAuthTabCallback + 81;
                    onExtraCallback = i21 % 128;
                    int i22 = i21 % 2;
                    if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized5 = new IAuthTabCallback(zBooleanValue, getsupportedhighspeedresolutionsfor, null);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(zBooleanValue), (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i20);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i23 = onExtraCallback + 33;
                        IAuthTabCallback = i23 % 128;
                        int i24 = i23 % 2;
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                obj2 = obj;
                final long j3 = j;
                final int i25 = i3;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayContentKt$$ExternalSyntheticLambda7
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke(Object obj5, Object obj6) {
                        int i26 = 2 % 2;
                        int i27 = onExtraCallback + 85;
                        onWarmupCompleted = i27 % 128;
                        int i28 = i27 % 2;
                        Unit unitOnNavigationEvent = LottieCompositionFactoryExternalSyntheticLambda2.onNavigationEvent(zBooleanValue, lottieCompositionFactoryExternalSyntheticLambda7, fFloatValue, j3, onextracallback, iIntValue, i25, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                        int i29 = onWarmupCompleted + 13;
                        onExtraCallback = i29 % 128;
                        if (i29 % 2 == 0) {
                            return unitOnNavigationEvent;
                        }
                        throw null;
                    }
                });
            } else {
                obj2 = obj;
            }
            int i26 = IAuthTabCallback + 37;
            onExtraCallback = i26 % 128;
            int i27 = i26 % 2;
            return obj2;
        }
        i |= 24576;
        i2 = i;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 9363) == 9362, i2 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
        int i262 = IAuthTabCallback + 37;
        onExtraCallback = i262 % 128;
        int i272 = i262 % 2;
        return obj2;
    }

    private static final int onExtraCallback(getTimebase gettimebase) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return gettimebase.onWarmupCompleted();
        }
        gettimebase.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallbackWithResult(getTimebase gettimebase, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 49;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        gettimebase.onExtraCallback(i);
        if (i4 == 0) {
            throw null;
        }
        int i5 = onExtraCallback + 103;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static final boolean IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onExtraCallback + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallback + 19;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallback(LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, float f, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onNavigationEvent(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1626647317, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{lottieDrawableExternalSyntheticLambda1, Float.valueOf(f), Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1626647321);
    }

    private static final void onNavigationEvent(boolean z, LottieCompositionFactoryExternalSyntheticLambda7 lottieCompositionFactoryExternalSyntheticLambda7, float f, long j, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        onNavigationEvent(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1967407688, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{Boolean.valueOf(z), lottieCompositionFactoryExternalSyntheticLambda7, Float.valueOf(f), Long.valueOf(j), quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2)}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1967407687);
    }

    private static final Unit onExtraCallbackWithResult(LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, getBacktraceNote getbacktracenote, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, getBacktraceNote getbacktracenote2, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        return (Unit) onNavigationEvent(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1037444126, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{lottieDrawableExternalSyntheticLambda1, getbacktracenote, quirksExternalSyntheticBackport0, getbacktracenote2, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1037444126);
    }

    private static final Unit onNavigationEvent(float f, getTimebase gettimebase, Futures3 futures3) {
        return (Unit) onNavigationEvent(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1908805883, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{Float.valueOf(f), gettimebase, futures3}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1908805888);
    }

    private static final void onExtraCallbackWithResult(LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, float f, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        onNavigationEvent(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -228305456, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{lottieDrawableExternalSyntheticLambda1, Float.valueOf(f), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 228305458);
    }

    private static final Unit onExtraCallbackWithResult(LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, float f, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        return (Unit) onNavigationEvent(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1834977048, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{lottieDrawableExternalSyntheticLambda1, Float.valueOf(f), Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1834977051);
    }
}
