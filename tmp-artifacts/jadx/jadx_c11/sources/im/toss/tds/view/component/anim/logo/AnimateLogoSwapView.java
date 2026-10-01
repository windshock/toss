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
import o.Address;
import o.getProxyokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AnimateLogoSwapView extends AnimateLogoView {
    private static int access100 = 0;
    private static int getInterfaceDescriptor = 1;
    private ValueAnimator IAuthTabCallback;
    private final boolean IAuthTabCallbackDefault;
    private onWarmupCompleted IAuthTabCallbackStub;
    private Rect IAuthTabCallback_Parcel;
    private final IAuthTabCallback access000;
    private int asBinder;
    private Rect asInterface;
    private final List<getProxyokhttp> onExtraCallback;
    private onWarmupCompleted onExtraCallbackWithResult;
    private int onNavigationEvent;
    private long onTransact;
    private final Paint onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimateLogoSwapView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimateLogoSwapView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void IAuthTabCallback(AnimateLogoSwapView animateLogoSwapView) {
        int i = 2 % 2;
        int i2 = access100 + 5;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(animateLogoSwapView);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(AnimateLogoSwapView animateLogoSwapView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = access100 + 63;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(animateLogoSwapView, valueAnimator);
        int i4 = getInterfaceDescriptor + 9;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.getProxySelectorokhttp
    public boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = access100 + 63;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 63;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateLogoSwapView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = new ArrayList();
        this.asBinder = -1;
        this.onNavigationEvent = -1;
        Paint paint = new Paint();
        boolean z = true;
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.onWarmupCompleted = paint;
        this.IAuthTabCallback_Parcel = new Rect();
        this.asInterface = new Rect();
        this.onTransact = 1670L;
        this.access000 = new IAuthTabCallback();
        if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) <= 0.0f) {
            int i2 = getInterfaceDescriptor + 17;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = false;
        }
        this.IAuthTabCallbackDefault = z;
        int i5 = getInterfaceDescriptor + 43;
        access100 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AnimateLogoSwapView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = getInterfaceDescriptor + 73;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = access100 + 11;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(AnimateLogoSwapView animateLogoSwapView) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 67;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        animateLogoSwapView.IAuthTabCallback();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ ValueAnimator onNavigationEvent(AnimateLogoSwapView animateLogoSwapView) {
        int i = 2 % 2;
        int i2 = access100 + 101;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        ValueAnimator valueAnimator = animateLogoSwapView.IAuthTabCallback;
        int i5 = i3 + 113;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            return valueAnimator;
        }
        throw null;
    }

    public long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 87;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onTransact;
        }
        int i3 = 61 / 0;
        return this.onTransact;
    }

    @Override // im.toss.tds.view.component.anim.logo.AnimateLogoView
    public void setEachDuration(long j) {
        int i = 2 % 2;
        int i2 = access100 + 73;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        this.onTransact = j;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 63;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final class IAuthTabCallback implements Runnable {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        IAuthTabCallback() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 7;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            AnimateLogoSwapView.onExtraCallbackWithResult(AnimateLogoSwapView.this);
            AnimateLogoSwapView.this.invalidate();
            AnimateLogoSwapView.this.postDelayed(this, 1000L);
            int i4 = onNavigationEvent + 17;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 48 / 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0058, code lost:
    
        if ((r5 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        postDelayed(r4.access000, 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
    
        postDelayed(r4.access000, 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        postDelayed(new im.toss.tds.view.component.anim.logo.AnimateLogoSwapView$$ExternalSyntheticLambda1(r4), 500);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        if (r4.IAuthTabCallbackDefault == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004b, code lost:
    
        if (r4.IAuthTabCallbackDefault != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
    
        r5 = im.toss.tds.view.component.anim.logo.AnimateLogoSwapView.getInterfaceDescriptor + 113;
        im.toss.tds.view.component.anim.logo.AnimateLogoSwapView.access100 = r5 % 128;
     */
    @Override // o.getProxySelectorokhttp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(@NotNull List<getProxyokhttp> list) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(list, "");
            this.onExtraCallback.clear();
            this.onExtraCallback.addAll(list);
            this.asBinder = -1;
            IAuthTabCallback();
            invalidate();
            int i3 = 23 / 0;
        } else {
            Intrinsics.checkNotNullParameter(list, "");
            this.onExtraCallback.clear();
            this.onExtraCallback.addAll(list);
            this.asBinder = -1;
            IAuthTabCallback();
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
      0x001b: PHI (r1v5 android.animation.ValueAnimator) = (r1v4 android.animation.ValueAnimator), (r1v9 android.animation.ValueAnimator) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onExtraCallback(final AnimateLogoSwapView animateLogoSwapView) {
        ValueAnimator valueAnimator;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            valueAnimator = animateLogoSwapView.IAuthTabCallback;
            int i3 = 2 / 0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        } else {
            valueAnimator = animateLogoSwapView.IAuthTabCallback;
            if (valueAnimator != null) {
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.tds.view.component.anim.logo.AnimateLogoSwapView$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i4 = 2 % 2;
                int i5 = onExtraCallbackWithResult + 111;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                AnimateLogoSwapView.onNavigationEvent(this.f$0, valueAnimator2);
                if (i6 != 0) {
                    int i7 = 93 / 0;
                }
            }
        });
        valueAnimatorOfFloat.addListener(animateLogoSwapView.new onNavigationEvent());
        valueAnimatorOfFloat.setDuration(animateLogoSwapView.onNavigationEvent());
        valueAnimatorOfFloat.setInterpolator(Address.onNavigationEvent.IAuthTabCallbackStub());
        valueAnimatorOfFloat.start();
        animateLogoSwapView.IAuthTabCallback = valueAnimatorOfFloat;
        int i4 = access100 + 95;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[PHI: r1 r6
      0x003f: PHI (r1v5 im.toss.tds.view.component.anim.logo.AnimateLogoSwapView$onWarmupCompleted) = 
      (r1v4 im.toss.tds.view.component.anim.logo.AnimateLogoSwapView$onWarmupCompleted)
      (r1v15 im.toss.tds.view.component.anim.logo.AnimateLogoSwapView$onWarmupCompleted)
     binds: [B:8:0x003d, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x003f: PHI (r6v4 float) = (r6v3 float), (r6v12 float) binds: [B:8:0x003d, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void onWarmupCompleted(AnimateLogoSwapView animateLogoSwapView, ValueAnimator valueAnimator) {
        float fFloatValue;
        onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 51;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            fFloatValue = ((Float) animatedValue).floatValue();
            onwarmupcompleted = animateLogoSwapView.IAuthTabCallbackStub;
            int i3 = 27 / 0;
            if (onwarmupcompleted != null) {
                onwarmupcompleted.onExtraCallbackWithResult(1.0f - fFloatValue);
            }
        } else {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue2, "");
            fFloatValue = ((Float) animatedValue2).floatValue();
            onwarmupcompleted = animateLogoSwapView.IAuthTabCallbackStub;
            if (onwarmupcompleted != null) {
            }
        }
        onWarmupCompleted onwarmupcompleted2 = animateLogoSwapView.onExtraCallbackWithResult;
        if (onwarmupcompleted2 != null) {
            int i4 = access100 + 65;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 == 0) {
                onwarmupcompleted2.onExtraCallbackWithResult(fFloatValue);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            onwarmupcompleted2.onExtraCallbackWithResult(fFloatValue);
        }
        float measuredWidth = animateLogoSwapView.getMeasuredWidth() / 2.0f;
        onWarmupCompleted onwarmupcompleted3 = animateLogoSwapView.IAuthTabCallbackStub;
        if (onwarmupcompleted3 != null) {
            onwarmupcompleted3.onWarmupCompleted((int) (measuredWidth * fFloatValue));
            int i5 = getInterfaceDescriptor + 11;
            access100 = i5 % 128;
            int i6 = i5 % 2;
        }
        onWarmupCompleted onwarmupcompleted4 = animateLogoSwapView.onExtraCallbackWithResult;
        if (onwarmupcompleted4 != null) {
            onwarmupcompleted4.onWarmupCompleted((int) (((1.0f - fFloatValue) * animateLogoSwapView.getMeasuredWidth()) / 8.0f));
        }
        animateLogoSwapView.invalidate();
    }

    public static final class onNavigationEvent extends AnimatorListenerAdapter {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        onNavigationEvent() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            AnimateLogoSwapView.onExtraCallbackWithResult(AnimateLogoSwapView.this);
            ValueAnimator valueAnimatorOnNavigationEvent = AnimateLogoSwapView.onNavigationEvent(AnimateLogoSwapView.this);
            if (valueAnimatorOnNavigationEvent != null) {
                int i2 = onExtraCallback + 109;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                valueAnimatorOnNavigationEvent.start();
            }
            int i4 = onExtraCallback + 81;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    private final void IAuthTabCallback() {
        int i = 2 % 2;
        if (this.asBinder >= CollectionsKt.getLastIndex(this.onExtraCallback)) {
            this.asBinder = 0;
            int i2 = access100 + 1;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 % 4;
            }
        } else {
            this.asBinder++;
        }
        this.onNavigationEvent = this.asBinder >= CollectionsKt.getLastIndex(this.onExtraCallback) ? 0 : this.asBinder + 1;
        onWarmupCompleted(this.onExtraCallback.get(this.asBinder));
        onWarmupCompleted(this.onExtraCallback.get(this.onNavigationEvent));
        this.IAuthTabCallbackStub = new onWarmupCompleted(this.onExtraCallback.get(this.asBinder), 0, 1.0f);
        this.onExtraCallbackWithResult = new onWarmupCompleted(this.onExtraCallback.get(this.onNavigationEvent), 0, 0.0f);
        int i4 = getInterfaceDescriptor + 71;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if (r0 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r0 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        onExtraCallbackWithResult(r5, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        throw new java.lang.IllegalArgumentException();
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onDraw(@NotNull Canvas canvas) {
        float fOnExtraCallback;
        onWarmupCompleted onwarmupcompleted;
        int i = 2 % 2;
        int i2 = access100 + 69;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        if (this.onExtraCallback.isEmpty()) {
            return;
        }
        if (this.IAuthTabCallbackDefault) {
            onWarmupCompleted onwarmupcompleted2 = this.IAuthTabCallbackStub;
            if (onwarmupcompleted2 != null) {
                int i4 = getInterfaceDescriptor + 67;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                fOnExtraCallback = onwarmupcompleted2.onExtraCallback();
            } else {
                fOnExtraCallback = 0.0f;
            }
            if (fOnExtraCallback < 0.5f) {
                onWarmupCompleted onwarmupcompleted3 = this.IAuthTabCallbackStub;
                if (onwarmupcompleted3 == null) {
                    throw new IllegalArgumentException();
                }
                onExtraCallbackWithResult(canvas, onwarmupcompleted3);
                onWarmupCompleted onwarmupcompleted4 = this.onExtraCallbackWithResult;
                if (onwarmupcompleted4 == null) {
                    throw new IllegalArgumentException();
                }
                int i6 = getInterfaceDescriptor + 97;
                access100 = i6 % 128;
                int i7 = i6 % 2;
                onExtraCallbackWithResult(canvas, onwarmupcompleted4);
                return;
            }
            onWarmupCompleted onwarmupcompleted5 = this.onExtraCallbackWithResult;
            if (onwarmupcompleted5 == null) {
                throw new IllegalArgumentException();
            }
            onExtraCallbackWithResult(canvas, onwarmupcompleted5);
            onWarmupCompleted onwarmupcompleted6 = this.IAuthTabCallbackStub;
            if (onwarmupcompleted6 == null) {
                throw new IllegalArgumentException();
            }
            int i8 = getInterfaceDescriptor + 41;
            access100 = i8 % 128;
            if (i8 % 2 == 0) {
                onExtraCallbackWithResult(canvas, onwarmupcompleted6);
                return;
            } else {
                onExtraCallbackWithResult(canvas, onwarmupcompleted6);
                int i9 = 48 / 0;
                return;
            }
        }
        onWarmupCompleted onwarmupcompleted7 = this.onExtraCallbackWithResult;
        if (onwarmupcompleted7 == null) {
            throw new IllegalArgumentException();
        }
        int i10 = access100 + 113;
        getInterfaceDescriptor = i10 % 128;
        if (i10 % 2 == 0) {
            onExtraCallbackWithResult(canvas, onwarmupcompleted7);
            onwarmupcompleted = this.IAuthTabCallbackStub;
            int i11 = 11 / 0;
        } else {
            onExtraCallbackWithResult(canvas, onwarmupcompleted7);
            onwarmupcompleted = this.IAuthTabCallbackStub;
        }
    }

    private final void onExtraCallbackWithResult(Canvas canvas, onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        Bitmap bitmapOnNavigationEvent = onNavigationEvent(onwarmupcompleted.onWarmupCompleted());
        if (bitmapOnNavigationEvent != null) {
            this.IAuthTabCallback_Parcel.set(0, 0, bitmapOnNavigationEvent.getWidth(), bitmapOnNavigationEvent.getHeight());
            int iIAuthTabCallback = onwarmupcompleted.IAuthTabCallback();
            float fOnExtraCallback = onwarmupcompleted.onExtraCallback();
            if (bitmapOnNavigationEvent.getWidth() <= bitmapOnNavigationEvent.getHeight()) {
                int width = (int) (bitmapOnNavigationEvent.getWidth() * (getMeasuredHeight() / bitmapOnNavigationEvent.getHeight()));
                int measuredHeight = getMeasuredHeight();
                int measuredWidth = (getMeasuredWidth() - width) / 2;
                int i2 = (int) (width * fOnExtraCallback);
                int i3 = (int) (measuredHeight * fOnExtraCallback);
                int measuredHeight2 = (getMeasuredHeight() - i3) / 2;
                this.asInterface.set(iIAuthTabCallback, measuredHeight2, i2 + iIAuthTabCallback, i3 + measuredHeight2);
                this.asInterface.offset(measuredWidth, 0);
            } else {
                int i4 = access100 + 73;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                int measuredWidth2 = getMeasuredWidth();
                int height = (int) (bitmapOnNavigationEvent.getHeight() * (getMeasuredWidth() / bitmapOnNavigationEvent.getWidth()));
                int measuredHeight3 = (getMeasuredHeight() - height) / 2;
                int i6 = (int) (measuredWidth2 * fOnExtraCallback);
                int i7 = (int) (height * fOnExtraCallback);
                int measuredHeight4 = (getMeasuredHeight() - i7) / 2;
                this.asInterface.set(iIAuthTabCallback, measuredHeight4, i6 + iIAuthTabCallback, i7 + measuredHeight4);
                this.asInterface.offset(0, measuredHeight3);
            }
            canvas.drawBitmap(bitmapOnNavigationEvent, this.IAuthTabCallback_Parcel, this.asInterface, this.onWarmupCompleted);
        }
        int i8 = getInterfaceDescriptor + 37;
        access100 = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.tds.view.component.anim.logo.AnimateLogoView, android.view.View
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 105;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.IAuthTabCallback;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            int i4 = getInterfaceDescriptor + 45;
            access100 = i4 % 128;
            int i5 = i4 % 2;
        }
        removeCallbacks(this.access000);
    }

    static final class onWarmupCompleted {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        private final getProxyokhttp IAuthTabCallback;
        private float onExtraCallback;
        private int onNavigationEvent;

        public onWarmupCompleted(@NotNull getProxyokhttp getproxyokhttp, int i, float f) {
            Intrinsics.checkNotNullParameter(getproxyokhttp, "");
            this.IAuthTabCallback = getproxyokhttp;
            this.onNavigationEvent = i;
            this.onExtraCallback = f;
        }

        public final int IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            int i5 = this.onNavigationEvent;
            int i6 = i3 + 29;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final float onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 87;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            float f = this.onExtraCallback;
            int i4 = i3 + 23;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return f;
        }

        public final void onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback = f;
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final getProxyokhttp onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 99;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            getProxyokhttp getproxyokhttp = this.IAuthTabCallback;
            int i5 = i2 + 3;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                return getproxyokhttp;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onWarmupCompleted(int i) {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 71;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            this.onNavigationEvent = i;
            if (i5 == 0) {
                throw null;
            }
            int i6 = i3 + 1;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }
    }
}
