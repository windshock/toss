package im.toss.uikit.widget.dialog;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.zzaq;
import im.toss.uikit.widget.dialog.BottomSheetSwitcher$;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TransitionKtExternalSyntheticLambda2;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class BottomSheetSwitcher extends FrameLayout {
    private static int IAuthTabCallbackDefault = 0;
    private static int onTransact = 1;
    private View IAuthTabCallback;
    private final Lazy onExtraCallback;
    private View onExtraCallbackWithResult;
    private View onNavigationEvent;
    private View onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomSheetSwitcher(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomSheetSwitcher(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = ~i2;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i6 | i4);
        int i12 = i2 | i11;
        int i13 = (~(i2 | i4)) | (~(i7 | i8 | i9)) | i11 | (~(i6 | i2));
        int i14 = i6 + i4 + i5 + (1272450877 * i) + ((-51365948) * i3);
        int i15 = i14 * i14;
        int i16 = ((-261444822) * i6) + 922746880 + ((-1437248296) * i4) + ((-1175803474) * i10) + (i12 * 587901737) + (587901737 * i13) + ((-849346560) * i5) + ((-1881145344) * i) + ((-578813952) * i3) + ((-124846080) * i15);
        int i17 = (i6 * 1187242746) + 1002376400 + (i4 * 1187242392) + (i10 * (-354)) + (i12 * 177) + (i13 * 177) + (i5 * 1187242569) + (i * (-1484311963)) + (i3 * 1141305060) + (i15 * 516358144);
        int i18 = i16 + (i17 * i17 * (-861863936));
        return i18 != 1 ? i18 != 2 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(BottomSheetSwitcher bottomSheetSwitcher, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onTransact + 33;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return onExtraCallbackWithResult(bottomSheetSwitcher, i, i2);
        }
        onExtraCallbackWithResult(bottomSheetSwitcher, i, i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(BottomSheetSwitcher bottomSheetSwitcher, int i, ValueAnimator valueAnimator) {
        int i2 = 2 % 2;
        int i3 = onTransact + 65;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        onTransact(bottomSheetSwitcher, i, valueAnimator);
        if (i4 != 0) {
            int i5 = 34 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(BottomSheetSwitcher bottomSheetSwitcher, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(bottomSheetSwitcher, valueAnimator);
        int i4 = IAuthTabCallbackDefault + 27;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void onNavigationEvent(BottomSheetSwitcher bottomSheetSwitcher, int i, ValueAnimator valueAnimator) {
        int i2 = 2 % 2;
        int i3 = onTransact + 17;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult(bottomSheetSwitcher, i, valueAnimator);
        if (i4 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Interpolator onWarmupCompleted() {
        Interpolator interpolatorOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onTransact + 57;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            interpolatorOnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = 81 / 0;
        } else {
            interpolatorOnExtraCallbackWithResult = onExtraCallbackWithResult();
        }
        int i4 = onTransact + 87;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return interpolatorOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        BottomSheetSwitcher bottomSheetSwitcher = (BottomSheetSwitcher) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        ValueAnimator valueAnimator = (ValueAnimator) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(zzaq.onNavigationEvent(), new Object[]{bottomSheetSwitcher, Integer.valueOf(iIntValue), valueAnimator}, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -819638177, zzaq.onNavigationEvent(), 819638179);
        int i4 = IAuthTabCallbackDefault + 3;
        onTransact = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(BottomSheetSwitcher bottomSheetSwitcher, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(bottomSheetSwitcher, valueAnimator);
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetSwitcher(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = LazyKt__LazyJVMKt.lazy(new BottomSheetSwitcher$.ExternalSyntheticLambda0());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BottomSheetSwitcher(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallbackDefault + 103;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 79 / 0;
            }
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = IAuthTabCallbackDefault + 23;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        BottomSheetSwitcher bottomSheetSwitcher = (BottomSheetSwitcher) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object value = bottomSheetSwitcher.onExtraCallback.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        Interpolator interpolator = (Interpolator) value;
        if (i3 != 0) {
            return interpolator;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Interpolator onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Interpolator interpolatorIAuthTabCallback = TransitionKtExternalSyntheticLambda2.IAuthTabCallback(0.33f, 1.0f, 0.68f, 1.0f);
        int i4 = onTransact + 85;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return interpolatorIAuthTabCallback;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        int i = 2 % 2;
        super.onAttachedToWindow();
        if (getChildCount() != 2) {
            throw new IllegalStateException("BottomSheetSwitcher should have 2 children!");
        }
        int i2 = IAuthTabCallbackDefault + 73;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getChildAt(0).setVisibility(0);
        getChildAt(1).setVisibility(8);
        int i4 = onTransact + 71;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallbackWithResult(BottomSheetSwitcher bottomSheetSwitcher, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 123;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        bottomSheetSwitcher.onNavigationEvent();
        bottomSheetSwitcher.onExtraCallback();
        bottomSheetSwitcher.onWarmupCompleted(i, i2);
        Unit unit = Unit.INSTANCE;
        int i6 = onTransact + 45;
        IAuthTabCallbackDefault = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final void onTransact(BottomSheetSwitcher bottomSheetSwitcher, int i, ValueAnimator valueAnimator) {
        int i2 = 2 % 2;
        int i3 = onTransact + 107;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        View view = bottomSheetSwitcher.IAuthTabCallback;
        if (view != null) {
            view.setTranslationY(i * (1.0f - fFloatValue));
        }
        View view2 = bottomSheetSwitcher.IAuthTabCallback;
        if (view2 != null) {
            int i5 = IAuthTabCallbackDefault + 81;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            view2.setAlpha(fFloatValue);
            if (i6 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i7 = IAuthTabCallbackDefault + 19;
        onTransact = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 86 / 0;
        }
    }

    private final void onNavigationEvent() {
        int i = 2 % 2;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(10.0f), displayMetrics);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new BottomSheetSwitcher$.ExternalSyntheticLambda1(this, iOnNavigationEvent));
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        valueAnimatorOfFloat.setInterpolator((Interpolator) IAuthTabCallback(zzaq.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent2, zzaq.onNavigationEvent(), 211262537, iOnNavigationEvent3, -211262536));
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.start();
        int i2 = IAuthTabCallbackDefault + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        BottomSheetSwitcher bottomSheetSwitcher = (BottomSheetSwitcher) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        ValueAnimator valueAnimator = (ValueAnimator) objArr[2];
        int i = 2 % 2;
        int i2 = onTransact + 85;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            ((Float) animatedValue).floatValue();
            View view = bottomSheetSwitcher.onExtraCallbackWithResult;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "");
        float fFloatValue = ((Float) animatedValue2).floatValue();
        View view2 = bottomSheetSwitcher.onExtraCallbackWithResult;
        if (view2 != null) {
            int i3 = onTransact + 5;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                view2.setTranslationY(iIntValue + (1.0f * fFloatValue));
            } else {
                view2.setTranslationY(iIntValue * (1.0f - fFloatValue));
            }
            int i4 = IAuthTabCallbackDefault + 89;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        View view3 = bottomSheetSwitcher.onExtraCallbackWithResult;
        if (view3 != null) {
            int i6 = onTransact + 103;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            view3.setAlpha(fFloatValue);
        }
        return null;
    }

    private final void onExtraCallback() {
        int i = 2 % 2;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(20.0f), displayMetrics);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new BottomSheetSwitcher$.ExternalSyntheticLambda6(this, iOnNavigationEvent));
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        valueAnimatorOfFloat.setInterpolator((Interpolator) IAuthTabCallback(zzaq.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent2, zzaq.onNavigationEvent(), 211262537, iOnNavigationEvent3, -211262536));
        valueAnimatorOfFloat.setDuration(800L);
        valueAnimatorOfFloat.start();
        int i2 = IAuthTabCallbackDefault + 113;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 57 / 0;
        }
    }

    private static final void IAuthTabCallback(BottomSheetSwitcher bottomSheetSwitcher, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        View view = bottomSheetSwitcher.onWarmupCompleted;
        if (view != null) {
            int i2 = onTransact + 107;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            view.setAlpha(((Float) animatedValue).floatValue());
            int i4 = onTransact + 29;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 3;
            }
        }
    }

    private static final void onExtraCallbackWithResult(BottomSheetSwitcher bottomSheetSwitcher, int i, ValueAnimator valueAnimator) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 55;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            ((Float) animatedValue).floatValue();
            View view = bottomSheetSwitcher.onWarmupCompleted;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "");
        float fFloatValue = ((Float) animatedValue2).floatValue();
        View view2 = bottomSheetSwitcher.onWarmupCompleted;
        if (view2 != null) {
            view2.setTranslationY(i * (1.0f - fFloatValue));
        }
        int i4 = IAuthTabCallbackDefault + 107;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onWarmupCompleted(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 27;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        View view = this.onNavigationEvent;
        if (view == null || view == null || view.getVisibility() != 0) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new BottomSheetSwitcher$.ExternalSyntheticLambda4(this));
            int iOnNavigationEvent = zzaq.onNavigationEvent();
            int iOnNavigationEvent2 = zzaq.onNavigationEvent();
            valueAnimatorOfFloat.setInterpolator((Interpolator) IAuthTabCallback(zzaq.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent, zzaq.onNavigationEvent(), 211262537, iOnNavigationEvent2, -211262536));
            valueAnimatorOfFloat.setDuration(400L);
            valueAnimatorOfFloat.start();
            int i6 = IAuthTabCallbackDefault + 9;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new BottomSheetSwitcher$.ExternalSyntheticLambda5(this, i - i2));
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        int iOnNavigationEvent4 = zzaq.onNavigationEvent();
        valueAnimatorOfFloat2.setInterpolator((Interpolator) IAuthTabCallback(zzaq.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent3, zzaq.onNavigationEvent(), 211262537, iOnNavigationEvent4, -211262536));
        valueAnimatorOfFloat2.setDuration(500L);
        valueAnimatorOfFloat2.start();
    }

    private static final void onExtraCallback(BottomSheetSwitcher bottomSheetSwitcher, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 17;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            bottomSheetSwitcher.getLayoutParams();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        ViewGroup.LayoutParams layoutParams = bottomSheetSwitcher.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        layoutParams.height = ((Integer) animatedValue).intValue();
        bottomSheetSwitcher.setLayoutParams(layoutParams);
        int i3 = IAuthTabCallbackDefault + 35;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static final void IAuthTabCallback(BottomSheetSwitcher bottomSheetSwitcher, int i, ValueAnimator valueAnimator) {
        IAuthTabCallback(zzaq.onNavigationEvent(), new Object[]{bottomSheetSwitcher, Integer.valueOf(i), valueAnimator}, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), -819638177, zzaq.onNavigationEvent(), 819638179);
    }

    private final Interpolator IAuthTabCallback() {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        return (Interpolator) IAuthTabCallback(zzaq.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent, zzaq.onNavigationEvent(), 211262537, iOnNavigationEvent2, -211262536);
    }
}
