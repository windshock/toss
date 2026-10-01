package o;

import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
final class LottieDrawableExternalSyntheticLambda16 implements reverseSize {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final Function1<Float, Float> IAuthTabCallback;
    private final Function2<Float, access13800<? super Float>, Object> onExtraCallbackWithResult;
    private final boolean onNavigationEvent;

    static final class onNavigationEvent extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        float F$0;
        long J$0;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objM355onPreFlingQWom1Mo = LottieDrawableExternalSyntheticLambda16.this.m355onPreFlingQWom1Mo(i3 != 0 ? 1L : 0L, this);
            int i4 = onNavigationEvent + 35;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objM355onPreFlingQWom1Mo;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LottieDrawableExternalSyntheticLambda16(@NotNull Function1<? super Float, Float> function1, @NotNull Function2<? super Float, ? super access13800<? super Float>, ? extends Object> function2, boolean z) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.IAuthTabCallback = function1;
        this.onExtraCallbackWithResult = function2;
        this.onNavigationEvent = z;
    }

    public /* bridge */ Object IAuthTabCallback(long j, long j2, @NotNull access13800<? super RequestOptionConfig1> access13800Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = super.IAuthTabCallback(j, j2, access13800Var);
        int i4 = onWarmupCompleted + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public long m356onPreScrollOzD1aCk(long j, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 55;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!this.onNavigationEvent) {
            return setUseCaseAttached.Companion.IAuthTabCallback();
        }
        if (!(!sizeToRectF.onExtraCallback(i, sizeToRectF.Companion.onExtraCallback()))) {
            int i4 = onWarmupCompleted + 3;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            int i6 = (int) j;
            if (Float.intBitsToFloat(i6) < 0.0f) {
                int i7 = onExtraCallback + 13;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                float fFloatValue = ((Number) this.IAuthTabCallback.invoke(Float.valueOf(Float.intBitsToFloat(i6)))).floatValue();
                return setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fFloatValue) & 4294967295L));
            }
        }
        long jIAuthTabCallback = setUseCaseAttached.Companion.IAuthTabCallback();
        int i9 = onExtraCallback + 93;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        return jIAuthTabCallback;
    }

    /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    public long m354onPostScrollDzOQY0M(long j, long j2, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        if (!this.onNavigationEvent) {
            int i6 = i3 + 81;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            return setUseCaseAttached.Companion.IAuthTabCallback();
        }
        if (sizeToRectF.onExtraCallback(i, sizeToRectF.Companion.onExtraCallback())) {
            int i8 = (int) j2;
            if (Float.intBitsToFloat(i8) > 0.0f) {
                int i9 = onWarmupCompleted + 59;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                float fFloatValue = ((Number) this.IAuthTabCallback.invoke(Float.valueOf(Float.intBitsToFloat(i8)))).floatValue();
                return setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fFloatValue) & 4294967295L));
            }
        }
        long jIAuthTabCallback = setUseCaseAttached.Companion.IAuthTabCallback();
        int i11 = onExtraCallback + 121;
        onWarmupCompleted = i11 % 128;
        if (i11 % 2 != 0) {
            return jIAuthTabCallback;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m355onPreFlingQWom1Mo(long j, @NotNull access13800<? super RequestOptionConfig1> access13800Var) {
        onNavigationEvent onnavigationevent;
        float f;
        int i = 2 % 2;
        if (!(access13800Var instanceof onNavigationEvent)) {
            onnavigationevent = new onNavigationEvent(access13800Var);
        } else {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i2 = onnavigationevent.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = onExtraCallback + 35;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 == 0) {
                    onnavigationevent.label = i2 % Integer.MIN_VALUE;
                } else {
                    onnavigationevent.label = i2 - 2147483648;
                }
            }
        }
        Object objInvoke = onnavigationevent.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = onnavigationevent.label;
        if (i4 != 0) {
            int i5 = onWarmupCompleted;
            int i6 = i5 + 51;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = i5 + 97;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            f = onnavigationevent.F$0;
            ResultKt.onNavigationEvent(objInvoke);
        } else {
            ResultKt.onNavigationEvent(objInvoke);
            Function2<Float, access13800<? super Float>, Object> function2 = this.onExtraCallbackWithResult;
            Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(RequestOptionConfig1.IAuthTabCallback(j));
            onnavigationevent.J$0 = j;
            f = 0.0f;
            onnavigationevent.F$0 = 0.0f;
            onnavigationevent.label = 1;
            objInvoke = function2.invoke(fOnExtraCallbackWithResult, onnavigationevent);
            if (objInvoke == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        }
        RequestOptionConfig1 requestOptionConfig1OnExtraCallbackWithResult = RequestOptionConfig1.onExtraCallbackWithResult(RequestOptionConfigBuilder.onNavigationEvent(f, ((Number) objInvoke).floatValue()));
        int i10 = onExtraCallback + 65;
        onWarmupCompleted = i10 % 128;
        int i11 = i10 % 2;
        return requestOptionConfig1OnExtraCallbackWithResult;
    }
}
