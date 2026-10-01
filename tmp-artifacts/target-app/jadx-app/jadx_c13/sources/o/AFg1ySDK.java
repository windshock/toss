package o;

import android.content.res.Resources;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt___RangesKt;
import o.AFg1ySDK;
import o.onItemSelected;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFg1ySDK {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static final float IAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2500.0f);
    private static final float onWarmupCompleted = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1500.0f);
    private static final float onNavigationEvent = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(50.0f);

    static final class onExtraCallback extends ContinuationImpl {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        float F$0;
        float F$1;
        float F$2;
        float F$3;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = i3 == 0 ? AFg1ySDK.onNavigationEvent((getMaxImages) null, 0, 1, this) : AFg1ySDK.onNavigationEvent((getMaxImages) null, 0, 0, this);
            int i4 = onExtraCallbackWithResult + 85;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            obj2.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(float f, Ref.FloatRef floatRef, getMaxImages getmaximages, onItemSelected onitemselected) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(f, floatRef, getmaximages, onitemselected);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(f, floatRef, getmaximages, onitemselected);
        int i3 = onExtraCallbackWithResult + 31;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(getMaxImages getmaximages, int i, float f, Ref.FloatRef floatRef, Ref.BooleanRef booleanRef, boolean z, float f2, Ref.IntRef intRef, float f3, int i2, float f4, Ref.ObjectRef objectRef, onItemSelected onitemselected) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getmaximages, i, f, floatRef, booleanRef, z, f2, intRef, f3, i2, f4, objectRef, onitemselected);
        int i6 = onExtraCallback + 35;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 86 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    private static final boolean onExtraCallbackWithResult(boolean z, getMaxImages getmaximages, int i, int i2) {
        int i3 = 2 % 2;
        if (!z) {
            if (getmaximages.onWarmupCompleted() >= i) {
                return getmaximages.onWarmupCompleted() == i && getmaximages.onExtraCallbackWithResult() < i2;
            }
            int i4 = onExtraCallback + 109;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = onExtraCallback + 39;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            if (getmaximages.onWarmupCompleted() <= i) {
                return getmaximages.onWarmupCompleted() == i && getmaximages.onExtraCallbackWithResult() > i2;
            }
            int i7 = onExtraCallback + 3;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return true;
        }
        getmaximages.onWarmupCompleted();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(getMaxImages getmaximages, int i, float f, Ref.FloatRef floatRef, Ref.BooleanRef booleanRef, boolean z, float f2, Ref.IntRef intRef, float f3, int i2, float f4, Ref.ObjectRef objectRef, onItemSelected onitemselected) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(onitemselected, "");
        getmaximages.onWarmupCompleted();
        if (!IAuthTabCallback(getmaximages, i)) {
            float fCoerceAtMost = (f > 0.0f ? RangesKt___RangesKt.coerceAtMost(((Number) onitemselected.onExtraCallback()).floatValue(), f) : RangesKt___RangesKt.coerceAtLeast(((Number) onitemselected.onExtraCallback()).floatValue(), f)) - floatRef.element;
            float fA_ = getmaximages.a_(fCoerceAtMost);
            if (!IAuthTabCallback(getmaximages, i) && !onExtraCallbackWithResult(z, getmaximages, i, i2)) {
                if (fCoerceAtMost != fA_) {
                    onitemselected.IAuthTabCallback();
                    booleanRef.element = false;
                    return Unit.INSTANCE;
                }
                floatRef.element += fCoerceAtMost;
                if (z) {
                    int i4 = onExtraCallback + 97;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 66 / 0;
                        if (((Number) onitemselected.onExtraCallback()).floatValue() > f2) {
                            onitemselected.IAuthTabCallback();
                        }
                    } else if (((Number) onitemselected.onExtraCallback()).floatValue() > f2) {
                    }
                } else if (((Number) onitemselected.onExtraCallback()).floatValue() < (-f2)) {
                    onitemselected.IAuthTabCallback();
                }
                if (!z) {
                    if (intRef.element < 2 || getmaximages.onWarmupCompleted() - i <= 100) {
                        int i6 = onExtraCallbackWithResult + 101;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                    } else {
                        getmaximages.onExtraCallback(i + 100, 0);
                    }
                    if (Math.abs(f) < f3) {
                        float fOnWarmupCompleted = getMaxImages.onWarmupCompleted(getmaximages, i, 0, 2, (Object) null) + i2;
                        float f5 = f - floatRef.element;
                        if (z) {
                            int i8 = onExtraCallback + 57;
                            int i9 = i8 % 128;
                            onExtraCallbackWithResult = i9;
                            if (i8 % 2 != 0 ? fOnWarmupCompleted > 0.0f : fOnWarmupCompleted > 1.0f) {
                                int i10 = i9 + 79;
                                onExtraCallback = i10 % 128;
                                int i11 = i10 % 2;
                                if (Math.abs(fOnWarmupCompleted) > Math.abs(f5) + f4) {
                                    onitemselected.IAuthTabCallback();
                                }
                            }
                        } else if (fOnWarmupCompleted < 0.0f) {
                            if (Math.abs(fOnWarmupCompleted) > Math.abs(f5) + f4) {
                            }
                        }
                    }
                } else {
                    if (intRef.element >= 2 && i - getmaximages.onNavigationEvent() > 100) {
                        int i12 = onExtraCallback + 113;
                        onExtraCallbackWithResult = i12 % 128;
                        int i13 = i12 % 2;
                        getmaximages.onExtraCallback(i - 100, 0);
                    }
                    if (Math.abs(f) < f3) {
                    }
                }
            }
        }
        if (!onExtraCallbackWithResult(z, getmaximages, i, i2)) {
            if (IAuthTabCallback(getmaximages, i)) {
                throw new AFg1ySDKAFa1tSDK(getMaxImages.onWarmupCompleted(getmaximages, i, 0, 2, (Object) null), (onTextFocusChanged) objectRef.element);
            }
            return Unit.INSTANCE;
        }
        getmaximages.onWarmupCompleted();
        getmaximages.onExtraCallbackWithResult();
        getmaximages.onExtraCallback(i, i2);
        booleanRef.element = false;
        onitemselected.IAuthTabCallback();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(float f, Ref.FloatRef floatRef, getMaxImages getmaximages, onItemSelected onitemselected) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onitemselected, "");
        float fCoerceAtLeast = 0.0f;
        Object obj = null;
        if (f > 0.0f) {
            int i2 = onExtraCallbackWithResult + 107;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                RangesKt___RangesKt.coerceAtMost(((Number) onitemselected.onExtraCallback()).floatValue(), f);
                obj.hashCode();
                throw null;
            }
            fCoerceAtLeast = RangesKt___RangesKt.coerceAtMost(((Number) onitemselected.onExtraCallback()).floatValue(), f);
        } else if (f < 0.0f) {
            fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(((Number) onitemselected.onExtraCallback()).floatValue(), f);
        } else {
            int i3 = onExtraCallback + 69;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
        float f2 = fCoerceAtLeast - floatRef.element;
        if (f2 == getmaximages.a_(f2)) {
            int i5 = onExtraCallbackWithResult + 59;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0) {
                ((Number) onitemselected.onExtraCallback()).floatValue();
                throw null;
            }
            if (fCoerceAtLeast != ((Number) onitemselected.onExtraCallback()).floatValue()) {
                onitemselected.IAuthTabCallback();
            }
        }
        floatRef.element += f2;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0103 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0105 A[Catch: AFg1ySDKAFa1tSDK -> 0x020d, TryCatch #2 {AFg1ySDKAFa1tSDK -> 0x020d, blocks: (B:29:0x00ff, B:32:0x0105, B:34:0x010b, B:44:0x012e), top: B:102:0x00ff }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02bf  */
    /* JADX WARN: Type inference failed for: r11v0, types: [T, o.onTextFocusChanged] */
    /* JADX WARN: Type inference failed for: r7v7, types: [T, o.onTextFocusChanged] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01e7 -> B:104:0x01f0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onNavigationEvent(@NotNull getMaxImages getmaximages, int i, int i2, @NotNull access13800<? super Unit> access13800Var) {
        onExtraCallback onextracallback;
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4OnExtraCallbackWithResult;
        final getMaxImages getmaximages2;
        boolean z;
        onExtraCallback onextracallback2;
        int i3;
        float fOnExtraCallback;
        float fOnExtraCallback2;
        float fOnExtraCallback3;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        int i4;
        boolean z2;
        Ref.ObjectRef objectRef2;
        Ref.IntRef intRef;
        float f;
        float f2;
        float f3;
        int i5;
        onExtraCallback onextracallback3;
        getMaxImages getmaximages3;
        onTextFocusChanged ontextfocuschangedOnExtraCallbackWithResult;
        Float fOnExtraCallbackWithResult;
        Function1 function1;
        int i6;
        int i7;
        getMaxImages getmaximages4;
        getMaxImages getmaximages5;
        float fMax;
        Object obj;
        int i8 = i;
        int i9 = 2 % 2;
        int i10 = onExtraCallback + 81;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i12 = onextracallback.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i12 - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object obj2 = onextracallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i13 = onextracallback.label;
        Object obj3 = null;
        if (i13 == 0) {
            ResultKt.onNavigationEvent(obj2);
            r8lambdanm9dm2eewl4vrptnjmesfjqky4OnExtraCallbackWithResult = VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(Resources.getSystem().getDisplayMetrics().density, 0.0f, 2, (Object) null);
            try {
                fOnExtraCallback = r8lambdanm9dm2eewl4vrptnjmesfjqky4OnExtraCallbackWithResult.onExtraCallback(IAuthTabCallback);
                fOnExtraCallback2 = r8lambdanm9dm2eewl4vrptnjmesfjqky4OnExtraCallbackWithResult.onExtraCallback(onWarmupCompleted);
                fOnExtraCallback3 = r8lambdanm9dm2eewl4vrptnjmesfjqky4OnExtraCallbackWithResult.onExtraCallback(onNavigationEvent);
                booleanRef = new Ref.BooleanRef();
                booleanRef.element = true;
                objectRef = new Ref.ObjectRef();
                objectRef.element = onSearchClicked.onNavigationEvent(0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
            } catch (AFg1ySDKAFa1tSDK e) {
                e = e;
                getmaximages2 = getmaximages;
                z = false;
            }
            if (IAuthTabCallback(getmaximages, i)) {
                getmaximages2 = getmaximages;
                z = false;
                try {
                    throw new AFg1ySDKAFa1tSDK(getMaxImages.onWarmupCompleted(getmaximages2, i8, 0, 2, (Object) null), (onTextFocusChanged) objectRef.element);
                } catch (AFg1ySDKAFa1tSDK e2) {
                    e = e2;
                    onextracallback2 = onextracallback;
                    i3 = i2;
                    ontextfocuschangedOnExtraCallbackWithResult = onSearchClicked.onExtraCallbackWithResult(e.onExtraCallback(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                    final float fIAuthTabCallback = e.IAuthTabCallback() + i3;
                    final Ref.FloatRef floatRef = new Ref.FloatRef();
                    Objects.toString(e.onExtraCallback().IAuthTabCallback());
                    fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(fIAuthTabCallback);
                    if (((Number) ontextfocuschangedOnExtraCallbackWithResult.IAuthTabCallback()).floatValue() == 0.0f) {
                    }
                    function1 = new Function1() { // from class: im.toss.tosssecurities.uikit.lazyliststate.animatescrolltoitem.AnimateScrollToItemSpringKt$$ExternalSyntheticLambda1
                        private static int onExtraCallbackWithResult = 0;
                        private static int onWarmupCompleted = 1;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            int i14 = 2 % 2;
                            int i15 = onExtraCallbackWithResult + 23;
                            onWarmupCompleted = i15 % 128;
                            int i16 = i15 % 2;
                            float f4 = fIAuthTabCallback;
                            if (i16 != 0) {
                                return AFg1ySDK.onNavigationEvent(f4, floatRef, getmaximages2, (onItemSelected) obj4);
                            }
                            AFg1ySDK.onNavigationEvent(f4, floatRef, getmaximages2, (onItemSelected) obj4);
                            Object obj5 = null;
                            obj5.hashCode();
                            throw null;
                        }
                    };
                    onextracallback2.L$0 = getmaximages2;
                    onextracallback2.L$1 = access15400.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4OnExtraCallbackWithResult);
                    onextracallback2.L$2 = access15400.onNavigationEvent(e);
                    onextracallback2.L$3 = access15400.onNavigationEvent(ontextfocuschangedOnExtraCallbackWithResult);
                    onextracallback2.L$4 = access15400.onNavigationEvent(floatRef);
                    onextracallback2.L$5 = null;
                    onextracallback2.I$0 = i8;
                    onextracallback2.I$1 = i3;
                    onextracallback2.F$0 = fIAuthTabCallback;
                    onextracallback2.label = 2;
                    if (getShowText.IAuthTabCallback(ontextfocuschangedOnExtraCallbackWithResult, fOnExtraCallbackWithResult, (onItemClicked) null, !z, function1, onextracallback2, 2, (Object) null) != objOnExtraCallback) {
                    }
                    return objOnExtraCallback;
                }
            }
            try {
                i4 = i8 > getmaximages.onWarmupCompleted() ? 1 : 0;
                Ref.IntRef intRef2 = new Ref.IntRef();
                z2 = true;
                intRef2.element = 1;
                objectRef2 = objectRef;
                intRef = intRef2;
                f = fOnExtraCallback;
                f2 = fOnExtraCallback2;
                f3 = fOnExtraCallback3;
                i5 = i8;
                onextracallback3 = onextracallback;
                getmaximages3 = getmaximages;
                i3 = i2;
                if (booleanRef.element != z2) {
                }
            } catch (AFg1ySDKAFa1tSDK e3) {
                e = e3;
                getmaximages2 = getmaximages;
                onextracallback2 = onextracallback;
                z = false;
                i3 = i2;
                ontextfocuschangedOnExtraCallbackWithResult = onSearchClicked.onExtraCallbackWithResult(e.onExtraCallback(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                final float fIAuthTabCallback2 = e.IAuthTabCallback() + i3;
                final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                Objects.toString(e.onExtraCallback().IAuthTabCallback());
                fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(fIAuthTabCallback2);
                if (((Number) ontextfocuschangedOnExtraCallbackWithResult.IAuthTabCallback()).floatValue() == 0.0f) {
                }
                function1 = new Function1() { // from class: im.toss.tosssecurities.uikit.lazyliststate.animatescrolltoitem.AnimateScrollToItemSpringKt$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i14 = 2 % 2;
                        int i15 = onExtraCallbackWithResult + 23;
                        onWarmupCompleted = i15 % 128;
                        int i16 = i15 % 2;
                        float f4 = fIAuthTabCallback2;
                        if (i16 != 0) {
                            return AFg1ySDK.onNavigationEvent(f4, floatRef2, getmaximages2, (onItemSelected) obj4);
                        }
                        AFg1ySDK.onNavigationEvent(f4, floatRef2, getmaximages2, (onItemSelected) obj4);
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                };
                onextracallback2.L$0 = getmaximages2;
                onextracallback2.L$1 = access15400.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4OnExtraCallbackWithResult);
                onextracallback2.L$2 = access15400.onNavigationEvent(e);
                onextracallback2.L$3 = access15400.onNavigationEvent(ontextfocuschangedOnExtraCallbackWithResult);
                onextracallback2.L$4 = access15400.onNavigationEvent(floatRef2);
                onextracallback2.L$5 = null;
                onextracallback2.I$0 = i8;
                onextracallback2.I$1 = i3;
                onextracallback2.F$0 = fIAuthTabCallback2;
                onextracallback2.label = 2;
                if (getShowText.IAuthTabCallback(ontextfocuschangedOnExtraCallbackWithResult, fOnExtraCallbackWithResult, (onItemClicked) null, !z, function1, onextracallback2, 2, (Object) null) != objOnExtraCallback) {
                }
                return objOnExtraCallback;
            }
            return Unit.INSTANCE;
        }
        if (i13 != 1) {
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i7 = onextracallback.I$1;
            i6 = onextracallback.I$0;
            getmaximages4 = (getMaxImages) onextracallback.L$0;
            ResultKt.onNavigationEvent(obj2);
            getmaximages4.onExtraCallback(i6, i7);
            return Unit.INSTANCE;
        }
        int i14 = onextracallback.I$2;
        float f4 = onextracallback.F$2;
        f2 = onextracallback.F$1;
        float f5 = onextracallback.F$0;
        int i15 = onextracallback.I$1;
        int i16 = onextracallback.I$0;
        intRef = (Ref.IntRef) onextracallback.L$4;
        objectRef2 = (Ref.ObjectRef) onextracallback.L$3;
        booleanRef = (Ref.BooleanRef) onextracallback.L$2;
        r8lambdanm9dm2eewl4vrptnjmesfjqky4OnExtraCallbackWithResult = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) onextracallback.L$1;
        getmaximages2 = (getMaxImages) onextracallback.L$0;
        try {
            ResultKt.onNavigationEvent(obj2);
            f3 = f4;
            onextracallback3 = onextracallback;
            i3 = i15;
            f = f5;
            i4 = i14;
            getmaximages3 = getmaximages2;
            i5 = i16;
            try {
                try {
                    intRef.element++;
                } catch (AFg1ySDKAFa1tSDK e4) {
                    e = e4;
                    getmaximages5 = getmaximages3;
                }
                obj3 = null;
                z2 = true;
            } catch (AFg1ySDKAFa1tSDK e5) {
                e = e5;
                onextracallback2 = onextracallback3;
                z = false;
                int i17 = i5;
                getmaximages2 = getmaximages3;
                i8 = i17;
            }
        } catch (AFg1ySDKAFa1tSDK e6) {
            e = e6;
            i8 = i16;
            z = false;
            onextracallback2 = onextracallback;
            i3 = i15;
        }
        if (booleanRef.element != z2 && getmaximages3.onExtraCallback() > 0) {
            try {
                try {
                    int iOnWarmupCompleted = getMaxImages.onWarmupCompleted(getmaximages3, i5, 0, 2, obj3) + i3;
                    if (Math.abs(iOnWarmupCompleted) >= f) {
                        fMax = i4 != 0 ? f : -f;
                    } else {
                        fMax = Math.max(Math.abs(iOnWarmupCompleted), f3);
                        if (i4 == 0) {
                            fMax = -fMax;
                        }
                    }
                    getmaximages3.onWarmupCompleted();
                    getmaximages3.onExtraCallbackWithResult();
                    objectRef2.element = onSearchClicked.onExtraCallbackWithResult((onTextFocusChanged) objectRef2.element, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                    final Ref.FloatRef floatRef3 = new Ref.FloatRef();
                    onTextFocusChanged ontextfocuschanged = (onTextFocusChanged) objectRef2.element;
                    Float fOnExtraCallbackWithResult2 = access14000.onExtraCallbackWithResult(fMax);
                    boolean z3 = ((Number) ((onTextFocusChanged) objectRef2.element).IAuthTabCallback()).floatValue() != 0.0f;
                    final boolean z4 = i4 == 0;
                    final getMaxImages getmaximages6 = getmaximages3;
                    final int i18 = i5;
                    final float f6 = fMax;
                    final Ref.BooleanRef booleanRef2 = booleanRef;
                    final float f7 = f2;
                    final Ref.IntRef intRef3 = intRef;
                    final float f8 = f;
                    final int i19 = i3;
                    final float f9 = f3;
                    final Ref.ObjectRef objectRef3 = objectRef2;
                    Function1 function12 = new Function1() { // from class: im.toss.tosssecurities.uikit.lazyliststate.animatescrolltoitem.AnimateScrollToItemSpringKt$$ExternalSyntheticLambda0
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            int i20 = 2 % 2;
                            int i21 = onExtraCallback + 45;
                            onExtraCallbackWithResult = i21 % 128;
                            int i22 = i21 % 2;
                            Unit unitOnNavigationEvent = AFg1ySDK.onNavigationEvent(getmaximages6, i18, f6, floatRef3, booleanRef2, z4, f7, intRef3, f8, i19, f9, objectRef3, (onItemSelected) obj4);
                            int i23 = onExtraCallbackWithResult + 89;
                            onExtraCallback = i23 % 128;
                            int i24 = i23 % 2;
                            return unitOnNavigationEvent;
                        }
                    };
                    onextracallback3.L$0 = getmaximages3;
                    onextracallback3.L$1 = access15400.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4OnExtraCallbackWithResult);
                    onextracallback3.L$2 = booleanRef;
                    onextracallback3.L$3 = objectRef2;
                    onextracallback3.L$4 = intRef;
                    onextracallback3.L$5 = access15400.onNavigationEvent(floatRef3);
                    onextracallback3.I$0 = i5;
                    onextracallback3.I$1 = i3;
                    onextracallback3.F$0 = f;
                    onextracallback3.F$1 = f2;
                    onextracallback3.F$2 = f3;
                    onextracallback3.I$2 = i4;
                    onextracallback3.I$3 = iOnWarmupCompleted;
                    onextracallback3.F$3 = fMax;
                    onextracallback3.label = 1;
                    Object objIAuthTabCallback = getShowText.IAuthTabCallback(ontextfocuschanged, fOnExtraCallbackWithResult2, (onItemClicked) null, !z3, function12, onextracallback3, 2, (Object) null);
                    objOnExtraCallback = obj;
                    if (objIAuthTabCallback != objOnExtraCallback) {
                        int i20 = onExtraCallbackWithResult + 5;
                        int i21 = i20 % 128;
                        onExtraCallback = i21;
                        if (i20 % 2 != 0) {
                            throw null;
                        }
                        int i22 = i21 + 115;
                        onExtraCallbackWithResult = i22 % 128;
                        int i23 = i22 % 2;
                        getmaximages3 = getmaximages5;
                        intRef.element++;
                        obj3 = null;
                        z2 = true;
                        if (booleanRef.element != z2) {
                            int iOnWarmupCompleted2 = getMaxImages.onWarmupCompleted(getmaximages3, i5, 0, 2, obj3) + i3;
                            if (Math.abs(iOnWarmupCompleted2) >= f) {
                            }
                            getmaximages3.onWarmupCompleted();
                            getmaximages3.onExtraCallbackWithResult();
                            objectRef2.element = onSearchClicked.onExtraCallbackWithResult((onTextFocusChanged) objectRef2.element, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                            final Ref.FloatRef floatRef32 = new Ref.FloatRef();
                            obj = objOnExtraCallback;
                            onTextFocusChanged ontextfocuschanged2 = (onTextFocusChanged) objectRef2.element;
                            Float fOnExtraCallbackWithResult22 = access14000.onExtraCallbackWithResult(fMax);
                            if (((Number) ((onTextFocusChanged) objectRef2.element).IAuthTabCallback()).floatValue() != 0.0f) {
                            }
                            if (i4 == 0) {
                            }
                            final getMaxImages getmaximages62 = getmaximages3;
                            final int i182 = i5;
                            final float f62 = fMax;
                            final Ref.BooleanRef booleanRef22 = booleanRef;
                            final float f72 = f2;
                            final Ref.IntRef intRef32 = intRef;
                            final float f82 = f;
                            final int i192 = i3;
                            final float f92 = f3;
                            final Ref.ObjectRef objectRef32 = objectRef2;
                            Function1 function122 = new Function1() { // from class: im.toss.tosssecurities.uikit.lazyliststate.animatescrolltoitem.AnimateScrollToItemSpringKt$$ExternalSyntheticLambda0
                                private static int onExtraCallback = 0;
                                private static int onExtraCallbackWithResult = 1;

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    int i202 = 2 % 2;
                                    int i212 = onExtraCallback + 45;
                                    onExtraCallbackWithResult = i212 % 128;
                                    int i222 = i212 % 2;
                                    Unit unitOnNavigationEvent = AFg1ySDK.onNavigationEvent(getmaximages62, i182, f62, floatRef32, booleanRef22, z4, f72, intRef32, f82, i192, f92, objectRef32, (onItemSelected) obj4);
                                    int i232 = onExtraCallbackWithResult + 89;
                                    onExtraCallback = i232 % 128;
                                    int i24 = i232 % 2;
                                    return unitOnNavigationEvent;
                                }
                            };
                            onextracallback3.L$0 = getmaximages3;
                            getmaximages5 = getmaximages3;
                            onextracallback3.L$1 = access15400.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4OnExtraCallbackWithResult);
                            onextracallback3.L$2 = booleanRef;
                            onextracallback3.L$3 = objectRef2;
                            onextracallback3.L$4 = intRef;
                            onextracallback3.L$5 = access15400.onNavigationEvent(floatRef32);
                            onextracallback3.I$0 = i5;
                            onextracallback3.I$1 = i3;
                            onextracallback3.F$0 = f;
                            onextracallback3.F$1 = f2;
                            onextracallback3.F$2 = f3;
                            onextracallback3.I$2 = i4;
                            onextracallback3.I$3 = iOnWarmupCompleted2;
                            onextracallback3.F$3 = fMax;
                            onextracallback3.label = 1;
                            Object objIAuthTabCallback2 = getShowText.IAuthTabCallback(ontextfocuschanged2, fOnExtraCallbackWithResult22, (onItemClicked) null, !z3, function122, onextracallback3, 2, (Object) null);
                            objOnExtraCallback = obj;
                            if (objIAuthTabCallback2 != objOnExtraCallback) {
                            }
                        }
                    }
                } catch (AFg1ySDKAFa1tSDK e7) {
                    e = e7;
                    getmaximages5 = getmaximages3;
                }
                obj = objOnExtraCallback;
            } catch (AFg1ySDKAFa1tSDK e8) {
                e = e8;
                objOnExtraCallback = obj;
                i8 = i5;
                onextracallback2 = onextracallback3;
                z = false;
                getmaximages2 = getmaximages5;
                ontextfocuschangedOnExtraCallbackWithResult = onSearchClicked.onExtraCallbackWithResult(e.onExtraCallback(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                final float fIAuthTabCallback22 = e.IAuthTabCallback() + i3;
                final Ref.FloatRef floatRef22 = new Ref.FloatRef();
                Objects.toString(e.onExtraCallback().IAuthTabCallback());
                fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(fIAuthTabCallback22);
                if (((Number) ontextfocuschangedOnExtraCallbackWithResult.IAuthTabCallback()).floatValue() == 0.0f) {
                }
                function1 = new Function1() { // from class: im.toss.tosssecurities.uikit.lazyliststate.animatescrolltoitem.AnimateScrollToItemSpringKt$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        int i142 = 2 % 2;
                        int i152 = onExtraCallbackWithResult + 23;
                        onWarmupCompleted = i152 % 128;
                        int i162 = i152 % 2;
                        float f42 = fIAuthTabCallback22;
                        if (i162 != 0) {
                            return AFg1ySDK.onNavigationEvent(f42, floatRef22, getmaximages2, (onItemSelected) obj4);
                        }
                        AFg1ySDK.onNavigationEvent(f42, floatRef22, getmaximages2, (onItemSelected) obj4);
                        Object obj5 = null;
                        obj5.hashCode();
                        throw null;
                    }
                };
                onextracallback2.L$0 = getmaximages2;
                onextracallback2.L$1 = access15400.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4OnExtraCallbackWithResult);
                onextracallback2.L$2 = access15400.onNavigationEvent(e);
                onextracallback2.L$3 = access15400.onNavigationEvent(ontextfocuschangedOnExtraCallbackWithResult);
                onextracallback2.L$4 = access15400.onNavigationEvent(floatRef22);
                onextracallback2.L$5 = null;
                onextracallback2.I$0 = i8;
                onextracallback2.I$1 = i3;
                onextracallback2.F$0 = fIAuthTabCallback22;
                onextracallback2.label = 2;
                if (getShowText.IAuthTabCallback(ontextfocuschangedOnExtraCallbackWithResult, fOnExtraCallbackWithResult, (onItemClicked) null, !z, function1, onextracallback2, 2, (Object) null) != objOnExtraCallback) {
                }
                return objOnExtraCallback;
            }
            getmaximages5 = getmaximages3;
            return objOnExtraCallback;
        }
        return Unit.INSTANCE;
        ontextfocuschangedOnExtraCallbackWithResult = onSearchClicked.onExtraCallbackWithResult(e.onExtraCallback(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
        final float fIAuthTabCallback222 = e.IAuthTabCallback() + i3;
        final Ref.FloatRef floatRef222 = new Ref.FloatRef();
        Objects.toString(e.onExtraCallback().IAuthTabCallback());
        fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(fIAuthTabCallback222);
        if (((Number) ontextfocuschangedOnExtraCallbackWithResult.IAuthTabCallback()).floatValue() == 0.0f) {
            int i24 = onExtraCallback + 109;
            onExtraCallbackWithResult = i24 % 128;
            if (i24 % 2 != 0) {
                z = true;
            }
        }
        function1 = new Function1() { // from class: im.toss.tosssecurities.uikit.lazyliststate.animatescrolltoitem.AnimateScrollToItemSpringKt$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                int i142 = 2 % 2;
                int i152 = onExtraCallbackWithResult + 23;
                onWarmupCompleted = i152 % 128;
                int i162 = i152 % 2;
                float f42 = fIAuthTabCallback222;
                if (i162 != 0) {
                    return AFg1ySDK.onNavigationEvent(f42, floatRef222, getmaximages2, (onItemSelected) obj4);
                }
                AFg1ySDK.onNavigationEvent(f42, floatRef222, getmaximages2, (onItemSelected) obj4);
                Object obj5 = null;
                obj5.hashCode();
                throw null;
            }
        };
        onextracallback2.L$0 = getmaximages2;
        onextracallback2.L$1 = access15400.onNavigationEvent(r8lambdanm9dm2eewl4vrptnjmesfjqky4OnExtraCallbackWithResult);
        onextracallback2.L$2 = access15400.onNavigationEvent(e);
        onextracallback2.L$3 = access15400.onNavigationEvent(ontextfocuschangedOnExtraCallbackWithResult);
        onextracallback2.L$4 = access15400.onNavigationEvent(floatRef222);
        onextracallback2.L$5 = null;
        onextracallback2.I$0 = i8;
        onextracallback2.I$1 = i3;
        onextracallback2.F$0 = fIAuthTabCallback222;
        onextracallback2.label = 2;
        if (getShowText.IAuthTabCallback(ontextfocuschangedOnExtraCallbackWithResult, fOnExtraCallbackWithResult, (onItemClicked) null, !z, function1, onextracallback2, 2, (Object) null) != objOnExtraCallback) {
            getMaxImages getmaximages7 = getmaximages2;
            i6 = i8;
            i7 = i3;
            getmaximages4 = getmaximages7;
            getmaximages4.onExtraCallback(i6, i7);
            return Unit.INSTANCE;
        }
        return objOnExtraCallback;
    }

    private static final boolean IAuthTabCallback(getMaxImages getmaximages, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 37;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        int iOnWarmupCompleted = getmaximages.onWarmupCompleted();
        if (i <= getmaximages.onNavigationEvent() && iOnWarmupCompleted <= i) {
            int i5 = onExtraCallback + 95;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        int i7 = onExtraCallbackWithResult + 119;
        onExtraCallback = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        throw null;
    }

    static {
        int i = IAuthTabCallbackStub + 61;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }
}
