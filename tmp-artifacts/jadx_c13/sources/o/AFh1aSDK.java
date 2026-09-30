package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt___RangesKt;
import o.AFh1aSDK;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFh1aSDK {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        float F$0;
        float F$1;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 57;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = AFh1aSDK.onWarmupCompleted(null, 0, 0, 0, null, this);
            int i4 = IAuthTabCallback + 113;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }
    }

    private static final long onExtraCallback(long j) {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 37;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 73;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public static /* synthetic */ long onExtraCallbackWithResult(long j) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        long jOnExtraCallback = onExtraCallback(j);
        if (i3 != 0) {
            int i4 = 28 / 0;
        }
        return jOnExtraCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Long] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008e -> B:19:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object onWarmupCompleted(@NotNull getMaxImages getmaximages, int i, int i2, int i3, @NotNull setOnQueryTextListener setonquerytextlistener, @NotNull access13800<? super Unit> access13800Var) {
        onExtraCallbackWithResult onextracallbackwithresult;
        int i4;
        int i5;
        setOnQueryTextListener setonquerytextlistener2;
        Ref.ObjectRef objectRef;
        onExtraCallbackWithResult onextracallbackwithresult2;
        float fOnWarmupCompleted;
        float f;
        getMaxImages getmaximages2;
        int i6;
        Object objIAuthTabCallback;
        long jLongValue;
        int i7 = 2 % 2;
        if (access13800Var instanceof onExtraCallbackWithResult) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i8 = onextracallbackwithresult.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                onextracallbackwithresult.label = i8 - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object obj = onextracallbackwithresult.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i9 = onextracallbackwithresult.label;
        int i10 = 1;
        if (i9 == 0) {
            ResultKt.onNavigationEvent(obj);
            i4 = i2;
            i5 = i3;
            setonquerytextlistener2 = setonquerytextlistener;
            objectRef = new Ref.ObjectRef();
            onextracallbackwithresult2 = onextracallbackwithresult;
            fOnWarmupCompleted = 0.0f;
            f = 0.0f;
            getmaximages2 = getmaximages;
            i6 = i;
            Function1 function1 = new Function1() { // from class: im.toss.tosssecurities.uikit.lazyliststate.animatescrolltoitem.AnimateScrollToItemTweenKt$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i11 = 2 % 2;
                    int i12 = onWarmupCompleted + 91;
                    onNavigationEvent = i12 % 128;
                    int i13 = i12 % 2;
                    Long lValueOf = Long.valueOf(AFh1aSDK.onExtraCallbackWithResult(((Long) obj2).longValue()));
                    int i14 = onWarmupCompleted + 91;
                    onNavigationEvent = i14 % 128;
                    if (i14 % 2 != 0) {
                        return lValueOf;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            };
            onextracallbackwithresult2.L$0 = getmaximages2;
            onextracallbackwithresult2.L$1 = setonquerytextlistener2;
            onextracallbackwithresult2.L$2 = objectRef;
            onextracallbackwithresult2.I$0 = i6;
            onextracallbackwithresult2.I$1 = i4;
            onextracallbackwithresult2.I$2 = i5;
            onextracallbackwithresult2.F$0 = f;
            onextracallbackwithresult2.F$1 = fOnWarmupCompleted;
            onextracallbackwithresult2.label = i10;
            objIAuthTabCallback = addSessionCaptureCallback.IAuthTabCallback(function1, onextracallbackwithresult2);
            if (objIAuthTabCallback != objOnExtraCallback) {
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            float f2 = onextracallbackwithresult.F$1;
            float f3 = onextracallbackwithresult.F$0;
            int i11 = onextracallbackwithresult.I$2;
            int i12 = onextracallbackwithresult.I$1;
            int i13 = onextracallbackwithresult.I$0;
            Ref.ObjectRef objectRef2 = (Ref.ObjectRef) onextracallbackwithresult.L$2;
            setOnQueryTextListener setonquerytextlistener3 = (setOnQueryTextListener) onextracallbackwithresult.L$1;
            getMaxImages getmaximages3 = (getMaxImages) onextracallbackwithresult.L$0;
            ResultKt.onNavigationEvent(obj);
            onextracallbackwithresult2 = onextracallbackwithresult;
            i6 = i13;
            fOnWarmupCompleted = f2;
            i4 = i12;
            f = f3;
            i5 = i11;
            setonquerytextlistener2 = setonquerytextlistener3;
            objectRef = objectRef2;
            long jLongValue2 = ((Number) obj).longValue();
            Long l = (Long) objectRef.element;
            if (l == null) {
                int i14 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
                onWarmupCompleted = i14 % 128;
                int i15 = i14 % 2;
                jLongValue = l.longValue();
            } else {
                objectRef.element = access14000.onExtraCallback(jLongValue2);
                jLongValue = jLongValue2;
            }
            float fCoerceIn = RangesKt___RangesKt.coerceIn(((jLongValue2 - jLongValue) / 1000000.0f) / i5, 0.0f, 1.0f);
            float fTransform = setonquerytextlistener2.transform(fCoerceIn);
            float fOnWarmupCompleted2 = getMaxImages.onWarmupCompleted(getmaximages3, i6, 0, 2, (Object) null) + i4;
            if (Math.abs(fOnWarmupCompleted2) > 1.0f) {
                int i16 = onNavigationEvent + 65;
                onWarmupCompleted = i16 % 128;
                if (i16 % 2 == 0) {
                    return Unit.INSTANCE;
                }
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            fOnWarmupCompleted = onWarmupCompleted(fOnWarmupCompleted + (onNavigationEvent(f, fTransform) * fOnWarmupCompleted2), fOnWarmupCompleted2);
            float fOnExtraCallback = onExtraCallback(IAuthTabCallback(fOnWarmupCompleted, fOnWarmupCompleted2), fOnWarmupCompleted2);
            if (fOnExtraCallback == 0.0f) {
                if (fCoerceIn < 1.0f) {
                }
                if (Math.abs(getMaxImages.onWarmupCompleted(getmaximages3, i6, 0, 2, (Object) null) + i4) > 1.0f) {
                }
                return Unit.INSTANCE;
            }
            float fA_ = getmaximages3.a_(fOnExtraCallback);
            if (fA_ != 0.0f) {
                fOnWarmupCompleted = onWarmupCompleted(fOnWarmupCompleted - fA_, fOnWarmupCompleted2);
                if (fCoerceIn < 1.0f) {
                    f = fTransform;
                    getmaximages2 = getmaximages3;
                    i10 = 1;
                    Function1 function12 = new Function1() { // from class: im.toss.tosssecurities.uikit.lazyliststate.animatescrolltoitem.AnimateScrollToItemTweenKt$$ExternalSyntheticLambda0
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i112 = 2 % 2;
                            int i122 = onWarmupCompleted + 91;
                            onNavigationEvent = i122 % 128;
                            int i132 = i122 % 2;
                            Long lValueOf = Long.valueOf(AFh1aSDK.onExtraCallbackWithResult(((Long) obj2).longValue()));
                            int i142 = onWarmupCompleted + 91;
                            onNavigationEvent = i142 % 128;
                            if (i142 % 2 != 0) {
                                return lValueOf;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    };
                    onextracallbackwithresult2.L$0 = getmaximages2;
                    onextracallbackwithresult2.L$1 = setonquerytextlistener2;
                    onextracallbackwithresult2.L$2 = objectRef;
                    onextracallbackwithresult2.I$0 = i6;
                    onextracallbackwithresult2.I$1 = i4;
                    onextracallbackwithresult2.I$2 = i5;
                    onextracallbackwithresult2.F$0 = f;
                    onextracallbackwithresult2.F$1 = fOnWarmupCompleted;
                    onextracallbackwithresult2.label = i10;
                    objIAuthTabCallback = addSessionCaptureCallback.IAuthTabCallback(function12, onextracallbackwithresult2);
                    if (objIAuthTabCallback != objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                    getmaximages3 = getmaximages2;
                    obj = objIAuthTabCallback;
                }
            }
            if (Math.abs(getMaxImages.onWarmupCompleted(getmaximages3, i6, 0, 2, (Object) null) + i4) > 1.0f) {
                getmaximages3.onExtraCallback(i6, i4);
            }
            return Unit.INSTANCE;
            long jLongValue22 = ((Number) obj).longValue();
            Long l2 = (Long) objectRef.element;
            if (l2 == null) {
            }
            float fCoerceIn2 = RangesKt___RangesKt.coerceIn(((jLongValue22 - jLongValue) / 1000000.0f) / i5, 0.0f, 1.0f);
            float fTransform2 = setonquerytextlistener2.transform(fCoerceIn2);
            float fOnWarmupCompleted22 = getMaxImages.onWarmupCompleted(getmaximages3, i6, 0, 2, (Object) null) + i4;
            if (Math.abs(fOnWarmupCompleted22) > 1.0f) {
            }
        }
    }

    private static final float onNavigationEvent(float f, float f2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        float fCoerceIn = RangesKt___RangesKt.coerceIn((f2 - f) / RangesKt___RangesKt.coerceAtLeast(1.0f - f, 1.0E-4f), 0.0f, 1.0f);
        int i4 = onWarmupCompleted + 83;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return fCoerceIn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final float onWarmupCompleted(float f, float f2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 93;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0 ? f2 <= 0.0f : f2 <= 0.0f) {
            if (f2 >= 0.0f) {
                return 0.0f;
            }
            int i4 = i2 + 53;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return RangesKt___RangesKt.coerceAtMost(f, 0.0f);
        }
        int i6 = i2 + 97;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(f, 0.0f);
        int i8 = onWarmupCompleted + 25;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            return fCoerceAtLeast;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final float IAuthTabCallback(float f, float f2) {
        int i = 2 % 2;
        if (f2 > 0.0f) {
            int i2 = onWarmupCompleted + 91;
            onNavigationEvent = i2 % 128;
            return i2 % 2 == 0 ? RangesKt___RangesKt.coerceIn(f, 1.0f, f2) : RangesKt___RangesKt.coerceIn(f, 0.0f, f2);
        }
        float fCoerceIn = RangesKt___RangesKt.coerceIn(f, f2, 0.0f);
        int i3 = onWarmupCompleted + 19;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return fCoerceIn;
    }

    private static final float onExtraCallback(float f, float f2) {
        int i = 2 % 2;
        if (f == 0.0f || Math.abs(f) >= 1.0f) {
            return f;
        }
        if (Math.abs(f2) <= 1.0f) {
            int i2 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return f;
        }
        float fMin = Math.min(Math.abs(f2), 1.0f);
        if (f <= 0.0f) {
            return -fMin;
        }
        int i4 = onNavigationEvent + 99;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 57;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return fMin;
    }
}
