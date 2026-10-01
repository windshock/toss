package im.toss.tds.view.component.anim.logo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.Address;
import o.getProxyokhttp;
import o.getVersionCode;
import o.processDeepLink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AnimateLogoFlipView extends AnimateLogoView {
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private int IAuthTabCallback;
    private final boolean IAuthTabCallbackDefault;
    private final Rect asBinder;
    private long asInterface;
    private final List<getProxyokhttp> onExtraCallback;
    private final Rect onExtraCallbackWithResult;
    private ValueAnimator onNavigationEvent;
    private final IAuthTabCallback onTransact;
    private final Paint onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimateLogoFlipView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimateLogoFlipView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void IAuthTabCallback(AnimateLogoFlipView animateLogoFlipView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 27;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(animateLogoFlipView);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(Ref.BooleanRef booleanRef, AnimateLogoFlipView animateLogoFlipView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 33;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(booleanRef, animateLogoFlipView, valueAnimator);
        int i4 = IAuthTabCallback_Parcel + 55;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.getProxySelectorokhttp
    public boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 51;
        IAuthTabCallback_Parcel = i3 % 128;
        boolean z = i3 % 2 != 0;
        int i4 = i2 + 69;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateLogoFlipView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        boolean z;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = new ArrayList();
        this.IAuthTabCallback = -1;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.onWarmupCompleted = paint;
        this.asBinder = new Rect();
        this.onExtraCallbackWithResult = new Rect();
        this.asInterface = 1700L;
        this.onTransact = new IAuthTabCallback();
        if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) > 0.0f) {
            int i2 = IAuthTabCallback_Parcel + 123;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = true;
        } else {
            z = false;
        }
        this.IAuthTabCallbackDefault = z;
        setPerspectiveEnabled(true);
        int i5 = IAuthTabCallback_Parcel + 59;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 33 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AnimateLogoFlipView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallbackStub + 91;
            int i4 = i3 % 128;
            IAuthTabCallback_Parcel = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 63;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i9 = IAuthTabCallbackStub + 17;
            IAuthTabCallback_Parcel = i9 % 128;
            i = i9 % 2 == 0 ? 1 : 0;
            int i10 = 2 % 2;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ void onExtraCallback(AnimateLogoFlipView animateLogoFlipView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 115;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        animateLogoFlipView.onNavigationEvent();
        if (i3 != 0) {
            throw null;
        }
        int i4 = IAuthTabCallback_Parcel + 79;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
    }

    public static final /* synthetic */ ValueAnimator onNavigationEvent(AnimateLogoFlipView animateLogoFlipView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 13;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        ValueAnimator valueAnimator = animateLogoFlipView.onNavigationEvent;
        int i5 = i3 + 9;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return valueAnimator;
    }

    public long onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 99;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            return this.asInterface;
        }
        int i3 = 75 / 0;
        return this.asInterface;
    }

    @Override // im.toss.tds.view.component.anim.logo.AnimateLogoView
    public void setEachDuration(long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 31;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.asInterface = j;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 13;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final class IAuthTabCallback implements Runnable {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        IAuthTabCallback() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                AnimateLogoFlipView.onExtraCallback(AnimateLogoFlipView.this);
                AnimateLogoFlipView.this.invalidate();
                AnimateLogoFlipView.this.postDelayed(this, 1000L);
                int i3 = onNavigationEvent + 9;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            AnimateLogoFlipView.onExtraCallback(AnimateLogoFlipView.this);
            AnimateLogoFlipView.this.invalidate();
            AnimateLogoFlipView.this.postDelayed(this, 1000L);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void setPerspectiveEnabled(boolean z) {
        getVersionCode getversioncode;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 123;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        if (!z) {
            getversioncode = getVersionCode.NONE;
        } else {
            int i5 = i2 + 93;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 == 0) {
                getversioncode = getVersionCode.WEAK;
                int i6 = 98 / 0;
            } else {
                getversioncode = getVersionCode.WEAK;
            }
        }
        processDeepLink.onWarmupCompleted(this, getversioncode);
    }

    @Override // o.getProxySelectorokhttp
    public void onExtraCallbackWithResult(@NotNull List<getProxyokhttp> list) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 25;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(list, "");
            this.onExtraCallback.clear();
            this.onExtraCallback.addAll(list);
            this.IAuthTabCallback = -1;
            onNavigationEvent();
            invalidate();
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallback.clear();
        this.onExtraCallback.addAll(list);
        this.IAuthTabCallback = -1;
        onNavigationEvent();
        invalidate();
        if (!(!this.IAuthTabCallbackDefault)) {
            postDelayed(new Runnable() { // from class: im.toss.tds.view.component.anim.logo.AnimateLogoFlipView$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // java.lang.Runnable
                public final void run() {
                    int i3 = 2 % 2;
                    int i4 = onExtraCallbackWithResult + 97;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    AnimateLogoFlipView.IAuthTabCallback(this.f$0);
                    int i6 = IAuthTabCallback + 95;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }, 500L);
            return;
        }
        int i3 = IAuthTabCallback_Parcel + 95;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        postDelayed(this.onTransact, 1000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 android.animation.ValueAnimator) = (r1v4 android.animation.ValueAnimator), (r1v9 android.animation.ValueAnimator) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(final AnimateLogoFlipView animateLogoFlipView) {
        ValueAnimator valueAnimator;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            valueAnimator = animateLogoFlipView.onNavigationEvent;
            int i3 = 79 / 0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        } else {
            valueAnimator = animateLogoFlipView.onNavigationEvent;
            if (valueAnimator != null) {
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 180.0f);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.tds.view.component.anim.logo.AnimateLogoFlipView$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i4 = 2 % 2;
                int i5 = onWarmupCompleted + 5;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                Ref.BooleanRef booleanRef2 = booleanRef;
                if (i6 == 0) {
                    AnimateLogoFlipView.IAuthTabCallback(booleanRef2, animateLogoFlipView, valueAnimator2);
                    return;
                }
                AnimateLogoFlipView.IAuthTabCallback(booleanRef2, animateLogoFlipView, valueAnimator2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        valueAnimatorOfFloat.addListener(new onNavigationEvent(booleanRef, animateLogoFlipView));
        valueAnimatorOfFloat.setDuration(animateLogoFlipView.onExtraCallback());
        valueAnimatorOfFloat.setInterpolator(Address.onNavigationEvent.onWarmupCompleted());
        valueAnimatorOfFloat.start();
        animateLogoFlipView.onNavigationEvent = valueAnimatorOfFloat;
        int i4 = IAuthTabCallback_Parcel + 21;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
    }

    private static final void onWarmupCompleted(Ref.BooleanRef booleanRef, AnimateLogoFlipView animateLogoFlipView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 103;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        float fFloatValue = ((Float) animatedValue).floatValue();
        if (fFloatValue > 90.0f && !booleanRef.element) {
            booleanRef.element = true;
            animateLogoFlipView.setScaleX(-1.0f);
            animateLogoFlipView.onNavigationEvent();
        }
        animateLogoFlipView.setRotationY(fFloatValue);
        animateLogoFlipView.invalidate();
        int i4 = IAuthTabCallbackStub + 71;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onNavigationEvent extends AnimatorListenerAdapter {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ AnimateLogoFlipView onNavigationEvent;
        final /* synthetic */ Ref.BooleanRef onWarmupCompleted;

        onNavigationEvent(Ref.BooleanRef booleanRef, AnimateLogoFlipView animateLogoFlipView) {
            this.onWarmupCompleted = booleanRef;
            this.onNavigationEvent = animateLogoFlipView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ValueAnimator valueAnimatorOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 43;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(animator, "");
                this.onWarmupCompleted.element = false;
                this.onNavigationEvent.setScaleX(2.0f);
                valueAnimatorOnNavigationEvent = AnimateLogoFlipView.onNavigationEvent(this.onNavigationEvent);
                if (valueAnimatorOnNavigationEvent == null) {
                    return;
                }
            } else {
                Intrinsics.checkNotNullParameter(animator, "");
                this.onWarmupCompleted.element = false;
                this.onNavigationEvent.setScaleX(1.0f);
                valueAnimatorOnNavigationEvent = AnimateLogoFlipView.onNavigationEvent(this.onNavigationEvent);
                if (valueAnimatorOnNavigationEvent == null) {
                    return;
                }
            }
            valueAnimatorOnNavigationEvent.start();
            int i3 = onExtraCallback + 61;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private final void onNavigationEvent() {
        int i = 2 % 2;
        if (this.IAuthTabCallback >= CollectionsKt.getLastIndex(this.onExtraCallback)) {
            this.IAuthTabCallback = 0;
        } else {
            this.IAuthTabCallback++;
            int i2 = IAuthTabCallback_Parcel + 25;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
        }
        onWarmupCompleted(this.onExtraCallback.get(this.IAuthTabCallback));
        int i4 = IAuthTabCallbackStub + 47;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        Bitmap bitmapOnNavigationEvent = onNavigationEvent(this.onExtraCallback.get(this.IAuthTabCallback));
        if (bitmapOnNavigationEvent != null) {
            int i2 = IAuthTabCallbackStub + 121;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            this.asBinder.set(0, 0, bitmapOnNavigationEvent.getWidth(), bitmapOnNavigationEvent.getHeight());
            if (bitmapOnNavigationEvent.getWidth() > bitmapOnNavigationEvent.getHeight()) {
                int height = (int) (bitmapOnNavigationEvent.getHeight() * (getMeasuredWidth() / bitmapOnNavigationEvent.getWidth()));
                int measuredHeight = (getMeasuredHeight() - height) / 2;
                this.onExtraCallbackWithResult.set(0, 0, getMeasuredWidth(), height);
                this.onExtraCallbackWithResult.offset(0, measuredHeight);
                int i4 = IAuthTabCallbackStub + 67;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
            } else {
                int width = (int) (bitmapOnNavigationEvent.getWidth() * (getMeasuredHeight() / bitmapOnNavigationEvent.getHeight()));
                int measuredWidth = (getMeasuredWidth() - width) / 2;
                this.onExtraCallbackWithResult.set(0, 0, width, getMeasuredHeight());
                this.onExtraCallbackWithResult.offset(measuredWidth, 0);
            }
            canvas.drawBitmap(bitmapOnNavigationEvent, this.asBinder, this.onExtraCallbackWithResult, this.onWarmupCompleted);
        }
    }

    @Override // im.toss.tds.view.component.anim.logo.AnimateLogoView, android.view.View
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 59;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.onNavigationEvent;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            int i4 = IAuthTabCallback_Parcel + 19;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
        removeCallbacks(this.onTransact);
        int i6 = IAuthTabCallbackStub + 119;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
    }
}
