package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import im.toss.uikit.widget.underlay.UnderlayAnimationFactory$;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.WebSocketFactory;
import o.deprecated_dns;
import o.getInForeground;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getInForeground {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    private static final Lazy<deprecated_dns> onExtraCallbackWithResult;
    private static int onTransact = 1;
    private static final Lazy<deprecated_dns> onWarmupCompleted;
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private static final AccelerateDecelerateInterpolator onExtraCallback = new AccelerateDecelerateInterpolator();
    private static final DecelerateInterpolator onNavigationEvent = new DecelerateInterpolator(1.0f);
    private static final DecelerateInterpolator IAuthTabCallback = new DecelerateInterpolator(1.5f);

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i5);
        int i9 = ~i5;
        int i10 = i8 | (~(i9 | i));
        int i11 = (~(i5 | i)) | (~((~i) | i7 | i9));
        int i12 = i7 | i | i9;
        int i13 = i + i2 + i4 + (1362283521 * i6) + ((-853422242) * i3);
        int i14 = i13 * i13;
        int i15 = ((1713903284 * i) - 1228931072) + ((-782767794) * i2) + (i10 * 1248335539) + (1248335539 * i11) + ((-1248335539) * i12) + (i4 * 465567744) + (465567744 * i6) + (1887436800 * i3) + ((-1154482176) * i14);
        int i16 = ((i * 722868660) - 41817558) + (i2 * 722869710) + (i10 * (-525)) + (i11 * (-525)) + (i12 * 525) + (i4 * 722869185) + (i6 * 1172694977) + (i3 * (-747618338)) + (i14 * 791674880);
        int i17 = i15 + (i16 * i16 * 751828992);
        return i17 != 1 ? i17 != 2 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = asInterface + 9;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {function1, valueAnimator};
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback4 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        if (i3 != 0) {
            IAuthTabCallback(421955790, objArr, -421955790, iIAuthTabCallback4, iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3);
            obj.hashCode();
            throw null;
        }
        IAuthTabCallback(421955790, objArr, -421955790, iIAuthTabCallback4, iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3);
        int i4 = IAuthTabCallbackDefault + 91;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = asInterface + 111;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(function1, valueAnimator);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = asInterface + 81;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[0];
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback3 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        int iIAuthTabCallback4 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        if (i3 != 0) {
            throw null;
        }
        deprecated_dns deprecated_dnsVar = (deprecated_dns) IAuthTabCallback(51617576, objArr2, -51617574, iIAuthTabCallback4, iIAuthTabCallback2, iIAuthTabCallback, iIAuthTabCallback3);
        int i4 = IAuthTabCallbackDefault + 1;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_dnsVar;
    }

    public static /* synthetic */ deprecated_dns onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        deprecated_dns deprecated_dnsVarIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = asInterface + 41;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return deprecated_dnsVarIAuthTabCallbackDefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(int i, int i2, Function1 function1, Function1 function12, ValueAnimator valueAnimator) {
        int i3 = 2 % 2;
        int i4 = asInterface + 75;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback(i, i2, function1, function12, valueAnimator);
        if (i5 != 0) {
            throw null;
        }
        int i6 = IAuthTabCallbackDefault + 25;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ void onNavigationEvent(long j, long j2, Function1 function1, int i, ValueAnimator valueAnimator) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 47;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted(j, j2, function1, i, valueAnimator);
        int i5 = IAuthTabCallbackDefault + 85;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Lazy IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault;
        int i3 = i2 + 41;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Lazy<deprecated_dns> lazy = onExtraCallbackWithResult;
        int i5 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return lazy;
    }

    public static final /* synthetic */ Lazy onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public static final /* synthetic */ deprecated_dns IAuthTabCallback(onExtraCallback onextracallback) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 1;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onextracallback.onNavigationEvent();
                throw null;
            }
            deprecated_dns deprecated_dnsVarOnNavigationEvent = onextracallback.onNavigationEvent();
            int i3 = onExtraCallback + 81;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return deprecated_dnsVarOnNavigationEvent;
        }

        public static final /* synthetic */ deprecated_dns onExtraCallback(onExtraCallback onextracallback) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                onextracallback.onExtraCallbackWithResult();
                throw null;
            }
            deprecated_dns deprecated_dnsVarOnExtraCallbackWithResult = onextracallback.onExtraCallbackWithResult();
            int i3 = onExtraCallback + 55;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return deprecated_dnsVarOnExtraCallbackWithResult;
        }

        public static final /* synthetic */ deprecated_dns onWarmupCompleted(onExtraCallback onextracallback, double d, double d2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 109;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return onextracallback.onNavigationEvent(d, d2);
            }
            onextracallback.onNavigationEvent(d, d2);
            throw null;
        }

        private final deprecated_dns onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object value = getInForeground.onWarmupCompleted().getValue();
            if (i3 == 0) {
                return (deprecated_dns) value;
            }
            throw null;
        }

        private final deprecated_dns onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 107;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            deprecated_dns deprecated_dnsVar = (deprecated_dns) getInForeground.IAuthTabCallback().getValue();
            if (i3 != 0) {
                return deprecated_dnsVar;
            }
            throw null;
        }

        private final deprecated_dns onNavigationEvent(double d, double d2) {
            int i = 2 % 2;
            deprecated_dns deprecated_dnsVar = new deprecated_dns(d2, d * 2.0d * Math.sqrt(d2));
            int i2 = onExtraCallback + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return deprecated_dnsVar;
        }
    }

    static {
        TombstoneProtosMemoryMappingBuilder tombstoneProtosMemoryMappingBuilder = TombstoneProtosMemoryMappingBuilder.NONE;
        onWarmupCompleted = LazyKt__LazyJVMKt.lazy(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.uikit.widget.underlay.UnderlayAnimationFactory$$ExternalSyntheticLambda4
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 21;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
                deprecated_dns deprecated_dnsVar = (deprecated_dns) getInForeground.IAuthTabCallback(2101457714, new Object[0], -2101457713, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, WebSocketFactory.onExtraCallback.IAuthTabCallback());
                int i4 = onWarmupCompleted + 75;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return deprecated_dnsVar;
            }
        });
        onExtraCallbackWithResult = LazyKt__LazyJVMKt.lazy(tombstoneProtosMemoryMappingBuilder, new Function0() { // from class: im.toss.uikit.widget.underlay.UnderlayAnimationFactory$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 17;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                deprecated_dns deprecated_dnsVarOnExtraCallbackWithResult = getInForeground.onExtraCallbackWithResult();
                if (i3 != 0) {
                    int i4 = 20 / 0;
                }
                return deprecated_dnsVarOnExtraCallbackWithResult;
            }
        });
        int i = onTransact + 103;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        deprecated_dns deprecated_dnsVarOnWarmupCompleted = onExtraCallback.onWarmupCompleted(Companion, 0.55d, 50.0d);
        int i4 = asInterface + 47;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return deprecated_dnsVarOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final deprecated_dns IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback.onWarmupCompleted(Companion, 0.55d, 40.0d);
            throw null;
        }
        deprecated_dns deprecated_dnsVarOnWarmupCompleted = onExtraCallback.onWarmupCompleted(Companion, 0.55d, 40.0d);
        int i3 = asInterface + 99;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return deprecated_dnsVarOnWarmupCompleted;
    }

    public final ValueAnimator onExtraCallback(final int i, @NotNull final Function1<? super Integer, Unit> function1, @NotNull Function0<Unit> function0) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(1900L);
        valueAnimatorOfFloat.setInterpolator(null);
        final long j = 400;
        final long j2 = 1500;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.underlay.UnderlayAnimationFactory$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i3 = 2 % 2;
                int i4 = IAuthTabCallback + 13;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                getInForeground.onNavigationEvent(j, j2, function1, i, valueAnimator);
                int i6 = onNavigationEvent + 41;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new onNavigationEvent(function1, i, function0));
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "");
        int i3 = asInterface + 61;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return valueAnimatorOfFloat;
    }

    private static final void onWarmupCompleted(long j, long j2, Function1 function1, int i, ValueAnimator valueAnimator) {
        float interpolation;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 75;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        long currentPlayTime = valueAnimator.getCurrentPlayTime();
        if (currentPlayTime <= j) {
            interpolation = onExtraCallback.getInterpolation(currentPlayTime / j) * 1.2f;
            int i5 = asInterface + 61;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
        } else {
            interpolation = (onExtraCallback.onExtraCallback(Companion).getInterpolation(RangesKt___RangesKt.coerceIn((currentPlayTime - j) / j2, 0.0f, 1.0f)) * (-0.20000005f)) + 1.2f;
        }
        function1.invoke(Integer.valueOf((int) (i * interpolation)));
    }

    public final ValueAnimator onNavigationEvent(int i, @NotNull Function1<? super Integer, Unit> function1, @NotNull Function0<Unit> function0) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, 0);
        onExtraCallback onextracallback = Companion;
        valueAnimatorOfInt.setDuration(onExtraCallback.IAuthTabCallback(onextracallback).IAuthTabCallback());
        valueAnimatorOfInt.setInterpolator(onExtraCallback.IAuthTabCallback(onextracallback));
        valueAnimatorOfInt.addUpdateListener(new UnderlayAnimationFactory$.ExternalSyntheticLambda0(function1));
        Intrinsics.checkNotNull(valueAnimatorOfInt);
        valueAnimatorOfInt.addListener(new onWarmupCompleted(function0));
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfInt, "");
        int i3 = IAuthTabCallbackDefault + 87;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return valueAnimatorOfInt;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        function1.invoke((Integer) animatedValue);
        int i4 = asInterface + 9;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final ValueAnimator onExtraCallback(int i, int i2, @NotNull final Function1<? super Integer, Unit> function1, @NotNull Function0<Unit> function0) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setInterpolator(onNavigationEvent);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.underlay.UnderlayAnimationFactory$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i4 = 2 % 2;
                int i5 = IAuthTabCallback + 73;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                getInForeground.IAuthTabCallback(function1, valueAnimator);
                if (i6 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfInt);
        valueAnimatorOfInt.addListener(new IAuthTabCallback(function0));
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfInt, "");
        int i4 = IAuthTabCallbackDefault + 5;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
        return valueAnimatorOfInt;
    }

    public static final class IAuthTabCallback implements Animator.AnimatorListener {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Function0 onExtraCallback;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 11;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        public IAuthTabCallback(Function0 function0) {
            this.onExtraCallback = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 93;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.invoke();
            if (i3 == 0) {
                throw null;
            }
        }
    }

    public static final class onExtraCallbackWithResult implements Animator.AnimatorListener {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Function0 onExtraCallback;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 98 / 0;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        public onExtraCallbackWithResult(Function0 function0) {
            this.onExtraCallback = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 65;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.invoke();
            int i4 = onNavigationEvent + 9;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onNavigationEvent implements Animator.AnimatorListener {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ int onExtraCallbackWithResult;
        final /* synthetic */ Function0 onNavigationEvent;
        final /* synthetic */ Function1 onWarmupCompleted;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        public onNavigationEvent(Function1 function1, int i, Function0 function0) {
            this.onWarmupCompleted = function1;
            this.onExtraCallbackWithResult = i;
            this.onNavigationEvent = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                this.onWarmupCompleted.invoke(Integer.valueOf(this.onExtraCallbackWithResult));
                this.onNavigationEvent.invoke();
            } else {
                this.onWarmupCompleted.invoke(Integer.valueOf(this.onExtraCallbackWithResult));
                this.onNavigationEvent.invoke();
                throw null;
            }
        }
    }

    public static final class onWarmupCompleted implements Animator.AnimatorListener {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Function0 onExtraCallbackWithResult;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 43 / 0;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 125;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        public onWarmupCompleted(Function0 function0) {
            this.onExtraCallbackWithResult = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 13;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallbackWithResult.invoke();
            int i4 = onExtraCallback + 25;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 69;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            function1.invoke((Integer) animatedValue);
            throw null;
        }
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "");
        function1.invoke((Integer) animatedValue2);
        int i3 = IAuthTabCallbackDefault + 77;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public final ValueAnimator IAuthTabCallback(int i, int i2, @NotNull Function1<? super Integer, Unit> function1, @NotNull Function1<? super Float, Unit> function12, @NotNull Function0<Unit> function0) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function0, "");
        int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i2 - i, 1);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(220L);
        valueAnimatorOfInt.setInterpolator(IAuthTabCallback);
        valueAnimatorOfInt.addUpdateListener(new UnderlayAnimationFactory$.ExternalSyntheticLambda1(i, iCoerceAtLeast, function1, function12));
        Intrinsics.checkNotNull(valueAnimatorOfInt);
        valueAnimatorOfInt.addListener(new onExtraCallbackWithResult(function0));
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfInt, "");
        int i4 = IAuthTabCallbackDefault + Imgproc.COLOR_YUV2RGB_YVYU;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return valueAnimatorOfInt;
        }
        throw null;
    }

    private static final void onExtraCallback(int i, int i2, Function1 function1, Function1 function12, ValueAnimator valueAnimator) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 109;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        function1.invoke((Integer) animatedValue);
        function12.invoke(Float.valueOf(1.0f - RangesKt___RangesKt.coerceIn((r7.intValue() - i) / i2, 0.0f, 1.0f)));
        int i6 = asInterface + 111;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 78 / 0;
        }
    }

    public static /* synthetic */ deprecated_dns onNavigationEvent() {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (deprecated_dns) IAuthTabCallback(2101457714, new Object[0], -2101457713, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, WebSocketFactory.onExtraCallback.IAuthTabCallback());
    }

    private static final void onWarmupCompleted(Function1 function1, ValueAnimator valueAnimator) {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        IAuthTabCallback(421955790, new Object[]{function1, valueAnimator}, -421955790, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, WebSocketFactory.onExtraCallback.IAuthTabCallback());
    }

    private static final deprecated_dns onExtraCallback() {
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        return (deprecated_dns) IAuthTabCallback(51617576, new Object[0], -51617574, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), iIAuthTabCallback, WebSocketFactory.onExtraCallback.IAuthTabCallback());
    }
}
