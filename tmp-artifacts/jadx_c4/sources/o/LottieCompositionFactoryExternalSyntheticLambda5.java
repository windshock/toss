package o;

import android.content.res.Configuration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.common.collect.Synchronized;
import com.horcrux.svg.SvgPackage;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ExtensionsManager1;
import o.LottieCompositionFactoryExternalSyntheticLambda5;
import o.LottieCompositionFactoryExternalSyntheticLambda7;
import o.LottieDrawableExternalSyntheticLambda1;
import o.MaxAppOpenAd;
import o.QuirksExternalSyntheticBackport0;
import o.VirtualCameraCaptureResult;
import o.component4;
import o.component7;
import o.getBacktraceNote;
import o.getStreamSharingChildren;
import o.getSwitchMinWidth;
import o.isContainerClickable;
import o.removeAdapter;
import o.setUseCaseAttached;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LottieCompositionFactoryExternalSyntheticLambda5 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ Unit IAuthTabCallback(Function0 function0, LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, Configuration configuration, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, LottieDrawableExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted, float f, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 5;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function0, lottieDrawableExternalSyntheticLambda1, configuration, getsupportedhighspeedresolutionsfor, onwarmupcompleted, f, getbacktracenote, getbacktracenote2, iscontainerclickable, getswitchminwidth, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 39;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, removeAdapter removeadapter) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(-2009315506, iOnExtraCallbackWithResult, 2009315506, iOnExtraCallbackWithResult2, SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{lottieDrawableExternalSyntheticLambda1, removeadapter});
        int i4 = onExtraCallback + 35;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(getBacktraceNote getbacktracenote, LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, getBacktraceNote getbacktracenote2, LottieDrawableExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws getBacktraceNote {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 5;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(getbacktracenote, lottieDrawableExternalSyntheticLambda1, getbacktracenote2, onwarmupcompleted, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 89;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(getBacktraceNote getbacktracenote, LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, getBacktraceNote getbacktracenote2, LottieDrawableExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws getBacktraceNote {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 45;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return IAuthTabCallback(getbacktracenote, lottieDrawableExternalSyntheticLambda1, getbacktracenote2, onwarmupcompleted, function0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        IAuthTabCallback(getbacktracenote, lottieDrawableExternalSyntheticLambda1, getbacktracenote2, onwarmupcompleted, function0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ component8 onExtraCallback(LottieDrawableExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted, float f, LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, component4 component4Var, component7 component7Var, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        component8 component8VarIAuthTabCallback = IAuthTabCallback(onwarmupcompleted, f, lottieDrawableExternalSyntheticLambda1, getsupportedhighspeedresolutionsfor, component4Var, component7Var, virtualCameraCaptureResult);
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        return component8VarIAuthTabCallback;
    }

    public static final /* synthetic */ void onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor, z);
        int i4 = onExtraCallback + 7;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        ExtensionsManager1 extensionsManager1 = (ExtensionsManager1) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 109;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, extensionsManager1);
        }
        onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, extensionsManager1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, MaxAppOpenAd maxAppOpenAd) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 19;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted(lottieDrawableExternalSyntheticLambda1, maxAppOpenAd);
        }
        onWarmupCompleted(lottieDrawableExternalSyntheticLambda1, maxAppOpenAd);
        throw null;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i3;
        int i8 = ~((~i2) | i7 | i);
        int i9 = (~(i7 | (~i))) | (~(i | i2));
        int i10 = (~(i2 | i3)) | i;
        int i11 = i + i3 + i4 + ((-407681510) * i6) + ((-298114539) * i5);
        int i12 = i11 * i11;
        int i13 = ((-1498977624) * i) + 672923648 + (2103481690 * i3) + (i8 * 346253991) + (346253991 * i9) + ((-346253991) * i10) + ((-1845231616) * i4) + ((-328728576) * i6) + ((-2108424192) * i5) + ((-1296629760) * i12);
        int i14 = ((i * 57881544) - 1472685786) + (i3 * 57881954) + (i8 * (-205)) + (i9 * (-205)) + (i10 * 205) + (i4 * 57881749) + (i6 * 289608994) + (i5 * 969284153) + (i12 * 813891584);
        int i15 = i13 + (i14 * i14 * 454098944);
        if (i15 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i15 == 2) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i15 == 3) {
            getStreamSharingChildren getstreamsharingchildren = (getStreamSharingChildren) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult = (getStreamSharingChildren.onExtraCallbackWithResult) objArr[2];
            int i16 = 2 % 2;
            int i17 = onExtraCallback + 81;
            onNavigationEvent = i17 % 128;
            int i18 = i17 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getstreamsharingchildren, iIntValue, onextracallbackwithresult);
            int i19 = onExtraCallback + 31;
            onNavigationEvent = i19 % 128;
            int i20 = i19 % 2;
            return unitOnExtraCallbackWithResult;
        }
        LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1 = (LottieDrawableExternalSyntheticLambda1) objArr[0];
        removeAdapter removeadapter = (removeAdapter) objArr[1];
        int i21 = 2 % 2;
        int i22 = onNavigationEvent + 39;
        onExtraCallback = i22 % 128;
        int i23 = i22 % 2;
        Intrinsics.checkNotNullParameter(removeadapter, "");
        removeAdapter.IAuthTabCallback(removeadapter, Integer.valueOf(lottieDrawableExternalSyntheticLambda1.onExtraCallback()), (Integer) null, getCallToActionButton.onExtraCallback.onTransact(), 0.0f, 2, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i24 = onNavigationEvent + 19;
        onExtraCallback = i24 % 128;
        int i25 = i24 % 2;
        return unit;
    }

    public static final class onNavigationEvent implements PointerInputEventHandler {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Function0<Unit> onExtraCallback;
        final /* synthetic */ LottieDrawableExternalSyntheticLambda1 onExtraCallbackWithResult;

        onNavigationEvent(Function0<Unit> function0, LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1) {
            this.onExtraCallback = function0;
            this.onExtraCallbackWithResult = lottieDrawableExternalSyntheticLambda1;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, setUseCaseAttached setusecaseattached) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(function0, lottieDrawableExternalSyntheticLambda1, setusecaseattached);
            int i4 = onWarmupCompleted + 13;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitIAuthTabCallback;
        }

        public final Object invoke(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            final Function0<Unit> function0 = this.onExtraCallback;
            final LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1 = this.onExtraCallbackWithResult;
            Object objOnNavigationEvent = Camera2CameraInfoImplExternalSyntheticLambda0.onNavigationEvent(highPriorityExecutor, (Function1) null, (Function1) null, (getBacktraceNote) null, new Function1() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayKt$PointComponentOverlay$1$1$1$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = onExtraCallbackWithResult + 33;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    Unit unitOnExtraCallbackWithResult = LottieCompositionFactoryExternalSyntheticLambda5.onNavigationEvent.onExtraCallbackWithResult(function0, lottieDrawableExternalSyntheticLambda1, (setUseCaseAttached) obj);
                    int i5 = onExtraCallbackWithResult + 9;
                    IAuthTabCallback = i5 % 128;
                    int i6 = i5 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            }, access13800Var, 7, (Object) null);
            if (objOnNavigationEvent != access14300.onWarmupCompleted()) {
                return Unit.INSTANCE;
            }
            int i2 = IAuthTabCallback + 119;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 57;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objOnNavigationEvent;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit IAuthTabCallback(Function0 function0, LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, setUseCaseAttached setusecaseattached) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 29;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 66 / 0;
                if (function0 != null) {
                    function0.invoke();
                    int i4 = IAuthTabCallback + 103;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    lottieDrawableExternalSyntheticLambda1.onNavigationEvent(true);
                }
            } else if (function0 != null) {
            }
            return Unit.INSTANCE;
        }
    }

    private static final Unit onWarmupCompleted(final LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, MaxAppOpenAd maxAppOpenAd) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(maxAppOpenAd, "");
        maxAppOpenAd.onExtraCallbackWithResult(Boolean.FALSE, maxAppOpenAd.IAuthTabCallback(new Function1() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayKt$$ExternalSyntheticLambda6
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 75;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    LottieCompositionFactoryExternalSyntheticLambda5.IAuthTabCallback(lottieDrawableExternalSyntheticLambda1, (removeAdapter) obj);
                    throw null;
                }
                Unit unitIAuthTabCallback = LottieCompositionFactoryExternalSyntheticLambda5.IAuthTabCallback(lottieDrawableExternalSyntheticLambda1, (removeAdapter) obj);
                int i4 = onExtraCallback + 97;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallback;
            }
        }));
        Unit unit = Unit.INSTANCE;
        int i2 = onNavigationEvent + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        return unit;
    }

    private static final component8 IAuthTabCallback(LottieDrawableExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted, float f, LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, component4 component4Var, component7 component7Var, VirtualCameraCaptureResult virtualCameraCaptureResult) {
        float fOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(component4Var, "");
        Intrinsics.checkNotNullParameter(component7Var, "");
        final getStreamSharingChildren getstreamsharingchildrenOnExtraCallback = component7Var.onExtraCallback(virtualCameraCaptureResult.onExtraCallback());
        if (Intrinsics.areEqual(onwarmupcompleted, LottieDrawableExternalSyntheticLambda1.onWarmupCompleted.C0016onWarmupCompleted.onExtraCallback)) {
            int i4 = onExtraCallback + 41;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            fOnWarmupCompleted = (f - ((int) onWarmupCompleted((getSupportedHighSpeedResolutionsFor<ExtensionsManager1>) getsupportedhighspeedresolutionsfor))) / 2.0f;
        } else {
            fOnWarmupCompleted = (f - ((int) (onWarmupCompleted((getSupportedHighSpeedResolutionsFor<ExtensionsManager1>) getsupportedhighspeedresolutionsfor) & 4294967295L))) - lottieDrawableExternalSyntheticLambda1.onWarmupCompleted();
            int i6 = onExtraCallback + 45;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }
        final int i8 = (int) fOnWarmupCompleted;
        return component4.IAuthTabCallback(component4Var, VirtualCameraCaptureResult.asInterface(virtualCameraCaptureResult.onExtraCallback()), VirtualCameraCaptureResult.IAuthTabCallbackDefault(virtualCameraCaptureResult.onExtraCallback()), (Map) null, new Function1() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayKt$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                Unit unit;
                int i9 = 2 % 2;
                int i10 = onNavigationEvent + 43;
                onExtraCallbackWithResult = i10 % 128;
                if (i10 % 2 != 0) {
                    unit = (Unit) LottieCompositionFactoryExternalSyntheticLambda5.onWarmupCompleted(1322360586, SvgPackage.21.onExtraCallbackWithResult(), -1322360583, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), new Object[]{getstreamsharingchildrenOnExtraCallback, Integer.valueOf(i8), (getStreamSharingChildren.onExtraCallbackWithResult) obj});
                    int i11 = 95 / 0;
                } else {
                    getStreamSharingChildren getstreamsharingchildren = getstreamsharingchildrenOnExtraCallback;
                    Integer numValueOf = Integer.valueOf(i8);
                    unit = (Unit) LottieCompositionFactoryExternalSyntheticLambda5.onWarmupCompleted(1322360586, SvgPackage.21.onExtraCallbackWithResult(), -1322360583, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), new Object[]{getstreamsharingchildren, numValueOf, (getStreamSharingChildren.onExtraCallbackWithResult) obj});
                }
                int i12 = onExtraCallbackWithResult + 17;
                onNavigationEvent = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 3 / 0;
                }
                return unit;
            }
        }, 4, (Object) null);
    }

    private static final Unit onExtraCallbackWithResult(getStreamSharingChildren getstreamsharingchildren, int i, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 41;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        getStreamSharingChildren.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, getstreamsharingchildren, 0, i, 0.0f, 4, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallback + 69;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static final Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, ExtensionsManager1 extensionsManager1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Long.valueOf(extensionsManager1.onExtraCallbackWithResult())};
        onWarmupCompleted(-1377322559, SvgPackage.21.onExtraCallbackWithResult(), 1377322560, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), objArr);
        Unit unit = Unit.INSTANCE;
        int i4 = onNavigationEvent + 117;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(Function0 function0, final LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, Configuration configuration, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, final LottieDrawableExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted, final float f, getBacktraceNote getbacktracenote, getBacktraceNote getbacktracenote2, isContainerClickable iscontainerclickable, getSwitchMinWidth getswitchminwidth, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(iscontainerclickable, "");
        Intrinsics.checkNotNullParameter(getswitchminwidth, "");
        if ((i & 6) == 0) {
            int i5 = onExtraCallback + 89;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(iscontainerclickable) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!(!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(getswitchminwidth))) {
                int i7 = onNavigationEvent + 79;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            int i9 = onNavigationEvent;
            int i10 = i9 + 41;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i9 + 15;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1737430340, i2, -1, "im.toss.compose.widget.point.overlay.PointComponentOverlay.<anonymous> (PointComponentOverlay.kt:50)");
            }
            Object obj = null;
            if (((Boolean) getswitchminwidth.IAuthTabCallback()).booleanValue()) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1136545377);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0);
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(lottieDrawableExternalSyntheticLambda1);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((zOnNavigationEvent | zOnNavigationEvent2) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new onNavigationEvent(function0, lottieDrawableExternalSyntheticLambda1);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(SequentialExecutorWorkerRunningState.IAuthTabCallback(onextracallback, function0, (PointerInputEventHandler) objOnMinimized), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor) ? configuration.screenHeightDp : 0.0f));
                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(lottieDrawableExternalSyntheticLambda1);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnNavigationEvent3) {
                    int i14 = onNavigationEvent + 5;
                    onExtraCallback = i14 % 128;
                    if (i14 % 2 == 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        obj.hashCode();
                        throw null;
                    }
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new Function1() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayKt$$ExternalSyntheticLambda1
                            private static int onExtraCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj2) {
                                int i15 = 2 % 2;
                                int i16 = onExtraCallback + 55;
                                onNavigationEvent = i16 % 128;
                                int i17 = i16 % 2;
                                LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda12 = lottieDrawableExternalSyntheticLambda1;
                                MaxAppOpenAd maxAppOpenAd = (MaxAppOpenAd) obj2;
                                if (i17 != 0) {
                                    return LottieCompositionFactoryExternalSyntheticLambda5.onNavigationEvent(lottieDrawableExternalSyntheticLambda12, maxAppOpenAd);
                                }
                                LottieCompositionFactoryExternalSyntheticLambda5.onNavigationEvent(lottieDrawableExternalSyntheticLambda12, maxAppOpenAd);
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = iscontainerclickable.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback, getswitchminwidth, (Function1) objOnMinimized2);
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.IAuthTabCallback_Parcel(), false);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        int i15 = onExtraCallback + 39;
                        onNavigationEvent = i15 % 128;
                        int i16 = i15 % 2;
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                    if (objOnMinimized3 == onwarmupcompleted2.onExtraCallback()) {
                        objOnMinimized3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(ExtensionsManager1.onNavigationEvent(ExtensionsManager1.Companion.onNavigationEvent()), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                    }
                    final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized3;
                    boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(onwarmupcompleted);
                    boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(f);
                    boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(lottieDrawableExternalSyntheticLambda1);
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if ((zOnNavigationEvent4 | zIAuthTabCallback | zOnNavigationEvent5) || objOnMinimized4 == onwarmupcompleted2.onExtraCallback()) {
                        objOnMinimized4 = new getBacktraceNote() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayKt$$ExternalSyntheticLambda2
                            private static int onExtraCallbackWithResult = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                int i17 = 2 % 2;
                                int i18 = onNavigationEvent + 21;
                                onExtraCallbackWithResult = i18 % 128;
                                if (i18 % 2 != 0) {
                                    return LottieCompositionFactoryExternalSyntheticLambda5.onExtraCallback(onwarmupcompleted, f, lottieDrawableExternalSyntheticLambda1, getsupportedhighspeedresolutionsfor2, (component4) obj2, (component7) obj3, (VirtualCameraCaptureResult) obj4);
                                }
                                LottieCompositionFactoryExternalSyntheticLambda5.onExtraCallback(onwarmupcompleted, f, lottieDrawableExternalSyntheticLambda1, getsupportedhighspeedresolutionsfor2, (component4) obj2, (component7) obj3, (VirtualCameraCaptureResult) obj4);
                                Object obj5 = null;
                                obj5.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = ListFuture2.onWarmupCompleted(onextracallback, (getBacktraceNote) objOnMinimized4);
                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized5 == onwarmupcompleted2.onExtraCallback()) {
                        objOnMinimized5 = new Function1() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayKt$$ExternalSyntheticLambda3
                            private static int IAuthTabCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            public final Object invoke(Object obj2) {
                                int i17 = 2 % 2;
                                int i18 = onExtraCallbackWithResult + 19;
                                IAuthTabCallback = i18 % 128;
                                int i19 = i18 % 2;
                                Object[] objArr = {getsupportedhighspeedresolutionsfor2, (ExtensionsManager1) obj2};
                                int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
                                int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
                                int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
                                int iOnExtraCallbackWithResult4 = SvgPackage.21.onExtraCallbackWithResult();
                                if (i19 == 0) {
                                    return (Unit) LottieCompositionFactoryExternalSyntheticLambda5.onWarmupCompleted(-1167063317, iOnExtraCallbackWithResult, 1167063319, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, objArr);
                                }
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                    }
                    LottieCompositionFactoryExternalSyntheticLambda2.onWarmupCompleted(lottieDrawableExternalSyntheticLambda1, getbacktracenote, calculatePlaceholderForExtensions.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnWarmupCompleted2, (Function1) objOnMinimized5), getbacktracenote2, cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        int i17 = onExtraCallback + 119;
                        onNavigationEvent = i17 % 128;
                        if (i17 % 2 != 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            int i18 = 80 / 0;
                        } else {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                    }
                }
            } else {
                int i19 = onExtraCallback + 13;
                onNavigationEvent = i19 % 128;
                if (i19 % 2 != 0) {
                    ((Boolean) getswitchminwidth.access000()).booleanValue();
                    throw null;
                }
                if (!((Boolean) getswitchminwidth.access000()).booleanValue()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1138756638);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $isOverlayVisible$delegate;
        final /* synthetic */ LottieDrawableExternalSyntheticLambda1 $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$state = lottieDrawableExternalSyntheticLambda1;
            this.$isOverlayVisible$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$state, this.$isOverlayVisible$delegate, access13800Var);
            iAuthTabCallback.L$0 = obj;
            int i2 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 55;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 99;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 26 / 0;
            return iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 7;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (this.$state.onNavigationEvent()) {
                LottieCompositionFactoryExternalSyntheticLambda5.onExtraCallback((getSupportedHighSpeedResolutionsFor) this.$isOverlayVisible$delegate, true);
                int i3 = IAuthTabCallback + 121;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 5 % 5;
                }
            } else {
                maybeUpdateAnimatable.onNavigationEvent(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass5(this.$state, this.$isOverlayVisible$delegate, null), 3, (Object) null);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: o.LottieCompositionFactoryExternalSyntheticLambda5$IAuthTabCallback$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $isOverlayVisible$delegate;
            final /* synthetic */ LottieDrawableExternalSyntheticLambda1 $state;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.$state = lottieDrawableExternalSyntheticLambda1;
                this.$isOverlayVisible$delegate = getsupportedhighspeedresolutionsfor;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$state, this.$isOverlayVisible$delegate, access13800Var);
                int i2 = IAuthTabCallback + 63;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass5;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 77;
                IAuthTabCallback = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    return onWarmupCompleted(findresandmsg, access13800Var);
                }
                onWarmupCompleted(findresandmsg, access13800Var);
                throw null;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 43;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass5 anonymousClass5Create = create(findresandmsg, access13800Var);
                if (i3 == 0) {
                    return anonymousClass5Create.invokeSuspend(Unit.INSTANCE);
                }
                anonymousClass5Create.invokeSuspend(Unit.INSTANCE);
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 21;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    access14300.onWarmupCompleted();
                    throw null;
                }
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i3 = this.label;
                try {
                    if (i3 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        long jOnExtraCallback = this.$state.onExtraCallback();
                        this.label = 1;
                        if (formatMsgs.onWarmupCompleted(jOnExtraCallback, this) == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.onNavigationEvent(obj);
                        int i4 = IAuthTabCallback + 103;
                        onNavigationEvent = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    LottieCompositionFactoryExternalSyntheticLambda5.onExtraCallback((getSupportedHighSpeedResolutionsFor) this.$isOverlayVisible$delegate, false);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    LottieCompositionFactoryExternalSyntheticLambda5.onExtraCallback((getSupportedHighSpeedResolutionsFor) this.$isOverlayVisible$delegate, false);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.getBacktraceNote<? super o.LottieDrawableExternalSyntheticLambda14, ? super o.CameraCaptureResultEmptyCameraCaptureResult, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull final getBacktraceNote<? super LottieCompositionFactoryExternalSyntheticLambda3, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @Nullable LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, @Nullable getBacktraceNote<? super LottieDrawableExternalSyntheticLambda14, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote2, @Nullable LottieDrawableExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws getBacktraceNote {
        int i3;
        LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda12;
        LottieDrawableExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted2;
        int i4;
        getBacktraceNote<? super LottieDrawableExternalSyntheticLambda14, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote3;
        int i5;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final getBacktraceNote<? super LottieDrawableExternalSyntheticLambda14, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote4;
        final getBacktraceNote<? super LottieDrawableExternalSyntheticLambda14, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote5;
        final LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda13;
        final LottieDrawableExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted3;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1OnExtraCallback;
        getBacktraceNote<? super LottieDrawableExternalSyntheticLambda14, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote6;
        getBacktraceNote<? super LottieDrawableExternalSyntheticLambda14, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote7;
        int i6;
        LottieDrawableExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted4;
        LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda14;
        getBacktraceNote<? super LottieDrawableExternalSyntheticLambda14, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote8;
        int i7;
        int i8;
        getBacktraceNote<? super LottieDrawableExternalSyntheticLambda14, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote9 = getbacktracenote2;
        int i9 = 2 % 2;
        int i10 = onExtraCallback + 109;
        onNavigationEvent = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1861464294);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote)) {
                i8 = 4;
            } else {
                int i12 = onNavigationEvent + 87;
                onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
                i8 = 2;
            }
            i3 = i8 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                int i14 = onExtraCallback + 37;
                onNavigationEvent = i14 % 128;
                int i15 = i14 % 2;
                lottieDrawableExternalSyntheticLambda12 = lottieDrawableExternalSyntheticLambda1;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(lottieDrawableExternalSyntheticLambda12)) {
                    int i16 = onNavigationEvent + 107;
                    onExtraCallback = i16 % 128;
                    int i17 = i16 % 2;
                    i7 = 32;
                }
                i3 |= i7;
            } else {
                lottieDrawableExternalSyntheticLambda12 = lottieDrawableExternalSyntheticLambda1;
            }
            i7 = 16;
            i3 |= i7;
        } else {
            lottieDrawableExternalSyntheticLambda12 = lottieDrawableExternalSyntheticLambda1;
        }
        int i18 = i2 & 4;
        getBacktraceNote<? super LottieDrawableExternalSyntheticLambda14, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote10 = null;
        if (i18 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            int i19 = onNavigationEvent + 105;
            onExtraCallback = i19 % 128;
            if (i19 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote9);
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote9) ? 256 : 128;
        }
        int i20 = i2 & 8;
        if (i20 == 0) {
            if ((i & 3072) == 0) {
                onwarmupcompleted2 = onwarmupcompleted;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onwarmupcompleted2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
                getbacktracenote3 = function0;
            } else {
                getbacktracenote3 = function0;
                if ((i & 24576) == 0) {
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote3)) {
                        i5 = 16384;
                    } else {
                        int i21 = onExtraCallback + 41;
                        onNavigationEvent = i21 % 128;
                        int i22 = i21 % 2;
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                getbacktracenote4 = function0;
                getbacktracenote5 = getbacktracenote9;
                lottieDrawableExternalSyntheticLambda13 = lottieDrawableExternalSyntheticLambda12;
                onwarmupcompleted3 = onwarmupcompleted;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                    if ((i2 & 2) != 0) {
                        int i23 = onNavigationEvent + 5;
                        onExtraCallback = i23 % 128;
                        if (i23 % 2 == 0) {
                            getbacktracenote8 = null;
                            lottieDrawableExternalSyntheticLambda1OnExtraCallback = LottieCompositionFactoryExternalSyntheticLambda9.onExtraCallback(LottieCompositionFactoryExternalSyntheticLambda7.onWarmupCompleted.onExtraCallback, 0, false, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 111, 8);
                            i3 &= 125;
                        } else {
                            getbacktracenote8 = null;
                            lottieDrawableExternalSyntheticLambda1OnExtraCallback = LottieCompositionFactoryExternalSyntheticLambda9.onExtraCallback(LottieCompositionFactoryExternalSyntheticLambda7.onWarmupCompleted.onExtraCallback, 0, false, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6, 14);
                            i3 &= -113;
                        }
                        getbacktracenote10 = getbacktracenote8;
                    } else {
                        lottieDrawableExternalSyntheticLambda1OnExtraCallback = lottieDrawableExternalSyntheticLambda12;
                    }
                    if (i18 != 0) {
                        getbacktracenote9 = getbacktracenote10;
                    }
                    LottieDrawableExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted5 = i20 != 0 ? LottieDrawableExternalSyntheticLambda1.onWarmupCompleted.C0016onWarmupCompleted.onExtraCallback : onwarmupcompleted;
                    if (i4 != 0) {
                        int i24 = onExtraCallback + 113;
                        onNavigationEvent = i24 % 128;
                        if (i24 % 2 != 0) {
                            int i25 = 32 / 0;
                        }
                        getbacktracenote7 = getbacktracenote9;
                        i6 = i3;
                        onwarmupcompleted4 = onwarmupcompleted5;
                        lottieDrawableExternalSyntheticLambda14 = lottieDrawableExternalSyntheticLambda1OnExtraCallback;
                        getbacktracenote6 = getbacktracenote10;
                    } else {
                        getbacktracenote6 = function0;
                        getbacktracenote7 = getbacktracenote9;
                        i6 = i3;
                        onwarmupcompleted4 = onwarmupcompleted5;
                        lottieDrawableExternalSyntheticLambda14 = lottieDrawableExternalSyntheticLambda1OnExtraCallback;
                    }
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    getbacktracenote7 = getbacktracenote9;
                    getbacktracenote6 = getbacktracenote3;
                    onwarmupcompleted4 = onwarmupcompleted2;
                    i6 = i3;
                    lottieDrawableExternalSyntheticLambda14 = lottieDrawableExternalSyntheticLambda12;
                }
                int i26 = onExtraCallback + 37;
                onNavigationEvent = i26 % 128;
                if (i26 % 2 != 0) {
                    getBacktraceNote<? super LottieDrawableExternalSyntheticLambda14, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote11 = getbacktracenote10;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                    CameraConfigExternalSyntheticLambda0.asBinder();
                    throw getbacktracenote11;
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1861464294, i6, -1, "im.toss.compose.widget.point.overlay.PointComponentOverlay (PointComponentOverlay.kt:39)");
                }
                r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
                final Configuration configuration = (Configuration) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult());
                final float fOnExtraCallback = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(configuration.screenHeightDp));
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted6 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted6.onExtraCallback()) {
                    objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, getbacktracenote10, 2, getbacktracenote10);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
                boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
                final getBacktraceNote<? super LottieDrawableExternalSyntheticLambda14, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote12 = getbacktracenote6;
                final LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda15 = lottieDrawableExternalSyntheticLambda14;
                final LottieDrawableExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted7 = onwarmupcompleted4;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                final getBacktraceNote<? super LottieDrawableExternalSyntheticLambda14, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote13 = getbacktracenote7;
                EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxyOnExtraCallback = ForwardingCameraControl.onExtraCallback(1737430340, true, new setTaggedAddrCtrl() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayKt$$ExternalSyntheticLambda4
                    private static int IAuthTabCallback = 0;
                    private static int onExtraCallbackWithResult = 1;

                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws Throwable {
                        int i27 = 2 % 2;
                        int i28 = onExtraCallbackWithResult + 115;
                        IAuthTabCallback = i28 % 128;
                        int i29 = i28 % 2;
                        Unit unitIAuthTabCallback = LottieCompositionFactoryExternalSyntheticLambda5.IAuthTabCallback(getbacktracenote12, lottieDrawableExternalSyntheticLambda15, configuration, getsupportedhighspeedresolutionsfor, onwarmupcompleted7, fOnExtraCallback, getbacktracenote, getbacktracenote13, (isContainerClickable) obj, (getSwitchMinWidth) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                        int i30 = IAuthTabCallback + 33;
                        onExtraCallbackWithResult = i30 % 128;
                        int i31 = i30 % 2;
                        return unitIAuthTabCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult2, 54);
                boolean z = true;
                int i27 = i6;
                lottieDrawableExternalSyntheticLambda13 = lottieDrawableExternalSyntheticLambda14;
                MaxNativeAdBuilder.onNavigationEvent(Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), new Object[]{Boolean.valueOf(zOnExtraCallbackWithResult), null, 0, 0, encoderProfilesProxyVideoProfileProxyOnExtraCallback, cameraCaptureResultEmptyCameraCaptureResult2, 24576, 14}, 1823154464, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1823154460);
                boolean zOnNavigationEvent = lottieDrawableExternalSyntheticLambda13.onNavigationEvent();
                if ((((i27 & 112) ^ 48) <= 32 || !cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(lottieDrawableExternalSyntheticLambda13)) && (i27 & 48) != 32) {
                    z = false;
                }
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if (z || objOnMinimized2 == onwarmupcompleted6.onExtraCallback()) {
                    objOnMinimized2 = new IAuthTabCallback(lottieDrawableExternalSyntheticLambda13, getsupportedhighspeedresolutionsfor, null);
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized2);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(Boolean.valueOf(zOnNavigationEvent), (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult2, 0);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                getbacktracenote5 = getbacktracenote7;
                onwarmupcompleted3 = onwarmupcompleted4;
                getbacktracenote4 = getbacktracenote6;
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.compose.widget.point.overlay.PointComponentOverlayKt$$ExternalSyntheticLambda5
                    private static int IAuthTabCallback = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj, Object obj2) throws getBacktraceNote {
                        int i28 = 2 % 2;
                        int i29 = onNavigationEvent + 45;
                        IAuthTabCallback = i29 % 128;
                        int i30 = i29 % 2;
                        Unit unitOnExtraCallback = LottieCompositionFactoryExternalSyntheticLambda5.onExtraCallback(getbacktracenote, lottieDrawableExternalSyntheticLambda13, getbacktracenote5, onwarmupcompleted3, getbacktracenote4, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                        int i31 = IAuthTabCallback + 49;
                        onNavigationEvent = i31 % 128;
                        int i32 = i31 % 2;
                        return unitOnExtraCallback;
                    }
                });
                return;
            }
            return;
        }
        int i28 = onNavigationEvent + 29;
        onExtraCallback = i28 % 128;
        int i29 = i28 % 2;
        i3 |= 3072;
        onwarmupcompleted2 = onwarmupcompleted;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 9363) == 9362, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final long onWarmupCompleted(getSupportedHighSpeedResolutionsFor<ExtensionsManager1> getsupportedhighspeedresolutionsfor) {
        long jOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        ExtensionsManager1 extensionsManager1 = (ExtensionsManager1) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            jOnExtraCallbackWithResult = extensionsManager1.onExtraCallbackWithResult();
            int i4 = 3 / 0;
        } else {
            jOnExtraCallbackWithResult = extensionsManager1.onExtraCallbackWithResult();
        }
        int i5 = onExtraCallback + 55;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return jOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(ExtensionsManager1.onNavigationEvent(jLongValue));
        int i4 = onNavigationEvent + 1;
        onExtraCallback = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final boolean onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = onExtraCallback + 7;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onNavigationEvent + 67;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, ExtensionsManager1 extensionsManager1) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(-1167063317, iOnExtraCallbackWithResult, 1167063319, iOnExtraCallbackWithResult2, SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{getsupportedhighspeedresolutionsfor, extensionsManager1});
    }

    public static /* synthetic */ Unit onNavigationEvent(getStreamSharingChildren getstreamsharingchildren, int i, getStreamSharingChildren.onExtraCallbackWithResult onextracallbackwithresult) {
        Object[] objArr = {getstreamsharingchildren, Integer.valueOf(i), onextracallbackwithresult};
        return (Unit) onWarmupCompleted(1322360586, SvgPackage.21.onExtraCallbackWithResult(), -1322360583, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), objArr);
    }

    private static final Unit onExtraCallback(LottieDrawableExternalSyntheticLambda1 lottieDrawableExternalSyntheticLambda1, removeAdapter removeadapter) {
        int iOnExtraCallbackWithResult = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = SvgPackage.21.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = SvgPackage.21.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(-2009315506, iOnExtraCallbackWithResult, 2009315506, iOnExtraCallbackWithResult2, SvgPackage.21.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{lottieDrawableExternalSyntheticLambda1, removeadapter});
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<ExtensionsManager1> getsupportedhighspeedresolutionsfor, long j) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Long.valueOf(j)};
        onWarmupCompleted(-1377322559, SvgPackage.21.onExtraCallbackWithResult(), 1377322560, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult(), objArr);
    }
}
