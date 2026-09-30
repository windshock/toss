package viva.republica.toss.send.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.dangerouslyForceOverride;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class RollingCharacterView extends View {
    public static final Companion Companion = new Companion(null);
    public static final int IAuthTabCallback = 8;
    private final Rolling IAuthTabCallbackStub;
    private String onExtraCallback;
    private Paint onExtraCallbackWithResult;
    private ArrayList<String> onNavigationEvent;
    private String onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RollingCharacterView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RollingCharacterView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RollingCharacterView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, BuildConfig.FLAVOR);
        this.onNavigationEvent = new ArrayList<>();
        Paint paint = new Paint();
        paint.setColor(-16777216);
        Intrinsics.checkNotNullExpressionValue(getResources().getDisplayMetrics(), BuildConfig.FLAVOR);
        paint.setTextSize(varyMatches.onNavigationEvent(Float.valueOf(14.0f), r3));
        paint.setTypeface(Typeface.DEFAULT);
        this.onExtraCallbackWithResult = paint;
        this.IAuthTabCallbackStub = new Rolling();
    }

    public /* synthetic */ RollingCharacterView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    final class Rolling {
        private float onExtraCallbackWithResult;
        private float onWarmupCompleted;

        public Rolling() {
            Intrinsics.checkNotNullExpressionValue(RollingCharacterView.this.getResources().getDisplayMetrics(), BuildConfig.FLAVOR);
            this.onWarmupCompleted = varyMatches.onNavigationEvent(Float.valueOf(24.0f), r2);
        }

        public final float IAuthTabCallback() {
            return this.onWarmupCompleted;
        }

        public final void onNavigationEvent(float f) {
            this.onWarmupCompleted = f;
        }

        public final float onExtraCallbackWithResult() {
            return this.onExtraCallbackWithResult;
        }

        public final void onExtraCallbackWithResult(float f) {
            this.onExtraCallbackWithResult = f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExtraCallback() {
        if (this.onNavigationEvent.size() <= 1) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.send.view.RollingCharacterView$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                RollingCharacterView.onWarmupCompleted(this.f$0, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: viva.republica.toss.send.view.RollingCharacterView$next$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, BuildConfig.FLAVOR);
                RollingCharacterView rollingCharacterView = this.IAuthTabCallback;
                rollingCharacterView.onWarmupCompleted = (String) rollingCharacterView.onNavigationEvent.get(1);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, BuildConfig.FLAVOR);
                this.IAuthTabCallback.onNavigationEvent.remove(0);
                RollingCharacterView rollingCharacterView = this.IAuthTabCallback;
                rollingCharacterView.onExtraCallback = rollingCharacterView.onWarmupCompleted;
                this.IAuthTabCallback.onExtraCallback();
            }
        });
        valueAnimatorOfFloat.setInterpolator(dangerouslyForceOverride.onExtraCallbackWithResult.onWarmupCompleted());
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setStartDelay(800L);
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(RollingCharacterView rollingCharacterView, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, BuildConfig.FLAVOR);
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, BuildConfig.FLAVOR);
        float fFloatValue = ((Float) animatedValue).floatValue();
        Float fValueOf = Float.valueOf(24.0f);
        DisplayMetrics displayMetrics = rollingCharacterView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, BuildConfig.FLAVOR);
        int iOnNavigationEvent = varyMatches.onNavigationEvent(fValueOf, displayMetrics);
        DisplayMetrics displayMetrics2 = rollingCharacterView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, BuildConfig.FLAVOR);
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(fValueOf, displayMetrics2);
        int height = rollingCharacterView.getHeight();
        rollingCharacterView.IAuthTabCallbackStub.onNavigationEvent(iOnNavigationEvent + (rollingCharacterView.getHeight() * fFloatValue));
        rollingCharacterView.IAuthTabCallbackStub.onExtraCallbackWithResult((iOnNavigationEvent2 - height) + (rollingCharacterView.getHeight() * fFloatValue));
        rollingCharacterView.invalidate();
    }

    public final void setCharacters(@NotNull String... strArr) {
        Intrinsics.checkNotNullParameter(strArr, BuildConfig.FLAVOR);
        ArrayList<String> arrayList = this.onNavigationEvent;
        arrayList.clear();
        CollectionsKt.addAll(arrayList, strArr);
        this.onExtraCallback = (String) CollectionsKt.first(this.onNavigationEvent);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        String str = BuildConfig.FLAVOR;
        Intrinsics.checkNotNullParameter(canvas, BuildConfig.FLAVOR);
        super.onDraw(canvas);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, BuildConfig.FLAVOR);
        float fOnNavigationEvent = varyMatches.onNavigationEvent(Float.valueOf(5.0f), displayMetrics);
        String str2 = this.onWarmupCompleted;
        if (str2 != null) {
            if (str2 == null) {
                str2 = BuildConfig.FLAVOR;
            }
            canvas.drawText(str2, fOnNavigationEvent, this.IAuthTabCallbackStub.onExtraCallbackWithResult(), this.onExtraCallbackWithResult);
        }
        String str3 = this.onExtraCallback;
        if (str3 != null) {
            str = str3;
        }
        canvas.drawText(str, fOnNavigationEvent, this.IAuthTabCallbackStub.IAuthTabCallback(), this.onExtraCallbackWithResult);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
