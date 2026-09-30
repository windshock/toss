package im.toss.uikit.widget.underlay;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import im.toss.tds.view.component.anim.text.AnimateText;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.VideoEncoderInfoImplExternalSyntheticLambda0;
import o.WebSocketFactory;
import o.getCurrentBacktraceOrBuilderList;
import o.readTimeout;
import o.response;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class UnderlayTextView extends FrameLayout {
    private static final onExtraCallbackWithResult Companion;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access000 = 1;
    private static int access100 = 1;
    private static int getInterfaceDescriptor;
    public static final int onNavigationEvent = 8;
    private float IAuthTabCallback;
    private ValueAnimator IAuthTabCallbackDefault;
    private final Paint IAuthTabCallbackStub;
    private final AnimateText IAuthTabCallbackStubProxy;
    private float asBinder;
    private final Paint asInterface;
    private float onExtraCallback;
    private int onExtraCallbackWithResult;
    private ValueAnimator onTransact;
    private float onWarmupCompleted;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        int i = IAuthTabCallback_Parcel + 7;
        access100 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(UnderlayTextView underlayTextView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(underlayTextView, valueAnimator);
        int i4 = access000 + 9;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i) | i2);
        int i8 = (~((~i2) | (~i6))) | i7;
        int i9 = i2 | i6;
        int i10 = i2 + i6 + i4 + ((-39394691) * i3) + ((-2104995841) * i5);
        int i11 = i10 * i10;
        int i12 = (i2 * (-1880913482)) + 198443008 + ((-1880913482) * i6) + ((-1126725195) * i7) + (i8 * 1126725195) + (1126725195 * i9) + ((-754188288) * i4) + ((-1529085952) * i3) + ((-319553536) * i5) + ((-289079296) * i11);
        int i13 = ((i2 * 1773844906) - 1404835566) + (i6 * 1773844906) + (i7 * (-613)) + (i8 * 613) + (i9 * 613) + (i4 * 1773845519) + (i3 * 1055723859) + (i5 * 1996616689) + (i11 * (-1450508288));
        if (i12 + (i13 * i13 * (-778371072)) != 1) {
            return IAuthTabCallback(objArr);
        }
        UnderlayTextView underlayTextView = (UnderlayTextView) objArr[0];
        int i14 = 2 % 2;
        int i15 = getInterfaceDescriptor + 39;
        access000 = i15 % 128;
        int i16 = i15 % 2;
        ValueAnimator valueAnimator = underlayTextView.onTransact;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = underlayTextView.IAuthTabCallbackDefault;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            int i17 = access000 + 35;
            getInterfaceDescriptor = i17 % 128;
            int i18 = i17 % 2;
        }
        underlayTextView.onTransact = null;
        underlayTextView.IAuthTabCallbackDefault = null;
        underlayTextView.asBinder = 0.0f;
        underlayTextView.onExtraCallback = 0.0f;
        underlayTextView.asInterface.setAlpha(0);
        underlayTextView.invalidate();
        return null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(UnderlayTextView underlayTextView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(underlayTextView, valueAnimator);
        int i4 = access000 + 71;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnderlayTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        AnimateText animateText = new AnimateText(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        animateText.setTextAlignment(4);
        animateText.setTextColor(-1);
        this.IAuthTabCallbackStubProxy = animateText;
        this.onExtraCallbackWithResult = -1;
        Paint paint = new Paint(1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        paint.setXfermode(new PorterDuffXfermode(mode));
        this.IAuthTabCallbackStub = paint;
        Paint paint2 = new Paint(1);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.asInterface = paint2;
        setClipChildren(false);
        setLayerType(1, null);
        addView((View) animateText, (ViewGroup.LayoutParams) new FrameLayout.LayoutParams(-2, -2, 17));
    }

    public final void setMeasuredTextWidth(float f) {
        int i = 2 % 2;
        int i2 = access000 + 55;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback = f;
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
    }

    public final float IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 99;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        float f = this.onWarmupCompleted;
        int i4 = i2 + 77;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
        return f;
    }

    public final void setMeasuredTextHeight(float f) {
        int i = 2 % 2;
        int i2 = access000 + 77;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        this.onWarmupCompleted = f;
        int i5 = i3 + 1;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = access000 + 119;
        getInterfaceDescriptor = i6 % 128;
        int i7 = i6 % 2;
        super.onLayout(z, i, i2, i3, i4);
        onNavigationEvent();
        int i8 = access000 + 85;
        getInterfaceDescriptor = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    private final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access000 + 31;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        if (getWidth() > 0) {
            int i4 = access000 + 29;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 != 0) {
                getHeight();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (getHeight() > 0) {
                IAuthTabCallbackDefault();
                onExtraCallback();
                invalidate();
                int i5 = access000 + 61;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
            }
        }
    }

    private final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        this.IAuthTabCallbackStub.setShader(new RadialGradient(getWidth() / 2.0f, getHeight() / 2.0f, getWidth() / 2.0f, new int[]{-1, -1, this.onExtraCallbackWithResult}, new float[]{0.0f, 0.15f, 1.0f}, Shader.TileMode.CLAMP));
        int i2 = access000 + 99;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onExtraCallback() {
        int i = 2 % 2;
        float f = this.asBinder * 290.0f;
        float f2 = f + 40.0f;
        float fCoerceIn = RangesKt___RangesKt.coerceIn((f - 40.0f) / f2, 0.0f, 1.0f);
        float fCoerceIn2 = RangesKt___RangesKt.coerceIn(f / f2, 0.0f, 1.0f);
        this.asInterface.setShader(new RadialGradient(getWidth() / 2.0f, getHeight() * (-0.3f), f2, new int[]{0, 0, VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(-1, 102), VideoEncoderInfoImplExternalSyntheticLambda0.IAuthTabCallback(this.onExtraCallbackWithResult, 128), 0}, (float[]) onExtraCallbackWithResult(new Object[]{this, new float[]{0.0f, fCoerceIn, fCoerceIn2, RangesKt___RangesKt.coerceAtMost(0.05f + fCoerceIn2, 1.0f), 1.0f}}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), 718036434, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -718036434), Shader.TileMode.CLAMP));
        int i2 = access000 + 71;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 52 / 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.dispatchDraw(canvas);
        if (this.IAuthTabCallbackStub.getShader() != null) {
            int i2 = getInterfaceDescriptor + 5;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            this.IAuthTabCallbackStub.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.IAuthTabCallbackStub);
        }
        if (this.onExtraCallback > 0.0f) {
            int i4 = getInterfaceDescriptor + 105;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            if (this.asInterface.getShader() == null) {
                return;
            }
            this.asInterface.setAlpha(getCurrentBacktraceOrBuilderList.onNavigationEvent(this.onExtraCallback * 255.0f));
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.asInterface);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = access000 + 19;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(new Object[]{this}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), 811292533, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -811292532);
        super.onDetachedFromWindow();
        int i4 = access000 + 67;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
    }

    public final void setFont(@NotNull response responseVar) {
        int i = 2 % 2;
        int i2 = access000 + 17;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(responseVar, "");
        this.IAuthTabCallbackStubProxy.setFont(responseVar);
        int i4 = access000 + 77;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
    }

    public final void setTypography(int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 89;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            this.IAuthTabCallbackStubProxy.setTypography(i);
            onNavigationEvent();
            int i4 = 33 / 0;
        } else {
            this.IAuthTabCallbackStubProxy.setTypography(i);
            onNavigationEvent();
        }
    }

    public final void setSubTypography(int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 69;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            this.IAuthTabCallbackStubProxy.setSubTypography(i);
            onNavigationEvent();
            int i4 = getInterfaceDescriptor + 65;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.IAuthTabCallbackStubProxy.setSubTypography(i);
        onNavigationEvent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setPrimaryColor(int i) {
        int i2 = 2 % 2;
        int i3 = getInterfaceDescriptor + 37;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallbackWithResult = i;
        onNavigationEvent();
        int i5 = getInterfaceDescriptor + 31;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 67 / 0;
        }
    }

    public final void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = access000 + 65;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        float fMeasureText = this.IAuthTabCallbackStubProxy.onPostMessage().measureText(str);
        this.IAuthTabCallback = fMeasureText;
        this.onWarmupCompleted = this.IAuthTabCallbackStubProxy.onNavigationEvent(str, (int) fMeasureText);
        AnimateText.onExtraCallback(this.IAuthTabCallbackStubProxy, str, readTimeout.IAuthTabCallbackDefault.IAuthTabCallback.onExtraCallbackWithResult, 0, AnimateText.onNavigationEvent.CENTER, false, false, (Function0) null, (Function0) null, (Function0) null, 484, (Object) null);
        int i4 = getInterfaceDescriptor + Imgproc.COLOR_YUV2RGBA_YVYU;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onExtraCallback(UnderlayTextView underlayTextView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = access000 + 63;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        underlayTextView.asBinder = ((Float) animatedValue).floatValue();
        if (underlayTextView.getWidth() > 0) {
            int i4 = getInterfaceDescriptor + 103;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            if (underlayTextView.getHeight() > 0) {
                int i6 = getInterfaceDescriptor + 27;
                access000 = i6 % 128;
                int i7 = i6 % 2;
                underlayTextView.onExtraCallback();
                underlayTextView.invalidate();
            }
        }
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        onExtraCallbackWithResult(new Object[]{this}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), 811292533, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -811292532);
        this.asBinder = 0.0f;
        this.onExtraCallback = 0.0f;
        onNavigationEvent();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setStartDelay(1300L);
        valueAnimatorOfFloat.setDuration(4000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.underlay.UnderlayTextView$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 87;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                UnderlayTextView.IAuthTabCallback(this.f$0, valueAnimator);
                int i5 = onExtraCallbackWithResult + 17;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        valueAnimatorOfFloat.start();
        this.onTransact = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setStartDelay(1300L);
        valueAnimatorOfFloat2.setDuration(300L);
        valueAnimatorOfFloat2.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.uikit.widget.underlay.UnderlayTextView$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 5;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                UnderlayTextView.onExtraCallbackWithResult(this.f$0, valueAnimator);
                int i5 = IAuthTabCallback + 21;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        valueAnimatorOfFloat2.start();
        this.IAuthTabCallbackDefault = valueAnimatorOfFloat2;
        int i2 = getInterfaceDescriptor + 7;
        access000 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void onNavigationEvent(UnderlayTextView underlayTextView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 41;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "");
            underlayTextView.onExtraCallback = ((Float) animatedValue).floatValue();
            underlayTextView.invalidate();
            throw null;
        }
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue2, "");
        underlayTextView.onExtraCallback = ((Float) animatedValue2).floatValue();
        underlayTextView.invalidate();
        int i3 = access000 + 7;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        float fCoerceIn;
        int i = 0;
        float[] fArr = (float[]) objArr[1];
        int i2 = 2 % 2;
        float[] fArr2 = new float[fArr.length];
        int lastIndex = ArraysKt___ArraysKt.getLastIndex(fArr);
        int length = fArr.length;
        int i3 = 0;
        while (i < length) {
            float f = fArr[i];
            if (i3 == 0) {
                fCoerceIn = 0.0f;
            } else if (i3 == lastIndex) {
                int i4 = access000 + 81;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                fCoerceIn = 1.0f;
            } else {
                fCoerceIn = RangesKt___RangesKt.coerceIn(f, fArr2[i3 - 1] + 1.0E-4f, 1.0f - ((lastIndex - i3) * 1.0E-4f));
                int i6 = getInterfaceDescriptor + 105;
                access000 = i6 % 128;
                int i7 = i6 % 2;
            }
            fArr2[i3] = fCoerceIn;
            i++;
            i3++;
        }
        int i8 = access000 + 49;
        getInterfaceDescriptor = i8 % 128;
        if (i8 % 2 == 0) {
            return fArr2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    private final float[] onWarmupCompleted(float... fArr) {
        return (float[]) onExtraCallbackWithResult(new Object[]{this, fArr}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), 718036434, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -718036434);
    }

    public final void onExtraCallbackWithResult() {
        onExtraCallbackWithResult(new Object[]{this}, WebSocketFactory.onExtraCallback.IAuthTabCallback(), 811292533, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -811292532);
    }
}
