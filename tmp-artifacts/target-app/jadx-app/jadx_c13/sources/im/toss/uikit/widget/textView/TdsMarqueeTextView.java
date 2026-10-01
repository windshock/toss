package im.toss.uikit.widget.textView;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import im.toss.features.home.ui.view.currency.CurrencyCalculatorActivity;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.uikit.widget.textView.TdsMarqueeTextView$;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.Address;
import o.AppLovinSdkSettings;
import o.getExtraParameters;
import o.isFireOS;
import o.isMuted;
import o.response;
import o.setDone;
import o.setHasUserConsent;
import o.setTagsokhttp;
import o.shouldFailAdDisplayIfDontKeepActivitiesIsEnabled;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TdsMarqueeTextView extends View {
    private static int IAuthTabCallbackStub = 0;
    private static int getInterfaceDescriptor = 1;
    private final Paint IAuthTabCallback;
    private final Paint IAuthTabCallbackDefault;
    private float asBinder;
    private float asInterface;
    private Rally onExtraCallback;
    private float onExtraCallbackWithResult;
    private float onNavigationEvent;
    private String onTransact;
    private ValueAnimator onWarmupCompleted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TdsMarqueeTextView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void onExtraCallback(TdsMarqueeTextView tdsMarqueeTextView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 113;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(tdsMarqueeTextView, valueAnimator);
        if (i3 != 0) {
            throw null;
        }
        int i4 = getInterfaceDescriptor + 113;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TdsMarqueeTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.onTransact = "25.03.13 12:32:11 • ";
        Paint paint = new Paint(1);
        paint.setColor(Color.parseColor("#40A2FFFC"));
        paint.setTextSize(varyMatches.onExtraCallback(this, 13));
        this.IAuthTabCallbackDefault = paint;
        this.asBinder = 50.0f;
        this.onExtraCallbackWithResult = setTagsokhttp.onExtraCallbackWithResult(this, 60);
        this.IAuthTabCallback = new Paint();
        onExtraCallback();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TdsMarqueeTextView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = IAuthTabCallbackStub + 87;
            int i3 = i2 % 128;
            getInterfaceDescriptor = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 125;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 2;
            } else {
                int i6 = 2 % 2;
            }
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public static final /* synthetic */ Paint onNavigationEvent(TdsMarqueeTextView tdsMarqueeTextView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub;
        int i3 = i2 + 11;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Paint paint = tdsMarqueeTextView.IAuthTabCallbackDefault;
        int i5 = i2 + 43;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 52 / 0;
        }
        return paint;
    }

    public final void setupTargetText(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + Imgproc.COLOR_YUV2RGB_YVYU;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onTransact = str;
            onExtraCallback();
            requestLayout();
            return;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.onTransact = str;
        onExtraCallback();
        requestLayout();
        int i3 = 53 / 0;
    }

    public static final class onWarmupCompleted implements shouldFailAdDisplayIfDontKeepActivitiesIsEnabled {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ setHasUserConsent onNavigationEvent;

        onWarmupCompleted(setHasUserConsent sethasuserconsent) {
            this.onNavigationEvent = sethasuserconsent;
        }

        public /* bridge */ void IAuthTabCallback(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 97;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.IAuthTabCallback(f);
            if (i3 == 0) {
                throw null;
            }
        }

        public /* bridge */ void onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallback(f);
            int i4 = onExtraCallback + 11;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 90 / 0;
            }
        }

        public /* bridge */ void onExtraCallbackWithResult(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 53;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(f);
            int i4 = onExtraCallback + 15;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 82 / 0;
            }
        }

        public /* bridge */ void onExtraCallbackWithResult(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onExtraCallbackWithResult(obj);
            int i4 = onExtraCallbackWithResult + 75;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        public /* bridge */ void onWarmupCompleted(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            super.onWarmupCompleted(f);
            int i4 = onExtraCallback + 21;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onNavigationEvent(float f) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 49;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                TdsMarqueeTextView.onNavigationEvent(TdsMarqueeTextView.this).setColor(this.onNavigationEvent.IAuthTabCallback(f).intValue());
                TdsMarqueeTextView.this.invalidate();
                int i3 = onExtraCallback + 89;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            TdsMarqueeTextView.onNavigationEvent(TdsMarqueeTextView.this).setColor(this.onNavigationEvent.IAuthTabCallback(f).intValue());
            TdsMarqueeTextView.this.invalidate();
            throw null;
        }
    }

    public final void setFontColor(int i) {
        int i2 = 2 % 2;
        setHasUserConsent sethasuserconsent = new setHasUserConsent(this.IAuthTabCallbackDefault.getColor(), i);
        Rally rally = this.onExtraCallback;
        if (rally != null) {
            int i3 = IAuthTabCallbackStub + 15;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            rally.ICustomTabsServiceStub();
            int i5 = getInterfaceDescriptor + 61;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        }
        this.onExtraCallback = isFireOS.onExtraCallbackWithResult(RallysKt.IAuthTabCallback(new onWarmupCompleted(sethasuserconsent), (AppLovinSdkSettings) AppLovinSdkSettings.onExtraCallbackWithResult(CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback(), 1045515484, new Object[]{isMuted.onNavigationEvent(new AppLovinSdkSettings(), Float.valueOf(0.0f), Float.valueOf(1.0f), (Function1) null, 4, (Object) null).onWarmupCompleted(Address.onNavigationEvent.asBinder()), 300}, -1045515484, CurrencyCalculatorActivity.onNavigationEvent.2.onExtraCallback()), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 2044, (Object) null), false, 1, (Object) null);
        int i7 = IAuthTabCallbackStub + 99;
        getInterfaceDescriptor = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void setFont(@NotNull response responseVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + Imgproc.COLOR_YUV2RGB_YVYU;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(responseVar, "");
        Paint paint = this.IAuthTabCallbackDefault;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        paint.setTypeface(response.toTypeface$default(responseVar, context, (setDone) null, 2, (Object) null));
        this.IAuthTabCallbackDefault.setFontFeatureSettings("tnum");
        onExtraCallback();
        requestLayout();
        int i4 = IAuthTabCallbackStub + 17;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setFontSize(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 97;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            this.IAuthTabCallbackDefault.setTextSize(f);
            onExtraCallback();
            requestLayout();
        } else {
            this.IAuthTabCallbackDefault.setTextSize(f);
            onExtraCallback();
            requestLayout();
            throw null;
        }
    }

    public final void setScrollSpeed(float f) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.asBinder = f;
            onExtraCallbackWithResult();
            int i3 = getInterfaceDescriptor + 59;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.asBinder = f;
        onExtraCallbackWithResult();
        throw null;
    }

    public final void setFadingEdge(float f) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 107;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallbackWithResult = f;
            invalidate();
            int i3 = IAuthTabCallbackStub + 69;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.onExtraCallbackWithResult = f;
        invalidate();
        throw null;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 13;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        onExtraCallback();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = (int) (this.asInterface + getPaddingLeft() + getPaddingRight());
        if (mode == Integer.MIN_VALUE) {
            size = RangesKt___RangesKt.coerceAtMost(paddingLeft, size);
        } else if (mode != 1073741824) {
            int i6 = getInterfaceDescriptor + 23;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            size = paddingLeft;
        }
        setMeasuredDimension(size, View.resolveSize(((int) (this.IAuthTabCallbackDefault.descent() - this.IAuthTabCallbackDefault.ascent())) + getPaddingTop() + getPaddingBottom(), i2));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        super.onSizeChanged(i, i2, i3, i4);
        float f = i;
        float f2 = this.onExtraCallbackWithResult;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f, 0.0f, new int[]{0, -1, -1, 0}, new float[]{0.0f, f2 / f, (f - f2) / f, 1.0f}, Shader.TileMode.CLAMP);
        Paint paint = this.IAuthTabCallback;
        paint.setShader(linearGradient);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        onExtraCallbackWithResult();
        int i6 = getInterfaceDescriptor + 35;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.onWarmupCompleted;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            int i2 = IAuthTabCallbackStub + 43;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
        }
        Rally rally = this.onExtraCallback;
        if (rally != null) {
            rally.ICustomTabsServiceStub();
        }
        int i4 = getInterfaceDescriptor + 1;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IAuthTabCallback() {
        int i = 2 % 2;
        float f = this.asInterface;
        Object obj = null;
        if (f <= 0.0f) {
            int i2 = getInterfaceDescriptor + 29;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        long j = (long) ((f / this.asBinder) * 1000.0f);
        ValueAnimator valueAnimator = this.onWarmupCompleted;
        if (valueAnimator != null) {
            int i3 = getInterfaceDescriptor + 67;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                valueAnimator.cancel();
                throw null;
            }
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.asInterface);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(Address.onNavigationEvent.asInterface());
        valueAnimatorOfFloat.addUpdateListener(new TdsMarqueeTextView$.ExternalSyntheticLambda0(this));
        valueAnimatorOfFloat.start();
        this.onWarmupCompleted = valueAnimatorOfFloat;
    }

    private static final void onNavigationEvent(TdsMarqueeTextView tdsMarqueeTextView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        tdsMarqueeTextView.onNavigationEvent = -((Float) animatedValue).floatValue();
        tdsMarqueeTextView.invalidate();
        int i4 = IAuthTabCallbackStub + 55;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        if (!(!isAttachedToWindow())) {
            int i4 = IAuthTabCallbackStub + 61;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            IAuthTabCallback();
            if (i5 == 0) {
                throw null;
            }
        }
        int i6 = IAuthTabCallbackStub + 113;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        float height = getHeight() / 2.0f;
        float fDescent = (this.IAuthTabCallbackDefault.descent() + this.IAuthTabCallbackDefault.ascent()) / 2.0f;
        float f = this.onNavigationEvent;
        int i2 = getInterfaceDescriptor + 33;
        while (true) {
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            if (f >= getWidth() + this.asInterface) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.IAuthTabCallback);
                canvas.restoreToCount(iSaveLayer);
                return;
            } else {
                canvas.drawText(this.onTransact, f, height - fDescent, this.IAuthTabCallbackDefault);
                f += this.asInterface;
                i2 = getInterfaceDescriptor + 41;
            }
        }
    }

    private final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 95;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        this.asInterface = this.IAuthTabCallbackDefault.measureText(this.onTransact);
        int i4 = IAuthTabCallbackStub + 29;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
