package im.toss.uikit.widget.textView;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.core.view.ViewCompat;
import com.facebook.shimmer.IAuthTabCallback;
import com.facebook.shimmer.onExtraCallbackWithResult;
import com.google.common.collect.Synchronized;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import im.toss.uikit.R;
import im.toss.uikit.widget.textView.TickerView$;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.calculateDurationInForegroundbugsnag_android_core_release;
import o.generateApp;
import o.populateRuntimeMemoryMetadata;
import o.response;
import o.setDone;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TickerView extends View {
    private static int ICustomTabsCallbackStub = 0;
    private static int ICustomTabsCallbackStubProxy = 1;
    private static int extraCommand = 1;
    private static int onUnminimized;
    private long IAuthTabCallback;
    private final ValueAnimator IAuthTabCallbackDefault;
    private final AttributeSet IAuthTabCallbackStub;
    private final float[] IAuthTabCallbackStubProxy;
    private final int IAuthTabCallback_Parcel;
    private int ICustomTabsCallback;
    private final Rect ICustomTabsCallbackDefault;
    private Paint access000;
    private int access100;
    private final Paint asBinder;
    private final generateApp asInterface;
    private int extraCallback;
    private final onExtraCallbackWithResult extraCallbackWithResult;
    private final int[] getInterfaceDescriptor;
    private int onActivityLayout;
    private String onActivityResized;
    private boolean onExtraCallbackWithResult;
    private int onMessageChannelReady;
    private CharSequence onMinimized;
    private final Paint onPostMessage;
    private float onRelationshipValidationResult;
    private Interpolator onTransact;
    private long onWarmupCompleted;
    private final calculateDurationInForegroundbugsnag_android_core_release readTypedObject;
    private onExtraCallbackWithResult writeTypedObject;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int onExtraCallback = 8;
    private static final AccelerateDecelerateInterpolator onNavigationEvent = new AccelerateDecelerateInterpolator();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TickerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TickerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ void onNavigationEvent(TickerView tickerView, onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 71;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(tickerView, onextracallbackwithresult);
        int i4 = ICustomTabsCallbackStubProxy + 83;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i2;
        int i8 = ~i4;
        int i9 = i8 | i3;
        int i10 = (~(i7 | i8)) | (~(i7 | i3)) | (~i9);
        int i11 = ~i3;
        int i12 = (~(i4 | i11 | i2)) | (~(i7 | i11 | i8)) | (~(i9 | i2));
        int i13 = ~(i8 | i11 | i2);
        int i14 = i3 + i2 + i6 + ((-973178360) * i) + (1542423572 * i5);
        int i15 = i14 * i14;
        int i16 = (((-1657973228) * i3) - 1073741824) + ((-187520530) * i2) + ((-735226349) * i10) + (i12 * 735226349) + (735226349 * i13) + ((-922746880) * i6) + (1207959552 * i) + ((-1275068416) * i5) + (196542464 * i15);
        int i17 = (i3 * (-490823948)) + 944362368 + (i2 * (-490821954)) + (i10 * (-997)) + (i12 * 997) + (i13 * 997) + (i6 * (-490822951)) + (i * 2145288392) + (i5 * 779328756) + (i15 * (-1138819072));
        int i18 = i16 + (i17 * i17 * 1440284672);
        return i18 != 1 ? i18 != 2 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ void onWarmupCompleted(TickerView tickerView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 37;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(tickerView, valueAnimator);
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        int i5 = ICustomTabsCallbackStubProxy + 23;
        ICustomTabsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setText(@Nullable String str) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 45;
        ICustomTabsCallbackStubProxy = i2 % 128;
        setText$default(this, str, i2 % 2 == 0, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TickerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallbackStub = attributeSet;
        this.IAuthTabCallback_Parcel = i;
        TextPaint textPaint = new TextPaint(1);
        this.onPostMessage = textPaint;
        calculateDurationInForegroundbugsnag_android_core_release calculatedurationinforegroundbugsnag_android_core_release = new calculateDurationInForegroundbugsnag_android_core_release(textPaint);
        this.readTypedObject = calculatedurationinforegroundbugsnag_android_core_release;
        this.asInterface = new generateApp(calculatedurationinforegroundbugsnag_android_core_release);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f);
        this.IAuthTabCallbackDefault = valueAnimatorOfFloat;
        this.ICustomTabsCallbackDefault = new Rect();
        this.access000 = new Paint();
        this.getInterfaceDescriptor = new int[]{16777215, -1996488705, -1};
        this.IAuthTabCallbackStubProxy = new float[]{0.0f, 0.9f, 1.0f};
        Paint paint = new Paint();
        this.asBinder = paint;
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult();
        this.extraCallbackWithResult = onextracallbackwithresult;
        this.writeTypedObject = onExtraCallbackWithResult.NONE;
        this.onMinimized = _UrlKt.FRAGMENT_ENCODE_SET;
        Resources resources = context.getResources();
        Intrinsics.checkNotNull(resources);
        onNavigationEvent onnavigationevent = new onNavigationEvent(this, resources);
        int[] iArr = R.styleable.TickerView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.TickerView_android_textAppearance, -1);
        if (resourceId != -1) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, iArr);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "");
            onnavigationevent.onExtraCallbackWithResult(typedArrayObtainStyledAttributes2);
            typedArrayObtainStyledAttributes2.recycle();
            int i2 = ICustomTabsCallbackStubProxy + 3;
            ICustomTabsCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        onnavigationevent.onExtraCallbackWithResult(typedArrayObtainStyledAttributes);
        this.onTransact = onNavigationEvent;
        this.IAuthTabCallback = 600L;
        this.onExtraCallbackWithResult = true;
        this.access100 = onnavigationevent.onExtraCallbackWithResult();
        if (onnavigationevent.onExtraCallback() != 0) {
            textPaint.setShadowLayer(onnavigationevent.IAuthTabCallbackStub(), onnavigationevent.onNavigationEvent(), ((Float) onNavigationEvent.IAuthTabCallback(-1589897006, new Object[]{onnavigationevent}, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1589897007, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent())).floatValue(), onnavigationevent.onExtraCallback());
        }
        if (((Integer) onNavigationEvent.IAuthTabCallback(-1459798757, new Object[]{onnavigationevent}, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1459798757, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent())).intValue() != 0) {
            int i5 = ICustomTabsCallbackStub + 103;
            ICustomTabsCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            textPaint.setTypeface(response.toTypeface$default(response.Companion.onExtraCallback(((Integer) onNavigationEvent.IAuthTabCallback(-1459798757, new Object[]{onnavigationevent}, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), 1459798757, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent())).intValue()), context, (setDone) null, 2, (Object) null));
            int i7 = 2 % 2;
        }
        setTextColor(onnavigationevent.IAuthTabCallbackDefault());
        setTextSize(onnavigationevent.IAuthTabCallback_Parcel());
        setSuffix(onnavigationevent.asInterface());
        setSuffixPadding(onnavigationevent.onTransact());
        onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -76763593, 76763594, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{this, new String[]{populateRuntimeMemoryMetadata.onExtraCallback.onWarmupCompleted()}});
        setText(onnavigationevent.asBinder(), false);
        typedArrayObtainStyledAttributes.recycle();
        valueAnimatorOfFloat.addUpdateListener(new TickerView$.ExternalSyntheticLambda1(this));
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: im.toss.uikit.widget.textView.TickerView.2
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                int i8 = 2 % 2;
                int i9 = IAuthTabCallback + 69;
                onExtraCallback = i9 % 128;
                if (i9 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(animator, "");
                    TickerView.onExtraCallback(TickerView.this).onNavigationEvent();
                    TickerView.IAuthTabCallback(TickerView.this);
                    TickerView.this.invalidate();
                    TickerView tickerView = TickerView.this;
                    tickerView.setState(TickerView.onExtraCallbackWithResult(tickerView));
                    return;
                }
                Intrinsics.checkNotNullParameter(animator, "");
                TickerView.onExtraCallback(TickerView.this).onNavigationEvent();
                TickerView.IAuthTabCallback(TickerView.this);
                TickerView.this.invalidate();
                TickerView tickerView2 = TickerView.this;
                tickerView2.setState(TickerView.onExtraCallbackWithResult(tickerView2));
                throw null;
            }
        });
        this.access000.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        onextracallbackwithresult.setCallback(this);
        IAuthTabCallback iAuthTabCallbackOnWarmupCompleted = new IAuthTabCallback.onNavigationEvent().asInterface(12040125).onTransact(15461357).onNavigationEvent(1.0f).onExtraCallbackWithResult(1.0f).onWarmupCompleted(false).onWarmupCompleted(1500L).IAuthTabCallbackDefault(0).IAuthTabCallbackStub(0.0f).IAuthTabCallback(1.0f).onExtraCallback(0.25f).IAuthTabCallback(0L).onWarmupCompleted();
        Intrinsics.checkNotNullExpressionValue(iAuthTabCallbackOnWarmupCompleted, "");
        IAuthTabCallback(iAuthTabCallbackOnWarmupCompleted);
        setLayerType(2, paint);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TickerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = ICustomTabsCallbackStub + 65;
            ICustomTabsCallbackStubProxy = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 14 / 0;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = ICustomTabsCallbackStubProxy + 51;
            ICustomTabsCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ void IAuthTabCallback(TickerView tickerView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 75;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -852131728, 852131728, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{tickerView});
        int i4 = ICustomTabsCallbackStubProxy + 9;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ generateApp onExtraCallback(TickerView tickerView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 99;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        generateApp generateapp = tickerView.asInterface;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 105;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 61 / 0;
        }
        return generateapp;
    }

    public static final /* synthetic */ onExtraCallbackWithResult onExtraCallbackWithResult(TickerView tickerView) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 81;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult onextracallbackwithresult = tickerView.writeTypedObject;
        if (i3 != 0) {
            return onextracallbackwithresult;
        }
        throw null;
    }

    public final void setTextColor(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStub + 37;
        ICustomTabsCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.onMessageChannelReady != i) {
            this.onMessageChannelReady = i;
            this.onPostMessage.setColor(i);
            invalidate();
            int i4 = ICustomTabsCallbackStubProxy + 79;
            ICustomTabsCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void setTextSize(float f) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 11;
        int i3 = i2 % 128;
        ICustomTabsCallbackStubProxy = i3;
        int i4 = i2 % 2;
        if (this.onRelationshipValidationResult != f) {
            this.onRelationshipValidationResult = f;
            this.onPostMessage.setTextSize(f);
            IAuthTabCallback();
            int i5 = ICustomTabsCallbackStubProxy + 65;
            ICustomTabsCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 55;
        ICustomTabsCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void setSuffix(@NotNull CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 37;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            this.onMinimized = charSequence;
            int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -852131728, 852131728, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this});
            invalidate();
            return;
        }
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.onMinimized = charSequence;
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -852131728, 852131728, iOnExtraCallbackWithResult3, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, new Object[]{this});
        invalidate();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSuffixPadding(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallbackStubProxy + 111;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.onActivityLayout = i;
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -852131728, 852131728, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this});
        invalidate();
        int i5 = ICustomTabsCallbackStubProxy + 29;
        ICustomTabsCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private static final void onNavigationEvent(TickerView tickerView, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 55;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(valueAnimator, "");
            tickerView.asInterface.onNavigationEvent(valueAnimator.getAnimatedFraction());
            int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -852131728, 852131728, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{tickerView});
            tickerView.invalidate();
            return;
        }
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        tickerView.asInterface.onNavigationEvent(valueAnimator.getAnimatedFraction());
        int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -852131728, 852131728, iOnExtraCallbackWithResult3, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, new Object[]{tickerView});
        tickerView.invalidate();
        throw null;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 99;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onDetachedFromWindow();
        asBinder();
        int i4 = ICustomTabsCallbackStubProxy + 85;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int height;
        onExtraCallbackWithResult onextracallbackwithresult;
        int i5;
        int i6 = 2 % 2;
        int i7 = ICustomTabsCallbackStub + 75;
        ICustomTabsCallbackStubProxy = i7 % 128;
        if (i7 % 2 == 0) {
            super.onLayout(z, i, i2, i3, i4);
            width = getWidth();
            height = getHeight();
            onextracallbackwithresult = this.extraCallbackWithResult;
            i5 = 1;
        } else {
            super.onLayout(z, i, i2, i3, i4);
            width = getWidth();
            height = getHeight();
            onextracallbackwithresult = this.extraCallbackWithResult;
            i5 = 0;
        }
        onextracallbackwithresult.setBounds(i5, i5, width, height);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = ICustomTabsCallbackStub + 17;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            this.extraCallback = ((Integer) onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 202413765, -202413763, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this})).intValue();
            this.ICustomTabsCallback = onWarmupCompleted();
            setMeasuredDimension(View.resolveSize(this.extraCallback, i), View.resolveSize(this.ICustomTabsCallback, i2));
            int i5 = 31 / 0;
        } else {
            int iOnExtraCallbackWithResult3 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            this.extraCallback = ((Integer) onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 202413765, -202413763, iOnExtraCallbackWithResult3, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, new Object[]{this})).intValue();
            this.ICustomTabsCallback = onWarmupCompleted();
            setMeasuredDimension(View.resolveSize(this.extraCallback, i), View.resolveSize(this.ICustomTabsCallback, i2));
        }
        int i6 = ICustomTabsCallbackStubProxy + 67;
        ICustomTabsCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 67 / 0;
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = ICustomTabsCallbackStub + 79;
        ICustomTabsCallbackStubProxy = i6 % 128;
        int i7 = i6 % 2;
        super.onSizeChanged(i, i2, i3, i4);
        this.ICustomTabsCallbackDefault.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        int i8 = ICustomTabsCallbackStub + 119;
        ICustomTabsCallbackStubProxy = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(@NotNull Drawable drawable) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 31;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(drawable, "");
        if (!super.verifyDrawable(drawable) && drawable != this.extraCallbackWithResult) {
            return false;
        }
        int i4 = ICustomTabsCallbackStub + 109;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        canvas.save();
        onWarmupCompleted(canvas);
        canvas.save();
        canvas.translate(0.0f, (this.readTypedObject.onExtraCallbackWithResult() * 0.20000005f) / 2.0f);
        canvas.save();
        canvas.translate(0.0f, this.readTypedObject.IAuthTabCallback());
        this.asInterface.onWarmupCompleted(canvas, this.onPostMessage);
        canvas.restore();
        canvas.save();
        canvas.translate(this.asInterface.IAuthTabCallback() + this.onActivityLayout, this.readTypedObject.IAuthTabCallback());
        CharSequence charSequence = this.onMinimized;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, 0.0f, this.onPostMessage);
        canvas.restore();
        if (this.extraCallbackWithResult.IAuthTabCallback() && !isInEditMode()) {
            this.extraCallbackWithResult.draw(canvas);
            int i2 = ICustomTabsCallbackStub + Imgproc.COLOR_YUV2RGB_YVYU;
            ICustomTabsCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
        }
        canvas.restore();
        if (!isInEditMode()) {
            canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), this.access000.getStrokeWidth(), this.access000);
            canvas.rotate(180.0f, canvas.getClipBounds().exactCenterX(), canvas.getClipBounds().exactCenterY());
            canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), this.access000.getStrokeWidth(), this.access000);
        }
        canvas.restore();
        int i4 = ICustomTabsCallbackStubProxy + 17;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onWarmupCompleted(Canvas canvas) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 41;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        float fIAuthTabCallback = this.asInterface.IAuthTabCallback();
        float fOnExtraCallback = (int) this.readTypedObject.onExtraCallback(this.onMinimized);
        Companion.onExtraCallbackWithResult(canvas, this.access100, this.ICustomTabsCallbackDefault, fIAuthTabCallback + fOnExtraCallback + this.onActivityLayout, this.readTypedObject.onExtraCallbackWithResult());
        int i4 = ICustomTabsCallbackStub + 1;
        ICustomTabsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        boolean z;
        TickerView tickerView = (TickerView) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 87;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            if (tickerView.extraCallback != ((Integer) onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 202413765, -202413763, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{tickerView})).intValue()) {
                int i3 = ICustomTabsCallbackStubProxy + 39;
                ICustomTabsCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            } else {
                int i5 = ICustomTabsCallbackStubProxy + 61;
                ICustomTabsCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                z = false;
            }
        } else {
            if (tickerView.extraCallback != ((Integer) onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 202413765, -202413763, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), new Object[]{tickerView})).intValue()) {
            }
        }
        boolean z2 = !(tickerView.ICustomTabsCallback == tickerView.onWarmupCompleted());
        if ((!z) && !z2) {
            return null;
        }
        tickerView.requestLayout();
        return null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        float fOnWarmupCompleted;
        TickerView tickerView = (TickerView) objArr[0];
        int i = 2 % 2;
        if (!tickerView.onExtraCallbackWithResult) {
            fOnWarmupCompleted = tickerView.asInterface.onWarmupCompleted();
        } else {
            int i2 = ICustomTabsCallbackStubProxy + 29;
            ICustomTabsCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            fOnWarmupCompleted = tickerView.asInterface.IAuthTabCallback();
        }
        int paddingLeft = ((int) fOnWarmupCompleted) + tickerView.getPaddingLeft() + tickerView.getPaddingRight() + ((int) tickerView.readTypedObject.onExtraCallback(tickerView.onMinimized)) + tickerView.onActivityLayout;
        int i4 = ICustomTabsCallbackStub + 79;
        ICustomTabsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return Integer.valueOf(paddingLeft);
        }
        int i5 = 58 / 0;
        return Integer.valueOf(paddingLeft);
    }

    private final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 39;
        ICustomTabsCallbackStub = i2 % 128;
        return (int) (i2 % 2 != 0 ? ((this.readTypedObject.onExtraCallbackWithResult() % 1.2f) / getPaddingTop()) * getPaddingBottom() : (this.readTypedObject.onExtraCallbackWithResult() * 1.2f) + getPaddingTop() + getPaddingBottom());
    }

    private final void IAuthTabCallback() {
        int i = 2 % 2;
        this.readTypedObject.onExtraCallback();
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -852131728, 852131728, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this});
        invalidate();
        float fOnExtraCallbackWithResult = ((this.readTypedObject.onExtraCallbackWithResult() * 0.20000005f) / 2.0f) + (this.readTypedObject.onExtraCallbackWithResult() / 8.0f);
        this.access000.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, fOnExtraCallbackWithResult, this.getInterfaceDescriptor, this.IAuthTabCallbackStubProxy, Shader.TileMode.CLAMP));
        this.access000.setStrokeWidth(fOnExtraCallbackWithResult);
        int i2 = ICustomTabsCallbackStubProxy + 47;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    private final TickerView IAuthTabCallback(IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 81;
        ICustomTabsCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            this.extraCallbackWithResult.IAuthTabCallback(iAuthTabCallback);
            int i3 = 42 / 0;
        } else {
            this.extraCallbackWithResult.IAuthTabCallback(iAuthTabCallback);
        }
        int i4 = ICustomTabsCallbackStubProxy + 37;
        ICustomTabsCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return this;
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 89;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (ViewCompat.ICustomTabsCallbackStubProxy(this)) {
            int i4 = ICustomTabsCallbackStub + 1;
            ICustomTabsCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                this.extraCallbackWithResult.onWarmupCompleted();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.extraCallbackWithResult.onWarmupCompleted();
            int i5 = ICustomTabsCallbackStub + 43;
            ICustomTabsCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private final void asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 33;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        this.extraCallbackWithResult.onNavigationEvent();
        invalidate();
        int i4 = ICustomTabsCallbackStubProxy + 15;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void setText$default(TickerView tickerView, String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = ICustomTabsCallbackStub + 25;
            ICustomTabsCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            z = !TextUtils.isEmpty(tickerView.onActivityResized);
            int i5 = ICustomTabsCallbackStub + 27;
            ICustomTabsCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
        }
        tickerView.setText(str, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setText(@Nullable String str, boolean z) {
        char[] charArray;
        int i = 2 % 2;
        if (TextUtils.equals(str, this.onActivityResized)) {
            return;
        }
        this.onActivityResized = str;
        if (str != null) {
            charArray = str.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "");
            if (charArray == null) {
                charArray = new char[0];
            }
        }
        this.asInterface.onExtraCallbackWithResult(charArray);
        setContentDescription(str);
        if (!z || this.IAuthTabCallbackDefault.isRunning()) {
            this.asInterface.onNavigationEvent(1.0f);
            this.asInterface.onNavigationEvent();
            int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
            onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -852131728, 852131728, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this});
            invalidate();
            return;
        }
        int i2 = ICustomTabsCallbackStubProxy + 5;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (this.IAuthTabCallbackDefault.isRunning()) {
            int i4 = ICustomTabsCallbackStub + 83;
            ICustomTabsCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            this.IAuthTabCallbackDefault.cancel();
        }
        this.IAuthTabCallbackDefault.setStartDelay(this.onWarmupCompleted);
        this.IAuthTabCallbackDefault.setDuration(this.IAuthTabCallback);
        this.IAuthTabCallbackDefault.setInterpolator(this.onTransact);
        this.IAuthTabCallbackDefault.start();
    }

    public final void setAnimationDuration(long j) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy;
        int i3 = i2 + 87;
        ICustomTabsCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallback = j;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 95;
        ICustomTabsCallbackStub = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setGravity(int i) {
        int i2 = 2 % 2;
        if (this.access100 != i) {
            this.access100 = i;
            invalidate();
            int i3 = ICustomTabsCallbackStub + 99;
            ICustomTabsCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = ICustomTabsCallbackStub + 41;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void setState(@NotNull onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        post(new TickerView$.ExternalSyntheticLambda0(this, onextracallbackwithresult));
        int i2 = ICustomTabsCallbackStub + 17;
        ICustomTabsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void onWarmupCompleted(TickerView tickerView, onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStubProxy + 3;
        ICustomTabsCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        tickerView.writeTypedObject = onextracallbackwithresult;
        int i4 = onExtraCallback.onNavigationEvent[onextracallbackwithresult.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                tickerView.asBinder();
                return;
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                tickerView.asBinder();
                return;
            }
        }
        if (tickerView.IAuthTabCallbackDefault.isRunning()) {
            return;
        }
        tickerView.onExtraCallbackWithResult();
        int i5 = ICustomTabsCallbackStub + 71;
        ICustomTabsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        TickerView tickerView = (TickerView) objArr[0];
        String[] strArr = (String[]) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackStub + 79;
        ICustomTabsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            tickerView.asInterface.onExtraCallbackWithResult((String[]) Arrays.copyOf(strArr, strArr.length));
            int i3 = 40 / 0;
        } else {
            tickerView.asInterface.onExtraCallbackWithResult((String[]) Arrays.copyOf(strArr, strArr.length));
        }
        int i4 = ICustomTabsCallbackStubProxy + 115;
        ICustomTabsCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static final class onWarmupCompleted {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onExtraCallbackWithResult(@NotNull Canvas canvas, int i, @NotNull Rect rect, float f, float f2) {
            float f3;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 89;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(canvas, "");
            Intrinsics.checkNotNullParameter(rect, "");
            int iWidth = rect.width();
            int iHeight = rect.height();
            float f4 = rect.left;
            float f5 = rect.top;
            if ((i & 16) == 16) {
                int i5 = onExtraCallback + 77;
                onNavigationEvent = i5 % 128;
                f3 = i5 % 2 == 0 ? f5 - ((iHeight * (f2 / 1.2f)) % 2.0f) : ((iHeight - (f2 * 1.2f)) / 2.0f) + f5;
            } else {
                f3 = f5;
            }
            float f6 = (i & 1) == 1 ? ((iWidth - f) / 2.0f) + f4 : f4;
            if ((i & 48) == 48) {
                int i6 = onExtraCallback + 65;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                f3 = f5;
            }
            if ((i & 80) == 80) {
                f3 = f5 + (iHeight - (f2 * 1.2f));
            }
            if ((i & 8388611) != 8388611) {
                int i7 = onNavigationEvent + 115;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                if ((i & 3) == 3) {
                    f6 = f4;
                }
            }
            if ((i & 8388613) == 8388613 || (i & 5) == 5) {
                f6 = f4 + (iWidth - f);
                int i9 = onExtraCallback + 11;
                onNavigationEvent = i9 % 128;
                int i10 = i9 % 2;
            }
            canvas.translate(f6, f3);
            canvas.clipRect(0.0f, 0.0f, f, f2 * 1.2f);
            int i11 = onExtraCallback + 123;
            onNavigationEvent = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    static {
        int i = extraCommand + 77;
        onUnminimized = i % 128;
        if (i % 2 != 0) {
            int i2 = 39 / 0;
        }
    }

    private final void onNavigationEvent() {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -852131728, 852131728, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this});
    }

    private final int onExtraCallback() {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return ((Integer) onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 202413765, -202413763, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this})).intValue();
    }

    private final void onExtraCallback(String... strArr) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -76763593, 76763594, iOnExtraCallbackWithResult, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this, strArr});
    }
}
